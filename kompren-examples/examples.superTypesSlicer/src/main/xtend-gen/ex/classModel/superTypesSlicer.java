package ex.classModel;

import ex.classModel.ClasssuperClasses;
import ex.classModel.Clazz;
import ex.classModel.SlicerVisitor;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class superTypesSlicer {
  public int idPass = 0;
  
  public final List<Clazz> requiredClazzs = new Function0<List<Clazz>>() {
    public List<Clazz> apply() {
      ArrayList<Clazz> _arrayList = new ArrayList<Clazz>();
      return _arrayList;
    }
  }.apply();
  
  public final List<Clazz> addedClazzs = new Function0<List<Clazz>>() {
    public List<Clazz> apply() {
      ArrayList<Clazz> _arrayList = new ArrayList<Clazz>();
      return _arrayList;
    }
  }.apply();
  
  public final List<ClasssuperClasses> addedsuperClasses = new Function0<List<ClasssuperClasses>>() {
    public List<ClasssuperClasses> apply() {
      ArrayList<ClasssuperClasses> _arrayList = new ArrayList<ClasssuperClasses>();
      return _arrayList;
    }
  }.apply();
  
  public final StringBuilder buf = new Function0<StringBuilder>() {
    public StringBuilder apply() {
      StringBuilder _stringBuilder = new StringBuilder();
      return _stringBuilder;
    }
  }.apply();
  
  public superTypesSlicer(final List<Clazz> requiredClazzs) {
    this.requiredClazzs.addAll(requiredClazzs);
  }
  
  public void launch() {
    this.onStart();
    final Procedure1<Clazz> _function = new Procedure1<Clazz>() {
      public void apply(final Clazz it) {
        SlicerVisitor.visitToAddClasses(it, superTypesSlicer.this);
      }
    };
    IterableExtensions.<Clazz>forEach(this.requiredClazzs, _function);
    final Procedure1<Clazz> _function_1 = new Procedure1<Clazz>() {
      public void apply(final Clazz it) {
        SlicerVisitor.visitToAddRelations(it, superTypesSlicer.this);
      }
    };
    IterableExtensions.<Clazz>forEach(this.requiredClazzs, _function_1);
    final Procedure1<Clazz> _function_2 = new Procedure1<Clazz>() {
      public void apply(final Clazz theClazz) {
        superTypesSlicer.this.onClazzAdded(theClazz);
      }
    };
    IterableExtensions.<Clazz>forEach(this.addedClazzs, _function_2);
    final Procedure1<ClasssuperClasses> _function_3 = new Procedure1<ClasssuperClasses>() {
      public void apply(final ClasssuperClasses thesuperClasses) {
        Clazz _src = thesuperClasses.getSrc();
        Clazz _tar = thesuperClasses.getTar();
        superTypesSlicer.this.onClazzsuperClassesAdded(_src, _tar);
      }
    };
    IterableExtensions.<ClasssuperClasses>forEach(this.addedsuperClasses, _function_3);
    this.onEnd();
  }
  
  public void onClazzAdded(final Clazz clazz) {
    String _name = clazz.getName();
    String _plus = ("Clazz: " + _name);
    InputOutput.<String>println(_plus);
    String _name_1 = clazz.getName();
    StringBuilder _append = this.buf.append(_name_1);
    _append.append(" ");
  }
  
  public void onClazzsuperClassesAdded(final Clazz srcClass, final Clazz tgtClass) {
    String _name = srcClass.getName();
    String _plus = ("Inheritance: " + _name);
    String _plus_1 = (_plus + " ");
    String _name_1 = tgtClass.getName();
    String _plus_2 = (_plus_1 + _name_1);
    InputOutput.<String>println(_plus_2);
    String _name_2 = srcClass.getName();
    StringBuilder _append = this.buf.append(_name_2);
    StringBuilder _append_1 = _append.append(" ");
    String _name_3 = tgtClass.getName();
    StringBuilder _append_2 = _append_1.append(_name_3);
    _append_2.append(" ");
  }
  
  public void onEnd() {
    InputOutput.<String>println("Slicing ended");
    this.buf.append("Slicing ended");
  }
  
  public void onStart() {
    InputOutput.<String>println("Slicing starting");
    this.buf.append("Slicing starting ");
  }
}
