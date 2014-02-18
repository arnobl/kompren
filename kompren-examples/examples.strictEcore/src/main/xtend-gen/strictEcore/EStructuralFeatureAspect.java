package strictEcore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectProperties;
import strictEcore.ETypedElementAspect;
import strictEcore.StrictEcore;

@Aspect(className = EStructuralFeature.class, with = { ETypedElementAspect.class })
@SuppressWarnings("all")
public abstract class EStructuralFeatureAspect extends ETypedElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EStructuralFeature _self, final StrictEcore theSlicer) {
    strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectContext _instance = strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EStructuralFeature,strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectProperties prop = new strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
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
  public static void _visitToAddRelations(final EStructuralFeature _self, final StrictEcore theSlicer) {
    strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectContext _instance = strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EStructuralFeature,strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectProperties prop = new strictEcore.EStructuralFeatureAspectEStructuralFeatureAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
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
  
  public static EStructuralFeatureAspectEStructuralFeatureAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EStructuralFeature _self, final StrictEcore theSlicer) {
      strictEcore.ETypedElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EStructuralFeature _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EStructuralFeature" + _self));
    EStructuralFeatureAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EStructuralFeature _self, final StrictEcore theSlicer) {
      strictEcore.ETypedElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EStructuralFeature _self, final StrictEcore theSlicer) {
    EStructuralFeatureAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
