package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = JvmTypeParameterDeclarator.class)
@SuppressWarnings("all")
public abstract class JvmTypeParameterDeclaratorAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext _instance = k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeParameterDeclarator,k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties prop = new k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameterDeclarator){
    			     							 k3TransfoFootprint.JvmTypeParameterDeclaratorAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeParameterDeclarator)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext _instance = k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmTypeParameterDeclarator,k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties prop = new k3TransfoFootprint.JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameterDeclarator){
    			     							 k3TransfoFootprint.JvmTypeParameterDeclaratorAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeParameterDeclarator)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static JvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeParameterDeclarator> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmTypeParameterDeclarator");
    InputOutput.<String>println(_plus_1);
    JvmTypeParameterDeclaratorAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeParameter> _typeParameters = _self.getTypeParameters();
    final Procedure1<JvmTypeParameter> _function = new Procedure1<JvmTypeParameter>() {
      public void apply(final JvmTypeParameter it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeParameter>forEach(_typeParameters, _function);
  }
  
  private static void super__visitToAddRelations(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmTypeParameterDeclarator> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmTypeParameterDeclarator");
    InputOutput.<String>println(_plus_1);
    JvmTypeParameterDeclaratorAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeParameter> _typeParameters = _self.getTypeParameters();
    final Procedure1<JvmTypeParameter> _function = new Procedure1<JvmTypeParameter>() {
      public void apply(final JvmTypeParameter _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    IterableExtensions.<JvmTypeParameter>forEach(_typeParameters, _function);
  }
}
