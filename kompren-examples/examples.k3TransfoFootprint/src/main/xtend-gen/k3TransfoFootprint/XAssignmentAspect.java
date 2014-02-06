package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XAbstractFeatureCallAspect;
import k3TransfoFootprint.XAssignmentAspectXAssignmentAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XAssignment.class)
@SuppressWarnings("all")
public class XAssignmentAspect extends XAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XAssignment _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XAssignmentAspectXAssignmentAspectContext _instance = k3TransfoFootprint.XAssignmentAspectXAssignmentAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XAssignment,k3TransfoFootprint.XAssignmentAspectXAssignmentAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XAssignmentAspectXAssignmentAspectProperties prop = new k3TransfoFootprint.XAssignmentAspectXAssignmentAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    			     							 k3TransfoFootprint.XAssignmentAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    			     							 k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    			     							 k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XAssignment _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XAssignmentAspectXAssignmentAspectContext _instance = k3TransfoFootprint.XAssignmentAspectXAssignmentAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XAssignment,k3TransfoFootprint.XAssignmentAspectXAssignmentAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XAssignmentAspectXAssignmentAspectProperties prop = new k3TransfoFootprint.XAssignmentAspectXAssignmentAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    			     							 k3TransfoFootprint.XAssignmentAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    			     							 k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    			     							 k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static XAssignmentAspectXAssignmentAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XAssignment _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XAssignment _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XAssignment> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XAssignment");
    InputOutput.<String>println(_plus_1);
    XAssignmentAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _assignable = _self.getAssignable();
    if (_assignable!=null) {
      __SlicerAspect__.visitToAddClasses(_assignable, theSlicer);
    }
    XExpression _value = _self.getValue();
    if (_value!=null) {
      __SlicerAspect__.visitToAddClasses(_value, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XAssignment _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XAssignment _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XAssignment> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XAssignment");
    InputOutput.<String>println(_plus_1);
    XAssignmentAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _assignable = _self.getAssignable();
    boolean _notEquals = (!Objects.equal(_assignable, null));
    if (_notEquals) {
      XExpression _assignable_1 = _self.getAssignable();
      __SlicerAspect__.visitToAddRelations(_assignable_1, theSlicer);
    }
    XExpression _value = _self.getValue();
    boolean _notEquals_1 = (!Objects.equal(_value, null));
    if (_notEquals_1) {
      XExpression _value_1 = _self.getValue();
      __SlicerAspect__.visitToAddRelations(_value_1, theSlicer);
    }
  }
}
