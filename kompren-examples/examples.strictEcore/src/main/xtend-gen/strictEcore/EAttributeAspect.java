package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EAttributeAspectEAttributeAspectProperties;
import strictEcore.EStructuralFeatureAspect;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EAttribute.class, with = { EStructuralFeatureAspect.class })
@SuppressWarnings("all")
public class EAttributeAspect extends EStructuralFeatureAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EAttribute _self, final StrictEcore theSlicer) {
    strictEcore.EAttributeAspectEAttributeAspectContext _instance = strictEcore.EAttributeAspectEAttributeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EAttribute,strictEcore.EAttributeAspectEAttributeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EAttributeAspectEAttributeAspectProperties prop = new strictEcore.EAttributeAspectEAttributeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
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
  public static void _visitToAddRelations(final EAttribute _self, final StrictEcore theSlicer) {
    strictEcore.EAttributeAspectEAttributeAspectContext _instance = strictEcore.EAttributeAspectEAttributeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EAttribute,strictEcore.EAttributeAspectEAttributeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EAttributeAspectEAttributeAspectProperties prop = new strictEcore.EAttributeAspectEAttributeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
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
  
  public static EAttributeAspectEAttributeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EAttribute _self, final StrictEcore theSlicer) {
      strictEcore.EStructuralFeatureAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EAttribute _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EAttribute>> " + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EAttribute _createEAttribute = EcoreFactoryImpl.eINSTANCE.createEAttribute();
      __SlicerAspect__.clonedElt(_self, _createEAttribute);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EAttributeAspect.super__visitToAddClasses(_self, theSlicer);
    EDataType _eAttributeType = _self.getEAttributeType();
    if (_eAttributeType!=null) {
      __SlicerAspect__.visitToAddClasses(_eAttributeType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EAttribute _self, final StrictEcore theSlicer) {
      strictEcore.EStructuralFeatureAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EAttribute _self, final StrictEcore theSlicer) {
    EAttributeAspect.super__visitToAddRelations(_self, theSlicer);
    EDataType _eAttributeType = _self.getEAttributeType();
    boolean _notEquals = (!Objects.equal(_eAttributeType, null));
    if (_notEquals) {
      EDataType _eAttributeType_1 = _self.getEAttributeType();
      __SlicerAspect__.visitToAddRelations(_eAttributeType_1, theSlicer);
    }
  }
}
