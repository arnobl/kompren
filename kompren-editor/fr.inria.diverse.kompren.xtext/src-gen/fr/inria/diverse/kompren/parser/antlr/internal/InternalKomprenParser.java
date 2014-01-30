package fr.inria.diverse.kompren.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.kompren.services.KomprenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKomprenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'slicer'", "'active'", "'strict'", "'{'", "'domain'", "':'", "'input'", "','", "'radius'", "'constraint'", "'slicedClass'", "'slicedProperty'", "'onStart'", "'[['", "']]'", "'onEnd'", "'helper'", "'}'", "'.'", "'option'", "'opposite'", "'('", "')'"
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
    public String getGrammarFileName() { return "../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g"; }



     	private KomprenGrammarAccess grammarAccess;
     	
        public InternalKomprenParser(TokenStream input, KomprenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Slicer";	
       	}
       	
       	@Override
       	protected KomprenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSlicer"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:67:1: entryRuleSlicer returns [EObject current=null] : iv_ruleSlicer= ruleSlicer EOF ;
    public final EObject entryRuleSlicer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlicer = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:68:2: (iv_ruleSlicer= ruleSlicer EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:69:2: iv_ruleSlicer= ruleSlicer EOF
            {
             newCompositeNode(grammarAccess.getSlicerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicer_in_entryRuleSlicer75);
            iv_ruleSlicer=ruleSlicer();

            state._fsp--;

             current =iv_ruleSlicer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicer85); 

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
    // $ANTLR end "entryRuleSlicer"


    // $ANTLR start "ruleSlicer"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:76:1: ruleSlicer returns [EObject current=null] : (otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'constraint' otherlv_17= ':' ( (lv_constraints_18_0= ruleConstraint ) ) )* (otherlv_19= 'slicedClass' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedClass ) ) )* (otherlv_22= 'slicedProperty' otherlv_23= ':' ( (lv_slicedElements_24_0= ruleSlicedProperty ) ) )* (otherlv_25= 'onStart' otherlv_26= '[[' ( (lv_onStart_27_0= ruleEString ) ) otherlv_28= ']]' )? (otherlv_29= 'onEnd' otherlv_30= '[[' ( (lv_onEnd_31_0= ruleEString ) ) otherlv_32= ']]' )? (otherlv_33= 'helper' otherlv_34= '[[' ( (lv_helper_35_0= ruleEString ) ) otherlv_36= ']]' )? otherlv_37= '}' ) ;
    public final EObject ruleSlicer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_active_1_0=null;
        Token lv_strict_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_uriMetamodel_7_0 = null;

        EObject lv_radius_15_0 = null;

        EObject lv_constraints_18_0 = null;

        EObject lv_slicedElements_21_0 = null;

        EObject lv_slicedElements_24_0 = null;

        AntlrDatatypeRuleToken lv_onStart_27_0 = null;

        AntlrDatatypeRuleToken lv_onEnd_31_0 = null;

        AntlrDatatypeRuleToken lv_helper_35_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:79:28: ( (otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'constraint' otherlv_17= ':' ( (lv_constraints_18_0= ruleConstraint ) ) )* (otherlv_19= 'slicedClass' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedClass ) ) )* (otherlv_22= 'slicedProperty' otherlv_23= ':' ( (lv_slicedElements_24_0= ruleSlicedProperty ) ) )* (otherlv_25= 'onStart' otherlv_26= '[[' ( (lv_onStart_27_0= ruleEString ) ) otherlv_28= ']]' )? (otherlv_29= 'onEnd' otherlv_30= '[[' ( (lv_onEnd_31_0= ruleEString ) ) otherlv_32= ']]' )? (otherlv_33= 'helper' otherlv_34= '[[' ( (lv_helper_35_0= ruleEString ) ) otherlv_36= ']]' )? otherlv_37= '}' ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:80:1: (otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'constraint' otherlv_17= ':' ( (lv_constraints_18_0= ruleConstraint ) ) )* (otherlv_19= 'slicedClass' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedClass ) ) )* (otherlv_22= 'slicedProperty' otherlv_23= ':' ( (lv_slicedElements_24_0= ruleSlicedProperty ) ) )* (otherlv_25= 'onStart' otherlv_26= '[[' ( (lv_onStart_27_0= ruleEString ) ) otherlv_28= ']]' )? (otherlv_29= 'onEnd' otherlv_30= '[[' ( (lv_onEnd_31_0= ruleEString ) ) otherlv_32= ']]' )? (otherlv_33= 'helper' otherlv_34= '[[' ( (lv_helper_35_0= ruleEString ) ) otherlv_36= ']]' )? otherlv_37= '}' )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:80:1: (otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'constraint' otherlv_17= ':' ( (lv_constraints_18_0= ruleConstraint ) ) )* (otherlv_19= 'slicedClass' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedClass ) ) )* (otherlv_22= 'slicedProperty' otherlv_23= ':' ( (lv_slicedElements_24_0= ruleSlicedProperty ) ) )* (otherlv_25= 'onStart' otherlv_26= '[[' ( (lv_onStart_27_0= ruleEString ) ) otherlv_28= ']]' )? (otherlv_29= 'onEnd' otherlv_30= '[[' ( (lv_onEnd_31_0= ruleEString ) ) otherlv_32= ']]' )? (otherlv_33= 'helper' otherlv_34= '[[' ( (lv_helper_35_0= ruleEString ) ) otherlv_36= ']]' )? otherlv_37= '}' )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:80:3: otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'constraint' otherlv_17= ':' ( (lv_constraints_18_0= ruleConstraint ) ) )* (otherlv_19= 'slicedClass' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedClass ) ) )* (otherlv_22= 'slicedProperty' otherlv_23= ':' ( (lv_slicedElements_24_0= ruleSlicedProperty ) ) )* (otherlv_25= 'onStart' otherlv_26= '[[' ( (lv_onStart_27_0= ruleEString ) ) otherlv_28= ']]' )? (otherlv_29= 'onEnd' otherlv_30= '[[' ( (lv_onEnd_31_0= ruleEString ) ) otherlv_32= ']]' )? (otherlv_33= 'helper' otherlv_34= '[[' ( (lv_helper_35_0= ruleEString ) ) otherlv_36= ']]' )? otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSlicer122); 

                	newLeafNode(otherlv_0, grammarAccess.getSlicerAccess().getSlicerKeyword_0());
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:84:1: ( (lv_active_1_0= 'active' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:85:1: (lv_active_1_0= 'active' )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:85:1: (lv_active_1_0= 'active' )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:86:3: lv_active_1_0= 'active'
                    {
                    lv_active_1_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSlicer140); 

                            newLeafNode(lv_active_1_0, grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSlicerRule());
                    	        }
                           		setWithLastConsumed(current, "active", true, "active");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:99:3: ( (lv_strict_2_0= 'strict' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:100:1: (lv_strict_2_0= 'strict' )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:100:1: (lv_strict_2_0= 'strict' )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:101:3: lv_strict_2_0= 'strict'
                    {
                    lv_strict_2_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSlicer172); 

                            newLeafNode(lv_strict_2_0, grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSlicerRule());
                    	        }
                           		setWithLastConsumed(current, "strict", true, "strict");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:114:3: ( (lv_name_3_0= ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:115:1: (lv_name_3_0= ruleQName )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:115:1: (lv_name_3_0= ruleQName )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:116:3: lv_name_3_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getSlicerAccess().getNameQNameParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleSlicer207);
            lv_name_3_0=ruleQName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSlicerRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"QName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSlicer219); 

                	newLeafNode(otherlv_4, grammarAccess.getSlicerAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSlicer231); 

                	newLeafNode(otherlv_5, grammarAccess.getSlicerAccess().getDomainKeyword_5());
                
            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer243); 

                	newLeafNode(otherlv_6, grammarAccess.getSlicerAccess().getColonKeyword_6());
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:144:1: ( (lv_uriMetamodel_7_0= ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:145:1: (lv_uriMetamodel_7_0= ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:145:1: (lv_uriMetamodel_7_0= ruleEString )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:146:3: lv_uriMetamodel_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSlicerAccess().getUriMetamodelEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicer264);
            lv_uriMetamodel_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSlicerRule());
            	        }
                   		set(
                   			current, 
                   			"uriMetamodel",
                    		lv_uriMetamodel_7_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSlicer276); 

                	newLeafNode(otherlv_8, grammarAccess.getSlicerAccess().getInputKeyword_8());
                
            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer288); 

                	newLeafNode(otherlv_9, grammarAccess.getSlicerAccess().getColonKeyword_9());
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:170:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:171:1: ( ruleQName )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:171:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:172:3: ruleQName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSlicerRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleSlicer311);
            ruleQName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:185:2: (otherlv_11= ',' ( ( ruleQName ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:185:4: otherlv_11= ',' ( ( ruleQName ) )
            	    {
            	    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSlicer324); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSlicerAccess().getCommaKeyword_11_0());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:189:1: ( ( ruleQName ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:190:1: ( ruleQName )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:190:1: ( ruleQName )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:191:3: ruleQName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSlicerRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_11_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleSlicer347);
            	    ruleQName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:204:4: (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:204:6: otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) )
                    {
                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSlicer362); 

                        	newLeafNode(otherlv_13, grammarAccess.getSlicerAccess().getRadiusKeyword_12_0());
                        
                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer374); 

                        	newLeafNode(otherlv_14, grammarAccess.getSlicerAccess().getColonKeyword_12_1());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:212:1: ( (lv_radius_15_0= ruleRadius ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:213:1: (lv_radius_15_0= ruleRadius )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:213:1: (lv_radius_15_0= ruleRadius )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:214:3: lv_radius_15_0= ruleRadius
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicerAccess().getRadiusRadiusParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRadius_in_ruleSlicer395);
                    lv_radius_15_0=ruleRadius();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
                    	        }
                           		set(
                           			current, 
                           			"radius",
                            		lv_radius_15_0, 
                            		"Radius");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:230:4: (otherlv_16= 'constraint' otherlv_17= ':' ( (lv_constraints_18_0= ruleConstraint ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:230:6: otherlv_16= 'constraint' otherlv_17= ':' ( (lv_constraints_18_0= ruleConstraint ) )
            	    {
            	    otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSlicer410); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSlicerAccess().getConstraintKeyword_13_0());
            	        
            	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer422); 

            	        	newLeafNode(otherlv_17, grammarAccess.getSlicerAccess().getColonKeyword_13_1());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:238:1: ( (lv_constraints_18_0= ruleConstraint ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:239:1: (lv_constraints_18_0= ruleConstraint )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:239:1: (lv_constraints_18_0= ruleConstraint )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:240:3: lv_constraints_18_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSlicerAccess().getConstraintsConstraintParserRuleCall_13_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleSlicer443);
            	    lv_constraints_18_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_18_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:256:4: (otherlv_19= 'slicedClass' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedClass ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:256:6: otherlv_19= 'slicedClass' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedClass ) )
            	    {
            	    otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSlicer458); 

            	        	newLeafNode(otherlv_19, grammarAccess.getSlicerAccess().getSlicedClassKeyword_14_0());
            	        
            	    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer470); 

            	        	newLeafNode(otherlv_20, grammarAccess.getSlicerAccess().getColonKeyword_14_1());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:264:1: ( (lv_slicedElements_21_0= ruleSlicedClass ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:265:1: (lv_slicedElements_21_0= ruleSlicedClass )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:265:1: (lv_slicedElements_21_0= ruleSlicedClass )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:266:3: lv_slicedElements_21_0= ruleSlicedClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSlicerAccess().getSlicedElementsSlicedClassParserRuleCall_14_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSlicedClass_in_ruleSlicer491);
            	    lv_slicedElements_21_0=ruleSlicedClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"slicedElements",
            	            		lv_slicedElements_21_0, 
            	            		"SlicedClass");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:282:4: (otherlv_22= 'slicedProperty' otherlv_23= ':' ( (lv_slicedElements_24_0= ruleSlicedProperty ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:282:6: otherlv_22= 'slicedProperty' otherlv_23= ':' ( (lv_slicedElements_24_0= ruleSlicedProperty ) )
            	    {
            	    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSlicer506); 

            	        	newLeafNode(otherlv_22, grammarAccess.getSlicerAccess().getSlicedPropertyKeyword_15_0());
            	        
            	    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer518); 

            	        	newLeafNode(otherlv_23, grammarAccess.getSlicerAccess().getColonKeyword_15_1());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:290:1: ( (lv_slicedElements_24_0= ruleSlicedProperty ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:291:1: (lv_slicedElements_24_0= ruleSlicedProperty )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:291:1: (lv_slicedElements_24_0= ruleSlicedProperty )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:292:3: lv_slicedElements_24_0= ruleSlicedProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSlicerAccess().getSlicedElementsSlicedPropertyParserRuleCall_15_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSlicedProperty_in_ruleSlicer539);
            	    lv_slicedElements_24_0=ruleSlicedProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"slicedElements",
            	            		lv_slicedElements_24_0, 
            	            		"SlicedProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:308:4: (otherlv_25= 'onStart' otherlv_26= '[[' ( (lv_onStart_27_0= ruleEString ) ) otherlv_28= ']]' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:308:6: otherlv_25= 'onStart' otherlv_26= '[[' ( (lv_onStart_27_0= ruleEString ) ) otherlv_28= ']]'
                    {
                    otherlv_25=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSlicer554); 

                        	newLeafNode(otherlv_25, grammarAccess.getSlicerAccess().getOnStartKeyword_16_0());
                        
                    otherlv_26=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicer566); 

                        	newLeafNode(otherlv_26, grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_16_1());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:316:1: ( (lv_onStart_27_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:317:1: (lv_onStart_27_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:317:1: (lv_onStart_27_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:318:3: lv_onStart_27_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicerAccess().getOnStartEStringParserRuleCall_16_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicer587);
                    lv_onStart_27_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
                    	        }
                           		set(
                           			current, 
                           			"onStart",
                            		lv_onStart_27_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_28=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSlicer599); 

                        	newLeafNode(otherlv_28, grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_16_3());
                        

                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:338:3: (otherlv_29= 'onEnd' otherlv_30= '[[' ( (lv_onEnd_31_0= ruleEString ) ) otherlv_32= ']]' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:338:5: otherlv_29= 'onEnd' otherlv_30= '[[' ( (lv_onEnd_31_0= ruleEString ) ) otherlv_32= ']]'
                    {
                    otherlv_29=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSlicer614); 

                        	newLeafNode(otherlv_29, grammarAccess.getSlicerAccess().getOnEndKeyword_17_0());
                        
                    otherlv_30=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicer626); 

                        	newLeafNode(otherlv_30, grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_17_1());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:346:1: ( (lv_onEnd_31_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:347:1: (lv_onEnd_31_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:347:1: (lv_onEnd_31_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:348:3: lv_onEnd_31_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicerAccess().getOnEndEStringParserRuleCall_17_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicer647);
                    lv_onEnd_31_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
                    	        }
                           		set(
                           			current, 
                           			"onEnd",
                            		lv_onEnd_31_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_32=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSlicer659); 

                        	newLeafNode(otherlv_32, grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_17_3());
                        

                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:368:3: (otherlv_33= 'helper' otherlv_34= '[[' ( (lv_helper_35_0= ruleEString ) ) otherlv_36= ']]' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:368:5: otherlv_33= 'helper' otherlv_34= '[[' ( (lv_helper_35_0= ruleEString ) ) otherlv_36= ']]'
                    {
                    otherlv_33=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSlicer674); 

                        	newLeafNode(otherlv_33, grammarAccess.getSlicerAccess().getHelperKeyword_18_0());
                        
                    otherlv_34=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicer686); 

                        	newLeafNode(otherlv_34, grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_18_1());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:376:1: ( (lv_helper_35_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:377:1: (lv_helper_35_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:377:1: (lv_helper_35_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:378:3: lv_helper_35_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicerAccess().getHelperEStringParserRuleCall_18_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicer707);
                    lv_helper_35_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
                    	        }
                           		set(
                           			current, 
                           			"helper",
                            		lv_helper_35_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_36=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSlicer719); 

                        	newLeafNode(otherlv_36, grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_18_3());
                        

                    }
                    break;

            }

            otherlv_37=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSlicer733); 

                	newLeafNode(otherlv_37, grammarAccess.getSlicerAccess().getRightCurlyBracketKeyword_19());
                

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
    // $ANTLR end "ruleSlicer"


    // $ANTLR start "entryRuleEString"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:410:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:411:2: (iv_ruleEString= ruleEString EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:412:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString770);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString781); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:419:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:422:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:423:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:423:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:423:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString821); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:431:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString847); 

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


    // $ANTLR start "entryRuleQName"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:446:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:447:2: (iv_ruleQName= ruleQName EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:448:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_entryRuleQName893);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQName904); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:455:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:458:28: ( (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:459:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:459:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:460:5: this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )*
            {
             
                    newCompositeNode(grammarAccess.getQNameAccess().getEStringParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQName951);
            this_EString_0=ruleEString();

            state._fsp--;


            		current.merge(this_EString_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:470:1: (kw= '.' this_EString_2= ruleEString )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:471:2: kw= '.' this_EString_2= ruleEString
            	    {
            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleQName970); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQNameAccess().getEStringParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQName992);
            	    this_EString_2=ruleEString();

            	    state._fsp--;


            	    		current.merge(this_EString_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "entryRuleConstraint"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:497:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:498:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:499:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint1041);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint1051); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:506:1: ruleConstraint returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:509:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]' ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:510:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:510:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]' )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:510:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]'
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:510:2: ( (lv_name_0_0= ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:511:1: (lv_name_0_0= ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:511:1: (lv_name_0_0= ruleEString )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:512:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstraint1097);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleConstraint1109); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:532:1: ( (lv_expression_2_0= ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:533:1: (lv_expression_2_0= ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:533:1: (lv_expression_2_0= ruleEString )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:534:3: lv_expression_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getExpressionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstraint1130);
            lv_expression_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConstraint1142); 

                	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getRightSquareBracketRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRadius"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:562:1: entryRuleRadius returns [EObject current=null] : iv_ruleRadius= ruleRadius EOF ;
    public final EObject entryRuleRadius() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadius = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:563:2: (iv_ruleRadius= ruleRadius EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:564:2: iv_ruleRadius= ruleRadius EOF
            {
             newCompositeNode(grammarAccess.getRadiusRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadius_in_entryRuleRadius1178);
            iv_ruleRadius=ruleRadius();

            state._fsp--;

             current =iv_ruleRadius; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadius1188); 

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
    // $ANTLR end "entryRuleRadius"


    // $ANTLR start "ruleRadius"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:571:1: ruleRadius returns [EObject current=null] : ( () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )? ) ;
    public final EObject ruleRadius() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:574:28: ( ( () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )? ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:575:1: ( () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )? )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:575:1: ( () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )? )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:575:2: () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )?
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:575:2: ()
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:576:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRadiusAccess().getRadiusAction_0(),
                        current);
                

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:581:2: ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:581:3: ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )*
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:581:3: ( ( ruleQName ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:582:1: ( ruleQName )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:582:1: ( ruleQName )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:583:3: ruleQName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRadiusRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleRadius1246);
                    ruleQName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:596:2: (otherlv_2= ',' ( ( ruleQName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:596:4: otherlv_2= ',' ( ( ruleQName ) )
                    	    {
                    	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRadius1259); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getRadiusAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:600:1: ( ( ruleQName ) )
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:601:1: ( ruleQName )
                    	    {
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:601:1: ( ruleQName )
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:602:3: ruleQName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRadiusRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleRadius1282);
                    	    ruleQName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


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
    // $ANTLR end "ruleRadius"


    // $ANTLR start "entryRuleSlicedClass"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:623:1: entryRuleSlicedClass returns [EObject current=null] : iv_ruleSlicedClass= ruleSlicedClass EOF ;
    public final EObject entryRuleSlicedClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlicedClass = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:624:2: (iv_ruleSlicedClass= ruleSlicedClass EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:625:2: iv_ruleSlicedClass= ruleSlicedClass EOF
            {
             newCompositeNode(grammarAccess.getSlicedClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedClass_in_entryRuleSlicedClass1322);
            iv_ruleSlicedClass=ruleSlicedClass();

            state._fsp--;

             current =iv_ruleSlicedClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicedClass1332); 

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
    // $ANTLR end "entryRuleSlicedClass"


    // $ANTLR start "ruleSlicedClass"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:632:1: ruleSlicedClass returns [EObject current=null] : ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )? ) ;
    public final EObject ruleSlicedClass() throws RecognitionException {
        EObject current = null;

        Token lv_isOption_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ctx_2_0 = null;

        AntlrDatatypeRuleToken lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:635:28: ( ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )? ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:636:1: ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )? )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:636:1: ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )? )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:636:2: ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )?
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:636:2: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:637:1: ( ruleQName )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:637:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:638:3: ruleQName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSlicedClassRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSlicedClassAccess().getDomainEClassCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleSlicedClass1380);
            ruleQName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:651:2: ( (lv_isOption_1_0= 'option' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:652:1: (lv_isOption_1_0= 'option' )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:652:1: (lv_isOption_1_0= 'option' )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:653:3: lv_isOption_1_0= 'option'
                    {
                    lv_isOption_1_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSlicedClass1398); 

                            newLeafNode(lv_isOption_1_0, grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSlicedClassRule());
                    	        }
                           		setWithLastConsumed(current, "isOption", true, "option");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:666:3: ( (lv_ctx_2_0= ruleVarDecl ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:667:1: (lv_ctx_2_0= ruleVarDecl )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:667:1: (lv_ctx_2_0= ruleVarDecl )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:668:3: lv_ctx_2_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedClassAccess().getCtxVarDeclParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_ruleSlicedClass1433);
                    lv_ctx_2_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicedClassRule());
                    	        }
                           		set(
                           			current, 
                           			"ctx",
                            		lv_ctx_2_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:684:3: (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:684:5: otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]'
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicedClass1447); 

                        	newLeafNode(otherlv_3, grammarAccess.getSlicedClassAccess().getLeftSquareBracketLeftSquareBracketKeyword_3_0());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:688:1: ( (lv_expression_4_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:689:1: (lv_expression_4_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:689:1: (lv_expression_4_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:690:3: lv_expression_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedClassAccess().getExpressionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicedClass1468);
                    lv_expression_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicedClassRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSlicedClass1480); 

                        	newLeafNode(otherlv_5, grammarAccess.getSlicedClassAccess().getRightSquareBracketRightSquareBracketKeyword_3_2());
                        

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
    // $ANTLR end "ruleSlicedClass"


    // $ANTLR start "entryRuleVarDecl"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:718:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:719:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:720:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_entryRuleVarDecl1518);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVarDecl1528); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:727:1: ruleVarDecl returns [EObject current=null] : ( (lv_varName_0_0= ruleEString ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_varName_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:730:28: ( ( (lv_varName_0_0= ruleEString ) ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:731:1: ( (lv_varName_0_0= ruleEString ) )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:731:1: ( (lv_varName_0_0= ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:732:1: (lv_varName_0_0= ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:732:1: (lv_varName_0_0= ruleEString )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:733:3: lv_varName_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclAccess().getVarNameEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVarDecl1573);
            lv_varName_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
            	        }
                   		set(
                   			current, 
                   			"varName",
                    		lv_varName_0_0, 
                    		"EString");
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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleSlicedProperty"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:757:1: entryRuleSlicedProperty returns [EObject current=null] : iv_ruleSlicedProperty= ruleSlicedProperty EOF ;
    public final EObject entryRuleSlicedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlicedProperty = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:758:2: (iv_ruleSlicedProperty= ruleSlicedProperty EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:759:2: iv_ruleSlicedProperty= ruleSlicedProperty EOF
            {
             newCompositeNode(grammarAccess.getSlicedPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedProperty_in_entryRuleSlicedProperty1608);
            iv_ruleSlicedProperty=ruleSlicedProperty();

            state._fsp--;

             current =iv_ruleSlicedProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicedProperty1618); 

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
    // $ANTLR end "entryRuleSlicedProperty"


    // $ANTLR start "ruleSlicedProperty"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:766:1: ruleSlicedProperty returns [EObject current=null] : ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_src_2_0= ruleVarDecl ) )? ( (lv_tgt_3_0= ruleVarDecl ) )? ( (lv_opposite_4_0= ruleOppositeCreation ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )? ) ;
    public final EObject ruleSlicedProperty() throws RecognitionException {
        EObject current = null;

        Token lv_isOption_1_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_src_2_0 = null;

        EObject lv_tgt_3_0 = null;

        EObject lv_opposite_4_0 = null;

        AntlrDatatypeRuleToken lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:769:28: ( ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_src_2_0= ruleVarDecl ) )? ( (lv_tgt_3_0= ruleVarDecl ) )? ( (lv_opposite_4_0= ruleOppositeCreation ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )? ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:770:1: ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_src_2_0= ruleVarDecl ) )? ( (lv_tgt_3_0= ruleVarDecl ) )? ( (lv_opposite_4_0= ruleOppositeCreation ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )? )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:770:1: ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_src_2_0= ruleVarDecl ) )? ( (lv_tgt_3_0= ruleVarDecl ) )? ( (lv_opposite_4_0= ruleOppositeCreation ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )? )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:770:2: ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_src_2_0= ruleVarDecl ) )? ( (lv_tgt_3_0= ruleVarDecl ) )? ( (lv_opposite_4_0= ruleOppositeCreation ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )?
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:770:2: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:771:1: ( ruleQName )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:771:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:772:3: ruleQName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSlicedPropertyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleSlicedProperty1666);
            ruleQName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:785:2: ( (lv_isOption_1_0= 'option' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:786:1: (lv_isOption_1_0= 'option' )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:786:1: (lv_isOption_1_0= 'option' )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:787:3: lv_isOption_1_0= 'option'
                    {
                    lv_isOption_1_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSlicedProperty1684); 

                            newLeafNode(lv_isOption_1_0, grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSlicedPropertyRule());
                    	        }
                           		setWithLastConsumed(current, "isOption", true, "option");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:800:3: ( (lv_src_2_0= ruleVarDecl ) )?
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
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:801:1: (lv_src_2_0= ruleVarDecl )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:801:1: (lv_src_2_0= ruleVarDecl )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:802:3: lv_src_2_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getSrcVarDeclParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_ruleSlicedProperty1719);
                    lv_src_2_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"src",
                            		lv_src_2_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:818:3: ( (lv_tgt_3_0= ruleVarDecl ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:819:1: (lv_tgt_3_0= ruleVarDecl )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:819:1: (lv_tgt_3_0= ruleVarDecl )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:820:3: lv_tgt_3_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getTgtVarDeclParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_ruleSlicedProperty1741);
                    lv_tgt_3_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"tgt",
                            		lv_tgt_3_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:836:3: ( (lv_opposite_4_0= ruleOppositeCreation ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:837:1: (lv_opposite_4_0= ruleOppositeCreation )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:837:1: (lv_opposite_4_0= ruleOppositeCreation )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:838:3: lv_opposite_4_0= ruleOppositeCreation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getOppositeOppositeCreationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOppositeCreation_in_ruleSlicedProperty1763);
                    lv_opposite_4_0=ruleOppositeCreation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"opposite",
                            		lv_opposite_4_0, 
                            		"OppositeCreation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:854:3: (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:854:5: otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]'
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicedProperty1777); 

                        	newLeafNode(otherlv_5, grammarAccess.getSlicedPropertyAccess().getLeftSquareBracketLeftSquareBracketKeyword_5_0());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:858:1: ( (lv_expression_6_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:859:1: (lv_expression_6_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:859:1: (lv_expression_6_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:860:3: lv_expression_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getExpressionEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicedProperty1798);
                    lv_expression_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSlicedProperty1810); 

                        	newLeafNode(otherlv_7, grammarAccess.getSlicedPropertyAccess().getRightSquareBracketRightSquareBracketKeyword_5_2());
                        

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
    // $ANTLR end "ruleSlicedProperty"


    // $ANTLR start "entryRuleOppositeCreation"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:888:1: entryRuleOppositeCreation returns [EObject current=null] : iv_ruleOppositeCreation= ruleOppositeCreation EOF ;
    public final EObject entryRuleOppositeCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOppositeCreation = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:889:2: (iv_ruleOppositeCreation= ruleOppositeCreation EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:890:2: iv_ruleOppositeCreation= ruleOppositeCreation EOF
            {
             newCompositeNode(grammarAccess.getOppositeCreationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOppositeCreation_in_entryRuleOppositeCreation1848);
            iv_ruleOppositeCreation=ruleOppositeCreation();

            state._fsp--;

             current =iv_ruleOppositeCreation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOppositeCreation1858); 

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
    // $ANTLR end "entryRuleOppositeCreation"


    // $ANTLR start "ruleOppositeCreation"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:897:1: ruleOppositeCreation returns [EObject current=null] : ( () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleOppositeCreation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:900:28: ( ( () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:901:1: ( () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:901:1: ( () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:901:2: () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')'
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:901:2: ()
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:902:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOppositeCreationAccess().getOppositeCreationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOppositeCreation1904); 

                	newLeafNode(otherlv_1, grammarAccess.getOppositeCreationAccess().getOppositeKeyword_1());
                
            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOppositeCreation1916); 

                	newLeafNode(otherlv_2, grammarAccess.getOppositeCreationAccess().getLeftParenthesisKeyword_2());
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:915:1: ( (lv_name_3_0= ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:916:1: (lv_name_3_0= ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:916:1: (lv_name_3_0= ruleEString )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:917:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOppositeCreationAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOppositeCreation1937);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOppositeCreationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOppositeCreation1949); 

                	newLeafNode(otherlv_4, grammarAccess.getOppositeCreationAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleOppositeCreation"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSlicer_in_entryRuleSlicer75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicer85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSlicer122 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_12_in_ruleSlicer140 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_13_in_ruleSlicer172 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleQName_in_ruleSlicer207 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSlicer219 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSlicer231 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer243 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicer264 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSlicer276 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer288 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleQName_in_ruleSlicer311 = new BitSet(new long[]{0x000000001CFC0000L});
        public static final BitSet FOLLOW_18_in_ruleSlicer324 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleQName_in_ruleSlicer347 = new BitSet(new long[]{0x000000001CFC0000L});
        public static final BitSet FOLLOW_19_in_ruleSlicer362 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer374 = new BitSet(new long[]{0x000000001CF03030L});
        public static final BitSet FOLLOW_ruleRadius_in_ruleSlicer395 = new BitSet(new long[]{0x000000001CF00000L});
        public static final BitSet FOLLOW_20_in_ruleSlicer410 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer422 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleSlicer443 = new BitSet(new long[]{0x000000001CF00000L});
        public static final BitSet FOLLOW_21_in_ruleSlicer458 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer470 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleSlicedClass_in_ruleSlicer491 = new BitSet(new long[]{0x000000001CE00000L});
        public static final BitSet FOLLOW_22_in_ruleSlicer506 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer518 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleSlicedProperty_in_ruleSlicer539 = new BitSet(new long[]{0x000000001CC00000L});
        public static final BitSet FOLLOW_23_in_ruleSlicer554 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSlicer566 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicer587 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleSlicer599 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_26_in_ruleSlicer614 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSlicer626 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicer647 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleSlicer659 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleSlicer674 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSlicer686 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicer707 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleSlicer719 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleSlicer733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString770 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_entryRuleQName893 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQName904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQName951 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleQName970 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQName992 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstraint1097 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleConstraint1109 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstraint1130 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleConstraint1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadius_in_entryRuleRadius1178 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadius1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_ruleRadius1246 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleRadius1259 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleQName_in_ruleRadius1282 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleSlicedClass_in_entryRuleSlicedClass1322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicedClass1332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_ruleSlicedClass1380 = new BitSet(new long[]{0x0000000041003032L});
        public static final BitSet FOLLOW_30_in_ruleSlicedClass1398 = new BitSet(new long[]{0x0000000001003032L});
        public static final BitSet FOLLOW_ruleVarDecl_in_ruleSlicedClass1433 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleSlicedClass1447 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicedClass1468 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleSlicedClass1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl1518 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl1528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVarDecl1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedProperty_in_entryRuleSlicedProperty1608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicedProperty1618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_ruleSlicedProperty1666 = new BitSet(new long[]{0x00000000C1003032L});
        public static final BitSet FOLLOW_30_in_ruleSlicedProperty1684 = new BitSet(new long[]{0x0000000081003032L});
        public static final BitSet FOLLOW_ruleVarDecl_in_ruleSlicedProperty1719 = new BitSet(new long[]{0x0000000081003032L});
        public static final BitSet FOLLOW_ruleVarDecl_in_ruleSlicedProperty1741 = new BitSet(new long[]{0x0000000081000002L});
        public static final BitSet FOLLOW_ruleOppositeCreation_in_ruleSlicedProperty1763 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleSlicedProperty1777 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicedProperty1798 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleSlicedProperty1810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOppositeCreation_in_entryRuleOppositeCreation1848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOppositeCreation1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleOppositeCreation1904 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleOppositeCreation1916 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOppositeCreation1937 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleOppositeCreation1949 = new BitSet(new long[]{0x0000000000000002L});
    }


}