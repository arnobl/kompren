package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.xbase.XAbstractWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XAbstractWhileExpression.class)
@SuppressWarnings("all")
public abstract class XAbstractWhileExpressionAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectContext _instance = k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XAbstractWhileExpression,k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties prop = new k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    			     							 k3TransfoFootprint.XDoWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
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
  public static void _visitToAddRelations(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectContext _instance = k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XAbstractWhileExpression,k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties prop = new k3TransfoFootprint.XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    			     							 k3TransfoFootprint.XDoWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
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
  
  public static XAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XAbstractWhileExpression> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XAbstractWhileExpression");
    InputOutput.<String>println(_plus_1);
    XAbstractWhileExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _predicate = _self.getPredicate();
    if (_predicate!=null) {
      __SlicerAspect__.visitToAddClasses(_predicate, theSlicer);
    }
    XExpression _body = _self.getBody();
    if (_body!=null) {
      __SlicerAspect__.visitToAddClasses(_body, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XAbstractWhileExpression> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XAbstractWhileExpression");
    InputOutput.<String>println(_plus_1);
    XAbstractWhileExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _predicate = _self.getPredicate();
    boolean _notEquals = (!Objects.equal(_predicate, null));
    if (_notEquals) {
      XExpression _predicate_1 = _self.getPredicate();
      __SlicerAspect__.visitToAddRelations(_predicate_1, theSlicer);
    }
    XExpression _body = _self.getBody();
    boolean _notEquals_1 = (!Objects.equal(_body, null));
    if (_notEquals_1) {
      XExpression _body_1 = _self.getBody();
      __SlicerAspect__.visitToAddRelations(_body_1, theSlicer);
    }
  }
}
