package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EReferenceAspectEReferenceAspectProperties;
import strictEcore.EStructuralFeatureAspect;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EReference.class, with = { EStructuralFeatureAspect.class })
@SuppressWarnings("all")
public class EReferenceAspect extends EStructuralFeatureAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EReference _self, final StrictEcore theSlicer) {
    strictEcore.EReferenceAspectEReferenceAspectContext _instance = strictEcore.EReferenceAspectEReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EReference,strictEcore.EReferenceAspectEReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EReferenceAspectEReferenceAspectProperties prop = new strictEcore.EReferenceAspectEReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EReference){
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
  public static void _visitToAddRelations(final EReference _self, final StrictEcore theSlicer) {
    strictEcore.EReferenceAspectEReferenceAspectContext _instance = strictEcore.EReferenceAspectEReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EReference,strictEcore.EReferenceAspectEReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EReferenceAspectEReferenceAspectProperties prop = new strictEcore.EReferenceAspectEReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EReference){
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
  
  public static EReferenceAspectEReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EReference _self, final StrictEcore theSlicer) {
      strictEcore.EStructuralFeatureAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EReference _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EReference" + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EReference _createEReference = EcoreFactoryImpl.eINSTANCE.createEReference();
      __SlicerAspect__.clonedElt(_self, _createEReference);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    EClass _eReferenceType = _self.getEReferenceType();
    if (_eReferenceType!=null) {
      __SlicerAspect__.visitToAddClasses(_eReferenceType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EReference _self, final StrictEcore theSlicer) {
      strictEcore.EStructuralFeatureAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EReference _self, final StrictEcore theSlicer) {
    EReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    EClass _eReferenceType = _self.getEReferenceType();
    boolean _notEquals = (!Objects.equal(_eReferenceType, null));
    if (_notEquals) {
      EClass _eReferenceType_1 = _self.getEReferenceType();
      __SlicerAspect__.visitToAddRelations(_eReferenceType_1, theSlicer);
    }
  }
}
