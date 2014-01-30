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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'slicer'", "'{'", "'domain'", "':'", "'input'", "'}'", "','", "'radius'", "'constraint'", "'slicedClass'", "'slicedProperty'", "'onStart'", "'[['", "']]'", "'onEnd'", "'helper'", "'opposite'", "'('", "')'", "'active'", "'strict'", "'option'"
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


    // $ANTLR start "entryRuleConstraint"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:118:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:119:1: ( ruleConstraint EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:120:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint183);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint190); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:127:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:131:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:132:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:132:1: ( ( rule__Constraint__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:133:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:134:1: ( rule__Constraint__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:134:2: rule__Constraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0_in_ruleConstraint216);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:146:1: entryRuleRadius : ruleRadius EOF ;
    public final void entryRuleRadius() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:147:1: ( ruleRadius EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:148:1: ruleRadius EOF
            {
             before(grammarAccess.getRadiusRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadius_in_entryRuleRadius243);
            ruleRadius();

            state._fsp--;

             after(grammarAccess.getRadiusRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadius250); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:155:1: ruleRadius : ( ( rule__Radius__Group__0 ) ) ;
    public final void ruleRadius() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:159:2: ( ( ( rule__Radius__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:160:1: ( ( rule__Radius__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:160:1: ( ( rule__Radius__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:161:1: ( rule__Radius__Group__0 )
            {
             before(grammarAccess.getRadiusAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:162:1: ( rule__Radius__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:162:2: rule__Radius__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__0_in_ruleRadius276);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:174:1: entryRuleSlicedClass : ruleSlicedClass EOF ;
    public final void entryRuleSlicedClass() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:175:1: ( ruleSlicedClass EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:176:1: ruleSlicedClass EOF
            {
             before(grammarAccess.getSlicedClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedClass_in_entryRuleSlicedClass303);
            ruleSlicedClass();

            state._fsp--;

             after(grammarAccess.getSlicedClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicedClass310); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:183:1: ruleSlicedClass : ( ( rule__SlicedClass__Group__0 ) ) ;
    public final void ruleSlicedClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:187:2: ( ( ( rule__SlicedClass__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:188:1: ( ( rule__SlicedClass__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:188:1: ( ( rule__SlicedClass__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:189:1: ( rule__SlicedClass__Group__0 )
            {
             before(grammarAccess.getSlicedClassAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:190:1: ( rule__SlicedClass__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:190:2: rule__SlicedClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__0_in_ruleSlicedClass336);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:202:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:203:1: ( ruleVarDecl EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:204:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_entryRuleVarDecl363);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVarDecl370); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:211:1: ruleVarDecl : ( ( rule__VarDecl__VarNameAssignment ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:215:2: ( ( ( rule__VarDecl__VarNameAssignment ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:216:1: ( ( rule__VarDecl__VarNameAssignment ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:216:1: ( ( rule__VarDecl__VarNameAssignment ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:217:1: ( rule__VarDecl__VarNameAssignment )
            {
             before(grammarAccess.getVarDeclAccess().getVarNameAssignment()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:218:1: ( rule__VarDecl__VarNameAssignment )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:218:2: rule__VarDecl__VarNameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VarDecl__VarNameAssignment_in_ruleVarDecl396);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:230:1: entryRuleSlicedProperty : ruleSlicedProperty EOF ;
    public final void entryRuleSlicedProperty() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:231:1: ( ruleSlicedProperty EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:232:1: ruleSlicedProperty EOF
            {
             before(grammarAccess.getSlicedPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedProperty_in_entryRuleSlicedProperty423);
            ruleSlicedProperty();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicedProperty430); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:239:1: ruleSlicedProperty : ( ( rule__SlicedProperty__Group__0 ) ) ;
    public final void ruleSlicedProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:243:2: ( ( ( rule__SlicedProperty__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:244:1: ( ( rule__SlicedProperty__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:244:1: ( ( rule__SlicedProperty__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:245:1: ( rule__SlicedProperty__Group__0 )
            {
             before(grammarAccess.getSlicedPropertyAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:246:1: ( rule__SlicedProperty__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:246:2: rule__SlicedProperty__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__0_in_ruleSlicedProperty456);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:258:1: entryRuleOppositeCreation : ruleOppositeCreation EOF ;
    public final void entryRuleOppositeCreation() throws RecognitionException {
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:259:1: ( ruleOppositeCreation EOF )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:260:1: ruleOppositeCreation EOF
            {
             before(grammarAccess.getOppositeCreationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOppositeCreation_in_entryRuleOppositeCreation483);
            ruleOppositeCreation();

            state._fsp--;

             after(grammarAccess.getOppositeCreationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOppositeCreation490); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:267:1: ruleOppositeCreation : ( ( rule__OppositeCreation__Group__0 ) ) ;
    public final void ruleOppositeCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:271:2: ( ( ( rule__OppositeCreation__Group__0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:272:1: ( ( rule__OppositeCreation__Group__0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:272:1: ( ( rule__OppositeCreation__Group__0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:273:1: ( rule__OppositeCreation__Group__0 )
            {
             before(grammarAccess.getOppositeCreationAccess().getGroup()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:274:1: ( rule__OppositeCreation__Group__0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:274:2: rule__OppositeCreation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__0_in_ruleOppositeCreation516);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:286:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:290:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:291:1: ( RULE_STRING )
                    {
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:291:1: ( RULE_STRING )
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:292:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives552); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:297:6: ( RULE_ID )
                    {
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:297:6: ( RULE_ID )
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:298:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives569); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:311:1: rule__Slicer__Group__0 : rule__Slicer__Group__0__Impl rule__Slicer__Group__1 ;
    public final void rule__Slicer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:315:1: ( rule__Slicer__Group__0__Impl rule__Slicer__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:316:2: rule__Slicer__Group__0__Impl rule__Slicer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__0__Impl_in_rule__Slicer__Group__0600);
            rule__Slicer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__1_in_rule__Slicer__Group__0603);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:323:1: rule__Slicer__Group__0__Impl : ( 'slicer' ) ;
    public final void rule__Slicer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:327:1: ( ( 'slicer' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:328:1: ( 'slicer' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:328:1: ( 'slicer' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:329:1: 'slicer'
            {
             before(grammarAccess.getSlicerAccess().getSlicerKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Slicer__Group__0__Impl631); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:342:1: rule__Slicer__Group__1 : rule__Slicer__Group__1__Impl rule__Slicer__Group__2 ;
    public final void rule__Slicer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:346:1: ( rule__Slicer__Group__1__Impl rule__Slicer__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:347:2: rule__Slicer__Group__1__Impl rule__Slicer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__1__Impl_in_rule__Slicer__Group__1662);
            rule__Slicer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__2_in_rule__Slicer__Group__1665);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:354:1: rule__Slicer__Group__1__Impl : ( ( rule__Slicer__ActiveAssignment_1 )? ) ;
    public final void rule__Slicer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:358:1: ( ( ( rule__Slicer__ActiveAssignment_1 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:359:1: ( ( rule__Slicer__ActiveAssignment_1 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:359:1: ( ( rule__Slicer__ActiveAssignment_1 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:360:1: ( rule__Slicer__ActiveAssignment_1 )?
            {
             before(grammarAccess.getSlicerAccess().getActiveAssignment_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:361:1: ( rule__Slicer__ActiveAssignment_1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:361:2: rule__Slicer__ActiveAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__ActiveAssignment_1_in_rule__Slicer__Group__1__Impl692);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:371:1: rule__Slicer__Group__2 : rule__Slicer__Group__2__Impl rule__Slicer__Group__3 ;
    public final void rule__Slicer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:375:1: ( rule__Slicer__Group__2__Impl rule__Slicer__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:376:2: rule__Slicer__Group__2__Impl rule__Slicer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__2__Impl_in_rule__Slicer__Group__2723);
            rule__Slicer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__3_in_rule__Slicer__Group__2726);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:383:1: rule__Slicer__Group__2__Impl : ( ( rule__Slicer__StrictAssignment_2 )? ) ;
    public final void rule__Slicer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:387:1: ( ( ( rule__Slicer__StrictAssignment_2 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:388:1: ( ( rule__Slicer__StrictAssignment_2 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:388:1: ( ( rule__Slicer__StrictAssignment_2 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:389:1: ( rule__Slicer__StrictAssignment_2 )?
            {
             before(grammarAccess.getSlicerAccess().getStrictAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:390:1: ( rule__Slicer__StrictAssignment_2 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:390:2: rule__Slicer__StrictAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__StrictAssignment_2_in_rule__Slicer__Group__2__Impl753);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:400:1: rule__Slicer__Group__3 : rule__Slicer__Group__3__Impl rule__Slicer__Group__4 ;
    public final void rule__Slicer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:404:1: ( rule__Slicer__Group__3__Impl rule__Slicer__Group__4 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:405:2: rule__Slicer__Group__3__Impl rule__Slicer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__3__Impl_in_rule__Slicer__Group__3784);
            rule__Slicer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__4_in_rule__Slicer__Group__3787);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:412:1: rule__Slicer__Group__3__Impl : ( ( rule__Slicer__NameAssignment_3 ) ) ;
    public final void rule__Slicer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:416:1: ( ( ( rule__Slicer__NameAssignment_3 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:417:1: ( ( rule__Slicer__NameAssignment_3 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:417:1: ( ( rule__Slicer__NameAssignment_3 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:418:1: ( rule__Slicer__NameAssignment_3 )
            {
             before(grammarAccess.getSlicerAccess().getNameAssignment_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:419:1: ( rule__Slicer__NameAssignment_3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:419:2: rule__Slicer__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__NameAssignment_3_in_rule__Slicer__Group__3__Impl814);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:429:1: rule__Slicer__Group__4 : rule__Slicer__Group__4__Impl rule__Slicer__Group__5 ;
    public final void rule__Slicer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:433:1: ( rule__Slicer__Group__4__Impl rule__Slicer__Group__5 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:434:2: rule__Slicer__Group__4__Impl rule__Slicer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__4__Impl_in_rule__Slicer__Group__4844);
            rule__Slicer__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__5_in_rule__Slicer__Group__4847);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:441:1: rule__Slicer__Group__4__Impl : ( '{' ) ;
    public final void rule__Slicer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:445:1: ( ( '{' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:446:1: ( '{' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:446:1: ( '{' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:447:1: '{'
            {
             before(grammarAccess.getSlicerAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Slicer__Group__4__Impl875); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:460:1: rule__Slicer__Group__5 : rule__Slicer__Group__5__Impl rule__Slicer__Group__6 ;
    public final void rule__Slicer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:464:1: ( rule__Slicer__Group__5__Impl rule__Slicer__Group__6 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:465:2: rule__Slicer__Group__5__Impl rule__Slicer__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__5__Impl_in_rule__Slicer__Group__5906);
            rule__Slicer__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__6_in_rule__Slicer__Group__5909);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:472:1: rule__Slicer__Group__5__Impl : ( 'domain' ) ;
    public final void rule__Slicer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:476:1: ( ( 'domain' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:477:1: ( 'domain' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:477:1: ( 'domain' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:478:1: 'domain'
            {
             before(grammarAccess.getSlicerAccess().getDomainKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Slicer__Group__5__Impl937); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:491:1: rule__Slicer__Group__6 : rule__Slicer__Group__6__Impl rule__Slicer__Group__7 ;
    public final void rule__Slicer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:495:1: ( rule__Slicer__Group__6__Impl rule__Slicer__Group__7 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:496:2: rule__Slicer__Group__6__Impl rule__Slicer__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__6__Impl_in_rule__Slicer__Group__6968);
            rule__Slicer__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__7_in_rule__Slicer__Group__6971);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:503:1: rule__Slicer__Group__6__Impl : ( ':' ) ;
    public final void rule__Slicer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:507:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:508:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:508:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:509:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group__6__Impl999); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:522:1: rule__Slicer__Group__7 : rule__Slicer__Group__7__Impl rule__Slicer__Group__8 ;
    public final void rule__Slicer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:526:1: ( rule__Slicer__Group__7__Impl rule__Slicer__Group__8 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:527:2: rule__Slicer__Group__7__Impl rule__Slicer__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__7__Impl_in_rule__Slicer__Group__71030);
            rule__Slicer__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__8_in_rule__Slicer__Group__71033);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:534:1: rule__Slicer__Group__7__Impl : ( ( rule__Slicer__UriMetamodelAssignment_7 ) ) ;
    public final void rule__Slicer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:538:1: ( ( ( rule__Slicer__UriMetamodelAssignment_7 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:539:1: ( ( rule__Slicer__UriMetamodelAssignment_7 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:539:1: ( ( rule__Slicer__UriMetamodelAssignment_7 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:540:1: ( rule__Slicer__UriMetamodelAssignment_7 )
            {
             before(grammarAccess.getSlicerAccess().getUriMetamodelAssignment_7()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:541:1: ( rule__Slicer__UriMetamodelAssignment_7 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:541:2: rule__Slicer__UriMetamodelAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__UriMetamodelAssignment_7_in_rule__Slicer__Group__7__Impl1060);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:551:1: rule__Slicer__Group__8 : rule__Slicer__Group__8__Impl rule__Slicer__Group__9 ;
    public final void rule__Slicer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:555:1: ( rule__Slicer__Group__8__Impl rule__Slicer__Group__9 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:556:2: rule__Slicer__Group__8__Impl rule__Slicer__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__8__Impl_in_rule__Slicer__Group__81090);
            rule__Slicer__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__9_in_rule__Slicer__Group__81093);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:563:1: rule__Slicer__Group__8__Impl : ( 'input' ) ;
    public final void rule__Slicer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:567:1: ( ( 'input' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:568:1: ( 'input' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:568:1: ( 'input' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:569:1: 'input'
            {
             before(grammarAccess.getSlicerAccess().getInputKeyword_8()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Slicer__Group__8__Impl1121); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:582:1: rule__Slicer__Group__9 : rule__Slicer__Group__9__Impl rule__Slicer__Group__10 ;
    public final void rule__Slicer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:586:1: ( rule__Slicer__Group__9__Impl rule__Slicer__Group__10 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:587:2: rule__Slicer__Group__9__Impl rule__Slicer__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__9__Impl_in_rule__Slicer__Group__91152);
            rule__Slicer__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__10_in_rule__Slicer__Group__91155);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:594:1: rule__Slicer__Group__9__Impl : ( ':' ) ;
    public final void rule__Slicer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:598:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:599:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:599:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:600:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_9()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group__9__Impl1183); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:613:1: rule__Slicer__Group__10 : rule__Slicer__Group__10__Impl rule__Slicer__Group__11 ;
    public final void rule__Slicer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:617:1: ( rule__Slicer__Group__10__Impl rule__Slicer__Group__11 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:618:2: rule__Slicer__Group__10__Impl rule__Slicer__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__10__Impl_in_rule__Slicer__Group__101214);
            rule__Slicer__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__11_in_rule__Slicer__Group__101217);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:625:1: rule__Slicer__Group__10__Impl : ( ( rule__Slicer__InputClassesAssignment_10 ) ) ;
    public final void rule__Slicer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:629:1: ( ( ( rule__Slicer__InputClassesAssignment_10 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:630:1: ( ( rule__Slicer__InputClassesAssignment_10 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:630:1: ( ( rule__Slicer__InputClassesAssignment_10 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:631:1: ( rule__Slicer__InputClassesAssignment_10 )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesAssignment_10()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:632:1: ( rule__Slicer__InputClassesAssignment_10 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:632:2: rule__Slicer__InputClassesAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__InputClassesAssignment_10_in_rule__Slicer__Group__10__Impl1244);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:642:1: rule__Slicer__Group__11 : rule__Slicer__Group__11__Impl rule__Slicer__Group__12 ;
    public final void rule__Slicer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:646:1: ( rule__Slicer__Group__11__Impl rule__Slicer__Group__12 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:647:2: rule__Slicer__Group__11__Impl rule__Slicer__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__11__Impl_in_rule__Slicer__Group__111274);
            rule__Slicer__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__12_in_rule__Slicer__Group__111277);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:654:1: rule__Slicer__Group__11__Impl : ( ( rule__Slicer__Group_11__0 )* ) ;
    public final void rule__Slicer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:658:1: ( ( ( rule__Slicer__Group_11__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:659:1: ( ( rule__Slicer__Group_11__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:659:1: ( ( rule__Slicer__Group_11__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:660:1: ( rule__Slicer__Group_11__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_11()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:661:1: ( rule__Slicer__Group_11__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:661:2: rule__Slicer__Group_11__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__0_in_rule__Slicer__Group__11__Impl1304);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:671:1: rule__Slicer__Group__12 : rule__Slicer__Group__12__Impl rule__Slicer__Group__13 ;
    public final void rule__Slicer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:675:1: ( rule__Slicer__Group__12__Impl rule__Slicer__Group__13 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:676:2: rule__Slicer__Group__12__Impl rule__Slicer__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__12__Impl_in_rule__Slicer__Group__121335);
            rule__Slicer__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__13_in_rule__Slicer__Group__121338);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:683:1: rule__Slicer__Group__12__Impl : ( ( rule__Slicer__Group_12__0 )? ) ;
    public final void rule__Slicer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:687:1: ( ( ( rule__Slicer__Group_12__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:688:1: ( ( rule__Slicer__Group_12__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:688:1: ( ( rule__Slicer__Group_12__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:689:1: ( rule__Slicer__Group_12__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_12()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:690:1: ( rule__Slicer__Group_12__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:690:2: rule__Slicer__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__0_in_rule__Slicer__Group__12__Impl1365);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:700:1: rule__Slicer__Group__13 : rule__Slicer__Group__13__Impl rule__Slicer__Group__14 ;
    public final void rule__Slicer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:704:1: ( rule__Slicer__Group__13__Impl rule__Slicer__Group__14 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:705:2: rule__Slicer__Group__13__Impl rule__Slicer__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__13__Impl_in_rule__Slicer__Group__131396);
            rule__Slicer__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__14_in_rule__Slicer__Group__131399);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:712:1: rule__Slicer__Group__13__Impl : ( ( rule__Slicer__Group_13__0 )* ) ;
    public final void rule__Slicer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:716:1: ( ( ( rule__Slicer__Group_13__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:717:1: ( ( rule__Slicer__Group_13__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:717:1: ( ( rule__Slicer__Group_13__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:718:1: ( rule__Slicer__Group_13__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_13()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:719:1: ( rule__Slicer__Group_13__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:719:2: rule__Slicer__Group_13__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__0_in_rule__Slicer__Group__13__Impl1426);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:729:1: rule__Slicer__Group__14 : rule__Slicer__Group__14__Impl rule__Slicer__Group__15 ;
    public final void rule__Slicer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:733:1: ( rule__Slicer__Group__14__Impl rule__Slicer__Group__15 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:734:2: rule__Slicer__Group__14__Impl rule__Slicer__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__14__Impl_in_rule__Slicer__Group__141457);
            rule__Slicer__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__15_in_rule__Slicer__Group__141460);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:741:1: rule__Slicer__Group__14__Impl : ( ( rule__Slicer__Group_14__0 )* ) ;
    public final void rule__Slicer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:745:1: ( ( ( rule__Slicer__Group_14__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:746:1: ( ( rule__Slicer__Group_14__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:746:1: ( ( rule__Slicer__Group_14__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:747:1: ( rule__Slicer__Group_14__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_14()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:748:1: ( rule__Slicer__Group_14__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:748:2: rule__Slicer__Group_14__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__0_in_rule__Slicer__Group__14__Impl1487);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:758:1: rule__Slicer__Group__15 : rule__Slicer__Group__15__Impl rule__Slicer__Group__16 ;
    public final void rule__Slicer__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:762:1: ( rule__Slicer__Group__15__Impl rule__Slicer__Group__16 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:763:2: rule__Slicer__Group__15__Impl rule__Slicer__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__15__Impl_in_rule__Slicer__Group__151518);
            rule__Slicer__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__16_in_rule__Slicer__Group__151521);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:770:1: rule__Slicer__Group__15__Impl : ( ( rule__Slicer__Group_15__0 )* ) ;
    public final void rule__Slicer__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:774:1: ( ( ( rule__Slicer__Group_15__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:775:1: ( ( rule__Slicer__Group_15__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:775:1: ( ( rule__Slicer__Group_15__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:776:1: ( rule__Slicer__Group_15__0 )*
            {
             before(grammarAccess.getSlicerAccess().getGroup_15()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:777:1: ( rule__Slicer__Group_15__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:777:2: rule__Slicer__Group_15__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__0_in_rule__Slicer__Group__15__Impl1548);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:787:1: rule__Slicer__Group__16 : rule__Slicer__Group__16__Impl rule__Slicer__Group__17 ;
    public final void rule__Slicer__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:791:1: ( rule__Slicer__Group__16__Impl rule__Slicer__Group__17 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:792:2: rule__Slicer__Group__16__Impl rule__Slicer__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__16__Impl_in_rule__Slicer__Group__161579);
            rule__Slicer__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__17_in_rule__Slicer__Group__161582);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:799:1: rule__Slicer__Group__16__Impl : ( ( rule__Slicer__Group_16__0 )? ) ;
    public final void rule__Slicer__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:803:1: ( ( ( rule__Slicer__Group_16__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:804:1: ( ( rule__Slicer__Group_16__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:804:1: ( ( rule__Slicer__Group_16__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:805:1: ( rule__Slicer__Group_16__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_16()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:806:1: ( rule__Slicer__Group_16__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:806:2: rule__Slicer__Group_16__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__0_in_rule__Slicer__Group__16__Impl1609);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:816:1: rule__Slicer__Group__17 : rule__Slicer__Group__17__Impl rule__Slicer__Group__18 ;
    public final void rule__Slicer__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:820:1: ( rule__Slicer__Group__17__Impl rule__Slicer__Group__18 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:821:2: rule__Slicer__Group__17__Impl rule__Slicer__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__17__Impl_in_rule__Slicer__Group__171640);
            rule__Slicer__Group__17__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__18_in_rule__Slicer__Group__171643);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:828:1: rule__Slicer__Group__17__Impl : ( ( rule__Slicer__Group_17__0 )? ) ;
    public final void rule__Slicer__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:832:1: ( ( ( rule__Slicer__Group_17__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:833:1: ( ( rule__Slicer__Group_17__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:833:1: ( ( rule__Slicer__Group_17__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:834:1: ( rule__Slicer__Group_17__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_17()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:835:1: ( rule__Slicer__Group_17__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:835:2: rule__Slicer__Group_17__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__0_in_rule__Slicer__Group__17__Impl1670);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:845:1: rule__Slicer__Group__18 : rule__Slicer__Group__18__Impl rule__Slicer__Group__19 ;
    public final void rule__Slicer__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:849:1: ( rule__Slicer__Group__18__Impl rule__Slicer__Group__19 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:850:2: rule__Slicer__Group__18__Impl rule__Slicer__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__18__Impl_in_rule__Slicer__Group__181701);
            rule__Slicer__Group__18__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__19_in_rule__Slicer__Group__181704);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:857:1: rule__Slicer__Group__18__Impl : ( ( rule__Slicer__Group_18__0 )? ) ;
    public final void rule__Slicer__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:861:1: ( ( ( rule__Slicer__Group_18__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:862:1: ( ( rule__Slicer__Group_18__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:862:1: ( ( rule__Slicer__Group_18__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:863:1: ( rule__Slicer__Group_18__0 )?
            {
             before(grammarAccess.getSlicerAccess().getGroup_18()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:864:1: ( rule__Slicer__Group_18__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:864:2: rule__Slicer__Group_18__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__0_in_rule__Slicer__Group__18__Impl1731);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:874:1: rule__Slicer__Group__19 : rule__Slicer__Group__19__Impl ;
    public final void rule__Slicer__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:878:1: ( rule__Slicer__Group__19__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:879:2: rule__Slicer__Group__19__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group__19__Impl_in_rule__Slicer__Group__191762);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:885:1: rule__Slicer__Group__19__Impl : ( '}' ) ;
    public final void rule__Slicer__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:889:1: ( ( '}' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:890:1: ( '}' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:890:1: ( '}' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:891:1: '}'
            {
             before(grammarAccess.getSlicerAccess().getRightCurlyBracketKeyword_19()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Slicer__Group__19__Impl1790); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:944:1: rule__Slicer__Group_11__0 : rule__Slicer__Group_11__0__Impl rule__Slicer__Group_11__1 ;
    public final void rule__Slicer__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:948:1: ( rule__Slicer__Group_11__0__Impl rule__Slicer__Group_11__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:949:2: rule__Slicer__Group_11__0__Impl rule__Slicer__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__0__Impl_in_rule__Slicer__Group_11__01861);
            rule__Slicer__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__1_in_rule__Slicer__Group_11__01864);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:956:1: rule__Slicer__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Slicer__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:960:1: ( ( ',' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:961:1: ( ',' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:961:1: ( ',' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:962:1: ','
            {
             before(grammarAccess.getSlicerAccess().getCommaKeyword_11_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Slicer__Group_11__0__Impl1892); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:975:1: rule__Slicer__Group_11__1 : rule__Slicer__Group_11__1__Impl ;
    public final void rule__Slicer__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:979:1: ( rule__Slicer__Group_11__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:980:2: rule__Slicer__Group_11__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_11__1__Impl_in_rule__Slicer__Group_11__11923);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:986:1: rule__Slicer__Group_11__1__Impl : ( ( rule__Slicer__InputClassesAssignment_11_1 ) ) ;
    public final void rule__Slicer__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:990:1: ( ( ( rule__Slicer__InputClassesAssignment_11_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:991:1: ( ( rule__Slicer__InputClassesAssignment_11_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:991:1: ( ( rule__Slicer__InputClassesAssignment_11_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:992:1: ( rule__Slicer__InputClassesAssignment_11_1 )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesAssignment_11_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:993:1: ( rule__Slicer__InputClassesAssignment_11_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:993:2: rule__Slicer__InputClassesAssignment_11_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__InputClassesAssignment_11_1_in_rule__Slicer__Group_11__1__Impl1950);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1007:1: rule__Slicer__Group_12__0 : rule__Slicer__Group_12__0__Impl rule__Slicer__Group_12__1 ;
    public final void rule__Slicer__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1011:1: ( rule__Slicer__Group_12__0__Impl rule__Slicer__Group_12__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1012:2: rule__Slicer__Group_12__0__Impl rule__Slicer__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__0__Impl_in_rule__Slicer__Group_12__01984);
            rule__Slicer__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__1_in_rule__Slicer__Group_12__01987);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1019:1: rule__Slicer__Group_12__0__Impl : ( 'radius' ) ;
    public final void rule__Slicer__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1023:1: ( ( 'radius' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1024:1: ( 'radius' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1024:1: ( 'radius' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1025:1: 'radius'
            {
             before(grammarAccess.getSlicerAccess().getRadiusKeyword_12_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Slicer__Group_12__0__Impl2015); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1038:1: rule__Slicer__Group_12__1 : rule__Slicer__Group_12__1__Impl rule__Slicer__Group_12__2 ;
    public final void rule__Slicer__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1042:1: ( rule__Slicer__Group_12__1__Impl rule__Slicer__Group_12__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1043:2: rule__Slicer__Group_12__1__Impl rule__Slicer__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__1__Impl_in_rule__Slicer__Group_12__12046);
            rule__Slicer__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__2_in_rule__Slicer__Group_12__12049);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1050:1: rule__Slicer__Group_12__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1054:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1055:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1055:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1056:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_12_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_12__1__Impl2077); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1069:1: rule__Slicer__Group_12__2 : rule__Slicer__Group_12__2__Impl ;
    public final void rule__Slicer__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1073:1: ( rule__Slicer__Group_12__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1074:2: rule__Slicer__Group_12__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_12__2__Impl_in_rule__Slicer__Group_12__22108);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1080:1: rule__Slicer__Group_12__2__Impl : ( ( rule__Slicer__RadiusAssignment_12_2 ) ) ;
    public final void rule__Slicer__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1084:1: ( ( ( rule__Slicer__RadiusAssignment_12_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1085:1: ( ( rule__Slicer__RadiusAssignment_12_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1085:1: ( ( rule__Slicer__RadiusAssignment_12_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1086:1: ( rule__Slicer__RadiusAssignment_12_2 )
            {
             before(grammarAccess.getSlicerAccess().getRadiusAssignment_12_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1087:1: ( rule__Slicer__RadiusAssignment_12_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1087:2: rule__Slicer__RadiusAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__RadiusAssignment_12_2_in_rule__Slicer__Group_12__2__Impl2135);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1103:1: rule__Slicer__Group_13__0 : rule__Slicer__Group_13__0__Impl rule__Slicer__Group_13__1 ;
    public final void rule__Slicer__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1107:1: ( rule__Slicer__Group_13__0__Impl rule__Slicer__Group_13__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1108:2: rule__Slicer__Group_13__0__Impl rule__Slicer__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__0__Impl_in_rule__Slicer__Group_13__02171);
            rule__Slicer__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__1_in_rule__Slicer__Group_13__02174);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1115:1: rule__Slicer__Group_13__0__Impl : ( 'constraint' ) ;
    public final void rule__Slicer__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1119:1: ( ( 'constraint' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1120:1: ( 'constraint' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1120:1: ( 'constraint' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1121:1: 'constraint'
            {
             before(grammarAccess.getSlicerAccess().getConstraintKeyword_13_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Slicer__Group_13__0__Impl2202); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1134:1: rule__Slicer__Group_13__1 : rule__Slicer__Group_13__1__Impl rule__Slicer__Group_13__2 ;
    public final void rule__Slicer__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1138:1: ( rule__Slicer__Group_13__1__Impl rule__Slicer__Group_13__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1139:2: rule__Slicer__Group_13__1__Impl rule__Slicer__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__1__Impl_in_rule__Slicer__Group_13__12233);
            rule__Slicer__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__2_in_rule__Slicer__Group_13__12236);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1146:1: rule__Slicer__Group_13__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1150:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1151:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1151:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1152:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_13_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_13__1__Impl2264); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1165:1: rule__Slicer__Group_13__2 : rule__Slicer__Group_13__2__Impl ;
    public final void rule__Slicer__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1169:1: ( rule__Slicer__Group_13__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1170:2: rule__Slicer__Group_13__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_13__2__Impl_in_rule__Slicer__Group_13__22295);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1176:1: rule__Slicer__Group_13__2__Impl : ( ( rule__Slicer__ConstraintsAssignment_13_2 ) ) ;
    public final void rule__Slicer__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1180:1: ( ( ( rule__Slicer__ConstraintsAssignment_13_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1181:1: ( ( rule__Slicer__ConstraintsAssignment_13_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1181:1: ( ( rule__Slicer__ConstraintsAssignment_13_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1182:1: ( rule__Slicer__ConstraintsAssignment_13_2 )
            {
             before(grammarAccess.getSlicerAccess().getConstraintsAssignment_13_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1183:1: ( rule__Slicer__ConstraintsAssignment_13_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1183:2: rule__Slicer__ConstraintsAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__ConstraintsAssignment_13_2_in_rule__Slicer__Group_13__2__Impl2322);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1199:1: rule__Slicer__Group_14__0 : rule__Slicer__Group_14__0__Impl rule__Slicer__Group_14__1 ;
    public final void rule__Slicer__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1203:1: ( rule__Slicer__Group_14__0__Impl rule__Slicer__Group_14__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1204:2: rule__Slicer__Group_14__0__Impl rule__Slicer__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__0__Impl_in_rule__Slicer__Group_14__02358);
            rule__Slicer__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__1_in_rule__Slicer__Group_14__02361);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1211:1: rule__Slicer__Group_14__0__Impl : ( 'slicedClass' ) ;
    public final void rule__Slicer__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1215:1: ( ( 'slicedClass' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1216:1: ( 'slicedClass' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1216:1: ( 'slicedClass' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1217:1: 'slicedClass'
            {
             before(grammarAccess.getSlicerAccess().getSlicedClassKeyword_14_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Slicer__Group_14__0__Impl2389); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1230:1: rule__Slicer__Group_14__1 : rule__Slicer__Group_14__1__Impl rule__Slicer__Group_14__2 ;
    public final void rule__Slicer__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1234:1: ( rule__Slicer__Group_14__1__Impl rule__Slicer__Group_14__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1235:2: rule__Slicer__Group_14__1__Impl rule__Slicer__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__1__Impl_in_rule__Slicer__Group_14__12420);
            rule__Slicer__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__2_in_rule__Slicer__Group_14__12423);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1242:1: rule__Slicer__Group_14__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1246:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1247:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1247:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1248:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_14_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_14__1__Impl2451); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1261:1: rule__Slicer__Group_14__2 : rule__Slicer__Group_14__2__Impl ;
    public final void rule__Slicer__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1265:1: ( rule__Slicer__Group_14__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1266:2: rule__Slicer__Group_14__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_14__2__Impl_in_rule__Slicer__Group_14__22482);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1272:1: rule__Slicer__Group_14__2__Impl : ( ( rule__Slicer__SlicedElementsAssignment_14_2 ) ) ;
    public final void rule__Slicer__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1276:1: ( ( ( rule__Slicer__SlicedElementsAssignment_14_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1277:1: ( ( rule__Slicer__SlicedElementsAssignment_14_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1277:1: ( ( rule__Slicer__SlicedElementsAssignment_14_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1278:1: ( rule__Slicer__SlicedElementsAssignment_14_2 )
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_14_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1279:1: ( rule__Slicer__SlicedElementsAssignment_14_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1279:2: rule__Slicer__SlicedElementsAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__SlicedElementsAssignment_14_2_in_rule__Slicer__Group_14__2__Impl2509);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1295:1: rule__Slicer__Group_15__0 : rule__Slicer__Group_15__0__Impl rule__Slicer__Group_15__1 ;
    public final void rule__Slicer__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1299:1: ( rule__Slicer__Group_15__0__Impl rule__Slicer__Group_15__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1300:2: rule__Slicer__Group_15__0__Impl rule__Slicer__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__0__Impl_in_rule__Slicer__Group_15__02545);
            rule__Slicer__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__1_in_rule__Slicer__Group_15__02548);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1307:1: rule__Slicer__Group_15__0__Impl : ( 'slicedProperty' ) ;
    public final void rule__Slicer__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1311:1: ( ( 'slicedProperty' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1312:1: ( 'slicedProperty' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1312:1: ( 'slicedProperty' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1313:1: 'slicedProperty'
            {
             before(grammarAccess.getSlicerAccess().getSlicedPropertyKeyword_15_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Slicer__Group_15__0__Impl2576); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1326:1: rule__Slicer__Group_15__1 : rule__Slicer__Group_15__1__Impl rule__Slicer__Group_15__2 ;
    public final void rule__Slicer__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1330:1: ( rule__Slicer__Group_15__1__Impl rule__Slicer__Group_15__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1331:2: rule__Slicer__Group_15__1__Impl rule__Slicer__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__1__Impl_in_rule__Slicer__Group_15__12607);
            rule__Slicer__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__2_in_rule__Slicer__Group_15__12610);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1338:1: rule__Slicer__Group_15__1__Impl : ( ':' ) ;
    public final void rule__Slicer__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1342:1: ( ( ':' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1343:1: ( ':' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1343:1: ( ':' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1344:1: ':'
            {
             before(grammarAccess.getSlicerAccess().getColonKeyword_15_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Slicer__Group_15__1__Impl2638); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1357:1: rule__Slicer__Group_15__2 : rule__Slicer__Group_15__2__Impl ;
    public final void rule__Slicer__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1361:1: ( rule__Slicer__Group_15__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1362:2: rule__Slicer__Group_15__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_15__2__Impl_in_rule__Slicer__Group_15__22669);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1368:1: rule__Slicer__Group_15__2__Impl : ( ( rule__Slicer__SlicedElementsAssignment_15_2 ) ) ;
    public final void rule__Slicer__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1372:1: ( ( ( rule__Slicer__SlicedElementsAssignment_15_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1373:1: ( ( rule__Slicer__SlicedElementsAssignment_15_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1373:1: ( ( rule__Slicer__SlicedElementsAssignment_15_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1374:1: ( rule__Slicer__SlicedElementsAssignment_15_2 )
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsAssignment_15_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1375:1: ( rule__Slicer__SlicedElementsAssignment_15_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1375:2: rule__Slicer__SlicedElementsAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__SlicedElementsAssignment_15_2_in_rule__Slicer__Group_15__2__Impl2696);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1391:1: rule__Slicer__Group_16__0 : rule__Slicer__Group_16__0__Impl rule__Slicer__Group_16__1 ;
    public final void rule__Slicer__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1395:1: ( rule__Slicer__Group_16__0__Impl rule__Slicer__Group_16__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1396:2: rule__Slicer__Group_16__0__Impl rule__Slicer__Group_16__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__0__Impl_in_rule__Slicer__Group_16__02732);
            rule__Slicer__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__1_in_rule__Slicer__Group_16__02735);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1403:1: rule__Slicer__Group_16__0__Impl : ( 'onStart' ) ;
    public final void rule__Slicer__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1407:1: ( ( 'onStart' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1408:1: ( 'onStart' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1408:1: ( 'onStart' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1409:1: 'onStart'
            {
             before(grammarAccess.getSlicerAccess().getOnStartKeyword_16_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Slicer__Group_16__0__Impl2763); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1422:1: rule__Slicer__Group_16__1 : rule__Slicer__Group_16__1__Impl rule__Slicer__Group_16__2 ;
    public final void rule__Slicer__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1426:1: ( rule__Slicer__Group_16__1__Impl rule__Slicer__Group_16__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1427:2: rule__Slicer__Group_16__1__Impl rule__Slicer__Group_16__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__1__Impl_in_rule__Slicer__Group_16__12794);
            rule__Slicer__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__2_in_rule__Slicer__Group_16__12797);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1434:1: rule__Slicer__Group_16__1__Impl : ( '[[' ) ;
    public final void rule__Slicer__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1438:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1439:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1439:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1440:1: '[['
            {
             before(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_16_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Slicer__Group_16__1__Impl2825); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1453:1: rule__Slicer__Group_16__2 : rule__Slicer__Group_16__2__Impl rule__Slicer__Group_16__3 ;
    public final void rule__Slicer__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1457:1: ( rule__Slicer__Group_16__2__Impl rule__Slicer__Group_16__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1458:2: rule__Slicer__Group_16__2__Impl rule__Slicer__Group_16__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__2__Impl_in_rule__Slicer__Group_16__22856);
            rule__Slicer__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__3_in_rule__Slicer__Group_16__22859);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1465:1: rule__Slicer__Group_16__2__Impl : ( ( rule__Slicer__OnStartAssignment_16_2 ) ) ;
    public final void rule__Slicer__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1469:1: ( ( ( rule__Slicer__OnStartAssignment_16_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1470:1: ( ( rule__Slicer__OnStartAssignment_16_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1470:1: ( ( rule__Slicer__OnStartAssignment_16_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1471:1: ( rule__Slicer__OnStartAssignment_16_2 )
            {
             before(grammarAccess.getSlicerAccess().getOnStartAssignment_16_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1472:1: ( rule__Slicer__OnStartAssignment_16_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1472:2: rule__Slicer__OnStartAssignment_16_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__OnStartAssignment_16_2_in_rule__Slicer__Group_16__2__Impl2886);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1482:1: rule__Slicer__Group_16__3 : rule__Slicer__Group_16__3__Impl ;
    public final void rule__Slicer__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1486:1: ( rule__Slicer__Group_16__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1487:2: rule__Slicer__Group_16__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_16__3__Impl_in_rule__Slicer__Group_16__32916);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1493:1: rule__Slicer__Group_16__3__Impl : ( ']]' ) ;
    public final void rule__Slicer__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1497:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1498:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1498:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1499:1: ']]'
            {
             before(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_16_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Slicer__Group_16__3__Impl2944); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1520:1: rule__Slicer__Group_17__0 : rule__Slicer__Group_17__0__Impl rule__Slicer__Group_17__1 ;
    public final void rule__Slicer__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1524:1: ( rule__Slicer__Group_17__0__Impl rule__Slicer__Group_17__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1525:2: rule__Slicer__Group_17__0__Impl rule__Slicer__Group_17__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__0__Impl_in_rule__Slicer__Group_17__02983);
            rule__Slicer__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__1_in_rule__Slicer__Group_17__02986);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1532:1: rule__Slicer__Group_17__0__Impl : ( 'onEnd' ) ;
    public final void rule__Slicer__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1536:1: ( ( 'onEnd' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1537:1: ( 'onEnd' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1537:1: ( 'onEnd' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1538:1: 'onEnd'
            {
             before(grammarAccess.getSlicerAccess().getOnEndKeyword_17_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Slicer__Group_17__0__Impl3014); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1551:1: rule__Slicer__Group_17__1 : rule__Slicer__Group_17__1__Impl rule__Slicer__Group_17__2 ;
    public final void rule__Slicer__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1555:1: ( rule__Slicer__Group_17__1__Impl rule__Slicer__Group_17__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1556:2: rule__Slicer__Group_17__1__Impl rule__Slicer__Group_17__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__1__Impl_in_rule__Slicer__Group_17__13045);
            rule__Slicer__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__2_in_rule__Slicer__Group_17__13048);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1563:1: rule__Slicer__Group_17__1__Impl : ( '[[' ) ;
    public final void rule__Slicer__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1567:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1568:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1568:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1569:1: '[['
            {
             before(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_17_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Slicer__Group_17__1__Impl3076); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1582:1: rule__Slicer__Group_17__2 : rule__Slicer__Group_17__2__Impl rule__Slicer__Group_17__3 ;
    public final void rule__Slicer__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1586:1: ( rule__Slicer__Group_17__2__Impl rule__Slicer__Group_17__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1587:2: rule__Slicer__Group_17__2__Impl rule__Slicer__Group_17__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__2__Impl_in_rule__Slicer__Group_17__23107);
            rule__Slicer__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__3_in_rule__Slicer__Group_17__23110);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1594:1: rule__Slicer__Group_17__2__Impl : ( ( rule__Slicer__OnEndAssignment_17_2 ) ) ;
    public final void rule__Slicer__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1598:1: ( ( ( rule__Slicer__OnEndAssignment_17_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1599:1: ( ( rule__Slicer__OnEndAssignment_17_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1599:1: ( ( rule__Slicer__OnEndAssignment_17_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1600:1: ( rule__Slicer__OnEndAssignment_17_2 )
            {
             before(grammarAccess.getSlicerAccess().getOnEndAssignment_17_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1601:1: ( rule__Slicer__OnEndAssignment_17_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1601:2: rule__Slicer__OnEndAssignment_17_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__OnEndAssignment_17_2_in_rule__Slicer__Group_17__2__Impl3137);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1611:1: rule__Slicer__Group_17__3 : rule__Slicer__Group_17__3__Impl ;
    public final void rule__Slicer__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1615:1: ( rule__Slicer__Group_17__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1616:2: rule__Slicer__Group_17__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_17__3__Impl_in_rule__Slicer__Group_17__33167);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1622:1: rule__Slicer__Group_17__3__Impl : ( ']]' ) ;
    public final void rule__Slicer__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1626:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1627:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1627:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1628:1: ']]'
            {
             before(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_17_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Slicer__Group_17__3__Impl3195); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1649:1: rule__Slicer__Group_18__0 : rule__Slicer__Group_18__0__Impl rule__Slicer__Group_18__1 ;
    public final void rule__Slicer__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1653:1: ( rule__Slicer__Group_18__0__Impl rule__Slicer__Group_18__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1654:2: rule__Slicer__Group_18__0__Impl rule__Slicer__Group_18__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__0__Impl_in_rule__Slicer__Group_18__03234);
            rule__Slicer__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__1_in_rule__Slicer__Group_18__03237);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1661:1: rule__Slicer__Group_18__0__Impl : ( 'helper' ) ;
    public final void rule__Slicer__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1665:1: ( ( 'helper' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1666:1: ( 'helper' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1666:1: ( 'helper' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1667:1: 'helper'
            {
             before(grammarAccess.getSlicerAccess().getHelperKeyword_18_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Slicer__Group_18__0__Impl3265); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1680:1: rule__Slicer__Group_18__1 : rule__Slicer__Group_18__1__Impl rule__Slicer__Group_18__2 ;
    public final void rule__Slicer__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1684:1: ( rule__Slicer__Group_18__1__Impl rule__Slicer__Group_18__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1685:2: rule__Slicer__Group_18__1__Impl rule__Slicer__Group_18__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__1__Impl_in_rule__Slicer__Group_18__13296);
            rule__Slicer__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__2_in_rule__Slicer__Group_18__13299);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1692:1: rule__Slicer__Group_18__1__Impl : ( '[[' ) ;
    public final void rule__Slicer__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1696:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1697:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1697:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1698:1: '[['
            {
             before(grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_18_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Slicer__Group_18__1__Impl3327); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1711:1: rule__Slicer__Group_18__2 : rule__Slicer__Group_18__2__Impl rule__Slicer__Group_18__3 ;
    public final void rule__Slicer__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1715:1: ( rule__Slicer__Group_18__2__Impl rule__Slicer__Group_18__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1716:2: rule__Slicer__Group_18__2__Impl rule__Slicer__Group_18__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__2__Impl_in_rule__Slicer__Group_18__23358);
            rule__Slicer__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__3_in_rule__Slicer__Group_18__23361);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1723:1: rule__Slicer__Group_18__2__Impl : ( ( rule__Slicer__HelperAssignment_18_2 ) ) ;
    public final void rule__Slicer__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1727:1: ( ( ( rule__Slicer__HelperAssignment_18_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1728:1: ( ( rule__Slicer__HelperAssignment_18_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1728:1: ( ( rule__Slicer__HelperAssignment_18_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1729:1: ( rule__Slicer__HelperAssignment_18_2 )
            {
             before(grammarAccess.getSlicerAccess().getHelperAssignment_18_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1730:1: ( rule__Slicer__HelperAssignment_18_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1730:2: rule__Slicer__HelperAssignment_18_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__HelperAssignment_18_2_in_rule__Slicer__Group_18__2__Impl3388);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1740:1: rule__Slicer__Group_18__3 : rule__Slicer__Group_18__3__Impl ;
    public final void rule__Slicer__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1744:1: ( rule__Slicer__Group_18__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1745:2: rule__Slicer__Group_18__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Slicer__Group_18__3__Impl_in_rule__Slicer__Group_18__33418);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1751:1: rule__Slicer__Group_18__3__Impl : ( ']]' ) ;
    public final void rule__Slicer__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1755:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1756:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1756:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1757:1: ']]'
            {
             before(grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_18_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Slicer__Group_18__3__Impl3446); 
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


    // $ANTLR start "rule__Constraint__Group__0"
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1778:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1782:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1783:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03485);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03488);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1790:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__NameAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1794:1: ( ( ( rule__Constraint__NameAssignment_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1795:1: ( ( rule__Constraint__NameAssignment_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1795:1: ( ( rule__Constraint__NameAssignment_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1796:1: ( rule__Constraint__NameAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1797:1: ( rule__Constraint__NameAssignment_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1797:2: rule__Constraint__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__NameAssignment_0_in_rule__Constraint__Group__0__Impl3515);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1807:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1811:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1812:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13545);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13548);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1819:1: rule__Constraint__Group__1__Impl : ( '[[' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1823:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1824:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1824:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1825:1: '[['
            {
             before(grammarAccess.getConstraintAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Constraint__Group__1__Impl3576); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1838:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1842:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1843:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23607);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23610);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1850:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ExpressionAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1854:1: ( ( ( rule__Constraint__ExpressionAssignment_2 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1855:1: ( ( rule__Constraint__ExpressionAssignment_2 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1855:1: ( ( rule__Constraint__ExpressionAssignment_2 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1856:1: ( rule__Constraint__ExpressionAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getExpressionAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1857:1: ( rule__Constraint__ExpressionAssignment_2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1857:2: rule__Constraint__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__ExpressionAssignment_2_in_rule__Constraint__Group__2__Impl3637);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1867:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1871:1: ( rule__Constraint__Group__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1872:2: rule__Constraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33667);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1878:1: rule__Constraint__Group__3__Impl : ( ']]' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1882:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1883:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1883:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1884:1: ']]'
            {
             before(grammarAccess.getConstraintAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Constraint__Group__3__Impl3695); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1905:1: rule__Radius__Group__0 : rule__Radius__Group__0__Impl rule__Radius__Group__1 ;
    public final void rule__Radius__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1909:1: ( rule__Radius__Group__0__Impl rule__Radius__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1910:2: rule__Radius__Group__0__Impl rule__Radius__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__0__Impl_in_rule__Radius__Group__03734);
            rule__Radius__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__1_in_rule__Radius__Group__03737);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1917:1: rule__Radius__Group__0__Impl : ( () ) ;
    public final void rule__Radius__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1921:1: ( ( () ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1922:1: ( () )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1922:1: ( () )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1923:1: ()
            {
             before(grammarAccess.getRadiusAccess().getRadiusAction_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1924:1: ()
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1926:1: 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1936:1: rule__Radius__Group__1 : rule__Radius__Group__1__Impl ;
    public final void rule__Radius__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1940:1: ( rule__Radius__Group__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1941:2: rule__Radius__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group__1__Impl_in_rule__Radius__Group__13795);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1947:1: rule__Radius__Group__1__Impl : ( ( rule__Radius__Group_1__0 )? ) ;
    public final void rule__Radius__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1951:1: ( ( ( rule__Radius__Group_1__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1952:1: ( ( rule__Radius__Group_1__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1952:1: ( ( rule__Radius__Group_1__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1953:1: ( rule__Radius__Group_1__0 )?
            {
             before(grammarAccess.getRadiusAccess().getGroup_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1954:1: ( rule__Radius__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1954:2: rule__Radius__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__0_in_rule__Radius__Group__1__Impl3822);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1968:1: rule__Radius__Group_1__0 : rule__Radius__Group_1__0__Impl rule__Radius__Group_1__1 ;
    public final void rule__Radius__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1972:1: ( rule__Radius__Group_1__0__Impl rule__Radius__Group_1__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1973:2: rule__Radius__Group_1__0__Impl rule__Radius__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__0__Impl_in_rule__Radius__Group_1__03857);
            rule__Radius__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__1_in_rule__Radius__Group_1__03860);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1980:1: rule__Radius__Group_1__0__Impl : ( ( rule__Radius__FocusedClassesAssignment_1_0 ) ) ;
    public final void rule__Radius__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1984:1: ( ( ( rule__Radius__FocusedClassesAssignment_1_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1985:1: ( ( rule__Radius__FocusedClassesAssignment_1_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1985:1: ( ( rule__Radius__FocusedClassesAssignment_1_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1986:1: ( rule__Radius__FocusedClassesAssignment_1_0 )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesAssignment_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1987:1: ( rule__Radius__FocusedClassesAssignment_1_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1987:2: rule__Radius__FocusedClassesAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__FocusedClassesAssignment_1_0_in_rule__Radius__Group_1__0__Impl3887);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:1997:1: rule__Radius__Group_1__1 : rule__Radius__Group_1__1__Impl ;
    public final void rule__Radius__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2001:1: ( rule__Radius__Group_1__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2002:2: rule__Radius__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1__1__Impl_in_rule__Radius__Group_1__13917);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2008:1: rule__Radius__Group_1__1__Impl : ( ( rule__Radius__Group_1_1__0 )* ) ;
    public final void rule__Radius__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2012:1: ( ( ( rule__Radius__Group_1_1__0 )* ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2013:1: ( ( rule__Radius__Group_1_1__0 )* )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2013:1: ( ( rule__Radius__Group_1_1__0 )* )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2014:1: ( rule__Radius__Group_1_1__0 )*
            {
             before(grammarAccess.getRadiusAccess().getGroup_1_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2015:1: ( rule__Radius__Group_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2015:2: rule__Radius__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__0_in_rule__Radius__Group_1__1__Impl3944);
            	    rule__Radius__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2029:1: rule__Radius__Group_1_1__0 : rule__Radius__Group_1_1__0__Impl rule__Radius__Group_1_1__1 ;
    public final void rule__Radius__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2033:1: ( rule__Radius__Group_1_1__0__Impl rule__Radius__Group_1_1__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2034:2: rule__Radius__Group_1_1__0__Impl rule__Radius__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__0__Impl_in_rule__Radius__Group_1_1__03979);
            rule__Radius__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__1_in_rule__Radius__Group_1_1__03982);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2041:1: rule__Radius__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Radius__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2045:1: ( ( ',' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2046:1: ( ',' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2046:1: ( ',' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2047:1: ','
            {
             before(grammarAccess.getRadiusAccess().getCommaKeyword_1_1_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Radius__Group_1_1__0__Impl4010); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2060:1: rule__Radius__Group_1_1__1 : rule__Radius__Group_1_1__1__Impl ;
    public final void rule__Radius__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2064:1: ( rule__Radius__Group_1_1__1__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2065:2: rule__Radius__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__Group_1_1__1__Impl_in_rule__Radius__Group_1_1__14041);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2071:1: rule__Radius__Group_1_1__1__Impl : ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) ) ;
    public final void rule__Radius__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2075:1: ( ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2076:1: ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2076:1: ( ( rule__Radius__FocusedClassesAssignment_1_1_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2077:1: ( rule__Radius__FocusedClassesAssignment_1_1_1 )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesAssignment_1_1_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2078:1: ( rule__Radius__FocusedClassesAssignment_1_1_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2078:2: rule__Radius__FocusedClassesAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Radius__FocusedClassesAssignment_1_1_1_in_rule__Radius__Group_1_1__1__Impl4068);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2092:1: rule__SlicedClass__Group__0 : rule__SlicedClass__Group__0__Impl rule__SlicedClass__Group__1 ;
    public final void rule__SlicedClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2096:1: ( rule__SlicedClass__Group__0__Impl rule__SlicedClass__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2097:2: rule__SlicedClass__Group__0__Impl rule__SlicedClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__0__Impl_in_rule__SlicedClass__Group__04102);
            rule__SlicedClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__1_in_rule__SlicedClass__Group__04105);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2104:1: rule__SlicedClass__Group__0__Impl : ( ( rule__SlicedClass__DomainAssignment_0 ) ) ;
    public final void rule__SlicedClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2108:1: ( ( ( rule__SlicedClass__DomainAssignment_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2109:1: ( ( rule__SlicedClass__DomainAssignment_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2109:1: ( ( rule__SlicedClass__DomainAssignment_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2110:1: ( rule__SlicedClass__DomainAssignment_0 )
            {
             before(grammarAccess.getSlicedClassAccess().getDomainAssignment_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2111:1: ( rule__SlicedClass__DomainAssignment_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2111:2: rule__SlicedClass__DomainAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__DomainAssignment_0_in_rule__SlicedClass__Group__0__Impl4132);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2121:1: rule__SlicedClass__Group__1 : rule__SlicedClass__Group__1__Impl rule__SlicedClass__Group__2 ;
    public final void rule__SlicedClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2125:1: ( rule__SlicedClass__Group__1__Impl rule__SlicedClass__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2126:2: rule__SlicedClass__Group__1__Impl rule__SlicedClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__1__Impl_in_rule__SlicedClass__Group__14162);
            rule__SlicedClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__2_in_rule__SlicedClass__Group__14165);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2133:1: rule__SlicedClass__Group__1__Impl : ( ( rule__SlicedClass__IsOptionAssignment_1 )? ) ;
    public final void rule__SlicedClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2137:1: ( ( ( rule__SlicedClass__IsOptionAssignment_1 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2138:1: ( ( rule__SlicedClass__IsOptionAssignment_1 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2138:1: ( ( rule__SlicedClass__IsOptionAssignment_1 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2139:1: ( rule__SlicedClass__IsOptionAssignment_1 )?
            {
             before(grammarAccess.getSlicedClassAccess().getIsOptionAssignment_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2140:1: ( rule__SlicedClass__IsOptionAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2140:2: rule__SlicedClass__IsOptionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__IsOptionAssignment_1_in_rule__SlicedClass__Group__1__Impl4192);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2150:1: rule__SlicedClass__Group__2 : rule__SlicedClass__Group__2__Impl rule__SlicedClass__Group__3 ;
    public final void rule__SlicedClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2154:1: ( rule__SlicedClass__Group__2__Impl rule__SlicedClass__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2155:2: rule__SlicedClass__Group__2__Impl rule__SlicedClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__2__Impl_in_rule__SlicedClass__Group__24223);
            rule__SlicedClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__3_in_rule__SlicedClass__Group__24226);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2162:1: rule__SlicedClass__Group__2__Impl : ( ( rule__SlicedClass__CtxAssignment_2 )? ) ;
    public final void rule__SlicedClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2166:1: ( ( ( rule__SlicedClass__CtxAssignment_2 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2167:1: ( ( rule__SlicedClass__CtxAssignment_2 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2167:1: ( ( rule__SlicedClass__CtxAssignment_2 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2168:1: ( rule__SlicedClass__CtxAssignment_2 )?
            {
             before(grammarAccess.getSlicedClassAccess().getCtxAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2169:1: ( rule__SlicedClass__CtxAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2169:2: rule__SlicedClass__CtxAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__CtxAssignment_2_in_rule__SlicedClass__Group__2__Impl4253);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2179:1: rule__SlicedClass__Group__3 : rule__SlicedClass__Group__3__Impl ;
    public final void rule__SlicedClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2183:1: ( rule__SlicedClass__Group__3__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2184:2: rule__SlicedClass__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group__3__Impl_in_rule__SlicedClass__Group__34284);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2190:1: rule__SlicedClass__Group__3__Impl : ( ( rule__SlicedClass__Group_3__0 )? ) ;
    public final void rule__SlicedClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2194:1: ( ( ( rule__SlicedClass__Group_3__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2195:1: ( ( rule__SlicedClass__Group_3__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2195:1: ( ( rule__SlicedClass__Group_3__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2196:1: ( rule__SlicedClass__Group_3__0 )?
            {
             before(grammarAccess.getSlicedClassAccess().getGroup_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2197:1: ( rule__SlicedClass__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2197:2: rule__SlicedClass__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__0_in_rule__SlicedClass__Group__3__Impl4311);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2215:1: rule__SlicedClass__Group_3__0 : rule__SlicedClass__Group_3__0__Impl rule__SlicedClass__Group_3__1 ;
    public final void rule__SlicedClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2219:1: ( rule__SlicedClass__Group_3__0__Impl rule__SlicedClass__Group_3__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2220:2: rule__SlicedClass__Group_3__0__Impl rule__SlicedClass__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__0__Impl_in_rule__SlicedClass__Group_3__04350);
            rule__SlicedClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__1_in_rule__SlicedClass__Group_3__04353);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2227:1: rule__SlicedClass__Group_3__0__Impl : ( '[[' ) ;
    public final void rule__SlicedClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2231:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2232:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2232:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2233:1: '[['
            {
             before(grammarAccess.getSlicedClassAccess().getLeftSquareBracketLeftSquareBracketKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SlicedClass__Group_3__0__Impl4381); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2246:1: rule__SlicedClass__Group_3__1 : rule__SlicedClass__Group_3__1__Impl rule__SlicedClass__Group_3__2 ;
    public final void rule__SlicedClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2250:1: ( rule__SlicedClass__Group_3__1__Impl rule__SlicedClass__Group_3__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2251:2: rule__SlicedClass__Group_3__1__Impl rule__SlicedClass__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__1__Impl_in_rule__SlicedClass__Group_3__14412);
            rule__SlicedClass__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__2_in_rule__SlicedClass__Group_3__14415);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2258:1: rule__SlicedClass__Group_3__1__Impl : ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) ) ;
    public final void rule__SlicedClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2262:1: ( ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2263:1: ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2263:1: ( ( rule__SlicedClass__ExpressionAssignment_3_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2264:1: ( rule__SlicedClass__ExpressionAssignment_3_1 )
            {
             before(grammarAccess.getSlicedClassAccess().getExpressionAssignment_3_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2265:1: ( rule__SlicedClass__ExpressionAssignment_3_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2265:2: rule__SlicedClass__ExpressionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__ExpressionAssignment_3_1_in_rule__SlicedClass__Group_3__1__Impl4442);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2275:1: rule__SlicedClass__Group_3__2 : rule__SlicedClass__Group_3__2__Impl ;
    public final void rule__SlicedClass__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2279:1: ( rule__SlicedClass__Group_3__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2280:2: rule__SlicedClass__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedClass__Group_3__2__Impl_in_rule__SlicedClass__Group_3__24472);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2286:1: rule__SlicedClass__Group_3__2__Impl : ( ']]' ) ;
    public final void rule__SlicedClass__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2290:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2291:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2291:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2292:1: ']]'
            {
             before(grammarAccess.getSlicedClassAccess().getRightSquareBracketRightSquareBracketKeyword_3_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SlicedClass__Group_3__2__Impl4500); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2311:1: rule__SlicedProperty__Group__0 : rule__SlicedProperty__Group__0__Impl rule__SlicedProperty__Group__1 ;
    public final void rule__SlicedProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2315:1: ( rule__SlicedProperty__Group__0__Impl rule__SlicedProperty__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2316:2: rule__SlicedProperty__Group__0__Impl rule__SlicedProperty__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__0__Impl_in_rule__SlicedProperty__Group__04537);
            rule__SlicedProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__1_in_rule__SlicedProperty__Group__04540);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2323:1: rule__SlicedProperty__Group__0__Impl : ( ( rule__SlicedProperty__DomainAssignment_0 ) ) ;
    public final void rule__SlicedProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2327:1: ( ( ( rule__SlicedProperty__DomainAssignment_0 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2328:1: ( ( rule__SlicedProperty__DomainAssignment_0 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2328:1: ( ( rule__SlicedProperty__DomainAssignment_0 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2329:1: ( rule__SlicedProperty__DomainAssignment_0 )
            {
             before(grammarAccess.getSlicedPropertyAccess().getDomainAssignment_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2330:1: ( rule__SlicedProperty__DomainAssignment_0 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2330:2: rule__SlicedProperty__DomainAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__DomainAssignment_0_in_rule__SlicedProperty__Group__0__Impl4567);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2340:1: rule__SlicedProperty__Group__1 : rule__SlicedProperty__Group__1__Impl rule__SlicedProperty__Group__2 ;
    public final void rule__SlicedProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2344:1: ( rule__SlicedProperty__Group__1__Impl rule__SlicedProperty__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2345:2: rule__SlicedProperty__Group__1__Impl rule__SlicedProperty__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__1__Impl_in_rule__SlicedProperty__Group__14597);
            rule__SlicedProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__2_in_rule__SlicedProperty__Group__14600);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2352:1: rule__SlicedProperty__Group__1__Impl : ( ( rule__SlicedProperty__IsOptionAssignment_1 )? ) ;
    public final void rule__SlicedProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2356:1: ( ( ( rule__SlicedProperty__IsOptionAssignment_1 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2357:1: ( ( rule__SlicedProperty__IsOptionAssignment_1 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2357:1: ( ( rule__SlicedProperty__IsOptionAssignment_1 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2358:1: ( rule__SlicedProperty__IsOptionAssignment_1 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getIsOptionAssignment_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2359:1: ( rule__SlicedProperty__IsOptionAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2359:2: rule__SlicedProperty__IsOptionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__IsOptionAssignment_1_in_rule__SlicedProperty__Group__1__Impl4627);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2369:1: rule__SlicedProperty__Group__2 : rule__SlicedProperty__Group__2__Impl rule__SlicedProperty__Group__3 ;
    public final void rule__SlicedProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2373:1: ( rule__SlicedProperty__Group__2__Impl rule__SlicedProperty__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2374:2: rule__SlicedProperty__Group__2__Impl rule__SlicedProperty__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__2__Impl_in_rule__SlicedProperty__Group__24658);
            rule__SlicedProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__3_in_rule__SlicedProperty__Group__24661);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2381:1: rule__SlicedProperty__Group__2__Impl : ( ( rule__SlicedProperty__SrcAssignment_2 )? ) ;
    public final void rule__SlicedProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2385:1: ( ( ( rule__SlicedProperty__SrcAssignment_2 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2386:1: ( ( rule__SlicedProperty__SrcAssignment_2 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2386:1: ( ( rule__SlicedProperty__SrcAssignment_2 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2387:1: ( rule__SlicedProperty__SrcAssignment_2 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getSrcAssignment_2()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2388:1: ( rule__SlicedProperty__SrcAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2388:2: rule__SlicedProperty__SrcAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__SrcAssignment_2_in_rule__SlicedProperty__Group__2__Impl4688);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2398:1: rule__SlicedProperty__Group__3 : rule__SlicedProperty__Group__3__Impl rule__SlicedProperty__Group__4 ;
    public final void rule__SlicedProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2402:1: ( rule__SlicedProperty__Group__3__Impl rule__SlicedProperty__Group__4 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2403:2: rule__SlicedProperty__Group__3__Impl rule__SlicedProperty__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__3__Impl_in_rule__SlicedProperty__Group__34719);
            rule__SlicedProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__4_in_rule__SlicedProperty__Group__34722);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2410:1: rule__SlicedProperty__Group__3__Impl : ( ( rule__SlicedProperty__TgtAssignment_3 )? ) ;
    public final void rule__SlicedProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2414:1: ( ( ( rule__SlicedProperty__TgtAssignment_3 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2415:1: ( ( rule__SlicedProperty__TgtAssignment_3 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2415:1: ( ( rule__SlicedProperty__TgtAssignment_3 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2416:1: ( rule__SlicedProperty__TgtAssignment_3 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getTgtAssignment_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2417:1: ( rule__SlicedProperty__TgtAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2417:2: rule__SlicedProperty__TgtAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__TgtAssignment_3_in_rule__SlicedProperty__Group__3__Impl4749);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2427:1: rule__SlicedProperty__Group__4 : rule__SlicedProperty__Group__4__Impl rule__SlicedProperty__Group__5 ;
    public final void rule__SlicedProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2431:1: ( rule__SlicedProperty__Group__4__Impl rule__SlicedProperty__Group__5 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2432:2: rule__SlicedProperty__Group__4__Impl rule__SlicedProperty__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__4__Impl_in_rule__SlicedProperty__Group__44780);
            rule__SlicedProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__5_in_rule__SlicedProperty__Group__44783);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2439:1: rule__SlicedProperty__Group__4__Impl : ( ( rule__SlicedProperty__OppositeAssignment_4 )? ) ;
    public final void rule__SlicedProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2443:1: ( ( ( rule__SlicedProperty__OppositeAssignment_4 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2444:1: ( ( rule__SlicedProperty__OppositeAssignment_4 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2444:1: ( ( rule__SlicedProperty__OppositeAssignment_4 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2445:1: ( rule__SlicedProperty__OppositeAssignment_4 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getOppositeAssignment_4()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2446:1: ( rule__SlicedProperty__OppositeAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2446:2: rule__SlicedProperty__OppositeAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__OppositeAssignment_4_in_rule__SlicedProperty__Group__4__Impl4810);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2456:1: rule__SlicedProperty__Group__5 : rule__SlicedProperty__Group__5__Impl ;
    public final void rule__SlicedProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2460:1: ( rule__SlicedProperty__Group__5__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2461:2: rule__SlicedProperty__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group__5__Impl_in_rule__SlicedProperty__Group__54841);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2467:1: rule__SlicedProperty__Group__5__Impl : ( ( rule__SlicedProperty__Group_5__0 )? ) ;
    public final void rule__SlicedProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2471:1: ( ( ( rule__SlicedProperty__Group_5__0 )? ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2472:1: ( ( rule__SlicedProperty__Group_5__0 )? )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2472:1: ( ( rule__SlicedProperty__Group_5__0 )? )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2473:1: ( rule__SlicedProperty__Group_5__0 )?
            {
             before(grammarAccess.getSlicedPropertyAccess().getGroup_5()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2474:1: ( rule__SlicedProperty__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2474:2: rule__SlicedProperty__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__0_in_rule__SlicedProperty__Group__5__Impl4868);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2496:1: rule__SlicedProperty__Group_5__0 : rule__SlicedProperty__Group_5__0__Impl rule__SlicedProperty__Group_5__1 ;
    public final void rule__SlicedProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2500:1: ( rule__SlicedProperty__Group_5__0__Impl rule__SlicedProperty__Group_5__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2501:2: rule__SlicedProperty__Group_5__0__Impl rule__SlicedProperty__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__0__Impl_in_rule__SlicedProperty__Group_5__04911);
            rule__SlicedProperty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__1_in_rule__SlicedProperty__Group_5__04914);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2508:1: rule__SlicedProperty__Group_5__0__Impl : ( '[[' ) ;
    public final void rule__SlicedProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2512:1: ( ( '[[' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2513:1: ( '[[' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2513:1: ( '[[' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2514:1: '[['
            {
             before(grammarAccess.getSlicedPropertyAccess().getLeftSquareBracketLeftSquareBracketKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SlicedProperty__Group_5__0__Impl4942); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2527:1: rule__SlicedProperty__Group_5__1 : rule__SlicedProperty__Group_5__1__Impl rule__SlicedProperty__Group_5__2 ;
    public final void rule__SlicedProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2531:1: ( rule__SlicedProperty__Group_5__1__Impl rule__SlicedProperty__Group_5__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2532:2: rule__SlicedProperty__Group_5__1__Impl rule__SlicedProperty__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__1__Impl_in_rule__SlicedProperty__Group_5__14973);
            rule__SlicedProperty__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__2_in_rule__SlicedProperty__Group_5__14976);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2539:1: rule__SlicedProperty__Group_5__1__Impl : ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) ) ;
    public final void rule__SlicedProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2543:1: ( ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2544:1: ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2544:1: ( ( rule__SlicedProperty__ExpressionAssignment_5_1 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2545:1: ( rule__SlicedProperty__ExpressionAssignment_5_1 )
            {
             before(grammarAccess.getSlicedPropertyAccess().getExpressionAssignment_5_1()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2546:1: ( rule__SlicedProperty__ExpressionAssignment_5_1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2546:2: rule__SlicedProperty__ExpressionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__ExpressionAssignment_5_1_in_rule__SlicedProperty__Group_5__1__Impl5003);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2556:1: rule__SlicedProperty__Group_5__2 : rule__SlicedProperty__Group_5__2__Impl ;
    public final void rule__SlicedProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2560:1: ( rule__SlicedProperty__Group_5__2__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2561:2: rule__SlicedProperty__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SlicedProperty__Group_5__2__Impl_in_rule__SlicedProperty__Group_5__25033);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2567:1: rule__SlicedProperty__Group_5__2__Impl : ( ']]' ) ;
    public final void rule__SlicedProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2571:1: ( ( ']]' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2572:1: ( ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2572:1: ( ']]' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2573:1: ']]'
            {
             before(grammarAccess.getSlicedPropertyAccess().getRightSquareBracketRightSquareBracketKeyword_5_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SlicedProperty__Group_5__2__Impl5061); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2592:1: rule__OppositeCreation__Group__0 : rule__OppositeCreation__Group__0__Impl rule__OppositeCreation__Group__1 ;
    public final void rule__OppositeCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2596:1: ( rule__OppositeCreation__Group__0__Impl rule__OppositeCreation__Group__1 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2597:2: rule__OppositeCreation__Group__0__Impl rule__OppositeCreation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__0__Impl_in_rule__OppositeCreation__Group__05098);
            rule__OppositeCreation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__1_in_rule__OppositeCreation__Group__05101);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2604:1: rule__OppositeCreation__Group__0__Impl : ( () ) ;
    public final void rule__OppositeCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2608:1: ( ( () ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2609:1: ( () )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2609:1: ( () )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2610:1: ()
            {
             before(grammarAccess.getOppositeCreationAccess().getOppositeCreationAction_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2611:1: ()
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2613:1: 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2623:1: rule__OppositeCreation__Group__1 : rule__OppositeCreation__Group__1__Impl rule__OppositeCreation__Group__2 ;
    public final void rule__OppositeCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2627:1: ( rule__OppositeCreation__Group__1__Impl rule__OppositeCreation__Group__2 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2628:2: rule__OppositeCreation__Group__1__Impl rule__OppositeCreation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__1__Impl_in_rule__OppositeCreation__Group__15159);
            rule__OppositeCreation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__2_in_rule__OppositeCreation__Group__15162);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2635:1: rule__OppositeCreation__Group__1__Impl : ( 'opposite' ) ;
    public final void rule__OppositeCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2639:1: ( ( 'opposite' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2640:1: ( 'opposite' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2640:1: ( 'opposite' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2641:1: 'opposite'
            {
             before(grammarAccess.getOppositeCreationAccess().getOppositeKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__OppositeCreation__Group__1__Impl5190); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2654:1: rule__OppositeCreation__Group__2 : rule__OppositeCreation__Group__2__Impl rule__OppositeCreation__Group__3 ;
    public final void rule__OppositeCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2658:1: ( rule__OppositeCreation__Group__2__Impl rule__OppositeCreation__Group__3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2659:2: rule__OppositeCreation__Group__2__Impl rule__OppositeCreation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__2__Impl_in_rule__OppositeCreation__Group__25221);
            rule__OppositeCreation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__3_in_rule__OppositeCreation__Group__25224);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2666:1: rule__OppositeCreation__Group__2__Impl : ( '(' ) ;
    public final void rule__OppositeCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2670:1: ( ( '(' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2671:1: ( '(' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2671:1: ( '(' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2672:1: '('
            {
             before(grammarAccess.getOppositeCreationAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OppositeCreation__Group__2__Impl5252); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2685:1: rule__OppositeCreation__Group__3 : rule__OppositeCreation__Group__3__Impl rule__OppositeCreation__Group__4 ;
    public final void rule__OppositeCreation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2689:1: ( rule__OppositeCreation__Group__3__Impl rule__OppositeCreation__Group__4 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2690:2: rule__OppositeCreation__Group__3__Impl rule__OppositeCreation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__3__Impl_in_rule__OppositeCreation__Group__35283);
            rule__OppositeCreation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__4_in_rule__OppositeCreation__Group__35286);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2697:1: rule__OppositeCreation__Group__3__Impl : ( ( rule__OppositeCreation__NameAssignment_3 ) ) ;
    public final void rule__OppositeCreation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2701:1: ( ( ( rule__OppositeCreation__NameAssignment_3 ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2702:1: ( ( rule__OppositeCreation__NameAssignment_3 ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2702:1: ( ( rule__OppositeCreation__NameAssignment_3 ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2703:1: ( rule__OppositeCreation__NameAssignment_3 )
            {
             before(grammarAccess.getOppositeCreationAccess().getNameAssignment_3()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2704:1: ( rule__OppositeCreation__NameAssignment_3 )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2704:2: rule__OppositeCreation__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__NameAssignment_3_in_rule__OppositeCreation__Group__3__Impl5313);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2714:1: rule__OppositeCreation__Group__4 : rule__OppositeCreation__Group__4__Impl ;
    public final void rule__OppositeCreation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2718:1: ( rule__OppositeCreation__Group__4__Impl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2719:2: rule__OppositeCreation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OppositeCreation__Group__4__Impl_in_rule__OppositeCreation__Group__45343);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2725:1: rule__OppositeCreation__Group__4__Impl : ( ')' ) ;
    public final void rule__OppositeCreation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2729:1: ( ( ')' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2730:1: ( ')' )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2730:1: ( ')' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2731:1: ')'
            {
             before(grammarAccess.getOppositeCreationAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__OppositeCreation__Group__4__Impl5371); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2755:1: rule__Slicer__ActiveAssignment_1 : ( ( 'active' ) ) ;
    public final void rule__Slicer__ActiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2759:1: ( ( ( 'active' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2760:1: ( ( 'active' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2760:1: ( ( 'active' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2761:1: ( 'active' )
            {
             before(grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2762:1: ( 'active' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2763:1: 'active'
            {
             before(grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Slicer__ActiveAssignment_15422); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2778:1: rule__Slicer__StrictAssignment_2 : ( ( 'strict' ) ) ;
    public final void rule__Slicer__StrictAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2782:1: ( ( ( 'strict' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2783:1: ( ( 'strict' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2783:1: ( ( 'strict' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2784:1: ( 'strict' )
            {
             before(grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2785:1: ( 'strict' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2786:1: 'strict'
            {
             before(grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Slicer__StrictAssignment_25466); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2801:1: rule__Slicer__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Slicer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2805:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2806:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2806:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2807:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__NameAssignment_35505);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2816:1: rule__Slicer__UriMetamodelAssignment_7 : ( ruleEString ) ;
    public final void rule__Slicer__UriMetamodelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2820:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2821:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2821:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2822:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getUriMetamodelEStringParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__UriMetamodelAssignment_75536);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2831:1: rule__Slicer__InputClassesAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__Slicer__InputClassesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2835:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2836:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2836:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2837:1: ( ruleEString )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_10_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2838:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2839:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassEStringParserRuleCall_10_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__InputClassesAssignment_105571);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getInputClassesEClassEStringParserRuleCall_10_0_1()); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2850:1: rule__Slicer__InputClassesAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__Slicer__InputClassesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2854:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2855:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2855:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2856:1: ( ruleEString )
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_11_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2857:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2858:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getInputClassesEClassEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__InputClassesAssignment_11_15610);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicerAccess().getInputClassesEClassEStringParserRuleCall_11_1_0_1()); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2869:1: rule__Slicer__RadiusAssignment_12_2 : ( ruleRadius ) ;
    public final void rule__Slicer__RadiusAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2873:1: ( ( ruleRadius ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2874:1: ( ruleRadius )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2874:1: ( ruleRadius )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2875:1: ruleRadius
            {
             before(grammarAccess.getSlicerAccess().getRadiusRadiusParserRuleCall_12_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadius_in_rule__Slicer__RadiusAssignment_12_25645);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2884:1: rule__Slicer__ConstraintsAssignment_13_2 : ( ruleConstraint ) ;
    public final void rule__Slicer__ConstraintsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2888:1: ( ( ruleConstraint ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2889:1: ( ruleConstraint )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2889:1: ( ruleConstraint )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2890:1: ruleConstraint
            {
             before(grammarAccess.getSlicerAccess().getConstraintsConstraintParserRuleCall_13_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_rule__Slicer__ConstraintsAssignment_13_25676);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2899:1: rule__Slicer__SlicedElementsAssignment_14_2 : ( ruleSlicedClass ) ;
    public final void rule__Slicer__SlicedElementsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2903:1: ( ( ruleSlicedClass ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2904:1: ( ruleSlicedClass )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2904:1: ( ruleSlicedClass )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2905:1: ruleSlicedClass
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsSlicedClassParserRuleCall_14_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedClass_in_rule__Slicer__SlicedElementsAssignment_14_25707);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2914:1: rule__Slicer__SlicedElementsAssignment_15_2 : ( ruleSlicedProperty ) ;
    public final void rule__Slicer__SlicedElementsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2918:1: ( ( ruleSlicedProperty ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2919:1: ( ruleSlicedProperty )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2919:1: ( ruleSlicedProperty )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2920:1: ruleSlicedProperty
            {
             before(grammarAccess.getSlicerAccess().getSlicedElementsSlicedPropertyParserRuleCall_15_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedProperty_in_rule__Slicer__SlicedElementsAssignment_15_25738);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2929:1: rule__Slicer__OnStartAssignment_16_2 : ( ruleEString ) ;
    public final void rule__Slicer__OnStartAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2933:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2934:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2934:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2935:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getOnStartEStringParserRuleCall_16_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__OnStartAssignment_16_25769);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2944:1: rule__Slicer__OnEndAssignment_17_2 : ( ruleEString ) ;
    public final void rule__Slicer__OnEndAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2948:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2949:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2949:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2950:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getOnEndEStringParserRuleCall_17_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__OnEndAssignment_17_25800);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2959:1: rule__Slicer__HelperAssignment_18_2 : ( ruleEString ) ;
    public final void rule__Slicer__HelperAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2963:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2964:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2964:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2965:1: ruleEString
            {
             before(grammarAccess.getSlicerAccess().getHelperEStringParserRuleCall_18_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Slicer__HelperAssignment_18_25831);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2974:1: rule__Constraint__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Constraint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2978:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2979:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2979:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2980:1: ruleEString
            {
             before(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constraint__NameAssignment_05862);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2989:1: rule__Constraint__ExpressionAssignment_2 : ( ruleEString ) ;
    public final void rule__Constraint__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2993:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2994:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2994:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:2995:1: ruleEString
            {
             before(grammarAccess.getConstraintAccess().getExpressionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Constraint__ExpressionAssignment_25893);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3004:1: rule__Radius__FocusedClassesAssignment_1_0 : ( ( ruleEString ) ) ;
    public final void rule__Radius__FocusedClassesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3008:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3009:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3009:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3010:1: ( ruleEString )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_0_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3011:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3012:1: ruleEString
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassEStringParserRuleCall_1_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Radius__FocusedClassesAssignment_1_05928);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassEStringParserRuleCall_1_0_0_1()); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3023:1: rule__Radius__FocusedClassesAssignment_1_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Radius__FocusedClassesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3027:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3028:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3028:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3029:1: ( ruleEString )
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_1_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3030:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3031:1: ruleEString
            {
             before(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassEStringParserRuleCall_1_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Radius__FocusedClassesAssignment_1_1_15967);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassEStringParserRuleCall_1_1_1_0_1()); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3042:1: rule__SlicedClass__DomainAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__SlicedClass__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3046:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3047:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3047:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3048:1: ( ruleEString )
            {
             before(grammarAccess.getSlicedClassAccess().getDomainEClassCrossReference_0_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3049:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3050:1: ruleEString
            {
             before(grammarAccess.getSlicedClassAccess().getDomainEClassEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SlicedClass__DomainAssignment_06006);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicedClassAccess().getDomainEClassEStringParserRuleCall_0_0_1()); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3061:1: rule__SlicedClass__IsOptionAssignment_1 : ( ( 'option' ) ) ;
    public final void rule__SlicedClass__IsOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3065:1: ( ( ( 'option' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3066:1: ( ( 'option' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3066:1: ( ( 'option' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3067:1: ( 'option' )
            {
             before(grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3068:1: ( 'option' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3069:1: 'option'
            {
             before(grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SlicedClass__IsOptionAssignment_16046); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3084:1: rule__SlicedClass__CtxAssignment_2 : ( ruleVarDecl ) ;
    public final void rule__SlicedClass__CtxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3088:1: ( ( ruleVarDecl ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3089:1: ( ruleVarDecl )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3089:1: ( ruleVarDecl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3090:1: ruleVarDecl
            {
             before(grammarAccess.getSlicedClassAccess().getCtxVarDeclParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_rule__SlicedClass__CtxAssignment_26085);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3099:1: rule__SlicedClass__ExpressionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__SlicedClass__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3103:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3104:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3104:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3105:1: ruleEString
            {
             before(grammarAccess.getSlicedClassAccess().getExpressionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SlicedClass__ExpressionAssignment_3_16116);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3114:1: rule__VarDecl__VarNameAssignment : ( ruleEString ) ;
    public final void rule__VarDecl__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3118:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3119:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3119:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3120:1: ruleEString
            {
             before(grammarAccess.getVarDeclAccess().getVarNameEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VarDecl__VarNameAssignment6147);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3129:1: rule__SlicedProperty__DomainAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__SlicedProperty__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3133:1: ( ( ( ruleEString ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3134:1: ( ( ruleEString ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3134:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3135:1: ( ruleEString )
            {
             before(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureCrossReference_0_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3136:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3137:1: ruleEString
            {
             before(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SlicedProperty__DomainAssignment_06182);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureEStringParserRuleCall_0_0_1()); 

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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3148:1: rule__SlicedProperty__IsOptionAssignment_1 : ( ( 'option' ) ) ;
    public final void rule__SlicedProperty__IsOptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3152:1: ( ( ( 'option' ) ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3153:1: ( ( 'option' ) )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3153:1: ( ( 'option' ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3154:1: ( 'option' )
            {
             before(grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0()); 
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3155:1: ( 'option' )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3156:1: 'option'
            {
             before(grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SlicedProperty__IsOptionAssignment_16222); 
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3171:1: rule__SlicedProperty__SrcAssignment_2 : ( ruleVarDecl ) ;
    public final void rule__SlicedProperty__SrcAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3175:1: ( ( ruleVarDecl ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3176:1: ( ruleVarDecl )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3176:1: ( ruleVarDecl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3177:1: ruleVarDecl
            {
             before(grammarAccess.getSlicedPropertyAccess().getSrcVarDeclParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_rule__SlicedProperty__SrcAssignment_26261);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3186:1: rule__SlicedProperty__TgtAssignment_3 : ( ruleVarDecl ) ;
    public final void rule__SlicedProperty__TgtAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3190:1: ( ( ruleVarDecl ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3191:1: ( ruleVarDecl )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3191:1: ( ruleVarDecl )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3192:1: ruleVarDecl
            {
             before(grammarAccess.getSlicedPropertyAccess().getTgtVarDeclParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_rule__SlicedProperty__TgtAssignment_36292);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3201:1: rule__SlicedProperty__OppositeAssignment_4 : ( ruleOppositeCreation ) ;
    public final void rule__SlicedProperty__OppositeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3205:1: ( ( ruleOppositeCreation ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3206:1: ( ruleOppositeCreation )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3206:1: ( ruleOppositeCreation )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3207:1: ruleOppositeCreation
            {
             before(grammarAccess.getSlicedPropertyAccess().getOppositeOppositeCreationParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOppositeCreation_in_rule__SlicedProperty__OppositeAssignment_46323);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3216:1: rule__SlicedProperty__ExpressionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__SlicedProperty__ExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3220:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3221:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3221:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3222:1: ruleEString
            {
             before(grammarAccess.getSlicedPropertyAccess().getExpressionEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SlicedProperty__ExpressionAssignment_5_16354);
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
    // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3231:1: rule__OppositeCreation__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OppositeCreation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3235:1: ( ( ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3236:1: ( ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3236:1: ( ruleEString )
            // ../fr.inria.diverse.kompren.xtext.ui/src-gen/fr/inria/diverse/kompren/ui/contentassist/antlr/internal/InternalKompren.g:3237:1: ruleEString
            {
             before(grammarAccess.getOppositeCreationAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OppositeCreation__NameAssignment_36385);
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
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadius_in_entryRuleRadius243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadius250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group__0_in_ruleRadius276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedClass_in_entryRuleSlicedClass303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicedClass310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__0_in_ruleSlicedClass336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VarDecl__VarNameAssignment_in_ruleVarDecl396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedProperty_in_entryRuleSlicedProperty423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicedProperty430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__0_in_ruleSlicedProperty456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOppositeCreation_in_entryRuleOppositeCreation483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOppositeCreation490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__0_in_ruleOppositeCreation516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__0__Impl_in_rule__Slicer__Group__0600 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__1_in_rule__Slicer__Group__0603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Slicer__Group__0__Impl631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__1__Impl_in_rule__Slicer__Group__1662 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__2_in_rule__Slicer__Group__1665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__ActiveAssignment_1_in_rule__Slicer__Group__1__Impl692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__2__Impl_in_rule__Slicer__Group__2723 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__3_in_rule__Slicer__Group__2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__StrictAssignment_2_in_rule__Slicer__Group__2__Impl753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__3__Impl_in_rule__Slicer__Group__3784 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__4_in_rule__Slicer__Group__3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__NameAssignment_3_in_rule__Slicer__Group__3__Impl814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__4__Impl_in_rule__Slicer__Group__4844 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__5_in_rule__Slicer__Group__4847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Slicer__Group__4__Impl875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__5__Impl_in_rule__Slicer__Group__5906 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__6_in_rule__Slicer__Group__5909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Slicer__Group__5__Impl937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__6__Impl_in_rule__Slicer__Group__6968 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__7_in_rule__Slicer__Group__6971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group__6__Impl999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__7__Impl_in_rule__Slicer__Group__71030 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__8_in_rule__Slicer__Group__71033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__UriMetamodelAssignment_7_in_rule__Slicer__Group__7__Impl1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__8__Impl_in_rule__Slicer__Group__81090 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__9_in_rule__Slicer__Group__81093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Slicer__Group__8__Impl1121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__9__Impl_in_rule__Slicer__Group__91152 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group__10_in_rule__Slicer__Group__91155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group__9__Impl1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__10__Impl_in_rule__Slicer__Group__101214 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__11_in_rule__Slicer__Group__101217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__InputClassesAssignment_10_in_rule__Slicer__Group__10__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__11__Impl_in_rule__Slicer__Group__111274 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__12_in_rule__Slicer__Group__111277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__0_in_rule__Slicer__Group__11__Impl1304 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__12__Impl_in_rule__Slicer__Group__121335 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__13_in_rule__Slicer__Group__121338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__0_in_rule__Slicer__Group__12__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__13__Impl_in_rule__Slicer__Group__131396 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__14_in_rule__Slicer__Group__131399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__0_in_rule__Slicer__Group__13__Impl1426 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__14__Impl_in_rule__Slicer__Group__141457 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__15_in_rule__Slicer__Group__141460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__0_in_rule__Slicer__Group__14__Impl1487 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__15__Impl_in_rule__Slicer__Group__151518 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__16_in_rule__Slicer__Group__151521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__0_in_rule__Slicer__Group__15__Impl1548 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__16__Impl_in_rule__Slicer__Group__161579 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__17_in_rule__Slicer__Group__161582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__0_in_rule__Slicer__Group__16__Impl1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__17__Impl_in_rule__Slicer__Group__171640 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__18_in_rule__Slicer__Group__171643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__0_in_rule__Slicer__Group__17__Impl1670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__18__Impl_in_rule__Slicer__Group__181701 = new BitSet(new long[]{0x00000000067F0000L});
        public static final BitSet FOLLOW_rule__Slicer__Group__19_in_rule__Slicer__Group__181704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__0_in_rule__Slicer__Group__18__Impl1731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group__19__Impl_in_rule__Slicer__Group__191762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Slicer__Group__19__Impl1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__0__Impl_in_rule__Slicer__Group_11__01861 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__1_in_rule__Slicer__Group_11__01864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Slicer__Group_11__0__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_11__1__Impl_in_rule__Slicer__Group_11__11923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__InputClassesAssignment_11_1_in_rule__Slicer__Group_11__1__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__0__Impl_in_rule__Slicer__Group_12__01984 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__1_in_rule__Slicer__Group_12__01987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Slicer__Group_12__0__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__1__Impl_in_rule__Slicer__Group_12__12046 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__2_in_rule__Slicer__Group_12__12049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_12__1__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_12__2__Impl_in_rule__Slicer__Group_12__22108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__RadiusAssignment_12_2_in_rule__Slicer__Group_12__2__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__0__Impl_in_rule__Slicer__Group_13__02171 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__1_in_rule__Slicer__Group_13__02174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Slicer__Group_13__0__Impl2202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__1__Impl_in_rule__Slicer__Group_13__12233 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__2_in_rule__Slicer__Group_13__12236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_13__1__Impl2264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_13__2__Impl_in_rule__Slicer__Group_13__22295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__ConstraintsAssignment_13_2_in_rule__Slicer__Group_13__2__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__0__Impl_in_rule__Slicer__Group_14__02358 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__1_in_rule__Slicer__Group_14__02361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Slicer__Group_14__0__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__1__Impl_in_rule__Slicer__Group_14__12420 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__2_in_rule__Slicer__Group_14__12423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_14__1__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_14__2__Impl_in_rule__Slicer__Group_14__22482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__SlicedElementsAssignment_14_2_in_rule__Slicer__Group_14__2__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__0__Impl_in_rule__Slicer__Group_15__02545 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__1_in_rule__Slicer__Group_15__02548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Slicer__Group_15__0__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__1__Impl_in_rule__Slicer__Group_15__12607 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__2_in_rule__Slicer__Group_15__12610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Slicer__Group_15__1__Impl2638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_15__2__Impl_in_rule__Slicer__Group_15__22669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__SlicedElementsAssignment_15_2_in_rule__Slicer__Group_15__2__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__0__Impl_in_rule__Slicer__Group_16__02732 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__1_in_rule__Slicer__Group_16__02735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Slicer__Group_16__0__Impl2763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__1__Impl_in_rule__Slicer__Group_16__12794 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__2_in_rule__Slicer__Group_16__12797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Slicer__Group_16__1__Impl2825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__2__Impl_in_rule__Slicer__Group_16__22856 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__3_in_rule__Slicer__Group_16__22859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__OnStartAssignment_16_2_in_rule__Slicer__Group_16__2__Impl2886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_16__3__Impl_in_rule__Slicer__Group_16__32916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Slicer__Group_16__3__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__0__Impl_in_rule__Slicer__Group_17__02983 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__1_in_rule__Slicer__Group_17__02986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Slicer__Group_17__0__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__1__Impl_in_rule__Slicer__Group_17__13045 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__2_in_rule__Slicer__Group_17__13048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Slicer__Group_17__1__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__2__Impl_in_rule__Slicer__Group_17__23107 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__3_in_rule__Slicer__Group_17__23110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__OnEndAssignment_17_2_in_rule__Slicer__Group_17__2__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_17__3__Impl_in_rule__Slicer__Group_17__33167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Slicer__Group_17__3__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__0__Impl_in_rule__Slicer__Group_18__03234 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__1_in_rule__Slicer__Group_18__03237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Slicer__Group_18__0__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__1__Impl_in_rule__Slicer__Group_18__13296 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__2_in_rule__Slicer__Group_18__13299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Slicer__Group_18__1__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__2__Impl_in_rule__Slicer__Group_18__23358 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__3_in_rule__Slicer__Group_18__23361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__HelperAssignment_18_2_in_rule__Slicer__Group_18__2__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Slicer__Group_18__3__Impl_in_rule__Slicer__Group_18__33418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Slicer__Group_18__3__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__03485 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__03488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__NameAssignment_0_in_rule__Constraint__Group__0__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__13545 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__13548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Constraint__Group__1__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__23607 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__23610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__ExpressionAssignment_2_in_rule__Constraint__Group__2__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__33667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Constraint__Group__3__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group__0__Impl_in_rule__Radius__Group__03734 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Radius__Group__1_in_rule__Radius__Group__03737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group__1__Impl_in_rule__Radius__Group__13795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__0_in_rule__Radius__Group__1__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__0__Impl_in_rule__Radius__Group_1__03857 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__1_in_rule__Radius__Group_1__03860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__FocusedClassesAssignment_1_0_in_rule__Radius__Group_1__0__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1__1__Impl_in_rule__Radius__Group_1__13917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__0_in_rule__Radius__Group_1__1__Impl3944 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__0__Impl_in_rule__Radius__Group_1_1__03979 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__1_in_rule__Radius__Group_1_1__03982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Radius__Group_1_1__0__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__Group_1_1__1__Impl_in_rule__Radius__Group_1_1__14041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Radius__FocusedClassesAssignment_1_1_1_in_rule__Radius__Group_1_1__1__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__0__Impl_in_rule__SlicedClass__Group__04102 = new BitSet(new long[]{0x00000001C0800030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__1_in_rule__SlicedClass__Group__04105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__DomainAssignment_0_in_rule__SlicedClass__Group__0__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__1__Impl_in_rule__SlicedClass__Group__14162 = new BitSet(new long[]{0x00000001C0800030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__2_in_rule__SlicedClass__Group__14165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__IsOptionAssignment_1_in_rule__SlicedClass__Group__1__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__2__Impl_in_rule__SlicedClass__Group__24223 = new BitSet(new long[]{0x00000001C0800030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__3_in_rule__SlicedClass__Group__24226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__CtxAssignment_2_in_rule__SlicedClass__Group__2__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group__3__Impl_in_rule__SlicedClass__Group__34284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__0_in_rule__SlicedClass__Group__3__Impl4311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__0__Impl_in_rule__SlicedClass__Group_3__04350 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__1_in_rule__SlicedClass__Group_3__04353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SlicedClass__Group_3__0__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__1__Impl_in_rule__SlicedClass__Group_3__14412 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__2_in_rule__SlicedClass__Group_3__14415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__ExpressionAssignment_3_1_in_rule__SlicedClass__Group_3__1__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedClass__Group_3__2__Impl_in_rule__SlicedClass__Group_3__24472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SlicedClass__Group_3__2__Impl4500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__0__Impl_in_rule__SlicedProperty__Group__04537 = new BitSet(new long[]{0x00000001C8800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__1_in_rule__SlicedProperty__Group__04540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__DomainAssignment_0_in_rule__SlicedProperty__Group__0__Impl4567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__1__Impl_in_rule__SlicedProperty__Group__14597 = new BitSet(new long[]{0x00000001C8800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__2_in_rule__SlicedProperty__Group__14600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__IsOptionAssignment_1_in_rule__SlicedProperty__Group__1__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__2__Impl_in_rule__SlicedProperty__Group__24658 = new BitSet(new long[]{0x00000001C8800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__3_in_rule__SlicedProperty__Group__24661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__SrcAssignment_2_in_rule__SlicedProperty__Group__2__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__3__Impl_in_rule__SlicedProperty__Group__34719 = new BitSet(new long[]{0x00000001C8800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__4_in_rule__SlicedProperty__Group__34722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__TgtAssignment_3_in_rule__SlicedProperty__Group__3__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__4__Impl_in_rule__SlicedProperty__Group__44780 = new BitSet(new long[]{0x00000001C8800030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__5_in_rule__SlicedProperty__Group__44783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__OppositeAssignment_4_in_rule__SlicedProperty__Group__4__Impl4810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group__5__Impl_in_rule__SlicedProperty__Group__54841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__0_in_rule__SlicedProperty__Group__5__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__0__Impl_in_rule__SlicedProperty__Group_5__04911 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__1_in_rule__SlicedProperty__Group_5__04914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SlicedProperty__Group_5__0__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__1__Impl_in_rule__SlicedProperty__Group_5__14973 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__2_in_rule__SlicedProperty__Group_5__14976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__ExpressionAssignment_5_1_in_rule__SlicedProperty__Group_5__1__Impl5003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SlicedProperty__Group_5__2__Impl_in_rule__SlicedProperty__Group_5__25033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SlicedProperty__Group_5__2__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__0__Impl_in_rule__OppositeCreation__Group__05098 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__1_in_rule__OppositeCreation__Group__05101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__1__Impl_in_rule__OppositeCreation__Group__15159 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__2_in_rule__OppositeCreation__Group__15162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__OppositeCreation__Group__1__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__2__Impl_in_rule__OppositeCreation__Group__25221 = new BitSet(new long[]{0x00000000C0000030L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__3_in_rule__OppositeCreation__Group__25224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OppositeCreation__Group__2__Impl5252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__3__Impl_in_rule__OppositeCreation__Group__35283 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__4_in_rule__OppositeCreation__Group__35286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__NameAssignment_3_in_rule__OppositeCreation__Group__3__Impl5313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OppositeCreation__Group__4__Impl_in_rule__OppositeCreation__Group__45343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__OppositeCreation__Group__4__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Slicer__ActiveAssignment_15422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Slicer__StrictAssignment_25466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__NameAssignment_35505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__UriMetamodelAssignment_75536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__InputClassesAssignment_105571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__InputClassesAssignment_11_15610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadius_in_rule__Slicer__RadiusAssignment_12_25645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_rule__Slicer__ConstraintsAssignment_13_25676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedClass_in_rule__Slicer__SlicedElementsAssignment_14_25707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedProperty_in_rule__Slicer__SlicedElementsAssignment_15_25738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__OnStartAssignment_16_25769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__OnEndAssignment_17_25800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Slicer__HelperAssignment_18_25831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constraint__NameAssignment_05862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Constraint__ExpressionAssignment_25893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Radius__FocusedClassesAssignment_1_05928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Radius__FocusedClassesAssignment_1_1_15967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SlicedClass__DomainAssignment_06006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SlicedClass__IsOptionAssignment_16046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_rule__SlicedClass__CtxAssignment_26085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SlicedClass__ExpressionAssignment_3_16116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VarDecl__VarNameAssignment6147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SlicedProperty__DomainAssignment_06182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SlicedProperty__IsOptionAssignment_16222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_rule__SlicedProperty__SrcAssignment_26261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_rule__SlicedProperty__TgtAssignment_36292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOppositeCreation_in_rule__SlicedProperty__OppositeAssignment_46323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SlicedProperty__ExpressionAssignment_5_16354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OppositeCreation__NameAssignment_36385 = new BitSet(new long[]{0x0000000000000002L});
    }


}