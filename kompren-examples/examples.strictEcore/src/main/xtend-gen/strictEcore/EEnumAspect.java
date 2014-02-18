package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import strictEcore.EDataTypeAspect;
import strictEcore.EEnumAspectEEnumAspectProperties;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EEnum.class, with = { EDataTypeAspect.class })
@SuppressWarnings("all")
public class EEnumAspect extends EDataTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EEnum _self, final StrictEcore theSlicer) {
    strictEcore.EEnumAspectEEnumAspectContext _instance = strictEcore.EEnumAspectEEnumAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EEnum,strictEcore.EEnumAspectEEnumAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EEnumAspectEEnumAspectProperties prop = new strictEcore.EEnumAspectEEnumAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EEnum){
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
  public static void _visitToAddRelations(final EEnum _self, final StrictEcore theSlicer) {
    strictEcore.EEnumAspectEEnumAspectContext _instance = strictEcore.EEnumAspectEEnumAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EEnum,strictEcore.EEnumAspectEEnumAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EEnumAspectEEnumAspectProperties prop = new strictEcore.EEnumAspectEEnumAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EEnum){
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
  
  public static EEnumAspectEEnumAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EEnum _self, final StrictEcore theSlicer) {
      strictEcore.EDataTypeAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EEnum _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EEnum" + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EEnum _createEEnum = EcoreFactoryImpl.eINSTANCE.createEEnum();
      __SlicerAspect__.clonedElt(_self, _createEEnum);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EEnumAspect.super__visitToAddClasses(_self, theSlicer);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Procedure1<EEnumLiteral> _function = new Procedure1<EEnumLiteral>() {
      public void apply(final EEnumLiteral it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<EEnumLiteral>forEach(_eLiterals, _function);
  }
  
  private static void super__visitToAddRelations(final EEnum _self, final StrictEcore theSlicer) {
      strictEcore.EDataTypeAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EEnum _self, final StrictEcore theSlicer) {
    EEnumAspect.super__visitToAddRelations(_self, theSlicer);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Procedure1<EEnumLiteral> _function = new Procedure1<EEnumLiteral>() {
      public void apply(final EEnumLiteral _elt) {
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
          EList<EEnumLiteral> _eLiterals = ((EEnum) _clonedElt).getELiterals();
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_elt);
          _eLiterals.add(((EEnumLiteral) _clonedElt_1));
        }
      }
    };
    IterableExtensions.<EEnumLiteral>forEach(_eLiterals, _function);
  }
}
