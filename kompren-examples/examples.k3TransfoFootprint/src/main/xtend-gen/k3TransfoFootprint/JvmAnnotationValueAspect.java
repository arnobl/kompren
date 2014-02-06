package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmAnnotationValue.class)
@SuppressWarnings("all")
public abstract class JvmAnnotationValueAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationValue,k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmIntAnnotationValue){
    			     							 k3TransfoFootprint.JvmIntAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmIntAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmBooleanAnnotationValue){
    			     							 k3TransfoFootprint.JvmBooleanAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmBooleanAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmByteAnnotationValue){
    			     							 k3TransfoFootprint.JvmByteAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmByteAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    			     							 k3TransfoFootprint.JvmShortAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmLongAnnotationValue){
    			     							 k3TransfoFootprint.JvmLongAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmLongAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDoubleAnnotationValue){
    			     							 k3TransfoFootprint.JvmDoubleAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmDoubleAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFloatAnnotationValue){
    			     							 k3TransfoFootprint.JvmFloatAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmFloatAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCharAnnotationValue){
    			     							 k3TransfoFootprint.JvmCharAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmCharAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmStringAnnotationValue){
    			     							 k3TransfoFootprint.JvmStringAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmStringAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    			     							 k3TransfoFootprint.JvmTypeAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumAnnotationValue){
    			     							 k3TransfoFootprint.JvmEnumAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCustomAnnotationValue){
    			     							 k3TransfoFootprint.JvmCustomAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmCustomAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationValue,k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmAnnotationValueAspectJvmAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmIntAnnotationValue){
    			     							 k3TransfoFootprint.JvmIntAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmIntAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmBooleanAnnotationValue){
    			     							 k3TransfoFootprint.JvmBooleanAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmBooleanAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmByteAnnotationValue){
    			     							 k3TransfoFootprint.JvmByteAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmByteAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    			     							 k3TransfoFootprint.JvmShortAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmLongAnnotationValue){
    			     							 k3TransfoFootprint.JvmLongAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmLongAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDoubleAnnotationValue){
    			     							 k3TransfoFootprint.JvmDoubleAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmDoubleAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFloatAnnotationValue){
    			     							 k3TransfoFootprint.JvmFloatAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmFloatAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCharAnnotationValue){
    			     							 k3TransfoFootprint.JvmCharAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmCharAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmStringAnnotationValue){
    			     							 k3TransfoFootprint.JvmStringAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmStringAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    			     							 k3TransfoFootprint.JvmTypeAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumAnnotationValue){
    			     							 k3TransfoFootprint.JvmEnumAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCustomAnnotationValue){
    			     							 k3TransfoFootprint.JvmCustomAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmCustomAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static JvmAnnotationValueAspectJvmAnnotationValueAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationValue> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
    JvmOperation _operation = _self.getOperation();
    if (_operation!=null) {
      __SlicerAspect__.visitToAddClasses(_operation, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationValue> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
    JvmOperation _operation = _self.getOperation();
    boolean _notEquals = (!Objects.equal(_operation, null));
    if (_notEquals) {
      JvmOperation _operation_1 = _self.getOperation();
      __SlicerAspect__.visitToAddRelations(_operation_1, theSlicer);
    }
  }
}
