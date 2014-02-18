package strictEcore;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EEnumLiteralAspectEEnumLiteralAspectProperties;
import strictEcore.ENamedElementAspect;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EEnumLiteral.class, with = { ENamedElementAspect.class })
@SuppressWarnings("all")
public class EEnumLiteralAspect extends ENamedElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EEnumLiteral _self, final StrictEcore theSlicer) {
    strictEcore.EEnumLiteralAspectEEnumLiteralAspectContext _instance = strictEcore.EEnumLiteralAspectEEnumLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EEnumLiteral,strictEcore.EEnumLiteralAspectEEnumLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EEnumLiteralAspectEEnumLiteralAspectProperties prop = new strictEcore.EEnumLiteralAspectEEnumLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    			     	 strictEcore.EEnumLiteralAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EEnumLiteral _self, final StrictEcore theSlicer) {
    strictEcore.EEnumLiteralAspectEEnumLiteralAspectContext _instance = strictEcore.EEnumLiteralAspectEEnumLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EEnumLiteral,strictEcore.EEnumLiteralAspectEEnumLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EEnumLiteralAspectEEnumLiteralAspectProperties prop = new strictEcore.EEnumLiteralAspectEEnumLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    			     	 strictEcore.EEnumLiteralAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static EEnumLiteralAspectEEnumLiteralAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EEnumLiteral _self, final StrictEcore theSlicer) {
      strictEcore.ENamedElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EEnumLiteral _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EEnumLiteral" + _self));
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _equals = Objects.equal(_clonedElt, null);
    if (_equals) {
      EEnumLiteral _createEEnumLiteral = EcoreFactoryImpl.eINSTANCE.createEEnumLiteral();
      __SlicerAspect__.clonedElt(_self, _createEEnumLiteral);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    EEnumLiteralAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EEnumLiteral _self, final StrictEcore theSlicer) {
      strictEcore.ENamedElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EEnumLiteral _self, final StrictEcore theSlicer) {
    EEnumLiteralAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
