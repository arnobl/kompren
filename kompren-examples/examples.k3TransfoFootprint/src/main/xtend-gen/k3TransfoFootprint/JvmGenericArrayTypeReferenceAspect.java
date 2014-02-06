package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties;
import k3TransfoFootprint.JvmTypeReferenceAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmGenericArrayTypeReference.class)
@SuppressWarnings("all")
public class JvmGenericArrayTypeReferenceAspect extends JvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmGenericArrayTypeReference,k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    			     							 k3TransfoFootprint.JvmGenericArrayTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmGenericArrayTypeReference,k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    			     							 k3TransfoFootprint.JvmGenericArrayTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
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
  
  public static JvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmGenericArrayTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmGenericArrayTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmGenericArrayTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _componentType = _self.getComponentType();
    if (_componentType!=null) {
      __SlicerAspect__.visitToAddClasses(_componentType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmGenericArrayTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmGenericArrayTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmGenericArrayTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _componentType = _self.getComponentType();
    boolean _notEquals = (!Objects.equal(_componentType, null));
    if (_notEquals) {
      JvmTypeReference _componentType_1 = _self.getComponentType();
      __SlicerAspect__.visitToAddRelations(_componentType_1, theSlicer);
    }
  }
}
