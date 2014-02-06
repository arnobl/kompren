package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectProperties;
import k3TransfoFootprint.JvmTypeAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmArrayType;
import org.eclipse.xtext.common.types.JvmComponentType;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmComponentType.class)
@SuppressWarnings("all")
public abstract class JvmComponentTypeAspect extends JvmTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectContext _instance = k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmComponentType,k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectProperties prop = new k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    			     							 k3TransfoFootprint.JvmPrimitiveTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    			     							 k3TransfoFootprint.JvmArrayTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    			     							 k3TransfoFootprint.JvmTypeParameterAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectContext _instance = k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmComponentType,k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectProperties prop = new k3TransfoFootprint.JvmComponentTypeAspectJvmComponentTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    			     							 k3TransfoFootprint.JvmPrimitiveTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    			     							 k3TransfoFootprint.JvmArrayTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    			     							 k3TransfoFootprint.JvmTypeParameterAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
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
  
  public static JvmComponentTypeAspectJvmComponentTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmComponentType> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmComponentType");
    InputOutput.<String>println(_plus_1);
    JvmComponentTypeAspect.super__visitToAddClasses(_self, theSlicer);
    JvmArrayType _arrayType = _self.getArrayType();
    if (_arrayType!=null) {
      __SlicerAspect__.visitToAddClasses(_arrayType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmComponentType> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmComponentType");
    InputOutput.<String>println(_plus_1);
    JvmComponentTypeAspect.super__visitToAddRelations(_self, theSlicer);
    JvmArrayType _arrayType = _self.getArrayType();
    boolean _notEquals = (!Objects.equal(_arrayType, null));
    if (_notEquals) {
      JvmArrayType _arrayType_1 = _self.getArrayType();
      __SlicerAspect__.visitToAddRelations(_arrayType_1, theSlicer);
    }
  }
}
