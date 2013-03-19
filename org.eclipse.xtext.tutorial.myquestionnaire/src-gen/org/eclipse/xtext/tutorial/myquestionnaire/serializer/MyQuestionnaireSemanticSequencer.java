package org.eclipse.xtext.tutorial.myquestionnaire.serializer;

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
import org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Choice;
import org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.ChoiceQuestion;
import org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.FreeTextQuestion;
import org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.MyQuestionnairePackage;
import org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Page;
import org.eclipse.xtext.tutorial.myquestionnaire.myQuestionnaire.Questionnaire;
import org.eclipse.xtext.tutorial.myquestionnaire.services.MyQuestionnaireGrammarAccess;

@SuppressWarnings("all")
public class MyQuestionnaireSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyQuestionnaireGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyQuestionnairePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyQuestionnairePackage.CHOICE:
				if(context == grammarAccess.getChoiceRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
			case MyQuestionnairePackage.CHOICE_QUESTION:
				if(context == grammarAccess.getChoiceQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_ChoiceQuestion(context, (ChoiceQuestion) semanticObject); 
					return; 
				}
				else break;
			case MyQuestionnairePackage.FREE_TEXT_QUESTION:
				if(context == grammarAccess.getFreeTextQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_FreeTextQuestion(context, (FreeTextQuestion) semanticObject); 
					return; 
				}
				else break;
			case MyQuestionnairePackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case MyQuestionnairePackage.QUESTIONNAIRE:
				if(context == grammarAccess.getQuestionnaireRule()) {
					sequence_Questionnaire(context, (Questionnaire) semanticObject); 
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
	 *     (name=ID text=STRING)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyQuestionnairePackage.Literals.CHOICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyQuestionnairePackage.Literals.CHOICE__NAME));
			if(transientValues.isValueTransient(semanticObject, MyQuestionnairePackage.Literals.CHOICE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyQuestionnairePackage.Literals.CHOICE__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING)
	 */
	protected void sequence_FreeTextQuestion(EObject context, FreeTextQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyQuestionnairePackage.Literals.QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyQuestionnairePackage.Literals.QUESTION__NAME));
			if(transientValues.isValueTransient(semanticObject, MyQuestionnairePackage.Literals.QUESTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyQuestionnairePackage.Literals.QUESTION__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID questions+=Question* next=[Page|ID])
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING pages+=Page*)
	 */
	protected void sequence_Questionnaire(EObject context, Questionnaire semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
