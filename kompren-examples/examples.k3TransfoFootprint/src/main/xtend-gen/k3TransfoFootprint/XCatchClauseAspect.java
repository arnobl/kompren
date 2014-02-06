package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XCatchClause.class)
@SuppressWarnings("all")
public class XCatchClauseAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectContext _instance = k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XCatchClause,k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectProperties prop = new k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XCatchClause){
    			     							 k3TransfoFootprint.XCatchClauseAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCatchClause)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectContext _instance = k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XCatchClause,k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectProperties prop = new k3TransfoFootprint.XCatchClauseAspectXCatchClauseAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XCatchClause){
    			     							 k3TransfoFootprint.XCatchClauseAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCatchClause)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static XCatchClauseAspectXCatchClauseAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XCatchClause> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XCatchClause");
    InputOutput.<String>println(_plus_1);
    XCatchClauseAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.visitToAddClasses(_expression, theSlicer);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    if (_declaredParam!=null) {
      __SlicerAspect__.visitToAddClasses(_declaredParam, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XCatchClause> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XCatchClause");
    InputOutput.<String>println(_plus_1);
    XCatchClauseAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _expression = _self.getExpression();
    boolean _notEquals = (!Objects.equal(_expression, null));
    if (_notEquals) {
      XExpression _expression_1 = _self.getExpression();
      __SlicerAspect__.visitToAddRelations(_expression_1, theSlicer);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    boolean _notEquals_1 = (!Objects.equal(_declaredParam, null));
    if (_notEquals_1) {
      JvmFormalParameter _declaredParam_1 = _self.getDeclaredParam();
      __SlicerAspect__.visitToAddRelations(_declaredParam_1, theSlicer);
    }
  }
}
