package lowerTypesSlicer;

import ex.classModel.Clazz;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import java.util.List;
import lowerTypesSlicer.ClazzAspectClazzAspectProperties;
import lowerTypesSlicer.LowerTypesSlicer;
import lowerTypesSlicer.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = Clazz.class)
@SuppressWarnings("all")
public class ClazzAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void feedOpposites(final Clazz _self) {
    lowerTypesSlicer.ClazzAspectClazzAspectContext _instance = lowerTypesSlicer.ClazzAspectClazzAspectContext.getInstance();
    				    java.util.Map<ex.classModel.Clazz,lowerTypesSlicer.ClazzAspectClazzAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.ClazzAspectClazzAspectProperties prop = new lowerTypesSlicer.ClazzAspectClazzAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.Clazz){
    			     							 lowerTypesSlicer.ClazzAspect.privfeedOpposites((ex.classModel.Clazz)_self);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 lowerTypesSlicer.__SlicerAspect__.privfeedOpposites((java.lang.Object)_self);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final Clazz _self, final LowerTypesSlicer theSlicer) {
    lowerTypesSlicer.ClazzAspectClazzAspectContext _instance = lowerTypesSlicer.ClazzAspectClazzAspectContext.getInstance();
    				    java.util.Map<ex.classModel.Clazz,lowerTypesSlicer.ClazzAspectClazzAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.ClazzAspectClazzAspectProperties prop = new lowerTypesSlicer.ClazzAspectClazzAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.Clazz){
    			     							 lowerTypesSlicer.ClazzAspect.priv_visitToAddClasses((ex.classModel.Clazz)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 lowerTypesSlicer.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final Clazz _self, final LowerTypesSlicer theSlicer) {
    lowerTypesSlicer.ClazzAspectClazzAspectContext _instance = lowerTypesSlicer.ClazzAspectClazzAspectContext.getInstance();
    				    java.util.Map<ex.classModel.Clazz,lowerTypesSlicer.ClazzAspectClazzAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.ClazzAspectClazzAspectProperties prop = new lowerTypesSlicer.ClazzAspectClazzAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof ex.classModel.Clazz){
    			     							 lowerTypesSlicer.ClazzAspect.priv_visitToAddRelations((ex.classModel.Clazz)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 lowerTypesSlicer.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static ClazzAspectClazzAspectProperties _self_;
  
  public static List<Clazz> lowerType(final Clazz _self) {
    lowerTypesSlicer.ClazzAspectClazzAspectContext _instance = lowerTypesSlicer.ClazzAspectClazzAspectContext.getInstance();
    				    java.util.Map<ex.classModel.Clazz,lowerTypesSlicer.ClazzAspectClazzAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.ClazzAspectClazzAspectProperties prop = new lowerTypesSlicer.ClazzAspectClazzAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			     return privlowerType(_self); 
  }
  
  public static void lowerType(final Clazz _self, final List<Clazz> lowerType) {
    lowerTypesSlicer.ClazzAspectClazzAspectContext _instance = lowerTypesSlicer.ClazzAspectClazzAspectContext.getInstance();
    				    java.util.Map<ex.classModel.Clazz,lowerTypesSlicer.ClazzAspectClazzAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						lowerTypesSlicer.ClazzAspectClazzAspectProperties prop = new lowerTypesSlicer.ClazzAspectClazzAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			      privlowerType(_self,lowerType); 
  }
  
  private static void super_feedOpposites(final Clazz _self) {
      lowerTypesSlicer.__SlicerAspect__.privfeedOpposites(_self);  
  }
  
  protected static void privfeedOpposites(final Clazz _self) {
    EList<Clazz> _superClasses = _self.getSuperClasses();
    final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
      public void apply(final Clazz it) {
        List<Clazz> _lowerType = ClazzAspect.lowerType(it);
        _lowerType.add(_self);
      }
    };
    IterableExtensions.<Clazz>forEach(_superClasses, _function);
  }
  
  private static void super__visitToAddClasses(final Clazz _self, final LowerTypesSlicer theSlicer) {
      lowerTypesSlicer.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final Clazz _self, final LowerTypesSlicer theSlicer) {
    theSlicer.onClazzSliced(_self);
    ClazzAspect.super__visitToAddClasses(_self, theSlicer);
    List<Clazz> _lowerType = ClazzAspect.lowerType(_self);
    final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
      public void apply(final Clazz it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<Clazz>forEach(_lowerType, _function);
  }
  
  private static void super__visitToAddRelations(final Clazz _self, final LowerTypesSlicer theSlicer) {
      lowerTypesSlicer.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final Clazz _self, final LowerTypesSlicer theSlicer) {
    ClazzAspect.super__visitToAddRelations(_self, theSlicer);
    List<Clazz> _lowerType = ClazzAspect.lowerType(_self);
    final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
      public void apply(final Clazz _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _sliced = __SlicerAspect__.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          boolean _sliced_1 = __SlicerAspect__.sliced(_elt);
          _and = (_sliced && _sliced_1);
        }
        if (_and) {
          theSlicer.onlowerTypeSliced(_self, _elt);
        }
      }
    };
    IterableExtensions.<Clazz>forEach(_lowerType, _function);
  }
  
  protected static List<Clazz> privlowerType(final Clazz _self) {
     return lowerTypesSlicer.ClazzAspect._self_.lowerType; 
  }
  
  protected static void privlowerType(final Clazz _self, final List<Clazz> lowerType) {
    lowerTypesSlicer.ClazzAspect._self_.lowerType = lowerType; 
  }
}
