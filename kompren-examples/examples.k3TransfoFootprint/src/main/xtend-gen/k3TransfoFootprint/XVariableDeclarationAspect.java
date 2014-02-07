package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.JvmIdentifiableElementAspect;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XVariableDeclaration.class)
@SuppressWarnings("all")
public class XVariableDeclarationAspect extends JvmIdentifiableElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectContext _instance = k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XVariableDeclaration,k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectProperties prop = new k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    			     							 k3TransfoFootprint.XVariableDeclarationAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
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
  public static void _visitToAddRelations(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectContext _instance = k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XVariableDeclaration,k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectProperties prop = new k3TransfoFootprint.XVariableDeclarationAspectXVariableDeclarationAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    			     							 k3TransfoFootprint.XVariableDeclarationAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
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
  
  public static XVariableDeclarationAspectXVariableDeclarationAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XVariableDeclaration> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XVariableDeclaration");
    InputOutput.<String>println(_plus_1);
    XVariableDeclarationAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
    XExpression _right = _self.getRight();
    if (_right!=null) {
      __SlicerAspect__.visitToAddClasses(_right, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.JvmIdentifiableElementAspect.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XVariableDeclaration> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XVariableDeclaration");
    InputOutput.<String>println(_plus_1);
    XVariableDeclarationAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _type = _self.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      JvmTypeReference _type_1 = _self.getType();
      __SlicerAspect__.visitToAddRelations(_type_1, theSlicer);
    }
    XExpression _right = _self.getRight();
    boolean _notEquals_1 = (!Objects.equal(_right, null));
    if (_notEquals_1) {
      XExpression _right_1 = _self.getRight();
      __SlicerAspect__.visitToAddRelations(_right_1, theSlicer);
    }
  }
}
