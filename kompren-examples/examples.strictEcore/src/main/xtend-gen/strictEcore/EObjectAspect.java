package strictEcore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EObject;
import strictEcore.EObjectAspectEObjectAspectProperties;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EObject.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public class EObjectAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EObject _self, final StrictEcore theSlicer) {
    strictEcore.EObjectAspectEObjectAspectContext _instance = strictEcore.EObjectAspectEObjectAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EObject,strictEcore.EObjectAspectEObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EObjectAspectEObjectAspectProperties prop = new strictEcore.EObjectAspectEObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EObject){
    			     	 strictEcore.EObjectAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EObject)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EObject _self, final StrictEcore theSlicer) {
    strictEcore.EObjectAspectEObjectAspectContext _instance = strictEcore.EObjectAspectEObjectAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EObject,strictEcore.EObjectAspectEObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EObjectAspectEObjectAspectProperties prop = new strictEcore.EObjectAspectEObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EObject){
    			     	 strictEcore.EObjectAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EObject)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static EObjectAspectEObjectAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EObject _self, final StrictEcore theSlicer) {
      strictEcore.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EObject _self, final StrictEcore theSlicer) {
    EObjectAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EObject _self, final StrictEcore theSlicer) {
      strictEcore.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EObject _self, final StrictEcore theSlicer) {
    EObjectAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
