/*
* generated by Xtext
*/
grammar InternalKompren;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package fr.inria.diverse.kompren.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSlicer
entryRuleSlicer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSlicerRule()); }
	 iv_ruleSlicer=ruleSlicer 
	 { $current=$iv_ruleSlicer.current; } 
	 EOF 
;

// Rule Slicer
ruleSlicer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='slicer' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSlicerAccess().getSlicerKeyword_0());
    }
(
(
		lv_active_1_0=	'active' 
    {
        newLeafNode(lv_active_1_0, grammarAccess.getSlicerAccess().getActiveActiveKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSlicerRule());
	        }
       		setWithLastConsumed($current, "active", true, "active");
	    }

)
)?(
(
		lv_strict_2_0=	'strict' 
    {
        newLeafNode(lv_strict_2_0, grammarAccess.getSlicerAccess().getStrictStrictKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSlicerRule());
	        }
       		setWithLastConsumed($current, "strict", true, "strict");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getNameQNameParserRuleCall_3_0()); 
	    }
		lv_name_3_0=ruleQName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicerRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"QName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSlicerAccess().getLeftCurlyBracketKeyword_4());
    }
	otherlv_5='domain' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSlicerAccess().getDomainKeyword_5());
    }
	otherlv_6=':' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSlicerAccess().getColonKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getUriMetamodelEStringParserRuleCall_7_0()); 
	    }
		lv_uriMetamodel_7_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicerRule());
	        }
       		set(
       			$current, 
       			"uriMetamodel",
        		lv_uriMetamodel_7_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8='input' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSlicerAccess().getInputKeyword_8());
    }
	otherlv_9=':' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getSlicerAccess().getColonKeyword_9());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSlicerRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_10_0()); 
	    }
		ruleQName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_11=',' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getSlicerAccess().getCommaKeyword_11_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSlicerRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getInputClassesEClassCrossReference_11_1_0()); 
	    }
		ruleQName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_13='radius' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getSlicerAccess().getRadiusKeyword_12_0());
    }
	otherlv_14=':' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getSlicerAccess().getColonKeyword_12_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getRadiusRadiusParserRuleCall_12_2_0()); 
	    }
		lv_radius_15_0=ruleRadius		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicerRule());
	        }
       		set(
       			$current, 
       			"radius",
        		lv_radius_15_0, 
        		"Radius");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_16='constraint' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getSlicerAccess().getConstraintKeyword_13_0());
    }
	otherlv_17=':' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getSlicerAccess().getColonKeyword_13_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getConstraintsConstraintParserRuleCall_13_2_0()); 
	    }
		lv_constraints_18_0=ruleConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicerRule());
	        }
       		add(
       			$current, 
       			"constraints",
        		lv_constraints_18_0, 
        		"Constraint");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_19='slicedClass' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getSlicerAccess().getSlicedClassKeyword_14_0());
    }
	otherlv_20=':' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getSlicerAccess().getColonKeyword_14_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getSlicedElementsSlicedClassParserRuleCall_14_2_0()); 
	    }
		lv_slicedElements_21_0=ruleSlicedClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicerRule());
	        }
       		add(
       			$current, 
       			"slicedElements",
        		lv_slicedElements_21_0, 
        		"SlicedClass");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_22='slicedProperty' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getSlicerAccess().getSlicedPropertyKeyword_15_0());
    }
	otherlv_23=':' 
    {
    	newLeafNode(otherlv_23, grammarAccess.getSlicerAccess().getColonKeyword_15_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getSlicedElementsSlicedPropertyParserRuleCall_15_2_0()); 
	    }
		lv_slicedElements_24_0=ruleSlicedProperty		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicerRule());
	        }
       		add(
       			$current, 
       			"slicedElements",
        		lv_slicedElements_24_0, 
        		"SlicedProperty");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_25='onStart' 
    {
    	newLeafNode(otherlv_25, grammarAccess.getSlicerAccess().getOnStartKeyword_16_0());
    }
	otherlv_26='[[' 
    {
    	newLeafNode(otherlv_26, grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_16_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getOnStartEStringParserRuleCall_16_2_0()); 
	    }
		lv_onStart_27_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicerRule());
	        }
       		set(
       			$current, 
       			"onStart",
        		lv_onStart_27_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_28=']]' 
    {
    	newLeafNode(otherlv_28, grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_16_3());
    }
)?(	otherlv_29='onEnd' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getSlicerAccess().getOnEndKeyword_17_0());
    }
	otherlv_30='[[' 
    {
    	newLeafNode(otherlv_30, grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_17_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getOnEndEStringParserRuleCall_17_2_0()); 
	    }
		lv_onEnd_31_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicerRule());
	        }
       		set(
       			$current, 
       			"onEnd",
        		lv_onEnd_31_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_32=']]' 
    {
    	newLeafNode(otherlv_32, grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_17_3());
    }
)?(	otherlv_33='helper' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getSlicerAccess().getHelperKeyword_18_0());
    }
	otherlv_34='[[' 
    {
    	newLeafNode(otherlv_34, grammarAccess.getSlicerAccess().getLeftSquareBracketLeftSquareBracketKeyword_18_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicerAccess().getHelperEStringParserRuleCall_18_2_0()); 
	    }
		lv_helper_35_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicerRule());
	        }
       		set(
       			$current, 
       			"helper",
        		lv_helper_35_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_36=']]' 
    {
    	newLeafNode(otherlv_36, grammarAccess.getSlicerAccess().getRightSquareBracketRightSquareBracketKeyword_18_3());
    }
)?	otherlv_37='}' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getSlicerAccess().getRightCurlyBracketKeyword_19());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleQName
entryRuleQName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQNameRule()); } 
	 iv_ruleQName=ruleQName 
	 { $current=$iv_ruleQName.current.getText(); }  
	 EOF 
