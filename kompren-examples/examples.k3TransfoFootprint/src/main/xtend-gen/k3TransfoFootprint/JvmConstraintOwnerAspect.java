package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmConstraintOwner;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmConstraintOwner.class)
@SuppressWarnings("all")
public abstract class JvmConstraintOwnerAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectContext _instance = k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmConstraintOwner,k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties prop = new k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmConstraintOwner){
    			     							 k3TransfoFootprint.JvmConstraintOwnerAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmConstraintOwner)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectContext _instance = k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmConstraintOwner,k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties prop = new k3TransfoFootprint.JvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmConstraintOwner){
    			     							 k3TransfoFootprint.JvmConstraintOwnerAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmConstraintOwner)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static JvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmConstraintOwner> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmConstraintOwner");
    InputOutput.<String>println(_plus_1);
    JvmConstraintOwnerAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeConstraint> _constraints = _self.getConstraints();
    final Procedure1<JvmTypeConstraint> _function = new Procedure1<JvmTypeConstraint>() {
      public void apply(final JvmTypeConstraint it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeConstraint>forEach(_constraints, _function);
  }
  
  private static void super__visitToAddRelations(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmConstraintOwner> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmConstraintOwner");
    InputOutput.<String>println(_plus_1);
    JvmConstraintOwnerAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeConstraint> _constraints = _self.getConstraints();
    final Procedure1<JvmTypeConstraint> _function = new Procedure1<JvmTypeConstraint>() {
      public void apply(final JvmTypeConstraint _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeConstraint>forEach(_constraints, _function);
  }
}
