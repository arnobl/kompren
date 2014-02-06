package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmCompoundTypeReferenceAspect;
import k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmMultiTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmMultiTypeReference.class)
@SuppressWarnings("all")
public class JvmMultiTypeReferenceAspect extends JvmCompoundTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmMultiTypeReference,k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    			     							 k3TransfoFootprint.JvmMultiTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmMultiTypeReference,k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    			     							 k3TransfoFootprint.JvmMultiTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
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
  
  public static JvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmCompoundTypeReferenceAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmMultiTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmMultiTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmMultiTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmCompoundTypeReferenceAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmMultiTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmMultiTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmMultiTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
