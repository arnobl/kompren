package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XClosureAspectXClosureAspectProperties;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = XClosure.class)
@SuppressWarnings("all")
public class XClosureAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XClosure _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XClosureAspectXClosureAspectContext _instance = k3TransfoFootprint.XClosureAspectXClosureAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XClosure,k3TransfoFootprint.XClosureAspectXClosureAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XClosureAspectXClosureAspectProperties prop = new k3TransfoFootprint.XClosureAspectXClosureAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    			     							 k3TransfoFootprint.XClosureAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
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
  public static void _visitToAddRelations(final XClosure _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XClosureAspectXClosureAspectContext _instance = k3TransfoFootprint.XClosureAspectXClosureAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XClosure,k3TransfoFootprint.XClosureAspectXClosureAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XClosureAspectXClosureAspectProperties prop = new k3TransfoFootprint.XClosureAspectXClosureAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    			     							 k3TransfoFootprint.XClosureAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
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
  
  public static XClosureAspectXClosureAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XClosure _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XClosure _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XClosure> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XClosure");
    InputOutput.<String>println(_plus_1);
    XClosureAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmFormalParameter> _declaredFormalParameters = _self.getDeclaredFormalParameters();
    final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
      public void apply(final JvmFormalParameter it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmFormalParameter>forEach(_declaredFormalParameters, _function);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.visitToAddClasses(_expression, theSlicer);
    }
    JvmFormalParameter _implicitParameter = _self.getImplicitParameter();
    if (_implicitParameter!=null) {
      __SlicerAspect__.visitToAddClasses(_implicitParameter, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XClosure _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XClosure _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XClosure> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XClosure");
    InputOutput.<String>println(_plus_1);
    XClosureAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmFormalParameter> _declaredFormalParameters = _self.getDeclaredFormalParameters();
    final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
      public void apply(final JvmFormalParameter _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmFormalParameter>forEach(_declaredFormalParameters, _function);
    XExpression _expression = _self.getExpression();
    boolean _notEquals = (!Objects.equal(_expression, null));
    if (_notEquals) {
      XExpression _expression_1 = _self.getExpression();
      __SlicerAspect__.visitToAddRelations(_expression_1, theSlicer);
    }
    JvmFormalParameter _implicitParameter = _self.getImplicitParameter();
    boolean _notEquals_1 = (!Objects.equal(_implicitParameter, null));
    if (_notEquals_1) {
      JvmFormalParameter _implicitParameter_1 = _self.getImplicitParameter();
      __SlicerAspect__.visitToAddRelations(_implicitParameter_1, theSlicer);
    }
  }
}
