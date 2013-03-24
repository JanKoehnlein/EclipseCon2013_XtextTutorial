/*
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey.validation

import org.eclipse.xtext.tutorial.survey.survey.Choice
import org.eclipse.xtext.tutorial.survey.survey.Question
import org.eclipse.xtext.validation.Check

import static org.eclipse.xtext.tutorial.survey.survey.SurveyPackage$Literals.*

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class SurveyValidator extends AbstractSurveyValidator {

	@Check
	def textMustNotBeEmpty(Question question) {
		if(question.text.empty) {
			error("Empty question is illegal", QUESTION__TEXT)
		}
	}

	@Check
	def textMustNotBeEmpty(Choice choice) {
		if(choice.text.empty) {
			error("Empty choice is illegal", CHOICE__TEXT)
		}
	}
}
