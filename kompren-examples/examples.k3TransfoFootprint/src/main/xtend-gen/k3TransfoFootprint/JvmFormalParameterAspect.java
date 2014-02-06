package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationTargetAspect;
import k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmFormalParameter.class)
@SuppressWarnings("all")
public class JvmFormalParameterAspect extends JvmAnnotationTargetAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectContext _instance = k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmFormalParameter,k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectProperties prop = new k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    			     							 k3TransfoFootprint.JvmFormalParameterAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    			     							 k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectContext _instance = k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmFormalParameter,k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectProperties prop = new k3TransfoFootprint.JvmFormalParameterAspectJvmFormalParameterAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    			     							 k3TransfoFootprint.JvmFormalParameterAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    			     							 k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
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
  
  public static JvmFormalParameterAspectJvmFormalParameterAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmFormalParameter> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmFormalParameter");
    InputOutput.<String>println(_plus_1);
    JvmFormalParameterAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _parameterType = _self.getParameterType();
    if (_parameterType!=null) {
      __SlicerAspect__.visitToAddClasses(_parameterType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmFormalParameter> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmFormalParameter");
    InputOutput.<String>println(_plus_1);
    JvmFormalParameterAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _parameterType = _self.getParameterType();
    boolean _notEquals = (!Objects.equal(_parameterType, null));
    if (_notEquals) {
      JvmTypeReference _parameterType_1 = _self.getParameterType();
      __SlicerAspect__.visitToAddRelations(_parameterType_1, theSlicer);
    }
  }
}
