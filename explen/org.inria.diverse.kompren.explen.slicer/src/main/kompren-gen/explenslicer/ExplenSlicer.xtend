package explenslicer

import static extension explenslicer.__SlicerAspect__.*
import static extension explenslicer.orgeclipseemfecoreENamedElementAspect.*
import static extension explenslicer.orgeclipseemfecoreEReferenceAspect.*
import static extension explenslicer.orgeclipseemfecoreEAttributeAspect.*
import static extension explenslicer.orgeclipseemfecoreEStructuralFeatureAspect.*
class ExplenSlicer{
	val java.util.List<org.eclipse.emf.ecore.EClass> inputEClass
	public val boolean optionlowerType
	public val boolean optionupperBound
	public val boolean optioneStructuralFeatures
	public val boolean optioneSuperTypes
	public val boolean optioneOperations
	public val boolean optionlowerBound

	val org.eclipse.emf.ecore.EObject _root

	new(java.util.List<org.eclipse.emf.ecore.EClass> inputEClass, org.eclipse.emf.ecore.EObject metamodelRoot, boolean optionlowerType, boolean optionupperBound, boolean optioneStructuralFeatures, boolean optioneSuperTypes, boolean optioneOperations, boolean optionlowerBound){
		this.inputEClass = inputEClass
		if(metamodelRoot==null) throw new IllegalArgumentException
		this._root = metamodelRoot
		this.optionlowerType = optionlowerType
		this.optionupperBound = optionupperBound
		this.optioneStructuralFeatures = optioneStructuralFeatures
		this.optioneSuperTypes = optioneSuperTypes
		this.optioneOperations = optioneOperations
		this.optionlowerBound = optionlowerBound
	}

	def void slice(){
		_root.feedOpposites
		onStart
		inputEClass?.forEach[visitToAddClasses(this)]
		inputEClass?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onENamedElementSliced(org.eclipse.emf.ecore.ENamedElement theVar){
		
	}
	def void onEReferenceSliced(org.eclipse.emf.ecore.EReference theVar){
		
	}
	def void onEAttributeSliced(org.eclipse.emf.ecore.EAttribute theVar){
		
	}
	def void onEStructuralFeatureSliced(org.eclipse.emf.ecore.EStructuralFeature feat){
		
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

}
