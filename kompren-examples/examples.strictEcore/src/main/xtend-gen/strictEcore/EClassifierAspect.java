package strictEcore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EClassifierAspectEClassifierAspectProperties;
import strictEcore.ENamedElementAspect;
import strictEcore.StrictEcore;

@Aspect(className = EClassifier.class, with = { ENamedElementAspect.class })
@SuppressWarnings("all")
public abstract class EClassifierAspect extends ENamedElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EClassifier _self, final StrictEcore theSlicer) {
    strictEcore.EClassifierAspectEClassifierAspectContext _instance = strictEcore.EClassifierAspectEClassifierAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EClassifier,strictEcore.EClassifierAspectEClassifierAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EClassifierAspectEClassifierAspectProperties prop = new strictEcore.EClassifierAspectEClassifierAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EClass){
    			     	 strictEcore.EClassAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnum){
    			     	 strictEcore.EEnumAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EDataType){
    			     	 strictEcore.EDataTypeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    			     	 strictEcore.EClassifierAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EClassifier _self, final StrictEcore theSlicer) {
    strictEcore.EClassifierAspectEClassifierAspectContext _instance = strictEcore.EClassifierAspectEClassifierAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EClassifier,strictEcore.EClassifierAspectEClassifierAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EClassifierAspectEClassifierAspectProperties prop = new strictEcore.EClassifierAspectEClassifierAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EClass){
    			     	 strictEcore.EClassAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnum){
    			     	 strictEcore.EEnumAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EDataType){
    			     	 strictEcore.EDataTypeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    			     	 strictEcore.EClassifierAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static EClassifierAspectEClassifierAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EClassifier _self, final StrictEcore theSlicer) {
      strictEcore.ENamedElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EClassifier _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EClassifier" + _self));
    EClassifierAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EClassifier _self, final StrictEcore theSlicer) {
      strictEcore.ENamedElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EClassifier _self, final StrictEcore theSlicer) {
    EClassifierAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
