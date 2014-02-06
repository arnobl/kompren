package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XAbstractWhileExpressionAspect;
import k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectProperties;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XDoWhileExpression.class)
@SuppressWarnings("all")
public class XDoWhileExpressionAspect extends XAbstractWhileExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XDoWhileExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectContext _instance = k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XDoWhileExpression,k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectProperties prop = new k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    			     							 k3TransfoFootprint.XDoWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
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
  public static void _visitToAddRelations(final XDoWhileExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectContext _instance = k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XDoWhileExpression,k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectProperties prop = new k3TransfoFootprint.XDoWhileExpressionAspectXDoWhileExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    			     							 k3TransfoFootprint.XDoWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
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
  
  public static XDoWhileExpressionAspectXDoWhileExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XDoWhileExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XDoWhileExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XDoWhileExpression> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XDoWhileExpression");
    InputOutput.<String>println(_plus_1);
    XDoWhileExpressionAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final XDoWhileExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XDoWhileExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XDoWhileExpression> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XDoWhileExpression");
    InputOutput.<String>println(_plus_1);
    XDoWhileExpressionAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
