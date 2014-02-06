package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmConstraintOwner;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmTypeConstraint.class)
@SuppressWarnings("all")
public abstract class JvmTypeConstraintAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectContext _instance = k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeConstraint,k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectProperties prop = new k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmUpperBound){
    			     							 k3TransfoFootprint.JvmUpperBoundAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmUpperBound)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmLowerBound){
    			     							 k3TransfoFootprint.JvmLowerBoundAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmLowerBound)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeConstraint){
    			     							 k3TransfoFootprint.JvmTypeConstraintAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeConstraint)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectContext _instance = k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeConstraint,k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectProperties prop = new k3TransfoFootprint.JvmTypeConstraintAspectJvmTypeConstraintAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmUpperBound){
    			     							 k3TransfoFootprint.JvmUpperBoundAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmUpperBound)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmLowerBound){
    			     							 k3TransfoFootprint.JvmLowerBoundAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmLowerBound)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeConstraint){
    			     							 k3TransfoFootprint.JvmTypeConstraintAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeConstraint)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static JvmTypeConstraintAspectJvmTypeConstraintAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeConstraint> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmTypeConstraint");
    InputOutput.<String>println(_plus_1);
    JvmTypeConstraintAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _typeReference = _self.getTypeReference();
    if (_typeReference!=null) {
      __SlicerAspect__.visitToAddClasses(_typeReference, theSlicer);
    }
    JvmConstraintOwner _owner = _self.getOwner();
    if (_owner!=null) {
      __SlicerAspect__.visitToAddClasses(_owner, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeConstraint> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmTypeConstraint");
    InputOutput.<String>println(_plus_1);
    JvmTypeConstraintAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _typeReference = _self.getTypeReference();
    boolean _notEquals = (!Objects.equal(_typeReference, null));
    if (_notEquals) {
      JvmTypeReference _typeReference_1 = _self.getTypeReference();
      __SlicerAspect__.visitToAddRelations(_typeReference_1, theSlicer);
    }
    JvmConstraintOwner _owner = _self.getOwner();
    boolean _notEquals_1 = (!Objects.equal(_owner, null));
    if (_notEquals_1) {
      JvmConstraintOwner _owner_1 = _self.getOwner();
      __SlicerAspect__.visitToAddRelations(_owner_1, theSlicer);
    }
  }
}
