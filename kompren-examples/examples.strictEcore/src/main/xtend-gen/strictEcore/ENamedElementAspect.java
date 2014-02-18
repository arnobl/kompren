package strictEcore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EModelElementAspect;
import strictEcore.ENamedElementAspectENamedElementAspectProperties;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = ENamedElement.class, with = { EModelElementAspect.class })
@SuppressWarnings("all")
public abstract class ENamedElementAspect extends EModelElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final ENamedElement _self, final StrictEcore theSlicer) {
    strictEcore.ENamedElementAspectENamedElementAspectContext _instance = strictEcore.ENamedElementAspectENamedElementAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.ENamedElement,strictEcore.ENamedElementAspectENamedElementAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.ENamedElementAspectENamedElementAspectProperties prop = new strictEcore.ENamedElementAspectENamedElementAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClass){
    			     	 strictEcore.EClassAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnum){
    			     	 strictEcore.EEnumAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EDataType){
    			     	 strictEcore.EDataTypeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    			     	 strictEcore.EClassifierAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    			     	 strictEcore.EEnumLiteralAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EOperation){
    			     	 strictEcore.EOperationAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EPackage){
    			     	 strictEcore.EPackageAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EParameter){
    			     	 strictEcore.EParameterAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EReference){
    			     	 strictEcore.EReferenceAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    			     	 strictEcore.EStructuralFeatureAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    			     	 strictEcore.ETypedElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    			     	 strictEcore.ETypeParameterAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final ENamedElement _self, final StrictEcore theSlicer) {
    strictEcore.ENamedElementAspectENamedElementAspectContext _instance = strictEcore.ENamedElementAspectENamedElementAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.ENamedElement,strictEcore.ENamedElementAspectENamedElementAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.ENamedElementAspectENamedElementAspectProperties prop = new strictEcore.ENamedElementAspectENamedElementAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClass){
    			     	 strictEcore.EClassAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnum){
    			     	 strictEcore.EEnumAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EDataType){
    			     	 strictEcore.EDataTypeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    			     	 strictEcore.EClassifierAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    			     	 strictEcore.EEnumLiteralAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EOperation){
    			     	 strictEcore.EOperationAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EPackage){
    			     	 strictEcore.EPackageAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EParameter){
    			     	 strictEcore.EParameterAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EReference){
    			     	 strictEcore.EReferenceAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    			     	 strictEcore.EStructuralFeatureAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    			     	 strictEcore.ETypedElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    			     	 strictEcore.ETypeParameterAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static ENamedElementAspectENamedElementAspectProperties _self_;
  
  private static void super__visitToAddClasses(final ENamedElement _self, final StrictEcore theSlicer) {
      strictEcore.EModelElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final ENamedElement _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass ENamedElement" + _self));
    ENamedElementAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final ENamedElement _self, final StrictEcore theSlicer) {
      strictEcore.EModelElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final ENamedElement _self, final StrictEcore theSlicer) {
    ENamedElementAspect.super__visitToAddRelations(_self, theSlicer);
    boolean _sliced = __SlicerAspect__.sliced(_self);
    if (_sliced) {
      EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
      String _name = _self.getName();
      ((ENamedElement) _clonedElt).setName(_name);
    }
  }
}