;

// Rule QName
ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQNameAccess().getEStringParserRuleCall_0()); 
    }
    this_EString_0=ruleEString    {
		$current.merge(this_EString_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getQNameAccess().getEStringParserRuleCall_1_1()); 
    }
    this_EString_2=ruleEString    {
		$current.merge(this_EString_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;







// Entry rule entryRuleConstraint
entryRuleConstraint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstraintRule()); }
	 iv_ruleConstraint=ruleConstraint 
	 { $current=$iv_ruleConstraint.current; } 
	 EOF 
;

// Rule Constraint
ruleConstraint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getConstraintAccess().getNameEStringParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstraintRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='[[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstraintAccess().getExpressionEStringParserRuleCall_2_0()); 
	    }
		lv_expression_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstraintRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=']]' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getRightSquareBracketRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleRadius
entryRuleRadius returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRadiusRule()); }
	 iv_ruleRadius=ruleRadius 
	 { $current=$iv_ruleRadius.current; } 
	 EOF 
;

// Rule Radius
ruleRadius returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRadiusAccess().getRadiusAction_0(),
            $current);
    }
)((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRadiusRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_0_0()); 
	    }
		ruleQName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRadiusAccess().getCommaKeyword_1_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRadiusRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRadiusAccess().getFocusedClassesSlicedClassCrossReference_1_1_1_0()); 
	    }
		ruleQName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
;





// Entry rule entryRuleSlicedClass
entryRuleSlicedClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSlicedClassRule()); }
	 iv_ruleSlicedClass=ruleSlicedClass 
	 { $current=$iv_ruleSlicedClass.current; } 
	 EOF 
;

