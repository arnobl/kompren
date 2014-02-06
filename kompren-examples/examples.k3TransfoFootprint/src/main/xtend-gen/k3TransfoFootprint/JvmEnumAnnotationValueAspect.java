package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationValueAspect;
import k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmEnumAnnotationValue;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmEnumAnnotationValue.class)
@SuppressWarnings("all")
public class JvmEnumAnnotationValueAspect extends JvmAnnotationValueAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmEnumAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmEnumAnnotationValue,k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmEnumAnnotationValue){
    			     							 k3TransfoFootprint.JvmEnumAnnotationValueAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumAnnotationValue)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmEnumAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectContext _instance = k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmEnumAnnotationValue,k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectProperties prop = new k3TransfoFootprint.JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmEnumAnnotationValue){
    			     							 k3TransfoFootprint.JvmEnumAnnotationValueAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumAnnotationValue)_self,theSlicer);
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
  
  public static JvmEnumAnnotationValueAspectJvmEnumAnnotationValueAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmEnumAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmEnumAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmEnumAnnotationValue> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmEnumAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmEnumAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmEnumerationLiteral> _values = _self.getValues();
    final Procedure1<JvmEnumerationLiteral> _function = new Procedure1<JvmEnumerationLiteral>() {
      public void apply(final JvmEnumerationLiteral it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmEnumerationLiteral>forEach(_values, _function);
  }
  
  private static void super__visitToAddRelations(final JvmEnumAnnotationValue _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationValueAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmEnumAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmEnumAnnotationValue> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmEnumAnnotationValue");
    InputOutput.<String>println(_plus_1);
    JvmEnumAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmEnumerationLiteral> _values = _self.getValues();
    final Procedure1<JvmEnumerationLiteral> _function = new Procedure1<JvmEnumerationLiteral>() {
      public void apply(final JvmEnumerationLiteral _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmEnumerationLiteral>forEach(_values, _function);
  }
}
