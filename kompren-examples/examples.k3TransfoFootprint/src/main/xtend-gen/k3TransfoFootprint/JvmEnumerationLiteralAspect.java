package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectProperties;
import k3TransfoFootprint.JvmFieldAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmEnumerationLiteral.class)
@SuppressWarnings("all")
public class JvmEnumerationLiteralAspect extends JvmFieldAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmEnumerationLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectContext _instance = k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmEnumerationLiteral,k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectProperties prop = new k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    			     							 k3TransfoFootprint.JvmFieldAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    			     							 k3TransfoFootprint.JvmFeatureAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    			     							 k3TransfoFootprint.JvmMemberAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    			     							 k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    			     							 k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmEnumerationLiteral _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectContext _instance = k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmEnumerationLiteral,k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectProperties prop = new k3TransfoFootprint.JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    			     							 k3TransfoFootprint.JvmFieldAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    			     							 k3TransfoFootprint.JvmFeatureAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    			     							 k3TransfoFootprint.JvmMemberAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    			     							 k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    			     							 k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static JvmEnumerationLiteralAspectJvmEnumerationLiteralAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmEnumerationLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmFieldAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmEnumerationLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmEnumerationLiteral> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmEnumerationLiteral");
    InputOutput.<String>println(_plus_1);
    JvmEnumerationLiteralAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmEnumerationLiteral _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmFieldAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmEnumerationLiteral _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmEnumerationLiteral> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmEnumerationLiteral");
    InputOutput.<String>println(_plus_1);
    JvmEnumerationLiteralAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
