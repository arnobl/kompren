package k3TransfoFootprint;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k3TransfoFootprint.__SlicerAspect__;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class K3TransfoFootprint {
  private final Set<String> footprint = new HashSet<String>();
  
  private final List<JvmFormalParameter> inputJvmFormalParameter;
  
  private final List<JvmTypeReference> inputJvmTypeReference;
  
  private final List<XExpression> inputXExpression;
  
  public K3TransfoFootprint(final List<JvmFormalParameter> inputJvmFormalParameter, final List<JvmTypeReference> inputJvmTypeReference, final List<XExpression> inputXExpression) {
    this.inputJvmFormalParameter = inputJvmFormalParameter;
    this.inputJvmTypeReference = inputJvmTypeReference;
    this.inputXExpression = inputXExpression;
  }
  
  public void slice() {
    this.onStart();
    if (this.inputJvmFormalParameter!=null) {
      final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
        public void apply(final JvmFormalParameter it) {
          __SlicerAspect__.visitToAddClasses(it, K3TransfoFootprint.this);
        }
      };
      IterableExtensions.<JvmFormalParameter>forEach(this.inputJvmFormalParameter, _function);
    }
    if (this.inputJvmTypeReference!=null) {
      final Procedure1<JvmTypeReference> _function_1 = new Procedure1<JvmTypeReference>() {
        public void apply(final JvmTypeReference it) {
          __SlicerAspect__.visitToAddClasses(it, K3TransfoFootprint.this);
        }
      };
      IterableExtensions.<JvmTypeReference>forEach(this.inputJvmTypeReference, _function_1);
    }
    if (this.inputXExpression!=null) {
      final Procedure1<XExpression> _function_2 = new Procedure1<XExpression>() {
        public void apply(final XExpression it) {
          __SlicerAspect__.visitToAddClasses(it, K3TransfoFootprint.this);
        }
      };
      IterableExtensions.<XExpression>forEach(this.inputXExpression, _function_2);
    }
    if (this.inputJvmFormalParameter!=null) {
      final Procedure1<JvmFormalParameter> _function_3 = new Procedure1<JvmFormalParameter>() {
        public void apply(final JvmFormalParameter it) {
          __SlicerAspect__.visitToAddRelations(it, K3TransfoFootprint.this);
        }
      };
      IterableExtensions.<JvmFormalParameter>forEach(this.inputJvmFormalParameter, _function_3);
    }
    if (this.inputJvmTypeReference!=null) {
      final Procedure1<JvmTypeReference> _function_4 = new Procedure1<JvmTypeReference>() {
        public void apply(final JvmTypeReference it) {
          __SlicerAspect__.visitToAddRelations(it, K3TransfoFootprint.this);
        }
      };
      IterableExtensions.<JvmTypeReference>forEach(this.inputJvmTypeReference, _function_4);
    }
    if (this.inputXExpression!=null) {
      final Procedure1<XExpression> _function_5 = new Procedure1<XExpression>() {
        public void apply(final XExpression it) {
          __SlicerAspect__.visitToAddRelations(it, K3TransfoFootprint.this);
        }
      };
      IterableExtensions.<XExpression>forEach(this.inputXExpression, _function_5);
    }
    this.onEnd();
  }
  
  public void onJvmTypeReferenceSliced(final JvmTypeReference type) {
    String _qualifiedName = type.getQualifiedName();
    this.footprint.add(_qualifiedName);
  }
  
  public void onJvmIdentifiableElementSliced(final JvmIdentifiableElement ident) {
    String _qualifiedName = ident.getQualifiedName();
    this.footprint.add(_qualifiedName);
  }
  
  protected void onStart() {
  }
  
  protected void onEnd() {
  }
}
