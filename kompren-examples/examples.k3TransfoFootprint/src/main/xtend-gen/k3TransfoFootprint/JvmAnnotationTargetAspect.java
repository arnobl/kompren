package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties;
import k3TransfoFootprint.JvmIdentifiableElementAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmAnnotationTarget.class)
@SuppressWarnings("all")
public abstract class JvmAnnotationTargetAspect extends JvmIdentifiableElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectContext _instance = k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationTarget,k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties prop = new k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
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
  public static void _visitToAddRelations(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectContext _instance = k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationTarget,k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties prop = new k3TransfoFootprint.JvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
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
  
  public static JvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationTarget> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationTarget");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationTargetAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmAnnotationReference> _annotations = _self.getAnnotations();
    final Procedure1<JvmAnnotationReference> _function = new Procedure1<JvmAnnotationReference>() {
      public void apply(final JvmAnnotationReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmAnnotationReference>forEach(_annotations, _function);
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationTarget> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationTarget");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationTargetAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmAnnotationReference> _annotations = _self.getAnnotations();
    final Procedure1<JvmAnnotationReference> _function = new Procedure1<JvmAnnotationReference>() {
      public void apply(final JvmAnnotationReference _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmAnnotationReference>forEach(_annotations, _function);
  }
}
