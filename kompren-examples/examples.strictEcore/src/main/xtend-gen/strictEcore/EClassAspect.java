package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import strictEcore.EClassAspectEClassAspectProperties;
import strictEcore.EClassifierAspect;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EClass.class, with = { EClassifierAspect.class })
@SuppressWarnings("all")
public class EClassAspect extends EClassifierAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EClass _self, final StrictEcore theSlicer) {
    strictEcore.EClassAspectEClassAspectContext _instance = strictEcore.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EClass,strictEcore.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EClassAspectEClassAspectProperties prop = new strictEcore.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EClass){
    			     	 strictEcore.EClassAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EClass)_self,theSlicer);
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
  public static void _visitToAddRelations(final EClass _self, final StrictEcore theSlicer) {
    strictEcore.EClassAspectEClassAspectContext _instance = strictEcore.EClassAspectEClassAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EClass,strictEcore.EClassAspectEClassAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EClassAspectEClassAspectProperties prop = new strictEcore.EClassAspectEClassAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EClass){
    			     	 strictEcore.EClassAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EClass)_self,theSlicer);
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
  
  public static EClassAspectEClassAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EClass _self, final StrictEcore theSlicer) {
      strictEcore.EClassifierAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EClass _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EClass>> " + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EClass _createEClass = EcoreFactoryImpl.eINSTANCE.createEClass();
      __SlicerAspect__.clonedElt(_self, _createEClass);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EClassAspect.super__visitToAddClasses(_self, theSlicer);
    EList<EClass> _eSuperTypes = _self.getESuperTypes();
    final Procedure1<EClass> _function = new Procedure1<EClass>() {
      public void apply(final EClass it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<EClass>forEach(_eSuperTypes, _function);
    EList<EStructuralFeature> _eStructuralFeatures = _self.getEStructuralFeatures();
    final Procedure1<EStructuralFeature> _function_1 = new Procedure1<EStructuralFeature>() {
      public void apply(final EStructuralFeature it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<EStructuralFeature>forEach(_eStructuralFeatures, _function_1);
    EList<EOperation> _eOperations = _self.getEOperations();
    final Procedure1<EOperation> _function_2 = new Procedure1<EOperation>() {
      public void apply(final EOperation it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<EOperation>forEach(_eOperations, _function_2);
  }
  
  private static void super__visitToAddRelations(final EClass _self, final StrictEcore theSlicer) {
      strictEcore.EClassifierAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EClass _self, final StrictEcore theSlicer) {
    EClassAspect.super__visitToAddRelations(_self, theSlicer);
    EList<EClass> _eSuperTypes = _self.getESuperTypes();
    final Procedure1<EClass> _function = new Procedure1<EClass>() {
      public void apply(final EClass _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _sliced = __SlicerAspect__.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          boolean _sliced_1 = __SlicerAspect__.sliced(_elt);
          _and = _sliced_1;
        }
        if (_and) {
          EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
          EList<EClass> _eSuperTypes = ((EClass) _clonedElt).getESuperTypes();
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_elt);
          _eSuperTypes.add(((EClass) _clonedElt_1));
        }
      }
    };
    IterableExtensions.<EClass>forEach(_eSuperTypes, _function);
    EList<EStructuralFeature> _eStructuralFeatures = _self.getEStructuralFeatures();
    final Procedure1<EStructuralFeature> _function_1 = new Procedure1<EStructuralFeature>() {
      public void apply(final EStructuralFeature _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _sliced = __SlicerAspect__.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          boolean _sliced_1 = __SlicerAspect__.sliced(_elt);
          _and = _sliced_1;
        }
        if (_and) {
          EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
          EList<EStructuralFeature> _eStructuralFeatures = ((EClass) _clonedElt).getEStructuralFeatures();
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_elt);
          _eStructuralFeatures.add(((EStructuralFeature) _clonedElt_1));
        }
      }
    };
    IterableExtensions.<EStructuralFeature>forEach(_eStructuralFeatures, _function_1);
    EList<EOperation> _eOperations = _self.getEOperations();
    final Procedure1<EOperation> _function_2 = new Procedure1<EOperation>() {
      public void apply(final EOperation _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _sliced = __SlicerAspect__.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          boolean _sliced_1 = __SlicerAspect__.sliced(_elt);
          _and = _sliced_1;
        }
        if (_and) {
          EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
          EList<EOperation> _eOperations = ((EClass) _clonedElt).getEOperations();
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_elt);
          _eOperations.add(((EOperation) _clonedElt_1));
        }
      }
    };
    IterableExtensions.<EOperation>forEach(_eOperations, _function_2);
  }
}
