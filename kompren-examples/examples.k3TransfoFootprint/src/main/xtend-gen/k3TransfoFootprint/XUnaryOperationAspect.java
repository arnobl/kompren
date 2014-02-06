package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XAbstractFeatureCallAspect;
import k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XUnaryOperation.class)
@SuppressWarnings("all")
public class XUnaryOperationAspect extends XAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XUnaryOperation _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectContext _instance = k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XUnaryOperation,k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectProperties prop = new k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    			     							 k3TransfoFootprint.XUnaryOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
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
  public static void _visitToAddRelations(final XUnaryOperation _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectContext _instance = k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XUnaryOperation,k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectProperties prop = new k3TransfoFootprint.XUnaryOperationAspectXUnaryOperationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    			     							 k3TransfoFootprint.XUnaryOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
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
  
  public static XUnaryOperationAspectXUnaryOperationAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XUnaryOperation _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XUnaryOperation _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XUnaryOperation> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XUnaryOperation");
    InputOutput.<String>println(_plus_1);
    XUnaryOperationAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _operand = _self.getOperand();
    if (_operand!=null) {
      __SlicerAspect__.visitToAddClasses(_operand, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XUnaryOperation _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XUnaryOperation _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XUnaryOperation> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XUnaryOperation");
    InputOutput.<String>println(_plus_1);
    XUnaryOperationAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _operand = _self.getOperand();
    boolean _notEquals = (!Objects.equal(_operand, null));
    if (_notEquals) {
      XExpression _operand_1 = _self.getOperand();
      __SlicerAspect__.visitToAddRelations(_operand_1, theSlicer);
    }
  }
}
