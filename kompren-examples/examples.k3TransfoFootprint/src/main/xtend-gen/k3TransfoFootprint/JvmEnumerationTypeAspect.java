package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmDeclaredTypeAspect;
import k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmEnumerationType.class)
@SuppressWarnings("all")
public class JvmEnumerationTypeAspect extends JvmDeclaredTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectContext _instance = k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmEnumerationType,k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties prop = new k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    			     							 k3TransfoFootprint.JvmEnumerationTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    			     							 k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectContext _instance = k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmEnumerationType,k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties prop = new k3TransfoFootprint.JvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    			     							 k3TransfoFootprint.JvmEnumerationTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    			     							 k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
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
  
  public static JvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmEnumerationType> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmEnumerationType");
    InputOutput.<String>println(_plus_1);
    JvmEnumerationTypeAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmEnumerationLiteral> _literals = _self.getLiterals();
    final Procedure1<JvmEnumerationLiteral> _function = new Procedure1<JvmEnumerationLiteral>() {
      public void apply(final JvmEnumerationLiteral it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmEnumerationLiteral>forEach(_literals, _function);
  }
  
  private static void super__visitToAddRelations(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmEnumerationType> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmEnumerationType");
    InputOutput.<String>println(_plus_1);
    JvmEnumerationTypeAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmEnumerationLiteral> _literals = _self.getLiterals();
    final Procedure1<JvmEnumerationLiteral> _function = new Procedure1<JvmEnumerationLiteral>() {
      public void apply(final JvmEnumerationLiteral _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmEnumerationLiteral>forEach(_literals, _function);
  }
}
