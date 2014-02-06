package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XAbstractFeatureCallAspect;
import k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = XMemberFeatureCall.class)
@SuppressWarnings("all")
public class XMemberFeatureCallAspect extends XAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectContext _instance = k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XMemberFeatureCall,k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectProperties prop = new k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    			     							 k3TransfoFootprint.XMemberFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
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
  public static void _visitToAddRelations(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectContext _instance = k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XMemberFeatureCall,k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectProperties prop = new k3TransfoFootprint.XMemberFeatureCallAspectXMemberFeatureCallAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    			     							 k3TransfoFootprint.XMemberFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
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
  
  public static XMemberFeatureCallAspectXMemberFeatureCallAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XMemberFeatureCall> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XMemberFeatureCall");
    InputOutput.<String>println(_plus_1);
    XMemberFeatureCallAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _memberCallTarget = _self.getMemberCallTarget();
    if (_memberCallTarget!=null) {
      __SlicerAspect__.visitToAddClasses(_memberCallTarget, theSlicer);
    }
    EList<XExpression> _memberCallArguments = _self.getMemberCallArguments();
    final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
      public void apply(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<XExpression>forEach(_memberCallArguments, _function);
  }
  
  private static void super__visitToAddRelations(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XMemberFeatureCall> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XMemberFeatureCall");
    InputOutput.<String>println(_plus_1);
    XMemberFeatureCallAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _memberCallTarget = _self.getMemberCallTarget();
    boolean _notEquals = (!Objects.equal(_memberCallTarget, null));
    if (_notEquals) {
      XExpression _memberCallTarget_1 = _self.getMemberCallTarget();
      __SlicerAspect__.visitToAddRelations(_memberCallTarget_1, theSlicer);
    }
    EList<XExpression> _memberCallArguments = _self.getMemberCallArguments();
    final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
      public void apply(final XExpression _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<XExpression>forEach(_memberCallArguments, _function);
  }
}
