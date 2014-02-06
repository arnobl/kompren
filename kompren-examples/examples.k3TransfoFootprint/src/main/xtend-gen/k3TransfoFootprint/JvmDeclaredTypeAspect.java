package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties;
import k3TransfoFootprint.JvmMemberAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmDeclaredType.class)
@SuppressWarnings("all")
public abstract class JvmDeclaredTypeAspect extends JvmMemberAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectContext _instance = k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmDeclaredType,k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties prop = new k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    			     							 k3TransfoFootprint.JvmAnnotationTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    			     							 k3TransfoFootprint.JvmEnumerationTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    			     							 k3TransfoFootprint.JvmGenericTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectContext _instance = k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmDeclaredType,k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties prop = new k3TransfoFootprint.JvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    			     							 k3TransfoFootprint.JvmAnnotationTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    			     							 k3TransfoFootprint.JvmEnumerationTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    			     							 k3TransfoFootprint.JvmGenericTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
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
  
  public static JvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmMemberAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmDeclaredType> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmDeclaredType");
    InputOutput.<String>println(_plus_1);
    JvmDeclaredTypeAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeReference> _superTypes = _self.getSuperTypes();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_superTypes, _function);
    EList<JvmMember> _members = _self.getMembers();
    final Procedure1<JvmMember> _function_1 = new Procedure1<JvmMember>() {
      public void apply(final JvmMember it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmMember>forEach(_members, _function_1);
  }
  
  private static void super__visitToAddRelations(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmMemberAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmDeclaredType> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmDeclaredType");
    InputOutput.<String>println(_plus_1);
    JvmDeclaredTypeAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeReference> _superTypes = _self.getSuperTypes();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_superTypes, _function);
    EList<JvmMember> _members = _self.getMembers();
    final Procedure1<JvmMember> _function_1 = new Procedure1<JvmMember>() {
      public void apply(final JvmMember _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmMember>forEach(_members, _function_1);
  }
}
