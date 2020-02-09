package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'initial'", "'final'", "'state'", "','", "'transition'", "'->'", "': trigger'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) ) (otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )* )+ ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_state_8_0 = null;

        EObject lv_state_10_0 = null;

        EObject lv_transition_12_0 = null;

        EObject lv_transition_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) ) (otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )* )+ ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) ) (otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )* )+ )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) ) (otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )* )+ )
            // InternalMyDsl.g:79:3: () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) ) (otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )* )+
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFSMAccess().getFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:109:3: (otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) )
            // InternalMyDsl.g:110:4: otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) )
            {
            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getInitialKeyword_3_0());
            			
            // InternalMyDsl.g:114:4: ( (lv_state_4_0= ruleInitial ) )
            // InternalMyDsl.g:115:5: (lv_state_4_0= ruleInitial )
            {
            // InternalMyDsl.g:115:5: (lv_state_4_0= ruleInitial )
            // InternalMyDsl.g:116:6: lv_state_4_0= ruleInitial
            {

            						newCompositeNode(grammarAccess.getFSMAccess().getStateInitialParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_5);
            lv_state_4_0=ruleInitial();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFSMRule());
            						}
            						add(
            							current,
            							"state",
            							lv_state_4_0,
            							"org.xtext.example.mydsl.MyDsl.Initial");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:134:3: (otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) )
            // InternalMyDsl.g:135:4: otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) )
            {
            otherlv_5=(Token)match(input,13,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getFinalKeyword_4_0());
            			
            // InternalMyDsl.g:139:4: ( (lv_state_6_0= ruleFinal ) )
            // InternalMyDsl.g:140:5: (lv_state_6_0= ruleFinal )
            {
            // InternalMyDsl.g:140:5: (lv_state_6_0= ruleFinal )
            // InternalMyDsl.g:141:6: lv_state_6_0= ruleFinal
            {

            						newCompositeNode(grammarAccess.getFSMAccess().getStateFinalParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_6);
            lv_state_6_0=ruleFinal();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFSMRule());
            						}
            						add(
            							current,
            							"state",
            							lv_state_6_0,
            							"org.xtext.example.mydsl.MyDsl.Final");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:159:3: ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )* )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:160:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )*
            	    {
            	    // InternalMyDsl.g:160:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    // InternalMyDsl.g:161:5: otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getStateKeyword_5_0_0());
            	    				
            	    // InternalMyDsl.g:165:5: ( (lv_state_8_0= ruleState ) )
            	    // InternalMyDsl.g:166:6: (lv_state_8_0= ruleState )
            	    {
            	    // InternalMyDsl.g:166:6: (lv_state_8_0= ruleState )
            	    // InternalMyDsl.g:167:7: lv_state_8_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_5_0_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_state_8_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_8_0,
            	    								"org.xtext.example.mydsl.MyDsl.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:184:5: (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:185:6: otherlv_9= ',' ( (lv_state_10_0= ruleState ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getCommaKeyword_5_0_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:189:6: ( (lv_state_10_0= ruleState ) )
            	    	    // InternalMyDsl.g:190:7: (lv_state_10_0= ruleState )
            	    	    {
            	    	    // InternalMyDsl.g:190:7: (lv_state_10_0= ruleState )
            	    	    // InternalMyDsl.g:191:8: lv_state_10_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_5_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_state_10_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_10_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }

            	    // InternalMyDsl.g:210:4: (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==16) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:211:5: otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )*
            	    	    {
            	    	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

            	    	    					newLeafNode(otherlv_11, grammarAccess.getFSMAccess().getTransitionKeyword_5_1_0());
            	    	    				
            	    	    // InternalMyDsl.g:215:5: ( (lv_transition_12_0= ruleTransition ) )
            	    	    // InternalMyDsl.g:216:6: (lv_transition_12_0= ruleTransition )
            	    	    {
            	    	    // InternalMyDsl.g:216:6: (lv_transition_12_0= ruleTransition )
            	    	    // InternalMyDsl.g:217:7: lv_transition_12_0= ruleTransition
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_5_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_transition_12_0=ruleTransition();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"transition",
            	    	    								lv_transition_12_0,
            	    	    								"org.xtext.example.mydsl.MyDsl.Transition");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }

            	    	    // InternalMyDsl.g:234:5: (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )*
            	    	    loop2:
            	    	    do {
            	    	        int alt2=2;
            	    	        int LA2_0 = input.LA(1);

            	    	        if ( (LA2_0==15) ) {
            	    	            alt2=1;
            	    	        }


            	    	        switch (alt2) {
            	    	    	case 1 :
            	    	    	    // InternalMyDsl.g:235:6: otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) )
            	    	    	    {
            	    	    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

            	    	    	    						newLeafNode(otherlv_13, grammarAccess.getFSMAccess().getCommaKeyword_5_1_2_0());
            	    	    	    					
            	    	    	    // InternalMyDsl.g:239:6: ( (lv_transition_14_0= ruleTransition ) )
            	    	    	    // InternalMyDsl.g:240:7: (lv_transition_14_0= ruleTransition )
            	    	    	    {
            	    	    	    // InternalMyDsl.g:240:7: (lv_transition_14_0= ruleTransition )
            	    	    	    // InternalMyDsl.g:241:8: lv_transition_14_0= ruleTransition
            	    	    	    {

            	    	    	    								newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_5_1_2_1_0());
            	    	    	    							
            	    	    	    pushFollow(FOLLOW_7);
            	    	    	    lv_transition_14_0=ruleTransition();

            	    	    	    state._fsp--;


            	    	    	    								if (current==null) {
            	    	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    	    								}
            	    	    	    								add(
            	    	    	    									current,
            	    	    	    									"transition",
            	    	    	    									lv_transition_14_0,
            	    	    	    									"org.xtext.example.mydsl.MyDsl.Transition");
            	    	    	    								afterParserOrEnumRuleCall();
            	    	    	    							

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop2;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:265:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:265:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:266:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:272:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:278:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:279:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:279:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:280:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:299:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:299:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:300:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:306:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:312:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:313:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:313:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:314:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:314:3: ()
            // InternalMyDsl.g:315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:321:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:322:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:322:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:323:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:344:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:344:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:345:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:351:1: ruleTransition returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( ( ( ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) ) otherlv_5= ': trigger' ( (lv_trigger_6_0= ruleEString ) ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_trigger_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:357:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ( ( ( ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) ) otherlv_5= ': trigger' ( (lv_trigger_6_0= ruleEString ) ) ) ) )
            // InternalMyDsl.g:358:2: ( () ( (lv_name_1_0= ruleEString ) ) ( ( ( ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) ) otherlv_5= ': trigger' ( (lv_trigger_6_0= ruleEString ) ) ) )
            {
            // InternalMyDsl.g:358:2: ( () ( (lv_name_1_0= ruleEString ) ) ( ( ( ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) ) otherlv_5= ': trigger' ( (lv_trigger_6_0= ruleEString ) ) ) )
            // InternalMyDsl.g:359:3: () ( (lv_name_1_0= ruleEString ) ) ( ( ( ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) ) otherlv_5= ': trigger' ( (lv_trigger_6_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:359:3: ()
            // InternalMyDsl.g:360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:366:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:367:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:367:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:368:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:385:3: ( ( ( ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) ) otherlv_5= ': trigger' ( (lv_trigger_6_0= ruleEString ) ) )
            // InternalMyDsl.g:386:4: ( ( ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) ) otherlv_5= ': trigger' ( (lv_trigger_6_0= ruleEString ) )
            {
            // InternalMyDsl.g:386:4: ( ( ruleEString ) )
            // InternalMyDsl.g:387:5: ( ruleEString )
            {
            // InternalMyDsl.g:387:5: ( ruleEString )
            // InternalMyDsl.g:388:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getTransitionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0_0());
            					
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyDsl.g:402:4: (otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalMyDsl.g:403:5: otherlv_3= '->' ( ( ruleEString ) )
            {
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2_1_0());
            				
            // InternalMyDsl.g:407:5: ( ( ruleEString ) )
            // InternalMyDsl.g:408:6: ( ruleEString )
            {
            // InternalMyDsl.g:408:6: ( ruleEString )
            // InternalMyDsl.g:409:7: ruleEString
            {

            							if (current==null) {
            								current = createModelElement(grammarAccess.getTransitionRule());
            							}
            						

            							newCompositeNode(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_1_1_0());
            						
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            							afterParserOrEnumRuleCall();
            						

            }


            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getTriggerKeyword_2_2());
            			
            // InternalMyDsl.g:428:4: ( (lv_trigger_6_0= ruleEString ) )
            // InternalMyDsl.g:429:5: (lv_trigger_6_0= ruleEString )
            {
            // InternalMyDsl.g:429:5: (lv_trigger_6_0= ruleEString )
            // InternalMyDsl.g:430:6: lv_trigger_6_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTransitionAccess().getTriggerEStringParserRuleCall_2_3_0());
            					
            pushFollow(FOLLOW_2);
            lv_trigger_6_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTransitionRule());
            						}
            						set(
            							current,
            							"trigger",
            							lv_trigger_6_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInitial"
    // InternalMyDsl.g:452:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalMyDsl.g:452:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalMyDsl.g:453:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyDsl.g:459:1: ruleInitial returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:465:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:466:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:466:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:467:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:467:3: ()
            // InternalMyDsl.g:468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialAccess().getInitialAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:474:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:475:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:475:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:476:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleFinal"
    // InternalMyDsl.g:497:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // InternalMyDsl.g:497:46: (iv_ruleFinal= ruleFinal EOF )
            // InternalMyDsl.g:498:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalMyDsl.g:504:1: ruleFinal returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:510:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:511:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:511:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:512:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:512:3: ()
            // InternalMyDsl.g:513:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalAccess().getFinalAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:519:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:520:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:520:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:521:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleFinal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}