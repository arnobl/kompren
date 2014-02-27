package fr.inria.triskell.kompren.oclSlicer

import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.triskell.kompren.oclSlicer.__SlicerAspect__.*

class StrictEcore{
	val List<EModelElement> inputEModelElement
	private val List<EObject> clonedElts = newArrayList
	public val boolean optionlowerTypes
	val String nameExtension

	val List<EObject> _root

	new(List<EModelElement> inputEModelElement, List<EObject> metamodelRoot, boolean optionlowerTypes, String nameExtension){
		this.inputEModelElement = inputEModelElement
		if(metamodelRoot==null) throw new IllegalArgumentException
		this._root = metamodelRoot
		this.optionlowerTypes = optionlowerTypes
		this.nameExtension=nameExtension
	}

	def void slice(){
		_root.forEach[feedOpposites]
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
		val res = resSet.createResource(URI.createURI("modelSlice."+this.nameExtension))
		res.getContents.addAll(objs)
	    res.save(Collections.emptyMap)
	    res.unload
	}

}
