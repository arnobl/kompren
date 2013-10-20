package ex.classModel;

import ex.classModel.SlicerVisitorObjectAspectProperties;
import ex.classModel.superTypesSlicer;
import fr.inria.triskell.k3.Aspect;

@Aspect(className = Object.class)
@SuppressWarnings("all")
public abstract class SlicerVisitor {
  public static void initialiseAttributes(final Object _self, final int pass) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privinitialiseAttributes(_self,pass); 
  }
  
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
    			        if (_self instanceof ex.classModel.Clazz){
    			     							 ex.classModel.ClazzAspect.privvisitToAddClasses((ex.classModel.Clazz)_self,thesuperTypesSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 ex.classModel.SlicerVisitor.privvisitToAddClasses((java.lang.Object)_self,thesuperTypesSlicer);
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
    			        if (_self instanceof ex.classModel.Clazz){
    			     							 ex.classModel.ClazzAspect.privvisitToAddRelations((ex.classModel.Clazz)_self,thesuperTypesSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 ex.classModel.SlicerVisitor.privvisitToAddRelations((java.lang.Object)_self,thesuperTypesSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static boolean checkCanReallyBeAdded(final Object _self) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privcheckCanReallyBeAdded(_self); 
  }
  
  public static SlicerVisitorObjectAspectProperties _self_;
  
  public static boolean visitedPass(final Object _self) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privvisitedPass(_self); 
  }
  
  public static void visitedPass(final Object _self, final boolean visitedPass) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privvisitedPass(_self,visitedPass); 
  }
  
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
  
  public static int idPass(final Object _self) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return prividPass(_self); 
  }
  
  public static void idPass(final Object _self, final int idPass) {
    ex.classModel.SlicerVisitorObjectAspectContext _instance = ex.classModel.SlicerVisitorObjectAspectContext.getInstance();
    				    java.util.Map<java.lang.Object,ex.classModel.SlicerVisitorObjectAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.SlicerVisitorObjectAspectProperties prop = new ex.classModel.SlicerVisitorObjectAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      prividPass(_self,idPass); 
  }
  
  protected static void privinitialiseAttributes(final Object _self, final int pass) {
    SlicerVisitor.visitedPass(_self, false);
    SlicerVisitor.sliced(_self, false);
    SlicerVisitor.visitedForRelations(_self, false);
    SlicerVisitor.idPass(_self, pass);
  }
  
  protected static void privvisitToAddClasses(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
    SlicerVisitor.visitedPass(_self, true);
  }
  
  protected static void privvisitToAddRelations(final Object _self, final superTypesSlicer thesuperTypesSlicer) {
  }
  
  protected static boolean privcheckCanReallyBeAdded(final Object _self) {
    SlicerVisitor.visitedPass(_self, true);
    return true;
  }
  
  protected static boolean privvisitedPass(final Object _self) {
     return ex.classModel.SlicerVisitor._self_.visitedPass; 
  }
  
  protected static void privvisitedPass(final Object _self, final boolean visitedPass) {
    ex.classModel.SlicerVisitor._self_.visitedPass = visitedPass; 
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
  
  protected static int prividPass(final Object _self) {
     return ex.classModel.SlicerVisitor._self_.idPass; 
  }
  
  protected static void prividPass(final Object _self, final int idPass) {
    ex.classModel.SlicerVisitor._self_.idPass = idPass; 
  }
}
