/*
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.tutorial.survey.survey.Choice
import org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion
import org.eclipse.xtext.tutorial.survey.survey.FreeTextQuestion
import org.eclipse.xtext.tutorial.survey.survey.Page
import org.eclipse.xtext.tutorial.survey.survey.Survey

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SurveyGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val survey = resource.contents.head as Survey
		if(survey != null) {
			for(page: survey.pages) {
				fsa.generateFile(page.name + '.html', 
					SurveyOutputConfigurationProvider.htmlOutputConfig, 
					toHtml(survey, page)
				)
			}
			fsa.generateFile("main/PageFlow.java", survey.toPageFlow)
		}
	}
	
	protected def toHtml(Survey survey, Page page) '''
		<html>
		<head>
			<title>«survey.title»</title>
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
			<!-- Bootstrap -->
			<link href="css/bootstrap.css" rel="stylesheet" media="screen">
			<link href="css/survey.css" rel="stylesheet" media="screen">
		</head>
			<body>
				<script src="http://code.jquery.com/jquery.js"></script>
				<script src="js/bootstrap.js"></script>
				<div class="navbar">
						<div class="navbar-inner">
							<a class="brand" href="/">«survey.title»</a>
							<ul class="nav pull-right">
								<li><a href="/evaluate">Evaluate</a></li>
							</ul>
						</div>
					</div>
					
					<div class="container">
						<form class="form-horizontal" method="POST" action="dispatch" class="form-horizontal">
							<input name="survey" type="hidden" value="«survey.name»"/>
							<input name="page" type="hidden" value="«page.name»"/>
							
							«FOR question: page.questions»
								«controlGroup(question)»
							«ENDFOR»
							
							<div class="control-group">
								<div class="controls">
									<input type="reset" class="btn" value="Reset">
									<input type="submit" class="btn" value="Next">
								</div>
							</div>
						</form>
					</div>
			</body>
		</html>
	'''
	
	protected def dispatch controlGroup(FreeTextQuestion question) '''
		<div class="control-group">
			<label class="control-label">«question.text»</label>
			<div class="controls">
				<input type="text" name="«question.name»">
			</div>
		</div>
	'''
	
	protected def dispatch controlGroup(ChoiceQuestion question) {
		val buttonType = if(question.isSingle) 'radio' else 'checkbox'
		'''
			<div class="control-group">
				<label class="control-label">«question.text»</label>
				<div class="controls">
					«IF question.choices.size > 30»
						<select name="«question.name»" «IF !question.isSingle»multiple="multiple"«ENDIF»>
							«FOR choice: question.choices»
								<option value="«choice.getNameNotNull()»">«choice.text»</option>
							«ENDFOR»
						</select>
					«ELSE»
						«FOR choice: question.choices»
							<label class="«buttonType»">
								<input type="«buttonType»" name="«question.name»" value="«choice.getNameNotNull()»"/>«choice.text»
								«IF choice.isFreetext»
									&nbsp;<input type="text" name="«question.name»">
								«ENDIF»
							</label>
						«ENDFOR»
					«ENDIF»
				</div>
			</div>
		'''
	}

	protected def getNameNotNull(Choice choice) {
		choice.name ?: 'answer_' + (choice.eContainer as ChoiceQuestion).choices.indexOf(choice) 
	}
	
	def toPageFlow(Survey survey) '''
		package main;
		
		import org.eclipse.xtext.tutorial.survey.runtime.IFormState;
		import org.eclipse.xtext.tutorial.survey.runtime.IPageFlow;
		
		public class PageFlow implements IPageFlow {
			
			public String getFirstPage() {
				return "«survey.pages.head.name»";
			}
			
			public String getNextPage(IFormState formState) {
				String currentPage = formState.getCurrentPage();
				if(currentPage == null)
					return getFirstPage();
				«FOR page: survey.pages.filter[!followUps.empty]»
					if("«page.name»".equals(currentPage)) {
						«FOR followUp : page.followUps»
							«IF followUp.guard != null»
								if("«followUp.guard.answer.name»".equals(formState.getValue("«followUp.guard.question.name»"))) {
									return "«followUp.next.name»";
								}
							«ELSE»
								return "«followUp.next.name»";
							«ENDIF»
						«ENDFOR»
					}
				«ENDFOR»
				return null;
			}
		}
	'''
}
