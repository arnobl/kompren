package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XAbstractFeatureCallAspect;
import k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = XFeatureCall.class)
@SuppressWarnings("all")
public class XFeatureCallAspect extends XAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectContext _instance = k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XFeatureCall,k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectProperties prop = new k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    			     							 k3TransfoFootprint.XFeatureCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
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
  public static void _visitToAddRelations(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectContext _instance = k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XFeatureCall,k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectProperties prop = new k3TransfoFootprint.XFeatureCallAspectXFeatureCallAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    			     							 k3TransfoFootprint.XFeatureCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
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
  
  public static XFeatureCallAspectXFeatureCallAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XFeatureCall> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XFeatureCall");
    InputOutput.<String>println(_plus_1);
    XFeatureCallAspect.super__visitToAddClasses(_self, theSlicer);
    EList<XExpression> _featureCallArguments = _self.getFeatureCallArguments();
    final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
      public void apply(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<XExpression>forEach(_featureCallArguments, _function);
  }
  
  private static void super__visitToAddRelations(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XAbstractFeatureCallAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XFeatureCall> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XFeatureCall");
    InputOutput.<String>println(_plus_1);
    XFeatureCallAspect.super__visitToAddRelations(_self, theSlicer);
    EList<XExpression> _featureCallArguments = _self.getFeatureCallArguments();
    final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
      public void apply(final XExpression _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<XExpression>forEach(_featureCallArguments, _function);
  }
}
