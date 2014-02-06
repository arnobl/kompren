package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XTypeLiteral.class)
@SuppressWarnings("all")
public class XTypeLiteralAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XTypeLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectContext _instance = k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XTypeLiteral,k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectProperties prop = new k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XTypeLiteral){
    			     							 k3TransfoFootprint.XTypeLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XTypeLiteral)_self,theSlicer);
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
  public static void _visitToAddRelations(final XTypeLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectContext _instance = k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XTypeLiteral,k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectProperties prop = new k3TransfoFootprint.XTypeLiteralAspectXTypeLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XTypeLiteral){
    			     							 k3TransfoFootprint.XTypeLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XTypeLiteral)_self,theSlicer);
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
  
  public static XTypeLiteralAspectXTypeLiteralAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XTypeLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XTypeLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XTypeLiteral> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XTypeLiteral");
    InputOutput.<String>println(_plus_1);
    XTypeLiteralAspect.super__visitToAddClasses(_self, theSlicer);
    JvmType _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XTypeLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XTypeLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XTypeLiteral> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XTypeLiteral");
    InputOutput.<String>println(_plus_1);
    XTypeLiteralAspect.super__visitToAddRelations(_self, theSlicer);
    JvmType _type = _self.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      JvmType _type_1 = _self.getType();
      __SlicerAspect__.visitToAddRelations(_type_1, theSlicer);
    }
  }
}
