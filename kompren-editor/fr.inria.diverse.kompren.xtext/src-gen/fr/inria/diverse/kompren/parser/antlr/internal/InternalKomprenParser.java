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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'slicer'", "'active'", "'strict'", "'{'", "'domain'", "':'", "'input'", "','", "'radius'", "'slicedClass'", "'slicedProperty'", "'onStart'", "'[['", "']]'", "'onEnd'", "'helper'", "'}'", "'.'", "'option'", "'constraint'", "'opposite'", "'('", "')'"
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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:76:1: ruleSlicer returns [EObject current=null] : (otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' (otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) )+ otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'slicedClass' otherlv_17= ':' ( (lv_slicedElements_18_0= ruleSlicedClass ) ) )* (otherlv_19= 'slicedProperty' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedProperty ) ) )* (otherlv_22= 'onStart' otherlv_23= '[[' ( (lv_onStart_24_0= ruleEString ) ) otherlv_25= ']]' )? (otherlv_26= 'onEnd' otherlv_27= '[[' ( (lv_onEnd_28_0= ruleEString ) ) otherlv_29= ']]' )? (otherlv_30= 'helper' otherlv_31= '[[' ( (lv_helper_32_0= ruleEString ) ) otherlv_33= ']]' )? otherlv_34= '}' ) ;
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
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_uriMetamodel_7_0 = null;

        EObject lv_radius_15_0 = null;

        EObject lv_slicedElements_18_0 = null;

        EObject lv_slicedElements_21_0 = null;

        AntlrDatatypeRuleToken lv_onStart_24_0 = null;

        AntlrDatatypeRuleToken lv_onEnd_28_0 = null;

        AntlrDatatypeRuleToken lv_helper_32_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:79:28: ( (otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' (otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) )+ otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'slicedClass' otherlv_17= ':' ( (lv_slicedElements_18_0= ruleSlicedClass ) ) )* (otherlv_19= 'slicedProperty' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedProperty ) ) )* (otherlv_22= 'onStart' otherlv_23= '[[' ( (lv_onStart_24_0= ruleEString ) ) otherlv_25= ']]' )? (otherlv_26= 'onEnd' otherlv_27= '[[' ( (lv_onEnd_28_0= ruleEString ) ) otherlv_29= ']]' )? (otherlv_30= 'helper' otherlv_31= '[[' ( (lv_helper_32_0= ruleEString ) ) otherlv_33= ']]' )? otherlv_34= '}' ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:80:1: (otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' (otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) )+ otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'slicedClass' otherlv_17= ':' ( (lv_slicedElements_18_0= ruleSlicedClass ) ) )* (otherlv_19= 'slicedProperty' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedProperty ) ) )* (otherlv_22= 'onStart' otherlv_23= '[[' ( (lv_onStart_24_0= ruleEString ) ) otherlv_25= ']]' )? (otherlv_26= 'onEnd' otherlv_27= '[[' ( (lv_onEnd_28_0= ruleEString ) ) otherlv_29= ']]' )? (otherlv_30= 'helper' otherlv_31= '[[' ( (lv_helper_32_0= ruleEString ) ) otherlv_33= ']]' )? otherlv_34= '}' )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:80:1: (otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' (otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) )+ otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'slicedClass' otherlv_17= ':' ( (lv_slicedElements_18_0= ruleSlicedClass ) ) )* (otherlv_19= 'slicedProperty' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedProperty ) ) )* (otherlv_22= 'onStart' otherlv_23= '[[' ( (lv_onStart_24_0= ruleEString ) ) otherlv_25= ']]' )? (otherlv_26= 'onEnd' otherlv_27= '[[' ( (lv_onEnd_28_0= ruleEString ) ) otherlv_29= ']]' )? (otherlv_30= 'helper' otherlv_31= '[[' ( (lv_helper_32_0= ruleEString ) ) otherlv_33= ']]' )? otherlv_34= '}' )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:80:3: otherlv_0= 'slicer' ( (lv_active_1_0= 'active' ) )? ( (lv_strict_2_0= 'strict' ) )? ( (lv_name_3_0= ruleQName ) ) otherlv_4= '{' (otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) )+ otherlv_8= 'input' otherlv_9= ':' ( ( ruleQName ) ) (otherlv_11= ',' ( ( ruleQName ) ) )* (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )? (otherlv_16= 'slicedClass' otherlv_17= ':' ( (lv_slicedElements_18_0= ruleSlicedClass ) ) )* (otherlv_19= 'slicedProperty' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedProperty ) ) )* (otherlv_22= 'onStart' otherlv_23= '[[' ( (lv_onStart_24_0= ruleEString ) ) otherlv_25= ']]' )? (otherlv_26= 'onEnd' otherlv_27= '[[' ( (lv_onEnd_28_0= ruleEString ) ) otherlv_29= ']]' )? (otherlv_30= 'helper' otherlv_31= '[[' ( (lv_helper_32_0= ruleEString ) ) otherlv_33= ']]' )? otherlv_34= '}'
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
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:136:1: (otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:136:3: otherlv_5= 'domain' otherlv_6= ':' ( (lv_uriMetamodel_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSlicer232); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSlicerAccess().getDomainKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer244); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSlicerAccess().getColonKeyword_5_1());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:144:1: ( (lv_uriMetamodel_7_0= ruleEString ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:145:1: (lv_uriMetamodel_7_0= ruleEString )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:145:1: (lv_uriMetamodel_7_0= ruleEString )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:146:3: lv_uriMetamodel_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSlicerAccess().getUriMetamodelEStringParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicer265);
            	    lv_uriMetamodel_7_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"uriMetamodel",
            	            		lv_uriMetamodel_7_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSlicer279); 

                	newLeafNode(otherlv_8, grammarAccess.getSlicerAccess().getInputKeyword_6());
                
            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer291); 

                	newLeafNode(otherlv_9, grammarAccess.getSlicerAccess().getColonKeyword_7());
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:170:1: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:171:1: ( ruleQName )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:171:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:172:3: ruleQName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSlicerRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleSlicer314);
            ruleQName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:185:2: (otherlv_11= ',' ( ( ruleQName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:185:4: otherlv_11= ',' ( ( ruleQName ) )
            	    {
            	    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSlicer327); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSlicerAccess().getCommaKeyword_9_0());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:189:1: ( ( ruleQName ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:190:1: ( ruleQName )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:190:1: ( ruleQName )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:191:3: ruleQName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSlicerRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleSlicer350);
            	    ruleQName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:204:4: (otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:204:6: otherlv_13= 'radius' otherlv_14= ':' ( (lv_radius_15_0= ruleRadius ) )
                    {
                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSlicer365); 

                        	newLeafNode(otherlv_13, grammarAccess.getSlicerAccess().getRadiusKeyword_10_0());
                        
                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer377); 

                        	newLeafNode(otherlv_14, grammarAccess.getSlicerAccess().getColonKeyword_10_1());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:212:1: ( (lv_radius_15_0= ruleRadius ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:213:1: (lv_radius_15_0= ruleRadius )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:213:1: (lv_radius_15_0= ruleRadius )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:214:3: lv_radius_15_0= ruleRadius
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicerAccess().getRadiusRadiusParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRadius_in_ruleSlicer398);
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

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:230:4: (otherlv_16= 'slicedClass' otherlv_17= ':' ( (lv_slicedElements_18_0= ruleSlicedClass ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:230:6: otherlv_16= 'slicedClass' otherlv_17= ':' ( (lv_slicedElements_18_0= ruleSlicedClass ) )
            	    {
            	    otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSlicer413); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSlicerAccess().getSlicedClassKeyword_11_0());
            	        
            	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer425); 

            	        	newLeafNode(otherlv_17, grammarAccess.getSlicerAccess().getColonKeyword_11_1());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:238:1: ( (lv_slicedElements_18_0= ruleSlicedClass ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:239:1: (lv_slicedElements_18_0= ruleSlicedClass )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:239:1: (lv_slicedElements_18_0= ruleSlicedClass )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:240:3: lv_slicedElements_18_0= ruleSlicedClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSlicerAccess().getSlicedElementsSlicedClassParserRuleCall_11_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSlicedClass_in_ruleSlicer446);
            	    lv_slicedElements_18_0=ruleSlicedClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"slicedElements",
            	            		lv_slicedElements_18_0, 
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

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:256:4: (otherlv_19= 'slicedProperty' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedProperty ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:256:6: otherlv_19= 'slicedProperty' otherlv_20= ':' ( (lv_slicedElements_21_0= ruleSlicedProperty ) )
            	    {
            	    otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSlicer461); 

            	        	newLeafNode(otherlv_19, grammarAccess.getSlicerAccess().getSlicedPropertyKeyword_12_0());
            	        
            	    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicer473); 

            	        	newLeafNode(otherlv_20, grammarAccess.getSlicerAccess().getColonKeyword_12_1());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:264:1: ( (lv_slicedElements_21_0= ruleSlicedProperty ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:265:1: (lv_slicedElements_21_0= ruleSlicedProperty )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:265:1: (lv_slicedElements_21_0= ruleSlicedProperty )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:266:3: lv_slicedElements_21_0= ruleSlicedProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSlicerAccess().getSlicedElementsSlicedPropertyParserRuleCall_12_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSlicedProperty_in_ruleSlicer494);
            	    lv_slicedElements_21_0=ruleSlicedProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"slicedElements",
            	            		lv_slicedElements_21_0, 
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

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:282:4: (otherlv_22= 'onStart' otherlv_23= '[[' ( (lv_onStart_24_0= ruleEString ) ) otherlv_25= ']]' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:282:6: otherlv_22= 'onStart' otherlv_23= '[[' ( (lv_onStart_24_0= ruleEString ) ) otherlv_25= ']]'
                    {
                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSlicer509); 

                        	newLeafNode(otherlv_22, grammarAccess.getSlicerAccess().getOnStartKeyword_13_0());
                        
                    otherlv_23=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSlicer521); 

                        	newLeafNode(otherlv_23, grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_13_1());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:290:1: ( (lv_onStart_24_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:291:1: (lv_onStart_24_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:291:1: (lv_onStart_24_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:292:3: lv_onStart_24_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicerAccess().getOnStartEStringParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicer542);
                    lv_onStart_24_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
                    	        }
                           		set(
                           			current, 
                           			"onStart",
                            		lv_onStart_24_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_25=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicer554); 

                        	newLeafNode(otherlv_25, grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_13_3());
                        

                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:312:3: (otherlv_26= 'onEnd' otherlv_27= '[[' ( (lv_onEnd_28_0= ruleEString ) ) otherlv_29= ']]' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:312:5: otherlv_26= 'onEnd' otherlv_27= '[[' ( (lv_onEnd_28_0= ruleEString ) ) otherlv_29= ']]'
                    {
                    otherlv_26=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSlicer569); 

                        	newLeafNode(otherlv_26, grammarAccess.getSlicerAccess().getOnEndKeyword_14_0());
                        
                    otherlv_27=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSlicer581); 

                        	newLeafNode(otherlv_27, grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_14_1());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:320:1: ( (lv_onEnd_28_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:321:1: (lv_onEnd_28_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:321:1: (lv_onEnd_28_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:322:3: lv_onEnd_28_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicerAccess().getOnEndEStringParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicer602);
                    lv_onEnd_28_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
                    	        }
                           		set(
                           			current, 
                           			"onEnd",
                            		lv_onEnd_28_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_29=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicer614); 

                        	newLeafNode(otherlv_29, grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_14_3());
                        

                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:342:3: (otherlv_30= 'helper' otherlv_31= '[[' ( (lv_helper_32_0= ruleEString ) ) otherlv_33= ']]' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:342:5: otherlv_30= 'helper' otherlv_31= '[[' ( (lv_helper_32_0= ruleEString ) ) otherlv_33= ']]'
                    {
                    otherlv_30=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSlicer629); 

                        	newLeafNode(otherlv_30, grammarAccess.getSlicerAccess().getHelperKeyword_15_0());
                        
                    otherlv_31=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSlicer641); 

                        	newLeafNode(otherlv_31, grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_15_1());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:350:1: ( (lv_helper_32_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:351:1: (lv_helper_32_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:351:1: (lv_helper_32_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:352:3: lv_helper_32_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicerAccess().getHelperEStringParserRuleCall_15_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicer662);
                    lv_helper_32_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicerRule());
                    	        }
                           		set(
                           			current, 
                           			"helper",
                            		lv_helper_32_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_33=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicer674); 

                        	newLeafNode(otherlv_33, grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_15_3());
                        

                    }
                    break;

            }

            otherlv_34=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSlicer688); 

                	newLeafNode(otherlv_34, grammarAccess.getSlicerAccess().getRightCurlyBracketKeyword_16());
                

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:384:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:385:2: (iv_ruleEString= ruleEString EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:386:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString725);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString736); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:393:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:396:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:397:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:397:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:397:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString776); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:405:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString802); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:420:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:421:2: (iv_ruleQName= ruleQName EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:422:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_entryRuleQName848);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQName859); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:429:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:432:28: ( (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:433:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:433:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:434:5: this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )*
            {
             
                    newCompositeNode(grammarAccess.getQNameAccess().getEStringParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQName906);
            this_EString_0=ruleEString();

            state._fsp--;


            		current.merge(this_EString_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:444:1: (kw= '.' this_EString_2= ruleEString )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:445:2: kw= '.' this_EString_2= ruleEString
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleQName925); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQNameAccess().getEStringParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQName947);
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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:471:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:472:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:473:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint996);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint1006); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:480:1: ruleConstraint returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:483:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]' ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:484:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]' )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:484:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]' )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:484:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '[[' ( (lv_expression_2_0= ruleEString ) ) otherlv_3= ']]'
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:484:2: ( (lv_name_0_0= ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:485:1: (lv_name_0_0= ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:485:1: (lv_name_0_0= ruleEString )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:486:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstraint1052);
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

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleConstraint1064); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:506:1: ( (lv_expression_2_0= ruleEString ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:507:1: (lv_expression_2_0= ruleEString )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:507:1: (lv_expression_2_0= ruleEString )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:508:3: lv_expression_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getExpressionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConstraint1085);
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

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleConstraint1097); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:536:1: entryRuleRadius returns [EObject current=null] : iv_ruleRadius= ruleRadius EOF ;
    public final EObject entryRuleRadius() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadius = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:537:2: (iv_ruleRadius= ruleRadius EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:538:2: iv_ruleRadius= ruleRadius EOF
            {
             newCompositeNode(grammarAccess.getRadiusRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRadius_in_entryRuleRadius1133);
            iv_ruleRadius=ruleRadius();

            state._fsp--;

             current =iv_ruleRadius; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRadius1143); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:545:1: ruleRadius returns [EObject current=null] : ( () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )? ) ;
    public final EObject ruleRadius() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:548:28: ( ( () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )? ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:549:1: ( () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )? )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:549:1: ( () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )? )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:549:2: () ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )?
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:549:2: ()
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:550:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRadiusAccess().getRadiusAction_0(),
                        current);
                

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:555:2: ( ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:555:3: ( ( ruleQName ) ) (otherlv_2= ',' ( ( ruleQName ) ) )*
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:555:3: ( ( ruleQName ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:556:1: ( ruleQName )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:556:1: ( ruleQName )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:557:3: ruleQName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRadiusRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleRadius1201);
                    ruleQName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:570:2: (otherlv_2= ',' ( ( ruleQName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:570:4: otherlv_2= ',' ( ( ruleQName ) )
                    	    {
                    	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRadius1214); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getRadiusAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:574:1: ( ( ruleQName ) )
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:575:1: ( ruleQName )
                    	    {
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:575:1: ( ruleQName )
                    	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:576:3: ruleQName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRadiusRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleRadius1237);
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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:597:1: entryRuleSlicedClass returns [EObject current=null] : iv_ruleSlicedClass= ruleSlicedClass EOF ;
    public final EObject entryRuleSlicedClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlicedClass = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:598:2: (iv_ruleSlicedClass= ruleSlicedClass EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:599:2: iv_ruleSlicedClass= ruleSlicedClass EOF
            {
             newCompositeNode(grammarAccess.getSlicedClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSlicedClass_in_entryRuleSlicedClass1277);
            iv_ruleSlicedClass=ruleSlicedClass();

            state._fsp--;

             current =iv_ruleSlicedClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicedClass1287); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:606:1: ruleSlicedClass returns [EObject current=null] : ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )? (otherlv_6= 'constraint' otherlv_7= ':' ( (lv_constraints_8_0= ruleConstraint ) ) )* ) ;
    public final EObject ruleSlicedClass() throws RecognitionException {
        EObject current = null;

        Token lv_isOption_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_ctx_2_0 = null;

        AntlrDatatypeRuleToken lv_expression_4_0 = null;

        EObject lv_constraints_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:609:28: ( ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )? (otherlv_6= 'constraint' otherlv_7= ':' ( (lv_constraints_8_0= ruleConstraint ) ) )* ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:610:1: ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )? (otherlv_6= 'constraint' otherlv_7= ':' ( (lv_constraints_8_0= ruleConstraint ) ) )* )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:610:1: ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )? (otherlv_6= 'constraint' otherlv_7= ':' ( (lv_constraints_8_0= ruleConstraint ) ) )* )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:610:2: ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_ctx_2_0= ruleVarDecl ) )? (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )? (otherlv_6= 'constraint' otherlv_7= ':' ( (lv_constraints_8_0= ruleConstraint ) ) )*
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:610:2: ( ( ruleQName ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:611:1: ( ruleQName )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:611:1: ( ruleQName )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:612:3: ruleQName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSlicedClassRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSlicedClassAccess().getDomainEClassCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleSlicedClass1335);
            ruleQName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:625:2: ( (lv_isOption_1_0= 'option' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:626:1: (lv_isOption_1_0= 'option' )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:626:1: (lv_isOption_1_0= 'option' )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:627:3: lv_isOption_1_0= 'option'
                    {
                    lv_isOption_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSlicedClass1353); 

                            newLeafNode(lv_isOption_1_0, grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSlicedClassRule());
                    	        }
                           		setWithLastConsumed(current, "isOption", true, "option");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:640:3: ( (lv_ctx_2_0= ruleVarDecl ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:641:1: (lv_ctx_2_0= ruleVarDecl )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:641:1: (lv_ctx_2_0= ruleVarDecl )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:642:3: lv_ctx_2_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedClassAccess().getCtxVarDeclParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_ruleSlicedClass1388);
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

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:658:3: (otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:658:5: otherlv_3= '[[' ( (lv_expression_4_0= ruleEString ) ) otherlv_5= ']]'
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSlicedClass1402); 

                        	newLeafNode(otherlv_3, grammarAccess.getSlicedClassAccess().getLeftSquareBracketLeftSquareBracketKeyword_3_0());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:662:1: ( (lv_expression_4_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:663:1: (lv_expression_4_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:663:1: (lv_expression_4_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:664:3: lv_expression_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedClassAccess().getExpressionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicedClass1423);
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

                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicedClass1435); 

                        	newLeafNode(otherlv_5, grammarAccess.getSlicedClassAccess().getRightSquareBracketRightSquareBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:684:3: (otherlv_6= 'constraint' otherlv_7= ':' ( (lv_constraints_8_0= ruleConstraint ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:684:5: otherlv_6= 'constraint' otherlv_7= ':' ( (lv_constraints_8_0= ruleConstraint ) )
            	    {
            	    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSlicedClass1450); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSlicedClassAccess().getConstraintKeyword_4_0());
            	        
            	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicedClass1462); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSlicedClassAccess().getColonKeyword_4_1());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:692:1: ( (lv_constraints_8_0= ruleConstraint ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:693:1: (lv_constraints_8_0= ruleConstraint )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:693:1: (lv_constraints_8_0= ruleConstraint )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:694:3: lv_constraints_8_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSlicedClassAccess().getConstraintsConstraintParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleSlicedClass1483);
            	    lv_constraints_8_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSlicedClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_8_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
            pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_entryRuleVarDecl1521);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVarDecl1531); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:727:1: ruleVarDecl returns [EObject current=null] : ( (lv_varName_0_0= RULE_ID ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:730:28: ( ( (lv_varName_0_0= RULE_ID ) ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:731:1: ( (lv_varName_0_0= RULE_ID ) )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:731:1: ( (lv_varName_0_0= RULE_ID ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:732:1: (lv_varName_0_0= RULE_ID )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:732:1: (lv_varName_0_0= RULE_ID )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:733:3: lv_varName_0_0= RULE_ID
            {
            lv_varName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVarDecl1572); 

            			newLeafNode(lv_varName_0_0, grammarAccess.getVarDeclAccess().getVarNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_0_0, 
                    		"ID");
            	    

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
            pushFollow(FollowSets000.FOLLOW_ruleSlicedProperty_in_entryRuleSlicedProperty1612);
            iv_ruleSlicedProperty=ruleSlicedProperty();

            state._fsp--;

             current =iv_ruleSlicedProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSlicedProperty1622); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:766:1: ruleSlicedProperty returns [EObject current=null] : ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_opposite_2_0= ruleOppositeCreation ) )? ( (lv_src_3_0= ruleVarDecl ) )? ( (lv_tgt_4_0= ruleVarDecl ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )? (otherlv_8= 'constraint' otherlv_9= ':' ( (lv_constraints_10_0= ruleConstraint ) ) )* ) ;
    public final EObject ruleSlicedProperty() throws RecognitionException {
        EObject current = null;

        Token lv_isOption_1_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_opposite_2_0 = null;

        EObject lv_src_3_0 = null;

        EObject lv_tgt_4_0 = null;

        AntlrDatatypeRuleToken lv_expression_6_0 = null;

        EObject lv_constraints_10_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:769:28: ( ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_opposite_2_0= ruleOppositeCreation ) )? ( (lv_src_3_0= ruleVarDecl ) )? ( (lv_tgt_4_0= ruleVarDecl ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )? (otherlv_8= 'constraint' otherlv_9= ':' ( (lv_constraints_10_0= ruleConstraint ) ) )* ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:770:1: ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_opposite_2_0= ruleOppositeCreation ) )? ( (lv_src_3_0= ruleVarDecl ) )? ( (lv_tgt_4_0= ruleVarDecl ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )? (otherlv_8= 'constraint' otherlv_9= ':' ( (lv_constraints_10_0= ruleConstraint ) ) )* )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:770:1: ( ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_opposite_2_0= ruleOppositeCreation ) )? ( (lv_src_3_0= ruleVarDecl ) )? ( (lv_tgt_4_0= ruleVarDecl ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )? (otherlv_8= 'constraint' otherlv_9= ':' ( (lv_constraints_10_0= ruleConstraint ) ) )* )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:770:2: ( ( ruleQName ) ) ( (lv_isOption_1_0= 'option' ) )? ( (lv_opposite_2_0= ruleOppositeCreation ) )? ( (lv_src_3_0= ruleVarDecl ) )? ( (lv_tgt_4_0= ruleVarDecl ) )? (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )? (otherlv_8= 'constraint' otherlv_9= ':' ( (lv_constraints_10_0= ruleConstraint ) ) )*
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
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQName_in_ruleSlicedProperty1670);
            ruleQName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:785:2: ( (lv_isOption_1_0= 'option' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:786:1: (lv_isOption_1_0= 'option' )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:786:1: (lv_isOption_1_0= 'option' )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:787:3: lv_isOption_1_0= 'option'
                    {
                    lv_isOption_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSlicedProperty1688); 

                            newLeafNode(lv_isOption_1_0, grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSlicedPropertyRule());
                    	        }
                           		setWithLastConsumed(current, "isOption", true, "option");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:800:3: ( (lv_opposite_2_0= ruleOppositeCreation ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:801:1: (lv_opposite_2_0= ruleOppositeCreation )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:801:1: (lv_opposite_2_0= ruleOppositeCreation )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:802:3: lv_opposite_2_0= ruleOppositeCreation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getOppositeOppositeCreationParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOppositeCreation_in_ruleSlicedProperty1723);
                    lv_opposite_2_0=ruleOppositeCreation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"opposite",
                            		lv_opposite_2_0, 
                            		"OppositeCreation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:818:3: ( (lv_src_3_0= ruleVarDecl ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:819:1: (lv_src_3_0= ruleVarDecl )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:819:1: (lv_src_3_0= ruleVarDecl )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:820:3: lv_src_3_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getSrcVarDeclParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_ruleSlicedProperty1745);
                    lv_src_3_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"src",
                            		lv_src_3_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:836:3: ( (lv_tgt_4_0= ruleVarDecl ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:837:1: (lv_tgt_4_0= ruleVarDecl )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:837:1: (lv_tgt_4_0= ruleVarDecl )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:838:3: lv_tgt_4_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getTgtVarDeclParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVarDecl_in_ruleSlicedProperty1767);
                    lv_tgt_4_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"tgt",
                            		lv_tgt_4_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:854:3: (otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:854:5: otherlv_5= '[[' ( (lv_expression_6_0= ruleEString ) ) otherlv_7= ']]'
                    {
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSlicedProperty1781); 

                        	newLeafNode(otherlv_5, grammarAccess.getSlicedPropertyAccess().getLeftSquareBracketLeftSquareBracketKeyword_5_0());
                        
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:858:1: ( (lv_expression_6_0= ruleEString ) )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:859:1: (lv_expression_6_0= ruleEString )
                    {
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:859:1: (lv_expression_6_0= ruleEString )
                    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:860:3: lv_expression_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getExpressionEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSlicedProperty1802);
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

                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSlicedProperty1814); 

                        	newLeafNode(otherlv_7, grammarAccess.getSlicedPropertyAccess().getRightSquareBracketRightSquareBracketKeyword_5_2());
                        

                    }
                    break;

            }

            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:880:3: (otherlv_8= 'constraint' otherlv_9= ':' ( (lv_constraints_10_0= ruleConstraint ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:880:5: otherlv_8= 'constraint' otherlv_9= ':' ( (lv_constraints_10_0= ruleConstraint ) )
            	    {
            	    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSlicedProperty1829); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSlicedPropertyAccess().getConstraintKeyword_6_0());
            	        
            	    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSlicedProperty1841); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSlicedPropertyAccess().getColonKeyword_6_1());
            	        
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:888:1: ( (lv_constraints_10_0= ruleConstraint ) )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:889:1: (lv_constraints_10_0= ruleConstraint )
            	    {
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:889:1: (lv_constraints_10_0= ruleConstraint )
            	    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:890:3: lv_constraints_10_0= ruleConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getConstraintsConstraintParserRuleCall_6_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleSlicedProperty1862);
            	    lv_constraints_10_0=ruleConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraints",
            	            		lv_constraints_10_0, 
            	            		"Constraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleSlicedProperty"


    // $ANTLR start "entryRuleOppositeCreation"
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:914:1: entryRuleOppositeCreation returns [EObject current=null] : iv_ruleOppositeCreation= ruleOppositeCreation EOF ;
    public final EObject entryRuleOppositeCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOppositeCreation = null;


        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:915:2: (iv_ruleOppositeCreation= ruleOppositeCreation EOF )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:916:2: iv_ruleOppositeCreation= ruleOppositeCreation EOF
            {
             newCompositeNode(grammarAccess.getOppositeCreationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOppositeCreation_in_entryRuleOppositeCreation1900);
            iv_ruleOppositeCreation=ruleOppositeCreation();

            state._fsp--;

             current =iv_ruleOppositeCreation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOppositeCreation1910); 

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
    // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:923:1: ruleOppositeCreation returns [EObject current=null] : ( () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleOppositeCreation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:926:28: ( ( () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:927:1: ( () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:927:1: ( () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')' )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:927:2: () otherlv_1= 'opposite' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ')'
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:927:2: ()
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:928:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOppositeCreationAccess().getOppositeCreationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOppositeCreation1956); 

                	newLeafNode(otherlv_1, grammarAccess.getOppositeCreationAccess().getOppositeKeyword_1());
                
            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleOppositeCreation1968); 

                	newLeafNode(otherlv_2, grammarAccess.getOppositeCreationAccess().getLeftParenthesisKeyword_2());
                
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:941:1: ( (lv_name_3_0= RULE_ID ) )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:942:1: (lv_name_3_0= RULE_ID )
            {
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:942:1: (lv_name_3_0= RULE_ID )
            // ../fr.inria.diverse.kompren.xtext/src-gen/fr/inria/diverse/kompren/parser/antlr/internal/InternalKompren.g:943:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOppositeCreation1985); 

            			newLeafNode(lv_name_3_0, grammarAccess.getOppositeCreationAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOppositeCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOppositeCreation2002); 

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
        public static final BitSet FOLLOW_15_in_ruleSlicer232 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer244 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicer265 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleSlicer279 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer291 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleQName_in_ruleSlicer314 = new BitSet(new long[]{0x000000000E7C0000L});
        public static final BitSet FOLLOW_18_in_ruleSlicer327 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleQName_in_ruleSlicer350 = new BitSet(new long[]{0x000000000E7C0000L});
        public static final BitSet FOLLOW_19_in_ruleSlicer365 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer377 = new BitSet(new long[]{0x000000000E703030L});
        public static final BitSet FOLLOW_ruleRadius_in_ruleSlicer398 = new BitSet(new long[]{0x000000000E700000L});
        public static final BitSet FOLLOW_20_in_ruleSlicer413 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer425 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleSlicedClass_in_ruleSlicer446 = new BitSet(new long[]{0x000000000E700000L});
        public static final BitSet FOLLOW_21_in_ruleSlicer461 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicer473 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleSlicedProperty_in_ruleSlicer494 = new BitSet(new long[]{0x000000000E600000L});
        public static final BitSet FOLLOW_22_in_ruleSlicer509 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSlicer521 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicer542 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSlicer554 = new BitSet(new long[]{0x000000000E000000L});
        public static final BitSet FOLLOW_25_in_ruleSlicer569 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSlicer581 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicer602 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSlicer614 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleSlicer629 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSlicer641 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicer662 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSlicer674 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSlicer688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_entryRuleQName848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQName859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQName906 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleQName925 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQName947 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstraint1052 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleConstraint1064 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConstraint1085 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleConstraint1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRadius_in_entryRuleRadius1133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRadius1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_ruleRadius1201 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleRadius1214 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleQName_in_ruleRadius1237 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleSlicedClass_in_entryRuleSlicedClass1277 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicedClass1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_ruleSlicedClass1335 = new BitSet(new long[]{0x0000000060800022L});
        public static final BitSet FOLLOW_29_in_ruleSlicedClass1353 = new BitSet(new long[]{0x0000000040800022L});
        public static final BitSet FOLLOW_ruleVarDecl_in_ruleSlicedClass1388 = new BitSet(new long[]{0x0000000040800002L});
        public static final BitSet FOLLOW_23_in_ruleSlicedClass1402 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicedClass1423 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSlicedClass1435 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleSlicedClass1450 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicedClass1462 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleSlicedClass1483 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl1521 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl1531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSlicedProperty_in_entryRuleSlicedProperty1612 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSlicedProperty1622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQName_in_ruleSlicedProperty1670 = new BitSet(new long[]{0x00000000E0800022L});
        public static final BitSet FOLLOW_29_in_ruleSlicedProperty1688 = new BitSet(new long[]{0x00000000C0800022L});
        public static final BitSet FOLLOW_ruleOppositeCreation_in_ruleSlicedProperty1723 = new BitSet(new long[]{0x0000000040800022L});
        public static final BitSet FOLLOW_ruleVarDecl_in_ruleSlicedProperty1745 = new BitSet(new long[]{0x0000000040800022L});
        public static final BitSet FOLLOW_ruleVarDecl_in_ruleSlicedProperty1767 = new BitSet(new long[]{0x0000000040800002L});
        public static final BitSet FOLLOW_23_in_ruleSlicedProperty1781 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSlicedProperty1802 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSlicedProperty1814 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleSlicedProperty1829 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSlicedProperty1841 = new BitSet(new long[]{0x0000000000003030L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleSlicedProperty1862 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleOppositeCreation_in_entryRuleOppositeCreation1900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOppositeCreation1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleOppositeCreation1956 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleOppositeCreation1968 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOppositeCreation1985 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleOppositeCreation2002 = new BitSet(new long[]{0x0000000000000002L});
    }


}