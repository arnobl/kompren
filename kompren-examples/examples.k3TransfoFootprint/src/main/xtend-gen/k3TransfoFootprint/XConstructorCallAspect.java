package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectProperties;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = XConstructorCall.class)
@SuppressWarnings("all")
public class XConstructorCallAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectContext _instance = k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XConstructorCall,k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectProperties prop = new k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    			     							 k3TransfoFootprint.XConstructorCallAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
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
  public static void _visitToAddRelations(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectContext _instance = k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XConstructorCall,k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectProperties prop = new k3TransfoFootprint.XConstructorCallAspectXConstructorCallAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    			     							 k3TransfoFootprint.XConstructorCallAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
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
  
  public static XConstructorCallAspectXConstructorCallAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XConstructorCall> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XConstructorCall");
    InputOutput.<String>println(_plus_1);
    XConstructorCallAspect.super__visitToAddClasses(_self, theSlicer);
    JvmConstructor _constructor = _self.getConstructor();
    if (_constructor!=null) {
      __SlicerAspect__.visitToAddClasses(_constructor, theSlicer);
    }
    EList<XExpression> _arguments = _self.getArguments();
    final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
      public void apply(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<XExpression>forEach(_arguments, _function);
  }
  
  private static void super__visitToAddRelations(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XConstructorCall> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XConstructorCall");
    InputOutput.<String>println(_plus_1);
    XConstructorCallAspect.super__visitToAddRelations(_self, theSlicer);
    JvmConstructor _constructor = _self.getConstructor();
    boolean _notEquals = (!Objects.equal(_constructor, null));
    if (_notEquals) {
      JvmConstructor _constructor_1 = _self.getConstructor();
      __SlicerAspect__.visitToAddRelations(_constructor_1, theSlicer);
    }
    EList<XExpression> _arguments = _self.getArguments();
    final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
      public void apply(final XExpression _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<XExpression>forEach(_arguments, _function);
  }
}
