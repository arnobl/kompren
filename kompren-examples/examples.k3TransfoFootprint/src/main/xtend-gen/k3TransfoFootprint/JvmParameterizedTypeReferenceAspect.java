package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties;
import k3TransfoFootprint.JvmTypeReferenceAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmParameterizedTypeReference.class)
@SuppressWarnings("all")
public class JvmParameterizedTypeReferenceAspect extends JvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmParameterizedTypeReference,k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    			     							 k3TransfoFootprint.JvmParameterizedTypeReferenceAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext _instance = k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmParameterizedTypeReference,k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties prop = new k3TransfoFootprint.JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    			     							 k3TransfoFootprint.JvmParameterizedTypeReferenceAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
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
  
  public static JvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmParameterizedTypeReference> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmParameterizedTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmParameterizedTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeReference> _arguments = _self.getArguments();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_arguments, _function);
    JvmType _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeReferenceAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmParameterizedTypeReference> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmParameterizedTypeReference");
    InputOutput.<String>println(_plus_1);
    JvmParameterizedTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeReference> _arguments = _self.getArguments();
    final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
      public void apply(final JvmTypeReference _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeReference>forEach(_arguments, _function);
    JvmType _type = _self.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      JvmType _type_1 = _self.getType();
      __SlicerAspect__.visitToAddRelations(_type_1, theSlicer);
    }
  }
}
