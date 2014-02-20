package strictEcore

import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension strictEcore.__SlicerAspect__.*

class StrictEcore{
	val List<EModelElement> inputEModelElement
	private val List<EObject> clonedElts = new ArrayList

	new(List<EModelElement> inputEModelElement){
		this.inputEModelElement = inputEModelElement
	}

	def void slice(){
		inputEModelElement?.forEach[visitToAddClasses(this)]
		inputEModelElement?.forEach[visitToAddRelations(this)]
		save
	}

	def void objectCloned(EObject object){
		this.clonedElts.add(object)
	}

	def void save(){
		val objs = this.clonedElts.filter[eContainer==null]
		val resSet = new ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val res = resSet.createResource(URI.createURI("modelSlice.xmi"))
		res.getContents.addAll(objs)
	    res.save(Collections.emptyMap)
	    res.unload
	}

}
