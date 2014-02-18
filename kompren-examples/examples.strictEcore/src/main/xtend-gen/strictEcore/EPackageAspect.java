package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.ENamedElementAspect;
import strictEcore.EPackageAspectEPackageAspectProperties;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EPackage.class, with = { ENamedElementAspect.class })
@SuppressWarnings("all")
public class EPackageAspect extends ENamedElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EPackage _self, final StrictEcore theSlicer) {
    strictEcore.EPackageAspectEPackageAspectContext _instance = strictEcore.EPackageAspectEPackageAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EPackage,strictEcore.EPackageAspectEPackageAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EPackageAspectEPackageAspectProperties prop = new strictEcore.EPackageAspectEPackageAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EPackage){
    			     	 strictEcore.EPackageAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EPackage _self, final StrictEcore theSlicer) {
    strictEcore.EPackageAspectEPackageAspectContext _instance = strictEcore.EPackageAspectEPackageAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EPackage,strictEcore.EPackageAspectEPackageAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EPackageAspectEPackageAspectProperties prop = new strictEcore.EPackageAspectEPackageAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EPackage){
    			     	 strictEcore.EPackageAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static EPackageAspectEPackageAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EPackage _self, final StrictEcore theSlicer) {
      strictEcore.ENamedElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EPackage _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EPackage" + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EPackage _createEPackage = EcoreFactoryImpl.eINSTANCE.createEPackage();
      __SlicerAspect__.clonedElt(_self, _createEPackage);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EPackageAspect.super__visitToAddClasses(_self, theSlicer);
    EFactory _eFactoryInstance = _self.getEFactoryInstance();
    if (_eFactoryInstance!=null) {
      __SlicerAspect__.visitToAddClasses(_eFactoryInstance, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EPackage _self, final StrictEcore theSlicer) {
      strictEcore.ENamedElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EPackage _self, final StrictEcore theSlicer) {
    EPackageAspect.super__visitToAddRelations(_self, theSlicer);
    EFactory _eFactoryInstance = _self.getEFactoryInstance();
    boolean _notEquals = (!Objects.equal(_eFactoryInstance, null));
    if (_notEquals) {
      EFactory _eFactoryInstance_1 = _self.getEFactoryInstance();
      __SlicerAspect__.visitToAddRelations(_eFactoryInstance_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        EFactory _eFactoryInstance_2 = _self.getEFactoryInstance();
        boolean _sliced_1 = __SlicerAspect__.sliced(_eFactoryInstance_2);
        _and = _sliced_1;
      }
      if (_and) {
        EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
        EFactory _eFactoryInstance_3 = _self.getEFactoryInstance();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_eFactoryInstance_3);
        ((EPackage) _clonedElt).setEFactoryInstance(((EFactory) _clonedElt_1));
      }
    }
  }
}
