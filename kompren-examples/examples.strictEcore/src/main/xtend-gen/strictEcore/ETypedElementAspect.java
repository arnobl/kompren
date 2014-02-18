package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.ENamedElementAspect;
import strictEcore.ETypedElementAspectETypedElementAspectProperties;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = ETypedElement.class, with = { ENamedElementAspect.class })
@SuppressWarnings("all")
public abstract class ETypedElementAspect extends ENamedElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final ETypedElement _self, final StrictEcore theSlicer) {
    strictEcore.ETypedElementAspectETypedElementAspectContext _instance = strictEcore.ETypedElementAspectETypedElementAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.ETypedElement,strictEcore.ETypedElementAspectETypedElementAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.ETypedElementAspectETypedElementAspectProperties prop = new strictEcore.ETypedElementAspectETypedElementAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EOperation){
    			     	 strictEcore.EOperationAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EParameter){
    			     	 strictEcore.EParameterAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EReference){
    			     	 strictEcore.EReferenceAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    			     	 strictEcore.EStructuralFeatureAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    			     	 strictEcore.ETypedElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final ETypedElement _self, final StrictEcore theSlicer) {
    strictEcore.ETypedElementAspectETypedElementAspectContext _instance = strictEcore.ETypedElementAspectETypedElementAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.ETypedElement,strictEcore.ETypedElementAspectETypedElementAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.ETypedElementAspectETypedElementAspectProperties prop = new strictEcore.ETypedElementAspectETypedElementAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EOperation){
    			     	 strictEcore.EOperationAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EParameter){
    			     	 strictEcore.EParameterAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EReference){
    			     	 strictEcore.EReferenceAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    			     	 strictEcore.EStructuralFeatureAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    			     	 strictEcore.ETypedElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static ETypedElementAspectETypedElementAspectProperties _self_;
  
  private static void super__visitToAddClasses(final ETypedElement _self, final StrictEcore theSlicer) {
      strictEcore.ENamedElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final ETypedElement _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass ETypedElement" + _self));
    ETypedElementAspect.super__visitToAddClasses(_self, theSlicer);
    EClassifier _eType = _self.getEType();
    if (_eType!=null) {
      __SlicerAspect__.visitToAddClasses(_eType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final ETypedElement _self, final StrictEcore theSlicer) {
      strictEcore.ENamedElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final ETypedElement _self, final StrictEcore theSlicer) {
    ETypedElementAspect.super__visitToAddRelations(_self, theSlicer);
    EClassifier _eType = _self.getEType();
    boolean _notEquals = (!Objects.equal(_eType, null));
    if (_notEquals) {
      EClassifier _eType_1 = _self.getEType();
      __SlicerAspect__.visitToAddRelations(_eType_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        EClassifier _eType_2 = _self.getEType();
        boolean _sliced_1 = __SlicerAspect__.sliced(_eType_2);
        _and = _sliced_1;
      }
      if (_and) {
        EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
        EClassifier _eType_3 = _self.getEType();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_eType_3);
        ((ETypedElement) _clonedElt).setEType(((EClassifier) _clonedElt_1));
      }
    }
  }
}
