package strictEcore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.EGenericTypeAspectEGenericTypeAspectProperties;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__;

@Aspect(className = EGenericType.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public class EGenericTypeAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EGenericType _self, final StrictEcore theSlicer) {
    strictEcore.EGenericTypeAspectEGenericTypeAspectContext _instance = strictEcore.EGenericTypeAspectEGenericTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EGenericType,strictEcore.EGenericTypeAspectEGenericTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EGenericTypeAspectEGenericTypeAspectProperties prop = new strictEcore.EGenericTypeAspectEGenericTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    			     	 strictEcore.EGenericTypeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EGenericType _self, final StrictEcore theSlicer) {
    strictEcore.EGenericTypeAspectEGenericTypeAspectContext _instance = strictEcore.EGenericTypeAspectEGenericTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.emf.ecore.EGenericType,strictEcore.EGenericTypeAspectEGenericTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.EGenericTypeAspectEGenericTypeAspectProperties prop = new strictEcore.EGenericTypeAspectEGenericTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    			     	 strictEcore.EGenericTypeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static EGenericTypeAspectEGenericTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EGenericType _self, final StrictEcore theSlicer) {
      strictEcore.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final EGenericType _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass EGenericType" + _self));
    EGenericTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EGenericType _self, final StrictEcore theSlicer) {
      strictEcore.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final EGenericType _self, final StrictEcore theSlicer) {
    EGenericTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
