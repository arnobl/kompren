package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectProperties;
import k3TransfoFootprint.XExpressionAspect;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = XCollectionLiteral.class)
@SuppressWarnings("all")
public abstract class XCollectionLiteralAspect extends XExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XCollectionLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectContext _instance = k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XCollectionLiteral,k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectProperties prop = new k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XListLiteral){
    			     							 k3TransfoFootprint.XListLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XListLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
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
  public static void _visitToAddRelations(final XCollectionLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectContext _instance = k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XCollectionLiteral,k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectProperties prop = new k3TransfoFootprint.XCollectionLiteralAspectXCollectionLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XListLiteral){
    			     							 k3TransfoFootprint.XListLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XListLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
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
  
  public static XCollectionLiteralAspectXCollectionLiteralAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XCollectionLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XCollectionLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XCollectionLiteral> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XCollectionLiteral");
    InputOutput.<String>println(_plus_1);
    XCollectionLiteralAspect.super__visitToAddClasses(_self, theSlicer);
    EList<XExpression> _elements = _self.getElements();
    final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
      public void apply(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<XExpression>forEach(_elements, _function);
  }
  
  private static void super__visitToAddRelations(final XCollectionLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.XExpressionAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XCollectionLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XCollectionLiteral> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XCollectionLiteral");
    InputOutput.<String>println(_plus_1);
    XCollectionLiteralAspect.super__visitToAddRelations(_self, theSlicer);
    EList<XExpression> _elements = _self.getElements();
    final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
      public void apply(final XExpression _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<XExpression>forEach(_elements, _function);
  }
}
