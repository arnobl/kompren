package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties;
import org.eclipse.emf.ecore.EObject;

@Aspect(className = Object.class)
@SuppressWarnings("all")
public abstract class __SlicerAspect__ {
  public static void visitToAddClasses(final Object _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitToAddClasses(_self,theSlicer); 
  }
  
  protected static void _visitToAddClasses(final Object _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmVoid){
    			     							 k3TransfoFootprint.JvmVoidAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmVoid)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    			     							 k3TransfoFootprint.JvmPrimitiveTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    			     							 k3TransfoFootprint.JvmArrayTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    			     							 k3TransfoFootprint.JvmTypeParameterAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmComponentType){
    			     							 k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmComponentType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    			     							 k3TransfoFootprint.JvmTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    			     							 k3TransfoFootprint.JvmAnnotationTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    			     							 k3TransfoFootprint.JvmEnumerationTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    			     							 k3TransfoFootprint.JvmGenericTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    			     							 k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    			     							 k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameterDeclarator){
    			     							 k3TransfoFootprint.JvmTypeParameterDeclaratorAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeParameterDeclarator)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmConstraintOwner){
    			     							 k3TransfoFootprint.JvmConstraintOwnerAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmConstraintOwner)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmUpperBound){
    			     							 k3TransfoFootprint.JvmUpperBoundAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmUpperBound)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmLowerBound){
    			     							 k3TransfoFootprint.JvmLowerBoundAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmLowerBound)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeConstraint){
    			     							 k3TransfoFootprint.JvmTypeConstraintAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeConstraint)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    			     							 k3TransfoFootprint.JvmParameterizedTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    			     							 k3TransfoFootprint.JvmGenericArrayTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    			     							 k3TransfoFootprint.JvmWildcardTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnyTypeReference){
    			     							 k3TransfoFootprint.JvmAnyTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnyTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    			     							 k3TransfoFootprint.JvmMultiTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    			     							 k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    			     							 k3TransfoFootprint.JvmFieldAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    			     							 k3TransfoFootprint.JvmConstructorAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    			     							 k3TransfoFootprint.JvmOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    			     							 k3TransfoFootprint.JvmExecutableAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    			     							 k3TransfoFootprint.JvmFeatureAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    			     							 k3TransfoFootprint.JvmMemberAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    			     							 k3TransfoFootprint.JvmFormalParameterAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    			     							 k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationReference){
    			     							 k3TransfoFootprint.JvmAnnotationReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmIntAnnotationValue){
    			     							 k3TransfoFootprint.JvmIntAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmIntAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmBooleanAnnotationValue){
    			     							 k3TransfoFootprint.JvmBooleanAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmBooleanAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmByteAnnotationValue){
    			     							 k3TransfoFootprint.JvmByteAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmByteAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    			     							 k3TransfoFootprint.JvmShortAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmLongAnnotationValue){
    			     							 k3TransfoFootprint.JvmLongAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmLongAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDoubleAnnotationValue){
    			     							 k3TransfoFootprint.JvmDoubleAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmDoubleAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFloatAnnotationValue){
    			     							 k3TransfoFootprint.JvmFloatAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmFloatAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCharAnnotationValue){
    			     							 k3TransfoFootprint.JvmCharAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmCharAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmStringAnnotationValue){
    			     							 k3TransfoFootprint.JvmStringAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmStringAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    			     							 k3TransfoFootprint.JvmTypeAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumAnnotationValue){
    			     							 k3TransfoFootprint.JvmEnumAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDelegateTypeReference){
    			     							 k3TransfoFootprint.JvmDelegateTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmDelegateTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmSpecializedTypeReference){
    			     							 k3TransfoFootprint.JvmSpecializedTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmSpecializedTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmSynonymTypeReference){
    			     							 k3TransfoFootprint.JvmSynonymTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmSynonymTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmUnknownTypeReference){
    			     							 k3TransfoFootprint.JvmUnknownTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmUnknownTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    			     							 k3TransfoFootprint.JvmCompoundTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCustomAnnotationValue){
    			     							 k3TransfoFootprint.JvmCustomAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmCustomAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    			     							 k3TransfoFootprint.XIfExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBlockExpression){
    			     							 k3TransfoFootprint.XBlockExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XBlockExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    			     							 k3TransfoFootprint.XMemberFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    			     							 k3TransfoFootprint.XFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    			     							 k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBooleanLiteral){
    			     							 k3TransfoFootprint.XBooleanLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XBooleanLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    			     							 k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    			     							 k3TransfoFootprint.XSwitchExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCasePart){
    			     							 k3TransfoFootprint.XCasePartAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCasePart)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    			     							 k3TransfoFootprint.XVariableDeclarationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    			     							 k3TransfoFootprint.XConstructorCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XNullLiteral){
    			     							 k3TransfoFootprint.XNullLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XNullLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XNumberLiteral){
    			     							 k3TransfoFootprint.XNumberLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XNumberLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    			     							 k3TransfoFootprint.XStringLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XListLiteral){
    			     							 k3TransfoFootprint.XListLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XListLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
    			     							 k3TransfoFootprint.XSetLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XSetLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCollectionLiteral){
    			     							 k3TransfoFootprint.XCollectionLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCollectionLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    			     							 k3TransfoFootprint.XClosureAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    			     							 k3TransfoFootprint.XCastedExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    			     							 k3TransfoFootprint.XBinaryOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    			     							 k3TransfoFootprint.XUnaryOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    			     							 k3TransfoFootprint.XForLoopExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    			     							 k3TransfoFootprint.XDoWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    			     							 k3TransfoFootprint.XWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    			     							 k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XInstanceOfExpression){
    			     							 k3TransfoFootprint.XInstanceOfExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XInstanceOfExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XThrowExpression){
    			     							 k3TransfoFootprint.XThrowExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XThrowExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XTryCatchFinallyExpression){
    			     							 k3TransfoFootprint.XTryCatchFinallyExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XTryCatchFinallyExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCatchClause){
    			     							 k3TransfoFootprint.XCatchClauseAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCatchClause)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    			     							 k3TransfoFootprint.XAssignmentAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XReturnExpression){
    			     							 k3TransfoFootprint.XReturnExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XReturnExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XTypeLiteral){
    			     							 k3TransfoFootprint.XTypeLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XTypeLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static void visitToAddRelations(final Object _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitToAddRelations(_self,theSlicer); 
  }
  
  protected static void _visitToAddRelations(final Object _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmVoid){
    			     							 k3TransfoFootprint.JvmVoidAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmVoid)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    			     							 k3TransfoFootprint.JvmPrimitiveTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    			     							 k3TransfoFootprint.JvmArrayTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    			     							 k3TransfoFootprint.JvmTypeParameterAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmComponentType){
    			     							 k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmComponentType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    			     							 k3TransfoFootprint.JvmTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    			     							 k3TransfoFootprint.JvmAnnotationTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    			     							 k3TransfoFootprint.JvmEnumerationTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    			     							 k3TransfoFootprint.JvmGenericTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    			     							 k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    			     							 k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameterDeclarator){
    			     							 k3TransfoFootprint.JvmTypeParameterDeclaratorAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeParameterDeclarator)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmConstraintOwner){
    			     							 k3TransfoFootprint.JvmConstraintOwnerAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmConstraintOwner)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmUpperBound){
    			     							 k3TransfoFootprint.JvmUpperBoundAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmUpperBound)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmLowerBound){
    			     							 k3TransfoFootprint.JvmLowerBoundAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmLowerBound)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeConstraint){
    			     							 k3TransfoFootprint.JvmTypeConstraintAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeConstraint)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    			     							 k3TransfoFootprint.JvmParameterizedTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    			     							 k3TransfoFootprint.JvmGenericArrayTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    			     							 k3TransfoFootprint.JvmWildcardTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnyTypeReference){
    			     							 k3TransfoFootprint.JvmAnyTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnyTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    			     							 k3TransfoFootprint.JvmMultiTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    			     							 k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    			     							 k3TransfoFootprint.JvmFieldAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    			     							 k3TransfoFootprint.JvmConstructorAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    			     							 k3TransfoFootprint.JvmOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    			     							 k3TransfoFootprint.JvmExecutableAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    			     							 k3TransfoFootprint.JvmFeatureAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    			     							 k3TransfoFootprint.JvmMemberAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    			     							 k3TransfoFootprint.JvmFormalParameterAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    			     							 k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationReference){
    			     							 k3TransfoFootprint.JvmAnnotationReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmIntAnnotationValue){
    			     							 k3TransfoFootprint.JvmIntAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmIntAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmBooleanAnnotationValue){
    			     							 k3TransfoFootprint.JvmBooleanAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmBooleanAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmByteAnnotationValue){
    			     							 k3TransfoFootprint.JvmByteAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmByteAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    			     							 k3TransfoFootprint.JvmShortAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmLongAnnotationValue){
    			     							 k3TransfoFootprint.JvmLongAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmLongAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDoubleAnnotationValue){
    			     							 k3TransfoFootprint.JvmDoubleAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmDoubleAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFloatAnnotationValue){
    			     							 k3TransfoFootprint.JvmFloatAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmFloatAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCharAnnotationValue){
    			     							 k3TransfoFootprint.JvmCharAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmCharAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmStringAnnotationValue){
    			     							 k3TransfoFootprint.JvmStringAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmStringAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    			     							 k3TransfoFootprint.JvmTypeAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumAnnotationValue){
    			     							 k3TransfoFootprint.JvmEnumAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDelegateTypeReference){
    			     							 k3TransfoFootprint.JvmDelegateTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmDelegateTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmSpecializedTypeReference){
    			     							 k3TransfoFootprint.JvmSpecializedTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmSpecializedTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmSynonymTypeReference){
    			     							 k3TransfoFootprint.JvmSynonymTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmSynonymTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmUnknownTypeReference){
    			     							 k3TransfoFootprint.JvmUnknownTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmUnknownTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    			     							 k3TransfoFootprint.JvmCompoundTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCustomAnnotationValue){
    			     							 k3TransfoFootprint.JvmCustomAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmCustomAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    			     							 k3TransfoFootprint.XIfExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBlockExpression){
    			     							 k3TransfoFootprint.XBlockExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XBlockExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    			     							 k3TransfoFootprint.XMemberFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    			     							 k3TransfoFootprint.XFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    			     							 k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBooleanLiteral){
    			     							 k3TransfoFootprint.XBooleanLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XBooleanLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    			     							 k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    			     							 k3TransfoFootprint.XSwitchExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCasePart){
    			     							 k3TransfoFootprint.XCasePartAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCasePart)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    			     							 k3TransfoFootprint.XVariableDeclarationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    			     							 k3TransfoFootprint.XConstructorCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XNullLiteral){
    			     							 k3TransfoFootprint.XNullLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XNullLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XNumberLiteral){
    			     							 k3TransfoFootprint.XNumberLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XNumberLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    			     							 k3TransfoFootprint.XStringLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XListLiteral){
    			     							 k3TransfoFootprint.XListLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XListLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
    			     							 k3TransfoFootprint.XSetLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XSetLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCollectionLiteral){
    			     							 k3TransfoFootprint.XCollectionLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCollectionLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    			     							 k3TransfoFootprint.XClosureAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    			     							 k3TransfoFootprint.XCastedExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    			     							 k3TransfoFootprint.XBinaryOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    			     							 k3TransfoFootprint.XUnaryOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    			     							 k3TransfoFootprint.XForLoopExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    			     							 k3TransfoFootprint.XDoWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    			     							 k3TransfoFootprint.XWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    			     							 k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XInstanceOfExpression){
    			     							 k3TransfoFootprint.XInstanceOfExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XInstanceOfExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XThrowExpression){
    			     							 k3TransfoFootprint.XThrowExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XThrowExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XTryCatchFinallyExpression){
    			     							 k3TransfoFootprint.XTryCatchFinallyExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XTryCatchFinallyExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCatchClause){
    			     							 k3TransfoFootprint.XCatchClauseAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCatchClause)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    			     							 k3TransfoFootprint.XAssignmentAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XReturnExpression){
    			     							 k3TransfoFootprint.XReturnExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XReturnExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XTypeLiteral){
    			     							 k3TransfoFootprint.XTypeLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XTypeLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static void feedOpposites(final Object _self) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privfeedOpposites(_self); 
  }
  
  public static __SlicerAspect__ObjectAspectProperties _self_;
  
  public static boolean visitedForRelations(final Object _self) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privvisitedForRelations(_self); 
  }
  
  public static void visitedForRelations(final Object _self, final boolean visitedForRelations) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitedForRelations(_self,visitedForRelations); 
  }
  
  public static boolean sliced(final Object _self) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privsliced(_self); 
  }
  
  public static void sliced(final Object _self, final boolean sliced) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privsliced(_self,sliced); 
  }
  
  public static EObject clonedElt(final Object _self) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privclonedElt(_self); 
  }
  
  public static void clonedElt(final Object _self, final EObject clonedElt) {
    k3TransfoFootprint.__SlicerAspect__ObjectAspectContext _instance = k3TransfoFootprint.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties prop = new k3TransfoFootprint.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privclonedElt(_self,clonedElt); 
  }
  
  protected static void privvisitToAddClasses(final Object _self, final K3TransfoFootprint theSlicer) {
    boolean _sliced = __SlicerAspect__.sliced(_self);
    boolean _not = (!_sliced);
    if (_not) {
      __SlicerAspect__.sliced(_self, true);
      __SlicerAspect__._visitToAddClasses(_self, theSlicer);
    }
  }
  
  protected static void priv_visitToAddClasses(final Object _self, final K3TransfoFootprint theSlicer) {
  }
  
  protected static void privvisitToAddRelations(final Object _self, final K3TransfoFootprint theSlicer) {
    boolean _visitedForRelations = __SlicerAspect__.visitedForRelations(_self);
    boolean _not = (!_visitedForRelations);
    if (_not) {
      __SlicerAspect__.visitedForRelations(_self, true);
      __SlicerAspect__._visitToAddRelations(_self, theSlicer);
    }
  }
  
  protected static void priv_visitToAddRelations(final Object _self, final K3TransfoFootprint theSlicer) {
  }
  
  protected static void privfeedOpposites(final Object _self) {
  }
  
  protected static boolean privvisitedForRelations(final Object _self) {
     return k3TransfoFootprint.__SlicerAspect__._self_.visitedForRelations; 
  }
  
  protected static void privvisitedForRelations(final Object _self, final boolean visitedForRelations) {
    k3TransfoFootprint.__SlicerAspect__._self_.visitedForRelations = visitedForRelations; 
  }
  
  protected static boolean privsliced(final Object _self) {
     return k3TransfoFootprint.__SlicerAspect__._self_.sliced; 
  }
  
  protected static void privsliced(final Object _self, final boolean sliced) {
    k3TransfoFootprint.__SlicerAspect__._self_.sliced = sliced; 
  }
  
  protected static EObject privclonedElt(final Object _self) {
     return k3TransfoFootprint.__SlicerAspect__._self_.clonedElt; 
  }
  
  protected static void privclonedElt(final Object _self, final EObject clonedElt) {
    k3TransfoFootprint.__SlicerAspect__._self_.clonedElt = clonedElt; 
  }
}
