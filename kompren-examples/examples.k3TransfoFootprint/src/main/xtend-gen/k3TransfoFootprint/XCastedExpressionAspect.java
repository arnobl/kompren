package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectProperties;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XCastedExpression.class)
@SuppressWarnings("all")
public class XCastedExpressionAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectContext _instance = k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XCastedExpression,k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectProperties prop = new k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    			     							 k3TransfoFootprint.XCastedExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
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
  public static void _visitToAddRelations(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectContext _instance = k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XCastedExpression,k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectProperties prop = new k3TransfoFootprint.XCastedExpressionAspectXCastedExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    			     							 k3TransfoFootprint.XCastedExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
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
  
  public static XCastedExpressionAspectXCastedExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XCastedExpression> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XCastedExpression");
    InputOutput.<String>println(_plus_1);
    XCastedExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
    XExpression _target = _self.getTarget();
    if (_target!=null) {
      __SlicerAspect__.visitToAddClasses(_target, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XCastedExpression> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XCastedExpression");
    InputOutput.<String>println(_plus_1);
    XCastedExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _type = _self.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      JvmTypeReference _type_1 = _self.getType();
      __SlicerAspect__.visitToAddRelations(_type_1, theSlicer);
    }
    XExpression _target = _self.getTarget();
    boolean _notEquals_1 = (!Objects.equal(_target, null));
    if (_notEquals_1) {
      XExpression _target_1 = _self.getTarget();
      __SlicerAspect__.visitToAddRelations(_target_1, theSlicer);
    }
  }
}
