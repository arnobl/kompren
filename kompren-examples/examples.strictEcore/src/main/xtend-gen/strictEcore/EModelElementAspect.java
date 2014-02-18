package strictEcore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EModelElementAspectEModelElementAspectProperties;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EModelElement.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public abstract class EModelElementAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EModelElement _self, final StrictEcore theSlicer) {
    strictEcore.EModelElementAspectEModelElementAspectContext _instance = strictEcore.EModelElementAspectEModelElementAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EModelElement,strictEcore.EModelElementAspectEModelElementAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EModelElementAspectEModelElementAspectProperties prop = new strictEcore.EModelElementAspectEModelElementAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    			     	 strictEcore.EAnnotationAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
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
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EFactory){
    			     	 strictEcore.EFactoryAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EFactory)_self,theSlicer);
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
  public static void _visitToAddRelations(final EModelElement _self, final StrictEcore theSlicer) {
    strictEcore.EModelElementAspectEModelElementAspectContext _instance = strictEcore.EModelElementAspectEModelElementAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EModelElement,strictEcore.EModelElementAspectEModelElementAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EModelElementAspectEModelElementAspectProperties prop = new strictEcore.EModelElementAspectEModelElementAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    			     	 strictEcore.EAnnotationAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
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
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EFactory){
    			     	 strictEcore.EFactoryAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EFactory)_self,theSlicer);
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
  
  public static EModelElementAspectEModelElementAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EModelElement _self, final StrictEcore theSlicer) {
      strictEcore.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EModelElement _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EModelElement" + _self));
    EModelElementAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EModelElement _self, final StrictEcore theSlicer) {
      strictEcore.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EModelElement _self, final StrictEcore theSlicer) {
    EModelElementAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
