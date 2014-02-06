package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XForLoopExpression.class)
@SuppressWarnings("all")
public class XForLoopExpressionAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectContext _instance = k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XForLoopExpression,k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectProperties prop = new k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    			     							 k3TransfoFootprint.XForLoopExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
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
  public static void _visitToAddRelations(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectContext _instance = k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XForLoopExpression,k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectProperties prop = new k3TransfoFootprint.XForLoopExpressionAspectXForLoopExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    			     							 k3TransfoFootprint.XForLoopExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
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
  
  public static XForLoopExpressionAspectXForLoopExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XForLoopExpression> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XForLoopExpression");
    InputOutput.<String>println(_plus_1);
    XForLoopExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _forExpression = _self.getForExpression();
    if (_forExpression!=null) {
      __SlicerAspect__.visitToAddClasses(_forExpression, theSlicer);
    }
    XExpression _eachExpression = _self.getEachExpression();
    if (_eachExpression!=null) {
      __SlicerAspect__.visitToAddClasses(_eachExpression, theSlicer);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    if (_declaredParam!=null) {
      __SlicerAspect__.visitToAddClasses(_declaredParam, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XForLoopExpression> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XForLoopExpression");
    InputOutput.<String>println(_plus_1);
    XForLoopExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _forExpression = _self.getForExpression();
    boolean _notEquals = (!Objects.equal(_forExpression, null));
    if (_notEquals) {
      XExpression _forExpression_1 = _self.getForExpression();
      __SlicerAspect__.visitToAddRelations(_forExpression_1, theSlicer);
    }
    XExpression _eachExpression = _self.getEachExpression();
    boolean _notEquals_1 = (!Objects.equal(_eachExpression, null));
    if (_notEquals_1) {
      XExpression _eachExpression_1 = _self.getEachExpression();
      __SlicerAspect__.visitToAddRelations(_eachExpression_1, theSlicer);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    boolean _notEquals_2 = (!Objects.equal(_declaredParam, null));
    if (_notEquals_2) {
      JvmFormalParameter _declaredParam_1 = _self.getDeclaredParam();
      __SlicerAspect__.visitToAddRelations(_declaredParam_1, theSlicer);
    }
  }
}
