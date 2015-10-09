package no.hal.ra.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.hal.ra.xtext.services.XraGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXraParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'department'", "'staff'", "'{'", "'}'", "'role'", "'courses'", "'('", "'user:'", "'email:'", "'face:'", "')'", "'works'", "'requires'", "','", "'TDT'", "'IT'", "'.'", "'as'", "'h'", "'v'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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
    public String getGrammarFileName() { return "../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g"; }



     	private XraGrammarAccess grammarAccess;
     	
        public InternalXraParser(TokenStream input, XraGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Department";	
       	}
       	
       	@Override
       	protected XraGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDepartment"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:68:1: entryRuleDepartment returns [EObject current=null] : iv_ruleDepartment= ruleDepartment EOF ;
    public final EObject entryRuleDepartment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepartment = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:69:2: (iv_ruleDepartment= ruleDepartment EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:70:2: iv_ruleDepartment= ruleDepartment EOF
            {
             newCompositeNode(grammarAccess.getDepartmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDepartment_in_entryRuleDepartment75);
            iv_ruleDepartment=ruleDepartment();

            state._fsp--;

             current =iv_ruleDepartment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDepartment85); 

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
    // $ANTLR end "entryRuleDepartment"


    // $ANTLR start "ruleDepartment"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:77:1: ruleDepartment returns [EObject current=null] : ( () otherlv_1= 'department' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'staff' otherlv_4= '{' ( (lv_employees_5_0= rulePerson ) )* otherlv_6= '}' otherlv_7= 'role' otherlv_8= '{' ( (lv_roles_9_0= ruleRole ) )* otherlv_10= '}' otherlv_11= 'courses' otherlv_12= '{' ( (lv_courses_13_0= ruleCourse ) )* otherlv_14= '}' ( (lv_semesters_15_0= ruleSemester ) )* ) ;
    public final EObject ruleDepartment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_employees_5_0 = null;

        EObject lv_roles_9_0 = null;

        EObject lv_courses_13_0 = null;

        EObject lv_semesters_15_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:80:28: ( ( () otherlv_1= 'department' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'staff' otherlv_4= '{' ( (lv_employees_5_0= rulePerson ) )* otherlv_6= '}' otherlv_7= 'role' otherlv_8= '{' ( (lv_roles_9_0= ruleRole ) )* otherlv_10= '}' otherlv_11= 'courses' otherlv_12= '{' ( (lv_courses_13_0= ruleCourse ) )* otherlv_14= '}' ( (lv_semesters_15_0= ruleSemester ) )* ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:81:1: ( () otherlv_1= 'department' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'staff' otherlv_4= '{' ( (lv_employees_5_0= rulePerson ) )* otherlv_6= '}' otherlv_7= 'role' otherlv_8= '{' ( (lv_roles_9_0= ruleRole ) )* otherlv_10= '}' otherlv_11= 'courses' otherlv_12= '{' ( (lv_courses_13_0= ruleCourse ) )* otherlv_14= '}' ( (lv_semesters_15_0= ruleSemester ) )* )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:81:1: ( () otherlv_1= 'department' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'staff' otherlv_4= '{' ( (lv_employees_5_0= rulePerson ) )* otherlv_6= '}' otherlv_7= 'role' otherlv_8= '{' ( (lv_roles_9_0= ruleRole ) )* otherlv_10= '}' otherlv_11= 'courses' otherlv_12= '{' ( (lv_courses_13_0= ruleCourse ) )* otherlv_14= '}' ( (lv_semesters_15_0= ruleSemester ) )* )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:81:2: () otherlv_1= 'department' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'staff' otherlv_4= '{' ( (lv_employees_5_0= rulePerson ) )* otherlv_6= '}' otherlv_7= 'role' otherlv_8= '{' ( (lv_roles_9_0= ruleRole ) )* otherlv_10= '}' otherlv_11= 'courses' otherlv_12= '{' ( (lv_courses_13_0= ruleCourse ) )* otherlv_14= '}' ( (lv_semesters_15_0= ruleSemester ) )*
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:81:2: ()
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDepartmentAccess().getDepartmentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDepartment131); 

                	newLeafNode(otherlv_1, grammarAccess.getDepartmentAccess().getDepartmentKeyword_1());
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:91:1: ( (lv_name_2_0= RULE_ID ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:92:1: (lv_name_2_0= RULE_ID )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:92:1: (lv_name_2_0= RULE_ID )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:93:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDepartment148); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDepartmentAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDepartmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDepartment165); 

                	newLeafNode(otherlv_3, grammarAccess.getDepartmentAccess().getStaffKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDepartment177); 

                	newLeafNode(otherlv_4, grammarAccess.getDepartmentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:117:1: ( (lv_employees_5_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:118:1: (lv_employees_5_0= rulePerson )
            	    {
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:118:1: (lv_employees_5_0= rulePerson )
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:119:3: lv_employees_5_0= rulePerson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDepartmentAccess().getEmployeesPersonParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePerson_in_ruleDepartment198);
            	    lv_employees_5_0=rulePerson();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDepartmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"employees",
            	            		lv_employees_5_0, 
            	            		"Person");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDepartment211); 

                	newLeafNode(otherlv_6, grammarAccess.getDepartmentAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDepartment223); 

                	newLeafNode(otherlv_7, grammarAccess.getDepartmentAccess().getRoleKeyword_7());
                
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDepartment235); 

                	newLeafNode(otherlv_8, grammarAccess.getDepartmentAccess().getLeftCurlyBracketKeyword_8());
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:147:1: ( (lv_roles_9_0= ruleRole ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:148:1: (lv_roles_9_0= ruleRole )
            	    {
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:148:1: (lv_roles_9_0= ruleRole )
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:149:3: lv_roles_9_0= ruleRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDepartmentAccess().getRolesRoleParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleDepartment256);
            	    lv_roles_9_0=ruleRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDepartmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roles",
            	            		lv_roles_9_0, 
            	            		"Role");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDepartment269); 

                	newLeafNode(otherlv_10, grammarAccess.getDepartmentAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDepartment281); 

                	newLeafNode(otherlv_11, grammarAccess.getDepartmentAccess().getCoursesKeyword_11());
                
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDepartment293); 

                	newLeafNode(otherlv_12, grammarAccess.getDepartmentAccess().getLeftCurlyBracketKeyword_12());
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:177:1: ( (lv_courses_13_0= ruleCourse ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=25 && LA3_0<=26)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:178:1: (lv_courses_13_0= ruleCourse )
            	    {
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:178:1: (lv_courses_13_0= ruleCourse )
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:179:3: lv_courses_13_0= ruleCourse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDepartmentAccess().getCoursesCourseParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCourse_in_ruleDepartment314);
            	    lv_courses_13_0=ruleCourse();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDepartmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"courses",
            	            		lv_courses_13_0, 
            	            		"Course");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDepartment327); 

                	newLeafNode(otherlv_14, grammarAccess.getDepartmentAccess().getRightCurlyBracketKeyword_14());
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:199:1: ( (lv_semesters_15_0= ruleSemester ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=29 && LA4_0<=30)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:200:1: (lv_semesters_15_0= ruleSemester )
            	    {
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:200:1: (lv_semesters_15_0= ruleSemester )
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:201:3: lv_semesters_15_0= ruleSemester
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDepartmentAccess().getSemestersSemesterParserRuleCall_15_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSemester_in_ruleDepartment348);
            	    lv_semesters_15_0=ruleSemester();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDepartmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"semesters",
            	            		lv_semesters_15_0, 
            	            		"Semester");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleDepartment"


    // $ANTLR start "entryRulePerson"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:225:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:226:2: (iv_rulePerson= rulePerson EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:227:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePerson_in_entryRulePerson385);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePerson395); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:234:1: rulePerson returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' (otherlv_3= 'user:' ( (lv_userName_4_0= RULE_STRING ) ) )? (otherlv_5= 'email:' ( (lv_email_6_0= RULE_STRING ) ) )? (otherlv_7= 'face:' ( (lv_faceUrl_8_0= ruleURI ) ) )? otherlv_9= ')' )? otherlv_10= 'works' ( (lv_employmentFactor_11_0= ruleFactor ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_userName_4_0=null;
        Token otherlv_5=null;
        Token lv_email_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_faceUrl_8_0 = null;

        AntlrDatatypeRuleToken lv_employmentFactor_11_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:237:28: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' (otherlv_3= 'user:' ( (lv_userName_4_0= RULE_STRING ) ) )? (otherlv_5= 'email:' ( (lv_email_6_0= RULE_STRING ) ) )? (otherlv_7= 'face:' ( (lv_faceUrl_8_0= ruleURI ) ) )? otherlv_9= ')' )? otherlv_10= 'works' ( (lv_employmentFactor_11_0= ruleFactor ) ) ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:238:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' (otherlv_3= 'user:' ( (lv_userName_4_0= RULE_STRING ) ) )? (otherlv_5= 'email:' ( (lv_email_6_0= RULE_STRING ) ) )? (otherlv_7= 'face:' ( (lv_faceUrl_8_0= ruleURI ) ) )? otherlv_9= ')' )? otherlv_10= 'works' ( (lv_employmentFactor_11_0= ruleFactor ) ) )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:238:1: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' (otherlv_3= 'user:' ( (lv_userName_4_0= RULE_STRING ) ) )? (otherlv_5= 'email:' ( (lv_email_6_0= RULE_STRING ) ) )? (otherlv_7= 'face:' ( (lv_faceUrl_8_0= ruleURI ) ) )? otherlv_9= ')' )? otherlv_10= 'works' ( (lv_employmentFactor_11_0= ruleFactor ) ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:238:2: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' (otherlv_3= 'user:' ( (lv_userName_4_0= RULE_STRING ) ) )? (otherlv_5= 'email:' ( (lv_email_6_0= RULE_STRING ) ) )? (otherlv_7= 'face:' ( (lv_faceUrl_8_0= ruleURI ) ) )? otherlv_9= ')' )? otherlv_10= 'works' ( (lv_employmentFactor_11_0= ruleFactor ) )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:238:2: ()
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:239:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPersonAccess().getPersonAction_0(),
                        current);
                

            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:244:2: ( (lv_name_1_0= ruleEString ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:245:1: (lv_name_1_0= ruleEString )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:245:1: (lv_name_1_0= ruleEString )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:246:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePerson450);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPersonRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:262:2: (otherlv_2= '(' (otherlv_3= 'user:' ( (lv_userName_4_0= RULE_STRING ) ) )? (otherlv_5= 'email:' ( (lv_email_6_0= RULE_STRING ) ) )? (otherlv_7= 'face:' ( (lv_faceUrl_8_0= ruleURI ) ) )? otherlv_9= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:262:4: otherlv_2= '(' (otherlv_3= 'user:' ( (lv_userName_4_0= RULE_STRING ) ) )? (otherlv_5= 'email:' ( (lv_email_6_0= RULE_STRING ) ) )? (otherlv_7= 'face:' ( (lv_faceUrl_8_0= ruleURI ) ) )? otherlv_9= ')'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePerson463); 

                        	newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:266:1: (otherlv_3= 'user:' ( (lv_userName_4_0= RULE_STRING ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:266:3: otherlv_3= 'user:' ( (lv_userName_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePerson476); 

                                	newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getUserKeyword_2_1_0());
                                
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:270:1: ( (lv_userName_4_0= RULE_STRING ) )
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:271:1: (lv_userName_4_0= RULE_STRING )
                            {
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:271:1: (lv_userName_4_0= RULE_STRING )
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:272:3: lv_userName_4_0= RULE_STRING
                            {
                            lv_userName_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePerson493); 

                            			newLeafNode(lv_userName_4_0, grammarAccess.getPersonAccess().getUserNameSTRINGTerminalRuleCall_2_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPersonRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"userName",
                                    		lv_userName_4_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:288:4: (otherlv_5= 'email:' ( (lv_email_6_0= RULE_STRING ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:288:6: otherlv_5= 'email:' ( (lv_email_6_0= RULE_STRING ) )
                            {
                            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePerson513); 

                                	newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getEmailKeyword_2_2_0());
                                
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:292:1: ( (lv_email_6_0= RULE_STRING ) )
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:293:1: (lv_email_6_0= RULE_STRING )
                            {
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:293:1: (lv_email_6_0= RULE_STRING )
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:294:3: lv_email_6_0= RULE_STRING
                            {
                            lv_email_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePerson530); 

                            			newLeafNode(lv_email_6_0, grammarAccess.getPersonAccess().getEmailSTRINGTerminalRuleCall_2_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPersonRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"email",
                                    		lv_email_6_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:310:4: (otherlv_7= 'face:' ( (lv_faceUrl_8_0= ruleURI ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==20) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:310:6: otherlv_7= 'face:' ( (lv_faceUrl_8_0= ruleURI ) )
                            {
                            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePerson550); 

                                	newLeafNode(otherlv_7, grammarAccess.getPersonAccess().getFaceKeyword_2_3_0());
                                
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:314:1: ( (lv_faceUrl_8_0= ruleURI ) )
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:315:1: (lv_faceUrl_8_0= ruleURI )
                            {
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:315:1: (lv_faceUrl_8_0= ruleURI )
                            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:316:3: lv_faceUrl_8_0= ruleURI
                            {
                             
                            	        newCompositeNode(grammarAccess.getPersonAccess().getFaceUrlURIParserRuleCall_2_3_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleURI_in_rulePerson571);
                            lv_faceUrl_8_0=ruleURI();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPersonRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"faceUrl",
                                    		lv_faceUrl_8_0, 
                                    		"URI");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePerson585); 

                        	newLeafNode(otherlv_9, grammarAccess.getPersonAccess().getRightParenthesisKeyword_2_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePerson599); 

                	newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getWorksKeyword_3());
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:340:1: ( (lv_employmentFactor_11_0= ruleFactor ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:341:1: (lv_employmentFactor_11_0= ruleFactor )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:341:1: (lv_employmentFactor_11_0= ruleFactor )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:342:3: lv_employmentFactor_11_0= ruleFactor
            {
             
            	        newCompositeNode(grammarAccess.getPersonAccess().getEmploymentFactorFactorParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFactor_in_rulePerson620);
            lv_employmentFactor_11_0=ruleFactor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPersonRule());
            	        }
                   		set(
                   			current, 
                   			"employmentFactor",
                    		lv_employmentFactor_11_0, 
                    		"Factor");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleCourse"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:366:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:367:2: (iv_ruleCourse= ruleCourse EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:368:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourse_in_entryRuleCourse656);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourse666); 

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
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:375:1: ruleCourse returns [EObject current=null] : ( () ( (lv_name_1_0= ruleCourseCode ) ) ( (lv_fullName_2_0= RULE_STRING ) ) otherlv_3= 'requires' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token lv_fullName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:378:28: ( ( () ( (lv_name_1_0= ruleCourseCode ) ) ( (lv_fullName_2_0= RULE_STRING ) ) otherlv_3= 'requires' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:379:1: ( () ( (lv_name_1_0= ruleCourseCode ) ) ( (lv_fullName_2_0= RULE_STRING ) ) otherlv_3= 'requires' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:379:1: ( () ( (lv_name_1_0= ruleCourseCode ) ) ( (lv_fullName_2_0= RULE_STRING ) ) otherlv_3= 'requires' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:379:2: () ( (lv_name_1_0= ruleCourseCode ) ) ( (lv_fullName_2_0= RULE_STRING ) ) otherlv_3= 'requires' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:379:2: ()
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:380:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCourseAccess().getCourseAction_0(),
                        current);
                

            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:385:2: ( (lv_name_1_0= ruleCourseCode ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:386:1: (lv_name_1_0= ruleCourseCode )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:386:1: (lv_name_1_0= ruleCourseCode )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:387:3: lv_name_1_0= ruleCourseCode
            {
             
            	        newCompositeNode(grammarAccess.getCourseAccess().getNameCourseCodeParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCourseCode_in_ruleCourse721);
            lv_name_1_0=ruleCourseCode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCourseRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"CourseCode");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:403:2: ( (lv_fullName_2_0= RULE_STRING ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:404:1: (lv_fullName_2_0= RULE_STRING )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:404:1: (lv_fullName_2_0= RULE_STRING )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:405:3: lv_fullName_2_0= RULE_STRING
            {
            lv_fullName_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCourse738); 

            			newLeafNode(lv_fullName_2_0, grammarAccess.getCourseAccess().getFullNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCourseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fullName",
                    		lv_fullName_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCourse755); 

                	newLeafNode(otherlv_3, grammarAccess.getCourseAccess().getRequiresKeyword_3());
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:425:1: ( (otherlv_4= RULE_ID ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:426:1: (otherlv_4= RULE_ID )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:426:1: (otherlv_4= RULE_ID )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:427:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCourseRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCourse775); 

            		newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getRequiredRolesRoleCrossReference_4_0()); 
            	

            }


            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:438:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:438:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCourse788); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCourseAccess().getCommaKeyword_5_0());
            	        
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:442:1: ( (otherlv_6= RULE_ID ) )
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:443:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:443:1: (otherlv_6= RULE_ID )
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:444:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCourseRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCourse808); 

            	    		newLeafNode(otherlv_6, grammarAccess.getCourseAccess().getRequiredRolesRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleCourseCode"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:463:1: entryRuleCourseCode returns [String current=null] : iv_ruleCourseCode= ruleCourseCode EOF ;
    public final String entryRuleCourseCode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCourseCode = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:464:2: (iv_ruleCourseCode= ruleCourseCode EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:465:2: iv_ruleCourseCode= ruleCourseCode EOF
            {
             newCompositeNode(grammarAccess.getCourseCodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseCode_in_entryRuleCourseCode847);
            iv_ruleCourseCode=ruleCourseCode();

            state._fsp--;

             current =iv_ruleCourseCode.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseCode858); 

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
    // $ANTLR end "entryRuleCourseCode"


    // $ANTLR start "ruleCourseCode"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:472:1: ruleCourseCode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'TDT' | kw= 'IT' ) this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCourseCode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:475:28: ( ( (kw= 'TDT' | kw= 'IT' ) this_INT_2= RULE_INT ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:476:1: ( (kw= 'TDT' | kw= 'IT' ) this_INT_2= RULE_INT )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:476:1: ( (kw= 'TDT' | kw= 'IT' ) this_INT_2= RULE_INT )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:476:2: (kw= 'TDT' | kw= 'IT' ) this_INT_2= RULE_INT
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:476:2: (kw= 'TDT' | kw= 'IT' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:477:2: kw= 'TDT'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCourseCode897); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCourseCodeAccess().getTDTKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:484:2: kw= 'IT'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCourseCode916); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCourseCodeAccess().getITKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleCourseCode932); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getCourseCodeAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleCourseCode"


    // $ANTLR start "entryRuleSemester"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:504:1: entryRuleSemester returns [EObject current=null] : iv_ruleSemester= ruleSemester EOF ;
    public final EObject entryRuleSemester() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemester = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:505:2: (iv_ruleSemester= ruleSemester EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:506:2: iv_ruleSemester= ruleSemester EOF
            {
             newCompositeNode(grammarAccess.getSemesterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSemester_in_entryRuleSemester977);
            iv_ruleSemester=ruleSemester();

            state._fsp--;

             current =iv_ruleSemester; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSemester987); 

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
    // $ANTLR end "entryRuleSemester"


    // $ANTLR start "ruleSemester"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:513:1: ruleSemester returns [EObject current=null] : ( () ( (lv_kind_1_0= ruleSemesterKind ) ) ( (lv_year_2_0= RULE_INT ) ) otherlv_3= '{' ( (lv_courses_4_0= ruleCourseInstance ) )* otherlv_5= '}' ) ;
    public final EObject ruleSemester() throws RecognitionException {
        EObject current = null;

        Token lv_year_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_kind_1_0 = null;

        EObject lv_courses_4_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:516:28: ( ( () ( (lv_kind_1_0= ruleSemesterKind ) ) ( (lv_year_2_0= RULE_INT ) ) otherlv_3= '{' ( (lv_courses_4_0= ruleCourseInstance ) )* otherlv_5= '}' ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:517:1: ( () ( (lv_kind_1_0= ruleSemesterKind ) ) ( (lv_year_2_0= RULE_INT ) ) otherlv_3= '{' ( (lv_courses_4_0= ruleCourseInstance ) )* otherlv_5= '}' )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:517:1: ( () ( (lv_kind_1_0= ruleSemesterKind ) ) ( (lv_year_2_0= RULE_INT ) ) otherlv_3= '{' ( (lv_courses_4_0= ruleCourseInstance ) )* otherlv_5= '}' )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:517:2: () ( (lv_kind_1_0= ruleSemesterKind ) ) ( (lv_year_2_0= RULE_INT ) ) otherlv_3= '{' ( (lv_courses_4_0= ruleCourseInstance ) )* otherlv_5= '}'
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:517:2: ()
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:518:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSemesterAccess().getSemesterAction_0(),
                        current);
                

            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:523:2: ( (lv_kind_1_0= ruleSemesterKind ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:524:1: (lv_kind_1_0= ruleSemesterKind )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:524:1: (lv_kind_1_0= ruleSemesterKind )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:525:3: lv_kind_1_0= ruleSemesterKind
            {
             
            	        newCompositeNode(grammarAccess.getSemesterAccess().getKindSemesterKindEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSemesterKind_in_ruleSemester1042);
            lv_kind_1_0=ruleSemesterKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSemesterRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_1_0, 
                    		"SemesterKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:541:2: ( (lv_year_2_0= RULE_INT ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:542:1: (lv_year_2_0= RULE_INT )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:542:1: (lv_year_2_0= RULE_INT )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:543:3: lv_year_2_0= RULE_INT
            {
            lv_year_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSemester1059); 

            			newLeafNode(lv_year_2_0, grammarAccess.getSemesterAccess().getYearINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSemesterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"year",
                    		lv_year_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSemester1076); 

                	newLeafNode(otherlv_3, grammarAccess.getSemesterAccess().getLeftCurlyBracketKeyword_3());
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:563:1: ( (lv_courses_4_0= ruleCourseInstance ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=25 && LA11_0<=26)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:564:1: (lv_courses_4_0= ruleCourseInstance )
            	    {
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:564:1: (lv_courses_4_0= ruleCourseInstance )
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:565:3: lv_courses_4_0= ruleCourseInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSemesterAccess().getCoursesCourseInstanceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCourseInstance_in_ruleSemester1097);
            	    lv_courses_4_0=ruleCourseInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSemesterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"courses",
            	            		lv_courses_4_0, 
            	            		"CourseInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSemester1110); 

                	newLeafNode(otherlv_5, grammarAccess.getSemesterAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSemester"


    // $ANTLR start "entryRuleEString"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:593:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:594:2: (iv_ruleEString= ruleEString EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:595:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1147);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1158); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:602:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:605:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:606:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:606:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:606:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1198); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:614:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1224); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleURI"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:629:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:630:2: (iv_ruleURI= ruleURI EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:631:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_entryRuleURI1270);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURI1281); 

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:638:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:641:28: (this_STRING_0= RULE_STRING )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:642:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleURI1320); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getURIAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleFactor"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:657:1: entryRuleFactor returns [String current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final String entryRuleFactor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFactor = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:658:2: (iv_ruleFactor= ruleFactor EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:659:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFactor_in_entryRuleFactor1365);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFactor1376); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:666:1: ruleFactor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFactor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:669:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:670:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:670:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:670:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleFactor1416); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getFactorAccess().getINTTerminalRuleCall_0()); 
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:677:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:678:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFactor1435); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFactorAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleFactor1450); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getFactorAccess().getINTTerminalRuleCall_1_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleCourseInstance"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:700:1: entryRuleCourseInstance returns [EObject current=null] : iv_ruleCourseInstance= ruleCourseInstance EOF ;
    public final EObject entryRuleCourseInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourseInstance = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:701:2: (iv_ruleCourseInstance= ruleCourseInstance EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:702:2: iv_ruleCourseInstance= ruleCourseInstance EOF
            {
             newCompositeNode(grammarAccess.getCourseInstanceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseInstance_in_entryRuleCourseInstance1499);
            iv_ruleCourseInstance=ruleCourseInstance();

            state._fsp--;

             current =iv_ruleCourseInstance; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseInstance1509); 

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
    // $ANTLR end "entryRuleCourseInstance"


    // $ANTLR start "ruleCourseInstance"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:709:1: ruleCourseInstance returns [EObject current=null] : ( () ( ( ruleCourseCode ) ) otherlv_2= '{' ( (lv_allocations_3_0= ruleCourseAllocation ) )* otherlv_4= '}' ) ;
    public final EObject ruleCourseInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_allocations_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:712:28: ( ( () ( ( ruleCourseCode ) ) otherlv_2= '{' ( (lv_allocations_3_0= ruleCourseAllocation ) )* otherlv_4= '}' ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:713:1: ( () ( ( ruleCourseCode ) ) otherlv_2= '{' ( (lv_allocations_3_0= ruleCourseAllocation ) )* otherlv_4= '}' )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:713:1: ( () ( ( ruleCourseCode ) ) otherlv_2= '{' ( (lv_allocations_3_0= ruleCourseAllocation ) )* otherlv_4= '}' )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:713:2: () ( ( ruleCourseCode ) ) otherlv_2= '{' ( (lv_allocations_3_0= ruleCourseAllocation ) )* otherlv_4= '}'
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:713:2: ()
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:714:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCourseInstanceAccess().getCourseInstanceAction_0(),
                        current);
                

            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:719:2: ( ( ruleCourseCode ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:720:1: ( ruleCourseCode )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:720:1: ( ruleCourseCode )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:721:3: ruleCourseCode
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCourseInstanceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCourseInstanceAccess().getCourseCourseCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCourseCode_in_ruleCourseInstance1566);
            ruleCourseCode();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCourseInstance1578); 

                	newLeafNode(otherlv_2, grammarAccess.getCourseInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:738:1: ( (lv_allocations_3_0= ruleCourseAllocation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:739:1: (lv_allocations_3_0= ruleCourseAllocation )
            	    {
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:739:1: (lv_allocations_3_0= ruleCourseAllocation )
            	    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:740:3: lv_allocations_3_0= ruleCourseAllocation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCourseInstanceAccess().getAllocationsCourseAllocationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCourseAllocation_in_ruleCourseInstance1599);
            	    lv_allocations_3_0=ruleCourseAllocation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCourseInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"allocations",
            	            		lv_allocations_3_0, 
            	            		"CourseAllocation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCourseInstance1612); 

                	newLeafNode(otherlv_4, grammarAccess.getCourseInstanceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCourseInstance"


    // $ANTLR start "entryRuleCourseAllocation"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:768:1: entryRuleCourseAllocation returns [EObject current=null] : iv_ruleCourseAllocation= ruleCourseAllocation EOF ;
    public final EObject entryRuleCourseAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourseAllocation = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:769:2: (iv_ruleCourseAllocation= ruleCourseAllocation EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:770:2: iv_ruleCourseAllocation= ruleCourseAllocation EOF
            {
             newCompositeNode(grammarAccess.getCourseAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCourseAllocation_in_entryRuleCourseAllocation1648);
            iv_ruleCourseAllocation=ruleCourseAllocation();

            state._fsp--;

             current =iv_ruleCourseAllocation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCourseAllocation1658); 

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
    // $ANTLR end "entryRuleCourseAllocation"


    // $ANTLR start "ruleCourseAllocation"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:777:1: ruleCourseAllocation returns [EObject current=null] : ( () ( ( ruleEString ) ) (otherlv_2= 'works' ( (lv_explicitFactor_3_0= ruleFactor ) ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleCourseAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_explicitFactor_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:780:28: ( ( () ( ( ruleEString ) ) (otherlv_2= 'works' ( (lv_explicitFactor_3_0= ruleFactor ) ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:781:1: ( () ( ( ruleEString ) ) (otherlv_2= 'works' ( (lv_explicitFactor_3_0= ruleFactor ) ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:781:1: ( () ( ( ruleEString ) ) (otherlv_2= 'works' ( (lv_explicitFactor_3_0= ruleFactor ) ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:781:2: () ( ( ruleEString ) ) (otherlv_2= 'works' ( (lv_explicitFactor_3_0= ruleFactor ) ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )?
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:781:2: ()
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:782:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCourseAllocationAccess().getCourseAllocationAction_0(),
                        current);
                

            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:787:2: ( ( ruleEString ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:788:1: ( ruleEString )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:788:1: ( ruleEString )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:789:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCourseAllocationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCourseAllocationAccess().getPersonPersonCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCourseAllocation1715);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:802:2: (otherlv_2= 'works' ( (lv_explicitFactor_3_0= ruleFactor ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:802:4: otherlv_2= 'works' ( (lv_explicitFactor_3_0= ruleFactor ) )
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCourseAllocation1728); 

                        	newLeafNode(otherlv_2, grammarAccess.getCourseAllocationAccess().getWorksKeyword_2_0());
                        
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:806:1: ( (lv_explicitFactor_3_0= ruleFactor ) )
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:807:1: (lv_explicitFactor_3_0= ruleFactor )
                    {
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:807:1: (lv_explicitFactor_3_0= ruleFactor )
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:808:3: lv_explicitFactor_3_0= ruleFactor
                    {
                     
                    	        newCompositeNode(grammarAccess.getCourseAllocationAccess().getExplicitFactorFactorParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFactor_in_ruleCourseAllocation1749);
                    lv_explicitFactor_3_0=ruleFactor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCourseAllocationRule());
                    	        }
                           		set(
                           			current, 
                           			"explicitFactor",
                            		lv_explicitFactor_3_0, 
                            		"Factor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:824:4: (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:824:6: otherlv_4= 'as' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCourseAllocation1764); 

                        	newLeafNode(otherlv_4, grammarAccess.getCourseAllocationAccess().getAsKeyword_3_0());
                        
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:828:1: ( (otherlv_5= RULE_ID ) )
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:829:1: (otherlv_5= RULE_ID )
                    {
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:829:1: (otherlv_5= RULE_ID )
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:830:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCourseAllocationRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCourseAllocation1784); 

                    		newLeafNode(otherlv_5, grammarAccess.getCourseAllocationAccess().getRoleRoleCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCourseAllocation"


    // $ANTLR start "entryRuleRole"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:849:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:850:2: (iv_ruleRole= ruleRole EOF )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:851:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole1822);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole1832); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:858:1: ruleRole returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_factor_2_0= ruleFactor ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_factor_2_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:861:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_factor_2_0= ruleFactor ) ) ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:862:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_factor_2_0= ruleFactor ) ) )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:862:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_factor_2_0= ruleFactor ) ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:862:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_factor_2_0= ruleFactor ) )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:862:2: ()
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:863:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoleAccess().getRoleAction_0(),
                        current);
                

            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:868:2: ( (lv_name_1_0= RULE_ID ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:869:1: (lv_name_1_0= RULE_ID )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:869:1: (lv_name_1_0= RULE_ID )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:870:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRole1883); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:886:2: ( (lv_factor_2_0= ruleFactor ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:887:1: (lv_factor_2_0= ruleFactor )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:887:1: (lv_factor_2_0= ruleFactor )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:888:3: lv_factor_2_0= ruleFactor
            {
             
            	        newCompositeNode(grammarAccess.getRoleAccess().getFactorFactorParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFactor_in_ruleRole1909);
            lv_factor_2_0=ruleFactor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	        }
                   		set(
                   			current, 
                   			"factor",
                    		lv_factor_2_0, 
                    		"Factor");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "ruleSemesterKind"
    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:912:1: ruleSemesterKind returns [Enumerator current=null] : ( (enumLiteral_0= 'h' ) | (enumLiteral_1= 'v' ) ) ;
    public final Enumerator ruleSemesterKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:914:28: ( ( (enumLiteral_0= 'h' ) | (enumLiteral_1= 'v' ) ) )
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:915:1: ( (enumLiteral_0= 'h' ) | (enumLiteral_1= 'v' ) )
            {
            // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:915:1: ( (enumLiteral_0= 'h' ) | (enumLiteral_1= 'v' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:915:2: (enumLiteral_0= 'h' )
                    {
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:915:2: (enumLiteral_0= 'h' )
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:915:4: enumLiteral_0= 'h'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSemesterKind1959); 

                            current = grammarAccess.getSemesterKindAccess().getAUTUMNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSemesterKindAccess().getAUTUMNEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:921:6: (enumLiteral_1= 'v' )
                    {
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:921:6: (enumLiteral_1= 'v' )
                    // ../no.hal.ra.xtext/src-gen/no/hal/ra/xtext/parser/antlr/internal/InternalXra.g:921:8: enumLiteral_1= 'v'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSemesterKind1976); 

                            current = grammarAccess.getSemesterKindAccess().getSPRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSemesterKindAccess().getSPRINGEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleSemesterKind"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDepartment_in_entryRuleDepartment75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDepartment85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDepartment131 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDepartment148 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDepartment165 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDepartment177 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_rulePerson_in_ruleDepartment198 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_14_in_ruleDepartment211 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDepartment223 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDepartment235 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_ruleRole_in_ruleDepartment256 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_14_in_ruleDepartment269 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDepartment281 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDepartment293 = new BitSet(new long[]{0x0000000006004000L});
        public static final BitSet FOLLOW_ruleCourse_in_ruleDepartment314 = new BitSet(new long[]{0x0000000006004000L});
        public static final BitSet FOLLOW_14_in_ruleDepartment327 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_ruleSemester_in_ruleDepartment348 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_rulePerson_in_entryRulePerson385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePerson395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePerson450 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_rulePerson463 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_18_in_rulePerson476 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePerson493 = new BitSet(new long[]{0x0000000000380000L});
        public static final BitSet FOLLOW_19_in_rulePerson513 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePerson530 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_rulePerson550 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleURI_in_rulePerson571 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePerson585 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePerson599 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleFactor_in_rulePerson620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourse_in_entryRuleCourse656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourse666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseCode_in_ruleCourse721 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCourse738 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCourse755 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCourse775 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleCourse788 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCourse808 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleCourseCode_in_entryRuleCourseCode847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseCode858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleCourseCode897 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_26_in_ruleCourseCode916 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleCourseCode932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemester_in_entryRuleSemester977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSemester987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSemesterKind_in_ruleSemester1042 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSemester1059 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSemester1076 = new BitSet(new long[]{0x0000000006004000L});
        public static final BitSet FOLLOW_ruleCourseInstance_in_ruleSemester1097 = new BitSet(new long[]{0x0000000006004000L});
        public static final BitSet FOLLOW_14_in_ruleSemester1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_entryRuleURI1270 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURI1281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleURI1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFactor1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleFactor1416 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleFactor1435 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleFactor1450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseInstance_in_entryRuleCourseInstance1499 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseInstance1509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseCode_in_ruleCourseInstance1566 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCourseInstance1578 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleCourseAllocation_in_ruleCourseInstance1599 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_14_in_ruleCourseInstance1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCourseAllocation_in_entryRuleCourseAllocation1648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCourseAllocation1658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCourseAllocation1715 = new BitSet(new long[]{0x0000000010400002L});
        public static final BitSet FOLLOW_22_in_ruleCourseAllocation1728 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleFactor_in_ruleCourseAllocation1749 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleCourseAllocation1764 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCourseAllocation1784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1822 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRole1883 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleFactor_in_ruleRole1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSemesterKind1959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleSemesterKind1976 = new BitSet(new long[]{0x0000000000000002L});
    }


}