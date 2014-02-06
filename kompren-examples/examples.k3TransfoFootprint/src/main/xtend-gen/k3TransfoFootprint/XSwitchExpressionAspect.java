package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = XSwitchExpression.class)
@SuppressWarnings("all")
public class XSwitchExpressionAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectContext _instance = k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XSwitchExpression,k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectProperties prop = new k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    			     							 k3TransfoFootprint.XSwitchExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
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
  public static void _visitToAddRelations(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectContext _instance = k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XSwitchExpression,k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectProperties prop = new k3TransfoFootprint.XSwitchExpressionAspectXSwitchExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    			     							 k3TransfoFootprint.XSwitchExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
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
  
  public static XSwitchExpressionAspectXSwitchExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XSwitchExpression> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XSwitchExpression");
    InputOutput.<String>println(_plus_1);
    XSwitchExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _switch = _self.getSwitch();
    if (_switch!=null) {
      __SlicerAspect__.visitToAddClasses(_switch, theSlicer);
    }
    EList<XCasePart> _cases = _self.getCases();
    final Procedure1<XCasePart> _function = new Procedure1<XCasePart>() {
      public void apply(final XCasePart it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<XCasePart>forEach(_cases, _function);
    XExpression _default = _self.getDefault();
    if (_default!=null) {
      __SlicerAspect__.visitToAddClasses(_default, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XSwitchExpression> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XSwitchExpression");
    InputOutput.<String>println(_plus_1);
    XSwitchExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _switch = _self.getSwitch();
    boolean _notEquals = (!Objects.equal(_switch, null));
    if (_notEquals) {
      XExpression _switch_1 = _self.getSwitch();
      __SlicerAspect__.visitToAddRelations(_switch_1, theSlicer);
    }
    EList<XCasePart> _cases = _self.getCases();
    final Procedure1<XCasePart> _function = new Procedure1<XCasePart>() {
      public void apply(final XCasePart _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<XCasePart>forEach(_cases, _function);
    XExpression _default = _self.getDefault();
    boolean _notEquals_1 = (!Objects.equal(_default, null));
    if (_notEquals_1) {
      XExpression _default_1 = _self.getDefault();
      __SlicerAspect__.visitToAddRelations(_default_1, theSlicer);
    }
  }
}
