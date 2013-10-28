package lowerTypesSlicer;

import fr.inria.triskell.k3.Aspect;
import lowerTypesSlicer.LowerTypesSlicer;
import lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties;

@Aspect(className = Object.class)
@SuppressWarnings("all")
public abstract class __SlicerAspect__ {
  public static void visitToAddClasses(final Object _self, final LowerTypesSlicer theSlicer) {
    lowerTypesSlicer.__SlicerAspect__ObjectAspectContext _instance = lowerTypesSlicer.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties prop = new lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitToAddClasses(_self,theSlicer); 
  }
  
  protected static void _visitToAddClasses(final Object _self, final LowerTypesSlicer theSlicer) {
    lowerTypesSlicer.__SlicerAspect__ObjectAspectContext _instance = lowerTypesSlicer.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties prop = new lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.ClassModel){
    			     							 lowerTypesSlicer.ClassModelAspect.priv_visitToAddClasses((ex.classModel.ClassModel)_self,theSlicer);
    			     							} else    if (_self instanceof ex.classModel.Clazz){
    			     							 lowerTypesSlicer.ClazzAspect.priv_visitToAddClasses((ex.classModel.Clazz)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 lowerTypesSlicer.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static void visitToAddRelations(final Object _self, final LowerTypesSlicer theSlicer) {
    lowerTypesSlicer.__SlicerAspect__ObjectAspectContext _instance = lowerTypesSlicer.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties prop = new lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitToAddRelations(_self,theSlicer); 
  }
  
  protected static void _visitToAddRelations(final Object _self, final LowerTypesSlicer theSlicer) {
    lowerTypesSlicer.__SlicerAspect__ObjectAspectContext _instance = lowerTypesSlicer.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties prop = new lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.ClassModel){
    			     							 lowerTypesSlicer.ClassModelAspect.priv_visitToAddRelations((ex.classModel.ClassModel)_self,theSlicer);
    			     							} else    if (_self instanceof ex.classModel.Clazz){
    			     							 lowerTypesSlicer.ClazzAspect.priv_visitToAddRelations((ex.classModel.Clazz)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 lowerTypesSlicer.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static void feedOpposites(final Object _self) {
    lowerTypesSlicer.__SlicerAspect__ObjectAspectContext _instance = lowerTypesSlicer.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties prop = new lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.ClassModel){
    			     							 lowerTypesSlicer.ClassModelAspect.privfeedOpposites((ex.classModel.ClassModel)_self);
    			     							} else    if (_self instanceof ex.classModel.Clazz){
    			     							 lowerTypesSlicer.ClazzAspect.privfeedOpposites((ex.classModel.Clazz)_self);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 lowerTypesSlicer.__SlicerAspect__.privfeedOpposites((java.lang.Object)_self);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static __SlicerAspect__ObjectAspectProperties _self_;
  
  public static boolean visitedForRelations(final Object _self) {
    lowerTypesSlicer.__SlicerAspect__ObjectAspectContext _instance = lowerTypesSlicer.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties prop = new lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privvisitedForRelations(_self); 
  }
  
  public static void visitedForRelations(final Object _self, final boolean visitedForRelations) {
    lowerTypesSlicer.__SlicerAspect__ObjectAspectContext _instance = lowerTypesSlicer.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties prop = new lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitedForRelations(_self,visitedForRelations); 
  }
  
  public static boolean sliced(final Object _self) {
    lowerTypesSlicer.__SlicerAspect__ObjectAspectContext _instance = lowerTypesSlicer.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties prop = new lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privsliced(_self); 
  }
  
  public static void sliced(final Object _self, final boolean sliced) {
    lowerTypesSlicer.__SlicerAspect__ObjectAspectContext _instance = lowerTypesSlicer.__SlicerAspect__ObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties prop = new lowerTypesSlicer.__SlicerAspect__ObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privsliced(_self,sliced); 
  }
  
  protected static void privvisitToAddClasses(final Object _self, final LowerTypesSlicer theSlicer) {
    boolean _sliced = __SlicerAspect__.sliced(_self);
    boolean _not = (!_sliced);
    if (_not) {
      __SlicerAspect__.sliced(_self, true);
      __SlicerAspect__._visitToAddClasses(_self, theSlicer);
    }
  }
  
  protected static void priv_visitToAddClasses(final Object _self, final LowerTypesSlicer theSlicer) {
  }
  
  protected static void privvisitToAddRelations(final Object _self, final LowerTypesSlicer theSlicer) {
    boolean _visitedForRelations = __SlicerAspect__.visitedForRelations(_self);
    boolean _not = (!_visitedForRelations);
    if (_not) {
      __SlicerAspect__.visitedForRelations(_self, true);
      __SlicerAspect__._visitToAddRelations(_self, theSlicer);
    }
  }
  
  protected static void priv_visitToAddRelations(final Object _self, final LowerTypesSlicer theSlicer) {
  }
  
  protected static void privfeedOpposites(final Object _self) {
  }
  
  protected static boolean privvisitedForRelations(final Object _self) {
     return lowerTypesSlicer.__SlicerAspect__._self_.visitedForRelations; 
  }
  
  protected static void privvisitedForRelations(final Object _self, final boolean visitedForRelations) {
    lowerTypesSlicer.__SlicerAspect__._self_.visitedForRelations = visitedForRelations; 
  }
  
  protected static boolean privsliced(final Object _self) {
     return lowerTypesSlicer.__SlicerAspect__._self_.sliced; 
  }
  
  protected static void privsliced(final Object _self, final boolean sliced) {
    lowerTypesSlicer.__SlicerAspect__._self_.sliced = sliced; 
  }
}
