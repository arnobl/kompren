package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmTypeReference.class)
@SuppressWarnings("all")
public abstract class JvmTypeReferenceAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeReference,k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    			     							 k3TransfoFootprint.JvmParameterizedTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    			     							 k3TransfoFootprint.JvmGenericArrayTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    			     							 k3TransfoFootprint.JvmWildcardTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnyTypeReference){
    			     							 k3TransfoFootprint.JvmAnyTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnyTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    			     							 k3TransfoFootprint.JvmMultiTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
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
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    			     							 k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeReference,k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmTypeReferenceAspectJvmTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    			     							 k3TransfoFootprint.JvmParameterizedTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    			     							 k3TransfoFootprint.JvmGenericArrayTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    			     							 k3TransfoFootprint.JvmWildcardTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnyTypeReference){
    			     							 k3TransfoFootprint.JvmAnyTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnyTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    			     							 k3TransfoFootprint.JvmMultiTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
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
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    			     							 k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static JvmTypeReferenceAspectJvmTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmTypeReference");
    InputOutput.<String>println(_plus_1);
    theSlicer.onJvmTypeReferenceSliced(_self);
    JvmTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
