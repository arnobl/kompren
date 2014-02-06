package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmTypeConstraintAspect;
import k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmUpperBound.class)
@SuppressWarnings("all")
public class JvmUpperBoundAspect extends JvmTypeConstraintAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmUpperBound _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectContext _instance = k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmUpperBound,k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectProperties prop = new k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmUpperBound){
    			     							 k3TransfoFootprint.JvmUpperBoundAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmUpperBound)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmUpperBound _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectContext _instance = k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmUpperBound,k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectProperties prop = new k3TransfoFootprint.JvmUpperBoundAspectJvmUpperBoundAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmUpperBound){
    			     							 k3TransfoFootprint.JvmUpperBoundAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmUpperBound)_self,theSlicer);
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
  
  public static JvmUpperBoundAspectJvmUpperBoundAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmUpperBound _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeConstraintAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmUpperBound _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmUpperBound> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmUpperBound");
    InputOutput.<String>println(_plus_1);
    JvmUpperBoundAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmUpperBound _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeConstraintAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmUpperBound _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmUpperBound> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmUpperBound");
    InputOutput.<String>println(_plus_1);
    JvmUpperBoundAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
