package lowerTypesSlicer;

import ex.classModel.ClassModel;
import ex.classModel.Clazz;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import lowerTypesSlicer.ClassModelAspectClassModelAspectProperties;
import lowerTypesSlicer.LowerTypesSlicer;
import lowerTypesSlicer.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = ClassModel.class)
@SuppressWarnings("all")
public class ClassModelAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void feedOpposites(final ClassModel _self) {
    lowerTypesSlicer.ClassModelAspectClassModelAspectContext _instance = lowerTypesSlicer.ClassModelAspectClassModelAspectContext.getInstance();
    				    java.util.Map<ex.classModel.ClassModel,lowerTypesSlicer.ClassModelAspectClassModelAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.ClassModelAspectClassModelAspectProperties prop = new lowerTypesSlicer.ClassModelAspectClassModelAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.ClassModel){
    			     							 lowerTypesSlicer.ClassModelAspect.privfeedOpposites((ex.classModel.ClassModel)_self);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 lowerTypesSlicer.__SlicerAspect__.privfeedOpposites((java.lang.Object)_self);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final ClassModel _self, final LowerTypesSlicer theSlicer) {
    lowerTypesSlicer.ClassModelAspectClassModelAspectContext _instance = lowerTypesSlicer.ClassModelAspectClassModelAspectContext.getInstance();
    				    java.util.Map<ex.classModel.ClassModel,lowerTypesSlicer.ClassModelAspectClassModelAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.ClassModelAspectClassModelAspectProperties prop = new lowerTypesSlicer.ClassModelAspectClassModelAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.ClassModel){
    			     							 lowerTypesSlicer.ClassModelAspect.priv_visitToAddClasses((ex.classModel.ClassModel)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 lowerTypesSlicer.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final ClassModel _self, final LowerTypesSlicer theSlicer) {
    lowerTypesSlicer.ClassModelAspectClassModelAspectContext _instance = lowerTypesSlicer.ClassModelAspectClassModelAspectContext.getInstance();
    				    java.util.Map<ex.classModel.ClassModel,lowerTypesSlicer.ClassModelAspectClassModelAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.ClassModelAspectClassModelAspectProperties prop = new lowerTypesSlicer.ClassModelAspectClassModelAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.ClassModel){
    			     							 lowerTypesSlicer.ClassModelAspect.priv_visitToAddRelations((ex.classModel.ClassModel)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 lowerTypesSlicer.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static ClassModelAspectClassModelAspectProperties _self_;
  
  private static void super_feedOpposites(final ClassModel _self) {
      lowerTypesSlicer.__SlicerAspect__.privfeedOpposites(_self);  
  }
  
  protected static void privfeedOpposites(final ClassModel _self) {
    EList<Clazz> _classes = _self.getClasses();
    final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
      public void apply(final Clazz it) {
        __SlicerAspect__.feedOpposites(it);
      }
    };
    IterableExtensions.<Clazz>forEach(_classes, _function);
  }
  
  private static void super__visitToAddClasses(final ClassModel _self, final LowerTypesSlicer theSlicer) {
      lowerTypesSlicer.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final ClassModel _self, final LowerTypesSlicer theSlicer) {
    ClassModelAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final ClassModel _self, final LowerTypesSlicer theSlicer) {
      lowerTypesSlicer.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final ClassModel _self, final LowerTypesSlicer theSlicer) {
    ClassModelAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
