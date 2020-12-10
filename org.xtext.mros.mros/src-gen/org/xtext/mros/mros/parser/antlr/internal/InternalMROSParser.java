package org.xtext.mros.mros.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mros.mros.services.MROSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMROSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SkillDefinitionSet'", "'{'", "'}'", "'Skill'", "'quality attributes'", "'['", "','", "']'", "'input'", "'output'", "'result'", "'success'", "':'", "'error'", "'inprogress'", "'safety'", "'performance'", "'energy'", "'Realization'", "'Quality'", "';'", "'context:'", "'Default'", "'BatteryCharging'", "'OnChargingStation'", "'<'", "'>'", "'Component'", "'observable'", "'Configuration'", "'.'", "'active'", "'inactive'", "'unconfigured'", "'configured'", "'environment'", "'narowness:'", "'clutterness:'", "'-'", "'ActionType'", "'goal'", "'feedback'", "'bool'", "'int'", "'float'", "'PoseStamped'", "'string'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_MESSAGE_ASIGMENT=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMROSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMROSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMROSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMROS.g"; }



     	private MROSGrammarAccess grammarAccess;

        public InternalMROSParser(TokenStream input, MROSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MROSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMROS.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMROS.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMROS.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMROS.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'SkillDefinitionSet' otherlv_1= '{' ( (lv_SkillDefinitionSet_2_0= ruleSkillDefinition ) )* otherlv_3= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_SkillDefinitionSet_2_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:77:2: ( (otherlv_0= 'SkillDefinitionSet' otherlv_1= '{' ( (lv_SkillDefinitionSet_2_0= ruleSkillDefinition ) )* otherlv_3= '}' ) )
            // InternalMROS.g:78:2: (otherlv_0= 'SkillDefinitionSet' otherlv_1= '{' ( (lv_SkillDefinitionSet_2_0= ruleSkillDefinition ) )* otherlv_3= '}' )
            {
            // InternalMROS.g:78:2: (otherlv_0= 'SkillDefinitionSet' otherlv_1= '{' ( (lv_SkillDefinitionSet_2_0= ruleSkillDefinition ) )* otherlv_3= '}' )
            // InternalMROS.g:79:3: otherlv_0= 'SkillDefinitionSet' otherlv_1= '{' ( (lv_SkillDefinitionSet_2_0= ruleSkillDefinition ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSkillDefinitionSetKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMROS.g:87:3: ( (lv_SkillDefinitionSet_2_0= ruleSkillDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMROS.g:88:4: (lv_SkillDefinitionSet_2_0= ruleSkillDefinition )
            	    {
            	    // InternalMROS.g:88:4: (lv_SkillDefinitionSet_2_0= ruleSkillDefinition )
            	    // InternalMROS.g:89:5: lv_SkillDefinitionSet_2_0= ruleSkillDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSkillDefinitionSetSkillDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_SkillDefinitionSet_2_0=ruleSkillDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"SkillDefinitionSet",
            	    						lv_SkillDefinitionSet_2_0,
            	    						"org.xtext.mros.mros.MROS.SkillDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSkillDefinition"
    // InternalMROS.g:114:1: entryRuleSkillDefinition returns [EObject current=null] : iv_ruleSkillDefinition= ruleSkillDefinition EOF ;
    public final EObject entryRuleSkillDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillDefinition = null;


        try {
            // InternalMROS.g:114:56: (iv_ruleSkillDefinition= ruleSkillDefinition EOF )
            // InternalMROS.g:115:2: iv_ruleSkillDefinition= ruleSkillDefinition EOF
            {
             newCompositeNode(grammarAccess.getSkillDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillDefinition=ruleSkillDefinition();

            state._fsp--;

             current =iv_ruleSkillDefinition; 
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
    // $ANTLR end "entryRuleSkillDefinition"


    // $ANTLR start "ruleSkillDefinition"
    // InternalMROS.g:121:1: ruleSkillDefinition returns [EObject current=null] : (otherlv_0= 'Skill' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quality attributes' otherlv_4= '[' ( (lv_listqa_5_0= ruleQualityAttribute ) ) (otherlv_6= ',' ( (lv_listqa_7_0= ruleQualityAttribute ) ) )* otherlv_8= ']' (otherlv_9= 'input' otherlv_10= '{' ( (lv_p_11_0= ruleParameterType ) ) (otherlv_12= ',' ( (lv_p_13_0= ruleParameterType ) ) )* otherlv_14= '}' )* (otherlv_15= 'output' otherlv_16= '{' ( (lv_p_17_0= ruleParameterType ) ) (otherlv_18= ',' ( (lv_p_19_0= ruleParameterType ) ) )* otherlv_20= '}' )* otherlv_21= 'result' otherlv_22= '{' ( (lv_result_23_0= ruleResultType ) ) (otherlv_24= ',' ( (lv_result_25_0= ruleResultType ) ) )* otherlv_26= '}' ( (lv_realizations_27_0= ruleSkillRealization ) )* otherlv_28= '}' ) ;
    public final EObject ruleSkillDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject lv_listqa_5_0 = null;

        EObject lv_listqa_7_0 = null;

        EObject lv_p_11_0 = null;

        EObject lv_p_13_0 = null;

        EObject lv_p_17_0 = null;

        EObject lv_p_19_0 = null;

        EObject lv_result_23_0 = null;

        EObject lv_result_25_0 = null;

        EObject lv_realizations_27_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:127:2: ( (otherlv_0= 'Skill' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quality attributes' otherlv_4= '[' ( (lv_listqa_5_0= ruleQualityAttribute ) ) (otherlv_6= ',' ( (lv_listqa_7_0= ruleQualityAttribute ) ) )* otherlv_8= ']' (otherlv_9= 'input' otherlv_10= '{' ( (lv_p_11_0= ruleParameterType ) ) (otherlv_12= ',' ( (lv_p_13_0= ruleParameterType ) ) )* otherlv_14= '}' )* (otherlv_15= 'output' otherlv_16= '{' ( (lv_p_17_0= ruleParameterType ) ) (otherlv_18= ',' ( (lv_p_19_0= ruleParameterType ) ) )* otherlv_20= '}' )* otherlv_21= 'result' otherlv_22= '{' ( (lv_result_23_0= ruleResultType ) ) (otherlv_24= ',' ( (lv_result_25_0= ruleResultType ) ) )* otherlv_26= '}' ( (lv_realizations_27_0= ruleSkillRealization ) )* otherlv_28= '}' ) )
            // InternalMROS.g:128:2: (otherlv_0= 'Skill' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quality attributes' otherlv_4= '[' ( (lv_listqa_5_0= ruleQualityAttribute ) ) (otherlv_6= ',' ( (lv_listqa_7_0= ruleQualityAttribute ) ) )* otherlv_8= ']' (otherlv_9= 'input' otherlv_10= '{' ( (lv_p_11_0= ruleParameterType ) ) (otherlv_12= ',' ( (lv_p_13_0= ruleParameterType ) ) )* otherlv_14= '}' )* (otherlv_15= 'output' otherlv_16= '{' ( (lv_p_17_0= ruleParameterType ) ) (otherlv_18= ',' ( (lv_p_19_0= ruleParameterType ) ) )* otherlv_20= '}' )* otherlv_21= 'result' otherlv_22= '{' ( (lv_result_23_0= ruleResultType ) ) (otherlv_24= ',' ( (lv_result_25_0= ruleResultType ) ) )* otherlv_26= '}' ( (lv_realizations_27_0= ruleSkillRealization ) )* otherlv_28= '}' )
            {
            // InternalMROS.g:128:2: (otherlv_0= 'Skill' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quality attributes' otherlv_4= '[' ( (lv_listqa_5_0= ruleQualityAttribute ) ) (otherlv_6= ',' ( (lv_listqa_7_0= ruleQualityAttribute ) ) )* otherlv_8= ']' (otherlv_9= 'input' otherlv_10= '{' ( (lv_p_11_0= ruleParameterType ) ) (otherlv_12= ',' ( (lv_p_13_0= ruleParameterType ) ) )* otherlv_14= '}' )* (otherlv_15= 'output' otherlv_16= '{' ( (lv_p_17_0= ruleParameterType ) ) (otherlv_18= ',' ( (lv_p_19_0= ruleParameterType ) ) )* otherlv_20= '}' )* otherlv_21= 'result' otherlv_22= '{' ( (lv_result_23_0= ruleResultType ) ) (otherlv_24= ',' ( (lv_result_25_0= ruleResultType ) ) )* otherlv_26= '}' ( (lv_realizations_27_0= ruleSkillRealization ) )* otherlv_28= '}' )
            // InternalMROS.g:129:3: otherlv_0= 'Skill' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'quality attributes' otherlv_4= '[' ( (lv_listqa_5_0= ruleQualityAttribute ) ) (otherlv_6= ',' ( (lv_listqa_7_0= ruleQualityAttribute ) ) )* otherlv_8= ']' (otherlv_9= 'input' otherlv_10= '{' ( (lv_p_11_0= ruleParameterType ) ) (otherlv_12= ',' ( (lv_p_13_0= ruleParameterType ) ) )* otherlv_14= '}' )* (otherlv_15= 'output' otherlv_16= '{' ( (lv_p_17_0= ruleParameterType ) ) (otherlv_18= ',' ( (lv_p_19_0= ruleParameterType ) ) )* otherlv_20= '}' )* otherlv_21= 'result' otherlv_22= '{' ( (lv_result_23_0= ruleResultType ) ) (otherlv_24= ',' ( (lv_result_25_0= ruleResultType ) ) )* otherlv_26= '}' ( (lv_realizations_27_0= ruleSkillRealization ) )* otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillDefinitionAccess().getSkillKeyword_0());
            		
            // InternalMROS.g:133:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMROS.g:134:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMROS.g:134:4: (lv_name_1_0= RULE_ID )
            // InternalMROS.g:135:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSkillDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSkillDefinitionAccess().getQualityAttributesKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSkillDefinitionAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalMROS.g:163:3: ( (lv_listqa_5_0= ruleQualityAttribute ) )
            // InternalMROS.g:164:4: (lv_listqa_5_0= ruleQualityAttribute )
            {
            // InternalMROS.g:164:4: (lv_listqa_5_0= ruleQualityAttribute )
            // InternalMROS.g:165:5: lv_listqa_5_0= ruleQualityAttribute
            {

            					newCompositeNode(grammarAccess.getSkillDefinitionAccess().getListqaQualityAttributeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_listqa_5_0=ruleQualityAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            					}
            					add(
            						current,
            						"listqa",
            						lv_listqa_5_0,
            						"org.xtext.mros.mros.MROS.QualityAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMROS.g:182:3: (otherlv_6= ',' ( (lv_listqa_7_0= ruleQualityAttribute ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMROS.g:183:4: otherlv_6= ',' ( (lv_listqa_7_0= ruleQualityAttribute ) )
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSkillDefinitionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMROS.g:187:4: ( (lv_listqa_7_0= ruleQualityAttribute ) )
            	    // InternalMROS.g:188:5: (lv_listqa_7_0= ruleQualityAttribute )
            	    {
            	    // InternalMROS.g:188:5: (lv_listqa_7_0= ruleQualityAttribute )
            	    // InternalMROS.g:189:6: lv_listqa_7_0= ruleQualityAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getSkillDefinitionAccess().getListqaQualityAttributeParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_listqa_7_0=ruleQualityAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listqa",
            	    							lv_listqa_7_0,
            	    							"org.xtext.mros.mros.MROS.QualityAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getSkillDefinitionAccess().getRightSquareBracketKeyword_7());
            		
            // InternalMROS.g:211:3: (otherlv_9= 'input' otherlv_10= '{' ( (lv_p_11_0= ruleParameterType ) ) (otherlv_12= ',' ( (lv_p_13_0= ruleParameterType ) ) )* otherlv_14= '}' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMROS.g:212:4: otherlv_9= 'input' otherlv_10= '{' ( (lv_p_11_0= ruleParameterType ) ) (otherlv_12= ',' ( (lv_p_13_0= ruleParameterType ) ) )* otherlv_14= '}'
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSkillDefinitionAccess().getInputKeyword_8_0());
            	    			
            	    otherlv_10=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_8_1());
            	    			
            	    // InternalMROS.g:220:4: ( (lv_p_11_0= ruleParameterType ) )
            	    // InternalMROS.g:221:5: (lv_p_11_0= ruleParameterType )
            	    {
            	    // InternalMROS.g:221:5: (lv_p_11_0= ruleParameterType )
            	    // InternalMROS.g:222:6: lv_p_11_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_8_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_p_11_0=ruleParameterType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"p",
            	    							lv_p_11_0,
            	    							"org.xtext.mros.mros.MROS.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMROS.g:239:4: (otherlv_12= ',' ( (lv_p_13_0= ruleParameterType ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==18) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMROS.g:240:5: otherlv_12= ',' ( (lv_p_13_0= ruleParameterType ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,18,FOLLOW_5); 

            	    	    					newLeafNode(otherlv_12, grammarAccess.getSkillDefinitionAccess().getCommaKeyword_8_3_0());
            	    	    				
            	    	    // InternalMROS.g:244:5: ( (lv_p_13_0= ruleParameterType ) )
            	    	    // InternalMROS.g:245:6: (lv_p_13_0= ruleParameterType )
            	    	    {
            	    	    // InternalMROS.g:245:6: (lv_p_13_0= ruleParameterType )
            	    	    // InternalMROS.g:246:7: lv_p_13_0= ruleParameterType
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_8_3_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_p_13_0=ruleParameterType();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"p",
            	    	    								lv_p_13_0,
            	    	    								"org.xtext.mros.mros.MROS.ParameterType");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_14=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_14, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMROS.g:269:3: (otherlv_15= 'output' otherlv_16= '{' ( (lv_p_17_0= ruleParameterType ) ) (otherlv_18= ',' ( (lv_p_19_0= ruleParameterType ) ) )* otherlv_20= '}' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMROS.g:270:4: otherlv_15= 'output' otherlv_16= '{' ( (lv_p_17_0= ruleParameterType ) ) (otherlv_18= ',' ( (lv_p_19_0= ruleParameterType ) ) )* otherlv_20= '}'
            	    {
            	    otherlv_15=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_15, grammarAccess.getSkillDefinitionAccess().getOutputKeyword_9_0());
            	    			
            	    otherlv_16=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_16, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_9_1());
            	    			
            	    // InternalMROS.g:278:4: ( (lv_p_17_0= ruleParameterType ) )
            	    // InternalMROS.g:279:5: (lv_p_17_0= ruleParameterType )
            	    {
            	    // InternalMROS.g:279:5: (lv_p_17_0= ruleParameterType )
            	    // InternalMROS.g:280:6: lv_p_17_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_9_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_p_17_0=ruleParameterType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"p",
            	    							lv_p_17_0,
            	    							"org.xtext.mros.mros.MROS.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMROS.g:297:4: (otherlv_18= ',' ( (lv_p_19_0= ruleParameterType ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==18) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMROS.g:298:5: otherlv_18= ',' ( (lv_p_19_0= ruleParameterType ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,18,FOLLOW_5); 

            	    	    					newLeafNode(otherlv_18, grammarAccess.getSkillDefinitionAccess().getCommaKeyword_9_3_0());
            	    	    				
            	    	    // InternalMROS.g:302:5: ( (lv_p_19_0= ruleParameterType ) )
            	    	    // InternalMROS.g:303:6: (lv_p_19_0= ruleParameterType )
            	    	    {
            	    	    // InternalMROS.g:303:6: (lv_p_19_0= ruleParameterType )
            	    	    // InternalMROS.g:304:7: lv_p_19_0= ruleParameterType
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_9_3_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_p_19_0=ruleParameterType();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"p",
            	    	    								lv_p_19_0,
            	    	    								"org.xtext.mros.mros.MROS.ParameterType");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_20=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_20, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_9_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_21=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_21, grammarAccess.getSkillDefinitionAccess().getResultKeyword_10());
            		
            otherlv_22=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_22, grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMROS.g:335:3: ( (lv_result_23_0= ruleResultType ) )
            // InternalMROS.g:336:4: (lv_result_23_0= ruleResultType )
            {
            // InternalMROS.g:336:4: (lv_result_23_0= ruleResultType )
            // InternalMROS.g:337:5: lv_result_23_0= ruleResultType
            {

            					newCompositeNode(grammarAccess.getSkillDefinitionAccess().getResultResultTypeParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_result_23_0=ruleResultType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            					}
            					add(
            						current,
            						"result",
            						lv_result_23_0,
            						"org.xtext.mros.mros.MROS.ResultType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMROS.g:354:3: (otherlv_24= ',' ( (lv_result_25_0= ruleResultType ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMROS.g:355:4: otherlv_24= ',' ( (lv_result_25_0= ruleResultType ) )
            	    {
            	    otherlv_24=(Token)match(input,18,FOLLOW_13); 

            	    				newLeafNode(otherlv_24, grammarAccess.getSkillDefinitionAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMROS.g:359:4: ( (lv_result_25_0= ruleResultType ) )
            	    // InternalMROS.g:360:5: (lv_result_25_0= ruleResultType )
            	    {
            	    // InternalMROS.g:360:5: (lv_result_25_0= ruleResultType )
            	    // InternalMROS.g:361:6: lv_result_25_0= ruleResultType
            	    {

            	    						newCompositeNode(grammarAccess.getSkillDefinitionAccess().getResultResultTypeParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_result_25_0=ruleResultType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"result",
            	    							lv_result_25_0,
            	    							"org.xtext.mros.mros.MROS.ResultType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_26=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_26, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalMROS.g:383:3: ( (lv_realizations_27_0= ruleSkillRealization ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMROS.g:384:4: (lv_realizations_27_0= ruleSkillRealization )
            	    {
            	    // InternalMROS.g:384:4: (lv_realizations_27_0= ruleSkillRealization )
            	    // InternalMROS.g:385:5: lv_realizations_27_0= ruleSkillRealization
            	    {

            	    					newCompositeNode(grammarAccess.getSkillDefinitionAccess().getRealizationsSkillRealizationParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_realizations_27_0=ruleSkillRealization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"realizations",
            	    						lv_realizations_27_0,
            	    						"org.xtext.mros.mros.MROS.SkillRealization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_28=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleSkillDefinition"


    // $ANTLR start "entryRuleResultType"
    // InternalMROS.g:410:1: entryRuleResultType returns [EObject current=null] : iv_ruleResultType= ruleResultType EOF ;
    public final EObject entryRuleResultType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultType = null;


        try {
            // InternalMROS.g:410:51: (iv_ruleResultType= ruleResultType EOF )
            // InternalMROS.g:411:2: iv_ruleResultType= ruleResultType EOF
            {
             newCompositeNode(grammarAccess.getResultTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResultType=ruleResultType();

            state._fsp--;

             current =iv_ruleResultType; 
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
    // $ANTLR end "entryRuleResultType"


    // $ANTLR start "ruleResultType"
    // InternalMROS.g:417:1: ruleResultType returns [EObject current=null] : (this_SUCCESS_0= ruleSUCCESS | this_ERROR_1= ruleERROR | this_INPROGRESS_2= ruleINPROGRESS ) ;
    public final EObject ruleResultType() throws RecognitionException {
        EObject current = null;

        EObject this_SUCCESS_0 = null;

        EObject this_ERROR_1 = null;

        EObject this_INPROGRESS_2 = null;



        	enterRule();

        try {
            // InternalMROS.g:423:2: ( (this_SUCCESS_0= ruleSUCCESS | this_ERROR_1= ruleERROR | this_INPROGRESS_2= ruleINPROGRESS ) )
            // InternalMROS.g:424:2: (this_SUCCESS_0= ruleSUCCESS | this_ERROR_1= ruleERROR | this_INPROGRESS_2= ruleINPROGRESS )
            {
            // InternalMROS.g:424:2: (this_SUCCESS_0= ruleSUCCESS | this_ERROR_1= ruleERROR | this_INPROGRESS_2= ruleINPROGRESS )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMROS.g:425:3: this_SUCCESS_0= ruleSUCCESS
                    {

                    			newCompositeNode(grammarAccess.getResultTypeAccess().getSUCCESSParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SUCCESS_0=ruleSUCCESS();

                    state._fsp--;


                    			current = this_SUCCESS_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMROS.g:434:3: this_ERROR_1= ruleERROR
                    {

                    			newCompositeNode(grammarAccess.getResultTypeAccess().getERRORParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ERROR_1=ruleERROR();

                    state._fsp--;


                    			current = this_ERROR_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMROS.g:443:3: this_INPROGRESS_2= ruleINPROGRESS
                    {

                    			newCompositeNode(grammarAccess.getResultTypeAccess().getINPROGRESSParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_INPROGRESS_2=ruleINPROGRESS();

                    state._fsp--;


                    			current = this_INPROGRESS_2;
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
    // $ANTLR end "ruleResultType"


    // $ANTLR start "entryRuleSUCCESS"
    // InternalMROS.g:455:1: entryRuleSUCCESS returns [EObject current=null] : iv_ruleSUCCESS= ruleSUCCESS EOF ;
    public final EObject entryRuleSUCCESS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUCCESS = null;


        try {
            // InternalMROS.g:455:48: (iv_ruleSUCCESS= ruleSUCCESS EOF )
            // InternalMROS.g:456:2: iv_ruleSUCCESS= ruleSUCCESS EOF
            {
             newCompositeNode(grammarAccess.getSUCCESSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSUCCESS=ruleSUCCESS();

            state._fsp--;

             current =iv_ruleSUCCESS; 
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
    // $ANTLR end "entryRuleSUCCESS"


    // $ANTLR start "ruleSUCCESS"
    // InternalMROS.g:462:1: ruleSUCCESS returns [EObject current=null] : (otherlv_0= 'success' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? ) ;
    public final EObject ruleSUCCESS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:468:2: ( (otherlv_0= 'success' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? ) )
            // InternalMROS.g:469:2: (otherlv_0= 'success' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? )
            {
            // InternalMROS.g:469:2: (otherlv_0= 'success' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? )
            // InternalMROS.g:470:3: otherlv_0= 'success' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSUCCESSAccess().getSuccessKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSUCCESSAccess().getColonKeyword_1());
            		
            // InternalMROS.g:478:3: ( (lv_value_2_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMROS.g:479:4: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalMROS.g:479:4: (lv_value_2_0= RULE_STRING )
                    // InternalMROS.g:480:5: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getSUCCESSAccess().getValueSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSUCCESSRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMROS.g:496:3: ( (lv_value_3_0= ruleDouble ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==50) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMROS.g:497:4: (lv_value_3_0= ruleDouble )
                    {
                    // InternalMROS.g:497:4: (lv_value_3_0= ruleDouble )
                    // InternalMROS.g:498:5: lv_value_3_0= ruleDouble
                    {

                    					newCompositeNode(grammarAccess.getSUCCESSAccess().getValueDoubleParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSUCCESSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.xtext.mros.mros.MROS.Double");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleSUCCESS"


    // $ANTLR start "entryRuleERROR"
    // InternalMROS.g:519:1: entryRuleERROR returns [EObject current=null] : iv_ruleERROR= ruleERROR EOF ;
    public final EObject entryRuleERROR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERROR = null;


        try {
            // InternalMROS.g:519:46: (iv_ruleERROR= ruleERROR EOF )
            // InternalMROS.g:520:2: iv_ruleERROR= ruleERROR EOF
            {
             newCompositeNode(grammarAccess.getERRORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERROR=ruleERROR();

            state._fsp--;

             current =iv_ruleERROR; 
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
    // $ANTLR end "entryRuleERROR"


    // $ANTLR start "ruleERROR"
    // InternalMROS.g:526:1: ruleERROR returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? ) ;
    public final EObject ruleERROR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:532:2: ( (otherlv_0= 'error' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? ) )
            // InternalMROS.g:533:2: (otherlv_0= 'error' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? )
            {
            // InternalMROS.g:533:2: (otherlv_0= 'error' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? )
            // InternalMROS.g:534:3: otherlv_0= 'error' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getERRORAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getERRORAccess().getColonKeyword_1());
            		
            // InternalMROS.g:542:3: ( (lv_value_2_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMROS.g:543:4: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalMROS.g:543:4: (lv_value_2_0= RULE_STRING )
                    // InternalMROS.g:544:5: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getERRORAccess().getValueSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getERRORRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMROS.g:560:3: ( (lv_value_3_0= ruleDouble ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT||LA13_0==50) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMROS.g:561:4: (lv_value_3_0= ruleDouble )
                    {
                    // InternalMROS.g:561:4: (lv_value_3_0= ruleDouble )
                    // InternalMROS.g:562:5: lv_value_3_0= ruleDouble
                    {

                    					newCompositeNode(grammarAccess.getERRORAccess().getValueDoubleParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getERRORRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.xtext.mros.mros.MROS.Double");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleERROR"


    // $ANTLR start "entryRuleINPROGRESS"
    // InternalMROS.g:583:1: entryRuleINPROGRESS returns [EObject current=null] : iv_ruleINPROGRESS= ruleINPROGRESS EOF ;
    public final EObject entryRuleINPROGRESS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINPROGRESS = null;


        try {
            // InternalMROS.g:583:51: (iv_ruleINPROGRESS= ruleINPROGRESS EOF )
            // InternalMROS.g:584:2: iv_ruleINPROGRESS= ruleINPROGRESS EOF
            {
             newCompositeNode(grammarAccess.getINPROGRESSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINPROGRESS=ruleINPROGRESS();

            state._fsp--;

             current =iv_ruleINPROGRESS; 
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
    // $ANTLR end "entryRuleINPROGRESS"


    // $ANTLR start "ruleINPROGRESS"
    // InternalMROS.g:590:1: ruleINPROGRESS returns [EObject current=null] : (otherlv_0= 'inprogress' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? ) ;
    public final EObject ruleINPROGRESS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:596:2: ( (otherlv_0= 'inprogress' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? ) )
            // InternalMROS.g:597:2: (otherlv_0= 'inprogress' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? )
            {
            // InternalMROS.g:597:2: (otherlv_0= 'inprogress' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? )
            // InternalMROS.g:598:3: otherlv_0= 'inprogress' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getINPROGRESSAccess().getInprogressKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getINPROGRESSAccess().getColonKeyword_1());
            		
            // InternalMROS.g:606:3: ( (lv_value_2_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMROS.g:607:4: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalMROS.g:607:4: (lv_value_2_0= RULE_STRING )
                    // InternalMROS.g:608:5: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getINPROGRESSAccess().getValueSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getINPROGRESSRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMROS.g:624:3: ( (lv_value_3_0= ruleDouble ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==50) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMROS.g:625:4: (lv_value_3_0= ruleDouble )
                    {
                    // InternalMROS.g:625:4: (lv_value_3_0= ruleDouble )
                    // InternalMROS.g:626:5: lv_value_3_0= ruleDouble
                    {

                    					newCompositeNode(grammarAccess.getINPROGRESSAccess().getValueDoubleParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getINPROGRESSRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.xtext.mros.mros.MROS.Double");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleINPROGRESS"


    // $ANTLR start "entryRuleQualityAttribute"
    // InternalMROS.g:647:1: entryRuleQualityAttribute returns [EObject current=null] : iv_ruleQualityAttribute= ruleQualityAttribute EOF ;
    public final EObject entryRuleQualityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityAttribute = null;


        try {
            // InternalMROS.g:647:57: (iv_ruleQualityAttribute= ruleQualityAttribute EOF )
            // InternalMROS.g:648:2: iv_ruleQualityAttribute= ruleQualityAttribute EOF
            {
             newCompositeNode(grammarAccess.getQualityAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityAttribute=ruleQualityAttribute();

            state._fsp--;

             current =iv_ruleQualityAttribute; 
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
    // $ANTLR end "entryRuleQualityAttribute"


    // $ANTLR start "ruleQualityAttribute"
    // InternalMROS.g:654:1: ruleQualityAttribute returns [EObject current=null] : ( ( (lv_name_0_1= 'safety' | lv_name_0_2= 'performance' | lv_name_0_3= 'energy' ) ) ) ;
    public final EObject ruleQualityAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalMROS.g:660:2: ( ( ( (lv_name_0_1= 'safety' | lv_name_0_2= 'performance' | lv_name_0_3= 'energy' ) ) ) )
            // InternalMROS.g:661:2: ( ( (lv_name_0_1= 'safety' | lv_name_0_2= 'performance' | lv_name_0_3= 'energy' ) ) )
            {
            // InternalMROS.g:661:2: ( ( (lv_name_0_1= 'safety' | lv_name_0_2= 'performance' | lv_name_0_3= 'energy' ) ) )
            // InternalMROS.g:662:3: ( (lv_name_0_1= 'safety' | lv_name_0_2= 'performance' | lv_name_0_3= 'energy' ) )
            {
            // InternalMROS.g:662:3: ( (lv_name_0_1= 'safety' | lv_name_0_2= 'performance' | lv_name_0_3= 'energy' ) )
            // InternalMROS.g:663:4: (lv_name_0_1= 'safety' | lv_name_0_2= 'performance' | lv_name_0_3= 'energy' )
            {
            // InternalMROS.g:663:4: (lv_name_0_1= 'safety' | lv_name_0_2= 'performance' | lv_name_0_3= 'energy' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 28:
                {
                alt16=2;
                }
                break;
            case 29:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMROS.g:664:5: lv_name_0_1= 'safety'
                    {
                    lv_name_0_1=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getQualityAttributeAccess().getNameSafetyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQualityAttributeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMROS.g:675:5: lv_name_0_2= 'performance'
                    {
                    lv_name_0_2=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getQualityAttributeAccess().getNamePerformanceKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQualityAttributeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMROS.g:686:5: lv_name_0_3= 'energy'
                    {
                    lv_name_0_3=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getQualityAttributeAccess().getNameEnergyKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQualityAttributeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleQualityAttribute"


    // $ANTLR start "entryRuleSkillRealization"
    // InternalMROS.g:702:1: entryRuleSkillRealization returns [EObject current=null] : iv_ruleSkillRealization= ruleSkillRealization EOF ;
    public final EObject entryRuleSkillRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkillRealization = null;


        try {
            // InternalMROS.g:702:57: (iv_ruleSkillRealization= ruleSkillRealization EOF )
            // InternalMROS.g:703:2: iv_ruleSkillRealization= ruleSkillRealization EOF
            {
             newCompositeNode(grammarAccess.getSkillRealizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkillRealization=ruleSkillRealization();

            state._fsp--;

             current =iv_ruleSkillRealization; 
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
    // $ANTLR end "entryRuleSkillRealization"


    // $ANTLR start "ruleSkillRealization"
    // InternalMROS.g:709:1: ruleSkillRealization returns [EObject current=null] : (otherlv_0= 'Realization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_c_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_c_5_0= ruleComponent ) ) )* (otherlv_6= 'Quality' otherlv_7= '[' ( (lv_q_8_0= ruleQualityModel ) ) (otherlv_9= ',' ( (lv_q_10_0= ruleQualityModel ) ) )* otherlv_11= ']' otherlv_12= ';' )? ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleSkillRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_c_3_0 = null;

        EObject lv_c_5_0 = null;

        EObject lv_q_8_0 = null;

        EObject lv_q_10_0 = null;

        EObject lv_context_13_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:715:2: ( (otherlv_0= 'Realization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_c_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_c_5_0= ruleComponent ) ) )* (otherlv_6= 'Quality' otherlv_7= '[' ( (lv_q_8_0= ruleQualityModel ) ) (otherlv_9= ',' ( (lv_q_10_0= ruleQualityModel ) ) )* otherlv_11= ']' otherlv_12= ';' )? ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' otherlv_15= ';' ) )
            // InternalMROS.g:716:2: (otherlv_0= 'Realization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_c_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_c_5_0= ruleComponent ) ) )* (otherlv_6= 'Quality' otherlv_7= '[' ( (lv_q_8_0= ruleQualityModel ) ) (otherlv_9= ',' ( (lv_q_10_0= ruleQualityModel ) ) )* otherlv_11= ']' otherlv_12= ';' )? ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalMROS.g:716:2: (otherlv_0= 'Realization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_c_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_c_5_0= ruleComponent ) ) )* (otherlv_6= 'Quality' otherlv_7= '[' ( (lv_q_8_0= ruleQualityModel ) ) (otherlv_9= ',' ( (lv_q_10_0= ruleQualityModel ) ) )* otherlv_11= ']' otherlv_12= ';' )? ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' otherlv_15= ';' )
            // InternalMROS.g:717:3: otherlv_0= 'Realization' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_c_3_0= ruleComponent ) ) (otherlv_4= ',' ( (lv_c_5_0= ruleComponent ) ) )* (otherlv_6= 'Quality' otherlv_7= '[' ( (lv_q_8_0= ruleQualityModel ) ) (otherlv_9= ',' ( (lv_q_10_0= ruleQualityModel ) ) )* otherlv_11= ']' otherlv_12= ';' )? ( (lv_context_13_0= ruleContext ) ) otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillRealizationAccess().getRealizationKeyword_0());
            		
            // InternalMROS.g:721:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMROS.g:722:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMROS.g:722:4: (lv_name_1_0= RULE_ID )
            // InternalMROS.g:723:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSkillRealizationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRealizationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSkillRealizationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMROS.g:743:3: ( (lv_c_3_0= ruleComponent ) )
            // InternalMROS.g:744:4: (lv_c_3_0= ruleComponent )
            {
            // InternalMROS.g:744:4: (lv_c_3_0= ruleComponent )
            // InternalMROS.g:745:5: lv_c_3_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getSkillRealizationAccess().getCComponentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_c_3_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillRealizationRule());
            					}
            					add(
            						current,
            						"c",
            						lv_c_3_0,
            						"org.xtext.mros.mros.MROS.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMROS.g:762:3: (otherlv_4= ',' ( (lv_c_5_0= ruleComponent ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMROS.g:763:4: otherlv_4= ',' ( (lv_c_5_0= ruleComponent ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSkillRealizationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMROS.g:767:4: ( (lv_c_5_0= ruleComponent ) )
            	    // InternalMROS.g:768:5: (lv_c_5_0= ruleComponent )
            	    {
            	    // InternalMROS.g:768:5: (lv_c_5_0= ruleComponent )
            	    // InternalMROS.g:769:6: lv_c_5_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getSkillRealizationAccess().getCComponentParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_c_5_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSkillRealizationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"c",
            	    							lv_c_5_0,
            	    							"org.xtext.mros.mros.MROS.Component");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalMROS.g:787:3: (otherlv_6= 'Quality' otherlv_7= '[' ( (lv_q_8_0= ruleQualityModel ) ) (otherlv_9= ',' ( (lv_q_10_0= ruleQualityModel ) ) )* otherlv_11= ']' otherlv_12= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMROS.g:788:4: otherlv_6= 'Quality' otherlv_7= '[' ( (lv_q_8_0= ruleQualityModel ) ) (otherlv_9= ',' ( (lv_q_10_0= ruleQualityModel ) ) )* otherlv_11= ']' otherlv_12= ';'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSkillRealizationAccess().getQualityKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getSkillRealizationAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalMROS.g:796:4: ( (lv_q_8_0= ruleQualityModel ) )
                    // InternalMROS.g:797:5: (lv_q_8_0= ruleQualityModel )
                    {
                    // InternalMROS.g:797:5: (lv_q_8_0= ruleQualityModel )
                    // InternalMROS.g:798:6: lv_q_8_0= ruleQualityModel
                    {

                    						newCompositeNode(grammarAccess.getSkillRealizationAccess().getQQualityModelParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_q_8_0=ruleQualityModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSkillRealizationRule());
                    						}
                    						add(
                    							current,
                    							"q",
                    							lv_q_8_0,
                    							"org.xtext.mros.mros.MROS.QualityModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMROS.g:815:4: (otherlv_9= ',' ( (lv_q_10_0= ruleQualityModel ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==18) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMROS.g:816:5: otherlv_9= ',' ( (lv_q_10_0= ruleQualityModel ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSkillRealizationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMROS.g:820:5: ( (lv_q_10_0= ruleQualityModel ) )
                    	    // InternalMROS.g:821:6: (lv_q_10_0= ruleQualityModel )
                    	    {
                    	    // InternalMROS.g:821:6: (lv_q_10_0= ruleQualityModel )
                    	    // InternalMROS.g:822:7: lv_q_10_0= ruleQualityModel
                    	    {

                    	    							newCompositeNode(grammarAccess.getSkillRealizationAccess().getQQualityModelParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_q_10_0=ruleQualityModel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSkillRealizationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"q",
                    	    								lv_q_10_0,
                    	    								"org.xtext.mros.mros.MROS.QualityModel");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getSkillRealizationAccess().getRightSquareBracketKeyword_5_4());
                    			
                    otherlv_12=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getSkillRealizationAccess().getSemicolonKeyword_5_5());
                    			

                    }
                    break;

            }

            // InternalMROS.g:849:3: ( (lv_context_13_0= ruleContext ) )
            // InternalMROS.g:850:4: (lv_context_13_0= ruleContext )
            {
            // InternalMROS.g:850:4: (lv_context_13_0= ruleContext )
            // InternalMROS.g:851:5: lv_context_13_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getSkillRealizationAccess().getContextContextParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_context_13_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillRealizationRule());
            					}
            					set(
            						current,
            						"context",
            						lv_context_13_0,
            						"org.xtext.mros.mros.MROS.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_14, grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_15=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSkillRealizationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleSkillRealization"


    // $ANTLR start "entryRuleContext"
    // InternalMROS.g:880:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalMROS.g:880:48: (iv_ruleContext= ruleContext EOF )
            // InternalMROS.g:881:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalMROS.g:887:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context:' ( (lv_type_1_0= ruleContextType ) ) ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:893:2: ( (otherlv_0= 'context:' ( (lv_type_1_0= ruleContextType ) ) ) )
            // InternalMROS.g:894:2: (otherlv_0= 'context:' ( (lv_type_1_0= ruleContextType ) ) )
            {
            // InternalMROS.g:894:2: (otherlv_0= 'context:' ( (lv_type_1_0= ruleContextType ) ) )
            // InternalMROS.g:895:3: otherlv_0= 'context:' ( (lv_type_1_0= ruleContextType ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
            		
            // InternalMROS.g:899:3: ( (lv_type_1_0= ruleContextType ) )
            // InternalMROS.g:900:4: (lv_type_1_0= ruleContextType )
            {
            // InternalMROS.g:900:4: (lv_type_1_0= ruleContextType )
            // InternalMROS.g:901:5: lv_type_1_0= ruleContextType
            {

            					newCompositeNode(grammarAccess.getContextAccess().getTypeContextTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleContextType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.mros.mros.MROS.ContextType");
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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleContextType"
    // InternalMROS.g:922:1: entryRuleContextType returns [String current=null] : iv_ruleContextType= ruleContextType EOF ;
    public final String entryRuleContextType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContextType = null;


        try {
            // InternalMROS.g:922:51: (iv_ruleContextType= ruleContextType EOF )
            // InternalMROS.g:923:2: iv_ruleContextType= ruleContextType EOF
            {
             newCompositeNode(grammarAccess.getContextTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextType=ruleContextType();

            state._fsp--;

             current =iv_ruleContextType.getText(); 
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
    // $ANTLR end "entryRuleContextType"


    // $ANTLR start "ruleContextType"
    // InternalMROS.g:929:1: ruleContextType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Default' | kw= 'BatteryCharging' | kw= 'OnChargingStation' ) ;
    public final AntlrDatatypeRuleToken ruleContextType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMROS.g:935:2: ( (kw= 'Default' | kw= 'BatteryCharging' | kw= 'OnChargingStation' ) )
            // InternalMROS.g:936:2: (kw= 'Default' | kw= 'BatteryCharging' | kw= 'OnChargingStation' )
            {
            // InternalMROS.g:936:2: (kw= 'Default' | kw= 'BatteryCharging' | kw= 'OnChargingStation' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case 36:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMROS.g:937:3: kw= 'Default'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContextTypeAccess().getDefaultKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMROS.g:943:3: kw= 'BatteryCharging'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContextTypeAccess().getBatteryChargingKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMROS.g:949:3: kw= 'OnChargingStation'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContextTypeAccess().getOnChargingStationKeyword_2());
                    		

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
    // $ANTLR end "ruleContextType"


    // $ANTLR start "entryRuleQualityModel"
    // InternalMROS.g:958:1: entryRuleQualityModel returns [EObject current=null] : iv_ruleQualityModel= ruleQualityModel EOF ;
    public final EObject entryRuleQualityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityModel = null;


        try {
            // InternalMROS.g:958:53: (iv_ruleQualityModel= ruleQualityModel EOF )
            // InternalMROS.g:959:2: iv_ruleQualityModel= ruleQualityModel EOF
            {
             newCompositeNode(grammarAccess.getQualityModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityModel=ruleQualityModel();

            state._fsp--;

             current =iv_ruleQualityModel; 
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
    // $ANTLR end "entryRuleQualityModel"


    // $ANTLR start "ruleQualityModel"
    // InternalMROS.g:965:1: ruleQualityModel returns [EObject current=null] : ( ( (lv_qa_0_0= ruleQualityAttribute ) ) otherlv_1= ':' ( (lv_qvalue_2_0= ruleDouble ) ) (otherlv_3= '<' ( (lv_e_4_0= ruleEnvironment ) ) otherlv_5= '>' )* ) ;
    public final EObject ruleQualityModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_qa_0_0 = null;

        AntlrDatatypeRuleToken lv_qvalue_2_0 = null;

        EObject lv_e_4_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:971:2: ( ( ( (lv_qa_0_0= ruleQualityAttribute ) ) otherlv_1= ':' ( (lv_qvalue_2_0= ruleDouble ) ) (otherlv_3= '<' ( (lv_e_4_0= ruleEnvironment ) ) otherlv_5= '>' )* ) )
            // InternalMROS.g:972:2: ( ( (lv_qa_0_0= ruleQualityAttribute ) ) otherlv_1= ':' ( (lv_qvalue_2_0= ruleDouble ) ) (otherlv_3= '<' ( (lv_e_4_0= ruleEnvironment ) ) otherlv_5= '>' )* )
            {
            // InternalMROS.g:972:2: ( ( (lv_qa_0_0= ruleQualityAttribute ) ) otherlv_1= ':' ( (lv_qvalue_2_0= ruleDouble ) ) (otherlv_3= '<' ( (lv_e_4_0= ruleEnvironment ) ) otherlv_5= '>' )* )
            // InternalMROS.g:973:3: ( (lv_qa_0_0= ruleQualityAttribute ) ) otherlv_1= ':' ( (lv_qvalue_2_0= ruleDouble ) ) (otherlv_3= '<' ( (lv_e_4_0= ruleEnvironment ) ) otherlv_5= '>' )*
            {
            // InternalMROS.g:973:3: ( (lv_qa_0_0= ruleQualityAttribute ) )
            // InternalMROS.g:974:4: (lv_qa_0_0= ruleQualityAttribute )
            {
            // InternalMROS.g:974:4: (lv_qa_0_0= ruleQualityAttribute )
            // InternalMROS.g:975:5: lv_qa_0_0= ruleQualityAttribute
            {

            					newCompositeNode(grammarAccess.getQualityModelAccess().getQaQualityAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_qa_0_0=ruleQualityAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityModelRule());
            					}
            					set(
            						current,
            						"qa",
            						lv_qa_0_0,
            						"org.xtext.mros.mros.MROS.QualityAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getQualityModelAccess().getColonKeyword_1());
            		
            // InternalMROS.g:996:3: ( (lv_qvalue_2_0= ruleDouble ) )
            // InternalMROS.g:997:4: (lv_qvalue_2_0= ruleDouble )
            {
            // InternalMROS.g:997:4: (lv_qvalue_2_0= ruleDouble )
            // InternalMROS.g:998:5: lv_qvalue_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getQualityModelAccess().getQvalueDoubleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_qvalue_2_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityModelRule());
            					}
            					set(
            						current,
            						"qvalue",
            						lv_qvalue_2_0,
            						"org.xtext.mros.mros.MROS.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMROS.g:1015:3: (otherlv_3= '<' ( (lv_e_4_0= ruleEnvironment ) ) otherlv_5= '>' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMROS.g:1016:4: otherlv_3= '<' ( (lv_e_4_0= ruleEnvironment ) ) otherlv_5= '>'
            	    {
            	    otherlv_3=(Token)match(input,37,FOLLOW_25); 

            	    				newLeafNode(otherlv_3, grammarAccess.getQualityModelAccess().getLessThanSignKeyword_3_0());
            	    			
            	    // InternalMROS.g:1020:4: ( (lv_e_4_0= ruleEnvironment ) )
            	    // InternalMROS.g:1021:5: (lv_e_4_0= ruleEnvironment )
            	    {
            	    // InternalMROS.g:1021:5: (lv_e_4_0= ruleEnvironment )
            	    // InternalMROS.g:1022:6: lv_e_4_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getQualityModelAccess().getEEnvironmentParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_e_4_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualityModelRule());
            	    						}
            	    						set(
            	    							current,
            	    							"e",
            	    							lv_e_4_0,
            	    							"org.xtext.mros.mros.MROS.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,38,FOLLOW_24); 

            	    				newLeafNode(otherlv_5, grammarAccess.getQualityModelAccess().getGreaterThanSignKeyword_3_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleQualityModel"


    // $ANTLR start "entryRuleComponent"
    // InternalMROS.g:1048:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMROS.g:1048:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMROS.g:1049:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMROS.g:1055:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observable_2_0= 'observable' ) )? otherlv_3= '{' ( (lv_p_4_0= ruleConfiguration ) ) (otherlv_5= ',' ( (lv_p_6_0= ruleConfiguration ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_observable_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_p_4_0 = null;

        EObject lv_p_6_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1061:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observable_2_0= 'observable' ) )? otherlv_3= '{' ( (lv_p_4_0= ruleConfiguration ) ) (otherlv_5= ',' ( (lv_p_6_0= ruleConfiguration ) ) )* otherlv_7= '}' ) )
            // InternalMROS.g:1062:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observable_2_0= 'observable' ) )? otherlv_3= '{' ( (lv_p_4_0= ruleConfiguration ) ) (otherlv_5= ',' ( (lv_p_6_0= ruleConfiguration ) ) )* otherlv_7= '}' )
            {
            // InternalMROS.g:1062:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observable_2_0= 'observable' ) )? otherlv_3= '{' ( (lv_p_4_0= ruleConfiguration ) ) (otherlv_5= ',' ( (lv_p_6_0= ruleConfiguration ) ) )* otherlv_7= '}' )
            // InternalMROS.g:1063:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_observable_2_0= 'observable' ) )? otherlv_3= '{' ( (lv_p_4_0= ruleConfiguration ) ) (otherlv_5= ',' ( (lv_p_6_0= ruleConfiguration ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalMROS.g:1067:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMROS.g:1068:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMROS.g:1068:4: (lv_name_1_0= RULE_ID )
            // InternalMROS.g:1069:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMROS.g:1085:3: ( (lv_observable_2_0= 'observable' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMROS.g:1086:4: (lv_observable_2_0= 'observable' )
                    {
                    // InternalMROS.g:1086:4: (lv_observable_2_0= 'observable' )
                    // InternalMROS.g:1087:5: lv_observable_2_0= 'observable'
                    {
                    lv_observable_2_0=(Token)match(input,40,FOLLOW_3); 

                    					newLeafNode(lv_observable_2_0, grammarAccess.getComponentAccess().getObservableObservableKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "observable", true, "observable");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMROS.g:1103:3: ( (lv_p_4_0= ruleConfiguration ) )
            // InternalMROS.g:1104:4: (lv_p_4_0= ruleConfiguration )
            {
            // InternalMROS.g:1104:4: (lv_p_4_0= ruleConfiguration )
            // InternalMROS.g:1105:5: lv_p_4_0= ruleConfiguration
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getPConfigurationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_p_4_0=ruleConfiguration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					add(
            						current,
            						"p",
            						lv_p_4_0,
            						"org.xtext.mros.mros.MROS.Configuration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMROS.g:1122:3: (otherlv_5= ',' ( (lv_p_6_0= ruleConfiguration ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMROS.g:1123:4: otherlv_5= ',' ( (lv_p_6_0= ruleConfiguration ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_28); 

            	    				newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMROS.g:1127:4: ( (lv_p_6_0= ruleConfiguration ) )
            	    // InternalMROS.g:1128:5: (lv_p_6_0= ruleConfiguration )
            	    {
            	    // InternalMROS.g:1128:5: (lv_p_6_0= ruleConfiguration )
            	    // InternalMROS.g:1129:6: lv_p_6_0= ruleConfiguration
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getPConfigurationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_p_6_0=ruleConfiguration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"p",
            	    							lv_p_6_0,
            	    							"org.xtext.mros.mros.MROS.Configuration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConfiguration"
    // InternalMROS.g:1155:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalMROS.g:1155:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalMROS.g:1156:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalMROS.g:1162:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleQualifiedMode ) ) (otherlv_2= '{' ( (lv_p_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_p_5_0= ruleParameter ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_p_3_0 = null;

        EObject lv_p_5_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1168:2: ( (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleQualifiedMode ) ) (otherlv_2= '{' ( (lv_p_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_p_5_0= ruleParameter ) ) )* otherlv_6= '}' )? ) )
            // InternalMROS.g:1169:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleQualifiedMode ) ) (otherlv_2= '{' ( (lv_p_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_p_5_0= ruleParameter ) ) )* otherlv_6= '}' )? )
            {
            // InternalMROS.g:1169:2: (otherlv_0= 'Configuration' ( (lv_name_1_0= ruleQualifiedMode ) ) (otherlv_2= '{' ( (lv_p_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_p_5_0= ruleParameter ) ) )* otherlv_6= '}' )? )
            // InternalMROS.g:1170:3: otherlv_0= 'Configuration' ( (lv_name_1_0= ruleQualifiedMode ) ) (otherlv_2= '{' ( (lv_p_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_p_5_0= ruleParameter ) ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
            		
            // InternalMROS.g:1174:3: ( (lv_name_1_0= ruleQualifiedMode ) )
            // InternalMROS.g:1175:4: (lv_name_1_0= ruleQualifiedMode )
            {
            // InternalMROS.g:1175:4: (lv_name_1_0= ruleQualifiedMode )
            // InternalMROS.g:1176:5: lv_name_1_0= ruleQualifiedMode
            {

            					newCompositeNode(grammarAccess.getConfigurationAccess().getNameQualifiedModeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_1_0=ruleQualifiedMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mros.mros.MROS.QualifiedMode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMROS.g:1193:3: (otherlv_2= '{' ( (lv_p_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_p_5_0= ruleParameter ) ) )* otherlv_6= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMROS.g:1194:4: otherlv_2= '{' ( (lv_p_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_p_5_0= ruleParameter ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalMROS.g:1198:4: ( (lv_p_3_0= ruleParameter ) )
                    // InternalMROS.g:1199:5: (lv_p_3_0= ruleParameter )
                    {
                    // InternalMROS.g:1199:5: (lv_p_3_0= ruleParameter )
                    // InternalMROS.g:1200:6: lv_p_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getConfigurationAccess().getPParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_p_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    						}
                    						add(
                    							current,
                    							"p",
                    							lv_p_3_0,
                    							"org.xtext.mros.mros.MROS.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMROS.g:1217:4: (otherlv_4= ',' ( (lv_p_5_0= ruleParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==18) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMROS.g:1218:5: otherlv_4= ',' ( (lv_p_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMROS.g:1222:5: ( (lv_p_5_0= ruleParameter ) )
                    	    // InternalMROS.g:1223:6: (lv_p_5_0= ruleParameter )
                    	    {
                    	    // InternalMROS.g:1223:6: (lv_p_5_0= ruleParameter )
                    	    // InternalMROS.g:1224:7: lv_p_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getConfigurationAccess().getPParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_p_5_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"p",
                    	    								lv_p_5_0,
                    	    								"org.xtext.mros.mros.MROS.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleQualifiedMode"
    // InternalMROS.g:1251:1: entryRuleQualifiedMode returns [String current=null] : iv_ruleQualifiedMode= ruleQualifiedMode EOF ;
    public final String entryRuleQualifiedMode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedMode = null;


        try {
            // InternalMROS.g:1251:53: (iv_ruleQualifiedMode= ruleQualifiedMode EOF )
            // InternalMROS.g:1252:2: iv_ruleQualifiedMode= ruleQualifiedMode EOF
            {
             newCompositeNode(grammarAccess.getQualifiedModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedMode=ruleQualifiedMode();

            state._fsp--;

             current =iv_ruleQualifiedMode.getText(); 
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
    // $ANTLR end "entryRuleQualifiedMode"


    // $ANTLR start "ruleQualifiedMode"
    // InternalMROS.g:1258:1: ruleQualifiedMode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Mode_0= ruleMode (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedMode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Mode_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1264:2: ( (this_Mode_0= ruleMode (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMROS.g:1265:2: (this_Mode_0= ruleMode (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMROS.g:1265:2: (this_Mode_0= ruleMode (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMROS.g:1266:3: this_Mode_0= ruleMode (kw= '.' this_ID_2= RULE_ID )*
            {

            			newCompositeNode(grammarAccess.getQualifiedModeAccess().getModeParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Mode_0=ruleMode();

            state._fsp--;


            			current.merge(this_Mode_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMROS.g:1276:3: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMROS.g:1277:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedModeAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedModeAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleQualifiedMode"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMROS.g:1294:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMROS.g:1294:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMROS.g:1295:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMROS.g:1301:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMROS.g:1307:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMROS.g:1308:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMROS.g:1308:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMROS.g:1309:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMROS.g:1316:3: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMROS.g:1317:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
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


    // $ANTLR start "entryRuleMode"
    // InternalMROS.g:1334:1: entryRuleMode returns [String current=null] : iv_ruleMode= ruleMode EOF ;
    public final String entryRuleMode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMode = null;


        try {
            // InternalMROS.g:1334:44: (iv_ruleMode= ruleMode EOF )
            // InternalMROS.g:1335:2: iv_ruleMode= ruleMode EOF
            {
             newCompositeNode(grammarAccess.getModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMode=ruleMode();

            state._fsp--;

             current =iv_ruleMode.getText(); 
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
    // $ANTLR end "entryRuleMode"


    // $ANTLR start "ruleMode"
    // InternalMROS.g:1341:1: ruleMode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'active' | kw= 'inactive' | kw= 'unconfigured' | kw= 'configured' ) ;
    public final AntlrDatatypeRuleToken ruleMode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMROS.g:1347:2: ( (kw= 'active' | kw= 'inactive' | kw= 'unconfigured' | kw= 'configured' ) )
            // InternalMROS.g:1348:2: (kw= 'active' | kw= 'inactive' | kw= 'unconfigured' | kw= 'configured' )
            {
            // InternalMROS.g:1348:2: (kw= 'active' | kw= 'inactive' | kw= 'unconfigured' | kw= 'configured' )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt28=1;
                }
                break;
            case 44:
                {
                alt28=2;
                }
                break;
            case 45:
                {
                alt28=3;
                }
                break;
            case 46:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMROS.g:1349:3: kw= 'active'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModeAccess().getActiveKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMROS.g:1355:3: kw= 'inactive'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModeAccess().getInactiveKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMROS.g:1361:3: kw= 'unconfigured'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModeAccess().getUnconfiguredKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMROS.g:1367:3: kw= 'configured'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModeAccess().getConfiguredKeyword_3());
                    		

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
    // $ANTLR end "ruleMode"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMROS.g:1376:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMROS.g:1376:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMROS.g:1377:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalMROS.g:1383:1: ruleEnvironment returns [EObject current=null] : (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameterlist_3_0= ruleEnvironmentParameter ) ) (otherlv_4= ',' ( (lv_parameterlist_5_0= ruleEnvironmentParameter ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterlist_3_0 = null;

        EObject lv_parameterlist_5_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1389:2: ( (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameterlist_3_0= ruleEnvironmentParameter ) ) (otherlv_4= ',' ( (lv_parameterlist_5_0= ruleEnvironmentParameter ) ) )* otherlv_6= '}' ) )
            // InternalMROS.g:1390:2: (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameterlist_3_0= ruleEnvironmentParameter ) ) (otherlv_4= ',' ( (lv_parameterlist_5_0= ruleEnvironmentParameter ) ) )* otherlv_6= '}' )
            {
            // InternalMROS.g:1390:2: (otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameterlist_3_0= ruleEnvironmentParameter ) ) (otherlv_4= ',' ( (lv_parameterlist_5_0= ruleEnvironmentParameter ) ) )* otherlv_6= '}' )
            // InternalMROS.g:1391:3: otherlv_0= 'environment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameterlist_3_0= ruleEnvironmentParameter ) ) (otherlv_4= ',' ( (lv_parameterlist_5_0= ruleEnvironmentParameter ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0());
            		
            // InternalMROS.g:1395:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMROS.g:1396:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMROS.g:1396:4: (lv_name_1_0= RULE_ID )
            // InternalMROS.g:1397:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvironmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMROS.g:1417:3: ( (lv_parameterlist_3_0= ruleEnvironmentParameter ) )
            // InternalMROS.g:1418:4: (lv_parameterlist_3_0= ruleEnvironmentParameter )
            {
            // InternalMROS.g:1418:4: (lv_parameterlist_3_0= ruleEnvironmentParameter )
            // InternalMROS.g:1419:5: lv_parameterlist_3_0= ruleEnvironmentParameter
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getParameterlistEnvironmentParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_parameterlist_3_0=ruleEnvironmentParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            					}
            					add(
            						current,
            						"parameterlist",
            						lv_parameterlist_3_0,
            						"org.xtext.mros.mros.MROS.EnvironmentParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMROS.g:1436:3: (otherlv_4= ',' ( (lv_parameterlist_5_0= ruleEnvironmentParameter ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMROS.g:1437:4: otherlv_4= ',' ( (lv_parameterlist_5_0= ruleEnvironmentParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_32); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMROS.g:1441:4: ( (lv_parameterlist_5_0= ruleEnvironmentParameter ) )
            	    // InternalMROS.g:1442:5: (lv_parameterlist_5_0= ruleEnvironmentParameter )
            	    {
            	    // InternalMROS.g:1442:5: (lv_parameterlist_5_0= ruleEnvironmentParameter )
            	    // InternalMROS.g:1443:6: lv_parameterlist_5_0= ruleEnvironmentParameter
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getParameterlistEnvironmentParameterParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_parameterlist_5_0=ruleEnvironmentParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameterlist",
            	    							lv_parameterlist_5_0,
            	    							"org.xtext.mros.mros.MROS.EnvironmentParameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleEnvironmentParameter"
    // InternalMROS.g:1469:1: entryRuleEnvironmentParameter returns [EObject current=null] : iv_ruleEnvironmentParameter= ruleEnvironmentParameter EOF ;
    public final EObject entryRuleEnvironmentParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentParameter = null;


        try {
            // InternalMROS.g:1469:61: (iv_ruleEnvironmentParameter= ruleEnvironmentParameter EOF )
            // InternalMROS.g:1470:2: iv_ruleEnvironmentParameter= ruleEnvironmentParameter EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentParameter=ruleEnvironmentParameter();

            state._fsp--;

             current =iv_ruleEnvironmentParameter; 
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
    // $ANTLR end "entryRuleEnvironmentParameter"


    // $ANTLR start "ruleEnvironmentParameter"
    // InternalMROS.g:1476:1: ruleEnvironmentParameter returns [EObject current=null] : (this_Narowness_0= ruleNarowness | this_Clutterness_1= ruleClutterness ) ;
    public final EObject ruleEnvironmentParameter() throws RecognitionException {
        EObject current = null;

        EObject this_Narowness_0 = null;

        EObject this_Clutterness_1 = null;



        	enterRule();

        try {
            // InternalMROS.g:1482:2: ( (this_Narowness_0= ruleNarowness | this_Clutterness_1= ruleClutterness ) )
            // InternalMROS.g:1483:2: (this_Narowness_0= ruleNarowness | this_Clutterness_1= ruleClutterness )
            {
            // InternalMROS.g:1483:2: (this_Narowness_0= ruleNarowness | this_Clutterness_1= ruleClutterness )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            else if ( (LA30_0==49) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMROS.g:1484:3: this_Narowness_0= ruleNarowness
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentParameterAccess().getNarownessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Narowness_0=ruleNarowness();

                    state._fsp--;


                    			current = this_Narowness_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMROS.g:1493:3: this_Clutterness_1= ruleClutterness
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentParameterAccess().getClutternessParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clutterness_1=ruleClutterness();

                    state._fsp--;


                    			current = this_Clutterness_1;
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
    // $ANTLR end "ruleEnvironmentParameter"


    // $ANTLR start "entryRuleNarowness"
    // InternalMROS.g:1505:1: entryRuleNarowness returns [EObject current=null] : iv_ruleNarowness= ruleNarowness EOF ;
    public final EObject entryRuleNarowness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNarowness = null;


        try {
            // InternalMROS.g:1505:50: (iv_ruleNarowness= ruleNarowness EOF )
            // InternalMROS.g:1506:2: iv_ruleNarowness= ruleNarowness EOF
            {
             newCompositeNode(grammarAccess.getNarownessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNarowness=ruleNarowness();

            state._fsp--;

             current =iv_ruleNarowness; 
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
    // $ANTLR end "entryRuleNarowness"


    // $ANTLR start "ruleNarowness"
    // InternalMROS.g:1512:1: ruleNarowness returns [EObject current=null] : (otherlv_0= 'narowness:' ( (lv_value_1_0= ruleDouble ) ) ) ;
    public final EObject ruleNarowness() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1518:2: ( (otherlv_0= 'narowness:' ( (lv_value_1_0= ruleDouble ) ) ) )
            // InternalMROS.g:1519:2: (otherlv_0= 'narowness:' ( (lv_value_1_0= ruleDouble ) ) )
            {
            // InternalMROS.g:1519:2: (otherlv_0= 'narowness:' ( (lv_value_1_0= ruleDouble ) ) )
            // InternalMROS.g:1520:3: otherlv_0= 'narowness:' ( (lv_value_1_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getNarownessAccess().getNarownessKeyword_0());
            		
            // InternalMROS.g:1524:3: ( (lv_value_1_0= ruleDouble ) )
            // InternalMROS.g:1525:4: (lv_value_1_0= ruleDouble )
            {
            // InternalMROS.g:1525:4: (lv_value_1_0= ruleDouble )
            // InternalMROS.g:1526:5: lv_value_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getNarownessAccess().getValueDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNarownessRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.mros.mros.MROS.Double");
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
    // $ANTLR end "ruleNarowness"


    // $ANTLR start "entryRuleClutterness"
    // InternalMROS.g:1547:1: entryRuleClutterness returns [EObject current=null] : iv_ruleClutterness= ruleClutterness EOF ;
    public final EObject entryRuleClutterness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClutterness = null;


        try {
            // InternalMROS.g:1547:52: (iv_ruleClutterness= ruleClutterness EOF )
            // InternalMROS.g:1548:2: iv_ruleClutterness= ruleClutterness EOF
            {
             newCompositeNode(grammarAccess.getClutternessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClutterness=ruleClutterness();

            state._fsp--;

             current =iv_ruleClutterness; 
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
    // $ANTLR end "entryRuleClutterness"


    // $ANTLR start "ruleClutterness"
    // InternalMROS.g:1554:1: ruleClutterness returns [EObject current=null] : (otherlv_0= 'clutterness:' ( (lv_value_1_0= ruleDouble ) ) ) ;
    public final EObject ruleClutterness() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1560:2: ( (otherlv_0= 'clutterness:' ( (lv_value_1_0= ruleDouble ) ) ) )
            // InternalMROS.g:1561:2: (otherlv_0= 'clutterness:' ( (lv_value_1_0= ruleDouble ) ) )
            {
            // InternalMROS.g:1561:2: (otherlv_0= 'clutterness:' ( (lv_value_1_0= ruleDouble ) ) )
            // InternalMROS.g:1562:3: otherlv_0= 'clutterness:' ( (lv_value_1_0= ruleDouble ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getClutternessAccess().getClutternessKeyword_0());
            		
            // InternalMROS.g:1566:3: ( (lv_value_1_0= ruleDouble ) )
            // InternalMROS.g:1567:4: (lv_value_1_0= ruleDouble )
            {
            // InternalMROS.g:1567:4: (lv_value_1_0= ruleDouble )
            // InternalMROS.g:1568:5: lv_value_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getClutternessAccess().getValueDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClutternessRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.mros.mros.MROS.Double");
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
    // $ANTLR end "ruleClutterness"


    // $ANTLR start "entryRuleParameter"
    // InternalMROS.g:1589:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMROS.g:1589:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMROS.g:1590:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMROS.g:1596:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1602:2: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? ) )
            // InternalMROS.g:1603:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? )
            {
            // InternalMROS.g:1603:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )? )
            // InternalMROS.g:1604:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )? ( (lv_value_3_0= ruleDouble ) )?
            {
            // InternalMROS.g:1604:3: ( (lv_name_0_0= ruleQualifiedName ) )
            // InternalMROS.g:1605:4: (lv_name_0_0= ruleQualifiedName )
            {
            // InternalMROS.g:1605:4: (lv_name_0_0= ruleQualifiedName )
            // InternalMROS.g:1606:5: lv_name_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.mros.mros.MROS.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalMROS.g:1627:3: ( (lv_value_2_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMROS.g:1628:4: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalMROS.g:1628:4: (lv_value_2_0= RULE_STRING )
                    // InternalMROS.g:1629:5: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMROS.g:1645:3: ( (lv_value_3_0= ruleDouble ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT||LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMROS.g:1646:4: (lv_value_3_0= ruleDouble )
                    {
                    // InternalMROS.g:1646:4: (lv_value_3_0= ruleDouble )
                    // InternalMROS.g:1647:5: lv_value_3_0= ruleDouble
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getValueDoubleParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.xtext.mros.mros.MROS.Double");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleDouble"
    // InternalMROS.g:1668:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalMROS.g:1668:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalMROS.g:1669:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalMROS.g:1675:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalMROS.g:1681:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalMROS.g:1682:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalMROS.g:1682:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalMROS.g:1683:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalMROS.g:1683:3: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMROS.g:1684:4: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_31); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1());
            		
            // InternalMROS.g:1697:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMROS.g:1698:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,42,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2_1());
                    			

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleActionType"
    // InternalMROS.g:1715:1: entryRuleActionType returns [EObject current=null] : iv_ruleActionType= ruleActionType EOF ;
    public final EObject entryRuleActionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionType = null;


        try {
            // InternalMROS.g:1715:51: (iv_ruleActionType= ruleActionType EOF )
            // InternalMROS.g:1716:2: iv_ruleActionType= ruleActionType EOF
            {
             newCompositeNode(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionType=ruleActionType();

            state._fsp--;

             current =iv_ruleActionType; 
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
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalMROS.g:1722:1: ruleActionType returns [EObject current=null] : (otherlv_0= 'ActionType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'goal' ( (lv_goal_4_0= ruleGoalDefinition ) ) )? (otherlv_5= 'result' ( (lv_result_6_0= ruleResultDefinition ) ) )? (otherlv_7= 'feedback' ( (lv_feedback_8_0= ruleFeedback ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleActionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_goal_4_0 = null;

        EObject lv_result_6_0 = null;

        EObject lv_feedback_8_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1728:2: ( (otherlv_0= 'ActionType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'goal' ( (lv_goal_4_0= ruleGoalDefinition ) ) )? (otherlv_5= 'result' ( (lv_result_6_0= ruleResultDefinition ) ) )? (otherlv_7= 'feedback' ( (lv_feedback_8_0= ruleFeedback ) ) )? otherlv_9= '}' ) )
            // InternalMROS.g:1729:2: (otherlv_0= 'ActionType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'goal' ( (lv_goal_4_0= ruleGoalDefinition ) ) )? (otherlv_5= 'result' ( (lv_result_6_0= ruleResultDefinition ) ) )? (otherlv_7= 'feedback' ( (lv_feedback_8_0= ruleFeedback ) ) )? otherlv_9= '}' )
            {
            // InternalMROS.g:1729:2: (otherlv_0= 'ActionType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'goal' ( (lv_goal_4_0= ruleGoalDefinition ) ) )? (otherlv_5= 'result' ( (lv_result_6_0= ruleResultDefinition ) ) )? (otherlv_7= 'feedback' ( (lv_feedback_8_0= ruleFeedback ) ) )? otherlv_9= '}' )
            // InternalMROS.g:1730:3: otherlv_0= 'ActionType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'goal' ( (lv_goal_4_0= ruleGoalDefinition ) ) )? (otherlv_5= 'result' ( (lv_result_6_0= ruleResultDefinition ) ) )? (otherlv_7= 'feedback' ( (lv_feedback_8_0= ruleFeedback ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionTypeAccess().getActionTypeKeyword_0());
            		
            // InternalMROS.g:1734:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMROS.g:1735:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMROS.g:1735:4: (lv_name_1_0= RULE_ID )
            // InternalMROS.g:1736:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getActionTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMROS.g:1756:3: (otherlv_3= 'goal' ( (lv_goal_4_0= ruleGoalDefinition ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMROS.g:1757:4: otherlv_3= 'goal' ( (lv_goal_4_0= ruleGoalDefinition ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionTypeAccess().getGoalKeyword_3_0());
                    			
                    // InternalMROS.g:1761:4: ( (lv_goal_4_0= ruleGoalDefinition ) )
                    // InternalMROS.g:1762:5: (lv_goal_4_0= ruleGoalDefinition )
                    {
                    // InternalMROS.g:1762:5: (lv_goal_4_0= ruleGoalDefinition )
                    // InternalMROS.g:1763:6: lv_goal_4_0= ruleGoalDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionTypeAccess().getGoalGoalDefinitionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_goal_4_0=ruleGoalDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionTypeRule());
                    						}
                    						set(
                    							current,
                    							"goal",
                    							lv_goal_4_0,
                    							"org.xtext.mros.mros.MROS.GoalDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMROS.g:1781:3: (otherlv_5= 'result' ( (lv_result_6_0= ruleResultDefinition ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMROS.g:1782:4: otherlv_5= 'result' ( (lv_result_6_0= ruleResultDefinition ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionTypeAccess().getResultKeyword_4_0());
                    			
                    // InternalMROS.g:1786:4: ( (lv_result_6_0= ruleResultDefinition ) )
                    // InternalMROS.g:1787:5: (lv_result_6_0= ruleResultDefinition )
                    {
                    // InternalMROS.g:1787:5: (lv_result_6_0= ruleResultDefinition )
                    // InternalMROS.g:1788:6: lv_result_6_0= ruleResultDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionTypeAccess().getResultResultDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_result_6_0=ruleResultDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionTypeRule());
                    						}
                    						set(
                    							current,
                    							"result",
                    							lv_result_6_0,
                    							"org.xtext.mros.mros.MROS.ResultDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMROS.g:1806:3: (otherlv_7= 'feedback' ( (lv_feedback_8_0= ruleFeedback ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMROS.g:1807:4: otherlv_7= 'feedback' ( (lv_feedback_8_0= ruleFeedback ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getActionTypeAccess().getFeedbackKeyword_5_0());
                    			
                    // InternalMROS.g:1811:4: ( (lv_feedback_8_0= ruleFeedback ) )
                    // InternalMROS.g:1812:5: (lv_feedback_8_0= ruleFeedback )
                    {
                    // InternalMROS.g:1812:5: (lv_feedback_8_0= ruleFeedback )
                    // InternalMROS.g:1813:6: lv_feedback_8_0= ruleFeedback
                    {

                    						newCompositeNode(grammarAccess.getActionTypeAccess().getFeedbackFeedbackParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_feedback_8_0=ruleFeedback();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionTypeRule());
                    						}
                    						set(
                    							current,
                    							"feedback",
                    							lv_feedback_8_0,
                    							"org.xtext.mros.mros.MROS.Feedback");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getActionTypeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleGoalDefinition"
    // InternalMROS.g:1839:1: entryRuleGoalDefinition returns [EObject current=null] : iv_ruleGoalDefinition= ruleGoalDefinition EOF ;
    public final EObject entryRuleGoalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalDefinition = null;


        try {
            // InternalMROS.g:1839:55: (iv_ruleGoalDefinition= ruleGoalDefinition EOF )
            // InternalMROS.g:1840:2: iv_ruleGoalDefinition= ruleGoalDefinition EOF
            {
             newCompositeNode(grammarAccess.getGoalDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoalDefinition=ruleGoalDefinition();

            state._fsp--;

             current =iv_ruleGoalDefinition; 
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
    // $ANTLR end "entryRuleGoalDefinition"


    // $ANTLR start "ruleGoalDefinition"
    // InternalMROS.g:1846:1: ruleGoalDefinition returns [EObject current=null] : ( (lv_goal_0_0= ruleMessageDefinition ) ) ;
    public final EObject ruleGoalDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_goal_0_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1852:2: ( ( (lv_goal_0_0= ruleMessageDefinition ) ) )
            // InternalMROS.g:1853:2: ( (lv_goal_0_0= ruleMessageDefinition ) )
            {
            // InternalMROS.g:1853:2: ( (lv_goal_0_0= ruleMessageDefinition ) )
            // InternalMROS.g:1854:3: (lv_goal_0_0= ruleMessageDefinition )
            {
            // InternalMROS.g:1854:3: (lv_goal_0_0= ruleMessageDefinition )
            // InternalMROS.g:1855:4: lv_goal_0_0= ruleMessageDefinition
            {

            				newCompositeNode(grammarAccess.getGoalDefinitionAccess().getGoalMessageDefinitionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_goal_0_0=ruleMessageDefinition();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGoalDefinitionRule());
            				}
            				set(
            					current,
            					"goal",
            					lv_goal_0_0,
            					"org.xtext.mros.mros.MROS.MessageDefinition");
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
    // $ANTLR end "ruleGoalDefinition"


    // $ANTLR start "entryRuleResultDefinition"
    // InternalMROS.g:1875:1: entryRuleResultDefinition returns [EObject current=null] : iv_ruleResultDefinition= ruleResultDefinition EOF ;
    public final EObject entryRuleResultDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultDefinition = null;


        try {
            // InternalMROS.g:1875:57: (iv_ruleResultDefinition= ruleResultDefinition EOF )
            // InternalMROS.g:1876:2: iv_ruleResultDefinition= ruleResultDefinition EOF
            {
             newCompositeNode(grammarAccess.getResultDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResultDefinition=ruleResultDefinition();

            state._fsp--;

             current =iv_ruleResultDefinition; 
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
    // $ANTLR end "entryRuleResultDefinition"


    // $ANTLR start "ruleResultDefinition"
    // InternalMROS.g:1882:1: ruleResultDefinition returns [EObject current=null] : ( (lv_result_0_0= ruleMessageDefinition ) ) ;
    public final EObject ruleResultDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_result_0_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1888:2: ( ( (lv_result_0_0= ruleMessageDefinition ) ) )
            // InternalMROS.g:1889:2: ( (lv_result_0_0= ruleMessageDefinition ) )
            {
            // InternalMROS.g:1889:2: ( (lv_result_0_0= ruleMessageDefinition ) )
            // InternalMROS.g:1890:3: (lv_result_0_0= ruleMessageDefinition )
            {
            // InternalMROS.g:1890:3: (lv_result_0_0= ruleMessageDefinition )
            // InternalMROS.g:1891:4: lv_result_0_0= ruleMessageDefinition
            {

            				newCompositeNode(grammarAccess.getResultDefinitionAccess().getResultMessageDefinitionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_result_0_0=ruleMessageDefinition();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getResultDefinitionRule());
            				}
            				set(
            					current,
            					"result",
            					lv_result_0_0,
            					"org.xtext.mros.mros.MROS.MessageDefinition");
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
    // $ANTLR end "ruleResultDefinition"


    // $ANTLR start "entryRuleFeedback"
    // InternalMROS.g:1911:1: entryRuleFeedback returns [EObject current=null] : iv_ruleFeedback= ruleFeedback EOF ;
    public final EObject entryRuleFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeedback = null;


        try {
            // InternalMROS.g:1911:49: (iv_ruleFeedback= ruleFeedback EOF )
            // InternalMROS.g:1912:2: iv_ruleFeedback= ruleFeedback EOF
            {
             newCompositeNode(grammarAccess.getFeedbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeedback=ruleFeedback();

            state._fsp--;

             current =iv_ruleFeedback; 
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
    // $ANTLR end "entryRuleFeedback"


    // $ANTLR start "ruleFeedback"
    // InternalMROS.g:1918:1: ruleFeedback returns [EObject current=null] : ( (lv_feedback_0_0= ruleMessageDefinition ) ) ;
    public final EObject ruleFeedback() throws RecognitionException {
        EObject current = null;

        EObject lv_feedback_0_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1924:2: ( ( (lv_feedback_0_0= ruleMessageDefinition ) ) )
            // InternalMROS.g:1925:2: ( (lv_feedback_0_0= ruleMessageDefinition ) )
            {
            // InternalMROS.g:1925:2: ( (lv_feedback_0_0= ruleMessageDefinition ) )
            // InternalMROS.g:1926:3: (lv_feedback_0_0= ruleMessageDefinition )
            {
            // InternalMROS.g:1926:3: (lv_feedback_0_0= ruleMessageDefinition )
            // InternalMROS.g:1927:4: lv_feedback_0_0= ruleMessageDefinition
            {

            				newCompositeNode(grammarAccess.getFeedbackAccess().getFeedbackMessageDefinitionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_feedback_0_0=ruleMessageDefinition();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFeedbackRule());
            				}
            				set(
            					current,
            					"feedback",
            					lv_feedback_0_0,
            					"org.xtext.mros.mros.MROS.MessageDefinition");
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
    // $ANTLR end "ruleFeedback"


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalMROS.g:1947:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalMROS.g:1947:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalMROS.g:1948:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
            {
             newCompositeNode(grammarAccess.getMessageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageDefinition=ruleMessageDefinition();

            state._fsp--;

             current =iv_ruleMessageDefinition; 
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
    // $ANTLR end "entryRuleMessageDefinition"


    // $ANTLR start "ruleMessageDefinition"
    // InternalMROS.g:1954:1: ruleMessageDefinition returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_MessagePart_1_0= ruleMessagePart ) ) (otherlv_2= ',' ( (lv_MessagePart_3_0= ruleMessagePart ) ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_MessagePart_1_0 = null;

        EObject lv_MessagePart_3_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:1960:2: ( (otherlv_0= '{' ( ( (lv_MessagePart_1_0= ruleMessagePart ) ) (otherlv_2= ',' ( (lv_MessagePart_3_0= ruleMessagePart ) ) )* )? otherlv_4= '}' ) )
            // InternalMROS.g:1961:2: (otherlv_0= '{' ( ( (lv_MessagePart_1_0= ruleMessagePart ) ) (otherlv_2= ',' ( (lv_MessagePart_3_0= ruleMessagePart ) ) )* )? otherlv_4= '}' )
            {
            // InternalMROS.g:1961:2: (otherlv_0= '{' ( ( (lv_MessagePart_1_0= ruleMessagePart ) ) (otherlv_2= ',' ( (lv_MessagePart_3_0= ruleMessagePart ) ) )* )? otherlv_4= '}' )
            // InternalMROS.g:1962:3: otherlv_0= '{' ( ( (lv_MessagePart_1_0= ruleMessagePart ) ) (otherlv_2= ',' ( (lv_MessagePart_3_0= ruleMessagePart ) ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMessageDefinitionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMROS.g:1966:3: ( ( (lv_MessagePart_1_0= ruleMessagePart ) ) (otherlv_2= ',' ( (lv_MessagePart_3_0= ruleMessagePart ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMROS.g:1967:4: ( (lv_MessagePart_1_0= ruleMessagePart ) ) (otherlv_2= ',' ( (lv_MessagePart_3_0= ruleMessagePart ) ) )*
                    {
                    // InternalMROS.g:1967:4: ( (lv_MessagePart_1_0= ruleMessagePart ) )
                    // InternalMROS.g:1968:5: (lv_MessagePart_1_0= ruleMessagePart )
                    {
                    // InternalMROS.g:1968:5: (lv_MessagePart_1_0= ruleMessagePart )
                    // InternalMROS.g:1969:6: lv_MessagePart_1_0= ruleMessagePart
                    {

                    						newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_MessagePart_1_0=ruleMessagePart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"MessagePart",
                    							lv_MessagePart_1_0,
                    							"org.xtext.mros.mros.MROS.MessagePart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMROS.g:1986:4: (otherlv_2= ',' ( (lv_MessagePart_3_0= ruleMessagePart ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==18) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMROS.g:1987:5: otherlv_2= ',' ( (lv_MessagePart_3_0= ruleMessagePart ) )
                    	    {
                    	    otherlv_2=(Token)match(input,18,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getMessageDefinitionAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMROS.g:1991:5: ( (lv_MessagePart_3_0= ruleMessagePart ) )
                    	    // InternalMROS.g:1992:6: (lv_MessagePart_3_0= ruleMessagePart )
                    	    {
                    	    // InternalMROS.g:1992:6: (lv_MessagePart_3_0= ruleMessagePart )
                    	    // InternalMROS.g:1993:7: lv_MessagePart_3_0= ruleMessagePart
                    	    {

                    	    							newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_MessagePart_3_0=ruleMessagePart();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMessageDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"MessagePart",
                    	    								lv_MessagePart_3_0,
                    	    								"org.xtext.mros.mros.MROS.MessagePart");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageDefinitionAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleMessageDefinition"


    // $ANTLR start "entryRuleMessagePart"
    // InternalMROS.g:2020:1: entryRuleMessagePart returns [EObject current=null] : iv_ruleMessagePart= ruleMessagePart EOF ;
    public final EObject entryRuleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessagePart = null;


        try {
            // InternalMROS.g:2020:52: (iv_ruleMessagePart= ruleMessagePart EOF )
            // InternalMROS.g:2021:2: iv_ruleMessagePart= ruleMessagePart EOF
            {
             newCompositeNode(grammarAccess.getMessagePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessagePart=ruleMessagePart();

            state._fsp--;

             current =iv_ruleMessagePart; 
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
    // $ANTLR end "entryRuleMessagePart"


    // $ANTLR start "ruleMessagePart"
    // InternalMROS.g:2027:1: ruleMessagePart returns [EObject current=null] : ( (lv_p_0_0= ruleParameterType ) ) ;
    public final EObject ruleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject lv_p_0_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:2033:2: ( ( (lv_p_0_0= ruleParameterType ) ) )
            // InternalMROS.g:2034:2: ( (lv_p_0_0= ruleParameterType ) )
            {
            // InternalMROS.g:2034:2: ( (lv_p_0_0= ruleParameterType ) )
            // InternalMROS.g:2035:3: (lv_p_0_0= ruleParameterType )
            {
            // InternalMROS.g:2035:3: (lv_p_0_0= ruleParameterType )
            // InternalMROS.g:2036:4: lv_p_0_0= ruleParameterType
            {

            				newCompositeNode(grammarAccess.getMessagePartAccess().getPParameterTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_p_0_0=ruleParameterType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMessagePartRule());
            				}
            				set(
            					current,
            					"p",
            					lv_p_0_0,
            					"org.xtext.mros.mros.MROS.ParameterType");
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
    // $ANTLR end "ruleMessagePart"


    // $ANTLR start "entryRuleParameterType"
    // InternalMROS.g:2056:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalMROS.g:2056:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalMROS.g:2057:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalMROS.g:2063:1: ruleParameterType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAbstractType ) ) ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMROS.g:2069:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAbstractType ) ) ) )
            // InternalMROS.g:2070:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAbstractType ) ) )
            {
            // InternalMROS.g:2070:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAbstractType ) ) )
            // InternalMROS.g:2071:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAbstractType ) )
            {
            // InternalMROS.g:2071:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMROS.g:2072:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMROS.g:2072:4: (lv_name_0_0= RULE_ID )
            // InternalMROS.g:2073:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterTypeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterTypeAccess().getColonKeyword_1());
            		
            // InternalMROS.g:2093:3: ( (lv_value_2_0= ruleAbstractType ) )
            // InternalMROS.g:2094:4: (lv_value_2_0= ruleAbstractType )
            {
            // InternalMROS.g:2094:4: (lv_value_2_0= ruleAbstractType )
            // InternalMROS.g:2095:5: lv_value_2_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getParameterTypeAccess().getValueAbstractTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterTypeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.mros.mros.MROS.AbstractType");
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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleAbstractType"
    // InternalMROS.g:2116:1: entryRuleAbstractType returns [String current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final String entryRuleAbstractType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstractType = null;


        try {
            // InternalMROS.g:2116:52: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalMROS.g:2117:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType.getText(); 
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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalMROS.g:2123:1: ruleAbstractType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool' | kw= 'int' | kw= 'float' | kw= 'PoseStamped' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleAbstractType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMROS.g:2129:2: ( (kw= 'bool' | kw= 'int' | kw= 'float' | kw= 'PoseStamped' | kw= 'string' ) )
            // InternalMROS.g:2130:2: (kw= 'bool' | kw= 'int' | kw= 'float' | kw= 'PoseStamped' | kw= 'string' )
            {
            // InternalMROS.g:2130:2: (kw= 'bool' | kw= 'int' | kw= 'float' | kw= 'PoseStamped' | kw= 'string' )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt40=1;
                }
                break;
            case 55:
                {
                alt40=2;
                }
                break;
            case 56:
                {
                alt40=3;
                }
                break;
            case 57:
                {
                alt40=4;
                }
                break;
            case 58:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMROS.g:2131:3: kw= 'bool'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAbstractTypeAccess().getBoolKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMROS.g:2137:3: kw= 'int'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAbstractTypeAccess().getIntKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMROS.g:2143:3: kw= 'float'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAbstractTypeAccess().getFloatKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMROS.g:2149:3: kw= 'PoseStamped'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAbstractTypeAccess().getPoseStampedKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMROS.g:2155:3: kw= 'string'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAbstractTypeAccess().getStringKeyword_4());
                    		

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
    // $ANTLR end "ruleAbstractType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000000000062L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000280040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0030000000404000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000404000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x07C0000000000000L});

}