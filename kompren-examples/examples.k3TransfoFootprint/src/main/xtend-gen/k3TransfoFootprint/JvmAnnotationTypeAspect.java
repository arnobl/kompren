package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties;
import k3TransfoFootprint.JvmDeclaredTypeAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmAnnotationType.class)
@SuppressWarnings("all")
public class JvmAnnotationTypeAspect extends JvmDeclaredTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectContext _instance = k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationType,k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties prop = new k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    			     							 k3TransfoFootprint.JvmAnnotationTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectContext _instance = k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmAnnotationType,k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties prop = new k3TransfoFootprint.JvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    			     							 k3TransfoFootprint.JvmAnnotationTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
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
  
  public static JvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationType> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationType");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmDeclaredTypeAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmAnnotationType> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmAnnotationType");
    InputOutput.<String>println(_plus_1);
    JvmAnnotationTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
