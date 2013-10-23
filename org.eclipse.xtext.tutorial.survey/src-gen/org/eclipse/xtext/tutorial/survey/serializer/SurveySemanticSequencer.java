package org.eclipse.xtext.tutorial.survey.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.tutorial.survey.services.SurveyGrammarAccess;
import org.eclipse.xtext.tutorial.survey.survey.Choice;
import org.eclipse.xtext.tutorial.survey.survey.ChoiceQuestion;
import org.eclipse.xtext.tutorial.survey.survey.FollowUp;
import org.eclipse.xtext.tutorial.survey.survey.FreeTextQuestion;
import org.eclipse.xtext.tutorial.survey.survey.Guard;
import org.eclipse.xtext.tutorial.survey.survey.Page;
import org.eclipse.xtext.tutorial.survey.survey.Survey;
import org.eclipse.xtext.tutorial.survey.survey.SurveyPackage;

@SuppressWarnings("all")
public class SurveySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SurveyGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SurveyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SurveyPackage.CHOICE:
				if(context == grammarAccess.getChoiceRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.CHOICE_QUESTION:
				if(context == grammarAccess.getChoiceQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_ChoiceQuestion(context, (ChoiceQuestion) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.FOLLOW_UP:
				if(context == grammarAccess.getFollowUpRule()) {
					sequence_FollowUp(context, (FollowUp) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.FREE_TEXT_QUESTION:
				if(context == grammarAccess.getFreeTextQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_FreeTextQuestion(context, (FreeTextQuestion) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.GUARD:
				if(context == grammarAccess.getGuardRule()) {
					sequence_Guard(context, (Guard) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (single?='single'? name=ID text=STRING choices+=Choice+)
	 */
	protected void sequence_ChoiceQuestion(EObject context, ChoiceQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (freetext?='text'? name=ID? text=STRING)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (guard=Guard? next=[Page|ID])
	 */
	protected void sequence_FollowUp(EObject context, FollowUp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING)
	 */
	protected void sequence_FreeTextQuestion(EObject context, FreeTextQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.QUESTION__NAME));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.QUESTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.QUESTION__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (question=[ChoiceQuestion|QualifiedName] answer=[Choice|ID])
	 */
	protected void sequence_Guard(EObject context, Guard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.GUARD__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.GUARD__QUESTION));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.GUARD__ANSWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.GUARD__ANSWER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuardAccess().getQuestionChoiceQuestionQualifiedNameParserRuleCall_1_0_1(), semanticObject.getQuestion());
		feeder.accept(grammarAccess.getGuardAccess().getAnswerChoiceIDTerminalRuleCall_3_0_1(), semanticObject.getAnswer());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID questions+=Question* followUps+=FollowUp*)
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING pages+=Page*)
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
