package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectProperties;
import k3TransfoFootprint.JvmTypeConstraintAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmLowerBound.class)
@SuppressWarnings("all")
public class JvmLowerBoundAspect extends JvmTypeConstraintAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmLowerBound _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectContext _instance = k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmLowerBound,k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectProperties prop = new k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmLowerBound){
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
  public static void _visitToAddRelations(final JvmLowerBound _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectContext _instance = k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmLowerBound,k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectProperties prop = new k3TransfoFootprint.JvmLowerBoundAspectJvmLowerBoundAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmLowerBound){
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
  
  public static JvmLowerBoundAspectJvmLowerBoundAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmLowerBound _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeConstraintAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmLowerBound _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmLowerBound> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmLowerBound");
    InputOutput.<String>println(_plus_1);
    JvmLowerBoundAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmLowerBound _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeConstraintAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmLowerBound _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmLowerBound> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmLowerBound");
    InputOutput.<String>println(_plus_1);
    JvmLowerBoundAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
