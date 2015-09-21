package no.hal.quiz.xtext.ui.contentassist.antlr.internal; 

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
import no.hal.quiz.xtext.services.XQuizGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXQuizParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_XML_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'yes'", "'true'", "'no'", "'false'", "'-'", "'x'", "'/'", "'quiz'", "'.'", "'part'", "'ref'", "'+-'", "'('", "')'", "'['", "']'", "'<<'", "'>>'", "'?'", "'='", "'~'", "'v'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_XML_TEXT=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXQuizParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXQuizParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXQuizParser.tokenNames; }
    public String getGrammarFileName() { return "../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g"; }


     
     	private XQuizGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XQuizGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleQuiz"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:60:1: entryRuleQuiz : ruleQuiz EOF ;
    public final void entryRuleQuiz() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:61:1: ( ruleQuiz EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:62:1: ruleQuiz EOF
            {
             before(grammarAccess.getQuizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuiz_in_entryRuleQuiz61);
            ruleQuiz();

            state._fsp--;

             after(grammarAccess.getQuizRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuiz68); 

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
    // $ANTLR end "entryRuleQuiz"


    // $ANTLR start "ruleQuiz"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:69:1: ruleQuiz : ( ( rule__Quiz__Group__0 ) ) ;
    public final void ruleQuiz() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:73:2: ( ( ( rule__Quiz__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:74:1: ( ( rule__Quiz__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:74:1: ( ( rule__Quiz__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:75:1: ( rule__Quiz__Group__0 )
            {
             before(grammarAccess.getQuizAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:76:1: ( rule__Quiz__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:76:2: rule__Quiz__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group__0_in_ruleQuiz94);
            rule__Quiz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getGroup()); 

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
    // $ANTLR end "ruleQuiz"


    // $ANTLR start "entryRuleQName"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:88:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:89:1: ( ruleQName EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:90:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_entryRuleQName121);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQName128); 

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:97:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:101:2: ( ( ( rule__QName__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:102:1: ( ( rule__QName__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:102:1: ( ( rule__QName__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:103:1: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:104:1: ( rule__QName__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:104:2: rule__QName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__0_in_ruleQName154);
            rule__QName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleAbstractQuizPart"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:116:1: entryRuleAbstractQuizPart : ruleAbstractQuizPart EOF ;
    public final void entryRuleAbstractQuizPart() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:117:1: ( ruleAbstractQuizPart EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:118:1: ruleAbstractQuizPart EOF
            {
             before(grammarAccess.getAbstractQuizPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractQuizPart_in_entryRuleAbstractQuizPart181);
            ruleAbstractQuizPart();

            state._fsp--;

             after(grammarAccess.getAbstractQuizPartRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractQuizPart188); 

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
    // $ANTLR end "entryRuleAbstractQuizPart"


    // $ANTLR start "ruleAbstractQuizPart"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:125:1: ruleAbstractQuizPart : ( ( rule__AbstractQuizPart__Alternatives ) ) ;
    public final void ruleAbstractQuizPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:129:2: ( ( ( rule__AbstractQuizPart__Alternatives ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:130:1: ( ( rule__AbstractQuizPart__Alternatives ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:130:1: ( ( rule__AbstractQuizPart__Alternatives ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:131:1: ( rule__AbstractQuizPart__Alternatives )
            {
             before(grammarAccess.getAbstractQuizPartAccess().getAlternatives()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:132:1: ( rule__AbstractQuizPart__Alternatives )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:132:2: rule__AbstractQuizPart__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractQuizPart__Alternatives_in_ruleAbstractQuizPart214);
            rule__AbstractQuizPart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractQuizPartAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractQuizPart"


    // $ANTLR start "entryRuleQuizPart"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:144:1: entryRuleQuizPart : ruleQuizPart EOF ;
    public final void entryRuleQuizPart() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:145:1: ( ruleQuizPart EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:146:1: ruleQuizPart EOF
            {
             before(grammarAccess.getQuizPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuizPart_in_entryRuleQuizPart241);
            ruleQuizPart();

            state._fsp--;

             after(grammarAccess.getQuizPartRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuizPart248); 

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
    // $ANTLR end "entryRuleQuizPart"


    // $ANTLR start "ruleQuizPart"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:153:1: ruleQuizPart : ( ( rule__QuizPart__Group__0 ) ) ;
    public final void ruleQuizPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:157:2: ( ( ( rule__QuizPart__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:158:1: ( ( rule__QuizPart__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:158:1: ( ( rule__QuizPart__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:159:1: ( rule__QuizPart__Group__0 )
            {
             before(grammarAccess.getQuizPartAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:160:1: ( rule__QuizPart__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:160:2: rule__QuizPart__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__Group__0_in_ruleQuizPart274);
            rule__QuizPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuizPartAccess().getGroup()); 

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
    // $ANTLR end "ruleQuizPart"


    // $ANTLR start "entryRuleQuizPartRef"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:172:1: entryRuleQuizPartRef : ruleQuizPartRef EOF ;
    public final void entryRuleQuizPartRef() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:173:1: ( ruleQuizPartRef EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:174:1: ruleQuizPartRef EOF
            {
             before(grammarAccess.getQuizPartRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuizPartRef_in_entryRuleQuizPartRef301);
            ruleQuizPartRef();

            state._fsp--;

             after(grammarAccess.getQuizPartRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuizPartRef308); 

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
    // $ANTLR end "entryRuleQuizPartRef"


    // $ANTLR start "ruleQuizPartRef"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:181:1: ruleQuizPartRef : ( ( rule__QuizPartRef__Group__0 ) ) ;
    public final void ruleQuizPartRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:185:2: ( ( ( rule__QuizPartRef__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:186:1: ( ( rule__QuizPartRef__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:186:1: ( ( rule__QuizPartRef__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:187:1: ( rule__QuizPartRef__Group__0 )
            {
             before(grammarAccess.getQuizPartRefAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:188:1: ( rule__QuizPartRef__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:188:2: rule__QuizPartRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPartRef__Group__0_in_ruleQuizPartRef334);
            rule__QuizPartRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuizPartRefAccess().getGroup()); 

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
    // $ANTLR end "ruleQuizPartRef"


    // $ANTLR start "entryRuleAnonymousQuizPart"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:200:1: entryRuleAnonymousQuizPart : ruleAnonymousQuizPart EOF ;
    public final void entryRuleAnonymousQuizPart() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:201:1: ( ruleAnonymousQuizPart EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:202:1: ruleAnonymousQuizPart EOF
            {
             before(grammarAccess.getAnonymousQuizPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnonymousQuizPart_in_entryRuleAnonymousQuizPart361);
            ruleAnonymousQuizPart();

            state._fsp--;

             after(grammarAccess.getAnonymousQuizPartRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnonymousQuizPart368); 

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
    // $ANTLR end "entryRuleAnonymousQuizPart"


    // $ANTLR start "ruleAnonymousQuizPart"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:209:1: ruleAnonymousQuizPart : ( ( rule__AnonymousQuizPart__Group__0 ) ) ;
    public final void ruleAnonymousQuizPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:213:2: ( ( ( rule__AnonymousQuizPart__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:214:1: ( ( rule__AnonymousQuizPart__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:214:1: ( ( rule__AnonymousQuizPart__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:215:1: ( rule__AnonymousQuizPart__Group__0 )
            {
             before(grammarAccess.getAnonymousQuizPartAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:216:1: ( rule__AnonymousQuizPart__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:216:2: rule__AnonymousQuizPart__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnonymousQuizPart__Group__0_in_ruleAnonymousQuizPart394);
            rule__AnonymousQuizPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousQuizPartAccess().getGroup()); 

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
    // $ANTLR end "ruleAnonymousQuizPart"


    // $ANTLR start "entryRuleAbstractQA"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:228:1: entryRuleAbstractQA : ruleAbstractQA EOF ;
    public final void entryRuleAbstractQA() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:229:1: ( ruleAbstractQA EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:230:1: ruleAbstractQA EOF
            {
             before(grammarAccess.getAbstractQARule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractQA_in_entryRuleAbstractQA421);
            ruleAbstractQA();

            state._fsp--;

             after(grammarAccess.getAbstractQARule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractQA428); 

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
    // $ANTLR end "entryRuleAbstractQA"


    // $ANTLR start "ruleAbstractQA"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:237:1: ruleAbstractQA : ( ( rule__AbstractQA__Alternatives ) ) ;
    public final void ruleAbstractQA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:241:2: ( ( ( rule__AbstractQA__Alternatives ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:242:1: ( ( rule__AbstractQA__Alternatives ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:242:1: ( ( rule__AbstractQA__Alternatives ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:243:1: ( rule__AbstractQA__Alternatives )
            {
             before(grammarAccess.getAbstractQAAccess().getAlternatives()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:244:1: ( rule__AbstractQA__Alternatives )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:244:2: rule__AbstractQA__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AbstractQA__Alternatives_in_ruleAbstractQA454);
            rule__AbstractQA__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractQAAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractQA"


    // $ANTLR start "entryRuleQARef"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:256:1: entryRuleQARef : ruleQARef EOF ;
    public final void entryRuleQARef() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:257:1: ( ruleQARef EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:258:1: ruleQARef EOF
            {
             before(grammarAccess.getQARefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQARef_in_entryRuleQARef481);
            ruleQARef();

            state._fsp--;

             after(grammarAccess.getQARefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQARef488); 

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
    // $ANTLR end "entryRuleQARef"


    // $ANTLR start "ruleQARef"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:265:1: ruleQARef : ( ( rule__QARef__Group__0 ) ) ;
    public final void ruleQARef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:269:2: ( ( ( rule__QARef__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:270:1: ( ( rule__QARef__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:270:1: ( ( rule__QARef__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:271:1: ( rule__QARef__Group__0 )
            {
             before(grammarAccess.getQARefAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:272:1: ( rule__QARef__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:272:2: rule__QARef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QARef__Group__0_in_ruleQARef514);
            rule__QARef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQARefAccess().getGroup()); 

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
    // $ANTLR end "ruleQARef"


    // $ANTLR start "entryRuleQA"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:284:1: entryRuleQA : ruleQA EOF ;
    public final void entryRuleQA() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:285:1: ( ruleQA EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:286:1: ruleQA EOF
            {
             before(grammarAccess.getQARule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQA_in_entryRuleQA541);
            ruleQA();

            state._fsp--;

             after(grammarAccess.getQARule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQA548); 

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
    // $ANTLR end "entryRuleQA"


    // $ANTLR start "ruleQA"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:293:1: ruleQA : ( ( rule__QA__Group__0 ) ) ;
    public final void ruleQA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:297:2: ( ( ( rule__QA__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:298:1: ( ( rule__QA__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:298:1: ( ( rule__QA__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:299:1: ( rule__QA__Group__0 )
            {
             before(grammarAccess.getQAAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:300:1: ( rule__QA__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:300:2: rule__QA__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QA__Group__0_in_ruleQA574);
            rule__QA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQAAccess().getGroup()); 

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
    // $ANTLR end "ruleQA"


    // $ANTLR start "entryRuleQuestion"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:312:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:313:1: ( ruleQuestion EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:314:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion601);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion608); 

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
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:321:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:325:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:326:1: ( ( rule__Question__Alternatives ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:326:1: ( ( rule__Question__Alternatives ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:327:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:328:1: ( rule__Question__Alternatives )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:328:2: rule__Question__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Alternatives_in_ruleQuestion634);
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


    // $ANTLR start "entryRuleStringQuestion"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:340:1: entryRuleStringQuestion : ruleStringQuestion EOF ;
    public final void entryRuleStringQuestion() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:341:1: ( ruleStringQuestion EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:342:1: ruleStringQuestion EOF
            {
             before(grammarAccess.getStringQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringQuestion_in_entryRuleStringQuestion661);
            ruleStringQuestion();

            state._fsp--;

             after(grammarAccess.getStringQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringQuestion668); 

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
    // $ANTLR end "entryRuleStringQuestion"


    // $ANTLR start "ruleStringQuestion"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:349:1: ruleStringQuestion : ( ( rule__StringQuestion__QuestionAssignment ) ) ;
    public final void ruleStringQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:353:2: ( ( ( rule__StringQuestion__QuestionAssignment ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:354:1: ( ( rule__StringQuestion__QuestionAssignment ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:354:1: ( ( rule__StringQuestion__QuestionAssignment ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:355:1: ( rule__StringQuestion__QuestionAssignment )
            {
             before(grammarAccess.getStringQuestionAccess().getQuestionAssignment()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:356:1: ( rule__StringQuestion__QuestionAssignment )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:356:2: rule__StringQuestion__QuestionAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringQuestion__QuestionAssignment_in_ruleStringQuestion694);
            rule__StringQuestion__QuestionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringQuestionAccess().getQuestionAssignment()); 

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
    // $ANTLR end "ruleStringQuestion"


    // $ANTLR start "entryRuleXmlQuestion"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:368:1: entryRuleXmlQuestion : ruleXmlQuestion EOF ;
    public final void entryRuleXmlQuestion() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:369:1: ( ruleXmlQuestion EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:370:1: ruleXmlQuestion EOF
            {
             before(grammarAccess.getXmlQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlQuestion_in_entryRuleXmlQuestion721);
            ruleXmlQuestion();

            state._fsp--;

             after(grammarAccess.getXmlQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlQuestion728); 

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
    // $ANTLR end "entryRuleXmlQuestion"


    // $ANTLR start "ruleXmlQuestion"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:377:1: ruleXmlQuestion : ( ( rule__XmlQuestion__XmlAssignment ) ) ;
    public final void ruleXmlQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:381:2: ( ( ( rule__XmlQuestion__XmlAssignment ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:382:1: ( ( rule__XmlQuestion__XmlAssignment ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:382:1: ( ( rule__XmlQuestion__XmlAssignment ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:383:1: ( rule__XmlQuestion__XmlAssignment )
            {
             before(grammarAccess.getXmlQuestionAccess().getXmlAssignment()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:384:1: ( rule__XmlQuestion__XmlAssignment )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:384:2: rule__XmlQuestion__XmlAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlQuestion__XmlAssignment_in_ruleXmlQuestion754);
            rule__XmlQuestion__XmlAssignment();

            state._fsp--;


            }

             after(grammarAccess.getXmlQuestionAccess().getXmlAssignment()); 

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
    // $ANTLR end "ruleXmlQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:396:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:397:1: ( ruleAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:398:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer781);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer788); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:405:1: ruleAnswer : ( ( rule__Answer__Alternatives ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:409:2: ( ( ( rule__Answer__Alternatives ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:410:1: ( ( rule__Answer__Alternatives ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:410:1: ( ( rule__Answer__Alternatives ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:411:1: ( rule__Answer__Alternatives )
            {
             before(grammarAccess.getAnswerAccess().getAlternatives()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:412:1: ( rule__Answer__Alternatives )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:412:2: rule__Answer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Alternatives_in_ruleAnswer814);
            rule__Answer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleOptionAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:424:1: entryRuleOptionAnswer : ruleOptionAnswer EOF ;
    public final void entryRuleOptionAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:425:1: ( ruleOptionAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:426:1: ruleOptionAnswer EOF
            {
             before(grammarAccess.getOptionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer841);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getOptionAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionAnswer848); 

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
    // $ANTLR end "entryRuleOptionAnswer"


    // $ANTLR start "ruleOptionAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:433:1: ruleOptionAnswer : ( ( rule__OptionAnswer__Alternatives ) ) ;
    public final void ruleOptionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:437:2: ( ( ( rule__OptionAnswer__Alternatives ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:438:1: ( ( rule__OptionAnswer__Alternatives ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:438:1: ( ( rule__OptionAnswer__Alternatives ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:439:1: ( rule__OptionAnswer__Alternatives )
            {
             before(grammarAccess.getOptionAnswerAccess().getAlternatives()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:440:1: ( rule__OptionAnswer__Alternatives )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:440:2: rule__OptionAnswer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__Alternatives_in_ruleOptionAnswer874);
            rule__OptionAnswer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOptionAnswer"


    // $ANTLR start "entryRuleSimpleAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:452:1: entryRuleSimpleAnswer : ruleSimpleAnswer EOF ;
    public final void entryRuleSimpleAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:453:1: ( ruleSimpleAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:454:1: ruleSimpleAnswer EOF
            {
             before(grammarAccess.getSimpleAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer901);
            ruleSimpleAnswer();

            state._fsp--;

             after(grammarAccess.getSimpleAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAnswer908); 

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
    // $ANTLR end "entryRuleSimpleAnswer"


    // $ANTLR start "ruleSimpleAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:461:1: ruleSimpleAnswer : ( ( rule__SimpleAnswer__Alternatives ) ) ;
    public final void ruleSimpleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:465:2: ( ( ( rule__SimpleAnswer__Alternatives ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:466:1: ( ( rule__SimpleAnswer__Alternatives ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:466:1: ( ( rule__SimpleAnswer__Alternatives ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:467:1: ( rule__SimpleAnswer__Alternatives )
            {
             before(grammarAccess.getSimpleAnswerAccess().getAlternatives()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:468:1: ( rule__SimpleAnswer__Alternatives )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:468:2: rule__SimpleAnswer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAnswer__Alternatives_in_ruleSimpleAnswer934);
            rule__SimpleAnswer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSimpleAnswer"


    // $ANTLR start "entryRuleStringAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:480:1: entryRuleStringAnswer : ruleStringAnswer EOF ;
    public final void entryRuleStringAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:481:1: ( ruleStringAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:482:1: ruleStringAnswer EOF
            {
             before(grammarAccess.getStringAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringAnswer_in_entryRuleStringAnswer961);
            ruleStringAnswer();

            state._fsp--;

             after(grammarAccess.getStringAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringAnswer968); 

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
    // $ANTLR end "entryRuleStringAnswer"


    // $ANTLR start "ruleStringAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:489:1: ruleStringAnswer : ( ( rule__StringAnswer__Group__0 ) ) ;
    public final void ruleStringAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:493:2: ( ( ( rule__StringAnswer__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:494:1: ( ( rule__StringAnswer__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:494:1: ( ( rule__StringAnswer__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:495:1: ( rule__StringAnswer__Group__0 )
            {
             before(grammarAccess.getStringAnswerAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:496:1: ( rule__StringAnswer__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:496:2: rule__StringAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringAnswer__Group__0_in_ruleStringAnswer994);
            rule__StringAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleStringAnswer"


    // $ANTLR start "entryRuleRegexAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:508:1: entryRuleRegexAnswer : ruleRegexAnswer EOF ;
    public final void entryRuleRegexAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:509:1: ( ruleRegexAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:510:1: ruleRegexAnswer EOF
            {
             before(grammarAccess.getRegexAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegexAnswer_in_entryRuleRegexAnswer1021);
            ruleRegexAnswer();

            state._fsp--;

             after(grammarAccess.getRegexAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegexAnswer1028); 

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
    // $ANTLR end "entryRuleRegexAnswer"


    // $ANTLR start "ruleRegexAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:517:1: ruleRegexAnswer : ( ( rule__RegexAnswer__Group__0 ) ) ;
    public final void ruleRegexAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:521:2: ( ( ( rule__RegexAnswer__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:522:1: ( ( rule__RegexAnswer__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:522:1: ( ( rule__RegexAnswer__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:523:1: ( rule__RegexAnswer__Group__0 )
            {
             before(grammarAccess.getRegexAnswerAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:524:1: ( rule__RegexAnswer__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:524:2: rule__RegexAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__Group__0_in_ruleRegexAnswer1054);
            rule__RegexAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegexAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleRegexAnswer"


    // $ANTLR start "entryRuleNumberAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:536:1: entryRuleNumberAnswer : ruleNumberAnswer EOF ;
    public final void entryRuleNumberAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:537:1: ( ruleNumberAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:538:1: ruleNumberAnswer EOF
            {
             before(grammarAccess.getNumberAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer1081);
            ruleNumberAnswer();

            state._fsp--;

             after(grammarAccess.getNumberAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberAnswer1088); 

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
    // $ANTLR end "entryRuleNumberAnswer"


    // $ANTLR start "ruleNumberAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:545:1: ruleNumberAnswer : ( ( rule__NumberAnswer__Group__0 ) ) ;
    public final void ruleNumberAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:549:2: ( ( ( rule__NumberAnswer__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:550:1: ( ( rule__NumberAnswer__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:550:1: ( ( rule__NumberAnswer__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:551:1: ( rule__NumberAnswer__Group__0 )
            {
             before(grammarAccess.getNumberAnswerAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:552:1: ( rule__NumberAnswer__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:552:2: rule__NumberAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group__0_in_ruleNumberAnswer1114);
            rule__NumberAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleNumberAnswer"


    // $ANTLR start "entryRuleEDoubleObject"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:564:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:565:1: ( ruleEDoubleObject EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:566:1: ruleEDoubleObject EOF
            {
             before(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDoubleObject_in_entryRuleEDoubleObject1141);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getEDoubleObjectRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDoubleObject1148); 

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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:573:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Group__0 ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:577:2: ( ( ( rule__EDoubleObject__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:578:1: ( ( rule__EDoubleObject__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:578:1: ( ( rule__EDoubleObject__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:579:1: ( rule__EDoubleObject__Group__0 )
            {
             before(grammarAccess.getEDoubleObjectAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:580:1: ( rule__EDoubleObject__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:580:2: rule__EDoubleObject__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDoubleObject__Group__0_in_ruleEDoubleObject1174);
            rule__EDoubleObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleBooleanAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:592:1: entryRuleBooleanAnswer : ruleBooleanAnswer EOF ;
    public final void entryRuleBooleanAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:593:1: ( ruleBooleanAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:594:1: ruleBooleanAnswer EOF
            {
             before(grammarAccess.getBooleanAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanAnswer_in_entryRuleBooleanAnswer1201);
            ruleBooleanAnswer();

            state._fsp--;

             after(grammarAccess.getBooleanAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanAnswer1208); 

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
    // $ANTLR end "entryRuleBooleanAnswer"


    // $ANTLR start "ruleBooleanAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:601:1: ruleBooleanAnswer : ( ( rule__BooleanAnswer__Group__0 ) ) ;
    public final void ruleBooleanAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:605:2: ( ( ( rule__BooleanAnswer__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:606:1: ( ( rule__BooleanAnswer__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:606:1: ( ( rule__BooleanAnswer__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:607:1: ( rule__BooleanAnswer__Group__0 )
            {
             before(grammarAccess.getBooleanAnswerAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:608:1: ( rule__BooleanAnswer__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:608:2: rule__BooleanAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAnswer__Group__0_in_ruleBooleanAnswer1234);
            rule__BooleanAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanAnswer"


    // $ANTLR start "entryRuleXmlAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:620:1: entryRuleXmlAnswer : ruleXmlAnswer EOF ;
    public final void entryRuleXmlAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:621:1: ( ruleXmlAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:622:1: ruleXmlAnswer EOF
            {
             before(grammarAccess.getXmlAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlAnswer_in_entryRuleXmlAnswer1261);
            ruleXmlAnswer();

            state._fsp--;

             after(grammarAccess.getXmlAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlAnswer1268); 

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
    // $ANTLR end "entryRuleXmlAnswer"


    // $ANTLR start "ruleXmlAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:629:1: ruleXmlAnswer : ( ( rule__XmlAnswer__XmlAssignment ) ) ;
    public final void ruleXmlAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:633:2: ( ( ( rule__XmlAnswer__XmlAssignment ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:634:1: ( ( rule__XmlAnswer__XmlAssignment ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:634:1: ( ( rule__XmlAnswer__XmlAssignment ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:635:1: ( rule__XmlAnswer__XmlAssignment )
            {
             before(grammarAccess.getXmlAnswerAccess().getXmlAssignment()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:636:1: ( rule__XmlAnswer__XmlAssignment )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:636:2: rule__XmlAnswer__XmlAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlAnswer__XmlAssignment_in_ruleXmlAnswer1294);
            rule__XmlAnswer__XmlAssignment();

            state._fsp--;


            }

             after(grammarAccess.getXmlAnswerAccess().getXmlAssignment()); 

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
    // $ANTLR end "ruleXmlAnswer"


    // $ANTLR start "entryRuleOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:648:1: entryRuleOptionsAnswer : ruleOptionsAnswer EOF ;
    public final void entryRuleOptionsAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:649:1: ( ruleOptionsAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:650:1: ruleOptionsAnswer EOF
            {
             before(grammarAccess.getOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionsAnswer_in_entryRuleOptionsAnswer1321);
            ruleOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getOptionsAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionsAnswer1328); 

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
    // $ANTLR end "entryRuleOptionsAnswer"


    // $ANTLR start "ruleOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:657:1: ruleOptionsAnswer : ( ( rule__OptionsAnswer__Alternatives ) ) ;
    public final void ruleOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:661:2: ( ( ( rule__OptionsAnswer__Alternatives ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:662:1: ( ( rule__OptionsAnswer__Alternatives ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:662:1: ( ( rule__OptionsAnswer__Alternatives ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:663:1: ( rule__OptionsAnswer__Alternatives )
            {
             before(grammarAccess.getOptionsAnswerAccess().getAlternatives()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:664:1: ( rule__OptionsAnswer__Alternatives )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:664:2: rule__OptionsAnswer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionsAnswer__Alternatives_in_ruleOptionsAnswer1354);
            rule__OptionsAnswer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOptionsAnswer"


    // $ANTLR start "entryRuleSingleOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:676:1: entryRuleSingleOptionsAnswer : ruleSingleOptionsAnswer EOF ;
    public final void entryRuleSingleOptionsAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:677:1: ( ruleSingleOptionsAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:678:1: ruleSingleOptionsAnswer EOF
            {
             before(grammarAccess.getSingleOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleOptionsAnswer_in_entryRuleSingleOptionsAnswer1381);
            ruleSingleOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getSingleOptionsAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleOptionsAnswer1388); 

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
    // $ANTLR end "entryRuleSingleOptionsAnswer"


    // $ANTLR start "ruleSingleOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:685:1: ruleSingleOptionsAnswer : ( ( rule__SingleOptionsAnswer__Alternatives ) ) ;
    public final void ruleSingleOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:689:2: ( ( ( rule__SingleOptionsAnswer__Alternatives ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:690:1: ( ( rule__SingleOptionsAnswer__Alternatives ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:690:1: ( ( rule__SingleOptionsAnswer__Alternatives ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:691:1: ( rule__SingleOptionsAnswer__Alternatives )
            {
             before(grammarAccess.getSingleOptionsAnswerAccess().getAlternatives()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:692:1: ( rule__SingleOptionsAnswer__Alternatives )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:692:2: rule__SingleOptionsAnswer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleOptionsAnswer__Alternatives_in_ruleSingleOptionsAnswer1414);
            rule__SingleOptionsAnswer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingleOptionsAnswerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSingleOptionsAnswer"


    // $ANTLR start "entryRuleSingleBoxOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:704:1: entryRuleSingleBoxOptionsAnswer : ruleSingleBoxOptionsAnswer EOF ;
    public final void entryRuleSingleBoxOptionsAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:705:1: ( ruleSingleBoxOptionsAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:706:1: ruleSingleBoxOptionsAnswer EOF
            {
             before(grammarAccess.getSingleBoxOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOptionsAnswer_in_entryRuleSingleBoxOptionsAnswer1441);
            ruleSingleBoxOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getSingleBoxOptionsAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleBoxOptionsAnswer1448); 

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
    // $ANTLR end "entryRuleSingleBoxOptionsAnswer"


    // $ANTLR start "ruleSingleBoxOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:713:1: ruleSingleBoxOptionsAnswer : ( ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* ) ) ;
    public final void ruleSingleBoxOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:717:2: ( ( ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:718:1: ( ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:718:1: ( ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:719:1: ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:719:1: ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:720:1: ( rule__SingleBoxOptionsAnswer__OptionsAssignment )
            {
             before(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsAssignment()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:721:1: ( rule__SingleBoxOptionsAnswer__OptionsAssignment )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:721:2: rule__SingleBoxOptionsAnswer__OptionsAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOptionsAnswer__OptionsAssignment_in_ruleSingleBoxOptionsAnswer1476);
            rule__SingleBoxOptionsAnswer__OptionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsAssignment()); 

            }

            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:724:1: ( ( rule__SingleBoxOptionsAnswer__OptionsAssignment )* )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:725:1: ( rule__SingleBoxOptionsAnswer__OptionsAssignment )*
            {
             before(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsAssignment()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:726:1: ( rule__SingleBoxOptionsAnswer__OptionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:726:2: rule__SingleBoxOptionsAnswer__OptionsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOptionsAnswer__OptionsAssignment_in_ruleSingleBoxOptionsAnswer1488);
            	    rule__SingleBoxOptionsAnswer__OptionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsAssignment()); 

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
    // $ANTLR end "ruleSingleBoxOptionsAnswer"


    // $ANTLR start "entryRuleSingleBoxOption"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:739:1: entryRuleSingleBoxOption : ruleSingleBoxOption EOF ;
    public final void entryRuleSingleBoxOption() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:740:1: ( ruleSingleBoxOption EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:741:1: ruleSingleBoxOption EOF
            {
             before(grammarAccess.getSingleBoxOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOption_in_entryRuleSingleBoxOption1518);
            ruleSingleBoxOption();

            state._fsp--;

             after(grammarAccess.getSingleBoxOptionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleBoxOption1525); 

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
    // $ANTLR end "entryRuleSingleBoxOption"


    // $ANTLR start "ruleSingleBoxOption"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:748:1: ruleSingleBoxOption : ( ( rule__SingleBoxOption__Group__0 ) ) ;
    public final void ruleSingleBoxOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:752:2: ( ( ( rule__SingleBoxOption__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:753:1: ( ( rule__SingleBoxOption__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:753:1: ( ( rule__SingleBoxOption__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:754:1: ( rule__SingleBoxOption__Group__0 )
            {
             before(grammarAccess.getSingleBoxOptionAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:755:1: ( rule__SingleBoxOption__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:755:2: rule__SingleBoxOption__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__Group__0_in_ruleSingleBoxOption1551);
            rule__SingleBoxOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleBoxOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleBoxOption"


    // $ANTLR start "entryRuleSingleListOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:767:1: entryRuleSingleListOptionsAnswer : ruleSingleListOptionsAnswer EOF ;
    public final void entryRuleSingleListOptionsAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:768:1: ( ruleSingleListOptionsAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:769:1: ruleSingleListOptionsAnswer EOF
            {
             before(grammarAccess.getSingleListOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleListOptionsAnswer_in_entryRuleSingleListOptionsAnswer1578);
            ruleSingleListOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getSingleListOptionsAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleListOptionsAnswer1585); 

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
    // $ANTLR end "entryRuleSingleListOptionsAnswer"


    // $ANTLR start "ruleSingleListOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:776:1: ruleSingleListOptionsAnswer : ( ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* ) ) ;
    public final void ruleSingleListOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:780:2: ( ( ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:781:1: ( ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:781:1: ( ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:782:1: ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) ) ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:782:1: ( ( rule__SingleListOptionsAnswer__OptionsAssignment ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:783:1: ( rule__SingleListOptionsAnswer__OptionsAssignment )
            {
             before(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsAssignment()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:784:1: ( rule__SingleListOptionsAnswer__OptionsAssignment )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:784:2: rule__SingleListOptionsAnswer__OptionsAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleListOptionsAnswer__OptionsAssignment_in_ruleSingleListOptionsAnswer1613);
            rule__SingleListOptionsAnswer__OptionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsAssignment()); 

            }

            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:787:1: ( ( rule__SingleListOptionsAnswer__OptionsAssignment )* )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:788:1: ( rule__SingleListOptionsAnswer__OptionsAssignment )*
            {
             before(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsAssignment()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:789:1: ( rule__SingleListOptionsAnswer__OptionsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=17)||LA2_0==33) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:789:2: rule__SingleListOptionsAnswer__OptionsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SingleListOptionsAnswer__OptionsAssignment_in_ruleSingleListOptionsAnswer1625);
            	    rule__SingleListOptionsAnswer__OptionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsAssignment()); 

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
    // $ANTLR end "ruleSingleListOptionsAnswer"


    // $ANTLR start "entryRuleSingleListOption"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:802:1: entryRuleSingleListOption : ruleSingleListOption EOF ;
    public final void entryRuleSingleListOption() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:803:1: ( ruleSingleListOption EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:804:1: ruleSingleListOption EOF
            {
             before(grammarAccess.getSingleListOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleListOption_in_entryRuleSingleListOption1655);
            ruleSingleListOption();

            state._fsp--;

             after(grammarAccess.getSingleListOptionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleListOption1662); 

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
    // $ANTLR end "entryRuleSingleListOption"


    // $ANTLR start "ruleSingleListOption"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:811:1: ruleSingleListOption : ( ( rule__SingleListOption__Group__0 ) ) ;
    public final void ruleSingleListOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:815:2: ( ( ( rule__SingleListOption__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:816:1: ( ( rule__SingleListOption__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:816:1: ( ( rule__SingleListOption__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:817:1: ( rule__SingleListOption__Group__0 )
            {
             before(grammarAccess.getSingleListOptionAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:818:1: ( rule__SingleListOption__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:818:2: rule__SingleListOption__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleListOption__Group__0_in_ruleSingleListOption1688);
            rule__SingleListOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleListOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleListOption"


    // $ANTLR start "entryRuleManyOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:830:1: entryRuleManyOptionsAnswer : ruleManyOptionsAnswer EOF ;
    public final void entryRuleManyOptionsAnswer() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:831:1: ( ruleManyOptionsAnswer EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:832:1: ruleManyOptionsAnswer EOF
            {
             before(grammarAccess.getManyOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManyOptionsAnswer_in_entryRuleManyOptionsAnswer1715);
            ruleManyOptionsAnswer();

            state._fsp--;

             after(grammarAccess.getManyOptionsAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManyOptionsAnswer1722); 

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
    // $ANTLR end "entryRuleManyOptionsAnswer"


    // $ANTLR start "ruleManyOptionsAnswer"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:839:1: ruleManyOptionsAnswer : ( ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* ) ) ;
    public final void ruleManyOptionsAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:843:2: ( ( ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:844:1: ( ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:844:1: ( ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:845:1: ( ( rule__ManyOptionsAnswer__OptionsAssignment ) ) ( ( rule__ManyOptionsAnswer__OptionsAssignment )* )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:845:1: ( ( rule__ManyOptionsAnswer__OptionsAssignment ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:846:1: ( rule__ManyOptionsAnswer__OptionsAssignment )
            {
             before(grammarAccess.getManyOptionsAnswerAccess().getOptionsAssignment()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:847:1: ( rule__ManyOptionsAnswer__OptionsAssignment )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:847:2: rule__ManyOptionsAnswer__OptionsAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ManyOptionsAnswer__OptionsAssignment_in_ruleManyOptionsAnswer1750);
            rule__ManyOptionsAnswer__OptionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getManyOptionsAnswerAccess().getOptionsAssignment()); 

            }

            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:850:1: ( ( rule__ManyOptionsAnswer__OptionsAssignment )* )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:851:1: ( rule__ManyOptionsAnswer__OptionsAssignment )*
            {
             before(grammarAccess.getManyOptionsAnswerAccess().getOptionsAssignment()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:852:1: ( rule__ManyOptionsAnswer__OptionsAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:852:2: rule__ManyOptionsAnswer__OptionsAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ManyOptionsAnswer__OptionsAssignment_in_ruleManyOptionsAnswer1762);
            	    rule__ManyOptionsAnswer__OptionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getManyOptionsAnswerAccess().getOptionsAssignment()); 

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
    // $ANTLR end "ruleManyOptionsAnswer"


    // $ANTLR start "entryRuleManyOption"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:865:1: entryRuleManyOption : ruleManyOption EOF ;
    public final void entryRuleManyOption() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:866:1: ( ruleManyOption EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:867:1: ruleManyOption EOF
            {
             before(grammarAccess.getManyOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManyOption_in_entryRuleManyOption1792);
            ruleManyOption();

            state._fsp--;

             after(grammarAccess.getManyOptionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManyOption1799); 

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
    // $ANTLR end "entryRuleManyOption"


    // $ANTLR start "ruleManyOption"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:874:1: ruleManyOption : ( ( rule__ManyOption__Group__0 ) ) ;
    public final void ruleManyOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:878:2: ( ( ( rule__ManyOption__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:879:1: ( ( rule__ManyOption__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:879:1: ( ( rule__ManyOption__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:880:1: ( rule__ManyOption__Group__0 )
            {
             before(grammarAccess.getManyOptionAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:881:1: ( rule__ManyOption__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:881:2: rule__ManyOption__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ManyOption__Group__0_in_ruleManyOption1825);
            rule__ManyOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManyOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleManyOption"


    // $ANTLR start "entryRuleXml"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:893:1: entryRuleXml : ruleXml EOF ;
    public final void entryRuleXml() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:894:1: ( ruleXml EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:895:1: ruleXml EOF
            {
             before(grammarAccess.getXmlRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXml_in_entryRuleXml1852);
            ruleXml();

            state._fsp--;

             after(grammarAccess.getXmlRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXml1859); 

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
    // $ANTLR end "entryRuleXml"


    // $ANTLR start "ruleXml"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:902:1: ruleXml : ( ( rule__Xml__Group__0 ) ) ;
    public final void ruleXml() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:906:2: ( ( ( rule__Xml__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:907:1: ( ( rule__Xml__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:907:1: ( ( rule__Xml__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:908:1: ( rule__Xml__Group__0 )
            {
             before(grammarAccess.getXmlAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:909:1: ( rule__Xml__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:909:2: rule__Xml__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Xml__Group__0_in_ruleXml1885);
            rule__Xml__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlAccess().getGroup()); 

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
    // $ANTLR end "ruleXml"


    // $ANTLR start "entryRuleXmlContents"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:921:1: entryRuleXmlContents : ruleXmlContents EOF ;
    public final void entryRuleXmlContents() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:922:1: ( ruleXmlContents EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:923:1: ruleXmlContents EOF
            {
             before(grammarAccess.getXmlContentsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlContents_in_entryRuleXmlContents1912);
            ruleXmlContents();

            state._fsp--;

             after(grammarAccess.getXmlContentsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlContents1919); 

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
    // $ANTLR end "entryRuleXmlContents"


    // $ANTLR start "ruleXmlContents"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:930:1: ruleXmlContents : ( ( rule__XmlContents__Group__0 ) ) ;
    public final void ruleXmlContents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:934:2: ( ( ( rule__XmlContents__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:935:1: ( ( rule__XmlContents__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:935:1: ( ( rule__XmlContents__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:936:1: ( rule__XmlContents__Group__0 )
            {
             before(grammarAccess.getXmlContentsAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:937:1: ( rule__XmlContents__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:937:2: rule__XmlContents__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlContents__Group__0_in_ruleXmlContents1945);
            rule__XmlContents__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlContentsAccess().getGroup()); 

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
    // $ANTLR end "ruleXmlContents"


    // $ANTLR start "entryRuleXmlElement"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:949:1: entryRuleXmlElement : ruleXmlElement EOF ;
    public final void entryRuleXmlElement() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:950:1: ( ruleXmlElement EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:951:1: ruleXmlElement EOF
            {
             before(grammarAccess.getXmlElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlElement_in_entryRuleXmlElement1972);
            ruleXmlElement();

            state._fsp--;

             after(grammarAccess.getXmlElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlElement1979); 

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
    // $ANTLR end "entryRuleXmlElement"


    // $ANTLR start "ruleXmlElement"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:958:1: ruleXmlElement : ( ( rule__XmlElement__Alternatives ) ) ;
    public final void ruleXmlElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:962:2: ( ( ( rule__XmlElement__Alternatives ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:963:1: ( ( rule__XmlElement__Alternatives ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:963:1: ( ( rule__XmlElement__Alternatives ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:964:1: ( rule__XmlElement__Alternatives )
            {
             before(grammarAccess.getXmlElementAccess().getAlternatives()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:965:1: ( rule__XmlElement__Alternatives )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:965:2: rule__XmlElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlElement__Alternatives_in_ruleXmlElement2005);
            rule__XmlElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXmlElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleXmlElement"


    // $ANTLR start "entryRuleXmlPIAnswerElement"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:977:1: entryRuleXmlPIAnswerElement : ruleXmlPIAnswerElement EOF ;
    public final void entryRuleXmlPIAnswerElement() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:978:1: ( ruleXmlPIAnswerElement EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:979:1: ruleXmlPIAnswerElement EOF
            {
             before(grammarAccess.getXmlPIAnswerElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlPIAnswerElement_in_entryRuleXmlPIAnswerElement2032);
            ruleXmlPIAnswerElement();

            state._fsp--;

             after(grammarAccess.getXmlPIAnswerElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlPIAnswerElement2039); 

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
    // $ANTLR end "entryRuleXmlPIAnswerElement"


    // $ANTLR start "ruleXmlPIAnswerElement"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:986:1: ruleXmlPIAnswerElement : ( ( rule__XmlPIAnswerElement__Group__0 ) ) ;
    public final void ruleXmlPIAnswerElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:990:2: ( ( ( rule__XmlPIAnswerElement__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:991:1: ( ( rule__XmlPIAnswerElement__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:991:1: ( ( rule__XmlPIAnswerElement__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:992:1: ( rule__XmlPIAnswerElement__Group__0 )
            {
             before(grammarAccess.getXmlPIAnswerElementAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:993:1: ( rule__XmlPIAnswerElement__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:993:2: rule__XmlPIAnswerElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlPIAnswerElement__Group__0_in_ruleXmlPIAnswerElement2065);
            rule__XmlPIAnswerElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlPIAnswerElementAccess().getGroup()); 

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
    // $ANTLR end "ruleXmlPIAnswerElement"


    // $ANTLR start "entryRuleXmlTagElement"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1005:1: entryRuleXmlTagElement : ruleXmlTagElement EOF ;
    public final void entryRuleXmlTagElement() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1006:1: ( ruleXmlTagElement EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1007:1: ruleXmlTagElement EOF
            {
             before(grammarAccess.getXmlTagElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlTagElement_in_entryRuleXmlTagElement2092);
            ruleXmlTagElement();

            state._fsp--;

             after(grammarAccess.getXmlTagElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlTagElement2099); 

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
    // $ANTLR end "entryRuleXmlTagElement"


    // $ANTLR start "ruleXmlTagElement"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1014:1: ruleXmlTagElement : ( ( rule__XmlTagElement__Group__0 ) ) ;
    public final void ruleXmlTagElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1018:2: ( ( ( rule__XmlTagElement__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1019:1: ( ( rule__XmlTagElement__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1019:1: ( ( rule__XmlTagElement__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1020:1: ( rule__XmlTagElement__Group__0 )
            {
             before(grammarAccess.getXmlTagElementAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1021:1: ( rule__XmlTagElement__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1021:2: rule__XmlTagElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group__0_in_ruleXmlTagElement2125);
            rule__XmlTagElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlTagElementAccess().getGroup()); 

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
    // $ANTLR end "ruleXmlTagElement"


    // $ANTLR start "entryRuleXmlTag"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1033:1: entryRuleXmlTag : ruleXmlTag EOF ;
    public final void entryRuleXmlTag() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1034:1: ( ruleXmlTag EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1035:1: ruleXmlTag EOF
            {
             before(grammarAccess.getXmlTagRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlTag_in_entryRuleXmlTag2152);
            ruleXmlTag();

            state._fsp--;

             after(grammarAccess.getXmlTagRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlTag2159); 

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
    // $ANTLR end "entryRuleXmlTag"


    // $ANTLR start "ruleXmlTag"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1042:1: ruleXmlTag : ( ( rule__XmlTag__Group__0 ) ) ;
    public final void ruleXmlTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1046:2: ( ( ( rule__XmlTag__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1047:1: ( ( rule__XmlTag__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1047:1: ( ( rule__XmlTag__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1048:1: ( rule__XmlTag__Group__0 )
            {
             before(grammarAccess.getXmlTagAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1049:1: ( rule__XmlTag__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1049:2: rule__XmlTag__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTag__Group__0_in_ruleXmlTag2185);
            rule__XmlTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlTagAccess().getGroup()); 

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
    // $ANTLR end "ruleXmlTag"


    // $ANTLR start "entryRuleXmlAttribute"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1061:1: entryRuleXmlAttribute : ruleXmlAttribute EOF ;
    public final void entryRuleXmlAttribute() throws RecognitionException {
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1062:1: ( ruleXmlAttribute EOF )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1063:1: ruleXmlAttribute EOF
            {
             before(grammarAccess.getXmlAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlAttribute_in_entryRuleXmlAttribute2212);
            ruleXmlAttribute();

            state._fsp--;

             after(grammarAccess.getXmlAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlAttribute2219); 

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
    // $ANTLR end "entryRuleXmlAttribute"


    // $ANTLR start "ruleXmlAttribute"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1070:1: ruleXmlAttribute : ( ( rule__XmlAttribute__Group__0 ) ) ;
    public final void ruleXmlAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1074:2: ( ( ( rule__XmlAttribute__Group__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1075:1: ( ( rule__XmlAttribute__Group__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1075:1: ( ( rule__XmlAttribute__Group__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1076:1: ( rule__XmlAttribute__Group__0 )
            {
             before(grammarAccess.getXmlAttributeAccess().getGroup()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1077:1: ( rule__XmlAttribute__Group__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1077:2: rule__XmlAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlAttribute__Group__0_in_ruleXmlAttribute2245);
            rule__XmlAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleXmlAttribute"


    // $ANTLR start "rule__Quiz__Alternatives_2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1089:1: rule__Quiz__Alternatives_2 : ( ( ( rule__Quiz__Group_2_0__0 ) ) | ( ( rule__Quiz__PartsAssignment_2_1 ) ) );
    public final void rule__Quiz__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1093:1: ( ( ( rule__Quiz__Group_2_0__0 ) ) | ( ( rule__Quiz__PartsAssignment_2_1 ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 20:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case 21:
                        {
                        alt4=1;
                        }
                        break;
                    case EOF:
                        {
                        alt4=1;
                        }
                        break;
                    case RULE_INT:
                    case RULE_STRING:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 24:
                    case 26:
                    case 28:
                    case 33:
                        {
                        alt4=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 21:
                    {
                    alt4=1;
                    }
                    break;
                case 28:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt4=1;
                    }
                    break;
                case EOF:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_INT:
                case RULE_STRING:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 24:
                case 26:
                case 28:
                case 33:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

                }
                break;
            case 21:
                {
                alt4=1;
                }
                break;
            case EOF:
                {
                alt4=1;
                }
                break;
            case 22:
            case 28:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1094:1: ( ( rule__Quiz__Group_2_0__0 ) )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1094:1: ( ( rule__Quiz__Group_2_0__0 ) )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1095:1: ( rule__Quiz__Group_2_0__0 )
                    {
                     before(grammarAccess.getQuizAccess().getGroup_2_0()); 
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1096:1: ( rule__Quiz__Group_2_0__0 )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1096:2: rule__Quiz__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group_2_0__0_in_rule__Quiz__Alternatives_22281);
                    rule__Quiz__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuizAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1100:6: ( ( rule__Quiz__PartsAssignment_2_1 ) )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1100:6: ( ( rule__Quiz__PartsAssignment_2_1 ) )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1101:1: ( rule__Quiz__PartsAssignment_2_1 )
                    {
                     before(grammarAccess.getQuizAccess().getPartsAssignment_2_1()); 
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1102:1: ( rule__Quiz__PartsAssignment_2_1 )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1102:2: rule__Quiz__PartsAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Quiz__PartsAssignment_2_1_in_rule__Quiz__Alternatives_22299);
                    rule__Quiz__PartsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuizAccess().getPartsAssignment_2_1()); 

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
    // $ANTLR end "rule__Quiz__Alternatives_2"


    // $ANTLR start "rule__AbstractQuizPart__Alternatives"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1111:1: rule__AbstractQuizPart__Alternatives : ( ( ruleQuizPart ) | ( ruleQuizPartRef ) );
    public final void rule__AbstractQuizPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1115:1: ( ( ruleQuizPart ) | ( ruleQuizPartRef ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==22) ) {
                    alt5=2;
                }
                else if ( (LA5_1==RULE_ID) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1116:1: ( ruleQuizPart )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1116:1: ( ruleQuizPart )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1117:1: ruleQuizPart
                    {
                     before(grammarAccess.getAbstractQuizPartAccess().getQuizPartParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQuizPart_in_rule__AbstractQuizPart__Alternatives2332);
                    ruleQuizPart();

                    state._fsp--;

                     after(grammarAccess.getAbstractQuizPartAccess().getQuizPartParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1122:6: ( ruleQuizPartRef )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1122:6: ( ruleQuizPartRef )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1123:1: ruleQuizPartRef
                    {
                     before(grammarAccess.getAbstractQuizPartAccess().getQuizPartRefParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQuizPartRef_in_rule__AbstractQuizPart__Alternatives2349);
                    ruleQuizPartRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractQuizPartAccess().getQuizPartRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractQuizPart__Alternatives"


    // $ANTLR start "rule__AbstractQA__Alternatives"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1133:1: rule__AbstractQA__Alternatives : ( ( ruleQA ) | ( ruleQARef ) );
    public final void rule__AbstractQA__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1137:1: ( ( ruleQA ) | ( ruleQARef ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==RULE_STRING||LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1138:1: ( ruleQA )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1138:1: ( ruleQA )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1139:1: ruleQA
                    {
                     before(grammarAccess.getAbstractQAAccess().getQAParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQA_in_rule__AbstractQA__Alternatives2381);
                    ruleQA();

                    state._fsp--;

                     after(grammarAccess.getAbstractQAAccess().getQAParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1144:6: ( ruleQARef )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1144:6: ( ruleQARef )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1145:1: ruleQARef
                    {
                     before(grammarAccess.getAbstractQAAccess().getQARefParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQARef_in_rule__AbstractQA__Alternatives2398);
                    ruleQARef();

                    state._fsp--;

                     after(grammarAccess.getAbstractQAAccess().getQARefParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractQA__Alternatives"


    // $ANTLR start "rule__Question__Alternatives"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1155:1: rule__Question__Alternatives : ( ( ruleStringQuestion ) | ( ruleXmlQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1159:1: ( ( ruleStringQuestion ) | ( ruleXmlQuestion ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1160:1: ( ruleStringQuestion )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1160:1: ( ruleStringQuestion )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1161:1: ruleStringQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getStringQuestionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStringQuestion_in_rule__Question__Alternatives2430);
                    ruleStringQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getStringQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1166:6: ( ruleXmlQuestion )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1166:6: ( ruleXmlQuestion )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1167:1: ruleXmlQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getXmlQuestionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleXmlQuestion_in_rule__Question__Alternatives2447);
                    ruleXmlQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getXmlQuestionParserRuleCall_1()); 

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


    // $ANTLR start "rule__Answer__Alternatives"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1177:1: rule__Answer__Alternatives : ( ( ruleOptionAnswer ) | ( ruleOptionsAnswer ) );
    public final void rule__Answer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1181:1: ( ( ruleOptionAnswer ) | ( ruleOptionsAnswer ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||(LA8_0>=12 && LA8_0<=15)||LA8_0==18||LA8_0==28) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=16 && LA8_0<=17)||LA8_0==24||LA8_0==26||LA8_0==33) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1182:1: ( ruleOptionAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1182:1: ( ruleOptionAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1183:1: ruleOptionAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_rule__Answer__Alternatives2479);
                    ruleOptionAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1188:6: ( ruleOptionsAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1188:6: ( ruleOptionsAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1189:1: ruleOptionsAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getOptionsAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOptionsAnswer_in_rule__Answer__Alternatives2496);
                    ruleOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getOptionsAnswerParserRuleCall_1()); 

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
    // $ANTLR end "rule__Answer__Alternatives"


    // $ANTLR start "rule__OptionAnswer__Alternatives"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1199:1: rule__OptionAnswer__Alternatives : ( ( ruleSimpleAnswer ) | ( ruleXmlAnswer ) );
    public final void rule__OptionAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1203:1: ( ( ruleSimpleAnswer ) | ( ruleXmlAnswer ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)||(LA9_0>=12 && LA9_0<=15)||LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1204:1: ( ruleSimpleAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1204:1: ( ruleSimpleAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1205:1: ruleSimpleAnswer
                    {
                     before(grammarAccess.getOptionAnswerAccess().getSimpleAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleAnswer_in_rule__OptionAnswer__Alternatives2528);
                    ruleSimpleAnswer();

                    state._fsp--;

                     after(grammarAccess.getOptionAnswerAccess().getSimpleAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1210:6: ( ruleXmlAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1210:6: ( ruleXmlAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1211:1: ruleXmlAnswer
                    {
                     before(grammarAccess.getOptionAnswerAccess().getXmlAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleXmlAnswer_in_rule__OptionAnswer__Alternatives2545);
                    ruleXmlAnswer();

                    state._fsp--;

                     after(grammarAccess.getOptionAnswerAccess().getXmlAnswerParserRuleCall_1()); 

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
    // $ANTLR end "rule__OptionAnswer__Alternatives"


    // $ANTLR start "rule__SimpleAnswer__Alternatives"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1221:1: rule__SimpleAnswer__Alternatives : ( ( ruleStringAnswer ) | ( ruleRegexAnswer ) | ( ruleNumberAnswer ) | ( ruleBooleanAnswer ) );
    public final void rule__SimpleAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1225:1: ( ( ruleStringAnswer ) | ( ruleRegexAnswer ) | ( ruleNumberAnswer ) | ( ruleBooleanAnswer ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
                {
                alt10=3;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1226:1: ( ruleStringAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1226:1: ( ruleStringAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1227:1: ruleStringAnswer
                    {
                     before(grammarAccess.getSimpleAnswerAccess().getStringAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStringAnswer_in_rule__SimpleAnswer__Alternatives2577);
                    ruleStringAnswer();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnswerAccess().getStringAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1232:6: ( ruleRegexAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1232:6: ( ruleRegexAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1233:1: ruleRegexAnswer
                    {
                     before(grammarAccess.getSimpleAnswerAccess().getRegexAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRegexAnswer_in_rule__SimpleAnswer__Alternatives2594);
                    ruleRegexAnswer();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnswerAccess().getRegexAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1238:6: ( ruleNumberAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1238:6: ( ruleNumberAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1239:1: ruleNumberAnswer
                    {
                     before(grammarAccess.getSimpleAnswerAccess().getNumberAnswerParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_rule__SimpleAnswer__Alternatives2611);
                    ruleNumberAnswer();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnswerAccess().getNumberAnswerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1244:6: ( ruleBooleanAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1244:6: ( ruleBooleanAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1245:1: ruleBooleanAnswer
                    {
                     before(grammarAccess.getSimpleAnswerAccess().getBooleanAnswerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanAnswer_in_rule__SimpleAnswer__Alternatives2628);
                    ruleBooleanAnswer();

                    state._fsp--;

                     after(grammarAccess.getSimpleAnswerAccess().getBooleanAnswerParserRuleCall_3()); 

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
    // $ANTLR end "rule__SimpleAnswer__Alternatives"


    // $ANTLR start "rule__BooleanAnswer__Alternatives_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1255:1: rule__BooleanAnswer__Alternatives_1 : ( ( ( rule__BooleanAnswer__ValueAssignment_1_0 ) ) | ( ( rule__BooleanAnswer__Alternatives_1_1 ) ) );
    public final void rule__BooleanAnswer__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1259:1: ( ( ( rule__BooleanAnswer__ValueAssignment_1_0 ) ) | ( ( rule__BooleanAnswer__Alternatives_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=14 && LA11_0<=15)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1260:1: ( ( rule__BooleanAnswer__ValueAssignment_1_0 ) )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1260:1: ( ( rule__BooleanAnswer__ValueAssignment_1_0 ) )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1261:1: ( rule__BooleanAnswer__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getValueAssignment_1_0()); 
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1262:1: ( rule__BooleanAnswer__ValueAssignment_1_0 )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1262:2: rule__BooleanAnswer__ValueAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BooleanAnswer__ValueAssignment_1_0_in_rule__BooleanAnswer__Alternatives_12660);
                    rule__BooleanAnswer__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAnswerAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1266:6: ( ( rule__BooleanAnswer__Alternatives_1_1 ) )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1266:6: ( ( rule__BooleanAnswer__Alternatives_1_1 ) )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1267:1: ( rule__BooleanAnswer__Alternatives_1_1 )
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getAlternatives_1_1()); 
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1268:1: ( rule__BooleanAnswer__Alternatives_1_1 )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1268:2: rule__BooleanAnswer__Alternatives_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BooleanAnswer__Alternatives_1_1_in_rule__BooleanAnswer__Alternatives_12678);
                    rule__BooleanAnswer__Alternatives_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAnswerAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__BooleanAnswer__Alternatives_1"


    // $ANTLR start "rule__BooleanAnswer__ValueAlternatives_1_0_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1277:1: rule__BooleanAnswer__ValueAlternatives_1_0_0 : ( ( 'yes' ) | ( 'true' ) );
    public final void rule__BooleanAnswer__ValueAlternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1281:1: ( ( 'yes' ) | ( 'true' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            else if ( (LA12_0==13) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1282:1: ( 'yes' )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1282:1: ( 'yes' )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1283:1: 'yes'
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getValueYesKeyword_1_0_0_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__BooleanAnswer__ValueAlternatives_1_0_02712); 
                     after(grammarAccess.getBooleanAnswerAccess().getValueYesKeyword_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1290:6: ( 'true' )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1290:6: ( 'true' )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1291:1: 'true'
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getValueTrueKeyword_1_0_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__BooleanAnswer__ValueAlternatives_1_0_02732); 
                     after(grammarAccess.getBooleanAnswerAccess().getValueTrueKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__BooleanAnswer__ValueAlternatives_1_0_0"


    // $ANTLR start "rule__BooleanAnswer__Alternatives_1_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1303:1: rule__BooleanAnswer__Alternatives_1_1 : ( ( 'no' ) | ( 'false' ) );
    public final void rule__BooleanAnswer__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1307:1: ( ( 'no' ) | ( 'false' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            else if ( (LA13_0==15) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1308:1: ( 'no' )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1308:1: ( 'no' )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1309:1: 'no'
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getNoKeyword_1_1_0()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__BooleanAnswer__Alternatives_1_12767); 
                     after(grammarAccess.getBooleanAnswerAccess().getNoKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1316:6: ( 'false' )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1316:6: ( 'false' )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1317:1: 'false'
                    {
                     before(grammarAccess.getBooleanAnswerAccess().getFalseKeyword_1_1_1()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__BooleanAnswer__Alternatives_1_12787); 
                     after(grammarAccess.getBooleanAnswerAccess().getFalseKeyword_1_1_1()); 

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
    // $ANTLR end "rule__BooleanAnswer__Alternatives_1_1"


    // $ANTLR start "rule__OptionsAnswer__Alternatives"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1329:1: rule__OptionsAnswer__Alternatives : ( ( ruleSingleOptionsAnswer ) | ( ruleManyOptionsAnswer ) );
    public final void rule__OptionsAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1333:1: ( ( ruleSingleOptionsAnswer ) | ( ruleManyOptionsAnswer ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=16 && LA14_0<=17)||LA14_0==24||LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1334:1: ( ruleSingleOptionsAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1334:1: ( ruleSingleOptionsAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1335:1: ruleSingleOptionsAnswer
                    {
                     before(grammarAccess.getOptionsAnswerAccess().getSingleOptionsAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSingleOptionsAnswer_in_rule__OptionsAnswer__Alternatives2821);
                    ruleSingleOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getOptionsAnswerAccess().getSingleOptionsAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1340:6: ( ruleManyOptionsAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1340:6: ( ruleManyOptionsAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1341:1: ruleManyOptionsAnswer
                    {
                     before(grammarAccess.getOptionsAnswerAccess().getManyOptionsAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleManyOptionsAnswer_in_rule__OptionsAnswer__Alternatives2838);
                    ruleManyOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getOptionsAnswerAccess().getManyOptionsAnswerParserRuleCall_1()); 

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
    // $ANTLR end "rule__OptionsAnswer__Alternatives"


    // $ANTLR start "rule__SingleOptionsAnswer__Alternatives"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1351:1: rule__SingleOptionsAnswer__Alternatives : ( ( ruleSingleBoxOptionsAnswer ) | ( ruleSingleListOptionsAnswer ) );
    public final void rule__SingleOptionsAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1355:1: ( ( ruleSingleBoxOptionsAnswer ) | ( ruleSingleListOptionsAnswer ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=16 && LA15_0<=17)||LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1356:1: ( ruleSingleBoxOptionsAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1356:1: ( ruleSingleBoxOptionsAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1357:1: ruleSingleBoxOptionsAnswer
                    {
                     before(grammarAccess.getSingleOptionsAnswerAccess().getSingleBoxOptionsAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOptionsAnswer_in_rule__SingleOptionsAnswer__Alternatives2870);
                    ruleSingleBoxOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getSingleOptionsAnswerAccess().getSingleBoxOptionsAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1362:6: ( ruleSingleListOptionsAnswer )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1362:6: ( ruleSingleListOptionsAnswer )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1363:1: ruleSingleListOptionsAnswer
                    {
                     before(grammarAccess.getSingleOptionsAnswerAccess().getSingleListOptionsAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSingleListOptionsAnswer_in_rule__SingleOptionsAnswer__Alternatives2887);
                    ruleSingleListOptionsAnswer();

                    state._fsp--;

                     after(grammarAccess.getSingleOptionsAnswerAccess().getSingleListOptionsAnswerParserRuleCall_1()); 

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
    // $ANTLR end "rule__SingleOptionsAnswer__Alternatives"


    // $ANTLR start "rule__SingleListOption__Alternatives_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1373:1: rule__SingleListOption__Alternatives_0 : ( ( ( rule__SingleListOption__Alternatives_0_0 ) ) | ( ( rule__SingleListOption__CorrectAssignment_0_1 ) ) );
    public final void rule__SingleListOption__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1377:1: ( ( ( rule__SingleListOption__Alternatives_0_0 ) ) | ( ( rule__SingleListOption__CorrectAssignment_0_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=16 && LA16_0<=17)) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1378:1: ( ( rule__SingleListOption__Alternatives_0_0 ) )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1378:1: ( ( rule__SingleListOption__Alternatives_0_0 ) )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1379:1: ( rule__SingleListOption__Alternatives_0_0 )
                    {
                     before(grammarAccess.getSingleListOptionAccess().getAlternatives_0_0()); 
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1380:1: ( rule__SingleListOption__Alternatives_0_0 )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1380:2: rule__SingleListOption__Alternatives_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleListOption__Alternatives_0_0_in_rule__SingleListOption__Alternatives_02919);
                    rule__SingleListOption__Alternatives_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleListOptionAccess().getAlternatives_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1384:6: ( ( rule__SingleListOption__CorrectAssignment_0_1 ) )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1384:6: ( ( rule__SingleListOption__CorrectAssignment_0_1 ) )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1385:1: ( rule__SingleListOption__CorrectAssignment_0_1 )
                    {
                     before(grammarAccess.getSingleListOptionAccess().getCorrectAssignment_0_1()); 
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1386:1: ( rule__SingleListOption__CorrectAssignment_0_1 )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1386:2: rule__SingleListOption__CorrectAssignment_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleListOption__CorrectAssignment_0_1_in_rule__SingleListOption__Alternatives_02937);
                    rule__SingleListOption__CorrectAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleListOptionAccess().getCorrectAssignment_0_1()); 

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
    // $ANTLR end "rule__SingleListOption__Alternatives_0"


    // $ANTLR start "rule__SingleListOption__Alternatives_0_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1395:1: rule__SingleListOption__Alternatives_0_0 : ( ( '-' ) | ( 'x' ) );
    public final void rule__SingleListOption__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1399:1: ( ( '-' ) | ( 'x' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            else if ( (LA17_0==17) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1400:1: ( '-' )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1400:1: ( '-' )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1401:1: '-'
                    {
                     before(grammarAccess.getSingleListOptionAccess().getHyphenMinusKeyword_0_0_0()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__SingleListOption__Alternatives_0_02971); 
                     after(grammarAccess.getSingleListOptionAccess().getHyphenMinusKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1408:6: ( 'x' )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1408:6: ( 'x' )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1409:1: 'x'
                    {
                     before(grammarAccess.getSingleListOptionAccess().getXKeyword_0_0_1()); 
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__SingleListOption__Alternatives_0_02991); 
                     after(grammarAccess.getSingleListOptionAccess().getXKeyword_0_0_1()); 

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
    // $ANTLR end "rule__SingleListOption__Alternatives_0_0"


    // $ANTLR start "rule__XmlElement__Alternatives"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1421:1: rule__XmlElement__Alternatives : ( ( ruleXmlPIAnswerElement ) | ( ruleXmlTagElement ) );
    public final void rule__XmlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1425:1: ( ( ruleXmlPIAnswerElement ) | ( ruleXmlTagElement ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1426:1: ( ruleXmlPIAnswerElement )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1426:1: ( ruleXmlPIAnswerElement )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1427:1: ruleXmlPIAnswerElement
                    {
                     before(grammarAccess.getXmlElementAccess().getXmlPIAnswerElementParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleXmlPIAnswerElement_in_rule__XmlElement__Alternatives3025);
                    ruleXmlPIAnswerElement();

                    state._fsp--;

                     after(grammarAccess.getXmlElementAccess().getXmlPIAnswerElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1432:6: ( ruleXmlTagElement )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1432:6: ( ruleXmlTagElement )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1433:1: ruleXmlTagElement
                    {
                     before(grammarAccess.getXmlElementAccess().getXmlTagElementParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleXmlTagElement_in_rule__XmlElement__Alternatives3042);
                    ruleXmlTagElement();

                    state._fsp--;

                     after(grammarAccess.getXmlElementAccess().getXmlTagElementParserRuleCall_1()); 

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
    // $ANTLR end "rule__XmlElement__Alternatives"


    // $ANTLR start "rule__XmlTagElement__Alternatives_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1443:1: rule__XmlTagElement__Alternatives_1 : ( ( '/' ) | ( ( rule__XmlTagElement__Group_1_1__0 ) ) );
    public final void rule__XmlTagElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1447:1: ( ( '/' ) | ( ( rule__XmlTagElement__Group_1_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_XML_TEXT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1448:1: ( '/' )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1448:1: ( '/' )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1449:1: '/'
                    {
                     before(grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_0()); 
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__XmlTagElement__Alternatives_13075); 
                     after(grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1456:6: ( ( rule__XmlTagElement__Group_1_1__0 ) )
                    {
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1456:6: ( ( rule__XmlTagElement__Group_1_1__0 ) )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1457:1: ( rule__XmlTagElement__Group_1_1__0 )
                    {
                     before(grammarAccess.getXmlTagElementAccess().getGroup_1_1()); 
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1458:1: ( rule__XmlTagElement__Group_1_1__0 )
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1458:2: rule__XmlTagElement__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1__0_in_rule__XmlTagElement__Alternatives_13094);
                    rule__XmlTagElement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXmlTagElementAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__XmlTagElement__Alternatives_1"


    // $ANTLR start "rule__Quiz__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1469:1: rule__Quiz__Group__0 : rule__Quiz__Group__0__Impl rule__Quiz__Group__1 ;
    public final void rule__Quiz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1473:1: ( rule__Quiz__Group__0__Impl rule__Quiz__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1474:2: rule__Quiz__Group__0__Impl rule__Quiz__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group__0__Impl_in_rule__Quiz__Group__03125);
            rule__Quiz__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group__1_in_rule__Quiz__Group__03128);
            rule__Quiz__Group__1();

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
    // $ANTLR end "rule__Quiz__Group__0"


    // $ANTLR start "rule__Quiz__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1481:1: rule__Quiz__Group__0__Impl : ( () ) ;
    public final void rule__Quiz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1485:1: ( ( () ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1486:1: ( () )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1486:1: ( () )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1487:1: ()
            {
             before(grammarAccess.getQuizAccess().getQuizAction_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1488:1: ()
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1490:1: 
            {
            }

             after(grammarAccess.getQuizAccess().getQuizAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__0__Impl"


    // $ANTLR start "rule__Quiz__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1500:1: rule__Quiz__Group__1 : rule__Quiz__Group__1__Impl rule__Quiz__Group__2 ;
    public final void rule__Quiz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1504:1: ( rule__Quiz__Group__1__Impl rule__Quiz__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1505:2: rule__Quiz__Group__1__Impl rule__Quiz__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group__1__Impl_in_rule__Quiz__Group__13186);
            rule__Quiz__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group__2_in_rule__Quiz__Group__13189);
            rule__Quiz__Group__2();

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
    // $ANTLR end "rule__Quiz__Group__1"


    // $ANTLR start "rule__Quiz__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1512:1: rule__Quiz__Group__1__Impl : ( 'quiz' ) ;
    public final void rule__Quiz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1516:1: ( ( 'quiz' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1517:1: ( 'quiz' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1517:1: ( 'quiz' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1518:1: 'quiz'
            {
             before(grammarAccess.getQuizAccess().getQuizKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Quiz__Group__1__Impl3217); 
             after(grammarAccess.getQuizAccess().getQuizKeyword_1()); 

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
    // $ANTLR end "rule__Quiz__Group__1__Impl"


    // $ANTLR start "rule__Quiz__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1531:1: rule__Quiz__Group__2 : rule__Quiz__Group__2__Impl ;
    public final void rule__Quiz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1535:1: ( rule__Quiz__Group__2__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1536:2: rule__Quiz__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group__2__Impl_in_rule__Quiz__Group__23248);
            rule__Quiz__Group__2__Impl();

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
    // $ANTLR end "rule__Quiz__Group__2"


    // $ANTLR start "rule__Quiz__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1542:1: rule__Quiz__Group__2__Impl : ( ( rule__Quiz__Alternatives_2 ) ) ;
    public final void rule__Quiz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1546:1: ( ( ( rule__Quiz__Alternatives_2 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1547:1: ( ( rule__Quiz__Alternatives_2 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1547:1: ( ( rule__Quiz__Alternatives_2 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1548:1: ( rule__Quiz__Alternatives_2 )
            {
             before(grammarAccess.getQuizAccess().getAlternatives_2()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1549:1: ( rule__Quiz__Alternatives_2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1549:2: rule__Quiz__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Alternatives_2_in_rule__Quiz__Group__2__Impl3275);
            rule__Quiz__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Quiz__Group__2__Impl"


    // $ANTLR start "rule__Quiz__Group_2_0__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1565:1: rule__Quiz__Group_2_0__0 : rule__Quiz__Group_2_0__0__Impl rule__Quiz__Group_2_0__1 ;
    public final void rule__Quiz__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1569:1: ( rule__Quiz__Group_2_0__0__Impl rule__Quiz__Group_2_0__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1570:2: rule__Quiz__Group_2_0__0__Impl rule__Quiz__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group_2_0__0__Impl_in_rule__Quiz__Group_2_0__03311);
            rule__Quiz__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group_2_0__1_in_rule__Quiz__Group_2_0__03314);
            rule__Quiz__Group_2_0__1();

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
    // $ANTLR end "rule__Quiz__Group_2_0__0"


    // $ANTLR start "rule__Quiz__Group_2_0__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1577:1: rule__Quiz__Group_2_0__0__Impl : ( ( rule__Quiz__NameAssignment_2_0_0 )? ) ;
    public final void rule__Quiz__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1581:1: ( ( ( rule__Quiz__NameAssignment_2_0_0 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1582:1: ( ( rule__Quiz__NameAssignment_2_0_0 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1582:1: ( ( rule__Quiz__NameAssignment_2_0_0 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1583:1: ( rule__Quiz__NameAssignment_2_0_0 )?
            {
             before(grammarAccess.getQuizAccess().getNameAssignment_2_0_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1584:1: ( rule__Quiz__NameAssignment_2_0_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1584:2: rule__Quiz__NameAssignment_2_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Quiz__NameAssignment_2_0_0_in_rule__Quiz__Group_2_0__0__Impl3341);
                    rule__Quiz__NameAssignment_2_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuizAccess().getNameAssignment_2_0_0()); 

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
    // $ANTLR end "rule__Quiz__Group_2_0__0__Impl"


    // $ANTLR start "rule__Quiz__Group_2_0__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1594:1: rule__Quiz__Group_2_0__1 : rule__Quiz__Group_2_0__1__Impl rule__Quiz__Group_2_0__2 ;
    public final void rule__Quiz__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1598:1: ( rule__Quiz__Group_2_0__1__Impl rule__Quiz__Group_2_0__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1599:2: rule__Quiz__Group_2_0__1__Impl rule__Quiz__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group_2_0__1__Impl_in_rule__Quiz__Group_2_0__13372);
            rule__Quiz__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group_2_0__2_in_rule__Quiz__Group_2_0__13375);
            rule__Quiz__Group_2_0__2();

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
    // $ANTLR end "rule__Quiz__Group_2_0__1"


    // $ANTLR start "rule__Quiz__Group_2_0__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1606:1: rule__Quiz__Group_2_0__1__Impl : ( ( rule__Quiz__TitleAssignment_2_0_1 )? ) ;
    public final void rule__Quiz__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1610:1: ( ( ( rule__Quiz__TitleAssignment_2_0_1 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1611:1: ( ( rule__Quiz__TitleAssignment_2_0_1 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1611:1: ( ( rule__Quiz__TitleAssignment_2_0_1 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1612:1: ( rule__Quiz__TitleAssignment_2_0_1 )?
            {
             before(grammarAccess.getQuizAccess().getTitleAssignment_2_0_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1613:1: ( rule__Quiz__TitleAssignment_2_0_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1613:2: rule__Quiz__TitleAssignment_2_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Quiz__TitleAssignment_2_0_1_in_rule__Quiz__Group_2_0__1__Impl3402);
                    rule__Quiz__TitleAssignment_2_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuizAccess().getTitleAssignment_2_0_1()); 

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
    // $ANTLR end "rule__Quiz__Group_2_0__1__Impl"


    // $ANTLR start "rule__Quiz__Group_2_0__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1623:1: rule__Quiz__Group_2_0__2 : rule__Quiz__Group_2_0__2__Impl ;
    public final void rule__Quiz__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1627:1: ( rule__Quiz__Group_2_0__2__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1628:2: rule__Quiz__Group_2_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Quiz__Group_2_0__2__Impl_in_rule__Quiz__Group_2_0__23433);
            rule__Quiz__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__Quiz__Group_2_0__2"


    // $ANTLR start "rule__Quiz__Group_2_0__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1634:1: rule__Quiz__Group_2_0__2__Impl : ( ( rule__Quiz__PartsAssignment_2_0_2 )* ) ;
    public final void rule__Quiz__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1638:1: ( ( ( rule__Quiz__PartsAssignment_2_0_2 )* ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1639:1: ( ( rule__Quiz__PartsAssignment_2_0_2 )* )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1639:1: ( ( rule__Quiz__PartsAssignment_2_0_2 )* )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1640:1: ( rule__Quiz__PartsAssignment_2_0_2 )*
            {
             before(grammarAccess.getQuizAccess().getPartsAssignment_2_0_2()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1641:1: ( rule__Quiz__PartsAssignment_2_0_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1641:2: rule__Quiz__PartsAssignment_2_0_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Quiz__PartsAssignment_2_0_2_in_rule__Quiz__Group_2_0__2__Impl3460);
            	    rule__Quiz__PartsAssignment_2_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getQuizAccess().getPartsAssignment_2_0_2()); 

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
    // $ANTLR end "rule__Quiz__Group_2_0__2__Impl"


    // $ANTLR start "rule__QName__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1657:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1661:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1662:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__03497);
            rule__QName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__1_in_rule__QName__Group__03500);
            rule__QName__Group__1();

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
    // $ANTLR end "rule__QName__Group__0"


    // $ANTLR start "rule__QName__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1669:1: rule__QName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1673:1: ( ( RULE_ID ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1674:1: ( RULE_ID )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1674:1: ( RULE_ID )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1675:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QName__Group__0__Impl3527); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QName__Group__0__Impl"


    // $ANTLR start "rule__QName__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1686:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1690:1: ( rule__QName__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1691:2: rule__QName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__13556);
            rule__QName__Group__1__Impl();

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
    // $ANTLR end "rule__QName__Group__1"


    // $ANTLR start "rule__QName__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1697:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1701:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1702:1: ( ( rule__QName__Group_1__0 )* )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1702:1: ( ( rule__QName__Group_1__0 )* )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1703:1: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1704:1: ( rule__QName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1704:2: rule__QName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl3583);
            	    rule__QName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getQNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QName__Group__1__Impl"


    // $ANTLR start "rule__QName__Group_1__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1718:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1722:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1723:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__03618);
            rule__QName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__03621);
            rule__QName__Group_1__1();

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
    // $ANTLR end "rule__QName__Group_1__0"


    // $ANTLR start "rule__QName__Group_1__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1730:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1734:1: ( ( '.' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1735:1: ( '.' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1735:1: ( '.' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1736:1: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__QName__Group_1__0__Impl3649); 
             after(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QName__Group_1__0__Impl"


    // $ANTLR start "rule__QName__Group_1__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1749:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1753:1: ( rule__QName__Group_1__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1754:2: rule__QName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__13680);
            rule__QName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QName__Group_1__1"


    // $ANTLR start "rule__QName__Group_1__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1760:1: rule__QName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1764:1: ( ( RULE_ID ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1765:1: ( RULE_ID )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1765:1: ( RULE_ID )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1766:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QName__Group_1__1__Impl3707); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QName__Group_1__1__Impl"


    // $ANTLR start "rule__QuizPart__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1781:1: rule__QuizPart__Group__0 : rule__QuizPart__Group__0__Impl rule__QuizPart__Group__1 ;
    public final void rule__QuizPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1785:1: ( rule__QuizPart__Group__0__Impl rule__QuizPart__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1786:2: rule__QuizPart__Group__0__Impl rule__QuizPart__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__Group__0__Impl_in_rule__QuizPart__Group__03740);
            rule__QuizPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__Group__1_in_rule__QuizPart__Group__03743);
            rule__QuizPart__Group__1();

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
    // $ANTLR end "rule__QuizPart__Group__0"


    // $ANTLR start "rule__QuizPart__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1793:1: rule__QuizPart__Group__0__Impl : ( 'part' ) ;
    public final void rule__QuizPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1797:1: ( ( 'part' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1798:1: ( 'part' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1798:1: ( 'part' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1799:1: 'part'
            {
             before(grammarAccess.getQuizPartAccess().getPartKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__QuizPart__Group__0__Impl3771); 
             after(grammarAccess.getQuizPartAccess().getPartKeyword_0()); 

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
    // $ANTLR end "rule__QuizPart__Group__0__Impl"


    // $ANTLR start "rule__QuizPart__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1812:1: rule__QuizPart__Group__1 : rule__QuizPart__Group__1__Impl rule__QuizPart__Group__2 ;
    public final void rule__QuizPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1816:1: ( rule__QuizPart__Group__1__Impl rule__QuizPart__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1817:2: rule__QuizPart__Group__1__Impl rule__QuizPart__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__Group__1__Impl_in_rule__QuizPart__Group__13802);
            rule__QuizPart__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__Group__2_in_rule__QuizPart__Group__13805);
            rule__QuizPart__Group__2();

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
    // $ANTLR end "rule__QuizPart__Group__1"


    // $ANTLR start "rule__QuizPart__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1824:1: rule__QuizPart__Group__1__Impl : ( ( rule__QuizPart__NameAssignment_1 ) ) ;
    public final void rule__QuizPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1828:1: ( ( ( rule__QuizPart__NameAssignment_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1829:1: ( ( rule__QuizPart__NameAssignment_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1829:1: ( ( rule__QuizPart__NameAssignment_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1830:1: ( rule__QuizPart__NameAssignment_1 )
            {
             before(grammarAccess.getQuizPartAccess().getNameAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1831:1: ( rule__QuizPart__NameAssignment_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1831:2: rule__QuizPart__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__NameAssignment_1_in_rule__QuizPart__Group__1__Impl3832);
            rule__QuizPart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuizPartAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__QuizPart__Group__1__Impl"


    // $ANTLR start "rule__QuizPart__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1841:1: rule__QuizPart__Group__2 : rule__QuizPart__Group__2__Impl rule__QuizPart__Group__3 ;
    public final void rule__QuizPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1845:1: ( rule__QuizPart__Group__2__Impl rule__QuizPart__Group__3 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1846:2: rule__QuizPart__Group__2__Impl rule__QuizPart__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__Group__2__Impl_in_rule__QuizPart__Group__23862);
            rule__QuizPart__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__Group__3_in_rule__QuizPart__Group__23865);
            rule__QuizPart__Group__3();

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
    // $ANTLR end "rule__QuizPart__Group__2"


    // $ANTLR start "rule__QuizPart__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1853:1: rule__QuizPart__Group__2__Impl : ( ( rule__QuizPart__TitleAssignment_2 ) ) ;
    public final void rule__QuizPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1857:1: ( ( ( rule__QuizPart__TitleAssignment_2 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1858:1: ( ( rule__QuizPart__TitleAssignment_2 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1858:1: ( ( rule__QuizPart__TitleAssignment_2 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1859:1: ( rule__QuizPart__TitleAssignment_2 )
            {
             before(grammarAccess.getQuizPartAccess().getTitleAssignment_2()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1860:1: ( rule__QuizPart__TitleAssignment_2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1860:2: rule__QuizPart__TitleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__TitleAssignment_2_in_rule__QuizPart__Group__2__Impl3892);
            rule__QuizPart__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuizPartAccess().getTitleAssignment_2()); 

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
    // $ANTLR end "rule__QuizPart__Group__2__Impl"


    // $ANTLR start "rule__QuizPart__Group__3"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1870:1: rule__QuizPart__Group__3 : rule__QuizPart__Group__3__Impl ;
    public final void rule__QuizPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1874:1: ( rule__QuizPart__Group__3__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1875:2: rule__QuizPart__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPart__Group__3__Impl_in_rule__QuizPart__Group__33922);
            rule__QuizPart__Group__3__Impl();

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
    // $ANTLR end "rule__QuizPart__Group__3"


    // $ANTLR start "rule__QuizPart__Group__3__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1881:1: rule__QuizPart__Group__3__Impl : ( ( rule__QuizPart__QuestionsAssignment_3 )* ) ;
    public final void rule__QuizPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1885:1: ( ( ( rule__QuizPart__QuestionsAssignment_3 )* ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1886:1: ( ( rule__QuizPart__QuestionsAssignment_3 )* )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1886:1: ( ( rule__QuizPart__QuestionsAssignment_3 )* )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1887:1: ( rule__QuizPart__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getQuizPartAccess().getQuestionsAssignment_3()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1888:1: ( rule__QuizPart__QuestionsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==RULE_STRING||LA24_0==22||LA24_0==28) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1888:2: rule__QuizPart__QuestionsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuizPart__QuestionsAssignment_3_in_rule__QuizPart__Group__3__Impl3949);
            	    rule__QuizPart__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getQuizPartAccess().getQuestionsAssignment_3()); 

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
    // $ANTLR end "rule__QuizPart__Group__3__Impl"


    // $ANTLR start "rule__QuizPartRef__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1906:1: rule__QuizPartRef__Group__0 : rule__QuizPartRef__Group__0__Impl rule__QuizPartRef__Group__1 ;
    public final void rule__QuizPartRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1910:1: ( rule__QuizPartRef__Group__0__Impl rule__QuizPartRef__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1911:2: rule__QuizPartRef__Group__0__Impl rule__QuizPartRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPartRef__Group__0__Impl_in_rule__QuizPartRef__Group__03988);
            rule__QuizPartRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuizPartRef__Group__1_in_rule__QuizPartRef__Group__03991);
            rule__QuizPartRef__Group__1();

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
    // $ANTLR end "rule__QuizPartRef__Group__0"


    // $ANTLR start "rule__QuizPartRef__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1918:1: rule__QuizPartRef__Group__0__Impl : ( 'part' ) ;
    public final void rule__QuizPartRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1922:1: ( ( 'part' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1923:1: ( 'part' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1923:1: ( 'part' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1924:1: 'part'
            {
             before(grammarAccess.getQuizPartRefAccess().getPartKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__QuizPartRef__Group__0__Impl4019); 
             after(grammarAccess.getQuizPartRefAccess().getPartKeyword_0()); 

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
    // $ANTLR end "rule__QuizPartRef__Group__0__Impl"


    // $ANTLR start "rule__QuizPartRef__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1937:1: rule__QuizPartRef__Group__1 : rule__QuizPartRef__Group__1__Impl rule__QuizPartRef__Group__2 ;
    public final void rule__QuizPartRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1941:1: ( rule__QuizPartRef__Group__1__Impl rule__QuizPartRef__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1942:2: rule__QuizPartRef__Group__1__Impl rule__QuizPartRef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPartRef__Group__1__Impl_in_rule__QuizPartRef__Group__14050);
            rule__QuizPartRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuizPartRef__Group__2_in_rule__QuizPartRef__Group__14053);
            rule__QuizPartRef__Group__2();

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
    // $ANTLR end "rule__QuizPartRef__Group__1"


    // $ANTLR start "rule__QuizPartRef__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1949:1: rule__QuizPartRef__Group__1__Impl : ( 'ref' ) ;
    public final void rule__QuizPartRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1953:1: ( ( 'ref' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1954:1: ( 'ref' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1954:1: ( 'ref' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1955:1: 'ref'
            {
             before(grammarAccess.getQuizPartRefAccess().getRefKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__QuizPartRef__Group__1__Impl4081); 
             after(grammarAccess.getQuizPartRefAccess().getRefKeyword_1()); 

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
    // $ANTLR end "rule__QuizPartRef__Group__1__Impl"


    // $ANTLR start "rule__QuizPartRef__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1968:1: rule__QuizPartRef__Group__2 : rule__QuizPartRef__Group__2__Impl ;
    public final void rule__QuizPartRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1972:1: ( rule__QuizPartRef__Group__2__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1973:2: rule__QuizPartRef__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPartRef__Group__2__Impl_in_rule__QuizPartRef__Group__24112);
            rule__QuizPartRef__Group__2__Impl();

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
    // $ANTLR end "rule__QuizPartRef__Group__2"


    // $ANTLR start "rule__QuizPartRef__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1979:1: rule__QuizPartRef__Group__2__Impl : ( ( rule__QuizPartRef__PartRefAssignment_2 ) ) ;
    public final void rule__QuizPartRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1983:1: ( ( ( rule__QuizPartRef__PartRefAssignment_2 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1984:1: ( ( rule__QuizPartRef__PartRefAssignment_2 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1984:1: ( ( rule__QuizPartRef__PartRefAssignment_2 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1985:1: ( rule__QuizPartRef__PartRefAssignment_2 )
            {
             before(grammarAccess.getQuizPartRefAccess().getPartRefAssignment_2()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1986:1: ( rule__QuizPartRef__PartRefAssignment_2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:1986:2: rule__QuizPartRef__PartRefAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuizPartRef__PartRefAssignment_2_in_rule__QuizPartRef__Group__2__Impl4139);
            rule__QuizPartRef__PartRefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuizPartRefAccess().getPartRefAssignment_2()); 

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
    // $ANTLR end "rule__QuizPartRef__Group__2__Impl"


    // $ANTLR start "rule__AnonymousQuizPart__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2002:1: rule__AnonymousQuizPart__Group__0 : rule__AnonymousQuizPart__Group__0__Impl rule__AnonymousQuizPart__Group__1 ;
    public final void rule__AnonymousQuizPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2006:1: ( rule__AnonymousQuizPart__Group__0__Impl rule__AnonymousQuizPart__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2007:2: rule__AnonymousQuizPart__Group__0__Impl rule__AnonymousQuizPart__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnonymousQuizPart__Group__0__Impl_in_rule__AnonymousQuizPart__Group__04175);
            rule__AnonymousQuizPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnonymousQuizPart__Group__1_in_rule__AnonymousQuizPart__Group__04178);
            rule__AnonymousQuizPart__Group__1();

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
    // $ANTLR end "rule__AnonymousQuizPart__Group__0"


    // $ANTLR start "rule__AnonymousQuizPart__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2014:1: rule__AnonymousQuizPart__Group__0__Impl : ( () ) ;
    public final void rule__AnonymousQuizPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2018:1: ( ( () ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2019:1: ( () )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2019:1: ( () )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2020:1: ()
            {
             before(grammarAccess.getAnonymousQuizPartAccess().getQuizPartAction_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2021:1: ()
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2023:1: 
            {
            }

             after(grammarAccess.getAnonymousQuizPartAccess().getQuizPartAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousQuizPart__Group__0__Impl"


    // $ANTLR start "rule__AnonymousQuizPart__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2033:1: rule__AnonymousQuizPart__Group__1 : rule__AnonymousQuizPart__Group__1__Impl ;
    public final void rule__AnonymousQuizPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2037:1: ( rule__AnonymousQuizPart__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2038:2: rule__AnonymousQuizPart__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnonymousQuizPart__Group__1__Impl_in_rule__AnonymousQuizPart__Group__14236);
            rule__AnonymousQuizPart__Group__1__Impl();

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
    // $ANTLR end "rule__AnonymousQuizPart__Group__1"


    // $ANTLR start "rule__AnonymousQuizPart__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2044:1: rule__AnonymousQuizPart__Group__1__Impl : ( ( rule__AnonymousQuizPart__QuestionsAssignment_1 )* ) ;
    public final void rule__AnonymousQuizPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2048:1: ( ( ( rule__AnonymousQuizPart__QuestionsAssignment_1 )* ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2049:1: ( ( rule__AnonymousQuizPart__QuestionsAssignment_1 )* )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2049:1: ( ( rule__AnonymousQuizPart__QuestionsAssignment_1 )* )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2050:1: ( rule__AnonymousQuizPart__QuestionsAssignment_1 )*
            {
             before(grammarAccess.getAnonymousQuizPartAccess().getQuestionsAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2051:1: ( rule__AnonymousQuizPart__QuestionsAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==RULE_STRING||LA25_0==22||LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2051:2: rule__AnonymousQuizPart__QuestionsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AnonymousQuizPart__QuestionsAssignment_1_in_rule__AnonymousQuizPart__Group__1__Impl4263);
            	    rule__AnonymousQuizPart__QuestionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAnonymousQuizPartAccess().getQuestionsAssignment_1()); 

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
    // $ANTLR end "rule__AnonymousQuizPart__Group__1__Impl"


    // $ANTLR start "rule__QARef__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2065:1: rule__QARef__Group__0 : rule__QARef__Group__0__Impl rule__QARef__Group__1 ;
    public final void rule__QARef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2069:1: ( rule__QARef__Group__0__Impl rule__QARef__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2070:2: rule__QARef__Group__0__Impl rule__QARef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QARef__Group__0__Impl_in_rule__QARef__Group__04298);
            rule__QARef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QARef__Group__1_in_rule__QARef__Group__04301);
            rule__QARef__Group__1();

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
    // $ANTLR end "rule__QARef__Group__0"


    // $ANTLR start "rule__QARef__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2077:1: rule__QARef__Group__0__Impl : ( 'ref' ) ;
    public final void rule__QARef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2081:1: ( ( 'ref' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2082:1: ( 'ref' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2082:1: ( 'ref' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2083:1: 'ref'
            {
             before(grammarAccess.getQARefAccess().getRefKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__QARef__Group__0__Impl4329); 
             after(grammarAccess.getQARefAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__QARef__Group__0__Impl"


    // $ANTLR start "rule__QARef__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2096:1: rule__QARef__Group__1 : rule__QARef__Group__1__Impl ;
    public final void rule__QARef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2100:1: ( rule__QARef__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2101:2: rule__QARef__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QARef__Group__1__Impl_in_rule__QARef__Group__14360);
            rule__QARef__Group__1__Impl();

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
    // $ANTLR end "rule__QARef__Group__1"


    // $ANTLR start "rule__QARef__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2107:1: rule__QARef__Group__1__Impl : ( ( rule__QARef__QaRefAssignment_1 ) ) ;
    public final void rule__QARef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2111:1: ( ( ( rule__QARef__QaRefAssignment_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2112:1: ( ( rule__QARef__QaRefAssignment_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2112:1: ( ( rule__QARef__QaRefAssignment_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2113:1: ( rule__QARef__QaRefAssignment_1 )
            {
             before(grammarAccess.getQARefAccess().getQaRefAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2114:1: ( rule__QARef__QaRefAssignment_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2114:2: rule__QARef__QaRefAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QARef__QaRefAssignment_1_in_rule__QARef__Group__1__Impl4387);
            rule__QARef__QaRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQARefAccess().getQaRefAssignment_1()); 

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
    // $ANTLR end "rule__QARef__Group__1__Impl"


    // $ANTLR start "rule__QA__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2128:1: rule__QA__Group__0 : rule__QA__Group__0__Impl rule__QA__Group__1 ;
    public final void rule__QA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2132:1: ( rule__QA__Group__0__Impl rule__QA__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2133:2: rule__QA__Group__0__Impl rule__QA__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QA__Group__0__Impl_in_rule__QA__Group__04421);
            rule__QA__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QA__Group__1_in_rule__QA__Group__04424);
            rule__QA__Group__1();

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
    // $ANTLR end "rule__QA__Group__0"


    // $ANTLR start "rule__QA__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2140:1: rule__QA__Group__0__Impl : ( ( rule__QA__NameAssignment_0 )? ) ;
    public final void rule__QA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2144:1: ( ( ( rule__QA__NameAssignment_0 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2145:1: ( ( rule__QA__NameAssignment_0 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2145:1: ( ( rule__QA__NameAssignment_0 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2146:1: ( rule__QA__NameAssignment_0 )?
            {
             before(grammarAccess.getQAAccess().getNameAssignment_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2147:1: ( rule__QA__NameAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2147:2: rule__QA__NameAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QA__NameAssignment_0_in_rule__QA__Group__0__Impl4451);
                    rule__QA__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQAAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__QA__Group__0__Impl"


    // $ANTLR start "rule__QA__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2157:1: rule__QA__Group__1 : rule__QA__Group__1__Impl rule__QA__Group__2 ;
    public final void rule__QA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2161:1: ( rule__QA__Group__1__Impl rule__QA__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2162:2: rule__QA__Group__1__Impl rule__QA__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QA__Group__1__Impl_in_rule__QA__Group__14482);
            rule__QA__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QA__Group__2_in_rule__QA__Group__14485);
            rule__QA__Group__2();

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
    // $ANTLR end "rule__QA__Group__1"


    // $ANTLR start "rule__QA__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2169:1: rule__QA__Group__1__Impl : ( ( rule__QA__QAssignment_1 ) ) ;
    public final void rule__QA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2173:1: ( ( ( rule__QA__QAssignment_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2174:1: ( ( rule__QA__QAssignment_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2174:1: ( ( rule__QA__QAssignment_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2175:1: ( rule__QA__QAssignment_1 )
            {
             before(grammarAccess.getQAAccess().getQAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2176:1: ( rule__QA__QAssignment_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2176:2: rule__QA__QAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QA__QAssignment_1_in_rule__QA__Group__1__Impl4512);
            rule__QA__QAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQAAccess().getQAssignment_1()); 

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
    // $ANTLR end "rule__QA__Group__1__Impl"


    // $ANTLR start "rule__QA__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2186:1: rule__QA__Group__2 : rule__QA__Group__2__Impl ;
    public final void rule__QA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2190:1: ( rule__QA__Group__2__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2191:2: rule__QA__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QA__Group__2__Impl_in_rule__QA__Group__24542);
            rule__QA__Group__2__Impl();

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
    // $ANTLR end "rule__QA__Group__2"


    // $ANTLR start "rule__QA__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2197:1: rule__QA__Group__2__Impl : ( ( rule__QA__AAssignment_2 ) ) ;
    public final void rule__QA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2201:1: ( ( ( rule__QA__AAssignment_2 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2202:1: ( ( rule__QA__AAssignment_2 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2202:1: ( ( rule__QA__AAssignment_2 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2203:1: ( rule__QA__AAssignment_2 )
            {
             before(grammarAccess.getQAAccess().getAAssignment_2()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2204:1: ( rule__QA__AAssignment_2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2204:2: rule__QA__AAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QA__AAssignment_2_in_rule__QA__Group__2__Impl4569);
            rule__QA__AAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQAAccess().getAAssignment_2()); 

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
    // $ANTLR end "rule__QA__Group__2__Impl"


    // $ANTLR start "rule__StringAnswer__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2220:1: rule__StringAnswer__Group__0 : rule__StringAnswer__Group__0__Impl rule__StringAnswer__Group__1 ;
    public final void rule__StringAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2224:1: ( rule__StringAnswer__Group__0__Impl rule__StringAnswer__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2225:2: rule__StringAnswer__Group__0__Impl rule__StringAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringAnswer__Group__0__Impl_in_rule__StringAnswer__Group__04605);
            rule__StringAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringAnswer__Group__1_in_rule__StringAnswer__Group__04608);
            rule__StringAnswer__Group__1();

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
    // $ANTLR end "rule__StringAnswer__Group__0"


    // $ANTLR start "rule__StringAnswer__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2232:1: rule__StringAnswer__Group__0__Impl : ( ( rule__StringAnswer__ValueAssignment_0 ) ) ;
    public final void rule__StringAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2236:1: ( ( ( rule__StringAnswer__ValueAssignment_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2237:1: ( ( rule__StringAnswer__ValueAssignment_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2237:1: ( ( rule__StringAnswer__ValueAssignment_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2238:1: ( rule__StringAnswer__ValueAssignment_0 )
            {
             before(grammarAccess.getStringAnswerAccess().getValueAssignment_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2239:1: ( rule__StringAnswer__ValueAssignment_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2239:2: rule__StringAnswer__ValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringAnswer__ValueAssignment_0_in_rule__StringAnswer__Group__0__Impl4635);
            rule__StringAnswer__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringAnswerAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__StringAnswer__Group__0__Impl"


    // $ANTLR start "rule__StringAnswer__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2249:1: rule__StringAnswer__Group__1 : rule__StringAnswer__Group__1__Impl ;
    public final void rule__StringAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2253:1: ( rule__StringAnswer__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2254:2: rule__StringAnswer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringAnswer__Group__1__Impl_in_rule__StringAnswer__Group__14665);
            rule__StringAnswer__Group__1__Impl();

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
    // $ANTLR end "rule__StringAnswer__Group__1"


    // $ANTLR start "rule__StringAnswer__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2260:1: rule__StringAnswer__Group__1__Impl : ( ( rule__StringAnswer__IgnoreCaseAssignment_1 )? ) ;
    public final void rule__StringAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2264:1: ( ( ( rule__StringAnswer__IgnoreCaseAssignment_1 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2265:1: ( ( rule__StringAnswer__IgnoreCaseAssignment_1 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2265:1: ( ( rule__StringAnswer__IgnoreCaseAssignment_1 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2266:1: ( rule__StringAnswer__IgnoreCaseAssignment_1 )?
            {
             before(grammarAccess.getStringAnswerAccess().getIgnoreCaseAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2267:1: ( rule__StringAnswer__IgnoreCaseAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2267:2: rule__StringAnswer__IgnoreCaseAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StringAnswer__IgnoreCaseAssignment_1_in_rule__StringAnswer__Group__1__Impl4692);
                    rule__StringAnswer__IgnoreCaseAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringAnswerAccess().getIgnoreCaseAssignment_1()); 

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
    // $ANTLR end "rule__StringAnswer__Group__1__Impl"


    // $ANTLR start "rule__RegexAnswer__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2281:1: rule__RegexAnswer__Group__0 : rule__RegexAnswer__Group__0__Impl rule__RegexAnswer__Group__1 ;
    public final void rule__RegexAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2285:1: ( rule__RegexAnswer__Group__0__Impl rule__RegexAnswer__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2286:2: rule__RegexAnswer__Group__0__Impl rule__RegexAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__Group__0__Impl_in_rule__RegexAnswer__Group__04727);
            rule__RegexAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__Group__1_in_rule__RegexAnswer__Group__04730);
            rule__RegexAnswer__Group__1();

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
    // $ANTLR end "rule__RegexAnswer__Group__0"


    // $ANTLR start "rule__RegexAnswer__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2293:1: rule__RegexAnswer__Group__0__Impl : ( ( rule__RegexAnswer__RegexpAssignment_0 ) ) ;
    public final void rule__RegexAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2297:1: ( ( ( rule__RegexAnswer__RegexpAssignment_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2298:1: ( ( rule__RegexAnswer__RegexpAssignment_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2298:1: ( ( rule__RegexAnswer__RegexpAssignment_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2299:1: ( rule__RegexAnswer__RegexpAssignment_0 )
            {
             before(grammarAccess.getRegexAnswerAccess().getRegexpAssignment_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2300:1: ( rule__RegexAnswer__RegexpAssignment_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2300:2: rule__RegexAnswer__RegexpAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__RegexpAssignment_0_in_rule__RegexAnswer__Group__0__Impl4757);
            rule__RegexAnswer__RegexpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegexAnswerAccess().getRegexpAssignment_0()); 

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
    // $ANTLR end "rule__RegexAnswer__Group__0__Impl"


    // $ANTLR start "rule__RegexAnswer__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2310:1: rule__RegexAnswer__Group__1 : rule__RegexAnswer__Group__1__Impl rule__RegexAnswer__Group__2 ;
    public final void rule__RegexAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2314:1: ( rule__RegexAnswer__Group__1__Impl rule__RegexAnswer__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2315:2: rule__RegexAnswer__Group__1__Impl rule__RegexAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__Group__1__Impl_in_rule__RegexAnswer__Group__14787);
            rule__RegexAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__Group__2_in_rule__RegexAnswer__Group__14790);
            rule__RegexAnswer__Group__2();

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
    // $ANTLR end "rule__RegexAnswer__Group__1"


    // $ANTLR start "rule__RegexAnswer__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2322:1: rule__RegexAnswer__Group__1__Impl : ( ( rule__RegexAnswer__ValueAssignment_1 ) ) ;
    public final void rule__RegexAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2326:1: ( ( ( rule__RegexAnswer__ValueAssignment_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2327:1: ( ( rule__RegexAnswer__ValueAssignment_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2327:1: ( ( rule__RegexAnswer__ValueAssignment_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2328:1: ( rule__RegexAnswer__ValueAssignment_1 )
            {
             before(grammarAccess.getRegexAnswerAccess().getValueAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2329:1: ( rule__RegexAnswer__ValueAssignment_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2329:2: rule__RegexAnswer__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__ValueAssignment_1_in_rule__RegexAnswer__Group__1__Impl4817);
            rule__RegexAnswer__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegexAnswerAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__RegexAnswer__Group__1__Impl"


    // $ANTLR start "rule__RegexAnswer__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2339:1: rule__RegexAnswer__Group__2 : rule__RegexAnswer__Group__2__Impl rule__RegexAnswer__Group__3 ;
    public final void rule__RegexAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2343:1: ( rule__RegexAnswer__Group__2__Impl rule__RegexAnswer__Group__3 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2344:2: rule__RegexAnswer__Group__2__Impl rule__RegexAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__Group__2__Impl_in_rule__RegexAnswer__Group__24847);
            rule__RegexAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__Group__3_in_rule__RegexAnswer__Group__24850);
            rule__RegexAnswer__Group__3();

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
    // $ANTLR end "rule__RegexAnswer__Group__2"


    // $ANTLR start "rule__RegexAnswer__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2351:1: rule__RegexAnswer__Group__2__Impl : ( '/' ) ;
    public final void rule__RegexAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2355:1: ( ( '/' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2356:1: ( '/' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2356:1: ( '/' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2357:1: '/'
            {
             before(grammarAccess.getRegexAnswerAccess().getSolidusKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RegexAnswer__Group__2__Impl4878); 
             after(grammarAccess.getRegexAnswerAccess().getSolidusKeyword_2()); 

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
    // $ANTLR end "rule__RegexAnswer__Group__2__Impl"


    // $ANTLR start "rule__RegexAnswer__Group__3"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2370:1: rule__RegexAnswer__Group__3 : rule__RegexAnswer__Group__3__Impl ;
    public final void rule__RegexAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2374:1: ( rule__RegexAnswer__Group__3__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2375:2: rule__RegexAnswer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__Group__3__Impl_in_rule__RegexAnswer__Group__34909);
            rule__RegexAnswer__Group__3__Impl();

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
    // $ANTLR end "rule__RegexAnswer__Group__3"


    // $ANTLR start "rule__RegexAnswer__Group__3__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2381:1: rule__RegexAnswer__Group__3__Impl : ( ( rule__RegexAnswer__IgnoreCaseAssignment_3 )? ) ;
    public final void rule__RegexAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2385:1: ( ( ( rule__RegexAnswer__IgnoreCaseAssignment_3 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2386:1: ( ( rule__RegexAnswer__IgnoreCaseAssignment_3 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2386:1: ( ( rule__RegexAnswer__IgnoreCaseAssignment_3 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2387:1: ( rule__RegexAnswer__IgnoreCaseAssignment_3 )?
            {
             before(grammarAccess.getRegexAnswerAccess().getIgnoreCaseAssignment_3()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2388:1: ( rule__RegexAnswer__IgnoreCaseAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2388:2: rule__RegexAnswer__IgnoreCaseAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__RegexAnswer__IgnoreCaseAssignment_3_in_rule__RegexAnswer__Group__3__Impl4936);
                    rule__RegexAnswer__IgnoreCaseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegexAnswerAccess().getIgnoreCaseAssignment_3()); 

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
    // $ANTLR end "rule__RegexAnswer__Group__3__Impl"


    // $ANTLR start "rule__NumberAnswer__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2406:1: rule__NumberAnswer__Group__0 : rule__NumberAnswer__Group__0__Impl rule__NumberAnswer__Group__1 ;
    public final void rule__NumberAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2410:1: ( rule__NumberAnswer__Group__0__Impl rule__NumberAnswer__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2411:2: rule__NumberAnswer__Group__0__Impl rule__NumberAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group__0__Impl_in_rule__NumberAnswer__Group__04975);
            rule__NumberAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group__1_in_rule__NumberAnswer__Group__04978);
            rule__NumberAnswer__Group__1();

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
    // $ANTLR end "rule__NumberAnswer__Group__0"


    // $ANTLR start "rule__NumberAnswer__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2418:1: rule__NumberAnswer__Group__0__Impl : ( ( rule__NumberAnswer__ValueAssignment_0 ) ) ;
    public final void rule__NumberAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2422:1: ( ( ( rule__NumberAnswer__ValueAssignment_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2423:1: ( ( rule__NumberAnswer__ValueAssignment_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2423:1: ( ( rule__NumberAnswer__ValueAssignment_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2424:1: ( rule__NumberAnswer__ValueAssignment_0 )
            {
             before(grammarAccess.getNumberAnswerAccess().getValueAssignment_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2425:1: ( rule__NumberAnswer__ValueAssignment_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2425:2: rule__NumberAnswer__ValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__ValueAssignment_0_in_rule__NumberAnswer__Group__0__Impl5005);
            rule__NumberAnswer__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__NumberAnswer__Group__0__Impl"


    // $ANTLR start "rule__NumberAnswer__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2435:1: rule__NumberAnswer__Group__1 : rule__NumberAnswer__Group__1__Impl ;
    public final void rule__NumberAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2439:1: ( rule__NumberAnswer__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2440:2: rule__NumberAnswer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group__1__Impl_in_rule__NumberAnswer__Group__15035);
            rule__NumberAnswer__Group__1__Impl();

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
    // $ANTLR end "rule__NumberAnswer__Group__1"


    // $ANTLR start "rule__NumberAnswer__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2446:1: rule__NumberAnswer__Group__1__Impl : ( ( rule__NumberAnswer__Group_1__0 )? ) ;
    public final void rule__NumberAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2450:1: ( ( ( rule__NumberAnswer__Group_1__0 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2451:1: ( ( rule__NumberAnswer__Group_1__0 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2451:1: ( ( rule__NumberAnswer__Group_1__0 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2452:1: ( rule__NumberAnswer__Group_1__0 )?
            {
             before(grammarAccess.getNumberAnswerAccess().getGroup_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2453:1: ( rule__NumberAnswer__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2453:2: rule__NumberAnswer__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_1__0_in_rule__NumberAnswer__Group__1__Impl5062);
                    rule__NumberAnswer__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAnswerAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NumberAnswer__Group__1__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_1__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2467:1: rule__NumberAnswer__Group_1__0 : rule__NumberAnswer__Group_1__0__Impl rule__NumberAnswer__Group_1__1 ;
    public final void rule__NumberAnswer__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2471:1: ( rule__NumberAnswer__Group_1__0__Impl rule__NumberAnswer__Group_1__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2472:2: rule__NumberAnswer__Group_1__0__Impl rule__NumberAnswer__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_1__0__Impl_in_rule__NumberAnswer__Group_1__05097);
            rule__NumberAnswer__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_1__1_in_rule__NumberAnswer__Group_1__05100);
            rule__NumberAnswer__Group_1__1();

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
    // $ANTLR end "rule__NumberAnswer__Group_1__0"


    // $ANTLR start "rule__NumberAnswer__Group_1__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2479:1: rule__NumberAnswer__Group_1__0__Impl : ( '+-' ) ;
    public final void rule__NumberAnswer__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2483:1: ( ( '+-' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2484:1: ( '+-' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2484:1: ( '+-' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2485:1: '+-'
            {
             before(grammarAccess.getNumberAnswerAccess().getPlusSignHyphenMinusKeyword_1_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__NumberAnswer__Group_1__0__Impl5128); 
             after(grammarAccess.getNumberAnswerAccess().getPlusSignHyphenMinusKeyword_1_0()); 

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
    // $ANTLR end "rule__NumberAnswer__Group_1__0__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_1__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2498:1: rule__NumberAnswer__Group_1__1 : rule__NumberAnswer__Group_1__1__Impl ;
    public final void rule__NumberAnswer__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2502:1: ( rule__NumberAnswer__Group_1__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2503:2: rule__NumberAnswer__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_1__1__Impl_in_rule__NumberAnswer__Group_1__15159);
            rule__NumberAnswer__Group_1__1__Impl();

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
    // $ANTLR end "rule__NumberAnswer__Group_1__1"


    // $ANTLR start "rule__NumberAnswer__Group_1__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2509:1: rule__NumberAnswer__Group_1__1__Impl : ( ( rule__NumberAnswer__ErrorMarginAssignment_1_1 ) ) ;
    public final void rule__NumberAnswer__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2513:1: ( ( ( rule__NumberAnswer__ErrorMarginAssignment_1_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2514:1: ( ( rule__NumberAnswer__ErrorMarginAssignment_1_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2514:1: ( ( rule__NumberAnswer__ErrorMarginAssignment_1_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2515:1: ( rule__NumberAnswer__ErrorMarginAssignment_1_1 )
            {
             before(grammarAccess.getNumberAnswerAccess().getErrorMarginAssignment_1_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2516:1: ( rule__NumberAnswer__ErrorMarginAssignment_1_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2516:2: rule__NumberAnswer__ErrorMarginAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__ErrorMarginAssignment_1_1_in_rule__NumberAnswer__Group_1__1__Impl5186);
            rule__NumberAnswer__ErrorMarginAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getErrorMarginAssignment_1_1()); 

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
    // $ANTLR end "rule__NumberAnswer__Group_1__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2530:1: rule__EDoubleObject__Group__0 : rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 ;
    public final void rule__EDoubleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2534:1: ( rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2535:2: rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDoubleObject__Group__0__Impl_in_rule__EDoubleObject__Group__05220);
            rule__EDoubleObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDoubleObject__Group__1_in_rule__EDoubleObject__Group__05223);
            rule__EDoubleObject__Group__1();

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
    // $ANTLR end "rule__EDoubleObject__Group__0"


    // $ANTLR start "rule__EDoubleObject__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2542:1: rule__EDoubleObject__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2546:1: ( ( RULE_INT ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2547:1: ( RULE_INT )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2547:1: ( RULE_INT )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2548:1: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDoubleObject__Group__0__Impl5250); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__0__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2559:1: rule__EDoubleObject__Group__1 : rule__EDoubleObject__Group__1__Impl ;
    public final void rule__EDoubleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2563:1: ( rule__EDoubleObject__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2564:2: rule__EDoubleObject__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDoubleObject__Group__1__Impl_in_rule__EDoubleObject__Group__15279);
            rule__EDoubleObject__Group__1__Impl();

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
    // $ANTLR end "rule__EDoubleObject__Group__1"


    // $ANTLR start "rule__EDoubleObject__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2570:1: rule__EDoubleObject__Group__1__Impl : ( ( rule__EDoubleObject__Group_1__0 )? ) ;
    public final void rule__EDoubleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2574:1: ( ( ( rule__EDoubleObject__Group_1__0 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2575:1: ( ( rule__EDoubleObject__Group_1__0 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2575:1: ( ( rule__EDoubleObject__Group_1__0 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2576:1: ( rule__EDoubleObject__Group_1__0 )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getGroup_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2577:1: ( rule__EDoubleObject__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2577:2: rule__EDoubleObject__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDoubleObject__Group_1__0_in_rule__EDoubleObject__Group__1__Impl5306);
                    rule__EDoubleObject__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_1__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2591:1: rule__EDoubleObject__Group_1__0 : rule__EDoubleObject__Group_1__0__Impl rule__EDoubleObject__Group_1__1 ;
    public final void rule__EDoubleObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2595:1: ( rule__EDoubleObject__Group_1__0__Impl rule__EDoubleObject__Group_1__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2596:2: rule__EDoubleObject__Group_1__0__Impl rule__EDoubleObject__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDoubleObject__Group_1__0__Impl_in_rule__EDoubleObject__Group_1__05341);
            rule__EDoubleObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDoubleObject__Group_1__1_in_rule__EDoubleObject__Group_1__05344);
            rule__EDoubleObject__Group_1__1();

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
    // $ANTLR end "rule__EDoubleObject__Group_1__0"


    // $ANTLR start "rule__EDoubleObject__Group_1__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2603:1: rule__EDoubleObject__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EDoubleObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2607:1: ( ( '.' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2608:1: ( '.' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2608:1: ( '.' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2609:1: '.'
            {
             before(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__EDoubleObject__Group_1__0__Impl5372); 
             after(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_1__0__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_1__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2622:1: rule__EDoubleObject__Group_1__1 : rule__EDoubleObject__Group_1__1__Impl ;
    public final void rule__EDoubleObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2626:1: ( rule__EDoubleObject__Group_1__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2627:2: rule__EDoubleObject__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDoubleObject__Group_1__1__Impl_in_rule__EDoubleObject__Group_1__15403);
            rule__EDoubleObject__Group_1__1__Impl();

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
    // $ANTLR end "rule__EDoubleObject__Group_1__1"


    // $ANTLR start "rule__EDoubleObject__Group_1__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2633:1: rule__EDoubleObject__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2637:1: ( ( RULE_INT ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2638:1: ( RULE_INT )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2638:1: ( RULE_INT )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2639:1: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDoubleObject__Group_1__1__Impl5430); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanAnswer__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2654:1: rule__BooleanAnswer__Group__0 : rule__BooleanAnswer__Group__0__Impl rule__BooleanAnswer__Group__1 ;
    public final void rule__BooleanAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2658:1: ( rule__BooleanAnswer__Group__0__Impl rule__BooleanAnswer__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2659:2: rule__BooleanAnswer__Group__0__Impl rule__BooleanAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAnswer__Group__0__Impl_in_rule__BooleanAnswer__Group__05463);
            rule__BooleanAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanAnswer__Group__1_in_rule__BooleanAnswer__Group__05466);
            rule__BooleanAnswer__Group__1();

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
    // $ANTLR end "rule__BooleanAnswer__Group__0"


    // $ANTLR start "rule__BooleanAnswer__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2666:1: rule__BooleanAnswer__Group__0__Impl : ( () ) ;
    public final void rule__BooleanAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2670:1: ( ( () ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2671:1: ( () )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2671:1: ( () )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2672:1: ()
            {
             before(grammarAccess.getBooleanAnswerAccess().getBooleanAnswerAction_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2673:1: ()
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2675:1: 
            {
            }

             after(grammarAccess.getBooleanAnswerAccess().getBooleanAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAnswer__Group__0__Impl"


    // $ANTLR start "rule__BooleanAnswer__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2685:1: rule__BooleanAnswer__Group__1 : rule__BooleanAnswer__Group__1__Impl ;
    public final void rule__BooleanAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2689:1: ( rule__BooleanAnswer__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2690:2: rule__BooleanAnswer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAnswer__Group__1__Impl_in_rule__BooleanAnswer__Group__15524);
            rule__BooleanAnswer__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanAnswer__Group__1"


    // $ANTLR start "rule__BooleanAnswer__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2696:1: rule__BooleanAnswer__Group__1__Impl : ( ( rule__BooleanAnswer__Alternatives_1 ) ) ;
    public final void rule__BooleanAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2700:1: ( ( ( rule__BooleanAnswer__Alternatives_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2701:1: ( ( rule__BooleanAnswer__Alternatives_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2701:1: ( ( rule__BooleanAnswer__Alternatives_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2702:1: ( rule__BooleanAnswer__Alternatives_1 )
            {
             before(grammarAccess.getBooleanAnswerAccess().getAlternatives_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2703:1: ( rule__BooleanAnswer__Alternatives_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2703:2: rule__BooleanAnswer__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAnswer__Alternatives_1_in_rule__BooleanAnswer__Group__1__Impl5551);
            rule__BooleanAnswer__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAnswerAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__BooleanAnswer__Group__1__Impl"


    // $ANTLR start "rule__SingleBoxOption__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2717:1: rule__SingleBoxOption__Group__0 : rule__SingleBoxOption__Group__0__Impl rule__SingleBoxOption__Group__1 ;
    public final void rule__SingleBoxOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2721:1: ( rule__SingleBoxOption__Group__0__Impl rule__SingleBoxOption__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2722:2: rule__SingleBoxOption__Group__0__Impl rule__SingleBoxOption__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__Group__0__Impl_in_rule__SingleBoxOption__Group__05585);
            rule__SingleBoxOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__Group__1_in_rule__SingleBoxOption__Group__05588);
            rule__SingleBoxOption__Group__1();

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
    // $ANTLR end "rule__SingleBoxOption__Group__0"


    // $ANTLR start "rule__SingleBoxOption__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2729:1: rule__SingleBoxOption__Group__0__Impl : ( '(' ) ;
    public final void rule__SingleBoxOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2733:1: ( ( '(' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2734:1: ( '(' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2734:1: ( '(' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2735:1: '('
            {
             before(grammarAccess.getSingleBoxOptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SingleBoxOption__Group__0__Impl5616); 
             after(grammarAccess.getSingleBoxOptionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__SingleBoxOption__Group__0__Impl"


    // $ANTLR start "rule__SingleBoxOption__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2748:1: rule__SingleBoxOption__Group__1 : rule__SingleBoxOption__Group__1__Impl rule__SingleBoxOption__Group__2 ;
    public final void rule__SingleBoxOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2752:1: ( rule__SingleBoxOption__Group__1__Impl rule__SingleBoxOption__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2753:2: rule__SingleBoxOption__Group__1__Impl rule__SingleBoxOption__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__Group__1__Impl_in_rule__SingleBoxOption__Group__15647);
            rule__SingleBoxOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__Group__2_in_rule__SingleBoxOption__Group__15650);
            rule__SingleBoxOption__Group__2();

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
    // $ANTLR end "rule__SingleBoxOption__Group__1"


    // $ANTLR start "rule__SingleBoxOption__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2760:1: rule__SingleBoxOption__Group__1__Impl : ( ( rule__SingleBoxOption__CorrectAssignment_1 )? ) ;
    public final void rule__SingleBoxOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2764:1: ( ( ( rule__SingleBoxOption__CorrectAssignment_1 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2765:1: ( ( rule__SingleBoxOption__CorrectAssignment_1 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2765:1: ( ( rule__SingleBoxOption__CorrectAssignment_1 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2766:1: ( rule__SingleBoxOption__CorrectAssignment_1 )?
            {
             before(grammarAccess.getSingleBoxOptionAccess().getCorrectAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2767:1: ( rule__SingleBoxOption__CorrectAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2767:2: rule__SingleBoxOption__CorrectAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__CorrectAssignment_1_in_rule__SingleBoxOption__Group__1__Impl5677);
                    rule__SingleBoxOption__CorrectAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleBoxOptionAccess().getCorrectAssignment_1()); 

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
    // $ANTLR end "rule__SingleBoxOption__Group__1__Impl"


    // $ANTLR start "rule__SingleBoxOption__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2777:1: rule__SingleBoxOption__Group__2 : rule__SingleBoxOption__Group__2__Impl rule__SingleBoxOption__Group__3 ;
    public final void rule__SingleBoxOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2781:1: ( rule__SingleBoxOption__Group__2__Impl rule__SingleBoxOption__Group__3 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2782:2: rule__SingleBoxOption__Group__2__Impl rule__SingleBoxOption__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__Group__2__Impl_in_rule__SingleBoxOption__Group__25708);
            rule__SingleBoxOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__Group__3_in_rule__SingleBoxOption__Group__25711);
            rule__SingleBoxOption__Group__3();

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
    // $ANTLR end "rule__SingleBoxOption__Group__2"


    // $ANTLR start "rule__SingleBoxOption__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2789:1: rule__SingleBoxOption__Group__2__Impl : ( ')' ) ;
    public final void rule__SingleBoxOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2793:1: ( ( ')' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2794:1: ( ')' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2794:1: ( ')' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2795:1: ')'
            {
             before(grammarAccess.getSingleBoxOptionAccess().getRightParenthesisKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__SingleBoxOption__Group__2__Impl5739); 
             after(grammarAccess.getSingleBoxOptionAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__SingleBoxOption__Group__2__Impl"


    // $ANTLR start "rule__SingleBoxOption__Group__3"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2808:1: rule__SingleBoxOption__Group__3 : rule__SingleBoxOption__Group__3__Impl ;
    public final void rule__SingleBoxOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2812:1: ( rule__SingleBoxOption__Group__3__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2813:2: rule__SingleBoxOption__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__Group__3__Impl_in_rule__SingleBoxOption__Group__35770);
            rule__SingleBoxOption__Group__3__Impl();

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
    // $ANTLR end "rule__SingleBoxOption__Group__3"


    // $ANTLR start "rule__SingleBoxOption__Group__3__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2819:1: rule__SingleBoxOption__Group__3__Impl : ( ( rule__SingleBoxOption__OptionAssignment_3 ) ) ;
    public final void rule__SingleBoxOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2823:1: ( ( ( rule__SingleBoxOption__OptionAssignment_3 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2824:1: ( ( rule__SingleBoxOption__OptionAssignment_3 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2824:1: ( ( rule__SingleBoxOption__OptionAssignment_3 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2825:1: ( rule__SingleBoxOption__OptionAssignment_3 )
            {
             before(grammarAccess.getSingleBoxOptionAccess().getOptionAssignment_3()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2826:1: ( rule__SingleBoxOption__OptionAssignment_3 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2826:2: rule__SingleBoxOption__OptionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleBoxOption__OptionAssignment_3_in_rule__SingleBoxOption__Group__3__Impl5797);
            rule__SingleBoxOption__OptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleBoxOptionAccess().getOptionAssignment_3()); 

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
    // $ANTLR end "rule__SingleBoxOption__Group__3__Impl"


    // $ANTLR start "rule__SingleListOption__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2844:1: rule__SingleListOption__Group__0 : rule__SingleListOption__Group__0__Impl rule__SingleListOption__Group__1 ;
    public final void rule__SingleListOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2848:1: ( rule__SingleListOption__Group__0__Impl rule__SingleListOption__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2849:2: rule__SingleListOption__Group__0__Impl rule__SingleListOption__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleListOption__Group__0__Impl_in_rule__SingleListOption__Group__05835);
            rule__SingleListOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleListOption__Group__1_in_rule__SingleListOption__Group__05838);
            rule__SingleListOption__Group__1();

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
    // $ANTLR end "rule__SingleListOption__Group__0"


    // $ANTLR start "rule__SingleListOption__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2856:1: rule__SingleListOption__Group__0__Impl : ( ( rule__SingleListOption__Alternatives_0 ) ) ;
    public final void rule__SingleListOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2860:1: ( ( ( rule__SingleListOption__Alternatives_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2861:1: ( ( rule__SingleListOption__Alternatives_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2861:1: ( ( rule__SingleListOption__Alternatives_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2862:1: ( rule__SingleListOption__Alternatives_0 )
            {
             before(grammarAccess.getSingleListOptionAccess().getAlternatives_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2863:1: ( rule__SingleListOption__Alternatives_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2863:2: rule__SingleListOption__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleListOption__Alternatives_0_in_rule__SingleListOption__Group__0__Impl5865);
            rule__SingleListOption__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleListOptionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__SingleListOption__Group__0__Impl"


    // $ANTLR start "rule__SingleListOption__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2873:1: rule__SingleListOption__Group__1 : rule__SingleListOption__Group__1__Impl ;
    public final void rule__SingleListOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2877:1: ( rule__SingleListOption__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2878:2: rule__SingleListOption__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleListOption__Group__1__Impl_in_rule__SingleListOption__Group__15895);
            rule__SingleListOption__Group__1__Impl();

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
    // $ANTLR end "rule__SingleListOption__Group__1"


    // $ANTLR start "rule__SingleListOption__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2884:1: rule__SingleListOption__Group__1__Impl : ( ( rule__SingleListOption__OptionAssignment_1 ) ) ;
    public final void rule__SingleListOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2888:1: ( ( ( rule__SingleListOption__OptionAssignment_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2889:1: ( ( rule__SingleListOption__OptionAssignment_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2889:1: ( ( rule__SingleListOption__OptionAssignment_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2890:1: ( rule__SingleListOption__OptionAssignment_1 )
            {
             before(grammarAccess.getSingleListOptionAccess().getOptionAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2891:1: ( rule__SingleListOption__OptionAssignment_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2891:2: rule__SingleListOption__OptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleListOption__OptionAssignment_1_in_rule__SingleListOption__Group__1__Impl5922);
            rule__SingleListOption__OptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleListOptionAccess().getOptionAssignment_1()); 

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
    // $ANTLR end "rule__SingleListOption__Group__1__Impl"


    // $ANTLR start "rule__ManyOption__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2905:1: rule__ManyOption__Group__0 : rule__ManyOption__Group__0__Impl rule__ManyOption__Group__1 ;
    public final void rule__ManyOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2909:1: ( rule__ManyOption__Group__0__Impl rule__ManyOption__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2910:2: rule__ManyOption__Group__0__Impl rule__ManyOption__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ManyOption__Group__0__Impl_in_rule__ManyOption__Group__05956);
            rule__ManyOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ManyOption__Group__1_in_rule__ManyOption__Group__05959);
            rule__ManyOption__Group__1();

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
    // $ANTLR end "rule__ManyOption__Group__0"


    // $ANTLR start "rule__ManyOption__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2917:1: rule__ManyOption__Group__0__Impl : ( '[' ) ;
    public final void rule__ManyOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2921:1: ( ( '[' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2922:1: ( '[' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2922:1: ( '[' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2923:1: '['
            {
             before(grammarAccess.getManyOptionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ManyOption__Group__0__Impl5987); 
             after(grammarAccess.getManyOptionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__ManyOption__Group__0__Impl"


    // $ANTLR start "rule__ManyOption__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2936:1: rule__ManyOption__Group__1 : rule__ManyOption__Group__1__Impl rule__ManyOption__Group__2 ;
    public final void rule__ManyOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2940:1: ( rule__ManyOption__Group__1__Impl rule__ManyOption__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2941:2: rule__ManyOption__Group__1__Impl rule__ManyOption__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ManyOption__Group__1__Impl_in_rule__ManyOption__Group__16018);
            rule__ManyOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ManyOption__Group__2_in_rule__ManyOption__Group__16021);
            rule__ManyOption__Group__2();

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
    // $ANTLR end "rule__ManyOption__Group__1"


    // $ANTLR start "rule__ManyOption__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2948:1: rule__ManyOption__Group__1__Impl : ( ( rule__ManyOption__CorrectAssignment_1 )? ) ;
    public final void rule__ManyOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2952:1: ( ( ( rule__ManyOption__CorrectAssignment_1 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2953:1: ( ( rule__ManyOption__CorrectAssignment_1 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2953:1: ( ( rule__ManyOption__CorrectAssignment_1 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2954:1: ( rule__ManyOption__CorrectAssignment_1 )?
            {
             before(grammarAccess.getManyOptionAccess().getCorrectAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2955:1: ( rule__ManyOption__CorrectAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2955:2: rule__ManyOption__CorrectAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ManyOption__CorrectAssignment_1_in_rule__ManyOption__Group__1__Impl6048);
                    rule__ManyOption__CorrectAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManyOptionAccess().getCorrectAssignment_1()); 

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
    // $ANTLR end "rule__ManyOption__Group__1__Impl"


    // $ANTLR start "rule__ManyOption__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2965:1: rule__ManyOption__Group__2 : rule__ManyOption__Group__2__Impl rule__ManyOption__Group__3 ;
    public final void rule__ManyOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2969:1: ( rule__ManyOption__Group__2__Impl rule__ManyOption__Group__3 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2970:2: rule__ManyOption__Group__2__Impl rule__ManyOption__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ManyOption__Group__2__Impl_in_rule__ManyOption__Group__26079);
            rule__ManyOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ManyOption__Group__3_in_rule__ManyOption__Group__26082);
            rule__ManyOption__Group__3();

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
    // $ANTLR end "rule__ManyOption__Group__2"


    // $ANTLR start "rule__ManyOption__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2977:1: rule__ManyOption__Group__2__Impl : ( ']' ) ;
    public final void rule__ManyOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2981:1: ( ( ']' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2982:1: ( ']' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2982:1: ( ']' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2983:1: ']'
            {
             before(grammarAccess.getManyOptionAccess().getRightSquareBracketKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ManyOption__Group__2__Impl6110); 
             after(grammarAccess.getManyOptionAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__ManyOption__Group__2__Impl"


    // $ANTLR start "rule__ManyOption__Group__3"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:2996:1: rule__ManyOption__Group__3 : rule__ManyOption__Group__3__Impl ;
    public final void rule__ManyOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3000:1: ( rule__ManyOption__Group__3__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3001:2: rule__ManyOption__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ManyOption__Group__3__Impl_in_rule__ManyOption__Group__36141);
            rule__ManyOption__Group__3__Impl();

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
    // $ANTLR end "rule__ManyOption__Group__3"


    // $ANTLR start "rule__ManyOption__Group__3__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3007:1: rule__ManyOption__Group__3__Impl : ( ( rule__ManyOption__OptionAssignment_3 ) ) ;
    public final void rule__ManyOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3011:1: ( ( ( rule__ManyOption__OptionAssignment_3 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3012:1: ( ( rule__ManyOption__OptionAssignment_3 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3012:1: ( ( rule__ManyOption__OptionAssignment_3 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3013:1: ( rule__ManyOption__OptionAssignment_3 )
            {
             before(grammarAccess.getManyOptionAccess().getOptionAssignment_3()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3014:1: ( rule__ManyOption__OptionAssignment_3 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3014:2: rule__ManyOption__OptionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ManyOption__OptionAssignment_3_in_rule__ManyOption__Group__3__Impl6168);
            rule__ManyOption__OptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManyOptionAccess().getOptionAssignment_3()); 

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
    // $ANTLR end "rule__ManyOption__Group__3__Impl"


    // $ANTLR start "rule__Xml__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3032:1: rule__Xml__Group__0 : rule__Xml__Group__0__Impl rule__Xml__Group__1 ;
    public final void rule__Xml__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3036:1: ( rule__Xml__Group__0__Impl rule__Xml__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3037:2: rule__Xml__Group__0__Impl rule__Xml__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Xml__Group__0__Impl_in_rule__Xml__Group__06206);
            rule__Xml__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Xml__Group__1_in_rule__Xml__Group__06209);
            rule__Xml__Group__1();

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
    // $ANTLR end "rule__Xml__Group__0"


    // $ANTLR start "rule__Xml__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3044:1: rule__Xml__Group__0__Impl : ( '<<' ) ;
    public final void rule__Xml__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3048:1: ( ( '<<' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3049:1: ( '<<' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3049:1: ( '<<' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3050:1: '<<'
            {
             before(grammarAccess.getXmlAccess().getLessThanSignLessThanSignKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Xml__Group__0__Impl6237); 
             after(grammarAccess.getXmlAccess().getLessThanSignLessThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Xml__Group__0__Impl"


    // $ANTLR start "rule__Xml__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3063:1: rule__Xml__Group__1 : rule__Xml__Group__1__Impl rule__Xml__Group__2 ;
    public final void rule__Xml__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3067:1: ( rule__Xml__Group__1__Impl rule__Xml__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3068:2: rule__Xml__Group__1__Impl rule__Xml__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Xml__Group__1__Impl_in_rule__Xml__Group__16268);
            rule__Xml__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Xml__Group__2_in_rule__Xml__Group__16271);
            rule__Xml__Group__2();

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
    // $ANTLR end "rule__Xml__Group__1"


    // $ANTLR start "rule__Xml__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3075:1: rule__Xml__Group__1__Impl : ( ( rule__Xml__ElementAssignment_1 ) ) ;
    public final void rule__Xml__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3079:1: ( ( ( rule__Xml__ElementAssignment_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3080:1: ( ( rule__Xml__ElementAssignment_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3080:1: ( ( rule__Xml__ElementAssignment_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3081:1: ( rule__Xml__ElementAssignment_1 )
            {
             before(grammarAccess.getXmlAccess().getElementAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3082:1: ( rule__Xml__ElementAssignment_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3082:2: rule__Xml__ElementAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Xml__ElementAssignment_1_in_rule__Xml__Group__1__Impl6298);
            rule__Xml__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlAccess().getElementAssignment_1()); 

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
    // $ANTLR end "rule__Xml__Group__1__Impl"


    // $ANTLR start "rule__Xml__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3092:1: rule__Xml__Group__2 : rule__Xml__Group__2__Impl ;
    public final void rule__Xml__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3096:1: ( rule__Xml__Group__2__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3097:2: rule__Xml__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Xml__Group__2__Impl_in_rule__Xml__Group__26328);
            rule__Xml__Group__2__Impl();

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
    // $ANTLR end "rule__Xml__Group__2"


    // $ANTLR start "rule__Xml__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3103:1: rule__Xml__Group__2__Impl : ( '>>' ) ;
    public final void rule__Xml__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3107:1: ( ( '>>' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3108:1: ( '>>' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3108:1: ( '>>' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3109:1: '>>'
            {
             before(grammarAccess.getXmlAccess().getGreaterThanSignGreaterThanSignKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Xml__Group__2__Impl6356); 
             after(grammarAccess.getXmlAccess().getGreaterThanSignGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Xml__Group__2__Impl"


    // $ANTLR start "rule__XmlContents__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3128:1: rule__XmlContents__Group__0 : rule__XmlContents__Group__0__Impl rule__XmlContents__Group__1 ;
    public final void rule__XmlContents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3132:1: ( rule__XmlContents__Group__0__Impl rule__XmlContents__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3133:2: rule__XmlContents__Group__0__Impl rule__XmlContents__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlContents__Group__0__Impl_in_rule__XmlContents__Group__06393);
            rule__XmlContents__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlContents__Group__1_in_rule__XmlContents__Group__06396);
            rule__XmlContents__Group__1();

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
    // $ANTLR end "rule__XmlContents__Group__0"


    // $ANTLR start "rule__XmlContents__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3140:1: rule__XmlContents__Group__0__Impl : ( ( rule__XmlContents__ElementAssignment_0 ) ) ;
    public final void rule__XmlContents__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3144:1: ( ( ( rule__XmlContents__ElementAssignment_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3145:1: ( ( rule__XmlContents__ElementAssignment_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3145:1: ( ( rule__XmlContents__ElementAssignment_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3146:1: ( rule__XmlContents__ElementAssignment_0 )
            {
             before(grammarAccess.getXmlContentsAccess().getElementAssignment_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3147:1: ( rule__XmlContents__ElementAssignment_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3147:2: rule__XmlContents__ElementAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlContents__ElementAssignment_0_in_rule__XmlContents__Group__0__Impl6423);
            rule__XmlContents__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXmlContentsAccess().getElementAssignment_0()); 

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
    // $ANTLR end "rule__XmlContents__Group__0__Impl"


    // $ANTLR start "rule__XmlContents__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3157:1: rule__XmlContents__Group__1 : rule__XmlContents__Group__1__Impl ;
    public final void rule__XmlContents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3161:1: ( rule__XmlContents__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3162:2: rule__XmlContents__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlContents__Group__1__Impl_in_rule__XmlContents__Group__16453);
            rule__XmlContents__Group__1__Impl();

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
    // $ANTLR end "rule__XmlContents__Group__1"


    // $ANTLR start "rule__XmlContents__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3168:1: rule__XmlContents__Group__1__Impl : ( ( rule__XmlContents__PostAssignment_1 ) ) ;
    public final void rule__XmlContents__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3172:1: ( ( ( rule__XmlContents__PostAssignment_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3173:1: ( ( rule__XmlContents__PostAssignment_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3173:1: ( ( rule__XmlContents__PostAssignment_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3174:1: ( rule__XmlContents__PostAssignment_1 )
            {
             before(grammarAccess.getXmlContentsAccess().getPostAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3175:1: ( rule__XmlContents__PostAssignment_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3175:2: rule__XmlContents__PostAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlContents__PostAssignment_1_in_rule__XmlContents__Group__1__Impl6480);
            rule__XmlContents__PostAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlContentsAccess().getPostAssignment_1()); 

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
    // $ANTLR end "rule__XmlContents__Group__1__Impl"


    // $ANTLR start "rule__XmlPIAnswerElement__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3189:1: rule__XmlPIAnswerElement__Group__0 : rule__XmlPIAnswerElement__Group__0__Impl rule__XmlPIAnswerElement__Group__1 ;
    public final void rule__XmlPIAnswerElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3193:1: ( rule__XmlPIAnswerElement__Group__0__Impl rule__XmlPIAnswerElement__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3194:2: rule__XmlPIAnswerElement__Group__0__Impl rule__XmlPIAnswerElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlPIAnswerElement__Group__0__Impl_in_rule__XmlPIAnswerElement__Group__06514);
            rule__XmlPIAnswerElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlPIAnswerElement__Group__1_in_rule__XmlPIAnswerElement__Group__06517);
            rule__XmlPIAnswerElement__Group__1();

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
    // $ANTLR end "rule__XmlPIAnswerElement__Group__0"


    // $ANTLR start "rule__XmlPIAnswerElement__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3201:1: rule__XmlPIAnswerElement__Group__0__Impl : ( '?' ) ;
    public final void rule__XmlPIAnswerElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3205:1: ( ( '?' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3206:1: ( '?' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3206:1: ( '?' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3207:1: '?'
            {
             before(grammarAccess.getXmlPIAnswerElementAccess().getQuestionMarkKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__XmlPIAnswerElement__Group__0__Impl6545); 
             after(grammarAccess.getXmlPIAnswerElementAccess().getQuestionMarkKeyword_0()); 

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
    // $ANTLR end "rule__XmlPIAnswerElement__Group__0__Impl"


    // $ANTLR start "rule__XmlPIAnswerElement__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3220:1: rule__XmlPIAnswerElement__Group__1 : rule__XmlPIAnswerElement__Group__1__Impl rule__XmlPIAnswerElement__Group__2 ;
    public final void rule__XmlPIAnswerElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3224:1: ( rule__XmlPIAnswerElement__Group__1__Impl rule__XmlPIAnswerElement__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3225:2: rule__XmlPIAnswerElement__Group__1__Impl rule__XmlPIAnswerElement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlPIAnswerElement__Group__1__Impl_in_rule__XmlPIAnswerElement__Group__16576);
            rule__XmlPIAnswerElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlPIAnswerElement__Group__2_in_rule__XmlPIAnswerElement__Group__16579);
            rule__XmlPIAnswerElement__Group__2();

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
    // $ANTLR end "rule__XmlPIAnswerElement__Group__1"


    // $ANTLR start "rule__XmlPIAnswerElement__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3232:1: rule__XmlPIAnswerElement__Group__1__Impl : ( ( rule__XmlPIAnswerElement__AnswerAssignment_1 ) ) ;
    public final void rule__XmlPIAnswerElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3236:1: ( ( ( rule__XmlPIAnswerElement__AnswerAssignment_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3237:1: ( ( rule__XmlPIAnswerElement__AnswerAssignment_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3237:1: ( ( rule__XmlPIAnswerElement__AnswerAssignment_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3238:1: ( rule__XmlPIAnswerElement__AnswerAssignment_1 )
            {
             before(grammarAccess.getXmlPIAnswerElementAccess().getAnswerAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3239:1: ( rule__XmlPIAnswerElement__AnswerAssignment_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3239:2: rule__XmlPIAnswerElement__AnswerAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlPIAnswerElement__AnswerAssignment_1_in_rule__XmlPIAnswerElement__Group__1__Impl6606);
            rule__XmlPIAnswerElement__AnswerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlPIAnswerElementAccess().getAnswerAssignment_1()); 

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
    // $ANTLR end "rule__XmlPIAnswerElement__Group__1__Impl"


    // $ANTLR start "rule__XmlPIAnswerElement__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3249:1: rule__XmlPIAnswerElement__Group__2 : rule__XmlPIAnswerElement__Group__2__Impl ;
    public final void rule__XmlPIAnswerElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3253:1: ( rule__XmlPIAnswerElement__Group__2__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3254:2: rule__XmlPIAnswerElement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlPIAnswerElement__Group__2__Impl_in_rule__XmlPIAnswerElement__Group__26636);
            rule__XmlPIAnswerElement__Group__2__Impl();

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
    // $ANTLR end "rule__XmlPIAnswerElement__Group__2"


    // $ANTLR start "rule__XmlPIAnswerElement__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3260:1: rule__XmlPIAnswerElement__Group__2__Impl : ( '?' ) ;
    public final void rule__XmlPIAnswerElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3264:1: ( ( '?' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3265:1: ( '?' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3265:1: ( '?' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3266:1: '?'
            {
             before(grammarAccess.getXmlPIAnswerElementAccess().getQuestionMarkKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__XmlPIAnswerElement__Group__2__Impl6664); 
             after(grammarAccess.getXmlPIAnswerElementAccess().getQuestionMarkKeyword_2()); 

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
    // $ANTLR end "rule__XmlPIAnswerElement__Group__2__Impl"


    // $ANTLR start "rule__XmlTagElement__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3285:1: rule__XmlTagElement__Group__0 : rule__XmlTagElement__Group__0__Impl rule__XmlTagElement__Group__1 ;
    public final void rule__XmlTagElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3289:1: ( rule__XmlTagElement__Group__0__Impl rule__XmlTagElement__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3290:2: rule__XmlTagElement__Group__0__Impl rule__XmlTagElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group__0__Impl_in_rule__XmlTagElement__Group__06701);
            rule__XmlTagElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group__1_in_rule__XmlTagElement__Group__06704);
            rule__XmlTagElement__Group__1();

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
    // $ANTLR end "rule__XmlTagElement__Group__0"


    // $ANTLR start "rule__XmlTagElement__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3297:1: rule__XmlTagElement__Group__0__Impl : ( ( rule__XmlTagElement__StartTagAssignment_0 ) ) ;
    public final void rule__XmlTagElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3301:1: ( ( ( rule__XmlTagElement__StartTagAssignment_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3302:1: ( ( rule__XmlTagElement__StartTagAssignment_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3302:1: ( ( rule__XmlTagElement__StartTagAssignment_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3303:1: ( rule__XmlTagElement__StartTagAssignment_0 )
            {
             before(grammarAccess.getXmlTagElementAccess().getStartTagAssignment_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3304:1: ( rule__XmlTagElement__StartTagAssignment_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3304:2: rule__XmlTagElement__StartTagAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__StartTagAssignment_0_in_rule__XmlTagElement__Group__0__Impl6731);
            rule__XmlTagElement__StartTagAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXmlTagElementAccess().getStartTagAssignment_0()); 

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
    // $ANTLR end "rule__XmlTagElement__Group__0__Impl"


    // $ANTLR start "rule__XmlTagElement__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3314:1: rule__XmlTagElement__Group__1 : rule__XmlTagElement__Group__1__Impl ;
    public final void rule__XmlTagElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3318:1: ( rule__XmlTagElement__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3319:2: rule__XmlTagElement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group__1__Impl_in_rule__XmlTagElement__Group__16761);
            rule__XmlTagElement__Group__1__Impl();

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
    // $ANTLR end "rule__XmlTagElement__Group__1"


    // $ANTLR start "rule__XmlTagElement__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3325:1: rule__XmlTagElement__Group__1__Impl : ( ( rule__XmlTagElement__Alternatives_1 ) ) ;
    public final void rule__XmlTagElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3329:1: ( ( ( rule__XmlTagElement__Alternatives_1 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3330:1: ( ( rule__XmlTagElement__Alternatives_1 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3330:1: ( ( rule__XmlTagElement__Alternatives_1 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3331:1: ( rule__XmlTagElement__Alternatives_1 )
            {
             before(grammarAccess.getXmlTagElementAccess().getAlternatives_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3332:1: ( rule__XmlTagElement__Alternatives_1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3332:2: rule__XmlTagElement__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Alternatives_1_in_rule__XmlTagElement__Group__1__Impl6788);
            rule__XmlTagElement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getXmlTagElementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__XmlTagElement__Group__1__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3346:1: rule__XmlTagElement__Group_1_1__0 : rule__XmlTagElement__Group_1_1__0__Impl rule__XmlTagElement__Group_1_1__1 ;
    public final void rule__XmlTagElement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3350:1: ( rule__XmlTagElement__Group_1_1__0__Impl rule__XmlTagElement__Group_1_1__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3351:2: rule__XmlTagElement__Group_1_1__0__Impl rule__XmlTagElement__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1__0__Impl_in_rule__XmlTagElement__Group_1_1__06822);
            rule__XmlTagElement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1__1_in_rule__XmlTagElement__Group_1_1__06825);
            rule__XmlTagElement__Group_1_1__1();

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1__0"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3358:1: rule__XmlTagElement__Group_1_1__0__Impl : ( ( rule__XmlTagElement__PreAssignment_1_1_0 ) ) ;
    public final void rule__XmlTagElement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3362:1: ( ( ( rule__XmlTagElement__PreAssignment_1_1_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3363:1: ( ( rule__XmlTagElement__PreAssignment_1_1_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3363:1: ( ( rule__XmlTagElement__PreAssignment_1_1_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3364:1: ( rule__XmlTagElement__PreAssignment_1_1_0 )
            {
             before(grammarAccess.getXmlTagElementAccess().getPreAssignment_1_1_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3365:1: ( rule__XmlTagElement__PreAssignment_1_1_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3365:2: rule__XmlTagElement__PreAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__PreAssignment_1_1_0_in_rule__XmlTagElement__Group_1_1__0__Impl6852);
            rule__XmlTagElement__PreAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXmlTagElementAccess().getPreAssignment_1_1_0()); 

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1__0__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3375:1: rule__XmlTagElement__Group_1_1__1 : rule__XmlTagElement__Group_1_1__1__Impl rule__XmlTagElement__Group_1_1__2 ;
    public final void rule__XmlTagElement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3379:1: ( rule__XmlTagElement__Group_1_1__1__Impl rule__XmlTagElement__Group_1_1__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3380:2: rule__XmlTagElement__Group_1_1__1__Impl rule__XmlTagElement__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1__1__Impl_in_rule__XmlTagElement__Group_1_1__16882);
            rule__XmlTagElement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1__2_in_rule__XmlTagElement__Group_1_1__16885);
            rule__XmlTagElement__Group_1_1__2();

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1__1"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3387:1: rule__XmlTagElement__Group_1_1__1__Impl : ( ( rule__XmlTagElement__ContentsAssignment_1_1_1 )* ) ;
    public final void rule__XmlTagElement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3391:1: ( ( ( rule__XmlTagElement__ContentsAssignment_1_1_1 )* ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3392:1: ( ( rule__XmlTagElement__ContentsAssignment_1_1_1 )* )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3392:1: ( ( rule__XmlTagElement__ContentsAssignment_1_1_1 )* )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3393:1: ( rule__XmlTagElement__ContentsAssignment_1_1_1 )*
            {
             before(grammarAccess.getXmlTagElementAccess().getContentsAssignment_1_1_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3394:1: ( rule__XmlTagElement__ContentsAssignment_1_1_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==30) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3394:2: rule__XmlTagElement__ContentsAssignment_1_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__ContentsAssignment_1_1_1_in_rule__XmlTagElement__Group_1_1__1__Impl6912);
            	    rule__XmlTagElement__ContentsAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getXmlTagElementAccess().getContentsAssignment_1_1_1()); 

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1__1__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3404:1: rule__XmlTagElement__Group_1_1__2 : rule__XmlTagElement__Group_1_1__2__Impl ;
    public final void rule__XmlTagElement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3408:1: ( rule__XmlTagElement__Group_1_1__2__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3409:2: rule__XmlTagElement__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1__2__Impl_in_rule__XmlTagElement__Group_1_1__26943);
            rule__XmlTagElement__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1__2"


    // $ANTLR start "rule__XmlTagElement__Group_1_1__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3415:1: rule__XmlTagElement__Group_1_1__2__Impl : ( ( rule__XmlTagElement__Group_1_1_2__0 ) ) ;
    public final void rule__XmlTagElement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3419:1: ( ( ( rule__XmlTagElement__Group_1_1_2__0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3420:1: ( ( rule__XmlTagElement__Group_1_1_2__0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3420:1: ( ( rule__XmlTagElement__Group_1_1_2__0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3421:1: ( rule__XmlTagElement__Group_1_1_2__0 )
            {
             before(grammarAccess.getXmlTagElementAccess().getGroup_1_1_2()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3422:1: ( rule__XmlTagElement__Group_1_1_2__0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3422:2: rule__XmlTagElement__Group_1_1_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1_2__0_in_rule__XmlTagElement__Group_1_1__2__Impl6970);
            rule__XmlTagElement__Group_1_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getXmlTagElementAccess().getGroup_1_1_2()); 

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1__2__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1_2__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3438:1: rule__XmlTagElement__Group_1_1_2__0 : rule__XmlTagElement__Group_1_1_2__0__Impl rule__XmlTagElement__Group_1_1_2__1 ;
    public final void rule__XmlTagElement__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3442:1: ( rule__XmlTagElement__Group_1_1_2__0__Impl rule__XmlTagElement__Group_1_1_2__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3443:2: rule__XmlTagElement__Group_1_1_2__0__Impl rule__XmlTagElement__Group_1_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1_2__0__Impl_in_rule__XmlTagElement__Group_1_1_2__07006);
            rule__XmlTagElement__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1_2__1_in_rule__XmlTagElement__Group_1_1_2__07009);
            rule__XmlTagElement__Group_1_1_2__1();

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1_2__0"


    // $ANTLR start "rule__XmlTagElement__Group_1_1_2__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3450:1: rule__XmlTagElement__Group_1_1_2__0__Impl : ( '/' ) ;
    public final void rule__XmlTagElement__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3454:1: ( ( '/' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3455:1: ( '/' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3455:1: ( '/' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3456:1: '/'
            {
             before(grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_1_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__XmlTagElement__Group_1_1_2__0__Impl7037); 
             after(grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_1_2_0()); 

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__XmlTagElement__Group_1_1_2__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3469:1: rule__XmlTagElement__Group_1_1_2__1 : rule__XmlTagElement__Group_1_1_2__1__Impl ;
    public final void rule__XmlTagElement__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3473:1: ( rule__XmlTagElement__Group_1_1_2__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3474:2: rule__XmlTagElement__Group_1_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__Group_1_1_2__1__Impl_in_rule__XmlTagElement__Group_1_1_2__17068);
            rule__XmlTagElement__Group_1_1_2__1__Impl();

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1_2__1"


    // $ANTLR start "rule__XmlTagElement__Group_1_1_2__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3480:1: rule__XmlTagElement__Group_1_1_2__1__Impl : ( ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )? ) ;
    public final void rule__XmlTagElement__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3484:1: ( ( ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )? ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3485:1: ( ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )? )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3485:1: ( ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )? )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3486:1: ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )?
            {
             before(grammarAccess.getXmlTagElementAccess().getEndTagAssignment_1_1_2_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3487:1: ( rule__XmlTagElement__EndTagAssignment_1_1_2_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3487:2: rule__XmlTagElement__EndTagAssignment_1_1_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__XmlTagElement__EndTagAssignment_1_1_2_1_in_rule__XmlTagElement__Group_1_1_2__1__Impl7095);
                    rule__XmlTagElement__EndTagAssignment_1_1_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmlTagElementAccess().getEndTagAssignment_1_1_2_1()); 

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
    // $ANTLR end "rule__XmlTagElement__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__XmlTag__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3501:1: rule__XmlTag__Group__0 : rule__XmlTag__Group__0__Impl rule__XmlTag__Group__1 ;
    public final void rule__XmlTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3505:1: ( rule__XmlTag__Group__0__Impl rule__XmlTag__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3506:2: rule__XmlTag__Group__0__Impl rule__XmlTag__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTag__Group__0__Impl_in_rule__XmlTag__Group__07130);
            rule__XmlTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlTag__Group__1_in_rule__XmlTag__Group__07133);
            rule__XmlTag__Group__1();

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
    // $ANTLR end "rule__XmlTag__Group__0"


    // $ANTLR start "rule__XmlTag__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3513:1: rule__XmlTag__Group__0__Impl : ( ( rule__XmlTag__NameAssignment_0 ) ) ;
    public final void rule__XmlTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3517:1: ( ( ( rule__XmlTag__NameAssignment_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3518:1: ( ( rule__XmlTag__NameAssignment_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3518:1: ( ( rule__XmlTag__NameAssignment_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3519:1: ( rule__XmlTag__NameAssignment_0 )
            {
             before(grammarAccess.getXmlTagAccess().getNameAssignment_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3520:1: ( rule__XmlTag__NameAssignment_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3520:2: rule__XmlTag__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTag__NameAssignment_0_in_rule__XmlTag__Group__0__Impl7160);
            rule__XmlTag__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXmlTagAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__XmlTag__Group__0__Impl"


    // $ANTLR start "rule__XmlTag__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3530:1: rule__XmlTag__Group__1 : rule__XmlTag__Group__1__Impl ;
    public final void rule__XmlTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3534:1: ( rule__XmlTag__Group__1__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3535:2: rule__XmlTag__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlTag__Group__1__Impl_in_rule__XmlTag__Group__17190);
            rule__XmlTag__Group__1__Impl();

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
    // $ANTLR end "rule__XmlTag__Group__1"


    // $ANTLR start "rule__XmlTag__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3541:1: rule__XmlTag__Group__1__Impl : ( ( rule__XmlTag__AttributesAssignment_1 )* ) ;
    public final void rule__XmlTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3545:1: ( ( ( rule__XmlTag__AttributesAssignment_1 )* ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3546:1: ( ( rule__XmlTag__AttributesAssignment_1 )* )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3546:1: ( ( rule__XmlTag__AttributesAssignment_1 )* )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3547:1: ( rule__XmlTag__AttributesAssignment_1 )*
            {
             before(grammarAccess.getXmlTagAccess().getAttributesAssignment_1()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3548:1: ( rule__XmlTag__AttributesAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3548:2: rule__XmlTag__AttributesAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__XmlTag__AttributesAssignment_1_in_rule__XmlTag__Group__1__Impl7217);
            	    rule__XmlTag__AttributesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getXmlTagAccess().getAttributesAssignment_1()); 

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
    // $ANTLR end "rule__XmlTag__Group__1__Impl"


    // $ANTLR start "rule__XmlAttribute__Group__0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3562:1: rule__XmlAttribute__Group__0 : rule__XmlAttribute__Group__0__Impl rule__XmlAttribute__Group__1 ;
    public final void rule__XmlAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3566:1: ( rule__XmlAttribute__Group__0__Impl rule__XmlAttribute__Group__1 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3567:2: rule__XmlAttribute__Group__0__Impl rule__XmlAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlAttribute__Group__0__Impl_in_rule__XmlAttribute__Group__07252);
            rule__XmlAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlAttribute__Group__1_in_rule__XmlAttribute__Group__07255);
            rule__XmlAttribute__Group__1();

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
    // $ANTLR end "rule__XmlAttribute__Group__0"


    // $ANTLR start "rule__XmlAttribute__Group__0__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3574:1: rule__XmlAttribute__Group__0__Impl : ( ( rule__XmlAttribute__NameAssignment_0 ) ) ;
    public final void rule__XmlAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3578:1: ( ( ( rule__XmlAttribute__NameAssignment_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3579:1: ( ( rule__XmlAttribute__NameAssignment_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3579:1: ( ( rule__XmlAttribute__NameAssignment_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3580:1: ( rule__XmlAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getXmlAttributeAccess().getNameAssignment_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3581:1: ( rule__XmlAttribute__NameAssignment_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3581:2: rule__XmlAttribute__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlAttribute__NameAssignment_0_in_rule__XmlAttribute__Group__0__Impl7282);
            rule__XmlAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXmlAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__XmlAttribute__Group__0__Impl"


    // $ANTLR start "rule__XmlAttribute__Group__1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3591:1: rule__XmlAttribute__Group__1 : rule__XmlAttribute__Group__1__Impl rule__XmlAttribute__Group__2 ;
    public final void rule__XmlAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3595:1: ( rule__XmlAttribute__Group__1__Impl rule__XmlAttribute__Group__2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3596:2: rule__XmlAttribute__Group__1__Impl rule__XmlAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlAttribute__Group__1__Impl_in_rule__XmlAttribute__Group__17312);
            rule__XmlAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__XmlAttribute__Group__2_in_rule__XmlAttribute__Group__17315);
            rule__XmlAttribute__Group__2();

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
    // $ANTLR end "rule__XmlAttribute__Group__1"


    // $ANTLR start "rule__XmlAttribute__Group__1__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3603:1: rule__XmlAttribute__Group__1__Impl : ( '=' ) ;
    public final void rule__XmlAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3607:1: ( ( '=' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3608:1: ( '=' )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3608:1: ( '=' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3609:1: '='
            {
             before(grammarAccess.getXmlAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__XmlAttribute__Group__1__Impl7343); 
             after(grammarAccess.getXmlAttributeAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__XmlAttribute__Group__1__Impl"


    // $ANTLR start "rule__XmlAttribute__Group__2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3622:1: rule__XmlAttribute__Group__2 : rule__XmlAttribute__Group__2__Impl ;
    public final void rule__XmlAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3626:1: ( rule__XmlAttribute__Group__2__Impl )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3627:2: rule__XmlAttribute__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlAttribute__Group__2__Impl_in_rule__XmlAttribute__Group__27374);
            rule__XmlAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__XmlAttribute__Group__2"


    // $ANTLR start "rule__XmlAttribute__Group__2__Impl"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3633:1: rule__XmlAttribute__Group__2__Impl : ( ( rule__XmlAttribute__ValueAssignment_2 ) ) ;
    public final void rule__XmlAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3637:1: ( ( ( rule__XmlAttribute__ValueAssignment_2 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3638:1: ( ( rule__XmlAttribute__ValueAssignment_2 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3638:1: ( ( rule__XmlAttribute__ValueAssignment_2 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3639:1: ( rule__XmlAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getXmlAttributeAccess().getValueAssignment_2()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3640:1: ( rule__XmlAttribute__ValueAssignment_2 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3640:2: rule__XmlAttribute__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__XmlAttribute__ValueAssignment_2_in_rule__XmlAttribute__Group__2__Impl7401);
            rule__XmlAttribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXmlAttributeAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__XmlAttribute__Group__2__Impl"


    // $ANTLR start "rule__Quiz__NameAssignment_2_0_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3657:1: rule__Quiz__NameAssignment_2_0_0 : ( ruleQName ) ;
    public final void rule__Quiz__NameAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3661:1: ( ( ruleQName ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3662:1: ( ruleQName )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3662:1: ( ruleQName )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3663:1: ruleQName
            {
             before(grammarAccess.getQuizAccess().getNameQNameParserRuleCall_2_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Quiz__NameAssignment_2_0_07442);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQuizAccess().getNameQNameParserRuleCall_2_0_0_0()); 

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
    // $ANTLR end "rule__Quiz__NameAssignment_2_0_0"


    // $ANTLR start "rule__Quiz__TitleAssignment_2_0_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3672:1: rule__Quiz__TitleAssignment_2_0_1 : ( RULE_STRING ) ;
    public final void rule__Quiz__TitleAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3676:1: ( ( RULE_STRING ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3677:1: ( RULE_STRING )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3677:1: ( RULE_STRING )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3678:1: RULE_STRING
            {
             before(grammarAccess.getQuizAccess().getTitleSTRINGTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Quiz__TitleAssignment_2_0_17473); 
             after(grammarAccess.getQuizAccess().getTitleSTRINGTerminalRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__Quiz__TitleAssignment_2_0_1"


    // $ANTLR start "rule__Quiz__PartsAssignment_2_0_2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3687:1: rule__Quiz__PartsAssignment_2_0_2 : ( ruleAbstractQuizPart ) ;
    public final void rule__Quiz__PartsAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3691:1: ( ( ruleAbstractQuizPart ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3692:1: ( ruleAbstractQuizPart )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3692:1: ( ruleAbstractQuizPart )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3693:1: ruleAbstractQuizPart
            {
             before(grammarAccess.getQuizAccess().getPartsAbstractQuizPartParserRuleCall_2_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractQuizPart_in_rule__Quiz__PartsAssignment_2_0_27504);
            ruleAbstractQuizPart();

            state._fsp--;

             after(grammarAccess.getQuizAccess().getPartsAbstractQuizPartParserRuleCall_2_0_2_0()); 

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
    // $ANTLR end "rule__Quiz__PartsAssignment_2_0_2"


    // $ANTLR start "rule__Quiz__PartsAssignment_2_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3702:1: rule__Quiz__PartsAssignment_2_1 : ( ruleAnonymousQuizPart ) ;
    public final void rule__Quiz__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3706:1: ( ( ruleAnonymousQuizPart ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3707:1: ( ruleAnonymousQuizPart )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3707:1: ( ruleAnonymousQuizPart )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3708:1: ruleAnonymousQuizPart
            {
             before(grammarAccess.getQuizAccess().getPartsAnonymousQuizPartParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnonymousQuizPart_in_rule__Quiz__PartsAssignment_2_17535);
            ruleAnonymousQuizPart();

            state._fsp--;

             after(grammarAccess.getQuizAccess().getPartsAnonymousQuizPartParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Quiz__PartsAssignment_2_1"


    // $ANTLR start "rule__QuizPart__NameAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3717:1: rule__QuizPart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QuizPart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3721:1: ( ( RULE_ID ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3722:1: ( RULE_ID )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3722:1: ( RULE_ID )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3723:1: RULE_ID
            {
             before(grammarAccess.getQuizPartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QuizPart__NameAssignment_17566); 
             after(grammarAccess.getQuizPartAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__QuizPart__NameAssignment_1"


    // $ANTLR start "rule__QuizPart__TitleAssignment_2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3732:1: rule__QuizPart__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuizPart__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3736:1: ( ( RULE_STRING ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3737:1: ( RULE_STRING )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3737:1: ( RULE_STRING )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3738:1: RULE_STRING
            {
             before(grammarAccess.getQuizPartAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuizPart__TitleAssignment_27597); 
             after(grammarAccess.getQuizPartAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__QuizPart__TitleAssignment_2"


    // $ANTLR start "rule__QuizPart__QuestionsAssignment_3"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3747:1: rule__QuizPart__QuestionsAssignment_3 : ( ruleAbstractQA ) ;
    public final void rule__QuizPart__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3751:1: ( ( ruleAbstractQA ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3752:1: ( ruleAbstractQA )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3752:1: ( ruleAbstractQA )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3753:1: ruleAbstractQA
            {
             before(grammarAccess.getQuizPartAccess().getQuestionsAbstractQAParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractQA_in_rule__QuizPart__QuestionsAssignment_37628);
            ruleAbstractQA();

            state._fsp--;

             after(grammarAccess.getQuizPartAccess().getQuestionsAbstractQAParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__QuizPart__QuestionsAssignment_3"


    // $ANTLR start "rule__QuizPartRef__PartRefAssignment_2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3762:1: rule__QuizPartRef__PartRefAssignment_2 : ( ( ruleQName ) ) ;
    public final void rule__QuizPartRef__PartRefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3766:1: ( ( ( ruleQName ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3767:1: ( ( ruleQName ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3767:1: ( ( ruleQName ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3768:1: ( ruleQName )
            {
             before(grammarAccess.getQuizPartRefAccess().getPartRefQuizPartCrossReference_2_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3769:1: ( ruleQName )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3770:1: ruleQName
            {
             before(grammarAccess.getQuizPartRefAccess().getPartRefQuizPartQNameParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__QuizPartRef__PartRefAssignment_27663);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQuizPartRefAccess().getPartRefQuizPartQNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getQuizPartRefAccess().getPartRefQuizPartCrossReference_2_0()); 

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
    // $ANTLR end "rule__QuizPartRef__PartRefAssignment_2"


    // $ANTLR start "rule__AnonymousQuizPart__QuestionsAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3781:1: rule__AnonymousQuizPart__QuestionsAssignment_1 : ( ruleAbstractQA ) ;
    public final void rule__AnonymousQuizPart__QuestionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3785:1: ( ( ruleAbstractQA ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3786:1: ( ruleAbstractQA )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3786:1: ( ruleAbstractQA )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3787:1: ruleAbstractQA
            {
             before(grammarAccess.getAnonymousQuizPartAccess().getQuestionsAbstractQAParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractQA_in_rule__AnonymousQuizPart__QuestionsAssignment_17698);
            ruleAbstractQA();

            state._fsp--;

             after(grammarAccess.getAnonymousQuizPartAccess().getQuestionsAbstractQAParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AnonymousQuizPart__QuestionsAssignment_1"


    // $ANTLR start "rule__QARef__QaRefAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3796:1: rule__QARef__QaRefAssignment_1 : ( ( ruleQName ) ) ;
    public final void rule__QARef__QaRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3800:1: ( ( ( ruleQName ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3801:1: ( ( ruleQName ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3801:1: ( ( ruleQName ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3802:1: ( ruleQName )
            {
             before(grammarAccess.getQARefAccess().getQaRefQACrossReference_1_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3803:1: ( ruleQName )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3804:1: ruleQName
            {
             before(grammarAccess.getQARefAccess().getQaRefQAQNameParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__QARef__QaRefAssignment_17733);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQARefAccess().getQaRefQAQNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getQARefAccess().getQaRefQACrossReference_1_0()); 

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
    // $ANTLR end "rule__QARef__QaRefAssignment_1"


    // $ANTLR start "rule__QA__NameAssignment_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3815:1: rule__QA__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__QA__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3819:1: ( ( RULE_ID ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3820:1: ( RULE_ID )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3820:1: ( RULE_ID )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3821:1: RULE_ID
            {
             before(grammarAccess.getQAAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QA__NameAssignment_07768); 
             after(grammarAccess.getQAAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__QA__NameAssignment_0"


    // $ANTLR start "rule__QA__QAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3830:1: rule__QA__QAssignment_1 : ( ruleQuestion ) ;
    public final void rule__QA__QAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3834:1: ( ( ruleQuestion ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3835:1: ( ruleQuestion )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3835:1: ( ruleQuestion )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3836:1: ruleQuestion
            {
             before(grammarAccess.getQAAccess().getQQuestionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QA__QAssignment_17799);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQAAccess().getQQuestionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QA__QAssignment_1"


    // $ANTLR start "rule__QA__AAssignment_2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3845:1: rule__QA__AAssignment_2 : ( ruleAnswer ) ;
    public final void rule__QA__AAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3849:1: ( ( ruleAnswer ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3850:1: ( ruleAnswer )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3850:1: ( ruleAnswer )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3851:1: ruleAnswer
            {
             before(grammarAccess.getQAAccess().getAAnswerParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__QA__AAssignment_27830);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQAAccess().getAAnswerParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QA__AAssignment_2"


    // $ANTLR start "rule__StringQuestion__QuestionAssignment"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3860:1: rule__StringQuestion__QuestionAssignment : ( RULE_STRING ) ;
    public final void rule__StringQuestion__QuestionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3864:1: ( ( RULE_STRING ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3865:1: ( RULE_STRING )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3865:1: ( RULE_STRING )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3866:1: RULE_STRING
            {
             before(grammarAccess.getStringQuestionAccess().getQuestionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__StringQuestion__QuestionAssignment7861); 
             after(grammarAccess.getStringQuestionAccess().getQuestionSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringQuestion__QuestionAssignment"


    // $ANTLR start "rule__XmlQuestion__XmlAssignment"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3875:1: rule__XmlQuestion__XmlAssignment : ( ruleXml ) ;
    public final void rule__XmlQuestion__XmlAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3879:1: ( ( ruleXml ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3880:1: ( ruleXml )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3880:1: ( ruleXml )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3881:1: ruleXml
            {
             before(grammarAccess.getXmlQuestionAccess().getXmlXmlParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleXml_in_rule__XmlQuestion__XmlAssignment7892);
            ruleXml();

            state._fsp--;

             after(grammarAccess.getXmlQuestionAccess().getXmlXmlParserRuleCall_0()); 

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
    // $ANTLR end "rule__XmlQuestion__XmlAssignment"


    // $ANTLR start "rule__StringAnswer__ValueAssignment_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3890:1: rule__StringAnswer__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringAnswer__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3894:1: ( ( RULE_STRING ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3895:1: ( RULE_STRING )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3895:1: ( RULE_STRING )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3896:1: RULE_STRING
            {
             before(grammarAccess.getStringAnswerAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__StringAnswer__ValueAssignment_07923); 
             after(grammarAccess.getStringAnswerAccess().getValueSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__StringAnswer__ValueAssignment_0"


    // $ANTLR start "rule__StringAnswer__IgnoreCaseAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3905:1: rule__StringAnswer__IgnoreCaseAssignment_1 : ( ( '~' ) ) ;
    public final void rule__StringAnswer__IgnoreCaseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3909:1: ( ( ( '~' ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3910:1: ( ( '~' ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3910:1: ( ( '~' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3911:1: ( '~' )
            {
             before(grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3912:1: ( '~' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3913:1: '~'
            {
             before(grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__StringAnswer__IgnoreCaseAssignment_17959); 
             after(grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0()); 

            }

             after(grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0()); 

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
    // $ANTLR end "rule__StringAnswer__IgnoreCaseAssignment_1"


    // $ANTLR start "rule__RegexAnswer__RegexpAssignment_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3928:1: rule__RegexAnswer__RegexpAssignment_0 : ( ( '/' ) ) ;
    public final void rule__RegexAnswer__RegexpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3932:1: ( ( ( '/' ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3933:1: ( ( '/' ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3933:1: ( ( '/' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3934:1: ( '/' )
            {
             before(grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3935:1: ( '/' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3936:1: '/'
            {
             before(grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RegexAnswer__RegexpAssignment_08003); 
             after(grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0()); 

            }

             after(grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0()); 

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
    // $ANTLR end "rule__RegexAnswer__RegexpAssignment_0"


    // $ANTLR start "rule__RegexAnswer__ValueAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3951:1: rule__RegexAnswer__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RegexAnswer__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3955:1: ( ( RULE_STRING ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3956:1: ( RULE_STRING )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3956:1: ( RULE_STRING )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3957:1: RULE_STRING
            {
             before(grammarAccess.getRegexAnswerAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__RegexAnswer__ValueAssignment_18042); 
             after(grammarAccess.getRegexAnswerAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RegexAnswer__ValueAssignment_1"


    // $ANTLR start "rule__RegexAnswer__IgnoreCaseAssignment_3"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3966:1: rule__RegexAnswer__IgnoreCaseAssignment_3 : ( ( '~' ) ) ;
    public final void rule__RegexAnswer__IgnoreCaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3970:1: ( ( ( '~' ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3971:1: ( ( '~' ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3971:1: ( ( '~' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3972:1: ( '~' )
            {
             before(grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3973:1: ( '~' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3974:1: '~'
            {
             before(grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__RegexAnswer__IgnoreCaseAssignment_38078); 
             after(grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0()); 

            }

             after(grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0()); 

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
    // $ANTLR end "rule__RegexAnswer__IgnoreCaseAssignment_3"


    // $ANTLR start "rule__NumberAnswer__ValueAssignment_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3989:1: rule__NumberAnswer__ValueAssignment_0 : ( ruleEDoubleObject ) ;
    public final void rule__NumberAnswer__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3993:1: ( ( ruleEDoubleObject ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3994:1: ( ruleEDoubleObject )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3994:1: ( ruleEDoubleObject )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:3995:1: ruleEDoubleObject
            {
             before(grammarAccess.getNumberAnswerAccess().getValueEDoubleObjectParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDoubleObject_in_rule__NumberAnswer__ValueAssignment_08117);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getNumberAnswerAccess().getValueEDoubleObjectParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NumberAnswer__ValueAssignment_0"


    // $ANTLR start "rule__NumberAnswer__ErrorMarginAssignment_1_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4004:1: rule__NumberAnswer__ErrorMarginAssignment_1_1 : ( ruleEDoubleObject ) ;
    public final void rule__NumberAnswer__ErrorMarginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4008:1: ( ( ruleEDoubleObject ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4009:1: ( ruleEDoubleObject )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4009:1: ( ruleEDoubleObject )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4010:1: ruleEDoubleObject
            {
             before(grammarAccess.getNumberAnswerAccess().getErrorMarginEDoubleObjectParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDoubleObject_in_rule__NumberAnswer__ErrorMarginAssignment_1_18148);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getNumberAnswerAccess().getErrorMarginEDoubleObjectParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__NumberAnswer__ErrorMarginAssignment_1_1"


    // $ANTLR start "rule__BooleanAnswer__ValueAssignment_1_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4019:1: rule__BooleanAnswer__ValueAssignment_1_0 : ( ( rule__BooleanAnswer__ValueAlternatives_1_0_0 ) ) ;
    public final void rule__BooleanAnswer__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4023:1: ( ( ( rule__BooleanAnswer__ValueAlternatives_1_0_0 ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4024:1: ( ( rule__BooleanAnswer__ValueAlternatives_1_0_0 ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4024:1: ( ( rule__BooleanAnswer__ValueAlternatives_1_0_0 ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4025:1: ( rule__BooleanAnswer__ValueAlternatives_1_0_0 )
            {
             before(grammarAccess.getBooleanAnswerAccess().getValueAlternatives_1_0_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4026:1: ( rule__BooleanAnswer__ValueAlternatives_1_0_0 )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4026:2: rule__BooleanAnswer__ValueAlternatives_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAnswer__ValueAlternatives_1_0_0_in_rule__BooleanAnswer__ValueAssignment_1_08179);
            rule__BooleanAnswer__ValueAlternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAnswerAccess().getValueAlternatives_1_0_0()); 

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
    // $ANTLR end "rule__BooleanAnswer__ValueAssignment_1_0"


    // $ANTLR start "rule__XmlAnswer__XmlAssignment"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4035:1: rule__XmlAnswer__XmlAssignment : ( ruleXml ) ;
    public final void rule__XmlAnswer__XmlAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4039:1: ( ( ruleXml ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4040:1: ( ruleXml )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4040:1: ( ruleXml )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4041:1: ruleXml
            {
             before(grammarAccess.getXmlAnswerAccess().getXmlXmlParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleXml_in_rule__XmlAnswer__XmlAssignment8212);
            ruleXml();

            state._fsp--;

             after(grammarAccess.getXmlAnswerAccess().getXmlXmlParserRuleCall_0()); 

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
    // $ANTLR end "rule__XmlAnswer__XmlAssignment"


    // $ANTLR start "rule__SingleBoxOptionsAnswer__OptionsAssignment"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4050:1: rule__SingleBoxOptionsAnswer__OptionsAssignment : ( ruleSingleBoxOption ) ;
    public final void rule__SingleBoxOptionsAnswer__OptionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4054:1: ( ( ruleSingleBoxOption ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4055:1: ( ruleSingleBoxOption )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4055:1: ( ruleSingleBoxOption )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4056:1: ruleSingleBoxOption
            {
             before(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsSingleBoxOptionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOption_in_rule__SingleBoxOptionsAnswer__OptionsAssignment8243);
            ruleSingleBoxOption();

            state._fsp--;

             after(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsSingleBoxOptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__SingleBoxOptionsAnswer__OptionsAssignment"


    // $ANTLR start "rule__SingleBoxOption__CorrectAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4065:1: rule__SingleBoxOption__CorrectAssignment_1 : ( ( 'x' ) ) ;
    public final void rule__SingleBoxOption__CorrectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4069:1: ( ( ( 'x' ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4070:1: ( ( 'x' ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4070:1: ( ( 'x' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4071:1: ( 'x' )
            {
             before(grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4072:1: ( 'x' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4073:1: 'x'
            {
             before(grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__SingleBoxOption__CorrectAssignment_18279); 
             after(grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0()); 

            }

             after(grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0()); 

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
    // $ANTLR end "rule__SingleBoxOption__CorrectAssignment_1"


    // $ANTLR start "rule__SingleBoxOption__OptionAssignment_3"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4088:1: rule__SingleBoxOption__OptionAssignment_3 : ( ruleOptionAnswer ) ;
    public final void rule__SingleBoxOption__OptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4092:1: ( ( ruleOptionAnswer ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4093:1: ( ruleOptionAnswer )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4093:1: ( ruleOptionAnswer )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4094:1: ruleOptionAnswer
            {
             before(grammarAccess.getSingleBoxOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_rule__SingleBoxOption__OptionAssignment_38318);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getSingleBoxOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SingleBoxOption__OptionAssignment_3"


    // $ANTLR start "rule__SingleListOptionsAnswer__OptionsAssignment"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4103:1: rule__SingleListOptionsAnswer__OptionsAssignment : ( ruleSingleListOption ) ;
    public final void rule__SingleListOptionsAnswer__OptionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4107:1: ( ( ruleSingleListOption ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4108:1: ( ruleSingleListOption )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4108:1: ( ruleSingleListOption )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4109:1: ruleSingleListOption
            {
             before(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsSingleListOptionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleListOption_in_rule__SingleListOptionsAnswer__OptionsAssignment8349);
            ruleSingleListOption();

            state._fsp--;

             after(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsSingleListOptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__SingleListOptionsAnswer__OptionsAssignment"


    // $ANTLR start "rule__SingleListOption__CorrectAssignment_0_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4118:1: rule__SingleListOption__CorrectAssignment_0_1 : ( ( 'v' ) ) ;
    public final void rule__SingleListOption__CorrectAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4122:1: ( ( ( 'v' ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4123:1: ( ( 'v' ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4123:1: ( ( 'v' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4124:1: ( 'v' )
            {
             before(grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4125:1: ( 'v' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4126:1: 'v'
            {
             before(grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SingleListOption__CorrectAssignment_0_18385); 
             after(grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0()); 

            }

             after(grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0()); 

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
    // $ANTLR end "rule__SingleListOption__CorrectAssignment_0_1"


    // $ANTLR start "rule__SingleListOption__OptionAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4141:1: rule__SingleListOption__OptionAssignment_1 : ( ruleOptionAnswer ) ;
    public final void rule__SingleListOption__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4145:1: ( ( ruleOptionAnswer ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4146:1: ( ruleOptionAnswer )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4146:1: ( ruleOptionAnswer )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4147:1: ruleOptionAnswer
            {
             before(grammarAccess.getSingleListOptionAccess().getOptionOptionAnswerParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_rule__SingleListOption__OptionAssignment_18424);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getSingleListOptionAccess().getOptionOptionAnswerParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SingleListOption__OptionAssignment_1"


    // $ANTLR start "rule__ManyOptionsAnswer__OptionsAssignment"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4156:1: rule__ManyOptionsAnswer__OptionsAssignment : ( ruleManyOption ) ;
    public final void rule__ManyOptionsAnswer__OptionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4160:1: ( ( ruleManyOption ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4161:1: ( ruleManyOption )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4161:1: ( ruleManyOption )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4162:1: ruleManyOption
            {
             before(grammarAccess.getManyOptionsAnswerAccess().getOptionsManyOptionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleManyOption_in_rule__ManyOptionsAnswer__OptionsAssignment8455);
            ruleManyOption();

            state._fsp--;

             after(grammarAccess.getManyOptionsAnswerAccess().getOptionsManyOptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ManyOptionsAnswer__OptionsAssignment"


    // $ANTLR start "rule__ManyOption__CorrectAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4171:1: rule__ManyOption__CorrectAssignment_1 : ( ( 'x' ) ) ;
    public final void rule__ManyOption__CorrectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4175:1: ( ( ( 'x' ) ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4176:1: ( ( 'x' ) )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4176:1: ( ( 'x' ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4177:1: ( 'x' )
            {
             before(grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0()); 
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4178:1: ( 'x' )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4179:1: 'x'
            {
             before(grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ManyOption__CorrectAssignment_18491); 
             after(grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0()); 

            }

             after(grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0()); 

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
    // $ANTLR end "rule__ManyOption__CorrectAssignment_1"


    // $ANTLR start "rule__ManyOption__OptionAssignment_3"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4194:1: rule__ManyOption__OptionAssignment_3 : ( ruleOptionAnswer ) ;
    public final void rule__ManyOption__OptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4198:1: ( ( ruleOptionAnswer ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4199:1: ( ruleOptionAnswer )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4199:1: ( ruleOptionAnswer )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4200:1: ruleOptionAnswer
            {
             before(grammarAccess.getManyOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_rule__ManyOption__OptionAssignment_38530);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getManyOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ManyOption__OptionAssignment_3"


    // $ANTLR start "rule__Xml__ElementAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4209:1: rule__Xml__ElementAssignment_1 : ( ruleXmlElement ) ;
    public final void rule__Xml__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4213:1: ( ( ruleXmlElement ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4214:1: ( ruleXmlElement )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4214:1: ( ruleXmlElement )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4215:1: ruleXmlElement
            {
             before(grammarAccess.getXmlAccess().getElementXmlElementParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlElement_in_rule__Xml__ElementAssignment_18561);
            ruleXmlElement();

            state._fsp--;

             after(grammarAccess.getXmlAccess().getElementXmlElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Xml__ElementAssignment_1"


    // $ANTLR start "rule__XmlContents__ElementAssignment_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4224:1: rule__XmlContents__ElementAssignment_0 : ( ruleXmlElement ) ;
    public final void rule__XmlContents__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4228:1: ( ( ruleXmlElement ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4229:1: ( ruleXmlElement )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4229:1: ( ruleXmlElement )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4230:1: ruleXmlElement
            {
             before(grammarAccess.getXmlContentsAccess().getElementXmlElementParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlElement_in_rule__XmlContents__ElementAssignment_08592);
            ruleXmlElement();

            state._fsp--;

             after(grammarAccess.getXmlContentsAccess().getElementXmlElementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__XmlContents__ElementAssignment_0"


    // $ANTLR start "rule__XmlContents__PostAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4239:1: rule__XmlContents__PostAssignment_1 : ( RULE_XML_TEXT ) ;
    public final void rule__XmlContents__PostAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4243:1: ( ( RULE_XML_TEXT ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4244:1: ( RULE_XML_TEXT )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4244:1: ( RULE_XML_TEXT )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4245:1: RULE_XML_TEXT
            {
             before(grammarAccess.getXmlContentsAccess().getPostXML_TEXTTerminalRuleCall_1_0()); 
            match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_RULE_XML_TEXT_in_rule__XmlContents__PostAssignment_18623); 
             after(grammarAccess.getXmlContentsAccess().getPostXML_TEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__XmlContents__PostAssignment_1"


    // $ANTLR start "rule__XmlPIAnswerElement__AnswerAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4254:1: rule__XmlPIAnswerElement__AnswerAssignment_1 : ( ruleSimpleAnswer ) ;
    public final void rule__XmlPIAnswerElement__AnswerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4258:1: ( ( ruleSimpleAnswer ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4259:1: ( ruleSimpleAnswer )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4259:1: ( ruleSimpleAnswer )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4260:1: ruleSimpleAnswer
            {
             before(grammarAccess.getXmlPIAnswerElementAccess().getAnswerSimpleAnswerParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnswer_in_rule__XmlPIAnswerElement__AnswerAssignment_18654);
            ruleSimpleAnswer();

            state._fsp--;

             after(grammarAccess.getXmlPIAnswerElementAccess().getAnswerSimpleAnswerParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__XmlPIAnswerElement__AnswerAssignment_1"


    // $ANTLR start "rule__XmlTagElement__StartTagAssignment_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4269:1: rule__XmlTagElement__StartTagAssignment_0 : ( ruleXmlTag ) ;
    public final void rule__XmlTagElement__StartTagAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4273:1: ( ( ruleXmlTag ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4274:1: ( ruleXmlTag )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4274:1: ( ruleXmlTag )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4275:1: ruleXmlTag
            {
             before(grammarAccess.getXmlTagElementAccess().getStartTagXmlTagParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlTag_in_rule__XmlTagElement__StartTagAssignment_08685);
            ruleXmlTag();

            state._fsp--;

             after(grammarAccess.getXmlTagElementAccess().getStartTagXmlTagParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__XmlTagElement__StartTagAssignment_0"


    // $ANTLR start "rule__XmlTagElement__PreAssignment_1_1_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4284:1: rule__XmlTagElement__PreAssignment_1_1_0 : ( RULE_XML_TEXT ) ;
    public final void rule__XmlTagElement__PreAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4288:1: ( ( RULE_XML_TEXT ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4289:1: ( RULE_XML_TEXT )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4289:1: ( RULE_XML_TEXT )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4290:1: RULE_XML_TEXT
            {
             before(grammarAccess.getXmlTagElementAccess().getPreXML_TEXTTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_RULE_XML_TEXT_in_rule__XmlTagElement__PreAssignment_1_1_08716); 
             after(grammarAccess.getXmlTagElementAccess().getPreXML_TEXTTerminalRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__XmlTagElement__PreAssignment_1_1_0"


    // $ANTLR start "rule__XmlTagElement__ContentsAssignment_1_1_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4299:1: rule__XmlTagElement__ContentsAssignment_1_1_1 : ( ruleXmlContents ) ;
    public final void rule__XmlTagElement__ContentsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4303:1: ( ( ruleXmlContents ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4304:1: ( ruleXmlContents )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4304:1: ( ruleXmlContents )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4305:1: ruleXmlContents
            {
             before(grammarAccess.getXmlTagElementAccess().getContentsXmlContentsParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlContents_in_rule__XmlTagElement__ContentsAssignment_1_1_18747);
            ruleXmlContents();

            state._fsp--;

             after(grammarAccess.getXmlTagElementAccess().getContentsXmlContentsParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__XmlTagElement__ContentsAssignment_1_1_1"


    // $ANTLR start "rule__XmlTagElement__EndTagAssignment_1_1_2_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4314:1: rule__XmlTagElement__EndTagAssignment_1_1_2_1 : ( RULE_ID ) ;
    public final void rule__XmlTagElement__EndTagAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4318:1: ( ( RULE_ID ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4319:1: ( RULE_ID )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4319:1: ( RULE_ID )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4320:1: RULE_ID
            {
             before(grammarAccess.getXmlTagElementAccess().getEndTagIDTerminalRuleCall_1_1_2_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__XmlTagElement__EndTagAssignment_1_1_2_18778); 
             after(grammarAccess.getXmlTagElementAccess().getEndTagIDTerminalRuleCall_1_1_2_1_0()); 

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
    // $ANTLR end "rule__XmlTagElement__EndTagAssignment_1_1_2_1"


    // $ANTLR start "rule__XmlTag__NameAssignment_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4329:1: rule__XmlTag__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__XmlTag__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4333:1: ( ( RULE_ID ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4334:1: ( RULE_ID )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4334:1: ( RULE_ID )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4335:1: RULE_ID
            {
             before(grammarAccess.getXmlTagAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__XmlTag__NameAssignment_08809); 
             after(grammarAccess.getXmlTagAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__XmlTag__NameAssignment_0"


    // $ANTLR start "rule__XmlTag__AttributesAssignment_1"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4344:1: rule__XmlTag__AttributesAssignment_1 : ( ruleXmlAttribute ) ;
    public final void rule__XmlTag__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4348:1: ( ( ruleXmlAttribute ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4349:1: ( ruleXmlAttribute )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4349:1: ( ruleXmlAttribute )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4350:1: ruleXmlAttribute
            {
             before(grammarAccess.getXmlTagAccess().getAttributesXmlAttributeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlAttribute_in_rule__XmlTag__AttributesAssignment_18840);
            ruleXmlAttribute();

            state._fsp--;

             after(grammarAccess.getXmlTagAccess().getAttributesXmlAttributeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__XmlTag__AttributesAssignment_1"


    // $ANTLR start "rule__XmlAttribute__NameAssignment_0"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4359:1: rule__XmlAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__XmlAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4363:1: ( ( RULE_ID ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4364:1: ( RULE_ID )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4364:1: ( RULE_ID )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4365:1: RULE_ID
            {
             before(grammarAccess.getXmlAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__XmlAttribute__NameAssignment_08871); 
             after(grammarAccess.getXmlAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__XmlAttribute__NameAssignment_0"


    // $ANTLR start "rule__XmlAttribute__ValueAssignment_2"
    // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4374:1: rule__XmlAttribute__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__XmlAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4378:1: ( ( RULE_STRING ) )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4379:1: ( RULE_STRING )
            {
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4379:1: ( RULE_STRING )
            // ../no.hal.quiz.xtext.ui/src-gen/no/hal/quiz/xtext/ui/contentassist/antlr/internal/InternalXQuiz.g:4380:1: RULE_STRING
            {
             before(grammarAccess.getXmlAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__XmlAttribute__ValueAssignment_28902); 
             after(grammarAccess.getXmlAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__XmlAttribute__ValueAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQuiz_in_entryRuleQuiz61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuiz68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__Group__0_in_ruleQuiz94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_entryRuleQName121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQName128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group__0_in_ruleQName154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractQuizPart_in_entryRuleAbstractQuizPart181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractQuizPart188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractQuizPart__Alternatives_in_ruleAbstractQuizPart214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuizPart_in_entryRuleQuizPart241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuizPart248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPart__Group__0_in_ruleQuizPart274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuizPartRef_in_entryRuleQuizPartRef301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuizPartRef308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPartRef__Group__0_in_ruleQuizPartRef334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonymousQuizPart_in_entryRuleAnonymousQuizPart361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousQuizPart368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnonymousQuizPart__Group__0_in_ruleAnonymousQuizPart394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractQA_in_entryRuleAbstractQA421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractQA428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AbstractQA__Alternatives_in_ruleAbstractQA454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQARef_in_entryRuleQARef481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQARef488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QARef__Group__0_in_ruleQARef514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQA_in_entryRuleQA541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQA548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QA__Group__0_in_ruleQA574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringQuestion_in_entryRuleStringQuestion661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringQuestion668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringQuestion__QuestionAssignment_in_ruleStringQuestion694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlQuestion_in_entryRuleXmlQuestion721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlQuestion728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlQuestion__XmlAssignment_in_ruleXmlQuestion754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Alternatives_in_ruleAnswer814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionAnswer848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionAnswer__Alternatives_in_ruleOptionAnswer874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAnswer908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAnswer__Alternatives_in_ruleSimpleAnswer934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnswer_in_entryRuleStringAnswer961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringAnswer968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringAnswer__Group__0_in_ruleStringAnswer994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegexAnswer_in_entryRuleRegexAnswer1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegexAnswer1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegexAnswer__Group__0_in_ruleRegexAnswer1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberAnswer1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group__0_in_ruleNumberAnswer1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDoubleObject_in_entryRuleEDoubleObject1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDoubleObject1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDoubleObject__Group__0_in_ruleEDoubleObject1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanAnswer_in_entryRuleBooleanAnswer1201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAnswer1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAnswer__Group__0_in_ruleBooleanAnswer1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlAnswer_in_entryRuleXmlAnswer1261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlAnswer1268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlAnswer__XmlAssignment_in_ruleXmlAnswer1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionsAnswer_in_entryRuleOptionsAnswer1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionsAnswer1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionsAnswer__Alternatives_in_ruleOptionsAnswer1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleOptionsAnswer_in_entryRuleSingleOptionsAnswer1381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleOptionsAnswer1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleOptionsAnswer__Alternatives_in_ruleSingleOptionsAnswer1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOptionsAnswer_in_entryRuleSingleBoxOptionsAnswer1441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleBoxOptionsAnswer1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleBoxOptionsAnswer__OptionsAssignment_in_ruleSingleBoxOptionsAnswer1476 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__SingleBoxOptionsAnswer__OptionsAssignment_in_ruleSingleBoxOptionsAnswer1488 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOption_in_entryRuleSingleBoxOption1518 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleBoxOption1525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__Group__0_in_ruleSingleBoxOption1551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleListOptionsAnswer_in_entryRuleSingleListOptionsAnswer1578 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleListOptionsAnswer1585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleListOptionsAnswer__OptionsAssignment_in_ruleSingleListOptionsAnswer1613 = new BitSet(new long[]{0x0000000200030002L});
        public static final BitSet FOLLOW_rule__SingleListOptionsAnswer__OptionsAssignment_in_ruleSingleListOptionsAnswer1625 = new BitSet(new long[]{0x0000000200030002L});
        public static final BitSet FOLLOW_ruleSingleListOption_in_entryRuleSingleListOption1655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleListOption1662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleListOption__Group__0_in_ruleSingleListOption1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyOptionsAnswer_in_entryRuleManyOptionsAnswer1715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManyOptionsAnswer1722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ManyOptionsAnswer__OptionsAssignment_in_ruleManyOptionsAnswer1750 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__ManyOptionsAnswer__OptionsAssignment_in_ruleManyOptionsAnswer1762 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleManyOption_in_entryRuleManyOption1792 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManyOption1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ManyOption__Group__0_in_ruleManyOption1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXml_in_entryRuleXml1852 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXml1859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Xml__Group__0_in_ruleXml1885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlContents_in_entryRuleXmlContents1912 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlContents1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlContents__Group__0_in_ruleXmlContents1945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlElement_in_entryRuleXmlElement1972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlElement1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlElement__Alternatives_in_ruleXmlElement2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlPIAnswerElement_in_entryRuleXmlPIAnswerElement2032 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlPIAnswerElement2039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlPIAnswerElement__Group__0_in_ruleXmlPIAnswerElement2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTagElement_in_entryRuleXmlTagElement2092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlTagElement2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group__0_in_ruleXmlTagElement2125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTag_in_entryRuleXmlTag2152 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlTag2159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTag__Group__0_in_ruleXmlTag2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlAttribute_in_entryRuleXmlAttribute2212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlAttribute2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlAttribute__Group__0_in_ruleXmlAttribute2245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__Group_2_0__0_in_rule__Quiz__Alternatives_22281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__PartsAssignment_2_1_in_rule__Quiz__Alternatives_22299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuizPart_in_rule__AbstractQuizPart__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuizPartRef_in_rule__AbstractQuizPart__Alternatives2349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQA_in_rule__AbstractQA__Alternatives2381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQARef_in_rule__AbstractQA__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringQuestion_in_rule__Question__Alternatives2430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlQuestion_in_rule__Question__Alternatives2447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_rule__Answer__Alternatives2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionsAnswer_in_rule__Answer__Alternatives2496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnswer_in_rule__OptionAnswer__Alternatives2528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlAnswer_in_rule__OptionAnswer__Alternatives2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnswer_in_rule__SimpleAnswer__Alternatives2577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegexAnswer_in_rule__SimpleAnswer__Alternatives2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_rule__SimpleAnswer__Alternatives2611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanAnswer_in_rule__SimpleAnswer__Alternatives2628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAnswer__ValueAssignment_1_0_in_rule__BooleanAnswer__Alternatives_12660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAnswer__Alternatives_1_1_in_rule__BooleanAnswer__Alternatives_12678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BooleanAnswer__ValueAlternatives_1_0_02712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BooleanAnswer__ValueAlternatives_1_0_02732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__BooleanAnswer__Alternatives_1_12767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BooleanAnswer__Alternatives_1_12787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleOptionsAnswer_in_rule__OptionsAnswer__Alternatives2821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyOptionsAnswer_in_rule__OptionsAnswer__Alternatives2838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOptionsAnswer_in_rule__SingleOptionsAnswer__Alternatives2870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleListOptionsAnswer_in_rule__SingleOptionsAnswer__Alternatives2887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleListOption__Alternatives_0_0_in_rule__SingleListOption__Alternatives_02919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleListOption__CorrectAssignment_0_1_in_rule__SingleListOption__Alternatives_02937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__SingleListOption__Alternatives_0_02971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__SingleListOption__Alternatives_0_02991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlPIAnswerElement_in_rule__XmlElement__Alternatives3025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTagElement_in_rule__XmlElement__Alternatives3042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__XmlTagElement__Alternatives_13075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1__0_in_rule__XmlTagElement__Alternatives_13094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__Group__0__Impl_in_rule__Quiz__Group__03125 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Quiz__Group__1_in_rule__Quiz__Group__03128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__Group__1__Impl_in_rule__Quiz__Group__13186 = new BitSet(new long[]{0x0000000010600050L});
        public static final BitSet FOLLOW_rule__Quiz__Group__2_in_rule__Quiz__Group__13189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Quiz__Group__1__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__Group__2__Impl_in_rule__Quiz__Group__23248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__Alternatives_2_in_rule__Quiz__Group__2__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__Group_2_0__0__Impl_in_rule__Quiz__Group_2_0__03311 = new BitSet(new long[]{0x0000000000200050L});
        public static final BitSet FOLLOW_rule__Quiz__Group_2_0__1_in_rule__Quiz__Group_2_0__03314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__NameAssignment_2_0_0_in_rule__Quiz__Group_2_0__0__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__Group_2_0__1__Impl_in_rule__Quiz__Group_2_0__13372 = new BitSet(new long[]{0x0000000000200050L});
        public static final BitSet FOLLOW_rule__Quiz__Group_2_0__2_in_rule__Quiz__Group_2_0__13375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__TitleAssignment_2_0_1_in_rule__Quiz__Group_2_0__1__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__Group_2_0__2__Impl_in_rule__Quiz__Group_2_0__23433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Quiz__PartsAssignment_2_0_2_in_rule__Quiz__Group_2_0__2__Impl3460 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__03497 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__QName__Group__1_in_rule__QName__Group__03500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QName__Group__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__13556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl3583 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__03618 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__03621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__QName__Group_1__0__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__13680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QName__Group_1__1__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPart__Group__0__Impl_in_rule__QuizPart__Group__03740 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuizPart__Group__1_in_rule__QuizPart__Group__03743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__QuizPart__Group__0__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPart__Group__1__Impl_in_rule__QuizPart__Group__13802 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__QuizPart__Group__2_in_rule__QuizPart__Group__13805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPart__NameAssignment_1_in_rule__QuizPart__Group__1__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPart__Group__2__Impl_in_rule__QuizPart__Group__23862 = new BitSet(new long[]{0x0000000010400050L});
        public static final BitSet FOLLOW_rule__QuizPart__Group__3_in_rule__QuizPart__Group__23865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPart__TitleAssignment_2_in_rule__QuizPart__Group__2__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPart__Group__3__Impl_in_rule__QuizPart__Group__33922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPart__QuestionsAssignment_3_in_rule__QuizPart__Group__3__Impl3949 = new BitSet(new long[]{0x0000000010400052L});
        public static final BitSet FOLLOW_rule__QuizPartRef__Group__0__Impl_in_rule__QuizPartRef__Group__03988 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__QuizPartRef__Group__1_in_rule__QuizPartRef__Group__03991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__QuizPartRef__Group__0__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPartRef__Group__1__Impl_in_rule__QuizPartRef__Group__14050 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuizPartRef__Group__2_in_rule__QuizPartRef__Group__14053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__QuizPartRef__Group__1__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPartRef__Group__2__Impl_in_rule__QuizPartRef__Group__24112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuizPartRef__PartRefAssignment_2_in_rule__QuizPartRef__Group__2__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnonymousQuizPart__Group__0__Impl_in_rule__AnonymousQuizPart__Group__04175 = new BitSet(new long[]{0x0000000010600050L});
        public static final BitSet FOLLOW_rule__AnonymousQuizPart__Group__1_in_rule__AnonymousQuizPart__Group__04178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnonymousQuizPart__Group__1__Impl_in_rule__AnonymousQuizPart__Group__14236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnonymousQuizPart__QuestionsAssignment_1_in_rule__AnonymousQuizPart__Group__1__Impl4263 = new BitSet(new long[]{0x0000000010400052L});
        public static final BitSet FOLLOW_rule__QARef__Group__0__Impl_in_rule__QARef__Group__04298 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QARef__Group__1_in_rule__QARef__Group__04301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__QARef__Group__0__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QARef__Group__1__Impl_in_rule__QARef__Group__14360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QARef__QaRefAssignment_1_in_rule__QARef__Group__1__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QA__Group__0__Impl_in_rule__QA__Group__04421 = new BitSet(new long[]{0x0000000010000050L});
        public static final BitSet FOLLOW_rule__QA__Group__1_in_rule__QA__Group__04424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QA__NameAssignment_0_in_rule__QA__Group__0__Impl4451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QA__Group__1__Impl_in_rule__QA__Group__14482 = new BitSet(new long[]{0x000000021507F070L});
        public static final BitSet FOLLOW_rule__QA__Group__2_in_rule__QA__Group__14485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QA__QAssignment_1_in_rule__QA__Group__1__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QA__Group__2__Impl_in_rule__QA__Group__24542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QA__AAssignment_2_in_rule__QA__Group__2__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringAnswer__Group__0__Impl_in_rule__StringAnswer__Group__04605 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__StringAnswer__Group__1_in_rule__StringAnswer__Group__04608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringAnswer__ValueAssignment_0_in_rule__StringAnswer__Group__0__Impl4635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringAnswer__Group__1__Impl_in_rule__StringAnswer__Group__14665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringAnswer__IgnoreCaseAssignment_1_in_rule__StringAnswer__Group__1__Impl4692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegexAnswer__Group__0__Impl_in_rule__RegexAnswer__Group__04727 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__RegexAnswer__Group__1_in_rule__RegexAnswer__Group__04730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegexAnswer__RegexpAssignment_0_in_rule__RegexAnswer__Group__0__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegexAnswer__Group__1__Impl_in_rule__RegexAnswer__Group__14787 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__RegexAnswer__Group__2_in_rule__RegexAnswer__Group__14790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegexAnswer__ValueAssignment_1_in_rule__RegexAnswer__Group__1__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegexAnswer__Group__2__Impl_in_rule__RegexAnswer__Group__24847 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__RegexAnswer__Group__3_in_rule__RegexAnswer__Group__24850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RegexAnswer__Group__2__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegexAnswer__Group__3__Impl_in_rule__RegexAnswer__Group__34909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegexAnswer__IgnoreCaseAssignment_3_in_rule__RegexAnswer__Group__3__Impl4936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group__0__Impl_in_rule__NumberAnswer__Group__04975 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group__1_in_rule__NumberAnswer__Group__04978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__ValueAssignment_0_in_rule__NumberAnswer__Group__0__Impl5005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group__1__Impl_in_rule__NumberAnswer__Group__15035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_1__0_in_rule__NumberAnswer__Group__1__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_1__0__Impl_in_rule__NumberAnswer__Group_1__05097 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_1__1_in_rule__NumberAnswer__Group_1__05100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__NumberAnswer__Group_1__0__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_1__1__Impl_in_rule__NumberAnswer__Group_1__15159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__ErrorMarginAssignment_1_1_in_rule__NumberAnswer__Group_1__1__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDoubleObject__Group__0__Impl_in_rule__EDoubleObject__Group__05220 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__EDoubleObject__Group__1_in_rule__EDoubleObject__Group__05223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDoubleObject__Group__0__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDoubleObject__Group__1__Impl_in_rule__EDoubleObject__Group__15279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDoubleObject__Group_1__0_in_rule__EDoubleObject__Group__1__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDoubleObject__Group_1__0__Impl_in_rule__EDoubleObject__Group_1__05341 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDoubleObject__Group_1__1_in_rule__EDoubleObject__Group_1__05344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EDoubleObject__Group_1__0__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDoubleObject__Group_1__1__Impl_in_rule__EDoubleObject__Group_1__15403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDoubleObject__Group_1__1__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAnswer__Group__0__Impl_in_rule__BooleanAnswer__Group__05463 = new BitSet(new long[]{0x000000000004F060L});
        public static final BitSet FOLLOW_rule__BooleanAnswer__Group__1_in_rule__BooleanAnswer__Group__05466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAnswer__Group__1__Impl_in_rule__BooleanAnswer__Group__15524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAnswer__Alternatives_1_in_rule__BooleanAnswer__Group__1__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__Group__0__Impl_in_rule__SingleBoxOption__Group__05585 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__Group__1_in_rule__SingleBoxOption__Group__05588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SingleBoxOption__Group__0__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__Group__1__Impl_in_rule__SingleBoxOption__Group__15647 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__Group__2_in_rule__SingleBoxOption__Group__15650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__CorrectAssignment_1_in_rule__SingleBoxOption__Group__1__Impl5677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__Group__2__Impl_in_rule__SingleBoxOption__Group__25708 = new BitSet(new long[]{0x000000001004F070L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__Group__3_in_rule__SingleBoxOption__Group__25711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__SingleBoxOption__Group__2__Impl5739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__Group__3__Impl_in_rule__SingleBoxOption__Group__35770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleBoxOption__OptionAssignment_3_in_rule__SingleBoxOption__Group__3__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleListOption__Group__0__Impl_in_rule__SingleListOption__Group__05835 = new BitSet(new long[]{0x000000001004F070L});
        public static final BitSet FOLLOW_rule__SingleListOption__Group__1_in_rule__SingleListOption__Group__05838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleListOption__Alternatives_0_in_rule__SingleListOption__Group__0__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleListOption__Group__1__Impl_in_rule__SingleListOption__Group__15895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleListOption__OptionAssignment_1_in_rule__SingleListOption__Group__1__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ManyOption__Group__0__Impl_in_rule__ManyOption__Group__05956 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_rule__ManyOption__Group__1_in_rule__ManyOption__Group__05959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ManyOption__Group__0__Impl5987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ManyOption__Group__1__Impl_in_rule__ManyOption__Group__16018 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_rule__ManyOption__Group__2_in_rule__ManyOption__Group__16021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ManyOption__CorrectAssignment_1_in_rule__ManyOption__Group__1__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ManyOption__Group__2__Impl_in_rule__ManyOption__Group__26079 = new BitSet(new long[]{0x000000001004F070L});
        public static final BitSet FOLLOW_rule__ManyOption__Group__3_in_rule__ManyOption__Group__26082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ManyOption__Group__2__Impl6110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ManyOption__Group__3__Impl_in_rule__ManyOption__Group__36141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ManyOption__OptionAssignment_3_in_rule__ManyOption__Group__3__Impl6168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Xml__Group__0__Impl_in_rule__Xml__Group__06206 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_rule__Xml__Group__1_in_rule__Xml__Group__06209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Xml__Group__0__Impl6237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Xml__Group__1__Impl_in_rule__Xml__Group__16268 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Xml__Group__2_in_rule__Xml__Group__16271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Xml__ElementAssignment_1_in_rule__Xml__Group__1__Impl6298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Xml__Group__2__Impl_in_rule__Xml__Group__26328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Xml__Group__2__Impl6356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlContents__Group__0__Impl_in_rule__XmlContents__Group__06393 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__XmlContents__Group__1_in_rule__XmlContents__Group__06396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlContents__ElementAssignment_0_in_rule__XmlContents__Group__0__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlContents__Group__1__Impl_in_rule__XmlContents__Group__16453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlContents__PostAssignment_1_in_rule__XmlContents__Group__1__Impl6480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlPIAnswerElement__Group__0__Impl_in_rule__XmlPIAnswerElement__Group__06514 = new BitSet(new long[]{0x000000000004F060L});
        public static final BitSet FOLLOW_rule__XmlPIAnswerElement__Group__1_in_rule__XmlPIAnswerElement__Group__06517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__XmlPIAnswerElement__Group__0__Impl6545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlPIAnswerElement__Group__1__Impl_in_rule__XmlPIAnswerElement__Group__16576 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__XmlPIAnswerElement__Group__2_in_rule__XmlPIAnswerElement__Group__16579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlPIAnswerElement__AnswerAssignment_1_in_rule__XmlPIAnswerElement__Group__1__Impl6606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlPIAnswerElement__Group__2__Impl_in_rule__XmlPIAnswerElement__Group__26636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__XmlPIAnswerElement__Group__2__Impl6664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group__0__Impl_in_rule__XmlTagElement__Group__06701 = new BitSet(new long[]{0x0000000000040080L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group__1_in_rule__XmlTagElement__Group__06704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__StartTagAssignment_0_in_rule__XmlTagElement__Group__0__Impl6731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group__1__Impl_in_rule__XmlTagElement__Group__16761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Alternatives_1_in_rule__XmlTagElement__Group__1__Impl6788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1__0__Impl_in_rule__XmlTagElement__Group_1_1__06822 = new BitSet(new long[]{0x0000000040040010L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1__1_in_rule__XmlTagElement__Group_1_1__06825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__PreAssignment_1_1_0_in_rule__XmlTagElement__Group_1_1__0__Impl6852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1__1__Impl_in_rule__XmlTagElement__Group_1_1__16882 = new BitSet(new long[]{0x0000000040040010L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1__2_in_rule__XmlTagElement__Group_1_1__16885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__ContentsAssignment_1_1_1_in_rule__XmlTagElement__Group_1_1__1__Impl6912 = new BitSet(new long[]{0x0000000040000012L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1__2__Impl_in_rule__XmlTagElement__Group_1_1__26943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1_2__0_in_rule__XmlTagElement__Group_1_1__2__Impl6970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1_2__0__Impl_in_rule__XmlTagElement__Group_1_1_2__07006 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1_2__1_in_rule__XmlTagElement__Group_1_1_2__07009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__XmlTagElement__Group_1_1_2__0__Impl7037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__Group_1_1_2__1__Impl_in_rule__XmlTagElement__Group_1_1_2__17068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTagElement__EndTagAssignment_1_1_2_1_in_rule__XmlTagElement__Group_1_1_2__1__Impl7095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTag__Group__0__Impl_in_rule__XmlTag__Group__07130 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__XmlTag__Group__1_in_rule__XmlTag__Group__07133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTag__NameAssignment_0_in_rule__XmlTag__Group__0__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTag__Group__1__Impl_in_rule__XmlTag__Group__17190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlTag__AttributesAssignment_1_in_rule__XmlTag__Group__1__Impl7217 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__XmlAttribute__Group__0__Impl_in_rule__XmlAttribute__Group__07252 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__XmlAttribute__Group__1_in_rule__XmlAttribute__Group__07255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlAttribute__NameAssignment_0_in_rule__XmlAttribute__Group__0__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlAttribute__Group__1__Impl_in_rule__XmlAttribute__Group__17312 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__XmlAttribute__Group__2_in_rule__XmlAttribute__Group__17315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__XmlAttribute__Group__1__Impl7343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlAttribute__Group__2__Impl_in_rule__XmlAttribute__Group__27374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__XmlAttribute__ValueAssignment_2_in_rule__XmlAttribute__Group__2__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Quiz__NameAssignment_2_0_07442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Quiz__TitleAssignment_2_0_17473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractQuizPart_in_rule__Quiz__PartsAssignment_2_0_27504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonymousQuizPart_in_rule__Quiz__PartsAssignment_2_17535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QuizPart__NameAssignment_17566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuizPart__TitleAssignment_27597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractQA_in_rule__QuizPart__QuestionsAssignment_37628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__QuizPartRef__PartRefAssignment_27663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractQA_in_rule__AnonymousQuizPart__QuestionsAssignment_17698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__QARef__QaRefAssignment_17733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QA__NameAssignment_07768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QA__QAssignment_17799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__QA__AAssignment_27830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__StringQuestion__QuestionAssignment7861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXml_in_rule__XmlQuestion__XmlAssignment7892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__StringAnswer__ValueAssignment_07923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__StringAnswer__IgnoreCaseAssignment_17959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RegexAnswer__RegexpAssignment_08003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__RegexAnswer__ValueAssignment_18042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__RegexAnswer__IgnoreCaseAssignment_38078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDoubleObject_in_rule__NumberAnswer__ValueAssignment_08117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDoubleObject_in_rule__NumberAnswer__ErrorMarginAssignment_1_18148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAnswer__ValueAlternatives_1_0_0_in_rule__BooleanAnswer__ValueAssignment_1_08179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXml_in_rule__XmlAnswer__XmlAssignment8212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOption_in_rule__SingleBoxOptionsAnswer__OptionsAssignment8243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__SingleBoxOption__CorrectAssignment_18279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_rule__SingleBoxOption__OptionAssignment_38318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleListOption_in_rule__SingleListOptionsAnswer__OptionsAssignment8349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SingleListOption__CorrectAssignment_0_18385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_rule__SingleListOption__OptionAssignment_18424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyOption_in_rule__ManyOptionsAnswer__OptionsAssignment8455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ManyOption__CorrectAssignment_18491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_rule__ManyOption__OptionAssignment_38530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlElement_in_rule__Xml__ElementAssignment_18561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlElement_in_rule__XmlContents__ElementAssignment_08592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_XML_TEXT_in_rule__XmlContents__PostAssignment_18623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnswer_in_rule__XmlPIAnswerElement__AnswerAssignment_18654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTag_in_rule__XmlTagElement__StartTagAssignment_08685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_XML_TEXT_in_rule__XmlTagElement__PreAssignment_1_1_08716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlContents_in_rule__XmlTagElement__ContentsAssignment_1_1_18747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__XmlTagElement__EndTagAssignment_1_1_2_18778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__XmlTag__NameAssignment_08809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlAttribute_in_rule__XmlTag__AttributesAssignment_18840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__XmlAttribute__NameAssignment_08871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__XmlAttribute__ValueAssignment_28902 = new BitSet(new long[]{0x0000000000000002L});
    }


}