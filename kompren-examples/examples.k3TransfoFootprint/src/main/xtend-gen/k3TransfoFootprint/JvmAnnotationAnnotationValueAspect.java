package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties;
import k3TransfoFootprint.JvmAnnotationValueAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmAnnotationAnnotationValue.class)
@SuppressWarnings("all")
public class JvmAnnotationAnnotationValueAspect extends JvmAnnotationValueAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue,k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue,k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    			     							 k3TransfoFootprint.JvmAnnotationAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
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
  
  public static JvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationAnnotationValue> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmAnnotationReference> _values = _self.getValues();
    final Procedure1<JvmAnnotationReference> _function = new Procedure1<JvmAnnotationReference>() {
      public void apply(final JvmAnnotationReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmAnnotationReference>forEach(_values, _function);
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationAnnotationValue> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmAnnotationReference> _values = _self.getValues();
    final Procedure1<JvmAnnotationReference> _function = new Procedure1<JvmAnnotationReference>() {
      public void apply(final JvmAnnotationReference _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmAnnotationReference>forEach(_values, _function);
  }
}
