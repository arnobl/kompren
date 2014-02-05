package strictEcore

import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension strictEcore.__SlicerAspect__.*

class StrictEcore{
	val List<EClass> inputEClass
	val List<EStructuralFeature> inputEStructuralFeature
	private val List<EObject> clonedElts = new ArrayList
	public val boolean optioneSuperTypes

	val EObject _root

	new(List<EClass> inputEClass,List<EStructuralFeature> inputEStructuralFeature, EObject metamodelRoot, boolean optioneSuperTypes){
		this.inputEClass = inputEClass
		this.inputEStructuralFeature = inputEStructuralFeature
		if(metamodelRoot==null) throw new IllegalArgumentException
		this._root = metamodelRoot
		this.optioneSuperTypes = optioneSuperTypes
	}

	def void slice(){
		_root.feedOpposites
		inputEClass?.forEach[visitToAddClasses(this)]
		inputEStructuralFeature?.forEach[visitToAddClasses(this)]
		inputEClass?.forEach[visitToAddRelations(this)]
		inputEStructuralFeature?.forEach[visitToAddRelations(this)]
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