// Rule SlicedClass
ruleSlicedClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSlicedClassRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getSlicedClassAccess().getDomainEClassCrossReference_0_0()); 
	    }
		ruleQName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_isOption_1_0=	'option' 
    {
        newLeafNode(lv_isOption_1_0, grammarAccess.getSlicedClassAccess().getIsOptionOptionKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSlicedClassRule());
	        }
       		setWithLastConsumed($current, "isOption", true, "option");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicedClassAccess().getCtxVarDeclParserRuleCall_2_0()); 
	    }
		lv_ctx_2_0=ruleVarDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicedClassRule());
	        }
       		set(
       			$current, 
       			"ctx",
        		lv_ctx_2_0, 
        		"VarDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_3='[[' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSlicedClassAccess().getLeftSquareBracketLeftSquareBracketKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicedClassAccess().getExpressionEStringParserRuleCall_3_1_0()); 
	    }
		lv_expression_4_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicedClassRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_4_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=']]' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSlicedClassAccess().getRightSquareBracketRightSquareBracketKeyword_3_2());
    }
)?)
;





// Entry rule entryRuleVarDecl
entryRuleVarDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarDeclRule()); }
	 iv_ruleVarDecl=ruleVarDecl 
	 { $current=$iv_ruleVarDecl.current; } 
	 EOF 
;

// Rule VarDecl
ruleVarDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getVarDeclAccess().getVarNameEStringParserRuleCall_0()); 
	    }
		lv_varName_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVarDeclRule());
	        }
       		set(
       			$current, 
       			"varName",
        		lv_varName_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleSlicedProperty
entryRuleSlicedProperty returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSlicedPropertyRule()); }
	 iv_ruleSlicedProperty=ruleSlicedProperty 
	 { $current=$iv_ruleSlicedProperty.current; } 
	 EOF 
;

// Rule SlicedProperty
ruleSlicedProperty returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSlicedPropertyRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getDomainEStructuralFeatureCrossReference_0_0()); 
	    }
		ruleQName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_isOption_1_0=	'option' 
    {
        newLeafNode(lv_isOption_1_0, grammarAccess.getSlicedPropertyAccess().getIsOptionOptionKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSlicedPropertyRule());
	        }
       		setWithLastConsumed($current, "isOption", true, "option");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getSrcVarDeclParserRuleCall_2_0()); 
	    }
		lv_src_2_0=ruleVarDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
	        }
       		set(
       			$current, 
       			"src",
        		lv_src_2_0, 
        		"VarDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getTgtVarDeclParserRuleCall_3_0()); 
	    }
		lv_tgt_3_0=ruleVarDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
	        }
       		set(
       			$current, 
       			"tgt",
        		lv_tgt_3_0, 
        		"VarDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getOppositeOppositeCreationParserRuleCall_4_0()); 
	    }
		lv_opposite_4_0=ruleOppositeCreation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
	        }
       		set(
       			$current, 
       			"opposite",
        		lv_opposite_4_0, 
        		"OppositeCreation");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_5='[[' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSlicedPropertyAccess().getLeftSquareBracketLeftSquareBracketKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSlicedPropertyAccess().getExpressionEStringParserRuleCall_5_1_0()); 
	    }
		lv_expression_6_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSlicedPropertyRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_6_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=']]' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getSlicedPropertyAccess().getRightSquareBracketRightSquareBracketKeyword_5_2());
    }
)?)
;





// Entry rule entryRuleOppositeCreation
entryRuleOppositeCreation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOppositeCreationRule()); }
	 iv_ruleOppositeCreation=ruleOppositeCreation 
	 { $current=$iv_ruleOppositeCreation.current; } 
	 EOF 
;

// Rule OppositeCreation
ruleOppositeCreation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getOppositeCreationAccess().getOppositeCreationAction_0(),
            $current);
    }
)	otherlv_1='opposite' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOppositeCreationAccess().getOppositeKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOppositeCreationAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOppositeCreationAccess().getNameEStringParserRuleCall_3_0()); 
	    }
		lv_name_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOppositeCreationRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOppositeCreationAccess().getRightParenthesisKeyword_4());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

