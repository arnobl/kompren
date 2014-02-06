package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XCollectionLiteralAspect;
import k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectProperties;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XSetLiteral.class)
@SuppressWarnings("all")
public class XSetLiteralAspect extends XCollectionLiteralAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XSetLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectContext _instance = k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XSetLiteral,k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectProperties prop = new k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
    			     							 k3TransfoFootprint.XSetLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XSetLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCollectionLiteral){
    			     							 k3TransfoFootprint.XCollectionLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCollectionLiteral)_self,theSlicer);
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
  public static void _visitToAddRelations(final XSetLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectContext _instance = k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XSetLiteral,k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectProperties prop = new k3TransfoFootprint.XSetLiteralAspectXSetLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
    			     							 k3TransfoFootprint.XSetLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XSetLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XCollectionLiteral){
    			     							 k3TransfoFootprint.XCollectionLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCollectionLiteral)_self,theSlicer);
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
  
  public static XSetLiteralAspectXSetLiteralAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XSetLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XCollectionLiteralAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XSetLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XSetLiteral> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XSetLiteral");
    InputOutput.<String>println(_plus_1);
    XSetLiteralAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final XSetLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XCollectionLiteralAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XSetLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XSetLiteral> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XSetLiteral");
    InputOutput.<String>println(_plus_1);
    XSetLiteralAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
