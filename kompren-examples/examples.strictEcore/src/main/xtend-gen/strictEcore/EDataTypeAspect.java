package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EClassifierAspect;
import strictEcore.EDataTypeAspectEDataTypeAspectProperties;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EDataType.class, with = { EClassifierAspect.class })
@SuppressWarnings("all")
public class EDataTypeAspect extends EClassifierAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EDataType _self, final StrictEcore theSlicer) {
    strictEcore.EDataTypeAspectEDataTypeAspectContext _instance = strictEcore.EDataTypeAspectEDataTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EDataType,strictEcore.EDataTypeAspectEDataTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EDataTypeAspectEDataTypeAspectProperties prop = new strictEcore.EDataTypeAspectEDataTypeAspectProperties();
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
  public static void _visitToAddRelations(final EDataType _self, final StrictEcore theSlicer) {
    strictEcore.EDataTypeAspectEDataTypeAspectContext _instance = strictEcore.EDataTypeAspectEDataTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EDataType,strictEcore.EDataTypeAspectEDataTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EDataTypeAspectEDataTypeAspectProperties prop = new strictEcore.EDataTypeAspectEDataTypeAspectProperties();
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
  
  public static EDataTypeAspectEDataTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EDataType _self, final StrictEcore theSlicer) {
      strictEcore.EClassifierAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EDataType _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EDataType" + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EDataType _createEDataType = EcoreFactoryImpl.eINSTANCE.createEDataType();
      __SlicerAspect__.clonedElt(_self, _createEDataType);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EDataTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EDataType _self, final StrictEcore theSlicer) {
      strictEcore.EClassifierAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EDataType _self, final StrictEcore theSlicer) {
    EDataTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
