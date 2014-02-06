package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmAnnotationReference.class)
@SuppressWarnings("all")
public class JvmAnnotationReferenceAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext _instance = k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationReference,k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties prop = new k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationReference){
    			     							 k3TransfoFootprint.JvmAnnotationReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationReference)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext _instance = k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationReference,k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties prop = new k3TransfoFootprint.JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationReference){
    			     							 k3TransfoFootprint.JvmAnnotationReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationReference)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static JvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationReference");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmAnnotationType _annotation = _self.getAnnotation();
    if (_annotation!=null) {
      __SlicerAspect__.visitToAddClasses(_annotation, theSlicer);
    }
    EList<JvmAnnotationValue> _explicitValues = _self.getExplicitValues();
    final Procedure1<JvmAnnotationValue> _function = new Procedure1<JvmAnnotationValue>() {
      public void apply(final JvmAnnotationValue it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmAnnotationValue>forEach(_explicitValues, _function);
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationReference");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmAnnotationType _annotation = _self.getAnnotation();
    boolean _notEquals = (!Objects.equal(_annotation, null));
    if (_notEquals) {
      JvmAnnotationType _annotation_1 = _self.getAnnotation();
      __SlicerAspect__.visitToAddRelations(_annotation_1, theSlicer);
    }
    EList<JvmAnnotationValue> _explicitValues = _self.getExplicitValues();
    final Procedure1<JvmAnnotationValue> _function = new Procedure1<JvmAnnotationValue>() {
      public void apply(final JvmAnnotationValue _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmAnnotationValue>forEach(_explicitValues, _function);
  }
}
