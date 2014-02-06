package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmExecutableAspect;
import k3TransfoFootprint.JvmOperationAspectJvmOperationAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmOperation.class)
@SuppressWarnings("all")
public class JvmOperationAspect extends JvmExecutableAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmOperationAspectJvmOperationAspectContext _instance = k3TransfoFootprint.JvmOperationAspectJvmOperationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmOperation,k3TransfoFootprint.JvmOperationAspectJvmOperationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmOperationAspectJvmOperationAspectProperties prop = new k3TransfoFootprint.JvmOperationAspectJvmOperationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    			     							 k3TransfoFootprint.JvmOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    			     							 k3TransfoFootprint.JvmExecutableAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    			     							 k3TransfoFootprint.JvmFeatureAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    			     							 k3TransfoFootprint.JvmMemberAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmOperationAspectJvmOperationAspectContext _instance = k3TransfoFootprint.JvmOperationAspectJvmOperationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmOperation,k3TransfoFootprint.JvmOperationAspectJvmOperationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmOperationAspectJvmOperationAspectProperties prop = new k3TransfoFootprint.JvmOperationAspectJvmOperationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    			     							 k3TransfoFootprint.JvmOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    			     							 k3TransfoFootprint.JvmExecutableAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    			     							 k3TransfoFootprint.JvmFeatureAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    			     							 k3TransfoFootprint.JvmMemberAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
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
  
  public static JvmOperationAspectJvmOperationAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmExecutableAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmOperation> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmOperation");
    InputOutput.<String>println(_plus_1);
    JvmOperationAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _returnType = _self.getReturnType();
    if (_returnType!=null) {
      __SlicerAspect__.visitToAddClasses(_returnType, theSlicer);
    }
    JvmAnnotationValue _defaultValue = _self.getDefaultValue();
    if (_defaultValue!=null) {
      __SlicerAspect__.visitToAddClasses(_defaultValue, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmExecutableAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmOperation> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmOperation");
    InputOutput.<String>println(_plus_1);
    JvmOperationAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _returnType = _self.getReturnType();
    boolean _notEquals = (!Objects.equal(_returnType, null));
    if (_notEquals) {
      JvmTypeReference _returnType_1 = _self.getReturnType();
      __SlicerAspect__.visitToAddRelations(_returnType_1, theSlicer);
    }
    JvmAnnotationValue _defaultValue = _self.getDefaultValue();
    boolean _notEquals_1 = (!Objects.equal(_defaultValue, null));
    if (_notEquals_1) {
      JvmAnnotationValue _defaultValue_1 = _self.getDefaultValue();
      __SlicerAspect__.visitToAddRelations(_defaultValue_1, theSlicer);
    }
  }
}
