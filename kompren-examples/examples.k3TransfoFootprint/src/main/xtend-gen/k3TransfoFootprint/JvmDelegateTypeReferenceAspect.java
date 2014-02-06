package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties;
import k3TransfoFootprint.JvmTypeReferenceAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmDelegateTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmDelegateTypeReference.class)
@SuppressWarnings("all")
public class JvmDelegateTypeReferenceAspect extends JvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmDelegateTypeReference,k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmDelegateTypeReference){
    			     							 k3TransfoFootprint.JvmDelegateTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmDelegateTypeReference)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmDelegateTypeReference,k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmDelegateTypeReference){
    			     							 k3TransfoFootprint.JvmDelegateTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmDelegateTypeReference)_self,theSlicer);
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
  
  public static JvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmDelegateTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmDelegateTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmDelegateTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _delegate = _self.getDelegate();
    if (_delegate!=null) {
      __SlicerAspect__.visitToAddClasses(_delegate, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmDelegateTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmDelegateTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmDelegateTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _delegate = _self.getDelegate();
    boolean _notEquals = (!Objects.equal(_delegate, null));
    if (_notEquals) {
      JvmTypeReference _delegate_1 = _self.getDelegate();
      __SlicerAspect__.visitToAddRelations(_delegate_1, theSlicer);
    }
  }
}
