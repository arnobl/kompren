package strictEcore
import org.eclipse.emf.ecore.*
import org.eclipse.emf.ecore.impl.*
import static extension strictEcore.__SlicerAspect__.*
import java.util.List

import org.eclipse.emf.ecore.EObject
class StrictEcore{
	val List<EClass> inputEClass
	val List<EStructuralFeature> inputEStructuralFeature
	private val List<EObject> clonedElts = new java.util.ArrayList
	public val boolean optionENamedElement
	public val boolean optioneSuperTypes

	val EObject _root

	new(List<EClass> inputEClass,List<EStructuralFeature> inputEStructuralFeature, EObject metamodelRoot, boolean optionENamedElement,boolean optioneSuperTypes){
		this.inputEClass = inputEClass
		this.inputEStructuralFeature = inputEStructuralFeature
		if(metamodelRoot==null) throw new IllegalArgumentException
		this._root = metamodelRoot
		this.optionENamedElement = optionENamedElement
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
		val resSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl)
		val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("modelSlice.xmi"))
		res.getContents.addAll(objs)
	    res.save(java.util.Collections.emptyMap)
	    res.unload
	}

}

