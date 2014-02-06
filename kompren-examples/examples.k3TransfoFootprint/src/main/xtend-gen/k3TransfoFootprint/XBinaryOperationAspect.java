package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XAbstractFeatureCallAspect;
import k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XBinaryOperation.class)
@SuppressWarnings("all")
public class XBinaryOperationAspect extends XAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectContext _instance = k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XBinaryOperation,k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectProperties prop = new k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    			     							 k3TransfoFootprint.XBinaryOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
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
  public static void _visitToAddRelations(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectContext _instance = k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XBinaryOperation,k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectProperties prop = new k3TransfoFootprint.XBinaryOperationAspectXBinaryOperationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    			     							 k3TransfoFootprint.XBinaryOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
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
  
  public static XBinaryOperationAspectXBinaryOperationAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XBinaryOperation> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XBinaryOperation");
    InputOutput.<String>println(_plus_1);
    XBinaryOperationAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _leftOperand = _self.getLeftOperand();
    if (_leftOperand!=null) {
      __SlicerAspect__.visitToAddClasses(_leftOperand, theSlicer);
    }
    XExpression _rightOperand = _self.getRightOperand();
    if (_rightOperand!=null) {
      __SlicerAspect__.visitToAddClasses(_rightOperand, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XBinaryOperation> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XBinaryOperation");
    InputOutput.<String>println(_plus_1);
    XBinaryOperationAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _leftOperand = _self.getLeftOperand();
    boolean _notEquals = (!Objects.equal(_leftOperand, null));
    if (_notEquals) {
      XExpression _leftOperand_1 = _self.getLeftOperand();
      __SlicerAspect__.visitToAddRelations(_leftOperand_1, theSlicer);
    }
    XExpression _rightOperand = _self.getRightOperand();
    boolean _notEquals_1 = (!Objects.equal(_rightOperand, null));
    if (_notEquals_1) {
      XExpression _rightOperand_1 = _self.getRightOperand();
      __SlicerAspect__.visitToAddRelations(_rightOperand_1, theSlicer);
    }
  }
}
