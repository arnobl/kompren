package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmComponentTypeAspect;
import k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmPrimitiveType.class)
@SuppressWarnings("all")
public class JvmPrimitiveTypeAspect extends JvmComponentTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectContext _instance = k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmPrimitiveType,k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties prop = new k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    			     							 k3TransfoFootprint.JvmPrimitiveTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectContext _instance = k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmPrimitiveType,k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties prop = new k3TransfoFootprint.JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    			     							 k3TransfoFootprint.JvmPrimitiveTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
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
  
  public static JvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmPrimitiveType> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmPrimitiveType");
    InputOutput.<String>println(_plus_1);
    JvmPrimitiveTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmPrimitiveType> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmPrimitiveType");
    InputOutput.<String>println(_plus_1);
    JvmPrimitiveTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
