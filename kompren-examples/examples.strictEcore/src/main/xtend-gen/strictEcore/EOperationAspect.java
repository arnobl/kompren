package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import strictEcore.EOperationAspectEOperationAspectProperties;
import strictEcore.ETypedElementAspect;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EOperation.class, with = { ETypedElementAspect.class })
@SuppressWarnings("all")
public class EOperationAspect extends ETypedElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EOperation _self, final StrictEcore theSlicer) {
    strictEcore.EOperationAspectEOperationAspectContext _instance = strictEcore.EOperationAspectEOperationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EOperation,strictEcore.EOperationAspectEOperationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EOperationAspectEOperationAspectProperties prop = new strictEcore.EOperationAspectEOperationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EOperation){
    			     	 strictEcore.EOperationAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
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
  public static void _visitToAddRelations(final EOperation _self, final StrictEcore theSlicer) {
    strictEcore.EOperationAspectEOperationAspectContext _instance = strictEcore.EOperationAspectEOperationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EOperation,strictEcore.EOperationAspectEOperationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EOperationAspectEOperationAspectProperties prop = new strictEcore.EOperationAspectEOperationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EOperation){
    			     	 strictEcore.EOperationAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
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
  
  public static EOperationAspectEOperationAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EOperation _self, final StrictEcore theSlicer) {
      strictEcore.ETypedElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EOperation _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EOperation" + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EOperation _createEOperation = EcoreFactoryImpl.eINSTANCE.createEOperation();
      __SlicerAspect__.clonedElt(_self, _createEOperation);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EOperationAspect.super__visitToAddClasses(_self, theSlicer);
    EList<EParameter> _eParameters = _self.getEParameters();
    final Procedure1<EParameter> _function = new Procedure1<EParameter>() {
      public void apply(final EParameter it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<EParameter>forEach(_eParameters, _function);
  }
  
  private static void super__visitToAddRelations(final EOperation _self, final StrictEcore theSlicer) {
      strictEcore.ETypedElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EOperation _self, final StrictEcore theSlicer) {
    EOperationAspect.super__visitToAddRelations(_self, theSlicer);
    EList<EParameter> _eParameters = _self.getEParameters();
    final Procedure1<EParameter> _function = new Procedure1<EParameter>() {
      public void apply(final EParameter _elt) {
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
          EList<EParameter> _eParameters = ((EOperation) _clonedElt).getEParameters();
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_elt);
          _eParameters.add(((EParameter) _clonedElt_1));
        }
      }
    };
    IterableExtensions.<EParameter>forEach(_eParameters, _function);
  }
}
