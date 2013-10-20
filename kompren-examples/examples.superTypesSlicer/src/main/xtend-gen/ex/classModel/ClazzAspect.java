package ex.classModel;

import ex.classModel.ClasssuperClasses;
import ex.classModel.Clazz;
import ex.classModel.ClazzAspectClazzAspectProperties;
import ex.classModel.SlicerVisitor;
import ex.classModel.superTypesSlicer;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = Clazz.class)
@SuppressWarnings("all")
public class ClazzAspect extends SlicerVisitor {
  @OverrideAspectMethod
  public static void visitToAddClasses(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
    ex.classModel.ClazzAspectClazzAspectContext _instance = ex.classModel.ClazzAspectClazzAspectContext.getInstance();
    				    java.util.Map<ex.classModel.Clazz,ex.classModel.ClazzAspectClazzAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.ClazzAspectClazzAspectProperties prop = new ex.classModel.ClazzAspectClazzAspectProperties();
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
  
  @OverrideAspectMethod
  public static void visitToAddRelations(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
    ex.classModel.ClazzAspectClazzAspectContext _instance = ex.classModel.ClazzAspectClazzAspectContext.getInstance();
    				    java.util.Map<ex.classModel.Clazz,ex.classModel.ClazzAspectClazzAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						ex.classModel.ClazzAspectClazzAspectProperties prop = new ex.classModel.ClazzAspectClazzAspectProperties();
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
  
  public static ClazzAspectClazzAspectProperties _self_;
  
  private static void super_visitToAddClasses(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
      ex.classModel.SlicerVisitor.privvisitToAddClasses(_self,thesuperTypesSlicer);  
  }
  
  protected static void privvisitToAddClasses(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
    boolean _visitedPass = SlicerVisitor.visitedPass(_self);
    boolean _not = (!_visitedPass);
    if (_not) {
      ClazzAspect.super_visitToAddClasses(_self, thesuperTypesSlicer);
      boolean _sliced = SlicerVisitor.sliced(_self);
      boolean _not_1 = (!_sliced);
      if (_not_1) {
        thesuperTypesSlicer.addedClazzs.add(_self);
        SlicerVisitor.sliced(_self, true);
      }
      SlicerVisitor.visitedPass(_self, true);
      EList<Clazz> _superClasses = _self.getSuperClasses();
      final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
        public void apply(final Clazz it) {
          ClazzAspect.visitToAddClasses(it, thesuperTypesSlicer);
        }
      };
      IterableExtensions.<Clazz>forEach(_superClasses, _function);
    }
  }
  
  private static void super_visitToAddRelations(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
      ex.classModel.SlicerVisitor.privvisitToAddRelations(_self,thesuperTypesSlicer);  
  }
  
  protected static void privvisitToAddRelations(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
    boolean _visitedForRelations = SlicerVisitor.visitedForRelations(_self);
    boolean _not = (!_visitedForRelations);
    if (_not) {
      ClazzAspect.super_visitToAddRelations(_self, thesuperTypesSlicer);
      SlicerVisitor.visitedForRelations(_self, true);
      EList<Clazz> _superClasses = _self.getSuperClasses();
      final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
        public void apply(final Clazz theClazz) {
          ClazzAspect.visitToAddRelations(theClazz, thesuperTypesSlicer);
          boolean _and = false;
          boolean _visitedForRelations = SlicerVisitor.visitedForRelations(_self);
          if (!_visitedForRelations) {
            _and = false;
          } else {
            boolean _visitedForRelations_1 = SlicerVisitor.visitedForRelations(theClazz);
            _and = (_visitedForRelations && _visitedForRelations_1);
          }
          if (_and) {
            ClasssuperClasses _classsuperClasses = new ClasssuperClasses(_self, theClazz);
            thesuperTypesSlicer.addedsuperClasses.add(_classsuperClasses);
          }
        }
      };
      IterableExtensions.<Clazz>forEach(_superClasses, _function);
    }
  }
}
