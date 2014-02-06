package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties;
import k3TransfoFootprint.JvmTypeReferenceAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmSpecializedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmSpecializedTypeReference.class)
@SuppressWarnings("all")
public abstract class JvmSpecializedTypeReferenceAspect extends JvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmSpecializedTypeReference,k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmSpecializedTypeReference){
    			     							 k3TransfoFootprint.JvmSpecializedTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmSpecializedTypeReference)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmSpecializedTypeReference,k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmSpecializedTypeReference){
    			     							 k3TransfoFootprint.JvmSpecializedTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmSpecializedTypeReference)_self,theSlicer);
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
  
  public static JvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmSpecializedTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmSpecializedTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmSpecializedTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _equivalent = _self.getEquivalent();
    if (_equivalent!=null) {
      __SlicerAspect__.visitToAddClasses(_equivalent, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmSpecializedTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmSpecializedTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmSpecializedTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _equivalent = _self.getEquivalent();
    boolean _notEquals = (!Objects.equal(_equivalent, null));
    if (_notEquals) {
      JvmTypeReference _equivalent_1 = _self.getEquivalent();
      __SlicerAspect__.visitToAddRelations(_equivalent_1, theSlicer);
    }
  }
}
