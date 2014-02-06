package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties;
import k3TransfoFootprint.JvmTypeReferenceAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmCompoundTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmCompoundTypeReference.class)
@SuppressWarnings("all")
public abstract class JvmCompoundTypeReferenceAspect extends JvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmCompoundTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmCompoundTypeReference,k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    			     							 k3TransfoFootprint.JvmMultiTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmSynonymTypeReference){
    			     							 k3TransfoFootprint.JvmSynonymTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmSynonymTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    			     							 k3TransfoFootprint.JvmCompoundTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    			     							 k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmCompoundTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmCompoundTypeReference,k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    			     							 k3TransfoFootprint.JvmMultiTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmSynonymTypeReference){
    			     							 k3TransfoFootprint.JvmSynonymTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmSynonymTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    			     							 k3TransfoFootprint.JvmCompoundTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    			     							 k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static JvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmCompoundTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmCompoundTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmCompoundTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmCompoundTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmCompoundTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmType _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
    EList<JvmTypeReference> _references = _self.getReferences();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_references, _function);
  }
  
  private static void super__visitToAddRelations(final JvmCompoundTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmCompoundTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmCompoundTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmCompoundTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmCompoundTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmType _type = _self.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      JvmType _type_1 = _self.getType();
      __SlicerAspect__.visitToAddRelations(_type_1, theSlicer);
    }
    EList<JvmTypeReference> _references = _self.getReferences();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_references, _function);
  }
}
