package k3TransfoFootprint;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmTypeAspect;
import k3TransfoFootprint.JvmVoidAspectJvmVoidAspectProperties;
import k3TransfoFootprint.K3TransfoFootprint;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = JvmVoid.class)
@SuppressWarnings("all")
public class JvmVoidAspect extends JvmTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmVoid _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmVoidAspectJvmVoidAspectContext _instance = k3TransfoFootprint.JvmVoidAspectJvmVoidAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmVoid,k3TransfoFootprint.JvmVoidAspectJvmVoidAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmVoidAspectJvmVoidAspectProperties prop = new k3TransfoFootprint.JvmVoidAspectJvmVoidAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmVoid){
    			     							 k3TransfoFootprint.JvmVoidAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmVoid)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    			     							 k3TransfoFootprint.JvmTypeAspect.priv_visitToAddClasses((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmVoid _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.JvmVoidAspectJvmVoidAspectContext _instance = k3TransfoFootprint.JvmVoidAspectJvmVoidAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.common.types.JvmVoid,k3TransfoFootprint.JvmVoidAspectJvmVoidAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.JvmVoidAspectJvmVoidAspectProperties prop = new k3TransfoFootprint.JvmVoidAspectJvmVoidAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.common.types.JvmVoid){
    			     							 k3TransfoFootprint.JvmVoidAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmVoid)_self,theSlicer);
    			     							} else    if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    			     							 k3TransfoFootprint.JvmTypeAspect.priv_visitToAddRelations((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
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
  
  public static JvmVoidAspectJvmVoidAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmVoid _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final JvmVoid _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmVoid> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in JvmVoid");
    InputOutput.<String>println(_plus_1);
    JvmVoidAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmVoid _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmTypeAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final JvmVoid _self, final K3TransfoFootprint theSlicer) {
    Class<? extends JvmVoid> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in JvmVoid");
    InputOutput.<String>println(_plus_1);
    JvmVoidAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
