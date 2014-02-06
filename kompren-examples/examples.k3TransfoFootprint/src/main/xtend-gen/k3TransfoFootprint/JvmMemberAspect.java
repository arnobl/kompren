package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationTargetAspect;
import k3TransfoFootprint.JvmMemberAspectJvmMemberAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmMember.class)
@SuppressWarnings("all")
public abstract class JvmMemberAspect extends JvmAnnotationTargetAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmMember _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmMemberAspectJvmMemberAspectContext _instance = k3TransfoFootprint.JvmMemberAspectJvmMemberAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmMember,k3TransfoFootprint.JvmMemberAspectJvmMemberAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmMemberAspectJvmMemberAspectProperties prop = new k3TransfoFootprint.JvmMemberAspectJvmMemberAspectProperties();
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
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    			     							 k3TransfoFootprint.JvmFieldAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    			     							 k3TransfoFootprint.JvmConstructorAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    			     							 k3TransfoFootprint.JvmOperationAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    			     							 k3TransfoFootprint.JvmExecutableAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmMember _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmMemberAspectJvmMemberAspectContext _instance = k3TransfoFootprint.JvmMemberAspectJvmMemberAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmMember,k3TransfoFootprint.JvmMemberAspectJvmMemberAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmMemberAspectJvmMemberAspectProperties prop = new k3TransfoFootprint.JvmMemberAspectJvmMemberAspectProperties();
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
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    			     							 k3TransfoFootprint.JvmEnumerationLiteralAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    			     							 k3TransfoFootprint.JvmFieldAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    			     							 k3TransfoFootprint.JvmConstructorAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    			     							 k3TransfoFootprint.JvmOperationAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    			     							 k3TransfoFootprint.JvmExecutableAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
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
  
  public static JvmMemberAspectJvmMemberAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmMember _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmMember _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmMember> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmMember");
    InputOutput.<String>println(_plus_1);
    JvmMemberAspect.super__visitToAddClasses(_self, theSlicer);
    JvmDeclaredType _declaringType = _self.getDeclaringType();
    if (_declaringType!=null) {
      __SlicerAspect__.visitToAddClasses(_declaringType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmMember _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmAnnotationTargetAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmMember _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmMember> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmMember");
    InputOutput.<String>println(_plus_1);
    JvmMemberAspect.super__visitToAddRelations(_self, theSlicer);
    JvmDeclaredType _declaringType = _self.getDeclaringType();
    boolean _notEquals = (!Objects.equal(_declaringType, null));
    if (_notEquals) {
      JvmDeclaredType _declaringType_1 = _self.getDeclaringType();
      __SlicerAspect__.visitToAddRelations(_declaringType_1, theSlicer);
    }
  }
}
