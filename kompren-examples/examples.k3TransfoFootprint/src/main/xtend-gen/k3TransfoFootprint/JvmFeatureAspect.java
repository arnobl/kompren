package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectProperties;
import k3TransfoFootprint.JvmMemberAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmFeature.class)
@SuppressWarnings("all")
public abstract class JvmFeatureAspect extends JvmMemberAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectContext _instance = k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmFeature,k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectProperties prop = new k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectContext _instance = k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmFeature,k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectProperties prop = new k3TransfoFootprint.JvmFeatureAspectJvmFeatureAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
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
  
  public static JvmFeatureAspectJvmFeatureAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmMemberAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmFeature> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmFeature");
    InputOutput.<String>println(_plus_1);
    JvmFeatureAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmMemberAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmFeature> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmFeature");
    InputOutput.<String>println(_plus_1);
    JvmFeatureAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
