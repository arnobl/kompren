package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmIdentifiableElementAspect;
import k3TransfoFootprint.JvmTypeAspectJvmTypeAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmType.class)
@SuppressWarnings("all")
public abstract class JvmTypeAspect extends JvmIdentifiableElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeAspectJvmTypeAspectContext _instance = k3TransfoFootprint.JvmTypeAspectJvmTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmType,k3TransfoFootprint.JvmTypeAspectJvmTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeAspectJvmTypeAspectProperties prop = new k3TransfoFootprint.JvmTypeAspectJvmTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmVoid){
    			     							 k3TransfoFootprint.JvmVoidAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmVoid)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
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
  public static void _visitToAddRelations(final JvmType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeAspectJvmTypeAspectContext _instance = k3TransfoFootprint.JvmTypeAspectJvmTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmType,k3TransfoFootprint.JvmTypeAspectJvmTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeAspectJvmTypeAspectProperties prop = new k3TransfoFootprint.JvmTypeAspectJvmTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmVoid){
    			     							 k3TransfoFootprint.JvmVoidAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmVoid)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
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
  
  public static JvmTypeAspectJvmTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmType> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmType");
    InputOutput.<String>println(_plus_1);
    JvmTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmType> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmType");
    InputOutput.<String>println(_plus_1);
    JvmTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
