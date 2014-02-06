package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectProperties;
import k3TransfoFootprint.JvmComponentTypeAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmArrayType;
import org.eclipse.xtext.common.types.JvmComponentType;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmArrayType.class)
@SuppressWarnings("all")
public class JvmArrayTypeAspect extends JvmComponentTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectContext _instance = k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmArrayType,k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectProperties prop = new k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    			     							 k3TransfoFootprint.JvmArrayTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmComponentType){
    			     							 k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmComponentType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    			     							 k3TransfoFootprint.JvmTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectContext _instance = k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmArrayType,k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectProperties prop = new k3TransfoFootprint.JvmArrayTypeAspectJvmArrayTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    			     							 k3TransfoFootprint.JvmArrayTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmComponentType){
    			     							 k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmComponentType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    			     							 k3TransfoFootprint.JvmTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
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
  
  public static JvmArrayTypeAspectJvmArrayTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmArrayType> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmArrayType");
    InputOutput.<String>println(_plus_1);
    JvmArrayTypeAspect.super__visitToAddClasses(_self, theSlicer);
    JvmComponentType _componentType = _self.getComponentType();
    if (_componentType!=null) {
      __SlicerAspect__.visitToAddClasses(_componentType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmArrayType> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmArrayType");
    InputOutput.<String>println(_plus_1);
    JvmArrayTypeAspect.super__visitToAddRelations(_self, theSlicer);
    JvmComponentType _componentType = _self.getComponentType();
    boolean _notEquals = (!Objects.equal(_componentType, null));
    if (_notEquals) {
      JvmComponentType _componentType_1 = _self.getComponentType();
      __SlicerAspect__.visitToAddRelations(_componentType_1, theSlicer);
    }
  }
}
