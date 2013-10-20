package ex.classModel

import ex.classModel.impl.ClassModelFactoryImpl
import java.util.ArrayList
import java.util.List
import org.junit.Test

import static org.junit.Assert.*

class TestSlicer {
//	def static void main(String[] args) {
//		val List<Clazz> requiredClazzs = new  ArrayList
//		requiredClazzs.add(createClassModel(requiredClazzs).classes.head)
//		val superTypesSlicer slicer = new superTypesSlicer(requiredClazzs)
//		slicer.launch
//	}
	
	@Test def testSlicer() {
		val List<Clazz> requiredClazzs = new  ArrayList
		requiredClazzs.add(createClassModel(requiredClazzs).classes.head)
		val superTypesSlicer slicer = new superTypesSlicer(requiredClazzs)
		slicer.launch
		assertEquals("Slicing starting c3 c4 c5 c1 c2 c4 c5 c3 c4 c2 c3 c1 c2 Slicing ended", slicer.buf.toString)
	}
	
	def static ClassModel createClassModel(List<Clazz> requiredClazzs) {
		val ClassModel result = ClassModelFactoryImpl.eINSTANCE.createClassModel
		val Clazz c1 = ClassModelFactoryImpl.eINSTANCE.createClazz
		val Clazz c2 = ClassModelFactoryImpl.eINSTANCE.createClazz
		val Clazz c3 = ClassModelFactoryImpl.eINSTANCE.createClazz
		val Clazz c4 = ClassModelFactoryImpl.eINSTANCE.createClazz
		val Clazz c5 = ClassModelFactoryImpl.eINSTANCE.createClazz
		
		c1.name = "c1"
		result.classes.add(c1)
		c2.name = "c2"
		result.classes.add(c2)
		c3.name = "c3"
		result.classes.add(c3)
		c4.name = "c4"
		result.classes.add(c4)
		c5.name = "c5"
		result.classes.add(c5)
		
		c1.superClasses.add(c2)
		c2.superClasses.add(c3)
		c3.superClasses.add(c4)
		c4.superClasses.add(c5)
		requiredClazzs.add(c3)
		return result
	}
}
