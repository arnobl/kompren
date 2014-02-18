package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EParameterAspectEParameterAspectProperties;
import strictEcore.ETypedElementAspect;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EParameter.class, with = { ETypedElementAspect.class })
@SuppressWarnings("all")
public class EParameterAspect extends ETypedElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EParameter _self, final StrictEcore theSlicer) {
    strictEcore.EParameterAspectEParameterAspectContext _instance = strictEcore.EParameterAspectEParameterAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EParameter,strictEcore.EParameterAspectEParameterAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EParameterAspectEParameterAspectProperties prop = new strictEcore.EParameterAspectEParameterAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EParameter){
    			     	 strictEcore.EParameterAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
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
  public static void _visitToAddRelations(final EParameter _self, final StrictEcore theSlicer) {
    strictEcore.EParameterAspectEParameterAspectContext _instance = strictEcore.EParameterAspectEParameterAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EParameter,strictEcore.EParameterAspectEParameterAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EParameterAspectEParameterAspectProperties prop = new strictEcore.EParameterAspectEParameterAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EParameter){
    			     	 strictEcore.EParameterAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
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
  
  public static EParameterAspectEParameterAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EParameter _self, final StrictEcore theSlicer) {
      strictEcore.ETypedElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EParameter _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EParameter" + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EParameter _createEParameter = EcoreFactoryImpl.eINSTANCE.createEParameter();
      __SlicerAspect__.clonedElt(_self, _createEParameter);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EParameterAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EParameter _self, final StrictEcore theSlicer) {
      strictEcore.ETypedElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EParameter _self, final StrictEcore theSlicer) {
    EParameterAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
