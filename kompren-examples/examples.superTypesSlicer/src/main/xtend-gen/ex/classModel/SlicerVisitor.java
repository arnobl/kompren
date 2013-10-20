package ex.classModel;

import ex.classModel.SlicerVisitorObjectAspectProperties;
import ex.classModel.superTypesSlicer;
import fr.inria.triskell.k3.Aspect;

@Aspect(className = Object.class)
@SuppressWarnings("all")
public abstract class SlicerVisitor {
  public static void visitToAddClasses(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitToAddClasses(_self,thesuperTypesSlicer); 
  }
  
  protected static void _visitToAddClasses(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.Clazz){
    			     							 ex.classModel.ClazzAspect.priv_visitToAddClasses((ex.classModel.Clazz)_self,thesuperTypesSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 ex.classModel.SlicerVisitor.priv_visitToAddClasses((java.lang.Object)_self,thesuperTypesSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static void visitToAddRelations(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitToAddRelations(_self,thesuperTypesSlicer); 
  }
  
  protected static void _visitToAddRelations(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.Clazz){
    			     							 ex.classModel.ClazzAspect.priv_visitToAddRelations((ex.classModel.Clazz)_self,thesuperTypesSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 ex.classModel.SlicerVisitor.priv_visitToAddRelations((java.lang.Object)_self,thesuperTypesSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static SlicerVisitorObjectAspectProperties _self_;
  
  public static boolean visitedForRelations(final Object _self) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privvisitedForRelations(_self); 
  }
  
  public static void visitedForRelations(final Object _self, final boolean visitedForRelations) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitedForRelations(_self,visitedForRelations); 
  }
  
  public static boolean sliced(final Object _self) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privsliced(_self); 
  }
  
  public static void sliced(final Object _self, final boolean sliced) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privsliced(_self,sliced); 
  }
  
  protected static void privvisitToAddClasses(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
    boolean _sliced = SlicerVisitor.sliced(_self);
    boolean _not = (!_sliced);
    if (_not) {
      SlicerVisitor.sliced(_self, true);
      SlicerVisitor._visitToAddClasses(_self, thesuperTypesSlicer);
    }
  }
  
  protected static void priv_visitToAddClasses(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
  }
  
  protected static void privvisitToAddRelations(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
    boolean _visitedForRelations = SlicerVisitor.visitedForRelations(_self);
    boolean _not = (!_visitedForRelations);
    if (_not) {
      SlicerVisitor.visitedForRelations(_self, true);
      SlicerVisitor._visitToAddRelations(_self, thesuperTypesSlicer);
    }
  }
  
  protected static void priv_visitToAddRelations(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
  }
  
  protected static boolean privvisitedForRelations(final Object _self) {
     return ex.classModel.SlicerVisitor._self_.visitedForRelations; 
  }
  
  protected static void privvisitedForRelations(final Object _self, final boolean visitedForRelations) {
    ex.classModel.SlicerVisitor._self_.visitedForRelations = visitedForRelations; 
  }
  
  protected static boolean privsliced(final Object _self) {
     return ex.classModel.SlicerVisitor._self_.sliced; 
  }
  
  protected static void privsliced(final Object _self, final boolean sliced) {
    ex.classModel.SlicerVisitor._self_.sliced = sliced; 
  }
}
