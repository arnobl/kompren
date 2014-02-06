package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XIfExpression.class)
@SuppressWarnings("all")
public class XIfExpressionAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectContext _instance = k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XIfExpression,k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectProperties prop = new k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    			     							 k3TransfoFootprint.XIfExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
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
  public static void _visitToAddRelations(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectContext _instance = k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XIfExpression,k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectProperties prop = new k3TransfoFootprint.XIfExpressionAspectXIfExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    			     							 k3TransfoFootprint.XIfExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
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
  
  public static XIfExpressionAspectXIfExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XIfExpression> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XIfExpression");
    InputOutput.<String>println(_plus_1);
    XIfExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _if = _self.getIf();
    if (_if!=null) {
      __SlicerAspect__.visitToAddClasses(_if, theSlicer);
    }
    XExpression _then = _self.getThen();
    if (_then!=null) {
      __SlicerAspect__.visitToAddClasses(_then, theSlicer);
    }
    XExpression _else = _self.getElse();
    if (_else!=null) {
      __SlicerAspect__.visitToAddClasses(_else, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XIfExpression> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XIfExpression");
    InputOutput.<String>println(_plus_1);
    XIfExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _if = _self.getIf();
    boolean _notEquals = (!Objects.equal(_if, null));
    if (_notEquals) {
      XExpression _if_1 = _self.getIf();
      __SlicerAspect__.visitToAddRelations(_if_1, theSlicer);
    }
    XExpression _then = _self.getThen();
    boolean _notEquals_1 = (!Objects.equal(_then, null));
    if (_notEquals_1) {
      XExpression _then_1 = _self.getThen();
      __SlicerAspect__.visitToAddRelations(_then_1, theSlicer);
    }
    XExpression _else = _self.getElse();
    boolean _notEquals_2 = (!Objects.equal(_else, null));
    if (_notEquals_2) {
      XExpression _else_1 = _self.getElse();
      __SlicerAspect__.visitToAddRelations(_else_1, theSlicer);
    }
  }
}
