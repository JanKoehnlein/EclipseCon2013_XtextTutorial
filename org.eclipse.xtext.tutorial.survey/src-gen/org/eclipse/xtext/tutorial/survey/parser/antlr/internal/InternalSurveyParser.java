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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "')'", "'->'", "'if'", "'='", "'.'", "'text'", "'single'", "'choice'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:155:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_questions_3_0 = null;

        EObject lv_followUps_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:158:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')' ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:159:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')' )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:159:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')' )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:159:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')'
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

                if ( ((LA2_0>=19 && LA2_0<=21)) ) {
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

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:203:3: ( (lv_followUps_4_0= ruleFollowUp ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:204:1: (lv_followUps_4_0= ruleFollowUp )
            	    {
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:204:1: (lv_followUps_4_0= ruleFollowUp )
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:205:3: lv_followUps_4_0= ruleFollowUp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getFollowUpsFollowUpParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFollowUp_in_rulePage348);
            	    lv_followUps_4_0=ruleFollowUp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"followUps",
            	            		lv_followUps_4_0, 
            	            		"FollowUp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_rulePage361); 

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


    // $ANTLR start "entryRuleFollowUp"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:233:1: entryRuleFollowUp returns [EObject current=null] : iv_ruleFollowUp= ruleFollowUp EOF ;
    public final EObject entryRuleFollowUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowUp = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:234:2: (iv_ruleFollowUp= ruleFollowUp EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:235:2: iv_ruleFollowUp= ruleFollowUp EOF
            {
             newCompositeNode(grammarAccess.getFollowUpRule()); 
            pushFollow(FOLLOW_ruleFollowUp_in_entryRuleFollowUp397);
            iv_ruleFollowUp=ruleFollowUp();

            state._fsp--;

             current =iv_ruleFollowUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowUp407); 

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
    // $ANTLR end "entryRuleFollowUp"


    // $ANTLR start "ruleFollowUp"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:242:1: ruleFollowUp returns [EObject current=null] : ( ( (lv_guard_0_0= ruleGuard ) )? otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleFollowUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_guard_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:245:28: ( ( ( (lv_guard_0_0= ruleGuard ) )? otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:246:1: ( ( (lv_guard_0_0= ruleGuard ) )? otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:246:1: ( ( (lv_guard_0_0= ruleGuard ) )? otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:246:2: ( (lv_guard_0_0= ruleGuard ) )? otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:246:2: ( (lv_guard_0_0= ruleGuard ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:247:1: (lv_guard_0_0= ruleGuard )
                    {
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:247:1: (lv_guard_0_0= ruleGuard )
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:248:3: lv_guard_0_0= ruleGuard
                    {
                     
                    	        newCompositeNode(grammarAccess.getFollowUpAccess().getGuardGuardParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGuard_in_ruleFollowUp453);
                    lv_guard_0_0=ruleGuard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFollowUpRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_0_0, 
                            		"Guard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleFollowUp466); 

                	newLeafNode(otherlv_1, grammarAccess.getFollowUpAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:268:1: ( (otherlv_2= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:269:1: (otherlv_2= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:269:1: (otherlv_2= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:270:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFollowUpRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFollowUp486); 

            		newLeafNode(otherlv_2, grammarAccess.getFollowUpAccess().getNextPageCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleFollowUp"


    // $ANTLR start "entryRuleGuard"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:289:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:290:2: (iv_ruleGuard= ruleGuard EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:291:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard522);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard532); 

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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:298:1: ruleGuard returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:301:28: ( (otherlv_0= 'if' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:302:1: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:302:1: (otherlv_0= 'if' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:302:3: otherlv_0= 'if' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleGuard569); 

                	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getIfKeyword_0());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:306:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:307:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:307:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:308:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getQuestionChoiceQuestionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGuard592);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleGuard604); 

                	newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getEqualsSignKeyword_2());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:325:1: ( (otherlv_3= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:326:1: (otherlv_3= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:326:1: (otherlv_3= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:327:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuard624); 

            		newLeafNode(otherlv_3, grammarAccess.getGuardAccess().getAnswerChoiceCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:346:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:347:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:348:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName661);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName672); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:355:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:358:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:359:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:359:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:359:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName712); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:366:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:367:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedName731); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName746); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQuestion"
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:387:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:388:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:389:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion793);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion803); 

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
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:396:1: ruleQuestion returns [EObject current=null] : (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_FreeTextQuestion_0 = null;

        EObject this_ChoiceQuestion_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:399:28: ( (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:400:1: (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:400:1: (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:401:5: this_FreeTextQuestion_0= ruleFreeTextQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFreeTextQuestion_in_ruleQuestion850);
                    this_FreeTextQuestion_0=ruleFreeTextQuestion();

                    state._fsp--;

                     
                            current = this_FreeTextQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:411:5: this_ChoiceQuestion_1= ruleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChoiceQuestion_in_ruleQuestion877);
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
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:427:1: entryRuleFreeTextQuestion returns [EObject current=null] : iv_ruleFreeTextQuestion= ruleFreeTextQuestion EOF ;
    public final EObject entryRuleFreeTextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeTextQuestion = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:428:2: (iv_ruleFreeTextQuestion= ruleFreeTextQuestion EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:429:2: iv_ruleFreeTextQuestion= ruleFreeTextQuestion EOF
            {
             newCompositeNode(grammarAccess.getFreeTextQuestionRule()); 
            pushFollow(FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion912);
            iv_ruleFreeTextQuestion=ruleFreeTextQuestion();

            state._fsp--;

             current =iv_ruleFreeTextQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeTextQuestion922); 

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
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:436:1: ruleFreeTextQuestion returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFreeTextQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:439:28: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:440:1: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:440:1: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:440:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleFreeTextQuestion959); 

                	newLeafNode(otherlv_0, grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:444:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:445:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:445:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:446:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFreeTextQuestion976); 

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

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:462:2: ( (lv_text_2_0= RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:463:1: (lv_text_2_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:463:1: (lv_text_2_0= RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:464:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFreeTextQuestion998); 

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
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:488:1: entryRuleChoiceQuestion returns [EObject current=null] : iv_ruleChoiceQuestion= ruleChoiceQuestion EOF ;
    public final EObject entryRuleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceQuestion = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:489:2: (iv_ruleChoiceQuestion= ruleChoiceQuestion EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:490:2: iv_ruleChoiceQuestion= ruleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion1039);
            iv_ruleChoiceQuestion=ruleChoiceQuestion();

            state._fsp--;

             current =iv_ruleChoiceQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoiceQuestion1049); 

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
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:497:1: ruleChoiceQuestion returns [EObject current=null] : ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' ) ;
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
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:500:28: ( ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:501:1: ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:501:1: ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:501:2: ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')'
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:501:2: ( (lv_single_0_0= 'single' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:502:1: (lv_single_0_0= 'single' )
                    {
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:502:1: (lv_single_0_0= 'single' )
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:503:3: lv_single_0_0= 'single'
                    {
                    lv_single_0_0=(Token)match(input,20,FOLLOW_20_in_ruleChoiceQuestion1092); 

                            newLeafNode(lv_single_0_0, grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "single", true, "single");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleChoiceQuestion1118); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:520:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:521:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:521:1: (lv_name_2_0= RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:522:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoiceQuestion1135); 

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

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:538:2: ( (lv_text_3_0= RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:539:1: (lv_text_3_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:539:1: (lv_text_3_0= RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:540:3: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoiceQuestion1157); 

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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleChoiceQuestion1174); 

                	newLeafNode(otherlv_4, grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4());
                
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:560:1: ( (lv_choices_5_0= ruleChoice ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:561:1: (lv_choices_5_0= ruleChoice )
            	    {
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:561:1: (lv_choices_5_0= ruleChoice )
            	    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:562:3: lv_choices_5_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleChoiceQuestion1195);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleChoiceQuestion1208); 

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
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:590:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:591:2: (iv_ruleChoice= ruleChoice EOF )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:592:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice1244);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice1254); 

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
    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:599:1: ruleChoice returns [EObject current=null] : ( ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_freetext_0_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:602:28: ( ( ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:603:1: ( ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:603:1: ( ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:603:2: ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:603:2: ( (lv_freetext_0_0= 'text' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:604:1: (lv_freetext_0_0= 'text' )
                    {
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:604:1: (lv_freetext_0_0= 'text' )
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:605:3: lv_freetext_0_0= 'text'
                    {
                    lv_freetext_0_0=(Token)match(input,19,FOLLOW_19_in_ruleChoice1297); 

                            newLeafNode(lv_freetext_0_0, grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "freetext", true, "text");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:618:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:619:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:619:1: (lv_name_1_0= RULE_ID )
                    // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:620:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoice1328); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:636:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:637:1: (lv_text_2_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:637:1: (lv_text_2_0= RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:638:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoice1351); 

            			newLeafNode(lv_text_2_0, grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceRule());
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
    public static final BitSet FOLLOW_13_in_rulePage305 = new BitSet(new long[]{0x000000000039C000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePage326 = new BitSet(new long[]{0x000000000039C000L});
    public static final BitSet FOLLOW_ruleFollowUp_in_rulePage348 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_rulePage361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowUp_in_entryRuleFollowUp397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowUp407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleFollowUp453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFollowUp466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFollowUp486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGuard569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGuard592 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGuard604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuard624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName712 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedName731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName746 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_ruleQuestion850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_ruleQuestion877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeTextQuestion922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFreeTextQuestion959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFreeTextQuestion976 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFreeTextQuestion998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleChoiceQuestion1092 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleChoiceQuestion1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoiceQuestion1135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoiceQuestion1157 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleChoiceQuestion1174 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleChoiceQuestion1195 = new BitSet(new long[]{0x0000000000084030L});
    public static final BitSet FOLLOW_14_in_ruleChoiceQuestion1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleChoice1297 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoice1328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoice1351 = new BitSet(new long[]{0x0000000000000002L});

}