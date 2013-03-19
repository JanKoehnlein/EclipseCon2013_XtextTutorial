package org.eclipse.xtext.tutorial.myquestionnaire.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.tutorial.myquestionnaire.services.MyQuestionnaireGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyQuestionnaireParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questionnaire'", "'page'", "'('", "')'", "'text'", "'choice'", "'single'"
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


        public InternalMyQuestionnaireParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyQuestionnaireParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyQuestionnaireParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g"; }


     
     	private MyQuestionnaireGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyQuestionnaireGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleQuestionnaire"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:60:1: entryRuleQuestionnaire : ruleQuestionnaire EOF ;
    public final void entryRuleQuestionnaire() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:61:1: ( ruleQuestionnaire EOF )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:62:1: ruleQuestionnaire EOF
            {
             before(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire61);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getQuestionnaireRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:69:1: ruleQuestionnaire : ( ( rule__Questionnaire__Group__0 ) ) ;
    public final void ruleQuestionnaire() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:73:2: ( ( ( rule__Questionnaire__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:74:1: ( ( rule__Questionnaire__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:74:1: ( ( rule__Questionnaire__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:75:1: ( rule__Questionnaire__Group__0 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:76:1: ( rule__Questionnaire__Group__0 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:76:2: rule__Questionnaire__Group__0
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire94);
            rule__Questionnaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRulePage"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:88:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:89:1: ( rulePage EOF )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:90:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage121);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:97:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:101:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:102:1: ( ( rule__Page__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:102:1: ( ( rule__Page__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:103:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:104:1: ( rule__Page__Group__0 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:104:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage154);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleQuestion"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:116:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:117:1: ( ruleQuestion EOF )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:118:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion181);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:125:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:129:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:130:1: ( ( rule__Question__Alternatives ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:130:1: ( ( rule__Question__Alternatives ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:131:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:132:1: ( rule__Question__Alternatives )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:132:2: rule__Question__Alternatives
            {
            pushFollow(FOLLOW_rule__Question__Alternatives_in_ruleQuestion214);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleFreeTextQuestion"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:144:1: entryRuleFreeTextQuestion : ruleFreeTextQuestion EOF ;
    public final void entryRuleFreeTextQuestion() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:145:1: ( ruleFreeTextQuestion EOF )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:146:1: ruleFreeTextQuestion EOF
            {
             before(grammarAccess.getFreeTextQuestionRule()); 
            pushFollow(FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion241);
            ruleFreeTextQuestion();

            state._fsp--;

             after(grammarAccess.getFreeTextQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeTextQuestion248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFreeTextQuestion"


    // $ANTLR start "ruleFreeTextQuestion"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:153:1: ruleFreeTextQuestion : ( ( rule__FreeTextQuestion__Group__0 ) ) ;
    public final void ruleFreeTextQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:157:2: ( ( ( rule__FreeTextQuestion__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:158:1: ( ( rule__FreeTextQuestion__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:158:1: ( ( rule__FreeTextQuestion__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:159:1: ( rule__FreeTextQuestion__Group__0 )
            {
             before(grammarAccess.getFreeTextQuestionAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:160:1: ( rule__FreeTextQuestion__Group__0 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:160:2: rule__FreeTextQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__0_in_ruleFreeTextQuestion274);
            rule__FreeTextQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFreeTextQuestion"


    // $ANTLR start "entryRuleChoiceQuestion"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:172:1: entryRuleChoiceQuestion : ruleChoiceQuestion EOF ;
    public final void entryRuleChoiceQuestion() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:173:1: ( ruleChoiceQuestion EOF )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:174:1: ruleChoiceQuestion EOF
            {
             before(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion301);
            ruleChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoiceQuestion308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoiceQuestion"


    // $ANTLR start "ruleChoiceQuestion"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:181:1: ruleChoiceQuestion : ( ( rule__ChoiceQuestion__Group__0 ) ) ;
    public final void ruleChoiceQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:185:2: ( ( ( rule__ChoiceQuestion__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:186:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:186:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:187:1: ( rule__ChoiceQuestion__Group__0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:188:1: ( rule__ChoiceQuestion__Group__0 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:188:2: rule__ChoiceQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion334);
            rule__ChoiceQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoiceQuestion"


    // $ANTLR start "entryRuleChoice"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:200:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:201:1: ( ruleChoice EOF )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:202:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice361);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:209:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:213:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:214:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:214:1: ( ( rule__Choice__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:215:1: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:216:1: ( rule__Choice__Group__0 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:216:2: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_rule__Choice__Group__0_in_ruleChoice394);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "rule__Question__Alternatives"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:228:1: rule__Question__Alternatives : ( ( ruleFreeTextQuestion ) | ( ruleChoiceQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:232:1: ( ( ruleFreeTextQuestion ) | ( ruleChoiceQuestion ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=16 && LA1_0<=17)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:233:1: ( ruleFreeTextQuestion )
                    {
                    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:233:1: ( ruleFreeTextQuestion )
                    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:234:1: ruleFreeTextQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFreeTextQuestion_in_rule__Question__Alternatives430);
                    ruleFreeTextQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:239:6: ( ruleChoiceQuestion )
                    {
                    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:239:6: ( ruleChoiceQuestion )
                    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:240:1: ruleChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChoiceQuestion_in_rule__Question__Alternatives447);
                    ruleChoiceQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__Questionnaire__Group__0"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:252:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:256:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:257:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0477);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0480);
            rule__Questionnaire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__0"


    // $ANTLR start "rule__Questionnaire__Group__0__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:264:1: rule__Questionnaire__Group__0__Impl : ( 'questionnaire' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:268:1: ( ( 'questionnaire' ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:269:1: ( 'questionnaire' )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:269:1: ( 'questionnaire' )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:270:1: 'questionnaire'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Questionnaire__Group__0__Impl508); 
             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group__1"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:283:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:287:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:288:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1539);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1542);
            rule__Questionnaire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__1"


    // $ANTLR start "rule__Questionnaire__Group__1__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:295:1: rule__Questionnaire__Group__1__Impl : ( ( rule__Questionnaire__NameAssignment_1 ) ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:299:1: ( ( ( rule__Questionnaire__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:300:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:300:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:301:1: ( rule__Questionnaire__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:302:1: ( rule__Questionnaire__NameAssignment_1 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:302:2: rule__Questionnaire__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl569);
            rule__Questionnaire__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group__2"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:312:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:316:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:317:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2599);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2602);
            rule__Questionnaire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__2"


    // $ANTLR start "rule__Questionnaire__Group__2__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:324:1: rule__Questionnaire__Group__2__Impl : ( ( rule__Questionnaire__TitleAssignment_2 ) ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:328:1: ( ( ( rule__Questionnaire__TitleAssignment_2 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:329:1: ( ( rule__Questionnaire__TitleAssignment_2 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:329:1: ( ( rule__Questionnaire__TitleAssignment_2 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:330:1: ( rule__Questionnaire__TitleAssignment_2 )
            {
             before(grammarAccess.getQuestionnaireAccess().getTitleAssignment_2()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:331:1: ( rule__Questionnaire__TitleAssignment_2 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:331:2: rule__Questionnaire__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Questionnaire__TitleAssignment_2_in_rule__Questionnaire__Group__2__Impl629);
            rule__Questionnaire__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__2__Impl"


    // $ANTLR start "rule__Questionnaire__Group__3"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:341:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:345:1: ( rule__Questionnaire__Group__3__Impl )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:346:2: rule__Questionnaire__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3659);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__3"


    // $ANTLR start "rule__Questionnaire__Group__3__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:352:1: rule__Questionnaire__Group__3__Impl : ( ( rule__Questionnaire__PagesAssignment_3 )* ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:356:1: ( ( ( rule__Questionnaire__PagesAssignment_3 )* ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:357:1: ( ( rule__Questionnaire__PagesAssignment_3 )* )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:357:1: ( ( rule__Questionnaire__PagesAssignment_3 )* )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:358:1: ( rule__Questionnaire__PagesAssignment_3 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getPagesAssignment_3()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:359:1: ( rule__Questionnaire__PagesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:359:2: rule__Questionnaire__PagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__PagesAssignment_3_in_rule__Questionnaire__Group__3__Impl686);
            	    rule__Questionnaire__PagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getPagesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:377:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:381:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:382:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__0725);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__0728);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:389:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:393:1: ( ( 'page' ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:394:1: ( 'page' )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:394:1: ( 'page' )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:395:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Page__Group__0__Impl756); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:408:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:412:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:413:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__1787);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__1790);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:420:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:424:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:425:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:425:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:426:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:427:1: ( rule__Page__NameAssignment_1 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:427:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl817);
            rule__Page__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:437:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:441:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:442:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__2847);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__2850);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:449:1: rule__Page__Group__2__Impl : ( '(' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:453:1: ( ( '(' ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:454:1: ( '(' )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:454:1: ( '(' )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:455:1: '('
            {
             before(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Page__Group__2__Impl878); 
             after(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:468:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:472:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:473:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__3909);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__3912);
            rule__Page__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:480:1: rule__Page__Group__3__Impl : ( ( rule__Page__QuestionsAssignment_3 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:484:1: ( ( ( rule__Page__QuestionsAssignment_3 )* ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:485:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:485:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:486:1: ( rule__Page__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:487:1: ( rule__Page__QuestionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=17)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:487:2: rule__Page__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl939);
            	    rule__Page__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:497:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:501:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:502:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__4970);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__4973);
            rule__Page__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:509:1: rule__Page__Group__4__Impl : ( ( rule__Page__NextAssignment_4 ) ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:513:1: ( ( ( rule__Page__NextAssignment_4 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:514:1: ( ( rule__Page__NextAssignment_4 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:514:1: ( ( rule__Page__NextAssignment_4 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:515:1: ( rule__Page__NextAssignment_4 )
            {
             before(grammarAccess.getPageAccess().getNextAssignment_4()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:516:1: ( rule__Page__NextAssignment_4 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:516:2: rule__Page__NextAssignment_4
            {
            pushFollow(FOLLOW_rule__Page__NextAssignment_4_in_rule__Page__Group__4__Impl1000);
            rule__Page__NextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:526:1: rule__Page__Group__5 : rule__Page__Group__5__Impl ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:530:1: ( rule__Page__Group__5__Impl )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:531:2: rule__Page__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51030);
            rule__Page__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:537:1: rule__Page__Group__5__Impl : ( ')' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:541:1: ( ( ')' ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:542:1: ( ')' )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:542:1: ( ')' )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:543:1: ')'
            {
             before(grammarAccess.getPageAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Page__Group__5__Impl1058); 
             after(grammarAccess.getPageAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__FreeTextQuestion__Group__0"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:568:1: rule__FreeTextQuestion__Group__0 : rule__FreeTextQuestion__Group__0__Impl rule__FreeTextQuestion__Group__1 ;
    public final void rule__FreeTextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:572:1: ( rule__FreeTextQuestion__Group__0__Impl rule__FreeTextQuestion__Group__1 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:573:2: rule__FreeTextQuestion__Group__0__Impl rule__FreeTextQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__0__Impl_in_rule__FreeTextQuestion__Group__01101);
            rule__FreeTextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__1_in_rule__FreeTextQuestion__Group__01104);
            rule__FreeTextQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__0"


    // $ANTLR start "rule__FreeTextQuestion__Group__0__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:580:1: rule__FreeTextQuestion__Group__0__Impl : ( 'text' ) ;
    public final void rule__FreeTextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:584:1: ( ( 'text' ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:585:1: ( 'text' )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:585:1: ( 'text' )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:586:1: 'text'
            {
             before(grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__FreeTextQuestion__Group__0__Impl1132); 
             after(grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__0__Impl"


    // $ANTLR start "rule__FreeTextQuestion__Group__1"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:599:1: rule__FreeTextQuestion__Group__1 : rule__FreeTextQuestion__Group__1__Impl rule__FreeTextQuestion__Group__2 ;
    public final void rule__FreeTextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:603:1: ( rule__FreeTextQuestion__Group__1__Impl rule__FreeTextQuestion__Group__2 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:604:2: rule__FreeTextQuestion__Group__1__Impl rule__FreeTextQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__1__Impl_in_rule__FreeTextQuestion__Group__11163);
            rule__FreeTextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__2_in_rule__FreeTextQuestion__Group__11166);
            rule__FreeTextQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__1"


    // $ANTLR start "rule__FreeTextQuestion__Group__1__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:611:1: rule__FreeTextQuestion__Group__1__Impl : ( ( rule__FreeTextQuestion__NameAssignment_1 ) ) ;
    public final void rule__FreeTextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:615:1: ( ( ( rule__FreeTextQuestion__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:616:1: ( ( rule__FreeTextQuestion__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:616:1: ( ( rule__FreeTextQuestion__NameAssignment_1 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:617:1: ( rule__FreeTextQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getFreeTextQuestionAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:618:1: ( rule__FreeTextQuestion__NameAssignment_1 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:618:2: rule__FreeTextQuestion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__NameAssignment_1_in_rule__FreeTextQuestion__Group__1__Impl1193);
            rule__FreeTextQuestion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextQuestionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__1__Impl"


    // $ANTLR start "rule__FreeTextQuestion__Group__2"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:628:1: rule__FreeTextQuestion__Group__2 : rule__FreeTextQuestion__Group__2__Impl ;
    public final void rule__FreeTextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:632:1: ( rule__FreeTextQuestion__Group__2__Impl )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:633:2: rule__FreeTextQuestion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__2__Impl_in_rule__FreeTextQuestion__Group__21223);
            rule__FreeTextQuestion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__2"


    // $ANTLR start "rule__FreeTextQuestion__Group__2__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:639:1: rule__FreeTextQuestion__Group__2__Impl : ( ( rule__FreeTextQuestion__TextAssignment_2 ) ) ;
    public final void rule__FreeTextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:643:1: ( ( ( rule__FreeTextQuestion__TextAssignment_2 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:644:1: ( ( rule__FreeTextQuestion__TextAssignment_2 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:644:1: ( ( rule__FreeTextQuestion__TextAssignment_2 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:645:1: ( rule__FreeTextQuestion__TextAssignment_2 )
            {
             before(grammarAccess.getFreeTextQuestionAccess().getTextAssignment_2()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:646:1: ( rule__FreeTextQuestion__TextAssignment_2 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:646:2: rule__FreeTextQuestion__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__TextAssignment_2_in_rule__FreeTextQuestion__Group__2__Impl1250);
            rule__FreeTextQuestion__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextQuestionAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__2__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__0"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:662:1: rule__ChoiceQuestion__Group__0 : rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 ;
    public final void rule__ChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:666:1: ( rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:667:2: rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__01286);
            rule__ChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__01289);
            rule__ChoiceQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__0"


    // $ANTLR start "rule__ChoiceQuestion__Group__0__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:674:1: rule__ChoiceQuestion__Group__0__Impl : ( ( rule__ChoiceQuestion__SingleAssignment_0 )? ) ;
    public final void rule__ChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:678:1: ( ( ( rule__ChoiceQuestion__SingleAssignment_0 )? ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:679:1: ( ( rule__ChoiceQuestion__SingleAssignment_0 )? )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:679:1: ( ( rule__ChoiceQuestion__SingleAssignment_0 )? )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:680:1: ( rule__ChoiceQuestion__SingleAssignment_0 )?
            {
             before(grammarAccess.getChoiceQuestionAccess().getSingleAssignment_0()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:681:1: ( rule__ChoiceQuestion__SingleAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:681:2: rule__ChoiceQuestion__SingleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ChoiceQuestion__SingleAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl1316);
                    rule__ChoiceQuestion__SingleAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceQuestionAccess().getSingleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__1"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:691:1: rule__ChoiceQuestion__Group__1 : rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 ;
    public final void rule__ChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:695:1: ( rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:696:2: rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__11347);
            rule__ChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__11350);
            rule__ChoiceQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__1"


    // $ANTLR start "rule__ChoiceQuestion__Group__1__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:703:1: rule__ChoiceQuestion__Group__1__Impl : ( 'choice' ) ;
    public final void rule__ChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:707:1: ( ( 'choice' ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:708:1: ( 'choice' )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:708:1: ( 'choice' )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:709:1: 'choice'
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__ChoiceQuestion__Group__1__Impl1378); 
             after(grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__2"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:722:1: rule__ChoiceQuestion__Group__2 : rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 ;
    public final void rule__ChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:726:1: ( rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:727:2: rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__21409);
            rule__ChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__21412);
            rule__ChoiceQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__2"


    // $ANTLR start "rule__ChoiceQuestion__Group__2__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:734:1: rule__ChoiceQuestion__Group__2__Impl : ( ( rule__ChoiceQuestion__NameAssignment_2 ) ) ;
    public final void rule__ChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:738:1: ( ( ( rule__ChoiceQuestion__NameAssignment_2 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:739:1: ( ( rule__ChoiceQuestion__NameAssignment_2 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:739:1: ( ( rule__ChoiceQuestion__NameAssignment_2 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:740:1: ( rule__ChoiceQuestion__NameAssignment_2 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getNameAssignment_2()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:741:1: ( rule__ChoiceQuestion__NameAssignment_2 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:741:2: rule__ChoiceQuestion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__NameAssignment_2_in_rule__ChoiceQuestion__Group__2__Impl1439);
            rule__ChoiceQuestion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__2__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__3"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:751:1: rule__ChoiceQuestion__Group__3 : rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 ;
    public final void rule__ChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:755:1: ( rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:756:2: rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__31469);
            rule__ChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__31472);
            rule__ChoiceQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__3"


    // $ANTLR start "rule__ChoiceQuestion__Group__3__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:763:1: rule__ChoiceQuestion__Group__3__Impl : ( ( rule__ChoiceQuestion__TextAssignment_3 ) ) ;
    public final void rule__ChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:767:1: ( ( ( rule__ChoiceQuestion__TextAssignment_3 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:768:1: ( ( rule__ChoiceQuestion__TextAssignment_3 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:768:1: ( ( rule__ChoiceQuestion__TextAssignment_3 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:769:1: ( rule__ChoiceQuestion__TextAssignment_3 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getTextAssignment_3()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:770:1: ( rule__ChoiceQuestion__TextAssignment_3 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:770:2: rule__ChoiceQuestion__TextAssignment_3
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__TextAssignment_3_in_rule__ChoiceQuestion__Group__3__Impl1499);
            rule__ChoiceQuestion__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__3__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__4"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:780:1: rule__ChoiceQuestion__Group__4 : rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5 ;
    public final void rule__ChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:784:1: ( rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:785:2: rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__41529);
            rule__ChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__5_in_rule__ChoiceQuestion__Group__41532);
            rule__ChoiceQuestion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__4"


    // $ANTLR start "rule__ChoiceQuestion__Group__4__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:792:1: rule__ChoiceQuestion__Group__4__Impl : ( '(' ) ;
    public final void rule__ChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:796:1: ( ( '(' ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:797:1: ( '(' )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:797:1: ( '(' )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:798:1: '('
            {
             before(grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ChoiceQuestion__Group__4__Impl1560); 
             after(grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__4__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__5"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:811:1: rule__ChoiceQuestion__Group__5 : rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6 ;
    public final void rule__ChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:815:1: ( rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:816:2: rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__5__Impl_in_rule__ChoiceQuestion__Group__51591);
            rule__ChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__6_in_rule__ChoiceQuestion__Group__51594);
            rule__ChoiceQuestion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__5"


    // $ANTLR start "rule__ChoiceQuestion__Group__5__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:823:1: rule__ChoiceQuestion__Group__5__Impl : ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) ) ;
    public final void rule__ChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:827:1: ( ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:828:1: ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:828:1: ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:829:1: ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:829:1: ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:830:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:831:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:831:2: rule__ChoiceQuestion__ChoicesAssignment_5
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl1623);
            rule__ChoiceQuestion__ChoicesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 

            }

            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:834:1: ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:835:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )*
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:836:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:836:2: rule__ChoiceQuestion__ChoicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl1635);
            	    rule__ChoiceQuestion__ChoicesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__5__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__6"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:847:1: rule__ChoiceQuestion__Group__6 : rule__ChoiceQuestion__Group__6__Impl ;
    public final void rule__ChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:851:1: ( rule__ChoiceQuestion__Group__6__Impl )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:852:2: rule__ChoiceQuestion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__6__Impl_in_rule__ChoiceQuestion__Group__61668);
            rule__ChoiceQuestion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__6"


    // $ANTLR start "rule__ChoiceQuestion__Group__6__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:858:1: rule__ChoiceQuestion__Group__6__Impl : ( ')' ) ;
    public final void rule__ChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:862:1: ( ( ')' ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:863:1: ( ')' )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:863:1: ( ')' )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:864:1: ')'
            {
             before(grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__ChoiceQuestion__Group__6__Impl1696); 
             after(grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__6__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:891:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:895:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:896:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__01741);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__01744);
            rule__Choice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:903:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__NameAssignment_0 ) ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:907:1: ( ( ( rule__Choice__NameAssignment_0 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:908:1: ( ( rule__Choice__NameAssignment_0 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:908:1: ( ( rule__Choice__NameAssignment_0 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:909:1: ( rule__Choice__NameAssignment_0 )
            {
             before(grammarAccess.getChoiceAccess().getNameAssignment_0()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:910:1: ( rule__Choice__NameAssignment_0 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:910:2: rule__Choice__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Choice__NameAssignment_0_in_rule__Choice__Group__0__Impl1771);
            rule__Choice__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:920:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:924:1: ( rule__Choice__Group__1__Impl )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:925:2: rule__Choice__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__11801);
            rule__Choice__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:931:1: rule__Choice__Group__1__Impl : ( ( rule__Choice__TextAssignment_1 ) ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:935:1: ( ( ( rule__Choice__TextAssignment_1 ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:936:1: ( ( rule__Choice__TextAssignment_1 ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:936:1: ( ( rule__Choice__TextAssignment_1 ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:937:1: ( rule__Choice__TextAssignment_1 )
            {
             before(grammarAccess.getChoiceAccess().getTextAssignment_1()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:938:1: ( rule__Choice__TextAssignment_1 )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:938:2: rule__Choice__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__Choice__TextAssignment_1_in_rule__Choice__Group__1__Impl1828);
            rule__Choice__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__NameAssignment_1"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:953:1: rule__Questionnaire__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Questionnaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:957:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:958:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:958:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:959:1: RULE_ID
            {
             before(grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Questionnaire__NameAssignment_11867); 
             after(grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__NameAssignment_1"


    // $ANTLR start "rule__Questionnaire__TitleAssignment_2"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:968:1: rule__Questionnaire__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Questionnaire__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:972:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:973:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:973:1: ( RULE_STRING )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:974:1: RULE_STRING
            {
             before(grammarAccess.getQuestionnaireAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Questionnaire__TitleAssignment_21898); 
             after(grammarAccess.getQuestionnaireAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__TitleAssignment_2"


    // $ANTLR start "rule__Questionnaire__PagesAssignment_3"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:983:1: rule__Questionnaire__PagesAssignment_3 : ( rulePage ) ;
    public final void rule__Questionnaire__PagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:987:1: ( ( rulePage ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:988:1: ( rulePage )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:988:1: ( rulePage )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:989:1: rulePage
            {
             before(grammarAccess.getQuestionnaireAccess().getPagesPageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__Questionnaire__PagesAssignment_31929);
            rulePage();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getPagesPageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__PagesAssignment_3"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:998:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1002:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1003:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1003:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1004:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_11960); 
             after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NameAssignment_1"


    // $ANTLR start "rule__Page__QuestionsAssignment_3"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1013:1: rule__Page__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1017:1: ( ( ruleQuestion ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1018:1: ( ruleQuestion )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1018:1: ( ruleQuestion )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1019:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_31991);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__QuestionsAssignment_3"


    // $ANTLR start "rule__Page__NextAssignment_4"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1028:1: rule__Page__NextAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Page__NextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1032:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1033:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1033:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1034:1: ( RULE_ID )
            {
             before(grammarAccess.getPageAccess().getNextPageCrossReference_4_0()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1035:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1036:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNextPageIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NextAssignment_42026); 
             after(grammarAccess.getPageAccess().getNextPageIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPageAccess().getNextPageCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NextAssignment_4"


    // $ANTLR start "rule__FreeTextQuestion__NameAssignment_1"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1047:1: rule__FreeTextQuestion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FreeTextQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1051:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1052:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1052:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1053:1: RULE_ID
            {
             before(grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FreeTextQuestion__NameAssignment_12061); 
             after(grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__NameAssignment_1"


    // $ANTLR start "rule__FreeTextQuestion__TextAssignment_2"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1062:1: rule__FreeTextQuestion__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FreeTextQuestion__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1066:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1067:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1067:1: ( RULE_STRING )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1068:1: RULE_STRING
            {
             before(grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FreeTextQuestion__TextAssignment_22092); 
             after(grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__TextAssignment_2"


    // $ANTLR start "rule__ChoiceQuestion__SingleAssignment_0"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1077:1: rule__ChoiceQuestion__SingleAssignment_0 : ( ( 'single' ) ) ;
    public final void rule__ChoiceQuestion__SingleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1081:1: ( ( ( 'single' ) ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1082:1: ( ( 'single' ) )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1082:1: ( ( 'single' ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1083:1: ( 'single' )
            {
             before(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1084:1: ( 'single' )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1085:1: 'single'
            {
             before(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 
            match(input,17,FOLLOW_17_in_rule__ChoiceQuestion__SingleAssignment_02128); 
             after(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 

            }

             after(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__SingleAssignment_0"


    // $ANTLR start "rule__ChoiceQuestion__NameAssignment_2"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1100:1: rule__ChoiceQuestion__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ChoiceQuestion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1104:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1105:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1105:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1106:1: RULE_ID
            {
             before(grammarAccess.getChoiceQuestionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChoiceQuestion__NameAssignment_22167); 
             after(grammarAccess.getChoiceQuestionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__NameAssignment_2"


    // $ANTLR start "rule__ChoiceQuestion__TextAssignment_3"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1115:1: rule__ChoiceQuestion__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ChoiceQuestion__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1119:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1120:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1120:1: ( RULE_STRING )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1121:1: RULE_STRING
            {
             before(grammarAccess.getChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChoiceQuestion__TextAssignment_32198); 
             after(grammarAccess.getChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__TextAssignment_3"


    // $ANTLR start "rule__ChoiceQuestion__ChoicesAssignment_5"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1130:1: rule__ChoiceQuestion__ChoicesAssignment_5 : ( ruleChoice ) ;
    public final void rule__ChoiceQuestion__ChoicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1134:1: ( ( ruleChoice ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1135:1: ( ruleChoice )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1135:1: ( ruleChoice )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1136:1: ruleChoice
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__ChoiceQuestion__ChoicesAssignment_52229);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__ChoicesAssignment_5"


    // $ANTLR start "rule__Choice__NameAssignment_0"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1145:1: rule__Choice__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Choice__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1149:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1150:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1150:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1151:1: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_02260); 
             after(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__NameAssignment_0"


    // $ANTLR start "rule__Choice__TextAssignment_1"
    // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1160:1: rule__Choice__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Choice__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1164:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1165:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1165:1: ( RULE_STRING )
            // ../org.eclipse.xtext.tutorial.myquestionnaire.ui/src-gen/org/eclipse/xtext/tutorial/myquestionnaire/ui/contentassist/antlr/internal/InternalMyQuestionnaire.g:1166:1: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_12291); 
             after(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__TextAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeTextQuestion248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__0_in_ruleFreeTextQuestion274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_rule__Question__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_rule__Question__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Questionnaire__Group__0__Impl508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1539 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2599 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__TitleAssignment_2_in_rule__Questionnaire__Group__2__Impl629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__PagesAssignment_3_in_rule__Questionnaire__Group__3__Impl686 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__0725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__0728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Page__Group__0__Impl756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__1787 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__2847 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Page__Group__2__Impl878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__3909 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl939 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__4970 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NextAssignment_4_in_rule__Page__Group__4__Impl1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Page__Group__5__Impl1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__0__Impl_in_rule__FreeTextQuestion__Group__01101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__1_in_rule__FreeTextQuestion__Group__01104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FreeTextQuestion__Group__0__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__1__Impl_in_rule__FreeTextQuestion__Group__11163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__2_in_rule__FreeTextQuestion__Group__11166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__NameAssignment_1_in_rule__FreeTextQuestion__Group__1__Impl1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__2__Impl_in_rule__FreeTextQuestion__Group__21223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__TextAssignment_2_in_rule__FreeTextQuestion__Group__2__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__01286 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__01289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__SingleAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__11347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__11350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ChoiceQuestion__Group__1__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__21409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__21412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__NameAssignment_2_in_rule__ChoiceQuestion__Group__2__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__31469 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__31472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__TextAssignment_3_in_rule__ChoiceQuestion__Group__3__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__41529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__5_in_rule__ChoiceQuestion__Group__41532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ChoiceQuestion__Group__4__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__5__Impl_in_rule__ChoiceQuestion__Group__51591 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__6_in_rule__ChoiceQuestion__Group__51594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl1623 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl1635 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__6__Impl_in_rule__ChoiceQuestion__Group__61668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ChoiceQuestion__Group__6__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__01741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__NameAssignment_0_in_rule__Choice__Group__0__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__11801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__TextAssignment_1_in_rule__Choice__Group__1__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Questionnaire__NameAssignment_11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Questionnaire__TitleAssignment_21898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Questionnaire__PagesAssignment_31929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_11960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_31991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NextAssignment_42026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FreeTextQuestion__NameAssignment_12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FreeTextQuestion__TextAssignment_22092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ChoiceQuestion__SingleAssignment_02128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChoiceQuestion__NameAssignment_22167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChoiceQuestion__TextAssignment_32198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__ChoiceQuestion__ChoicesAssignment_52229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_02260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_12291 = new BitSet(new long[]{0x0000000000000002L});

}