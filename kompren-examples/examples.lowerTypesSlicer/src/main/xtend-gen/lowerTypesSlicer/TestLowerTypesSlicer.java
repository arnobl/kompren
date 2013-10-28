package lowerTypesSlicer;

import ex.classModel.ClassModel;
import ex.classModel.Clazz;
import ex.classModel.impl.ClassModelFactoryImpl;
import java.util.ArrayList;
import java.util.List;
import lowerTypesSlicer.LowerTypesSlicer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestLowerTypesSlicer {
  @Test
  public void testSlicer() {
    ArrayList<Clazz> _arrayList = new ArrayList<Clazz>();
    final List<Clazz> requiredClazzs = _arrayList;
    final ClassModel classModel = TestLowerTypesSlicer.createClassModel(requiredClazzs);
    EList<Clazz> _classes = classModel.getClasses();
    Clazz _last = IterableExtensions.<Clazz>last(_classes);
    requiredClazzs.add(_last);
    LowerTypesSlicer _lowerTypesSlicer = new LowerTypesSlicer(requiredClazzs, classModel);
    final LowerTypesSlicer slicer = _lowerTypesSlicer;
    slicer.slice();
    String _string = slicer.buf.toString();
    Assert.assertEquals("c3 c2 c1 c5 c4 c2 c1 c3 c2 c4 c3 c5 c4 ", _string);
  }
  
  public static ClassModel createClassModel(final List<Clazz> requiredClazzs) {
    final ClassModel result = ClassModelFactoryImpl.eINSTANCE.createClassModel();
    final Clazz c1 = ClassModelFactoryImpl.eINSTANCE.createClazz();
    final Clazz c2 = ClassModelFactoryImpl.eINSTANCE.createClazz();
    final Clazz c3 = ClassModelFactoryImpl.eINSTANCE.createClazz();
    final Clazz c4 = ClassModelFactoryImpl.eINSTANCE.createClazz();
    final Clazz c5 = ClassModelFactoryImpl.eINSTANCE.createClazz();
    c1.setName("c1");
    EList<Clazz> _classes = result.getClasses();
    _classes.add(c1);
    c2.setName("c2");
    EList<Clazz> _classes_1 = result.getClasses();
    _classes_1.add(c2);
    c3.setName("c3");
    EList<Clazz> _classes_2 = result.getClasses();
    _classes_2.add(c3);
    c4.setName("c4");
    EList<Clazz> _classes_3 = result.getClasses();
    _classes_3.add(c4);
    c5.setName("c5");
    EList<Clazz> _classes_4 = result.getClasses();
    _classes_4.add(c5);
    EList<Clazz> _superClasses = c1.getSuperClasses();
    _superClasses.add(c2);
    EList<Clazz> _superClasses_1 = c2.getSuperClasses();
    _superClasses_1.add(c3);
    EList<Clazz> _superClasses_2 = c3.getSuperClasses();
    _superClasses_2.add(c4);
    EList<Clazz> _superClasses_3 = c4.getSuperClasses();
    _superClasses_3.add(c5);
    requiredClazzs.add(c3);
    return result;
  }
}
