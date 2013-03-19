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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "')'", "'text'", "'single'", "'choice'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSurveyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSurveyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSurveyParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g"; }



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



    // $ANTLR start "entryRuleSurvey"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:69:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey75);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )* ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_pages_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:79:28: ( (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )* ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )* )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:80:1: (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )* )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:80:3: otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSurvey139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSurveyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:102:2: ( (lv_title_2_0= RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:103:1: (lv_title_2_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:103:1: (lv_title_2_0= RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:104:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSurvey161); 

            			newLeafNode(lv_title_2_0, grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSurveyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:120:2: ( (lv_pages_3_0= rulePage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:121:1: (lv_pages_3_0= rulePage )
            	    {
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:121:1: (lv_pages_3_0= rulePage )
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:122:3: lv_pages_3_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePage_in_ruleSurvey187);
            	    lv_pages_3_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_3_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRulePage"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:146:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:147:2: (iv_rulePage= rulePage EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:148:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage224);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:155:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:158:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:159:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:159:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:159:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePage271); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:163:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:164:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:164:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage288); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePage305); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftParenthesisKeyword_2());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:185:1: ( (lv_questions_3_0= ruleQuestion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:186:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:186:1: (lv_questions_3_0= ruleQuestion )
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:187:3: lv_questions_3_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_rulePage326);
            	    lv_questions_3_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_3_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:203:3: ( (otherlv_4= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:204:1: (otherlv_4= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:204:1: (otherlv_4= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:205:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage347); 

            		newLeafNode(otherlv_4, grammarAccess.getPageAccess().getNextPageCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulePage359); 

                	newLeafNode(otherlv_5, grammarAccess.getPageAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleQuestion"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:228:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:229:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:230:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion395);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion405); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:237:1: ruleQuestion returns [EObject current=null] : (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_FreeTextQuestion_0 = null;

        EObject this_ChoiceQuestion_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:240:28: ( (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:241:1: (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:241:1: (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:242:5: this_FreeTextQuestion_0= ruleFreeTextQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFreeTextQuestion_in_ruleQuestion452);
                    this_FreeTextQuestion_0=ruleFreeTextQuestion();

                    state._fsp--;

                     
                            current = this_FreeTextQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:252:5: this_ChoiceQuestion_1= ruleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChoiceQuestion_in_ruleQuestion479);
                    this_ChoiceQuestion_1=ruleChoiceQuestion();

                    state._fsp--;

                     
                            current = this_ChoiceQuestion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleFreeTextQuestion"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:268:1: entryRuleFreeTextQuestion returns [EObject current=null] : iv_ruleFreeTextQuestion= ruleFreeTextQuestion EOF ;
    public final EObject entryRuleFreeTextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeTextQuestion = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:269:2: (iv_ruleFreeTextQuestion= ruleFreeTextQuestion EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:270:2: iv_ruleFreeTextQuestion= ruleFreeTextQuestion EOF
            {
             newCompositeNode(grammarAccess.getFreeTextQuestionRule()); 
            pushFollow(FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion514);
            iv_ruleFreeTextQuestion=ruleFreeTextQuestion();

            state._fsp--;

             current =iv_ruleFreeTextQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeTextQuestion524); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFreeTextQuestion"


    // $ANTLR start "ruleFreeTextQuestion"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:277:1: ruleFreeTextQuestion returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFreeTextQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:280:28: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:281:1: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:281:1: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:281:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFreeTextQuestion561); 

                	newLeafNode(otherlv_0, grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:286:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFreeTextQuestion578); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreeTextQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:303:2: ( (lv_text_2_0= RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:304:1: (lv_text_2_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:304:1: (lv_text_2_0= RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:305:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFreeTextQuestion600); 

            			newLeafNode(lv_text_2_0, grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreeTextQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFreeTextQuestion"


    // $ANTLR start "entryRuleChoiceQuestion"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:329:1: entryRuleChoiceQuestion returns [EObject current=null] : iv_ruleChoiceQuestion= ruleChoiceQuestion EOF ;
    public final EObject entryRuleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceQuestion = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:330:2: (iv_ruleChoiceQuestion= ruleChoiceQuestion EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:331:2: iv_ruleChoiceQuestion= ruleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion641);
            iv_ruleChoiceQuestion=ruleChoiceQuestion();

            state._fsp--;

             current =iv_ruleChoiceQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoiceQuestion651); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoiceQuestion"


    // $ANTLR start "ruleChoiceQuestion"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:338:1: ruleChoiceQuestion returns [EObject current=null] : ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' ) ;
    public final EObject ruleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_single_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_choices_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:341:28: ( ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:342:1: ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:342:1: ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:342:2: ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')'
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:342:2: ( (lv_single_0_0= 'single' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:343:1: (lv_single_0_0= 'single' )
                    {
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:343:1: (lv_single_0_0= 'single' )
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:344:3: lv_single_0_0= 'single'
                    {
                    lv_single_0_0=(Token)match(input,16,FOLLOW_16_in_ruleChoiceQuestion694); 

                            newLeafNode(lv_single_0_0, grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "single", true, "single");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleChoiceQuestion720); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:361:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:362:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:362:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:363:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoiceQuestion737); 

            			newLeafNode(lv_name_2_0, grammarAccess.getChoiceQuestionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:379:2: ( (lv_text_3_0= RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:380:1: (lv_text_3_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:380:1: (lv_text_3_0= RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:381:3: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoiceQuestion759); 

            			newLeafNode(lv_text_3_0, grammarAccess.getChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleChoiceQuestion776); 

                	newLeafNode(otherlv_4, grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:401:1: ( (lv_choices_5_0= ruleChoice ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:402:1: (lv_choices_5_0= ruleChoice )
            	    {
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:402:1: (lv_choices_5_0= ruleChoice )
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:403:3: lv_choices_5_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleChoiceQuestion797);
            	    lv_choices_5_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_5_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleChoiceQuestion810); 

                	newLeafNode(otherlv_6, grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoiceQuestion"


    // $ANTLR start "entryRuleChoice"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:431:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:432:2: (iv_ruleChoice= ruleChoice EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:433:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice846);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice856); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:440:1: ruleChoice returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:443:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_text_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:444:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:444:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_text_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:444:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_text_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:444:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:445:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:445:1: (lv_name_0_0= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:446:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoice898); 

            			newLeafNode(lv_name_0_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:462:2: ( (lv_text_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:463:1: (lv_text_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:463:1: (lv_text_1_0= RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:464:3: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoice920); 

            			newLeafNode(lv_text_1_0, grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSurvey139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSurvey161 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePage_in_ruleSurvey187 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePage271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage288 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePage305 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePage326 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage347 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePage359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_ruleQuestion452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_ruleQuestion479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeTextQuestion524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFreeTextQuestion561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFreeTextQuestion578 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFreeTextQuestion600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleChoiceQuestion694 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleChoiceQuestion720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoiceQuestion737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoiceQuestion759 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChoiceQuestion776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleChoiceQuestion797 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleChoiceQuestion810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoice898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoice920 = new BitSet(new long[]{0x0000000000000002L});

}