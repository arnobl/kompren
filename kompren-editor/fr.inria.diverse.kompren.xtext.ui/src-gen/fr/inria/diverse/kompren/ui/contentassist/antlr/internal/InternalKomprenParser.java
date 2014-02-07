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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'slicer'", "'{'", "'input'", "':'", "'}'", "'domain'", "','", "'radius'", "'slicedClass'", "'slicedProperty'", "'onStart'", "'[['", "']]'", "'onEnd'", "'helper'", "'.'", "'constraint'", "'opposite'", "'('", "')'", "'active'", "'strict'", "'option'"
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:500:1: rule__Slicer__Group__5__Impl : ( ( ( rule__Slicer__Group_5__0 ) ) ( ( rule__Slicer__Group_5__0 )* ) ) ;
    public final void rule__Slicer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:504:1: ( ( ( ( rule__Slicer__Group_5__0 ) ) ( ( rule__Slicer__Group_5__0 )* ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:505:1: ( ( ( rule__Slicer__Group_5__0 ) ) ( ( rule__Slicer__Group_5__0 )* ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:505:1: ( ( ( rule__Slicer__Group_5__0 ) ) ( ( rule__Slicer__Group_5__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:506:1: ( ( rule__Slicer__Group_5__0 ) ) ( ( rule__Slicer__Group_5__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:506:1: ( ( rule__Slicer__Group_5__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:507:1: ( rule__Slicer__Group_5__0 )
            {
             before(grammarAccess.getSlicerAccess().getGroup_5()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:508:1: ( rule__Slicer__Group_5__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:508:2: rule__Slicer__Group_5__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_5__0_in_rule__Slicer__Group__5__Impl998);
            rule__Slicer__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getGroup_5()); 

            }

            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:511:1: ( ( rule__Slicer__Group_5__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:512:1: ( rule__Slicer__Group_5__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_5()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:513:1: ( rule__Slicer__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:513:2: rule__Slicer__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_5__0_in_rule__Slicer__Group__5__Impl1010);
            	    rule__Slicer__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSlicerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Slicer__Group__5__Impl"


    // $ANTLR start "rule__Slicer__Group__6"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:524:1: rule__Slicer__Group__6 : rule__Slicer__Group__6__Impl rule__Slicer__Group__7 ;
    public final void rule__Slicer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:528:1: ( rule__Slicer__Group__6__Impl rule__Slicer__Group__7 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:529:2: rule__Slicer__Group__6__Impl rule__Slicer__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__6__Impl_in_rule__Slicer__Group__61043);
            rule__Slicer__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__7_in_rule__Slicer__Group__61046);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:536:1: rule__Slicer__Group__6__Impl : ( 'input' ) ;
    public final void rule__Slicer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:540:1: ( ( 'input' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:541:1: ( 'input' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:541:1: ( 'input' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:542:1: 'input'
            {
             before(grammarAccess.getSlicerAccess().getInputKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Slicer__Group__6__Impl1074); 
             after(grammarAccess.getSlicerAccess().getInputKeyword_6()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:555:1: rule__Slicer__Group__7 : rule__Slicer__Group__7__Impl rule__Slicer__Group__8 ;
    public final void rule__Slicer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:559:1: ( rule__Slicer__Group__7__Impl rule__Slicer__Group__8 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:560:2: rule__Slicer__Group__7__Impl rule__Slicer__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__7__Impl_in_rule__Slicer__Group__71105);
            rule__Slicer__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__8_in_rule__Slicer__Group__71108);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:567:1: rule__Slicer__Group__7__Impl : ( ':' ) ;
    public final void rule__Slicer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:571:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:572:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:572:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:573:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group__7__Impl1136); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_7()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:586:1: rule__Slicer__Group__8 : rule__Slicer__Group__8__Impl rule__Slicer__Group__9 ;
    public final void rule__Slicer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:590:1: ( rule__Slicer__Group__8__Impl rule__Slicer__Group__9 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:591:2: rule__Slicer__Group__8__Impl rule__Slicer__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__8__Impl_in_rule__Slicer__Group__81167);
            rule__Slicer__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__9_in_rule__Slicer__Group__81170);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:598:1: rule__Slicer__Group__8__Impl : ( ( rule__Slicer__InputClassesAssignment_8 ) ) ;
    public final void rule__Slicer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:602:1: ( ( ( rule__Slicer__InputClassesAssignment_8 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:603:1: ( ( rule__Slicer__InputClassesAssignment_8 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:603:1: ( ( rule__Slicer__InputClassesAssignment_8 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:604:1: ( rule__Slicer__InputClassesAssignment_8 )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesAssignment_8()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:605:1: ( rule__Slicer__InputClassesAssignment_8 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:605:2: rule__Slicer__InputClassesAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__InputClassesAssignment_8_in_rule__Slicer__Group__8__Impl1197);
            rule__Slicer__InputClassesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getInputClassesAssignment_8()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:615:1: rule__Slicer__Group__9 : rule__Slicer__Group__9__Impl rule__Slicer__Group__10 ;
    public final void rule__Slicer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:619:1: ( rule__Slicer__Group__9__Impl rule__Slicer__Group__10 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:620:2: rule__Slicer__Group__9__Impl rule__Slicer__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__9__Impl_in_rule__Slicer__Group__91227);
            rule__Slicer__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__10_in_rule__Slicer__Group__91230);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:627:1: rule__Slicer__Group__9__Impl : ( ( rule__Slicer__Group_9__0 )* ) ;
    public final void rule__Slicer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:631:1: ( ( ( rule__Slicer__Group_9__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:632:1: ( ( rule__Slicer__Group_9__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:632:1: ( ( rule__Slicer__Group_9__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:633:1: ( rule__Slicer__Group_9__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_9()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:634:1: ( rule__Slicer__Group_9__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:634:2: rule__Slicer__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_9__0_in_rule__Slicer__Group__9__Impl1257);
            	    rule__Slicer__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSlicerAccess().getGroup_9()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:644:1: rule__Slicer__Group__10 : rule__Slicer__Group__10__Impl rule__Slicer__Group__11 ;
    public final void rule__Slicer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:648:1: ( rule__Slicer__Group__10__Impl rule__Slicer__Group__11 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:649:2: rule__Slicer__Group__10__Impl rule__Slicer__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__10__Impl_in_rule__Slicer__Group__101288);
            rule__Slicer__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__11_in_rule__Slicer__Group__101291);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:656:1: rule__Slicer__Group__10__Impl : ( ( rule__Slicer__Group_10__0 )? ) ;
    public final void rule__Slicer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:660:1: ( ( ( rule__Slicer__Group_10__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:661:1: ( ( rule__Slicer__Group_10__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:661:1: ( ( rule__Slicer__Group_10__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:662:1: ( rule__Slicer__Group_10__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_10()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:663:1: ( rule__Slicer__Group_10__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:663:2: rule__Slicer__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_10__0_in_rule__Slicer__Group__10__Impl1318);
                    rule__Slicer__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicerAccess().getGroup_10()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:673:1: rule__Slicer__Group__11 : rule__Slicer__Group__11__Impl rule__Slicer__Group__12 ;
    public final void rule__Slicer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:677:1: ( rule__Slicer__Group__11__Impl rule__Slicer__Group__12 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:678:2: rule__Slicer__Group__11__Impl rule__Slicer__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__11__Impl_in_rule__Slicer__Group__111349);
            rule__Slicer__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__12_in_rule__Slicer__Group__111352);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:685:1: rule__Slicer__Group__11__Impl : ( ( rule__Slicer__Group_11__0 )* ) ;
    public final void rule__Slicer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:689:1: ( ( ( rule__Slicer__Group_11__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:690:1: ( ( rule__Slicer__Group_11__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:690:1: ( ( rule__Slicer__Group_11__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:691:1: ( rule__Slicer__Group_11__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_11()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:692:1: ( rule__Slicer__Group_11__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:692:2: rule__Slicer__Group_11__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__0_in_rule__Slicer__Group__11__Impl1379);
            	    rule__Slicer__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:702:1: rule__Slicer__Group__12 : rule__Slicer__Group__12__Impl rule__Slicer__Group__13 ;
    public final void rule__Slicer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:706:1: ( rule__Slicer__Group__12__Impl rule__Slicer__Group__13 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:707:2: rule__Slicer__Group__12__Impl rule__Slicer__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__12__Impl_in_rule__Slicer__Group__121410);
            rule__Slicer__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__13_in_rule__Slicer__Group__121413);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:714:1: rule__Slicer__Group__12__Impl : ( ( rule__Slicer__Group_12__0 )* ) ;
    public final void rule__Slicer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:718:1: ( ( ( rule__Slicer__Group_12__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:719:1: ( ( rule__Slicer__Group_12__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:719:1: ( ( rule__Slicer__Group_12__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:720:1: ( rule__Slicer__Group_12__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_12()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:721:1: ( rule__Slicer__Group_12__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:721:2: rule__Slicer__Group_12__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__0_in_rule__Slicer__Group__12__Impl1440);
            	    rule__Slicer__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:731:1: rule__Slicer__Group__13 : rule__Slicer__Group__13__Impl rule__Slicer__Group__14 ;
    public final void rule__Slicer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:735:1: ( rule__Slicer__Group__13__Impl rule__Slicer__Group__14 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:736:2: rule__Slicer__Group__13__Impl rule__Slicer__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__13__Impl_in_rule__Slicer__Group__131471);
            rule__Slicer__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__14_in_rule__Slicer__Group__131474);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:743:1: rule__Slicer__Group__13__Impl : ( ( rule__Slicer__Group_13__0 )? ) ;
    public final void rule__Slicer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:747:1: ( ( ( rule__Slicer__Group_13__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:748:1: ( ( rule__Slicer__Group_13__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:748:1: ( ( rule__Slicer__Group_13__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:749:1: ( rule__Slicer__Group_13__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_13()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:750:1: ( rule__Slicer__Group_13__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:750:2: rule__Slicer__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__0_in_rule__Slicer__Group__13__Impl1501);
                    rule__Slicer__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:760:1: rule__Slicer__Group__14 : rule__Slicer__Group__14__Impl rule__Slicer__Group__15 ;
    public final void rule__Slicer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:764:1: ( rule__Slicer__Group__14__Impl rule__Slicer__Group__15 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:765:2: rule__Slicer__Group__14__Impl rule__Slicer__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__14__Impl_in_rule__Slicer__Group__141532);
            rule__Slicer__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__15_in_rule__Slicer__Group__141535);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:772:1: rule__Slicer__Group__14__Impl : ( ( rule__Slicer__Group_14__0 )? ) ;
    public final void rule__Slicer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:776:1: ( ( ( rule__Slicer__Group_14__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:777:1: ( ( rule__Slicer__Group_14__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:777:1: ( ( rule__Slicer__Group_14__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:778:1: ( rule__Slicer__Group_14__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_14()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:779:1: ( rule__Slicer__Group_14__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:779:2: rule__Slicer__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__0_in_rule__Slicer__Group__14__Impl1562);
                    rule__Slicer__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:789:1: rule__Slicer__Group__15 : rule__Slicer__Group__15__Impl rule__Slicer__Group__16 ;
    public final void rule__Slicer__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:793:1: ( rule__Slicer__Group__15__Impl rule__Slicer__Group__16 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:794:2: rule__Slicer__Group__15__Impl rule__Slicer__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__15__Impl_in_rule__Slicer__Group__151593);
            rule__Slicer__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__16_in_rule__Slicer__Group__151596);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:801:1: rule__Slicer__Group__15__Impl : ( ( rule__Slicer__Group_15__0 )? ) ;
    public final void rule__Slicer__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:805:1: ( ( ( rule__Slicer__Group_15__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:806:1: ( ( rule__Slicer__Group_15__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:806:1: ( ( rule__Slicer__Group_15__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:807:1: ( rule__Slicer__Group_15__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_15()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:808:1: ( rule__Slicer__Group_15__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:808:2: rule__Slicer__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__0_in_rule__Slicer__Group__15__Impl1623);
                    rule__Slicer__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:818:1: rule__Slicer__Group__16 : rule__Slicer__Group__16__Impl ;
    public final void rule__Slicer__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:822:1: ( rule__Slicer__Group__16__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:823:2: rule__Slicer__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__16__Impl_in_rule__Slicer__Group__161654);
            rule__Slicer__Group__16__Impl();

            state._fsp--;


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:829:1: rule__Slicer__Group__16__Impl : ( '}' ) ;
    public final void rule__Slicer__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:833:1: ( ( '}' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:834:1: ( '}' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:834:1: ( '}' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:835:1: '}'
            {
             before(grammarAccess.getSlicerAccess().getRightCurlyBracketKeyword_16()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Slicer__Group__16__Impl1682); 
             after(grammarAccess.getSlicerAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
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


    // $ANTLR start "rule__Slicer__Group_5__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:882:1: rule__Slicer__Group_5__0 : rule__Slicer__Group_5__0__Impl rule__Slicer__Group_5__1 ;
    public final void rule__Slicer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:886:1: ( rule__Slicer__Group_5__0__Impl rule__Slicer__Group_5__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:887:2: rule__Slicer__Group_5__0__Impl rule__Slicer__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_5__0__Impl_in_rule__Slicer__Group_5__01747);
            rule__Slicer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_5__1_in_rule__Slicer__Group_5__01750);
            rule__Slicer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_5__0"


    // $ANTLR start "rule__Slicer__Group_5__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:894:1: rule__Slicer__Group_5__0__Impl : ( 'domain' ) ;
    public final void rule__Slicer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:898:1: ( ( 'domain' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:899:1: ( 'domain' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:899:1: ( 'domain' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:900:1: 'domain'
            {
             before(grammarAccess.getSlicerAccess().getDomainKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Slicer__Group_5__0__Impl1778); 
             after(grammarAccess.getSlicerAccess().getDomainKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_5__0__Impl"


    // $ANTLR start "rule__Slicer__Group_5__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:913:1: rule__Slicer__Group_5__1 : rule__Slicer__Group_5__1__Impl rule__Slicer__Group_5__2 ;
    public final void rule__Slicer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:917:1: ( rule__Slicer__Group_5__1__Impl rule__Slicer__Group_5__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:918:2: rule__Slicer__Group_5__1__Impl rule__Slicer__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_5__1__Impl_in_rule__Slicer__Group_5__11809);
            rule__Slicer__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_5__2_in_rule__Slicer__Group_5__11812);
            rule__Slicer__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_5__1"


    // $ANTLR start "rule__Slicer__Group_5__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:925:1: rule__Slicer__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:929:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:930:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:930:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:931:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_5_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_5__1__Impl1840); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_5__1__Impl"


    // $ANTLR start "rule__Slicer__Group_5__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:944:1: rule__Slicer__Group_5__2 : rule__Slicer__Group_5__2__Impl ;
    public final void rule__Slicer__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:948:1: ( rule__Slicer__Group_5__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:949:2: rule__Slicer__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_5__2__Impl_in_rule__Slicer__Group_5__21871);
            rule__Slicer__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_5__2"


    // $ANTLR start "rule__Slicer__Group_5__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:955:1: rule__Slicer__Group_5__2__Impl : ( ( rule__Slicer__UriMetamodelAssignment_5_2 ) ) ;
    public final void rule__Slicer__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:959:1: ( ( ( rule__Slicer__UriMetamodelAssignment_5_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:960:1: ( ( rule__Slicer__UriMetamodelAssignment_5_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:960:1: ( ( rule__Slicer__UriMetamodelAssignment_5_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:961:1: ( rule__Slicer__UriMetamodelAssignment_5_2 )
            {
             before(grammarAccess.getSlicerAccess().getUriMetamodelAssignment_5_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:962:1: ( rule__Slicer__UriMetamodelAssignment_5_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:962:2: rule__Slicer__UriMetamodelAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__UriMetamodelAssignment_5_2_in_rule__Slicer__Group_5__2__Impl1898);
            rule__Slicer__UriMetamodelAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getUriMetamodelAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_5__2__Impl"


    // $ANTLR start "rule__Slicer__Group_9__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:978:1: rule__Slicer__Group_9__0 : rule__Slicer__Group_9__0__Impl rule__Slicer__Group_9__1 ;
    public final void rule__Slicer__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:982:1: ( rule__Slicer__Group_9__0__Impl rule__Slicer__Group_9__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:983:2: rule__Slicer__Group_9__0__Impl rule__Slicer__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_9__0__Impl_in_rule__Slicer__Group_9__01934);
            rule__Slicer__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_9__1_in_rule__Slicer__Group_9__01937);
            rule__Slicer__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_9__0"


    // $ANTLR start "rule__Slicer__Group_9__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:990:1: rule__Slicer__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Slicer__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:994:1: ( ( ',' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:995:1: ( ',' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:995:1: ( ',' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:996:1: ','
            {
             before(grammarAccess.getSlicerAccess().getCommaKeyword_9_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Slicer__Group_9__0__Impl1965); 
             after(grammarAccess.getSlicerAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_9__0__Impl"


    // $ANTLR start "rule__Slicer__Group_9__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1009:1: rule__Slicer__Group_9__1 : rule__Slicer__Group_9__1__Impl ;
    public final void rule__Slicer__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1013:1: ( rule__Slicer__Group_9__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1014:2: rule__Slicer__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_9__1__Impl_in_rule__Slicer__Group_9__11996);
            rule__Slicer__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_9__1"


    // $ANTLR start "rule__Slicer__Group_9__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1020:1: rule__Slicer__Group_9__1__Impl : ( ( rule__Slicer__InputClassesAssignment_9_1 ) ) ;
    public final void rule__Slicer__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1024:1: ( ( ( rule__Slicer__InputClassesAssignment_9_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1025:1: ( ( rule__Slicer__InputClassesAssignment_9_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1025:1: ( ( rule__Slicer__InputClassesAssignment_9_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1026:1: ( rule__Slicer__InputClassesAssignment_9_1 )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesAssignment_9_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1027:1: ( rule__Slicer__InputClassesAssignment_9_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1027:2: rule__Slicer__InputClassesAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__InputClassesAssignment_9_1_in_rule__Slicer__Group_9__1__Impl2023);
            rule__Slicer__InputClassesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getInputClassesAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_9__1__Impl"


    // $ANTLR start "rule__Slicer__Group_10__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1041:1: rule__Slicer__Group_10__0 : rule__Slicer__Group_10__0__Impl rule__Slicer__Group_10__1 ;
    public final void rule__Slicer__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1045:1: ( rule__Slicer__Group_10__0__Impl rule__Slicer__Group_10__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1046:2: rule__Slicer__Group_10__0__Impl rule__Slicer__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_10__0__Impl_in_rule__Slicer__Group_10__02057);
            rule__Slicer__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_10__1_in_rule__Slicer__Group_10__02060);
            rule__Slicer__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_10__0"


    // $ANTLR start "rule__Slicer__Group_10__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1053:1: rule__Slicer__Group_10__0__Impl : ( 'radius' ) ;
    public final void rule__Slicer__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1057:1: ( ( 'radius' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1058:1: ( 'radius' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1058:1: ( 'radius' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1059:1: 'radius'
            {
             before(grammarAccess.getSlicerAccess().getRadiusKeyword_10_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Slicer__Group_10__0__Impl2088); 
             after(grammarAccess.getSlicerAccess().getRadiusKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_10__0__Impl"


    // $ANTLR start "rule__Slicer__Group_10__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1072:1: rule__Slicer__Group_10__1 : rule__Slicer__Group_10__1__Impl rule__Slicer__Group_10__2 ;
    public final void rule__Slicer__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1076:1: ( rule__Slicer__Group_10__1__Impl rule__Slicer__Group_10__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1077:2: rule__Slicer__Group_10__1__Impl rule__Slicer__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_10__1__Impl_in_rule__Slicer__Group_10__12119);
            rule__Slicer__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_10__2_in_rule__Slicer__Group_10__12122);
            rule__Slicer__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_10__1"


    // $ANTLR start "rule__Slicer__Group_10__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1084:1: rule__Slicer__Group_10__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1088:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1089:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1089:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1090:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_10_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_10__1__Impl2150); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_10__1__Impl"


    // $ANTLR start "rule__Slicer__Group_10__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1103:1: rule__Slicer__Group_10__2 : rule__Slicer__Group_10__2__Impl ;
    public final void rule__Slicer__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1107:1: ( rule__Slicer__Group_10__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1108:2: rule__Slicer__Group_10__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_10__2__Impl_in_rule__Slicer__Group_10__22181);
            rule__Slicer__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_10__2"


    // $ANTLR start "rule__Slicer__Group_10__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1114:1: rule__Slicer__Group_10__2__Impl : ( ( rule__Slicer__RadiusAssignment_10_2 ) ) ;
    public final void rule__Slicer__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1118:1: ( ( ( rule__Slicer__RadiusAssignment_10_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1119:1: ( ( rule__Slicer__RadiusAssignment_10_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1119:1: ( ( rule__Slicer__RadiusAssignment_10_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1120:1: ( rule__Slicer__RadiusAssignment_10_2 )
            {
             before(grammarAccess.getSlicerAccess().getRadiusAssignment_10_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1121:1: ( rule__Slicer__RadiusAssignment_10_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1121:2: rule__Slicer__RadiusAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__RadiusAssignment_10_2_in_rule__Slicer__Group_10__2__Impl2208);
            rule__Slicer__RadiusAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getRadiusAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_10__2__Impl"


    // $ANTLR start "rule__Slicer__Group_11__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1137:1: rule__Slicer__Group_11__0 : rule__Slicer__Group_11__0__Impl rule__Slicer__Group_11__1 ;
    public final void rule__Slicer__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1141:1: ( rule__Slicer__Group_11__0__Impl rule__Slicer__Group_11__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1142:2: rule__Slicer__Group_11__0__Impl rule__Slicer__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__0__Impl_in_rule__Slicer__Group_11__02244);
            rule__Slicer__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__1_in_rule__Slicer__Group_11__02247);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1149:1: rule__Slicer__Group_11__0__Impl : ( 'slicedClass' ) ;
    public final void rule__Slicer__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1153:1: ( ( 'slicedClass' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1154:1: ( 'slicedClass' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1154:1: ( 'slicedClass' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1155:1: 'slicedClass'
            {
             before(grammarAccess.getSlicerAccess().getSlicedClassKeyword_11_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Slicer__Group_11__0__Impl2275); 
             after(grammarAccess.getSlicerAccess().getSlicedClassKeyword_11_0()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1168:1: rule__Slicer__Group_11__1 : rule__Slicer__Group_11__1__Impl rule__Slicer__Group_11__2 ;
    public final void rule__Slicer__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1172:1: ( rule__Slicer__Group_11__1__Impl rule__Slicer__Group_11__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1173:2: rule__Slicer__Group_11__1__Impl rule__Slicer__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__1__Impl_in_rule__Slicer__Group_11__12306);
            rule__Slicer__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__2_in_rule__Slicer__Group_11__12309);
            rule__Slicer__Group_11__2();

            state._fsp--;


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1180:1: rule__Slicer__Group_11__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1184:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1185:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1185:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1186:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_11_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_11__1__Impl2337); 
             after(grammarAccess.getSlicerAccess().getColonKeyword_11_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Slicer__Group_11__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1199:1: rule__Slicer__Group_11__2 : rule__Slicer__Group_11__2__Impl ;
    public final void rule__Slicer__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1203:1: ( rule__Slicer__Group_11__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1204:2: rule__Slicer__Group_11__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__2__Impl_in_rule__Slicer__Group_11__22368);
            rule__Slicer__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_11__2"


    // $ANTLR start "rule__Slicer__Group_11__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1210:1: rule__Slicer__Group_11__2__Impl : ( ( rule__Slicer__SlicedElementsAssignment_11_2 ) ) ;
    public final void rule__Slicer__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1214:1: ( ( ( rule__Slicer__SlicedElementsAssignment_11_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1215:1: ( ( rule__Slicer__SlicedElementsAssignment_11_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1215:1: ( ( rule__Slicer__SlicedElementsAssignment_11_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1216:1: ( rule__Slicer__SlicedElementsAssignment_11_2 )
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_11_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1217:1: ( rule__Slicer__SlicedElementsAssignment_11_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1217:2: rule__Slicer__SlicedElementsAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__SlicedElementsAssignment_11_2_in_rule__Slicer__Group_11__2__Impl2395);
            rule__Slicer__SlicedElementsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_11__2__Impl"


    // $ANTLR start "rule__Slicer__Group_12__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1233:1: rule__Slicer__Group_12__0 : rule__Slicer__Group_12__0__Impl rule__Slicer__Group_12__1 ;
    public final void rule__Slicer__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1237:1: ( rule__Slicer__Group_12__0__Impl rule__Slicer__Group_12__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1238:2: rule__Slicer__Group_12__0__Impl rule__Slicer__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__0__Impl_in_rule__Slicer__Group_12__02431);
            rule__Slicer__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__1_in_rule__Slicer__Group_12__02434);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1245:1: rule__Slicer__Group_12__0__Impl : ( 'slicedProperty' ) ;
    public final void rule__Slicer__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1249:1: ( ( 'slicedProperty' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1250:1: ( 'slicedProperty' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1250:1: ( 'slicedProperty' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1251:1: 'slicedProperty'
            {
             before(grammarAccess.getSlicerAccess().getSlicedPropertyKeyword_12_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Slicer__Group_12__0__Impl2462); 
             after(grammarAccess.getSlicerAccess().getSlicedPropertyKeyword_12_0()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1264:1: rule__Slicer__Group_12__1 : rule__Slicer__Group_12__1__Impl rule__Slicer__Group_12__2 ;
    public final void rule__Slicer__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1268:1: ( rule__Slicer__Group_12__1__Impl rule__Slicer__Group_12__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1269:2: rule__Slicer__Group_12__1__Impl rule__Slicer__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__1__Impl_in_rule__Slicer__Group_12__12493);
            rule__Slicer__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__2_in_rule__Slicer__Group_12__12496);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1276:1: rule__Slicer__Group_12__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1280:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1281:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1281:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1282:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_12_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_12__1__Impl2524); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1295:1: rule__Slicer__Group_12__2 : rule__Slicer__Group_12__2__Impl ;
    public final void rule__Slicer__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1299:1: ( rule__Slicer__Group_12__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1300:2: rule__Slicer__Group_12__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__2__Impl_in_rule__Slicer__Group_12__22555);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1306:1: rule__Slicer__Group_12__2__Impl : ( ( rule__Slicer__SlicedElementsAssignment_12_2 ) ) ;
    public final void rule__Slicer__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1310:1: ( ( ( rule__Slicer__SlicedElementsAssignment_12_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1311:1: ( ( rule__Slicer__SlicedElementsAssignment_12_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1311:1: ( ( rule__Slicer__SlicedElementsAssignment_12_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1312:1: ( rule__Slicer__SlicedElementsAssignment_12_2 )
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_12_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1313:1: ( rule__Slicer__SlicedElementsAssignment_12_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1313:2: rule__Slicer__SlicedElementsAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__SlicedElementsAssignment_12_2_in_rule__Slicer__Group_12__2__Impl2582);
            rule__Slicer__SlicedElementsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_12_2()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1329:1: rule__Slicer__Group_13__0 : rule__Slicer__Group_13__0__Impl rule__Slicer__Group_13__1 ;
    public final void rule__Slicer__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1333:1: ( rule__Slicer__Group_13__0__Impl rule__Slicer__Group_13__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1334:2: rule__Slicer__Group_13__0__Impl rule__Slicer__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__0__Impl_in_rule__Slicer__Group_13__02618);
            rule__Slicer__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__1_in_rule__Slicer__Group_13__02621);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1341:1: rule__Slicer__Group_13__0__Impl : ( 'onStart' ) ;
    public final void rule__Slicer__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1345:1: ( ( 'onStart' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1346:1: ( 'onStart' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1346:1: ( 'onStart' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1347:1: 'onStart'
            {
             before(grammarAccess.getSlicerAccess().getOnStartKeyword_13_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Slicer__Group_13__0__Impl2649); 
             after(grammarAccess.getSlicerAccess().getOnStartKeyword_13_0()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1360:1: rule__Slicer__Group_13__1 : rule__Slicer__Group_13__1__Impl rule__Slicer__Group_13__2 ;
    public final void rule__Slicer__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1364:1: ( rule__Slicer__Group_13__1__Impl rule__Slicer__Group_13__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1365:2: rule__Slicer__Group_13__1__Impl rule__Slicer__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__1__Impl_in_rule__Slicer__Group_13__12680);
            rule__Slicer__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__2_in_rule__Slicer__Group_13__12683);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1372:1: rule__Slicer__Group_13__1__Impl : ( '[[' ) ;
    public final void rule__Slicer__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1376:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1377:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1377:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1378:1: '[['
            {
             before(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_13_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Slicer__Group_13__1__Impl2711); 
             after(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_13_1()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1391:1: rule__Slicer__Group_13__2 : rule__Slicer__Group_13__2__Impl rule__Slicer__Group_13__3 ;
    public final void rule__Slicer__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1395:1: ( rule__Slicer__Group_13__2__Impl rule__Slicer__Group_13__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1396:2: rule__Slicer__Group_13__2__Impl rule__Slicer__Group_13__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__2__Impl_in_rule__Slicer__Group_13__22742);
            rule__Slicer__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__3_in_rule__Slicer__Group_13__22745);
            rule__Slicer__Group_13__3();

            state._fsp--;


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1403:1: rule__Slicer__Group_13__2__Impl : ( ( rule__Slicer__OnStartAssignment_13_2 ) ) ;
    public final void rule__Slicer__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1407:1: ( ( ( rule__Slicer__OnStartAssignment_13_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1408:1: ( ( rule__Slicer__OnStartAssignment_13_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1408:1: ( ( rule__Slicer__OnStartAssignment_13_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1409:1: ( rule__Slicer__OnStartAssignment_13_2 )
            {
             before(grammarAccess.getSlicerAccess().getOnStartAssignment_13_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1410:1: ( rule__Slicer__OnStartAssignment_13_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1410:2: rule__Slicer__OnStartAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__OnStartAssignment_13_2_in_rule__Slicer__Group_13__2__Impl2772);
            rule__Slicer__OnStartAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getOnStartAssignment_13_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Slicer__Group_13__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1420:1: rule__Slicer__Group_13__3 : rule__Slicer__Group_13__3__Impl ;
    public final void rule__Slicer__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1424:1: ( rule__Slicer__Group_13__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1425:2: rule__Slicer__Group_13__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__3__Impl_in_rule__Slicer__Group_13__32802);
            rule__Slicer__Group_13__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_13__3"


    // $ANTLR start "rule__Slicer__Group_13__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1431:1: rule__Slicer__Group_13__3__Impl : ( ']]' ) ;
    public final void rule__Slicer__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1435:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1436:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1436:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1437:1: ']]'
            {
             before(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_13_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Slicer__Group_13__3__Impl2830); 
             after(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_13__3__Impl"


    // $ANTLR start "rule__Slicer__Group_14__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1458:1: rule__Slicer__Group_14__0 : rule__Slicer__Group_14__0__Impl rule__Slicer__Group_14__1 ;
    public final void rule__Slicer__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1462:1: ( rule__Slicer__Group_14__0__Impl rule__Slicer__Group_14__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1463:2: rule__Slicer__Group_14__0__Impl rule__Slicer__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__0__Impl_in_rule__Slicer__Group_14__02869);
            rule__Slicer__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__1_in_rule__Slicer__Group_14__02872);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1470:1: rule__Slicer__Group_14__0__Impl : ( 'onEnd' ) ;
    public final void rule__Slicer__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1474:1: ( ( 'onEnd' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1475:1: ( 'onEnd' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1475:1: ( 'onEnd' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1476:1: 'onEnd'
            {
             before(grammarAccess.getSlicerAccess().getOnEndKeyword_14_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Slicer__Group_14__0__Impl2900); 
             after(grammarAccess.getSlicerAccess().getOnEndKeyword_14_0()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1489:1: rule__Slicer__Group_14__1 : rule__Slicer__Group_14__1__Impl rule__Slicer__Group_14__2 ;
    public final void rule__Slicer__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1493:1: ( rule__Slicer__Group_14__1__Impl rule__Slicer__Group_14__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1494:2: rule__Slicer__Group_14__1__Impl rule__Slicer__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__1__Impl_in_rule__Slicer__Group_14__12931);
            rule__Slicer__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__2_in_rule__Slicer__Group_14__12934);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1501:1: rule__Slicer__Group_14__1__Impl : ( '[[' ) ;
    public final void rule__Slicer__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1505:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1506:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1506:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1507:1: '[['
            {
             before(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_14_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Slicer__Group_14__1__Impl2962); 
             after(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_14_1()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1520:1: rule__Slicer__Group_14__2 : rule__Slicer__Group_14__2__Impl rule__Slicer__Group_14__3 ;
    public final void rule__Slicer__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1524:1: ( rule__Slicer__Group_14__2__Impl rule__Slicer__Group_14__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1525:2: rule__Slicer__Group_14__2__Impl rule__Slicer__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__2__Impl_in_rule__Slicer__Group_14__22993);
            rule__Slicer__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__3_in_rule__Slicer__Group_14__22996);
            rule__Slicer__Group_14__3();

            state._fsp--;


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1532:1: rule__Slicer__Group_14__2__Impl : ( ( rule__Slicer__OnEndAssignment_14_2 ) ) ;
    public final void rule__Slicer__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1536:1: ( ( ( rule__Slicer__OnEndAssignment_14_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1537:1: ( ( rule__Slicer__OnEndAssignment_14_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1537:1: ( ( rule__Slicer__OnEndAssignment_14_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1538:1: ( rule__Slicer__OnEndAssignment_14_2 )
            {
             before(grammarAccess.getSlicerAccess().getOnEndAssignment_14_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1539:1: ( rule__Slicer__OnEndAssignment_14_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1539:2: rule__Slicer__OnEndAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__OnEndAssignment_14_2_in_rule__Slicer__Group_14__2__Impl3023);
            rule__Slicer__OnEndAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getOnEndAssignment_14_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Slicer__Group_14__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1549:1: rule__Slicer__Group_14__3 : rule__Slicer__Group_14__3__Impl ;
    public final void rule__Slicer__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1553:1: ( rule__Slicer__Group_14__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1554:2: rule__Slicer__Group_14__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__3__Impl_in_rule__Slicer__Group_14__33053);
            rule__Slicer__Group_14__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_14__3"


    // $ANTLR start "rule__Slicer__Group_14__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1560:1: rule__Slicer__Group_14__3__Impl : ( ']]' ) ;
    public final void rule__Slicer__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1564:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1565:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1565:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1566:1: ']]'
            {
             before(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_14_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Slicer__Group_14__3__Impl3081); 
             after(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_14__3__Impl"


    // $ANTLR start "rule__Slicer__Group_15__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1587:1: rule__Slicer__Group_15__0 : rule__Slicer__Group_15__0__Impl rule__Slicer__Group_15__1 ;
    public final void rule__Slicer__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1591:1: ( rule__Slicer__Group_15__0__Impl rule__Slicer__Group_15__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1592:2: rule__Slicer__Group_15__0__Impl rule__Slicer__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__0__Impl_in_rule__Slicer__Group_15__03120);
            rule__Slicer__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__1_in_rule__Slicer__Group_15__03123);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1599:1: rule__Slicer__Group_15__0__Impl : ( 'helper' ) ;
    public final void rule__Slicer__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1603:1: ( ( 'helper' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1604:1: ( 'helper' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1604:1: ( 'helper' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1605:1: 'helper'
            {
             before(grammarAccess.getSlicerAccess().getHelperKeyword_15_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Slicer__Group_15__0__Impl3151); 
             after(grammarAccess.getSlicerAccess().getHelperKeyword_15_0()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1618:1: rule__Slicer__Group_15__1 : rule__Slicer__Group_15__1__Impl rule__Slicer__Group_15__2 ;
    public final void rule__Slicer__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1622:1: ( rule__Slicer__Group_15__1__Impl rule__Slicer__Group_15__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1623:2: rule__Slicer__Group_15__1__Impl rule__Slicer__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__1__Impl_in_rule__Slicer__Group_15__13182);
            rule__Slicer__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__2_in_rule__Slicer__Group_15__13185);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1630:1: rule__Slicer__Group_15__1__Impl : ( '[[' ) ;
    public final void rule__Slicer__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1634:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1635:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1635:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1636:1: '[['
            {
             before(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_15_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Slicer__Group_15__1__Impl3213); 
             after(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_15_1()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1649:1: rule__Slicer__Group_15__2 : rule__Slicer__Group_15__2__Impl rule__Slicer__Group_15__3 ;
    public final void rule__Slicer__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1653:1: ( rule__Slicer__Group_15__2__Impl rule__Slicer__Group_15__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1654:2: rule__Slicer__Group_15__2__Impl rule__Slicer__Group_15__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__2__Impl_in_rule__Slicer__Group_15__23244);
            rule__Slicer__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__3_in_rule__Slicer__Group_15__23247);
            rule__Slicer__Group_15__3();

            state._fsp--;


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1661:1: rule__Slicer__Group_15__2__Impl : ( ( rule__Slicer__HelperAssignment_15_2 ) ) ;
    public final void rule__Slicer__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1665:1: ( ( ( rule__Slicer__HelperAssignment_15_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1666:1: ( ( rule__Slicer__HelperAssignment_15_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1666:1: ( ( rule__Slicer__HelperAssignment_15_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1667:1: ( rule__Slicer__HelperAssignment_15_2 )
            {
             before(grammarAccess.getSlicerAccess().getHelperAssignment_15_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1668:1: ( rule__Slicer__HelperAssignment_15_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1668:2: rule__Slicer__HelperAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__HelperAssignment_15_2_in_rule__Slicer__Group_15__2__Impl3274);
            rule__Slicer__HelperAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicerAccess().getHelperAssignment_15_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Slicer__Group_15__3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1678:1: rule__Slicer__Group_15__3 : rule__Slicer__Group_15__3__Impl ;
    public final void rule__Slicer__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1682:1: ( rule__Slicer__Group_15__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1683:2: rule__Slicer__Group_15__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__3__Impl_in_rule__Slicer__Group_15__33304);
            rule__Slicer__Group_15__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_15__3"


    // $ANTLR start "rule__Slicer__Group_15__3__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1689:1: rule__Slicer__Group_15__3__Impl : ( ']]' ) ;
    public final void rule__Slicer__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1693:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1694:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1694:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1695:1: ']]'
            {
             before(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_15_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Slicer__Group_15__3__Impl3332); 
             after(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__Group_15__3__Impl"


    // $ANTLR start "rule__QName__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1716:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1720:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1721:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__03371);
            rule__QName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__1_in_rule__QName__Group__03374);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1728:1: rule__QName__Group__0__Impl : ( ruleEString ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1732:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1733:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1733:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1734:1: ruleEString
            {
             before(grammarAccess.getQNameAccess().getEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QName__Group__0__Impl3401);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1745:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1749:1: ( rule__QName__Group__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1750:2: rule__QName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__13430);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1756:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1760:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1761:1: ( ( rule__QName__Group_1__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1761:1: ( ( rule__QName__Group_1__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1762:1: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1763:1: ( rule__QName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1763:2: rule__QName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl3457);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1777:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1781:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1782:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__03492);
            rule__QName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__03495);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1789:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1793:1: ( ( '.' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1794:1: ( '.' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1794:1: ( '.' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1795:1: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__QName__Group_1__0__Impl3523); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1808:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1812:1: ( rule__QName__Group_1__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1813:2: rule__QName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__13554);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1819:1: rule__QName__Group_1__1__Impl : ( ruleEString ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1823:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1824:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1824:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1825:1: ruleEString
            {
             before(grammarAccess.getQNameAccess().getEStringParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QName__Group_1__1__Impl3581);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1840:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1844:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1845:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03614);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03617);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1852:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1856:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1857:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1857:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1858:1: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1859:1: ( rule__Constraint__NameAssignment_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1859:2: rule__Constraint__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__NameAssignment_0_in_rule__Constraint__Group__0__Impl3644);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1869:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1873:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1874:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13674);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13677);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1881:1: rule__Constraint__Group__1__Impl : ( '[[' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1885:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1886:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1886:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1887:1: '[['
            {
             before(grammarAccess.getConstraintAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Constraint__Group__1__Impl3705); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1900:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1904:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1905:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23736);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23739);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1912:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpressionAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1916:1: ( ( ( rule__Constraint__ExpressionAssignment_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1917:1: ( ( rule__Constraint__ExpressionAssignment_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1917:1: ( ( rule__Constraint__ExpressionAssignment_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1918:1: ( rule__Constraint__ExpressionAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpressionAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1919:1: ( rule__Constraint__ExpressionAssignment_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1919:2: rule__Constraint__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__ExpressionAssignment_2_in_rule__Constraint__Group__2__Impl3766);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1929:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1933:1: ( rule__Constraint__Group__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1934:2: rule__Constraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33796);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1940:1: rule__Constraint__Group__3__Impl : ( ']]' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1944:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1945:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1945:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1946:1: ']]'
            {
             before(grammarAccess.getConstraintAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Constraint__Group__3__Impl3824); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1967:1: rule__Radius__Group__0 : rule__Radius__Group__0__Impl rule__Radius__Group__1 ;
    public final void rule__Radius__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1971:1: ( rule__Radius__Group__0__Impl rule__Radius__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1972:2: rule__Radius__Group__0__Impl rule__Radius__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__0__Impl_in_rule__Radius__Group__03863);
            rule__Radius__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__1_in_rule__Radius__Group__03866);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1979:1: rule__Radius__Group__0__Impl : ( () ) ;
    public final void rule__Radius__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1983:1: ( ( () ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1984:1: ( () )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1984:1: ( () )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1985:1: ()
            {
             before(grammarAccess.getRadiusAccess().getRadiusAction_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1986:1: ()
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1988:1: 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1998:1: rule__Radius__Group__1 : rule__Radius__Group__1__Impl ;
    public final void rule__Radius__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2002:1: ( rule__Radius__Group__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2003:2: rule__Radius__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__1__Impl_in_rule__Radius__Group__13924);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2009:1: rule__Radius__Group__1__Impl : ( ( rule__Radius__Group_1__0 )? ) ;
    public final void rule__Radius__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2013:1: ( ( ( rule__Radius__Group_1__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2014:1: ( ( rule__Radius__Group_1__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2014:1: ( ( rule__Radius__Group_1__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2015:1: ( rule__Radius__Group_1__0 )?
            {
             before(grammarAccess.getRadiusAccess().getGroup_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2016:1: ( rule__Radius__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2016:2: rule__Radius__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__0_in_rule__Radius__Group__1__Impl3951);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2030:1: rule__Radius__Group_1__0 : rule__Radius__Group_1__0__Impl rule__Radius__Group_1__1 ;
    public final void rule__Radius__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2034:1: ( rule__Radius__Group_1__0__Impl rule__Radius__Group_1__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2035:2: rule__Radius__Group_1__0__Impl rule__Radius__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__0__Impl_in_rule__Radius__Group_1__03986);
            rule__Radius__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__1_in_rule__Radius__Group_1__03989);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2042:1: rule__Radius__Group_1__0__Impl : ( ( rule__Radius__FocusedClassesAssignment_1_0 ) ) ;
    public final void rule__Radius__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2046:1: ( ( ( rule__Radius__FocusedClassesAssignment_1_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2047:1: ( ( rule__Radius__FocusedClassesAssignment_1_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2047:1: ( ( rule__Radius__FocusedClassesAssignment_1_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2048:1: ( rule__Radius__FocusedClassesAssignment_1_0 )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesAssignment_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2049:1: ( rule__Radius__FocusedClassesAssignment_1_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2049:2: rule__Radius__FocusedClassesAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__FocusedClassesAssignment_1_0_in_rule__Radius__Group_1__0__Impl4016);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2059:1: rule__Radius__Group_1__1 : rule__Radius__Group_1__1__Impl ;
    public final void rule__Radius__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2063:1: ( rule__Radius__Group_1__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2064:2: rule__Radius__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__1__Impl_in_rule__Radius__Group_1__14046);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2070:1: rule__Radius__Group_1__1__Impl : ( ( rule__Radius__Group_1_1__0 )* ) ;
    public final void rule__Radius__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2074:1: ( ( ( rule__Radius__Group_1_1__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2075:1: ( ( rule__Radius__Group_1_1__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2075:1: ( ( rule__Radius__Group_1_1__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2076:1: ( rule__Radius__Group_1_1__0 )*
            {
             before(grammarAccess.getRadiusAccess().getGroup_1_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2077:1: ( rule__Radius__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2077:2: rule__Radius__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__0_in_rule__Radius__Group_1__1__Impl4073);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2091:1: rule__Radius__Group_1_1__0 : rule__Radius__Group_1_1__0__Impl rule__Radius__Group_1_1__1 ;
    public final void rule__Radius__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2095:1: ( rule__Radius__Group_1_1__0__Impl rule__Radius__Group_1_1__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2096:2: rule__Radius__Group_1_1__0__Impl rule__Radius__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__0__Impl_in_rule__Radius__Group_1_1__04108);
            rule__Radius__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__1_in_rule__Radius__Group_1_1__04111);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2103:1: rule__Radius__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Radius__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2107:1: ( ( ',' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2108:1: ( ',' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2108:1: ( ',' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2109:1: ','
            {
             before(grammarAccess.getRadiusAccess().getCommaKeyword_1_1_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Radius__Group_1_1__0__Impl4139); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2122:1: rule__Radius__Group_1_1__1 : rule__Radius__Group_1_1__1__Impl ;
    public final void rule__Radius__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2126:1: ( rule__Radius__Group_1_1__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2127:2: rule__Radius__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__1__Impl_in_rule__Radius__Group_1_1__14170);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2133:1: rule__Radius__Group_1_1__1__Impl : ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) ) ;
    public final void rule__Radius__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2137:1: ( ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2138:1: ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2138:1: ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2139:1: ( rule__Radius__FocusedClassesAssignment_1_1_1 )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesAssignment_1_1_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2140:1: ( rule__Radius__FocusedClassesAssignment_1_1_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2140:2: rule__Radius__FocusedClassesAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__FocusedClassesAssignment_1_1_1_in_rule__Radius__Group_1_1__1__Impl4197);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2154:1: rule__SlicedClass__Group__0 : rule__SlicedClass__Group__0__Impl rule__SlicedClass__Group__1 ;
    public final void rule__SlicedClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2158:1: ( rule__SlicedClass__Group__0__Impl rule__SlicedClass__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2159:2: rule__SlicedClass__Group__0__Impl rule__SlicedClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__0__Impl_in_rule__SlicedClass__Group__04231);
            rule__SlicedClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__1_in_rule__SlicedClass__Group__04234);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2166:1: rule__SlicedClass__Group__0__Impl : ( ( rule__SlicedClass__DomainAssignment_0 ) ) ;
    public final void rule__SlicedClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2170:1: ( ( ( rule__SlicedClass__DomainAssignment_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2171:1: ( ( rule__SlicedClass__DomainAssignment_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2171:1: ( ( rule__SlicedClass__DomainAssignment_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2172:1: ( rule__SlicedClass__DomainAssignment_0 )
            {
             before(grammarAccess.getSlicedClassAccess().getDomainAssignment_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2173:1: ( rule__SlicedClass__DomainAssignment_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2173:2: rule__SlicedClass__DomainAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__DomainAssignment_0_in_rule__SlicedClass__Group__0__Impl4261);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2183:1: rule__SlicedClass__Group__1 : rule__SlicedClass__Group__1__Impl rule__SlicedClass__Group__2 ;
    public final void rule__SlicedClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2187:1: ( rule__SlicedClass__Group__1__Impl rule__SlicedClass__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2188:2: rule__SlicedClass__Group__1__Impl rule__SlicedClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__1__Impl_in_rule__SlicedClass__Group__14291);
            rule__SlicedClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__2_in_rule__SlicedClass__Group__14294);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2195:1: rule__SlicedClass__Group__1__Impl : ( ( rule__SlicedClass__IsOptionAssignment_1 )? ) ;
    public final void rule__SlicedClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2199:1: ( ( ( rule__SlicedClass__IsOptionAssignment_1 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2200:1: ( ( rule__SlicedClass__IsOptionAssignment_1 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2200:1: ( ( rule__SlicedClass__IsOptionAssignment_1 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2201:1: ( rule__SlicedClass__IsOptionAssignment_1 )?
            {
             before(grammarAccess.getSlicedClassAccess().getIsOptionAssignment_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2202:1: ( rule__SlicedClass__IsOptionAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2202:2: rule__SlicedClass__IsOptionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__IsOptionAssignment_1_in_rule__SlicedClass__Group__1__Impl4321);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2212:1: rule__SlicedClass__Group__2 : rule__SlicedClass__Group__2__Impl rule__SlicedClass__Group__3 ;
    public final void rule__SlicedClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2216:1: ( rule__SlicedClass__Group__2__Impl rule__SlicedClass__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2217:2: rule__SlicedClass__Group__2__Impl rule__SlicedClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__2__Impl_in_rule__SlicedClass__Group__24352);
            rule__SlicedClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__3_in_rule__SlicedClass__Group__24355);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2224:1: rule__SlicedClass__Group__2__Impl : ( ( rule__SlicedClass__CtxAssignment_2 )? ) ;
    public final void rule__SlicedClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2228:1: ( ( ( rule__SlicedClass__CtxAssignment_2 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2229:1: ( ( rule__SlicedClass__CtxAssignment_2 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2229:1: ( ( rule__SlicedClass__CtxAssignment_2 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2230:1: ( rule__SlicedClass__CtxAssignment_2 )?
            {
             before(grammarAccess.getSlicedClassAccess().getCtxAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2231:1: ( rule__SlicedClass__CtxAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2231:2: rule__SlicedClass__CtxAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__CtxAssignment_2_in_rule__SlicedClass__Group__2__Impl4382);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2241:1: rule__SlicedClass__Group__3 : rule__SlicedClass__Group__3__Impl rule__SlicedClass__Group__4 ;
    public final void rule__SlicedClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2245:1: ( rule__SlicedClass__Group__3__Impl rule__SlicedClass__Group__4 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2246:2: rule__SlicedClass__Group__3__Impl rule__SlicedClass__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__3__Impl_in_rule__SlicedClass__Group__34413);
            rule__SlicedClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__4_in_rule__SlicedClass__Group__34416);
            rule__SlicedClass__Group__4();

            state._fsp--;


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2253:1: rule__SlicedClass__Group__3__Impl : ( ( rule__SlicedClass__Group_3__0 )? ) ;
    public final void rule__SlicedClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2257:1: ( ( ( rule__SlicedClass__Group_3__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2258:1: ( ( rule__SlicedClass__Group_3__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2258:1: ( ( rule__SlicedClass__Group_3__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2259:1: ( rule__SlicedClass__Group_3__0 )?
            {
             before(grammarAccess.getSlicedClassAccess().getGroup_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2260:1: ( rule__SlicedClass__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2260:2: rule__SlicedClass__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__0_in_rule__SlicedClass__Group__3__Impl4443);
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


    // $ANTLR start "rule__SlicedClass__Group__4"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2270:1: rule__SlicedClass__Group__4 : rule__SlicedClass__Group__4__Impl ;
    public final void rule__SlicedClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2274:1: ( rule__SlicedClass__Group__4__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2275:2: rule__SlicedClass__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__4__Impl_in_rule__SlicedClass__Group__44474);
            rule__SlicedClass__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__4"


    // $ANTLR start "rule__SlicedClass__Group__4__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2281:1: rule__SlicedClass__Group__4__Impl : ( ( rule__SlicedClass__Group_4__0 )* ) ;
    public final void rule__SlicedClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2285:1: ( ( ( rule__SlicedClass__Group_4__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2286:1: ( ( rule__SlicedClass__Group_4__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2286:1: ( ( rule__SlicedClass__Group_4__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2287:1: ( rule__SlicedClass__Group_4__0 )*
            {
             before(grammarAccess.getSlicedClassAccess().getGroup_4()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2288:1: ( rule__SlicedClass__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2288:2: rule__SlicedClass__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_4__0_in_rule__SlicedClass__Group__4__Impl4501);
            	    rule__SlicedClass__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSlicedClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group__4__Impl"


    // $ANTLR start "rule__SlicedClass__Group_3__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2308:1: rule__SlicedClass__Group_3__0 : rule__SlicedClass__Group_3__0__Impl rule__SlicedClass__Group_3__1 ;
    public final void rule__SlicedClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2312:1: ( rule__SlicedClass__Group_3__0__Impl rule__SlicedClass__Group_3__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2313:2: rule__SlicedClass__Group_3__0__Impl rule__SlicedClass__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__0__Impl_in_rule__SlicedClass__Group_3__04542);
            rule__SlicedClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__1_in_rule__SlicedClass__Group_3__04545);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2320:1: rule__SlicedClass__Group_3__0__Impl : ( '[[' ) ;
    public final void rule__SlicedClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2324:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2325:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2325:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2326:1: '[['
            {
             before(grammarAccess.getSlicedClassAccess().getLeftSquareBracketLeftSquareBracketKeyword_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SlicedClass__Group_3__0__Impl4573); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2339:1: rule__SlicedClass__Group_3__1 : rule__SlicedClass__Group_3__1__Impl rule__SlicedClass__Group_3__2 ;
    public final void rule__SlicedClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2343:1: ( rule__SlicedClass__Group_3__1__Impl rule__SlicedClass__Group_3__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2344:2: rule__SlicedClass__Group_3__1__Impl rule__SlicedClass__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__1__Impl_in_rule__SlicedClass__Group_3__14604);
            rule__SlicedClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__2_in_rule__SlicedClass__Group_3__14607);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2351:1: rule__SlicedClass__Group_3__1__Impl : ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) ) ;
    public final void rule__SlicedClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2355:1: ( ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2356:1: ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2356:1: ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2357:1: ( rule__SlicedClass__ExpressionAssignment_3_1 )
            {
             before(grammarAccess.getSlicedClassAccess().getExpressionAssignment_3_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2358:1: ( rule__SlicedClass__ExpressionAssignment_3_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2358:2: rule__SlicedClass__ExpressionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__ExpressionAssignment_3_1_in_rule__SlicedClass__Group_3__1__Impl4634);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2368:1: rule__SlicedClass__Group_3__2 : rule__SlicedClass__Group_3__2__Impl ;
    public final void rule__SlicedClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2372:1: ( rule__SlicedClass__Group_3__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2373:2: rule__SlicedClass__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__2__Impl_in_rule__SlicedClass__Group_3__24664);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2379:1: rule__SlicedClass__Group_3__2__Impl : ( ']]' ) ;
    public final void rule__SlicedClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2383:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2384:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2384:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2385:1: ']]'
            {
             before(grammarAccess.getSlicedClassAccess().getRightSquareBracketRightSquareBracketKeyword_3_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SlicedClass__Group_3__2__Impl4692); 
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


    // $ANTLR start "rule__SlicedClass__Group_4__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2404:1: rule__SlicedClass__Group_4__0 : rule__SlicedClass__Group_4__0__Impl rule__SlicedClass__Group_4__1 ;
    public final void rule__SlicedClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2408:1: ( rule__SlicedClass__Group_4__0__Impl rule__SlicedClass__Group_4__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2409:2: rule__SlicedClass__Group_4__0__Impl rule__SlicedClass__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_4__0__Impl_in_rule__SlicedClass__Group_4__04729);
            rule__SlicedClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_4__1_in_rule__SlicedClass__Group_4__04732);
            rule__SlicedClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_4__0"


    // $ANTLR start "rule__SlicedClass__Group_4__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2416:1: rule__SlicedClass__Group_4__0__Impl : ( 'constraint' ) ;
    public final void rule__SlicedClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2420:1: ( ( 'constraint' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2421:1: ( 'constraint' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2421:1: ( 'constraint' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2422:1: 'constraint'
            {
             before(grammarAccess.getSlicedClassAccess().getConstraintKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__SlicedClass__Group_4__0__Impl4760); 
             after(grammarAccess.getSlicedClassAccess().getConstraintKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_4__0__Impl"


    // $ANTLR start "rule__SlicedClass__Group_4__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2435:1: rule__SlicedClass__Group_4__1 : rule__SlicedClass__Group_4__1__Impl rule__SlicedClass__Group_4__2 ;
    public final void rule__SlicedClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2439:1: ( rule__SlicedClass__Group_4__1__Impl rule__SlicedClass__Group_4__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2440:2: rule__SlicedClass__Group_4__1__Impl rule__SlicedClass__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_4__1__Impl_in_rule__SlicedClass__Group_4__14791);
            rule__SlicedClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_4__2_in_rule__SlicedClass__Group_4__14794);
            rule__SlicedClass__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_4__1"


    // $ANTLR start "rule__SlicedClass__Group_4__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2447:1: rule__SlicedClass__Group_4__1__Impl : ( ':' ) ;
    public final void rule__SlicedClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2451:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2452:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2452:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2453:1: ':'
            {
             before(grammarAccess.getSlicedClassAccess().getColonKeyword_4_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__SlicedClass__Group_4__1__Impl4822); 
             after(grammarAccess.getSlicedClassAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_4__1__Impl"


    // $ANTLR start "rule__SlicedClass__Group_4__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2466:1: rule__SlicedClass__Group_4__2 : rule__SlicedClass__Group_4__2__Impl ;
    public final void rule__SlicedClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2470:1: ( rule__SlicedClass__Group_4__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2471:2: rule__SlicedClass__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_4__2__Impl_in_rule__SlicedClass__Group_4__24853);
            rule__SlicedClass__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_4__2"


    // $ANTLR start "rule__SlicedClass__Group_4__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2477:1: rule__SlicedClass__Group_4__2__Impl : ( ( rule__SlicedClass__ConstraintsAssignment_4_2 ) ) ;
    public final void rule__SlicedClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2481:1: ( ( ( rule__SlicedClass__ConstraintsAssignment_4_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2482:1: ( ( rule__SlicedClass__ConstraintsAssignment_4_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2482:1: ( ( rule__SlicedClass__ConstraintsAssignment_4_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2483:1: ( rule__SlicedClass__ConstraintsAssignment_4_2 )
            {
             before(grammarAccess.getSlicedClassAccess().getConstraintsAssignment_4_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2484:1: ( rule__SlicedClass__ConstraintsAssignment_4_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2484:2: rule__SlicedClass__ConstraintsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__ConstraintsAssignment_4_2_in_rule__SlicedClass__Group_4__2__Impl4880);
            rule__SlicedClass__ConstraintsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicedClassAccess().getConstraintsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__Group_4__2__Impl"


    // $ANTLR start "rule__SlicedProperty__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2500:1: rule__SlicedProperty__Group__0 : rule__SlicedProperty__Group__0__Impl rule__SlicedProperty__Group__1 ;
    public final void rule__SlicedProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2504:1: ( rule__SlicedProperty__Group__0__Impl rule__SlicedProperty__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2505:2: rule__SlicedProperty__Group__0__Impl rule__SlicedProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__0__Impl_in_rule__SlicedProperty__Group__04916);
            rule__SlicedProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__1_in_rule__SlicedProperty__Group__04919);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2512:1: rule__SlicedProperty__Group__0__Impl : ( ( rule__SlicedProperty__DomainAssignment_0 ) ) ;
    public final void rule__SlicedProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2516:1: ( ( ( rule__SlicedProperty__DomainAssignment_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2517:1: ( ( rule__SlicedProperty__DomainAssignment_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2517:1: ( ( rule__SlicedProperty__DomainAssignment_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2518:1: ( rule__SlicedProperty__DomainAssignment_0 )
            {
             before(grammarAccess.getSlicedPropertyAccess().getDomainAssignment_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2519:1: ( rule__SlicedProperty__DomainAssignment_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2519:2: rule__SlicedProperty__DomainAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__DomainAssignment_0_in_rule__SlicedProperty__Group__0__Impl4946);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2529:1: rule__SlicedProperty__Group__1 : rule__SlicedProperty__Group__1__Impl rule__SlicedProperty__Group__2 ;
    public final void rule__SlicedProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2533:1: ( rule__SlicedProperty__Group__1__Impl rule__SlicedProperty__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2534:2: rule__SlicedProperty__Group__1__Impl rule__SlicedProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__1__Impl_in_rule__SlicedProperty__Group__14976);
            rule__SlicedProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__2_in_rule__SlicedProperty__Group__14979);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2541:1: rule__SlicedProperty__Group__1__Impl : ( ( rule__SlicedProperty__IsOptionAssignment_1 )? ) ;
    public final void rule__SlicedProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2545:1: ( ( ( rule__SlicedProperty__IsOptionAssignment_1 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2546:1: ( ( rule__SlicedProperty__IsOptionAssignment_1 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2546:1: ( ( rule__SlicedProperty__IsOptionAssignment_1 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2547:1: ( rule__SlicedProperty__IsOptionAssignment_1 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getIsOptionAssignment_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2548:1: ( rule__SlicedProperty__IsOptionAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2548:2: rule__SlicedProperty__IsOptionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__IsOptionAssignment_1_in_rule__SlicedProperty__Group__1__Impl5006);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2558:1: rule__SlicedProperty__Group__2 : rule__SlicedProperty__Group__2__Impl rule__SlicedProperty__Group__3 ;
    public final void rule__SlicedProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2562:1: ( rule__SlicedProperty__Group__2__Impl rule__SlicedProperty__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2563:2: rule__SlicedProperty__Group__2__Impl rule__SlicedProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__2__Impl_in_rule__SlicedProperty__Group__25037);
            rule__SlicedProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__3_in_rule__SlicedProperty__Group__25040);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2570:1: rule__SlicedProperty__Group__2__Impl : ( ( rule__SlicedProperty__OppositeAssignment_2 )? ) ;
    public final void rule__SlicedProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2574:1: ( ( ( rule__SlicedProperty__OppositeAssignment_2 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2575:1: ( ( rule__SlicedProperty__OppositeAssignment_2 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2575:1: ( ( rule__SlicedProperty__OppositeAssignment_2 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2576:1: ( rule__SlicedProperty__OppositeAssignment_2 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getOppositeAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2577:1: ( rule__SlicedProperty__OppositeAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2577:2: rule__SlicedProperty__OppositeAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__OppositeAssignment_2_in_rule__SlicedProperty__Group__2__Impl5067);
                    rule__SlicedProperty__OppositeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedPropertyAccess().getOppositeAssignment_2()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2587:1: rule__SlicedProperty__Group__3 : rule__SlicedProperty__Group__3__Impl rule__SlicedProperty__Group__4 ;
    public final void rule__SlicedProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2591:1: ( rule__SlicedProperty__Group__3__Impl rule__SlicedProperty__Group__4 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2592:2: rule__SlicedProperty__Group__3__Impl rule__SlicedProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__3__Impl_in_rule__SlicedProperty__Group__35098);
            rule__SlicedProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__4_in_rule__SlicedProperty__Group__35101);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2599:1: rule__SlicedProperty__Group__3__Impl : ( ( rule__SlicedProperty__SrcAssignment_3 )? ) ;
    public final void rule__SlicedProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2603:1: ( ( ( rule__SlicedProperty__SrcAssignment_3 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2604:1: ( ( rule__SlicedProperty__SrcAssignment_3 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2604:1: ( ( rule__SlicedProperty__SrcAssignment_3 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2605:1: ( rule__SlicedProperty__SrcAssignment_3 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getSrcAssignment_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2606:1: ( rule__SlicedProperty__SrcAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2606:2: rule__SlicedProperty__SrcAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__SrcAssignment_3_in_rule__SlicedProperty__Group__3__Impl5128);
                    rule__SlicedProperty__SrcAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedPropertyAccess().getSrcAssignment_3()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2616:1: rule__SlicedProperty__Group__4 : rule__SlicedProperty__Group__4__Impl rule__SlicedProperty__Group__5 ;
    public final void rule__SlicedProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2620:1: ( rule__SlicedProperty__Group__4__Impl rule__SlicedProperty__Group__5 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2621:2: rule__SlicedProperty__Group__4__Impl rule__SlicedProperty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__4__Impl_in_rule__SlicedProperty__Group__45159);
            rule__SlicedProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__5_in_rule__SlicedProperty__Group__45162);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2628:1: rule__SlicedProperty__Group__4__Impl : ( ( rule__SlicedProperty__TgtAssignment_4 )? ) ;
    public final void rule__SlicedProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2632:1: ( ( ( rule__SlicedProperty__TgtAssignment_4 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2633:1: ( ( rule__SlicedProperty__TgtAssignment_4 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2633:1: ( ( rule__SlicedProperty__TgtAssignment_4 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2634:1: ( rule__SlicedProperty__TgtAssignment_4 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getTgtAssignment_4()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2635:1: ( rule__SlicedProperty__TgtAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2635:2: rule__SlicedProperty__TgtAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__TgtAssignment_4_in_rule__SlicedProperty__Group__4__Impl5189);
                    rule__SlicedProperty__TgtAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSlicedPropertyAccess().getTgtAssignment_4()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2645:1: rule__SlicedProperty__Group__5 : rule__SlicedProperty__Group__5__Impl rule__SlicedProperty__Group__6 ;
    public final void rule__SlicedProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2649:1: ( rule__SlicedProperty__Group__5__Impl rule__SlicedProperty__Group__6 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2650:2: rule__SlicedProperty__Group__5__Impl rule__SlicedProperty__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__5__Impl_in_rule__SlicedProperty__Group__55220);
            rule__SlicedProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__6_in_rule__SlicedProperty__Group__55223);
            rule__SlicedProperty__Group__6();

            state._fsp--;


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2657:1: rule__SlicedProperty__Group__5__Impl : ( ( rule__SlicedProperty__Group_5__0 )? ) ;
    public final void rule__SlicedProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2661:1: ( ( ( rule__SlicedProperty__Group_5__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2662:1: ( ( rule__SlicedProperty__Group_5__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2662:1: ( ( rule__SlicedProperty__Group_5__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2663:1: ( rule__SlicedProperty__Group_5__0 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getGroup_5()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2664:1: ( rule__SlicedProperty__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2664:2: rule__SlicedProperty__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__0_in_rule__SlicedProperty__Group__5__Impl5250);
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


    // $ANTLR start "rule__SlicedProperty__Group__6"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2674:1: rule__SlicedProperty__Group__6 : rule__SlicedProperty__Group__6__Impl ;
    public final void rule__SlicedProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2678:1: ( rule__SlicedProperty__Group__6__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2679:2: rule__SlicedProperty__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__6__Impl_in_rule__SlicedProperty__Group__65281);
            rule__SlicedProperty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__6"


    // $ANTLR start "rule__SlicedProperty__Group__6__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2685:1: rule__SlicedProperty__Group__6__Impl : ( ( rule__SlicedProperty__Group_6__0 )* ) ;
    public final void rule__SlicedProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2689:1: ( ( ( rule__SlicedProperty__Group_6__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2690:1: ( ( rule__SlicedProperty__Group_6__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2690:1: ( ( rule__SlicedProperty__Group_6__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2691:1: ( rule__SlicedProperty__Group_6__0 )*
            {
             before(grammarAccess.getSlicedPropertyAccess().getGroup_6()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2692:1: ( rule__SlicedProperty__Group_6__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2692:2: rule__SlicedProperty__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_6__0_in_rule__SlicedProperty__Group__6__Impl5308);
            	    rule__SlicedProperty__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSlicedPropertyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group__6__Impl"


    // $ANTLR start "rule__SlicedProperty__Group_5__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2716:1: rule__SlicedProperty__Group_5__0 : rule__SlicedProperty__Group_5__0__Impl rule__SlicedProperty__Group_5__1 ;
    public final void rule__SlicedProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2720:1: ( rule__SlicedProperty__Group_5__0__Impl rule__SlicedProperty__Group_5__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2721:2: rule__SlicedProperty__Group_5__0__Impl rule__SlicedProperty__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__0__Impl_in_rule__SlicedProperty__Group_5__05353);
            rule__SlicedProperty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__1_in_rule__SlicedProperty__Group_5__05356);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2728:1: rule__SlicedProperty__Group_5__0__Impl : ( '[[' ) ;
    public final void rule__SlicedProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2732:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2733:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2733:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2734:1: '[['
            {
             before(grammarAccess.getSlicedPropertyAccess().getLeftSquareBracketLeftSquareBracketKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SlicedProperty__Group_5__0__Impl5384); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2747:1: rule__SlicedProperty__Group_5__1 : rule__SlicedProperty__Group_5__1__Impl rule__SlicedProperty__Group_5__2 ;
    public final void rule__SlicedProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2751:1: ( rule__SlicedProperty__Group_5__1__Impl rule__SlicedProperty__Group_5__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2752:2: rule__SlicedProperty__Group_5__1__Impl rule__SlicedProperty__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__1__Impl_in_rule__SlicedProperty__Group_5__15415);
            rule__SlicedProperty__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__2_in_rule__SlicedProperty__Group_5__15418);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2759:1: rule__SlicedProperty__Group_5__1__Impl : ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) ) ;
    public final void rule__SlicedProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2763:1: ( ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2764:1: ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2764:1: ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2765:1: ( rule__SlicedProperty__ExpressionAssignment_5_1 )
            {
             before(grammarAccess.getSlicedPropertyAccess().getExpressionAssignment_5_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2766:1: ( rule__SlicedProperty__ExpressionAssignment_5_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2766:2: rule__SlicedProperty__ExpressionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__ExpressionAssignment_5_1_in_rule__SlicedProperty__Group_5__1__Impl5445);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2776:1: rule__SlicedProperty__Group_5__2 : rule__SlicedProperty__Group_5__2__Impl ;
    public final void rule__SlicedProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2780:1: ( rule__SlicedProperty__Group_5__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2781:2: rule__SlicedProperty__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__2__Impl_in_rule__SlicedProperty__Group_5__25475);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2787:1: rule__SlicedProperty__Group_5__2__Impl : ( ']]' ) ;
    public final void rule__SlicedProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2791:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2792:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2792:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2793:1: ']]'
            {
             before(grammarAccess.getSlicedPropertyAccess().getRightSquareBracketRightSquareBracketKeyword_5_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SlicedProperty__Group_5__2__Impl5503); 
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


    // $ANTLR start "rule__SlicedProperty__Group_6__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2812:1: rule__SlicedProperty__Group_6__0 : rule__SlicedProperty__Group_6__0__Impl rule__SlicedProperty__Group_6__1 ;
    public final void rule__SlicedProperty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2816:1: ( rule__SlicedProperty__Group_6__0__Impl rule__SlicedProperty__Group_6__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2817:2: rule__SlicedProperty__Group_6__0__Impl rule__SlicedProperty__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_6__0__Impl_in_rule__SlicedProperty__Group_6__05540);
            rule__SlicedProperty__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_6__1_in_rule__SlicedProperty__Group_6__05543);
            rule__SlicedProperty__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_6__0"


    // $ANTLR start "rule__SlicedProperty__Group_6__0__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2824:1: rule__SlicedProperty__Group_6__0__Impl : ( 'constraint' ) ;
    public final void rule__SlicedProperty__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2828:1: ( ( 'constraint' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2829:1: ( 'constraint' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2829:1: ( 'constraint' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2830:1: 'constraint'
            {
             before(grammarAccess.getSlicedPropertyAccess().getConstraintKeyword_6_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__SlicedProperty__Group_6__0__Impl5571); 
             after(grammarAccess.getSlicedPropertyAccess().getConstraintKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_6__0__Impl"


    // $ANTLR start "rule__SlicedProperty__Group_6__1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2843:1: rule__SlicedProperty__Group_6__1 : rule__SlicedProperty__Group_6__1__Impl rule__SlicedProperty__Group_6__2 ;
    public final void rule__SlicedProperty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2847:1: ( rule__SlicedProperty__Group_6__1__Impl rule__SlicedProperty__Group_6__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2848:2: rule__SlicedProperty__Group_6__1__Impl rule__SlicedProperty__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_6__1__Impl_in_rule__SlicedProperty__Group_6__15602);
            rule__SlicedProperty__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_6__2_in_rule__SlicedProperty__Group_6__15605);
            rule__SlicedProperty__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_6__1"


    // $ANTLR start "rule__SlicedProperty__Group_6__1__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2855:1: rule__SlicedProperty__Group_6__1__Impl : ( ':' ) ;
    public final void rule__SlicedProperty__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2859:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2860:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2860:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2861:1: ':'
            {
             before(grammarAccess.getSlicedPropertyAccess().getColonKeyword_6_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__SlicedProperty__Group_6__1__Impl5633); 
             after(grammarAccess.getSlicedPropertyAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_6__1__Impl"


    // $ANTLR start "rule__SlicedProperty__Group_6__2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2874:1: rule__SlicedProperty__Group_6__2 : rule__SlicedProperty__Group_6__2__Impl ;
    public final void rule__SlicedProperty__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2878:1: ( rule__SlicedProperty__Group_6__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2879:2: rule__SlicedProperty__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_6__2__Impl_in_rule__SlicedProperty__Group_6__25664);
            rule__SlicedProperty__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_6__2"


    // $ANTLR start "rule__SlicedProperty__Group_6__2__Impl"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2885:1: rule__SlicedProperty__Group_6__2__Impl : ( ( rule__SlicedProperty__ConstraintsAssignment_6_2 ) ) ;
    public final void rule__SlicedProperty__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2889:1: ( ( ( rule__SlicedProperty__ConstraintsAssignment_6_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2890:1: ( ( rule__SlicedProperty__ConstraintsAssignment_6_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2890:1: ( ( rule__SlicedProperty__ConstraintsAssignment_6_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2891:1: ( rule__SlicedProperty__ConstraintsAssignment_6_2 )
            {
             before(grammarAccess.getSlicedPropertyAccess().getConstraintsAssignment_6_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2892:1: ( rule__SlicedProperty__ConstraintsAssignment_6_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2892:2: rule__SlicedProperty__ConstraintsAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__ConstraintsAssignment_6_2_in_rule__SlicedProperty__Group_6__2__Impl5691);
            rule__SlicedProperty__ConstraintsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSlicedPropertyAccess().getConstraintsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__Group_6__2__Impl"


    // $ANTLR start "rule__OppositeCreation__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2908:1: rule__OppositeCreation__Group__0 : rule__OppositeCreation__Group__0__Impl rule__OppositeCreation__Group__1 ;
    public final void rule__OppositeCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2912:1: ( rule__OppositeCreation__Group__0__Impl rule__OppositeCreation__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2913:2: rule__OppositeCreation__Group__0__Impl rule__OppositeCreation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__0__Impl_in_rule__OppositeCreation__Group__05727);
            rule__OppositeCreation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__1_in_rule__OppositeCreation__Group__05730);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2920:1: rule__OppositeCreation__Group__0__Impl : ( () ) ;
    public final void rule__OppositeCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2924:1: ( ( () ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2925:1: ( () )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2925:1: ( () )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2926:1: ()
            {
             before(grammarAccess.getOppositeCreationAccess().getOppositeCreationAction_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2927:1: ()
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2929:1: 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2939:1: rule__OppositeCreation__Group__1 : rule__OppositeCreation__Group__1__Impl rule__OppositeCreation__Group__2 ;
    public final void rule__OppositeCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2943:1: ( rule__OppositeCreation__Group__1__Impl rule__OppositeCreation__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2944:2: rule__OppositeCreation__Group__1__Impl rule__OppositeCreation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__1__Impl_in_rule__OppositeCreation__Group__15788);
            rule__OppositeCreation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__2_in_rule__OppositeCreation__Group__15791);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2951:1: rule__OppositeCreation__Group__1__Impl : ( 'opposite' ) ;
    public final void rule__OppositeCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2955:1: ( ( 'opposite' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2956:1: ( 'opposite' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2956:1: ( 'opposite' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2957:1: 'opposite'
            {
             before(grammarAccess.getOppositeCreationAccess().getOppositeKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OppositeCreation__Group__1__Impl5819); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2970:1: rule__OppositeCreation__Group__2 : rule__OppositeCreation__Group__2__Impl rule__OppositeCreation__Group__3 ;
    public final void rule__OppositeCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2974:1: ( rule__OppositeCreation__Group__2__Impl rule__OppositeCreation__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2975:2: rule__OppositeCreation__Group__2__Impl rule__OppositeCreation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__2__Impl_in_rule__OppositeCreation__Group__25850);
            rule__OppositeCreation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__3_in_rule__OppositeCreation__Group__25853);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2982:1: rule__OppositeCreation__Group__2__Impl : ( '(' ) ;
    public final void rule__OppositeCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2986:1: ( ( '(' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2987:1: ( '(' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2987:1: ( '(' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2988:1: '('
            {
             before(grammarAccess.getOppositeCreationAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__OppositeCreation__Group__2__Impl5881); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3001:1: rule__OppositeCreation__Group__3 : rule__OppositeCreation__Group__3__Impl rule__OppositeCreation__Group__4 ;
    public final void rule__OppositeCreation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3005:1: ( rule__OppositeCreation__Group__3__Impl rule__OppositeCreation__Group__4 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3006:2: rule__OppositeCreation__Group__3__Impl rule__OppositeCreation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__3__Impl_in_rule__OppositeCreation__Group__35912);
            rule__OppositeCreation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__4_in_rule__OppositeCreation__Group__35915);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3013:1: rule__OppositeCreation__Group__3__Impl : ( ( rule__OppositeCreation__NameAssignment_3 ) ) ;
    public final void rule__OppositeCreation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3017:1: ( ( ( rule__OppositeCreation__NameAssignment_3 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3018:1: ( ( rule__OppositeCreation__NameAssignment_3 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3018:1: ( ( rule__OppositeCreation__NameAssignment_3 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3019:1: ( rule__OppositeCreation__NameAssignment_3 )
            {
             before(grammarAccess.getOppositeCreationAccess().getNameAssignment_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3020:1: ( rule__OppositeCreation__NameAssignment_3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3020:2: rule__OppositeCreation__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__NameAssignment_3_in_rule__OppositeCreation__Group__3__Impl5942);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3030:1: rule__OppositeCreation__Group__4 : rule__OppositeCreation__Group__4__Impl ;
    public final void rule__OppositeCreation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3034:1: ( rule__OppositeCreation__Group__4__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3035:2: rule__OppositeCreation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__4__Impl_in_rule__OppositeCreation__Group__45972);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3041:1: rule__OppositeCreation__Group__4__Impl : ( ')' ) ;
    public final void rule__OppositeCreation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3045:1: ( ( ')' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3046:1: ( ')' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3046:1: ( ')' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3047:1: ')'
            {
             before(grammarAccess.getOppositeCreationAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__OppositeCreation__Group__4__Impl6000); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3071:1: rule__Slicer__ActiveAssignment_1 : ( ( 'active' ) ) ;
    public final void rule__Slicer__ActiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3075:1: ( ( ( 'active' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3076:1: ( ( 'active' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3076:1: ( ( 'active' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3077:1: ( 'active' )
            {
             before(grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3078:1: ( 'active' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3079:1: 'active'
            {
             before(grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Slicer__ActiveAssignment_16051); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3094:1: rule__Slicer__StrictAssignment_2 : ( ( 'strict' ) ) ;
    public final void rule__Slicer__StrictAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3098:1: ( ( ( 'strict' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3099:1: ( ( 'strict' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3099:1: ( ( 'strict' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3100:1: ( 'strict' )
            {
             before(grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3101:1: ( 'strict' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3102:1: 'strict'
            {
             before(grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Slicer__StrictAssignment_26095); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3117:1: rule__Slicer__NameAssignment_3 : ( ruleQName ) ;
    public final void rule__Slicer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3121:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3122:1: ( ruleQName )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3122:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3123:1: ruleQName
            {
             before(grammarAccess.getSlicerAccess().getNameQNameParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Slicer__NameAssignment_36134);
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


    // $ANTLR start "rule__Slicer__UriMetamodelAssignment_5_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3132:1: rule__Slicer__UriMetamodelAssignment_5_2 : ( ruleEString ) ;
    public final void rule__Slicer__UriMetamodelAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3136:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3137:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3137:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3138:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getUriMetamodelEStringParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__UriMetamodelAssignment_5_26165);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getUriMetamodelEStringParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__UriMetamodelAssignment_5_2"


    // $ANTLR start "rule__Slicer__InputClassesAssignment_8"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3147:1: rule__Slicer__InputClassesAssignment_8 : ( ( ruleQName ) ) ;
    public final void rule__Slicer__InputClassesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3151:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3152:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3152:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3153:1: ( ruleQName )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_8_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3154:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3155:1: ruleQName
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassQNameParserRuleCall_8_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Slicer__InputClassesAssignment_86200);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getInputClassesEClassQNameParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__InputClassesAssignment_8"


    // $ANTLR start "rule__Slicer__InputClassesAssignment_9_1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3166:1: rule__Slicer__InputClassesAssignment_9_1 : ( ( ruleQName ) ) ;
    public final void rule__Slicer__InputClassesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3170:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3171:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3171:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3172:1: ( ruleQName )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_9_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3173:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3174:1: ruleQName
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassQNameParserRuleCall_9_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Slicer__InputClassesAssignment_9_16239);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getInputClassesEClassQNameParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__InputClassesAssignment_9_1"


    // $ANTLR start "rule__Slicer__RadiusAssignment_10_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3185:1: rule__Slicer__RadiusAssignment_10_2 : ( ruleRadius ) ;
    public final void rule__Slicer__RadiusAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3189:1: ( ( ruleRadius ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3190:1: ( ruleRadius )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3190:1: ( ruleRadius )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3191:1: ruleRadius
            {
             before(grammarAccess.getSlicerAccess().getRadiusRadiusParserRuleCall_10_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadius_in_rule__Slicer__RadiusAssignment_10_26274);
            ruleRadius();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getRadiusRadiusParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__RadiusAssignment_10_2"


    // $ANTLR start "rule__Slicer__SlicedElementsAssignment_11_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3200:1: rule__Slicer__SlicedElementsAssignment_11_2 : ( ruleSlicedClass ) ;
    public final void rule__Slicer__SlicedElementsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3204:1: ( ( ruleSlicedClass ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3205:1: ( ruleSlicedClass )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3205:1: ( ruleSlicedClass )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3206:1: ruleSlicedClass
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsSlicedClassParserRuleCall_11_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedClass_in_rule__Slicer__SlicedElementsAssignment_11_26305);
            ruleSlicedClass();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getSlicedElementsSlicedClassParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__SlicedElementsAssignment_11_2"


    // $ANTLR start "rule__Slicer__SlicedElementsAssignment_12_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3215:1: rule__Slicer__SlicedElementsAssignment_12_2 : ( ruleSlicedProperty ) ;
    public final void rule__Slicer__SlicedElementsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3219:1: ( ( ruleSlicedProperty ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3220:1: ( ruleSlicedProperty )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3220:1: ( ruleSlicedProperty )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3221:1: ruleSlicedProperty
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsSlicedPropertyParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedProperty_in_rule__Slicer__SlicedElementsAssignment_12_26336);
            ruleSlicedProperty();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getSlicedElementsSlicedPropertyParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__SlicedElementsAssignment_12_2"


    // $ANTLR start "rule__Slicer__OnStartAssignment_13_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3230:1: rule__Slicer__OnStartAssignment_13_2 : ( ruleEString ) ;
    public final void rule__Slicer__OnStartAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3234:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3235:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3235:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3236:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getOnStartEStringParserRuleCall_13_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__OnStartAssignment_13_26367);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getOnStartEStringParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__OnStartAssignment_13_2"


    // $ANTLR start "rule__Slicer__OnEndAssignment_14_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3245:1: rule__Slicer__OnEndAssignment_14_2 : ( ruleEString ) ;
    public final void rule__Slicer__OnEndAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3249:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3250:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3250:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3251:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getOnEndEStringParserRuleCall_14_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__OnEndAssignment_14_26398);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getOnEndEStringParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__OnEndAssignment_14_2"


    // $ANTLR start "rule__Slicer__HelperAssignment_15_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3260:1: rule__Slicer__HelperAssignment_15_2 : ( ruleEString ) ;
    public final void rule__Slicer__HelperAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3264:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3265:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3265:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3266:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getHelperEStringParserRuleCall_15_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__HelperAssignment_15_26429);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getHelperEStringParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Slicer__HelperAssignment_15_2"


    // $ANTLR start "rule__Constraint__NameAssignment_0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3275:1: rule__Constraint__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3279:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3280:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3280:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3281:1: ruleEString
            {
             before(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constraint__NameAssignment_06460);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3290:1: rule__Constraint__ExpressionAssignment_2 : ( ruleEString ) ;
    public final void rule__Constraint__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3294:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3295:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3295:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3296:1: ruleEString
            {
             before(grammarAccess.getConstraintAccess().getExpressionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constraint__ExpressionAssignment_26491);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3305:1: rule__Radius__FocusedClassesAssignment_1_0 : ( ( ruleQName ) ) ;
    public final void rule__Radius__FocusedClassesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3309:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3310:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3310:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3311:1: ( ruleQName )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_0_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3312:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3313:1: ruleQName
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassQNameParserRuleCall_1_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Radius__FocusedClassesAssignment_1_06526);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3324:1: rule__Radius__FocusedClassesAssignment_1_1_1 : ( ( ruleQName ) ) ;
    public final void rule__Radius__FocusedClassesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3328:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3329:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3329:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3330:1: ( ruleQName )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_1_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3331:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3332:1: ruleQName
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassQNameParserRuleCall_1_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__Radius__FocusedClassesAssignment_1_1_16565);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3343:1: rule__SlicedClass__DomainAssignment_0 : ( ( ruleQName ) ) ;
    public final void rule__SlicedClass__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3347:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3348:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3348:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3349:1: ( ruleQName )
            {
             before(grammarAccess.getSlicedClassAccess().getDomainEClassCrossReference_0_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3350:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3351:1: ruleQName
            {
             before(grammarAccess.getSlicedClassAccess().getDomainEClassQNameParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__SlicedClass__DomainAssignment_06604);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3362:1: rule__SlicedClass__IsOptionAssignment_1 : ( ( 'option' ) ) ;
    public final void rule__SlicedClass__IsOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3366:1: ( ( ( 'option' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3367:1: ( ( 'option' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3367:1: ( ( 'option' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3368:1: ( 'option' )
            {
             before(grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3369:1: ( 'option' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3370:1: 'option'
            {
             before(grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SlicedClass__IsOptionAssignment_16644); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3385:1: rule__SlicedClass__CtxAssignment_2 : ( ruleVarDecl ) ;
    public final void rule__SlicedClass__CtxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3389:1: ( ( ruleVarDecl ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3390:1: ( ruleVarDecl )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3390:1: ( ruleVarDecl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3391:1: ruleVarDecl
            {
             before(grammarAccess.getSlicedClassAccess().getCtxVarDeclParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_rule__SlicedClass__CtxAssignment_26683);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3400:1: rule__SlicedClass__ExpressionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__SlicedClass__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3404:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3405:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3405:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3406:1: ruleEString
            {
             before(grammarAccess.getSlicedClassAccess().getExpressionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SlicedClass__ExpressionAssignment_3_16714);
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


    // $ANTLR start "rule__SlicedClass__ConstraintsAssignment_4_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3415:1: rule__SlicedClass__ConstraintsAssignment_4_2 : ( ruleConstraint ) ;
    public final void rule__SlicedClass__ConstraintsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3419:1: ( ( ruleConstraint ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3420:1: ( ruleConstraint )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3420:1: ( ruleConstraint )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3421:1: ruleConstraint
            {
             before(grammarAccess.getSlicedClassAccess().getConstraintsConstraintParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__SlicedClass__ConstraintsAssignment_4_26745);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getSlicedClassAccess().getConstraintsConstraintParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedClass__ConstraintsAssignment_4_2"


    // $ANTLR start "rule__VarDecl__VarNameAssignment"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3430:1: rule__VarDecl__VarNameAssignment : ( ruleEString ) ;
    public final void rule__VarDecl__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3434:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3435:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3435:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3436:1: ruleEString
            {
             before(grammarAccess.getVarDeclAccess().getVarNameEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VarDecl__VarNameAssignment6776);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3445:1: rule__SlicedProperty__DomainAssignment_0 : ( ( ruleQName ) ) ;
    public final void rule__SlicedProperty__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3449:1: ( ( ( ruleQName ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3450:1: ( ( ruleQName ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3450:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3451:1: ( ruleQName )
            {
             before(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureCrossReference_0_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3452:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3453:1: ruleQName
            {
             before(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureQNameParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_rule__SlicedProperty__DomainAssignment_06811);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3464:1: rule__SlicedProperty__IsOptionAssignment_1 : ( ( 'option' ) ) ;
    public final void rule__SlicedProperty__IsOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3468:1: ( ( ( 'option' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3469:1: ( ( 'option' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3469:1: ( ( 'option' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3470:1: ( 'option' )
            {
             before(grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3471:1: ( 'option' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3472:1: 'option'
            {
             before(grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SlicedProperty__IsOptionAssignment_16851); 
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


    // $ANTLR start "rule__SlicedProperty__OppositeAssignment_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3487:1: rule__SlicedProperty__OppositeAssignment_2 : ( ruleOppositeCreation ) ;
    public final void rule__SlicedProperty__OppositeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3491:1: ( ( ruleOppositeCreation ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3492:1: ( ruleOppositeCreation )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3492:1: ( ruleOppositeCreation )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3493:1: ruleOppositeCreation
            {
             before(grammarAccess.getSlicedPropertyAccess().getOppositeOppositeCreationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOppositeCreation_in_rule__SlicedProperty__OppositeAssignment_26890);
            ruleOppositeCreation();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getOppositeOppositeCreationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__OppositeAssignment_2"


    // $ANTLR start "rule__SlicedProperty__SrcAssignment_3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3502:1: rule__SlicedProperty__SrcAssignment_3 : ( ruleVarDecl ) ;
    public final void rule__SlicedProperty__SrcAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3506:1: ( ( ruleVarDecl ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3507:1: ( ruleVarDecl )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3507:1: ( ruleVarDecl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3508:1: ruleVarDecl
            {
             before(grammarAccess.getSlicedPropertyAccess().getSrcVarDeclParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_rule__SlicedProperty__SrcAssignment_36921);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getSrcVarDeclParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__SrcAssignment_3"


    // $ANTLR start "rule__SlicedProperty__TgtAssignment_4"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3517:1: rule__SlicedProperty__TgtAssignment_4 : ( ruleVarDecl ) ;
    public final void rule__SlicedProperty__TgtAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3521:1: ( ( ruleVarDecl ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3522:1: ( ruleVarDecl )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3522:1: ( ruleVarDecl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3523:1: ruleVarDecl
            {
             before(grammarAccess.getSlicedPropertyAccess().getTgtVarDeclParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_rule__SlicedProperty__TgtAssignment_46952);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getTgtVarDeclParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__TgtAssignment_4"


    // $ANTLR start "rule__SlicedProperty__ExpressionAssignment_5_1"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3532:1: rule__SlicedProperty__ExpressionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__SlicedProperty__ExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3536:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3537:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3537:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3538:1: ruleEString
            {
             before(grammarAccess.getSlicedPropertyAccess().getExpressionEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SlicedProperty__ExpressionAssignment_5_16983);
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


    // $ANTLR start "rule__SlicedProperty__ConstraintsAssignment_6_2"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3547:1: rule__SlicedProperty__ConstraintsAssignment_6_2 : ( ruleConstraint ) ;
    public final void rule__SlicedProperty__ConstraintsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3551:1: ( ( ruleConstraint ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3552:1: ( ruleConstraint )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3552:1: ( ruleConstraint )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3553:1: ruleConstraint
            {
             before(grammarAccess.getSlicedPropertyAccess().getConstraintsConstraintParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__SlicedProperty__ConstraintsAssignment_6_27014);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getConstraintsConstraintParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SlicedProperty__ConstraintsAssignment_6_2"


    // $ANTLR start "rule__OppositeCreation__NameAssignment_3"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3562:1: rule__OppositeCreation__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OppositeCreation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3566:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3567:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3567:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3568:1: ruleEString
            {
             before(grammarAccess.getOppositeCreationAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OppositeCreation__NameAssignment_37045);
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
        public static final BitSet FOLLOW_rule__Slicer__Group__4__Impl_in_rule__Slicer__Group__4904 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__5_in_rule__Slicer__Group__4907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Slicer__Group__4__Impl935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__5__Impl_in_rule__Slicer__Group__5966 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__6_in_rule__Slicer__Group__5969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_5__0_in_rule__Slicer__Group__5__Impl998 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_5__0_in_rule__Slicer__Group__5__Impl1010 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__6__Impl_in_rule__Slicer__Group__61043 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__7_in_rule__Slicer__Group__61046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Slicer__Group__6__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__7__Impl_in_rule__Slicer__Group__71105 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__8_in_rule__Slicer__Group__71108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group__7__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__8__Impl_in_rule__Slicer__Group__81167 = new BitSet(new long[]{0x00000000033E8000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__9_in_rule__Slicer__Group__81170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__InputClassesAssignment_8_in_rule__Slicer__Group__8__Impl1197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__9__Impl_in_rule__Slicer__Group__91227 = new BitSet(new long[]{0x00000000033E8000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__10_in_rule__Slicer__Group__91230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_9__0_in_rule__Slicer__Group__9__Impl1257 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__10__Impl_in_rule__Slicer__Group__101288 = new BitSet(new long[]{0x00000000033E8000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__11_in_rule__Slicer__Group__101291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_10__0_in_rule__Slicer__Group__10__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__11__Impl_in_rule__Slicer__Group__111349 = new BitSet(new long[]{0x00000000033E8000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__12_in_rule__Slicer__Group__111352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__0_in_rule__Slicer__Group__11__Impl1379 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__12__Impl_in_rule__Slicer__Group__121410 = new BitSet(new long[]{0x00000000033E8000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__13_in_rule__Slicer__Group__121413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__0_in_rule__Slicer__Group__12__Impl1440 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__13__Impl_in_rule__Slicer__Group__131471 = new BitSet(new long[]{0x00000000033E8000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__14_in_rule__Slicer__Group__131474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__0_in_rule__Slicer__Group__13__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__14__Impl_in_rule__Slicer__Group__141532 = new BitSet(new long[]{0x00000000033E8000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__15_in_rule__Slicer__Group__141535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__0_in_rule__Slicer__Group__14__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__15__Impl_in_rule__Slicer__Group__151593 = new BitSet(new long[]{0x00000000033E8000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__16_in_rule__Slicer__Group__151596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__0_in_rule__Slicer__Group__15__Impl1623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__16__Impl_in_rule__Slicer__Group__161654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Slicer__Group__16__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_5__0__Impl_in_rule__Slicer__Group_5__01747 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_5__1_in_rule__Slicer__Group_5__01750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Slicer__Group_5__0__Impl1778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_5__1__Impl_in_rule__Slicer__Group_5__11809 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_5__2_in_rule__Slicer__Group_5__11812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_5__1__Impl1840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_5__2__Impl_in_rule__Slicer__Group_5__21871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__UriMetamodelAssignment_5_2_in_rule__Slicer__Group_5__2__Impl1898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_9__0__Impl_in_rule__Slicer__Group_9__01934 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_9__1_in_rule__Slicer__Group_9__01937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Slicer__Group_9__0__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_9__1__Impl_in_rule__Slicer__Group_9__11996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__InputClassesAssignment_9_1_in_rule__Slicer__Group_9__1__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_10__0__Impl_in_rule__Slicer__Group_10__02057 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_10__1_in_rule__Slicer__Group_10__02060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Slicer__Group_10__0__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_10__1__Impl_in_rule__Slicer__Group_10__12119 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_10__2_in_rule__Slicer__Group_10__12122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_10__1__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_10__2__Impl_in_rule__Slicer__Group_10__22181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__RadiusAssignment_10_2_in_rule__Slicer__Group_10__2__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__0__Impl_in_rule__Slicer__Group_11__02244 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__1_in_rule__Slicer__Group_11__02247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Slicer__Group_11__0__Impl2275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__1__Impl_in_rule__Slicer__Group_11__12306 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__2_in_rule__Slicer__Group_11__12309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_11__1__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__2__Impl_in_rule__Slicer__Group_11__22368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__SlicedElementsAssignment_11_2_in_rule__Slicer__Group_11__2__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__0__Impl_in_rule__Slicer__Group_12__02431 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__1_in_rule__Slicer__Group_12__02434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Slicer__Group_12__0__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__1__Impl_in_rule__Slicer__Group_12__12493 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__2_in_rule__Slicer__Group_12__12496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_12__1__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__2__Impl_in_rule__Slicer__Group_12__22555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__SlicedElementsAssignment_12_2_in_rule__Slicer__Group_12__2__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__0__Impl_in_rule__Slicer__Group_13__02618 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__1_in_rule__Slicer__Group_13__02621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Slicer__Group_13__0__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__1__Impl_in_rule__Slicer__Group_13__12680 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__2_in_rule__Slicer__Group_13__12683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Slicer__Group_13__1__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__2__Impl_in_rule__Slicer__Group_13__22742 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__3_in_rule__Slicer__Group_13__22745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__OnStartAssignment_13_2_in_rule__Slicer__Group_13__2__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__3__Impl_in_rule__Slicer__Group_13__32802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Slicer__Group_13__3__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__0__Impl_in_rule__Slicer__Group_14__02869 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__1_in_rule__Slicer__Group_14__02872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Slicer__Group_14__0__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__1__Impl_in_rule__Slicer__Group_14__12931 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__2_in_rule__Slicer__Group_14__12934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Slicer__Group_14__1__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__2__Impl_in_rule__Slicer__Group_14__22993 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__3_in_rule__Slicer__Group_14__22996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__OnEndAssignment_14_2_in_rule__Slicer__Group_14__2__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__3__Impl_in_rule__Slicer__Group_14__33053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Slicer__Group_14__3__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__0__Impl_in_rule__Slicer__Group_15__03120 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__1_in_rule__Slicer__Group_15__03123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Slicer__Group_15__0__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__1__Impl_in_rule__Slicer__Group_15__13182 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__2_in_rule__Slicer__Group_15__13185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Slicer__Group_15__1__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__2__Impl_in_rule__Slicer__Group_15__23244 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__3_in_rule__Slicer__Group_15__23247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__HelperAssignment_15_2_in_rule__Slicer__Group_15__2__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__3__Impl_in_rule__Slicer__Group_15__33304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Slicer__Group_15__3__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__03371 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__QName__Group__1_in_rule__QName__Group__03374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QName__Group__0__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__13430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl3457 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__03492 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__03495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__QName__Group_1__0__Impl3523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__13554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QName__Group_1__1__Impl3581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03614 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__NameAssignment_0_in_rule__Constraint__Group__0__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13674 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Constraint__Group__1__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23736 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__ExpressionAssignment_2_in_rule__Constraint__Group__2__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Constraint__Group__3__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group__0__Impl_in_rule__Radius__Group__03863 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Radius__Group__1_in_rule__Radius__Group__03866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group__1__Impl_in_rule__Radius__Group__13924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__0_in_rule__Radius__Group__1__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__0__Impl_in_rule__Radius__Group_1__03986 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__1_in_rule__Radius__Group_1__03989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__FocusedClassesAssignment_1_0_in_rule__Radius__Group_1__0__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__1__Impl_in_rule__Radius__Group_1__14046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__0_in_rule__Radius__Group_1__1__Impl4073 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__0__Impl_in_rule__Radius__Group_1_1__04108 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__1_in_rule__Radius__Group_1_1__04111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Radius__Group_1_1__0__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__1__Impl_in_rule__Radius__Group_1_1__14170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__FocusedClassesAssignment_1_1_1_in_rule__Radius__Group_1_1__1__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__0__Impl_in_rule__SlicedClass__Group__04231 = new BitSet(new long[]{0x0000000388400030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__1_in_rule__SlicedClass__Group__04234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__DomainAssignment_0_in_rule__SlicedClass__Group__0__Impl4261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__1__Impl_in_rule__SlicedClass__Group__14291 = new BitSet(new long[]{0x0000000388400030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__2_in_rule__SlicedClass__Group__14294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__IsOptionAssignment_1_in_rule__SlicedClass__Group__1__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__2__Impl_in_rule__SlicedClass__Group__24352 = new BitSet(new long[]{0x0000000388400030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__3_in_rule__SlicedClass__Group__24355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__CtxAssignment_2_in_rule__SlicedClass__Group__2__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__3__Impl_in_rule__SlicedClass__Group__34413 = new BitSet(new long[]{0x0000000388400030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__4_in_rule__SlicedClass__Group__34416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__0_in_rule__SlicedClass__Group__3__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__4__Impl_in_rule__SlicedClass__Group__44474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_4__0_in_rule__SlicedClass__Group__4__Impl4501 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__0__Impl_in_rule__SlicedClass__Group_3__04542 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__1_in_rule__SlicedClass__Group_3__04545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SlicedClass__Group_3__0__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__1__Impl_in_rule__SlicedClass__Group_3__14604 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__2_in_rule__SlicedClass__Group_3__14607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__ExpressionAssignment_3_1_in_rule__SlicedClass__Group_3__1__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__2__Impl_in_rule__SlicedClass__Group_3__24664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SlicedClass__Group_3__2__Impl4692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_4__0__Impl_in_rule__SlicedClass__Group_4__04729 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_4__1_in_rule__SlicedClass__Group_4__04732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SlicedClass__Group_4__0__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_4__1__Impl_in_rule__SlicedClass__Group_4__14791 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_4__2_in_rule__SlicedClass__Group_4__14794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SlicedClass__Group_4__1__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_4__2__Impl_in_rule__SlicedClass__Group_4__24853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__ConstraintsAssignment_4_2_in_rule__SlicedClass__Group_4__2__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__0__Impl_in_rule__SlicedProperty__Group__04916 = new BitSet(new long[]{0x0000000398400030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__1_in_rule__SlicedProperty__Group__04919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__DomainAssignment_0_in_rule__SlicedProperty__Group__0__Impl4946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__1__Impl_in_rule__SlicedProperty__Group__14976 = new BitSet(new long[]{0x0000000398400030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__2_in_rule__SlicedProperty__Group__14979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__IsOptionAssignment_1_in_rule__SlicedProperty__Group__1__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__2__Impl_in_rule__SlicedProperty__Group__25037 = new BitSet(new long[]{0x0000000398400030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__3_in_rule__SlicedProperty__Group__25040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__OppositeAssignment_2_in_rule__SlicedProperty__Group__2__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__3__Impl_in_rule__SlicedProperty__Group__35098 = new BitSet(new long[]{0x0000000398400030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__4_in_rule__SlicedProperty__Group__35101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__SrcAssignment_3_in_rule__SlicedProperty__Group__3__Impl5128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__4__Impl_in_rule__SlicedProperty__Group__45159 = new BitSet(new long[]{0x0000000398400030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__5_in_rule__SlicedProperty__Group__45162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__TgtAssignment_4_in_rule__SlicedProperty__Group__4__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__5__Impl_in_rule__SlicedProperty__Group__55220 = new BitSet(new long[]{0x0000000398400030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__6_in_rule__SlicedProperty__Group__55223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__0_in_rule__SlicedProperty__Group__5__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__6__Impl_in_rule__SlicedProperty__Group__65281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_6__0_in_rule__SlicedProperty__Group__6__Impl5308 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__0__Impl_in_rule__SlicedProperty__Group_5__05353 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__1_in_rule__SlicedProperty__Group_5__05356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SlicedProperty__Group_5__0__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__1__Impl_in_rule__SlicedProperty__Group_5__15415 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__2_in_rule__SlicedProperty__Group_5__15418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__ExpressionAssignment_5_1_in_rule__SlicedProperty__Group_5__1__Impl5445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__2__Impl_in_rule__SlicedProperty__Group_5__25475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SlicedProperty__Group_5__2__Impl5503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_6__0__Impl_in_rule__SlicedProperty__Group_6__05540 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_6__1_in_rule__SlicedProperty__Group_6__05543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SlicedProperty__Group_6__0__Impl5571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_6__1__Impl_in_rule__SlicedProperty__Group_6__15602 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_6__2_in_rule__SlicedProperty__Group_6__15605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SlicedProperty__Group_6__1__Impl5633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_6__2__Impl_in_rule__SlicedProperty__Group_6__25664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__ConstraintsAssignment_6_2_in_rule__SlicedProperty__Group_6__2__Impl5691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__0__Impl_in_rule__OppositeCreation__Group__05727 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__1_in_rule__OppositeCreation__Group__05730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__1__Impl_in_rule__OppositeCreation__Group__15788 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__2_in_rule__OppositeCreation__Group__15791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OppositeCreation__Group__1__Impl5819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__2__Impl_in_rule__OppositeCreation__Group__25850 = new BitSet(new long[]{0x0000000180000030L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__3_in_rule__OppositeCreation__Group__25853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__OppositeCreation__Group__2__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__3__Impl_in_rule__OppositeCreation__Group__35912 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__4_in_rule__OppositeCreation__Group__35915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__NameAssignment_3_in_rule__OppositeCreation__Group__3__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__4__Impl_in_rule__OppositeCreation__Group__45972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__OppositeCreation__Group__4__Impl6000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Slicer__ActiveAssignment_16051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Slicer__StrictAssignment_26095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Slicer__NameAssignment_36134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__UriMetamodelAssignment_5_26165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Slicer__InputClassesAssignment_86200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Slicer__InputClassesAssignment_9_16239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadius_in_rule__Slicer__RadiusAssignment_10_26274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedClass_in_rule__Slicer__SlicedElementsAssignment_11_26305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedProperty_in_rule__Slicer__SlicedElementsAssignment_12_26336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__OnStartAssignment_13_26367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__OnEndAssignment_14_26398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__HelperAssignment_15_26429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constraint__NameAssignment_06460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constraint__ExpressionAssignment_26491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Radius__FocusedClassesAssignment_1_06526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__Radius__FocusedClassesAssignment_1_1_16565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__SlicedClass__DomainAssignment_06604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SlicedClass__IsOptionAssignment_16644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_rule__SlicedClass__CtxAssignment_26683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SlicedClass__ExpressionAssignment_3_16714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__SlicedClass__ConstraintsAssignment_4_26745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VarDecl__VarNameAssignment6776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_rule__SlicedProperty__DomainAssignment_06811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SlicedProperty__IsOptionAssignment_16851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOppositeCreation_in_rule__SlicedProperty__OppositeAssignment_26890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_rule__SlicedProperty__SrcAssignment_36921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_rule__SlicedProperty__TgtAssignment_46952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SlicedProperty__ExpressionAssignment_5_16983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__SlicedProperty__ConstraintsAssignment_6_27014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OppositeCreation__NameAssignment_37045 = new BitSet(new long[]{0x0000000000000002L});
    }


}