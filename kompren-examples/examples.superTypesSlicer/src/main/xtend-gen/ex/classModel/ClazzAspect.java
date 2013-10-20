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
  public static void _visitToAddClasses(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
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
    			     							 ex.classModel.ClazzAspect.priv_visitToAddClasses((ex.classModel.Clazz)_self,thesuperTypesSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 ex.classModel.SlicerVisitor.priv_visitToAddClasses((java.lang.Object)_self,thesuperTypesSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
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
    			     							 ex.classModel.ClazzAspect.priv_visitToAddRelations((ex.classModel.Clazz)_self,thesuperTypesSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 ex.classModel.SlicerVisitor.priv_visitToAddRelations((java.lang.Object)_self,thesuperTypesSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static ClazzAspectClazzAspectProperties _self_;
  
  private static void super__visitToAddClasses(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
      ex.classModel.SlicerVisitor.priv_visitToAddClasses(_self,thesuperTypesSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
    thesuperTypesSlicer.addedClazzs.add(_self);
    ClazzAspect.super__visitToAddClasses(_self, thesuperTypesSlicer);
    EList<Clazz> _superClasses = _self.getSuperClasses();
    final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
      public void apply(final Clazz it) {
        SlicerVisitor.visitToAddClasses(it, thesuperTypesSlicer);
      }
    };
    IterableExtensions.<Clazz>forEach(_superClasses, _function);
  }
  
  private static void super__visitToAddRelations(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
      ex.classModel.SlicerVisitor.priv_visitToAddRelations(_self,thesuperTypesSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final Clazz _self, final superTypesSlicer thesuperTypesSlicer) {
    ClazzAspect.super__visitToAddRelations(_self, thesuperTypesSlicer);
    EList<Clazz> _superClasses = _self.getSuperClasses();
    final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
      public void apply(final Clazz theClazz) {
        SlicerVisitor.visitToAddRelations(theClazz, thesuperTypesSlicer);
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
