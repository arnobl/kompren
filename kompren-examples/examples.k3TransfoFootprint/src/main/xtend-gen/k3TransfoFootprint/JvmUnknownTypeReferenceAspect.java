package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmTypeReferenceAspect;
import k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmUnknownTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmUnknownTypeReference.class)
@SuppressWarnings("all")
public class JvmUnknownTypeReferenceAspect extends JvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmUnknownTypeReference,k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmUnknownTypeReference){
    			     							 k3TransfoFootprint.JvmUnknownTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmUnknownTypeReference)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmUnknownTypeReference,k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmUnknownTypeReference){
    			     							 k3TransfoFootprint.JvmUnknownTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmUnknownTypeReference)_self,theSlicer);
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
  
  public static JvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmUnknownTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmUnknownTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmUnknownTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmUnknownTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmUnknownTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmUnknownTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
