package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XAbstractWhileExpressionAspect;
import k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectProperties;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XWhileExpression.class)
@SuppressWarnings("all")
public class XWhileExpressionAspect extends XAbstractWhileExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectContext _instance = k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XWhileExpression,k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectProperties prop = new k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    			     							 k3TransfoFootprint.XWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    			     							 k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
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
  public static void _visitToAddRelations(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectContext _instance = k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XWhileExpression,k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectProperties prop = new k3TransfoFootprint.XWhileExpressionAspectXWhileExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    			     							 k3TransfoFootprint.XWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    			     							 k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
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
  
  public static XWhileExpressionAspectXWhileExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XWhileExpression> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XWhileExpression");
    InputOutput.<String>println(_plus_1);
    XWhileExpressionAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XWhileExpression> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XWhileExpression");
    InputOutput.<String>println(_plus_1);
    XWhileExpressionAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
