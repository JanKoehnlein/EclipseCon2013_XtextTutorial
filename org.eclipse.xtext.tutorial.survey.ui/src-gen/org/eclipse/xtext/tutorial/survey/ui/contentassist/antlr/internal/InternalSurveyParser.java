package org.eclipse.xtext.tutorial.survey.ui.contentassist.antlr.internal; 

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
import org.eclipse.xtext.tutorial.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'page'", "'('", "')'", "'->'", "'if'", "'='", "'.'", "'text'", "'choice'", "'single'"
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
    public String getGrammarFileName() { return "../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g"; }


     
     	private SurveyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SurveyGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSurvey"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:60:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:61:1: ( ruleSurvey EOF )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:62:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey61);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey68); 

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
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:69:1: ruleSurvey : ( ( rule__Survey__Group__0 ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:73:2: ( ( ( rule__Survey__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Survey__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Survey__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:75:1: ( rule__Survey__Group__0 )
            {
             before(grammarAccess.getSurveyAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:76:1: ( rule__Survey__Group__0 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:76:2: rule__Survey__Group__0
            {
            pushFollow(FOLLOW_rule__Survey__Group__0_in_ruleSurvey94);
            rule__Survey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getGroup()); 

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
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRulePage"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:88:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:89:1: ( rulePage EOF )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:90:1: rulePage EOF
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:97:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:101:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Page__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Page__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:103:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:104:1: ( rule__Page__Group__0 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:104:2: rule__Page__Group__0
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


    // $ANTLR start "entryRuleFollowUp"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:116:1: entryRuleFollowUp : ruleFollowUp EOF ;
    public final void entryRuleFollowUp() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:117:1: ( ruleFollowUp EOF )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:118:1: ruleFollowUp EOF
            {
             before(grammarAccess.getFollowUpRule()); 
            pushFollow(FOLLOW_ruleFollowUp_in_entryRuleFollowUp181);
            ruleFollowUp();

            state._fsp--;

             after(grammarAccess.getFollowUpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowUp188); 

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
    // $ANTLR end "entryRuleFollowUp"


    // $ANTLR start "ruleFollowUp"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:125:1: ruleFollowUp : ( ( rule__FollowUp__Group__0 ) ) ;
    public final void ruleFollowUp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:129:2: ( ( ( rule__FollowUp__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__FollowUp__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__FollowUp__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:131:1: ( rule__FollowUp__Group__0 )
            {
             before(grammarAccess.getFollowUpAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:132:1: ( rule__FollowUp__Group__0 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:132:2: rule__FollowUp__Group__0
            {
            pushFollow(FOLLOW_rule__FollowUp__Group__0_in_ruleFollowUp214);
            rule__FollowUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowUpAccess().getGroup()); 

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
    // $ANTLR end "ruleFollowUp"


    // $ANTLR start "entryRuleGuard"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:144:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:145:1: ( ruleGuard EOF )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:146:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard241);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard248); 

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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:153:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:157:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__Guard__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:159:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:160:1: ( rule__Guard__Group__0 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:160:2: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_rule__Guard__Group__0_in_ruleGuard274);
            rule__Guard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getGroup()); 

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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:172:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:173:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:174:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName301);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName308); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:181:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:185:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:187:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName334);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQuestion"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:200:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:201:1: ( ruleQuestion EOF )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:202:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion361);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion368); 

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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:209:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:213:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:214:1: ( ( rule__Question__Alternatives ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:214:1: ( ( rule__Question__Alternatives ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:215:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:1: ( rule__Question__Alternatives )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:2: rule__Question__Alternatives
            {
            pushFollow(FOLLOW_rule__Question__Alternatives_in_ruleQuestion394);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:228:1: entryRuleFreeTextQuestion : ruleFreeTextQuestion EOF ;
    public final void entryRuleFreeTextQuestion() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:229:1: ( ruleFreeTextQuestion EOF )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:230:1: ruleFreeTextQuestion EOF
            {
             before(grammarAccess.getFreeTextQuestionRule()); 
            pushFollow(FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion421);
            ruleFreeTextQuestion();

            state._fsp--;

             after(grammarAccess.getFreeTextQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeTextQuestion428); 

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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:237:1: ruleFreeTextQuestion : ( ( rule__FreeTextQuestion__Group__0 ) ) ;
    public final void ruleFreeTextQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:241:2: ( ( ( rule__FreeTextQuestion__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:242:1: ( ( rule__FreeTextQuestion__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:242:1: ( ( rule__FreeTextQuestion__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:243:1: ( rule__FreeTextQuestion__Group__0 )
            {
             before(grammarAccess.getFreeTextQuestionAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ( rule__FreeTextQuestion__Group__0 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:2: rule__FreeTextQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__0_in_ruleFreeTextQuestion454);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:256:1: entryRuleChoiceQuestion : ruleChoiceQuestion EOF ;
    public final void entryRuleChoiceQuestion() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:257:1: ( ruleChoiceQuestion EOF )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:258:1: ruleChoiceQuestion EOF
            {
             before(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion481);
            ruleChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoiceQuestion488); 

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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:265:1: ruleChoiceQuestion : ( ( rule__ChoiceQuestion__Group__0 ) ) ;
    public final void ruleChoiceQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:269:2: ( ( ( rule__ChoiceQuestion__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:270:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:270:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:271:1: ( rule__ChoiceQuestion__Group__0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ( rule__ChoiceQuestion__Group__0 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:2: rule__ChoiceQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion514);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:284:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:285:1: ( ruleChoice EOF )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:286:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice541);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice548); 

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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:293:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:297:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:298:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:298:1: ( ( rule__Choice__Group__0 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:299:1: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:1: ( rule__Choice__Group__0 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:2: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_rule__Choice__Group__0_in_ruleChoice574);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:312:1: rule__Question__Alternatives : ( ( ruleFreeTextQuestion ) | ( ruleChoiceQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:316:1: ( ( ruleFreeTextQuestion ) | ( ruleChoiceQuestion ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=20 && LA1_0<=21)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:317:1: ( ruleFreeTextQuestion )
                    {
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:317:1: ( ruleFreeTextQuestion )
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:318:1: ruleFreeTextQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFreeTextQuestion_in_rule__Question__Alternatives610);
                    ruleFreeTextQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:323:6: ( ruleChoiceQuestion )
                    {
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:323:6: ( ruleChoiceQuestion )
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:324:1: ruleChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChoiceQuestion_in_rule__Question__Alternatives627);
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


    // $ANTLR start "rule__Survey__Group__0"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:336:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:340:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:341:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0657);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0660);
            rule__Survey__Group__1();

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
    // $ANTLR end "rule__Survey__Group__0"


    // $ANTLR start "rule__Survey__Group__0__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:348:1: rule__Survey__Group__0__Impl : ( 'survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:352:1: ( ( 'survey' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:353:1: ( 'survey' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:353:1: ( 'survey' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:354:1: 'survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Survey__Group__0__Impl688); 
             after(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 

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
    // $ANTLR end "rule__Survey__Group__0__Impl"


    // $ANTLR start "rule__Survey__Group__1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:367:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:371:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:372:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1719);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1722);
            rule__Survey__Group__2();

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
    // $ANTLR end "rule__Survey__Group__1"


    // $ANTLR start "rule__Survey__Group__1__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:379:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:383:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:385:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:386:1: ( rule__Survey__NameAssignment_1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:386:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl749);
            rule__Survey__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Survey__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__2"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:396:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:400:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:401:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2779);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2782);
            rule__Survey__Group__3();

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
    // $ANTLR end "rule__Survey__Group__2"


    // $ANTLR start "rule__Survey__Group__2__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:408:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__TitleAssignment_2 ) ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:412:1: ( ( ( rule__Survey__TitleAssignment_2 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:413:1: ( ( rule__Survey__TitleAssignment_2 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:413:1: ( ( rule__Survey__TitleAssignment_2 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:414:1: ( rule__Survey__TitleAssignment_2 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:415:1: ( rule__Survey__TitleAssignment_2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:415:2: rule__Survey__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl809);
            rule__Survey__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 

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
    // $ANTLR end "rule__Survey__Group__2__Impl"


    // $ANTLR start "rule__Survey__Group__3"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:425:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:429:1: ( rule__Survey__Group__3__Impl )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:430:2: rule__Survey__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3839);
            rule__Survey__Group__3__Impl();

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
    // $ANTLR end "rule__Survey__Group__3"


    // $ANTLR start "rule__Survey__Group__3__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:436:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__PagesAssignment_3 )* ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:440:1: ( ( ( rule__Survey__PagesAssignment_3 )* ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:441:1: ( ( rule__Survey__PagesAssignment_3 )* )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:441:1: ( ( rule__Survey__PagesAssignment_3 )* )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:442:1: ( rule__Survey__PagesAssignment_3 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_3()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:443:1: ( rule__Survey__PagesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:443:2: rule__Survey__PagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Survey__PagesAssignment_3_in_rule__Survey__Group__3__Impl866);
            	    rule__Survey__PagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getPagesAssignment_3()); 

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
    // $ANTLR end "rule__Survey__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:461:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:465:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:466:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__0905);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__0908);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:473:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:477:1: ( ( 'page' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:478:1: ( 'page' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:478:1: ( 'page' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:479:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Page__Group__0__Impl936); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:492:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:496:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:497:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__1967);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__1970);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:504:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:508:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:509:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:509:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:510:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:511:1: ( rule__Page__NameAssignment_1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:511:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl997);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:521:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:525:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:526:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21027);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21030);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:533:1: rule__Page__Group__2__Impl : ( '(' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:537:1: ( ( '(' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:538:1: ( '(' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:538:1: ( '(' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:539:1: '('
            {
             before(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Page__Group__2__Impl1058); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:552:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:556:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:557:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31089);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31092);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:564:1: rule__Page__Group__3__Impl : ( ( rule__Page__QuestionsAssignment_3 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:568:1: ( ( ( rule__Page__QuestionsAssignment_3 )* ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:569:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:569:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:570:1: ( rule__Page__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:571:1: ( rule__Page__QuestionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=19 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:571:2: rule__Page__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl1119);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:581:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:585:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:586:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41150);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41153);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:593:1: rule__Page__Group__4__Impl : ( ( rule__Page__FollowUpsAssignment_4 )* ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:597:1: ( ( ( rule__Page__FollowUpsAssignment_4 )* ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:598:1: ( ( rule__Page__FollowUpsAssignment_4 )* )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:598:1: ( ( rule__Page__FollowUpsAssignment_4 )* )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:599:1: ( rule__Page__FollowUpsAssignment_4 )*
            {
             before(grammarAccess.getPageAccess().getFollowUpsAssignment_4()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:600:1: ( rule__Page__FollowUpsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:600:2: rule__Page__FollowUpsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Page__FollowUpsAssignment_4_in_rule__Page__Group__4__Impl1180);
            	    rule__Page__FollowUpsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getFollowUpsAssignment_4()); 

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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:610:1: rule__Page__Group__5 : rule__Page__Group__5__Impl ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:614:1: ( rule__Page__Group__5__Impl )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:615:2: rule__Page__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51211);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:621:1: rule__Page__Group__5__Impl : ( ')' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:625:1: ( ( ')' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:626:1: ( ')' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:626:1: ( ')' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:627:1: ')'
            {
             before(grammarAccess.getPageAccess().getRightParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Page__Group__5__Impl1239); 
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


    // $ANTLR start "rule__FollowUp__Group__0"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:652:1: rule__FollowUp__Group__0 : rule__FollowUp__Group__0__Impl rule__FollowUp__Group__1 ;
    public final void rule__FollowUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:656:1: ( rule__FollowUp__Group__0__Impl rule__FollowUp__Group__1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:657:2: rule__FollowUp__Group__0__Impl rule__FollowUp__Group__1
            {
            pushFollow(FOLLOW_rule__FollowUp__Group__0__Impl_in_rule__FollowUp__Group__01282);
            rule__FollowUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FollowUp__Group__1_in_rule__FollowUp__Group__01285);
            rule__FollowUp__Group__1();

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
    // $ANTLR end "rule__FollowUp__Group__0"


    // $ANTLR start "rule__FollowUp__Group__0__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:664:1: rule__FollowUp__Group__0__Impl : ( ( rule__FollowUp__GuardAssignment_0 )? ) ;
    public final void rule__FollowUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:668:1: ( ( ( rule__FollowUp__GuardAssignment_0 )? ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:669:1: ( ( rule__FollowUp__GuardAssignment_0 )? )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:669:1: ( ( rule__FollowUp__GuardAssignment_0 )? )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:670:1: ( rule__FollowUp__GuardAssignment_0 )?
            {
             before(grammarAccess.getFollowUpAccess().getGuardAssignment_0()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:671:1: ( rule__FollowUp__GuardAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:671:2: rule__FollowUp__GuardAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FollowUp__GuardAssignment_0_in_rule__FollowUp__Group__0__Impl1312);
                    rule__FollowUp__GuardAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFollowUpAccess().getGuardAssignment_0()); 

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
    // $ANTLR end "rule__FollowUp__Group__0__Impl"


    // $ANTLR start "rule__FollowUp__Group__1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:681:1: rule__FollowUp__Group__1 : rule__FollowUp__Group__1__Impl rule__FollowUp__Group__2 ;
    public final void rule__FollowUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:685:1: ( rule__FollowUp__Group__1__Impl rule__FollowUp__Group__2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:686:2: rule__FollowUp__Group__1__Impl rule__FollowUp__Group__2
            {
            pushFollow(FOLLOW_rule__FollowUp__Group__1__Impl_in_rule__FollowUp__Group__11343);
            rule__FollowUp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FollowUp__Group__2_in_rule__FollowUp__Group__11346);
            rule__FollowUp__Group__2();

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
    // $ANTLR end "rule__FollowUp__Group__1"


    // $ANTLR start "rule__FollowUp__Group__1__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:693:1: rule__FollowUp__Group__1__Impl : ( '->' ) ;
    public final void rule__FollowUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:697:1: ( ( '->' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:698:1: ( '->' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:698:1: ( '->' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:699:1: '->'
            {
             before(grammarAccess.getFollowUpAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__FollowUp__Group__1__Impl1374); 
             after(grammarAccess.getFollowUpAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__FollowUp__Group__1__Impl"


    // $ANTLR start "rule__FollowUp__Group__2"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:712:1: rule__FollowUp__Group__2 : rule__FollowUp__Group__2__Impl ;
    public final void rule__FollowUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:716:1: ( rule__FollowUp__Group__2__Impl )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:717:2: rule__FollowUp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FollowUp__Group__2__Impl_in_rule__FollowUp__Group__21405);
            rule__FollowUp__Group__2__Impl();

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
    // $ANTLR end "rule__FollowUp__Group__2"


    // $ANTLR start "rule__FollowUp__Group__2__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:723:1: rule__FollowUp__Group__2__Impl : ( ( rule__FollowUp__NextAssignment_2 ) ) ;
    public final void rule__FollowUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:727:1: ( ( ( rule__FollowUp__NextAssignment_2 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:728:1: ( ( rule__FollowUp__NextAssignment_2 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:728:1: ( ( rule__FollowUp__NextAssignment_2 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:729:1: ( rule__FollowUp__NextAssignment_2 )
            {
             before(grammarAccess.getFollowUpAccess().getNextAssignment_2()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:730:1: ( rule__FollowUp__NextAssignment_2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:730:2: rule__FollowUp__NextAssignment_2
            {
            pushFollow(FOLLOW_rule__FollowUp__NextAssignment_2_in_rule__FollowUp__Group__2__Impl1432);
            rule__FollowUp__NextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFollowUpAccess().getNextAssignment_2()); 

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
    // $ANTLR end "rule__FollowUp__Group__2__Impl"


    // $ANTLR start "rule__Guard__Group__0"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:746:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:750:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:751:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__01468);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__01471);
            rule__Guard__Group__1();

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
    // $ANTLR end "rule__Guard__Group__0"


    // $ANTLR start "rule__Guard__Group__0__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:758:1: rule__Guard__Group__0__Impl : ( 'if' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:762:1: ( ( 'if' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:763:1: ( 'if' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:763:1: ( 'if' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:764:1: 'if'
            {
             before(grammarAccess.getGuardAccess().getIfKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Guard__Group__0__Impl1499); 
             after(grammarAccess.getGuardAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__Guard__Group__0__Impl"


    // $ANTLR start "rule__Guard__Group__1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:777:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:781:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:782:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__11530);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__11533);
            rule__Guard__Group__2();

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
    // $ANTLR end "rule__Guard__Group__1"


    // $ANTLR start "rule__Guard__Group__1__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:789:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__QuestionAssignment_1 ) ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:793:1: ( ( ( rule__Guard__QuestionAssignment_1 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:794:1: ( ( rule__Guard__QuestionAssignment_1 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:794:1: ( ( rule__Guard__QuestionAssignment_1 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:795:1: ( rule__Guard__QuestionAssignment_1 )
            {
             before(grammarAccess.getGuardAccess().getQuestionAssignment_1()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:796:1: ( rule__Guard__QuestionAssignment_1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:796:2: rule__Guard__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__Guard__QuestionAssignment_1_in_rule__Guard__Group__1__Impl1560);
            rule__Guard__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getQuestionAssignment_1()); 

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
    // $ANTLR end "rule__Guard__Group__1__Impl"


    // $ANTLR start "rule__Guard__Group__2"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:806:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:810:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:811:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__21590);
            rule__Guard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__21593);
            rule__Guard__Group__3();

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
    // $ANTLR end "rule__Guard__Group__2"


    // $ANTLR start "rule__Guard__Group__2__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:818:1: rule__Guard__Group__2__Impl : ( '=' ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:822:1: ( ( '=' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:823:1: ( '=' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:823:1: ( '=' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:824:1: '='
            {
             before(grammarAccess.getGuardAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Guard__Group__2__Impl1621); 
             after(grammarAccess.getGuardAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Guard__Group__2__Impl"


    // $ANTLR start "rule__Guard__Group__3"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:837:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:841:1: ( rule__Guard__Group__3__Impl )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:842:2: rule__Guard__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__31652);
            rule__Guard__Group__3__Impl();

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
    // $ANTLR end "rule__Guard__Group__3"


    // $ANTLR start "rule__Guard__Group__3__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:848:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__AnswerAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:852:1: ( ( ( rule__Guard__AnswerAssignment_3 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:853:1: ( ( rule__Guard__AnswerAssignment_3 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:853:1: ( ( rule__Guard__AnswerAssignment_3 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:854:1: ( rule__Guard__AnswerAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getAnswerAssignment_3()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:855:1: ( rule__Guard__AnswerAssignment_3 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:855:2: rule__Guard__AnswerAssignment_3
            {
            pushFollow(FOLLOW_rule__Guard__AnswerAssignment_3_in_rule__Guard__Group__3__Impl1679);
            rule__Guard__AnswerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getAnswerAssignment_3()); 

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
    // $ANTLR end "rule__Guard__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:873:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:877:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:878:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01717);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01720);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:885:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:889:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:890:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:890:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:891:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1747); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:902:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:906:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:907:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11776);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:913:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:917:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:918:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:918:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:919:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:920:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:920:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1803);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:934:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:938:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:939:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01838);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01841);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:946:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:950:1: ( ( '.' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:951:1: ( '.' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:951:1: ( '.' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:952:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl1869); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:965:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:969:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:970:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11900);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:976:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:980:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:981:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:981:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:982:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1927); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__FreeTextQuestion__Group__0"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:997:1: rule__FreeTextQuestion__Group__0 : rule__FreeTextQuestion__Group__0__Impl rule__FreeTextQuestion__Group__1 ;
    public final void rule__FreeTextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1001:1: ( rule__FreeTextQuestion__Group__0__Impl rule__FreeTextQuestion__Group__1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1002:2: rule__FreeTextQuestion__Group__0__Impl rule__FreeTextQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__0__Impl_in_rule__FreeTextQuestion__Group__01960);
            rule__FreeTextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__1_in_rule__FreeTextQuestion__Group__01963);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1009:1: rule__FreeTextQuestion__Group__0__Impl : ( 'text' ) ;
    public final void rule__FreeTextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1013:1: ( ( 'text' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1014:1: ( 'text' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1014:1: ( 'text' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1015:1: 'text'
            {
             before(grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__FreeTextQuestion__Group__0__Impl1991); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1028:1: rule__FreeTextQuestion__Group__1 : rule__FreeTextQuestion__Group__1__Impl rule__FreeTextQuestion__Group__2 ;
    public final void rule__FreeTextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1032:1: ( rule__FreeTextQuestion__Group__1__Impl rule__FreeTextQuestion__Group__2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1033:2: rule__FreeTextQuestion__Group__1__Impl rule__FreeTextQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__1__Impl_in_rule__FreeTextQuestion__Group__12022);
            rule__FreeTextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__2_in_rule__FreeTextQuestion__Group__12025);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1040:1: rule__FreeTextQuestion__Group__1__Impl : ( ( rule__FreeTextQuestion__NameAssignment_1 ) ) ;
    public final void rule__FreeTextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1044:1: ( ( ( rule__FreeTextQuestion__NameAssignment_1 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1045:1: ( ( rule__FreeTextQuestion__NameAssignment_1 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1045:1: ( ( rule__FreeTextQuestion__NameAssignment_1 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1046:1: ( rule__FreeTextQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getFreeTextQuestionAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1047:1: ( rule__FreeTextQuestion__NameAssignment_1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1047:2: rule__FreeTextQuestion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__NameAssignment_1_in_rule__FreeTextQuestion__Group__1__Impl2052);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1057:1: rule__FreeTextQuestion__Group__2 : rule__FreeTextQuestion__Group__2__Impl ;
    public final void rule__FreeTextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1061:1: ( rule__FreeTextQuestion__Group__2__Impl )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1062:2: rule__FreeTextQuestion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__2__Impl_in_rule__FreeTextQuestion__Group__22082);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1068:1: rule__FreeTextQuestion__Group__2__Impl : ( ( rule__FreeTextQuestion__TextAssignment_2 ) ) ;
    public final void rule__FreeTextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1072:1: ( ( ( rule__FreeTextQuestion__TextAssignment_2 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1073:1: ( ( rule__FreeTextQuestion__TextAssignment_2 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1073:1: ( ( rule__FreeTextQuestion__TextAssignment_2 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1074:1: ( rule__FreeTextQuestion__TextAssignment_2 )
            {
             before(grammarAccess.getFreeTextQuestionAccess().getTextAssignment_2()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1075:1: ( rule__FreeTextQuestion__TextAssignment_2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1075:2: rule__FreeTextQuestion__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__TextAssignment_2_in_rule__FreeTextQuestion__Group__2__Impl2109);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1091:1: rule__ChoiceQuestion__Group__0 : rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 ;
    public final void rule__ChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1095:1: ( rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1096:2: rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__02145);
            rule__ChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__02148);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1103:1: rule__ChoiceQuestion__Group__0__Impl : ( ( rule__ChoiceQuestion__SingleAssignment_0 )? ) ;
    public final void rule__ChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1107:1: ( ( ( rule__ChoiceQuestion__SingleAssignment_0 )? ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1108:1: ( ( rule__ChoiceQuestion__SingleAssignment_0 )? )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1108:1: ( ( rule__ChoiceQuestion__SingleAssignment_0 )? )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1109:1: ( rule__ChoiceQuestion__SingleAssignment_0 )?
            {
             before(grammarAccess.getChoiceQuestionAccess().getSingleAssignment_0()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1110:1: ( rule__ChoiceQuestion__SingleAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1110:2: rule__ChoiceQuestion__SingleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ChoiceQuestion__SingleAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl2175);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1120:1: rule__ChoiceQuestion__Group__1 : rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 ;
    public final void rule__ChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1124:1: ( rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1125:2: rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__12206);
            rule__ChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__12209);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1132:1: rule__ChoiceQuestion__Group__1__Impl : ( 'choice' ) ;
    public final void rule__ChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:1: ( ( 'choice' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1137:1: ( 'choice' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1137:1: ( 'choice' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1138:1: 'choice'
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ChoiceQuestion__Group__1__Impl2237); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1151:1: rule__ChoiceQuestion__Group__2 : rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 ;
    public final void rule__ChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1155:1: ( rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1156:2: rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__22268);
            rule__ChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__22271);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1163:1: rule__ChoiceQuestion__Group__2__Impl : ( ( rule__ChoiceQuestion__NameAssignment_2 ) ) ;
    public final void rule__ChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1167:1: ( ( ( rule__ChoiceQuestion__NameAssignment_2 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1168:1: ( ( rule__ChoiceQuestion__NameAssignment_2 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1168:1: ( ( rule__ChoiceQuestion__NameAssignment_2 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1169:1: ( rule__ChoiceQuestion__NameAssignment_2 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getNameAssignment_2()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1170:1: ( rule__ChoiceQuestion__NameAssignment_2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1170:2: rule__ChoiceQuestion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__NameAssignment_2_in_rule__ChoiceQuestion__Group__2__Impl2298);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1180:1: rule__ChoiceQuestion__Group__3 : rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 ;
    public final void rule__ChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1184:1: ( rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1185:2: rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__32328);
            rule__ChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__32331);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1192:1: rule__ChoiceQuestion__Group__3__Impl : ( ( rule__ChoiceQuestion__TextAssignment_3 ) ) ;
    public final void rule__ChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1196:1: ( ( ( rule__ChoiceQuestion__TextAssignment_3 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1197:1: ( ( rule__ChoiceQuestion__TextAssignment_3 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1197:1: ( ( rule__ChoiceQuestion__TextAssignment_3 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1198:1: ( rule__ChoiceQuestion__TextAssignment_3 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getTextAssignment_3()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1199:1: ( rule__ChoiceQuestion__TextAssignment_3 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1199:2: rule__ChoiceQuestion__TextAssignment_3
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__TextAssignment_3_in_rule__ChoiceQuestion__Group__3__Impl2358);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1209:1: rule__ChoiceQuestion__Group__4 : rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5 ;
    public final void rule__ChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1213:1: ( rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1214:2: rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__42388);
            rule__ChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__5_in_rule__ChoiceQuestion__Group__42391);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1221:1: rule__ChoiceQuestion__Group__4__Impl : ( '(' ) ;
    public final void rule__ChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1225:1: ( ( '(' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1226:1: ( '(' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1226:1: ( '(' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1227:1: '('
            {
             before(grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ChoiceQuestion__Group__4__Impl2419); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1240:1: rule__ChoiceQuestion__Group__5 : rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6 ;
    public final void rule__ChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1244:1: ( rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1245:2: rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__5__Impl_in_rule__ChoiceQuestion__Group__52450);
            rule__ChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__6_in_rule__ChoiceQuestion__Group__52453);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1252:1: rule__ChoiceQuestion__Group__5__Impl : ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) ) ;
    public final void rule__ChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1256:1: ( ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1257:1: ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1257:1: ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1258:1: ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1258:1: ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1259:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1260:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1260:2: rule__ChoiceQuestion__ChoicesAssignment_5
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl2482);
            rule__ChoiceQuestion__ChoicesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 

            }

            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1263:1: ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1264:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )*
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1265:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1265:2: rule__ChoiceQuestion__ChoicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl2494);
            	    rule__ChoiceQuestion__ChoicesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1276:1: rule__ChoiceQuestion__Group__6 : rule__ChoiceQuestion__Group__6__Impl ;
    public final void rule__ChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1280:1: ( rule__ChoiceQuestion__Group__6__Impl )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1281:2: rule__ChoiceQuestion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__6__Impl_in_rule__ChoiceQuestion__Group__62527);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1287:1: rule__ChoiceQuestion__Group__6__Impl : ( ')' ) ;
    public final void rule__ChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1291:1: ( ( ')' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1292:1: ( ')' )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1292:1: ( ')' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1293:1: ')'
            {
             before(grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__ChoiceQuestion__Group__6__Impl2555); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1320:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1324:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1325:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__02600);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__02603);
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1332:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__FreetextAssignment_0 )? ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1336:1: ( ( ( rule__Choice__FreetextAssignment_0 )? ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1337:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1337:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1338:1: ( rule__Choice__FreetextAssignment_0 )?
            {
             before(grammarAccess.getChoiceAccess().getFreetextAssignment_0()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1339:1: ( rule__Choice__FreetextAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1339:2: rule__Choice__FreetextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl2630);
                    rule__Choice__FreetextAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceAccess().getFreetextAssignment_0()); 

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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1349:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1353:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1354:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__12661);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__12664);
            rule__Choice__Group__2();

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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1361:1: rule__Choice__Group__1__Impl : ( ( rule__Choice__NameAssignment_1 )? ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1365:1: ( ( ( rule__Choice__NameAssignment_1 )? ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1366:1: ( ( rule__Choice__NameAssignment_1 )? )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1366:1: ( ( rule__Choice__NameAssignment_1 )? )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1367:1: ( rule__Choice__NameAssignment_1 )?
            {
             before(grammarAccess.getChoiceAccess().getNameAssignment_1()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1368:1: ( rule__Choice__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1368:2: rule__Choice__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl2691);
                    rule__Choice__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Choice__Group__2"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1378:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1382:1: ( rule__Choice__Group__2__Impl )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1383:2: rule__Choice__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__22722);
            rule__Choice__Group__2__Impl();

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
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1389:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__TextAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1393:1: ( ( ( rule__Choice__TextAssignment_2 ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1394:1: ( ( rule__Choice__TextAssignment_2 ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1394:1: ( ( rule__Choice__TextAssignment_2 ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1395:1: ( rule__Choice__TextAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getTextAssignment_2()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1396:1: ( rule__Choice__TextAssignment_2 )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1396:2: rule__Choice__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__Choice__TextAssignment_2_in_rule__Choice__Group__2__Impl2749);
            rule__Choice__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getTextAssignment_2()); 

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
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1413:1: rule__Survey__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1417:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1418:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1418:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1419:1: RULE_ID
            {
             before(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_12790); 
             after(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Survey__NameAssignment_1"


    // $ANTLR start "rule__Survey__TitleAssignment_2"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1428:1: rule__Survey__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Survey__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1432:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1433:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1433:1: ( RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1434:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_22821); 
             after(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Survey__TitleAssignment_2"


    // $ANTLR start "rule__Survey__PagesAssignment_3"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1443:1: rule__Survey__PagesAssignment_3 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1447:1: ( ( rulePage ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1448:1: ( rulePage )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1448:1: ( rulePage )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1449:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__Survey__PagesAssignment_32852);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Survey__PagesAssignment_3"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1458:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1462:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1463:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1463:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1464:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_12883); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1473:1: rule__Page__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1477:1: ( ( ruleQuestion ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1478:1: ( ruleQuestion )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1478:1: ( ruleQuestion )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1479:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_32914);
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


    // $ANTLR start "rule__Page__FollowUpsAssignment_4"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1488:1: rule__Page__FollowUpsAssignment_4 : ( ruleFollowUp ) ;
    public final void rule__Page__FollowUpsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1492:1: ( ( ruleFollowUp ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1493:1: ( ruleFollowUp )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1493:1: ( ruleFollowUp )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1494:1: ruleFollowUp
            {
             before(grammarAccess.getPageAccess().getFollowUpsFollowUpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFollowUp_in_rule__Page__FollowUpsAssignment_42945);
            ruleFollowUp();

            state._fsp--;

             after(grammarAccess.getPageAccess().getFollowUpsFollowUpParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Page__FollowUpsAssignment_4"


    // $ANTLR start "rule__FollowUp__GuardAssignment_0"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1503:1: rule__FollowUp__GuardAssignment_0 : ( ruleGuard ) ;
    public final void rule__FollowUp__GuardAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1507:1: ( ( ruleGuard ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1508:1: ( ruleGuard )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1508:1: ( ruleGuard )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1509:1: ruleGuard
            {
             before(grammarAccess.getFollowUpAccess().getGuardGuardParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleGuard_in_rule__FollowUp__GuardAssignment_02976);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getFollowUpAccess().getGuardGuardParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FollowUp__GuardAssignment_0"


    // $ANTLR start "rule__FollowUp__NextAssignment_2"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1518:1: rule__FollowUp__NextAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FollowUp__NextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1522:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1523:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1523:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1524:1: ( RULE_ID )
            {
             before(grammarAccess.getFollowUpAccess().getNextPageCrossReference_2_0()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1525:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1526:1: RULE_ID
            {
             before(grammarAccess.getFollowUpAccess().getNextPageIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FollowUp__NextAssignment_23011); 
             after(grammarAccess.getFollowUpAccess().getNextPageIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFollowUpAccess().getNextPageCrossReference_2_0()); 

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
    // $ANTLR end "rule__FollowUp__NextAssignment_2"


    // $ANTLR start "rule__Guard__QuestionAssignment_1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1537:1: rule__Guard__QuestionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Guard__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1541:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1542:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1542:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1543:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGuardAccess().getQuestionChoiceQuestionCrossReference_1_0()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1544:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1545:1: ruleQualifiedName
            {
             before(grammarAccess.getGuardAccess().getQuestionChoiceQuestionQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Guard__QuestionAssignment_13050);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getQuestionChoiceQuestionQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGuardAccess().getQuestionChoiceQuestionCrossReference_1_0()); 

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
    // $ANTLR end "rule__Guard__QuestionAssignment_1"


    // $ANTLR start "rule__Guard__AnswerAssignment_3"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1556:1: rule__Guard__AnswerAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Guard__AnswerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1560:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1561:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1561:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1562:1: ( RULE_ID )
            {
             before(grammarAccess.getGuardAccess().getAnswerChoiceCrossReference_3_0()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1563:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1564:1: RULE_ID
            {
             before(grammarAccess.getGuardAccess().getAnswerChoiceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Guard__AnswerAssignment_33089); 
             after(grammarAccess.getGuardAccess().getAnswerChoiceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGuardAccess().getAnswerChoiceCrossReference_3_0()); 

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
    // $ANTLR end "rule__Guard__AnswerAssignment_3"


    // $ANTLR start "rule__FreeTextQuestion__NameAssignment_1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1575:1: rule__FreeTextQuestion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FreeTextQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1579:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1580:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1580:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:1: RULE_ID
            {
             before(grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FreeTextQuestion__NameAssignment_13124); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1590:1: rule__FreeTextQuestion__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FreeTextQuestion__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1594:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1595:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1595:1: ( RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1596:1: RULE_STRING
            {
             before(grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FreeTextQuestion__TextAssignment_23155); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1605:1: rule__ChoiceQuestion__SingleAssignment_0 : ( ( 'single' ) ) ;
    public final void rule__ChoiceQuestion__SingleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1609:1: ( ( ( 'single' ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1610:1: ( ( 'single' ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1610:1: ( ( 'single' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1611:1: ( 'single' )
            {
             before(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1612:1: ( 'single' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1613:1: 'single'
            {
             before(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__ChoiceQuestion__SingleAssignment_03191); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1628:1: rule__ChoiceQuestion__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ChoiceQuestion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1632:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1633:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1633:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1634:1: RULE_ID
            {
             before(grammarAccess.getChoiceQuestionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChoiceQuestion__NameAssignment_23230); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1643:1: rule__ChoiceQuestion__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ChoiceQuestion__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1647:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1648:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1648:1: ( RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1649:1: RULE_STRING
            {
             before(grammarAccess.getChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChoiceQuestion__TextAssignment_33261); 
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
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1658:1: rule__ChoiceQuestion__ChoicesAssignment_5 : ( ruleChoice ) ;
    public final void rule__ChoiceQuestion__ChoicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1662:1: ( ( ruleChoice ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1663:1: ( ruleChoice )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1663:1: ( ruleChoice )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1664:1: ruleChoice
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__ChoiceQuestion__ChoicesAssignment_53292);
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


    // $ANTLR start "rule__Choice__FreetextAssignment_0"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1673:1: rule__Choice__FreetextAssignment_0 : ( ( 'text' ) ) ;
    public final void rule__Choice__FreetextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1677:1: ( ( ( 'text' ) ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1678:1: ( ( 'text' ) )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1678:1: ( ( 'text' ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1679:1: ( 'text' )
            {
             before(grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0()); 
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1680:1: ( 'text' )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1681:1: 'text'
            {
             before(grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Choice__FreetextAssignment_03328); 
             after(grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0()); 

            }

             after(grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0()); 

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
    // $ANTLR end "rule__Choice__FreetextAssignment_0"


    // $ANTLR start "rule__Choice__NameAssignment_1"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1696:1: rule__Choice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1700:1: ( ( RULE_ID ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1701:1: ( RULE_ID )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1701:1: ( RULE_ID )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1702:1: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_13367); 
             after(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Choice__NameAssignment_1"


    // $ANTLR start "rule__Choice__TextAssignment_2"
    // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1711:1: rule__Choice__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Choice__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1715:1: ( ( RULE_STRING ) )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1716:1: ( RULE_STRING )
            {
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1716:1: ( RULE_STRING )
            // ../org.eclipse.xtext.tutorial.survey.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1717:1: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_23398); 
             after(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Choice__TextAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowUp_in_entryRuleFollowUp181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowUp188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__0_in_ruleFollowUp214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeTextQuestion428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__0_in_ruleFreeTextQuestion454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_rule__Question__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_rule__Question__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__0657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__0660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__1719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__2779 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PagesAssignment_3_in_rule__Survey__Group__3__Impl866 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__0905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__0908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Page__Group__0__Impl936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__1967 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21027 = new BitSet(new long[]{0x000000000039C000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Page__Group__2__Impl1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31089 = new BitSet(new long[]{0x000000000039C000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl1119 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41150 = new BitSet(new long[]{0x000000000039C000L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__FollowUpsAssignment_4_in_rule__Page__Group__4__Impl1180 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Page__Group__5__Impl1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__0__Impl_in_rule__FollowUp__Group__01282 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__1_in_rule__FollowUp__Group__01285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__GuardAssignment_0_in_rule__FollowUp__Group__0__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__1__Impl_in_rule__FollowUp__Group__11343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__2_in_rule__FollowUp__Group__11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FollowUp__Group__1__Impl1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__2__Impl_in_rule__FollowUp__Group__21405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__NextAssignment_2_in_rule__FollowUp__Group__2__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__01468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__01471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Guard__Group__0__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__11530 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__11533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__QuestionAssignment_1_in_rule__Guard__Group__1__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__21590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__21593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Guard__Group__2__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__31652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__AnswerAssignment_3_in_rule__Guard__Group__3__Impl1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01717 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1803 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__0__Impl_in_rule__FreeTextQuestion__Group__01960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__1_in_rule__FreeTextQuestion__Group__01963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FreeTextQuestion__Group__0__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__1__Impl_in_rule__FreeTextQuestion__Group__12022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__2_in_rule__FreeTextQuestion__Group__12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__NameAssignment_1_in_rule__FreeTextQuestion__Group__1__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__2__Impl_in_rule__FreeTextQuestion__Group__22082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__TextAssignment_2_in_rule__FreeTextQuestion__Group__2__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__02145 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__02148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__SingleAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__12206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ChoiceQuestion__Group__1__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__22268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__22271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__NameAssignment_2_in_rule__ChoiceQuestion__Group__2__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__32328 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__32331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__TextAssignment_3_in_rule__ChoiceQuestion__Group__3__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__42388 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__5_in_rule__ChoiceQuestion__Group__42391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ChoiceQuestion__Group__4__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__5__Impl_in_rule__ChoiceQuestion__Group__52450 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__6_in_rule__ChoiceQuestion__Group__52453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl2482 = new BitSet(new long[]{0x0000000000080032L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl2494 = new BitSet(new long[]{0x0000000000080032L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__6__Impl_in_rule__ChoiceQuestion__Group__62527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ChoiceQuestion__Group__6__Impl2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__02600 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__02603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__12661 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__22722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__TextAssignment_2_in_rule__Choice__Group__2__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_12790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_22821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_32852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_12883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_32914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowUp_in_rule__Page__FollowUpsAssignment_42945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__FollowUp__GuardAssignment_02976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FollowUp__NextAssignment_23011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Guard__QuestionAssignment_13050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Guard__AnswerAssignment_33089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FreeTextQuestion__NameAssignment_13124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FreeTextQuestion__TextAssignment_23155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ChoiceQuestion__SingleAssignment_03191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChoiceQuestion__NameAssignment_23230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChoiceQuestion__TextAssignment_33261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__ChoiceQuestion__ChoicesAssignment_53292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Choice__FreetextAssignment_03328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_13367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_23398 = new BitSet(new long[]{0x0000000000000002L});

}