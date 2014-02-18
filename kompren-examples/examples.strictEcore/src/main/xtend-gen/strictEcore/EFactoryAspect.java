package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EFactoryAspectEFactoryAspectProperties;
import strictEcore.EModelElementAspect;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EFactory.class, with = { EModelElementAspect.class })
@SuppressWarnings("all")
public class EFactoryAspect extends EModelElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EFactory _self, final StrictEcore theSlicer) {
    strictEcore.EFactoryAspectEFactoryAspectContext _instance = strictEcore.EFactoryAspectEFactoryAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EFactory,strictEcore.EFactoryAspectEFactoryAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EFactoryAspectEFactoryAspectProperties prop = new strictEcore.EFactoryAspectEFactoryAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EFactory){
    			     	 strictEcore.EFactoryAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EFactory)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EFactory _self, final StrictEcore theSlicer) {
    strictEcore.EFactoryAspectEFactoryAspectContext _instance = strictEcore.EFactoryAspectEFactoryAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EFactory,strictEcore.EFactoryAspectEFactoryAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EFactoryAspectEFactoryAspectProperties prop = new strictEcore.EFactoryAspectEFactoryAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EFactory){
    			     	 strictEcore.EFactoryAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EFactory)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static EFactoryAspectEFactoryAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EFactory _self, final StrictEcore theSlicer) {
      strictEcore.EModelElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EFactory _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EFactory" + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EFactory _createEFactory = EcoreFactoryImpl.eINSTANCE.createEFactory();
      __SlicerAspect__.clonedElt(_self, _createEFactory);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EFactoryAspect.super__visitToAddClasses(_self, theSlicer);
    EPackage _ePackage = _self.getEPackage();
    if (_ePackage!=null) {
      __SlicerAspect__.visitToAddClasses(_ePackage, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EFactory _self, final StrictEcore theSlicer) {
      strictEcore.EModelElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EFactory _self, final StrictEcore theSlicer) {
    EFactoryAspect.super__visitToAddRelations(_self, theSlicer);
    EPackage _ePackage = _self.getEPackage();
    boolean _notEquals = (!Objects.equal(_ePackage, null));
    if (_notEquals) {
      EPackage _ePackage_1 = _self.getEPackage();
      __SlicerAspect__.visitToAddRelations(_ePackage_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        EPackage _ePackage_2 = _self.getEPackage();
        boolean _sliced_1 = __SlicerAspect__.sliced(_ePackage_2);
        _and = _sliced_1;
      }
      if (_and) {
        EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
        EPackage _ePackage_3 = _self.getEPackage();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_ePackage_3);
        ((EFactory) _clonedElt).setEPackage(((EPackage) _clonedElt_1));
      }
    }
  }
}
