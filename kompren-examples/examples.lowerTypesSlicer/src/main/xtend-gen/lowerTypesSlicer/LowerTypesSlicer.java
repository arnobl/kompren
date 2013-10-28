package lowerTypesSlicer;

import ex.classModel.Clazz;
import java.util.List;
import lowerTypesSlicer.__SlicerAspect__;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LowerTypesSlicer {
  public final StringBuilder buf = new Function0<StringBuilder>() {
    public StringBuilder apply() {
      StringBuilder _stringBuilder = new StringBuilder();
      return _stringBuilder;
    }
  }.apply();
  
  private final List<Clazz> inputClazz;
  
  private final EObject _root;
  
  public LowerTypesSlicer(final List<Clazz> inputClazz, final EObject metamodelRoot) {
    this.inputClazz = inputClazz;
    this._root = metamodelRoot;
  }
  
  public void slice() {
    __SlicerAspect__.feedOpposites(this._root);
    this.onStart();
    final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
      public void apply(final Clazz it) {
        __SlicerAspect__.visitToAddClasses(it, LowerTypesSlicer.this);
      }
    };
    IterableExtensions.<Clazz>forEach(this.inputClazz, _function);
    final Procedure1<Clazz> _function_1 = new Procedure1<Clazz>() {
      public void apply(final Clazz it) {
        __SlicerAspect__.visitToAddRelations(it, LowerTypesSlicer.this);
      }
    };
    IterableExtensions.<Clazz>forEach(this.inputClazz, _function_1);
    this.onEnd();
  }
  
  public void onClazzSliced(final Clazz clazz) {
    String _name = clazz.getName();
    String _plus = ("Clazz: " + _name);
    InputOutput.<String>println(_plus);
    String _name_1 = clazz.getName();
    StringBuilder _append = this.buf.append(_name_1);
    _append.append(" ");
  }
  
  public void onlowerTypeSliced(final Clazz src, final Clazz tgt) {
    String _name = src.getName();
    String _plus = ("Inheritance: " + _name);
    String _plus_1 = (_plus + " ");
    String _name_1 = tgt.getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    String _name_2 = src.getName();
    StringBuilder _append = this.buf.append(_name_2);
    StringBuilder _append_1 = _append.append(" ");
    String _name_3 = tgt.getName();
    StringBuilder _append_2 = _append_1.append(_name_3);
    _append_2.append(" ");
  }
  
  protected void onStart() {
  }
  
  protected void onEnd() {
  }
}
