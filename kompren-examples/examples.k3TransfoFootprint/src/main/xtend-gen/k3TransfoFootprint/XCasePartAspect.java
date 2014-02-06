package k3TransfoFootprint;

import com.google.common.base.Objects;
import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import k3TransfoFootprint.K3TransfoFootprint;
import k3TransfoFootprint.XCasePartAspectXCasePartAspectProperties;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = XCasePart.class)
@SuppressWarnings("all")
public class XCasePartAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XCasePart _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XCasePartAspectXCasePartAspectContext _instance = k3TransfoFootprint.XCasePartAspectXCasePartAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XCasePart,k3TransfoFootprint.XCasePartAspectXCasePartAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XCasePartAspectXCasePartAspectProperties prop = new k3TransfoFootprint.XCasePartAspectXCasePartAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XCasePart){
    			     							 k3TransfoFootprint.XCasePartAspect.priv_visitToAddClasses((org.eclipse.xtext.xbase.XCasePart)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XCasePart _self, final K3TransfoFootprint theSlicer) {
    k3TransfoFootprint.XCasePartAspectXCasePartAspectContext _instance = k3TransfoFootprint.XCasePartAspectXCasePartAspectContext.getInstance();
    				    java.util.Map<org.eclipse.xtext.xbase.XCasePart,k3TransfoFootprint.XCasePartAspectXCasePartAspectProperties> selfProp = _instance.getMap();
    					boolean _containsKey = selfProp.containsKey(_self);
    				    boolean _not = (!_containsKey);
    				    if (_not) {
      						k3TransfoFootprint.XCasePartAspectXCasePartAspectProperties prop = new k3TransfoFootprint.XCasePartAspectXCasePartAspectProperties();
    				   selfProp.put(_self, prop);
    			    }
    			     _self_ = selfProp.get(_self);
    			        if (_self instanceof org.eclipse.xtext.xbase.XCasePart){
    			     							 k3TransfoFootprint.XCasePartAspect.priv_visitToAddRelations((org.eclipse.xtext.xbase.XCasePart)_self,theSlicer);
    			     							} else    if (_self instanceof java.lang.Object){
    			     							 k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations((java.lang.Object)_self,theSlicer);
    			     							} else 
    			      {
    			       										throw new IllegalArgumentException("Unhandled parameter types: " +
    			     							        java.util.Arrays.<Object>asList(_self).toString());
    			     					    } 
  }
  
  public static XCasePartAspectXCasePartAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XCasePart _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddClasses(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddClasses(final XCasePart _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XCasePart> _class = _self.getClass();
    String _plus = ("class: " + _class);
    String _plus_1 = (_plus + " in XCasePart");
    InputOutput.<String>println(_plus_1);
    XCasePartAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _case = _self.getCase();
    if (_case!=null) {
      __SlicerAspect__.visitToAddClasses(_case, theSlicer);
    }
    XExpression _then = _self.getThen();
    if (_then!=null) {
      __SlicerAspect__.visitToAddClasses(_then, theSlicer);
    }
    JvmTypeReference _typeGuard = _self.getTypeGuard();
    if (_typeGuard!=null) {
      __SlicerAspect__.visitToAddClasses(_typeGuard, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XCasePart _self, final K3TransfoFootprint theSlicer) {
      k3TransfoFootprint.__SlicerAspect__.priv_visitToAddRelations(_self,theSlicer);  
  }
  
  protected static void priv_visitToAddRelations(final XCasePart _self, final K3TransfoFootprint theSlicer) {
    Class<? extends XCasePart> _class = _self.getClass();
    String _plus = ("relation: " + _class);
    String _plus_1 = (_plus + " in XCasePart");
    InputOutput.<String>println(_plus_1);
    XCasePartAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _case = _self.getCase();
    boolean _notEquals = (!Objects.equal(_case, null));
    if (_notEquals) {
      XExpression _case_1 = _self.getCase();
      __SlicerAspect__.visitToAddRelations(_case_1, theSlicer);
    }
    XExpression _then = _self.getThen();
    boolean _notEquals_1 = (!Objects.equal(_then, null));
    if (_notEquals_1) {
      XExpression _then_1 = _self.getThen();
      __SlicerAspect__.visitToAddRelations(_then_1, theSlicer);
    }
    JvmTypeReference _typeGuard = _self.getTypeGuard();
    boolean _notEquals_2 = (!Objects.equal(_typeGuard, null));
    if (_notEquals_2) {
      JvmTypeReference _typeGuard_1 = _self.getTypeGuard();
      __SlicerAspect__.visitToAddRelations(_typeGuard_1, theSlicer);
    }
  }
}
