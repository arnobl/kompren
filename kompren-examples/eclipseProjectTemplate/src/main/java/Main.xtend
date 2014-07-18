import java.util.Collections
import java.util.List
import myslicer.MySlicer
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

class Main {
	def static void main(String[] args) {
		val List<EModelElement> inputs = newArrayList
		val rs = new ResourceSetImpl
		EcoreFactoryImpl::eINSTANCE.eClass
		Resource.Factory.Registry::INSTANCE.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		
		// Loading an ecore model
		val res = rs.getResource(URI::createURI("sampleEcore.ecore"), true)
		res.load(Collections::emptyMap)
		// Getting a root package
		val mm = res.contents.filter(EPackage).head
		// Searching for the class A
		inputs.add(mm.getEClassifiers.filter(EClass).findFirst[name=="A"])
		// Slicing the input ecore model
		val slicer = new MySlicer(inputs, "ecore")
		slicer.slice

		res.unload
		println("Slicing done")
	}
}