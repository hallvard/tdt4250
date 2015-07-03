package no.hal.pg.quiz.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.hal.pg.quiz.xtext.services.XQuizGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXQuizParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_XML_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'quiz'", "'.'", "'part'", "'ref'", "'~'", "'/'", "'yes'", "'true'", "'no'", "'false'", "'('", "'x'", "')'", "'-'", "'v'", "'['", "']'", "'<<'", "'>>'", "'?'", "'='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public String getGrammarFileName() { return "../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g"; }



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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:67:1: entryRuleQuiz returns [EObject current=null] : iv_ruleQuiz= ruleQuiz EOF ;
    public final EObject entryRuleQuiz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuiz = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:68:2: (iv_ruleQuiz= ruleQuiz EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:69:2: iv_ruleQuiz= ruleQuiz EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:76:1: ruleQuiz returns [EObject current=null] : ( () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) ) ) ;
    public final EObject ruleQuiz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parts_4_0 = null;

        EObject lv_parts_5_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:79:28: ( ( () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:80:1: ( () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:80:1: ( () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:80:2: () otherlv_1= 'quiz' ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:80:2: ()
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuizAccess().getQuizAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuiz131); 

                	newLeafNode(otherlv_1, grammarAccess.getQuizAccess().getQuizKeyword_1());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:1: ( ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* ) | ( (lv_parts_5_0= ruleAnonymousQuizPart ) ) )
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
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 25:
                    case 26:
                    case 27:
                    case 29:
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
                case 29:
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
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 25:
                case 26:
                case 27:
                case 29:
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
            case 29:
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:2: ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:2: ( ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )* )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:3: ( (lv_name_2_0= ruleQName ) )? ( (lv_title_3_0= RULE_STRING ) )? ( (lv_parts_4_0= ruleAbstractQuizPart ) )*
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:90:3: ( (lv_name_2_0= ruleQName ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ID) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:91:1: (lv_name_2_0= ruleQName )
                            {
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:91:1: (lv_name_2_0= ruleQName )
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:92:3: lv_name_2_0= ruleQName
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

                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:108:3: ( (lv_title_3_0= RULE_STRING ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_STRING) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:109:1: (lv_title_3_0= RULE_STRING )
                            {
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:109:1: (lv_title_3_0= RULE_STRING )
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:110:3: lv_title_3_0= RULE_STRING
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

                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:126:3: ( (lv_parts_4_0= ruleAbstractQuizPart ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:127:1: (lv_parts_4_0= ruleAbstractQuizPart )
                    	    {
                    	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:127:1: (lv_parts_4_0= ruleAbstractQuizPart )
                    	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:128:3: lv_parts_4_0= ruleAbstractQuizPart
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:145:6: ( (lv_parts_5_0= ruleAnonymousQuizPart ) )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:145:6: ( (lv_parts_5_0= ruleAnonymousQuizPart ) )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:146:1: (lv_parts_5_0= ruleAnonymousQuizPart )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:146:1: (lv_parts_5_0= ruleAnonymousQuizPart )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:147:3: lv_parts_5_0= ruleAnonymousQuizPart
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:171:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:172:2: (iv_ruleQName= ruleQName EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:173:2: iv_ruleQName= ruleQName EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:180:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:183:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:184:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:184:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:184:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQName317); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:191:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:192:2: kw= '.' this_ID_2= RULE_ID
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:212:1: entryRuleAbstractQuizPart returns [EObject current=null] : iv_ruleAbstractQuizPart= ruleAbstractQuizPart EOF ;
    public final EObject entryRuleAbstractQuizPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractQuizPart = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:213:2: (iv_ruleAbstractQuizPart= ruleAbstractQuizPart EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:214:2: iv_ruleAbstractQuizPart= ruleAbstractQuizPart EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:221:1: ruleAbstractQuizPart returns [EObject current=null] : (this_QuizPart_0= ruleQuizPart | this_QuizPartRef_1= ruleQuizPartRef ) ;
    public final EObject ruleAbstractQuizPart() throws RecognitionException {
        EObject current = null;

        EObject this_QuizPart_0 = null;

        EObject this_QuizPartRef_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:224:28: ( (this_QuizPart_0= ruleQuizPart | this_QuizPartRef_1= ruleQuizPartRef ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:225:1: (this_QuizPart_0= ruleQuizPart | this_QuizPartRef_1= ruleQuizPartRef )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:225:1: (this_QuizPart_0= ruleQuizPart | this_QuizPartRef_1= ruleQuizPartRef )
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:226:5: this_QuizPart_0= ruleQuizPart
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:236:5: this_QuizPartRef_1= ruleQuizPartRef
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:252:1: entryRuleQuizPart returns [EObject current=null] : iv_ruleQuizPart= ruleQuizPart EOF ;
    public final EObject entryRuleQuizPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuizPart = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:253:2: (iv_ruleQuizPart= ruleQuizPart EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:254:2: iv_ruleQuizPart= ruleQuizPart EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:261:1: ruleQuizPart returns [EObject current=null] : (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )* ) ;
    public final EObject ruleQuizPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:264:28: ( (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )* ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:265:1: (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )* )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:265:1: (otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )* )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:265:3: otherlv_0= 'part' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_questions_3_0= ruleAbstractQA ) )*
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuizPart564); 

                	newLeafNode(otherlv_0, grammarAccess.getQuizPartAccess().getPartKeyword_0());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:269:1: ( (lv_name_1_0= RULE_ID ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:270:1: (lv_name_1_0= RULE_ID )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:270:1: (lv_name_1_0= RULE_ID )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:271:3: lv_name_1_0= RULE_ID
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

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:287:2: ( (lv_title_2_0= RULE_STRING ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:288:1: (lv_title_2_0= RULE_STRING )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:288:1: (lv_title_2_0= RULE_STRING )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:289:3: lv_title_2_0= RULE_STRING
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

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:305:2: ( (lv_questions_3_0= ruleAbstractQA ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==15||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:306:1: (lv_questions_3_0= ruleAbstractQA )
            	    {
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:306:1: (lv_questions_3_0= ruleAbstractQA )
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:307:3: lv_questions_3_0= ruleAbstractQA
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:331:1: entryRuleQuizPartRef returns [EObject current=null] : iv_ruleQuizPartRef= ruleQuizPartRef EOF ;
    public final EObject entryRuleQuizPartRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuizPartRef = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:332:2: (iv_ruleQuizPartRef= ruleQuizPartRef EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:333:2: iv_ruleQuizPartRef= ruleQuizPartRef EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:340:1: ruleQuizPartRef returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) ) ;
    public final EObject ruleQuizPartRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:343:28: ( (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:344:1: (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:344:1: (otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:344:3: otherlv_0= 'part' otherlv_1= 'ref' ( ( ruleQName ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuizPartRef713); 

                	newLeafNode(otherlv_0, grammarAccess.getQuizPartRefAccess().getPartKeyword_0());
                
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuizPartRef725); 

                	newLeafNode(otherlv_1, grammarAccess.getQuizPartRefAccess().getRefKeyword_1());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:352:1: ( ( ruleQName ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:353:1: ( ruleQName )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:353:1: ( ruleQName )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:354:3: ruleQName
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:375:1: entryRuleAnonymousQuizPart returns [EObject current=null] : iv_ruleAnonymousQuizPart= ruleAnonymousQuizPart EOF ;
    public final EObject entryRuleAnonymousQuizPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousQuizPart = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:376:2: (iv_ruleAnonymousQuizPart= ruleAnonymousQuizPart EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:377:2: iv_ruleAnonymousQuizPart= ruleAnonymousQuizPart EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:384:1: ruleAnonymousQuizPart returns [EObject current=null] : ( () ( (lv_questions_1_0= ruleAbstractQA ) )* ) ;
    public final EObject ruleAnonymousQuizPart() throws RecognitionException {
        EObject current = null;

        EObject lv_questions_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:387:28: ( ( () ( (lv_questions_1_0= ruleAbstractQA ) )* ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:388:1: ( () ( (lv_questions_1_0= ruleAbstractQA ) )* )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:388:1: ( () ( (lv_questions_1_0= ruleAbstractQA ) )* )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:388:2: () ( (lv_questions_1_0= ruleAbstractQA ) )*
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:388:2: ()
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:389:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnonymousQuizPartAccess().getQuizPartAction_0(),
                        current);
                

            }

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:394:2: ( (lv_questions_1_0= ruleAbstractQA ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==15||LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:395:1: (lv_questions_1_0= ruleAbstractQA )
            	    {
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:395:1: (lv_questions_1_0= ruleAbstractQA )
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:396:3: lv_questions_1_0= ruleAbstractQA
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:420:1: entryRuleAbstractQA returns [EObject current=null] : iv_ruleAbstractQA= ruleAbstractQA EOF ;
    public final EObject entryRuleAbstractQA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractQA = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:421:2: (iv_ruleAbstractQA= ruleAbstractQA EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:422:2: iv_ruleAbstractQA= ruleAbstractQA EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:429:1: ruleAbstractQA returns [EObject current=null] : (this_QA_0= ruleQA | this_QARef_1= ruleQARef ) ;
    public final EObject ruleAbstractQA() throws RecognitionException {
        EObject current = null;

        EObject this_QA_0 = null;

        EObject this_QARef_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:432:28: ( (this_QA_0= ruleQA | this_QARef_1= ruleQARef ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:433:1: (this_QA_0= ruleQA | this_QARef_1= ruleQARef )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:433:1: (this_QA_0= ruleQA | this_QARef_1= ruleQARef )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==29) ) {
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:434:5: this_QA_0= ruleQA
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:444:5: this_QARef_1= ruleQARef
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:460:1: entryRuleQARef returns [EObject current=null] : iv_ruleQARef= ruleQARef EOF ;
    public final EObject entryRuleQARef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQARef = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:461:2: (iv_ruleQARef= ruleQARef EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:462:2: iv_ruleQARef= ruleQARef EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:469:1: ruleQARef returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQName ) ) ) ;
    public final EObject ruleQARef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:472:28: ( (otherlv_0= 'ref' ( ( ruleQName ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:473:1: (otherlv_0= 'ref' ( ( ruleQName ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:473:1: (otherlv_0= 'ref' ( ( ruleQName ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:473:3: otherlv_0= 'ref' ( ( ruleQName ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQARef1052); 

                	newLeafNode(otherlv_0, grammarAccess.getQARefAccess().getRefKeyword_0());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:477:1: ( ( ruleQName ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:478:1: ( ruleQName )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:478:1: ( ruleQName )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:479:3: ruleQName
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:500:1: entryRuleQA returns [EObject current=null] : iv_ruleQA= ruleQA EOF ;
    public final EObject entryRuleQA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQA = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:501:2: (iv_ruleQA= ruleQA EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:502:2: iv_ruleQA= ruleQA EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:509:1: ruleQA returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) ) ;
    public final EObject ruleQA() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_q_1_0 = null;

        EObject lv_a_2_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:512:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:513:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:513:1: ( ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:513:2: ( (lv_name_0_0= RULE_ID ) )? ( (lv_q_1_0= ruleQuestion ) ) ( (lv_a_2_0= ruleAnswer ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:513:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:514:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:514:1: (lv_name_0_0= RULE_ID )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:515:3: lv_name_0_0= RULE_ID
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

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:531:3: ( (lv_q_1_0= ruleQuestion ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:532:1: (lv_q_1_0= ruleQuestion )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:532:1: (lv_q_1_0= ruleQuestion )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:533:3: lv_q_1_0= ruleQuestion
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

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:549:2: ( (lv_a_2_0= ruleAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:550:1: (lv_a_2_0= ruleAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:550:1: (lv_a_2_0= ruleAnswer )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:551:3: lv_a_2_0= ruleAnswer
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:575:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:576:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:577:2: iv_ruleQuestion= ruleQuestion EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:584:1: ruleQuestion returns [EObject current=null] : (this_StringQuestion_0= ruleStringQuestion | this_XmlQuestion_1= ruleXmlQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_StringQuestion_0 = null;

        EObject this_XmlQuestion_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:587:28: ( (this_StringQuestion_0= ruleStringQuestion | this_XmlQuestion_1= ruleXmlQuestion ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:588:1: (this_StringQuestion_0= ruleStringQuestion | this_XmlQuestion_1= ruleXmlQuestion )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:588:1: (this_StringQuestion_0= ruleStringQuestion | this_XmlQuestion_1= ruleXmlQuestion )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:589:5: this_StringQuestion_0= ruleStringQuestion
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:599:5: this_XmlQuestion_1= ruleXmlQuestion
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:615:1: entryRuleStringQuestion returns [EObject current=null] : iv_ruleStringQuestion= ruleStringQuestion EOF ;
    public final EObject entryRuleStringQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringQuestion = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:616:2: (iv_ruleStringQuestion= ruleStringQuestion EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:617:2: iv_ruleStringQuestion= ruleStringQuestion EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:624:1: ruleStringQuestion returns [EObject current=null] : ( (lv_question_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_question_0_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:627:28: ( ( (lv_question_0_0= RULE_STRING ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:628:1: ( (lv_question_0_0= RULE_STRING ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:628:1: ( (lv_question_0_0= RULE_STRING ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:629:1: (lv_question_0_0= RULE_STRING )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:629:1: (lv_question_0_0= RULE_STRING )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:630:3: lv_question_0_0= RULE_STRING
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:654:1: entryRuleXmlQuestion returns [EObject current=null] : iv_ruleXmlQuestion= ruleXmlQuestion EOF ;
    public final EObject entryRuleXmlQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlQuestion = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:655:2: (iv_ruleXmlQuestion= ruleXmlQuestion EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:656:2: iv_ruleXmlQuestion= ruleXmlQuestion EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:663:1: ruleXmlQuestion returns [EObject current=null] : ( (lv_xml_0_0= ruleXml ) ) ;
    public final EObject ruleXmlQuestion() throws RecognitionException {
        EObject current = null;

        EObject lv_xml_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:666:28: ( ( (lv_xml_0_0= ruleXml ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:667:1: ( (lv_xml_0_0= ruleXml ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:667:1: ( (lv_xml_0_0= ruleXml ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:668:1: (lv_xml_0_0= ruleXml )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:668:1: (lv_xml_0_0= ruleXml )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:669:3: lv_xml_0_0= ruleXml
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:693:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:694:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:695:2: iv_ruleAnswer= ruleAnswer EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:702:1: ruleAnswer returns [EObject current=null] : (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_OptionAnswer_0 = null;

        EObject this_OptionsAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:705:28: ( (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:706:1: (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:706:1: (this_OptionAnswer_0= ruleOptionAnswer | this_OptionsAnswer_1= ruleOptionsAnswer )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING||LA12_0==RULE_INT||(LA12_0>=17 && LA12_0<=21)||LA12_0==29) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=22 && LA12_0<=23)||(LA12_0>=25 && LA12_0<=27)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:707:5: this_OptionAnswer_0= ruleOptionAnswer
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:717:5: this_OptionsAnswer_1= ruleOptionsAnswer
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:733:1: entryRuleOptionAnswer returns [EObject current=null] : iv_ruleOptionAnswer= ruleOptionAnswer EOF ;
    public final EObject entryRuleOptionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:734:2: (iv_ruleOptionAnswer= ruleOptionAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:735:2: iv_ruleOptionAnswer= ruleOptionAnswer EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:742:1: ruleOptionAnswer returns [EObject current=null] : (this_SimpleAnswer_0= ruleSimpleAnswer | this_XmlAnswer_1= ruleXmlAnswer ) ;
    public final EObject ruleOptionAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAnswer_0 = null;

        EObject this_XmlAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:745:28: ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_XmlAnswer_1= ruleXmlAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:746:1: (this_SimpleAnswer_0= ruleSimpleAnswer | this_XmlAnswer_1= ruleXmlAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:746:1: (this_SimpleAnswer_0= ruleSimpleAnswer | this_XmlAnswer_1= ruleXmlAnswer )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING||LA13_0==RULE_INT||(LA13_0>=17 && LA13_0<=21)) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:747:5: this_SimpleAnswer_0= ruleSimpleAnswer
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:757:5: this_XmlAnswer_1= ruleXmlAnswer
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:773:1: entryRuleSimpleAnswer returns [EObject current=null] : iv_ruleSimpleAnswer= ruleSimpleAnswer EOF ;
    public final EObject entryRuleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:774:2: (iv_ruleSimpleAnswer= ruleSimpleAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:775:2: iv_ruleSimpleAnswer= ruleSimpleAnswer EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:782:1: ruleSimpleAnswer returns [EObject current=null] : (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer ) ;
    public final EObject ruleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_StringAnswer_0 = null;

        EObject this_RegexAnswer_1 = null;

        EObject this_NumberAnswer_2 = null;

        EObject this_BooleanAnswer_3 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:785:28: ( (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:786:1: (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:786:1: (this_StringAnswer_0= ruleStringAnswer | this_RegexAnswer_1= ruleRegexAnswer | this_NumberAnswer_2= ruleNumberAnswer | this_BooleanAnswer_3= ruleBooleanAnswer )
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
            case 18:
            case 19:
            case 20:
            case 21:
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:787:5: this_StringAnswer_0= ruleStringAnswer
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:797:5: this_RegexAnswer_1= ruleRegexAnswer
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:807:5: this_NumberAnswer_2= ruleNumberAnswer
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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:817:5: this_BooleanAnswer_3= ruleBooleanAnswer
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:833:1: entryRuleStringAnswer returns [EObject current=null] : iv_ruleStringAnswer= ruleStringAnswer EOF ;
    public final EObject entryRuleStringAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:834:2: (iv_ruleStringAnswer= ruleStringAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:835:2: iv_ruleStringAnswer= ruleStringAnswer EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:842:1: ruleStringAnswer returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? ) ;
    public final EObject ruleStringAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_ignoreCase_1_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:845:28: ( ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:846:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:846:1: ( ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )? )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:846:2: ( (lv_value_0_0= RULE_STRING ) ) ( (lv_ignoreCase_1_0= '~' ) )?
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:846:2: ( (lv_value_0_0= RULE_STRING ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:847:1: (lv_value_0_0= RULE_STRING )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:847:1: (lv_value_0_0= RULE_STRING )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:848:3: lv_value_0_0= RULE_STRING
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

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:864:2: ( (lv_ignoreCase_1_0= '~' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:865:1: (lv_ignoreCase_1_0= '~' )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:865:1: (lv_ignoreCase_1_0= '~' )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:866:3: lv_ignoreCase_1_0= '~'
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:887:1: entryRuleRegexAnswer returns [EObject current=null] : iv_ruleRegexAnswer= ruleRegexAnswer EOF ;
    public final EObject entryRuleRegexAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:888:2: (iv_ruleRegexAnswer= ruleRegexAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:889:2: iv_ruleRegexAnswer= ruleRegexAnswer EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:896:1: ruleRegexAnswer returns [EObject current=null] : ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? ) ;
    public final EObject ruleRegexAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_regexp_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_ignoreCase_3_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:899:28: ( ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:900:1: ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:900:1: ( ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )? )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:900:2: ( (lv_regexp_0_0= '/' ) ) ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '/' ( (lv_ignoreCase_3_0= '~' ) )?
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:900:2: ( (lv_regexp_0_0= '/' ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:901:1: (lv_regexp_0_0= '/' )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:901:1: (lv_regexp_0_0= '/' )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:902:3: lv_regexp_0_0= '/'
            {
            lv_regexp_0_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRegexAnswer2136); 

                    newLeafNode(lv_regexp_0_0, grammarAccess.getRegexAnswerAccess().getRegexpSolidusKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegexAnswerRule());
            	        }
                   		setWithLastConsumed(current, "regexp", true, "/");
            	    

            }


            }

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:915:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:916:1: (lv_value_1_0= RULE_STRING )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:916:1: (lv_value_1_0= RULE_STRING )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:917:3: lv_value_1_0= RULE_STRING
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
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:937:1: ( (lv_ignoreCase_3_0= '~' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:938:1: (lv_ignoreCase_3_0= '~' )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:938:1: (lv_ignoreCase_3_0= '~' )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:939:3: lv_ignoreCase_3_0= '~'
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:960:1: entryRuleNumberAnswer returns [EObject current=null] : iv_ruleNumberAnswer= ruleNumberAnswer EOF ;
    public final EObject entryRuleNumberAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:961:2: (iv_ruleNumberAnswer= ruleNumberAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:962:2: iv_ruleNumberAnswer= ruleNumberAnswer EOF
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:969:1: ruleNumberAnswer returns [EObject current=null] : ( (lv_value_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleNumberAnswer() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:972:28: ( ( (lv_value_0_0= ruleEDoubleObject ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:973:1: ( (lv_value_0_0= ruleEDoubleObject ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:973:1: ( (lv_value_0_0= ruleEDoubleObject ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:974:1: (lv_value_0_0= ruleEDoubleObject )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:974:1: (lv_value_0_0= ruleEDoubleObject )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:975:3: lv_value_0_0= ruleEDoubleObject
            {
             
            	        newCompositeNode(grammarAccess.getNumberAnswerAccess().getValueEDoubleObjectParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDoubleObject_in_ruleNumberAnswer2306);
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:999:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1000:2: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1001:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
             newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDoubleObject_in_entryRuleEDoubleObject2342);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;

             current =iv_ruleEDoubleObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDoubleObject2353); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1008:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1011:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1012:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1012:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1012:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDoubleObject2393); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_0()); 
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1019:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1020:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEDoubleObject2412); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDoubleObject2427); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1040:1: entryRuleBooleanAnswer returns [EObject current=null] : iv_ruleBooleanAnswer= ruleBooleanAnswer EOF ;
    public final EObject entryRuleBooleanAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1041:2: (iv_ruleBooleanAnswer= ruleBooleanAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1042:2: iv_ruleBooleanAnswer= ruleBooleanAnswer EOF
            {
             newCompositeNode(grammarAccess.getBooleanAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanAnswer_in_entryRuleBooleanAnswer2474);
            iv_ruleBooleanAnswer=ruleBooleanAnswer();

            state._fsp--;

             current =iv_ruleBooleanAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanAnswer2484); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1049:1: ruleBooleanAnswer returns [EObject current=null] : ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) ) ;
    public final EObject ruleBooleanAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1052:28: ( ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1053:1: ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1053:1: ( () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1053:2: () ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1053:2: ()
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1054:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanAnswerAccess().getBooleanAnswerAction_0(),
                        current);
                

            }

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1059:2: ( ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) ) | (otherlv_2= 'no' | otherlv_3= 'false' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=18 && LA20_0<=19)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=20 && LA20_0<=21)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1059:3: ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1059:3: ( ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) ) )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1060:1: ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1060:1: ( (lv_value_1_1= 'yes' | lv_value_1_2= 'true' ) )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1061:1: (lv_value_1_1= 'yes' | lv_value_1_2= 'true' )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1061:1: (lv_value_1_1= 'yes' | lv_value_1_2= 'true' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==18) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==19) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1062:3: lv_value_1_1= 'yes'
                            {
                            lv_value_1_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBooleanAnswer2539); 

                                    newLeafNode(lv_value_1_1, grammarAccess.getBooleanAnswerAccess().getValueYesKeyword_1_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBooleanAnswerRule());
                            	        }
                                   		setWithLastConsumed(current, "value", true, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1074:8: lv_value_1_2= 'true'
                            {
                            lv_value_1_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBooleanAnswer2568); 

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
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1090:6: (otherlv_2= 'no' | otherlv_3= 'false' )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1090:6: (otherlv_2= 'no' | otherlv_3= 'false' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==20) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==21) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1090:8: otherlv_2= 'no'
                            {
                            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBooleanAnswer2603); 

                                	newLeafNode(otherlv_2, grammarAccess.getBooleanAnswerAccess().getNoKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1095:7: otherlv_3= 'false'
                            {
                            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBooleanAnswer2621); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1107:1: entryRuleXmlAnswer returns [EObject current=null] : iv_ruleXmlAnswer= ruleXmlAnswer EOF ;
    public final EObject entryRuleXmlAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1108:2: (iv_ruleXmlAnswer= ruleXmlAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1109:2: iv_ruleXmlAnswer= ruleXmlAnswer EOF
            {
             newCompositeNode(grammarAccess.getXmlAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlAnswer_in_entryRuleXmlAnswer2659);
            iv_ruleXmlAnswer=ruleXmlAnswer();

            state._fsp--;

             current =iv_ruleXmlAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlAnswer2669); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1116:1: ruleXmlAnswer returns [EObject current=null] : ( (lv_xml_0_0= ruleXml ) ) ;
    public final EObject ruleXmlAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_xml_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1119:28: ( ( (lv_xml_0_0= ruleXml ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1120:1: ( (lv_xml_0_0= ruleXml ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1120:1: ( (lv_xml_0_0= ruleXml ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1121:1: (lv_xml_0_0= ruleXml )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1121:1: (lv_xml_0_0= ruleXml )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1122:3: lv_xml_0_0= ruleXml
            {
             
            	        newCompositeNode(grammarAccess.getXmlAnswerAccess().getXmlXmlParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleXml_in_ruleXmlAnswer2714);
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1146:1: entryRuleOptionsAnswer returns [EObject current=null] : iv_ruleOptionsAnswer= ruleOptionsAnswer EOF ;
    public final EObject entryRuleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionsAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1147:2: (iv_ruleOptionsAnswer= ruleOptionsAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1148:2: iv_ruleOptionsAnswer= ruleOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionsAnswer_in_entryRuleOptionsAnswer2749);
            iv_ruleOptionsAnswer=ruleOptionsAnswer();

            state._fsp--;

             current =iv_ruleOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionsAnswer2759); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1155:1: ruleOptionsAnswer returns [EObject current=null] : (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer ) ;
    public final EObject ruleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SingleOptionsAnswer_0 = null;

        EObject this_ManyOptionsAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1158:28: ( (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1159:1: (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1159:1: (this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer | this_ManyOptionsAnswer_1= ruleManyOptionsAnswer )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=22 && LA21_0<=23)||(LA21_0>=25 && LA21_0<=26)) ) {
                alt21=1;
            }
            else if ( (LA21_0==27) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1160:5: this_SingleOptionsAnswer_0= ruleSingleOptionsAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionsAnswerAccess().getSingleOptionsAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleOptionsAnswer_in_ruleOptionsAnswer2806);
                    this_SingleOptionsAnswer_0=ruleSingleOptionsAnswer();

                    state._fsp--;

                     
                            current = this_SingleOptionsAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1170:5: this_ManyOptionsAnswer_1= ruleManyOptionsAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getOptionsAnswerAccess().getManyOptionsAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleManyOptionsAnswer_in_ruleOptionsAnswer2833);
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1186:1: entryRuleSingleOptionsAnswer returns [EObject current=null] : iv_ruleSingleOptionsAnswer= ruleSingleOptionsAnswer EOF ;
    public final EObject entryRuleSingleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleOptionsAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1187:2: (iv_ruleSingleOptionsAnswer= ruleSingleOptionsAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1188:2: iv_ruleSingleOptionsAnswer= ruleSingleOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getSingleOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleOptionsAnswer_in_entryRuleSingleOptionsAnswer2868);
            iv_ruleSingleOptionsAnswer=ruleSingleOptionsAnswer();

            state._fsp--;

             current =iv_ruleSingleOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleOptionsAnswer2878); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1195:1: ruleSingleOptionsAnswer returns [EObject current=null] : (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer ) ;
    public final EObject ruleSingleOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SingleBoxOptionsAnswer_0 = null;

        EObject this_SingleListOptionsAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1198:28: ( (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1199:1: (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1199:1: (this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer | this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            else if ( (LA22_0==23||(LA22_0>=25 && LA22_0<=26)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1200:5: this_SingleBoxOptionsAnswer_0= ruleSingleBoxOptionsAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getSingleOptionsAnswerAccess().getSingleBoxOptionsAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOptionsAnswer_in_ruleSingleOptionsAnswer2925);
                    this_SingleBoxOptionsAnswer_0=ruleSingleBoxOptionsAnswer();

                    state._fsp--;

                     
                            current = this_SingleBoxOptionsAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1210:5: this_SingleListOptionsAnswer_1= ruleSingleListOptionsAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getSingleOptionsAnswerAccess().getSingleListOptionsAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleListOptionsAnswer_in_ruleSingleOptionsAnswer2952);
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1226:1: entryRuleSingleBoxOptionsAnswer returns [EObject current=null] : iv_ruleSingleBoxOptionsAnswer= ruleSingleBoxOptionsAnswer EOF ;
    public final EObject entryRuleSingleBoxOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleBoxOptionsAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1227:2: (iv_ruleSingleBoxOptionsAnswer= ruleSingleBoxOptionsAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1228:2: iv_ruleSingleBoxOptionsAnswer= ruleSingleBoxOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getSingleBoxOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOptionsAnswer_in_entryRuleSingleBoxOptionsAnswer2987);
            iv_ruleSingleBoxOptionsAnswer=ruleSingleBoxOptionsAnswer();

            state._fsp--;

             current =iv_ruleSingleBoxOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleBoxOptionsAnswer2997); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1235:1: ruleSingleBoxOptionsAnswer returns [EObject current=null] : ( (lv_options_0_0= ruleSingleBoxOption ) )+ ;
    public final EObject ruleSingleBoxOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1238:28: ( ( (lv_options_0_0= ruleSingleBoxOption ) )+ )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1239:1: ( (lv_options_0_0= ruleSingleBoxOption ) )+
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1239:1: ( (lv_options_0_0= ruleSingleBoxOption ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1240:1: (lv_options_0_0= ruleSingleBoxOption )
            	    {
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1240:1: (lv_options_0_0= ruleSingleBoxOption )
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1241:3: lv_options_0_0= ruleSingleBoxOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsSingleBoxOptionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOption_in_ruleSingleBoxOptionsAnswer3042);
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1265:1: entryRuleSingleBoxOption returns [EObject current=null] : iv_ruleSingleBoxOption= ruleSingleBoxOption EOF ;
    public final EObject entryRuleSingleBoxOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleBoxOption = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1266:2: (iv_ruleSingleBoxOption= ruleSingleBoxOption EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1267:2: iv_ruleSingleBoxOption= ruleSingleBoxOption EOF
            {
             newCompositeNode(grammarAccess.getSingleBoxOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleBoxOption_in_entryRuleSingleBoxOption3078);
            iv_ruleSingleBoxOption=ruleSingleBoxOption();

            state._fsp--;

             current =iv_ruleSingleBoxOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleBoxOption3088); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1274:1: ruleSingleBoxOption returns [EObject current=null] : (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) ) ;
    public final EObject ruleSingleBoxOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_correct_1_0=null;
        Token otherlv_2=null;
        EObject lv_option_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1277:28: ( (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1278:1: (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1278:1: (otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1278:3: otherlv_0= '(' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ')' ( (lv_option_3_0= ruleOptionAnswer ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSingleBoxOption3125); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleBoxOptionAccess().getLeftParenthesisKeyword_0());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1282:1: ( (lv_correct_1_0= 'x' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1283:1: (lv_correct_1_0= 'x' )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1283:1: (lv_correct_1_0= 'x' )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1284:3: lv_correct_1_0= 'x'
                    {
                    lv_correct_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSingleBoxOption3143); 

                            newLeafNode(lv_correct_1_0, grammarAccess.getSingleBoxOptionAccess().getCorrectXKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleBoxOptionRule());
                    	        }
                           		setWithLastConsumed(current, "correct", true, "x");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSingleBoxOption3169); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleBoxOptionAccess().getRightParenthesisKeyword_2());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1301:1: ( (lv_option_3_0= ruleOptionAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1302:1: (lv_option_3_0= ruleOptionAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1302:1: (lv_option_3_0= ruleOptionAnswer )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1303:3: lv_option_3_0= ruleOptionAnswer
            {
             
            	        newCompositeNode(grammarAccess.getSingleBoxOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_ruleSingleBoxOption3190);
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1327:1: entryRuleSingleListOptionsAnswer returns [EObject current=null] : iv_ruleSingleListOptionsAnswer= ruleSingleListOptionsAnswer EOF ;
    public final EObject entryRuleSingleListOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleListOptionsAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1328:2: (iv_ruleSingleListOptionsAnswer= ruleSingleListOptionsAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1329:2: iv_ruleSingleListOptionsAnswer= ruleSingleListOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getSingleListOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleListOptionsAnswer_in_entryRuleSingleListOptionsAnswer3226);
            iv_ruleSingleListOptionsAnswer=ruleSingleListOptionsAnswer();

            state._fsp--;

             current =iv_ruleSingleListOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleListOptionsAnswer3236); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1336:1: ruleSingleListOptionsAnswer returns [EObject current=null] : ( (lv_options_0_0= ruleSingleListOption ) )+ ;
    public final EObject ruleSingleListOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1339:28: ( ( (lv_options_0_0= ruleSingleListOption ) )+ )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1340:1: ( (lv_options_0_0= ruleSingleListOption ) )+
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1340:1: ( (lv_options_0_0= ruleSingleListOption ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23||(LA25_0>=25 && LA25_0<=26)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1341:1: (lv_options_0_0= ruleSingleListOption )
            	    {
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1341:1: (lv_options_0_0= ruleSingleListOption )
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1342:3: lv_options_0_0= ruleSingleListOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsSingleListOptionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSingleListOption_in_ruleSingleListOptionsAnswer3281);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1366:1: entryRuleSingleListOption returns [EObject current=null] : iv_ruleSingleListOption= ruleSingleListOption EOF ;
    public final EObject entryRuleSingleListOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleListOption = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1367:2: (iv_ruleSingleListOption= ruleSingleListOption EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1368:2: iv_ruleSingleListOption= ruleSingleListOption EOF
            {
             newCompositeNode(grammarAccess.getSingleListOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleListOption_in_entryRuleSingleListOption3317);
            iv_ruleSingleListOption=ruleSingleListOption();

            state._fsp--;

             current =iv_ruleSingleListOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleListOption3327); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1375:1: ruleSingleListOption returns [EObject current=null] : ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) ) ;
    public final EObject ruleSingleListOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_correct_2_0=null;
        EObject lv_option_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1378:28: ( ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1379:1: ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1379:1: ( ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1379:2: ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) ) ( (lv_option_3_0= ruleOptionAnswer ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1379:2: ( (otherlv_0= '-' | otherlv_1= 'x' ) | ( (lv_correct_2_0= 'v' ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23||LA27_0==25) ) {
                alt27=1;
            }
            else if ( (LA27_0==26) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1379:3: (otherlv_0= '-' | otherlv_1= 'x' )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1379:3: (otherlv_0= '-' | otherlv_1= 'x' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==25) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==23) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1379:5: otherlv_0= '-'
                            {
                            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSingleListOption3366); 

                                	newLeafNode(otherlv_0, grammarAccess.getSingleListOptionAccess().getHyphenMinusKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1384:7: otherlv_1= 'x'
                            {
                            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSingleListOption3384); 

                                	newLeafNode(otherlv_1, grammarAccess.getSingleListOptionAccess().getXKeyword_0_0_1());
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1389:6: ( (lv_correct_2_0= 'v' ) )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1389:6: ( (lv_correct_2_0= 'v' ) )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1390:1: (lv_correct_2_0= 'v' )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1390:1: (lv_correct_2_0= 'v' )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1391:3: lv_correct_2_0= 'v'
                    {
                    lv_correct_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSingleListOption3409); 

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

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1404:3: ( (lv_option_3_0= ruleOptionAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1405:1: (lv_option_3_0= ruleOptionAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1405:1: (lv_option_3_0= ruleOptionAnswer )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1406:3: lv_option_3_0= ruleOptionAnswer
            {
             
            	        newCompositeNode(grammarAccess.getSingleListOptionAccess().getOptionOptionAnswerParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_ruleSingleListOption3444);
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1430:1: entryRuleManyOptionsAnswer returns [EObject current=null] : iv_ruleManyOptionsAnswer= ruleManyOptionsAnswer EOF ;
    public final EObject entryRuleManyOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyOptionsAnswer = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1431:2: (iv_ruleManyOptionsAnswer= ruleManyOptionsAnswer EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1432:2: iv_ruleManyOptionsAnswer= ruleManyOptionsAnswer EOF
            {
             newCompositeNode(grammarAccess.getManyOptionsAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManyOptionsAnswer_in_entryRuleManyOptionsAnswer3480);
            iv_ruleManyOptionsAnswer=ruleManyOptionsAnswer();

            state._fsp--;

             current =iv_ruleManyOptionsAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManyOptionsAnswer3490); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1439:1: ruleManyOptionsAnswer returns [EObject current=null] : ( (lv_options_0_0= ruleManyOption ) )+ ;
    public final EObject ruleManyOptionsAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_options_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1442:28: ( ( (lv_options_0_0= ruleManyOption ) )+ )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1443:1: ( (lv_options_0_0= ruleManyOption ) )+
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1443:1: ( (lv_options_0_0= ruleManyOption ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1444:1: (lv_options_0_0= ruleManyOption )
            	    {
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1444:1: (lv_options_0_0= ruleManyOption )
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1445:3: lv_options_0_0= ruleManyOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getManyOptionsAnswerAccess().getOptionsManyOptionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleManyOption_in_ruleManyOptionsAnswer3535);
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1469:1: entryRuleManyOption returns [EObject current=null] : iv_ruleManyOption= ruleManyOption EOF ;
    public final EObject entryRuleManyOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManyOption = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1470:2: (iv_ruleManyOption= ruleManyOption EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1471:2: iv_ruleManyOption= ruleManyOption EOF
            {
             newCompositeNode(grammarAccess.getManyOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleManyOption_in_entryRuleManyOption3571);
            iv_ruleManyOption=ruleManyOption();

            state._fsp--;

             current =iv_ruleManyOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleManyOption3581); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1478:1: ruleManyOption returns [EObject current=null] : (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) ) ;
    public final EObject ruleManyOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_correct_1_0=null;
        Token otherlv_2=null;
        EObject lv_option_3_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1481:28: ( (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1482:1: (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1482:1: (otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1482:3: otherlv_0= '[' ( (lv_correct_1_0= 'x' ) )? otherlv_2= ']' ( (lv_option_3_0= ruleOptionAnswer ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleManyOption3618); 

                	newLeafNode(otherlv_0, grammarAccess.getManyOptionAccess().getLeftSquareBracketKeyword_0());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1486:1: ( (lv_correct_1_0= 'x' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1487:1: (lv_correct_1_0= 'x' )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1487:1: (lv_correct_1_0= 'x' )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1488:3: lv_correct_1_0= 'x'
                    {
                    lv_correct_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleManyOption3636); 

                            newLeafNode(lv_correct_1_0, grammarAccess.getManyOptionAccess().getCorrectXKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getManyOptionRule());
                    	        }
                           		setWithLastConsumed(current, "correct", true, "x");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleManyOption3662); 

                	newLeafNode(otherlv_2, grammarAccess.getManyOptionAccess().getRightSquareBracketKeyword_2());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1505:1: ( (lv_option_3_0= ruleOptionAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1506:1: (lv_option_3_0= ruleOptionAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1506:1: (lv_option_3_0= ruleOptionAnswer )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1507:3: lv_option_3_0= ruleOptionAnswer
            {
             
            	        newCompositeNode(grammarAccess.getManyOptionAccess().getOptionOptionAnswerParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_ruleManyOption3683);
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1531:1: entryRuleXml returns [EObject current=null] : iv_ruleXml= ruleXml EOF ;
    public final EObject entryRuleXml() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXml = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1532:2: (iv_ruleXml= ruleXml EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1533:2: iv_ruleXml= ruleXml EOF
            {
             newCompositeNode(grammarAccess.getXmlRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXml_in_entryRuleXml3719);
            iv_ruleXml=ruleXml();

            state._fsp--;

             current =iv_ruleXml; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXml3729); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1540:1: ruleXml returns [EObject current=null] : (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' ) ;
    public final EObject ruleXml() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_element_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1543:28: ( (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1544:1: (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1544:1: (otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>' )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1544:3: otherlv_0= '<<' ( (lv_element_1_0= ruleXmlElement ) ) otherlv_2= '>>'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleXml3766); 

                	newLeafNode(otherlv_0, grammarAccess.getXmlAccess().getLessThanSignLessThanSignKeyword_0());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1548:1: ( (lv_element_1_0= ruleXmlElement ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1549:1: (lv_element_1_0= ruleXmlElement )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1549:1: (lv_element_1_0= ruleXmlElement )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1550:3: lv_element_1_0= ruleXmlElement
            {
             
            	        newCompositeNode(grammarAccess.getXmlAccess().getElementXmlElementParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleXmlElement_in_ruleXml3787);
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

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleXml3799); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1578:1: entryRuleXmlContents returns [EObject current=null] : iv_ruleXmlContents= ruleXmlContents EOF ;
    public final EObject entryRuleXmlContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlContents = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1579:2: (iv_ruleXmlContents= ruleXmlContents EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1580:2: iv_ruleXmlContents= ruleXmlContents EOF
            {
             newCompositeNode(grammarAccess.getXmlContentsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlContents_in_entryRuleXmlContents3835);
            iv_ruleXmlContents=ruleXmlContents();

            state._fsp--;

             current =iv_ruleXmlContents; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlContents3845); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1587:1: ruleXmlContents returns [EObject current=null] : ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) ) ;
    public final EObject ruleXmlContents() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        EObject lv_element_0_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1590:28: ( ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1591:1: ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1591:1: ( ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1591:2: ( (lv_element_0_0= ruleXmlElement ) ) ( (lv_post_1_0= RULE_XML_TEXT ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1591:2: ( (lv_element_0_0= ruleXmlElement ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1592:1: (lv_element_0_0= ruleXmlElement )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1592:1: (lv_element_0_0= ruleXmlElement )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1593:3: lv_element_0_0= ruleXmlElement
            {
             
            	        newCompositeNode(grammarAccess.getXmlContentsAccess().getElementXmlElementParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleXmlElement_in_ruleXmlContents3891);
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

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1609:2: ( (lv_post_1_0= RULE_XML_TEXT ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1610:1: (lv_post_1_0= RULE_XML_TEXT )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1610:1: (lv_post_1_0= RULE_XML_TEXT )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1611:3: lv_post_1_0= RULE_XML_TEXT
            {
            lv_post_1_0=(Token)match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_RULE_XML_TEXT_in_ruleXmlContents3908); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1635:1: entryRuleXmlElement returns [EObject current=null] : iv_ruleXmlElement= ruleXmlElement EOF ;
    public final EObject entryRuleXmlElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlElement = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1636:2: (iv_ruleXmlElement= ruleXmlElement EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1637:2: iv_ruleXmlElement= ruleXmlElement EOF
            {
             newCompositeNode(grammarAccess.getXmlElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlElement_in_entryRuleXmlElement3949);
            iv_ruleXmlElement=ruleXmlElement();

            state._fsp--;

             current =iv_ruleXmlElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlElement3959); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1644:1: ruleXmlElement returns [EObject current=null] : (this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement | this_XmlTagElement_1= ruleXmlTagElement ) ;
    public final EObject ruleXmlElement() throws RecognitionException {
        EObject current = null;

        EObject this_XmlPIAnswerElement_0 = null;

        EObject this_XmlTagElement_1 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1647:28: ( (this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement | this_XmlTagElement_1= ruleXmlTagElement ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1648:1: (this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement | this_XmlTagElement_1= ruleXmlTagElement )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1648:1: (this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement | this_XmlTagElement_1= ruleXmlTagElement )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1649:5: this_XmlPIAnswerElement_0= ruleXmlPIAnswerElement
                    {
                     
                            newCompositeNode(grammarAccess.getXmlElementAccess().getXmlPIAnswerElementParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleXmlPIAnswerElement_in_ruleXmlElement4006);
                    this_XmlPIAnswerElement_0=ruleXmlPIAnswerElement();

                    state._fsp--;

                     
                            current = this_XmlPIAnswerElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1659:5: this_XmlTagElement_1= ruleXmlTagElement
                    {
                     
                            newCompositeNode(grammarAccess.getXmlElementAccess().getXmlTagElementParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleXmlTagElement_in_ruleXmlElement4033);
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1675:1: entryRuleXmlPIAnswerElement returns [EObject current=null] : iv_ruleXmlPIAnswerElement= ruleXmlPIAnswerElement EOF ;
    public final EObject entryRuleXmlPIAnswerElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlPIAnswerElement = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1676:2: (iv_ruleXmlPIAnswerElement= ruleXmlPIAnswerElement EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1677:2: iv_ruleXmlPIAnswerElement= ruleXmlPIAnswerElement EOF
            {
             newCompositeNode(grammarAccess.getXmlPIAnswerElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlPIAnswerElement_in_entryRuleXmlPIAnswerElement4068);
            iv_ruleXmlPIAnswerElement=ruleXmlPIAnswerElement();

            state._fsp--;

             current =iv_ruleXmlPIAnswerElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlPIAnswerElement4078); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1684:1: ruleXmlPIAnswerElement returns [EObject current=null] : (otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?' ) ;
    public final EObject ruleXmlPIAnswerElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_answer_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1687:28: ( (otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?' ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1688:1: (otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?' )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1688:1: (otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?' )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1688:3: otherlv_0= '?' ( (lv_answer_1_0= ruleSimpleAnswer ) ) otherlv_2= '?'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleXmlPIAnswerElement4115); 

                	newLeafNode(otherlv_0, grammarAccess.getXmlPIAnswerElementAccess().getQuestionMarkKeyword_0());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1692:1: ( (lv_answer_1_0= ruleSimpleAnswer ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1693:1: (lv_answer_1_0= ruleSimpleAnswer )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1693:1: (lv_answer_1_0= ruleSimpleAnswer )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1694:3: lv_answer_1_0= ruleSimpleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getXmlPIAnswerElementAccess().getAnswerSimpleAnswerParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAnswer_in_ruleXmlPIAnswerElement4136);
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

            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleXmlPIAnswerElement4148); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1722:1: entryRuleXmlTagElement returns [EObject current=null] : iv_ruleXmlTagElement= ruleXmlTagElement EOF ;
    public final EObject entryRuleXmlTagElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlTagElement = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1723:2: (iv_ruleXmlTagElement= ruleXmlTagElement EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1724:2: iv_ruleXmlTagElement= ruleXmlTagElement EOF
            {
             newCompositeNode(grammarAccess.getXmlTagElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlTagElement_in_entryRuleXmlTagElement4184);
            iv_ruleXmlTagElement=ruleXmlTagElement();

            state._fsp--;

             current =iv_ruleXmlTagElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlTagElement4194); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1731:1: ruleXmlTagElement returns [EObject current=null] : ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) ) ) ;
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
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1734:28: ( ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1735:1: ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1735:1: ( ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1735:2: ( (lv_startTag_0_0= ruleXmlTag ) ) (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1735:2: ( (lv_startTag_0_0= ruleXmlTag ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1736:1: (lv_startTag_0_0= ruleXmlTag )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1736:1: (lv_startTag_0_0= ruleXmlTag )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1737:3: lv_startTag_0_0= ruleXmlTag
            {
             
            	        newCompositeNode(grammarAccess.getXmlTagElementAccess().getStartTagXmlTagParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleXmlTag_in_ruleXmlTagElement4240);
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

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1753:2: (otherlv_1= '/' | ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_XML_TEXT) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1753:4: otherlv_1= '/'
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleXmlTagElement4253); 

                        	newLeafNode(otherlv_1, grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1758:6: ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1758:6: ( ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? ) )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1758:7: ( (lv_pre_2_0= RULE_XML_TEXT ) ) ( (lv_contents_3_0= ruleXmlContents ) )* (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1758:7: ( (lv_pre_2_0= RULE_XML_TEXT ) )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1759:1: (lv_pre_2_0= RULE_XML_TEXT )
                    {
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1759:1: (lv_pre_2_0= RULE_XML_TEXT )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1760:3: lv_pre_2_0= RULE_XML_TEXT
                    {
                    lv_pre_2_0=(Token)match(input,RULE_XML_TEXT,FollowSets000.FOLLOW_RULE_XML_TEXT_in_ruleXmlTagElement4277); 

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

                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1776:2: ( (lv_contents_3_0= ruleXmlContents ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID||LA31_0==31) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1777:1: (lv_contents_3_0= ruleXmlContents )
                    	    {
                    	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1777:1: (lv_contents_3_0= ruleXmlContents )
                    	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1778:3: lv_contents_3_0= ruleXmlContents
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getXmlTagElementAccess().getContentsXmlContentsParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleXmlContents_in_ruleXmlTagElement4303);
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
                    	    break loop31;
                        }
                    } while (true);

                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1794:3: (otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )? )
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1794:5: otherlv_4= '/' ( (lv_endTag_5_0= RULE_ID ) )?
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleXmlTagElement4317); 

                        	newLeafNode(otherlv_4, grammarAccess.getXmlTagElementAccess().getSolidusKeyword_1_1_2_0());
                        
                    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1798:1: ( (lv_endTag_5_0= RULE_ID ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1799:1: (lv_endTag_5_0= RULE_ID )
                            {
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1799:1: (lv_endTag_5_0= RULE_ID )
                            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1800:3: lv_endTag_5_0= RULE_ID
                            {
                            lv_endTag_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleXmlTagElement4334); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1824:1: entryRuleXmlTag returns [EObject current=null] : iv_ruleXmlTag= ruleXmlTag EOF ;
    public final EObject entryRuleXmlTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlTag = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1825:2: (iv_ruleXmlTag= ruleXmlTag EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1826:2: iv_ruleXmlTag= ruleXmlTag EOF
            {
             newCompositeNode(grammarAccess.getXmlTagRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlTag_in_entryRuleXmlTag4379);
            iv_ruleXmlTag=ruleXmlTag();

            state._fsp--;

             current =iv_ruleXmlTag; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlTag4389); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1833:1: ruleXmlTag returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* ) ;
    public final EObject ruleXmlTag() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_attributes_1_0 = null;


         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1836:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1837:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1837:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )* )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1837:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_attributes_1_0= ruleXmlAttribute ) )*
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1837:2: ( (lv_name_0_0= RULE_ID ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1838:1: (lv_name_0_0= RULE_ID )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1838:1: (lv_name_0_0= RULE_ID )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1839:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleXmlTag4431); 

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

            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1855:2: ( (lv_attributes_1_0= ruleXmlAttribute ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1856:1: (lv_attributes_1_0= ruleXmlAttribute )
            	    {
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1856:1: (lv_attributes_1_0= ruleXmlAttribute )
            	    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1857:3: lv_attributes_1_0= ruleXmlAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXmlTagAccess().getAttributesXmlAttributeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleXmlAttribute_in_ruleXmlTag4457);
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
            	    break loop34;
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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1881:1: entryRuleXmlAttribute returns [EObject current=null] : iv_ruleXmlAttribute= ruleXmlAttribute EOF ;
    public final EObject entryRuleXmlAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmlAttribute = null;


        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1882:2: (iv_ruleXmlAttribute= ruleXmlAttribute EOF )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1883:2: iv_ruleXmlAttribute= ruleXmlAttribute EOF
            {
             newCompositeNode(grammarAccess.getXmlAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleXmlAttribute_in_entryRuleXmlAttribute4494);
            iv_ruleXmlAttribute=ruleXmlAttribute();

            state._fsp--;

             current =iv_ruleXmlAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXmlAttribute4504); 

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
    // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1890:1: ruleXmlAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleXmlAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1893:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1894:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1894:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1894:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1894:2: ( (lv_name_0_0= RULE_ID ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1895:1: (lv_name_0_0= RULE_ID )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1895:1: (lv_name_0_0= RULE_ID )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1896:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleXmlAttribute4546); 

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

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleXmlAttribute4563); 

                	newLeafNode(otherlv_1, grammarAccess.getXmlAttributeAccess().getEqualsSignKeyword_1());
                
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1916:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1917:1: (lv_value_2_0= RULE_STRING )
            {
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1917:1: (lv_value_2_0= RULE_STRING )
            // ../no.hal.pg.quiz.xtext/src-gen/no/hal/pg/quiz/xtext/parser/antlr/internal/InternalXQuiz.g:1918:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleXmlAttribute4580); 

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
        public static final BitSet FOLLOW_12_in_ruleQuiz131 = new BitSet(new long[]{0x000000002000C032L});
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
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuizPart603 = new BitSet(new long[]{0x0000000020008032L});
        public static final BitSet FOLLOW_ruleAbstractQA_in_ruleQuizPart629 = new BitSet(new long[]{0x0000000020008032L});
        public static final BitSet FOLLOW_ruleQuizPartRef_in_entryRuleQuizPartRef666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuizPartRef676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleQuizPartRef713 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleQuizPartRef725 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQName_in_ruleQuizPartRef748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnonymousQuizPart_in_entryRuleAnonymousQuizPart784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousQuizPart794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractQA_in_ruleAnonymousQuizPart849 = new BitSet(new long[]{0x0000000020008032L});
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
        public static final BitSet FOLLOW_RULE_ID_in_ruleQA1163 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQA1190 = new BitSet(new long[]{0x000000002EFE0070L});
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
        public static final BitSet FOLLOW_ruleEDoubleObject_in_ruleNumberAnswer2306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDoubleObject_in_entryRuleEDoubleObject2342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDoubleObject2353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDoubleObject2393 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleEDoubleObject2412 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDoubleObject2427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanAnswer_in_entryRuleBooleanAnswer2474 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAnswer2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleBooleanAnswer2539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleBooleanAnswer2568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleBooleanAnswer2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleBooleanAnswer2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlAnswer_in_entryRuleXmlAnswer2659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlAnswer2669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXml_in_ruleXmlAnswer2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionsAnswer_in_entryRuleOptionsAnswer2749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionsAnswer2759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleOptionsAnswer_in_ruleOptionsAnswer2806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyOptionsAnswer_in_ruleOptionsAnswer2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleOptionsAnswer_in_entryRuleSingleOptionsAnswer2868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleOptionsAnswer2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOptionsAnswer_in_ruleSingleOptionsAnswer2925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleListOptionsAnswer_in_ruleSingleOptionsAnswer2952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOptionsAnswer_in_entryRuleSingleBoxOptionsAnswer2987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleBoxOptionsAnswer2997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleBoxOption_in_ruleSingleBoxOptionsAnswer3042 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleSingleBoxOption_in_entryRuleSingleBoxOption3078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleBoxOption3088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleSingleBoxOption3125 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleSingleBoxOption3143 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSingleBoxOption3169 = new BitSet(new long[]{0x00000000203E0070L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_ruleSingleBoxOption3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleListOptionsAnswer_in_entryRuleSingleListOptionsAnswer3226 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleListOptionsAnswer3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleListOption_in_ruleSingleListOptionsAnswer3281 = new BitSet(new long[]{0x0000000006C00002L});
        public static final BitSet FOLLOW_ruleSingleListOption_in_entryRuleSingleListOption3317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleListOption3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleSingleListOption3366 = new BitSet(new long[]{0x00000000203E0070L});
        public static final BitSet FOLLOW_23_in_ruleSingleListOption3384 = new BitSet(new long[]{0x00000000203E0070L});
        public static final BitSet FOLLOW_26_in_ruleSingleListOption3409 = new BitSet(new long[]{0x00000000203E0070L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_ruleSingleListOption3444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyOptionsAnswer_in_entryRuleManyOptionsAnswer3480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManyOptionsAnswer3490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleManyOption_in_ruleManyOptionsAnswer3535 = new BitSet(new long[]{0x000000002EFE0072L});
        public static final BitSet FOLLOW_ruleManyOption_in_entryRuleManyOption3571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleManyOption3581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleManyOption3618 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_23_in_ruleManyOption3636 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleManyOption3662 = new BitSet(new long[]{0x00000000203E0070L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_ruleManyOption3683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXml_in_entryRuleXml3719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXml3729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleXml3766 = new BitSet(new long[]{0x0000000080000020L});
        public static final BitSet FOLLOW_ruleXmlElement_in_ruleXml3787 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleXml3799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlContents_in_entryRuleXmlContents3835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlContents3845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlElement_in_ruleXmlContents3891 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_XML_TEXT_in_ruleXmlContents3908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlElement_in_entryRuleXmlElement3949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlElement3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlPIAnswerElement_in_ruleXmlElement4006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTagElement_in_ruleXmlElement4033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlPIAnswerElement_in_entryRuleXmlPIAnswerElement4068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlPIAnswerElement4078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleXmlPIAnswerElement4115 = new BitSet(new long[]{0x00000000003E0050L});
        public static final BitSet FOLLOW_ruleSimpleAnswer_in_ruleXmlPIAnswerElement4136 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleXmlPIAnswerElement4148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTagElement_in_entryRuleXmlTagElement4184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlTagElement4194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTag_in_ruleXmlTagElement4240 = new BitSet(new long[]{0x0000000000020080L});
        public static final BitSet FOLLOW_17_in_ruleXmlTagElement4253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_XML_TEXT_in_ruleXmlTagElement4277 = new BitSet(new long[]{0x0000000080020020L});
        public static final BitSet FOLLOW_ruleXmlContents_in_ruleXmlTagElement4303 = new BitSet(new long[]{0x0000000080020020L});
        public static final BitSet FOLLOW_17_in_ruleXmlTagElement4317 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleXmlTagElement4334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXmlTag_in_entryRuleXmlTag4379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlTag4389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleXmlTag4431 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_ruleXmlAttribute_in_ruleXmlTag4457 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_ruleXmlAttribute_in_entryRuleXmlAttribute4494 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXmlAttribute4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleXmlAttribute4546 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleXmlAttribute4563 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleXmlAttribute4580 = new BitSet(new long[]{0x0000000000000002L});
    }


}