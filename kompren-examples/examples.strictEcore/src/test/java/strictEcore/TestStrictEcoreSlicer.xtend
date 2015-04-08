package strictEcore

import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.junit.After
import org.junit.Before
import org.junit.Test
import strictecore.StrictEcore

class TestStrictEcoreSlicer {
	var ResourceSet rs
	
	@Before
	def void setUp() {
		EcoreFactoryImpl.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		rs = new ResourceSetImpl
	}
	
	@After
	def void tearDown() {
		for(var i = rs.getResources.iterator; i.hasNext;) {
			i.next.unload
			i.remove
		}
		println("-----")
	}
	
	@Test def void testSlicer() {
		val List<EModelElement> inputs = new  ArrayList
		val res = rs.getResource(URI.createURI("My.ecore"), true)
		res.load(Collections.emptyMap)
		val mm = res.contents.filter(EPackage).head
		inputs.add(mm.EClassifiers.filter(EClass).findFirst[name=="A"])
		val slicer = new StrictEcore(inputs, mm, false, "ecore", true)
		slicer.slice
		slicer.reinit
		res.unload
	}
	
//	@Test def void testExternMMs() {
//		val List<EModelElement> inputs = new  ArrayList
//		val res = rs.getResource(URI.createURI("src/test/java/model/sample.ecore"), true)
//		res.load(Collections.emptyMap)
//		val mm = res.contents.filter(EPackage).head
//		inputs.add(mm.EClassifiers.filter(EClass).findFirst[name=="A"])
//		val slicer = new StrictEcore(inputs, mm, false, "ecore", true)
//		slicer.slice
//		slicer.reinit
//		res.unload
//	}	
}