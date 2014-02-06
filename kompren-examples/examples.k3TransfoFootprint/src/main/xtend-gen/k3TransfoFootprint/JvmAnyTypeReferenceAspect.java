package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties;
import k3TransfoFootprint.JvmTypeReferenceAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmAnyTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmAnyTypeReference.class)
@SuppressWarnings("all")
public class JvmAnyTypeReferenceAspect extends JvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnyTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnyTypeReference,k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnyTypeReference){
    			     							 k3TransfoFootprint.JvmAnyTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnyTypeReference)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmAnyTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnyTypeReference,k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnyTypeReference){
    			     							 k3TransfoFootprint.JvmAnyTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnyTypeReference)_self,theSlicer);
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
  
  public static JvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmAnyTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmAnyTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnyTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmAnyTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmAnyTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmType _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmAnyTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmAnyTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnyTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmAnyTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmAnyTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmType _type = _self.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      JvmType _type_1 = _self.getType();
      __SlicerAspect__.visitToAddRelations(_type_1, theSlicer);
    }
  }
}
