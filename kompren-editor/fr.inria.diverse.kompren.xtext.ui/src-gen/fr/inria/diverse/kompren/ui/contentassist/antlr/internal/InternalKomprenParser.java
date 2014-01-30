package fr.inria.diverse.kompren.ui.contentassist.antlr.internal; 

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
import fr.inria.diverse.kompren.services.KomprenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKomprenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'slicer'", "'{'", "'domain'", "':'", "'input'", "'}'", "','", "'radius'", "'constraint'", "'slicedClass'", "'slicedProperty'", "'onStart'", "'[['", "']]'", "'onEnd'", "'helper'", "'.'", "'opposite'", "'('", "')'", "'active'", "'strict'", "'option'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
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


        public InternalKomprenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKomprenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKomprenParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g"; }


     
     	private KomprenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KomprenGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSlicer"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:60:1: entryRuleSlicer : ruleSlicer EOF ;
    public final void entryRuleSlicer() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:61:1: ( ruleSlicer EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:62:1: ruleSlicer EOF
            {
             before(grammarAccess.getSlicerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicer_in_entryRuleSlicer61);
            ruleSlicer();

            state._fsp--;

             after(grammarAccess.getSlicerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicer68); 

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
    // $ANTLR end "entryRuleSlicer"


    // $ANTLR start "ruleSlicer"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:69:1: ruleSlicer : ( ( rule__Slicer__Group__0 ) ) ;
    public final void ruleSlicer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:73:2: ( ( ( rule__Slicer__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:74:1: ( ( rule__Slicer__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:74:1: ( ( rule__Slicer__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:75:1: ( rule__Slicer__Group__0 )
            {
             before(grammarAccess.getSlicerAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:76:1: ( rule__Slicer__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:76:2: rule__Slicer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__0_in_ruleSlicer94);
            rule__Slicer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlicer"


    // $ANTLR start "entryRuleEString"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:89:1: ( ruleEString EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:104:1: ( rule__EString__Alternatives )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
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


    // $ANTLR start "entryRuleQName"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:116:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:117:1: ( ruleQName EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:118:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_entryRuleQName181);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQName188); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:125:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:129:2: ( ( ( rule__QName__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:130:1: ( ( rule__QName__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:130:1: ( ( rule__QName__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:131:1: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:132:1: ( rule__QName__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:132:2: rule__QName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__0_in_ruleQName214);
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


    // $ANTLR start "entryRuleConstraint"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:146:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:147:1: ( ruleConstraint EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:148:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint243);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint250); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:155:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:159:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:160:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:160:1: ( ( rule__Constraint__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:161:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:162:1: ( rule__Constraint__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:162:2: rule__Constraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0_in_ruleConstraint276);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRadius"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:174:1: entryRuleRadius : ruleRadius EOF ;
    public final void entryRuleRadius() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:175:1: ( ruleRadius EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:176:1: ruleRadius EOF
            {
             before(grammarAccess.getRadiusRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadius_in_entryRuleRadius303);
            ruleRadius();

            state._fsp--;

             after(grammarAccess.getRadiusRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadius310); 

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
    // $ANTLR end "entryRuleRadius"


    // $ANTLR start "ruleRadius"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:183:1: ruleRadius : ( ( rule__Radius__Group__0 ) ) ;
    public final void ruleRadius() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:187:2: ( ( ( rule__Radius__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:188:1: ( ( rule__Radius__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:188:1: ( ( rule__Radius__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:189:1: ( rule__Radius__Group__0 )
            {
             before(grammarAccess.getRadiusAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:190:1: ( rule__Radius__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:190:2: rule__Radius__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__0_in_ruleRadius336);
            rule__Radius__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadiusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRadius"


    // $ANTLR start "entryRuleSlicedClass"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:202:1: entryRuleSlicedClass : ruleSlicedClass EOF ;
    public final void entryRuleSlicedClass() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:203:1: ( ruleSlicedClass EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:204:1: ruleSlicedClass EOF
            {
             before(grammarAccess.getSlicedClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedClass_in_entryRuleSlicedClass363);
            ruleSlicedClass();

            state._fsp--;

             after(grammarAccess.getSlicedClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicedClass370); 

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
    // $ANTLR end "entryRuleSlicedClass"


    // $ANTLR start "ruleSlicedClass"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:211:1: ruleSlicedClass : ( ( rule__SlicedClass__Group__0 ) ) ;
    public final void ruleSlicedClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:215:2: ( ( ( rule__SlicedClass__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:216:1: ( ( rule__SlicedClass__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:216:1: ( ( rule__SlicedClass__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:217:1: ( rule__SlicedClass__Group__0 )
            {
             before(grammarAccess.getSlicedClassAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:218:1: ( rule__SlicedClass__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:218:2: rule__SlicedClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__0_in_ruleSlicedClass396);
            rule__SlicedClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlicedClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlicedClass"


    // $ANTLR start "entryRuleVarDecl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:230:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:231:1: ( ruleVarDecl EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:232:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_entryRuleVarDecl423);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVarDecl430); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:239:1: ruleVarDecl : ( ( rule__VarDecl__VarNameAssignment ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:243:2: ( ( ( rule__VarDecl__VarNameAssignment ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:244:1: ( ( rule__VarDecl__VarNameAssignment ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:244:1: ( ( rule__VarDecl__VarNameAssignment ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:245:1: ( rule__VarDecl__VarNameAssignment )
            {
             before(grammarAccess.getVarDeclAccess().getVarNameAssignment()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:246:1: ( rule__VarDecl__VarNameAssignment )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:246:2: rule__VarDecl__VarNameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VarDecl__VarNameAssignment_in_ruleVarDecl456);
            rule__VarDecl__VarNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getVarNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleSlicedProperty"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:258:1: entryRuleSlicedProperty : ruleSlicedProperty EOF ;
    public final void entryRuleSlicedProperty() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:259:1: ( ruleSlicedProperty EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:260:1: ruleSlicedProperty EOF
            {
             before(grammarAccess.getSlicedPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedProperty_in_entryRuleSlicedProperty483);
            ruleSlicedProperty();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicedProperty490); 

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
    // $ANTLR end "entryRuleSlicedProperty"


    // $ANTLR start "ruleSlicedProperty"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:267:1: ruleSlicedProperty : ( ( rule__SlicedProperty__Group__0 ) ) ;
    public final void ruleSlicedProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:271:2: ( ( ( rule__SlicedProperty__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:272:1: ( ( rule__SlicedProperty__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:272:1: ( ( rule__SlicedProperty__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:273:1: ( rule__SlicedProperty__Group__0 )
            {
             before(grammarAccess.getSlicedPropertyAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:274:1: ( rule__SlicedProperty__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:274:2: rule__SlicedProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__0_in_ruleSlicedProperty516);
            rule__SlicedProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSlicedPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSlicedProperty"


    // $ANTLR start "entryRuleOppositeCreation"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:286:1: entryRuleOppositeCreation : ruleOppositeCreation EOF ;
    public final void entryRuleOppositeCreation() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:287:1: ( ruleOppositeCreation EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:288:1: ruleOppositeCreation EOF
            {
             before(grammarAccess.getOppositeCreationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOppositeCreation_in_entryRuleOppositeCreation543);
            ruleOppositeCreation();

            state._fsp--;

             after(grammarAccess.getOppositeCreationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOppositeCreation550); 

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
    // $ANTLR end "entryRuleOppositeCreation"


    // $ANTLR start "ruleOppositeCreation"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:295:1: ruleOppositeCreation : ( ( rule__OppositeCreation__Group__0 ) ) ;
    public final void ruleOppositeCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:299:2: ( ( ( rule__OppositeCreation__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:300:1: ( ( rule__OppositeCreation__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:300:1: ( ( rule__OppositeCreation__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:301:1: ( rule__OppositeCreation__Group__0 )
            {
             before(grammarAccess.getOppositeCreationAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:302:1: ( rule__OppositeCreation__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:302:2: rule__OppositeCreation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__0_in_ruleOppositeCreation576);
            rule__OppositeCreation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOppositeCreationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOppositeCreation"


    // $ANTLR start "rule__EString__Alternatives"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:314:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:318:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:319:1: ( RULE_STRING )
                    {
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:319:1: ( RULE_STRING )
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:320:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives612); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:325:6: ( RULE_ID )
                    {
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:325:6: ( RULE_ID )
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:326:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives629); 
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


    // $ANTLR start "rule__Slicer__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:339:1: rule__Slicer__Group__0 : rule__Slicer__Group__0__Impl rule__Slicer__Group__1 ;
    public final void rule__Slicer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:343:1: ( rule__Slicer__Group__0__Impl rule__Slicer__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:344:2: rule__Slicer__Group__0__Impl rule__Slicer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__0__Impl_in_rule__Slicer__Group__0660);
            rule__Slicer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__1_in_rule__Slicer__Group__0663);
            rule__Slicer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__0"


    // $ANTLR start "rule__Slicer__Group__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:351:1: rule__Slicer__Group__0__Impl : ( 'slicer' ) ;
    public final void rule__Slicer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:355:1: ( ( 'slicer' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:356:1: ( 'slicer' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:356:1: ( 'slicer' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:357:1: 'slicer'
            {
             before(grammarAccess.getSlicerAccess().getSlicerKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Slicer__Group__0__Impl691); 
             after(grammarAccess.getSlicerAccess().getSlicerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__0__Impl"


    // $ANTLR start "rule__Slicer__Group__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:370:1: rule__Slicer__Group__1 : rule__Slicer__Group__1__Impl rule__Slicer__Group__2 ;
    public final void rule__Slicer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:374:1: ( rule__Slicer__Group__1__Impl rule__Slicer__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:375:2: rule__Slicer__Group__1__Impl rule__Slicer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__1__Impl_in_rule__Slicer__Group__1722);
            rule__Slicer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__2_in_rule__Slicer__Group__1725);
            rule__Slicer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__1"


    // $ANTLR start "rule__Slicer__Group__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:382:1: rule__Slicer__Group__1__Impl : ( ( rule__Slicer__ActiveAssignment_1 )? ) ;
    public final void rule__Slicer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:386:1: ( ( ( rule__Slicer__ActiveAssignment_1 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:387:1: ( ( rule__Slicer__ActiveAssignment_1 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:387:1: ( ( rule__Slicer__ActiveAssignment_1 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:388:1: ( rule__Slicer__ActiveAssignment_1 )?
            {
             before(grammarAccess.getSlicerAccess().getActiveAssignment_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:389:1: ( rule__Slicer__ActiveAssignment_1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:389:2: rule__Slicer__ActiveAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__ActiveAssignment_1_in_rule__Slicer__Group__1__Impl752);
                    rule__Slicer__ActiveAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicerAccess().getActiveAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__1__Impl"


    // $ANTLR start "rule__Slicer__Group__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:399:1: rule__Slicer__Group__2 : rule__Slicer__Group__2__Impl rule__Slicer__Group__3 ;
    public final void rule__Slicer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:403:1: ( rule__Slicer__Group__2__Impl rule__Slicer__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:404:2: rule__Slicer__Group__2__Impl rule__Slicer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__2__Impl_in_rule__Slicer__Group__2783);
            rule__Slicer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__3_in_rule__Slicer__Group__2786);
            rule__Slicer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__2"


    // $ANTLR start "rule__Slicer__Group__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:411:1: rule__Slicer__Group__2__Impl : ( ( rule__Slicer__StrictAssignment_2 )? ) ;
    public final void rule__Slicer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:415:1: ( ( ( rule__Slicer__StrictAssignment_2 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:416:1: ( ( rule__Slicer__StrictAssignment_2 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:416:1: ( ( rule__Slicer__StrictAssignment_2 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:417:1: ( rule__Slicer__StrictAssignment_2 )?
            {
             before(grammarAccess.getSlicerAccess().getStrictAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:418:1: ( rule__Slicer__StrictAssignment_2 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:418:2: rule__Slicer__StrictAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__StrictAssignment_2_in_rule__Slicer__Group__2__Impl813);
                    rule__Slicer__StrictAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicerAccess().getStrictAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__2__Impl"


    // $ANTLR start "rule__Slicer__Group__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:428:1: rule__Slicer__Group__3 : rule__Slicer__Group__3__Impl rule__Slicer__Group__4 ;
    public final void rule__Slicer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:432:1: ( rule__Slicer__Group__3__Impl rule__Slicer__Group__4 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:433:2: rule__Slicer__Group__3__Impl rule__Slicer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__3__Impl_in_rule__Slicer__Group__3844);
            rule__Slicer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__4_in_rule__Slicer__Group__3847);
            rule__Slicer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__3"


    // $ANTLR start "rule__Slicer__Group__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:440:1: rule__Slicer__Group__3__Impl : ( ( rule__Slicer__NameAssignment_3 ) ) ;
    public final void rule__Slicer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:444:1: ( ( ( rule__Slicer__NameAssignment_3 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:445:1: ( ( rule__Slicer__NameAssignment_3 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:445:1: ( ( rule__Slicer__NameAssignment_3 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:446:1: ( rule__Slicer__NameAssignment_3 )
            {
             before(grammarAccess.getSlicerAccess().getNameAssignment_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:447:1: ( rule__Slicer__NameAssignment_3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:447:2: rule__Slicer__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__NameAssignment_3_in_rule__Slicer__Group__3__Impl874);
            rule__Slicer__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__3__Impl"


    // $ANTLR start "rule__Slicer__Group__4"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:457:1: rule__Slicer__Group__4 : rule__Slicer__Group__4__Impl rule__Slicer__Group__5 ;
    public final void rule__Slicer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:461:1: ( rule__Slicer__Group__4__Impl rule__Slicer__Group__5 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:462:2: rule__Slicer__Group__4__Impl rule__Slicer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__4__Impl_in_rule__Slicer__Group__4904);
            rule__Slicer__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__5_in_rule__Slicer__Group__4907);
            rule__Slicer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__4"


    // $ANTLR start "rule__Slicer__Group__4__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:469:1: rule__Slicer__Group__4__Impl : ( '{' ) ;
    public final void rule__Slicer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:473:1: ( ( '{' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:474:1: ( '{' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:474:1: ( '{' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:475:1: '{'
            {
             before(grammarAccess.getSlicerAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Slicer__Group__4__Impl935); 
             after(grammarAccess.getSlicerAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__4__Impl"


    // $ANTLR start "rule__Slicer__Group__5"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:488:1: rule__Slicer__Group__5 : rule__Slicer__Group__5__Impl rule__Slicer__Group__6 ;
    public final void rule__Slicer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:492:1: ( rule__Slicer__Group__5__Impl rule__Slicer__Group__6 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:493:2: rule__Slicer__Group__5__Impl rule__Slicer__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__5__Impl_in_rule__Slicer__Group__5966);
            rule__Slicer__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__6_in_rule__Slicer__Group__5969);
            rule__Slicer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__5"


    // $ANTLR start "rule__Slicer__Group__5__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:500:1: rule__Slicer__Group__5__Impl : ( 'domain' ) ;
    public final void rule__Slicer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:504:1: ( ( 'domain' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:505:1: ( 'domain' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:505:1: ( 'domain' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:506:1: 'domain'
            {
             before(grammarAccess.getSlicerAccess().getDomainKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Slicer__Group__5__Impl997); 
             after(grammarAccess.getSlicerAccess().getDomainKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__5__Impl"


    // $ANTLR start "rule__Slicer__Group__6"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:519:1: rule__Slicer__Group__6 : rule__Slicer__Group__6__Impl rule__Slicer__Group__7 ;
    public final void rule__Slicer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:523:1: ( rule__Slicer__Group__6__Impl rule__Slicer__Group__7 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:524:2: rule__Slicer__Group__6__Impl rule__Slicer__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__6__Impl_in_rule__Slicer__Group__61028);
            rule__Slicer__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__7_in_rule__Slicer__Group__61031);
            rule__Slicer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__6"


    // $ANTLR start "rule__Slicer__Group__6__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:531:1: rule__Slicer__Group__6__Impl : ( ':' ) ;
    public final void rule__Slicer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:535:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:536:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:536:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:537:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group__6__Impl1059); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__6__Impl"


    // $ANTLR start "rule__Slicer__Group__7"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:550:1: rule__Slicer__Group__7 : rule__Slicer__Group__7__Impl rule__Slicer__Group__8 ;
    public final void rule__Slicer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:554:1: ( rule__Slicer__Group__7__Impl rule__Slicer__Group__8 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:555:2: rule__Slicer__Group__7__Impl rule__Slicer__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__7__Impl_in_rule__Slicer__Group__71090);
            rule__Slicer__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__8_in_rule__Slicer__Group__71093);
            rule__Slicer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__7"


    // $ANTLR start "rule__Slicer__Group__7__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:562:1: rule__Slicer__Group__7__Impl : ( ( rule__Slicer__UriMetamodelAssignment_7 ) ) ;
    public final void rule__Slicer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:566:1: ( ( ( rule__Slicer__UriMetamodelAssignment_7 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:567:1: ( ( rule__Slicer__UriMetamodelAssignment_7 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:567:1: ( ( rule__Slicer__UriMetamodelAssignment_7 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:568:1: ( rule__Slicer__UriMetamodelAssignment_7 )
            {
             before(grammarAccess.getSlicerAccess().getUriMetamodelAssignment_7()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:569:1: ( rule__Slicer__UriMetamodelAssignment_7 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:569:2: rule__Slicer__UriMetamodelAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__UriMetamodelAssignment_7_in_rule__Slicer__Group__7__Impl1120);
            rule__Slicer__UriMetamodelAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getUriMetamodelAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__7__Impl"


    // $ANTLR start "rule__Slicer__Group__8"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:579:1: rule__Slicer__Group__8 : rule__Slicer__Group__8__Impl rule__Slicer__Group__9 ;
    public final void rule__Slicer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:583:1: ( rule__Slicer__Group__8__Impl rule__Slicer__Group__9 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:584:2: rule__Slicer__Group__8__Impl rule__Slicer__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__8__Impl_in_rule__Slicer__Group__81150);
            rule__Slicer__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__9_in_rule__Slicer__Group__81153);
            rule__Slicer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__8"


    // $ANTLR start "rule__Slicer__Group__8__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:591:1: rule__Slicer__Group__8__Impl : ( 'input' ) ;
    public final void rule__Slicer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:595:1: ( ( 'input' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:596:1: ( 'input' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:596:1: ( 'input' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:597:1: 'input'
            {
             before(grammarAccess.getSlicerAccess().getInputKeyword_8()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Slicer__Group__8__Impl1181); 
             after(grammarAccess.getSlicerAccess().getInputKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__8__Impl"


    // $ANTLR start "rule__Slicer__Group__9"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:610:1: rule__Slicer__Group__9 : rule__Slicer__Group__9__Impl rule__Slicer__Group__10 ;
    public final void rule__Slicer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:614:1: ( rule__Slicer__Group__9__Impl rule__Slicer__Group__10 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:615:2: rule__Slicer__Group__9__Impl rule__Slicer__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__9__Impl_in_rule__Slicer__Group__91212);
            rule__Slicer__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__10_in_rule__Slicer__Group__91215);
            rule__Slicer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__9"


    // $ANTLR start "rule__Slicer__Group__9__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:622:1: rule__Slicer__Group__9__Impl : ( ':' ) ;
    public final void rule__Slicer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:626:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:627:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:627:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:628:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_9()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group__9__Impl1243); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__9__Impl"


    // $ANTLR start "rule__Slicer__Group__10"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:641:1: rule__Slicer__Group__10 : rule__Slicer__Group__10__Impl rule__Slicer__Group__11 ;
    public final void rule__Slicer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:645:1: ( rule__Slicer__Group__10__Impl rule__Slicer__Group__11 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:646:2: rule__Slicer__Group__10__Impl rule__Slicer__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__10__Impl_in_rule__Slicer__Group__101274);
            rule__Slicer__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__11_in_rule__Slicer__Group__101277);
            rule__Slicer__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__10"


    // $ANTLR start "rule__Slicer__Group__10__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:653:1: rule__Slicer__Group__10__Impl : ( ( rule__Slicer__InputClassesAssignment_10 ) ) ;
    public final void rule__Slicer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:657:1: ( ( ( rule__Slicer__InputClassesAssignment_10 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:658:1: ( ( rule__Slicer__InputClassesAssignment_10 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:658:1: ( ( rule__Slicer__InputClassesAssignment_10 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:659:1: ( rule__Slicer__InputClassesAssignment_10 )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesAssignment_10()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:660:1: ( rule__Slicer__InputClassesAssignment_10 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:660:2: rule__Slicer__InputClassesAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__InputClassesAssignment_10_in_rule__Slicer__Group__10__Impl1304);
            rule__Slicer__InputClassesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getInputClassesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__10__Impl"


    // $ANTLR start "rule__Slicer__Group__11"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:670:1: rule__Slicer__Group__11 : rule__Slicer__Group__11__Impl rule__Slicer__Group__12 ;
    public final void rule__Slicer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:674:1: ( rule__Slicer__Group__11__Impl rule__Slicer__Group__12 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:675:2: rule__Slicer__Group__11__Impl rule__Slicer__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__11__Impl_in_rule__Slicer__Group__111334);
            rule__Slicer__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__12_in_rule__Slicer__Group__111337);
            rule__Slicer__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__11"


    // $ANTLR start "rule__Slicer__Group__11__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:682:1: rule__Slicer__Group__11__Impl : ( ( rule__Slicer__Group_11__0 )* ) ;
    public final void rule__Slicer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:686:1: ( ( ( rule__Slicer__Group_11__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:687:1: ( ( rule__Slicer__Group_11__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:687:1: ( ( rule__Slicer__Group_11__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:688:1: ( rule__Slicer__Group_11__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_11()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:689:1: ( rule__Slicer__Group_11__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:689:2: rule__Slicer__Group_11__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__0_in_rule__Slicer__Group__11__Impl1364);
            	    rule__Slicer__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSlicerAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__11__Impl"


    // $ANTLR start "rule__Slicer__Group__12"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:699:1: rule__Slicer__Group__12 : rule__Slicer__Group__12__Impl rule__Slicer__Group__13 ;
    public final void rule__Slicer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:703:1: ( rule__Slicer__Group__12__Impl rule__Slicer__Group__13 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:704:2: rule__Slicer__Group__12__Impl rule__Slicer__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__12__Impl_in_rule__Slicer__Group__121395);
            rule__Slicer__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__13_in_rule__Slicer__Group__121398);
            rule__Slicer__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__12"


    // $ANTLR start "rule__Slicer__Group__12__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:711:1: rule__Slicer__Group__12__Impl : ( ( rule__Slicer__Group_12__0 )? ) ;
    public final void rule__Slicer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:715:1: ( ( ( rule__Slicer__Group_12__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:716:1: ( ( rule__Slicer__Group_12__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:716:1: ( ( rule__Slicer__Group_12__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:717:1: ( rule__Slicer__Group_12__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_12()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:718:1: ( rule__Slicer__Group_12__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:718:2: rule__Slicer__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__0_in_rule__Slicer__Group__12__Impl1425);
                    rule__Slicer__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicerAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__12__Impl"


    // $ANTLR start "rule__Slicer__Group__13"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:728:1: rule__Slicer__Group__13 : rule__Slicer__Group__13__Impl rule__Slicer__Group__14 ;
    public final void rule__Slicer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:732:1: ( rule__Slicer__Group__13__Impl rule__Slicer__Group__14 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:733:2: rule__Slicer__Group__13__Impl rule__Slicer__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__13__Impl_in_rule__Slicer__Group__131456);
            rule__Slicer__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__14_in_rule__Slicer__Group__131459);
            rule__Slicer__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__13"


    // $ANTLR start "rule__Slicer__Group__13__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:740:1: rule__Slicer__Group__13__Impl : ( ( rule__Slicer__Group_13__0 )* ) ;
    public final void rule__Slicer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:744:1: ( ( ( rule__Slicer__Group_13__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:745:1: ( ( rule__Slicer__Group_13__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:745:1: ( ( rule__Slicer__Group_13__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:746:1: ( rule__Slicer__Group_13__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_13()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:747:1: ( rule__Slicer__Group_13__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:747:2: rule__Slicer__Group_13__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__0_in_rule__Slicer__Group__13__Impl1486);
            	    rule__Slicer__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSlicerAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__13__Impl"


    // $ANTLR start "rule__Slicer__Group__14"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:757:1: rule__Slicer__Group__14 : rule__Slicer__Group__14__Impl rule__Slicer__Group__15 ;
    public final void rule__Slicer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:761:1: ( rule__Slicer__Group__14__Impl rule__Slicer__Group__15 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:762:2: rule__Slicer__Group__14__Impl rule__Slicer__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__14__Impl_in_rule__Slicer__Group__141517);
            rule__Slicer__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__15_in_rule__Slicer__Group__141520);
            rule__Slicer__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__14"


    // $ANTLR start "rule__Slicer__Group__14__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:769:1: rule__Slicer__Group__14__Impl : ( ( rule__Slicer__Group_14__0 )* ) ;
    public final void rule__Slicer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:773:1: ( ( ( rule__Slicer__Group_14__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:774:1: ( ( rule__Slicer__Group_14__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:774:1: ( ( rule__Slicer__Group_14__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:775:1: ( rule__Slicer__Group_14__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_14()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:776:1: ( rule__Slicer__Group_14__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:776:2: rule__Slicer__Group_14__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__0_in_rule__Slicer__Group__14__Impl1547);
            	    rule__Slicer__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSlicerAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__14__Impl"


    // $ANTLR start "rule__Slicer__Group__15"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:786:1: rule__Slicer__Group__15 : rule__Slicer__Group__15__Impl rule__Slicer__Group__16 ;
    public final void rule__Slicer__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:790:1: ( rule__Slicer__Group__15__Impl rule__Slicer__Group__16 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:791:2: rule__Slicer__Group__15__Impl rule__Slicer__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__15__Impl_in_rule__Slicer__Group__151578);
            rule__Slicer__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__16_in_rule__Slicer__Group__151581);
            rule__Slicer__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__15"


    // $ANTLR start "rule__Slicer__Group__15__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:798:1: rule__Slicer__Group__15__Impl : ( ( rule__Slicer__Group_15__0 )* ) ;
    public final void rule__Slicer__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:802:1: ( ( ( rule__Slicer__Group_15__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:803:1: ( ( rule__Slicer__Group_15__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:803:1: ( ( rule__Slicer__Group_15__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:804:1: ( rule__Slicer__Group_15__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_15()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:805:1: ( rule__Slicer__Group_15__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:805:2: rule__Slicer__Group_15__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__0_in_rule__Slicer__Group__15__Impl1608);
            	    rule__Slicer__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSlicerAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__15__Impl"


    // $ANTLR start "rule__Slicer__Group__16"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:815:1: rule__Slicer__Group__16 : rule__Slicer__Group__16__Impl rule__Slicer__Group__17 ;
    public final void rule__Slicer__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:819:1: ( rule__Slicer__Group__16__Impl rule__Slicer__Group__17 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:820:2: rule__Slicer__Group__16__Impl rule__Slicer__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__16__Impl_in_rule__Slicer__Group__161639);
            rule__Slicer__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__17_in_rule__Slicer__Group__161642);
            rule__Slicer__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__16"


    // $ANTLR start "rule__Slicer__Group__16__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:827:1: rule__Slicer__Group__16__Impl : ( ( rule__Slicer__Group_16__0 )? ) ;
    public final void rule__Slicer__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:831:1: ( ( ( rule__Slicer__Group_16__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:832:1: ( ( rule__Slicer__Group_16__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:832:1: ( ( rule__Slicer__Group_16__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:833:1: ( rule__Slicer__Group_16__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_16()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:834:1: ( rule__Slicer__Group_16__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:834:2: rule__Slicer__Group_16__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__0_in_rule__Slicer__Group__16__Impl1669);
                    rule__Slicer__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicerAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__16__Impl"


    // $ANTLR start "rule__Slicer__Group__17"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:844:1: rule__Slicer__Group__17 : rule__Slicer__Group__17__Impl rule__Slicer__Group__18 ;
    public final void rule__Slicer__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:848:1: ( rule__Slicer__Group__17__Impl rule__Slicer__Group__18 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:849:2: rule__Slicer__Group__17__Impl rule__Slicer__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__17__Impl_in_rule__Slicer__Group__171700);
            rule__Slicer__Group__17__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__18_in_rule__Slicer__Group__171703);
            rule__Slicer__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__17"


    // $ANTLR start "rule__Slicer__Group__17__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:856:1: rule__Slicer__Group__17__Impl : ( ( rule__Slicer__Group_17__0 )? ) ;
    public final void rule__Slicer__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:860:1: ( ( ( rule__Slicer__Group_17__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:861:1: ( ( rule__Slicer__Group_17__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:861:1: ( ( rule__Slicer__Group_17__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:862:1: ( rule__Slicer__Group_17__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_17()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:863:1: ( rule__Slicer__Group_17__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:863:2: rule__Slicer__Group_17__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__0_in_rule__Slicer__Group__17__Impl1730);
                    rule__Slicer__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicerAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__17__Impl"


    // $ANTLR start "rule__Slicer__Group__18"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:873:1: rule__Slicer__Group__18 : rule__Slicer__Group__18__Impl rule__Slicer__Group__19 ;
    public final void rule__Slicer__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:877:1: ( rule__Slicer__Group__18__Impl rule__Slicer__Group__19 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:878:2: rule__Slicer__Group__18__Impl rule__Slicer__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__18__Impl_in_rule__Slicer__Group__181761);
            rule__Slicer__Group__18__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__19_in_rule__Slicer__Group__181764);
            rule__Slicer__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__18"


    // $ANTLR start "rule__Slicer__Group__18__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:885:1: rule__Slicer__Group__18__Impl : ( ( rule__Slicer__Group_18__0 )? ) ;
    public final void rule__Slicer__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:889:1: ( ( ( rule__Slicer__Group_18__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:890:1: ( ( rule__Slicer__Group_18__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:890:1: ( ( rule__Slicer__Group_18__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:891:1: ( rule__Slicer__Group_18__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_18()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:892:1: ( rule__Slicer__Group_18__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:892:2: rule__Slicer__Group_18__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__0_in_rule__Slicer__Group__18__Impl1791);
                    rule__Slicer__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicerAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__18__Impl"


    // $ANTLR start "rule__Slicer__Group__19"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:902:1: rule__Slicer__Group__19 : rule__Slicer__Group__19__Impl ;
    public final void rule__Slicer__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:906:1: ( rule__Slicer__Group__19__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:907:2: rule__Slicer__Group__19__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__19__Impl_in_rule__Slicer__Group__191822);
            rule__Slicer__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__19"


    // $ANTLR start "rule__Slicer__Group__19__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:913:1: rule__Slicer__Group__19__Impl : ( '}' ) ;
    public final void rule__Slicer__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:917:1: ( ( '}' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:918:1: ( '}' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:918:1: ( '}' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:919:1: '}'
            {
             before(grammarAccess.getSlicerAccess().getRightCurlyBracketKeyword_19()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Slicer__Group__19__Impl1850); 
             after(grammarAccess.getSlicerAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group__19__Impl"


    // $ANTLR start "rule__Slicer__Group_11__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:972:1: rule__Slicer__Group_11__0 : rule__Slicer__Group_11__0__Impl rule__Slicer__Group_11__1 ;
    public final void rule__Slicer__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:976:1: ( rule__Slicer__Group_11__0__Impl rule__Slicer__Group_11__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:977:2: rule__Slicer__Group_11__0__Impl rule__Slicer__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__0__Impl_in_rule__Slicer__Group_11__01921);
            rule__Slicer__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__1_in_rule__Slicer__Group_11__01924);
            rule__Slicer__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_11__0"


    // $ANTLR start "rule__Slicer__Group_11__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:984:1: rule__Slicer__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Slicer__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:988:1: ( ( ',' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:989:1: ( ',' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:989:1: ( ',' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:990:1: ','
            {
             before(grammarAccess.getSlicerAccess().getCommaKeyword_11_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Slicer__Group_11__0__Impl1952); 
             after(grammarAccess.getSlicerAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_11__0__Impl"


    // $ANTLR start "rule__Slicer__Group_11__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1003:1: rule__Slicer__Group_11__1 : rule__Slicer__Group_11__1__Impl ;
    public final void rule__Slicer__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1007:1: ( rule__Slicer__Group_11__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1008:2: rule__Slicer__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__1__Impl_in_rule__Slicer__Group_11__11983);
            rule__Slicer__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_11__1"


    // $ANTLR start "rule__Slicer__Group_11__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1014:1: rule__Slicer__Group_11__1__Impl : ( ( rule__Slicer__InputClassesAssignment_11_1 ) ) ;
    public final void rule__Slicer__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1018:1: ( ( ( rule__Slicer__InputClassesAssignment_11_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1019:1: ( ( rule__Slicer__InputClassesAssignment_11_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1019:1: ( ( rule__Slicer__InputClassesAssignment_11_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1020:1: ( rule__Slicer__InputClassesAssignment_11_1 )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesAssignment_11_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1021:1: ( rule__Slicer__InputClassesAssignment_11_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1021:2: rule__Slicer__InputClassesAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__InputClassesAssignment_11_1_in_rule__Slicer__Group_11__1__Impl2010);
            rule__Slicer__InputClassesAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getInputClassesAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_11__1__Impl"


    // $ANTLR start "rule__Slicer__Group_12__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1035:1: rule__Slicer__Group_12__0 : rule__Slicer__Group_12__0__Impl rule__Slicer__Group_12__1 ;
    public final void rule__Slicer__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1039:1: ( rule__Slicer__Group_12__0__Impl rule__Slicer__Group_12__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1040:2: rule__Slicer__Group_12__0__Impl rule__Slicer__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__0__Impl_in_rule__Slicer__Group_12__02044);
            rule__Slicer__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__1_in_rule__Slicer__Group_12__02047);
            rule__Slicer__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_12__0"


    // $ANTLR start "rule__Slicer__Group_12__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1047:1: rule__Slicer__Group_12__0__Impl : ( 'radius' ) ;
    public final void rule__Slicer__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1051:1: ( ( 'radius' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1052:1: ( 'radius' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1052:1: ( 'radius' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1053:1: 'radius'
            {
             before(grammarAccess.getSlicerAccess().getRadiusKeyword_12_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Slicer__Group_12__0__Impl2075); 
             after(grammarAccess.getSlicerAccess().getRadiusKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_12__0__Impl"


    // $ANTLR start "rule__Slicer__Group_12__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1066:1: rule__Slicer__Group_12__1 : rule__Slicer__Group_12__1__Impl rule__Slicer__Group_12__2 ;
    public final void rule__Slicer__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1070:1: ( rule__Slicer__Group_12__1__Impl rule__Slicer__Group_12__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1071:2: rule__Slicer__Group_12__1__Impl rule__Slicer__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__1__Impl_in_rule__Slicer__Group_12__12106);
            rule__Slicer__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__2_in_rule__Slicer__Group_12__12109);
            rule__Slicer__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_12__1"


    // $ANTLR start "rule__Slicer__Group_12__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1078:1: rule__Slicer__Group_12__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1082:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1083:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1083:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1084:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_12_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_12__1__Impl2137); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_12__1__Impl"


    // $ANTLR start "rule__Slicer__Group_12__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1097:1: rule__Slicer__Group_12__2 : rule__Slicer__Group_12__2__Impl ;
    public final void rule__Slicer__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1101:1: ( rule__Slicer__Group_12__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1102:2: rule__Slicer__Group_12__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__2__Impl_in_rule__Slicer__Group_12__22168);
            rule__Slicer__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_12__2"


    // $ANTLR start "rule__Slicer__Group_12__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1108:1: rule__Slicer__Group_12__2__Impl : ( ( rule__Slicer__RadiusAssignment_12_2 ) ) ;
    public final void rule__Slicer__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1112:1: ( ( ( rule__Slicer__RadiusAssignment_12_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1113:1: ( ( rule__Slicer__RadiusAssignment_12_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1113:1: ( ( rule__Slicer__RadiusAssignment_12_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1114:1: ( rule__Slicer__RadiusAssignment_12_2 )
            {
             before(grammarAccess.getSlicerAccess().getRadiusAssignment_12_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1115:1: ( rule__Slicer__RadiusAssignment_12_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1115:2: rule__Slicer__RadiusAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__RadiusAssignment_12_2_in_rule__Slicer__Group_12__2__Impl2195);
            rule__Slicer__RadiusAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getRadiusAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_12__2__Impl"


    // $ANTLR start "rule__Slicer__Group_13__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1131:1: rule__Slicer__Group_13__0 : rule__Slicer__Group_13__0__Impl rule__Slicer__Group_13__1 ;
    public final void rule__Slicer__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1135:1: ( rule__Slicer__Group_13__0__Impl rule__Slicer__Group_13__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1136:2: rule__Slicer__Group_13__0__Impl rule__Slicer__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__0__Impl_in_rule__Slicer__Group_13__02231);
            rule__Slicer__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__1_in_rule__Slicer__Group_13__02234);
            rule__Slicer__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_13__0"


    // $ANTLR start "rule__Slicer__Group_13__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1143:1: rule__Slicer__Group_13__0__Impl : ( 'constraint' ) ;
    public final void rule__Slicer__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1147:1: ( ( 'constraint' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1148:1: ( 'constraint' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1148:1: ( 'constraint' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1149:1: 'constraint'
            {
             before(grammarAccess.getSlicerAccess().getConstraintKeyword_13_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Slicer__Group_13__0__Impl2262); 
             after(grammarAccess.getSlicerAccess().getConstraintKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_13__0__Impl"


    // $ANTLR start "rule__Slicer__Group_13__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1162:1: rule__Slicer__Group_13__1 : rule__Slicer__Group_13__1__Impl rule__Slicer__Group_13__2 ;
    public final void rule__Slicer__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1166:1: ( rule__Slicer__Group_13__1__Impl rule__Slicer__Group_13__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1167:2: rule__Slicer__Group_13__1__Impl rule__Slicer__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__1__Impl_in_rule__Slicer__Group_13__12293);
            rule__Slicer__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__2_in_rule__Slicer__Group_13__12296);
            rule__Slicer__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_13__1"


    // $ANTLR start "rule__Slicer__Group_13__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1174:1: rule__Slicer__Group_13__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1178:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1179:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1179:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1180:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_13_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_13__1__Impl2324); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_13__1__Impl"


    // $ANTLR start "rule__Slicer__Group_13__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1193:1: rule__Slicer__Group_13__2 : rule__Slicer__Group_13__2__Impl ;
    public final void rule__Slicer__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1197:1: ( rule__Slicer__Group_13__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1198:2: rule__Slicer__Group_13__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__2__Impl_in_rule__Slicer__Group_13__22355);
            rule__Slicer__Group_13__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_13__2"


    // $ANTLR start "rule__Slicer__Group_13__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1204:1: rule__Slicer__Group_13__2__Impl : ( ( rule__Slicer__ConstraintsAssignment_13_2 ) ) ;
    public final void rule__Slicer__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1208:1: ( ( ( rule__Slicer__ConstraintsAssignment_13_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1209:1: ( ( rule__Slicer__ConstraintsAssignment_13_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1209:1: ( ( rule__Slicer__ConstraintsAssignment_13_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1210:1: ( rule__Slicer__ConstraintsAssignment_13_2 )
            {
             before(grammarAccess.getSlicerAccess().getConstraintsAssignment_13_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1211:1: ( rule__Slicer__ConstraintsAssignment_13_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1211:2: rule__Slicer__ConstraintsAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__ConstraintsAssignment_13_2_in_rule__Slicer__Group_13__2__Impl2382);
            rule__Slicer__ConstraintsAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getConstraintsAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_13__2__Impl"


    // $ANTLR start "rule__Slicer__Group_14__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1227:1: rule__Slicer__Group_14__0 : rule__Slicer__Group_14__0__Impl rule__Slicer__Group_14__1 ;
    public final void rule__Slicer__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1231:1: ( rule__Slicer__Group_14__0__Impl rule__Slicer__Group_14__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1232:2: rule__Slicer__Group_14__0__Impl rule__Slicer__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__0__Impl_in_rule__Slicer__Group_14__02418);
            rule__Slicer__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__1_in_rule__Slicer__Group_14__02421);
            rule__Slicer__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_14__0"


    // $ANTLR start "rule__Slicer__Group_14__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1239:1: rule__Slicer__Group_14__0__Impl : ( 'slicedClass' ) ;
    public final void rule__Slicer__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1243:1: ( ( 'slicedClass' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1244:1: ( 'slicedClass' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1244:1: ( 'slicedClass' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1245:1: 'slicedClass'
            {
             before(grammarAccess.getSlicerAccess().getSlicedClassKeyword_14_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Slicer__Group_14__0__Impl2449); 
             after(grammarAccess.getSlicerAccess().getSlicedClassKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_14__0__Impl"


    // $ANTLR start "rule__Slicer__Group_14__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1258:1: rule__Slicer__Group_14__1 : rule__Slicer__Group_14__1__Impl rule__Slicer__Group_14__2 ;
    public final void rule__Slicer__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1262:1: ( rule__Slicer__Group_14__1__Impl rule__Slicer__Group_14__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1263:2: rule__Slicer__Group_14__1__Impl rule__Slicer__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__1__Impl_in_rule__Slicer__Group_14__12480);
            rule__Slicer__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__2_in_rule__Slicer__Group_14__12483);
            rule__Slicer__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_14__1"


    // $ANTLR start "rule__Slicer__Group_14__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1270:1: rule__Slicer__Group_14__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1274:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1275:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1275:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1276:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_14_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_14__1__Impl2511); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_14__1__Impl"


    // $ANTLR start "rule__Slicer__Group_14__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1289:1: rule__Slicer__Group_14__2 : rule__Slicer__Group_14__2__Impl ;
    public final void rule__Slicer__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1293:1: ( rule__Slicer__Group_14__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1294:2: rule__Slicer__Group_14__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__2__Impl_in_rule__Slicer__Group_14__22542);
            rule__Slicer__Group_14__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_14__2"


    // $ANTLR start "rule__Slicer__Group_14__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1300:1: rule__Slicer__Group_14__2__Impl : ( ( rule__Slicer__SlicedElementsAssignment_14_2 ) ) ;
    public final void rule__Slicer__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1304:1: ( ( ( rule__Slicer__SlicedElementsAssignment_14_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1305:1: ( ( rule__Slicer__SlicedElementsAssignment_14_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1305:1: ( ( rule__Slicer__SlicedElementsAssignment_14_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1306:1: ( rule__Slicer__SlicedElementsAssignment_14_2 )
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_14_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1307:1: ( rule__Slicer__SlicedElementsAssignment_14_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1307:2: rule__Slicer__SlicedElementsAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__SlicedElementsAssignment_14_2_in_rule__Slicer__Group_14__2__Impl2569);
            rule__Slicer__SlicedElementsAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_14__2__Impl"


    // $ANTLR start "rule__Slicer__Group_15__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1323:1: rule__Slicer__Group_15__0 : rule__Slicer__Group_15__0__Impl rule__Slicer__Group_15__1 ;
    public final void rule__Slicer__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1327:1: ( rule__Slicer__Group_15__0__Impl rule__Slicer__Group_15__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1328:2: rule__Slicer__Group_15__0__Impl rule__Slicer__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__0__Impl_in_rule__Slicer__Group_15__02605);
            rule__Slicer__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__1_in_rule__Slicer__Group_15__02608);
            rule__Slicer__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_15__0"


    // $ANTLR start "rule__Slicer__Group_15__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1335:1: rule__Slicer__Group_15__0__Impl : ( 'slicedProperty' ) ;
    public final void rule__Slicer__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1339:1: ( ( 'slicedProperty' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1340:1: ( 'slicedProperty' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1340:1: ( 'slicedProperty' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1341:1: 'slicedProperty'
            {
             before(grammarAccess.getSlicerAccess().getSlicedPropertyKeyword_15_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Slicer__Group_15__0__Impl2636); 
             after(grammarAccess.getSlicerAccess().getSlicedPropertyKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_15__0__Impl"


    // $ANTLR start "rule__Slicer__Group_15__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1354:1: rule__Slicer__Group_15__1 : rule__Slicer__Group_15__1__Impl rule__Slicer__Group_15__2 ;
    public final void rule__Slicer__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1358:1: ( rule__Slicer__Group_15__1__Impl rule__Slicer__Group_15__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1359:2: rule__Slicer__Group_15__1__Impl rule__Slicer__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__1__Impl_in_rule__Slicer__Group_15__12667);
            rule__Slicer__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__2_in_rule__Slicer__Group_15__12670);
            rule__Slicer__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_15__1"


    // $ANTLR start "rule__Slicer__Group_15__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1366:1: rule__Slicer__Group_15__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1370:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1371:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1371:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1372:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_15_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_15__1__Impl2698); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_15__1__Impl"


    // $ANTLR start "rule__Slicer__Group_15__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1385:1: rule__Slicer__Group_15__2 : rule__Slicer__Group_15__2__Impl ;
    public final void rule__Slicer__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1389:1: ( rule__Slicer__Group_15__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1390:2: rule__Slicer__Group_15__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__2__Impl_in_rule__Slicer__Group_15__22729);
            rule__Slicer__Group_15__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_15__2"


    // $ANTLR start "rule__Slicer__Group_15__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1396:1: rule__Slicer__Group_15__2__Impl : ( ( rule__Slicer__SlicedElementsAssignment_15_2 ) ) ;
    public final void rule__Slicer__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1400:1: ( ( ( rule__Slicer__SlicedElementsAssignment_15_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1401:1: ( ( rule__Slicer__SlicedElementsAssignment_15_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1401:1: ( ( rule__Slicer__SlicedElementsAssignment_15_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1402:1: ( rule__Slicer__SlicedElementsAssignment_15_2 )
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_15_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1403:1: ( rule__Slicer__SlicedElementsAssignment_15_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1403:2: rule__Slicer__SlicedElementsAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__SlicedElementsAssignment_15_2_in_rule__Slicer__Group_15__2__Impl2756);
            rule__Slicer__SlicedElementsAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_15__2__Impl"


    // $ANTLR start "rule__Slicer__Group_16__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1419:1: rule__Slicer__Group_16__0 : rule__Slicer__Group_16__0__Impl rule__Slicer__Group_16__1 ;
    public final void rule__Slicer__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1423:1: ( rule__Slicer__Group_16__0__Impl rule__Slicer__Group_16__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1424:2: rule__Slicer__Group_16__0__Impl rule__Slicer__Group_16__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__0__Impl_in_rule__Slicer__Group_16__02792);
            rule__Slicer__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__1_in_rule__Slicer__Group_16__02795);
            rule__Slicer__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_16__0"


    // $ANTLR start "rule__Slicer__Group_16__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1431:1: rule__Slicer__Group_16__0__Impl : ( 'onStart' ) ;
    public final void rule__Slicer__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1435:1: ( ( 'onStart' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1436:1: ( 'onStart' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1436:1: ( 'onStart' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1437:1: 'onStart'
            {
             before(grammarAccess.getSlicerAccess().getOnStartKeyword_16_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Slicer__Group_16__0__Impl2823); 
             after(grammarAccess.getSlicerAccess().getOnStartKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_16__0__Impl"


    // $ANTLR start "rule__Slicer__Group_16__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1450:1: rule__Slicer__Group_16__1 : rule__Slicer__Group_16__1__Impl rule__Slicer__Group_16__2 ;
    public final void rule__Slicer__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1454:1: ( rule__Slicer__Group_16__1__Impl rule__Slicer__Group_16__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1455:2: rule__Slicer__Group_16__1__Impl rule__Slicer__Group_16__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__1__Impl_in_rule__Slicer__Group_16__12854);
            rule__Slicer__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__2_in_rule__Slicer__Group_16__12857);
            rule__Slicer__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_16__1"


    // $ANTLR start "rule__Slicer__Group_16__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1462:1: rule__Slicer__Group_16__1__Impl : ( '[[' ) ;
    public final void rule__Slicer__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1466:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1467:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1467:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1468:1: '[['
            {
             before(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_16_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Slicer__Group_16__1__Impl2885); 
             after(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_16__1__Impl"


    // $ANTLR start "rule__Slicer__Group_16__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1481:1: rule__Slicer__Group_16__2 : rule__Slicer__Group_16__2__Impl rule__Slicer__Group_16__3 ;
    public final void rule__Slicer__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1485:1: ( rule__Slicer__Group_16__2__Impl rule__Slicer__Group_16__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1486:2: rule__Slicer__Group_16__2__Impl rule__Slicer__Group_16__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__2__Impl_in_rule__Slicer__Group_16__22916);
            rule__Slicer__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__3_in_rule__Slicer__Group_16__22919);
            rule__Slicer__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_16__2"


    // $ANTLR start "rule__Slicer__Group_16__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1493:1: rule__Slicer__Group_16__2__Impl : ( ( rule__Slicer__OnStartAssignment_16_2 ) ) ;
    public final void rule__Slicer__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1497:1: ( ( ( rule__Slicer__OnStartAssignment_16_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1498:1: ( ( rule__Slicer__OnStartAssignment_16_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1498:1: ( ( rule__Slicer__OnStartAssignment_16_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1499:1: ( rule__Slicer__OnStartAssignment_16_2 )
            {
             before(grammarAccess.getSlicerAccess().getOnStartAssignment_16_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1500:1: ( rule__Slicer__OnStartAssignment_16_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1500:2: rule__Slicer__OnStartAssignment_16_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__OnStartAssignment_16_2_in_rule__Slicer__Group_16__2__Impl2946);
            rule__Slicer__OnStartAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getOnStartAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_16__2__Impl"


    // $ANTLR start "rule__Slicer__Group_16__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1510:1: rule__Slicer__Group_16__3 : rule__Slicer__Group_16__3__Impl ;
    public final void rule__Slicer__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1514:1: ( rule__Slicer__Group_16__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1515:2: rule__Slicer__Group_16__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__3__Impl_in_rule__Slicer__Group_16__32976);
            rule__Slicer__Group_16__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_16__3"


    // $ANTLR start "rule__Slicer__Group_16__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1521:1: rule__Slicer__Group_16__3__Impl : ( ']]' ) ;
    public final void rule__Slicer__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1525:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1526:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1526:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1527:1: ']]'
            {
             before(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_16_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Slicer__Group_16__3__Impl3004); 
             after(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_16__3__Impl"


    // $ANTLR start "rule__Slicer__Group_17__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1548:1: rule__Slicer__Group_17__0 : rule__Slicer__Group_17__0__Impl rule__Slicer__Group_17__1 ;
    public final void rule__Slicer__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1552:1: ( rule__Slicer__Group_17__0__Impl rule__Slicer__Group_17__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1553:2: rule__Slicer__Group_17__0__Impl rule__Slicer__Group_17__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__0__Impl_in_rule__Slicer__Group_17__03043);
            rule__Slicer__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__1_in_rule__Slicer__Group_17__03046);
            rule__Slicer__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_17__0"


    // $ANTLR start "rule__Slicer__Group_17__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1560:1: rule__Slicer__Group_17__0__Impl : ( 'onEnd' ) ;
    public final void rule__Slicer__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1564:1: ( ( 'onEnd' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1565:1: ( 'onEnd' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1565:1: ( 'onEnd' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1566:1: 'onEnd'
            {
             before(grammarAccess.getSlicerAccess().getOnEndKeyword_17_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Slicer__Group_17__0__Impl3074); 
             after(grammarAccess.getSlicerAccess().getOnEndKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_17__0__Impl"


    // $ANTLR start "rule__Slicer__Group_17__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1579:1: rule__Slicer__Group_17__1 : rule__Slicer__Group_17__1__Impl rule__Slicer__Group_17__2 ;
    public final void rule__Slicer__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1583:1: ( rule__Slicer__Group_17__1__Impl rule__Slicer__Group_17__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1584:2: rule__Slicer__Group_17__1__Impl rule__Slicer__Group_17__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__1__Impl_in_rule__Slicer__Group_17__13105);
            rule__Slicer__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__2_in_rule__Slicer__Group_17__13108);
            rule__Slicer__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_17__1"


    // $ANTLR start "rule__Slicer__Group_17__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1591:1: rule__Slicer__Group_17__1__Impl : ( '[[' ) ;
    public final void rule__Slicer__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1595:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1596:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1596:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1597:1: '[['
            {
             before(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_17_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Slicer__Group_17__1__Impl3136); 
             after(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_17__1__Impl"


    // $ANTLR start "rule__Slicer__Group_17__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1610:1: rule__Slicer__Group_17__2 : rule__Slicer__Group_17__2__Impl rule__Slicer__Group_17__3 ;
    public final void rule__Slicer__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1614:1: ( rule__Slicer__Group_17__2__Impl rule__Slicer__Group_17__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1615:2: rule__Slicer__Group_17__2__Impl rule__Slicer__Group_17__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__2__Impl_in_rule__Slicer__Group_17__23167);
            rule__Slicer__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__3_in_rule__Slicer__Group_17__23170);
            rule__Slicer__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_17__2"


    // $ANTLR start "rule__Slicer__Group_17__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1622:1: rule__Slicer__Group_17__2__Impl : ( ( rule__Slicer__OnEndAssignment_17_2 ) ) ;
    public final void rule__Slicer__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1626:1: ( ( ( rule__Slicer__OnEndAssignment_17_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1627:1: ( ( rule__Slicer__OnEndAssignment_17_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1627:1: ( ( rule__Slicer__OnEndAssignment_17_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1628:1: ( rule__Slicer__OnEndAssignment_17_2 )
            {
             before(grammarAccess.getSlicerAccess().getOnEndAssignment_17_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1629:1: ( rule__Slicer__OnEndAssignment_17_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1629:2: rule__Slicer__OnEndAssignment_17_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__OnEndAssignment_17_2_in_rule__Slicer__Group_17__2__Impl3197);
            rule__Slicer__OnEndAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getOnEndAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_17__2__Impl"


    // $ANTLR start "rule__Slicer__Group_17__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1639:1: rule__Slicer__Group_17__3 : rule__Slicer__Group_17__3__Impl ;
    public final void rule__Slicer__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1643:1: ( rule__Slicer__Group_17__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1644:2: rule__Slicer__Group_17__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__3__Impl_in_rule__Slicer__Group_17__33227);
            rule__Slicer__Group_17__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_17__3"


    // $ANTLR start "rule__Slicer__Group_17__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1650:1: rule__Slicer__Group_17__3__Impl : ( ']]' ) ;
    public final void rule__Slicer__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1654:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1655:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1655:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1656:1: ']]'
            {
             before(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_17_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Slicer__Group_17__3__Impl3255); 
             after(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_17__3__Impl"


    // $ANTLR start "rule__Slicer__Group_18__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1677:1: rule__Slicer__Group_18__0 : rule__Slicer__Group_18__0__Impl rule__Slicer__Group_18__1 ;
    public final void rule__Slicer__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1681:1: ( rule__Slicer__Group_18__0__Impl rule__Slicer__Group_18__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1682:2: rule__Slicer__Group_18__0__Impl rule__Slicer__Group_18__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__0__Impl_in_rule__Slicer__Group_18__03294);
            rule__Slicer__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__1_in_rule__Slicer__Group_18__03297);
            rule__Slicer__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_18__0"


    // $ANTLR start "rule__Slicer__Group_18__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1689:1: rule__Slicer__Group_18__0__Impl : ( 'helper' ) ;
    public final void rule__Slicer__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1693:1: ( ( 'helper' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1694:1: ( 'helper' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1694:1: ( 'helper' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1695:1: 'helper'
            {
             before(grammarAccess.getSlicerAccess().getHelperKeyword_18_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Slicer__Group_18__0__Impl3325); 
             after(grammarAccess.getSlicerAccess().getHelperKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_18__0__Impl"


    // $ANTLR start "rule__Slicer__Group_18__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1708:1: rule__Slicer__Group_18__1 : rule__Slicer__Group_18__1__Impl rule__Slicer__Group_18__2 ;
    public final void rule__Slicer__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1712:1: ( rule__Slicer__Group_18__1__Impl rule__Slicer__Group_18__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1713:2: rule__Slicer__Group_18__1__Impl rule__Slicer__Group_18__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__1__Impl_in_rule__Slicer__Group_18__13356);
            rule__Slicer__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__2_in_rule__Slicer__Group_18__13359);
            rule__Slicer__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_18__1"


    // $ANTLR start "rule__Slicer__Group_18__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1720:1: rule__Slicer__Group_18__1__Impl : ( '[[' ) ;
    public final void rule__Slicer__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1724:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1725:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1725:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1726:1: '[['
            {
             before(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_18_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Slicer__Group_18__1__Impl3387); 
             after(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_18__1__Impl"


    // $ANTLR start "rule__Slicer__Group_18__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1739:1: rule__Slicer__Group_18__2 : rule__Slicer__Group_18__2__Impl rule__Slicer__Group_18__3 ;
    public final void rule__Slicer__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1743:1: ( rule__Slicer__Group_18__2__Impl rule__Slicer__Group_18__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1744:2: rule__Slicer__Group_18__2__Impl rule__Slicer__Group_18__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__2__Impl_in_rule__Slicer__Group_18__23418);
            rule__Slicer__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__3_in_rule__Slicer__Group_18__23421);
            rule__Slicer__Group_18__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_18__2"


    // $ANTLR start "rule__Slicer__Group_18__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1751:1: rule__Slicer__Group_18__2__Impl : ( ( rule__Slicer__HelperAssignment_18_2 ) ) ;
    public final void rule__Slicer__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1755:1: ( ( ( rule__Slicer__HelperAssignment_18_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1756:1: ( ( rule__Slicer__HelperAssignment_18_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1756:1: ( ( rule__Slicer__HelperAssignment_18_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1757:1: ( rule__Slicer__HelperAssignment_18_2 )
            {
             before(grammarAccess.getSlicerAccess().getHelperAssignment_18_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1758:1: ( rule__Slicer__HelperAssignment_18_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1758:2: rule__Slicer__HelperAssignment_18_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__HelperAssignment_18_2_in_rule__Slicer__Group_18__2__Impl3448);
            rule__Slicer__HelperAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getHelperAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_18__2__Impl"


    // $ANTLR start "rule__Slicer__Group_18__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1768:1: rule__Slicer__Group_18__3 : rule__Slicer__Group_18__3__Impl ;
    public final void rule__Slicer__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1772:1: ( rule__Slicer__Group_18__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1773:2: rule__Slicer__Group_18__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__3__Impl_in_rule__Slicer__Group_18__33478);
            rule__Slicer__Group_18__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_18__3"


    // $ANTLR start "rule__Slicer__Group_18__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1779:1: rule__Slicer__Group_18__3__Impl : ( ']]' ) ;
    public final void rule__Slicer__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1783:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1784:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1784:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1785:1: ']]'
            {
             before(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_18_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Slicer__Group_18__3__Impl3506); 
             after(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_18_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_18__3__Impl"


    // $ANTLR start "rule__QName__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1806:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1810:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1811:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__03545);
            rule__QName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__1_in_rule__QName__Group__03548);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1818:1: rule__QName__Group__0__Impl : ( ruleEString ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1822:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1823:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1823:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1824:1: ruleEString
            {
             before(grammarAccess.getQNameAccess().getEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QName__Group__0__Impl3575);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQNameAccess().getEStringParserRuleCall_0()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1835:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1839:1: ( rule__QName__Group__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1840:2: rule__QName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__13604);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1846:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1850:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1851:1: ( ( rule__QName__Group_1__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1851:1: ( ( rule__QName__Group_1__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1852:1: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1853:1: ( rule__QName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1853:2: rule__QName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl3631);
            	    rule__QName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1867:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1871:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1872:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__03666);
            rule__QName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__03669);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1879:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1883:1: ( ( '.' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1884:1: ( '.' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1884:1: ( '.' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1885:1: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__QName__Group_1__0__Impl3697); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1898:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1902:1: ( rule__QName__Group_1__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1903:2: rule__QName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__13728);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1909:1: rule__QName__Group_1__1__Impl : ( ruleEString ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1913:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1914:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1914:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1915:1: ruleEString
            {
             before(grammarAccess.getQNameAccess().getEStringParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QName__Group_1__1__Impl3755);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQNameAccess().getEStringParserRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Constraint__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1930:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1934:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1935:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03788);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03791);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1942:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1946:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1947:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1947:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1948:1: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1949:1: ( rule__Constraint__NameAssignment_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1949:2: rule__Constraint__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__NameAssignment_0_in_rule__Constraint__Group__0__Impl3818);
            rule__Constraint__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1959:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1963:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1964:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13848);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13851);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1971:1: rule__Constraint__Group__1__Impl : ( '[[' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1975:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1976:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1976:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1977:1: '[['
            {
             before(grammarAccess.getConstraintAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Constraint__Group__1__Impl3879); 
             after(grammarAccess.getConstraintAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1990:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1994:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1995:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23910);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23913);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2002:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpressionAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2006:1: ( ( ( rule__Constraint__ExpressionAssignment_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2007:1: ( ( rule__Constraint__ExpressionAssignment_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2007:1: ( ( rule__Constraint__ExpressionAssignment_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2008:1: ( rule__Constraint__ExpressionAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpressionAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2009:1: ( rule__Constraint__ExpressionAssignment_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2009:2: rule__Constraint__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__ExpressionAssignment_2_in_rule__Constraint__Group__2__Impl3940);
            rule__Constraint__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2019:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2023:1: ( rule__Constraint__Group__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2024:2: rule__Constraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33970);
            rule__Constraint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2030:1: rule__Constraint__Group__3__Impl : ( ']]' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2034:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2035:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2035:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2036:1: ']]'
            {
             before(grammarAccess.getConstraintAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Constraint__Group__3__Impl3998); 
             after(grammarAccess.getConstraintAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Radius__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2057:1: rule__Radius__Group__0 : rule__Radius__Group__0__Impl rule__Radius__Group__1 ;
    public final void rule__Radius__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2061:1: ( rule__Radius__Group__0__Impl rule__Radius__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2062:2: rule__Radius__Group__0__Impl rule__Radius__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__0__Impl_in_rule__Radius__Group__04037);
            rule__Radius__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__1_in_rule__Radius__Group__04040);
            rule__Radius__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group__0"


    // $ANTLR start "rule__Radius__Group__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2069:1: rule__Radius__Group__0__Impl : ( () ) ;
    public final void rule__Radius__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2073:1: ( ( () ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2074:1: ( () )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2074:1: ( () )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2075:1: ()
            {
             before(grammarAccess.getRadiusAccess().getRadiusAction_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2076:1: ()
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2078:1: 
            {
            }

             after(grammarAccess.getRadiusAccess().getRadiusAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group__0__Impl"


    // $ANTLR start "rule__Radius__Group__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2088:1: rule__Radius__Group__1 : rule__Radius__Group__1__Impl ;
    public final void rule__Radius__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2092:1: ( rule__Radius__Group__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2093:2: rule__Radius__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__1__Impl_in_rule__Radius__Group__14098);
            rule__Radius__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group__1"


    // $ANTLR start "rule__Radius__Group__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2099:1: rule__Radius__Group__1__Impl : ( ( rule__Radius__Group_1__0 )? ) ;
    public final void rule__Radius__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2103:1: ( ( ( rule__Radius__Group_1__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2104:1: ( ( rule__Radius__Group_1__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2104:1: ( ( rule__Radius__Group_1__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2105:1: ( rule__Radius__Group_1__0 )?
            {
             before(grammarAccess.getRadiusAccess().getGroup_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2106:1: ( rule__Radius__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2106:2: rule__Radius__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__0_in_rule__Radius__Group__1__Impl4125);
                    rule__Radius__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadiusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group__1__Impl"


    // $ANTLR start "rule__Radius__Group_1__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2120:1: rule__Radius__Group_1__0 : rule__Radius__Group_1__0__Impl rule__Radius__Group_1__1 ;
    public final void rule__Radius__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2124:1: ( rule__Radius__Group_1__0__Impl rule__Radius__Group_1__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2125:2: rule__Radius__Group_1__0__Impl rule__Radius__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__0__Impl_in_rule__Radius__Group_1__04160);
            rule__Radius__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__1_in_rule__Radius__Group_1__04163);
            rule__Radius__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group_1__0"


    // $ANTLR start "rule__Radius__Group_1__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2132:1: rule__Radius__Group_1__0__Impl : ( ( rule__Radius__FocusedClassesAssignment_1_0 ) ) ;
    public final void rule__Radius__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2136:1: ( ( ( rule__Radius__FocusedClassesAssignment_1_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2137:1: ( ( rule__Radius__FocusedClassesAssignment_1_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2137:1: ( ( rule__Radius__FocusedClassesAssignment_1_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2138:1: ( rule__Radius__FocusedClassesAssignment_1_0 )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesAssignment_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2139:1: ( rule__Radius__FocusedClassesAssignment_1_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2139:2: rule__Radius__FocusedClassesAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__FocusedClassesAssignment_1_0_in_rule__Radius__Group_1__0__Impl4190);
            rule__Radius__FocusedClassesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRadiusAccess().getFocusedClassesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group_1__0__Impl"


    // $ANTLR start "rule__Radius__Group_1__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2149:1: rule__Radius__Group_1__1 : rule__Radius__Group_1__1__Impl ;
    public final void rule__Radius__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2153:1: ( rule__Radius__Group_1__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2154:2: rule__Radius__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__1__Impl_in_rule__Radius__Group_1__14220);
            rule__Radius__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group_1__1"


    // $ANTLR start "rule__Radius__Group_1__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2160:1: rule__Radius__Group_1__1__Impl : ( ( rule__Radius__Group_1_1__0 )* ) ;
    public final void rule__Radius__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2164:1: ( ( ( rule__Radius__Group_1_1__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2165:1: ( ( rule__Radius__Group_1_1__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2165:1: ( ( rule__Radius__Group_1_1__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2166:1: ( rule__Radius__Group_1_1__0 )*
            {
             before(grammarAccess.getRadiusAccess().getGroup_1_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2167:1: ( rule__Radius__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2167:2: rule__Radius__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__0_in_rule__Radius__Group_1__1__Impl4247);
            	    rule__Radius__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRadiusAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group_1__1__Impl"


    // $ANTLR start "rule__Radius__Group_1_1__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2181:1: rule__Radius__Group_1_1__0 : rule__Radius__Group_1_1__0__Impl rule__Radius__Group_1_1__1 ;
    public final void rule__Radius__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2185:1: ( rule__Radius__Group_1_1__0__Impl rule__Radius__Group_1_1__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2186:2: rule__Radius__Group_1_1__0__Impl rule__Radius__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__0__Impl_in_rule__Radius__Group_1_1__04282);
            rule__Radius__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__1_in_rule__Radius__Group_1_1__04285);
            rule__Radius__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group_1_1__0"


    // $ANTLR start "rule__Radius__Group_1_1__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2193:1: rule__Radius__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Radius__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2197:1: ( ( ',' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2198:1: ( ',' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2198:1: ( ',' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2199:1: ','
            {
             before(grammarAccess.getRadiusAccess().getCommaKeyword_1_1_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Radius__Group_1_1__0__Impl4313); 
             after(grammarAccess.getRadiusAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group_1_1__0__Impl"


    // $ANTLR start "rule__Radius__Group_1_1__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2212:1: rule__Radius__Group_1_1__1 : rule__Radius__Group_1_1__1__Impl ;
    public final void rule__Radius__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2216:1: ( rule__Radius__Group_1_1__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2217:2: rule__Radius__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__1__Impl_in_rule__Radius__Group_1_1__14344);
            rule__Radius__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group_1_1__1"


    // $ANTLR start "rule__Radius__Group_1_1__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2223:1: rule__Radius__Group_1_1__1__Impl : ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) ) ;
    public final void rule__Radius__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2227:1: ( ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2228:1: ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2228:1: ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2229:1: ( rule__Radius__FocusedClassesAssignment_1_1_1 )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesAssignment_1_1_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2230:1: ( rule__Radius__FocusedClassesAssignment_1_1_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2230:2: rule__Radius__FocusedClassesAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__FocusedClassesAssignment_1_1_1_in_rule__Radius__Group_1_1__1__Impl4371);
            rule__Radius__FocusedClassesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRadiusAccess().getFocusedClassesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__Group_1_1__1__Impl"


    // $ANTLR start "rule__SlicedClass__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2244:1: rule__SlicedClass__Group__0 : rule__SlicedClass__Group__0__Impl rule__SlicedClass__Group__1 ;
    public final void rule__SlicedClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2248:1: ( rule__SlicedClass__Group__0__Impl rule__SlicedClass__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2249:2: rule__SlicedClass__Group__0__Impl rule__SlicedClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__0__Impl_in_rule__SlicedClass__Group__04405);
            rule__SlicedClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__1_in_rule__SlicedClass__Group__04408);
            rule__SlicedClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__0"


    // $ANTLR start "rule__SlicedClass__Group__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2256:1: rule__SlicedClass__Group__0__Impl : ( ( rule__SlicedClass__DomainAssignment_0 ) ) ;
    public final void rule__SlicedClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2260:1: ( ( ( rule__SlicedClass__DomainAssignment_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2261:1: ( ( rule__SlicedClass__DomainAssignment_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2261:1: ( ( rule__SlicedClass__DomainAssignment_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2262:1: ( rule__SlicedClass__DomainAssignment_0 )
            {
             before(grammarAccess.getSlicedClassAccess().getDomainAssignment_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2263:1: ( rule__SlicedClass__DomainAssignment_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2263:2: rule__SlicedClass__DomainAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__DomainAssignment_0_in_rule__SlicedClass__Group__0__Impl4435);
            rule__SlicedClass__DomainAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSlicedClassAccess().getDomainAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__0__Impl"


    // $ANTLR start "rule__SlicedClass__Group__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2273:1: rule__SlicedClass__Group__1 : rule__SlicedClass__Group__1__Impl rule__SlicedClass__Group__2 ;
    public final void rule__SlicedClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2277:1: ( rule__SlicedClass__Group__1__Impl rule__SlicedClass__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2278:2: rule__SlicedClass__Group__1__Impl rule__SlicedClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__1__Impl_in_rule__SlicedClass__Group__14465);
            rule__SlicedClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__2_in_rule__SlicedClass__Group__14468);
            rule__SlicedClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__1"


    // $ANTLR start "rule__SlicedClass__Group__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2285:1: rule__SlicedClass__Group__1__Impl : ( ( rule__SlicedClass__IsOptionAssignment_1 )? ) ;
    public final void rule__SlicedClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2289:1: ( ( ( rule__SlicedClass__IsOptionAssignment_1 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2290:1: ( ( rule__SlicedClass__IsOptionAssignment_1 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2290:1: ( ( rule__SlicedClass__IsOptionAssignment_1 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2291:1: ( rule__SlicedClass__IsOptionAssignment_1 )?
            {
             before(grammarAccess.getSlicedClassAccess().getIsOptionAssignment_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2292:1: ( rule__SlicedClass__IsOptionAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2292:2: rule__SlicedClass__IsOptionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__IsOptionAssignment_1_in_rule__SlicedClass__Group__1__Impl4495);
                    rule__SlicedClass__IsOptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedClassAccess().getIsOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__1__Impl"


    // $ANTLR start "rule__SlicedClass__Group__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2302:1: rule__SlicedClass__Group__2 : rule__SlicedClass__Group__2__Impl rule__SlicedClass__Group__3 ;
    public final void rule__SlicedClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2306:1: ( rule__SlicedClass__Group__2__Impl rule__SlicedClass__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2307:2: rule__SlicedClass__Group__2__Impl rule__SlicedClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__2__Impl_in_rule__SlicedClass__Group__24526);
            rule__SlicedClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__3_in_rule__SlicedClass__Group__24529);
            rule__SlicedClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__2"


    // $ANTLR start "rule__SlicedClass__Group__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2314:1: rule__SlicedClass__Group__2__Impl : ( ( rule__SlicedClass__CtxAssignment_2 )? ) ;
    public final void rule__SlicedClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2318:1: ( ( ( rule__SlicedClass__CtxAssignment_2 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2319:1: ( ( rule__SlicedClass__CtxAssignment_2 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2319:1: ( ( rule__SlicedClass__CtxAssignment_2 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2320:1: ( rule__SlicedClass__CtxAssignment_2 )?
            {
             before(grammarAccess.getSlicedClassAccess().getCtxAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2321:1: ( rule__SlicedClass__CtxAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2321:2: rule__SlicedClass__CtxAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__CtxAssignment_2_in_rule__SlicedClass__Group__2__Impl4556);
                    rule__SlicedClass__CtxAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedClassAccess().getCtxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__2__Impl"


    // $ANTLR start "rule__SlicedClass__Group__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2331:1: rule__SlicedClass__Group__3 : rule__SlicedClass__Group__3__Impl ;
    public final void rule__SlicedClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2335:1: ( rule__SlicedClass__Group__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2336:2: rule__SlicedClass__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__3__Impl_in_rule__SlicedClass__Group__34587);
            rule__SlicedClass__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__3"


    // $ANTLR start "rule__SlicedClass__Group__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2342:1: rule__SlicedClass__Group__3__Impl : ( ( rule__SlicedClass__Group_3__0 )? ) ;
    public final void rule__SlicedClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2346:1: ( ( ( rule__SlicedClass__Group_3__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2347:1: ( ( rule__SlicedClass__Group_3__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2347:1: ( ( rule__SlicedClass__Group_3__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2348:1: ( rule__SlicedClass__Group_3__0 )?
            {
             before(grammarAccess.getSlicedClassAccess().getGroup_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2349:1: ( rule__SlicedClass__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2349:2: rule__SlicedClass__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__0_in_rule__SlicedClass__Group__3__Impl4614);
                    rule__SlicedClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__3__Impl"


    // $ANTLR start "rule__SlicedClass__Group_3__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2367:1: rule__SlicedClass__Group_3__0 : rule__SlicedClass__Group_3__0__Impl rule__SlicedClass__Group_3__1 ;
    public final void rule__SlicedClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2371:1: ( rule__SlicedClass__Group_3__0__Impl rule__SlicedClass__Group_3__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2372:2: rule__SlicedClass__Group_3__0__Impl rule__SlicedClass__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__0__Impl_in_rule__SlicedClass__Group_3__04653);
            rule__SlicedClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__1_in_rule__SlicedClass__Group_3__04656);
            rule__SlicedClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_3__0"


    // $ANTLR start "rule__SlicedClass__Group_3__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2379:1: rule__SlicedClass__Group_3__0__Impl : ( '[[' ) ;
    public final void rule__SlicedClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2383:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2384:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2384:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2385:1: '[['
            {
             before(grammarAccess.getSlicedClassAccess().getLeftSquareBracketLeftSquareBracketKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SlicedClass__Group_3__0__Impl4684); 
             after(grammarAccess.getSlicedClassAccess().getLeftSquareBracketLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_3__0__Impl"


    // $ANTLR start "rule__SlicedClass__Group_3__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2398:1: rule__SlicedClass__Group_3__1 : rule__SlicedClass__Group_3__1__Impl rule__SlicedClass__Group_3__2 ;
    public final void rule__SlicedClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2402:1: ( rule__SlicedClass__Group_3__1__Impl rule__SlicedClass__Group_3__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2403:2: rule__SlicedClass__Group_3__1__Impl rule__SlicedClass__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__1__Impl_in_rule__SlicedClass__Group_3__14715);
            rule__SlicedClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__2_in_rule__SlicedClass__Group_3__14718);
            rule__SlicedClass__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_3__1"


    // $ANTLR start "rule__SlicedClass__Group_3__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2410:1: rule__SlicedClass__Group_3__1__Impl : ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) ) ;
    public final void rule__SlicedClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2414:1: ( ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2415:1: ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2415:1: ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2416:1: ( rule__SlicedClass__ExpressionAssignment_3_1 )
            {
             before(grammarAccess.getSlicedClassAccess().getExpressionAssignment_3_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2417:1: ( rule__SlicedClass__ExpressionAssignment_3_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2417:2: rule__SlicedClass__ExpressionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__ExpressionAssignment_3_1_in_rule__SlicedClass__Group_3__1__Impl4745);
            rule__SlicedClass__ExpressionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSlicedClassAccess().getExpressionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_3__1__Impl"


    // $ANTLR start "rule__SlicedClass__Group_3__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2427:1: rule__SlicedClass__Group_3__2 : rule__SlicedClass__Group_3__2__Impl ;
    public final void rule__SlicedClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2431:1: ( rule__SlicedClass__Group_3__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2432:2: rule__SlicedClass__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__2__Impl_in_rule__SlicedClass__Group_3__24775);
            rule__SlicedClass__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_3__2"


    // $ANTLR start "rule__SlicedClass__Group_3__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2438:1: rule__SlicedClass__Group_3__2__Impl : ( ']]' ) ;
    public final void rule__SlicedClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2442:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2443:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2443:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2444:1: ']]'
            {
             before(grammarAccess.getSlicedClassAccess().getRightSquareBracketRightSquareBracketKeyword_3_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SlicedClass__Group_3__2__Impl4803); 
             after(grammarAccess.getSlicedClassAccess().getRightSquareBracketRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_3__2__Impl"


    // $ANTLR start "rule__SlicedProperty__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2463:1: rule__SlicedProperty__Group__0 : rule__SlicedProperty__Group__0__Impl rule__SlicedProperty__Group__1 ;
    public final void rule__SlicedProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2467:1: ( rule__SlicedProperty__Group__0__Impl rule__SlicedProperty__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2468:2: rule__SlicedProperty__Group__0__Impl rule__SlicedProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__0__Impl_in_rule__SlicedProperty__Group__04840);
            rule__SlicedProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__1_in_rule__SlicedProperty__Group__04843);
            rule__SlicedProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__0"


    // $ANTLR start "rule__SlicedProperty__Group__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2475:1: rule__SlicedProperty__Group__0__Impl : ( ( rule__SlicedProperty__DomainAssignment_0 ) ) ;
    public final void rule__SlicedProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2479:1: ( ( ( rule__SlicedProperty__DomainAssignment_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2480:1: ( ( rule__SlicedProperty__DomainAssignment_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2480:1: ( ( rule__SlicedProperty__DomainAssignment_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2481:1: ( rule__SlicedProperty__DomainAssignment_0 )
            {
             before(grammarAccess.getSlicedPropertyAccess().getDomainAssignment_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2482:1: ( rule__SlicedProperty__DomainAssignment_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2482:2: rule__SlicedProperty__DomainAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__DomainAssignment_0_in_rule__SlicedProperty__Group__0__Impl4870);
            rule__SlicedProperty__DomainAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSlicedPropertyAccess().getDomainAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__0__Impl"


    // $ANTLR start "rule__SlicedProperty__Group__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2492:1: rule__SlicedProperty__Group__1 : rule__SlicedProperty__Group__1__Impl rule__SlicedProperty__Group__2 ;
    public final void rule__SlicedProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2496:1: ( rule__SlicedProperty__Group__1__Impl rule__SlicedProperty__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2497:2: rule__SlicedProperty__Group__1__Impl rule__SlicedProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__1__Impl_in_rule__SlicedProperty__Group__14900);
            rule__SlicedProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__2_in_rule__SlicedProperty__Group__14903);
            rule__SlicedProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__1"


    // $ANTLR start "rule__SlicedProperty__Group__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2504:1: rule__SlicedProperty__Group__1__Impl : ( ( rule__SlicedProperty__IsOptionAssignment_1 )? ) ;
    public final void rule__SlicedProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2508:1: ( ( ( rule__SlicedProperty__IsOptionAssignment_1 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2509:1: ( ( rule__SlicedProperty__IsOptionAssignment_1 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2509:1: ( ( rule__SlicedProperty__IsOptionAssignment_1 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2510:1: ( rule__SlicedProperty__IsOptionAssignment_1 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getIsOptionAssignment_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2511:1: ( rule__SlicedProperty__IsOptionAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2511:2: rule__SlicedProperty__IsOptionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__IsOptionAssignment_1_in_rule__SlicedProperty__Group__1__Impl4930);
                    rule__SlicedProperty__IsOptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedPropertyAccess().getIsOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__1__Impl"


    // $ANTLR start "rule__SlicedProperty__Group__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2521:1: rule__SlicedProperty__Group__2 : rule__SlicedProperty__Group__2__Impl rule__SlicedProperty__Group__3 ;
    public final void rule__SlicedProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2525:1: ( rule__SlicedProperty__Group__2__Impl rule__SlicedProperty__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2526:2: rule__SlicedProperty__Group__2__Impl rule__SlicedProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__2__Impl_in_rule__SlicedProperty__Group__24961);
            rule__SlicedProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__3_in_rule__SlicedProperty__Group__24964);
            rule__SlicedProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__2"


    // $ANTLR start "rule__SlicedProperty__Group__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2533:1: rule__SlicedProperty__Group__2__Impl : ( ( rule__SlicedProperty__SrcAssignment_2 )? ) ;
    public final void rule__SlicedProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2537:1: ( ( ( rule__SlicedProperty__SrcAssignment_2 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2538:1: ( ( rule__SlicedProperty__SrcAssignment_2 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2538:1: ( ( rule__SlicedProperty__SrcAssignment_2 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2539:1: ( rule__SlicedProperty__SrcAssignment_2 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getSrcAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2540:1: ( rule__SlicedProperty__SrcAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2540:2: rule__SlicedProperty__SrcAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__SrcAssignment_2_in_rule__SlicedProperty__Group__2__Impl4991);
                    rule__SlicedProperty__SrcAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedPropertyAccess().getSrcAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__2__Impl"


    // $ANTLR start "rule__SlicedProperty__Group__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2550:1: rule__SlicedProperty__Group__3 : rule__SlicedProperty__Group__3__Impl rule__SlicedProperty__Group__4 ;
    public final void rule__SlicedProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2554:1: ( rule__SlicedProperty__Group__3__Impl rule__SlicedProperty__Group__4 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2555:2: rule__SlicedProperty__Group__3__Impl rule__SlicedProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__3__Impl_in_rule__SlicedProperty__Group__35022);
            rule__SlicedProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__4_in_rule__SlicedProperty__Group__35025);
            rule__SlicedProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__3"


    // $ANTLR start "rule__SlicedProperty__Group__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2562:1: rule__SlicedProperty__Group__3__Impl : ( ( rule__SlicedProperty__TgtAssignment_3 )? ) ;
    public final void rule__SlicedProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2566:1: ( ( ( rule__SlicedProperty__TgtAssignment_3 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2567:1: ( ( rule__SlicedProperty__TgtAssignment_3 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2567:1: ( ( rule__SlicedProperty__TgtAssignment_3 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2568:1: ( rule__SlicedProperty__TgtAssignment_3 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getTgtAssignment_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2569:1: ( rule__SlicedProperty__TgtAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2569:2: rule__SlicedProperty__TgtAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__TgtAssignment_3_in_rule__SlicedProperty__Group__3__Impl5052);
                    rule__SlicedProperty__TgtAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedPropertyAccess().getTgtAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__3__Impl"


    // $ANTLR start "rule__SlicedProperty__Group__4"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2579:1: rule__SlicedProperty__Group__4 : rule__SlicedProperty__Group__4__Impl rule__SlicedProperty__Group__5 ;
    public final void rule__SlicedProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2583:1: ( rule__SlicedProperty__Group__4__Impl rule__SlicedProperty__Group__5 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2584:2: rule__SlicedProperty__Group__4__Impl rule__SlicedProperty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__4__Impl_in_rule__SlicedProperty__Group__45083);
            rule__SlicedProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__5_in_rule__SlicedProperty__Group__45086);
            rule__SlicedProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__4"


    // $ANTLR start "rule__SlicedProperty__Group__4__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2591:1: rule__SlicedProperty__Group__4__Impl : ( ( rule__SlicedProperty__OppositeAssignment_4 )? ) ;
    public final void rule__SlicedProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2595:1: ( ( ( rule__SlicedProperty__OppositeAssignment_4 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2596:1: ( ( rule__SlicedProperty__OppositeAssignment_4 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2596:1: ( ( rule__SlicedProperty__OppositeAssignment_4 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2597:1: ( rule__SlicedProperty__OppositeAssignment_4 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getOppositeAssignment_4()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2598:1: ( rule__SlicedProperty__OppositeAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2598:2: rule__SlicedProperty__OppositeAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__OppositeAssignment_4_in_rule__SlicedProperty__Group__4__Impl5113);
                    rule__SlicedProperty__OppositeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedPropertyAccess().getOppositeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__4__Impl"


    // $ANTLR start "rule__SlicedProperty__Group__5"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2608:1: rule__SlicedProperty__Group__5 : rule__SlicedProperty__Group__5__Impl ;
    public final void rule__SlicedProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2612:1: ( rule__SlicedProperty__Group__5__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2613:2: rule__SlicedProperty__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__5__Impl_in_rule__SlicedProperty__Group__55144);
            rule__SlicedProperty__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__5"


    // $ANTLR start "rule__SlicedProperty__Group__5__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2619:1: rule__SlicedProperty__Group__5__Impl : ( ( rule__SlicedProperty__Group_5__0 )? ) ;
    public final void rule__SlicedProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2623:1: ( ( ( rule__SlicedProperty__Group_5__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2624:1: ( ( rule__SlicedProperty__Group_5__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2624:1: ( ( rule__SlicedProperty__Group_5__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2625:1: ( rule__SlicedProperty__Group_5__0 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getGroup_5()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2626:1: ( rule__SlicedProperty__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2626:2: rule__SlicedProperty__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__0_in_rule__SlicedProperty__Group__5__Impl5171);
                    rule__SlicedProperty__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__5__Impl"


    // $ANTLR start "rule__SlicedProperty__Group_5__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2648:1: rule__SlicedProperty__Group_5__0 : rule__SlicedProperty__Group_5__0__Impl rule__SlicedProperty__Group_5__1 ;
    public final void rule__SlicedProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2652:1: ( rule__SlicedProperty__Group_5__0__Impl rule__SlicedProperty__Group_5__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2653:2: rule__SlicedProperty__Group_5__0__Impl rule__SlicedProperty__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__0__Impl_in_rule__SlicedProperty__Group_5__05214);
            rule__SlicedProperty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__1_in_rule__SlicedProperty__Group_5__05217);
            rule__SlicedProperty__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_5__0"


    // $ANTLR start "rule__SlicedProperty__Group_5__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2660:1: rule__SlicedProperty__Group_5__0__Impl : ( '[[' ) ;
    public final void rule__SlicedProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2664:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2665:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2665:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2666:1: '[['
            {
             before(grammarAccess.getSlicedPropertyAccess().getLeftSquareBracketLeftSquareBracketKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SlicedProperty__Group_5__0__Impl5245); 
             after(grammarAccess.getSlicedPropertyAccess().getLeftSquareBracketLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_5__0__Impl"


    // $ANTLR start "rule__SlicedProperty__Group_5__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2679:1: rule__SlicedProperty__Group_5__1 : rule__SlicedProperty__Group_5__1__Impl rule__SlicedProperty__Group_5__2 ;
    public final void rule__SlicedProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2683:1: ( rule__SlicedProperty__Group_5__1__Impl rule__SlicedProperty__Group_5__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2684:2: rule__SlicedProperty__Group_5__1__Impl rule__SlicedProperty__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__1__Impl_in_rule__SlicedProperty__Group_5__15276);
            rule__SlicedProperty__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__2_in_rule__SlicedProperty__Group_5__15279);
            rule__SlicedProperty__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_5__1"


    // $ANTLR start "rule__SlicedProperty__Group_5__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2691:1: rule__SlicedProperty__Group_5__1__Impl : ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) ) ;
    public final void rule__SlicedProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2695:1: ( ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2696:1: ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2696:1: ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2697:1: ( rule__SlicedProperty__ExpressionAssignment_5_1 )
            {
             before(grammarAccess.getSlicedPropertyAccess().getExpressionAssignment_5_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2698:1: ( rule__SlicedProperty__ExpressionAssignment_5_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2698:2: rule__SlicedProperty__ExpressionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__ExpressionAssignment_5_1_in_rule__SlicedProperty__Group_5__1__Impl5306);
            rule__SlicedProperty__ExpressionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSlicedPropertyAccess().getExpressionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_5__1__Impl"


    // $ANTLR start "rule__SlicedProperty__Group_5__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2708:1: rule__SlicedProperty__Group_5__2 : rule__SlicedProperty__Group_5__2__Impl ;
    public final void rule__SlicedProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2712:1: ( rule__SlicedProperty__Group_5__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2713:2: rule__SlicedProperty__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__2__Impl_in_rule__SlicedProperty__Group_5__25336);
            rule__SlicedProperty__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_5__2"


    // $ANTLR start "rule__SlicedProperty__Group_5__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2719:1: rule__SlicedProperty__Group_5__2__Impl : ( ']]' ) ;
    public final void rule__SlicedProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2723:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2724:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2724:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2725:1: ']]'
            {
             before(grammarAccess.getSlicedPropertyAccess().getRightSquareBracketRightSquareBracketKeyword_5_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SlicedProperty__Group_5__2__Impl5364); 
             after(grammarAccess.getSlicedPropertyAccess().getRightSquareBracketRightSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_5__2__Impl"


    // $ANTLR start "rule__OppositeCreation__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2744:1: rule__OppositeCreation__Group__0 : rule__OppositeCreation__Group__0__Impl rule__OppositeCreation__Group__1 ;
    public final void rule__OppositeCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2748:1: ( rule__OppositeCreation__Group__0__Impl rule__OppositeCreation__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2749:2: rule__OppositeCreation__Group__0__Impl rule__OppositeCreation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__0__Impl_in_rule__OppositeCreation__Group__05401);
            rule__OppositeCreation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__1_in_rule__OppositeCreation__Group__05404);
            rule__OppositeCreation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__0"


    // $ANTLR start "rule__OppositeCreation__Group__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2756:1: rule__OppositeCreation__Group__0__Impl : ( () ) ;
    public final void rule__OppositeCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2760:1: ( ( () ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2761:1: ( () )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2761:1: ( () )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2762:1: ()
            {
             before(grammarAccess.getOppositeCreationAccess().getOppositeCreationAction_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2763:1: ()
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2765:1: 
            {
            }

             after(grammarAccess.getOppositeCreationAccess().getOppositeCreationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__0__Impl"


    // $ANTLR start "rule__OppositeCreation__Group__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2775:1: rule__OppositeCreation__Group__1 : rule__OppositeCreation__Group__1__Impl rule__OppositeCreation__Group__2 ;
    public final void rule__OppositeCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2779:1: ( rule__OppositeCreation__Group__1__Impl rule__OppositeCreation__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2780:2: rule__OppositeCreation__Group__1__Impl rule__OppositeCreation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__1__Impl_in_rule__OppositeCreation__Group__15462);
            rule__OppositeCreation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__2_in_rule__OppositeCreation__Group__15465);
            rule__OppositeCreation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__1"


    // $ANTLR start "rule__OppositeCreation__Group__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2787:1: rule__OppositeCreation__Group__1__Impl : ( 'opposite' ) ;
    public final void rule__OppositeCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2791:1: ( ( 'opposite' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2792:1: ( 'opposite' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2792:1: ( 'opposite' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2793:1: 'opposite'
            {
             before(grammarAccess.getOppositeCreationAccess().getOppositeKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OppositeCreation__Group__1__Impl5493); 
             after(grammarAccess.getOppositeCreationAccess().getOppositeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__1__Impl"


    // $ANTLR start "rule__OppositeCreation__Group__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2806:1: rule__OppositeCreation__Group__2 : rule__OppositeCreation__Group__2__Impl rule__OppositeCreation__Group__3 ;
    public final void rule__OppositeCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2810:1: ( rule__OppositeCreation__Group__2__Impl rule__OppositeCreation__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2811:2: rule__OppositeCreation__Group__2__Impl rule__OppositeCreation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__2__Impl_in_rule__OppositeCreation__Group__25524);
            rule__OppositeCreation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__3_in_rule__OppositeCreation__Group__25527);
            rule__OppositeCreation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__2"


    // $ANTLR start "rule__OppositeCreation__Group__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2818:1: rule__OppositeCreation__Group__2__Impl : ( '(' ) ;
    public final void rule__OppositeCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2822:1: ( ( '(' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2823:1: ( '(' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2823:1: ( '(' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2824:1: '('
            {
             before(grammarAccess.getOppositeCreationAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__OppositeCreation__Group__2__Impl5555); 
             after(grammarAccess.getOppositeCreationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__2__Impl"


    // $ANTLR start "rule__OppositeCreation__Group__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2837:1: rule__OppositeCreation__Group__3 : rule__OppositeCreation__Group__3__Impl rule__OppositeCreation__Group__4 ;
    public final void rule__OppositeCreation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2841:1: ( rule__OppositeCreation__Group__3__Impl rule__OppositeCreation__Group__4 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2842:2: rule__OppositeCreation__Group__3__Impl rule__OppositeCreation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__3__Impl_in_rule__OppositeCreation__Group__35586);
            rule__OppositeCreation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__4_in_rule__OppositeCreation__Group__35589);
            rule__OppositeCreation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__3"


    // $ANTLR start "rule__OppositeCreation__Group__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2849:1: rule__OppositeCreation__Group__3__Impl : ( ( rule__OppositeCreation__NameAssignment_3 ) ) ;
    public final void rule__OppositeCreation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2853:1: ( ( ( rule__OppositeCreation__NameAssignment_3 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2854:1: ( ( rule__OppositeCreation__NameAssignment_3 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2854:1: ( ( rule__OppositeCreation__NameAssignment_3 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2855:1: ( rule__OppositeCreation__NameAssignment_3 )
            {
             before(grammarAccess.getOppositeCreationAccess().getNameAssignment_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2856:1: ( rule__OppositeCreation__NameAssignment_3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2856:2: rule__OppositeCreation__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__NameAssignment_3_in_rule__OppositeCreation__Group__3__Impl5616);
            rule__OppositeCreation__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOppositeCreationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__3__Impl"


    // $ANTLR start "rule__OppositeCreation__Group__4"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2866:1: rule__OppositeCreation__Group__4 : rule__OppositeCreation__Group__4__Impl ;
    public final void rule__OppositeCreation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2870:1: ( rule__OppositeCreation__Group__4__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2871:2: rule__OppositeCreation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__4__Impl_in_rule__OppositeCreation__Group__45646);
            rule__OppositeCreation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__4"


    // $ANTLR start "rule__OppositeCreation__Group__4__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2877:1: rule__OppositeCreation__Group__4__Impl : ( ')' ) ;
    public final void rule__OppositeCreation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2881:1: ( ( ')' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2882:1: ( ')' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2882:1: ( ')' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2883:1: ')'
            {
             before(grammarAccess.getOppositeCreationAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__OppositeCreation__Group__4__Impl5674); 
             after(grammarAccess.getOppositeCreationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__Group__4__Impl"


    // $ANTLR start "rule__Slicer__ActiveAssignment_1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2907:1: rule__Slicer__ActiveAssignment_1 : ( ( 'active' ) ) ;
    public final void rule__Slicer__ActiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2911:1: ( ( ( 'active' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2912:1: ( ( 'active' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2912:1: ( ( 'active' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2913:1: ( 'active' )
            {
             before(grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2914:1: ( 'active' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2915:1: 'active'
            {
             before(grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Slicer__ActiveAssignment_15725); 
             after(grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0()); 

            }

             after(grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__ActiveAssignment_1"


    // $ANTLR start "rule__Slicer__StrictAssignment_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2930:1: rule__Slicer__StrictAssignment_2 : ( ( 'strict' ) ) ;
    public final void rule__Slicer__StrictAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2934:1: ( ( ( 'strict' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2935:1: ( ( 'strict' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2935:1: ( ( 'strict' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2936:1: ( 'strict' )
            {
             before(grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2937:1: ( 'strict' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2938:1: 'strict'
            {
             before(grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Slicer__StrictAssignment_25769); 
             after(grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0()); 

            }

             after(grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__StrictAssignment_2"


    // $ANTLR start "rule__Slicer__NameAssignment_3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2953:1: rule__Slicer__NameAssignment_3 : ( ruleQName ) ;
    public final void rule__Slicer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2957:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2958:1: ( ruleQName )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2958:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2959:1: ruleQName
            {
             before(grammarAccess.getSlicerAccess().getNameQNameParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Slicer__NameAssignment_35808);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getNameQNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__NameAssignment_3"


    // $ANTLR start "rule__Slicer__UriMetamodelAssignment_7"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2968:1: rule__Slicer__UriMetamodelAssignment_7 : ( ruleEString ) ;
    public final void rule__Slicer__UriMetamodelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2972:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2973:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2973:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2974:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getUriMetamodelEStringParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__UriMetamodelAssignment_75839);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getUriMetamodelEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__UriMetamodelAssignment_7"


    // $ANTLR start "rule__Slicer__InputClassesAssignment_10"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2983:1: rule__Slicer__InputClassesAssignment_10 : ( ( ruleQName ) ) ;
    public final void rule__Slicer__InputClassesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2987:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2988:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2988:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2989:1: ( ruleQName )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_10_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2990:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2991:1: ruleQName
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassQNameParserRuleCall_10_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Slicer__InputClassesAssignment_105874);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getInputClassesEClassQNameParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__InputClassesAssignment_10"


    // $ANTLR start "rule__Slicer__InputClassesAssignment_11_1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3002:1: rule__Slicer__InputClassesAssignment_11_1 : ( ( ruleQName ) ) ;
    public final void rule__Slicer__InputClassesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3006:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3007:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3007:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3008:1: ( ruleQName )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_11_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3009:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3010:1: ruleQName
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassQNameParserRuleCall_11_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Slicer__InputClassesAssignment_11_15913);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getInputClassesEClassQNameParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__InputClassesAssignment_11_1"


    // $ANTLR start "rule__Slicer__RadiusAssignment_12_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3021:1: rule__Slicer__RadiusAssignment_12_2 : ( ruleRadius ) ;
    public final void rule__Slicer__RadiusAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3025:1: ( ( ruleRadius ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3026:1: ( ruleRadius )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3026:1: ( ruleRadius )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3027:1: ruleRadius
            {
             before(grammarAccess.getSlicerAccess().getRadiusRadiusParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadius_in_rule__Slicer__RadiusAssignment_12_25948);
            ruleRadius();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getRadiusRadiusParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__RadiusAssignment_12_2"


    // $ANTLR start "rule__Slicer__ConstraintsAssignment_13_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3036:1: rule__Slicer__ConstraintsAssignment_13_2 : ( ruleConstraint ) ;
    public final void rule__Slicer__ConstraintsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3040:1: ( ( ruleConstraint ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3041:1: ( ruleConstraint )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3041:1: ( ruleConstraint )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3042:1: ruleConstraint
            {
             before(grammarAccess.getSlicerAccess().getConstraintsConstraintParserRuleCall_13_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__Slicer__ConstraintsAssignment_13_25979);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getConstraintsConstraintParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__ConstraintsAssignment_13_2"


    // $ANTLR start "rule__Slicer__SlicedElementsAssignment_14_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3051:1: rule__Slicer__SlicedElementsAssignment_14_2 : ( ruleSlicedClass ) ;
    public final void rule__Slicer__SlicedElementsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3055:1: ( ( ruleSlicedClass ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3056:1: ( ruleSlicedClass )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3056:1: ( ruleSlicedClass )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3057:1: ruleSlicedClass
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsSlicedClassParserRuleCall_14_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedClass_in_rule__Slicer__SlicedElementsAssignment_14_26010);
            ruleSlicedClass();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getSlicedElementsSlicedClassParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__SlicedElementsAssignment_14_2"


    // $ANTLR start "rule__Slicer__SlicedElementsAssignment_15_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3066:1: rule__Slicer__SlicedElementsAssignment_15_2 : ( ruleSlicedProperty ) ;
    public final void rule__Slicer__SlicedElementsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3070:1: ( ( ruleSlicedProperty ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3071:1: ( ruleSlicedProperty )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3071:1: ( ruleSlicedProperty )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3072:1: ruleSlicedProperty
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsSlicedPropertyParserRuleCall_15_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedProperty_in_rule__Slicer__SlicedElementsAssignment_15_26041);
            ruleSlicedProperty();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getSlicedElementsSlicedPropertyParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__SlicedElementsAssignment_15_2"


    // $ANTLR start "rule__Slicer__OnStartAssignment_16_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3081:1: rule__Slicer__OnStartAssignment_16_2 : ( ruleEString ) ;
    public final void rule__Slicer__OnStartAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3085:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3086:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3086:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3087:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getOnStartEStringParserRuleCall_16_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__OnStartAssignment_16_26072);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getOnStartEStringParserRuleCall_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__OnStartAssignment_16_2"


    // $ANTLR start "rule__Slicer__OnEndAssignment_17_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3096:1: rule__Slicer__OnEndAssignment_17_2 : ( ruleEString ) ;
    public final void rule__Slicer__OnEndAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3100:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3101:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3101:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3102:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getOnEndEStringParserRuleCall_17_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__OnEndAssignment_17_26103);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getOnEndEStringParserRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__OnEndAssignment_17_2"


    // $ANTLR start "rule__Slicer__HelperAssignment_18_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3111:1: rule__Slicer__HelperAssignment_18_2 : ( ruleEString ) ;
    public final void rule__Slicer__HelperAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3115:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3116:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3116:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3117:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getHelperEStringParserRuleCall_18_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__HelperAssignment_18_26134);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getHelperEStringParserRuleCall_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__HelperAssignment_18_2"


    // $ANTLR start "rule__Constraint__NameAssignment_0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3126:1: rule__Constraint__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3130:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3131:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3131:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3132:1: ruleEString
            {
             before(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constraint__NameAssignment_06165);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_0"


    // $ANTLR start "rule__Constraint__ExpressionAssignment_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3141:1: rule__Constraint__ExpressionAssignment_2 : ( ruleEString ) ;
    public final void rule__Constraint__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3145:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3146:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3146:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3147:1: ruleEString
            {
             before(grammarAccess.getConstraintAccess().getExpressionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constraint__ExpressionAssignment_26196);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getExpressionEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ExpressionAssignment_2"


    // $ANTLR start "rule__Radius__FocusedClassesAssignment_1_0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3156:1: rule__Radius__FocusedClassesAssignment_1_0 : ( ( ruleQName ) ) ;
    public final void rule__Radius__FocusedClassesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3160:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3161:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3161:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3162:1: ( ruleQName )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_0_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3163:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3164:1: ruleQName
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassQNameParserRuleCall_1_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Radius__FocusedClassesAssignment_1_06231);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassQNameParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__FocusedClassesAssignment_1_0"


    // $ANTLR start "rule__Radius__FocusedClassesAssignment_1_1_1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3175:1: rule__Radius__FocusedClassesAssignment_1_1_1 : ( ( ruleQName ) ) ;
    public final void rule__Radius__FocusedClassesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3179:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3180:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3180:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3181:1: ( ruleQName )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_1_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3182:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3183:1: ruleQName
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassQNameParserRuleCall_1_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Radius__FocusedClassesAssignment_1_1_16270);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassQNameParserRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Radius__FocusedClassesAssignment_1_1_1"


    // $ANTLR start "rule__SlicedClass__DomainAssignment_0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3194:1: rule__SlicedClass__DomainAssignment_0 : ( ( ruleQName ) ) ;
    public final void rule__SlicedClass__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3198:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3199:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3199:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3200:1: ( ruleQName )
            {
             before(grammarAccess.getSlicedClassAccess().getDomainEClassCrossReference_0_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3201:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3202:1: ruleQName
            {
             before(grammarAccess.getSlicedClassAccess().getDomainEClassQNameParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__SlicedClass__DomainAssignment_06309);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getSlicedClassAccess().getDomainEClassQNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSlicedClassAccess().getDomainEClassCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__DomainAssignment_0"


    // $ANTLR start "rule__SlicedClass__IsOptionAssignment_1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3213:1: rule__SlicedClass__IsOptionAssignment_1 : ( ( 'option' ) ) ;
    public final void rule__SlicedClass__IsOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3217:1: ( ( ( 'option' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3218:1: ( ( 'option' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3218:1: ( ( 'option' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3219:1: ( 'option' )
            {
             before(grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3220:1: ( 'option' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3221:1: 'option'
            {
             before(grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SlicedClass__IsOptionAssignment_16349); 
             after(grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0()); 

            }

             after(grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__IsOptionAssignment_1"


    // $ANTLR start "rule__SlicedClass__CtxAssignment_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3236:1: rule__SlicedClass__CtxAssignment_2 : ( ruleVarDecl ) ;
    public final void rule__SlicedClass__CtxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3240:1: ( ( ruleVarDecl ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3241:1: ( ruleVarDecl )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3241:1: ( ruleVarDecl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3242:1: ruleVarDecl
            {
             before(grammarAccess.getSlicedClassAccess().getCtxVarDeclParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_rule__SlicedClass__CtxAssignment_26388);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getSlicedClassAccess().getCtxVarDeclParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__CtxAssignment_2"


    // $ANTLR start "rule__SlicedClass__ExpressionAssignment_3_1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3251:1: rule__SlicedClass__ExpressionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__SlicedClass__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3255:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3256:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3256:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3257:1: ruleEString
            {
             before(grammarAccess.getSlicedClassAccess().getExpressionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SlicedClass__ExpressionAssignment_3_16419);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicedClassAccess().getExpressionEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__ExpressionAssignment_3_1"


    // $ANTLR start "rule__VarDecl__VarNameAssignment"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3266:1: rule__VarDecl__VarNameAssignment : ( ruleEString ) ;
    public final void rule__VarDecl__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3270:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3271:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3271:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3272:1: ruleEString
            {
             before(grammarAccess.getVarDeclAccess().getVarNameEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VarDecl__VarNameAssignment6450);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVarDeclAccess().getVarNameEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__VarNameAssignment"


    // $ANTLR start "rule__SlicedProperty__DomainAssignment_0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3281:1: rule__SlicedProperty__DomainAssignment_0 : ( ( ruleQName ) ) ;
    public final void rule__SlicedProperty__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3285:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3286:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3286:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3287:1: ( ruleQName )
            {
             before(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureCrossReference_0_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3288:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3289:1: ruleQName
            {
             before(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureQNameParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__SlicedProperty__DomainAssignment_06485);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureQNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__DomainAssignment_0"


    // $ANTLR start "rule__SlicedProperty__IsOptionAssignment_1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3300:1: rule__SlicedProperty__IsOptionAssignment_1 : ( ( 'option' ) ) ;
    public final void rule__SlicedProperty__IsOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3304:1: ( ( ( 'option' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3305:1: ( ( 'option' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3305:1: ( ( 'option' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3306:1: ( 'option' )
            {
             before(grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3307:1: ( 'option' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3308:1: 'option'
            {
             before(grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SlicedProperty__IsOptionAssignment_16525); 
             after(grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0()); 

            }

             after(grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__IsOptionAssignment_1"


    // $ANTLR start "rule__SlicedProperty__SrcAssignment_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3323:1: rule__SlicedProperty__SrcAssignment_2 : ( ruleVarDecl ) ;
    public final void rule__SlicedProperty__SrcAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3327:1: ( ( ruleVarDecl ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3328:1: ( ruleVarDecl )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3328:1: ( ruleVarDecl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3329:1: ruleVarDecl
            {
             before(grammarAccess.getSlicedPropertyAccess().getSrcVarDeclParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_rule__SlicedProperty__SrcAssignment_26564);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getSrcVarDeclParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__SrcAssignment_2"


    // $ANTLR start "rule__SlicedProperty__TgtAssignment_3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3338:1: rule__SlicedProperty__TgtAssignment_3 : ( ruleVarDecl ) ;
    public final void rule__SlicedProperty__TgtAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3342:1: ( ( ruleVarDecl ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3343:1: ( ruleVarDecl )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3343:1: ( ruleVarDecl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3344:1: ruleVarDecl
            {
             before(grammarAccess.getSlicedPropertyAccess().getTgtVarDeclParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_rule__SlicedProperty__TgtAssignment_36595);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getTgtVarDeclParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__TgtAssignment_3"


    // $ANTLR start "rule__SlicedProperty__OppositeAssignment_4"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3353:1: rule__SlicedProperty__OppositeAssignment_4 : ( ruleOppositeCreation ) ;
    public final void rule__SlicedProperty__OppositeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3357:1: ( ( ruleOppositeCreation ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3358:1: ( ruleOppositeCreation )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3358:1: ( ruleOppositeCreation )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3359:1: ruleOppositeCreation
            {
             before(grammarAccess.getSlicedPropertyAccess().getOppositeOppositeCreationParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOppositeCreation_in_rule__SlicedProperty__OppositeAssignment_46626);
            ruleOppositeCreation();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getOppositeOppositeCreationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__OppositeAssignment_4"


    // $ANTLR start "rule__SlicedProperty__ExpressionAssignment_5_1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3368:1: rule__SlicedProperty__ExpressionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__SlicedProperty__ExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3372:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3373:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3373:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3374:1: ruleEString
            {
             before(grammarAccess.getSlicedPropertyAccess().getExpressionEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SlicedProperty__ExpressionAssignment_5_16657);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getExpressionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__ExpressionAssignment_5_1"


    // $ANTLR start "rule__OppositeCreation__NameAssignment_3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3383:1: rule__OppositeCreation__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OppositeCreation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3387:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3388:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3388:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3389:1: ruleEString
            {
             before(grammarAccess.getOppositeCreationAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OppositeCreation__NameAssignment_36688);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOppositeCreationAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OppositeCreation__NameAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSlicer_in_entryRuleSlicer61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicer68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__0_in_ruleSlicer94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_entryRuleQName181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQName188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group__0_in_ruleQName214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadius_in_entryRuleRadius303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadius310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group__0_in_ruleRadius336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedClass_in_entryRuleSlicedClass363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicedClass370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__0_in_ruleSlicedClass396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VarDecl__VarNameAssignment_in_ruleVarDecl456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedProperty_in_entryRuleSlicedProperty483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicedProperty490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__0_in_ruleSlicedProperty516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOppositeCreation_in_entryRuleOppositeCreation543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOppositeCreation550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__0_in_ruleOppositeCreation576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__0__Impl_in_rule__Slicer__Group__0660 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__1_in_rule__Slicer__Group__0663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Slicer__Group__0__Impl691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__1__Impl_in_rule__Slicer__Group__1722 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__2_in_rule__Slicer__Group__1725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__ActiveAssignment_1_in_rule__Slicer__Group__1__Impl752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__2__Impl_in_rule__Slicer__Group__2783 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__3_in_rule__Slicer__Group__2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__StrictAssignment_2_in_rule__Slicer__Group__2__Impl813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__3__Impl_in_rule__Slicer__Group__3844 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__4_in_rule__Slicer__Group__3847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__NameAssignment_3_in_rule__Slicer__Group__3__Impl874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__4__Impl_in_rule__Slicer__Group__4904 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__5_in_rule__Slicer__Group__4907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Slicer__Group__4__Impl935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__5__Impl_in_rule__Slicer__Group__5966 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__6_in_rule__Slicer__Group__5969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Slicer__Group__5__Impl997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__6__Impl_in_rule__Slicer__Group__61028 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__7_in_rule__Slicer__Group__61031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group__6__Impl1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__7__Impl_in_rule__Slicer__Group__71090 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__8_in_rule__Slicer__Group__71093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__UriMetamodelAssignment_7_in_rule__Slicer__Group__7__Impl1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__8__Impl_in_rule__Slicer__Group__81150 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__9_in_rule__Slicer__Group__81153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Slicer__Group__8__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__9__Impl_in_rule__Slicer__Group__91212 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__10_in_rule__Slicer__Group__91215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group__9__Impl1243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__10__Impl_in_rule__Slicer__Group__101274 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__11_in_rule__Slicer__Group__101277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__InputClassesAssignment_10_in_rule__Slicer__Group__10__Impl1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__11__Impl_in_rule__Slicer__Group__111334 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__12_in_rule__Slicer__Group__111337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__0_in_rule__Slicer__Group__11__Impl1364 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__12__Impl_in_rule__Slicer__Group__121395 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__13_in_rule__Slicer__Group__121398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__0_in_rule__Slicer__Group__12__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__13__Impl_in_rule__Slicer__Group__131456 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__14_in_rule__Slicer__Group__131459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__0_in_rule__Slicer__Group__13__Impl1486 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__14__Impl_in_rule__Slicer__Group__141517 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__15_in_rule__Slicer__Group__141520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__0_in_rule__Slicer__Group__14__Impl1547 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__15__Impl_in_rule__Slicer__Group__151578 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__16_in_rule__Slicer__Group__151581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__0_in_rule__Slicer__Group__15__Impl1608 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__16__Impl_in_rule__Slicer__Group__161639 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__17_in_rule__Slicer__Group__161642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__0_in_rule__Slicer__Group__16__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__17__Impl_in_rule__Slicer__Group__171700 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__18_in_rule__Slicer__Group__171703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__0_in_rule__Slicer__Group__17__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__18__Impl_in_rule__Slicer__Group__181761 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__19_in_rule__Slicer__Group__181764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__0_in_rule__Slicer__Group__18__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__19__Impl_in_rule__Slicer__Group__191822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Slicer__Group__19__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__0__Impl_in_rule__Slicer__Group_11__01921 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__1_in_rule__Slicer__Group_11__01924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Slicer__Group_11__0__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__1__Impl_in_rule__Slicer__Group_11__11983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__InputClassesAssignment_11_1_in_rule__Slicer__Group_11__1__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__0__Impl_in_rule__Slicer__Group_12__02044 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__1_in_rule__Slicer__Group_12__02047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Slicer__Group_12__0__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__1__Impl_in_rule__Slicer__Group_12__12106 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__2_in_rule__Slicer__Group_12__12109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_12__1__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__2__Impl_in_rule__Slicer__Group_12__22168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__RadiusAssignment_12_2_in_rule__Slicer__Group_12__2__Impl2195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__0__Impl_in_rule__Slicer__Group_13__02231 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__1_in_rule__Slicer__Group_13__02234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Slicer__Group_13__0__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__1__Impl_in_rule__Slicer__Group_13__12293 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__2_in_rule__Slicer__Group_13__12296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_13__1__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__2__Impl_in_rule__Slicer__Group_13__22355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__ConstraintsAssignment_13_2_in_rule__Slicer__Group_13__2__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__0__Impl_in_rule__Slicer__Group_14__02418 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__1_in_rule__Slicer__Group_14__02421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Slicer__Group_14__0__Impl2449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__1__Impl_in_rule__Slicer__Group_14__12480 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__2_in_rule__Slicer__Group_14__12483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_14__1__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__2__Impl_in_rule__Slicer__Group_14__22542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__SlicedElementsAssignment_14_2_in_rule__Slicer__Group_14__2__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__0__Impl_in_rule__Slicer__Group_15__02605 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__1_in_rule__Slicer__Group_15__02608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Slicer__Group_15__0__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__1__Impl_in_rule__Slicer__Group_15__12667 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__2_in_rule__Slicer__Group_15__12670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_15__1__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__2__Impl_in_rule__Slicer__Group_15__22729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__SlicedElementsAssignment_15_2_in_rule__Slicer__Group_15__2__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__0__Impl_in_rule__Slicer__Group_16__02792 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__1_in_rule__Slicer__Group_16__02795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Slicer__Group_16__0__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__1__Impl_in_rule__Slicer__Group_16__12854 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__2_in_rule__Slicer__Group_16__12857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Slicer__Group_16__1__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__2__Impl_in_rule__Slicer__Group_16__22916 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__3_in_rule__Slicer__Group_16__22919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__OnStartAssignment_16_2_in_rule__Slicer__Group_16__2__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__3__Impl_in_rule__Slicer__Group_16__32976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Slicer__Group_16__3__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__0__Impl_in_rule__Slicer__Group_17__03043 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__1_in_rule__Slicer__Group_17__03046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Slicer__Group_17__0__Impl3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__1__Impl_in_rule__Slicer__Group_17__13105 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__2_in_rule__Slicer__Group_17__13108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Slicer__Group_17__1__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__2__Impl_in_rule__Slicer__Group_17__23167 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__3_in_rule__Slicer__Group_17__23170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__OnEndAssignment_17_2_in_rule__Slicer__Group_17__2__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__3__Impl_in_rule__Slicer__Group_17__33227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Slicer__Group_17__3__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__0__Impl_in_rule__Slicer__Group_18__03294 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__1_in_rule__Slicer__Group_18__03297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Slicer__Group_18__0__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__1__Impl_in_rule__Slicer__Group_18__13356 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__2_in_rule__Slicer__Group_18__13359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Slicer__Group_18__1__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__2__Impl_in_rule__Slicer__Group_18__23418 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__3_in_rule__Slicer__Group_18__23421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__HelperAssignment_18_2_in_rule__Slicer__Group_18__2__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__3__Impl_in_rule__Slicer__Group_18__33478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Slicer__Group_18__3__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__03545 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__QName__Group__1_in_rule__QName__Group__03548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QName__Group__0__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__13604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl3631 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__03666 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__03669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__QName__Group_1__0__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__13728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QName__Group_1__1__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03788 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__NameAssignment_0_in_rule__Constraint__Group__0__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13848 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Constraint__Group__1__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23910 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__ExpressionAssignment_2_in_rule__Constraint__Group__2__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Constraint__Group__3__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group__0__Impl_in_rule__Radius__Group__04037 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Radius__Group__1_in_rule__Radius__Group__04040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group__1__Impl_in_rule__Radius__Group__14098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__0_in_rule__Radius__Group__1__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__0__Impl_in_rule__Radius__Group_1__04160 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__1_in_rule__Radius__Group_1__04163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__FocusedClassesAssignment_1_0_in_rule__Radius__Group_1__0__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__1__Impl_in_rule__Radius__Group_1__14220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__0_in_rule__Radius__Group_1__1__Impl4247 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__0__Impl_in_rule__Radius__Group_1_1__04282 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__1_in_rule__Radius__Group_1_1__04285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Radius__Group_1_1__0__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__1__Impl_in_rule__Radius__Group_1_1__14344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__FocusedClassesAssignment_1_1_1_in_rule__Radius__Group_1_1__1__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__0__Impl_in_rule__SlicedClass__Group__04405 = new BitSet(new long[]{0x0000000380800030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__1_in_rule__SlicedClass__Group__04408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__DomainAssignment_0_in_rule__SlicedClass__Group__0__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__1__Impl_in_rule__SlicedClass__Group__14465 = new BitSet(new long[]{0x0000000380800030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__2_in_rule__SlicedClass__Group__14468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__IsOptionAssignment_1_in_rule__SlicedClass__Group__1__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__2__Impl_in_rule__SlicedClass__Group__24526 = new BitSet(new long[]{0x0000000380800030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__3_in_rule__SlicedClass__Group__24529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__CtxAssignment_2_in_rule__SlicedClass__Group__2__Impl4556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__3__Impl_in_rule__SlicedClass__Group__34587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__0_in_rule__SlicedClass__Group__3__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__0__Impl_in_rule__SlicedClass__Group_3__04653 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__1_in_rule__SlicedClass__Group_3__04656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SlicedClass__Group_3__0__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__1__Impl_in_rule__SlicedClass__Group_3__14715 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__2_in_rule__SlicedClass__Group_3__14718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__ExpressionAssignment_3_1_in_rule__SlicedClass__Group_3__1__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__2__Impl_in_rule__SlicedClass__Group_3__24775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SlicedClass__Group_3__2__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__0__Impl_in_rule__SlicedProperty__Group__04840 = new BitSet(new long[]{0x0000000390800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__1_in_rule__SlicedProperty__Group__04843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__DomainAssignment_0_in_rule__SlicedProperty__Group__0__Impl4870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__1__Impl_in_rule__SlicedProperty__Group__14900 = new BitSet(new long[]{0x0000000390800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__2_in_rule__SlicedProperty__Group__14903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__IsOptionAssignment_1_in_rule__SlicedProperty__Group__1__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__2__Impl_in_rule__SlicedProperty__Group__24961 = new BitSet(new long[]{0x0000000390800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__3_in_rule__SlicedProperty__Group__24964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__SrcAssignment_2_in_rule__SlicedProperty__Group__2__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__3__Impl_in_rule__SlicedProperty__Group__35022 = new BitSet(new long[]{0x0000000390800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__4_in_rule__SlicedProperty__Group__35025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__TgtAssignment_3_in_rule__SlicedProperty__Group__3__Impl5052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__4__Impl_in_rule__SlicedProperty__Group__45083 = new BitSet(new long[]{0x0000000390800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__5_in_rule__SlicedProperty__Group__45086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__OppositeAssignment_4_in_rule__SlicedProperty__Group__4__Impl5113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__5__Impl_in_rule__SlicedProperty__Group__55144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__0_in_rule__SlicedProperty__Group__5__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__0__Impl_in_rule__SlicedProperty__Group_5__05214 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__1_in_rule__SlicedProperty__Group_5__05217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SlicedProperty__Group_5__0__Impl5245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__1__Impl_in_rule__SlicedProperty__Group_5__15276 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__2_in_rule__SlicedProperty__Group_5__15279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__ExpressionAssignment_5_1_in_rule__SlicedProperty__Group_5__1__Impl5306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__2__Impl_in_rule__SlicedProperty__Group_5__25336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SlicedProperty__Group_5__2__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__0__Impl_in_rule__OppositeCreation__Group__05401 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__1_in_rule__OppositeCreation__Group__05404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__1__Impl_in_rule__OppositeCreation__Group__15462 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__2_in_rule__OppositeCreation__Group__15465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OppositeCreation__Group__1__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__2__Impl_in_rule__OppositeCreation__Group__25524 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__3_in_rule__OppositeCreation__Group__25527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__OppositeCreation__Group__2__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__3__Impl_in_rule__OppositeCreation__Group__35586 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__4_in_rule__OppositeCreation__Group__35589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__NameAssignment_3_in_rule__OppositeCreation__Group__3__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__4__Impl_in_rule__OppositeCreation__Group__45646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__OppositeCreation__Group__4__Impl5674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Slicer__ActiveAssignment_15725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Slicer__StrictAssignment_25769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Slicer__NameAssignment_35808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__UriMetamodelAssignment_75839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Slicer__InputClassesAssignment_105874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Slicer__InputClassesAssignment_11_15913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadius_in_rule__Slicer__RadiusAssignment_12_25948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__Slicer__ConstraintsAssignment_13_25979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedClass_in_rule__Slicer__SlicedElementsAssignment_14_26010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedProperty_in_rule__Slicer__SlicedElementsAssignment_15_26041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__OnStartAssignment_16_26072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__OnEndAssignment_17_26103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__HelperAssignment_18_26134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constraint__NameAssignment_06165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constraint__ExpressionAssignment_26196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Radius__FocusedClassesAssignment_1_06231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Radius__FocusedClassesAssignment_1_1_16270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__SlicedClass__DomainAssignment_06309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SlicedClass__IsOptionAssignment_16349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_rule__SlicedClass__CtxAssignment_26388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SlicedClass__ExpressionAssignment_3_16419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VarDecl__VarNameAssignment6450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__SlicedProperty__DomainAssignment_06485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SlicedProperty__IsOptionAssignment_16525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_rule__SlicedProperty__SrcAssignment_26564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_rule__SlicedProperty__TgtAssignment_36595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOppositeCreation_in_rule__SlicedProperty__OppositeAssignment_46626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SlicedProperty__ExpressionAssignment_5_16657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OppositeCreation__NameAssignment_36688 = new BitSet(new long[]{0x0000000000000002L});
    }


}