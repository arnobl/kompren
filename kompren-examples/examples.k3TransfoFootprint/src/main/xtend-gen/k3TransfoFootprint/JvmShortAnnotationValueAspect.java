package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationValueAspect;
import k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmShortAnnotationValue;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmShortAnnotationValue.class)
@SuppressWarnings("all")
public class JvmShortAnnotationValueAspect extends JvmAnnotationValueAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmShortAnnotationValue,k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    			     							 k3TransfoFootprint.JvmShortAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmShortAnnotationValue,k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    			     							 k3TransfoFootprint.JvmShortAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
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
  
  public static JvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmShortAnnotationValue> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmShortAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmShortAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmShortAnnotationValue> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmShortAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmShortAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
