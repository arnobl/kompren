package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectProperties;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XNumberLiteral.class)
@SuppressWarnings("all")
public class XNumberLiteralAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XNumberLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectContext _instance = k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XNumberLiteral,k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectProperties prop = new k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XNumberLiteral){
    			     							 k3TransfoFootprint.XNumberLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XNumberLiteral)_self,theSlicer);
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
  public static void _visitToAddRelations(final XNumberLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectContext _instance = k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XNumberLiteral,k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectProperties prop = new k3TransfoFootprint.XNumberLiteralAspectXNumberLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XNumberLiteral){
    			     							 k3TransfoFootprint.XNumberLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XNumberLiteral)_self,theSlicer);
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
  
  public static XNumberLiteralAspectXNumberLiteralAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XNumberLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XNumberLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XNumberLiteral> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XNumberLiteral");
    InputOutput.<String>println(_plus_1);
    XNumberLiteralAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final XNumberLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XNumberLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XNumberLiteral> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XNumberLiteral");
    InputOutput.<String>println(_plus_1);
    XNumberLiteralAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
