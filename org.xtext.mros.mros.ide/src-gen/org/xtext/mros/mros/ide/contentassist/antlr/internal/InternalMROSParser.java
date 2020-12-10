package org.xtext.mros.mros.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.mros.mros.services.MROSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMROSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_MESSAGE_ASIGMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'safety'", "'performance'", "'energy'", "'Default'", "'BatteryCharging'", "'OnChargingStation'", "'active'", "'inactive'", "'unconfigured'", "'configured'", "'bool'", "'int'", "'float'", "'PoseStamped'", "'string'", "'SkillDefinitionSet'", "'{'", "'}'", "'Skill'", "'quality attributes'", "'['", "']'", "'result'", "','", "'input'", "'output'", "'success'", "':'", "'error'", "'inprogress'", "'Realization'", "';'", "'Quality'", "'context:'", "'<'", "'>'", "'Component'", "'Configuration'", "'.'", "'environment'", "'narowness:'", "'clutterness:'", "'-'", "'ActionType'", "'goal'", "'feedback'", "'observable'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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

    	public void setGrammarAccess(MROSGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMROS.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMROS.g:54:1: ( ruleModel EOF )
            // InternalMROS.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMROS.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMROS.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMROS.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMROS.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMROS.g:69:3: ( rule__Model__Group__0 )
            // InternalMROS.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSkillDefinition"
    // InternalMROS.g:78:1: entryRuleSkillDefinition : ruleSkillDefinition EOF ;
    public final void entryRuleSkillDefinition() throws RecognitionException {
        try {
            // InternalMROS.g:79:1: ( ruleSkillDefinition EOF )
            // InternalMROS.g:80:1: ruleSkillDefinition EOF
            {
             before(grammarAccess.getSkillDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSkillDefinition();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSkillDefinition"


    // $ANTLR start "ruleSkillDefinition"
    // InternalMROS.g:87:1: ruleSkillDefinition : ( ( rule__SkillDefinition__Group__0 ) ) ;
    public final void ruleSkillDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:91:2: ( ( ( rule__SkillDefinition__Group__0 ) ) )
            // InternalMROS.g:92:2: ( ( rule__SkillDefinition__Group__0 ) )
            {
            // InternalMROS.g:92:2: ( ( rule__SkillDefinition__Group__0 ) )
            // InternalMROS.g:93:3: ( rule__SkillDefinition__Group__0 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup()); 
            // InternalMROS.g:94:3: ( rule__SkillDefinition__Group__0 )
            // InternalMROS.g:94:4: rule__SkillDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkillDefinition"


    // $ANTLR start "entryRuleResultType"
    // InternalMROS.g:103:1: entryRuleResultType : ruleResultType EOF ;
    public final void entryRuleResultType() throws RecognitionException {
        try {
            // InternalMROS.g:104:1: ( ruleResultType EOF )
            // InternalMROS.g:105:1: ruleResultType EOF
            {
             before(grammarAccess.getResultTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleResultType();

            state._fsp--;

             after(grammarAccess.getResultTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResultType"


    // $ANTLR start "ruleResultType"
    // InternalMROS.g:112:1: ruleResultType : ( ( rule__ResultType__Alternatives ) ) ;
    public final void ruleResultType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:116:2: ( ( ( rule__ResultType__Alternatives ) ) )
            // InternalMROS.g:117:2: ( ( rule__ResultType__Alternatives ) )
            {
            // InternalMROS.g:117:2: ( ( rule__ResultType__Alternatives ) )
            // InternalMROS.g:118:3: ( rule__ResultType__Alternatives )
            {
             before(grammarAccess.getResultTypeAccess().getAlternatives()); 
            // InternalMROS.g:119:3: ( rule__ResultType__Alternatives )
            // InternalMROS.g:119:4: rule__ResultType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResultType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResultTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultType"


    // $ANTLR start "entryRuleSUCCESS"
    // InternalMROS.g:128:1: entryRuleSUCCESS : ruleSUCCESS EOF ;
    public final void entryRuleSUCCESS() throws RecognitionException {
        try {
            // InternalMROS.g:129:1: ( ruleSUCCESS EOF )
            // InternalMROS.g:130:1: ruleSUCCESS EOF
            {
             before(grammarAccess.getSUCCESSRule()); 
            pushFollow(FOLLOW_1);
            ruleSUCCESS();

            state._fsp--;

             after(grammarAccess.getSUCCESSRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSUCCESS"


    // $ANTLR start "ruleSUCCESS"
    // InternalMROS.g:137:1: ruleSUCCESS : ( ( rule__SUCCESS__Group__0 ) ) ;
    public final void ruleSUCCESS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:141:2: ( ( ( rule__SUCCESS__Group__0 ) ) )
            // InternalMROS.g:142:2: ( ( rule__SUCCESS__Group__0 ) )
            {
            // InternalMROS.g:142:2: ( ( rule__SUCCESS__Group__0 ) )
            // InternalMROS.g:143:3: ( rule__SUCCESS__Group__0 )
            {
             before(grammarAccess.getSUCCESSAccess().getGroup()); 
            // InternalMROS.g:144:3: ( rule__SUCCESS__Group__0 )
            // InternalMROS.g:144:4: rule__SUCCESS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SUCCESS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSUCCESSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSUCCESS"


    // $ANTLR start "entryRuleERROR"
    // InternalMROS.g:153:1: entryRuleERROR : ruleERROR EOF ;
    public final void entryRuleERROR() throws RecognitionException {
        try {
            // InternalMROS.g:154:1: ( ruleERROR EOF )
            // InternalMROS.g:155:1: ruleERROR EOF
            {
             before(grammarAccess.getERRORRule()); 
            pushFollow(FOLLOW_1);
            ruleERROR();

            state._fsp--;

             after(grammarAccess.getERRORRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleERROR"


    // $ANTLR start "ruleERROR"
    // InternalMROS.g:162:1: ruleERROR : ( ( rule__ERROR__Group__0 ) ) ;
    public final void ruleERROR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:166:2: ( ( ( rule__ERROR__Group__0 ) ) )
            // InternalMROS.g:167:2: ( ( rule__ERROR__Group__0 ) )
            {
            // InternalMROS.g:167:2: ( ( rule__ERROR__Group__0 ) )
            // InternalMROS.g:168:3: ( rule__ERROR__Group__0 )
            {
             before(grammarAccess.getERRORAccess().getGroup()); 
            // InternalMROS.g:169:3: ( rule__ERROR__Group__0 )
            // InternalMROS.g:169:4: rule__ERROR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ERROR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getERRORAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleERROR"


    // $ANTLR start "entryRuleINPROGRESS"
    // InternalMROS.g:178:1: entryRuleINPROGRESS : ruleINPROGRESS EOF ;
    public final void entryRuleINPROGRESS() throws RecognitionException {
        try {
            // InternalMROS.g:179:1: ( ruleINPROGRESS EOF )
            // InternalMROS.g:180:1: ruleINPROGRESS EOF
            {
             before(grammarAccess.getINPROGRESSRule()); 
            pushFollow(FOLLOW_1);
            ruleINPROGRESS();

            state._fsp--;

             after(grammarAccess.getINPROGRESSRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleINPROGRESS"


    // $ANTLR start "ruleINPROGRESS"
    // InternalMROS.g:187:1: ruleINPROGRESS : ( ( rule__INPROGRESS__Group__0 ) ) ;
    public final void ruleINPROGRESS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:191:2: ( ( ( rule__INPROGRESS__Group__0 ) ) )
            // InternalMROS.g:192:2: ( ( rule__INPROGRESS__Group__0 ) )
            {
            // InternalMROS.g:192:2: ( ( rule__INPROGRESS__Group__0 ) )
            // InternalMROS.g:193:3: ( rule__INPROGRESS__Group__0 )
            {
             before(grammarAccess.getINPROGRESSAccess().getGroup()); 
            // InternalMROS.g:194:3: ( rule__INPROGRESS__Group__0 )
            // InternalMROS.g:194:4: rule__INPROGRESS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__INPROGRESS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getINPROGRESSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINPROGRESS"


    // $ANTLR start "entryRuleQualityAttribute"
    // InternalMROS.g:203:1: entryRuleQualityAttribute : ruleQualityAttribute EOF ;
    public final void entryRuleQualityAttribute() throws RecognitionException {
        try {
            // InternalMROS.g:204:1: ( ruleQualityAttribute EOF )
            // InternalMROS.g:205:1: ruleQualityAttribute EOF
            {
             before(grammarAccess.getQualityAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleQualityAttribute();

            state._fsp--;

             after(grammarAccess.getQualityAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualityAttribute"


    // $ANTLR start "ruleQualityAttribute"
    // InternalMROS.g:212:1: ruleQualityAttribute : ( ( rule__QualityAttribute__NameAssignment ) ) ;
    public final void ruleQualityAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:216:2: ( ( ( rule__QualityAttribute__NameAssignment ) ) )
            // InternalMROS.g:217:2: ( ( rule__QualityAttribute__NameAssignment ) )
            {
            // InternalMROS.g:217:2: ( ( rule__QualityAttribute__NameAssignment ) )
            // InternalMROS.g:218:3: ( rule__QualityAttribute__NameAssignment )
            {
             before(grammarAccess.getQualityAttributeAccess().getNameAssignment()); 
            // InternalMROS.g:219:3: ( rule__QualityAttribute__NameAssignment )
            // InternalMROS.g:219:4: rule__QualityAttribute__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QualityAttribute__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQualityAttributeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualityAttribute"


    // $ANTLR start "entryRuleSkillRealization"
    // InternalMROS.g:228:1: entryRuleSkillRealization : ruleSkillRealization EOF ;
    public final void entryRuleSkillRealization() throws RecognitionException {
        try {
            // InternalMROS.g:229:1: ( ruleSkillRealization EOF )
            // InternalMROS.g:230:1: ruleSkillRealization EOF
            {
             before(grammarAccess.getSkillRealizationRule()); 
            pushFollow(FOLLOW_1);
            ruleSkillRealization();

            state._fsp--;

             after(grammarAccess.getSkillRealizationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSkillRealization"


    // $ANTLR start "ruleSkillRealization"
    // InternalMROS.g:237:1: ruleSkillRealization : ( ( rule__SkillRealization__Group__0 ) ) ;
    public final void ruleSkillRealization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:241:2: ( ( ( rule__SkillRealization__Group__0 ) ) )
            // InternalMROS.g:242:2: ( ( rule__SkillRealization__Group__0 ) )
            {
            // InternalMROS.g:242:2: ( ( rule__SkillRealization__Group__0 ) )
            // InternalMROS.g:243:3: ( rule__SkillRealization__Group__0 )
            {
             before(grammarAccess.getSkillRealizationAccess().getGroup()); 
            // InternalMROS.g:244:3: ( rule__SkillRealization__Group__0 )
            // InternalMROS.g:244:4: rule__SkillRealization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillRealizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkillRealization"


    // $ANTLR start "entryRuleContext"
    // InternalMROS.g:253:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalMROS.g:254:1: ( ruleContext EOF )
            // InternalMROS.g:255:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalMROS.g:262:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:266:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalMROS.g:267:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalMROS.g:267:2: ( ( rule__Context__Group__0 ) )
            // InternalMROS.g:268:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalMROS.g:269:3: ( rule__Context__Group__0 )
            // InternalMROS.g:269:4: rule__Context__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleContextType"
    // InternalMROS.g:278:1: entryRuleContextType : ruleContextType EOF ;
    public final void entryRuleContextType() throws RecognitionException {
        try {
            // InternalMROS.g:279:1: ( ruleContextType EOF )
            // InternalMROS.g:280:1: ruleContextType EOF
            {
             before(grammarAccess.getContextTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleContextType();

            state._fsp--;

             after(grammarAccess.getContextTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContextType"


    // $ANTLR start "ruleContextType"
    // InternalMROS.g:287:1: ruleContextType : ( ( rule__ContextType__Alternatives ) ) ;
    public final void ruleContextType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:291:2: ( ( ( rule__ContextType__Alternatives ) ) )
            // InternalMROS.g:292:2: ( ( rule__ContextType__Alternatives ) )
            {
            // InternalMROS.g:292:2: ( ( rule__ContextType__Alternatives ) )
            // InternalMROS.g:293:3: ( rule__ContextType__Alternatives )
            {
             before(grammarAccess.getContextTypeAccess().getAlternatives()); 
            // InternalMROS.g:294:3: ( rule__ContextType__Alternatives )
            // InternalMROS.g:294:4: rule__ContextType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContextType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContextTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextType"


    // $ANTLR start "entryRuleQualityModel"
    // InternalMROS.g:303:1: entryRuleQualityModel : ruleQualityModel EOF ;
    public final void entryRuleQualityModel() throws RecognitionException {
        try {
            // InternalMROS.g:304:1: ( ruleQualityModel EOF )
            // InternalMROS.g:305:1: ruleQualityModel EOF
            {
             before(grammarAccess.getQualityModelRule()); 
            pushFollow(FOLLOW_1);
            ruleQualityModel();

            state._fsp--;

             after(grammarAccess.getQualityModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualityModel"


    // $ANTLR start "ruleQualityModel"
    // InternalMROS.g:312:1: ruleQualityModel : ( ( rule__QualityModel__Group__0 ) ) ;
    public final void ruleQualityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:316:2: ( ( ( rule__QualityModel__Group__0 ) ) )
            // InternalMROS.g:317:2: ( ( rule__QualityModel__Group__0 ) )
            {
            // InternalMROS.g:317:2: ( ( rule__QualityModel__Group__0 ) )
            // InternalMROS.g:318:3: ( rule__QualityModel__Group__0 )
            {
             before(grammarAccess.getQualityModelAccess().getGroup()); 
            // InternalMROS.g:319:3: ( rule__QualityModel__Group__0 )
            // InternalMROS.g:319:4: rule__QualityModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualityModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualityModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualityModel"


    // $ANTLR start "entryRuleComponent"
    // InternalMROS.g:328:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMROS.g:329:1: ( ruleComponent EOF )
            // InternalMROS.g:330:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMROS.g:337:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:341:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalMROS.g:342:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalMROS.g:342:2: ( ( rule__Component__Group__0 ) )
            // InternalMROS.g:343:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalMROS.g:344:3: ( rule__Component__Group__0 )
            // InternalMROS.g:344:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConfiguration"
    // InternalMROS.g:353:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalMROS.g:354:1: ( ruleConfiguration EOF )
            // InternalMROS.g:355:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalMROS.g:362:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:366:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // InternalMROS.g:367:2: ( ( rule__Configuration__Group__0 ) )
            {
            // InternalMROS.g:367:2: ( ( rule__Configuration__Group__0 ) )
            // InternalMROS.g:368:3: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // InternalMROS.g:369:3: ( rule__Configuration__Group__0 )
            // InternalMROS.g:369:4: rule__Configuration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleQualifiedMode"
    // InternalMROS.g:378:1: entryRuleQualifiedMode : ruleQualifiedMode EOF ;
    public final void entryRuleQualifiedMode() throws RecognitionException {
        try {
            // InternalMROS.g:379:1: ( ruleQualifiedMode EOF )
            // InternalMROS.g:380:1: ruleQualifiedMode EOF
            {
             before(grammarAccess.getQualifiedModeRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedMode();

            state._fsp--;

             after(grammarAccess.getQualifiedModeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedMode"


    // $ANTLR start "ruleQualifiedMode"
    // InternalMROS.g:387:1: ruleQualifiedMode : ( ( rule__QualifiedMode__Group__0 ) ) ;
    public final void ruleQualifiedMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:391:2: ( ( ( rule__QualifiedMode__Group__0 ) ) )
            // InternalMROS.g:392:2: ( ( rule__QualifiedMode__Group__0 ) )
            {
            // InternalMROS.g:392:2: ( ( rule__QualifiedMode__Group__0 ) )
            // InternalMROS.g:393:3: ( rule__QualifiedMode__Group__0 )
            {
             before(grammarAccess.getQualifiedModeAccess().getGroup()); 
            // InternalMROS.g:394:3: ( rule__QualifiedMode__Group__0 )
            // InternalMROS.g:394:4: rule__QualifiedMode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedMode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedModeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedMode"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMROS.g:403:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMROS.g:404:1: ( ruleQualifiedName EOF )
            // InternalMROS.g:405:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMROS.g:412:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:416:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMROS.g:417:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMROS.g:417:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMROS.g:418:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMROS.g:419:3: ( rule__QualifiedName__Group__0 )
            // InternalMROS.g:419:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleMode"
    // InternalMROS.g:428:1: entryRuleMode : ruleMode EOF ;
    public final void entryRuleMode() throws RecognitionException {
        try {
            // InternalMROS.g:429:1: ( ruleMode EOF )
            // InternalMROS.g:430:1: ruleMode EOF
            {
             before(grammarAccess.getModeRule()); 
            pushFollow(FOLLOW_1);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getModeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMode"


    // $ANTLR start "ruleMode"
    // InternalMROS.g:437:1: ruleMode : ( ( rule__Mode__Alternatives ) ) ;
    public final void ruleMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:441:2: ( ( ( rule__Mode__Alternatives ) ) )
            // InternalMROS.g:442:2: ( ( rule__Mode__Alternatives ) )
            {
            // InternalMROS.g:442:2: ( ( rule__Mode__Alternatives ) )
            // InternalMROS.g:443:3: ( rule__Mode__Alternatives )
            {
             before(grammarAccess.getModeAccess().getAlternatives()); 
            // InternalMROS.g:444:3: ( rule__Mode__Alternatives )
            // InternalMROS.g:444:4: rule__Mode__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Mode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMode"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMROS.g:453:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalMROS.g:454:1: ( ruleEnvironment EOF )
            // InternalMROS.g:455:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalMROS.g:462:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:466:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalMROS.g:467:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalMROS.g:467:2: ( ( rule__Environment__Group__0 ) )
            // InternalMROS.g:468:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalMROS.g:469:3: ( rule__Environment__Group__0 )
            // InternalMROS.g:469:4: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleEnvironmentParameter"
    // InternalMROS.g:478:1: entryRuleEnvironmentParameter : ruleEnvironmentParameter EOF ;
    public final void entryRuleEnvironmentParameter() throws RecognitionException {
        try {
            // InternalMROS.g:479:1: ( ruleEnvironmentParameter EOF )
            // InternalMROS.g:480:1: ruleEnvironmentParameter EOF
            {
             before(grammarAccess.getEnvironmentParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentParameter();

            state._fsp--;

             after(grammarAccess.getEnvironmentParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnvironmentParameter"


    // $ANTLR start "ruleEnvironmentParameter"
    // InternalMROS.g:487:1: ruleEnvironmentParameter : ( ( rule__EnvironmentParameter__Alternatives ) ) ;
    public final void ruleEnvironmentParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:491:2: ( ( ( rule__EnvironmentParameter__Alternatives ) ) )
            // InternalMROS.g:492:2: ( ( rule__EnvironmentParameter__Alternatives ) )
            {
            // InternalMROS.g:492:2: ( ( rule__EnvironmentParameter__Alternatives ) )
            // InternalMROS.g:493:3: ( rule__EnvironmentParameter__Alternatives )
            {
             before(grammarAccess.getEnvironmentParameterAccess().getAlternatives()); 
            // InternalMROS.g:494:3: ( rule__EnvironmentParameter__Alternatives )
            // InternalMROS.g:494:4: rule__EnvironmentParameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironmentParameter"


    // $ANTLR start "entryRuleNarowness"
    // InternalMROS.g:503:1: entryRuleNarowness : ruleNarowness EOF ;
    public final void entryRuleNarowness() throws RecognitionException {
        try {
            // InternalMROS.g:504:1: ( ruleNarowness EOF )
            // InternalMROS.g:505:1: ruleNarowness EOF
            {
             before(grammarAccess.getNarownessRule()); 
            pushFollow(FOLLOW_1);
            ruleNarowness();

            state._fsp--;

             after(grammarAccess.getNarownessRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNarowness"


    // $ANTLR start "ruleNarowness"
    // InternalMROS.g:512:1: ruleNarowness : ( ( rule__Narowness__Group__0 ) ) ;
    public final void ruleNarowness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:516:2: ( ( ( rule__Narowness__Group__0 ) ) )
            // InternalMROS.g:517:2: ( ( rule__Narowness__Group__0 ) )
            {
            // InternalMROS.g:517:2: ( ( rule__Narowness__Group__0 ) )
            // InternalMROS.g:518:3: ( rule__Narowness__Group__0 )
            {
             before(grammarAccess.getNarownessAccess().getGroup()); 
            // InternalMROS.g:519:3: ( rule__Narowness__Group__0 )
            // InternalMROS.g:519:4: rule__Narowness__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Narowness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNarownessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNarowness"


    // $ANTLR start "entryRuleClutterness"
    // InternalMROS.g:528:1: entryRuleClutterness : ruleClutterness EOF ;
    public final void entryRuleClutterness() throws RecognitionException {
        try {
            // InternalMROS.g:529:1: ( ruleClutterness EOF )
            // InternalMROS.g:530:1: ruleClutterness EOF
            {
             before(grammarAccess.getClutternessRule()); 
            pushFollow(FOLLOW_1);
            ruleClutterness();

            state._fsp--;

             after(grammarAccess.getClutternessRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClutterness"


    // $ANTLR start "ruleClutterness"
    // InternalMROS.g:537:1: ruleClutterness : ( ( rule__Clutterness__Group__0 ) ) ;
    public final void ruleClutterness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:541:2: ( ( ( rule__Clutterness__Group__0 ) ) )
            // InternalMROS.g:542:2: ( ( rule__Clutterness__Group__0 ) )
            {
            // InternalMROS.g:542:2: ( ( rule__Clutterness__Group__0 ) )
            // InternalMROS.g:543:3: ( rule__Clutterness__Group__0 )
            {
             before(grammarAccess.getClutternessAccess().getGroup()); 
            // InternalMROS.g:544:3: ( rule__Clutterness__Group__0 )
            // InternalMROS.g:544:4: rule__Clutterness__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clutterness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClutternessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClutterness"


    // $ANTLR start "entryRuleParameter"
    // InternalMROS.g:553:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMROS.g:554:1: ( ruleParameter EOF )
            // InternalMROS.g:555:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMROS.g:562:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:566:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMROS.g:567:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMROS.g:567:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMROS.g:568:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMROS.g:569:3: ( rule__Parameter__Group__0 )
            // InternalMROS.g:569:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleDouble"
    // InternalMROS.g:578:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalMROS.g:579:1: ( ruleDouble EOF )
            // InternalMROS.g:580:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalMROS.g:587:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:591:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalMROS.g:592:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalMROS.g:592:2: ( ( rule__Double__Group__0 ) )
            // InternalMROS.g:593:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalMROS.g:594:3: ( rule__Double__Group__0 )
            // InternalMROS.g:594:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleActionType"
    // InternalMROS.g:603:1: entryRuleActionType : ruleActionType EOF ;
    public final void entryRuleActionType() throws RecognitionException {
        try {
            // InternalMROS.g:604:1: ( ruleActionType EOF )
            // InternalMROS.g:605:1: ruleActionType EOF
            {
             before(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalMROS.g:612:1: ruleActionType : ( ( rule__ActionType__Group__0 ) ) ;
    public final void ruleActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:616:2: ( ( ( rule__ActionType__Group__0 ) ) )
            // InternalMROS.g:617:2: ( ( rule__ActionType__Group__0 ) )
            {
            // InternalMROS.g:617:2: ( ( rule__ActionType__Group__0 ) )
            // InternalMROS.g:618:3: ( rule__ActionType__Group__0 )
            {
             before(grammarAccess.getActionTypeAccess().getGroup()); 
            // InternalMROS.g:619:3: ( rule__ActionType__Group__0 )
            // InternalMROS.g:619:4: rule__ActionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleGoalDefinition"
    // InternalMROS.g:628:1: entryRuleGoalDefinition : ruleGoalDefinition EOF ;
    public final void entryRuleGoalDefinition() throws RecognitionException {
        try {
            // InternalMROS.g:629:1: ( ruleGoalDefinition EOF )
            // InternalMROS.g:630:1: ruleGoalDefinition EOF
            {
             before(grammarAccess.getGoalDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleGoalDefinition();

            state._fsp--;

             after(grammarAccess.getGoalDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoalDefinition"


    // $ANTLR start "ruleGoalDefinition"
    // InternalMROS.g:637:1: ruleGoalDefinition : ( ( rule__GoalDefinition__GoalAssignment ) ) ;
    public final void ruleGoalDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:641:2: ( ( ( rule__GoalDefinition__GoalAssignment ) ) )
            // InternalMROS.g:642:2: ( ( rule__GoalDefinition__GoalAssignment ) )
            {
            // InternalMROS.g:642:2: ( ( rule__GoalDefinition__GoalAssignment ) )
            // InternalMROS.g:643:3: ( rule__GoalDefinition__GoalAssignment )
            {
             before(grammarAccess.getGoalDefinitionAccess().getGoalAssignment()); 
            // InternalMROS.g:644:3: ( rule__GoalDefinition__GoalAssignment )
            // InternalMROS.g:644:4: rule__GoalDefinition__GoalAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GoalDefinition__GoalAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGoalDefinitionAccess().getGoalAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoalDefinition"


    // $ANTLR start "entryRuleResultDefinition"
    // InternalMROS.g:653:1: entryRuleResultDefinition : ruleResultDefinition EOF ;
    public final void entryRuleResultDefinition() throws RecognitionException {
        try {
            // InternalMROS.g:654:1: ( ruleResultDefinition EOF )
            // InternalMROS.g:655:1: ruleResultDefinition EOF
            {
             before(grammarAccess.getResultDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleResultDefinition();

            state._fsp--;

             after(grammarAccess.getResultDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResultDefinition"


    // $ANTLR start "ruleResultDefinition"
    // InternalMROS.g:662:1: ruleResultDefinition : ( ( rule__ResultDefinition__ResultAssignment ) ) ;
    public final void ruleResultDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:666:2: ( ( ( rule__ResultDefinition__ResultAssignment ) ) )
            // InternalMROS.g:667:2: ( ( rule__ResultDefinition__ResultAssignment ) )
            {
            // InternalMROS.g:667:2: ( ( rule__ResultDefinition__ResultAssignment ) )
            // InternalMROS.g:668:3: ( rule__ResultDefinition__ResultAssignment )
            {
             before(grammarAccess.getResultDefinitionAccess().getResultAssignment()); 
            // InternalMROS.g:669:3: ( rule__ResultDefinition__ResultAssignment )
            // InternalMROS.g:669:4: rule__ResultDefinition__ResultAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ResultDefinition__ResultAssignment();

            state._fsp--;


            }

             after(grammarAccess.getResultDefinitionAccess().getResultAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultDefinition"


    // $ANTLR start "entryRuleFeedback"
    // InternalMROS.g:678:1: entryRuleFeedback : ruleFeedback EOF ;
    public final void entryRuleFeedback() throws RecognitionException {
        try {
            // InternalMROS.g:679:1: ( ruleFeedback EOF )
            // InternalMROS.g:680:1: ruleFeedback EOF
            {
             before(grammarAccess.getFeedbackRule()); 
            pushFollow(FOLLOW_1);
            ruleFeedback();

            state._fsp--;

             after(grammarAccess.getFeedbackRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeedback"


    // $ANTLR start "ruleFeedback"
    // InternalMROS.g:687:1: ruleFeedback : ( ( rule__Feedback__FeedbackAssignment ) ) ;
    public final void ruleFeedback() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:691:2: ( ( ( rule__Feedback__FeedbackAssignment ) ) )
            // InternalMROS.g:692:2: ( ( rule__Feedback__FeedbackAssignment ) )
            {
            // InternalMROS.g:692:2: ( ( rule__Feedback__FeedbackAssignment ) )
            // InternalMROS.g:693:3: ( rule__Feedback__FeedbackAssignment )
            {
             before(grammarAccess.getFeedbackAccess().getFeedbackAssignment()); 
            // InternalMROS.g:694:3: ( rule__Feedback__FeedbackAssignment )
            // InternalMROS.g:694:4: rule__Feedback__FeedbackAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Feedback__FeedbackAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFeedbackAccess().getFeedbackAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeedback"


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalMROS.g:703:1: entryRuleMessageDefinition : ruleMessageDefinition EOF ;
    public final void entryRuleMessageDefinition() throws RecognitionException {
        try {
            // InternalMROS.g:704:1: ( ruleMessageDefinition EOF )
            // InternalMROS.g:705:1: ruleMessageDefinition EOF
            {
             before(grammarAccess.getMessageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageDefinition();

            state._fsp--;

             after(grammarAccess.getMessageDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageDefinition"


    // $ANTLR start "ruleMessageDefinition"
    // InternalMROS.g:712:1: ruleMessageDefinition : ( ( rule__MessageDefinition__Group__0 ) ) ;
    public final void ruleMessageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:716:2: ( ( ( rule__MessageDefinition__Group__0 ) ) )
            // InternalMROS.g:717:2: ( ( rule__MessageDefinition__Group__0 ) )
            {
            // InternalMROS.g:717:2: ( ( rule__MessageDefinition__Group__0 ) )
            // InternalMROS.g:718:3: ( rule__MessageDefinition__Group__0 )
            {
             before(grammarAccess.getMessageDefinitionAccess().getGroup()); 
            // InternalMROS.g:719:3: ( rule__MessageDefinition__Group__0 )
            // InternalMROS.g:719:4: rule__MessageDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageDefinition"


    // $ANTLR start "entryRuleMessagePart"
    // InternalMROS.g:728:1: entryRuleMessagePart : ruleMessagePart EOF ;
    public final void entryRuleMessagePart() throws RecognitionException {
        try {
            // InternalMROS.g:729:1: ( ruleMessagePart EOF )
            // InternalMROS.g:730:1: ruleMessagePart EOF
            {
             before(grammarAccess.getMessagePartRule()); 
            pushFollow(FOLLOW_1);
            ruleMessagePart();

            state._fsp--;

             after(grammarAccess.getMessagePartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessagePart"


    // $ANTLR start "ruleMessagePart"
    // InternalMROS.g:737:1: ruleMessagePart : ( ( rule__MessagePart__PAssignment ) ) ;
    public final void ruleMessagePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:741:2: ( ( ( rule__MessagePart__PAssignment ) ) )
            // InternalMROS.g:742:2: ( ( rule__MessagePart__PAssignment ) )
            {
            // InternalMROS.g:742:2: ( ( rule__MessagePart__PAssignment ) )
            // InternalMROS.g:743:3: ( rule__MessagePart__PAssignment )
            {
             before(grammarAccess.getMessagePartAccess().getPAssignment()); 
            // InternalMROS.g:744:3: ( rule__MessagePart__PAssignment )
            // InternalMROS.g:744:4: rule__MessagePart__PAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MessagePart__PAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMessagePartAccess().getPAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessagePart"


    // $ANTLR start "entryRuleParameterType"
    // InternalMROS.g:753:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalMROS.g:754:1: ( ruleParameterType EOF )
            // InternalMROS.g:755:1: ruleParameterType EOF
            {
             before(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalMROS.g:762:1: ruleParameterType : ( ( rule__ParameterType__Group__0 ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:766:2: ( ( ( rule__ParameterType__Group__0 ) ) )
            // InternalMROS.g:767:2: ( ( rule__ParameterType__Group__0 ) )
            {
            // InternalMROS.g:767:2: ( ( rule__ParameterType__Group__0 ) )
            // InternalMROS.g:768:3: ( rule__ParameterType__Group__0 )
            {
             before(grammarAccess.getParameterTypeAccess().getGroup()); 
            // InternalMROS.g:769:3: ( rule__ParameterType__Group__0 )
            // InternalMROS.g:769:4: rule__ParameterType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleAbstractType"
    // InternalMROS.g:778:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // InternalMROS.g:779:1: ( ruleAbstractType EOF )
            // InternalMROS.g:780:1: ruleAbstractType EOF
            {
             before(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getAbstractTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalMROS.g:787:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:791:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // InternalMROS.g:792:2: ( ( rule__AbstractType__Alternatives ) )
            {
            // InternalMROS.g:792:2: ( ( rule__AbstractType__Alternatives ) )
            // InternalMROS.g:793:3: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives()); 
            // InternalMROS.g:794:3: ( rule__AbstractType__Alternatives )
            // InternalMROS.g:794:4: rule__AbstractType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "rule__ResultType__Alternatives"
    // InternalMROS.g:802:1: rule__ResultType__Alternatives : ( ( ruleSUCCESS ) | ( ruleERROR ) | ( ruleINPROGRESS ) );
    public final void rule__ResultType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:806:1: ( ( ruleSUCCESS ) | ( ruleERROR ) | ( ruleINPROGRESS ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMROS.g:807:2: ( ruleSUCCESS )
                    {
                    // InternalMROS.g:807:2: ( ruleSUCCESS )
                    // InternalMROS.g:808:3: ruleSUCCESS
                    {
                     before(grammarAccess.getResultTypeAccess().getSUCCESSParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSUCCESS();

                    state._fsp--;

                     after(grammarAccess.getResultTypeAccess().getSUCCESSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMROS.g:813:2: ( ruleERROR )
                    {
                    // InternalMROS.g:813:2: ( ruleERROR )
                    // InternalMROS.g:814:3: ruleERROR
                    {
                     before(grammarAccess.getResultTypeAccess().getERRORParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleERROR();

                    state._fsp--;

                     after(grammarAccess.getResultTypeAccess().getERRORParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMROS.g:819:2: ( ruleINPROGRESS )
                    {
                    // InternalMROS.g:819:2: ( ruleINPROGRESS )
                    // InternalMROS.g:820:3: ruleINPROGRESS
                    {
                     before(grammarAccess.getResultTypeAccess().getINPROGRESSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleINPROGRESS();

                    state._fsp--;

                     after(grammarAccess.getResultTypeAccess().getINPROGRESSParserRuleCall_2()); 

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
    // $ANTLR end "rule__ResultType__Alternatives"


    // $ANTLR start "rule__QualityAttribute__NameAlternatives_0"
    // InternalMROS.g:829:1: rule__QualityAttribute__NameAlternatives_0 : ( ( 'safety' ) | ( 'performance' ) | ( 'energy' ) );
    public final void rule__QualityAttribute__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:833:1: ( ( 'safety' ) | ( 'performance' ) | ( 'energy' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMROS.g:834:2: ( 'safety' )
                    {
                    // InternalMROS.g:834:2: ( 'safety' )
                    // InternalMROS.g:835:3: 'safety'
                    {
                     before(grammarAccess.getQualityAttributeAccess().getNameSafetyKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getQualityAttributeAccess().getNameSafetyKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMROS.g:840:2: ( 'performance' )
                    {
                    // InternalMROS.g:840:2: ( 'performance' )
                    // InternalMROS.g:841:3: 'performance'
                    {
                     before(grammarAccess.getQualityAttributeAccess().getNamePerformanceKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getQualityAttributeAccess().getNamePerformanceKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMROS.g:846:2: ( 'energy' )
                    {
                    // InternalMROS.g:846:2: ( 'energy' )
                    // InternalMROS.g:847:3: 'energy'
                    {
                     before(grammarAccess.getQualityAttributeAccess().getNameEnergyKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getQualityAttributeAccess().getNameEnergyKeyword_0_2()); 

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
    // $ANTLR end "rule__QualityAttribute__NameAlternatives_0"


    // $ANTLR start "rule__ContextType__Alternatives"
    // InternalMROS.g:856:1: rule__ContextType__Alternatives : ( ( 'Default' ) | ( 'BatteryCharging' ) | ( 'OnChargingStation' ) );
    public final void rule__ContextType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:860:1: ( ( 'Default' ) | ( 'BatteryCharging' ) | ( 'OnChargingStation' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMROS.g:861:2: ( 'Default' )
                    {
                    // InternalMROS.g:861:2: ( 'Default' )
                    // InternalMROS.g:862:3: 'Default'
                    {
                     before(grammarAccess.getContextTypeAccess().getDefaultKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getContextTypeAccess().getDefaultKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMROS.g:867:2: ( 'BatteryCharging' )
                    {
                    // InternalMROS.g:867:2: ( 'BatteryCharging' )
                    // InternalMROS.g:868:3: 'BatteryCharging'
                    {
                     before(grammarAccess.getContextTypeAccess().getBatteryChargingKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getContextTypeAccess().getBatteryChargingKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMROS.g:873:2: ( 'OnChargingStation' )
                    {
                    // InternalMROS.g:873:2: ( 'OnChargingStation' )
                    // InternalMROS.g:874:3: 'OnChargingStation'
                    {
                     before(grammarAccess.getContextTypeAccess().getOnChargingStationKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getContextTypeAccess().getOnChargingStationKeyword_2()); 

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
    // $ANTLR end "rule__ContextType__Alternatives"


    // $ANTLR start "rule__Mode__Alternatives"
    // InternalMROS.g:883:1: rule__Mode__Alternatives : ( ( 'active' ) | ( 'inactive' ) | ( 'unconfigured' ) | ( 'configured' ) );
    public final void rule__Mode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:887:1: ( ( 'active' ) | ( 'inactive' ) | ( 'unconfigured' ) | ( 'configured' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMROS.g:888:2: ( 'active' )
                    {
                    // InternalMROS.g:888:2: ( 'active' )
                    // InternalMROS.g:889:3: 'active'
                    {
                     before(grammarAccess.getModeAccess().getActiveKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getModeAccess().getActiveKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMROS.g:894:2: ( 'inactive' )
                    {
                    // InternalMROS.g:894:2: ( 'inactive' )
                    // InternalMROS.g:895:3: 'inactive'
                    {
                     before(grammarAccess.getModeAccess().getInactiveKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getModeAccess().getInactiveKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMROS.g:900:2: ( 'unconfigured' )
                    {
                    // InternalMROS.g:900:2: ( 'unconfigured' )
                    // InternalMROS.g:901:3: 'unconfigured'
                    {
                     before(grammarAccess.getModeAccess().getUnconfiguredKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getModeAccess().getUnconfiguredKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMROS.g:906:2: ( 'configured' )
                    {
                    // InternalMROS.g:906:2: ( 'configured' )
                    // InternalMROS.g:907:3: 'configured'
                    {
                     before(grammarAccess.getModeAccess().getConfiguredKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getModeAccess().getConfiguredKeyword_3()); 

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
    // $ANTLR end "rule__Mode__Alternatives"


    // $ANTLR start "rule__EnvironmentParameter__Alternatives"
    // InternalMROS.g:916:1: rule__EnvironmentParameter__Alternatives : ( ( ruleNarowness ) | ( ruleClutterness ) );
    public final void rule__EnvironmentParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:920:1: ( ( ruleNarowness ) | ( ruleClutterness ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            else if ( (LA5_0==53) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMROS.g:921:2: ( ruleNarowness )
                    {
                    // InternalMROS.g:921:2: ( ruleNarowness )
                    // InternalMROS.g:922:3: ruleNarowness
                    {
                     before(grammarAccess.getEnvironmentParameterAccess().getNarownessParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNarowness();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentParameterAccess().getNarownessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMROS.g:927:2: ( ruleClutterness )
                    {
                    // InternalMROS.g:927:2: ( ruleClutterness )
                    // InternalMROS.g:928:3: ruleClutterness
                    {
                     before(grammarAccess.getEnvironmentParameterAccess().getClutternessParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClutterness();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentParameterAccess().getClutternessParserRuleCall_1()); 

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
    // $ANTLR end "rule__EnvironmentParameter__Alternatives"


    // $ANTLR start "rule__AbstractType__Alternatives"
    // InternalMROS.g:937:1: rule__AbstractType__Alternatives : ( ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'PoseStamped' ) | ( 'string' ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:941:1: ( ( 'bool' ) | ( 'int' ) | ( 'float' ) | ( 'PoseStamped' ) | ( 'string' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMROS.g:942:2: ( 'bool' )
                    {
                    // InternalMROS.g:942:2: ( 'bool' )
                    // InternalMROS.g:943:3: 'bool'
                    {
                     before(grammarAccess.getAbstractTypeAccess().getBoolKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAbstractTypeAccess().getBoolKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMROS.g:948:2: ( 'int' )
                    {
                    // InternalMROS.g:948:2: ( 'int' )
                    // InternalMROS.g:949:3: 'int'
                    {
                     before(grammarAccess.getAbstractTypeAccess().getIntKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAbstractTypeAccess().getIntKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMROS.g:954:2: ( 'float' )
                    {
                    // InternalMROS.g:954:2: ( 'float' )
                    // InternalMROS.g:955:3: 'float'
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloatKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAbstractTypeAccess().getFloatKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMROS.g:960:2: ( 'PoseStamped' )
                    {
                    // InternalMROS.g:960:2: ( 'PoseStamped' )
                    // InternalMROS.g:961:3: 'PoseStamped'
                    {
                     before(grammarAccess.getAbstractTypeAccess().getPoseStampedKeyword_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAbstractTypeAccess().getPoseStampedKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMROS.g:966:2: ( 'string' )
                    {
                    // InternalMROS.g:966:2: ( 'string' )
                    // InternalMROS.g:967:3: 'string'
                    {
                     before(grammarAccess.getAbstractTypeAccess().getStringKeyword_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAbstractTypeAccess().getStringKeyword_4()); 

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
    // $ANTLR end "rule__AbstractType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMROS.g:976:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:980:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMROS.g:981:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMROS.g:988:1: rule__Model__Group__0__Impl : ( 'SkillDefinitionSet' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:992:1: ( ( 'SkillDefinitionSet' ) )
            // InternalMROS.g:993:1: ( 'SkillDefinitionSet' )
            {
            // InternalMROS.g:993:1: ( 'SkillDefinitionSet' )
            // InternalMROS.g:994:2: 'SkillDefinitionSet'
            {
             before(grammarAccess.getModelAccess().getSkillDefinitionSetKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSkillDefinitionSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMROS.g:1003:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1007:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMROS.g:1008:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMROS.g:1015:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1019:1: ( ( '{' ) )
            // InternalMROS.g:1020:1: ( '{' )
            {
            // InternalMROS.g:1020:1: ( '{' )
            // InternalMROS.g:1021:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMROS.g:1030:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1034:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMROS.g:1035:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMROS.g:1042:1: rule__Model__Group__2__Impl : ( ( rule__Model__SkillDefinitionSetAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1046:1: ( ( ( rule__Model__SkillDefinitionSetAssignment_2 )* ) )
            // InternalMROS.g:1047:1: ( ( rule__Model__SkillDefinitionSetAssignment_2 )* )
            {
            // InternalMROS.g:1047:1: ( ( rule__Model__SkillDefinitionSetAssignment_2 )* )
            // InternalMROS.g:1048:2: ( rule__Model__SkillDefinitionSetAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getSkillDefinitionSetAssignment_2()); 
            // InternalMROS.g:1049:2: ( rule__Model__SkillDefinitionSetAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMROS.g:1049:3: rule__Model__SkillDefinitionSetAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__SkillDefinitionSetAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSkillDefinitionSetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMROS.g:1057:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1061:1: ( rule__Model__Group__3__Impl )
            // InternalMROS.g:1062:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMROS.g:1068:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1072:1: ( ( '}' ) )
            // InternalMROS.g:1073:1: ( '}' )
            {
            // InternalMROS.g:1073:1: ( '}' )
            // InternalMROS.g:1074:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__0"
    // InternalMROS.g:1084:1: rule__SkillDefinition__Group__0 : rule__SkillDefinition__Group__0__Impl rule__SkillDefinition__Group__1 ;
    public final void rule__SkillDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1088:1: ( rule__SkillDefinition__Group__0__Impl rule__SkillDefinition__Group__1 )
            // InternalMROS.g:1089:2: rule__SkillDefinition__Group__0__Impl rule__SkillDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SkillDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__1();

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
    // $ANTLR end "rule__SkillDefinition__Group__0"


    // $ANTLR start "rule__SkillDefinition__Group__0__Impl"
    // InternalMROS.g:1096:1: rule__SkillDefinition__Group__0__Impl : ( 'Skill' ) ;
    public final void rule__SkillDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1100:1: ( ( 'Skill' ) )
            // InternalMROS.g:1101:1: ( 'Skill' )
            {
            // InternalMROS.g:1101:1: ( 'Skill' )
            // InternalMROS.g:1102:2: 'Skill'
            {
             before(grammarAccess.getSkillDefinitionAccess().getSkillKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getSkillKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__1"
    // InternalMROS.g:1111:1: rule__SkillDefinition__Group__1 : rule__SkillDefinition__Group__1__Impl rule__SkillDefinition__Group__2 ;
    public final void rule__SkillDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1115:1: ( rule__SkillDefinition__Group__1__Impl rule__SkillDefinition__Group__2 )
            // InternalMROS.g:1116:2: rule__SkillDefinition__Group__1__Impl rule__SkillDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SkillDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__2();

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
    // $ANTLR end "rule__SkillDefinition__Group__1"


    // $ANTLR start "rule__SkillDefinition__Group__1__Impl"
    // InternalMROS.g:1123:1: rule__SkillDefinition__Group__1__Impl : ( ( rule__SkillDefinition__NameAssignment_1 ) ) ;
    public final void rule__SkillDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1127:1: ( ( ( rule__SkillDefinition__NameAssignment_1 ) ) )
            // InternalMROS.g:1128:1: ( ( rule__SkillDefinition__NameAssignment_1 ) )
            {
            // InternalMROS.g:1128:1: ( ( rule__SkillDefinition__NameAssignment_1 ) )
            // InternalMROS.g:1129:2: ( rule__SkillDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getNameAssignment_1()); 
            // InternalMROS.g:1130:2: ( rule__SkillDefinition__NameAssignment_1 )
            // InternalMROS.g:1130:3: rule__SkillDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__1__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__2"
    // InternalMROS.g:1138:1: rule__SkillDefinition__Group__2 : rule__SkillDefinition__Group__2__Impl rule__SkillDefinition__Group__3 ;
    public final void rule__SkillDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1142:1: ( rule__SkillDefinition__Group__2__Impl rule__SkillDefinition__Group__3 )
            // InternalMROS.g:1143:2: rule__SkillDefinition__Group__2__Impl rule__SkillDefinition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SkillDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__3();

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
    // $ANTLR end "rule__SkillDefinition__Group__2"


    // $ANTLR start "rule__SkillDefinition__Group__2__Impl"
    // InternalMROS.g:1150:1: rule__SkillDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1154:1: ( ( '{' ) )
            // InternalMROS.g:1155:1: ( '{' )
            {
            // InternalMROS.g:1155:1: ( '{' )
            // InternalMROS.g:1156:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__2__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__3"
    // InternalMROS.g:1165:1: rule__SkillDefinition__Group__3 : rule__SkillDefinition__Group__3__Impl rule__SkillDefinition__Group__4 ;
    public final void rule__SkillDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1169:1: ( rule__SkillDefinition__Group__3__Impl rule__SkillDefinition__Group__4 )
            // InternalMROS.g:1170:2: rule__SkillDefinition__Group__3__Impl rule__SkillDefinition__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SkillDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__4();

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
    // $ANTLR end "rule__SkillDefinition__Group__3"


    // $ANTLR start "rule__SkillDefinition__Group__3__Impl"
    // InternalMROS.g:1177:1: rule__SkillDefinition__Group__3__Impl : ( 'quality attributes' ) ;
    public final void rule__SkillDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1181:1: ( ( 'quality attributes' ) )
            // InternalMROS.g:1182:1: ( 'quality attributes' )
            {
            // InternalMROS.g:1182:1: ( 'quality attributes' )
            // InternalMROS.g:1183:2: 'quality attributes'
            {
             before(grammarAccess.getSkillDefinitionAccess().getQualityAttributesKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getQualityAttributesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__3__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__4"
    // InternalMROS.g:1192:1: rule__SkillDefinition__Group__4 : rule__SkillDefinition__Group__4__Impl rule__SkillDefinition__Group__5 ;
    public final void rule__SkillDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1196:1: ( rule__SkillDefinition__Group__4__Impl rule__SkillDefinition__Group__5 )
            // InternalMROS.g:1197:2: rule__SkillDefinition__Group__4__Impl rule__SkillDefinition__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__SkillDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__5();

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
    // $ANTLR end "rule__SkillDefinition__Group__4"


    // $ANTLR start "rule__SkillDefinition__Group__4__Impl"
    // InternalMROS.g:1204:1: rule__SkillDefinition__Group__4__Impl : ( '[' ) ;
    public final void rule__SkillDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1208:1: ( ( '[' ) )
            // InternalMROS.g:1209:1: ( '[' )
            {
            // InternalMROS.g:1209:1: ( '[' )
            // InternalMROS.g:1210:2: '['
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__4__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__5"
    // InternalMROS.g:1219:1: rule__SkillDefinition__Group__5 : rule__SkillDefinition__Group__5__Impl rule__SkillDefinition__Group__6 ;
    public final void rule__SkillDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1223:1: ( rule__SkillDefinition__Group__5__Impl rule__SkillDefinition__Group__6 )
            // InternalMROS.g:1224:2: rule__SkillDefinition__Group__5__Impl rule__SkillDefinition__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__SkillDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__6();

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
    // $ANTLR end "rule__SkillDefinition__Group__5"


    // $ANTLR start "rule__SkillDefinition__Group__5__Impl"
    // InternalMROS.g:1231:1: rule__SkillDefinition__Group__5__Impl : ( ( rule__SkillDefinition__ListqaAssignment_5 ) ) ;
    public final void rule__SkillDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1235:1: ( ( ( rule__SkillDefinition__ListqaAssignment_5 ) ) )
            // InternalMROS.g:1236:1: ( ( rule__SkillDefinition__ListqaAssignment_5 ) )
            {
            // InternalMROS.g:1236:1: ( ( rule__SkillDefinition__ListqaAssignment_5 ) )
            // InternalMROS.g:1237:2: ( rule__SkillDefinition__ListqaAssignment_5 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getListqaAssignment_5()); 
            // InternalMROS.g:1238:2: ( rule__SkillDefinition__ListqaAssignment_5 )
            // InternalMROS.g:1238:3: rule__SkillDefinition__ListqaAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__ListqaAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getListqaAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__5__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__6"
    // InternalMROS.g:1246:1: rule__SkillDefinition__Group__6 : rule__SkillDefinition__Group__6__Impl rule__SkillDefinition__Group__7 ;
    public final void rule__SkillDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1250:1: ( rule__SkillDefinition__Group__6__Impl rule__SkillDefinition__Group__7 )
            // InternalMROS.g:1251:2: rule__SkillDefinition__Group__6__Impl rule__SkillDefinition__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__SkillDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__7();

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
    // $ANTLR end "rule__SkillDefinition__Group__6"


    // $ANTLR start "rule__SkillDefinition__Group__6__Impl"
    // InternalMROS.g:1258:1: rule__SkillDefinition__Group__6__Impl : ( ( rule__SkillDefinition__Group_6__0 )* ) ;
    public final void rule__SkillDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1262:1: ( ( ( rule__SkillDefinition__Group_6__0 )* ) )
            // InternalMROS.g:1263:1: ( ( rule__SkillDefinition__Group_6__0 )* )
            {
            // InternalMROS.g:1263:1: ( ( rule__SkillDefinition__Group_6__0 )* )
            // InternalMROS.g:1264:2: ( rule__SkillDefinition__Group_6__0 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_6()); 
            // InternalMROS.g:1265:2: ( rule__SkillDefinition__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMROS.g:1265:3: rule__SkillDefinition__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SkillDefinition__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__6__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__7"
    // InternalMROS.g:1273:1: rule__SkillDefinition__Group__7 : rule__SkillDefinition__Group__7__Impl rule__SkillDefinition__Group__8 ;
    public final void rule__SkillDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1277:1: ( rule__SkillDefinition__Group__7__Impl rule__SkillDefinition__Group__8 )
            // InternalMROS.g:1278:2: rule__SkillDefinition__Group__7__Impl rule__SkillDefinition__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__SkillDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__8();

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
    // $ANTLR end "rule__SkillDefinition__Group__7"


    // $ANTLR start "rule__SkillDefinition__Group__7__Impl"
    // InternalMROS.g:1285:1: rule__SkillDefinition__Group__7__Impl : ( ']' ) ;
    public final void rule__SkillDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1289:1: ( ( ']' ) )
            // InternalMROS.g:1290:1: ( ']' )
            {
            // InternalMROS.g:1290:1: ( ']' )
            // InternalMROS.g:1291:2: ']'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightSquareBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__7__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__8"
    // InternalMROS.g:1300:1: rule__SkillDefinition__Group__8 : rule__SkillDefinition__Group__8__Impl rule__SkillDefinition__Group__9 ;
    public final void rule__SkillDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1304:1: ( rule__SkillDefinition__Group__8__Impl rule__SkillDefinition__Group__9 )
            // InternalMROS.g:1305:2: rule__SkillDefinition__Group__8__Impl rule__SkillDefinition__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__SkillDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__9();

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
    // $ANTLR end "rule__SkillDefinition__Group__8"


    // $ANTLR start "rule__SkillDefinition__Group__8__Impl"
    // InternalMROS.g:1312:1: rule__SkillDefinition__Group__8__Impl : ( ( rule__SkillDefinition__Group_8__0 )* ) ;
    public final void rule__SkillDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1316:1: ( ( ( rule__SkillDefinition__Group_8__0 )* ) )
            // InternalMROS.g:1317:1: ( ( rule__SkillDefinition__Group_8__0 )* )
            {
            // InternalMROS.g:1317:1: ( ( rule__SkillDefinition__Group_8__0 )* )
            // InternalMROS.g:1318:2: ( rule__SkillDefinition__Group_8__0 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_8()); 
            // InternalMROS.g:1319:2: ( rule__SkillDefinition__Group_8__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMROS.g:1319:3: rule__SkillDefinition__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SkillDefinition__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__8__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__9"
    // InternalMROS.g:1327:1: rule__SkillDefinition__Group__9 : rule__SkillDefinition__Group__9__Impl rule__SkillDefinition__Group__10 ;
    public final void rule__SkillDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1331:1: ( rule__SkillDefinition__Group__9__Impl rule__SkillDefinition__Group__10 )
            // InternalMROS.g:1332:2: rule__SkillDefinition__Group__9__Impl rule__SkillDefinition__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__SkillDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__10();

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
    // $ANTLR end "rule__SkillDefinition__Group__9"


    // $ANTLR start "rule__SkillDefinition__Group__9__Impl"
    // InternalMROS.g:1339:1: rule__SkillDefinition__Group__9__Impl : ( ( rule__SkillDefinition__Group_9__0 )* ) ;
    public final void rule__SkillDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1343:1: ( ( ( rule__SkillDefinition__Group_9__0 )* ) )
            // InternalMROS.g:1344:1: ( ( rule__SkillDefinition__Group_9__0 )* )
            {
            // InternalMROS.g:1344:1: ( ( rule__SkillDefinition__Group_9__0 )* )
            // InternalMROS.g:1345:2: ( rule__SkillDefinition__Group_9__0 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_9()); 
            // InternalMROS.g:1346:2: ( rule__SkillDefinition__Group_9__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMROS.g:1346:3: rule__SkillDefinition__Group_9__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__SkillDefinition__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__9__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__10"
    // InternalMROS.g:1354:1: rule__SkillDefinition__Group__10 : rule__SkillDefinition__Group__10__Impl rule__SkillDefinition__Group__11 ;
    public final void rule__SkillDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1358:1: ( rule__SkillDefinition__Group__10__Impl rule__SkillDefinition__Group__11 )
            // InternalMROS.g:1359:2: rule__SkillDefinition__Group__10__Impl rule__SkillDefinition__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__SkillDefinition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__11();

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
    // $ANTLR end "rule__SkillDefinition__Group__10"


    // $ANTLR start "rule__SkillDefinition__Group__10__Impl"
    // InternalMROS.g:1366:1: rule__SkillDefinition__Group__10__Impl : ( 'result' ) ;
    public final void rule__SkillDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1370:1: ( ( 'result' ) )
            // InternalMROS.g:1371:1: ( 'result' )
            {
            // InternalMROS.g:1371:1: ( 'result' )
            // InternalMROS.g:1372:2: 'result'
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getResultKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__10__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__11"
    // InternalMROS.g:1381:1: rule__SkillDefinition__Group__11 : rule__SkillDefinition__Group__11__Impl rule__SkillDefinition__Group__12 ;
    public final void rule__SkillDefinition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1385:1: ( rule__SkillDefinition__Group__11__Impl rule__SkillDefinition__Group__12 )
            // InternalMROS.g:1386:2: rule__SkillDefinition__Group__11__Impl rule__SkillDefinition__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__SkillDefinition__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__12();

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
    // $ANTLR end "rule__SkillDefinition__Group__11"


    // $ANTLR start "rule__SkillDefinition__Group__11__Impl"
    // InternalMROS.g:1393:1: rule__SkillDefinition__Group__11__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1397:1: ( ( '{' ) )
            // InternalMROS.g:1398:1: ( '{' )
            {
            // InternalMROS.g:1398:1: ( '{' )
            // InternalMROS.g:1399:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__11__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__12"
    // InternalMROS.g:1408:1: rule__SkillDefinition__Group__12 : rule__SkillDefinition__Group__12__Impl rule__SkillDefinition__Group__13 ;
    public final void rule__SkillDefinition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1412:1: ( rule__SkillDefinition__Group__12__Impl rule__SkillDefinition__Group__13 )
            // InternalMROS.g:1413:2: rule__SkillDefinition__Group__12__Impl rule__SkillDefinition__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__SkillDefinition__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__13();

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
    // $ANTLR end "rule__SkillDefinition__Group__12"


    // $ANTLR start "rule__SkillDefinition__Group__12__Impl"
    // InternalMROS.g:1420:1: rule__SkillDefinition__Group__12__Impl : ( ( rule__SkillDefinition__ResultAssignment_12 ) ) ;
    public final void rule__SkillDefinition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1424:1: ( ( ( rule__SkillDefinition__ResultAssignment_12 ) ) )
            // InternalMROS.g:1425:1: ( ( rule__SkillDefinition__ResultAssignment_12 ) )
            {
            // InternalMROS.g:1425:1: ( ( rule__SkillDefinition__ResultAssignment_12 ) )
            // InternalMROS.g:1426:2: ( rule__SkillDefinition__ResultAssignment_12 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultAssignment_12()); 
            // InternalMROS.g:1427:2: ( rule__SkillDefinition__ResultAssignment_12 )
            // InternalMROS.g:1427:3: rule__SkillDefinition__ResultAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__ResultAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getResultAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__12__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__13"
    // InternalMROS.g:1435:1: rule__SkillDefinition__Group__13 : rule__SkillDefinition__Group__13__Impl rule__SkillDefinition__Group__14 ;
    public final void rule__SkillDefinition__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1439:1: ( rule__SkillDefinition__Group__13__Impl rule__SkillDefinition__Group__14 )
            // InternalMROS.g:1440:2: rule__SkillDefinition__Group__13__Impl rule__SkillDefinition__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__SkillDefinition__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__14();

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
    // $ANTLR end "rule__SkillDefinition__Group__13"


    // $ANTLR start "rule__SkillDefinition__Group__13__Impl"
    // InternalMROS.g:1447:1: rule__SkillDefinition__Group__13__Impl : ( ( rule__SkillDefinition__Group_13__0 )* ) ;
    public final void rule__SkillDefinition__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1451:1: ( ( ( rule__SkillDefinition__Group_13__0 )* ) )
            // InternalMROS.g:1452:1: ( ( rule__SkillDefinition__Group_13__0 )* )
            {
            // InternalMROS.g:1452:1: ( ( rule__SkillDefinition__Group_13__0 )* )
            // InternalMROS.g:1453:2: ( rule__SkillDefinition__Group_13__0 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_13()); 
            // InternalMROS.g:1454:2: ( rule__SkillDefinition__Group_13__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMROS.g:1454:3: rule__SkillDefinition__Group_13__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SkillDefinition__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__13__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__14"
    // InternalMROS.g:1462:1: rule__SkillDefinition__Group__14 : rule__SkillDefinition__Group__14__Impl rule__SkillDefinition__Group__15 ;
    public final void rule__SkillDefinition__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1466:1: ( rule__SkillDefinition__Group__14__Impl rule__SkillDefinition__Group__15 )
            // InternalMROS.g:1467:2: rule__SkillDefinition__Group__14__Impl rule__SkillDefinition__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__SkillDefinition__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__15();

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
    // $ANTLR end "rule__SkillDefinition__Group__14"


    // $ANTLR start "rule__SkillDefinition__Group__14__Impl"
    // InternalMROS.g:1474:1: rule__SkillDefinition__Group__14__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1478:1: ( ( '}' ) )
            // InternalMROS.g:1479:1: ( '}' )
            {
            // InternalMROS.g:1479:1: ( '}' )
            // InternalMROS.g:1480:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_14()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__14__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__15"
    // InternalMROS.g:1489:1: rule__SkillDefinition__Group__15 : rule__SkillDefinition__Group__15__Impl rule__SkillDefinition__Group__16 ;
    public final void rule__SkillDefinition__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1493:1: ( rule__SkillDefinition__Group__15__Impl rule__SkillDefinition__Group__16 )
            // InternalMROS.g:1494:2: rule__SkillDefinition__Group__15__Impl rule__SkillDefinition__Group__16
            {
            pushFollow(FOLLOW_17);
            rule__SkillDefinition__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__16();

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
    // $ANTLR end "rule__SkillDefinition__Group__15"


    // $ANTLR start "rule__SkillDefinition__Group__15__Impl"
    // InternalMROS.g:1501:1: rule__SkillDefinition__Group__15__Impl : ( ( rule__SkillDefinition__RealizationsAssignment_15 )* ) ;
    public final void rule__SkillDefinition__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1505:1: ( ( ( rule__SkillDefinition__RealizationsAssignment_15 )* ) )
            // InternalMROS.g:1506:1: ( ( rule__SkillDefinition__RealizationsAssignment_15 )* )
            {
            // InternalMROS.g:1506:1: ( ( rule__SkillDefinition__RealizationsAssignment_15 )* )
            // InternalMROS.g:1507:2: ( rule__SkillDefinition__RealizationsAssignment_15 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getRealizationsAssignment_15()); 
            // InternalMROS.g:1508:2: ( rule__SkillDefinition__RealizationsAssignment_15 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==42) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMROS.g:1508:3: rule__SkillDefinition__RealizationsAssignment_15
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__SkillDefinition__RealizationsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getRealizationsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__15__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__16"
    // InternalMROS.g:1516:1: rule__SkillDefinition__Group__16 : rule__SkillDefinition__Group__16__Impl ;
    public final void rule__SkillDefinition__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1520:1: ( rule__SkillDefinition__Group__16__Impl )
            // InternalMROS.g:1521:2: rule__SkillDefinition__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__16__Impl();

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
    // $ANTLR end "rule__SkillDefinition__Group__16"


    // $ANTLR start "rule__SkillDefinition__Group__16__Impl"
    // InternalMROS.g:1527:1: rule__SkillDefinition__Group__16__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1531:1: ( ( '}' ) )
            // InternalMROS.g:1532:1: ( '}' )
            {
            // InternalMROS.g:1532:1: ( '}' )
            // InternalMROS.g:1533:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_16()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__16__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_6__0"
    // InternalMROS.g:1543:1: rule__SkillDefinition__Group_6__0 : rule__SkillDefinition__Group_6__0__Impl rule__SkillDefinition__Group_6__1 ;
    public final void rule__SkillDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1547:1: ( rule__SkillDefinition__Group_6__0__Impl rule__SkillDefinition__Group_6__1 )
            // InternalMROS.g:1548:2: rule__SkillDefinition__Group_6__0__Impl rule__SkillDefinition__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__SkillDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_6__1();

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
    // $ANTLR end "rule__SkillDefinition__Group_6__0"


    // $ANTLR start "rule__SkillDefinition__Group_6__0__Impl"
    // InternalMROS.g:1555:1: rule__SkillDefinition__Group_6__0__Impl : ( ',' ) ;
    public final void rule__SkillDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1559:1: ( ( ',' ) )
            // InternalMROS.g:1560:1: ( ',' )
            {
            // InternalMROS.g:1560:1: ( ',' )
            // InternalMROS.g:1561:2: ','
            {
             before(grammarAccess.getSkillDefinitionAccess().getCommaKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_6__1"
    // InternalMROS.g:1570:1: rule__SkillDefinition__Group_6__1 : rule__SkillDefinition__Group_6__1__Impl ;
    public final void rule__SkillDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1574:1: ( rule__SkillDefinition__Group_6__1__Impl )
            // InternalMROS.g:1575:2: rule__SkillDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_6__1__Impl();

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
    // $ANTLR end "rule__SkillDefinition__Group_6__1"


    // $ANTLR start "rule__SkillDefinition__Group_6__1__Impl"
    // InternalMROS.g:1581:1: rule__SkillDefinition__Group_6__1__Impl : ( ( rule__SkillDefinition__ListqaAssignment_6_1 ) ) ;
    public final void rule__SkillDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1585:1: ( ( ( rule__SkillDefinition__ListqaAssignment_6_1 ) ) )
            // InternalMROS.g:1586:1: ( ( rule__SkillDefinition__ListqaAssignment_6_1 ) )
            {
            // InternalMROS.g:1586:1: ( ( rule__SkillDefinition__ListqaAssignment_6_1 ) )
            // InternalMROS.g:1587:2: ( rule__SkillDefinition__ListqaAssignment_6_1 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getListqaAssignment_6_1()); 
            // InternalMROS.g:1588:2: ( rule__SkillDefinition__ListqaAssignment_6_1 )
            // InternalMROS.g:1588:3: rule__SkillDefinition__ListqaAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__ListqaAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getListqaAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_8__0"
    // InternalMROS.g:1597:1: rule__SkillDefinition__Group_8__0 : rule__SkillDefinition__Group_8__0__Impl rule__SkillDefinition__Group_8__1 ;
    public final void rule__SkillDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1601:1: ( rule__SkillDefinition__Group_8__0__Impl rule__SkillDefinition__Group_8__1 )
            // InternalMROS.g:1602:2: rule__SkillDefinition__Group_8__0__Impl rule__SkillDefinition__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__SkillDefinition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_8__1();

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
    // $ANTLR end "rule__SkillDefinition__Group_8__0"


    // $ANTLR start "rule__SkillDefinition__Group_8__0__Impl"
    // InternalMROS.g:1609:1: rule__SkillDefinition__Group_8__0__Impl : ( 'input' ) ;
    public final void rule__SkillDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1613:1: ( ( 'input' ) )
            // InternalMROS.g:1614:1: ( 'input' )
            {
            // InternalMROS.g:1614:1: ( 'input' )
            // InternalMROS.g:1615:2: 'input'
            {
             before(grammarAccess.getSkillDefinitionAccess().getInputKeyword_8_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getInputKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_8__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_8__1"
    // InternalMROS.g:1624:1: rule__SkillDefinition__Group_8__1 : rule__SkillDefinition__Group_8__1__Impl rule__SkillDefinition__Group_8__2 ;
    public final void rule__SkillDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1628:1: ( rule__SkillDefinition__Group_8__1__Impl rule__SkillDefinition__Group_8__2 )
            // InternalMROS.g:1629:2: rule__SkillDefinition__Group_8__1__Impl rule__SkillDefinition__Group_8__2
            {
            pushFollow(FOLLOW_6);
            rule__SkillDefinition__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_8__2();

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
    // $ANTLR end "rule__SkillDefinition__Group_8__1"


    // $ANTLR start "rule__SkillDefinition__Group_8__1__Impl"
    // InternalMROS.g:1636:1: rule__SkillDefinition__Group_8__1__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1640:1: ( ( '{' ) )
            // InternalMROS.g:1641:1: ( '{' )
            {
            // InternalMROS.g:1641:1: ( '{' )
            // InternalMROS.g:1642:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_8__1__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_8__2"
    // InternalMROS.g:1651:1: rule__SkillDefinition__Group_8__2 : rule__SkillDefinition__Group_8__2__Impl rule__SkillDefinition__Group_8__3 ;
    public final void rule__SkillDefinition__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1655:1: ( rule__SkillDefinition__Group_8__2__Impl rule__SkillDefinition__Group_8__3 )
            // InternalMROS.g:1656:2: rule__SkillDefinition__Group_8__2__Impl rule__SkillDefinition__Group_8__3
            {
            pushFollow(FOLLOW_16);
            rule__SkillDefinition__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_8__3();

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
    // $ANTLR end "rule__SkillDefinition__Group_8__2"


    // $ANTLR start "rule__SkillDefinition__Group_8__2__Impl"
    // InternalMROS.g:1663:1: rule__SkillDefinition__Group_8__2__Impl : ( ( rule__SkillDefinition__PAssignment_8_2 ) ) ;
    public final void rule__SkillDefinition__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1667:1: ( ( ( rule__SkillDefinition__PAssignment_8_2 ) ) )
            // InternalMROS.g:1668:1: ( ( rule__SkillDefinition__PAssignment_8_2 ) )
            {
            // InternalMROS.g:1668:1: ( ( rule__SkillDefinition__PAssignment_8_2 ) )
            // InternalMROS.g:1669:2: ( rule__SkillDefinition__PAssignment_8_2 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getPAssignment_8_2()); 
            // InternalMROS.g:1670:2: ( rule__SkillDefinition__PAssignment_8_2 )
            // InternalMROS.g:1670:3: rule__SkillDefinition__PAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__PAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getPAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_8__2__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_8__3"
    // InternalMROS.g:1678:1: rule__SkillDefinition__Group_8__3 : rule__SkillDefinition__Group_8__3__Impl rule__SkillDefinition__Group_8__4 ;
    public final void rule__SkillDefinition__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1682:1: ( rule__SkillDefinition__Group_8__3__Impl rule__SkillDefinition__Group_8__4 )
            // InternalMROS.g:1683:2: rule__SkillDefinition__Group_8__3__Impl rule__SkillDefinition__Group_8__4
            {
            pushFollow(FOLLOW_16);
            rule__SkillDefinition__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_8__4();

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
    // $ANTLR end "rule__SkillDefinition__Group_8__3"


    // $ANTLR start "rule__SkillDefinition__Group_8__3__Impl"
    // InternalMROS.g:1690:1: rule__SkillDefinition__Group_8__3__Impl : ( ( rule__SkillDefinition__Group_8_3__0 )* ) ;
    public final void rule__SkillDefinition__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1694:1: ( ( ( rule__SkillDefinition__Group_8_3__0 )* ) )
            // InternalMROS.g:1695:1: ( ( rule__SkillDefinition__Group_8_3__0 )* )
            {
            // InternalMROS.g:1695:1: ( ( rule__SkillDefinition__Group_8_3__0 )* )
            // InternalMROS.g:1696:2: ( rule__SkillDefinition__Group_8_3__0 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_8_3()); 
            // InternalMROS.g:1697:2: ( rule__SkillDefinition__Group_8_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMROS.g:1697:3: rule__SkillDefinition__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SkillDefinition__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_8__3__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_8__4"
    // InternalMROS.g:1705:1: rule__SkillDefinition__Group_8__4 : rule__SkillDefinition__Group_8__4__Impl ;
    public final void rule__SkillDefinition__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1709:1: ( rule__SkillDefinition__Group_8__4__Impl )
            // InternalMROS.g:1710:2: rule__SkillDefinition__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_8__4__Impl();

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
    // $ANTLR end "rule__SkillDefinition__Group_8__4"


    // $ANTLR start "rule__SkillDefinition__Group_8__4__Impl"
    // InternalMROS.g:1716:1: rule__SkillDefinition__Group_8__4__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1720:1: ( ( '}' ) )
            // InternalMROS.g:1721:1: ( '}' )
            {
            // InternalMROS.g:1721:1: ( '}' )
            // InternalMROS.g:1722:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_8__4__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_8_3__0"
    // InternalMROS.g:1732:1: rule__SkillDefinition__Group_8_3__0 : rule__SkillDefinition__Group_8_3__0__Impl rule__SkillDefinition__Group_8_3__1 ;
    public final void rule__SkillDefinition__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1736:1: ( rule__SkillDefinition__Group_8_3__0__Impl rule__SkillDefinition__Group_8_3__1 )
            // InternalMROS.g:1737:2: rule__SkillDefinition__Group_8_3__0__Impl rule__SkillDefinition__Group_8_3__1
            {
            pushFollow(FOLLOW_6);
            rule__SkillDefinition__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_8_3__1();

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
    // $ANTLR end "rule__SkillDefinition__Group_8_3__0"


    // $ANTLR start "rule__SkillDefinition__Group_8_3__0__Impl"
    // InternalMROS.g:1744:1: rule__SkillDefinition__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__SkillDefinition__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1748:1: ( ( ',' ) )
            // InternalMROS.g:1749:1: ( ',' )
            {
            // InternalMROS.g:1749:1: ( ',' )
            // InternalMROS.g:1750:2: ','
            {
             before(grammarAccess.getSkillDefinitionAccess().getCommaKeyword_8_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_8_3__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_8_3__1"
    // InternalMROS.g:1759:1: rule__SkillDefinition__Group_8_3__1 : rule__SkillDefinition__Group_8_3__1__Impl ;
    public final void rule__SkillDefinition__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1763:1: ( rule__SkillDefinition__Group_8_3__1__Impl )
            // InternalMROS.g:1764:2: rule__SkillDefinition__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__SkillDefinition__Group_8_3__1"


    // $ANTLR start "rule__SkillDefinition__Group_8_3__1__Impl"
    // InternalMROS.g:1770:1: rule__SkillDefinition__Group_8_3__1__Impl : ( ( rule__SkillDefinition__PAssignment_8_3_1 ) ) ;
    public final void rule__SkillDefinition__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1774:1: ( ( ( rule__SkillDefinition__PAssignment_8_3_1 ) ) )
            // InternalMROS.g:1775:1: ( ( rule__SkillDefinition__PAssignment_8_3_1 ) )
            {
            // InternalMROS.g:1775:1: ( ( rule__SkillDefinition__PAssignment_8_3_1 ) )
            // InternalMROS.g:1776:2: ( rule__SkillDefinition__PAssignment_8_3_1 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getPAssignment_8_3_1()); 
            // InternalMROS.g:1777:2: ( rule__SkillDefinition__PAssignment_8_3_1 )
            // InternalMROS.g:1777:3: rule__SkillDefinition__PAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__PAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getPAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_8_3__1__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_9__0"
    // InternalMROS.g:1786:1: rule__SkillDefinition__Group_9__0 : rule__SkillDefinition__Group_9__0__Impl rule__SkillDefinition__Group_9__1 ;
    public final void rule__SkillDefinition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1790:1: ( rule__SkillDefinition__Group_9__0__Impl rule__SkillDefinition__Group_9__1 )
            // InternalMROS.g:1791:2: rule__SkillDefinition__Group_9__0__Impl rule__SkillDefinition__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__SkillDefinition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_9__1();

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
    // $ANTLR end "rule__SkillDefinition__Group_9__0"


    // $ANTLR start "rule__SkillDefinition__Group_9__0__Impl"
    // InternalMROS.g:1798:1: rule__SkillDefinition__Group_9__0__Impl : ( 'output' ) ;
    public final void rule__SkillDefinition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1802:1: ( ( 'output' ) )
            // InternalMROS.g:1803:1: ( 'output' )
            {
            // InternalMROS.g:1803:1: ( 'output' )
            // InternalMROS.g:1804:2: 'output'
            {
             before(grammarAccess.getSkillDefinitionAccess().getOutputKeyword_9_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getOutputKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_9__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_9__1"
    // InternalMROS.g:1813:1: rule__SkillDefinition__Group_9__1 : rule__SkillDefinition__Group_9__1__Impl rule__SkillDefinition__Group_9__2 ;
    public final void rule__SkillDefinition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1817:1: ( rule__SkillDefinition__Group_9__1__Impl rule__SkillDefinition__Group_9__2 )
            // InternalMROS.g:1818:2: rule__SkillDefinition__Group_9__1__Impl rule__SkillDefinition__Group_9__2
            {
            pushFollow(FOLLOW_6);
            rule__SkillDefinition__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_9__2();

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
    // $ANTLR end "rule__SkillDefinition__Group_9__1"


    // $ANTLR start "rule__SkillDefinition__Group_9__1__Impl"
    // InternalMROS.g:1825:1: rule__SkillDefinition__Group_9__1__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1829:1: ( ( '{' ) )
            // InternalMROS.g:1830:1: ( '{' )
            {
            // InternalMROS.g:1830:1: ( '{' )
            // InternalMROS.g:1831:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_9__1__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_9__2"
    // InternalMROS.g:1840:1: rule__SkillDefinition__Group_9__2 : rule__SkillDefinition__Group_9__2__Impl rule__SkillDefinition__Group_9__3 ;
    public final void rule__SkillDefinition__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1844:1: ( rule__SkillDefinition__Group_9__2__Impl rule__SkillDefinition__Group_9__3 )
            // InternalMROS.g:1845:2: rule__SkillDefinition__Group_9__2__Impl rule__SkillDefinition__Group_9__3
            {
            pushFollow(FOLLOW_16);
            rule__SkillDefinition__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_9__3();

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
    // $ANTLR end "rule__SkillDefinition__Group_9__2"


    // $ANTLR start "rule__SkillDefinition__Group_9__2__Impl"
    // InternalMROS.g:1852:1: rule__SkillDefinition__Group_9__2__Impl : ( ( rule__SkillDefinition__PAssignment_9_2 ) ) ;
    public final void rule__SkillDefinition__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1856:1: ( ( ( rule__SkillDefinition__PAssignment_9_2 ) ) )
            // InternalMROS.g:1857:1: ( ( rule__SkillDefinition__PAssignment_9_2 ) )
            {
            // InternalMROS.g:1857:1: ( ( rule__SkillDefinition__PAssignment_9_2 ) )
            // InternalMROS.g:1858:2: ( rule__SkillDefinition__PAssignment_9_2 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getPAssignment_9_2()); 
            // InternalMROS.g:1859:2: ( rule__SkillDefinition__PAssignment_9_2 )
            // InternalMROS.g:1859:3: rule__SkillDefinition__PAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__PAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getPAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_9__2__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_9__3"
    // InternalMROS.g:1867:1: rule__SkillDefinition__Group_9__3 : rule__SkillDefinition__Group_9__3__Impl rule__SkillDefinition__Group_9__4 ;
    public final void rule__SkillDefinition__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1871:1: ( rule__SkillDefinition__Group_9__3__Impl rule__SkillDefinition__Group_9__4 )
            // InternalMROS.g:1872:2: rule__SkillDefinition__Group_9__3__Impl rule__SkillDefinition__Group_9__4
            {
            pushFollow(FOLLOW_16);
            rule__SkillDefinition__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_9__4();

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
    // $ANTLR end "rule__SkillDefinition__Group_9__3"


    // $ANTLR start "rule__SkillDefinition__Group_9__3__Impl"
    // InternalMROS.g:1879:1: rule__SkillDefinition__Group_9__3__Impl : ( ( rule__SkillDefinition__Group_9_3__0 )* ) ;
    public final void rule__SkillDefinition__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1883:1: ( ( ( rule__SkillDefinition__Group_9_3__0 )* ) )
            // InternalMROS.g:1884:1: ( ( rule__SkillDefinition__Group_9_3__0 )* )
            {
            // InternalMROS.g:1884:1: ( ( rule__SkillDefinition__Group_9_3__0 )* )
            // InternalMROS.g:1885:2: ( rule__SkillDefinition__Group_9_3__0 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_9_3()); 
            // InternalMROS.g:1886:2: ( rule__SkillDefinition__Group_9_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMROS.g:1886:3: rule__SkillDefinition__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SkillDefinition__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_9__3__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_9__4"
    // InternalMROS.g:1894:1: rule__SkillDefinition__Group_9__4 : rule__SkillDefinition__Group_9__4__Impl ;
    public final void rule__SkillDefinition__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1898:1: ( rule__SkillDefinition__Group_9__4__Impl )
            // InternalMROS.g:1899:2: rule__SkillDefinition__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_9__4__Impl();

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
    // $ANTLR end "rule__SkillDefinition__Group_9__4"


    // $ANTLR start "rule__SkillDefinition__Group_9__4__Impl"
    // InternalMROS.g:1905:1: rule__SkillDefinition__Group_9__4__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1909:1: ( ( '}' ) )
            // InternalMROS.g:1910:1: ( '}' )
            {
            // InternalMROS.g:1910:1: ( '}' )
            // InternalMROS.g:1911:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_9__4__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_9_3__0"
    // InternalMROS.g:1921:1: rule__SkillDefinition__Group_9_3__0 : rule__SkillDefinition__Group_9_3__0__Impl rule__SkillDefinition__Group_9_3__1 ;
    public final void rule__SkillDefinition__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1925:1: ( rule__SkillDefinition__Group_9_3__0__Impl rule__SkillDefinition__Group_9_3__1 )
            // InternalMROS.g:1926:2: rule__SkillDefinition__Group_9_3__0__Impl rule__SkillDefinition__Group_9_3__1
            {
            pushFollow(FOLLOW_6);
            rule__SkillDefinition__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_9_3__1();

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
    // $ANTLR end "rule__SkillDefinition__Group_9_3__0"


    // $ANTLR start "rule__SkillDefinition__Group_9_3__0__Impl"
    // InternalMROS.g:1933:1: rule__SkillDefinition__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__SkillDefinition__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1937:1: ( ( ',' ) )
            // InternalMROS.g:1938:1: ( ',' )
            {
            // InternalMROS.g:1938:1: ( ',' )
            // InternalMROS.g:1939:2: ','
            {
             before(grammarAccess.getSkillDefinitionAccess().getCommaKeyword_9_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_9_3__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_9_3__1"
    // InternalMROS.g:1948:1: rule__SkillDefinition__Group_9_3__1 : rule__SkillDefinition__Group_9_3__1__Impl ;
    public final void rule__SkillDefinition__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1952:1: ( rule__SkillDefinition__Group_9_3__1__Impl )
            // InternalMROS.g:1953:2: rule__SkillDefinition__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__SkillDefinition__Group_9_3__1"


    // $ANTLR start "rule__SkillDefinition__Group_9_3__1__Impl"
    // InternalMROS.g:1959:1: rule__SkillDefinition__Group_9_3__1__Impl : ( ( rule__SkillDefinition__PAssignment_9_3_1 ) ) ;
    public final void rule__SkillDefinition__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1963:1: ( ( ( rule__SkillDefinition__PAssignment_9_3_1 ) ) )
            // InternalMROS.g:1964:1: ( ( rule__SkillDefinition__PAssignment_9_3_1 ) )
            {
            // InternalMROS.g:1964:1: ( ( rule__SkillDefinition__PAssignment_9_3_1 ) )
            // InternalMROS.g:1965:2: ( rule__SkillDefinition__PAssignment_9_3_1 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getPAssignment_9_3_1()); 
            // InternalMROS.g:1966:2: ( rule__SkillDefinition__PAssignment_9_3_1 )
            // InternalMROS.g:1966:3: rule__SkillDefinition__PAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__PAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getPAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_9_3__1__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_13__0"
    // InternalMROS.g:1975:1: rule__SkillDefinition__Group_13__0 : rule__SkillDefinition__Group_13__0__Impl rule__SkillDefinition__Group_13__1 ;
    public final void rule__SkillDefinition__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1979:1: ( rule__SkillDefinition__Group_13__0__Impl rule__SkillDefinition__Group_13__1 )
            // InternalMROS.g:1980:2: rule__SkillDefinition__Group_13__0__Impl rule__SkillDefinition__Group_13__1
            {
            pushFollow(FOLLOW_15);
            rule__SkillDefinition__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_13__1();

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
    // $ANTLR end "rule__SkillDefinition__Group_13__0"


    // $ANTLR start "rule__SkillDefinition__Group_13__0__Impl"
    // InternalMROS.g:1987:1: rule__SkillDefinition__Group_13__0__Impl : ( ',' ) ;
    public final void rule__SkillDefinition__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:1991:1: ( ( ',' ) )
            // InternalMROS.g:1992:1: ( ',' )
            {
            // InternalMROS.g:1992:1: ( ',' )
            // InternalMROS.g:1993:2: ','
            {
             before(grammarAccess.getSkillDefinitionAccess().getCommaKeyword_13_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_13__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_13__1"
    // InternalMROS.g:2002:1: rule__SkillDefinition__Group_13__1 : rule__SkillDefinition__Group_13__1__Impl ;
    public final void rule__SkillDefinition__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2006:1: ( rule__SkillDefinition__Group_13__1__Impl )
            // InternalMROS.g:2007:2: rule__SkillDefinition__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_13__1__Impl();

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
    // $ANTLR end "rule__SkillDefinition__Group_13__1"


    // $ANTLR start "rule__SkillDefinition__Group_13__1__Impl"
    // InternalMROS.g:2013:1: rule__SkillDefinition__Group_13__1__Impl : ( ( rule__SkillDefinition__ResultAssignment_13_1 ) ) ;
    public final void rule__SkillDefinition__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2017:1: ( ( ( rule__SkillDefinition__ResultAssignment_13_1 ) ) )
            // InternalMROS.g:2018:1: ( ( rule__SkillDefinition__ResultAssignment_13_1 ) )
            {
            // InternalMROS.g:2018:1: ( ( rule__SkillDefinition__ResultAssignment_13_1 ) )
            // InternalMROS.g:2019:2: ( rule__SkillDefinition__ResultAssignment_13_1 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultAssignment_13_1()); 
            // InternalMROS.g:2020:2: ( rule__SkillDefinition__ResultAssignment_13_1 )
            // InternalMROS.g:2020:3: rule__SkillDefinition__ResultAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__ResultAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getResultAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_13__1__Impl"


    // $ANTLR start "rule__SUCCESS__Group__0"
    // InternalMROS.g:2029:1: rule__SUCCESS__Group__0 : rule__SUCCESS__Group__0__Impl rule__SUCCESS__Group__1 ;
    public final void rule__SUCCESS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2033:1: ( rule__SUCCESS__Group__0__Impl rule__SUCCESS__Group__1 )
            // InternalMROS.g:2034:2: rule__SUCCESS__Group__0__Impl rule__SUCCESS__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SUCCESS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUCCESS__Group__1();

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
    // $ANTLR end "rule__SUCCESS__Group__0"


    // $ANTLR start "rule__SUCCESS__Group__0__Impl"
    // InternalMROS.g:2041:1: rule__SUCCESS__Group__0__Impl : ( 'success' ) ;
    public final void rule__SUCCESS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2045:1: ( ( 'success' ) )
            // InternalMROS.g:2046:1: ( 'success' )
            {
            // InternalMROS.g:2046:1: ( 'success' )
            // InternalMROS.g:2047:2: 'success'
            {
             before(grammarAccess.getSUCCESSAccess().getSuccessKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSUCCESSAccess().getSuccessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUCCESS__Group__0__Impl"


    // $ANTLR start "rule__SUCCESS__Group__1"
    // InternalMROS.g:2056:1: rule__SUCCESS__Group__1 : rule__SUCCESS__Group__1__Impl rule__SUCCESS__Group__2 ;
    public final void rule__SUCCESS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2060:1: ( rule__SUCCESS__Group__1__Impl rule__SUCCESS__Group__2 )
            // InternalMROS.g:2061:2: rule__SUCCESS__Group__1__Impl rule__SUCCESS__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__SUCCESS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUCCESS__Group__2();

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
    // $ANTLR end "rule__SUCCESS__Group__1"


    // $ANTLR start "rule__SUCCESS__Group__1__Impl"
    // InternalMROS.g:2068:1: rule__SUCCESS__Group__1__Impl : ( ':' ) ;
    public final void rule__SUCCESS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2072:1: ( ( ':' ) )
            // InternalMROS.g:2073:1: ( ':' )
            {
            // InternalMROS.g:2073:1: ( ':' )
            // InternalMROS.g:2074:2: ':'
            {
             before(grammarAccess.getSUCCESSAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSUCCESSAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUCCESS__Group__1__Impl"


    // $ANTLR start "rule__SUCCESS__Group__2"
    // InternalMROS.g:2083:1: rule__SUCCESS__Group__2 : rule__SUCCESS__Group__2__Impl rule__SUCCESS__Group__3 ;
    public final void rule__SUCCESS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2087:1: ( rule__SUCCESS__Group__2__Impl rule__SUCCESS__Group__3 )
            // InternalMROS.g:2088:2: rule__SUCCESS__Group__2__Impl rule__SUCCESS__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SUCCESS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUCCESS__Group__3();

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
    // $ANTLR end "rule__SUCCESS__Group__2"


    // $ANTLR start "rule__SUCCESS__Group__2__Impl"
    // InternalMROS.g:2095:1: rule__SUCCESS__Group__2__Impl : ( ( rule__SUCCESS__ValueAssignment_2 )? ) ;
    public final void rule__SUCCESS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2099:1: ( ( ( rule__SUCCESS__ValueAssignment_2 )? ) )
            // InternalMROS.g:2100:1: ( ( rule__SUCCESS__ValueAssignment_2 )? )
            {
            // InternalMROS.g:2100:1: ( ( rule__SUCCESS__ValueAssignment_2 )? )
            // InternalMROS.g:2101:2: ( rule__SUCCESS__ValueAssignment_2 )?
            {
             before(grammarAccess.getSUCCESSAccess().getValueAssignment_2()); 
            // InternalMROS.g:2102:2: ( rule__SUCCESS__ValueAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMROS.g:2102:3: rule__SUCCESS__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SUCCESS__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSUCCESSAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUCCESS__Group__2__Impl"


    // $ANTLR start "rule__SUCCESS__Group__3"
    // InternalMROS.g:2110:1: rule__SUCCESS__Group__3 : rule__SUCCESS__Group__3__Impl ;
    public final void rule__SUCCESS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2114:1: ( rule__SUCCESS__Group__3__Impl )
            // InternalMROS.g:2115:2: rule__SUCCESS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SUCCESS__Group__3__Impl();

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
    // $ANTLR end "rule__SUCCESS__Group__3"


    // $ANTLR start "rule__SUCCESS__Group__3__Impl"
    // InternalMROS.g:2121:1: rule__SUCCESS__Group__3__Impl : ( ( rule__SUCCESS__ValueAssignment_3 )? ) ;
    public final void rule__SUCCESS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2125:1: ( ( ( rule__SUCCESS__ValueAssignment_3 )? ) )
            // InternalMROS.g:2126:1: ( ( rule__SUCCESS__ValueAssignment_3 )? )
            {
            // InternalMROS.g:2126:1: ( ( rule__SUCCESS__ValueAssignment_3 )? )
            // InternalMROS.g:2127:2: ( rule__SUCCESS__ValueAssignment_3 )?
            {
             before(grammarAccess.getSUCCESSAccess().getValueAssignment_3()); 
            // InternalMROS.g:2128:2: ( rule__SUCCESS__ValueAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT||LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMROS.g:2128:3: rule__SUCCESS__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SUCCESS__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSUCCESSAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUCCESS__Group__3__Impl"


    // $ANTLR start "rule__ERROR__Group__0"
    // InternalMROS.g:2137:1: rule__ERROR__Group__0 : rule__ERROR__Group__0__Impl rule__ERROR__Group__1 ;
    public final void rule__ERROR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2141:1: ( rule__ERROR__Group__0__Impl rule__ERROR__Group__1 )
            // InternalMROS.g:2142:2: rule__ERROR__Group__0__Impl rule__ERROR__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ERROR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERROR__Group__1();

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
    // $ANTLR end "rule__ERROR__Group__0"


    // $ANTLR start "rule__ERROR__Group__0__Impl"
    // InternalMROS.g:2149:1: rule__ERROR__Group__0__Impl : ( 'error' ) ;
    public final void rule__ERROR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2153:1: ( ( 'error' ) )
            // InternalMROS.g:2154:1: ( 'error' )
            {
            // InternalMROS.g:2154:1: ( 'error' )
            // InternalMROS.g:2155:2: 'error'
            {
             before(grammarAccess.getERRORAccess().getErrorKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getERRORAccess().getErrorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERROR__Group__0__Impl"


    // $ANTLR start "rule__ERROR__Group__1"
    // InternalMROS.g:2164:1: rule__ERROR__Group__1 : rule__ERROR__Group__1__Impl rule__ERROR__Group__2 ;
    public final void rule__ERROR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2168:1: ( rule__ERROR__Group__1__Impl rule__ERROR__Group__2 )
            // InternalMROS.g:2169:2: rule__ERROR__Group__1__Impl rule__ERROR__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ERROR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERROR__Group__2();

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
    // $ANTLR end "rule__ERROR__Group__1"


    // $ANTLR start "rule__ERROR__Group__1__Impl"
    // InternalMROS.g:2176:1: rule__ERROR__Group__1__Impl : ( ':' ) ;
    public final void rule__ERROR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2180:1: ( ( ':' ) )
            // InternalMROS.g:2181:1: ( ':' )
            {
            // InternalMROS.g:2181:1: ( ':' )
            // InternalMROS.g:2182:2: ':'
            {
             before(grammarAccess.getERRORAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getERRORAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERROR__Group__1__Impl"


    // $ANTLR start "rule__ERROR__Group__2"
    // InternalMROS.g:2191:1: rule__ERROR__Group__2 : rule__ERROR__Group__2__Impl rule__ERROR__Group__3 ;
    public final void rule__ERROR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2195:1: ( rule__ERROR__Group__2__Impl rule__ERROR__Group__3 )
            // InternalMROS.g:2196:2: rule__ERROR__Group__2__Impl rule__ERROR__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ERROR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERROR__Group__3();

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
    // $ANTLR end "rule__ERROR__Group__2"


    // $ANTLR start "rule__ERROR__Group__2__Impl"
    // InternalMROS.g:2203:1: rule__ERROR__Group__2__Impl : ( ( rule__ERROR__ValueAssignment_2 )? ) ;
    public final void rule__ERROR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2207:1: ( ( ( rule__ERROR__ValueAssignment_2 )? ) )
            // InternalMROS.g:2208:1: ( ( rule__ERROR__ValueAssignment_2 )? )
            {
            // InternalMROS.g:2208:1: ( ( rule__ERROR__ValueAssignment_2 )? )
            // InternalMROS.g:2209:2: ( rule__ERROR__ValueAssignment_2 )?
            {
             before(grammarAccess.getERRORAccess().getValueAssignment_2()); 
            // InternalMROS.g:2210:2: ( rule__ERROR__ValueAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMROS.g:2210:3: rule__ERROR__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ERROR__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getERRORAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERROR__Group__2__Impl"


    // $ANTLR start "rule__ERROR__Group__3"
    // InternalMROS.g:2218:1: rule__ERROR__Group__3 : rule__ERROR__Group__3__Impl ;
    public final void rule__ERROR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2222:1: ( rule__ERROR__Group__3__Impl )
            // InternalMROS.g:2223:2: rule__ERROR__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERROR__Group__3__Impl();

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
    // $ANTLR end "rule__ERROR__Group__3"


    // $ANTLR start "rule__ERROR__Group__3__Impl"
    // InternalMROS.g:2229:1: rule__ERROR__Group__3__Impl : ( ( rule__ERROR__ValueAssignment_3 )? ) ;
    public final void rule__ERROR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2233:1: ( ( ( rule__ERROR__ValueAssignment_3 )? ) )
            // InternalMROS.g:2234:1: ( ( rule__ERROR__ValueAssignment_3 )? )
            {
            // InternalMROS.g:2234:1: ( ( rule__ERROR__ValueAssignment_3 )? )
            // InternalMROS.g:2235:2: ( rule__ERROR__ValueAssignment_3 )?
            {
             before(grammarAccess.getERRORAccess().getValueAssignment_3()); 
            // InternalMROS.g:2236:2: ( rule__ERROR__ValueAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT||LA18_0==54) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMROS.g:2236:3: rule__ERROR__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ERROR__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getERRORAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERROR__Group__3__Impl"


    // $ANTLR start "rule__INPROGRESS__Group__0"
    // InternalMROS.g:2245:1: rule__INPROGRESS__Group__0 : rule__INPROGRESS__Group__0__Impl rule__INPROGRESS__Group__1 ;
    public final void rule__INPROGRESS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2249:1: ( rule__INPROGRESS__Group__0__Impl rule__INPROGRESS__Group__1 )
            // InternalMROS.g:2250:2: rule__INPROGRESS__Group__0__Impl rule__INPROGRESS__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__INPROGRESS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INPROGRESS__Group__1();

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
    // $ANTLR end "rule__INPROGRESS__Group__0"


    // $ANTLR start "rule__INPROGRESS__Group__0__Impl"
    // InternalMROS.g:2257:1: rule__INPROGRESS__Group__0__Impl : ( 'inprogress' ) ;
    public final void rule__INPROGRESS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2261:1: ( ( 'inprogress' ) )
            // InternalMROS.g:2262:1: ( 'inprogress' )
            {
            // InternalMROS.g:2262:1: ( 'inprogress' )
            // InternalMROS.g:2263:2: 'inprogress'
            {
             before(grammarAccess.getINPROGRESSAccess().getInprogressKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getINPROGRESSAccess().getInprogressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INPROGRESS__Group__0__Impl"


    // $ANTLR start "rule__INPROGRESS__Group__1"
    // InternalMROS.g:2272:1: rule__INPROGRESS__Group__1 : rule__INPROGRESS__Group__1__Impl rule__INPROGRESS__Group__2 ;
    public final void rule__INPROGRESS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2276:1: ( rule__INPROGRESS__Group__1__Impl rule__INPROGRESS__Group__2 )
            // InternalMROS.g:2277:2: rule__INPROGRESS__Group__1__Impl rule__INPROGRESS__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__INPROGRESS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INPROGRESS__Group__2();

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
    // $ANTLR end "rule__INPROGRESS__Group__1"


    // $ANTLR start "rule__INPROGRESS__Group__1__Impl"
    // InternalMROS.g:2284:1: rule__INPROGRESS__Group__1__Impl : ( ':' ) ;
    public final void rule__INPROGRESS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2288:1: ( ( ':' ) )
            // InternalMROS.g:2289:1: ( ':' )
            {
            // InternalMROS.g:2289:1: ( ':' )
            // InternalMROS.g:2290:2: ':'
            {
             before(grammarAccess.getINPROGRESSAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getINPROGRESSAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INPROGRESS__Group__1__Impl"


    // $ANTLR start "rule__INPROGRESS__Group__2"
    // InternalMROS.g:2299:1: rule__INPROGRESS__Group__2 : rule__INPROGRESS__Group__2__Impl rule__INPROGRESS__Group__3 ;
    public final void rule__INPROGRESS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2303:1: ( rule__INPROGRESS__Group__2__Impl rule__INPROGRESS__Group__3 )
            // InternalMROS.g:2304:2: rule__INPROGRESS__Group__2__Impl rule__INPROGRESS__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__INPROGRESS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INPROGRESS__Group__3();

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
    // $ANTLR end "rule__INPROGRESS__Group__2"


    // $ANTLR start "rule__INPROGRESS__Group__2__Impl"
    // InternalMROS.g:2311:1: rule__INPROGRESS__Group__2__Impl : ( ( rule__INPROGRESS__ValueAssignment_2 )? ) ;
    public final void rule__INPROGRESS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2315:1: ( ( ( rule__INPROGRESS__ValueAssignment_2 )? ) )
            // InternalMROS.g:2316:1: ( ( rule__INPROGRESS__ValueAssignment_2 )? )
            {
            // InternalMROS.g:2316:1: ( ( rule__INPROGRESS__ValueAssignment_2 )? )
            // InternalMROS.g:2317:2: ( rule__INPROGRESS__ValueAssignment_2 )?
            {
             before(grammarAccess.getINPROGRESSAccess().getValueAssignment_2()); 
            // InternalMROS.g:2318:2: ( rule__INPROGRESS__ValueAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMROS.g:2318:3: rule__INPROGRESS__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__INPROGRESS__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getINPROGRESSAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INPROGRESS__Group__2__Impl"


    // $ANTLR start "rule__INPROGRESS__Group__3"
    // InternalMROS.g:2326:1: rule__INPROGRESS__Group__3 : rule__INPROGRESS__Group__3__Impl ;
    public final void rule__INPROGRESS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2330:1: ( rule__INPROGRESS__Group__3__Impl )
            // InternalMROS.g:2331:2: rule__INPROGRESS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INPROGRESS__Group__3__Impl();

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
    // $ANTLR end "rule__INPROGRESS__Group__3"


    // $ANTLR start "rule__INPROGRESS__Group__3__Impl"
    // InternalMROS.g:2337:1: rule__INPROGRESS__Group__3__Impl : ( ( rule__INPROGRESS__ValueAssignment_3 )? ) ;
    public final void rule__INPROGRESS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2341:1: ( ( ( rule__INPROGRESS__ValueAssignment_3 )? ) )
            // InternalMROS.g:2342:1: ( ( rule__INPROGRESS__ValueAssignment_3 )? )
            {
            // InternalMROS.g:2342:1: ( ( rule__INPROGRESS__ValueAssignment_3 )? )
            // InternalMROS.g:2343:2: ( rule__INPROGRESS__ValueAssignment_3 )?
            {
             before(grammarAccess.getINPROGRESSAccess().getValueAssignment_3()); 
            // InternalMROS.g:2344:2: ( rule__INPROGRESS__ValueAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT||LA20_0==54) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMROS.g:2344:3: rule__INPROGRESS__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__INPROGRESS__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getINPROGRESSAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INPROGRESS__Group__3__Impl"


    // $ANTLR start "rule__SkillRealization__Group__0"
    // InternalMROS.g:2353:1: rule__SkillRealization__Group__0 : rule__SkillRealization__Group__0__Impl rule__SkillRealization__Group__1 ;
    public final void rule__SkillRealization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2357:1: ( rule__SkillRealization__Group__0__Impl rule__SkillRealization__Group__1 )
            // InternalMROS.g:2358:2: rule__SkillRealization__Group__0__Impl rule__SkillRealization__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SkillRealization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__1();

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
    // $ANTLR end "rule__SkillRealization__Group__0"


    // $ANTLR start "rule__SkillRealization__Group__0__Impl"
    // InternalMROS.g:2365:1: rule__SkillRealization__Group__0__Impl : ( 'Realization' ) ;
    public final void rule__SkillRealization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2369:1: ( ( 'Realization' ) )
            // InternalMROS.g:2370:1: ( 'Realization' )
            {
            // InternalMROS.g:2370:1: ( 'Realization' )
            // InternalMROS.g:2371:2: 'Realization'
            {
             before(grammarAccess.getSkillRealizationAccess().getRealizationKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getRealizationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group__0__Impl"


    // $ANTLR start "rule__SkillRealization__Group__1"
    // InternalMROS.g:2380:1: rule__SkillRealization__Group__1 : rule__SkillRealization__Group__1__Impl rule__SkillRealization__Group__2 ;
    public final void rule__SkillRealization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2384:1: ( rule__SkillRealization__Group__1__Impl rule__SkillRealization__Group__2 )
            // InternalMROS.g:2385:2: rule__SkillRealization__Group__1__Impl rule__SkillRealization__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SkillRealization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__2();

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
    // $ANTLR end "rule__SkillRealization__Group__1"


    // $ANTLR start "rule__SkillRealization__Group__1__Impl"
    // InternalMROS.g:2392:1: rule__SkillRealization__Group__1__Impl : ( ( rule__SkillRealization__NameAssignment_1 ) ) ;
    public final void rule__SkillRealization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2396:1: ( ( ( rule__SkillRealization__NameAssignment_1 ) ) )
            // InternalMROS.g:2397:1: ( ( rule__SkillRealization__NameAssignment_1 ) )
            {
            // InternalMROS.g:2397:1: ( ( rule__SkillRealization__NameAssignment_1 ) )
            // InternalMROS.g:2398:2: ( rule__SkillRealization__NameAssignment_1 )
            {
             before(grammarAccess.getSkillRealizationAccess().getNameAssignment_1()); 
            // InternalMROS.g:2399:2: ( rule__SkillRealization__NameAssignment_1 )
            // InternalMROS.g:2399:3: rule__SkillRealization__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillRealizationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group__1__Impl"


    // $ANTLR start "rule__SkillRealization__Group__2"
    // InternalMROS.g:2407:1: rule__SkillRealization__Group__2 : rule__SkillRealization__Group__2__Impl rule__SkillRealization__Group__3 ;
    public final void rule__SkillRealization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2411:1: ( rule__SkillRealization__Group__2__Impl rule__SkillRealization__Group__3 )
            // InternalMROS.g:2412:2: rule__SkillRealization__Group__2__Impl rule__SkillRealization__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__SkillRealization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__3();

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
    // $ANTLR end "rule__SkillRealization__Group__2"


    // $ANTLR start "rule__SkillRealization__Group__2__Impl"
    // InternalMROS.g:2419:1: rule__SkillRealization__Group__2__Impl : ( '{' ) ;
    public final void rule__SkillRealization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2423:1: ( ( '{' ) )
            // InternalMROS.g:2424:1: ( '{' )
            {
            // InternalMROS.g:2424:1: ( '{' )
            // InternalMROS.g:2425:2: '{'
            {
             before(grammarAccess.getSkillRealizationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group__2__Impl"


    // $ANTLR start "rule__SkillRealization__Group__3"
    // InternalMROS.g:2434:1: rule__SkillRealization__Group__3 : rule__SkillRealization__Group__3__Impl rule__SkillRealization__Group__4 ;
    public final void rule__SkillRealization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2438:1: ( rule__SkillRealization__Group__3__Impl rule__SkillRealization__Group__4 )
            // InternalMROS.g:2439:2: rule__SkillRealization__Group__3__Impl rule__SkillRealization__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__SkillRealization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__4();

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
    // $ANTLR end "rule__SkillRealization__Group__3"


    // $ANTLR start "rule__SkillRealization__Group__3__Impl"
    // InternalMROS.g:2446:1: rule__SkillRealization__Group__3__Impl : ( ( rule__SkillRealization__CAssignment_3 ) ) ;
    public final void rule__SkillRealization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2450:1: ( ( ( rule__SkillRealization__CAssignment_3 ) ) )
            // InternalMROS.g:2451:1: ( ( rule__SkillRealization__CAssignment_3 ) )
            {
            // InternalMROS.g:2451:1: ( ( rule__SkillRealization__CAssignment_3 ) )
            // InternalMROS.g:2452:2: ( rule__SkillRealization__CAssignment_3 )
            {
             before(grammarAccess.getSkillRealizationAccess().getCAssignment_3()); 
            // InternalMROS.g:2453:2: ( rule__SkillRealization__CAssignment_3 )
            // InternalMROS.g:2453:3: rule__SkillRealization__CAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__CAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSkillRealizationAccess().getCAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group__3__Impl"


    // $ANTLR start "rule__SkillRealization__Group__4"
    // InternalMROS.g:2461:1: rule__SkillRealization__Group__4 : rule__SkillRealization__Group__4__Impl rule__SkillRealization__Group__5 ;
    public final void rule__SkillRealization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2465:1: ( rule__SkillRealization__Group__4__Impl rule__SkillRealization__Group__5 )
            // InternalMROS.g:2466:2: rule__SkillRealization__Group__4__Impl rule__SkillRealization__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__SkillRealization__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__5();

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
    // $ANTLR end "rule__SkillRealization__Group__4"


    // $ANTLR start "rule__SkillRealization__Group__4__Impl"
    // InternalMROS.g:2473:1: rule__SkillRealization__Group__4__Impl : ( ( rule__SkillRealization__Group_4__0 )* ) ;
    public final void rule__SkillRealization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2477:1: ( ( ( rule__SkillRealization__Group_4__0 )* ) )
            // InternalMROS.g:2478:1: ( ( rule__SkillRealization__Group_4__0 )* )
            {
            // InternalMROS.g:2478:1: ( ( rule__SkillRealization__Group_4__0 )* )
            // InternalMROS.g:2479:2: ( rule__SkillRealization__Group_4__0 )*
            {
             before(grammarAccess.getSkillRealizationAccess().getGroup_4()); 
            // InternalMROS.g:2480:2: ( rule__SkillRealization__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMROS.g:2480:3: rule__SkillRealization__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SkillRealization__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSkillRealizationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group__4__Impl"


    // $ANTLR start "rule__SkillRealization__Group__5"
    // InternalMROS.g:2488:1: rule__SkillRealization__Group__5 : rule__SkillRealization__Group__5__Impl rule__SkillRealization__Group__6 ;
    public final void rule__SkillRealization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2492:1: ( rule__SkillRealization__Group__5__Impl rule__SkillRealization__Group__6 )
            // InternalMROS.g:2493:2: rule__SkillRealization__Group__5__Impl rule__SkillRealization__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__SkillRealization__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__6();

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
    // $ANTLR end "rule__SkillRealization__Group__5"


    // $ANTLR start "rule__SkillRealization__Group__5__Impl"
    // InternalMROS.g:2500:1: rule__SkillRealization__Group__5__Impl : ( ( rule__SkillRealization__Group_5__0 )? ) ;
    public final void rule__SkillRealization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2504:1: ( ( ( rule__SkillRealization__Group_5__0 )? ) )
            // InternalMROS.g:2505:1: ( ( rule__SkillRealization__Group_5__0 )? )
            {
            // InternalMROS.g:2505:1: ( ( rule__SkillRealization__Group_5__0 )? )
            // InternalMROS.g:2506:2: ( rule__SkillRealization__Group_5__0 )?
            {
             before(grammarAccess.getSkillRealizationAccess().getGroup_5()); 
            // InternalMROS.g:2507:2: ( rule__SkillRealization__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMROS.g:2507:3: rule__SkillRealization__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SkillRealization__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSkillRealizationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group__5__Impl"


    // $ANTLR start "rule__SkillRealization__Group__6"
    // InternalMROS.g:2515:1: rule__SkillRealization__Group__6 : rule__SkillRealization__Group__6__Impl rule__SkillRealization__Group__7 ;
    public final void rule__SkillRealization__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2519:1: ( rule__SkillRealization__Group__6__Impl rule__SkillRealization__Group__7 )
            // InternalMROS.g:2520:2: rule__SkillRealization__Group__6__Impl rule__SkillRealization__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__SkillRealization__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__7();

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
    // $ANTLR end "rule__SkillRealization__Group__6"


    // $ANTLR start "rule__SkillRealization__Group__6__Impl"
    // InternalMROS.g:2527:1: rule__SkillRealization__Group__6__Impl : ( ( rule__SkillRealization__ContextAssignment_6 ) ) ;
    public final void rule__SkillRealization__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2531:1: ( ( ( rule__SkillRealization__ContextAssignment_6 ) ) )
            // InternalMROS.g:2532:1: ( ( rule__SkillRealization__ContextAssignment_6 ) )
            {
            // InternalMROS.g:2532:1: ( ( rule__SkillRealization__ContextAssignment_6 ) )
            // InternalMROS.g:2533:2: ( rule__SkillRealization__ContextAssignment_6 )
            {
             before(grammarAccess.getSkillRealizationAccess().getContextAssignment_6()); 
            // InternalMROS.g:2534:2: ( rule__SkillRealization__ContextAssignment_6 )
            // InternalMROS.g:2534:3: rule__SkillRealization__ContextAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__ContextAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSkillRealizationAccess().getContextAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group__6__Impl"


    // $ANTLR start "rule__SkillRealization__Group__7"
    // InternalMROS.g:2542:1: rule__SkillRealization__Group__7 : rule__SkillRealization__Group__7__Impl rule__SkillRealization__Group__8 ;
    public final void rule__SkillRealization__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2546:1: ( rule__SkillRealization__Group__7__Impl rule__SkillRealization__Group__8 )
            // InternalMROS.g:2547:2: rule__SkillRealization__Group__7__Impl rule__SkillRealization__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__SkillRealization__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__8();

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
    // $ANTLR end "rule__SkillRealization__Group__7"


    // $ANTLR start "rule__SkillRealization__Group__7__Impl"
    // InternalMROS.g:2554:1: rule__SkillRealization__Group__7__Impl : ( '}' ) ;
    public final void rule__SkillRealization__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2558:1: ( ( '}' ) )
            // InternalMROS.g:2559:1: ( '}' )
            {
            // InternalMROS.g:2559:1: ( '}' )
            // InternalMROS.g:2560:2: '}'
            {
             before(grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group__7__Impl"


    // $ANTLR start "rule__SkillRealization__Group__8"
    // InternalMROS.g:2569:1: rule__SkillRealization__Group__8 : rule__SkillRealization__Group__8__Impl ;
    public final void rule__SkillRealization__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2573:1: ( rule__SkillRealization__Group__8__Impl )
            // InternalMROS.g:2574:2: rule__SkillRealization__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group__8__Impl();

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
    // $ANTLR end "rule__SkillRealization__Group__8"


    // $ANTLR start "rule__SkillRealization__Group__8__Impl"
    // InternalMROS.g:2580:1: rule__SkillRealization__Group__8__Impl : ( ';' ) ;
    public final void rule__SkillRealization__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2584:1: ( ( ';' ) )
            // InternalMROS.g:2585:1: ( ';' )
            {
            // InternalMROS.g:2585:1: ( ';' )
            // InternalMROS.g:2586:2: ';'
            {
             before(grammarAccess.getSkillRealizationAccess().getSemicolonKeyword_8()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group__8__Impl"


    // $ANTLR start "rule__SkillRealization__Group_4__0"
    // InternalMROS.g:2596:1: rule__SkillRealization__Group_4__0 : rule__SkillRealization__Group_4__0__Impl rule__SkillRealization__Group_4__1 ;
    public final void rule__SkillRealization__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2600:1: ( rule__SkillRealization__Group_4__0__Impl rule__SkillRealization__Group_4__1 )
            // InternalMROS.g:2601:2: rule__SkillRealization__Group_4__0__Impl rule__SkillRealization__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__SkillRealization__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_4__1();

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
    // $ANTLR end "rule__SkillRealization__Group_4__0"


    // $ANTLR start "rule__SkillRealization__Group_4__0__Impl"
    // InternalMROS.g:2608:1: rule__SkillRealization__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SkillRealization__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2612:1: ( ( ',' ) )
            // InternalMROS.g:2613:1: ( ',' )
            {
            // InternalMROS.g:2613:1: ( ',' )
            // InternalMROS.g:2614:2: ','
            {
             before(grammarAccess.getSkillRealizationAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_4__0__Impl"


    // $ANTLR start "rule__SkillRealization__Group_4__1"
    // InternalMROS.g:2623:1: rule__SkillRealization__Group_4__1 : rule__SkillRealization__Group_4__1__Impl ;
    public final void rule__SkillRealization__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2627:1: ( rule__SkillRealization__Group_4__1__Impl )
            // InternalMROS.g:2628:2: rule__SkillRealization__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_4__1__Impl();

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
    // $ANTLR end "rule__SkillRealization__Group_4__1"


    // $ANTLR start "rule__SkillRealization__Group_4__1__Impl"
    // InternalMROS.g:2634:1: rule__SkillRealization__Group_4__1__Impl : ( ( rule__SkillRealization__CAssignment_4_1 ) ) ;
    public final void rule__SkillRealization__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2638:1: ( ( ( rule__SkillRealization__CAssignment_4_1 ) ) )
            // InternalMROS.g:2639:1: ( ( rule__SkillRealization__CAssignment_4_1 ) )
            {
            // InternalMROS.g:2639:1: ( ( rule__SkillRealization__CAssignment_4_1 ) )
            // InternalMROS.g:2640:2: ( rule__SkillRealization__CAssignment_4_1 )
            {
             before(grammarAccess.getSkillRealizationAccess().getCAssignment_4_1()); 
            // InternalMROS.g:2641:2: ( rule__SkillRealization__CAssignment_4_1 )
            // InternalMROS.g:2641:3: rule__SkillRealization__CAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__CAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillRealizationAccess().getCAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_4__1__Impl"


    // $ANTLR start "rule__SkillRealization__Group_5__0"
    // InternalMROS.g:2650:1: rule__SkillRealization__Group_5__0 : rule__SkillRealization__Group_5__0__Impl rule__SkillRealization__Group_5__1 ;
    public final void rule__SkillRealization__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2654:1: ( rule__SkillRealization__Group_5__0__Impl rule__SkillRealization__Group_5__1 )
            // InternalMROS.g:2655:2: rule__SkillRealization__Group_5__0__Impl rule__SkillRealization__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__SkillRealization__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_5__1();

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
    // $ANTLR end "rule__SkillRealization__Group_5__0"


    // $ANTLR start "rule__SkillRealization__Group_5__0__Impl"
    // InternalMROS.g:2662:1: rule__SkillRealization__Group_5__0__Impl : ( 'Quality' ) ;
    public final void rule__SkillRealization__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2666:1: ( ( 'Quality' ) )
            // InternalMROS.g:2667:1: ( 'Quality' )
            {
            // InternalMROS.g:2667:1: ( 'Quality' )
            // InternalMROS.g:2668:2: 'Quality'
            {
             before(grammarAccess.getSkillRealizationAccess().getQualityKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getQualityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_5__0__Impl"


    // $ANTLR start "rule__SkillRealization__Group_5__1"
    // InternalMROS.g:2677:1: rule__SkillRealization__Group_5__1 : rule__SkillRealization__Group_5__1__Impl rule__SkillRealization__Group_5__2 ;
    public final void rule__SkillRealization__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2681:1: ( rule__SkillRealization__Group_5__1__Impl rule__SkillRealization__Group_5__2 )
            // InternalMROS.g:2682:2: rule__SkillRealization__Group_5__1__Impl rule__SkillRealization__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__SkillRealization__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_5__2();

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
    // $ANTLR end "rule__SkillRealization__Group_5__1"


    // $ANTLR start "rule__SkillRealization__Group_5__1__Impl"
    // InternalMROS.g:2689:1: rule__SkillRealization__Group_5__1__Impl : ( '[' ) ;
    public final void rule__SkillRealization__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2693:1: ( ( '[' ) )
            // InternalMROS.g:2694:1: ( '[' )
            {
            // InternalMROS.g:2694:1: ( '[' )
            // InternalMROS.g:2695:2: '['
            {
             before(grammarAccess.getSkillRealizationAccess().getLeftSquareBracketKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getLeftSquareBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_5__1__Impl"


    // $ANTLR start "rule__SkillRealization__Group_5__2"
    // InternalMROS.g:2704:1: rule__SkillRealization__Group_5__2 : rule__SkillRealization__Group_5__2__Impl rule__SkillRealization__Group_5__3 ;
    public final void rule__SkillRealization__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2708:1: ( rule__SkillRealization__Group_5__2__Impl rule__SkillRealization__Group_5__3 )
            // InternalMROS.g:2709:2: rule__SkillRealization__Group_5__2__Impl rule__SkillRealization__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__SkillRealization__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_5__3();

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
    // $ANTLR end "rule__SkillRealization__Group_5__2"


    // $ANTLR start "rule__SkillRealization__Group_5__2__Impl"
    // InternalMROS.g:2716:1: rule__SkillRealization__Group_5__2__Impl : ( ( rule__SkillRealization__QAssignment_5_2 ) ) ;
    public final void rule__SkillRealization__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2720:1: ( ( ( rule__SkillRealization__QAssignment_5_2 ) ) )
            // InternalMROS.g:2721:1: ( ( rule__SkillRealization__QAssignment_5_2 ) )
            {
            // InternalMROS.g:2721:1: ( ( rule__SkillRealization__QAssignment_5_2 ) )
            // InternalMROS.g:2722:2: ( rule__SkillRealization__QAssignment_5_2 )
            {
             before(grammarAccess.getSkillRealizationAccess().getQAssignment_5_2()); 
            // InternalMROS.g:2723:2: ( rule__SkillRealization__QAssignment_5_2 )
            // InternalMROS.g:2723:3: rule__SkillRealization__QAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__QAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSkillRealizationAccess().getQAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_5__2__Impl"


    // $ANTLR start "rule__SkillRealization__Group_5__3"
    // InternalMROS.g:2731:1: rule__SkillRealization__Group_5__3 : rule__SkillRealization__Group_5__3__Impl rule__SkillRealization__Group_5__4 ;
    public final void rule__SkillRealization__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2735:1: ( rule__SkillRealization__Group_5__3__Impl rule__SkillRealization__Group_5__4 )
            // InternalMROS.g:2736:2: rule__SkillRealization__Group_5__3__Impl rule__SkillRealization__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__SkillRealization__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_5__4();

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
    // $ANTLR end "rule__SkillRealization__Group_5__3"


    // $ANTLR start "rule__SkillRealization__Group_5__3__Impl"
    // InternalMROS.g:2743:1: rule__SkillRealization__Group_5__3__Impl : ( ( rule__SkillRealization__Group_5_3__0 )* ) ;
    public final void rule__SkillRealization__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2747:1: ( ( ( rule__SkillRealization__Group_5_3__0 )* ) )
            // InternalMROS.g:2748:1: ( ( rule__SkillRealization__Group_5_3__0 )* )
            {
            // InternalMROS.g:2748:1: ( ( rule__SkillRealization__Group_5_3__0 )* )
            // InternalMROS.g:2749:2: ( rule__SkillRealization__Group_5_3__0 )*
            {
             before(grammarAccess.getSkillRealizationAccess().getGroup_5_3()); 
            // InternalMROS.g:2750:2: ( rule__SkillRealization__Group_5_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMROS.g:2750:3: rule__SkillRealization__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SkillRealization__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSkillRealizationAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_5__3__Impl"


    // $ANTLR start "rule__SkillRealization__Group_5__4"
    // InternalMROS.g:2758:1: rule__SkillRealization__Group_5__4 : rule__SkillRealization__Group_5__4__Impl rule__SkillRealization__Group_5__5 ;
    public final void rule__SkillRealization__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2762:1: ( rule__SkillRealization__Group_5__4__Impl rule__SkillRealization__Group_5__5 )
            // InternalMROS.g:2763:2: rule__SkillRealization__Group_5__4__Impl rule__SkillRealization__Group_5__5
            {
            pushFollow(FOLLOW_24);
            rule__SkillRealization__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_5__5();

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
    // $ANTLR end "rule__SkillRealization__Group_5__4"


    // $ANTLR start "rule__SkillRealization__Group_5__4__Impl"
    // InternalMROS.g:2770:1: rule__SkillRealization__Group_5__4__Impl : ( ']' ) ;
    public final void rule__SkillRealization__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2774:1: ( ( ']' ) )
            // InternalMROS.g:2775:1: ( ']' )
            {
            // InternalMROS.g:2775:1: ( ']' )
            // InternalMROS.g:2776:2: ']'
            {
             before(grammarAccess.getSkillRealizationAccess().getRightSquareBracketKeyword_5_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getRightSquareBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_5__4__Impl"


    // $ANTLR start "rule__SkillRealization__Group_5__5"
    // InternalMROS.g:2785:1: rule__SkillRealization__Group_5__5 : rule__SkillRealization__Group_5__5__Impl ;
    public final void rule__SkillRealization__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2789:1: ( rule__SkillRealization__Group_5__5__Impl )
            // InternalMROS.g:2790:2: rule__SkillRealization__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_5__5__Impl();

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
    // $ANTLR end "rule__SkillRealization__Group_5__5"


    // $ANTLR start "rule__SkillRealization__Group_5__5__Impl"
    // InternalMROS.g:2796:1: rule__SkillRealization__Group_5__5__Impl : ( ';' ) ;
    public final void rule__SkillRealization__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2800:1: ( ( ';' ) )
            // InternalMROS.g:2801:1: ( ';' )
            {
            // InternalMROS.g:2801:1: ( ';' )
            // InternalMROS.g:2802:2: ';'
            {
             before(grammarAccess.getSkillRealizationAccess().getSemicolonKeyword_5_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getSemicolonKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_5__5__Impl"


    // $ANTLR start "rule__SkillRealization__Group_5_3__0"
    // InternalMROS.g:2812:1: rule__SkillRealization__Group_5_3__0 : rule__SkillRealization__Group_5_3__0__Impl rule__SkillRealization__Group_5_3__1 ;
    public final void rule__SkillRealization__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2816:1: ( rule__SkillRealization__Group_5_3__0__Impl rule__SkillRealization__Group_5_3__1 )
            // InternalMROS.g:2817:2: rule__SkillRealization__Group_5_3__0__Impl rule__SkillRealization__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
            rule__SkillRealization__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_5_3__1();

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
    // $ANTLR end "rule__SkillRealization__Group_5_3__0"


    // $ANTLR start "rule__SkillRealization__Group_5_3__0__Impl"
    // InternalMROS.g:2824:1: rule__SkillRealization__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__SkillRealization__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2828:1: ( ( ',' ) )
            // InternalMROS.g:2829:1: ( ',' )
            {
            // InternalMROS.g:2829:1: ( ',' )
            // InternalMROS.g:2830:2: ','
            {
             before(grammarAccess.getSkillRealizationAccess().getCommaKeyword_5_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_5_3__0__Impl"


    // $ANTLR start "rule__SkillRealization__Group_5_3__1"
    // InternalMROS.g:2839:1: rule__SkillRealization__Group_5_3__1 : rule__SkillRealization__Group_5_3__1__Impl ;
    public final void rule__SkillRealization__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2843:1: ( rule__SkillRealization__Group_5_3__1__Impl )
            // InternalMROS.g:2844:2: rule__SkillRealization__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__SkillRealization__Group_5_3__1"


    // $ANTLR start "rule__SkillRealization__Group_5_3__1__Impl"
    // InternalMROS.g:2850:1: rule__SkillRealization__Group_5_3__1__Impl : ( ( rule__SkillRealization__QAssignment_5_3_1 ) ) ;
    public final void rule__SkillRealization__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2854:1: ( ( ( rule__SkillRealization__QAssignment_5_3_1 ) ) )
            // InternalMROS.g:2855:1: ( ( rule__SkillRealization__QAssignment_5_3_1 ) )
            {
            // InternalMROS.g:2855:1: ( ( rule__SkillRealization__QAssignment_5_3_1 ) )
            // InternalMROS.g:2856:2: ( rule__SkillRealization__QAssignment_5_3_1 )
            {
             before(grammarAccess.getSkillRealizationAccess().getQAssignment_5_3_1()); 
            // InternalMROS.g:2857:2: ( rule__SkillRealization__QAssignment_5_3_1 )
            // InternalMROS.g:2857:3: rule__SkillRealization__QAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealization__QAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillRealizationAccess().getQAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__Group_5_3__1__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalMROS.g:2866:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2870:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalMROS.g:2871:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__1();

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
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // InternalMROS.g:2878:1: rule__Context__Group__0__Impl : ( 'context:' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2882:1: ( ( 'context:' ) )
            // InternalMROS.g:2883:1: ( 'context:' )
            {
            // InternalMROS.g:2883:1: ( 'context:' )
            // InternalMROS.g:2884:2: 'context:'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // InternalMROS.g:2893:1: rule__Context__Group__1 : rule__Context__Group__1__Impl ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2897:1: ( rule__Context__Group__1__Impl )
            // InternalMROS.g:2898:2: rule__Context__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__1__Impl();

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
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // InternalMROS.g:2904:1: rule__Context__Group__1__Impl : ( ( rule__Context__TypeAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2908:1: ( ( ( rule__Context__TypeAssignment_1 ) ) )
            // InternalMROS.g:2909:1: ( ( rule__Context__TypeAssignment_1 ) )
            {
            // InternalMROS.g:2909:1: ( ( rule__Context__TypeAssignment_1 ) )
            // InternalMROS.g:2910:2: ( rule__Context__TypeAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getTypeAssignment_1()); 
            // InternalMROS.g:2911:2: ( rule__Context__TypeAssignment_1 )
            // InternalMROS.g:2911:3: rule__Context__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Context__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__QualityModel__Group__0"
    // InternalMROS.g:2920:1: rule__QualityModel__Group__0 : rule__QualityModel__Group__0__Impl rule__QualityModel__Group__1 ;
    public final void rule__QualityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2924:1: ( rule__QualityModel__Group__0__Impl rule__QualityModel__Group__1 )
            // InternalMROS.g:2925:2: rule__QualityModel__Group__0__Impl rule__QualityModel__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__QualityModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityModel__Group__1();

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
    // $ANTLR end "rule__QualityModel__Group__0"


    // $ANTLR start "rule__QualityModel__Group__0__Impl"
    // InternalMROS.g:2932:1: rule__QualityModel__Group__0__Impl : ( ( rule__QualityModel__QaAssignment_0 ) ) ;
    public final void rule__QualityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2936:1: ( ( ( rule__QualityModel__QaAssignment_0 ) ) )
            // InternalMROS.g:2937:1: ( ( rule__QualityModel__QaAssignment_0 ) )
            {
            // InternalMROS.g:2937:1: ( ( rule__QualityModel__QaAssignment_0 ) )
            // InternalMROS.g:2938:2: ( rule__QualityModel__QaAssignment_0 )
            {
             before(grammarAccess.getQualityModelAccess().getQaAssignment_0()); 
            // InternalMROS.g:2939:2: ( rule__QualityModel__QaAssignment_0 )
            // InternalMROS.g:2939:3: rule__QualityModel__QaAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QualityModel__QaAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualityModelAccess().getQaAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__Group__0__Impl"


    // $ANTLR start "rule__QualityModel__Group__1"
    // InternalMROS.g:2947:1: rule__QualityModel__Group__1 : rule__QualityModel__Group__1__Impl rule__QualityModel__Group__2 ;
    public final void rule__QualityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2951:1: ( rule__QualityModel__Group__1__Impl rule__QualityModel__Group__2 )
            // InternalMROS.g:2952:2: rule__QualityModel__Group__1__Impl rule__QualityModel__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__QualityModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityModel__Group__2();

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
    // $ANTLR end "rule__QualityModel__Group__1"


    // $ANTLR start "rule__QualityModel__Group__1__Impl"
    // InternalMROS.g:2959:1: rule__QualityModel__Group__1__Impl : ( ':' ) ;
    public final void rule__QualityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2963:1: ( ( ':' ) )
            // InternalMROS.g:2964:1: ( ':' )
            {
            // InternalMROS.g:2964:1: ( ':' )
            // InternalMROS.g:2965:2: ':'
            {
             before(grammarAccess.getQualityModelAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQualityModelAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__Group__1__Impl"


    // $ANTLR start "rule__QualityModel__Group__2"
    // InternalMROS.g:2974:1: rule__QualityModel__Group__2 : rule__QualityModel__Group__2__Impl rule__QualityModel__Group__3 ;
    public final void rule__QualityModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2978:1: ( rule__QualityModel__Group__2__Impl rule__QualityModel__Group__3 )
            // InternalMROS.g:2979:2: rule__QualityModel__Group__2__Impl rule__QualityModel__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__QualityModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityModel__Group__3();

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
    // $ANTLR end "rule__QualityModel__Group__2"


    // $ANTLR start "rule__QualityModel__Group__2__Impl"
    // InternalMROS.g:2986:1: rule__QualityModel__Group__2__Impl : ( ( rule__QualityModel__QvalueAssignment_2 ) ) ;
    public final void rule__QualityModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:2990:1: ( ( ( rule__QualityModel__QvalueAssignment_2 ) ) )
            // InternalMROS.g:2991:1: ( ( rule__QualityModel__QvalueAssignment_2 ) )
            {
            // InternalMROS.g:2991:1: ( ( rule__QualityModel__QvalueAssignment_2 ) )
            // InternalMROS.g:2992:2: ( rule__QualityModel__QvalueAssignment_2 )
            {
             before(grammarAccess.getQualityModelAccess().getQvalueAssignment_2()); 
            // InternalMROS.g:2993:2: ( rule__QualityModel__QvalueAssignment_2 )
            // InternalMROS.g:2993:3: rule__QualityModel__QvalueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QualityModel__QvalueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQualityModelAccess().getQvalueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__Group__2__Impl"


    // $ANTLR start "rule__QualityModel__Group__3"
    // InternalMROS.g:3001:1: rule__QualityModel__Group__3 : rule__QualityModel__Group__3__Impl ;
    public final void rule__QualityModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3005:1: ( rule__QualityModel__Group__3__Impl )
            // InternalMROS.g:3006:2: rule__QualityModel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityModel__Group__3__Impl();

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
    // $ANTLR end "rule__QualityModel__Group__3"


    // $ANTLR start "rule__QualityModel__Group__3__Impl"
    // InternalMROS.g:3012:1: rule__QualityModel__Group__3__Impl : ( ( rule__QualityModel__Group_3__0 )* ) ;
    public final void rule__QualityModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3016:1: ( ( ( rule__QualityModel__Group_3__0 )* ) )
            // InternalMROS.g:3017:1: ( ( rule__QualityModel__Group_3__0 )* )
            {
            // InternalMROS.g:3017:1: ( ( rule__QualityModel__Group_3__0 )* )
            // InternalMROS.g:3018:2: ( rule__QualityModel__Group_3__0 )*
            {
             before(grammarAccess.getQualityModelAccess().getGroup_3()); 
            // InternalMROS.g:3019:2: ( rule__QualityModel__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMROS.g:3019:3: rule__QualityModel__Group_3__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__QualityModel__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getQualityModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__Group__3__Impl"


    // $ANTLR start "rule__QualityModel__Group_3__0"
    // InternalMROS.g:3028:1: rule__QualityModel__Group_3__0 : rule__QualityModel__Group_3__0__Impl rule__QualityModel__Group_3__1 ;
    public final void rule__QualityModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3032:1: ( rule__QualityModel__Group_3__0__Impl rule__QualityModel__Group_3__1 )
            // InternalMROS.g:3033:2: rule__QualityModel__Group_3__0__Impl rule__QualityModel__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__QualityModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityModel__Group_3__1();

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
    // $ANTLR end "rule__QualityModel__Group_3__0"


    // $ANTLR start "rule__QualityModel__Group_3__0__Impl"
    // InternalMROS.g:3040:1: rule__QualityModel__Group_3__0__Impl : ( '<' ) ;
    public final void rule__QualityModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3044:1: ( ( '<' ) )
            // InternalMROS.g:3045:1: ( '<' )
            {
            // InternalMROS.g:3045:1: ( '<' )
            // InternalMROS.g:3046:2: '<'
            {
             before(grammarAccess.getQualityModelAccess().getLessThanSignKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getQualityModelAccess().getLessThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__Group_3__0__Impl"


    // $ANTLR start "rule__QualityModel__Group_3__1"
    // InternalMROS.g:3055:1: rule__QualityModel__Group_3__1 : rule__QualityModel__Group_3__1__Impl rule__QualityModel__Group_3__2 ;
    public final void rule__QualityModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3059:1: ( rule__QualityModel__Group_3__1__Impl rule__QualityModel__Group_3__2 )
            // InternalMROS.g:3060:2: rule__QualityModel__Group_3__1__Impl rule__QualityModel__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__QualityModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityModel__Group_3__2();

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
    // $ANTLR end "rule__QualityModel__Group_3__1"


    // $ANTLR start "rule__QualityModel__Group_3__1__Impl"
    // InternalMROS.g:3067:1: rule__QualityModel__Group_3__1__Impl : ( ( rule__QualityModel__EAssignment_3_1 ) ) ;
    public final void rule__QualityModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3071:1: ( ( ( rule__QualityModel__EAssignment_3_1 ) ) )
            // InternalMROS.g:3072:1: ( ( rule__QualityModel__EAssignment_3_1 ) )
            {
            // InternalMROS.g:3072:1: ( ( rule__QualityModel__EAssignment_3_1 ) )
            // InternalMROS.g:3073:2: ( rule__QualityModel__EAssignment_3_1 )
            {
             before(grammarAccess.getQualityModelAccess().getEAssignment_3_1()); 
            // InternalMROS.g:3074:2: ( rule__QualityModel__EAssignment_3_1 )
            // InternalMROS.g:3074:3: rule__QualityModel__EAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityModel__EAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityModelAccess().getEAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__Group_3__1__Impl"


    // $ANTLR start "rule__QualityModel__Group_3__2"
    // InternalMROS.g:3082:1: rule__QualityModel__Group_3__2 : rule__QualityModel__Group_3__2__Impl ;
    public final void rule__QualityModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3086:1: ( rule__QualityModel__Group_3__2__Impl )
            // InternalMROS.g:3087:2: rule__QualityModel__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityModel__Group_3__2__Impl();

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
    // $ANTLR end "rule__QualityModel__Group_3__2"


    // $ANTLR start "rule__QualityModel__Group_3__2__Impl"
    // InternalMROS.g:3093:1: rule__QualityModel__Group_3__2__Impl : ( '>' ) ;
    public final void rule__QualityModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3097:1: ( ( '>' ) )
            // InternalMROS.g:3098:1: ( '>' )
            {
            // InternalMROS.g:3098:1: ( '>' )
            // InternalMROS.g:3099:2: '>'
            {
             before(grammarAccess.getQualityModelAccess().getGreaterThanSignKeyword_3_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getQualityModelAccess().getGreaterThanSignKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__Group_3__2__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalMROS.g:3109:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3113:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMROS.g:3114:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalMROS.g:3121:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3125:1: ( ( 'Component' ) )
            // InternalMROS.g:3126:1: ( 'Component' )
            {
            // InternalMROS.g:3126:1: ( 'Component' )
            // InternalMROS.g:3127:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalMROS.g:3136:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3140:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMROS.g:3141:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalMROS.g:3148:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3152:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalMROS.g:3153:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalMROS.g:3153:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalMROS.g:3154:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalMROS.g:3155:2: ( rule__Component__NameAssignment_1 )
            // InternalMROS.g:3155:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalMROS.g:3163:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3167:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMROS.g:3168:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalMROS.g:3175:1: rule__Component__Group__2__Impl : ( ( rule__Component__ObservableAssignment_2 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3179:1: ( ( ( rule__Component__ObservableAssignment_2 )? ) )
            // InternalMROS.g:3180:1: ( ( rule__Component__ObservableAssignment_2 )? )
            {
            // InternalMROS.g:3180:1: ( ( rule__Component__ObservableAssignment_2 )? )
            // InternalMROS.g:3181:2: ( rule__Component__ObservableAssignment_2 )?
            {
             before(grammarAccess.getComponentAccess().getObservableAssignment_2()); 
            // InternalMROS.g:3182:2: ( rule__Component__ObservableAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==58) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMROS.g:3182:3: rule__Component__ObservableAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__ObservableAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getObservableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalMROS.g:3190:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3194:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMROS.g:3195:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalMROS.g:3202:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3206:1: ( ( '{' ) )
            // InternalMROS.g:3207:1: ( '{' )
            {
            // InternalMROS.g:3207:1: ( '{' )
            // InternalMROS.g:3208:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalMROS.g:3217:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3221:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMROS.g:3222:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalMROS.g:3229:1: rule__Component__Group__4__Impl : ( ( rule__Component__PAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3233:1: ( ( ( rule__Component__PAssignment_4 ) ) )
            // InternalMROS.g:3234:1: ( ( rule__Component__PAssignment_4 ) )
            {
            // InternalMROS.g:3234:1: ( ( rule__Component__PAssignment_4 ) )
            // InternalMROS.g:3235:2: ( rule__Component__PAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getPAssignment_4()); 
            // InternalMROS.g:3236:2: ( rule__Component__PAssignment_4 )
            // InternalMROS.g:3236:3: rule__Component__PAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Component__PAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalMROS.g:3244:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3248:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalMROS.g:3249:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

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
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalMROS.g:3256:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3260:1: ( ( ( rule__Component__Group_5__0 )* ) )
            // InternalMROS.g:3261:1: ( ( rule__Component__Group_5__0 )* )
            {
            // InternalMROS.g:3261:1: ( ( rule__Component__Group_5__0 )* )
            // InternalMROS.g:3262:2: ( rule__Component__Group_5__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_5()); 
            // InternalMROS.g:3263:2: ( rule__Component__Group_5__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMROS.g:3263:3: rule__Component__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Component__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalMROS.g:3271:1: rule__Component__Group__6 : rule__Component__Group__6__Impl ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3275:1: ( rule__Component__Group__6__Impl )
            // InternalMROS.g:3276:2: rule__Component__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__6__Impl();

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
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalMROS.g:3282:1: rule__Component__Group__6__Impl : ( '}' ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3286:1: ( ( '}' ) )
            // InternalMROS.g:3287:1: ( '}' )
            {
            // InternalMROS.g:3287:1: ( '}' )
            // InternalMROS.g:3288:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group_5__0"
    // InternalMROS.g:3298:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3302:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // InternalMROS.g:3303:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
            {
            pushFollow(FOLLOW_32);
            rule__Component__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1();

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
    // $ANTLR end "rule__Component__Group_5__0"


    // $ANTLR start "rule__Component__Group_5__0__Impl"
    // InternalMROS.g:3310:1: rule__Component__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3314:1: ( ( ',' ) )
            // InternalMROS.g:3315:1: ( ',' )
            {
            // InternalMROS.g:3315:1: ( ',' )
            // InternalMROS.g:3316:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0__Impl"


    // $ANTLR start "rule__Component__Group_5__1"
    // InternalMROS.g:3325:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3329:1: ( rule__Component__Group_5__1__Impl )
            // InternalMROS.g:3330:2: rule__Component__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1__Impl();

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
    // $ANTLR end "rule__Component__Group_5__1"


    // $ANTLR start "rule__Component__Group_5__1__Impl"
    // InternalMROS.g:3336:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__PAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3340:1: ( ( ( rule__Component__PAssignment_5_1 ) ) )
            // InternalMROS.g:3341:1: ( ( rule__Component__PAssignment_5_1 ) )
            {
            // InternalMROS.g:3341:1: ( ( rule__Component__PAssignment_5_1 ) )
            // InternalMROS.g:3342:2: ( rule__Component__PAssignment_5_1 )
            {
             before(grammarAccess.getComponentAccess().getPAssignment_5_1()); 
            // InternalMROS.g:3343:2: ( rule__Component__PAssignment_5_1 )
            // InternalMROS.g:3343:3: rule__Component__PAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__PAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // InternalMROS.g:3352:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3356:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // InternalMROS.g:3357:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__1();

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
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // InternalMROS.g:3364:1: rule__Configuration__Group__0__Impl : ( 'Configuration' ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3368:1: ( ( 'Configuration' ) )
            // InternalMROS.g:3369:1: ( 'Configuration' )
            {
            // InternalMROS.g:3369:1: ( 'Configuration' )
            // InternalMROS.g:3370:2: 'Configuration'
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // InternalMROS.g:3379:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3383:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // InternalMROS.g:3384:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group__2();

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
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // InternalMROS.g:3391:1: rule__Configuration__Group__1__Impl : ( ( rule__Configuration__NameAssignment_1 ) ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3395:1: ( ( ( rule__Configuration__NameAssignment_1 ) ) )
            // InternalMROS.g:3396:1: ( ( rule__Configuration__NameAssignment_1 ) )
            {
            // InternalMROS.g:3396:1: ( ( rule__Configuration__NameAssignment_1 ) )
            // InternalMROS.g:3397:2: ( rule__Configuration__NameAssignment_1 )
            {
             before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 
            // InternalMROS.g:3398:2: ( rule__Configuration__NameAssignment_1 )
            // InternalMROS.g:3398:3: rule__Configuration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // InternalMROS.g:3406:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3410:1: ( rule__Configuration__Group__2__Impl )
            // InternalMROS.g:3411:2: rule__Configuration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group__2__Impl();

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
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // InternalMROS.g:3417:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__Group_2__0 )? ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3421:1: ( ( ( rule__Configuration__Group_2__0 )? ) )
            // InternalMROS.g:3422:1: ( ( rule__Configuration__Group_2__0 )? )
            {
            // InternalMROS.g:3422:1: ( ( rule__Configuration__Group_2__0 )? )
            // InternalMROS.g:3423:2: ( rule__Configuration__Group_2__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2()); 
            // InternalMROS.g:3424:2: ( rule__Configuration__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMROS.g:3424:3: rule__Configuration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configuration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group_2__0"
    // InternalMROS.g:3433:1: rule__Configuration__Group_2__0 : rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 ;
    public final void rule__Configuration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3437:1: ( rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 )
            // InternalMROS.g:3438:2: rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_2__1();

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
    // $ANTLR end "rule__Configuration__Group_2__0"


    // $ANTLR start "rule__Configuration__Group_2__0__Impl"
    // InternalMROS.g:3445:1: rule__Configuration__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Configuration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3449:1: ( ( '{' ) )
            // InternalMROS.g:3450:1: ( '{' )
            {
            // InternalMROS.g:3450:1: ( '{' )
            // InternalMROS.g:3451:2: '{'
            {
             before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2__0__Impl"


    // $ANTLR start "rule__Configuration__Group_2__1"
    // InternalMROS.g:3460:1: rule__Configuration__Group_2__1 : rule__Configuration__Group_2__1__Impl rule__Configuration__Group_2__2 ;
    public final void rule__Configuration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3464:1: ( rule__Configuration__Group_2__1__Impl rule__Configuration__Group_2__2 )
            // InternalMROS.g:3465:2: rule__Configuration__Group_2__1__Impl rule__Configuration__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Configuration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_2__2();

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
    // $ANTLR end "rule__Configuration__Group_2__1"


    // $ANTLR start "rule__Configuration__Group_2__1__Impl"
    // InternalMROS.g:3472:1: rule__Configuration__Group_2__1__Impl : ( ( rule__Configuration__PAssignment_2_1 ) ) ;
    public final void rule__Configuration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3476:1: ( ( ( rule__Configuration__PAssignment_2_1 ) ) )
            // InternalMROS.g:3477:1: ( ( rule__Configuration__PAssignment_2_1 ) )
            {
            // InternalMROS.g:3477:1: ( ( rule__Configuration__PAssignment_2_1 ) )
            // InternalMROS.g:3478:2: ( rule__Configuration__PAssignment_2_1 )
            {
             before(grammarAccess.getConfigurationAccess().getPAssignment_2_1()); 
            // InternalMROS.g:3479:2: ( rule__Configuration__PAssignment_2_1 )
            // InternalMROS.g:3479:3: rule__Configuration__PAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__PAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getPAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2__1__Impl"


    // $ANTLR start "rule__Configuration__Group_2__2"
    // InternalMROS.g:3487:1: rule__Configuration__Group_2__2 : rule__Configuration__Group_2__2__Impl rule__Configuration__Group_2__3 ;
    public final void rule__Configuration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3491:1: ( rule__Configuration__Group_2__2__Impl rule__Configuration__Group_2__3 )
            // InternalMROS.g:3492:2: rule__Configuration__Group_2__2__Impl rule__Configuration__Group_2__3
            {
            pushFollow(FOLLOW_16);
            rule__Configuration__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_2__3();

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
    // $ANTLR end "rule__Configuration__Group_2__2"


    // $ANTLR start "rule__Configuration__Group_2__2__Impl"
    // InternalMROS.g:3499:1: rule__Configuration__Group_2__2__Impl : ( ( rule__Configuration__Group_2_2__0 )* ) ;
    public final void rule__Configuration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3503:1: ( ( ( rule__Configuration__Group_2_2__0 )* ) )
            // InternalMROS.g:3504:1: ( ( rule__Configuration__Group_2_2__0 )* )
            {
            // InternalMROS.g:3504:1: ( ( rule__Configuration__Group_2_2__0 )* )
            // InternalMROS.g:3505:2: ( rule__Configuration__Group_2_2__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2_2()); 
            // InternalMROS.g:3506:2: ( rule__Configuration__Group_2_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMROS.g:3506:3: rule__Configuration__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Configuration__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2__2__Impl"


    // $ANTLR start "rule__Configuration__Group_2__3"
    // InternalMROS.g:3514:1: rule__Configuration__Group_2__3 : rule__Configuration__Group_2__3__Impl ;
    public final void rule__Configuration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3518:1: ( rule__Configuration__Group_2__3__Impl )
            // InternalMROS.g:3519:2: rule__Configuration__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_2__3__Impl();

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
    // $ANTLR end "rule__Configuration__Group_2__3"


    // $ANTLR start "rule__Configuration__Group_2__3__Impl"
    // InternalMROS.g:3525:1: rule__Configuration__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Configuration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3529:1: ( ( '}' ) )
            // InternalMROS.g:3530:1: ( '}' )
            {
            // InternalMROS.g:3530:1: ( '}' )
            // InternalMROS.g:3531:2: '}'
            {
             before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2__3__Impl"


    // $ANTLR start "rule__Configuration__Group_2_2__0"
    // InternalMROS.g:3541:1: rule__Configuration__Group_2_2__0 : rule__Configuration__Group_2_2__0__Impl rule__Configuration__Group_2_2__1 ;
    public final void rule__Configuration__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3545:1: ( rule__Configuration__Group_2_2__0__Impl rule__Configuration__Group_2_2__1 )
            // InternalMROS.g:3546:2: rule__Configuration__Group_2_2__0__Impl rule__Configuration__Group_2_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Configuration__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration__Group_2_2__1();

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
    // $ANTLR end "rule__Configuration__Group_2_2__0"


    // $ANTLR start "rule__Configuration__Group_2_2__0__Impl"
    // InternalMROS.g:3553:1: rule__Configuration__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3557:1: ( ( ',' ) )
            // InternalMROS.g:3558:1: ( ',' )
            {
            // InternalMROS.g:3558:1: ( ',' )
            // InternalMROS.g:3559:2: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_2_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConfigurationAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_2__0__Impl"


    // $ANTLR start "rule__Configuration__Group_2_2__1"
    // InternalMROS.g:3568:1: rule__Configuration__Group_2_2__1 : rule__Configuration__Group_2_2__1__Impl ;
    public final void rule__Configuration__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3572:1: ( rule__Configuration__Group_2_2__1__Impl )
            // InternalMROS.g:3573:2: rule__Configuration__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Configuration__Group_2_2__1"


    // $ANTLR start "rule__Configuration__Group_2_2__1__Impl"
    // InternalMROS.g:3579:1: rule__Configuration__Group_2_2__1__Impl : ( ( rule__Configuration__PAssignment_2_2_1 ) ) ;
    public final void rule__Configuration__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3583:1: ( ( ( rule__Configuration__PAssignment_2_2_1 ) ) )
            // InternalMROS.g:3584:1: ( ( rule__Configuration__PAssignment_2_2_1 ) )
            {
            // InternalMROS.g:3584:1: ( ( rule__Configuration__PAssignment_2_2_1 ) )
            // InternalMROS.g:3585:2: ( rule__Configuration__PAssignment_2_2_1 )
            {
             before(grammarAccess.getConfigurationAccess().getPAssignment_2_2_1()); 
            // InternalMROS.g:3586:2: ( rule__Configuration__PAssignment_2_2_1 )
            // InternalMROS.g:3586:3: rule__Configuration__PAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__PAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getPAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_2__1__Impl"


    // $ANTLR start "rule__QualifiedMode__Group__0"
    // InternalMROS.g:3595:1: rule__QualifiedMode__Group__0 : rule__QualifiedMode__Group__0__Impl rule__QualifiedMode__Group__1 ;
    public final void rule__QualifiedMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3599:1: ( rule__QualifiedMode__Group__0__Impl rule__QualifiedMode__Group__1 )
            // InternalMROS.g:3600:2: rule__QualifiedMode__Group__0__Impl rule__QualifiedMode__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__QualifiedMode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedMode__Group__1();

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
    // $ANTLR end "rule__QualifiedMode__Group__0"


    // $ANTLR start "rule__QualifiedMode__Group__0__Impl"
    // InternalMROS.g:3607:1: rule__QualifiedMode__Group__0__Impl : ( ruleMode ) ;
    public final void rule__QualifiedMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3611:1: ( ( ruleMode ) )
            // InternalMROS.g:3612:1: ( ruleMode )
            {
            // InternalMROS.g:3612:1: ( ruleMode )
            // InternalMROS.g:3613:2: ruleMode
            {
             before(grammarAccess.getQualifiedModeAccess().getModeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMode();

            state._fsp--;

             after(grammarAccess.getQualifiedModeAccess().getModeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedMode__Group__0__Impl"


    // $ANTLR start "rule__QualifiedMode__Group__1"
    // InternalMROS.g:3622:1: rule__QualifiedMode__Group__1 : rule__QualifiedMode__Group__1__Impl ;
    public final void rule__QualifiedMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3626:1: ( rule__QualifiedMode__Group__1__Impl )
            // InternalMROS.g:3627:2: rule__QualifiedMode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedMode__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedMode__Group__1"


    // $ANTLR start "rule__QualifiedMode__Group__1__Impl"
    // InternalMROS.g:3633:1: rule__QualifiedMode__Group__1__Impl : ( ( rule__QualifiedMode__Group_1__0 )* ) ;
    public final void rule__QualifiedMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3637:1: ( ( ( rule__QualifiedMode__Group_1__0 )* ) )
            // InternalMROS.g:3638:1: ( ( rule__QualifiedMode__Group_1__0 )* )
            {
            // InternalMROS.g:3638:1: ( ( rule__QualifiedMode__Group_1__0 )* )
            // InternalMROS.g:3639:2: ( rule__QualifiedMode__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedModeAccess().getGroup_1()); 
            // InternalMROS.g:3640:2: ( rule__QualifiedMode__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==50) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMROS.g:3640:3: rule__QualifiedMode__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__QualifiedMode__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getQualifiedModeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedMode__Group__1__Impl"


    // $ANTLR start "rule__QualifiedMode__Group_1__0"
    // InternalMROS.g:3649:1: rule__QualifiedMode__Group_1__0 : rule__QualifiedMode__Group_1__0__Impl rule__QualifiedMode__Group_1__1 ;
    public final void rule__QualifiedMode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3653:1: ( rule__QualifiedMode__Group_1__0__Impl rule__QualifiedMode__Group_1__1 )
            // InternalMROS.g:3654:2: rule__QualifiedMode__Group_1__0__Impl rule__QualifiedMode__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedMode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedMode__Group_1__1();

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
    // $ANTLR end "rule__QualifiedMode__Group_1__0"


    // $ANTLR start "rule__QualifiedMode__Group_1__0__Impl"
    // InternalMROS.g:3661:1: rule__QualifiedMode__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedMode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3665:1: ( ( '.' ) )
            // InternalMROS.g:3666:1: ( '.' )
            {
            // InternalMROS.g:3666:1: ( '.' )
            // InternalMROS.g:3667:2: '.'
            {
             before(grammarAccess.getQualifiedModeAccess().getFullStopKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getQualifiedModeAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedMode__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedMode__Group_1__1"
    // InternalMROS.g:3676:1: rule__QualifiedMode__Group_1__1 : rule__QualifiedMode__Group_1__1__Impl ;
    public final void rule__QualifiedMode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3680:1: ( rule__QualifiedMode__Group_1__1__Impl )
            // InternalMROS.g:3681:2: rule__QualifiedMode__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedMode__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedMode__Group_1__1"


    // $ANTLR start "rule__QualifiedMode__Group_1__1__Impl"
    // InternalMROS.g:3687:1: rule__QualifiedMode__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedMode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3691:1: ( ( RULE_ID ) )
            // InternalMROS.g:3692:1: ( RULE_ID )
            {
            // InternalMROS.g:3692:1: ( RULE_ID )
            // InternalMROS.g:3693:2: RULE_ID
            {
             before(grammarAccess.getQualifiedModeAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedModeAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedMode__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMROS.g:3703:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3707:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMROS.g:3708:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMROS.g:3715:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3719:1: ( ( RULE_ID ) )
            // InternalMROS.g:3720:1: ( RULE_ID )
            {
            // InternalMROS.g:3720:1: ( RULE_ID )
            // InternalMROS.g:3721:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalMROS.g:3730:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3734:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMROS.g:3735:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalMROS.g:3741:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3745:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMROS.g:3746:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMROS.g:3746:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMROS.g:3747:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMROS.g:3748:2: ( rule__QualifiedName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==50) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMROS.g:3748:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMROS.g:3757:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3761:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMROS.g:3762:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMROS.g:3769:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3773:1: ( ( '.' ) )
            // InternalMROS.g:3774:1: ( '.' )
            {
            // InternalMROS.g:3774:1: ( '.' )
            // InternalMROS.g:3775:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMROS.g:3784:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3788:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMROS.g:3789:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalMROS.g:3795:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3799:1: ( ( RULE_ID ) )
            // InternalMROS.g:3800:1: ( RULE_ID )
            {
            // InternalMROS.g:3800:1: ( RULE_ID )
            // InternalMROS.g:3801:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__Environment__Group__0"
    // InternalMROS.g:3811:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3815:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalMROS.g:3816:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__1();

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
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalMROS.g:3823:1: rule__Environment__Group__0__Impl : ( 'environment' ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3827:1: ( ( 'environment' ) )
            // InternalMROS.g:3828:1: ( 'environment' )
            {
            // InternalMROS.g:3828:1: ( 'environment' )
            // InternalMROS.g:3829:2: 'environment'
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalMROS.g:3838:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3842:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalMROS.g:3843:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__2();

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
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalMROS.g:3850:1: rule__Environment__Group__1__Impl : ( ( rule__Environment__NameAssignment_1 ) ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3854:1: ( ( ( rule__Environment__NameAssignment_1 ) ) )
            // InternalMROS.g:3855:1: ( ( rule__Environment__NameAssignment_1 ) )
            {
            // InternalMROS.g:3855:1: ( ( rule__Environment__NameAssignment_1 ) )
            // InternalMROS.g:3856:2: ( rule__Environment__NameAssignment_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getNameAssignment_1()); 
            // InternalMROS.g:3857:2: ( rule__Environment__NameAssignment_1 )
            // InternalMROS.g:3857:3: rule__Environment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Environment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // InternalMROS.g:3865:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3869:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalMROS.g:3870:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__3();

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
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // InternalMROS.g:3877:1: rule__Environment__Group__2__Impl : ( '{' ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3881:1: ( ( '{' ) )
            // InternalMROS.g:3882:1: ( '{' )
            {
            // InternalMROS.g:3882:1: ( '{' )
            // InternalMROS.g:3883:2: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // InternalMROS.g:3892:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3896:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // InternalMROS.g:3897:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__4();

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
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // InternalMROS.g:3904:1: rule__Environment__Group__3__Impl : ( ( rule__Environment__ParameterlistAssignment_3 ) ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3908:1: ( ( ( rule__Environment__ParameterlistAssignment_3 ) ) )
            // InternalMROS.g:3909:1: ( ( rule__Environment__ParameterlistAssignment_3 ) )
            {
            // InternalMROS.g:3909:1: ( ( rule__Environment__ParameterlistAssignment_3 ) )
            // InternalMROS.g:3910:2: ( rule__Environment__ParameterlistAssignment_3 )
            {
             before(grammarAccess.getEnvironmentAccess().getParameterlistAssignment_3()); 
            // InternalMROS.g:3911:2: ( rule__Environment__ParameterlistAssignment_3 )
            // InternalMROS.g:3911:3: rule__Environment__ParameterlistAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Environment__ParameterlistAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getParameterlistAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group__4"
    // InternalMROS.g:3919:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl rule__Environment__Group__5 ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3923:1: ( rule__Environment__Group__4__Impl rule__Environment__Group__5 )
            // InternalMROS.g:3924:2: rule__Environment__Group__4__Impl rule__Environment__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Environment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__5();

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
    // $ANTLR end "rule__Environment__Group__4"


    // $ANTLR start "rule__Environment__Group__4__Impl"
    // InternalMROS.g:3931:1: rule__Environment__Group__4__Impl : ( ( rule__Environment__Group_4__0 )* ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3935:1: ( ( ( rule__Environment__Group_4__0 )* ) )
            // InternalMROS.g:3936:1: ( ( rule__Environment__Group_4__0 )* )
            {
            // InternalMROS.g:3936:1: ( ( rule__Environment__Group_4__0 )* )
            // InternalMROS.g:3937:2: ( rule__Environment__Group_4__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_4()); 
            // InternalMROS.g:3938:2: ( rule__Environment__Group_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMROS.g:3938:3: rule__Environment__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Environment__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__4__Impl"


    // $ANTLR start "rule__Environment__Group__5"
    // InternalMROS.g:3946:1: rule__Environment__Group__5 : rule__Environment__Group__5__Impl ;
    public final void rule__Environment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3950:1: ( rule__Environment__Group__5__Impl )
            // InternalMROS.g:3951:2: rule__Environment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__5__Impl();

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
    // $ANTLR end "rule__Environment__Group__5"


    // $ANTLR start "rule__Environment__Group__5__Impl"
    // InternalMROS.g:3957:1: rule__Environment__Group__5__Impl : ( '}' ) ;
    public final void rule__Environment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3961:1: ( ( '}' ) )
            // InternalMROS.g:3962:1: ( '}' )
            {
            // InternalMROS.g:3962:1: ( '}' )
            // InternalMROS.g:3963:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__5__Impl"


    // $ANTLR start "rule__Environment__Group_4__0"
    // InternalMROS.g:3973:1: rule__Environment__Group_4__0 : rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1 ;
    public final void rule__Environment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3977:1: ( rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1 )
            // InternalMROS.g:3978:2: rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__Environment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__1();

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
    // $ANTLR end "rule__Environment__Group_4__0"


    // $ANTLR start "rule__Environment__Group_4__0__Impl"
    // InternalMROS.g:3985:1: rule__Environment__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Environment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:3989:1: ( ( ',' ) )
            // InternalMROS.g:3990:1: ( ',' )
            {
            // InternalMROS.g:3990:1: ( ',' )
            // InternalMROS.g:3991:2: ','
            {
             before(grammarAccess.getEnvironmentAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__0__Impl"


    // $ANTLR start "rule__Environment__Group_4__1"
    // InternalMROS.g:4000:1: rule__Environment__Group_4__1 : rule__Environment__Group_4__1__Impl ;
    public final void rule__Environment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4004:1: ( rule__Environment__Group_4__1__Impl )
            // InternalMROS.g:4005:2: rule__Environment__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__1__Impl();

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
    // $ANTLR end "rule__Environment__Group_4__1"


    // $ANTLR start "rule__Environment__Group_4__1__Impl"
    // InternalMROS.g:4011:1: rule__Environment__Group_4__1__Impl : ( ( rule__Environment__ParameterlistAssignment_4_1 ) ) ;
    public final void rule__Environment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4015:1: ( ( ( rule__Environment__ParameterlistAssignment_4_1 ) ) )
            // InternalMROS.g:4016:1: ( ( rule__Environment__ParameterlistAssignment_4_1 ) )
            {
            // InternalMROS.g:4016:1: ( ( rule__Environment__ParameterlistAssignment_4_1 ) )
            // InternalMROS.g:4017:2: ( rule__Environment__ParameterlistAssignment_4_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getParameterlistAssignment_4_1()); 
            // InternalMROS.g:4018:2: ( rule__Environment__ParameterlistAssignment_4_1 )
            // InternalMROS.g:4018:3: rule__Environment__ParameterlistAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Environment__ParameterlistAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getParameterlistAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group_4__1__Impl"


    // $ANTLR start "rule__Narowness__Group__0"
    // InternalMROS.g:4027:1: rule__Narowness__Group__0 : rule__Narowness__Group__0__Impl rule__Narowness__Group__1 ;
    public final void rule__Narowness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4031:1: ( rule__Narowness__Group__0__Impl rule__Narowness__Group__1 )
            // InternalMROS.g:4032:2: rule__Narowness__Group__0__Impl rule__Narowness__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Narowness__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Narowness__Group__1();

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
    // $ANTLR end "rule__Narowness__Group__0"


    // $ANTLR start "rule__Narowness__Group__0__Impl"
    // InternalMROS.g:4039:1: rule__Narowness__Group__0__Impl : ( 'narowness:' ) ;
    public final void rule__Narowness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4043:1: ( ( 'narowness:' ) )
            // InternalMROS.g:4044:1: ( 'narowness:' )
            {
            // InternalMROS.g:4044:1: ( 'narowness:' )
            // InternalMROS.g:4045:2: 'narowness:'
            {
             before(grammarAccess.getNarownessAccess().getNarownessKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getNarownessAccess().getNarownessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narowness__Group__0__Impl"


    // $ANTLR start "rule__Narowness__Group__1"
    // InternalMROS.g:4054:1: rule__Narowness__Group__1 : rule__Narowness__Group__1__Impl ;
    public final void rule__Narowness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4058:1: ( rule__Narowness__Group__1__Impl )
            // InternalMROS.g:4059:2: rule__Narowness__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Narowness__Group__1__Impl();

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
    // $ANTLR end "rule__Narowness__Group__1"


    // $ANTLR start "rule__Narowness__Group__1__Impl"
    // InternalMROS.g:4065:1: rule__Narowness__Group__1__Impl : ( ( rule__Narowness__ValueAssignment_1 ) ) ;
    public final void rule__Narowness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4069:1: ( ( ( rule__Narowness__ValueAssignment_1 ) ) )
            // InternalMROS.g:4070:1: ( ( rule__Narowness__ValueAssignment_1 ) )
            {
            // InternalMROS.g:4070:1: ( ( rule__Narowness__ValueAssignment_1 ) )
            // InternalMROS.g:4071:2: ( rule__Narowness__ValueAssignment_1 )
            {
             before(grammarAccess.getNarownessAccess().getValueAssignment_1()); 
            // InternalMROS.g:4072:2: ( rule__Narowness__ValueAssignment_1 )
            // InternalMROS.g:4072:3: rule__Narowness__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Narowness__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNarownessAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narowness__Group__1__Impl"


    // $ANTLR start "rule__Clutterness__Group__0"
    // InternalMROS.g:4081:1: rule__Clutterness__Group__0 : rule__Clutterness__Group__0__Impl rule__Clutterness__Group__1 ;
    public final void rule__Clutterness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4085:1: ( rule__Clutterness__Group__0__Impl rule__Clutterness__Group__1 )
            // InternalMROS.g:4086:2: rule__Clutterness__Group__0__Impl rule__Clutterness__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Clutterness__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clutterness__Group__1();

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
    // $ANTLR end "rule__Clutterness__Group__0"


    // $ANTLR start "rule__Clutterness__Group__0__Impl"
    // InternalMROS.g:4093:1: rule__Clutterness__Group__0__Impl : ( 'clutterness:' ) ;
    public final void rule__Clutterness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4097:1: ( ( 'clutterness:' ) )
            // InternalMROS.g:4098:1: ( 'clutterness:' )
            {
            // InternalMROS.g:4098:1: ( 'clutterness:' )
            // InternalMROS.g:4099:2: 'clutterness:'
            {
             before(grammarAccess.getClutternessAccess().getClutternessKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getClutternessAccess().getClutternessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clutterness__Group__0__Impl"


    // $ANTLR start "rule__Clutterness__Group__1"
    // InternalMROS.g:4108:1: rule__Clutterness__Group__1 : rule__Clutterness__Group__1__Impl ;
    public final void rule__Clutterness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4112:1: ( rule__Clutterness__Group__1__Impl )
            // InternalMROS.g:4113:2: rule__Clutterness__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clutterness__Group__1__Impl();

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
    // $ANTLR end "rule__Clutterness__Group__1"


    // $ANTLR start "rule__Clutterness__Group__1__Impl"
    // InternalMROS.g:4119:1: rule__Clutterness__Group__1__Impl : ( ( rule__Clutterness__ValueAssignment_1 ) ) ;
    public final void rule__Clutterness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4123:1: ( ( ( rule__Clutterness__ValueAssignment_1 ) ) )
            // InternalMROS.g:4124:1: ( ( rule__Clutterness__ValueAssignment_1 ) )
            {
            // InternalMROS.g:4124:1: ( ( rule__Clutterness__ValueAssignment_1 ) )
            // InternalMROS.g:4125:2: ( rule__Clutterness__ValueAssignment_1 )
            {
             before(grammarAccess.getClutternessAccess().getValueAssignment_1()); 
            // InternalMROS.g:4126:2: ( rule__Clutterness__ValueAssignment_1 )
            // InternalMROS.g:4126:3: rule__Clutterness__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Clutterness__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClutternessAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clutterness__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMROS.g:4135:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4139:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMROS.g:4140:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMROS.g:4147:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4151:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalMROS.g:4152:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalMROS.g:4152:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalMROS.g:4153:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalMROS.g:4154:2: ( rule__Parameter__NameAssignment_0 )
            // InternalMROS.g:4154:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMROS.g:4162:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4166:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMROS.g:4167:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMROS.g:4174:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4178:1: ( ( ':' ) )
            // InternalMROS.g:4179:1: ( ':' )
            {
            // InternalMROS.g:4179:1: ( ':' )
            // InternalMROS.g:4180:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalMROS.g:4189:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4193:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalMROS.g:4194:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalMROS.g:4201:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ValueAssignment_2 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4205:1: ( ( ( rule__Parameter__ValueAssignment_2 )? ) )
            // InternalMROS.g:4206:1: ( ( rule__Parameter__ValueAssignment_2 )? )
            {
            // InternalMROS.g:4206:1: ( ( rule__Parameter__ValueAssignment_2 )? )
            // InternalMROS.g:4207:2: ( rule__Parameter__ValueAssignment_2 )?
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_2()); 
            // InternalMROS.g:4208:2: ( rule__Parameter__ValueAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMROS.g:4208:3: rule__Parameter__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalMROS.g:4216:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4220:1: ( rule__Parameter__Group__3__Impl )
            // InternalMROS.g:4221:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalMROS.g:4227:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ValueAssignment_3 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4231:1: ( ( ( rule__Parameter__ValueAssignment_3 )? ) )
            // InternalMROS.g:4232:1: ( ( rule__Parameter__ValueAssignment_3 )? )
            {
            // InternalMROS.g:4232:1: ( ( rule__Parameter__ValueAssignment_3 )? )
            // InternalMROS.g:4233:2: ( rule__Parameter__ValueAssignment_3 )?
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_3()); 
            // InternalMROS.g:4234:2: ( rule__Parameter__ValueAssignment_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT||LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMROS.g:4234:3: rule__Parameter__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalMROS.g:4243:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4247:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalMROS.g:4248:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

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
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalMROS.g:4255:1: rule__Double__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4259:1: ( ( ( '-' )? ) )
            // InternalMROS.g:4260:1: ( ( '-' )? )
            {
            // InternalMROS.g:4260:1: ( ( '-' )? )
            // InternalMROS.g:4261:2: ( '-' )?
            {
             before(grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalMROS.g:4262:2: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMROS.g:4262:3: '-'
                    {
                    match(input,54,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalMROS.g:4270:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4274:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalMROS.g:4275:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Double__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

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
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalMROS.g:4282:1: rule__Double__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4286:1: ( ( RULE_INT ) )
            // InternalMROS.g:4287:1: ( RULE_INT )
            {
            // InternalMROS.g:4287:1: ( RULE_INT )
            // InternalMROS.g:4288:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // InternalMROS.g:4297:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4301:1: ( rule__Double__Group__2__Impl )
            // InternalMROS.g:4302:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__2__Impl();

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
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // InternalMROS.g:4308:1: rule__Double__Group__2__Impl : ( ( rule__Double__Group_2__0 )? ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4312:1: ( ( ( rule__Double__Group_2__0 )? ) )
            // InternalMROS.g:4313:1: ( ( rule__Double__Group_2__0 )? )
            {
            // InternalMROS.g:4313:1: ( ( rule__Double__Group_2__0 )? )
            // InternalMROS.g:4314:2: ( rule__Double__Group_2__0 )?
            {
             before(grammarAccess.getDoubleAccess().getGroup_2()); 
            // InternalMROS.g:4315:2: ( rule__Double__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMROS.g:4315:3: rule__Double__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Double__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__Double__Group_2__0"
    // InternalMROS.g:4324:1: rule__Double__Group_2__0 : rule__Double__Group_2__0__Impl rule__Double__Group_2__1 ;
    public final void rule__Double__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4328:1: ( rule__Double__Group_2__0__Impl rule__Double__Group_2__1 )
            // InternalMROS.g:4329:2: rule__Double__Group_2__0__Impl rule__Double__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Double__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group_2__1();

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
    // $ANTLR end "rule__Double__Group_2__0"


    // $ANTLR start "rule__Double__Group_2__0__Impl"
    // InternalMROS.g:4336:1: rule__Double__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Double__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4340:1: ( ( '.' ) )
            // InternalMROS.g:4341:1: ( '.' )
            {
            // InternalMROS.g:4341:1: ( '.' )
            // InternalMROS.g:4342:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group_2__0__Impl"


    // $ANTLR start "rule__Double__Group_2__1"
    // InternalMROS.g:4351:1: rule__Double__Group_2__1 : rule__Double__Group_2__1__Impl ;
    public final void rule__Double__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4355:1: ( rule__Double__Group_2__1__Impl )
            // InternalMROS.g:4356:2: rule__Double__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group_2__1__Impl();

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
    // $ANTLR end "rule__Double__Group_2__1"


    // $ANTLR start "rule__Double__Group_2__1__Impl"
    // InternalMROS.g:4362:1: rule__Double__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4366:1: ( ( RULE_INT ) )
            // InternalMROS.g:4367:1: ( RULE_INT )
            {
            // InternalMROS.g:4367:1: ( RULE_INT )
            // InternalMROS.g:4368:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group_2__1__Impl"


    // $ANTLR start "rule__ActionType__Group__0"
    // InternalMROS.g:4378:1: rule__ActionType__Group__0 : rule__ActionType__Group__0__Impl rule__ActionType__Group__1 ;
    public final void rule__ActionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4382:1: ( rule__ActionType__Group__0__Impl rule__ActionType__Group__1 )
            // InternalMROS.g:4383:2: rule__ActionType__Group__0__Impl rule__ActionType__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ActionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group__1();

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
    // $ANTLR end "rule__ActionType__Group__0"


    // $ANTLR start "rule__ActionType__Group__0__Impl"
    // InternalMROS.g:4390:1: rule__ActionType__Group__0__Impl : ( 'ActionType' ) ;
    public final void rule__ActionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4394:1: ( ( 'ActionType' ) )
            // InternalMROS.g:4395:1: ( 'ActionType' )
            {
            // InternalMROS.g:4395:1: ( 'ActionType' )
            // InternalMROS.g:4396:2: 'ActionType'
            {
             before(grammarAccess.getActionTypeAccess().getActionTypeKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getActionTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group__0__Impl"


    // $ANTLR start "rule__ActionType__Group__1"
    // InternalMROS.g:4405:1: rule__ActionType__Group__1 : rule__ActionType__Group__1__Impl rule__ActionType__Group__2 ;
    public final void rule__ActionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4409:1: ( rule__ActionType__Group__1__Impl rule__ActionType__Group__2 )
            // InternalMROS.g:4410:2: rule__ActionType__Group__1__Impl rule__ActionType__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ActionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group__2();

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
    // $ANTLR end "rule__ActionType__Group__1"


    // $ANTLR start "rule__ActionType__Group__1__Impl"
    // InternalMROS.g:4417:1: rule__ActionType__Group__1__Impl : ( ( rule__ActionType__NameAssignment_1 ) ) ;
    public final void rule__ActionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4421:1: ( ( ( rule__ActionType__NameAssignment_1 ) ) )
            // InternalMROS.g:4422:1: ( ( rule__ActionType__NameAssignment_1 ) )
            {
            // InternalMROS.g:4422:1: ( ( rule__ActionType__NameAssignment_1 ) )
            // InternalMROS.g:4423:2: ( rule__ActionType__NameAssignment_1 )
            {
             before(grammarAccess.getActionTypeAccess().getNameAssignment_1()); 
            // InternalMROS.g:4424:2: ( rule__ActionType__NameAssignment_1 )
            // InternalMROS.g:4424:3: rule__ActionType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group__1__Impl"


    // $ANTLR start "rule__ActionType__Group__2"
    // InternalMROS.g:4432:1: rule__ActionType__Group__2 : rule__ActionType__Group__2__Impl rule__ActionType__Group__3 ;
    public final void rule__ActionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4436:1: ( rule__ActionType__Group__2__Impl rule__ActionType__Group__3 )
            // InternalMROS.g:4437:2: rule__ActionType__Group__2__Impl rule__ActionType__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__ActionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group__3();

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
    // $ANTLR end "rule__ActionType__Group__2"


    // $ANTLR start "rule__ActionType__Group__2__Impl"
    // InternalMROS.g:4444:1: rule__ActionType__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4448:1: ( ( '{' ) )
            // InternalMROS.g:4449:1: ( '{' )
            {
            // InternalMROS.g:4449:1: ( '{' )
            // InternalMROS.g:4450:2: '{'
            {
             before(grammarAccess.getActionTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group__2__Impl"


    // $ANTLR start "rule__ActionType__Group__3"
    // InternalMROS.g:4459:1: rule__ActionType__Group__3 : rule__ActionType__Group__3__Impl rule__ActionType__Group__4 ;
    public final void rule__ActionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4463:1: ( rule__ActionType__Group__3__Impl rule__ActionType__Group__4 )
            // InternalMROS.g:4464:2: rule__ActionType__Group__3__Impl rule__ActionType__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__ActionType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group__4();

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
    // $ANTLR end "rule__ActionType__Group__3"


    // $ANTLR start "rule__ActionType__Group__3__Impl"
    // InternalMROS.g:4471:1: rule__ActionType__Group__3__Impl : ( ( rule__ActionType__Group_3__0 )? ) ;
    public final void rule__ActionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4475:1: ( ( ( rule__ActionType__Group_3__0 )? ) )
            // InternalMROS.g:4476:1: ( ( rule__ActionType__Group_3__0 )? )
            {
            // InternalMROS.g:4476:1: ( ( rule__ActionType__Group_3__0 )? )
            // InternalMROS.g:4477:2: ( rule__ActionType__Group_3__0 )?
            {
             before(grammarAccess.getActionTypeAccess().getGroup_3()); 
            // InternalMROS.g:4478:2: ( rule__ActionType__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMROS.g:4478:3: rule__ActionType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group__3__Impl"


    // $ANTLR start "rule__ActionType__Group__4"
    // InternalMROS.g:4486:1: rule__ActionType__Group__4 : rule__ActionType__Group__4__Impl rule__ActionType__Group__5 ;
    public final void rule__ActionType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4490:1: ( rule__ActionType__Group__4__Impl rule__ActionType__Group__5 )
            // InternalMROS.g:4491:2: rule__ActionType__Group__4__Impl rule__ActionType__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__ActionType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group__5();

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
    // $ANTLR end "rule__ActionType__Group__4"


    // $ANTLR start "rule__ActionType__Group__4__Impl"
    // InternalMROS.g:4498:1: rule__ActionType__Group__4__Impl : ( ( rule__ActionType__Group_4__0 )? ) ;
    public final void rule__ActionType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4502:1: ( ( ( rule__ActionType__Group_4__0 )? ) )
            // InternalMROS.g:4503:1: ( ( rule__ActionType__Group_4__0 )? )
            {
            // InternalMROS.g:4503:1: ( ( rule__ActionType__Group_4__0 )? )
            // InternalMROS.g:4504:2: ( rule__ActionType__Group_4__0 )?
            {
             before(grammarAccess.getActionTypeAccess().getGroup_4()); 
            // InternalMROS.g:4505:2: ( rule__ActionType__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMROS.g:4505:3: rule__ActionType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group__4__Impl"


    // $ANTLR start "rule__ActionType__Group__5"
    // InternalMROS.g:4513:1: rule__ActionType__Group__5 : rule__ActionType__Group__5__Impl rule__ActionType__Group__6 ;
    public final void rule__ActionType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4517:1: ( rule__ActionType__Group__5__Impl rule__ActionType__Group__6 )
            // InternalMROS.g:4518:2: rule__ActionType__Group__5__Impl rule__ActionType__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__ActionType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group__6();

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
    // $ANTLR end "rule__ActionType__Group__5"


    // $ANTLR start "rule__ActionType__Group__5__Impl"
    // InternalMROS.g:4525:1: rule__ActionType__Group__5__Impl : ( ( rule__ActionType__Group_5__0 )? ) ;
    public final void rule__ActionType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4529:1: ( ( ( rule__ActionType__Group_5__0 )? ) )
            // InternalMROS.g:4530:1: ( ( rule__ActionType__Group_5__0 )? )
            {
            // InternalMROS.g:4530:1: ( ( rule__ActionType__Group_5__0 )? )
            // InternalMROS.g:4531:2: ( rule__ActionType__Group_5__0 )?
            {
             before(grammarAccess.getActionTypeAccess().getGroup_5()); 
            // InternalMROS.g:4532:2: ( rule__ActionType__Group_5__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMROS.g:4532:3: rule__ActionType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group__5__Impl"


    // $ANTLR start "rule__ActionType__Group__6"
    // InternalMROS.g:4540:1: rule__ActionType__Group__6 : rule__ActionType__Group__6__Impl ;
    public final void rule__ActionType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4544:1: ( rule__ActionType__Group__6__Impl )
            // InternalMROS.g:4545:2: rule__ActionType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Group__6__Impl();

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
    // $ANTLR end "rule__ActionType__Group__6"


    // $ANTLR start "rule__ActionType__Group__6__Impl"
    // InternalMROS.g:4551:1: rule__ActionType__Group__6__Impl : ( '}' ) ;
    public final void rule__ActionType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4555:1: ( ( '}' ) )
            // InternalMROS.g:4556:1: ( '}' )
            {
            // InternalMROS.g:4556:1: ( '}' )
            // InternalMROS.g:4557:2: '}'
            {
             before(grammarAccess.getActionTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group__6__Impl"


    // $ANTLR start "rule__ActionType__Group_3__0"
    // InternalMROS.g:4567:1: rule__ActionType__Group_3__0 : rule__ActionType__Group_3__0__Impl rule__ActionType__Group_3__1 ;
    public final void rule__ActionType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4571:1: ( rule__ActionType__Group_3__0__Impl rule__ActionType__Group_3__1 )
            // InternalMROS.g:4572:2: rule__ActionType__Group_3__0__Impl rule__ActionType__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ActionType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group_3__1();

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
    // $ANTLR end "rule__ActionType__Group_3__0"


    // $ANTLR start "rule__ActionType__Group_3__0__Impl"
    // InternalMROS.g:4579:1: rule__ActionType__Group_3__0__Impl : ( 'goal' ) ;
    public final void rule__ActionType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4583:1: ( ( 'goal' ) )
            // InternalMROS.g:4584:1: ( 'goal' )
            {
            // InternalMROS.g:4584:1: ( 'goal' )
            // InternalMROS.g:4585:2: 'goal'
            {
             before(grammarAccess.getActionTypeAccess().getGoalKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getGoalKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group_3__0__Impl"


    // $ANTLR start "rule__ActionType__Group_3__1"
    // InternalMROS.g:4594:1: rule__ActionType__Group_3__1 : rule__ActionType__Group_3__1__Impl ;
    public final void rule__ActionType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4598:1: ( rule__ActionType__Group_3__1__Impl )
            // InternalMROS.g:4599:2: rule__ActionType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Group_3__1__Impl();

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
    // $ANTLR end "rule__ActionType__Group_3__1"


    // $ANTLR start "rule__ActionType__Group_3__1__Impl"
    // InternalMROS.g:4605:1: rule__ActionType__Group_3__1__Impl : ( ( rule__ActionType__GoalAssignment_3_1 ) ) ;
    public final void rule__ActionType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4609:1: ( ( ( rule__ActionType__GoalAssignment_3_1 ) ) )
            // InternalMROS.g:4610:1: ( ( rule__ActionType__GoalAssignment_3_1 ) )
            {
            // InternalMROS.g:4610:1: ( ( rule__ActionType__GoalAssignment_3_1 ) )
            // InternalMROS.g:4611:2: ( rule__ActionType__GoalAssignment_3_1 )
            {
             before(grammarAccess.getActionTypeAccess().getGoalAssignment_3_1()); 
            // InternalMROS.g:4612:2: ( rule__ActionType__GoalAssignment_3_1 )
            // InternalMROS.g:4612:3: rule__ActionType__GoalAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__GoalAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getGoalAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group_3__1__Impl"


    // $ANTLR start "rule__ActionType__Group_4__0"
    // InternalMROS.g:4621:1: rule__ActionType__Group_4__0 : rule__ActionType__Group_4__0__Impl rule__ActionType__Group_4__1 ;
    public final void rule__ActionType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4625:1: ( rule__ActionType__Group_4__0__Impl rule__ActionType__Group_4__1 )
            // InternalMROS.g:4626:2: rule__ActionType__Group_4__0__Impl rule__ActionType__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ActionType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group_4__1();

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
    // $ANTLR end "rule__ActionType__Group_4__0"


    // $ANTLR start "rule__ActionType__Group_4__0__Impl"
    // InternalMROS.g:4633:1: rule__ActionType__Group_4__0__Impl : ( 'result' ) ;
    public final void rule__ActionType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4637:1: ( ( 'result' ) )
            // InternalMROS.g:4638:1: ( 'result' )
            {
            // InternalMROS.g:4638:1: ( 'result' )
            // InternalMROS.g:4639:2: 'result'
            {
             before(grammarAccess.getActionTypeAccess().getResultKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getResultKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group_4__0__Impl"


    // $ANTLR start "rule__ActionType__Group_4__1"
    // InternalMROS.g:4648:1: rule__ActionType__Group_4__1 : rule__ActionType__Group_4__1__Impl ;
    public final void rule__ActionType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4652:1: ( rule__ActionType__Group_4__1__Impl )
            // InternalMROS.g:4653:2: rule__ActionType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Group_4__1__Impl();

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
    // $ANTLR end "rule__ActionType__Group_4__1"


    // $ANTLR start "rule__ActionType__Group_4__1__Impl"
    // InternalMROS.g:4659:1: rule__ActionType__Group_4__1__Impl : ( ( rule__ActionType__ResultAssignment_4_1 ) ) ;
    public final void rule__ActionType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4663:1: ( ( ( rule__ActionType__ResultAssignment_4_1 ) ) )
            // InternalMROS.g:4664:1: ( ( rule__ActionType__ResultAssignment_4_1 ) )
            {
            // InternalMROS.g:4664:1: ( ( rule__ActionType__ResultAssignment_4_1 ) )
            // InternalMROS.g:4665:2: ( rule__ActionType__ResultAssignment_4_1 )
            {
             before(grammarAccess.getActionTypeAccess().getResultAssignment_4_1()); 
            // InternalMROS.g:4666:2: ( rule__ActionType__ResultAssignment_4_1 )
            // InternalMROS.g:4666:3: rule__ActionType__ResultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__ResultAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getResultAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group_4__1__Impl"


    // $ANTLR start "rule__ActionType__Group_5__0"
    // InternalMROS.g:4675:1: rule__ActionType__Group_5__0 : rule__ActionType__Group_5__0__Impl rule__ActionType__Group_5__1 ;
    public final void rule__ActionType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4679:1: ( rule__ActionType__Group_5__0__Impl rule__ActionType__Group_5__1 )
            // InternalMROS.g:4680:2: rule__ActionType__Group_5__0__Impl rule__ActionType__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ActionType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionType__Group_5__1();

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
    // $ANTLR end "rule__ActionType__Group_5__0"


    // $ANTLR start "rule__ActionType__Group_5__0__Impl"
    // InternalMROS.g:4687:1: rule__ActionType__Group_5__0__Impl : ( 'feedback' ) ;
    public final void rule__ActionType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4691:1: ( ( 'feedback' ) )
            // InternalMROS.g:4692:1: ( 'feedback' )
            {
            // InternalMROS.g:4692:1: ( 'feedback' )
            // InternalMROS.g:4693:2: 'feedback'
            {
             before(grammarAccess.getActionTypeAccess().getFeedbackKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getFeedbackKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group_5__0__Impl"


    // $ANTLR start "rule__ActionType__Group_5__1"
    // InternalMROS.g:4702:1: rule__ActionType__Group_5__1 : rule__ActionType__Group_5__1__Impl ;
    public final void rule__ActionType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4706:1: ( rule__ActionType__Group_5__1__Impl )
            // InternalMROS.g:4707:2: rule__ActionType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Group_5__1__Impl();

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
    // $ANTLR end "rule__ActionType__Group_5__1"


    // $ANTLR start "rule__ActionType__Group_5__1__Impl"
    // InternalMROS.g:4713:1: rule__ActionType__Group_5__1__Impl : ( ( rule__ActionType__FeedbackAssignment_5_1 ) ) ;
    public final void rule__ActionType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4717:1: ( ( ( rule__ActionType__FeedbackAssignment_5_1 ) ) )
            // InternalMROS.g:4718:1: ( ( rule__ActionType__FeedbackAssignment_5_1 ) )
            {
            // InternalMROS.g:4718:1: ( ( rule__ActionType__FeedbackAssignment_5_1 ) )
            // InternalMROS.g:4719:2: ( rule__ActionType__FeedbackAssignment_5_1 )
            {
             before(grammarAccess.getActionTypeAccess().getFeedbackAssignment_5_1()); 
            // InternalMROS.g:4720:2: ( rule__ActionType__FeedbackAssignment_5_1 )
            // InternalMROS.g:4720:3: rule__ActionType__FeedbackAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__FeedbackAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getFeedbackAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Group_5__1__Impl"


    // $ANTLR start "rule__MessageDefinition__Group__0"
    // InternalMROS.g:4729:1: rule__MessageDefinition__Group__0 : rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1 ;
    public final void rule__MessageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4733:1: ( rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1 )
            // InternalMROS.g:4734:2: rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__MessageDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__1();

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
    // $ANTLR end "rule__MessageDefinition__Group__0"


    // $ANTLR start "rule__MessageDefinition__Group__0__Impl"
    // InternalMROS.g:4741:1: rule__MessageDefinition__Group__0__Impl : ( '{' ) ;
    public final void rule__MessageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4745:1: ( ( '{' ) )
            // InternalMROS.g:4746:1: ( '{' )
            {
            // InternalMROS.g:4746:1: ( '{' )
            // InternalMROS.g:4747:2: '{'
            {
             before(grammarAccess.getMessageDefinitionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMessageDefinitionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group__0__Impl"


    // $ANTLR start "rule__MessageDefinition__Group__1"
    // InternalMROS.g:4756:1: rule__MessageDefinition__Group__1 : rule__MessageDefinition__Group__1__Impl rule__MessageDefinition__Group__2 ;
    public final void rule__MessageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4760:1: ( rule__MessageDefinition__Group__1__Impl rule__MessageDefinition__Group__2 )
            // InternalMROS.g:4761:2: rule__MessageDefinition__Group__1__Impl rule__MessageDefinition__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__MessageDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__2();

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
    // $ANTLR end "rule__MessageDefinition__Group__1"


    // $ANTLR start "rule__MessageDefinition__Group__1__Impl"
    // InternalMROS.g:4768:1: rule__MessageDefinition__Group__1__Impl : ( ( rule__MessageDefinition__Group_1__0 )? ) ;
    public final void rule__MessageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4772:1: ( ( ( rule__MessageDefinition__Group_1__0 )? ) )
            // InternalMROS.g:4773:1: ( ( rule__MessageDefinition__Group_1__0 )? )
            {
            // InternalMROS.g:4773:1: ( ( rule__MessageDefinition__Group_1__0 )? )
            // InternalMROS.g:4774:2: ( rule__MessageDefinition__Group_1__0 )?
            {
             before(grammarAccess.getMessageDefinitionAccess().getGroup_1()); 
            // InternalMROS.g:4775:2: ( rule__MessageDefinition__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMROS.g:4775:3: rule__MessageDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageDefinition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageDefinitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group__1__Impl"


    // $ANTLR start "rule__MessageDefinition__Group__2"
    // InternalMROS.g:4783:1: rule__MessageDefinition__Group__2 : rule__MessageDefinition__Group__2__Impl ;
    public final void rule__MessageDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4787:1: ( rule__MessageDefinition__Group__2__Impl )
            // InternalMROS.g:4788:2: rule__MessageDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__MessageDefinition__Group__2"


    // $ANTLR start "rule__MessageDefinition__Group__2__Impl"
    // InternalMROS.g:4794:1: rule__MessageDefinition__Group__2__Impl : ( '}' ) ;
    public final void rule__MessageDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4798:1: ( ( '}' ) )
            // InternalMROS.g:4799:1: ( '}' )
            {
            // InternalMROS.g:4799:1: ( '}' )
            // InternalMROS.g:4800:2: '}'
            {
             before(grammarAccess.getMessageDefinitionAccess().getRightCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMessageDefinitionAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group__2__Impl"


    // $ANTLR start "rule__MessageDefinition__Group_1__0"
    // InternalMROS.g:4810:1: rule__MessageDefinition__Group_1__0 : rule__MessageDefinition__Group_1__0__Impl rule__MessageDefinition__Group_1__1 ;
    public final void rule__MessageDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4814:1: ( rule__MessageDefinition__Group_1__0__Impl rule__MessageDefinition__Group_1__1 )
            // InternalMROS.g:4815:2: rule__MessageDefinition__Group_1__0__Impl rule__MessageDefinition__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__MessageDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group_1__1();

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
    // $ANTLR end "rule__MessageDefinition__Group_1__0"


    // $ANTLR start "rule__MessageDefinition__Group_1__0__Impl"
    // InternalMROS.g:4822:1: rule__MessageDefinition__Group_1__0__Impl : ( ( rule__MessageDefinition__MessagePartAssignment_1_0 ) ) ;
    public final void rule__MessageDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4826:1: ( ( ( rule__MessageDefinition__MessagePartAssignment_1_0 ) ) )
            // InternalMROS.g:4827:1: ( ( rule__MessageDefinition__MessagePartAssignment_1_0 ) )
            {
            // InternalMROS.g:4827:1: ( ( rule__MessageDefinition__MessagePartAssignment_1_0 ) )
            // InternalMROS.g:4828:2: ( rule__MessageDefinition__MessagePartAssignment_1_0 )
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessagePartAssignment_1_0()); 
            // InternalMROS.g:4829:2: ( rule__MessageDefinition__MessagePartAssignment_1_0 )
            // InternalMROS.g:4829:3: rule__MessageDefinition__MessagePartAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__MessagePartAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageDefinitionAccess().getMessagePartAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__MessageDefinition__Group_1__1"
    // InternalMROS.g:4837:1: rule__MessageDefinition__Group_1__1 : rule__MessageDefinition__Group_1__1__Impl ;
    public final void rule__MessageDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4841:1: ( rule__MessageDefinition__Group_1__1__Impl )
            // InternalMROS.g:4842:2: rule__MessageDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group_1__1__Impl();

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
    // $ANTLR end "rule__MessageDefinition__Group_1__1"


    // $ANTLR start "rule__MessageDefinition__Group_1__1__Impl"
    // InternalMROS.g:4848:1: rule__MessageDefinition__Group_1__1__Impl : ( ( rule__MessageDefinition__Group_1_1__0 )* ) ;
    public final void rule__MessageDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4852:1: ( ( ( rule__MessageDefinition__Group_1_1__0 )* ) )
            // InternalMROS.g:4853:1: ( ( rule__MessageDefinition__Group_1_1__0 )* )
            {
            // InternalMROS.g:4853:1: ( ( rule__MessageDefinition__Group_1_1__0 )* )
            // InternalMROS.g:4854:2: ( rule__MessageDefinition__Group_1_1__0 )*
            {
             before(grammarAccess.getMessageDefinitionAccess().getGroup_1_1()); 
            // InternalMROS.g:4855:2: ( rule__MessageDefinition__Group_1_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==35) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMROS.g:4855:3: rule__MessageDefinition__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MessageDefinition__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getMessageDefinitionAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__MessageDefinition__Group_1_1__0"
    // InternalMROS.g:4864:1: rule__MessageDefinition__Group_1_1__0 : rule__MessageDefinition__Group_1_1__0__Impl rule__MessageDefinition__Group_1_1__1 ;
    public final void rule__MessageDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4868:1: ( rule__MessageDefinition__Group_1_1__0__Impl rule__MessageDefinition__Group_1_1__1 )
            // InternalMROS.g:4869:2: rule__MessageDefinition__Group_1_1__0__Impl rule__MessageDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__MessageDefinition__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group_1_1__1();

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
    // $ANTLR end "rule__MessageDefinition__Group_1_1__0"


    // $ANTLR start "rule__MessageDefinition__Group_1_1__0__Impl"
    // InternalMROS.g:4876:1: rule__MessageDefinition__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__MessageDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4880:1: ( ( ',' ) )
            // InternalMROS.g:4881:1: ( ',' )
            {
            // InternalMROS.g:4881:1: ( ',' )
            // InternalMROS.g:4882:2: ','
            {
             before(grammarAccess.getMessageDefinitionAccess().getCommaKeyword_1_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMessageDefinitionAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group_1_1__0__Impl"


    // $ANTLR start "rule__MessageDefinition__Group_1_1__1"
    // InternalMROS.g:4891:1: rule__MessageDefinition__Group_1_1__1 : rule__MessageDefinition__Group_1_1__1__Impl ;
    public final void rule__MessageDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4895:1: ( rule__MessageDefinition__Group_1_1__1__Impl )
            // InternalMROS.g:4896:2: rule__MessageDefinition__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__MessageDefinition__Group_1_1__1"


    // $ANTLR start "rule__MessageDefinition__Group_1_1__1__Impl"
    // InternalMROS.g:4902:1: rule__MessageDefinition__Group_1_1__1__Impl : ( ( rule__MessageDefinition__MessagePartAssignment_1_1_1 ) ) ;
    public final void rule__MessageDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4906:1: ( ( ( rule__MessageDefinition__MessagePartAssignment_1_1_1 ) ) )
            // InternalMROS.g:4907:1: ( ( rule__MessageDefinition__MessagePartAssignment_1_1_1 ) )
            {
            // InternalMROS.g:4907:1: ( ( rule__MessageDefinition__MessagePartAssignment_1_1_1 ) )
            // InternalMROS.g:4908:2: ( rule__MessageDefinition__MessagePartAssignment_1_1_1 )
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessagePartAssignment_1_1_1()); 
            // InternalMROS.g:4909:2: ( rule__MessageDefinition__MessagePartAssignment_1_1_1 )
            // InternalMROS.g:4909:3: rule__MessageDefinition__MessagePartAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__MessagePartAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageDefinitionAccess().getMessagePartAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group_1_1__1__Impl"


    // $ANTLR start "rule__ParameterType__Group__0"
    // InternalMROS.g:4918:1: rule__ParameterType__Group__0 : rule__ParameterType__Group__0__Impl rule__ParameterType__Group__1 ;
    public final void rule__ParameterType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4922:1: ( rule__ParameterType__Group__0__Impl rule__ParameterType__Group__1 )
            // InternalMROS.g:4923:2: rule__ParameterType__Group__0__Impl rule__ParameterType__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ParameterType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterType__Group__1();

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
    // $ANTLR end "rule__ParameterType__Group__0"


    // $ANTLR start "rule__ParameterType__Group__0__Impl"
    // InternalMROS.g:4930:1: rule__ParameterType__Group__0__Impl : ( ( rule__ParameterType__NameAssignment_0 ) ) ;
    public final void rule__ParameterType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4934:1: ( ( ( rule__ParameterType__NameAssignment_0 ) ) )
            // InternalMROS.g:4935:1: ( ( rule__ParameterType__NameAssignment_0 ) )
            {
            // InternalMROS.g:4935:1: ( ( rule__ParameterType__NameAssignment_0 ) )
            // InternalMROS.g:4936:2: ( rule__ParameterType__NameAssignment_0 )
            {
             before(grammarAccess.getParameterTypeAccess().getNameAssignment_0()); 
            // InternalMROS.g:4937:2: ( rule__ParameterType__NameAssignment_0 )
            // InternalMROS.g:4937:3: rule__ParameterType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType__Group__0__Impl"


    // $ANTLR start "rule__ParameterType__Group__1"
    // InternalMROS.g:4945:1: rule__ParameterType__Group__1 : rule__ParameterType__Group__1__Impl rule__ParameterType__Group__2 ;
    public final void rule__ParameterType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4949:1: ( rule__ParameterType__Group__1__Impl rule__ParameterType__Group__2 )
            // InternalMROS.g:4950:2: rule__ParameterType__Group__1__Impl rule__ParameterType__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__ParameterType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterType__Group__2();

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
    // $ANTLR end "rule__ParameterType__Group__1"


    // $ANTLR start "rule__ParameterType__Group__1__Impl"
    // InternalMROS.g:4957:1: rule__ParameterType__Group__1__Impl : ( ':' ) ;
    public final void rule__ParameterType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4961:1: ( ( ':' ) )
            // InternalMROS.g:4962:1: ( ':' )
            {
            // InternalMROS.g:4962:1: ( ':' )
            // InternalMROS.g:4963:2: ':'
            {
             before(grammarAccess.getParameterTypeAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParameterTypeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType__Group__1__Impl"


    // $ANTLR start "rule__ParameterType__Group__2"
    // InternalMROS.g:4972:1: rule__ParameterType__Group__2 : rule__ParameterType__Group__2__Impl ;
    public final void rule__ParameterType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4976:1: ( rule__ParameterType__Group__2__Impl )
            // InternalMROS.g:4977:2: rule__ParameterType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__Group__2__Impl();

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
    // $ANTLR end "rule__ParameterType__Group__2"


    // $ANTLR start "rule__ParameterType__Group__2__Impl"
    // InternalMROS.g:4983:1: rule__ParameterType__Group__2__Impl : ( ( rule__ParameterType__ValueAssignment_2 ) ) ;
    public final void rule__ParameterType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:4987:1: ( ( ( rule__ParameterType__ValueAssignment_2 ) ) )
            // InternalMROS.g:4988:1: ( ( rule__ParameterType__ValueAssignment_2 ) )
            {
            // InternalMROS.g:4988:1: ( ( rule__ParameterType__ValueAssignment_2 ) )
            // InternalMROS.g:4989:2: ( rule__ParameterType__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterTypeAccess().getValueAssignment_2()); 
            // InternalMROS.g:4990:2: ( rule__ParameterType__ValueAssignment_2 )
            // InternalMROS.g:4990:3: rule__ParameterType__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType__Group__2__Impl"


    // $ANTLR start "rule__Model__SkillDefinitionSetAssignment_2"
    // InternalMROS.g:4999:1: rule__Model__SkillDefinitionSetAssignment_2 : ( ruleSkillDefinition ) ;
    public final void rule__Model__SkillDefinitionSetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5003:1: ( ( ruleSkillDefinition ) )
            // InternalMROS.g:5004:2: ( ruleSkillDefinition )
            {
            // InternalMROS.g:5004:2: ( ruleSkillDefinition )
            // InternalMROS.g:5005:3: ruleSkillDefinition
            {
             before(grammarAccess.getModelAccess().getSkillDefinitionSetSkillDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSkillDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSkillDefinitionSetSkillDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SkillDefinitionSetAssignment_2"


    // $ANTLR start "rule__SkillDefinition__NameAssignment_1"
    // InternalMROS.g:5014:1: rule__SkillDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SkillDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5018:1: ( ( RULE_ID ) )
            // InternalMROS.g:5019:2: ( RULE_ID )
            {
            // InternalMROS.g:5019:2: ( RULE_ID )
            // InternalMROS.g:5020:3: RULE_ID
            {
             before(grammarAccess.getSkillDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__NameAssignment_1"


    // $ANTLR start "rule__SkillDefinition__ListqaAssignment_5"
    // InternalMROS.g:5029:1: rule__SkillDefinition__ListqaAssignment_5 : ( ruleQualityAttribute ) ;
    public final void rule__SkillDefinition__ListqaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5033:1: ( ( ruleQualityAttribute ) )
            // InternalMROS.g:5034:2: ( ruleQualityAttribute )
            {
            // InternalMROS.g:5034:2: ( ruleQualityAttribute )
            // InternalMROS.g:5035:3: ruleQualityAttribute
            {
             before(grammarAccess.getSkillDefinitionAccess().getListqaQualityAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleQualityAttribute();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getListqaQualityAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__ListqaAssignment_5"


    // $ANTLR start "rule__SkillDefinition__ListqaAssignment_6_1"
    // InternalMROS.g:5044:1: rule__SkillDefinition__ListqaAssignment_6_1 : ( ruleQualityAttribute ) ;
    public final void rule__SkillDefinition__ListqaAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5048:1: ( ( ruleQualityAttribute ) )
            // InternalMROS.g:5049:2: ( ruleQualityAttribute )
            {
            // InternalMROS.g:5049:2: ( ruleQualityAttribute )
            // InternalMROS.g:5050:3: ruleQualityAttribute
            {
             before(grammarAccess.getSkillDefinitionAccess().getListqaQualityAttributeParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualityAttribute();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getListqaQualityAttributeParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__ListqaAssignment_6_1"


    // $ANTLR start "rule__SkillDefinition__PAssignment_8_2"
    // InternalMROS.g:5059:1: rule__SkillDefinition__PAssignment_8_2 : ( ruleParameterType ) ;
    public final void rule__SkillDefinition__PAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5063:1: ( ( ruleParameterType ) )
            // InternalMROS.g:5064:2: ( ruleParameterType )
            {
            // InternalMROS.g:5064:2: ( ruleParameterType )
            // InternalMROS.g:5065:3: ruleParameterType
            {
             before(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__PAssignment_8_2"


    // $ANTLR start "rule__SkillDefinition__PAssignment_8_3_1"
    // InternalMROS.g:5074:1: rule__SkillDefinition__PAssignment_8_3_1 : ( ruleParameterType ) ;
    public final void rule__SkillDefinition__PAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5078:1: ( ( ruleParameterType ) )
            // InternalMROS.g:5079:2: ( ruleParameterType )
            {
            // InternalMROS.g:5079:2: ( ruleParameterType )
            // InternalMROS.g:5080:3: ruleParameterType
            {
             before(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__PAssignment_8_3_1"


    // $ANTLR start "rule__SkillDefinition__PAssignment_9_2"
    // InternalMROS.g:5089:1: rule__SkillDefinition__PAssignment_9_2 : ( ruleParameterType ) ;
    public final void rule__SkillDefinition__PAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5093:1: ( ( ruleParameterType ) )
            // InternalMROS.g:5094:2: ( ruleParameterType )
            {
            // InternalMROS.g:5094:2: ( ruleParameterType )
            // InternalMROS.g:5095:3: ruleParameterType
            {
             before(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__PAssignment_9_2"


    // $ANTLR start "rule__SkillDefinition__PAssignment_9_3_1"
    // InternalMROS.g:5104:1: rule__SkillDefinition__PAssignment_9_3_1 : ( ruleParameterType ) ;
    public final void rule__SkillDefinition__PAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5108:1: ( ( ruleParameterType ) )
            // InternalMROS.g:5109:2: ( ruleParameterType )
            {
            // InternalMROS.g:5109:2: ( ruleParameterType )
            // InternalMROS.g:5110:3: ruleParameterType
            {
             before(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getPParameterTypeParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__PAssignment_9_3_1"


    // $ANTLR start "rule__SkillDefinition__ResultAssignment_12"
    // InternalMROS.g:5119:1: rule__SkillDefinition__ResultAssignment_12 : ( ruleResultType ) ;
    public final void rule__SkillDefinition__ResultAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5123:1: ( ( ruleResultType ) )
            // InternalMROS.g:5124:2: ( ruleResultType )
            {
            // InternalMROS.g:5124:2: ( ruleResultType )
            // InternalMROS.g:5125:3: ruleResultType
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultResultTypeParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleResultType();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getResultResultTypeParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__ResultAssignment_12"


    // $ANTLR start "rule__SkillDefinition__ResultAssignment_13_1"
    // InternalMROS.g:5134:1: rule__SkillDefinition__ResultAssignment_13_1 : ( ruleResultType ) ;
    public final void rule__SkillDefinition__ResultAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5138:1: ( ( ruleResultType ) )
            // InternalMROS.g:5139:2: ( ruleResultType )
            {
            // InternalMROS.g:5139:2: ( ruleResultType )
            // InternalMROS.g:5140:3: ruleResultType
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultResultTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResultType();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getResultResultTypeParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__ResultAssignment_13_1"


    // $ANTLR start "rule__SkillDefinition__RealizationsAssignment_15"
    // InternalMROS.g:5149:1: rule__SkillDefinition__RealizationsAssignment_15 : ( ruleSkillRealization ) ;
    public final void rule__SkillDefinition__RealizationsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5153:1: ( ( ruleSkillRealization ) )
            // InternalMROS.g:5154:2: ( ruleSkillRealization )
            {
            // InternalMROS.g:5154:2: ( ruleSkillRealization )
            // InternalMROS.g:5155:3: ruleSkillRealization
            {
             before(grammarAccess.getSkillDefinitionAccess().getRealizationsSkillRealizationParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleSkillRealization();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getRealizationsSkillRealizationParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__RealizationsAssignment_15"


    // $ANTLR start "rule__SUCCESS__ValueAssignment_2"
    // InternalMROS.g:5164:1: rule__SUCCESS__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SUCCESS__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5168:1: ( ( RULE_STRING ) )
            // InternalMROS.g:5169:2: ( RULE_STRING )
            {
            // InternalMROS.g:5169:2: ( RULE_STRING )
            // InternalMROS.g:5170:3: RULE_STRING
            {
             before(grammarAccess.getSUCCESSAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSUCCESSAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUCCESS__ValueAssignment_2"


    // $ANTLR start "rule__SUCCESS__ValueAssignment_3"
    // InternalMROS.g:5179:1: rule__SUCCESS__ValueAssignment_3 : ( ruleDouble ) ;
    public final void rule__SUCCESS__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5183:1: ( ( ruleDouble ) )
            // InternalMROS.g:5184:2: ( ruleDouble )
            {
            // InternalMROS.g:5184:2: ( ruleDouble )
            // InternalMROS.g:5185:3: ruleDouble
            {
             before(grammarAccess.getSUCCESSAccess().getValueDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getSUCCESSAccess().getValueDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUCCESS__ValueAssignment_3"


    // $ANTLR start "rule__ERROR__ValueAssignment_2"
    // InternalMROS.g:5194:1: rule__ERROR__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ERROR__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5198:1: ( ( RULE_STRING ) )
            // InternalMROS.g:5199:2: ( RULE_STRING )
            {
            // InternalMROS.g:5199:2: ( RULE_STRING )
            // InternalMROS.g:5200:3: RULE_STRING
            {
             before(grammarAccess.getERRORAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getERRORAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERROR__ValueAssignment_2"


    // $ANTLR start "rule__ERROR__ValueAssignment_3"
    // InternalMROS.g:5209:1: rule__ERROR__ValueAssignment_3 : ( ruleDouble ) ;
    public final void rule__ERROR__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5213:1: ( ( ruleDouble ) )
            // InternalMROS.g:5214:2: ( ruleDouble )
            {
            // InternalMROS.g:5214:2: ( ruleDouble )
            // InternalMROS.g:5215:3: ruleDouble
            {
             before(grammarAccess.getERRORAccess().getValueDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getERRORAccess().getValueDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERROR__ValueAssignment_3"


    // $ANTLR start "rule__INPROGRESS__ValueAssignment_2"
    // InternalMROS.g:5224:1: rule__INPROGRESS__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__INPROGRESS__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5228:1: ( ( RULE_STRING ) )
            // InternalMROS.g:5229:2: ( RULE_STRING )
            {
            // InternalMROS.g:5229:2: ( RULE_STRING )
            // InternalMROS.g:5230:3: RULE_STRING
            {
             before(grammarAccess.getINPROGRESSAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getINPROGRESSAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INPROGRESS__ValueAssignment_2"


    // $ANTLR start "rule__INPROGRESS__ValueAssignment_3"
    // InternalMROS.g:5239:1: rule__INPROGRESS__ValueAssignment_3 : ( ruleDouble ) ;
    public final void rule__INPROGRESS__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5243:1: ( ( ruleDouble ) )
            // InternalMROS.g:5244:2: ( ruleDouble )
            {
            // InternalMROS.g:5244:2: ( ruleDouble )
            // InternalMROS.g:5245:3: ruleDouble
            {
             before(grammarAccess.getINPROGRESSAccess().getValueDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getINPROGRESSAccess().getValueDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INPROGRESS__ValueAssignment_3"


    // $ANTLR start "rule__QualityAttribute__NameAssignment"
    // InternalMROS.g:5254:1: rule__QualityAttribute__NameAssignment : ( ( rule__QualityAttribute__NameAlternatives_0 ) ) ;
    public final void rule__QualityAttribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5258:1: ( ( ( rule__QualityAttribute__NameAlternatives_0 ) ) )
            // InternalMROS.g:5259:2: ( ( rule__QualityAttribute__NameAlternatives_0 ) )
            {
            // InternalMROS.g:5259:2: ( ( rule__QualityAttribute__NameAlternatives_0 ) )
            // InternalMROS.g:5260:3: ( rule__QualityAttribute__NameAlternatives_0 )
            {
             before(grammarAccess.getQualityAttributeAccess().getNameAlternatives_0()); 
            // InternalMROS.g:5261:3: ( rule__QualityAttribute__NameAlternatives_0 )
            // InternalMROS.g:5261:4: rule__QualityAttribute__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__QualityAttribute__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getQualityAttributeAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAttribute__NameAssignment"


    // $ANTLR start "rule__SkillRealization__NameAssignment_1"
    // InternalMROS.g:5269:1: rule__SkillRealization__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SkillRealization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5273:1: ( ( RULE_ID ) )
            // InternalMROS.g:5274:2: ( RULE_ID )
            {
            // InternalMROS.g:5274:2: ( RULE_ID )
            // InternalMROS.g:5275:3: RULE_ID
            {
             before(grammarAccess.getSkillRealizationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__NameAssignment_1"


    // $ANTLR start "rule__SkillRealization__CAssignment_3"
    // InternalMROS.g:5284:1: rule__SkillRealization__CAssignment_3 : ( ruleComponent ) ;
    public final void rule__SkillRealization__CAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5288:1: ( ( ruleComponent ) )
            // InternalMROS.g:5289:2: ( ruleComponent )
            {
            // InternalMROS.g:5289:2: ( ruleComponent )
            // InternalMROS.g:5290:3: ruleComponent
            {
             before(grammarAccess.getSkillRealizationAccess().getCComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSkillRealizationAccess().getCComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__CAssignment_3"


    // $ANTLR start "rule__SkillRealization__CAssignment_4_1"
    // InternalMROS.g:5299:1: rule__SkillRealization__CAssignment_4_1 : ( ruleComponent ) ;
    public final void rule__SkillRealization__CAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5303:1: ( ( ruleComponent ) )
            // InternalMROS.g:5304:2: ( ruleComponent )
            {
            // InternalMROS.g:5304:2: ( ruleComponent )
            // InternalMROS.g:5305:3: ruleComponent
            {
             before(grammarAccess.getSkillRealizationAccess().getCComponentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSkillRealizationAccess().getCComponentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__CAssignment_4_1"


    // $ANTLR start "rule__SkillRealization__QAssignment_5_2"
    // InternalMROS.g:5314:1: rule__SkillRealization__QAssignment_5_2 : ( ruleQualityModel ) ;
    public final void rule__SkillRealization__QAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5318:1: ( ( ruleQualityModel ) )
            // InternalMROS.g:5319:2: ( ruleQualityModel )
            {
            // InternalMROS.g:5319:2: ( ruleQualityModel )
            // InternalMROS.g:5320:3: ruleQualityModel
            {
             before(grammarAccess.getSkillRealizationAccess().getQQualityModelParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualityModel();

            state._fsp--;

             after(grammarAccess.getSkillRealizationAccess().getQQualityModelParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__QAssignment_5_2"


    // $ANTLR start "rule__SkillRealization__QAssignment_5_3_1"
    // InternalMROS.g:5329:1: rule__SkillRealization__QAssignment_5_3_1 : ( ruleQualityModel ) ;
    public final void rule__SkillRealization__QAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5333:1: ( ( ruleQualityModel ) )
            // InternalMROS.g:5334:2: ( ruleQualityModel )
            {
            // InternalMROS.g:5334:2: ( ruleQualityModel )
            // InternalMROS.g:5335:3: ruleQualityModel
            {
             before(grammarAccess.getSkillRealizationAccess().getQQualityModelParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualityModel();

            state._fsp--;

             after(grammarAccess.getSkillRealizationAccess().getQQualityModelParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__QAssignment_5_3_1"


    // $ANTLR start "rule__SkillRealization__ContextAssignment_6"
    // InternalMROS.g:5344:1: rule__SkillRealization__ContextAssignment_6 : ( ruleContext ) ;
    public final void rule__SkillRealization__ContextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5348:1: ( ( ruleContext ) )
            // InternalMROS.g:5349:2: ( ruleContext )
            {
            // InternalMROS.g:5349:2: ( ruleContext )
            // InternalMROS.g:5350:3: ruleContext
            {
             before(grammarAccess.getSkillRealizationAccess().getContextContextParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getSkillRealizationAccess().getContextContextParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealization__ContextAssignment_6"


    // $ANTLR start "rule__Context__TypeAssignment_1"
    // InternalMROS.g:5359:1: rule__Context__TypeAssignment_1 : ( ruleContextType ) ;
    public final void rule__Context__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5363:1: ( ( ruleContextType ) )
            // InternalMROS.g:5364:2: ( ruleContextType )
            {
            // InternalMROS.g:5364:2: ( ruleContextType )
            // InternalMROS.g:5365:3: ruleContextType
            {
             before(grammarAccess.getContextAccess().getTypeContextTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContextType();

            state._fsp--;

             after(grammarAccess.getContextAccess().getTypeContextTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__TypeAssignment_1"


    // $ANTLR start "rule__QualityModel__QaAssignment_0"
    // InternalMROS.g:5374:1: rule__QualityModel__QaAssignment_0 : ( ruleQualityAttribute ) ;
    public final void rule__QualityModel__QaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5378:1: ( ( ruleQualityAttribute ) )
            // InternalMROS.g:5379:2: ( ruleQualityAttribute )
            {
            // InternalMROS.g:5379:2: ( ruleQualityAttribute )
            // InternalMROS.g:5380:3: ruleQualityAttribute
            {
             before(grammarAccess.getQualityModelAccess().getQaQualityAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualityAttribute();

            state._fsp--;

             after(grammarAccess.getQualityModelAccess().getQaQualityAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__QaAssignment_0"


    // $ANTLR start "rule__QualityModel__QvalueAssignment_2"
    // InternalMROS.g:5389:1: rule__QualityModel__QvalueAssignment_2 : ( ruleDouble ) ;
    public final void rule__QualityModel__QvalueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5393:1: ( ( ruleDouble ) )
            // InternalMROS.g:5394:2: ( ruleDouble )
            {
            // InternalMROS.g:5394:2: ( ruleDouble )
            // InternalMROS.g:5395:3: ruleDouble
            {
             before(grammarAccess.getQualityModelAccess().getQvalueDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getQualityModelAccess().getQvalueDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__QvalueAssignment_2"


    // $ANTLR start "rule__QualityModel__EAssignment_3_1"
    // InternalMROS.g:5404:1: rule__QualityModel__EAssignment_3_1 : ( ruleEnvironment ) ;
    public final void rule__QualityModel__EAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5408:1: ( ( ruleEnvironment ) )
            // InternalMROS.g:5409:2: ( ruleEnvironment )
            {
            // InternalMROS.g:5409:2: ( ruleEnvironment )
            // InternalMROS.g:5410:3: ruleEnvironment
            {
             before(grammarAccess.getQualityModelAccess().getEEnvironmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getQualityModelAccess().getEEnvironmentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityModel__EAssignment_3_1"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalMROS.g:5419:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5423:1: ( ( RULE_ID ) )
            // InternalMROS.g:5424:2: ( RULE_ID )
            {
            // InternalMROS.g:5424:2: ( RULE_ID )
            // InternalMROS.g:5425:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__ObservableAssignment_2"
    // InternalMROS.g:5434:1: rule__Component__ObservableAssignment_2 : ( ( 'observable' ) ) ;
    public final void rule__Component__ObservableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5438:1: ( ( ( 'observable' ) ) )
            // InternalMROS.g:5439:2: ( ( 'observable' ) )
            {
            // InternalMROS.g:5439:2: ( ( 'observable' ) )
            // InternalMROS.g:5440:3: ( 'observable' )
            {
             before(grammarAccess.getComponentAccess().getObservableObservableKeyword_2_0()); 
            // InternalMROS.g:5441:3: ( 'observable' )
            // InternalMROS.g:5442:4: 'observable'
            {
             before(grammarAccess.getComponentAccess().getObservableObservableKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getObservableObservableKeyword_2_0()); 

            }

             after(grammarAccess.getComponentAccess().getObservableObservableKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ObservableAssignment_2"


    // $ANTLR start "rule__Component__PAssignment_4"
    // InternalMROS.g:5453:1: rule__Component__PAssignment_4 : ( ruleConfiguration ) ;
    public final void rule__Component__PAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5457:1: ( ( ruleConfiguration ) )
            // InternalMROS.g:5458:2: ( ruleConfiguration )
            {
            // InternalMROS.g:5458:2: ( ruleConfiguration )
            // InternalMROS.g:5459:3: ruleConfiguration
            {
             before(grammarAccess.getComponentAccess().getPConfigurationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPConfigurationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PAssignment_4"


    // $ANTLR start "rule__Component__PAssignment_5_1"
    // InternalMROS.g:5468:1: rule__Component__PAssignment_5_1 : ( ruleConfiguration ) ;
    public final void rule__Component__PAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5472:1: ( ( ruleConfiguration ) )
            // InternalMROS.g:5473:2: ( ruleConfiguration )
            {
            // InternalMROS.g:5473:2: ( ruleConfiguration )
            // InternalMROS.g:5474:3: ruleConfiguration
            {
             before(grammarAccess.getComponentAccess().getPConfigurationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPConfigurationParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PAssignment_5_1"


    // $ANTLR start "rule__Configuration__NameAssignment_1"
    // InternalMROS.g:5483:1: rule__Configuration__NameAssignment_1 : ( ruleQualifiedMode ) ;
    public final void rule__Configuration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5487:1: ( ( ruleQualifiedMode ) )
            // InternalMROS.g:5488:2: ( ruleQualifiedMode )
            {
            // InternalMROS.g:5488:2: ( ruleQualifiedMode )
            // InternalMROS.g:5489:3: ruleQualifiedMode
            {
             before(grammarAccess.getConfigurationAccess().getNameQualifiedModeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedMode();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getNameQualifiedModeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__NameAssignment_1"


    // $ANTLR start "rule__Configuration__PAssignment_2_1"
    // InternalMROS.g:5498:1: rule__Configuration__PAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Configuration__PAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5502:1: ( ( ruleParameter ) )
            // InternalMROS.g:5503:2: ( ruleParameter )
            {
            // InternalMROS.g:5503:2: ( ruleParameter )
            // InternalMROS.g:5504:3: ruleParameter
            {
             before(grammarAccess.getConfigurationAccess().getPParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getPParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__PAssignment_2_1"


    // $ANTLR start "rule__Configuration__PAssignment_2_2_1"
    // InternalMROS.g:5513:1: rule__Configuration__PAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Configuration__PAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5517:1: ( ( ruleParameter ) )
            // InternalMROS.g:5518:2: ( ruleParameter )
            {
            // InternalMROS.g:5518:2: ( ruleParameter )
            // InternalMROS.g:5519:3: ruleParameter
            {
             before(grammarAccess.getConfigurationAccess().getPParameterParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getPParameterParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__PAssignment_2_2_1"


    // $ANTLR start "rule__Environment__NameAssignment_1"
    // InternalMROS.g:5528:1: rule__Environment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Environment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5532:1: ( ( RULE_ID ) )
            // InternalMROS.g:5533:2: ( RULE_ID )
            {
            // InternalMROS.g:5533:2: ( RULE_ID )
            // InternalMROS.g:5534:3: RULE_ID
            {
             before(grammarAccess.getEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__NameAssignment_1"


    // $ANTLR start "rule__Environment__ParameterlistAssignment_3"
    // InternalMROS.g:5543:1: rule__Environment__ParameterlistAssignment_3 : ( ruleEnvironmentParameter ) ;
    public final void rule__Environment__ParameterlistAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5547:1: ( ( ruleEnvironmentParameter ) )
            // InternalMROS.g:5548:2: ( ruleEnvironmentParameter )
            {
            // InternalMROS.g:5548:2: ( ruleEnvironmentParameter )
            // InternalMROS.g:5549:3: ruleEnvironmentParameter
            {
             before(grammarAccess.getEnvironmentAccess().getParameterlistEnvironmentParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentParameter();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getParameterlistEnvironmentParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ParameterlistAssignment_3"


    // $ANTLR start "rule__Environment__ParameterlistAssignment_4_1"
    // InternalMROS.g:5558:1: rule__Environment__ParameterlistAssignment_4_1 : ( ruleEnvironmentParameter ) ;
    public final void rule__Environment__ParameterlistAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5562:1: ( ( ruleEnvironmentParameter ) )
            // InternalMROS.g:5563:2: ( ruleEnvironmentParameter )
            {
            // InternalMROS.g:5563:2: ( ruleEnvironmentParameter )
            // InternalMROS.g:5564:3: ruleEnvironmentParameter
            {
             before(grammarAccess.getEnvironmentAccess().getParameterlistEnvironmentParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentParameter();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getParameterlistEnvironmentParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ParameterlistAssignment_4_1"


    // $ANTLR start "rule__Narowness__ValueAssignment_1"
    // InternalMROS.g:5573:1: rule__Narowness__ValueAssignment_1 : ( ruleDouble ) ;
    public final void rule__Narowness__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5577:1: ( ( ruleDouble ) )
            // InternalMROS.g:5578:2: ( ruleDouble )
            {
            // InternalMROS.g:5578:2: ( ruleDouble )
            // InternalMROS.g:5579:3: ruleDouble
            {
             before(grammarAccess.getNarownessAccess().getValueDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getNarownessAccess().getValueDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Narowness__ValueAssignment_1"


    // $ANTLR start "rule__Clutterness__ValueAssignment_1"
    // InternalMROS.g:5588:1: rule__Clutterness__ValueAssignment_1 : ( ruleDouble ) ;
    public final void rule__Clutterness__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5592:1: ( ( ruleDouble ) )
            // InternalMROS.g:5593:2: ( ruleDouble )
            {
            // InternalMROS.g:5593:2: ( ruleDouble )
            // InternalMROS.g:5594:3: ruleDouble
            {
             before(grammarAccess.getClutternessAccess().getValueDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getClutternessAccess().getValueDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clutterness__ValueAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalMROS.g:5603:1: rule__Parameter__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5607:1: ( ( ruleQualifiedName ) )
            // InternalMROS.g:5608:2: ( ruleQualifiedName )
            {
            // InternalMROS.g:5608:2: ( ruleQualifiedName )
            // InternalMROS.g:5609:3: ruleQualifiedName
            {
             before(grammarAccess.getParameterAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__ValueAssignment_2"
    // InternalMROS.g:5618:1: rule__Parameter__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Parameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5622:1: ( ( RULE_STRING ) )
            // InternalMROS.g:5623:2: ( RULE_STRING )
            {
            // InternalMROS.g:5623:2: ( RULE_STRING )
            // InternalMROS.g:5624:3: RULE_STRING
            {
             before(grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_2"


    // $ANTLR start "rule__Parameter__ValueAssignment_3"
    // InternalMROS.g:5633:1: rule__Parameter__ValueAssignment_3 : ( ruleDouble ) ;
    public final void rule__Parameter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5637:1: ( ( ruleDouble ) )
            // InternalMROS.g:5638:2: ( ruleDouble )
            {
            // InternalMROS.g:5638:2: ( ruleDouble )
            // InternalMROS.g:5639:3: ruleDouble
            {
             before(grammarAccess.getParameterAccess().getValueDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_3"


    // $ANTLR start "rule__ActionType__NameAssignment_1"
    // InternalMROS.g:5648:1: rule__ActionType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5652:1: ( ( RULE_ID ) )
            // InternalMROS.g:5653:2: ( RULE_ID )
            {
            // InternalMROS.g:5653:2: ( RULE_ID )
            // InternalMROS.g:5654:3: RULE_ID
            {
             before(grammarAccess.getActionTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__NameAssignment_1"


    // $ANTLR start "rule__ActionType__GoalAssignment_3_1"
    // InternalMROS.g:5663:1: rule__ActionType__GoalAssignment_3_1 : ( ruleGoalDefinition ) ;
    public final void rule__ActionType__GoalAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5667:1: ( ( ruleGoalDefinition ) )
            // InternalMROS.g:5668:2: ( ruleGoalDefinition )
            {
            // InternalMROS.g:5668:2: ( ruleGoalDefinition )
            // InternalMROS.g:5669:3: ruleGoalDefinition
            {
             before(grammarAccess.getActionTypeAccess().getGoalGoalDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGoalDefinition();

            state._fsp--;

             after(grammarAccess.getActionTypeAccess().getGoalGoalDefinitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__GoalAssignment_3_1"


    // $ANTLR start "rule__ActionType__ResultAssignment_4_1"
    // InternalMROS.g:5678:1: rule__ActionType__ResultAssignment_4_1 : ( ruleResultDefinition ) ;
    public final void rule__ActionType__ResultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5682:1: ( ( ruleResultDefinition ) )
            // InternalMROS.g:5683:2: ( ruleResultDefinition )
            {
            // InternalMROS.g:5683:2: ( ruleResultDefinition )
            // InternalMROS.g:5684:3: ruleResultDefinition
            {
             before(grammarAccess.getActionTypeAccess().getResultResultDefinitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResultDefinition();

            state._fsp--;

             after(grammarAccess.getActionTypeAccess().getResultResultDefinitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__ResultAssignment_4_1"


    // $ANTLR start "rule__ActionType__FeedbackAssignment_5_1"
    // InternalMROS.g:5693:1: rule__ActionType__FeedbackAssignment_5_1 : ( ruleFeedback ) ;
    public final void rule__ActionType__FeedbackAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5697:1: ( ( ruleFeedback ) )
            // InternalMROS.g:5698:2: ( ruleFeedback )
            {
            // InternalMROS.g:5698:2: ( ruleFeedback )
            // InternalMROS.g:5699:3: ruleFeedback
            {
             before(grammarAccess.getActionTypeAccess().getFeedbackFeedbackParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeedback();

            state._fsp--;

             after(grammarAccess.getActionTypeAccess().getFeedbackFeedbackParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__FeedbackAssignment_5_1"


    // $ANTLR start "rule__GoalDefinition__GoalAssignment"
    // InternalMROS.g:5708:1: rule__GoalDefinition__GoalAssignment : ( ruleMessageDefinition ) ;
    public final void rule__GoalDefinition__GoalAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5712:1: ( ( ruleMessageDefinition ) )
            // InternalMROS.g:5713:2: ( ruleMessageDefinition )
            {
            // InternalMROS.g:5713:2: ( ruleMessageDefinition )
            // InternalMROS.g:5714:3: ruleMessageDefinition
            {
             before(grammarAccess.getGoalDefinitionAccess().getGoalMessageDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageDefinition();

            state._fsp--;

             after(grammarAccess.getGoalDefinitionAccess().getGoalMessageDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoalDefinition__GoalAssignment"


    // $ANTLR start "rule__ResultDefinition__ResultAssignment"
    // InternalMROS.g:5723:1: rule__ResultDefinition__ResultAssignment : ( ruleMessageDefinition ) ;
    public final void rule__ResultDefinition__ResultAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5727:1: ( ( ruleMessageDefinition ) )
            // InternalMROS.g:5728:2: ( ruleMessageDefinition )
            {
            // InternalMROS.g:5728:2: ( ruleMessageDefinition )
            // InternalMROS.g:5729:3: ruleMessageDefinition
            {
             before(grammarAccess.getResultDefinitionAccess().getResultMessageDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageDefinition();

            state._fsp--;

             after(grammarAccess.getResultDefinitionAccess().getResultMessageDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultDefinition__ResultAssignment"


    // $ANTLR start "rule__Feedback__FeedbackAssignment"
    // InternalMROS.g:5738:1: rule__Feedback__FeedbackAssignment : ( ruleMessageDefinition ) ;
    public final void rule__Feedback__FeedbackAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5742:1: ( ( ruleMessageDefinition ) )
            // InternalMROS.g:5743:2: ( ruleMessageDefinition )
            {
            // InternalMROS.g:5743:2: ( ruleMessageDefinition )
            // InternalMROS.g:5744:3: ruleMessageDefinition
            {
             before(grammarAccess.getFeedbackAccess().getFeedbackMessageDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageDefinition();

            state._fsp--;

             after(grammarAccess.getFeedbackAccess().getFeedbackMessageDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feedback__FeedbackAssignment"


    // $ANTLR start "rule__MessageDefinition__MessagePartAssignment_1_0"
    // InternalMROS.g:5753:1: rule__MessageDefinition__MessagePartAssignment_1_0 : ( ruleMessagePart ) ;
    public final void rule__MessageDefinition__MessagePartAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5757:1: ( ( ruleMessagePart ) )
            // InternalMROS.g:5758:2: ( ruleMessagePart )
            {
            // InternalMROS.g:5758:2: ( ruleMessagePart )
            // InternalMROS.g:5759:3: ruleMessagePart
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessagePart();

            state._fsp--;

             after(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__MessagePartAssignment_1_0"


    // $ANTLR start "rule__MessageDefinition__MessagePartAssignment_1_1_1"
    // InternalMROS.g:5768:1: rule__MessageDefinition__MessagePartAssignment_1_1_1 : ( ruleMessagePart ) ;
    public final void rule__MessageDefinition__MessagePartAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5772:1: ( ( ruleMessagePart ) )
            // InternalMROS.g:5773:2: ( ruleMessagePart )
            {
            // InternalMROS.g:5773:2: ( ruleMessagePart )
            // InternalMROS.g:5774:3: ruleMessagePart
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessagePart();

            state._fsp--;

             after(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__MessagePartAssignment_1_1_1"


    // $ANTLR start "rule__MessagePart__PAssignment"
    // InternalMROS.g:5783:1: rule__MessagePart__PAssignment : ( ruleParameterType ) ;
    public final void rule__MessagePart__PAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5787:1: ( ( ruleParameterType ) )
            // InternalMROS.g:5788:2: ( ruleParameterType )
            {
            // InternalMROS.g:5788:2: ( ruleParameterType )
            // InternalMROS.g:5789:3: ruleParameterType
            {
             before(grammarAccess.getMessagePartAccess().getPParameterTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getMessagePartAccess().getPParameterTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessagePart__PAssignment"


    // $ANTLR start "rule__ParameterType__NameAssignment_0"
    // InternalMROS.g:5798:1: rule__ParameterType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParameterType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5802:1: ( ( RULE_ID ) )
            // InternalMROS.g:5803:2: ( RULE_ID )
            {
            // InternalMROS.g:5803:2: ( RULE_ID )
            // InternalMROS.g:5804:3: RULE_ID
            {
             before(grammarAccess.getParameterTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterTypeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType__NameAssignment_0"


    // $ANTLR start "rule__ParameterType__ValueAssignment_2"
    // InternalMROS.g:5813:1: rule__ParameterType__ValueAssignment_2 : ( ruleAbstractType ) ;
    public final void rule__ParameterType__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMROS.g:5817:1: ( ( ruleAbstractType ) )
            // InternalMROS.g:5818:2: ( ruleAbstractType )
            {
            // InternalMROS.g:5818:2: ( ruleAbstractType )
            // InternalMROS.g:5819:3: ruleAbstractType
            {
             before(grammarAccess.getParameterTypeAccess().getValueAbstractTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getParameterTypeAccess().getValueAbstractTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterType__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000034000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000000000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000300800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0300000420000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000007C00000L});

}