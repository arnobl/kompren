package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EAnnotationAspectEAnnotationAspectProperties;
import strictEcore.EModelElementAspect;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EAnnotation.class, with = { EModelElementAspect.class })
@SuppressWarnings("all")
public class EAnnotationAspect extends EModelElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EAnnotation _self, final StrictEcore theSlicer) {
    strictEcore.EAnnotationAspectEAnnotationAspectContext _instance = strictEcore.EAnnotationAspectEAnnotationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EAnnotation,strictEcore.EAnnotationAspectEAnnotationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EAnnotationAspectEAnnotationAspectProperties prop = new strictEcore.EAnnotationAspectEAnnotationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    			     	 strictEcore.EAnnotationAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EAnnotation _self, final StrictEcore theSlicer) {
    strictEcore.EAnnotationAspectEAnnotationAspectContext _instance = strictEcore.EAnnotationAspectEAnnotationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EAnnotation,strictEcore.EAnnotationAspectEAnnotationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EAnnotationAspectEAnnotationAspectProperties prop = new strictEcore.EAnnotationAspectEAnnotationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    			     	 strictEcore.EAnnotationAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static EAnnotationAspectEAnnotationAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EAnnotation _self, final StrictEcore theSlicer) {
      strictEcore.EModelElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EAnnotation _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EAnnotation>> " + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EAnnotation _createEAnnotation = EcoreFactoryImpl.eINSTANCE.createEAnnotation();
      __SlicerAspect__.clonedElt(_self, _createEAnnotation);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EAnnotationAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EAnnotation _self, final StrictEcore theSlicer) {
      strictEcore.EModelElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EAnnotation _self, final StrictEcore theSlicer) {
    EAnnotationAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
