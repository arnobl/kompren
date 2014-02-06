package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectProperties;
import k3TransfoFootprint.JvmFeatureAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmExecutable.class)
@SuppressWarnings("all")
public abstract class JvmExecutableAspect extends JvmFeatureAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectContext _instance = k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmExecutable,k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectProperties prop = new k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
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
  public static void _visitToAddRelations(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectContext _instance = k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmExecutable,k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectProperties prop = new k3TransfoFootprint.JvmExecutableAspectJvmExecutableAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
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
  
  public static JvmExecutableAspectJvmExecutableAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmFeatureAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmExecutable> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmExecutable");
    InputOutput.<String>println(_plus_1);
    JvmExecutableAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmFormalParameter> _parameters = _self.getParameters();
    final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
      public void apply(final JvmFormalParameter it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmFormalParameter>forEach(_parameters, _function);
    EList<JvmTypeReference> _exceptions = _self.getExceptions();
    final Procedure1<JvmTypeReference> _function_1 = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_exceptions, _function_1);
    EList<JvmFormalParameter> _parameters_1 = _self.getParameters();
    final Procedure1<JvmFormalParameter> _function_2 = new Procedure1<JvmFormalParameter>() {
      public void apply(final JvmFormalParameter it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmFormalParameter>forEach(_parameters_1, _function_2);
    EList<JvmTypeReference> _exceptions_1 = _self.getExceptions();
    final Procedure1<JvmTypeReference> _function_3 = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_exceptions_1, _function_3);
  }
  
  private static void super__visitToAddRelations(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmFeatureAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmExecutable> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmExecutable");
    InputOutput.<String>println(_plus_1);
    JvmExecutableAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmFormalParameter> _parameters = _self.getParameters();
    final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
      public void apply(final JvmFormalParameter _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmFormalParameter>forEach(_parameters, _function);
    EList<JvmTypeReference> _exceptions = _self.getExceptions();
    final Procedure1<JvmTypeReference> _function_1 = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_exceptions, _function_1);
    EList<JvmFormalParameter> _parameters_1 = _self.getParameters();
    final Procedure1<JvmFormalParameter> _function_2 = new Procedure1<JvmFormalParameter>() {
      public void apply(final JvmFormalParameter _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmFormalParameter>forEach(_parameters_1, _function_2);
    EList<JvmTypeReference> _exceptions_1 = _self.getExceptions();
    final Procedure1<JvmTypeReference> _function_3 = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_exceptions_1, _function_3);
  }
}
