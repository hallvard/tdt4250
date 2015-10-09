package no.hal.ra.xtext.ui.contentassist.antlr.internal; 

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
import no.hal.ra.xtext.services.XraGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXraParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TDT'", "'IT'", "'h'", "'v'", "'department'", "'staff'", "'{'", "'}'", "'role'", "'courses'", "'works'", "'('", "')'", "'user:'", "'email:'", "'face:'", "'requires'", "','", "'.'", "'as'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXraParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXraParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXraParser.tokenNames; }
    public String getGrammarFileName() { return "../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g"; }


     
     	private XraGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XraGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDepartment"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:60:1: entryRuleDepartment : ruleDepartment EOF ;
    public final void entryRuleDepartment() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:61:1: ( ruleDepartment EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:62:1: ruleDepartment EOF
            {
             before(grammarAccess.getDepartmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDepartment_in_entryRuleDepartment61);
            ruleDepartment();

            state._fsp--;

             after(grammarAccess.getDepartmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDepartment68); 

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
    // $ANTLR end "entryRuleDepartment"


    // $ANTLR start "ruleDepartment"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:69:1: ruleDepartment : ( ( rule__Department__Group__0 ) ) ;
    public final void ruleDepartment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:73:2: ( ( ( rule__Department__Group__0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:74:1: ( ( rule__Department__Group__0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:74:1: ( ( rule__Department__Group__0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:75:1: ( rule__Department__Group__0 )
            {
             before(grammarAccess.getDepartmentAccess().getGroup()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:76:1: ( rule__Department__Group__0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:76:2: rule__Department__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__0_in_ruleDepartment94);
            rule__Department__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDepartmentAccess().getGroup()); 

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
    // $ANTLR end "ruleDepartment"


    // $ANTLR start "entryRulePerson"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:88:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:89:1: ( rulePerson EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:90:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePerson_in_entryRulePerson121);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePerson128); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:97:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:101:2: ( ( ( rule__Person__Group__0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:102:1: ( ( rule__Person__Group__0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:102:1: ( ( rule__Person__Group__0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:103:1: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:104:1: ( rule__Person__Group__0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:104:2: rule__Person__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__0_in_rulePerson154);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleCourse"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:116:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:117:1: ( ruleCourse EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:118:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_entryRuleCourse181);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourse188); 

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
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:125:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:129:2: ( ( ( rule__Course__Group__0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:130:1: ( ( rule__Course__Group__0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:130:1: ( ( rule__Course__Group__0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:131:1: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:132:1: ( rule__Course__Group__0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:132:2: rule__Course__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0_in_ruleCourse214);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

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
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleCourseCode"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:144:1: entryRuleCourseCode : ruleCourseCode EOF ;
    public final void entryRuleCourseCode() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:145:1: ( ruleCourseCode EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:146:1: ruleCourseCode EOF
            {
             before(grammarAccess.getCourseCodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseCode_in_entryRuleCourseCode241);
            ruleCourseCode();

            state._fsp--;

             after(grammarAccess.getCourseCodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseCode248); 

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
    // $ANTLR end "entryRuleCourseCode"


    // $ANTLR start "ruleCourseCode"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:153:1: ruleCourseCode : ( ( rule__CourseCode__Group__0 ) ) ;
    public final void ruleCourseCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:157:2: ( ( ( rule__CourseCode__Group__0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:158:1: ( ( rule__CourseCode__Group__0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:158:1: ( ( rule__CourseCode__Group__0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:159:1: ( rule__CourseCode__Group__0 )
            {
             before(grammarAccess.getCourseCodeAccess().getGroup()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:160:1: ( rule__CourseCode__Group__0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:160:2: rule__CourseCode__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseCode__Group__0_in_ruleCourseCode274);
            rule__CourseCode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseCodeAccess().getGroup()); 

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
    // $ANTLR end "ruleCourseCode"


    // $ANTLR start "entryRuleSemester"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:172:1: entryRuleSemester : ruleSemester EOF ;
    public final void entryRuleSemester() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:173:1: ( ruleSemester EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:174:1: ruleSemester EOF
            {
             before(grammarAccess.getSemesterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemester_in_entryRuleSemester301);
            ruleSemester();

            state._fsp--;

             after(grammarAccess.getSemesterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSemester308); 

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
    // $ANTLR end "entryRuleSemester"


    // $ANTLR start "ruleSemester"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:181:1: ruleSemester : ( ( rule__Semester__Group__0 ) ) ;
    public final void ruleSemester() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:185:2: ( ( ( rule__Semester__Group__0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:186:1: ( ( rule__Semester__Group__0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:186:1: ( ( rule__Semester__Group__0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:187:1: ( rule__Semester__Group__0 )
            {
             before(grammarAccess.getSemesterAccess().getGroup()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:188:1: ( rule__Semester__Group__0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:188:2: rule__Semester__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__0_in_ruleSemester334);
            rule__Semester__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSemesterAccess().getGroup()); 

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
    // $ANTLR end "ruleSemester"


    // $ANTLR start "entryRuleEString"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:200:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:201:1: ( ruleEString EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:202:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString361);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString368); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:209:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:213:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:214:1: ( ( rule__EString__Alternatives ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:214:1: ( ( rule__EString__Alternatives ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:215:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:216:1: ( rule__EString__Alternatives )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:216:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString394);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleURI"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:228:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:229:1: ( ruleURI EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:230:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_entryRuleURI421);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURI428); 

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:237:1: ruleURI : ( RULE_STRING ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:241:2: ( ( RULE_STRING ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:242:1: ( RULE_STRING )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:242:1: ( RULE_STRING )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:243:1: RULE_STRING
            {
             before(grammarAccess.getURIAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleURI454); 
             after(grammarAccess.getURIAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleFactor"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:256:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:257:1: ( ruleFactor EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:258:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFactor_in_entryRuleFactor480);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFactor487); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:265:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:269:2: ( ( ( rule__Factor__Group__0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:270:1: ( ( rule__Factor__Group__0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:270:1: ( ( rule__Factor__Group__0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:271:1: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:272:1: ( rule__Factor__Group__0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:272:2: rule__Factor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Factor__Group__0_in_ruleFactor513);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleCourseInstance"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:286:1: entryRuleCourseInstance : ruleCourseInstance EOF ;
    public final void entryRuleCourseInstance() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:287:1: ( ruleCourseInstance EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:288:1: ruleCourseInstance EOF
            {
             before(grammarAccess.getCourseInstanceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseInstance_in_entryRuleCourseInstance542);
            ruleCourseInstance();

            state._fsp--;

             after(grammarAccess.getCourseInstanceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseInstance549); 

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
    // $ANTLR end "entryRuleCourseInstance"


    // $ANTLR start "ruleCourseInstance"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:295:1: ruleCourseInstance : ( ( rule__CourseInstance__Group__0 ) ) ;
    public final void ruleCourseInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:299:2: ( ( ( rule__CourseInstance__Group__0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:300:1: ( ( rule__CourseInstance__Group__0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:300:1: ( ( rule__CourseInstance__Group__0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:301:1: ( rule__CourseInstance__Group__0 )
            {
             before(grammarAccess.getCourseInstanceAccess().getGroup()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:302:1: ( rule__CourseInstance__Group__0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:302:2: rule__CourseInstance__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__0_in_ruleCourseInstance575);
            rule__CourseInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseInstanceAccess().getGroup()); 

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
    // $ANTLR end "ruleCourseInstance"


    // $ANTLR start "entryRuleCourseAllocation"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:314:1: entryRuleCourseAllocation : ruleCourseAllocation EOF ;
    public final void entryRuleCourseAllocation() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:315:1: ( ruleCourseAllocation EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:316:1: ruleCourseAllocation EOF
            {
             before(grammarAccess.getCourseAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseAllocation_in_entryRuleCourseAllocation602);
            ruleCourseAllocation();

            state._fsp--;

             after(grammarAccess.getCourseAllocationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseAllocation609); 

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
    // $ANTLR end "entryRuleCourseAllocation"


    // $ANTLR start "ruleCourseAllocation"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:323:1: ruleCourseAllocation : ( ( rule__CourseAllocation__Group__0 ) ) ;
    public final void ruleCourseAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:327:2: ( ( ( rule__CourseAllocation__Group__0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:328:1: ( ( rule__CourseAllocation__Group__0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:328:1: ( ( rule__CourseAllocation__Group__0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:329:1: ( rule__CourseAllocation__Group__0 )
            {
             before(grammarAccess.getCourseAllocationAccess().getGroup()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:330:1: ( rule__CourseAllocation__Group__0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:330:2: rule__CourseAllocation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group__0_in_ruleCourseAllocation635);
            rule__CourseAllocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAllocationAccess().getGroup()); 

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
    // $ANTLR end "ruleCourseAllocation"


    // $ANTLR start "entryRuleRole"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:342:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:343:1: ( ruleRole EOF )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:344:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole662);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole669); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:351:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:355:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:356:1: ( ( rule__Role__Group__0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:356:1: ( ( rule__Role__Group__0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:357:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:358:1: ( rule__Role__Group__0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:358:2: rule__Role__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0_in_ruleRole695);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "ruleSemesterKind"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:371:1: ruleSemesterKind : ( ( rule__SemesterKind__Alternatives ) ) ;
    public final void ruleSemesterKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:375:1: ( ( ( rule__SemesterKind__Alternatives ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:376:1: ( ( rule__SemesterKind__Alternatives ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:376:1: ( ( rule__SemesterKind__Alternatives ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:377:1: ( rule__SemesterKind__Alternatives )
            {
             before(grammarAccess.getSemesterKindAccess().getAlternatives()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:378:1: ( rule__SemesterKind__Alternatives )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:378:2: rule__SemesterKind__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SemesterKind__Alternatives_in_ruleSemesterKind732);
            rule__SemesterKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSemesterKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSemesterKind"


    // $ANTLR start "rule__CourseCode__Alternatives_0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:389:1: rule__CourseCode__Alternatives_0 : ( ( 'TDT' ) | ( 'IT' ) );
    public final void rule__CourseCode__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:393:1: ( ( 'TDT' ) | ( 'IT' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:394:1: ( 'TDT' )
                    {
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:394:1: ( 'TDT' )
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:395:1: 'TDT'
                    {
                     before(grammarAccess.getCourseCodeAccess().getTDTKeyword_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__CourseCode__Alternatives_0768); 
                     after(grammarAccess.getCourseCodeAccess().getTDTKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:402:6: ( 'IT' )
                    {
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:402:6: ( 'IT' )
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:403:1: 'IT'
                    {
                     before(grammarAccess.getCourseCodeAccess().getITKeyword_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__CourseCode__Alternatives_0788); 
                     after(grammarAccess.getCourseCodeAccess().getITKeyword_0_1()); 

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
    // $ANTLR end "rule__CourseCode__Alternatives_0"


    // $ANTLR start "rule__EString__Alternatives"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:415:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:419:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:420:1: ( RULE_STRING )
                    {
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:420:1: ( RULE_STRING )
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:421:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives822); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:426:6: ( RULE_ID )
                    {
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:426:6: ( RULE_ID )
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:427:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives839); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__SemesterKind__Alternatives"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:437:1: rule__SemesterKind__Alternatives : ( ( ( 'h' ) ) | ( ( 'v' ) ) );
    public final void rule__SemesterKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:441:1: ( ( ( 'h' ) ) | ( ( 'v' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:442:1: ( ( 'h' ) )
                    {
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:442:1: ( ( 'h' ) )
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:443:1: ( 'h' )
                    {
                     before(grammarAccess.getSemesterKindAccess().getAUTUMNEnumLiteralDeclaration_0()); 
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:444:1: ( 'h' )
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:444:3: 'h'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__SemesterKind__Alternatives872); 

                    }

                     after(grammarAccess.getSemesterKindAccess().getAUTUMNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:449:6: ( ( 'v' ) )
                    {
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:449:6: ( ( 'v' ) )
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:450:1: ( 'v' )
                    {
                     before(grammarAccess.getSemesterKindAccess().getSPRINGEnumLiteralDeclaration_1()); 
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:451:1: ( 'v' )
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:451:3: 'v'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__SemesterKind__Alternatives893); 

                    }

                     after(grammarAccess.getSemesterKindAccess().getSPRINGEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SemesterKind__Alternatives"


    // $ANTLR start "rule__Department__Group__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:463:1: rule__Department__Group__0 : rule__Department__Group__0__Impl rule__Department__Group__1 ;
    public final void rule__Department__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:467:1: ( rule__Department__Group__0__Impl rule__Department__Group__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:468:2: rule__Department__Group__0__Impl rule__Department__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__0__Impl_in_rule__Department__Group__0926);
            rule__Department__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__1_in_rule__Department__Group__0929);
            rule__Department__Group__1();

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
    // $ANTLR end "rule__Department__Group__0"


    // $ANTLR start "rule__Department__Group__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:475:1: rule__Department__Group__0__Impl : ( () ) ;
    public final void rule__Department__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:479:1: ( ( () ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:480:1: ( () )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:480:1: ( () )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:481:1: ()
            {
             before(grammarAccess.getDepartmentAccess().getDepartmentAction_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:482:1: ()
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:484:1: 
            {
            }

             after(grammarAccess.getDepartmentAccess().getDepartmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Department__Group__0__Impl"


    // $ANTLR start "rule__Department__Group__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:494:1: rule__Department__Group__1 : rule__Department__Group__1__Impl rule__Department__Group__2 ;
    public final void rule__Department__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:498:1: ( rule__Department__Group__1__Impl rule__Department__Group__2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:499:2: rule__Department__Group__1__Impl rule__Department__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__1__Impl_in_rule__Department__Group__1987);
            rule__Department__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__2_in_rule__Department__Group__1990);
            rule__Department__Group__2();

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
    // $ANTLR end "rule__Department__Group__1"


    // $ANTLR start "rule__Department__Group__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:506:1: rule__Department__Group__1__Impl : ( 'department' ) ;
    public final void rule__Department__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:510:1: ( ( 'department' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:511:1: ( 'department' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:511:1: ( 'department' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:512:1: 'department'
            {
             before(grammarAccess.getDepartmentAccess().getDepartmentKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Department__Group__1__Impl1018); 
             after(grammarAccess.getDepartmentAccess().getDepartmentKeyword_1()); 

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
    // $ANTLR end "rule__Department__Group__1__Impl"


    // $ANTLR start "rule__Department__Group__2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:525:1: rule__Department__Group__2 : rule__Department__Group__2__Impl rule__Department__Group__3 ;
    public final void rule__Department__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:529:1: ( rule__Department__Group__2__Impl rule__Department__Group__3 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:530:2: rule__Department__Group__2__Impl rule__Department__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__2__Impl_in_rule__Department__Group__21049);
            rule__Department__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__3_in_rule__Department__Group__21052);
            rule__Department__Group__3();

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
    // $ANTLR end "rule__Department__Group__2"


    // $ANTLR start "rule__Department__Group__2__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:537:1: rule__Department__Group__2__Impl : ( ( rule__Department__NameAssignment_2 ) ) ;
    public final void rule__Department__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:541:1: ( ( ( rule__Department__NameAssignment_2 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:542:1: ( ( rule__Department__NameAssignment_2 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:542:1: ( ( rule__Department__NameAssignment_2 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:543:1: ( rule__Department__NameAssignment_2 )
            {
             before(grammarAccess.getDepartmentAccess().getNameAssignment_2()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:544:1: ( rule__Department__NameAssignment_2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:544:2: rule__Department__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__NameAssignment_2_in_rule__Department__Group__2__Impl1079);
            rule__Department__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDepartmentAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Department__Group__2__Impl"


    // $ANTLR start "rule__Department__Group__3"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:554:1: rule__Department__Group__3 : rule__Department__Group__3__Impl rule__Department__Group__4 ;
    public final void rule__Department__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:558:1: ( rule__Department__Group__3__Impl rule__Department__Group__4 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:559:2: rule__Department__Group__3__Impl rule__Department__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__3__Impl_in_rule__Department__Group__31109);
            rule__Department__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__4_in_rule__Department__Group__31112);
            rule__Department__Group__4();

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
    // $ANTLR end "rule__Department__Group__3"


    // $ANTLR start "rule__Department__Group__3__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:566:1: rule__Department__Group__3__Impl : ( 'staff' ) ;
    public final void rule__Department__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:570:1: ( ( 'staff' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:571:1: ( 'staff' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:571:1: ( 'staff' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:572:1: 'staff'
            {
             before(grammarAccess.getDepartmentAccess().getStaffKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Department__Group__3__Impl1140); 
             after(grammarAccess.getDepartmentAccess().getStaffKeyword_3()); 

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
    // $ANTLR end "rule__Department__Group__3__Impl"


    // $ANTLR start "rule__Department__Group__4"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:585:1: rule__Department__Group__4 : rule__Department__Group__4__Impl rule__Department__Group__5 ;
    public final void rule__Department__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:589:1: ( rule__Department__Group__4__Impl rule__Department__Group__5 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:590:2: rule__Department__Group__4__Impl rule__Department__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__4__Impl_in_rule__Department__Group__41171);
            rule__Department__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__5_in_rule__Department__Group__41174);
            rule__Department__Group__5();

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
    // $ANTLR end "rule__Department__Group__4"


    // $ANTLR start "rule__Department__Group__4__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:597:1: rule__Department__Group__4__Impl : ( '{' ) ;
    public final void rule__Department__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:601:1: ( ( '{' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:602:1: ( '{' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:602:1: ( '{' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:603:1: '{'
            {
             before(grammarAccess.getDepartmentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Department__Group__4__Impl1202); 
             after(grammarAccess.getDepartmentAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Department__Group__4__Impl"


    // $ANTLR start "rule__Department__Group__5"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:616:1: rule__Department__Group__5 : rule__Department__Group__5__Impl rule__Department__Group__6 ;
    public final void rule__Department__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:620:1: ( rule__Department__Group__5__Impl rule__Department__Group__6 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:621:2: rule__Department__Group__5__Impl rule__Department__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__5__Impl_in_rule__Department__Group__51233);
            rule__Department__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__6_in_rule__Department__Group__51236);
            rule__Department__Group__6();

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
    // $ANTLR end "rule__Department__Group__5"


    // $ANTLR start "rule__Department__Group__5__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:628:1: rule__Department__Group__5__Impl : ( ( rule__Department__EmployeesAssignment_5 )* ) ;
    public final void rule__Department__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:632:1: ( ( ( rule__Department__EmployeesAssignment_5 )* ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:633:1: ( ( rule__Department__EmployeesAssignment_5 )* )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:633:1: ( ( rule__Department__EmployeesAssignment_5 )* )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:634:1: ( rule__Department__EmployeesAssignment_5 )*
            {
             before(grammarAccess.getDepartmentAccess().getEmployeesAssignment_5()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:635:1: ( rule__Department__EmployeesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:635:2: rule__Department__EmployeesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Department__EmployeesAssignment_5_in_rule__Department__Group__5__Impl1263);
            	    rule__Department__EmployeesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDepartmentAccess().getEmployeesAssignment_5()); 

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
    // $ANTLR end "rule__Department__Group__5__Impl"


    // $ANTLR start "rule__Department__Group__6"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:645:1: rule__Department__Group__6 : rule__Department__Group__6__Impl rule__Department__Group__7 ;
    public final void rule__Department__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:649:1: ( rule__Department__Group__6__Impl rule__Department__Group__7 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:650:2: rule__Department__Group__6__Impl rule__Department__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__6__Impl_in_rule__Department__Group__61294);
            rule__Department__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__7_in_rule__Department__Group__61297);
            rule__Department__Group__7();

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
    // $ANTLR end "rule__Department__Group__6"


    // $ANTLR start "rule__Department__Group__6__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:657:1: rule__Department__Group__6__Impl : ( '}' ) ;
    public final void rule__Department__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:661:1: ( ( '}' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:662:1: ( '}' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:662:1: ( '}' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:663:1: '}'
            {
             before(grammarAccess.getDepartmentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Department__Group__6__Impl1325); 
             after(grammarAccess.getDepartmentAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Department__Group__6__Impl"


    // $ANTLR start "rule__Department__Group__7"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:676:1: rule__Department__Group__7 : rule__Department__Group__7__Impl rule__Department__Group__8 ;
    public final void rule__Department__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:680:1: ( rule__Department__Group__7__Impl rule__Department__Group__8 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:681:2: rule__Department__Group__7__Impl rule__Department__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__7__Impl_in_rule__Department__Group__71356);
            rule__Department__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__8_in_rule__Department__Group__71359);
            rule__Department__Group__8();

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
    // $ANTLR end "rule__Department__Group__7"


    // $ANTLR start "rule__Department__Group__7__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:688:1: rule__Department__Group__7__Impl : ( 'role' ) ;
    public final void rule__Department__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:692:1: ( ( 'role' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:693:1: ( 'role' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:693:1: ( 'role' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:694:1: 'role'
            {
             before(grammarAccess.getDepartmentAccess().getRoleKeyword_7()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Department__Group__7__Impl1387); 
             after(grammarAccess.getDepartmentAccess().getRoleKeyword_7()); 

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
    // $ANTLR end "rule__Department__Group__7__Impl"


    // $ANTLR start "rule__Department__Group__8"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:707:1: rule__Department__Group__8 : rule__Department__Group__8__Impl rule__Department__Group__9 ;
    public final void rule__Department__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:711:1: ( rule__Department__Group__8__Impl rule__Department__Group__9 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:712:2: rule__Department__Group__8__Impl rule__Department__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__8__Impl_in_rule__Department__Group__81418);
            rule__Department__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__9_in_rule__Department__Group__81421);
            rule__Department__Group__9();

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
    // $ANTLR end "rule__Department__Group__8"


    // $ANTLR start "rule__Department__Group__8__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:719:1: rule__Department__Group__8__Impl : ( '{' ) ;
    public final void rule__Department__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:723:1: ( ( '{' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:724:1: ( '{' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:724:1: ( '{' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:725:1: '{'
            {
             before(grammarAccess.getDepartmentAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Department__Group__8__Impl1449); 
             after(grammarAccess.getDepartmentAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Department__Group__8__Impl"


    // $ANTLR start "rule__Department__Group__9"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:738:1: rule__Department__Group__9 : rule__Department__Group__9__Impl rule__Department__Group__10 ;
    public final void rule__Department__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:742:1: ( rule__Department__Group__9__Impl rule__Department__Group__10 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:743:2: rule__Department__Group__9__Impl rule__Department__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__9__Impl_in_rule__Department__Group__91480);
            rule__Department__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__10_in_rule__Department__Group__91483);
            rule__Department__Group__10();

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
    // $ANTLR end "rule__Department__Group__9"


    // $ANTLR start "rule__Department__Group__9__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:750:1: rule__Department__Group__9__Impl : ( ( rule__Department__RolesAssignment_9 )* ) ;
    public final void rule__Department__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:754:1: ( ( ( rule__Department__RolesAssignment_9 )* ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:755:1: ( ( rule__Department__RolesAssignment_9 )* )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:755:1: ( ( rule__Department__RolesAssignment_9 )* )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:756:1: ( rule__Department__RolesAssignment_9 )*
            {
             before(grammarAccess.getDepartmentAccess().getRolesAssignment_9()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:757:1: ( rule__Department__RolesAssignment_9 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:757:2: rule__Department__RolesAssignment_9
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Department__RolesAssignment_9_in_rule__Department__Group__9__Impl1510);
            	    rule__Department__RolesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDepartmentAccess().getRolesAssignment_9()); 

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
    // $ANTLR end "rule__Department__Group__9__Impl"


    // $ANTLR start "rule__Department__Group__10"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:767:1: rule__Department__Group__10 : rule__Department__Group__10__Impl rule__Department__Group__11 ;
    public final void rule__Department__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:771:1: ( rule__Department__Group__10__Impl rule__Department__Group__11 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:772:2: rule__Department__Group__10__Impl rule__Department__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__10__Impl_in_rule__Department__Group__101541);
            rule__Department__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__11_in_rule__Department__Group__101544);
            rule__Department__Group__11();

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
    // $ANTLR end "rule__Department__Group__10"


    // $ANTLR start "rule__Department__Group__10__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:779:1: rule__Department__Group__10__Impl : ( '}' ) ;
    public final void rule__Department__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:783:1: ( ( '}' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:784:1: ( '}' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:784:1: ( '}' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:785:1: '}'
            {
             before(grammarAccess.getDepartmentAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Department__Group__10__Impl1572); 
             after(grammarAccess.getDepartmentAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Department__Group__10__Impl"


    // $ANTLR start "rule__Department__Group__11"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:798:1: rule__Department__Group__11 : rule__Department__Group__11__Impl rule__Department__Group__12 ;
    public final void rule__Department__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:802:1: ( rule__Department__Group__11__Impl rule__Department__Group__12 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:803:2: rule__Department__Group__11__Impl rule__Department__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__11__Impl_in_rule__Department__Group__111603);
            rule__Department__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__12_in_rule__Department__Group__111606);
            rule__Department__Group__12();

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
    // $ANTLR end "rule__Department__Group__11"


    // $ANTLR start "rule__Department__Group__11__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:810:1: rule__Department__Group__11__Impl : ( 'courses' ) ;
    public final void rule__Department__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:814:1: ( ( 'courses' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:815:1: ( 'courses' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:815:1: ( 'courses' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:816:1: 'courses'
            {
             before(grammarAccess.getDepartmentAccess().getCoursesKeyword_11()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Department__Group__11__Impl1634); 
             after(grammarAccess.getDepartmentAccess().getCoursesKeyword_11()); 

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
    // $ANTLR end "rule__Department__Group__11__Impl"


    // $ANTLR start "rule__Department__Group__12"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:829:1: rule__Department__Group__12 : rule__Department__Group__12__Impl rule__Department__Group__13 ;
    public final void rule__Department__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:833:1: ( rule__Department__Group__12__Impl rule__Department__Group__13 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:834:2: rule__Department__Group__12__Impl rule__Department__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__12__Impl_in_rule__Department__Group__121665);
            rule__Department__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__13_in_rule__Department__Group__121668);
            rule__Department__Group__13();

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
    // $ANTLR end "rule__Department__Group__12"


    // $ANTLR start "rule__Department__Group__12__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:841:1: rule__Department__Group__12__Impl : ( '{' ) ;
    public final void rule__Department__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:845:1: ( ( '{' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:846:1: ( '{' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:846:1: ( '{' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:847:1: '{'
            {
             before(grammarAccess.getDepartmentAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Department__Group__12__Impl1696); 
             after(grammarAccess.getDepartmentAccess().getLeftCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Department__Group__12__Impl"


    // $ANTLR start "rule__Department__Group__13"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:860:1: rule__Department__Group__13 : rule__Department__Group__13__Impl rule__Department__Group__14 ;
    public final void rule__Department__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:864:1: ( rule__Department__Group__13__Impl rule__Department__Group__14 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:865:2: rule__Department__Group__13__Impl rule__Department__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__13__Impl_in_rule__Department__Group__131727);
            rule__Department__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__14_in_rule__Department__Group__131730);
            rule__Department__Group__14();

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
    // $ANTLR end "rule__Department__Group__13"


    // $ANTLR start "rule__Department__Group__13__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:872:1: rule__Department__Group__13__Impl : ( ( rule__Department__CoursesAssignment_13 )* ) ;
    public final void rule__Department__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:876:1: ( ( ( rule__Department__CoursesAssignment_13 )* ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:877:1: ( ( rule__Department__CoursesAssignment_13 )* )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:877:1: ( ( rule__Department__CoursesAssignment_13 )* )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:878:1: ( rule__Department__CoursesAssignment_13 )*
            {
             before(grammarAccess.getDepartmentAccess().getCoursesAssignment_13()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:879:1: ( rule__Department__CoursesAssignment_13 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:879:2: rule__Department__CoursesAssignment_13
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Department__CoursesAssignment_13_in_rule__Department__Group__13__Impl1757);
            	    rule__Department__CoursesAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDepartmentAccess().getCoursesAssignment_13()); 

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
    // $ANTLR end "rule__Department__Group__13__Impl"


    // $ANTLR start "rule__Department__Group__14"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:889:1: rule__Department__Group__14 : rule__Department__Group__14__Impl rule__Department__Group__15 ;
    public final void rule__Department__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:893:1: ( rule__Department__Group__14__Impl rule__Department__Group__15 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:894:2: rule__Department__Group__14__Impl rule__Department__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__14__Impl_in_rule__Department__Group__141788);
            rule__Department__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__15_in_rule__Department__Group__141791);
            rule__Department__Group__15();

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
    // $ANTLR end "rule__Department__Group__14"


    // $ANTLR start "rule__Department__Group__14__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:901:1: rule__Department__Group__14__Impl : ( '}' ) ;
    public final void rule__Department__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:905:1: ( ( '}' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:906:1: ( '}' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:906:1: ( '}' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:907:1: '}'
            {
             before(grammarAccess.getDepartmentAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Department__Group__14__Impl1819); 
             after(grammarAccess.getDepartmentAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Department__Group__14__Impl"


    // $ANTLR start "rule__Department__Group__15"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:920:1: rule__Department__Group__15 : rule__Department__Group__15__Impl ;
    public final void rule__Department__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:924:1: ( rule__Department__Group__15__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:925:2: rule__Department__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Department__Group__15__Impl_in_rule__Department__Group__151850);
            rule__Department__Group__15__Impl();

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
    // $ANTLR end "rule__Department__Group__15"


    // $ANTLR start "rule__Department__Group__15__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:931:1: rule__Department__Group__15__Impl : ( ( rule__Department__SemestersAssignment_15 )* ) ;
    public final void rule__Department__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:935:1: ( ( ( rule__Department__SemestersAssignment_15 )* ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:936:1: ( ( rule__Department__SemestersAssignment_15 )* )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:936:1: ( ( rule__Department__SemestersAssignment_15 )* )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:937:1: ( rule__Department__SemestersAssignment_15 )*
            {
             before(grammarAccess.getDepartmentAccess().getSemestersAssignment_15()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:938:1: ( rule__Department__SemestersAssignment_15 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=13 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:938:2: rule__Department__SemestersAssignment_15
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Department__SemestersAssignment_15_in_rule__Department__Group__15__Impl1877);
            	    rule__Department__SemestersAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDepartmentAccess().getSemestersAssignment_15()); 

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
    // $ANTLR end "rule__Department__Group__15__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:980:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:984:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:985:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__01940);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__1_in_rule__Person__Group__01943);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:992:1: rule__Person__Group__0__Impl : ( () ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:996:1: ( ( () ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:997:1: ( () )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:997:1: ( () )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:998:1: ()
            {
             before(grammarAccess.getPersonAccess().getPersonAction_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:999:1: ()
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1001:1: 
            {
            }

             after(grammarAccess.getPersonAccess().getPersonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1011:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1015:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1016:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__12001);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__2_in_rule__Person__Group__12004);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1023:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1027:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1028:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1028:1: ( ( rule__Person__NameAssignment_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1029:1: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1030:1: ( rule__Person__NameAssignment_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1030:2: rule__Person__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__NameAssignment_1_in_rule__Person__Group__1__Impl2031);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1040:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1044:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1045:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__22061);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__3_in_rule__Person__Group__22064);
            rule__Person__Group__3();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1052:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )? ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1056:1: ( ( ( rule__Person__Group_2__0 )? ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1057:1: ( ( rule__Person__Group_2__0 )? )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1057:1: ( ( rule__Person__Group_2__0 )? )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1058:1: ( rule__Person__Group_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1059:1: ( rule__Person__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1059:2: rule__Person__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__0_in_rule__Person__Group__2__Impl2091);
                    rule__Person__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1069:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1073:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1074:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__3__Impl_in_rule__Person__Group__32122);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__4_in_rule__Person__Group__32125);
            rule__Person__Group__4();

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
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1081:1: rule__Person__Group__3__Impl : ( 'works' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1085:1: ( ( 'works' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1086:1: ( 'works' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1086:1: ( 'works' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1087:1: 'works'
            {
             before(grammarAccess.getPersonAccess().getWorksKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Person__Group__3__Impl2153); 
             after(grammarAccess.getPersonAccess().getWorksKeyword_3()); 

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
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1100:1: rule__Person__Group__4 : rule__Person__Group__4__Impl ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1104:1: ( rule__Person__Group__4__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1105:2: rule__Person__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__4__Impl_in_rule__Person__Group__42184);
            rule__Person__Group__4__Impl();

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
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1111:1: rule__Person__Group__4__Impl : ( ( rule__Person__EmploymentFactorAssignment_4 ) ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1115:1: ( ( ( rule__Person__EmploymentFactorAssignment_4 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1116:1: ( ( rule__Person__EmploymentFactorAssignment_4 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1116:1: ( ( rule__Person__EmploymentFactorAssignment_4 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1117:1: ( rule__Person__EmploymentFactorAssignment_4 )
            {
             before(grammarAccess.getPersonAccess().getEmploymentFactorAssignment_4()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1118:1: ( rule__Person__EmploymentFactorAssignment_4 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1118:2: rule__Person__EmploymentFactorAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__EmploymentFactorAssignment_4_in_rule__Person__Group__4__Impl2211);
            rule__Person__EmploymentFactorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getEmploymentFactorAssignment_4()); 

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
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group_2__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1138:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1142:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1143:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__0__Impl_in_rule__Person__Group_2__02251);
            rule__Person__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__1_in_rule__Person__Group_2__02254);
            rule__Person__Group_2__1();

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
    // $ANTLR end "rule__Person__Group_2__0"


    // $ANTLR start "rule__Person__Group_2__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1150:1: rule__Person__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1154:1: ( ( '(' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1155:1: ( '(' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1155:1: ( '(' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1156:1: '('
            {
             before(grammarAccess.getPersonAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Person__Group_2__0__Impl2282); 
             after(grammarAccess.getPersonAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Person__Group_2__0__Impl"


    // $ANTLR start "rule__Person__Group_2__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1169:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl rule__Person__Group_2__2 ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1173:1: ( rule__Person__Group_2__1__Impl rule__Person__Group_2__2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1174:2: rule__Person__Group_2__1__Impl rule__Person__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__1__Impl_in_rule__Person__Group_2__12313);
            rule__Person__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__2_in_rule__Person__Group_2__12316);
            rule__Person__Group_2__2();

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
    // $ANTLR end "rule__Person__Group_2__1"


    // $ANTLR start "rule__Person__Group_2__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1181:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__Group_2_1__0 )? ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1185:1: ( ( ( rule__Person__Group_2_1__0 )? ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1186:1: ( ( rule__Person__Group_2_1__0 )? )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1186:1: ( ( rule__Person__Group_2_1__0 )? )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1187:1: ( rule__Person__Group_2_1__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1188:1: ( rule__Person__Group_2_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1188:2: rule__Person__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_1__0_in_rule__Person__Group_2__1__Impl2343);
                    rule__Person__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Person__Group_2__1__Impl"


    // $ANTLR start "rule__Person__Group_2__2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1198:1: rule__Person__Group_2__2 : rule__Person__Group_2__2__Impl rule__Person__Group_2__3 ;
    public final void rule__Person__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1202:1: ( rule__Person__Group_2__2__Impl rule__Person__Group_2__3 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1203:2: rule__Person__Group_2__2__Impl rule__Person__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__2__Impl_in_rule__Person__Group_2__22374);
            rule__Person__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__3_in_rule__Person__Group_2__22377);
            rule__Person__Group_2__3();

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
    // $ANTLR end "rule__Person__Group_2__2"


    // $ANTLR start "rule__Person__Group_2__2__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1210:1: rule__Person__Group_2__2__Impl : ( ( rule__Person__Group_2_2__0 )? ) ;
    public final void rule__Person__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1214:1: ( ( ( rule__Person__Group_2_2__0 )? ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1215:1: ( ( rule__Person__Group_2_2__0 )? )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1215:1: ( ( rule__Person__Group_2_2__0 )? )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1216:1: ( rule__Person__Group_2_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2_2()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1217:1: ( rule__Person__Group_2_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1217:2: rule__Person__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_2__0_in_rule__Person__Group_2__2__Impl2404);
                    rule__Person__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Person__Group_2__2__Impl"


    // $ANTLR start "rule__Person__Group_2__3"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1227:1: rule__Person__Group_2__3 : rule__Person__Group_2__3__Impl rule__Person__Group_2__4 ;
    public final void rule__Person__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1231:1: ( rule__Person__Group_2__3__Impl rule__Person__Group_2__4 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1232:2: rule__Person__Group_2__3__Impl rule__Person__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__3__Impl_in_rule__Person__Group_2__32435);
            rule__Person__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__4_in_rule__Person__Group_2__32438);
            rule__Person__Group_2__4();

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
    // $ANTLR end "rule__Person__Group_2__3"


    // $ANTLR start "rule__Person__Group_2__3__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1239:1: rule__Person__Group_2__3__Impl : ( ( rule__Person__Group_2_3__0 )? ) ;
    public final void rule__Person__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1243:1: ( ( ( rule__Person__Group_2_3__0 )? ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1244:1: ( ( rule__Person__Group_2_3__0 )? )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1244:1: ( ( rule__Person__Group_2_3__0 )? )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1245:1: ( rule__Person__Group_2_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2_3()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1246:1: ( rule__Person__Group_2_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1246:2: rule__Person__Group_2_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_3__0_in_rule__Person__Group_2__3__Impl2465);
                    rule__Person__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Person__Group_2__3__Impl"


    // $ANTLR start "rule__Person__Group_2__4"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1256:1: rule__Person__Group_2__4 : rule__Person__Group_2__4__Impl ;
    public final void rule__Person__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1260:1: ( rule__Person__Group_2__4__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1261:2: rule__Person__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__4__Impl_in_rule__Person__Group_2__42496);
            rule__Person__Group_2__4__Impl();

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
    // $ANTLR end "rule__Person__Group_2__4"


    // $ANTLR start "rule__Person__Group_2__4__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1267:1: rule__Person__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Person__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1271:1: ( ( ')' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1272:1: ( ')' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1272:1: ( ')' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1273:1: ')'
            {
             before(grammarAccess.getPersonAccess().getRightParenthesisKeyword_2_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Person__Group_2__4__Impl2524); 
             after(grammarAccess.getPersonAccess().getRightParenthesisKeyword_2_4()); 

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
    // $ANTLR end "rule__Person__Group_2__4__Impl"


    // $ANTLR start "rule__Person__Group_2_1__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1296:1: rule__Person__Group_2_1__0 : rule__Person__Group_2_1__0__Impl rule__Person__Group_2_1__1 ;
    public final void rule__Person__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1300:1: ( rule__Person__Group_2_1__0__Impl rule__Person__Group_2_1__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1301:2: rule__Person__Group_2_1__0__Impl rule__Person__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_1__0__Impl_in_rule__Person__Group_2_1__02565);
            rule__Person__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_1__1_in_rule__Person__Group_2_1__02568);
            rule__Person__Group_2_1__1();

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
    // $ANTLR end "rule__Person__Group_2_1__0"


    // $ANTLR start "rule__Person__Group_2_1__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1308:1: rule__Person__Group_2_1__0__Impl : ( 'user:' ) ;
    public final void rule__Person__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1312:1: ( ( 'user:' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1313:1: ( 'user:' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1313:1: ( 'user:' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1314:1: 'user:'
            {
             before(grammarAccess.getPersonAccess().getUserKeyword_2_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Person__Group_2_1__0__Impl2596); 
             after(grammarAccess.getPersonAccess().getUserKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Person__Group_2_1__0__Impl"


    // $ANTLR start "rule__Person__Group_2_1__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1327:1: rule__Person__Group_2_1__1 : rule__Person__Group_2_1__1__Impl ;
    public final void rule__Person__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1331:1: ( rule__Person__Group_2_1__1__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1332:2: rule__Person__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_1__1__Impl_in_rule__Person__Group_2_1__12627);
            rule__Person__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Person__Group_2_1__1"


    // $ANTLR start "rule__Person__Group_2_1__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1338:1: rule__Person__Group_2_1__1__Impl : ( ( rule__Person__UserNameAssignment_2_1_1 ) ) ;
    public final void rule__Person__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1342:1: ( ( ( rule__Person__UserNameAssignment_2_1_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1343:1: ( ( rule__Person__UserNameAssignment_2_1_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1343:1: ( ( rule__Person__UserNameAssignment_2_1_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1344:1: ( rule__Person__UserNameAssignment_2_1_1 )
            {
             before(grammarAccess.getPersonAccess().getUserNameAssignment_2_1_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1345:1: ( rule__Person__UserNameAssignment_2_1_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1345:2: rule__Person__UserNameAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__UserNameAssignment_2_1_1_in_rule__Person__Group_2_1__1__Impl2654);
            rule__Person__UserNameAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getUserNameAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Person__Group_2_1__1__Impl"


    // $ANTLR start "rule__Person__Group_2_2__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1359:1: rule__Person__Group_2_2__0 : rule__Person__Group_2_2__0__Impl rule__Person__Group_2_2__1 ;
    public final void rule__Person__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1363:1: ( rule__Person__Group_2_2__0__Impl rule__Person__Group_2_2__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1364:2: rule__Person__Group_2_2__0__Impl rule__Person__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_2__0__Impl_in_rule__Person__Group_2_2__02688);
            rule__Person__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_2__1_in_rule__Person__Group_2_2__02691);
            rule__Person__Group_2_2__1();

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
    // $ANTLR end "rule__Person__Group_2_2__0"


    // $ANTLR start "rule__Person__Group_2_2__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1371:1: rule__Person__Group_2_2__0__Impl : ( 'email:' ) ;
    public final void rule__Person__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1375:1: ( ( 'email:' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1376:1: ( 'email:' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1376:1: ( 'email:' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1377:1: 'email:'
            {
             before(grammarAccess.getPersonAccess().getEmailKeyword_2_2_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Person__Group_2_2__0__Impl2719); 
             after(grammarAccess.getPersonAccess().getEmailKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Person__Group_2_2__0__Impl"


    // $ANTLR start "rule__Person__Group_2_2__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1390:1: rule__Person__Group_2_2__1 : rule__Person__Group_2_2__1__Impl ;
    public final void rule__Person__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1394:1: ( rule__Person__Group_2_2__1__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1395:2: rule__Person__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_2__1__Impl_in_rule__Person__Group_2_2__12750);
            rule__Person__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Person__Group_2_2__1"


    // $ANTLR start "rule__Person__Group_2_2__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1401:1: rule__Person__Group_2_2__1__Impl : ( ( rule__Person__EmailAssignment_2_2_1 ) ) ;
    public final void rule__Person__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1405:1: ( ( ( rule__Person__EmailAssignment_2_2_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1406:1: ( ( rule__Person__EmailAssignment_2_2_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1406:1: ( ( rule__Person__EmailAssignment_2_2_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1407:1: ( rule__Person__EmailAssignment_2_2_1 )
            {
             before(grammarAccess.getPersonAccess().getEmailAssignment_2_2_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1408:1: ( rule__Person__EmailAssignment_2_2_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1408:2: rule__Person__EmailAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__EmailAssignment_2_2_1_in_rule__Person__Group_2_2__1__Impl2777);
            rule__Person__EmailAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getEmailAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Person__Group_2_2__1__Impl"


    // $ANTLR start "rule__Person__Group_2_3__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1422:1: rule__Person__Group_2_3__0 : rule__Person__Group_2_3__0__Impl rule__Person__Group_2_3__1 ;
    public final void rule__Person__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1426:1: ( rule__Person__Group_2_3__0__Impl rule__Person__Group_2_3__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1427:2: rule__Person__Group_2_3__0__Impl rule__Person__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_3__0__Impl_in_rule__Person__Group_2_3__02811);
            rule__Person__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_3__1_in_rule__Person__Group_2_3__02814);
            rule__Person__Group_2_3__1();

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
    // $ANTLR end "rule__Person__Group_2_3__0"


    // $ANTLR start "rule__Person__Group_2_3__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1434:1: rule__Person__Group_2_3__0__Impl : ( 'face:' ) ;
    public final void rule__Person__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1438:1: ( ( 'face:' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1439:1: ( 'face:' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1439:1: ( 'face:' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1440:1: 'face:'
            {
             before(grammarAccess.getPersonAccess().getFaceKeyword_2_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Person__Group_2_3__0__Impl2842); 
             after(grammarAccess.getPersonAccess().getFaceKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Person__Group_2_3__0__Impl"


    // $ANTLR start "rule__Person__Group_2_3__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1453:1: rule__Person__Group_2_3__1 : rule__Person__Group_2_3__1__Impl ;
    public final void rule__Person__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1457:1: ( rule__Person__Group_2_3__1__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1458:2: rule__Person__Group_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2_3__1__Impl_in_rule__Person__Group_2_3__12873);
            rule__Person__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Person__Group_2_3__1"


    // $ANTLR start "rule__Person__Group_2_3__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1464:1: rule__Person__Group_2_3__1__Impl : ( ( rule__Person__FaceUrlAssignment_2_3_1 ) ) ;
    public final void rule__Person__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1468:1: ( ( ( rule__Person__FaceUrlAssignment_2_3_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1469:1: ( ( rule__Person__FaceUrlAssignment_2_3_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1469:1: ( ( rule__Person__FaceUrlAssignment_2_3_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1470:1: ( rule__Person__FaceUrlAssignment_2_3_1 )
            {
             before(grammarAccess.getPersonAccess().getFaceUrlAssignment_2_3_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1471:1: ( rule__Person__FaceUrlAssignment_2_3_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1471:2: rule__Person__FaceUrlAssignment_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__FaceUrlAssignment_2_3_1_in_rule__Person__Group_2_3__1__Impl2900);
            rule__Person__FaceUrlAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getFaceUrlAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Person__Group_2_3__1__Impl"


    // $ANTLR start "rule__Course__Group__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1485:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1489:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1490:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__02934);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1_in_rule__Course__Group__02937);
            rule__Course__Group__1();

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
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1497:1: rule__Course__Group__0__Impl : ( () ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1501:1: ( ( () ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1502:1: ( () )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1502:1: ( () )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1503:1: ()
            {
             before(grammarAccess.getCourseAccess().getCourseAction_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1504:1: ()
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1506:1: 
            {
            }

             after(grammarAccess.getCourseAccess().getCourseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1516:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1520:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1521:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__12995);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2_in_rule__Course__Group__12998);
            rule__Course__Group__2();

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
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1528:1: rule__Course__Group__1__Impl : ( ( rule__Course__NameAssignment_1 ) ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1532:1: ( ( ( rule__Course__NameAssignment_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1533:1: ( ( rule__Course__NameAssignment_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1533:1: ( ( rule__Course__NameAssignment_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1534:1: ( rule__Course__NameAssignment_1 )
            {
             before(grammarAccess.getCourseAccess().getNameAssignment_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1535:1: ( rule__Course__NameAssignment_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1535:2: rule__Course__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__NameAssignment_1_in_rule__Course__Group__1__Impl3025);
            rule__Course__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1545:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1549:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1550:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__23055);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3_in_rule__Course__Group__23058);
            rule__Course__Group__3();

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
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1557:1: rule__Course__Group__2__Impl : ( ( rule__Course__FullNameAssignment_2 ) ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1561:1: ( ( ( rule__Course__FullNameAssignment_2 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1562:1: ( ( rule__Course__FullNameAssignment_2 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1562:1: ( ( rule__Course__FullNameAssignment_2 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1563:1: ( rule__Course__FullNameAssignment_2 )
            {
             before(grammarAccess.getCourseAccess().getFullNameAssignment_2()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1564:1: ( rule__Course__FullNameAssignment_2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1564:2: rule__Course__FullNameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__FullNameAssignment_2_in_rule__Course__Group__2__Impl3085);
            rule__Course__FullNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getFullNameAssignment_2()); 

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
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1574:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1578:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1579:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__33115);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4_in_rule__Course__Group__33118);
            rule__Course__Group__4();

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
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1586:1: rule__Course__Group__3__Impl : ( 'requires' ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1590:1: ( ( 'requires' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1591:1: ( 'requires' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1591:1: ( 'requires' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1592:1: 'requires'
            {
             before(grammarAccess.getCourseAccess().getRequiresKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Course__Group__3__Impl3146); 
             after(grammarAccess.getCourseAccess().getRequiresKeyword_3()); 

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
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1605:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1609:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1610:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__43177);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__5_in_rule__Course__Group__43180);
            rule__Course__Group__5();

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
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1617:1: rule__Course__Group__4__Impl : ( ( rule__Course__RequiredRolesAssignment_4 ) ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1621:1: ( ( ( rule__Course__RequiredRolesAssignment_4 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1622:1: ( ( rule__Course__RequiredRolesAssignment_4 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1622:1: ( ( rule__Course__RequiredRolesAssignment_4 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1623:1: ( rule__Course__RequiredRolesAssignment_4 )
            {
             before(grammarAccess.getCourseAccess().getRequiredRolesAssignment_4()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1624:1: ( rule__Course__RequiredRolesAssignment_4 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1624:2: rule__Course__RequiredRolesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__RequiredRolesAssignment_4_in_rule__Course__Group__4__Impl3207);
            rule__Course__RequiredRolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getRequiredRolesAssignment_4()); 

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
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1634:1: rule__Course__Group__5 : rule__Course__Group__5__Impl ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1638:1: ( rule__Course__Group__5__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1639:2: rule__Course__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group__5__Impl_in_rule__Course__Group__53237);
            rule__Course__Group__5__Impl();

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
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1645:1: rule__Course__Group__5__Impl : ( ( rule__Course__Group_5__0 )* ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1649:1: ( ( ( rule__Course__Group_5__0 )* ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1650:1: ( ( rule__Course__Group_5__0 )* )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1650:1: ( ( rule__Course__Group_5__0 )* )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1651:1: ( rule__Course__Group_5__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_5()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1652:1: ( rule__Course__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1652:2: rule__Course__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Course__Group_5__0_in_rule__Course__Group__5__Impl3264);
            	    rule__Course__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Course__Group_5__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1674:1: rule__Course__Group_5__0 : rule__Course__Group_5__0__Impl rule__Course__Group_5__1 ;
    public final void rule__Course__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1678:1: ( rule__Course__Group_5__0__Impl rule__Course__Group_5__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1679:2: rule__Course__Group_5__0__Impl rule__Course__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_5__0__Impl_in_rule__Course__Group_5__03307);
            rule__Course__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_5__1_in_rule__Course__Group_5__03310);
            rule__Course__Group_5__1();

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
    // $ANTLR end "rule__Course__Group_5__0"


    // $ANTLR start "rule__Course__Group_5__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1686:1: rule__Course__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1690:1: ( ( ',' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1691:1: ( ',' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1691:1: ( ',' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1692:1: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Course__Group_5__0__Impl3338); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Course__Group_5__0__Impl"


    // $ANTLR start "rule__Course__Group_5__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1705:1: rule__Course__Group_5__1 : rule__Course__Group_5__1__Impl ;
    public final void rule__Course__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1709:1: ( rule__Course__Group_5__1__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1710:2: rule__Course__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__Group_5__1__Impl_in_rule__Course__Group_5__13369);
            rule__Course__Group_5__1__Impl();

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
    // $ANTLR end "rule__Course__Group_5__1"


    // $ANTLR start "rule__Course__Group_5__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1716:1: rule__Course__Group_5__1__Impl : ( ( rule__Course__RequiredRolesAssignment_5_1 ) ) ;
    public final void rule__Course__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1720:1: ( ( ( rule__Course__RequiredRolesAssignment_5_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1721:1: ( ( rule__Course__RequiredRolesAssignment_5_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1721:1: ( ( rule__Course__RequiredRolesAssignment_5_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1722:1: ( rule__Course__RequiredRolesAssignment_5_1 )
            {
             before(grammarAccess.getCourseAccess().getRequiredRolesAssignment_5_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1723:1: ( rule__Course__RequiredRolesAssignment_5_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1723:2: rule__Course__RequiredRolesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Course__RequiredRolesAssignment_5_1_in_rule__Course__Group_5__1__Impl3396);
            rule__Course__RequiredRolesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getRequiredRolesAssignment_5_1()); 

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
    // $ANTLR end "rule__Course__Group_5__1__Impl"


    // $ANTLR start "rule__CourseCode__Group__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1737:1: rule__CourseCode__Group__0 : rule__CourseCode__Group__0__Impl rule__CourseCode__Group__1 ;
    public final void rule__CourseCode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1741:1: ( rule__CourseCode__Group__0__Impl rule__CourseCode__Group__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1742:2: rule__CourseCode__Group__0__Impl rule__CourseCode__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseCode__Group__0__Impl_in_rule__CourseCode__Group__03430);
            rule__CourseCode__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseCode__Group__1_in_rule__CourseCode__Group__03433);
            rule__CourseCode__Group__1();

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
    // $ANTLR end "rule__CourseCode__Group__0"


    // $ANTLR start "rule__CourseCode__Group__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1749:1: rule__CourseCode__Group__0__Impl : ( ( rule__CourseCode__Alternatives_0 ) ) ;
    public final void rule__CourseCode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1753:1: ( ( ( rule__CourseCode__Alternatives_0 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1754:1: ( ( rule__CourseCode__Alternatives_0 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1754:1: ( ( rule__CourseCode__Alternatives_0 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1755:1: ( rule__CourseCode__Alternatives_0 )
            {
             before(grammarAccess.getCourseCodeAccess().getAlternatives_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1756:1: ( rule__CourseCode__Alternatives_0 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1756:2: rule__CourseCode__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseCode__Alternatives_0_in_rule__CourseCode__Group__0__Impl3460);
            rule__CourseCode__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCourseCodeAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__CourseCode__Group__0__Impl"


    // $ANTLR start "rule__CourseCode__Group__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1766:1: rule__CourseCode__Group__1 : rule__CourseCode__Group__1__Impl ;
    public final void rule__CourseCode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1770:1: ( rule__CourseCode__Group__1__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1771:2: rule__CourseCode__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseCode__Group__1__Impl_in_rule__CourseCode__Group__13490);
            rule__CourseCode__Group__1__Impl();

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
    // $ANTLR end "rule__CourseCode__Group__1"


    // $ANTLR start "rule__CourseCode__Group__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1777:1: rule__CourseCode__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__CourseCode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1781:1: ( ( RULE_INT ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1782:1: ( RULE_INT )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1782:1: ( RULE_INT )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1783:1: RULE_INT
            {
             before(grammarAccess.getCourseCodeAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__CourseCode__Group__1__Impl3517); 
             after(grammarAccess.getCourseCodeAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__CourseCode__Group__1__Impl"


    // $ANTLR start "rule__Semester__Group__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1798:1: rule__Semester__Group__0 : rule__Semester__Group__0__Impl rule__Semester__Group__1 ;
    public final void rule__Semester__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1802:1: ( rule__Semester__Group__0__Impl rule__Semester__Group__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1803:2: rule__Semester__Group__0__Impl rule__Semester__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__0__Impl_in_rule__Semester__Group__03550);
            rule__Semester__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__1_in_rule__Semester__Group__03553);
            rule__Semester__Group__1();

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
    // $ANTLR end "rule__Semester__Group__0"


    // $ANTLR start "rule__Semester__Group__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1810:1: rule__Semester__Group__0__Impl : ( () ) ;
    public final void rule__Semester__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1814:1: ( ( () ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1815:1: ( () )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1815:1: ( () )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1816:1: ()
            {
             before(grammarAccess.getSemesterAccess().getSemesterAction_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1817:1: ()
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1819:1: 
            {
            }

             after(grammarAccess.getSemesterAccess().getSemesterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Semester__Group__0__Impl"


    // $ANTLR start "rule__Semester__Group__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1829:1: rule__Semester__Group__1 : rule__Semester__Group__1__Impl rule__Semester__Group__2 ;
    public final void rule__Semester__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1833:1: ( rule__Semester__Group__1__Impl rule__Semester__Group__2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1834:2: rule__Semester__Group__1__Impl rule__Semester__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__1__Impl_in_rule__Semester__Group__13611);
            rule__Semester__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__2_in_rule__Semester__Group__13614);
            rule__Semester__Group__2();

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
    // $ANTLR end "rule__Semester__Group__1"


    // $ANTLR start "rule__Semester__Group__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1841:1: rule__Semester__Group__1__Impl : ( ( rule__Semester__KindAssignment_1 ) ) ;
    public final void rule__Semester__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1845:1: ( ( ( rule__Semester__KindAssignment_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1846:1: ( ( rule__Semester__KindAssignment_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1846:1: ( ( rule__Semester__KindAssignment_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1847:1: ( rule__Semester__KindAssignment_1 )
            {
             before(grammarAccess.getSemesterAccess().getKindAssignment_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1848:1: ( rule__Semester__KindAssignment_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1848:2: rule__Semester__KindAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semester__KindAssignment_1_in_rule__Semester__Group__1__Impl3641);
            rule__Semester__KindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSemesterAccess().getKindAssignment_1()); 

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
    // $ANTLR end "rule__Semester__Group__1__Impl"


    // $ANTLR start "rule__Semester__Group__2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1858:1: rule__Semester__Group__2 : rule__Semester__Group__2__Impl rule__Semester__Group__3 ;
    public final void rule__Semester__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1862:1: ( rule__Semester__Group__2__Impl rule__Semester__Group__3 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1863:2: rule__Semester__Group__2__Impl rule__Semester__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__2__Impl_in_rule__Semester__Group__23671);
            rule__Semester__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__3_in_rule__Semester__Group__23674);
            rule__Semester__Group__3();

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
    // $ANTLR end "rule__Semester__Group__2"


    // $ANTLR start "rule__Semester__Group__2__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1870:1: rule__Semester__Group__2__Impl : ( ( rule__Semester__YearAssignment_2 ) ) ;
    public final void rule__Semester__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1874:1: ( ( ( rule__Semester__YearAssignment_2 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1875:1: ( ( rule__Semester__YearAssignment_2 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1875:1: ( ( rule__Semester__YearAssignment_2 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1876:1: ( rule__Semester__YearAssignment_2 )
            {
             before(grammarAccess.getSemesterAccess().getYearAssignment_2()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1877:1: ( rule__Semester__YearAssignment_2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1877:2: rule__Semester__YearAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semester__YearAssignment_2_in_rule__Semester__Group__2__Impl3701);
            rule__Semester__YearAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSemesterAccess().getYearAssignment_2()); 

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
    // $ANTLR end "rule__Semester__Group__2__Impl"


    // $ANTLR start "rule__Semester__Group__3"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1887:1: rule__Semester__Group__3 : rule__Semester__Group__3__Impl rule__Semester__Group__4 ;
    public final void rule__Semester__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1891:1: ( rule__Semester__Group__3__Impl rule__Semester__Group__4 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1892:2: rule__Semester__Group__3__Impl rule__Semester__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__3__Impl_in_rule__Semester__Group__33731);
            rule__Semester__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__4_in_rule__Semester__Group__33734);
            rule__Semester__Group__4();

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
    // $ANTLR end "rule__Semester__Group__3"


    // $ANTLR start "rule__Semester__Group__3__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1899:1: rule__Semester__Group__3__Impl : ( '{' ) ;
    public final void rule__Semester__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1903:1: ( ( '{' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1904:1: ( '{' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1904:1: ( '{' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1905:1: '{'
            {
             before(grammarAccess.getSemesterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Semester__Group__3__Impl3762); 
             after(grammarAccess.getSemesterAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Semester__Group__3__Impl"


    // $ANTLR start "rule__Semester__Group__4"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1918:1: rule__Semester__Group__4 : rule__Semester__Group__4__Impl rule__Semester__Group__5 ;
    public final void rule__Semester__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1922:1: ( rule__Semester__Group__4__Impl rule__Semester__Group__5 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1923:2: rule__Semester__Group__4__Impl rule__Semester__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__4__Impl_in_rule__Semester__Group__43793);
            rule__Semester__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__5_in_rule__Semester__Group__43796);
            rule__Semester__Group__5();

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
    // $ANTLR end "rule__Semester__Group__4"


    // $ANTLR start "rule__Semester__Group__4__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1930:1: rule__Semester__Group__4__Impl : ( ( rule__Semester__CoursesAssignment_4 )* ) ;
    public final void rule__Semester__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1934:1: ( ( ( rule__Semester__CoursesAssignment_4 )* ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1935:1: ( ( rule__Semester__CoursesAssignment_4 )* )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1935:1: ( ( rule__Semester__CoursesAssignment_4 )* )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1936:1: ( rule__Semester__CoursesAssignment_4 )*
            {
             before(grammarAccess.getSemesterAccess().getCoursesAssignment_4()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1937:1: ( rule__Semester__CoursesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1937:2: rule__Semester__CoursesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Semester__CoursesAssignment_4_in_rule__Semester__Group__4__Impl3823);
            	    rule__Semester__CoursesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSemesterAccess().getCoursesAssignment_4()); 

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
    // $ANTLR end "rule__Semester__Group__4__Impl"


    // $ANTLR start "rule__Semester__Group__5"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1947:1: rule__Semester__Group__5 : rule__Semester__Group__5__Impl ;
    public final void rule__Semester__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1951:1: ( rule__Semester__Group__5__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1952:2: rule__Semester__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Semester__Group__5__Impl_in_rule__Semester__Group__53854);
            rule__Semester__Group__5__Impl();

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
    // $ANTLR end "rule__Semester__Group__5"


    // $ANTLR start "rule__Semester__Group__5__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1958:1: rule__Semester__Group__5__Impl : ( '}' ) ;
    public final void rule__Semester__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1962:1: ( ( '}' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1963:1: ( '}' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1963:1: ( '}' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1964:1: '}'
            {
             before(grammarAccess.getSemesterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Semester__Group__5__Impl3882); 
             after(grammarAccess.getSemesterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Semester__Group__5__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1989:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1993:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:1994:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__03925);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__03928);
            rule__Factor__Group__1();

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
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2001:1: rule__Factor__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2005:1: ( ( RULE_INT ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2006:1: ( RULE_INT )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2006:1: ( RULE_INT )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2007:1: RULE_INT
            {
             before(grammarAccess.getFactorAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Factor__Group__0__Impl3955); 
             after(grammarAccess.getFactorAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2018:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2022:1: ( rule__Factor__Group__1__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2023:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__13984);
            rule__Factor__Group__1__Impl();

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
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2029:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )? ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2033:1: ( ( ( rule__Factor__Group_1__0 )? ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2034:1: ( ( rule__Factor__Group_1__0 )? )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2034:1: ( ( rule__Factor__Group_1__0 )? )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2035:1: ( rule__Factor__Group_1__0 )?
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2036:1: ( rule__Factor__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2036:2: rule__Factor__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Factor__Group_1__0_in_rule__Factor__Group__1__Impl4011);
                    rule__Factor__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2050:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2054:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2055:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Factor__Group_1__0__Impl_in_rule__Factor__Group_1__04046);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Factor__Group_1__1_in_rule__Factor__Group_1__04049);
            rule__Factor__Group_1__1();

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
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2062:1: rule__Factor__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2066:1: ( ( '.' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2067:1: ( '.' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2067:1: ( '.' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2068:1: '.'
            {
             before(grammarAccess.getFactorAccess().getFullStopKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Factor__Group_1__0__Impl4077); 
             after(grammarAccess.getFactorAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2081:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2085:1: ( rule__Factor__Group_1__1__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2086:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Factor__Group_1__1__Impl_in_rule__Factor__Group_1__14108);
            rule__Factor__Group_1__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2092:1: rule__Factor__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2096:1: ( ( RULE_INT ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2097:1: ( RULE_INT )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2097:1: ( RULE_INT )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2098:1: RULE_INT
            {
             before(grammarAccess.getFactorAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Factor__Group_1__1__Impl4135); 
             after(grammarAccess.getFactorAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__CourseInstance__Group__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2114:1: rule__CourseInstance__Group__0 : rule__CourseInstance__Group__0__Impl rule__CourseInstance__Group__1 ;
    public final void rule__CourseInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2118:1: ( rule__CourseInstance__Group__0__Impl rule__CourseInstance__Group__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2119:2: rule__CourseInstance__Group__0__Impl rule__CourseInstance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__0__Impl_in_rule__CourseInstance__Group__04169);
            rule__CourseInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__1_in_rule__CourseInstance__Group__04172);
            rule__CourseInstance__Group__1();

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
    // $ANTLR end "rule__CourseInstance__Group__0"


    // $ANTLR start "rule__CourseInstance__Group__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2126:1: rule__CourseInstance__Group__0__Impl : ( () ) ;
    public final void rule__CourseInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2130:1: ( ( () ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2131:1: ( () )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2131:1: ( () )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2132:1: ()
            {
             before(grammarAccess.getCourseInstanceAccess().getCourseInstanceAction_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2133:1: ()
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2135:1: 
            {
            }

             after(grammarAccess.getCourseInstanceAccess().getCourseInstanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseInstance__Group__0__Impl"


    // $ANTLR start "rule__CourseInstance__Group__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2145:1: rule__CourseInstance__Group__1 : rule__CourseInstance__Group__1__Impl rule__CourseInstance__Group__2 ;
    public final void rule__CourseInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2149:1: ( rule__CourseInstance__Group__1__Impl rule__CourseInstance__Group__2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2150:2: rule__CourseInstance__Group__1__Impl rule__CourseInstance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__1__Impl_in_rule__CourseInstance__Group__14230);
            rule__CourseInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__2_in_rule__CourseInstance__Group__14233);
            rule__CourseInstance__Group__2();

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
    // $ANTLR end "rule__CourseInstance__Group__1"


    // $ANTLR start "rule__CourseInstance__Group__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2157:1: rule__CourseInstance__Group__1__Impl : ( ( rule__CourseInstance__CourseAssignment_1 ) ) ;
    public final void rule__CourseInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2161:1: ( ( ( rule__CourseInstance__CourseAssignment_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2162:1: ( ( rule__CourseInstance__CourseAssignment_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2162:1: ( ( rule__CourseInstance__CourseAssignment_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2163:1: ( rule__CourseInstance__CourseAssignment_1 )
            {
             before(grammarAccess.getCourseInstanceAccess().getCourseAssignment_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2164:1: ( rule__CourseInstance__CourseAssignment_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2164:2: rule__CourseInstance__CourseAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__CourseAssignment_1_in_rule__CourseInstance__Group__1__Impl4260);
            rule__CourseInstance__CourseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseInstanceAccess().getCourseAssignment_1()); 

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
    // $ANTLR end "rule__CourseInstance__Group__1__Impl"


    // $ANTLR start "rule__CourseInstance__Group__2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2174:1: rule__CourseInstance__Group__2 : rule__CourseInstance__Group__2__Impl rule__CourseInstance__Group__3 ;
    public final void rule__CourseInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2178:1: ( rule__CourseInstance__Group__2__Impl rule__CourseInstance__Group__3 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2179:2: rule__CourseInstance__Group__2__Impl rule__CourseInstance__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__2__Impl_in_rule__CourseInstance__Group__24290);
            rule__CourseInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__3_in_rule__CourseInstance__Group__24293);
            rule__CourseInstance__Group__3();

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
    // $ANTLR end "rule__CourseInstance__Group__2"


    // $ANTLR start "rule__CourseInstance__Group__2__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2186:1: rule__CourseInstance__Group__2__Impl : ( '{' ) ;
    public final void rule__CourseInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2190:1: ( ( '{' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2191:1: ( '{' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2191:1: ( '{' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2192:1: '{'
            {
             before(grammarAccess.getCourseInstanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__CourseInstance__Group__2__Impl4321); 
             after(grammarAccess.getCourseInstanceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__CourseInstance__Group__2__Impl"


    // $ANTLR start "rule__CourseInstance__Group__3"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2205:1: rule__CourseInstance__Group__3 : rule__CourseInstance__Group__3__Impl rule__CourseInstance__Group__4 ;
    public final void rule__CourseInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2209:1: ( rule__CourseInstance__Group__3__Impl rule__CourseInstance__Group__4 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2210:2: rule__CourseInstance__Group__3__Impl rule__CourseInstance__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__3__Impl_in_rule__CourseInstance__Group__34352);
            rule__CourseInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__4_in_rule__CourseInstance__Group__34355);
            rule__CourseInstance__Group__4();

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
    // $ANTLR end "rule__CourseInstance__Group__3"


    // $ANTLR start "rule__CourseInstance__Group__3__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2217:1: rule__CourseInstance__Group__3__Impl : ( ( rule__CourseInstance__AllocationsAssignment_3 )* ) ;
    public final void rule__CourseInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2221:1: ( ( ( rule__CourseInstance__AllocationsAssignment_3 )* ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2222:1: ( ( rule__CourseInstance__AllocationsAssignment_3 )* )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2222:1: ( ( rule__CourseInstance__AllocationsAssignment_3 )* )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2223:1: ( rule__CourseInstance__AllocationsAssignment_3 )*
            {
             before(grammarAccess.getCourseInstanceAccess().getAllocationsAssignment_3()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2224:1: ( rule__CourseInstance__AllocationsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2224:2: rule__CourseInstance__AllocationsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__AllocationsAssignment_3_in_rule__CourseInstance__Group__3__Impl4382);
            	    rule__CourseInstance__AllocationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getCourseInstanceAccess().getAllocationsAssignment_3()); 

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
    // $ANTLR end "rule__CourseInstance__Group__3__Impl"


    // $ANTLR start "rule__CourseInstance__Group__4"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2234:1: rule__CourseInstance__Group__4 : rule__CourseInstance__Group__4__Impl ;
    public final void rule__CourseInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2238:1: ( rule__CourseInstance__Group__4__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2239:2: rule__CourseInstance__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseInstance__Group__4__Impl_in_rule__CourseInstance__Group__44413);
            rule__CourseInstance__Group__4__Impl();

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
    // $ANTLR end "rule__CourseInstance__Group__4"


    // $ANTLR start "rule__CourseInstance__Group__4__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2245:1: rule__CourseInstance__Group__4__Impl : ( '}' ) ;
    public final void rule__CourseInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2249:1: ( ( '}' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2250:1: ( '}' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2250:1: ( '}' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2251:1: '}'
            {
             before(grammarAccess.getCourseInstanceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__CourseInstance__Group__4__Impl4441); 
             after(grammarAccess.getCourseInstanceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__CourseInstance__Group__4__Impl"


    // $ANTLR start "rule__CourseAllocation__Group__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2274:1: rule__CourseAllocation__Group__0 : rule__CourseAllocation__Group__0__Impl rule__CourseAllocation__Group__1 ;
    public final void rule__CourseAllocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2278:1: ( rule__CourseAllocation__Group__0__Impl rule__CourseAllocation__Group__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2279:2: rule__CourseAllocation__Group__0__Impl rule__CourseAllocation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group__0__Impl_in_rule__CourseAllocation__Group__04482);
            rule__CourseAllocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group__1_in_rule__CourseAllocation__Group__04485);
            rule__CourseAllocation__Group__1();

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
    // $ANTLR end "rule__CourseAllocation__Group__0"


    // $ANTLR start "rule__CourseAllocation__Group__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2286:1: rule__CourseAllocation__Group__0__Impl : ( () ) ;
    public final void rule__CourseAllocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2290:1: ( ( () ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2291:1: ( () )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2291:1: ( () )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2292:1: ()
            {
             before(grammarAccess.getCourseAllocationAccess().getCourseAllocationAction_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2293:1: ()
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2295:1: 
            {
            }

             after(grammarAccess.getCourseAllocationAccess().getCourseAllocationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CourseAllocation__Group__0__Impl"


    // $ANTLR start "rule__CourseAllocation__Group__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2305:1: rule__CourseAllocation__Group__1 : rule__CourseAllocation__Group__1__Impl rule__CourseAllocation__Group__2 ;
    public final void rule__CourseAllocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2309:1: ( rule__CourseAllocation__Group__1__Impl rule__CourseAllocation__Group__2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2310:2: rule__CourseAllocation__Group__1__Impl rule__CourseAllocation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group__1__Impl_in_rule__CourseAllocation__Group__14543);
            rule__CourseAllocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group__2_in_rule__CourseAllocation__Group__14546);
            rule__CourseAllocation__Group__2();

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
    // $ANTLR end "rule__CourseAllocation__Group__1"


    // $ANTLR start "rule__CourseAllocation__Group__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2317:1: rule__CourseAllocation__Group__1__Impl : ( ( rule__CourseAllocation__PersonAssignment_1 ) ) ;
    public final void rule__CourseAllocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2321:1: ( ( ( rule__CourseAllocation__PersonAssignment_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2322:1: ( ( rule__CourseAllocation__PersonAssignment_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2322:1: ( ( rule__CourseAllocation__PersonAssignment_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2323:1: ( rule__CourseAllocation__PersonAssignment_1 )
            {
             before(grammarAccess.getCourseAllocationAccess().getPersonAssignment_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2324:1: ( rule__CourseAllocation__PersonAssignment_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2324:2: rule__CourseAllocation__PersonAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__PersonAssignment_1_in_rule__CourseAllocation__Group__1__Impl4573);
            rule__CourseAllocation__PersonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAllocationAccess().getPersonAssignment_1()); 

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
    // $ANTLR end "rule__CourseAllocation__Group__1__Impl"


    // $ANTLR start "rule__CourseAllocation__Group__2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2334:1: rule__CourseAllocation__Group__2 : rule__CourseAllocation__Group__2__Impl rule__CourseAllocation__Group__3 ;
    public final void rule__CourseAllocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2338:1: ( rule__CourseAllocation__Group__2__Impl rule__CourseAllocation__Group__3 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2339:2: rule__CourseAllocation__Group__2__Impl rule__CourseAllocation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group__2__Impl_in_rule__CourseAllocation__Group__24603);
            rule__CourseAllocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group__3_in_rule__CourseAllocation__Group__24606);
            rule__CourseAllocation__Group__3();

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
    // $ANTLR end "rule__CourseAllocation__Group__2"


    // $ANTLR start "rule__CourseAllocation__Group__2__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2346:1: rule__CourseAllocation__Group__2__Impl : ( ( rule__CourseAllocation__Group_2__0 )? ) ;
    public final void rule__CourseAllocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2350:1: ( ( ( rule__CourseAllocation__Group_2__0 )? ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2351:1: ( ( rule__CourseAllocation__Group_2__0 )? )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2351:1: ( ( rule__CourseAllocation__Group_2__0 )? )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2352:1: ( rule__CourseAllocation__Group_2__0 )?
            {
             before(grammarAccess.getCourseAllocationAccess().getGroup_2()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2353:1: ( rule__CourseAllocation__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2353:2: rule__CourseAllocation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group_2__0_in_rule__CourseAllocation__Group__2__Impl4633);
                    rule__CourseAllocation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAllocationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__CourseAllocation__Group__2__Impl"


    // $ANTLR start "rule__CourseAllocation__Group__3"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2363:1: rule__CourseAllocation__Group__3 : rule__CourseAllocation__Group__3__Impl ;
    public final void rule__CourseAllocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2367:1: ( rule__CourseAllocation__Group__3__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2368:2: rule__CourseAllocation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group__3__Impl_in_rule__CourseAllocation__Group__34664);
            rule__CourseAllocation__Group__3__Impl();

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
    // $ANTLR end "rule__CourseAllocation__Group__3"


    // $ANTLR start "rule__CourseAllocation__Group__3__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2374:1: rule__CourseAllocation__Group__3__Impl : ( ( rule__CourseAllocation__Group_3__0 )? ) ;
    public final void rule__CourseAllocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2378:1: ( ( ( rule__CourseAllocation__Group_3__0 )? ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2379:1: ( ( rule__CourseAllocation__Group_3__0 )? )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2379:1: ( ( rule__CourseAllocation__Group_3__0 )? )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2380:1: ( rule__CourseAllocation__Group_3__0 )?
            {
             before(grammarAccess.getCourseAllocationAccess().getGroup_3()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2381:1: ( rule__CourseAllocation__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2381:2: rule__CourseAllocation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group_3__0_in_rule__CourseAllocation__Group__3__Impl4691);
                    rule__CourseAllocation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCourseAllocationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__CourseAllocation__Group__3__Impl"


    // $ANTLR start "rule__CourseAllocation__Group_2__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2399:1: rule__CourseAllocation__Group_2__0 : rule__CourseAllocation__Group_2__0__Impl rule__CourseAllocation__Group_2__1 ;
    public final void rule__CourseAllocation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2403:1: ( rule__CourseAllocation__Group_2__0__Impl rule__CourseAllocation__Group_2__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2404:2: rule__CourseAllocation__Group_2__0__Impl rule__CourseAllocation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group_2__0__Impl_in_rule__CourseAllocation__Group_2__04730);
            rule__CourseAllocation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group_2__1_in_rule__CourseAllocation__Group_2__04733);
            rule__CourseAllocation__Group_2__1();

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
    // $ANTLR end "rule__CourseAllocation__Group_2__0"


    // $ANTLR start "rule__CourseAllocation__Group_2__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2411:1: rule__CourseAllocation__Group_2__0__Impl : ( 'works' ) ;
    public final void rule__CourseAllocation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2415:1: ( ( 'works' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2416:1: ( 'works' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2416:1: ( 'works' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2417:1: 'works'
            {
             before(grammarAccess.getCourseAllocationAccess().getWorksKeyword_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__CourseAllocation__Group_2__0__Impl4761); 
             after(grammarAccess.getCourseAllocationAccess().getWorksKeyword_2_0()); 

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
    // $ANTLR end "rule__CourseAllocation__Group_2__0__Impl"


    // $ANTLR start "rule__CourseAllocation__Group_2__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2430:1: rule__CourseAllocation__Group_2__1 : rule__CourseAllocation__Group_2__1__Impl ;
    public final void rule__CourseAllocation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2434:1: ( rule__CourseAllocation__Group_2__1__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2435:2: rule__CourseAllocation__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group_2__1__Impl_in_rule__CourseAllocation__Group_2__14792);
            rule__CourseAllocation__Group_2__1__Impl();

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
    // $ANTLR end "rule__CourseAllocation__Group_2__1"


    // $ANTLR start "rule__CourseAllocation__Group_2__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2441:1: rule__CourseAllocation__Group_2__1__Impl : ( ( rule__CourseAllocation__ExplicitFactorAssignment_2_1 ) ) ;
    public final void rule__CourseAllocation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2445:1: ( ( ( rule__CourseAllocation__ExplicitFactorAssignment_2_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2446:1: ( ( rule__CourseAllocation__ExplicitFactorAssignment_2_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2446:1: ( ( rule__CourseAllocation__ExplicitFactorAssignment_2_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2447:1: ( rule__CourseAllocation__ExplicitFactorAssignment_2_1 )
            {
             before(grammarAccess.getCourseAllocationAccess().getExplicitFactorAssignment_2_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2448:1: ( rule__CourseAllocation__ExplicitFactorAssignment_2_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2448:2: rule__CourseAllocation__ExplicitFactorAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__ExplicitFactorAssignment_2_1_in_rule__CourseAllocation__Group_2__1__Impl4819);
            rule__CourseAllocation__ExplicitFactorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAllocationAccess().getExplicitFactorAssignment_2_1()); 

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
    // $ANTLR end "rule__CourseAllocation__Group_2__1__Impl"


    // $ANTLR start "rule__CourseAllocation__Group_3__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2462:1: rule__CourseAllocation__Group_3__0 : rule__CourseAllocation__Group_3__0__Impl rule__CourseAllocation__Group_3__1 ;
    public final void rule__CourseAllocation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2466:1: ( rule__CourseAllocation__Group_3__0__Impl rule__CourseAllocation__Group_3__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2467:2: rule__CourseAllocation__Group_3__0__Impl rule__CourseAllocation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group_3__0__Impl_in_rule__CourseAllocation__Group_3__04853);
            rule__CourseAllocation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group_3__1_in_rule__CourseAllocation__Group_3__04856);
            rule__CourseAllocation__Group_3__1();

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
    // $ANTLR end "rule__CourseAllocation__Group_3__0"


    // $ANTLR start "rule__CourseAllocation__Group_3__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2474:1: rule__CourseAllocation__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__CourseAllocation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2478:1: ( ( 'as' ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2479:1: ( 'as' )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2479:1: ( 'as' )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2480:1: 'as'
            {
             before(grammarAccess.getCourseAllocationAccess().getAsKeyword_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__CourseAllocation__Group_3__0__Impl4884); 
             after(grammarAccess.getCourseAllocationAccess().getAsKeyword_3_0()); 

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
    // $ANTLR end "rule__CourseAllocation__Group_3__0__Impl"


    // $ANTLR start "rule__CourseAllocation__Group_3__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2493:1: rule__CourseAllocation__Group_3__1 : rule__CourseAllocation__Group_3__1__Impl ;
    public final void rule__CourseAllocation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2497:1: ( rule__CourseAllocation__Group_3__1__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2498:2: rule__CourseAllocation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__Group_3__1__Impl_in_rule__CourseAllocation__Group_3__14915);
            rule__CourseAllocation__Group_3__1__Impl();

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
    // $ANTLR end "rule__CourseAllocation__Group_3__1"


    // $ANTLR start "rule__CourseAllocation__Group_3__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2504:1: rule__CourseAllocation__Group_3__1__Impl : ( ( rule__CourseAllocation__RoleAssignment_3_1 ) ) ;
    public final void rule__CourseAllocation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2508:1: ( ( ( rule__CourseAllocation__RoleAssignment_3_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2509:1: ( ( rule__CourseAllocation__RoleAssignment_3_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2509:1: ( ( rule__CourseAllocation__RoleAssignment_3_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2510:1: ( rule__CourseAllocation__RoleAssignment_3_1 )
            {
             before(grammarAccess.getCourseAllocationAccess().getRoleAssignment_3_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2511:1: ( rule__CourseAllocation__RoleAssignment_3_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2511:2: rule__CourseAllocation__RoleAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CourseAllocation__RoleAssignment_3_1_in_rule__CourseAllocation__Group_3__1__Impl4942);
            rule__CourseAllocation__RoleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAllocationAccess().getRoleAssignment_3_1()); 

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
    // $ANTLR end "rule__CourseAllocation__Group_3__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2525:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2529:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2530:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__04976);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1_in_rule__Role__Group__04979);
            rule__Role__Group__1();

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
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2537:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2541:1: ( ( () ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2542:1: ( () )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2542:1: ( () )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2543:1: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2544:1: ()
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2546:1: 
            {
            }

             after(grammarAccess.getRoleAccess().getRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2556:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2560:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2561:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__15037);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2_in_rule__Role__Group__15040);
            rule__Role__Group__2();

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
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2568:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2572:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2573:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2573:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2574:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2575:1: ( rule__Role__NameAssignment_1 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2575:2: rule__Role__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl5067);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2585:1: rule__Role__Group__2 : rule__Role__Group__2__Impl ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2589:1: ( rule__Role__Group__2__Impl )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2590:2: rule__Role__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__25097);
            rule__Role__Group__2__Impl();

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
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2596:1: rule__Role__Group__2__Impl : ( ( rule__Role__FactorAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2600:1: ( ( ( rule__Role__FactorAssignment_2 ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2601:1: ( ( rule__Role__FactorAssignment_2 ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2601:1: ( ( rule__Role__FactorAssignment_2 ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2602:1: ( rule__Role__FactorAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getFactorAssignment_2()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2603:1: ( rule__Role__FactorAssignment_2 )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2603:2: rule__Role__FactorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Role__FactorAssignment_2_in_rule__Role__Group__2__Impl5124);
            rule__Role__FactorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getFactorAssignment_2()); 

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
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Department__NameAssignment_2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2620:1: rule__Department__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Department__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2624:1: ( ( RULE_ID ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2625:1: ( RULE_ID )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2625:1: ( RULE_ID )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2626:1: RULE_ID
            {
             before(grammarAccess.getDepartmentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Department__NameAssignment_25165); 
             after(grammarAccess.getDepartmentAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Department__NameAssignment_2"


    // $ANTLR start "rule__Department__EmployeesAssignment_5"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2635:1: rule__Department__EmployeesAssignment_5 : ( rulePerson ) ;
    public final void rule__Department__EmployeesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2639:1: ( ( rulePerson ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2640:1: ( rulePerson )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2640:1: ( rulePerson )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2641:1: rulePerson
            {
             before(grammarAccess.getDepartmentAccess().getEmployeesPersonParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePerson_in_rule__Department__EmployeesAssignment_55196);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getDepartmentAccess().getEmployeesPersonParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Department__EmployeesAssignment_5"


    // $ANTLR start "rule__Department__RolesAssignment_9"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2650:1: rule__Department__RolesAssignment_9 : ( ruleRole ) ;
    public final void rule__Department__RolesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2654:1: ( ( ruleRole ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2655:1: ( ruleRole )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2655:1: ( ruleRole )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2656:1: ruleRole
            {
             before(grammarAccess.getDepartmentAccess().getRolesRoleParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_rule__Department__RolesAssignment_95227);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getDepartmentAccess().getRolesRoleParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Department__RolesAssignment_9"


    // $ANTLR start "rule__Department__CoursesAssignment_13"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2665:1: rule__Department__CoursesAssignment_13 : ( ruleCourse ) ;
    public final void rule__Department__CoursesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2669:1: ( ( ruleCourse ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2670:1: ( ruleCourse )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2670:1: ( ruleCourse )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2671:1: ruleCourse
            {
             before(grammarAccess.getDepartmentAccess().getCoursesCourseParserRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_rule__Department__CoursesAssignment_135258);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getDepartmentAccess().getCoursesCourseParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Department__CoursesAssignment_13"


    // $ANTLR start "rule__Department__SemestersAssignment_15"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2680:1: rule__Department__SemestersAssignment_15 : ( ruleSemester ) ;
    public final void rule__Department__SemestersAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2684:1: ( ( ruleSemester ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2685:1: ( ruleSemester )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2685:1: ( ruleSemester )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2686:1: ruleSemester
            {
             before(grammarAccess.getDepartmentAccess().getSemestersSemesterParserRuleCall_15_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemester_in_rule__Department__SemestersAssignment_155289);
            ruleSemester();

            state._fsp--;

             after(grammarAccess.getDepartmentAccess().getSemestersSemesterParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__Department__SemestersAssignment_15"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2695:1: rule__Person__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2699:1: ( ( ruleEString ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2700:1: ( ruleEString )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2700:1: ( ruleEString )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2701:1: ruleEString
            {
             before(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Person__NameAssignment_15320);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Person__UserNameAssignment_2_1_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2710:1: rule__Person__UserNameAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__Person__UserNameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2714:1: ( ( RULE_STRING ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2715:1: ( RULE_STRING )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2715:1: ( RULE_STRING )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2716:1: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getUserNameSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Person__UserNameAssignment_2_1_15351); 
             after(grammarAccess.getPersonAccess().getUserNameSTRINGTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Person__UserNameAssignment_2_1_1"


    // $ANTLR start "rule__Person__EmailAssignment_2_2_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2725:1: rule__Person__EmailAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__Person__EmailAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2729:1: ( ( RULE_STRING ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2730:1: ( RULE_STRING )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2730:1: ( RULE_STRING )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2731:1: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getEmailSTRINGTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Person__EmailAssignment_2_2_15382); 
             after(grammarAccess.getPersonAccess().getEmailSTRINGTerminalRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Person__EmailAssignment_2_2_1"


    // $ANTLR start "rule__Person__FaceUrlAssignment_2_3_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2740:1: rule__Person__FaceUrlAssignment_2_3_1 : ( ruleURI ) ;
    public final void rule__Person__FaceUrlAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2744:1: ( ( ruleURI ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2745:1: ( ruleURI )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2745:1: ( ruleURI )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2746:1: ruleURI
            {
             before(grammarAccess.getPersonAccess().getFaceUrlURIParserRuleCall_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_rule__Person__FaceUrlAssignment_2_3_15413);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getFaceUrlURIParserRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__Person__FaceUrlAssignment_2_3_1"


    // $ANTLR start "rule__Person__EmploymentFactorAssignment_4"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2755:1: rule__Person__EmploymentFactorAssignment_4 : ( ruleFactor ) ;
    public final void rule__Person__EmploymentFactorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2759:1: ( ( ruleFactor ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2760:1: ( ruleFactor )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2760:1: ( ruleFactor )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2761:1: ruleFactor
            {
             before(grammarAccess.getPersonAccess().getEmploymentFactorFactorParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFactor_in_rule__Person__EmploymentFactorAssignment_45444);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getEmploymentFactorFactorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Person__EmploymentFactorAssignment_4"


    // $ANTLR start "rule__Course__NameAssignment_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2770:1: rule__Course__NameAssignment_1 : ( ruleCourseCode ) ;
    public final void rule__Course__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2774:1: ( ( ruleCourseCode ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2775:1: ( ruleCourseCode )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2775:1: ( ruleCourseCode )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2776:1: ruleCourseCode
            {
             before(grammarAccess.getCourseAccess().getNameCourseCodeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseCode_in_rule__Course__NameAssignment_15475);
            ruleCourseCode();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getNameCourseCodeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Course__NameAssignment_1"


    // $ANTLR start "rule__Course__FullNameAssignment_2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2785:1: rule__Course__FullNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Course__FullNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2789:1: ( ( RULE_STRING ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2790:1: ( RULE_STRING )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2790:1: ( RULE_STRING )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2791:1: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getFullNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Course__FullNameAssignment_25506); 
             after(grammarAccess.getCourseAccess().getFullNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Course__FullNameAssignment_2"


    // $ANTLR start "rule__Course__RequiredRolesAssignment_4"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2800:1: rule__Course__RequiredRolesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Course__RequiredRolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2804:1: ( ( ( RULE_ID ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2805:1: ( ( RULE_ID ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2805:1: ( ( RULE_ID ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2806:1: ( RULE_ID )
            {
             before(grammarAccess.getCourseAccess().getRequiredRolesRoleCrossReference_4_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2807:1: ( RULE_ID )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2808:1: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getRequiredRolesRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Course__RequiredRolesAssignment_45541); 
             after(grammarAccess.getCourseAccess().getRequiredRolesRoleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getRequiredRolesRoleCrossReference_4_0()); 

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
    // $ANTLR end "rule__Course__RequiredRolesAssignment_4"


    // $ANTLR start "rule__Course__RequiredRolesAssignment_5_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2819:1: rule__Course__RequiredRolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Course__RequiredRolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2823:1: ( ( ( RULE_ID ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2824:1: ( ( RULE_ID ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2824:1: ( ( RULE_ID ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2825:1: ( RULE_ID )
            {
             before(grammarAccess.getCourseAccess().getRequiredRolesRoleCrossReference_5_1_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2826:1: ( RULE_ID )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2827:1: RULE_ID
            {
             before(grammarAccess.getCourseAccess().getRequiredRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Course__RequiredRolesAssignment_5_15580); 
             after(grammarAccess.getCourseAccess().getRequiredRolesRoleIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getCourseAccess().getRequiredRolesRoleCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Course__RequiredRolesAssignment_5_1"


    // $ANTLR start "rule__Semester__KindAssignment_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2838:1: rule__Semester__KindAssignment_1 : ( ruleSemesterKind ) ;
    public final void rule__Semester__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2842:1: ( ( ruleSemesterKind ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2843:1: ( ruleSemesterKind )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2843:1: ( ruleSemesterKind )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2844:1: ruleSemesterKind
            {
             before(grammarAccess.getSemesterAccess().getKindSemesterKindEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemesterKind_in_rule__Semester__KindAssignment_15615);
            ruleSemesterKind();

            state._fsp--;

             after(grammarAccess.getSemesterAccess().getKindSemesterKindEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Semester__KindAssignment_1"


    // $ANTLR start "rule__Semester__YearAssignment_2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2853:1: rule__Semester__YearAssignment_2 : ( RULE_INT ) ;
    public final void rule__Semester__YearAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2857:1: ( ( RULE_INT ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2858:1: ( RULE_INT )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2858:1: ( RULE_INT )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2859:1: RULE_INT
            {
             before(grammarAccess.getSemesterAccess().getYearINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Semester__YearAssignment_25646); 
             after(grammarAccess.getSemesterAccess().getYearINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Semester__YearAssignment_2"


    // $ANTLR start "rule__Semester__CoursesAssignment_4"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2868:1: rule__Semester__CoursesAssignment_4 : ( ruleCourseInstance ) ;
    public final void rule__Semester__CoursesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2872:1: ( ( ruleCourseInstance ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2873:1: ( ruleCourseInstance )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2873:1: ( ruleCourseInstance )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2874:1: ruleCourseInstance
            {
             before(grammarAccess.getSemesterAccess().getCoursesCourseInstanceParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseInstance_in_rule__Semester__CoursesAssignment_45677);
            ruleCourseInstance();

            state._fsp--;

             after(grammarAccess.getSemesterAccess().getCoursesCourseInstanceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Semester__CoursesAssignment_4"


    // $ANTLR start "rule__CourseInstance__CourseAssignment_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2883:1: rule__CourseInstance__CourseAssignment_1 : ( ( ruleCourseCode ) ) ;
    public final void rule__CourseInstance__CourseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2887:1: ( ( ( ruleCourseCode ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2888:1: ( ( ruleCourseCode ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2888:1: ( ( ruleCourseCode ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2889:1: ( ruleCourseCode )
            {
             before(grammarAccess.getCourseInstanceAccess().getCourseCourseCrossReference_1_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2890:1: ( ruleCourseCode )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2891:1: ruleCourseCode
            {
             before(grammarAccess.getCourseInstanceAccess().getCourseCourseCourseCodeParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseCode_in_rule__CourseInstance__CourseAssignment_15712);
            ruleCourseCode();

            state._fsp--;

             after(grammarAccess.getCourseInstanceAccess().getCourseCourseCourseCodeParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCourseInstanceAccess().getCourseCourseCrossReference_1_0()); 

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
    // $ANTLR end "rule__CourseInstance__CourseAssignment_1"


    // $ANTLR start "rule__CourseInstance__AllocationsAssignment_3"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2902:1: rule__CourseInstance__AllocationsAssignment_3 : ( ruleCourseAllocation ) ;
    public final void rule__CourseInstance__AllocationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2906:1: ( ( ruleCourseAllocation ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2907:1: ( ruleCourseAllocation )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2907:1: ( ruleCourseAllocation )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2908:1: ruleCourseAllocation
            {
             before(grammarAccess.getCourseInstanceAccess().getAllocationsCourseAllocationParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseAllocation_in_rule__CourseInstance__AllocationsAssignment_35747);
            ruleCourseAllocation();

            state._fsp--;

             after(grammarAccess.getCourseInstanceAccess().getAllocationsCourseAllocationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CourseInstance__AllocationsAssignment_3"


    // $ANTLR start "rule__CourseAllocation__PersonAssignment_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2917:1: rule__CourseAllocation__PersonAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__CourseAllocation__PersonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2921:1: ( ( ( ruleEString ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2922:1: ( ( ruleEString ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2922:1: ( ( ruleEString ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2923:1: ( ruleEString )
            {
             before(grammarAccess.getCourseAllocationAccess().getPersonPersonCrossReference_1_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2924:1: ( ruleEString )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2925:1: ruleEString
            {
             before(grammarAccess.getCourseAllocationAccess().getPersonPersonEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CourseAllocation__PersonAssignment_15782);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCourseAllocationAccess().getPersonPersonEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCourseAllocationAccess().getPersonPersonCrossReference_1_0()); 

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
    // $ANTLR end "rule__CourseAllocation__PersonAssignment_1"


    // $ANTLR start "rule__CourseAllocation__ExplicitFactorAssignment_2_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2936:1: rule__CourseAllocation__ExplicitFactorAssignment_2_1 : ( ruleFactor ) ;
    public final void rule__CourseAllocation__ExplicitFactorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2940:1: ( ( ruleFactor ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2941:1: ( ruleFactor )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2941:1: ( ruleFactor )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2942:1: ruleFactor
            {
             before(grammarAccess.getCourseAllocationAccess().getExplicitFactorFactorParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFactor_in_rule__CourseAllocation__ExplicitFactorAssignment_2_15817);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getCourseAllocationAccess().getExplicitFactorFactorParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__CourseAllocation__ExplicitFactorAssignment_2_1"


    // $ANTLR start "rule__CourseAllocation__RoleAssignment_3_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2951:1: rule__CourseAllocation__RoleAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__CourseAllocation__RoleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2955:1: ( ( ( RULE_ID ) ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2956:1: ( ( RULE_ID ) )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2956:1: ( ( RULE_ID ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2957:1: ( RULE_ID )
            {
             before(grammarAccess.getCourseAllocationAccess().getRoleRoleCrossReference_3_1_0()); 
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2958:1: ( RULE_ID )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2959:1: RULE_ID
            {
             before(grammarAccess.getCourseAllocationAccess().getRoleRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CourseAllocation__RoleAssignment_3_15852); 
             after(grammarAccess.getCourseAllocationAccess().getRoleRoleIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getCourseAllocationAccess().getRoleRoleCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__CourseAllocation__RoleAssignment_3_1"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2970:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2974:1: ( ( RULE_ID ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2975:1: ( RULE_ID )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2975:1: ( RULE_ID )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2976:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Role__NameAssignment_15887); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__Role__FactorAssignment_2"
    // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2985:1: rule__Role__FactorAssignment_2 : ( ruleFactor ) ;
    public final void rule__Role__FactorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2989:1: ( ( ruleFactor ) )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2990:1: ( ruleFactor )
            {
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2990:1: ( ruleFactor )
            // ../no.hal.ra.xtext.ui/src-gen/no/hal/ra/xtext/ui/contentassist/antlr/internal/InternalXra.g:2991:1: ruleFactor
            {
             before(grammarAccess.getRoleAccess().getFactorFactorParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFactor_in_rule__Role__FactorAssignment_25918);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getFactorFactorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Role__FactorAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDepartment_in_entryRuleDepartment61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDepartment68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__0_in_ruleDepartment94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePerson_in_entryRulePerson121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePerson128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__0_in_rulePerson154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_entryRuleCourse181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourse188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0_in_ruleCourse214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseCode_in_entryRuleCourseCode241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseCode248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseCode__Group__0_in_ruleCourseCode274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemester_in_entryRuleSemester301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSemester308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semester__Group__0_in_ruleSemester334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_entryRuleURI421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURI428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleURI454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFactor487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Factor__Group__0_in_ruleFactor513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseInstance_in_entryRuleCourseInstance542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseInstance549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__0_in_ruleCourseInstance575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseAllocation_in_entryRuleCourseAllocation602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseAllocation609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group__0_in_ruleCourseAllocation635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SemesterKind__Alternatives_in_ruleSemesterKind732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__CourseCode__Alternatives_0768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__CourseCode__Alternatives_0788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__SemesterKind__Alternatives872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SemesterKind__Alternatives893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__0__Impl_in_rule__Department__Group__0926 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Department__Group__1_in_rule__Department__Group__0929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__1__Impl_in_rule__Department__Group__1987 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Department__Group__2_in_rule__Department__Group__1990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Department__Group__1__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__2__Impl_in_rule__Department__Group__21049 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Department__Group__3_in_rule__Department__Group__21052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__NameAssignment_2_in_rule__Department__Group__2__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__3__Impl_in_rule__Department__Group__31109 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Department__Group__4_in_rule__Department__Group__31112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Department__Group__3__Impl1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__4__Impl_in_rule__Department__Group__41171 = new BitSet(new long[]{0x0000000000040030L});
        public static final BitSet FOLLOW_rule__Department__Group__5_in_rule__Department__Group__41174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Department__Group__4__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__5__Impl_in_rule__Department__Group__51233 = new BitSet(new long[]{0x0000000000040030L});
        public static final BitSet FOLLOW_rule__Department__Group__6_in_rule__Department__Group__51236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__EmployeesAssignment_5_in_rule__Department__Group__5__Impl1263 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Department__Group__6__Impl_in_rule__Department__Group__61294 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Department__Group__7_in_rule__Department__Group__61297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Department__Group__6__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__7__Impl_in_rule__Department__Group__71356 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Department__Group__8_in_rule__Department__Group__71359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Department__Group__7__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__8__Impl_in_rule__Department__Group__81418 = new BitSet(new long[]{0x0000000000040020L});
        public static final BitSet FOLLOW_rule__Department__Group__9_in_rule__Department__Group__81421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Department__Group__8__Impl1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__9__Impl_in_rule__Department__Group__91480 = new BitSet(new long[]{0x0000000000040020L});
        public static final BitSet FOLLOW_rule__Department__Group__10_in_rule__Department__Group__91483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__RolesAssignment_9_in_rule__Department__Group__9__Impl1510 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_rule__Department__Group__10__Impl_in_rule__Department__Group__101541 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Department__Group__11_in_rule__Department__Group__101544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Department__Group__10__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__11__Impl_in_rule__Department__Group__111603 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Department__Group__12_in_rule__Department__Group__111606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Department__Group__11__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__12__Impl_in_rule__Department__Group__121665 = new BitSet(new long[]{0x0000000000041800L});
        public static final BitSet FOLLOW_rule__Department__Group__13_in_rule__Department__Group__121668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Department__Group__12__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__13__Impl_in_rule__Department__Group__131727 = new BitSet(new long[]{0x0000000000041800L});
        public static final BitSet FOLLOW_rule__Department__Group__14_in_rule__Department__Group__131730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__CoursesAssignment_13_in_rule__Department__Group__13__Impl1757 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_rule__Department__Group__14__Impl_in_rule__Department__Group__141788 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Department__Group__15_in_rule__Department__Group__141791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Department__Group__14__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__Group__15__Impl_in_rule__Department__Group__151850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Department__SemestersAssignment_15_in_rule__Department__Group__15__Impl1877 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__01940 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Person__Group__1_in_rule__Person__Group__01943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__12001 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Person__Group__2_in_rule__Person__Group__12004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__NameAssignment_1_in_rule__Person__Group__1__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__22061 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Person__Group__3_in_rule__Person__Group__22064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__0_in_rule__Person__Group__2__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__3__Impl_in_rule__Person__Group__32122 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Person__Group__4_in_rule__Person__Group__32125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Person__Group__3__Impl2153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__4__Impl_in_rule__Person__Group__42184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__EmploymentFactorAssignment_4_in_rule__Person__Group__4__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__0__Impl_in_rule__Person__Group_2__02251 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Person__Group_2__1_in_rule__Person__Group_2__02254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Person__Group_2__0__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__1__Impl_in_rule__Person__Group_2__12313 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Person__Group_2__2_in_rule__Person__Group_2__12316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2_1__0_in_rule__Person__Group_2__1__Impl2343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__2__Impl_in_rule__Person__Group_2__22374 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Person__Group_2__3_in_rule__Person__Group_2__22377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2_2__0_in_rule__Person__Group_2__2__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__3__Impl_in_rule__Person__Group_2__32435 = new BitSet(new long[]{0x0000000007800000L});
        public static final BitSet FOLLOW_rule__Person__Group_2__4_in_rule__Person__Group_2__32438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2_3__0_in_rule__Person__Group_2__3__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__4__Impl_in_rule__Person__Group_2__42496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Person__Group_2__4__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2_1__0__Impl_in_rule__Person__Group_2_1__02565 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Person__Group_2_1__1_in_rule__Person__Group_2_1__02568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Person__Group_2_1__0__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2_1__1__Impl_in_rule__Person__Group_2_1__12627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__UserNameAssignment_2_1_1_in_rule__Person__Group_2_1__1__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2_2__0__Impl_in_rule__Person__Group_2_2__02688 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Person__Group_2_2__1_in_rule__Person__Group_2_2__02691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Person__Group_2_2__0__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2_2__1__Impl_in_rule__Person__Group_2_2__12750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__EmailAssignment_2_2_1_in_rule__Person__Group_2_2__1__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2_3__0__Impl_in_rule__Person__Group_2_3__02811 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Person__Group_2_3__1_in_rule__Person__Group_2_3__02814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Person__Group_2_3__0__Impl2842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2_3__1__Impl_in_rule__Person__Group_2_3__12873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__FaceUrlAssignment_2_3_1_in_rule__Person__Group_2_3__1__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__0__Impl_in_rule__Course__Group__02934 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Course__Group__1_in_rule__Course__Group__02937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__1__Impl_in_rule__Course__Group__12995 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Course__Group__2_in_rule__Course__Group__12998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__NameAssignment_1_in_rule__Course__Group__1__Impl3025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__2__Impl_in_rule__Course__Group__23055 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Course__Group__3_in_rule__Course__Group__23058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__FullNameAssignment_2_in_rule__Course__Group__2__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__3__Impl_in_rule__Course__Group__33115 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Course__Group__4_in_rule__Course__Group__33118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Course__Group__3__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__4__Impl_in_rule__Course__Group__43177 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Course__Group__5_in_rule__Course__Group__43180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__RequiredRolesAssignment_4_in_rule__Course__Group__4__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group__5__Impl_in_rule__Course__Group__53237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_5__0_in_rule__Course__Group__5__Impl3264 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Course__Group_5__0__Impl_in_rule__Course__Group_5__03307 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Course__Group_5__1_in_rule__Course__Group_5__03310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Course__Group_5__0__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__Group_5__1__Impl_in_rule__Course__Group_5__13369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Course__RequiredRolesAssignment_5_1_in_rule__Course__Group_5__1__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseCode__Group__0__Impl_in_rule__CourseCode__Group__03430 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__CourseCode__Group__1_in_rule__CourseCode__Group__03433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseCode__Alternatives_0_in_rule__CourseCode__Group__0__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseCode__Group__1__Impl_in_rule__CourseCode__Group__13490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__CourseCode__Group__1__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semester__Group__0__Impl_in_rule__Semester__Group__03550 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Semester__Group__1_in_rule__Semester__Group__03553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semester__Group__1__Impl_in_rule__Semester__Group__13611 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Semester__Group__2_in_rule__Semester__Group__13614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semester__KindAssignment_1_in_rule__Semester__Group__1__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semester__Group__2__Impl_in_rule__Semester__Group__23671 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Semester__Group__3_in_rule__Semester__Group__23674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semester__YearAssignment_2_in_rule__Semester__Group__2__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semester__Group__3__Impl_in_rule__Semester__Group__33731 = new BitSet(new long[]{0x0000000000041800L});
        public static final BitSet FOLLOW_rule__Semester__Group__4_in_rule__Semester__Group__33734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Semester__Group__3__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semester__Group__4__Impl_in_rule__Semester__Group__43793 = new BitSet(new long[]{0x0000000000041800L});
        public static final BitSet FOLLOW_rule__Semester__Group__5_in_rule__Semester__Group__43796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Semester__CoursesAssignment_4_in_rule__Semester__Group__4__Impl3823 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_rule__Semester__Group__5__Impl_in_rule__Semester__Group__53854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Semester__Group__5__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__03925 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__03928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Factor__Group__0__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__13984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Factor__Group_1__0_in_rule__Factor__Group__1__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Factor__Group_1__0__Impl_in_rule__Factor__Group_1__04046 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Factor__Group_1__1_in_rule__Factor__Group_1__04049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Factor__Group_1__0__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Factor__Group_1__1__Impl_in_rule__Factor__Group_1__14108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Factor__Group_1__1__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__0__Impl_in_rule__CourseInstance__Group__04169 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__1_in_rule__CourseInstance__Group__04172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__1__Impl_in_rule__CourseInstance__Group__14230 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__2_in_rule__CourseInstance__Group__14233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseInstance__CourseAssignment_1_in_rule__CourseInstance__Group__1__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__2__Impl_in_rule__CourseInstance__Group__24290 = new BitSet(new long[]{0x0000000000040030L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__3_in_rule__CourseInstance__Group__24293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CourseInstance__Group__2__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__3__Impl_in_rule__CourseInstance__Group__34352 = new BitSet(new long[]{0x0000000000040030L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__4_in_rule__CourseInstance__Group__34355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseInstance__AllocationsAssignment_3_in_rule__CourseInstance__Group__3__Impl4382 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__CourseInstance__Group__4__Impl_in_rule__CourseInstance__Group__44413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__CourseInstance__Group__4__Impl4441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group__0__Impl_in_rule__CourseAllocation__Group__04482 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group__1_in_rule__CourseAllocation__Group__04485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group__1__Impl_in_rule__CourseAllocation__Group__14543 = new BitSet(new long[]{0x0000000040200000L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group__2_in_rule__CourseAllocation__Group__14546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__PersonAssignment_1_in_rule__CourseAllocation__Group__1__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group__2__Impl_in_rule__CourseAllocation__Group__24603 = new BitSet(new long[]{0x0000000040200000L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group__3_in_rule__CourseAllocation__Group__24606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group_2__0_in_rule__CourseAllocation__Group__2__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group__3__Impl_in_rule__CourseAllocation__Group__34664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group_3__0_in_rule__CourseAllocation__Group__3__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group_2__0__Impl_in_rule__CourseAllocation__Group_2__04730 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group_2__1_in_rule__CourseAllocation__Group_2__04733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CourseAllocation__Group_2__0__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group_2__1__Impl_in_rule__CourseAllocation__Group_2__14792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__ExplicitFactorAssignment_2_1_in_rule__CourseAllocation__Group_2__1__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group_3__0__Impl_in_rule__CourseAllocation__Group_3__04853 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group_3__1_in_rule__CourseAllocation__Group_3__04856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CourseAllocation__Group_3__0__Impl4884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__Group_3__1__Impl_in_rule__CourseAllocation__Group_3__14915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CourseAllocation__RoleAssignment_3_1_in_rule__CourseAllocation__Group_3__1__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__04976 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__04979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__15037 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__15040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__25097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Role__FactorAssignment_2_in_rule__Role__Group__2__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Department__NameAssignment_25165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePerson_in_rule__Department__EmployeesAssignment_55196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_rule__Department__RolesAssignment_95227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_rule__Department__CoursesAssignment_135258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemester_in_rule__Department__SemestersAssignment_155289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Person__NameAssignment_15320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Person__UserNameAssignment_2_1_15351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Person__EmailAssignment_2_2_15382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_rule__Person__FaceUrlAssignment_2_3_15413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFactor_in_rule__Person__EmploymentFactorAssignment_45444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseCode_in_rule__Course__NameAssignment_15475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Course__FullNameAssignment_25506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Course__RequiredRolesAssignment_45541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Course__RequiredRolesAssignment_5_15580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemesterKind_in_rule__Semester__KindAssignment_15615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Semester__YearAssignment_25646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseInstance_in_rule__Semester__CoursesAssignment_45677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseCode_in_rule__CourseInstance__CourseAssignment_15712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseAllocation_in_rule__CourseInstance__AllocationsAssignment_35747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CourseAllocation__PersonAssignment_15782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFactor_in_rule__CourseAllocation__ExplicitFactorAssignment_2_15817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CourseAllocation__RoleAssignment_3_15852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_15887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFactor_in_rule__Role__FactorAssignment_25918 = new BitSet(new long[]{0x0000000000000002L});
    }


}