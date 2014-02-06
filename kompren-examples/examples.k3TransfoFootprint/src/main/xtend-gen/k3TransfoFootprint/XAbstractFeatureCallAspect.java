package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = XAbstractFeatureCall.class)
@SuppressWarnings("all")
public abstract class XAbstractFeatureCallAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectContext _instance = k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XAbstractFeatureCall,k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties prop = new k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    			     							 k3TransfoFootprint.XMemberFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    			     							 k3TransfoFootprint.XFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    			     							 k3TransfoFootprint.XBinaryOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    			     							 k3TransfoFootprint.XUnaryOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    			     							 k3TransfoFootprint.XAssignmentAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
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
  public static void _visitToAddRelations(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectContext _instance = k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XAbstractFeatureCall,k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties prop = new k3TransfoFootprint.XAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    			     							 k3TransfoFootprint.XMemberFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    			     							 k3TransfoFootprint.XFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    			     							 k3TransfoFootprint.XBinaryOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    			     							 k3TransfoFootprint.XUnaryOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    			     							 k3TransfoFootprint.XAssignmentAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
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
  
  public static XAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XAbstractFeatureCall> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XAbstractFeatureCall");
    InputOutput.<String>println(_plus_1);
    XAbstractFeatureCallAspect.super__visitToAddClasses(_self, theSlicer);
    JvmIdentifiableElement _feature = _self.getFeature();
    if (_feature!=null) {
      __SlicerAspect__.visitToAddClasses(_feature, theSlicer);
    }
    EList<JvmTypeReference> _typeArguments = _self.getTypeArguments();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_typeArguments, _function);
    XExpression _implicitReceiver = _self.getImplicitReceiver();
    if (_implicitReceiver!=null) {
      __SlicerAspect__.visitToAddClasses(_implicitReceiver, theSlicer);
    }
    XExpression _implicitFirstArgument = _self.getImplicitFirstArgument();
    if (_implicitFirstArgument!=null) {
      __SlicerAspect__.visitToAddClasses(_implicitFirstArgument, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XAbstractFeatureCall> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XAbstractFeatureCall");
    InputOutput.<String>println(_plus_1);
    XAbstractFeatureCallAspect.super__visitToAddRelations(_self, theSlicer);
    JvmIdentifiableElement _feature = _self.getFeature();
    boolean _notEquals = (!Objects.equal(_feature, null));
    if (_notEquals) {
      JvmIdentifiableElement _feature_1 = _self.getFeature();
      __SlicerAspect__.visitToAddRelations(_feature_1, theSlicer);
    }
    EList<JvmTypeReference> _typeArguments = _self.getTypeArguments();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_typeArguments, _function);
    XExpression _implicitReceiver = _self.getImplicitReceiver();
    boolean _notEquals_1 = (!Objects.equal(_implicitReceiver, null));
    if (_notEquals_1) {
      XExpression _implicitReceiver_1 = _self.getImplicitReceiver();
      __SlicerAspect__.visitToAddRelations(_implicitReceiver_1, theSlicer);
    }
    XExpression _implicitFirstArgument = _self.getImplicitFirstArgument();
    boolean _notEquals_2 = (!Objects.equal(_implicitFirstArgument, null));
    if (_notEquals_2) {
      XExpression _implicitFirstArgument_1 = _self.getImplicitFirstArgument();
      __SlicerAspect__.visitToAddRelations(_implicitFirstArgument_1, theSlicer);
    }
  }
}
