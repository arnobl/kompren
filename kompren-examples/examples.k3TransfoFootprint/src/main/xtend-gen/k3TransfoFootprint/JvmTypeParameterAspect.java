package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmComponentTypeAspect;
import k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmTypeParameter.class)
@SuppressWarnings("all")
public class JvmTypeParameterAspect extends JvmComponentTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectContext _instance = k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeParameter,k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectProperties prop = new k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
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
  public static void _visitToAddRelations(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectContext _instance = k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeParameter,k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectProperties prop = new k3TransfoFootprint.JvmTypeParameterAspectJvmTypeParameterAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
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
  
  public static JvmTypeParameterAspectJvmTypeParameterAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeParameter> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmTypeParameter");
    InputOutput.<String>println(_plus_1);
    JvmTypeParameterAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeParameterDeclarator _declarator = _self.getDeclarator();
    if (_declarator!=null) {
      __SlicerAspect__.visitToAddClasses(_declarator, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmComponentTypeAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeParameter> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmTypeParameter");
    InputOutput.<String>println(_plus_1);
    JvmTypeParameterAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeParameterDeclarator _declarator = _self.getDeclarator();
    boolean _notEquals = (!Objects.equal(_declarator, null));
    if (_notEquals) {
      JvmTypeParameterDeclarator _declarator_1 = _self.getDeclarator();
      __SlicerAspect__.visitToAddRelations(_declarator_1, theSlicer);
    }
  }
}
