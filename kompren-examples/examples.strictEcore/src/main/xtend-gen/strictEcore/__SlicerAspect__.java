package strictEcore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import strictEcore.StrictEcore;
import strictEcore.__SlicerAspect__ObjectAspectProperties;

@Aspect(className = Object.class)
@SuppressWarnings("all")
public abstract class __SlicerAspect__ {
  public static void visitToAddClasses(final Object _self, final StrictEcore theSlicer) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitToAddClasses(_self,theSlicer); 
  }
  
  protected static void _visitToAddClasses(final Object _self, final StrictEcore theSlicer) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    			     	 strictEcore.EAnnotationAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClass){
    			     	 strictEcore.EClassAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnum){
    			     	 strictEcore.EEnumAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EDataType){
    			     	 strictEcore.EDataTypeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    			     	 strictEcore.EClassifierAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    			     	 strictEcore.EEnumLiteralAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EFactory){
    			     	 strictEcore.EFactoryAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EFactory)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EOperation){
    			     	 strictEcore.EOperationAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EPackage){
    			     	 strictEcore.EPackageAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EObject){
    			     	 strictEcore.EObjectAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EObject)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EParameter){
    			     	 strictEcore.EParameterAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EReference){
    			     	 strictEcore.EReferenceAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    			     	 strictEcore.EStructuralFeatureAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    			     	 strictEcore.ETypedElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    			     	 strictEcore.ETypeParameterAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    			     	 strictEcore.EGenericTypeAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static void visitToAddRelations(final Object _self, final StrictEcore theSlicer) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitToAddRelations(_self,theSlicer); 
  }
  
  protected static void _visitToAddRelations(final Object _self, final StrictEcore theSlicer) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    			     	 strictEcore.EAttributeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    			     	 strictEcore.EAnnotationAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClass){
    			     	 strictEcore.EClassAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnum){
    			     	 strictEcore.EEnumAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EDataType){
    			     	 strictEcore.EDataTypeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    			     	 strictEcore.EClassifierAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    			     	 strictEcore.EEnumLiteralAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EFactory){
    			     	 strictEcore.EFactoryAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EFactory)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EOperation){
    			     	 strictEcore.EOperationAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EPackage){
    			     	 strictEcore.EPackageAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EObject){
    			     	 strictEcore.EObjectAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EObject)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EParameter){
    			     	 strictEcore.EParameterAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EReference){
    			     	 strictEcore.EReferenceAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    			     	 strictEcore.EStructuralFeatureAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    			     	 strictEcore.ETypedElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    			     	 strictEcore.ETypeParameterAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    			     	 strictEcore.ENamedElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    			     	 strictEcore.EGenericTypeAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    			     	} else if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    			     	 strictEcore.EModelElementAspect.priv_visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    			     	} else if (_self instanceof java.lang.Object){
    			     	 strictEcore.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     	} else { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static void feedOpposites(final Object _self) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privfeedOpposites(_self); 
  }
  
  public static __SlicerAspect__ObjectAspectProperties _self_;
  
  public static boolean visitedForRelations(final Object _self) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privvisitedForRelations(_self); 
  }
  
  public static void visitedForRelations(final Object _self, final boolean visitedForRelations) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitedForRelations(_self,visitedForRelations); 
  }
  
  public static boolean sliced(final Object _self) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privsliced(_self); 
  }
  
  public static void sliced(final Object _self, final boolean sliced) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privsliced(_self,sliced); 
  }
  
  public static EObject clonedElt(final Object _self) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privclonedElt(_self); 
  }
  
  public static void clonedElt(final Object _self, final EObject clonedElt) {
    strictEcore.__SlicerAspect__ObjectAspectContext _instance = strictEcore.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,strictEcore.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						strictEcore.__SlicerAspect__ObjectAspectProperties prop = new strictEcore.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privclonedElt(_self,clonedElt); 
  }
  
  protected static void privvisitToAddClasses(final Object _self, final StrictEcore theSlicer) {
    InputOutput.<String>println(("addclass SlicerAspect>> " + _self));
    boolean _sliced = __SlicerAspect__.sliced(_self);
    boolean _not = (!_sliced);
    if (_not) {
      __SlicerAspect__.sliced(_self, true);
      __SlicerAspect__._visitToAddClasses(_self, theSlicer);
    }
  }
  
  protected static void priv_visitToAddClasses(final Object _self, final StrictEcore theSlicer) {
  }
  
  protected static void privvisitToAddRelations(final Object _self, final StrictEcore theSlicer) {
    boolean _visitedForRelations = __SlicerAspect__.visitedForRelations(_self);
    boolean _not = (!_visitedForRelations);
    if (_not) {
      __SlicerAspect__.visitedForRelations(_self, true);
      __SlicerAspect__._visitToAddRelations(_self, theSlicer);
    }
  }
  
  protected static void priv_visitToAddRelations(final Object _self, final StrictEcore theSlicer) {
  }
  
  protected static void privfeedOpposites(final Object _self) {
  }
  
  protected static boolean privvisitedForRelations(final Object _self) {
     return strictEcore.__SlicerAspect__._self_.visitedForRelations; 
  }
  
  protected static void privvisitedForRelations(final Object _self, final boolean visitedForRelations) {
    strictEcore.__SlicerAspect__._self_.visitedForRelations = visitedForRelations; 
  }
  
  protected static boolean privsliced(final Object _self) {
     return strictEcore.__SlicerAspect__._self_.sliced; 
  }
  
  protected static void privsliced(final Object _self, final boolean sliced) {
    strictEcore.__SlicerAspect__._self_.sliced = sliced; 
  }
  
  protected static EObject privclonedElt(final Object _self) {
     return strictEcore.__SlicerAspect__._self_.clonedElt; 
  }
  
  protected static void privclonedElt(final Object _self, final EObject clonedElt) {
    strictEcore.__SlicerAspect__._self_.clonedElt = clonedElt; 
  }
}
