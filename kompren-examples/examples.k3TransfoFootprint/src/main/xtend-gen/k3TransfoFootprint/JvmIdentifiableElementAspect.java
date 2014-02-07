package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmIdentifiableElement.class)
@SuppressWarnings("all")
public abstract class JvmIdentifiableElementAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectContext _instance = k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmIdentifiableElement,k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties prop = new k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties();
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
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    			     							 k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    			     							 k3TransfoFootprint.JvmGenericTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
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
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    			     							 k3TransfoFootprint.XSwitchExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    			     							 k3TransfoFootprint.XVariableDeclarationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    			     							 k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectContext _instance = k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmIdentifiableElement,k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties prop = new k3TransfoFootprint.JvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties();
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
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    			     							 k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    			     							 k3TransfoFootprint.JvmGenericTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
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
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    			     							 k3TransfoFootprint.XSwitchExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    			     							 k3TransfoFootprint.XVariableDeclarationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    			     							 k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static JvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmIdentifiableElement> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmIdentifiableElement");
    InputOutput.<String>println(_plus_1);
    theSlicer.onJvmIdentifiableElementSliced(_self);
    JvmIdentifiableElementAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmIdentifiableElement> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmIdentifiableElement");
    InputOutput.<String>println(_plus_1);
    JvmIdentifiableElementAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
