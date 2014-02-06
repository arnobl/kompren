package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationValueAspect;
import k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmTypeAnnotationValue.class)
@SuppressWarnings("all")
public class JvmTypeAnnotationValueAspect extends JvmAnnotationValueAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeAnnotationValue,k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    			     							 k3TransfoFootprint.JvmTypeAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeAnnotationValue,k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    			     							 k3TransfoFootprint.JvmTypeAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
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
  
  public static JvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeAnnotationValue> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmTypeAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmTypeAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeReference> _values = _self.getValues();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_values, _function);
  }
  
  private static void super__visitToAddRelations(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeAnnotationValue> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmTypeAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmTypeAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeReference> _values = _self.getValues();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_values, _function);
  }
}
