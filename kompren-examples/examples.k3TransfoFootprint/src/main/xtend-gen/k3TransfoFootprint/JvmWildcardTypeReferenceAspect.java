package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmTypeReferenceAspect;
import k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmWildcardTypeReference.class)
@SuppressWarnings("all")
public class JvmWildcardTypeReferenceAspect extends JvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmWildcardTypeReference,k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    			     							 k3TransfoFootprint.JvmWildcardTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmWildcardTypeReference,k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    			     							 k3TransfoFootprint.JvmWildcardTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
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
  
  public static JvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmWildcardTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmWildcardTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmWildcardTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmWildcardTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmWildcardTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmWildcardTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
