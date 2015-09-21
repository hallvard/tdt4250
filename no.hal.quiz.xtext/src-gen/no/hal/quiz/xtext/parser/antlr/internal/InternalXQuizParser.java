package no.hal.quiz.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.hal.quiz.xtext.services.XQuizGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXQuizParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_XML_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'quiz'", "'.'", "'part'", "'ref'", "'~'", "'/'", "'+-'", "'yes'", "'true'", "'no'", "'false'", "'('", "'x'", "')'", "'-'", "'v'", "'['", "']'", "'<<'", "'>>'", "'?'", "'='"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public String getGrammarFileName() { return "../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g"; }



     	private XQuizGrammarAccess grammarAccess;
     	
        public InternalXQuizParser(TokenStream input, XQuizGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Quiz";	
       	}
       	
       	@Override
       	protected XQuizGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQuiz"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:67:1: entryRuleQuiz returns [EObject current=null] : iv_ruleQuiz= ruleQuiz EOF ;
    public final EObject entryRuleQuiz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuiz = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:68:2: (iv_ruleQuiz= ruleQuiz EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:69:2: iv_ruleQuiz= ruleQuiz EOF
            {
             newCompositeNode(grammarAccess.getQuizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuiz_in_entryRuleQuiz75);
            iv_ruleQuiz=ruleQuiz();

            state._fsp--;

             current =iv_ruleQuiz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuiz85); 

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
    // $ANTLR end "entryRuleQuiz"


    // $ANTLR start "ruleQuiz"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:76:1: ruleQuiz returns [EObject current=null] : ( () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) ) ) ;
    public final EObject ruleQuiz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parts_4_0 = null;

        EObject lv_parts_5_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:79:28: ( ( () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:80:1: ( () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:80:1: ( () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:80:2: () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:80:2: ()
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuizAccess().getQuizAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuiz131); 

                	newLeafNode(otherlv_1, grammarAccess.getQuizAccess().getQuizKeyword_1());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:1: ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case 14:
                        {
                        alt4=1;
                        }
                        break;
                    case EOF:
                        {
                        alt4=1;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_INT:
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                    case 27:
                    case 28:
                    case 30:
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
                case 30:
                    {
                    alt4=2;
                    }
                    break;
                case EOF:
                case 13:
                    {
                    alt4=1;
                    }
                    break;
                case 14:
                    {
                    alt4=1;
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
                case 14:
                    {
                    alt4=1;
                    }
                    break;
                case EOF:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_STRING:
                case RULE_INT:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 26:
                case 27:
                case 28:
                case 30:
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
            case 14:
                {
                alt4=1;
                }
                break;
            case EOF:
                {
                alt4=1;
                }
                break;
            case 15:
            case 30:
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
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:2: ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:2: ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:3: ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )*
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:3: ( (lv_name_2_0= ruleQName ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ID) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:91:1: (lv_name_2_0= ruleQName )
                            {
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:91:1: (lv_name_2_0= ruleQName )
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:92:3: lv_name_2_0= ruleQName
                            {
                             
                            	        newCompositeNode(grammarAccess.getQuizAccess().getNameQNameParserRuleCall_2_0_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleQuiz154);
                            lv_name_2_0=ruleQName();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getQuizRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"name",
                                    		lv_name_2_0, 
                                    		"QName");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:108:3: ( (lv_title_3_0= RULE_STRING ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_STRING) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:109:1: (lv_title_3_0= RULE_STRING )
                            {
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:109:1: (lv_title_3_0= RULE_STRING )
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:110:3: lv_title_3_0= RULE_STRING
                            {
                            lv_title_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuiz172); 

                            			newLeafNode(lv_title_3_0, grammarAccess.getQuizAccess().getTitleSTRINGTerminalRuleCall_2_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getQuizRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"title",
                                    		lv_title_3_0, 
                                    		"STRING");
                            	    

                            }


                            }
                            break;

                    }

                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:126:3: ( (lv_parts_4_0= ruleAbstractQuizPart ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:127:1: (lv_parts_4_0= ruleAbstractQuizPart )
                    	    {
                    	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:127:1: (lv_parts_4_0= ruleAbstractQuizPart )
                    	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:128:3: lv_parts_4_0= ruleAbstractQuizPart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuizAccess().getPartsAbstractQuizPartParserRuleCall_2_0_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractQuizPart_in_ruleQuiz199);
                    	    lv_parts_4_0=ruleAbstractQuizPart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getQuizRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parts",
                    	            		lv_parts_4_0, 
                    	            		"AbstractQuizPart");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:145:6: ( (lv_parts_5_0= ruleAnonymousQuizPart ) )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:145:6: ( (lv_parts_5_0= ruleAnonymousQuizPart ) )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:146:1: (lv_parts_5_0= ruleAnonymousQuizPart )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:146:1: (lv_parts_5_0= ruleAnonymousQuizPart )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:147:3: lv_parts_5_0= ruleAnonymousQuizPart
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuizAccess().getPartsAnonymousQuizPartParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnonymousQuizPart_in_ruleQuiz228);
                    lv_parts_5_0=ruleAnonymousQuizPart();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuizRule());
                    	        }
                           		add(
                           			current, 
                           			"parts",
                            		lv_parts_5_0, 
                            		"AnonymousQuizPart");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleQuiz"


    // $ANTLR start "entryRuleQName"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:171:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:172:2: (iv_ruleQName= ruleQName EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:173:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_entryRuleQName266);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQName277); 

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:180:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:183:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:184:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:184:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:184:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQName317); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:191:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:192:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQName336); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQName351); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleAbstractQuizPart"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:212:1: entryRuleAbstractQuizPart returns [EObject current=null] : iv_ruleAbstractQuizPart= ruleAbstractQuizPart EOF ;
    public final EObject entryRuleAbstractQuizPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractQuizPart = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:213:2: (iv_ruleAbstractQuizPart= ruleAbstractQuizPart EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:214:2: iv_ruleAbstractQuizPart= ruleAbstractQuizPart EOF
            {
             newCompositeNode(grammarAccess.getAbstractQuizPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractQuizPart_in_entryRuleAbstractQuizPart398);
            iv_ruleAbstractQuizPart=ruleAbstractQuizPart();

            state._fsp--;

             current =iv_ruleAbstractQuizPart; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractQuizPart408); 

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
    // $ANTLR end "entryRuleAbstractQuizPart"


    // $ANTLR start "ruleAbstractQuizPart"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:221:1: ruleAbstractQuizPart returns [EObject current=null] : (this_QuizPart_0= ruleQuizPart | this_QuizPartRef_1= ruleQuizPartRef ) ;
    public final EObject ruleAbstractQuizPart() throws RecognitionException {
        EObject current = null;

        EObject this_QuizPart_0 = null;

        EObject this_QuizPartRef_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:224:28: ( (this_QuizPart_0= ruleQuizPart | this_QuizPartRef_1= ruleQuizPartRef ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:225:1: (this_QuizPart_0= ruleQuizPart | this_QuizPartRef_1= ruleQuizPartRef )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:225:1: (this_QuizPart_0= ruleQuizPart | this_QuizPartRef_1= ruleQuizPartRef )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_1==15) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:226:5: this_QuizPart_0= ruleQuizPart
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractQuizPartAccess().getQuizPartParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuizPart_in_ruleAbstractQuizPart455);
                    this_QuizPart_0=ruleQuizPart();

                    state._fsp--;

                     
                            current = this_QuizPart_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:236:5: this_QuizPartRef_1= ruleQuizPartRef
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractQuizPartAccess().getQuizPartRefParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuizPartRef_in_ruleAbstractQuizPart482);
                    this_QuizPartRef_1=ruleQuizPartRef();

                    state._fsp--;

                     
                            current = this_QuizPartRef_1; 
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
    // $ANTLR end "ruleAbstractQuizPart"


    // $ANTLR start "entryRuleQuizPart"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:252:1: entryRuleQuizPart returns [EObject current=null] : iv_ruleQuizPart= ruleQuizPart EOF ;
    public final EObject entryRuleQuizPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuizPart = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:253:2: (iv_ruleQuizPart= ruleQuizPart EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:254:2: iv_ruleQuizPart= ruleQuizPart EOF
            {
             newCompositeNode(grammarAccess.getQuizPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuizPart_in_entryRuleQuizPart517);
            iv_ruleQuizPart=ruleQuizPart();

            state._fsp--;

             current =iv_ruleQuizPart; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuizPart527); 

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
    // $ANTLR end "entryRuleQuizPart"


    // $ANTLR start "ruleQuizPart"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:261:1: ruleQuizPart returns [EObject current=null] : (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )* ) ;
    public final EObject ruleQuizPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:264:28: ( (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )* ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:265:1: (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )* )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:265:1: (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )* )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:265:3: otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )*
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuizPart564); 

                	newLeafNode(otherlv_0, grammarAccess.getQuizPartAccess().getPartKeyword_0());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:269:1: ( (lv_name_1_0= RULE_ID ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:270:1: (lv_name_1_0= RULE_ID )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:270:1: (lv_name_1_0= RULE_ID )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:271:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQuizPart581); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuizPartAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuizPartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:287:2: ( (lv_title_2_0= RULE_STRING ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:288:1: (lv_title_2_0= RULE_STRING )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:288:1: (lv_title_2_0= RULE_STRING )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:289:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuizPart603); 

            			newLeafNode(lv_title_2_0, grammarAccess.getQuizPartAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuizPartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:305:2: ( (lv_questions_3_0= ruleAbstractQA ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==15||LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:306:1: (lv_questions_3_0= ruleAbstractQA )
            	    {
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:306:1: (lv_questions_3_0= ruleAbstractQA )
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:307:3: lv_questions_3_0= ruleAbstractQA
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuizPartAccess().getQuestionsAbstractQAParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractQA_in_ruleQuizPart629);
            	    lv_questions_3_0=ruleAbstractQA();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuizPartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_3_0, 
            	            		"AbstractQA");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleQuizPart"


    // $ANTLR start "entryRuleQuizPartRef"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:331:1: entryRuleQuizPartRef returns [EObject current=null] : iv_ruleQuizPartRef= ruleQuizPartRef EOF ;
    public final EObject entryRuleQuizPartRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuizPartRef = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:332:2: (iv_ruleQuizPartRef= ruleQuizPartRef EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:333:2: iv_ruleQuizPartRef= ruleQuizPartRef EOF
            {
             newCompositeNode(grammarAccess.getQuizPartRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuizPartRef_in_entryRuleQuizPartRef666);
            iv_ruleQuizPartRef=ruleQuizPartRef();

            state._fsp--;

             current =iv_ruleQuizPartRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuizPartRef676); 

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
    // $ANTLR end "entryRuleQuizPartRef"


    // $ANTLR start "ruleQuizPartRef"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:340:1: ruleQuizPartRef returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) ) ;
    public final EObject ruleQuizPartRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:343:28: ( (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:344:1: (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:344:1: (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:344:3: otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuizPartRef713); 

                	newLeafNode(otherlv_0, grammarAccess.getQuizPartRefAccess().getPartKeyword_0());
                
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuizPartRef725); 

                	newLeafNode(otherlv_1, grammarAccess.getQuizPartRefAccess().getRefKeyword_1());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:352:1: ( ( ruleQName ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:353:1: ( ruleQName )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:353:1: ( ruleQName )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:354:3: ruleQName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQuizPartRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getQuizPartRefAccess().getPartRefQuizPartCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleQuizPartRef748);
            ruleQName();

            state._fsp--;

             
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
    // $ANTLR end "ruleQuizPartRef"


    // $ANTLR start "entryRuleAnonymousQuizPart"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:375:1: entryRuleAnonymousQuizPart returns [EObject current=null] : iv_ruleAnonymousQuizPart= ruleAnonymousQuizPart EOF ;
    public final EObject entryRuleAnonymousQuizPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousQuizPart = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:376:2: (iv_ruleAnonymousQuizPart= ruleAnonymousQuizPart EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:377:2: iv_ruleAnonymousQuizPart= ruleAnonymousQuizPart EOF
            {
             newCompositeNode(grammarAccess.getAnonymousQuizPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnonymousQuizPart_in_entryRuleAnonymousQuizPart784);
            iv_ruleAnonymousQuizPart=ruleAnonymousQuizPart();

            state._fsp--;

             current =iv_ruleAnonymousQuizPart; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnonymousQuizPart794); 

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
    // $ANTLR end "entryRuleAnonymousQuizPart"


    // $ANTLR start "ruleAnonymousQuizPart"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:384:1: ruleAnonymousQuizPart returns [EObject current=null] : ( () ( (lv_questions_1_0= ruleAbstractQA ) )* ) ;
    public final EObject ruleAnonymousQuizPart() throws RecognitionException {
        EObject current = null;

        EObject lv_questions_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:387:28: ( ( () ( (lv_questions_1_0= ruleAbstractQA ) )* ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:388:1: ( () ( (lv_questions_1_0= ruleAbstractQA ) )* )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:388:1: ( () ( (lv_questions_1_0= ruleAbstractQA ) )* )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:388:2: () ( (lv_questions_1_0= ruleAbstractQA ) )*
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:388:2: ()
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:389:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnonymousQuizPartAccess().getQuizPartAction_0(),
                        current);
                

            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:394:2: ( (lv_questions_1_0= ruleAbstractQA ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==15||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:395:1: (lv_questions_1_0= ruleAbstractQA )
            	    {
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:395:1: (lv_questions_1_0= ruleAbstractQA )
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:396:3: lv_questions_1_0= ruleAbstractQA
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnonymousQuizPartAccess().getQuestionsAbstractQAParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAbstractQA_in_ruleAnonymousQuizPart849);
            	    lv_questions_1_0=ruleAbstractQA();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAnonymousQuizPartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_1_0, 
            	            		"AbstractQA");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleAnonymousQuizPart"


    // $ANTLR start "entryRuleAbstractQA"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:420:1: entryRuleAbstractQA returns [EObject current=null] : iv_ruleAbstractQA= ruleAbstractQA EOF ;
    public final EObject entryRuleAbstractQA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractQA = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:421:2: (iv_ruleAbstractQA= ruleAbstractQA EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:422:2: iv_ruleAbstractQA= ruleAbstractQA EOF
            {
             newCompositeNode(grammarAccess.getAbstractQARule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractQA_in_entryRuleAbstractQA886);
            iv_ruleAbstractQA=ruleAbstractQA();

            state._fsp--;

             current =iv_ruleAbstractQA; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractQA896); 

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
    // $ANTLR end "entryRuleAbstractQA"


    // $ANTLR start "ruleAbstractQA"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:429:1: ruleAbstractQA returns [EObject current=null] : (this_QA_0= ruleQA | this_QARef_1= ruleQARef ) ;
    public final EObject ruleAbstractQA() throws RecognitionException {
        EObject current = null;

        EObject this_QA_0 = null;

        EObject this_QARef_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:432:28: ( (this_QA_0= ruleQA | this_QARef_1= ruleQARef ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:433:1: (this_QA_0= ruleQA | this_QARef_1= ruleQARef )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:433:1: (this_QA_0= ruleQA | this_QARef_1= ruleQARef )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:434:5: this_QA_0= ruleQA
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractQAAccess().getQAParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQA_in_ruleAbstractQA943);
                    this_QA_0=ruleQA();

                    state._fsp--;

                     
                            current = this_QA_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:444:5: this_QARef_1= ruleQARef
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractQAAccess().getQARefParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQARef_in_ruleAbstractQA970);
                    this_QARef_1=ruleQARef();

                    state._fsp--;

                     
                            current = this_QARef_1; 
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
    // $ANTLR end "ruleAbstractQA"


    // $ANTLR start "entryRuleQARef"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:460:1: entryRuleQARef returns [EObject current=null] : iv_ruleQARef= ruleQARef EOF ;
    public final EObject entryRuleQARef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQARef = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:461:2: (iv_ruleQARef= ruleQARef EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:462:2: iv_ruleQARef= ruleQARef EOF
            {
             newCompositeNode(grammarAccess.getQARefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQARef_in_entryRuleQARef1005);
            iv_ruleQARef=ruleQARef();

            state._fsp--;

             current =iv_ruleQARef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQARef1015); 

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
    // $ANTLR end "entryRuleQARef"


    // $ANTLR start "ruleQARef"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:469:1: ruleQARef returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQName ) ) ) ;
    public final EObject ruleQARef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:472:28: ( (otherlv_0= 'ref' ( ( ruleQName ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:473:1: (otherlv_0= 'ref' ( ( ruleQName ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:473:1: (otherlv_0= 'ref' ( ( ruleQName ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:473:3: otherlv_0= 'ref' ( ( ruleQName ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQARef1052); 

                	newLeafNode(otherlv_0, grammarAccess.getQARefAccess().getRefKeyword_0());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:477:1: ( ( ruleQName ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:478:1: ( ruleQName )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:478:1: ( ruleQName )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:479:3: ruleQName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQARefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getQARefAccess().getQaRefQACrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleQARef1075);
            ruleQName();

            state._fsp--;

             
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
    // $ANTLR end "ruleQARef"


    // $ANTLR start "entryRuleQA"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:500:1: entryRuleQA returns [EObject current=null] : iv_ruleQA= ruleQA EOF ;
    public final EObject entryRuleQA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQA = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:501:2: (iv_ruleQA= ruleQA EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:502:2: iv_ruleQA= ruleQA EOF
            {
             newCompositeNode(grammarAccess.getQARule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQA_in_entryRuleQA1111);
            iv_ruleQA=ruleQA();

            state._fsp--;

             current =iv_ruleQA; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQA1121); 

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
    // $ANTLR end "entryRuleQA"


    // $ANTLR start "ruleQA"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:509:1: ruleQA returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) ) ;
    public final EObject ruleQA() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_q_1_0 = null;

        EObject lv_a_2_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:512:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:513:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:513:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:513:2: ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:513:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:514:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:514:1: (lv_name_0_0= RULE_ID )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:515:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQA1163); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getQAAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQARule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:531:3: ( (lv_q_1_0= ruleQuestion ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:532:1: (lv_q_1_0= ruleQuestion )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:532:1: (lv_q_1_0= ruleQuestion )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:533:3: lv_q_1_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getQAAccess().getQQuestionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQA1190);
            lv_q_1_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQARule());
            	        }
                   		set(
                   			current, 
                   			"q",
                    		lv_q_1_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:549:2: ( (lv_a_2_0= ruleAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:550:1: (lv_a_2_0= ruleAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:550:1: (lv_a_2_0= ruleAnswer )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:551:3: lv_a_2_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getQAAccess().getAAnswerParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQA1211);
            lv_a_2_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQARule());
            	        }
                   		set(
                   			current, 
                   			"a",
                    		lv_a_2_0, 
                    		"Answer");
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
    // $ANTLR end "ruleQA"


    // $ANTLR start "entryRuleQuestion"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:575:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:576:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:577:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion1247);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion1257); 

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
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:584:1: ruleQuestion returns [EObject current=null] : (this_StringQuestion_0= ruleStringQuestion | this_XmlQuestion_1= ruleXmlQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_StringQuestion_0 = null;

        EObject this_XmlQuestion_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:587:28: ( (this_StringQuestion_0= ruleStringQuestion | this_XmlQuestion_1= ruleXmlQuestion ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:588:1: (this_StringQuestion_0= ruleStringQuestion | this_XmlQuestion_1= ruleXmlQuestion )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:588:1: (this_StringQuestion_0= ruleStringQuestion | this_XmlQuestion_1= ruleXmlQuestion )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:589:5: this_StringQuestion_0= ruleStringQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getStringQuestionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringQuestion_in_ruleQuestion1304);
                    this_StringQuestion_0=ruleStringQuestion();

                    state._fsp--;

                     
                            current = this_StringQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:599:5: this_XmlQuestion_1= ruleXmlQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getXmlQuestionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleXmlQuestion_in_ruleQuestion1331);
                    this_XmlQuestion_1=ruleXmlQuestion();

                    state._fsp--;

                     
                            current = this_XmlQuestion_1; 
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


    // $ANTLR start "entryRuleStringQuestion"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:615:1: entryRuleStringQuestion returns [EObject current=null] : iv_ruleStringQuestion= ruleStringQuestion EOF ;
    public final EObject entryRuleStringQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringQuestion = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:616:2: (iv_ruleStringQuestion= ruleStringQuestion EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:617:2: iv_ruleStringQuestion= ruleStringQuestion EOF
            {
             newCompositeNode(grammarAccess.getStringQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringQuestion_in_entryRuleStringQuestion1366);
            iv_ruleStringQuestion=ruleStringQuestion();

            state._fsp--;

             current =iv_ruleStringQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringQuestion1376); 

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
    // $ANTLR end "entryRuleStringQuestion"


    // $ANTLR start "ruleStringQuestion"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:624:1: ruleStringQuestion returns [EObject current=null] : ( (lv_question_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_question_0_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:627:28: ( ( (lv_question_0_0= RULE_STRING ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:628:1: ( (lv_question_0_0= RULE_STRING ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:628:1: ( (lv_question_0_0= RULE_STRING ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:629:1: (lv_question_0_0= RULE_STRING )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:629:1: (lv_question_0_0= RULE_STRING )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:630:3: lv_question_0_0= RULE_STRING
            {
            lv_question_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringQuestion1417); 

            			newLeafNode(lv_question_0_0, grammarAccess.getStringQuestionAccess().getQuestionSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringQuestion"


    // $ANTLR start "entryRuleXmlQuestion"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:654:1: entryRuleXmlQuestion returns [EObject current=null] : iv_ruleXmlQuestion= ruleXmlQuestion EOF ;
    public final EObject entryRuleXmlQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlQuestion = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:655:2: (iv_ruleXmlQuestion= ruleXmlQuestion EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:656:2: iv_ruleXmlQuestion= ruleXmlQuestion EOF
            {
             newCompositeNode(grammarAccess.getXmlQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlQuestion_in_entryRuleXmlQuestion1457);
            iv_ruleXmlQuestion=ruleXmlQuestion();

            state._fsp--;

             current =iv_ruleXmlQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlQuestion1467); 

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
    // $ANTLR end "entryRuleXmlQuestion"


    // $ANTLR start "ruleXmlQuestion"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:663:1: ruleXmlQuestion returns [EObject current=null] : ( (lv_xml_0_0= ruleXml ) ) ;
    public final EObject ruleXmlQuestion() throws RecognitionException {
        EObject current = null;

        EObject lv_xml_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:666:28: ( ( (lv_xml_0_0= ruleXml ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:667:1: ( (lv_xml_0_0= ruleXml ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:667:1: ( (lv_xml_0_0= ruleXml ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:668:1: (lv_xml_0_0= ruleXml )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:668:1: (lv_xml_0_0= ruleXml )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:669:3: lv_xml_0_0= ruleXml
            {
             
            	        newCompositeNode(grammarAccess.getXmlQuestionAccess().getXmlXmlParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleXml_in_ruleXmlQuestion1512);
            lv_xml_0_0=ruleXml();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXmlQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"xml",
                    		lv_xml_0_0, 
                    		"Xml");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleXmlQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:693:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:694:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:695:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1547);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1557); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:702:1: ruleAnswer returns [EObject current=null] : (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_OptionAnswer_0 = null;

        EObject this_OptionsAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:705:28: ( (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:706:1: (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:706:1: (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING||LA12_0==RULE_INT||LA12_0==17||(LA12_0>=19 && LA12_0<=22)||LA12_0==30) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=23 && LA12_0<=24)||(LA12_0>=26 && LA12_0<=28)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:707:5: this_OptionAnswer_0= ruleOptionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_ruleAnswer1604);
                    this_OptionAnswer_0=ruleOptionAnswer();

                    state._fsp--;

                     
                            current = this_OptionAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:717:5: this_OptionsAnswer_1= ruleOptionsAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getOptionsAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOptionsAnswer_in_ruleAnswer1631);
                    this_OptionsAnswer_1=ruleOptionsAnswer();

                    state._fsp--;

                     
                            current = this_OptionsAnswer_1; 
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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleOptionAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:733:1: entryRuleOptionAnswer returns [EObject current=null] : iv_ruleOptionAnswer= ruleOptionAnswer EOF ;
    public final EObject entryRuleOptionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:734:2: (iv_ruleOptionAnswer= ruleOptionAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:735:2: iv_ruleOptionAnswer= ruleOptionAnswer EOF
            {
             newCompositeNode(grammarAccess.getOptionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer1666);
            iv_ruleOptionAnswer=ruleOptionAnswer();

            state._fsp--;

             current =iv_ruleOptionAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionAnswer1676); 

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
    // $ANTLR end "entryRuleOptionAnswer"


    // $ANTLR start "ruleOptionAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:742:1: ruleOptionAnswer returns [EObject current=null] : (this_SimpleAnswer_0= ruleSimpleAnswer | this_XmlAnswer_1= ruleXmlAnswer ) ;
    public final EObject ruleOptionAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAnswer_0 = null;

        EObject this_XmlAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:745:28: ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_XmlAnswer_1= ruleXmlAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:746:1: (this_SimpleAnswer_0= ruleSimpleAnswer | this_XmlAnswer_1= ruleXmlAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:746:1: (this_SimpleAnswer_0= ruleSimpleAnswer | this_XmlAnswer_1= ruleXmlAnswer )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING||LA13_0==RULE_INT||LA13_0==17||(LA13_0>=19 && LA13_0<=22)) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:747:5: this_SimpleAnswer_0= ruleSimpleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAnswerAccess().getSimpleAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleAnswer_in_ruleOptionAnswer1723);
                    this_SimpleAnswer_0=ruleSimpleAnswer();

                    state._fsp--;

                     
                            current = this_SimpleAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:757:5: this_XmlAnswer_1= ruleXmlAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionAnswerAccess().getXmlAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleXmlAnswer_in_ruleOptionAnswer1750);
                    this_XmlAnswer_1=ruleXmlAnswer();

                    state._fsp--;

                     
                            current = this_XmlAnswer_1; 
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
    // $ANTLR end "ruleOptionAnswer"


    // $ANTLR start "entryRuleSimpleAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:773:1: entryRuleSimpleAnswer returns [EObject current=null] : iv_ruleSimpleAnswer= ruleSimpleAnswer EOF ;
    public final EObject entryRuleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:774:2: (iv_ruleSimpleAnswer= ruleSimpleAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:775:2: iv_ruleSimpleAnswer= ruleSimpleAnswer EOF
            {
             newCompositeNode(grammarAccess.getSimpleAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer1785);
            iv_ruleSimpleAnswer=ruleSimpleAnswer();

            state._fsp--;

             current =iv_ruleSimpleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAnswer1795); 

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
    // $ANTLR end "entryRuleSimpleAnswer"


    // $ANTLR start "ruleSimpleAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:782:1: ruleSimpleAnswer returns [EObject current=null] : (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer ) ;
    public final EObject ruleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_StringAnswer_0 = null;

        EObject this_RegexAnswer_1 = null;

        EObject this_NumberAnswer_2 = null;

        EObject this_BooleanAnswer_3 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:785:28: ( (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:786:1: (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:786:1: (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case 17:
                {
                alt14=2;
                }
                break;
            case RULE_INT:
                {
                alt14=3;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:787:5: this_StringAnswer_0= ruleStringAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleAnswerAccess().getStringAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringAnswer_in_ruleSimpleAnswer1842);
                    this_StringAnswer_0=ruleStringAnswer();

                    state._fsp--;

                     
                            current = this_StringAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:797:5: this_RegexAnswer_1= ruleRegexAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleAnswerAccess().getRegexAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegexAnswer_in_ruleSimpleAnswer1869);
                    this_RegexAnswer_1=ruleRegexAnswer();

                    state._fsp--;

                     
                            current = this_RegexAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:807:5: this_NumberAnswer_2= ruleNumberAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleAnswerAccess().getNumberAnswerParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_ruleSimpleAnswer1896);
                    this_NumberAnswer_2=ruleNumberAnswer();

                    state._fsp--;

                     
                            current = this_NumberAnswer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:817:5: this_BooleanAnswer_3= ruleBooleanAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleAnswerAccess().getBooleanAnswerParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanAnswer_in_ruleSimpleAnswer1923);
                    this_BooleanAnswer_3=ruleBooleanAnswer();

                    state._fsp--;

                     
                            current = this_BooleanAnswer_3; 
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
    // $ANTLR end "ruleSimpleAnswer"


    // $ANTLR start "entryRuleStringAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:833:1: entryRuleStringAnswer returns [EObject current=null] : iv_ruleStringAnswer= ruleStringAnswer EOF ;
    public final EObject entryRuleStringAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:834:2: (iv_ruleStringAnswer= ruleStringAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:835:2: iv_ruleStringAnswer= ruleStringAnswer EOF
            {
             newCompositeNode(grammarAccess.getStringAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringAnswer_in_entryRuleStringAnswer1958);
            iv_ruleStringAnswer=ruleStringAnswer();

            state._fsp--;

             current =iv_ruleStringAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringAnswer1968); 

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
    // $ANTLR end "entryRuleStringAnswer"


    // $ANTLR start "ruleStringAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:842:1: ruleStringAnswer returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? ) ;
    public final EObject ruleStringAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_ignoreCase_1_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:845:28: ( ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:846:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:846:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:846:2: ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )?
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:846:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:847:1: (lv_value_0_0= RULE_STRING )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:847:1: (lv_value_0_0= RULE_STRING )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:848:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringAnswer2010); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringAnswerAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:864:2: ( (lv_ignoreCase_1_0= '~' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:865:1: (lv_ignoreCase_1_0= '~' )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:865:1: (lv_ignoreCase_1_0= '~' )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:866:3: lv_ignoreCase_1_0= '~'
                    {
                    lv_ignoreCase_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStringAnswer2033); 

                            newLeafNode(lv_ignoreCase_1_0, grammarAccess.getStringAnswerAccess().getIgnoreCaseTildeKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "ignoreCase", true, "~");
                    	    

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
    // $ANTLR end "ruleStringAnswer"


    // $ANTLR start "entryRuleRegexAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:887:1: entryRuleRegexAnswer returns [EObject current=null] : iv_ruleRegexAnswer= ruleRegexAnswer EOF ;
    public final EObject entryRuleRegexAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:888:2: (iv_ruleRegexAnswer= ruleRegexAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:889:2: iv_ruleRegexAnswer= ruleRegexAnswer EOF
            {
             newCompositeNode(grammarAccess.getRegexAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegexAnswer_in_entryRuleRegexAnswer2083);
            iv_ruleRegexAnswer=ruleRegexAnswer();

            state._fsp--;

             current =iv_ruleRegexAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegexAnswer2093); 

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
    // $ANTLR end "entryRuleRegexAnswer"


    // $ANTLR start "ruleRegexAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:896:1: ruleRegexAnswer returns [EObject current=null] : ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? ) ;
    public final EObject ruleRegexAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_regexp_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_ignoreCase_3_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:899:28: ( ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:900:1: ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:900:1: ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:900:2: ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )?
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:900:2: ( (lv_regexp_0_0= '/' ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:901:1: (lv_regexp_0_0= '/' )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:901:1: (lv_regexp_0_0= '/' )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:902:3: lv_regexp_0_0= '/'
            {
            lv_regexp_0_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRegexAnswer2136); 

                    newLeafNode(lv_regexp_0_0, grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegexAnswerRule());
            	        }
                   		setWithLastConsumed(current, "regexp", true, "/");
            	    

            }


            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:915:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:916:1: (lv_value_1_0= RULE_STRING )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:916:1: (lv_value_1_0= RULE_STRING )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:917:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRegexAnswer2166); 

            			newLeafNode(lv_value_1_0, grammarAccess.getRegexAnswerAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegexAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRegexAnswer2183); 

                	newLeafNode(otherlv_2, grammarAccess.getRegexAnswerAccess().getSolidusKeyword_2());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:937:1: ( (lv_ignoreCase_3_0= '~' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:938:1: (lv_ignoreCase_3_0= '~' )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:938:1: (lv_ignoreCase_3_0= '~' )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:939:3: lv_ignoreCase_3_0= '~'
                    {
                    lv_ignoreCase_3_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRegexAnswer2201); 

                            newLeafNode(lv_ignoreCase_3_0, grammarAccess.getRegexAnswerAccess().getIgnoreCaseTildeKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRegexAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "ignoreCase", true, "~");
                    	    

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
    // $ANTLR end "ruleRegexAnswer"


    // $ANTLR start "entryRuleNumberAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:960:1: entryRuleNumberAnswer returns [EObject current=null] : iv_ruleNumberAnswer= ruleNumberAnswer EOF ;
    public final EObject entryRuleNumberAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:961:2: (iv_ruleNumberAnswer= ruleNumberAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:962:2: iv_ruleNumberAnswer= ruleNumberAnswer EOF
            {
             newCompositeNode(grammarAccess.getNumberAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer2251);
            iv_ruleNumberAnswer=ruleNumberAnswer();

            state._fsp--;

             current =iv_ruleNumberAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberAnswer2261); 

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
    // $ANTLR end "entryRuleNumberAnswer"


    // $ANTLR start "ruleNumberAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:969:1: ruleNumberAnswer returns [EObject current=null] : ( ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )? ) ;
    public final EObject ruleNumberAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_errorMargin_2_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:972:28: ( ( ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )? ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:973:1: ( ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )? )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:973:1: ( ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )? )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:973:2: ( (lv_value_0_0= ruleEDoubleObject ) ) (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )?
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:973:2: ( (lv_value_0_0= ruleEDoubleObject ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:974:1: (lv_value_0_0= ruleEDoubleObject )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:974:1: (lv_value_0_0= ruleEDoubleObject )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:975:3: lv_value_0_0= ruleEDoubleObject
            {
             
            	        newCompositeNode(grammarAccess.getNumberAnswerAccess().getValueEDoubleObjectParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDoubleObject_in_ruleNumberAnswer2307);
            lv_value_0_0=ruleEDoubleObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EDoubleObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:991:2: (otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:991:4: otherlv_1= '+-' ( (lv_errorMargin_2_0= ruleEDoubleObject ) )
                    {
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNumberAnswer2320); 

                        	newLeafNode(otherlv_1, grammarAccess.getNumberAnswerAccess().getPlusSignHyphenMinusKeyword_1_0());
                        
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:995:1: ( (lv_errorMargin_2_0= ruleEDoubleObject ) )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:996:1: (lv_errorMargin_2_0= ruleEDoubleObject )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:996:1: (lv_errorMargin_2_0= ruleEDoubleObject )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:997:3: lv_errorMargin_2_0= ruleEDoubleObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAnswerAccess().getErrorMarginEDoubleObjectParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDoubleObject_in_ruleNumberAnswer2341);
                    lv_errorMargin_2_0=ruleEDoubleObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"errorMargin",
                            		lv_errorMargin_2_0, 
                            		"EDoubleObject");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleNumberAnswer"


    // $ANTLR start "entryRuleEDoubleObject"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1021:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1022:2: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1023:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
             newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDoubleObject_in_entryRuleEDoubleObject2380);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;

             current =iv_ruleEDoubleObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDoubleObject2391); 

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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1030:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1033:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1034:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1034:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1034:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDoubleObject2431); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_0()); 
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1041:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1042:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEDoubleObject2450); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDoubleObject2465); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1_1()); 
                        

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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleBooleanAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1062:1: entryRuleBooleanAnswer returns [EObject current=null] : iv_ruleBooleanAnswer= ruleBooleanAnswer EOF ;
    public final EObject entryRuleBooleanAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1063:2: (iv_ruleBooleanAnswer= ruleBooleanAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1064:2: iv_ruleBooleanAnswer= ruleBooleanAnswer EOF
            {
             newCompositeNode(grammarAccess.getBooleanAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanAnswer_in_entryRuleBooleanAnswer2512);
            iv_ruleBooleanAnswer=ruleBooleanAnswer();

            state._fsp--;

             current =iv_ruleBooleanAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanAnswer2522); 

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
    // $ANTLR end "entryRuleBooleanAnswer"


    // $ANTLR start "ruleBooleanAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1071:1: ruleBooleanAnswer returns [EObject current=null] : ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) ) ;
    public final EObject ruleBooleanAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1074:28: ( ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1075:1: ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1075:1: ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1075:2: () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1075:2: ()
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1076:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanAnswerAccess().getBooleanAnswerAction_0(),
                        current);
                

            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1081:2: ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=19 && LA21_0<=20)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=21 && LA21_0<=22)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1081:3: ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1081:3: ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1082:1: ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1082:1: ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1083:1: (lv_value_1_1= 'yes' | lv_value_1_2= 'true' )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1083:1: (lv_value_1_1= 'yes' | lv_value_1_2= 'true' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==19) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==20) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1084:3: lv_value_1_1= 'yes'
                            {
                            lv_value_1_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBooleanAnswer2577); 

                                    newLeafNode(lv_value_1_1, grammarAccess.getBooleanAnswerAccess().getValueYesKeyword_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanAnswerRule());
                            	        }
                                   		setWithLastConsumed(current, "value", true, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1096:8: lv_value_1_2= 'true'
                            {
                            lv_value_1_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBooleanAnswer2606); 

                                    newLeafNode(lv_value_1_2, grammarAccess.getBooleanAnswerAccess().getValueTrueKeyword_1_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanAnswerRule());
                            	        }
                                   		setWithLastConsumed(current, "value", true, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1112:6: (otherlv_2= 'no' | otherlv_3= 'false' )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1112:6: (otherlv_2= 'no' | otherlv_3= 'false' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==21) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==22) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1112:8: otherlv_2= 'no'
                            {
                            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBooleanAnswer2641); 

                                	newLeafNode(otherlv_2, grammarAccess.getBooleanAnswerAccess().getNoKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1117:7: otherlv_3= 'false'
                            {
                            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBooleanAnswer2659); 

                                	newLeafNode(otherlv_3, grammarAccess.getBooleanAnswerAccess().getFalseKeyword_1_1_1());
                                

                            }
                            break;

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
    // $ANTLR end "ruleBooleanAnswer"


    // $ANTLR start "entryRuleXmlAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1129:1: entryRuleXmlAnswer returns [EObject current=null] : iv_ruleXmlAnswer= ruleXmlAnswer EOF ;
    public final EObject entryRuleXmlAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1130:2: (iv_ruleXmlAnswer= ruleXmlAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1131:2: iv_ruleXmlAnswer= ruleXmlAnswer EOF
            {
             newCompositeNode(grammarAccess.getXmlAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlAnswer_in_entryRuleXmlAnswer2697);
            iv_ruleXmlAnswer=ruleXmlAnswer();

            state._fsp--;

             current =iv_ruleXmlAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlAnswer2707); 

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
    // $ANTLR end "entryRuleXmlAnswer"


    // $ANTLR start "ruleXmlAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1138:1: ruleXmlAnswer returns [EObject current=null] : ( (lv_xml_0_0= ruleXml ) ) ;
    public final EObject ruleXmlAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_xml_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1141:28: ( ( (lv_xml_0_0= ruleXml ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1142:1: ( (lv_xml_0_0= ruleXml ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1142:1: ( (lv_xml_0_0= ruleXml ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1143:1: (lv_xml_0_0= ruleXml )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1143:1: (lv_xml_0_0= ruleXml )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1144:3: lv_xml_0_0= ruleXml
            {
             
            	        newCompositeNode(grammarAccess.getXmlAnswerAccess().getXmlXmlParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleXml_in_ruleXmlAnswer2752);
            lv_xml_0_0=ruleXml();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXmlAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"xml",
                    		lv_xml_0_0, 
                    		"Xml");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleXmlAnswer"


    // $ANTLR start "entryRuleOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1168:1: entryRuleOptionsAnswer returns [EObject current=null] : iv_ruleOptionsAnswer= ruleOptionsAnswer EOF ;
    public final EObject entryRuleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionsAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1169:2: (iv_ruleOptionsAnswer= ruleOptionsAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1170:2: iv_ruleOptionsAnswer= ruleOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionsAnswer_in_entryRuleOptionsAnswer2787);
            iv_ruleOptionsAnswer=ruleOptionsAnswer();

            state._fsp--;

             current =iv_ruleOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionsAnswer2797); 

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
    // $ANTLR end "entryRuleOptionsAnswer"


    // $ANTLR start "ruleOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1177:1: ruleOptionsAnswer returns [EObject current=null] : (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer ) ;
    public final EObject ruleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SingleOptionsAnswer_0 = null;

        EObject this_ManyOptionsAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1180:28: ( (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1181:1: (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1181:1: (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=23 && LA22_0<=24)||(LA22_0>=26 && LA22_0<=27)) ) {
                alt22=1;
            }
            else if ( (LA22_0==28) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1182:5: this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionsAnswerAccess().getSingleOptionsAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleOptionsAnswer_in_ruleOptionsAnswer2844);
                    this_SingleOptionsAnswer_0=ruleSingleOptionsAnswer();

                    state._fsp--;

                     
                            current = this_SingleOptionsAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1192:5: this_ManyOptionsAnswer_1= ruleManyOptionsAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionsAnswerAccess().getManyOptionsAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleManyOptionsAnswer_in_ruleOptionsAnswer2871);
                    this_ManyOptionsAnswer_1=ruleManyOptionsAnswer();

                    state._fsp--;

                     
                            current = this_ManyOptionsAnswer_1; 
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
    // $ANTLR end "ruleOptionsAnswer"


    // $ANTLR start "entryRuleSingleOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1208:1: entryRuleSingleOptionsAnswer returns [EObject current=null] : iv_ruleSingleOptionsAnswer= ruleSingleOptionsAnswer EOF ;
    public final EObject entryRuleSingleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleOptionsAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1209:2: (iv_ruleSingleOptionsAnswer= ruleSingleOptionsAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1210:2: iv_ruleSingleOptionsAnswer= ruleSingleOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getSingleOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleOptionsAnswer_in_entryRuleSingleOptionsAnswer2906);
            iv_ruleSingleOptionsAnswer=ruleSingleOptionsAnswer();

            state._fsp--;

             current =iv_ruleSingleOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleOptionsAnswer2916); 

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
    // $ANTLR end "entryRuleSingleOptionsAnswer"


    // $ANTLR start "ruleSingleOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1217:1: ruleSingleOptionsAnswer returns [EObject current=null] : (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer ) ;
    public final EObject ruleSingleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SingleBoxOptionsAnswer_0 = null;

        EObject this_SingleListOptionsAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1220:28: ( (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1221:1: (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1221:1: (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            else if ( (LA23_0==24||(LA23_0>=26 && LA23_0<=27)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1222:5: this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getSingleOptionsAnswerAccess().getSingleBoxOptionsAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOptionsAnswer_in_ruleSingleOptionsAnswer2963);
                    this_SingleBoxOptionsAnswer_0=ruleSingleBoxOptionsAnswer();

                    state._fsp--;

                     
                            current = this_SingleBoxOptionsAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1232:5: this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getSingleOptionsAnswerAccess().getSingleListOptionsAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleListOptionsAnswer_in_ruleSingleOptionsAnswer2990);
                    this_SingleListOptionsAnswer_1=ruleSingleListOptionsAnswer();

                    state._fsp--;

                     
                            current = this_SingleListOptionsAnswer_1; 
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
    // $ANTLR end "ruleSingleOptionsAnswer"


    // $ANTLR start "entryRuleSingleBoxOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1248:1: entryRuleSingleBoxOptionsAnswer returns [EObject current=null] : iv_ruleSingleBoxOptionsAnswer= ruleSingleBoxOptionsAnswer EOF ;
    public final EObject entryRuleSingleBoxOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleBoxOptionsAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1249:2: (iv_ruleSingleBoxOptionsAnswer= ruleSingleBoxOptionsAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1250:2: iv_ruleSingleBoxOptionsAnswer= ruleSingleBoxOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getSingleBoxOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOptionsAnswer_in_entryRuleSingleBoxOptionsAnswer3025);
            iv_ruleSingleBoxOptionsAnswer=ruleSingleBoxOptionsAnswer();

            state._fsp--;

             current =iv_ruleSingleBoxOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleBoxOptionsAnswer3035); 

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
    // $ANTLR end "entryRuleSingleBoxOptionsAnswer"


    // $ANTLR start "ruleSingleBoxOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1257:1: ruleSingleBoxOptionsAnswer returns [EObject current=null] : ( (lv_options_0_0= ruleSingleBoxOption ) )+ ;
    public final EObject ruleSingleBoxOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1260:28: ( ( (lv_options_0_0= ruleSingleBoxOption ) )+ )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1261:1: ( (lv_options_0_0= ruleSingleBoxOption ) )+
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1261:1: ( (lv_options_0_0= ruleSingleBoxOption ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1262:1: (lv_options_0_0= ruleSingleBoxOption )
            	    {
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1262:1: (lv_options_0_0= ruleSingleBoxOption )
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1263:3: lv_options_0_0= ruleSingleBoxOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsSingleBoxOptionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOption_in_ruleSingleBoxOptionsAnswer3080);
            	    lv_options_0_0=ruleSingleBoxOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleBoxOptionsAnswerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_0_0, 
            	            		"SingleBoxOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


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
    // $ANTLR end "ruleSingleBoxOptionsAnswer"


    // $ANTLR start "entryRuleSingleBoxOption"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1287:1: entryRuleSingleBoxOption returns [EObject current=null] : iv_ruleSingleBoxOption= ruleSingleBoxOption EOF ;
    public final EObject entryRuleSingleBoxOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleBoxOption = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1288:2: (iv_ruleSingleBoxOption= ruleSingleBoxOption EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1289:2: iv_ruleSingleBoxOption= ruleSingleBoxOption EOF
            {
             newCompositeNode(grammarAccess.getSingleBoxOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOption_in_entryRuleSingleBoxOption3116);
            iv_ruleSingleBoxOption=ruleSingleBoxOption();

            state._fsp--;

             current =iv_ruleSingleBoxOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleBoxOption3126); 

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
    // $ANTLR end "entryRuleSingleBoxOption"


    // $ANTLR start "ruleSingleBoxOption"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1296:1: ruleSingleBoxOption returns [EObject current=null] : (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) ) ;
    public final EObject ruleSingleBoxOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_correct_1_0=null;
        Token otherlv_2=null;
        EObject lv_option_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1299:28: ( (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1300:1: (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1300:1: (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1300:3: otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSingleBoxOption3163); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleBoxOptionAccess().getLeftParenthesisKeyword_0());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1304:1: ( (lv_correct_1_0= 'x' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1305:1: (lv_correct_1_0= 'x' )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1305:1: (lv_correct_1_0= 'x' )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1306:3: lv_correct_1_0= 'x'
                    {
                    lv_correct_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingleBoxOption3181); 

                            newLeafNode(lv_correct_1_0, grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleBoxOptionRule());
                    	        }
                           		setWithLastConsumed(current, "correct", true, "x");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingleBoxOption3207); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleBoxOptionAccess().getRightParenthesisKeyword_2());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1323:1: ( (lv_option_3_0= ruleOptionAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1324:1: (lv_option_3_0= ruleOptionAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1324:1: (lv_option_3_0= ruleOptionAnswer )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1325:3: lv_option_3_0= ruleOptionAnswer
            {
             
            	        newCompositeNode(grammarAccess.getSingleBoxOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_ruleSingleBoxOption3228);
            lv_option_3_0=ruleOptionAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleBoxOptionRule());
            	        }
                   		set(
                   			current, 
                   			"option",
                    		lv_option_3_0, 
                    		"OptionAnswer");
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
    // $ANTLR end "ruleSingleBoxOption"


    // $ANTLR start "entryRuleSingleListOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1349:1: entryRuleSingleListOptionsAnswer returns [EObject current=null] : iv_ruleSingleListOptionsAnswer= ruleSingleListOptionsAnswer EOF ;
    public final EObject entryRuleSingleListOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleListOptionsAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1350:2: (iv_ruleSingleListOptionsAnswer= ruleSingleListOptionsAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1351:2: iv_ruleSingleListOptionsAnswer= ruleSingleListOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getSingleListOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleListOptionsAnswer_in_entryRuleSingleListOptionsAnswer3264);
            iv_ruleSingleListOptionsAnswer=ruleSingleListOptionsAnswer();

            state._fsp--;

             current =iv_ruleSingleListOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleListOptionsAnswer3274); 

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
    // $ANTLR end "entryRuleSingleListOptionsAnswer"


    // $ANTLR start "ruleSingleListOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1358:1: ruleSingleListOptionsAnswer returns [EObject current=null] : ( (lv_options_0_0= ruleSingleListOption ) )+ ;
    public final EObject ruleSingleListOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1361:28: ( ( (lv_options_0_0= ruleSingleListOption ) )+ )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1362:1: ( (lv_options_0_0= ruleSingleListOption ) )+
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1362:1: ( (lv_options_0_0= ruleSingleListOption ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==24||(LA26_0>=26 && LA26_0<=27)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1363:1: (lv_options_0_0= ruleSingleListOption )
            	    {
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1363:1: (lv_options_0_0= ruleSingleListOption )
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1364:3: lv_options_0_0= ruleSingleListOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsSingleListOptionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSingleListOption_in_ruleSingleListOptionsAnswer3319);
            	    lv_options_0_0=ruleSingleListOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleListOptionsAnswerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_0_0, 
            	            		"SingleListOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


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
    // $ANTLR end "ruleSingleListOptionsAnswer"


    // $ANTLR start "entryRuleSingleListOption"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1388:1: entryRuleSingleListOption returns [EObject current=null] : iv_ruleSingleListOption= ruleSingleListOption EOF ;
    public final EObject entryRuleSingleListOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleListOption = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1389:2: (iv_ruleSingleListOption= ruleSingleListOption EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1390:2: iv_ruleSingleListOption= ruleSingleListOption EOF
            {
             newCompositeNode(grammarAccess.getSingleListOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleListOption_in_entryRuleSingleListOption3355);
            iv_ruleSingleListOption=ruleSingleListOption();

            state._fsp--;

             current =iv_ruleSingleListOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleListOption3365); 

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
    // $ANTLR end "entryRuleSingleListOption"


    // $ANTLR start "ruleSingleListOption"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1397:1: ruleSingleListOption returns [EObject current=null] : ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) ) ;
    public final EObject ruleSingleListOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_correct_2_0=null;
        EObject lv_option_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1400:28: ( ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1401:1: ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1401:1: ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1401:2: ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1401:2: ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24||LA28_0==26) ) {
                alt28=1;
            }
            else if ( (LA28_0==27) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1401:3: (otherlv_0= '-' | otherlv_1= 'x' )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1401:3: (otherlv_0= '-' | otherlv_1= 'x' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==26) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==24) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1401:5: otherlv_0= '-'
                            {
                            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleListOption3404); 

                                	newLeafNode(otherlv_0, grammarAccess.getSingleListOptionAccess().getHyphenMinusKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1406:7: otherlv_1= 'x'
                            {
                            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingleListOption3422); 

                                	newLeafNode(otherlv_1, grammarAccess.getSingleListOptionAccess().getXKeyword_0_0_1());
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1411:6: ( (lv_correct_2_0= 'v' ) )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1411:6: ( (lv_correct_2_0= 'v' ) )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1412:1: (lv_correct_2_0= 'v' )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1412:1: (lv_correct_2_0= 'v' )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1413:3: lv_correct_2_0= 'v'
                    {
                    lv_correct_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSingleListOption3447); 

                            newLeafNode(lv_correct_2_0, grammarAccess.getSingleListOptionAccess().getCorrectVKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleListOptionRule());
                    	        }
                           		setWithLastConsumed(current, "correct", true, "v");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1426:3: ( (lv_option_3_0= ruleOptionAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1427:1: (lv_option_3_0= ruleOptionAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1427:1: (lv_option_3_0= ruleOptionAnswer )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1428:3: lv_option_3_0= ruleOptionAnswer
            {
             
            	        newCompositeNode(grammarAccess.getSingleListOptionAccess().getOptionOptionAnswerParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_ruleSingleListOption3482);
            lv_option_3_0=ruleOptionAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleListOptionRule());
            	        }
                   		set(
                   			current, 
                   			"option",
                    		lv_option_3_0, 
                    		"OptionAnswer");
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
    // $ANTLR end "ruleSingleListOption"


    // $ANTLR start "entryRuleManyOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1452:1: entryRuleManyOptionsAnswer returns [EObject current=null] : iv_ruleManyOptionsAnswer= ruleManyOptionsAnswer EOF ;
    public final EObject entryRuleManyOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyOptionsAnswer = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1453:2: (iv_ruleManyOptionsAnswer= ruleManyOptionsAnswer EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1454:2: iv_ruleManyOptionsAnswer= ruleManyOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getManyOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManyOptionsAnswer_in_entryRuleManyOptionsAnswer3518);
            iv_ruleManyOptionsAnswer=ruleManyOptionsAnswer();

            state._fsp--;

             current =iv_ruleManyOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManyOptionsAnswer3528); 

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
    // $ANTLR end "entryRuleManyOptionsAnswer"


    // $ANTLR start "ruleManyOptionsAnswer"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1461:1: ruleManyOptionsAnswer returns [EObject current=null] : ( (lv_options_0_0= ruleManyOption ) )+ ;
    public final EObject ruleManyOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1464:28: ( ( (lv_options_0_0= ruleManyOption ) )+ )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1465:1: ( (lv_options_0_0= ruleManyOption ) )+
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1465:1: ( (lv_options_0_0= ruleManyOption ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1466:1: (lv_options_0_0= ruleManyOption )
            	    {
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1466:1: (lv_options_0_0= ruleManyOption )
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1467:3: lv_options_0_0= ruleManyOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getManyOptionsAnswerAccess().getOptionsManyOptionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleManyOption_in_ruleManyOptionsAnswer3573);
            	    lv_options_0_0=ruleManyOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getManyOptionsAnswerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_0_0, 
            	            		"ManyOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


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
    // $ANTLR end "ruleManyOptionsAnswer"


    // $ANTLR start "entryRuleManyOption"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1491:1: entryRuleManyOption returns [EObject current=null] : iv_ruleManyOption= ruleManyOption EOF ;
    public final EObject entryRuleManyOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyOption = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1492:2: (iv_ruleManyOption= ruleManyOption EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1493:2: iv_ruleManyOption= ruleManyOption EOF
            {
             newCompositeNode(grammarAccess.getManyOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManyOption_in_entryRuleManyOption3609);
            iv_ruleManyOption=ruleManyOption();

            state._fsp--;

             current =iv_ruleManyOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManyOption3619); 

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
    // $ANTLR end "entryRuleManyOption"


    // $ANTLR start "ruleManyOption"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1500:1: ruleManyOption returns [EObject current=null] : (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) ) ;
    public final EObject ruleManyOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_correct_1_0=null;
        Token otherlv_2=null;
        EObject lv_option_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1503:28: ( (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1504:1: (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1504:1: (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1504:3: otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleManyOption3656); 

                	newLeafNode(otherlv_0, grammarAccess.getManyOptionAccess().getLeftSquareBracketKeyword_0());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1508:1: ( (lv_correct_1_0= 'x' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1509:1: (lv_correct_1_0= 'x' )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1509:1: (lv_correct_1_0= 'x' )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1510:3: lv_correct_1_0= 'x'
                    {
                    lv_correct_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleManyOption3674); 

                            newLeafNode(lv_correct_1_0, grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManyOptionRule());
                    	        }
                           		setWithLastConsumed(current, "correct", true, "x");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleManyOption3700); 

                	newLeafNode(otherlv_2, grammarAccess.getManyOptionAccess().getRightSquareBracketKeyword_2());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1527:1: ( (lv_option_3_0= ruleOptionAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1528:1: (lv_option_3_0= ruleOptionAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1528:1: (lv_option_3_0= ruleOptionAnswer )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1529:3: lv_option_3_0= ruleOptionAnswer
            {
             
            	        newCompositeNode(grammarAccess.getManyOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_ruleManyOption3721);
            lv_option_3_0=ruleOptionAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getManyOptionRule());
            	        }
                   		set(
                   			current, 
                   			"option",
                    		lv_option_3_0, 
                    		"OptionAnswer");
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
    // $ANTLR end "ruleManyOption"


    // $ANTLR start "entryRuleXml"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1553:1: entryRuleXml returns [EObject current=null] : iv_ruleXml= ruleXml EOF ;
    public final EObject entryRuleXml() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXml = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1554:2: (iv_ruleXml= ruleXml EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1555:2: iv_ruleXml= ruleXml EOF
            {
             newCompositeNode(grammarAccess.getXmlRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXml_in_entryRuleXml3757);
            iv_ruleXml=ruleXml();

            state._fsp--;

             current =iv_ruleXml; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXml3767); 

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
    // $ANTLR end "entryRuleXml"


    // $ANTLR start "ruleXml"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1562:1: ruleXml returns [EObject current=null] : (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' ) ;
    public final EObject ruleXml() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1565:28: ( (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1566:1: (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1566:1: (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1566:3: otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleXml3804); 

                	newLeafNode(otherlv_0, grammarAccess.getXmlAccess().getLessThanSignLessThanSignKeyword_0());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1570:1: ( (lv_element_1_0= ruleXmlElement ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1571:1: (lv_element_1_0= ruleXmlElement )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1571:1: (lv_element_1_0= ruleXmlElement )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1572:3: lv_element_1_0= ruleXmlElement
            {
             
            	        newCompositeNode(grammarAccess.getXmlAccess().getElementXmlElementParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleXmlElement_in_ruleXml3825);
            lv_element_1_0=ruleXmlElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXmlRule());
            	        }
                   		set(
                   			current, 
                   			"element",
                    		lv_element_1_0, 
                    		"XmlElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleXml3837); 

                	newLeafNode(otherlv_2, grammarAccess.getXmlAccess().getGreaterThanSignGreaterThanSignKeyword_2());
                

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
    // $ANTLR end "ruleXml"


    // $ANTLR start "entryRuleXmlContents"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1600:1: entryRuleXmlContents returns [EObject current=null] : iv_ruleXmlContents= ruleXmlContents EOF ;
    public final EObject entryRuleXmlContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlContents = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1601:2: (iv_ruleXmlContents= ruleXmlContents EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1602:2: iv_ruleXmlContents= ruleXmlContents EOF
            {
             newCompositeNode(grammarAccess.getXmlContentsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlContents_in_entryRuleXmlContents3873);
            iv_ruleXmlContents=ruleXmlContents();

            state._fsp--;

             current =iv_ruleXmlContents; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlContents3883); 

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
    // $ANTLR end "entryRuleXmlContents"


    // $ANTLR start "ruleXmlContents"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1609:1: ruleXmlContents returns [EObject current=null] : ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) ) ;
    public final EObject ruleXmlContents() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        EObject lv_element_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1612:28: ( ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1613:1: ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1613:1: ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1613:2: ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1613:2: ( (lv_element_0_0= ruleXmlElement ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1614:1: (lv_element_0_0= ruleXmlElement )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1614:1: (lv_element_0_0= ruleXmlElement )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1615:3: lv_element_0_0= ruleXmlElement
            {
             
            	        newCompositeNode(grammarAccess.getXmlContentsAccess().getElementXmlElementParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleXmlElement_in_ruleXmlContents3929);
            lv_element_0_0=ruleXmlElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXmlContentsRule());
            	        }
                   		set(
                   			current, 
                   			"element",
                    		lv_element_0_0, 
                    		"XmlElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1631:2: ( (lv_post_1_0= RULE_XML_TEXT ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1632:1: (lv_post_1_0= RULE_XML_TEXT )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1632:1: (lv_post_1_0= RULE_XML_TEXT )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1633:3: lv_post_1_0= RULE_XML_TEXT
            {
            lv_post_1_0=(Token)match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_RULE_XML_TEXT_in_ruleXmlContents3946); 

            			newLeafNode(lv_post_1_0, grammarAccess.getXmlContentsAccess().getPostXML_TEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXmlContentsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"post",
                    		lv_post_1_0, 
                    		"XML_TEXT");
            	    

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
    // $ANTLR end "ruleXmlContents"


    // $ANTLR start "entryRuleXmlElement"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1657:1: entryRuleXmlElement returns [EObject current=null] : iv_ruleXmlElement= ruleXmlElement EOF ;
    public final EObject entryRuleXmlElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlElement = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1658:2: (iv_ruleXmlElement= ruleXmlElement EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1659:2: iv_ruleXmlElement= ruleXmlElement EOF
            {
             newCompositeNode(grammarAccess.getXmlElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlElement_in_entryRuleXmlElement3987);
            iv_ruleXmlElement=ruleXmlElement();

            state._fsp--;

             current =iv_ruleXmlElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlElement3997); 

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
    // $ANTLR end "entryRuleXmlElement"


    // $ANTLR start "ruleXmlElement"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1666:1: ruleXmlElement returns [EObject current=null] : (this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement | this_XmlTagElement_1= ruleXmlTagElement ) ;
    public final EObject ruleXmlElement() throws RecognitionException {
        EObject current = null;

        EObject this_XmlPIAnswerElement_0 = null;

        EObject this_XmlTagElement_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1669:28: ( (this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement | this_XmlTagElement_1= ruleXmlTagElement ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1670:1: (this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement | this_XmlTagElement_1= ruleXmlTagElement )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1670:1: (this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement | this_XmlTagElement_1= ruleXmlTagElement )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1671:5: this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement
                    {
                     
                            newCompositeNode(grammarAccess.getXmlElementAccess().getXmlPIAnswerElementParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleXmlPIAnswerElement_in_ruleXmlElement4044);
                    this_XmlPIAnswerElement_0=ruleXmlPIAnswerElement();

                    state._fsp--;

                     
                            current = this_XmlPIAnswerElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1681:5: this_XmlTagElement_1= ruleXmlTagElement
                    {
                     
                            newCompositeNode(grammarAccess.getXmlElementAccess().getXmlTagElementParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleXmlTagElement_in_ruleXmlElement4071);
                    this_XmlTagElement_1=ruleXmlTagElement();

                    state._fsp--;

                     
                            current = this_XmlTagElement_1; 
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
    // $ANTLR end "ruleXmlElement"


    // $ANTLR start "entryRuleXmlPIAnswerElement"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1697:1: entryRuleXmlPIAnswerElement returns [EObject current=null] : iv_ruleXmlPIAnswerElement= ruleXmlPIAnswerElement EOF ;
    public final EObject entryRuleXmlPIAnswerElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlPIAnswerElement = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1698:2: (iv_ruleXmlPIAnswerElement= ruleXmlPIAnswerElement EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1699:2: iv_ruleXmlPIAnswerElement= ruleXmlPIAnswerElement EOF
            {
             newCompositeNode(grammarAccess.getXmlPIAnswerElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlPIAnswerElement_in_entryRuleXmlPIAnswerElement4106);
            iv_ruleXmlPIAnswerElement=ruleXmlPIAnswerElement();

            state._fsp--;

             current =iv_ruleXmlPIAnswerElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlPIAnswerElement4116); 

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
    // $ANTLR end "entryRuleXmlPIAnswerElement"


    // $ANTLR start "ruleXmlPIAnswerElement"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1706:1: ruleXmlPIAnswerElement returns [EObject current=null] : (otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?' ) ;
    public final EObject ruleXmlPIAnswerElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_answer_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1709:28: ( (otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?' ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1710:1: (otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?' )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1710:1: (otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?' )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1710:3: otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleXmlPIAnswerElement4153); 

                	newLeafNode(otherlv_0, grammarAccess.getXmlPIAnswerElementAccess().getQuestionMarkKeyword_0());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1714:1: ( (lv_answer_1_0= ruleSimpleAnswer ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1715:1: (lv_answer_1_0= ruleSimpleAnswer )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1715:1: (lv_answer_1_0= ruleSimpleAnswer )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1716:3: lv_answer_1_0= ruleSimpleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getXmlPIAnswerElementAccess().getAnswerSimpleAnswerParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnswer_in_ruleXmlPIAnswerElement4174);
            lv_answer_1_0=ruleSimpleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXmlPIAnswerElementRule());
            	        }
                   		set(
                   			current, 
                   			"answer",
                    		lv_answer_1_0, 
                    		"SimpleAnswer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleXmlPIAnswerElement4186); 

                	newLeafNode(otherlv_2, grammarAccess.getXmlPIAnswerElementAccess().getQuestionMarkKeyword_2());
                

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
    // $ANTLR end "ruleXmlPIAnswerElement"


    // $ANTLR start "entryRuleXmlTagElement"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1744:1: entryRuleXmlTagElement returns [EObject current=null] : iv_ruleXmlTagElement= ruleXmlTagElement EOF ;
    public final EObject entryRuleXmlTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlTagElement = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1745:2: (iv_ruleXmlTagElement= ruleXmlTagElement EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1746:2: iv_ruleXmlTagElement= ruleXmlTagElement EOF
            {
             newCompositeNode(grammarAccess.getXmlTagElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlTagElement_in_entryRuleXmlTagElement4222);
            iv_ruleXmlTagElement=ruleXmlTagElement();

            state._fsp--;

             current =iv_ruleXmlTagElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlTagElement4232); 

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
    // $ANTLR end "entryRuleXmlTagElement"


    // $ANTLR start "ruleXmlTagElement"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1753:1: ruleXmlTagElement returns [EObject current=null] : ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) ) ) ;
    public final EObject ruleXmlTagElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pre_2_0=null;
        Token otherlv_4=null;
        Token lv_endTag_5_0=null;
        EObject lv_startTag_0_0 = null;

        EObject lv_contents_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1756:28: ( ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1757:1: ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1757:1: ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1757:2: ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1757:2: ( (lv_startTag_0_0= ruleXmlTag ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1758:1: (lv_startTag_0_0= ruleXmlTag )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1758:1: (lv_startTag_0_0= ruleXmlTag )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1759:3: lv_startTag_0_0= ruleXmlTag
            {
             
            	        newCompositeNode(grammarAccess.getXmlTagElementAccess().getStartTagXmlTagParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleXmlTag_in_ruleXmlTagElement4278);
            lv_startTag_0_0=ruleXmlTag();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXmlTagElementRule());
            	        }
                   		set(
                   			current, 
                   			"startTag",
                    		lv_startTag_0_0, 
                    		"XmlTag");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1775:2: (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_XML_TEXT) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1775:4: otherlv_1= '/'
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleXmlTagElement4291); 

                        	newLeafNode(otherlv_1, grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1780:6: ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1780:6: ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1780:7: ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1780:7: ( (lv_pre_2_0= RULE_XML_TEXT ) )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1781:1: (lv_pre_2_0= RULE_XML_TEXT )
                    {
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1781:1: (lv_pre_2_0= RULE_XML_TEXT )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1782:3: lv_pre_2_0= RULE_XML_TEXT
                    {
                    lv_pre_2_0=(Token)match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_RULE_XML_TEXT_in_ruleXmlTagElement4315); 

                    			newLeafNode(lv_pre_2_0, grammarAccess.getXmlTagElementAccess().getPreXML_TEXTTerminalRuleCall_1_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXmlTagElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pre",
                            		lv_pre_2_0, 
                            		"XML_TEXT");
                    	    

                    }


                    }

                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1798:2: ( (lv_contents_3_0= ruleXmlContents ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_ID||LA32_0==32) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1799:1: (lv_contents_3_0= ruleXmlContents )
                    	    {
                    	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1799:1: (lv_contents_3_0= ruleXmlContents )
                    	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1800:3: lv_contents_3_0= ruleXmlContents
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXmlTagElementAccess().getContentsXmlContentsParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleXmlContents_in_ruleXmlTagElement4341);
                    	    lv_contents_3_0=ruleXmlContents();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getXmlTagElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contents",
                    	            		lv_contents_3_0, 
                    	            		"XmlContents");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1816:3: (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? )
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1816:5: otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )?
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleXmlTagElement4355); 

                        	newLeafNode(otherlv_4, grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_1_2_0());
                        
                    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1820:1: ( (lv_endTag_5_0= RULE_ID ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1821:1: (lv_endTag_5_0= RULE_ID )
                            {
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1821:1: (lv_endTag_5_0= RULE_ID )
                            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1822:3: lv_endTag_5_0= RULE_ID
                            {
                            lv_endTag_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleXmlTagElement4372); 

                            			newLeafNode(lv_endTag_5_0, grammarAccess.getXmlTagElementAccess().getEndTagIDTerminalRuleCall_1_1_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getXmlTagElementRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"endTag",
                                    		lv_endTag_5_0, 
                                    		"ID");
                            	    

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleXmlTagElement"


    // $ANTLR start "entryRuleXmlTag"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1846:1: entryRuleXmlTag returns [EObject current=null] : iv_ruleXmlTag= ruleXmlTag EOF ;
    public final EObject entryRuleXmlTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlTag = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1847:2: (iv_ruleXmlTag= ruleXmlTag EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1848:2: iv_ruleXmlTag= ruleXmlTag EOF
            {
             newCompositeNode(grammarAccess.getXmlTagRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlTag_in_entryRuleXmlTag4417);
            iv_ruleXmlTag=ruleXmlTag();

            state._fsp--;

             current =iv_ruleXmlTag; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlTag4427); 

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
    // $ANTLR end "entryRuleXmlTag"


    // $ANTLR start "ruleXmlTag"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1855:1: ruleXmlTag returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* ) ;
    public final EObject ruleXmlTag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_attributes_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1858:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1859:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1859:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1859:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )*
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1859:2: ( (lv_name_0_0= RULE_ID ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1860:1: (lv_name_0_0= RULE_ID )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1860:1: (lv_name_0_0= RULE_ID )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1861:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleXmlTag4469); 

            			newLeafNode(lv_name_0_0, grammarAccess.getXmlTagAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXmlTagRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1877:2: ( (lv_attributes_1_0= ruleXmlAttribute ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1878:1: (lv_attributes_1_0= ruleXmlAttribute )
            	    {
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1878:1: (lv_attributes_1_0= ruleXmlAttribute )
            	    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1879:3: lv_attributes_1_0= ruleXmlAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXmlTagAccess().getAttributesXmlAttributeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleXmlAttribute_in_ruleXmlTag4495);
            	    lv_attributes_1_0=ruleXmlAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXmlTagRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_1_0, 
            	            		"XmlAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleXmlTag"


    // $ANTLR start "entryRuleXmlAttribute"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1903:1: entryRuleXmlAttribute returns [EObject current=null] : iv_ruleXmlAttribute= ruleXmlAttribute EOF ;
    public final EObject entryRuleXmlAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlAttribute = null;


        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1904:2: (iv_ruleXmlAttribute= ruleXmlAttribute EOF )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1905:2: iv_ruleXmlAttribute= ruleXmlAttribute EOF
            {
             newCompositeNode(grammarAccess.getXmlAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlAttribute_in_entryRuleXmlAttribute4532);
            iv_ruleXmlAttribute=ruleXmlAttribute();

            state._fsp--;

             current =iv_ruleXmlAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlAttribute4542); 

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
    // $ANTLR end "entryRuleXmlAttribute"


    // $ANTLR start "ruleXmlAttribute"
    // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1912:1: ruleXmlAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXmlAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1915:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1916:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1916:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1916:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1916:2: ( (lv_name_0_0= RULE_ID ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1917:1: (lv_name_0_0= RULE_ID )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1917:1: (lv_name_0_0= RULE_ID )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1918:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleXmlAttribute4584); 

            			newLeafNode(lv_name_0_0, grammarAccess.getXmlAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXmlAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleXmlAttribute4601); 

                	newLeafNode(otherlv_1, grammarAccess.getXmlAttributeAccess().getEqualsSignKeyword_1());
                
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1938:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1939:1: (lv_value_2_0= RULE_STRING )
            {
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1939:1: (lv_value_2_0= RULE_STRING )
            // ../no.hal.quiz.xtext/src-gen/no/hal/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1940:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleXmlAttribute4618); 

            			newLeafNode(lv_value_2_0, grammarAccess.getXmlAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXmlAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
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
    // $ANTLR end "ruleXmlAttribute"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQuiz_in_entryRuleQuiz75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuiz85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleQuiz131 = new BitSet(new long[]{0x000000004000C032L});
        public static final BitSet FOLLOW_ruleQName_in_ruleQuiz154 = new BitSet(new long[]{0x0000000000004012L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuiz172 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleAbstractQuizPart_in_ruleQuiz199 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleAnonymousQuizPart_in_ruleQuiz228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_entryRuleQName266 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQName277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQName317 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleQName336 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQName351 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleAbstractQuizPart_in_entryRuleAbstractQuizPart398 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractQuizPart408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuizPart_in_ruleAbstractQuizPart455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuizPartRef_in_ruleAbstractQuizPart482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuizPart_in_entryRuleQuizPart517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuizPart527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleQuizPart564 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQuizPart581 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuizPart603 = new BitSet(new long[]{0x0000000040008032L});
        public static final BitSet FOLLOW_ruleAbstractQA_in_ruleQuizPart629 = new BitSet(new long[]{0x0000000040008032L});
        public static final BitSet FOLLOW_ruleQuizPartRef_in_entryRuleQuizPartRef666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuizPartRef676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleQuizPartRef713 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleQuizPartRef725 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQName_in_ruleQuizPartRef748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonymousQuizPart_in_entryRuleAnonymousQuizPart784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousQuizPart794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractQA_in_ruleAnonymousQuizPart849 = new BitSet(new long[]{0x0000000040008032L});
        public static final BitSet FOLLOW_ruleAbstractQA_in_entryRuleAbstractQA886 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractQA896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQA_in_ruleAbstractQA943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQARef_in_ruleAbstractQA970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQARef_in_entryRuleQARef1005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQARef1015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleQARef1052 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQName_in_ruleQARef1075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQA_in_entryRuleQA1111 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQA1121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQA1163 = new BitSet(new long[]{0x0000000040000030L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQA1190 = new BitSet(new long[]{0x000000005DFA0070L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQA1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion1247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringQuestion_in_ruleQuestion1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlQuestion_in_ruleQuestion1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringQuestion_in_entryRuleStringQuestion1366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringQuestion1376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringQuestion1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlQuestion_in_entryRuleXmlQuestion1457 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlQuestion1467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXml_in_ruleXmlQuestion1512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_ruleAnswer1604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionsAnswer_in_ruleAnswer1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer1666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionAnswer1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnswer_in_ruleOptionAnswer1723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlAnswer_in_ruleOptionAnswer1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer1785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAnswer1795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnswer_in_ruleSimpleAnswer1842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegexAnswer_in_ruleSimpleAnswer1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_ruleSimpleAnswer1896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanAnswer_in_ruleSimpleAnswer1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnswer_in_entryRuleStringAnswer1958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringAnswer1968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringAnswer2010 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleStringAnswer2033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegexAnswer_in_entryRuleRegexAnswer2083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegexAnswer2093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleRegexAnswer2136 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRegexAnswer2166 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRegexAnswer2183 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleRegexAnswer2201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer2251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberAnswer2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDoubleObject_in_ruleNumberAnswer2307 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleNumberAnswer2320 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEDoubleObject_in_ruleNumberAnswer2341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDoubleObject_in_entryRuleEDoubleObject2380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDoubleObject2391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDoubleObject2431 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleEDoubleObject2450 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDoubleObject2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanAnswer_in_entryRuleBooleanAnswer2512 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAnswer2522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleBooleanAnswer2577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleBooleanAnswer2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleBooleanAnswer2641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleBooleanAnswer2659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlAnswer_in_entryRuleXmlAnswer2697 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlAnswer2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXml_in_ruleXmlAnswer2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionsAnswer_in_entryRuleOptionsAnswer2787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionsAnswer2797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleOptionsAnswer_in_ruleOptionsAnswer2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyOptionsAnswer_in_ruleOptionsAnswer2871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleOptionsAnswer_in_entryRuleSingleOptionsAnswer2906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleOptionsAnswer2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOptionsAnswer_in_ruleSingleOptionsAnswer2963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleListOptionsAnswer_in_ruleSingleOptionsAnswer2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOptionsAnswer_in_entryRuleSingleBoxOptionsAnswer3025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleBoxOptionsAnswer3035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOption_in_ruleSingleBoxOptionsAnswer3080 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleSingleBoxOption_in_entryRuleSingleBoxOption3116 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleBoxOption3126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleSingleBoxOption3163 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleSingleBoxOption3181 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleSingleBoxOption3207 = new BitSet(new long[]{0x00000000407A0070L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_ruleSingleBoxOption3228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleListOptionsAnswer_in_entryRuleSingleListOptionsAnswer3264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleListOptionsAnswer3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleListOption_in_ruleSingleListOptionsAnswer3319 = new BitSet(new long[]{0x000000000D800002L});
        public static final BitSet FOLLOW_ruleSingleListOption_in_entryRuleSingleListOption3355 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleListOption3365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleSingleListOption3404 = new BitSet(new long[]{0x00000000407A0070L});
        public static final BitSet FOLLOW_24_in_ruleSingleListOption3422 = new BitSet(new long[]{0x00000000407A0070L});
        public static final BitSet FOLLOW_27_in_ruleSingleListOption3447 = new BitSet(new long[]{0x00000000407A0070L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_ruleSingleListOption3482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyOptionsAnswer_in_entryRuleManyOptionsAnswer3518 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManyOptionsAnswer3528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyOption_in_ruleManyOptionsAnswer3573 = new BitSet(new long[]{0x000000005DFA0072L});
        public static final BitSet FOLLOW_ruleManyOption_in_entryRuleManyOption3609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManyOption3619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleManyOption3656 = new BitSet(new long[]{0x0000000021000000L});
        public static final BitSet FOLLOW_24_in_ruleManyOption3674 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleManyOption3700 = new BitSet(new long[]{0x00000000407A0070L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_ruleManyOption3721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXml_in_entryRuleXml3757 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXml3767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleXml3804 = new BitSet(new long[]{0x0000000100000020L});
        public static final BitSet FOLLOW_ruleXmlElement_in_ruleXml3825 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleXml3837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlContents_in_entryRuleXmlContents3873 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlContents3883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlElement_in_ruleXmlContents3929 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_XML_TEXT_in_ruleXmlContents3946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlElement_in_entryRuleXmlElement3987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlElement3997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlPIAnswerElement_in_ruleXmlElement4044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTagElement_in_ruleXmlElement4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlPIAnswerElement_in_entryRuleXmlPIAnswerElement4106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlPIAnswerElement4116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleXmlPIAnswerElement4153 = new BitSet(new long[]{0x00000000007A0050L});
        public static final BitSet FOLLOW_ruleSimpleAnswer_in_ruleXmlPIAnswerElement4174 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleXmlPIAnswerElement4186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTagElement_in_entryRuleXmlTagElement4222 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlTagElement4232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTag_in_ruleXmlTagElement4278 = new BitSet(new long[]{0x0000000000020080L});
        public static final BitSet FOLLOW_17_in_ruleXmlTagElement4291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_XML_TEXT_in_ruleXmlTagElement4315 = new BitSet(new long[]{0x0000000100020020L});
        public static final BitSet FOLLOW_ruleXmlContents_in_ruleXmlTagElement4341 = new BitSet(new long[]{0x0000000100020020L});
        public static final BitSet FOLLOW_17_in_ruleXmlTagElement4355 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleXmlTagElement4372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTag_in_entryRuleXmlTag4417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlTag4427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleXmlTag4469 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_ruleXmlAttribute_in_ruleXmlTag4495 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_ruleXmlAttribute_in_entryRuleXmlAttribute4532 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlAttribute4542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleXmlAttribute4584 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleXmlAttribute4601 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleXmlAttribute4618 = new BitSet(new long[]{0x0000000000000002L});
    }


}