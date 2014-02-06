package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XExpressionAspectXExpressionAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XExpression.class)
@SuppressWarnings("all")
public abstract class XExpressionAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XExpressionAspectXExpressionAspectContext _instance = k3TransfoFootprint.XExpressionAspectXExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XExpression,k3TransfoFootprint.XExpressionAspectXExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XExpressionAspectXExpressionAspectProperties prop = new k3TransfoFootprint.XExpressionAspectXExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    			     							 k3TransfoFootprint.XIfExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    			     							 k3TransfoFootprint.XSwitchExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBlockExpression){
    			     							 k3TransfoFootprint.XBlockExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XBlockExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    			     							 k3TransfoFootprint.XVariableDeclarationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    			     							 k3TransfoFootprint.XMemberFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    			     							 k3TransfoFootprint.XFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    			     							 k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    			     							 k3TransfoFootprint.XConstructorCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBooleanLiteral){
    			     							 k3TransfoFootprint.XBooleanLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XBooleanLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XNullLiteral){
    			     							 k3TransfoFootprint.XNullLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XNullLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XNumberLiteral){
    			     							 k3TransfoFootprint.XNumberLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XNumberLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    			     							 k3TransfoFootprint.XStringLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XListLiteral){
    			     							 k3TransfoFootprint.XListLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XListLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
    			     							 k3TransfoFootprint.XSetLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XSetLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCollectionLiteral){
    			     							 k3TransfoFootprint.XCollectionLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCollectionLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    			     							 k3TransfoFootprint.XClosureAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    			     							 k3TransfoFootprint.XCastedExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    			     							 k3TransfoFootprint.XBinaryOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    			     							 k3TransfoFootprint.XUnaryOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    			     							 k3TransfoFootprint.XForLoopExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    			     							 k3TransfoFootprint.XDoWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    			     							 k3TransfoFootprint.XWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    			     							 k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XTypeLiteral){
    			     							 k3TransfoFootprint.XTypeLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XTypeLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    			     							 k3TransfoFootprint.XAssignmentAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
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
  public static void _visitToAddRelations(final XExpression _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XExpressionAspectXExpressionAspectContext _instance = k3TransfoFootprint.XExpressionAspectXExpressionAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XExpression,k3TransfoFootprint.XExpressionAspectXExpressionAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XExpressionAspectXExpressionAspectProperties prop = new k3TransfoFootprint.XExpressionAspectXExpressionAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    			     							 k3TransfoFootprint.XIfExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    			     							 k3TransfoFootprint.XSwitchExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBlockExpression){
    			     							 k3TransfoFootprint.XBlockExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XBlockExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    			     							 k3TransfoFootprint.XVariableDeclarationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    			     							 k3TransfoFootprint.XMemberFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    			     							 k3TransfoFootprint.XFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    			     							 k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    			     							 k3TransfoFootprint.XConstructorCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBooleanLiteral){
    			     							 k3TransfoFootprint.XBooleanLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XBooleanLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XNullLiteral){
    			     							 k3TransfoFootprint.XNullLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XNullLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XNumberLiteral){
    			     							 k3TransfoFootprint.XNumberLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XNumberLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    			     							 k3TransfoFootprint.XStringLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XListLiteral){
    			     							 k3TransfoFootprint.XListLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XListLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
    			     							 k3TransfoFootprint.XSetLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XSetLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCollectionLiteral){
    			     							 k3TransfoFootprint.XCollectionLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCollectionLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    			     							 k3TransfoFootprint.XClosureAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    			     							 k3TransfoFootprint.XCastedExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    			     							 k3TransfoFootprint.XBinaryOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    			     							 k3TransfoFootprint.XUnaryOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    			     							 k3TransfoFootprint.XForLoopExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    			     							 k3TransfoFootprint.XDoWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    			     							 k3TransfoFootprint.XWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    			     							 k3TransfoFootprint.XAbstractWhileExpressionAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XTypeLiteral){
    			     							 k3TransfoFootprint.XTypeLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XTypeLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    			     							 k3TransfoFootprint.XAssignmentAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
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
  
  public static XExpressionAspectXExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XExpression> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XExpression");
    InputOutput.<String>println(_plus_1);
    XExpressionAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final XExpression _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XExpression _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XExpression> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XExpression");
    InputOutput.<String>println(_plus_1);
    XExpressionAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
