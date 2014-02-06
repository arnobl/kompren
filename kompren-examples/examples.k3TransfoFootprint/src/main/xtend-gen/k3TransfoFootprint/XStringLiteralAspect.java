package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectProperties;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XStringLiteral.class)
@SuppressWarnings("all")
public class XStringLiteralAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectContext _instance = k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XStringLiteral,k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectProperties prop = new k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    			     							 k3TransfoFootprint.XStringLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
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
  public static void _visitToAddRelations(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectContext _instance = k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XStringLiteral,k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectProperties prop = new k3TransfoFootprint.XStringLiteralAspectXStringLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    			     							 k3TransfoFootprint.XStringLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
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
  
  public static XStringLiteralAspectXStringLiteralAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XStringLiteral> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XStringLiteral");
    InputOutput.<String>println(_plus_1);
    XStringLiteralAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XStringLiteral> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XStringLiteral");
    InputOutput.<String>println(_plus_1);
    XStringLiteralAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
