/*
* generated by Xtext
*/
grammar InternalSurvey;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipse.xtext.tutorial.survey.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.tutorial.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.tutorial.survey.services.SurveyGrammarAccess;

}

@parser::members {

 	private SurveyGrammarAccess grammarAccess;
 	
    public InternalSurveyParser(TokenStream input, SurveyGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Survey";	
   	}
   	
   	@Override
   	protected SurveyGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSurvey
entryRuleSurvey returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSurveyRule()); }
	 iv_ruleSurvey=ruleSurvey 
	 { $current=$iv_ruleSurvey.current; } 
	 EOF 
;

// Rule Survey
ruleSurvey returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='survey' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSurveyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_title_2_0=RULE_STRING
		{
			newLeafNode(lv_title_2_0, grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSurveyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_2_0, 
        		"STRING");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 
	    }
		lv_pages_3_0=rulePage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSurveyRule());
	        }
       		add(
       			$current, 
       			"pages",
        		lv_pages_3_0, 
        		"Page");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRulePage
entryRulePage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPageRule()); }
	 iv_rulePage=rulePage 
	 { $current=$iv_rulePage.current; } 
	 EOF 
;

// Rule Page
rulePage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='page' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
	    }
		lv_questions_3_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPageRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPageRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getPageAccess().getNextPageCrossReference_4_0()); 
	}

)
)	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPageAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 
    }
    this_FreeTextQuestion_0=ruleFreeTextQuestion
    { 
        $current = $this_FreeTextQuestion_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 
    }
    this_ChoiceQuestion_1=ruleChoiceQuestion
    { 
        $current = $this_ChoiceQuestion_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleFreeTextQuestion
entryRuleFreeTextQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFreeTextQuestionRule()); }
	 iv_ruleFreeTextQuestion=ruleFreeTextQuestion 
	 { $current=$iv_ruleFreeTextQuestion.current; } 
	 EOF 
;

// Rule FreeTextQuestion
ruleFreeTextQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='text' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFreeTextQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_text_2_0=RULE_STRING
		{
			newLeafNode(lv_text_2_0, grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFreeTextQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleChoiceQuestion
entryRuleChoiceQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChoiceQuestionRule()); }
	 iv_ruleChoiceQuestion=ruleChoiceQuestion 
	 { $current=$iv_ruleChoiceQuestion.current; } 
	 EOF 
;

// Rule ChoiceQuestion
ruleChoiceQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_single_0_0=	'single' 
    {
        newLeafNode(lv_single_0_0, grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceQuestionRule());
	        }
       		setWithLastConsumed($current, "single", true, "single");
	    }

)
)?	otherlv_1='choice' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getChoiceQuestionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)(
(
		lv_text_3_0=RULE_STRING
		{
			newLeafNode(lv_text_3_0, grammarAccess.getChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_3_0, 
        		"STRING");
	    }

)
)	otherlv_4='(' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 
	    }
		lv_choices_5_0=ruleChoice		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
	        }
       		add(
       			$current, 
       			"choices",
        		lv_choices_5_0, 
        		"Choice");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_6());
    }
)
;





// Entry rule entryRuleChoice
entryRuleChoice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChoiceRule()); }
	 iv_ruleChoice=ruleChoice 
	 { $current=$iv_ruleChoice.current; } 
	 EOF 
;

// Rule Choice
ruleChoice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(
(
		lv_text_1_0=RULE_STRING
		{
			newLeafNode(lv_text_1_0, grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChoiceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_1_0, 
        		"STRING");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

