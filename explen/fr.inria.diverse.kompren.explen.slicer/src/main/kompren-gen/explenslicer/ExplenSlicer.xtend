package explenslicer

import static extension explenslicer.__SlicerAspect__.*
import static extension explenslicer.orgeclipseemfecoreEClassAspect.*
import static extension explenslicer.orgeclipseemfecoreEReferenceAspect.*
import static extension explenslicer.orgeclipseemfecoreEAttributeAspect.*
import static extension explenslicer.orgeclipseemfecoreEOperationAspect.*
import static extension explenslicer.orgeclipseemfecoreEStructuralFeatureAspect.*
class ExplenSlicer{
	val java.util.List<org.eclipse.emf.ecore.EClass> inputEClass
	public val boolean optionlowerType
	public val boolean optioneOperations
	public val boolean optioneStructuralFeatures
	public val boolean optioneSuperTypes

	val org.eclipse.emf.ecore.EObject _root

	new(java.util.List<org.eclipse.emf.ecore.EClass> inputEClass, org.eclipse.emf.ecore.EObject metamodelRoot, boolean optionlowerType, boolean optioneOperations, boolean optioneStructuralFeatures, boolean optioneSuperTypes){
		this.inputEClass = inputEClass
		if(metamodelRoot===null) throw new IllegalArgumentException
		this._root = metamodelRoot
		this.optionlowerType = optionlowerType
		this.optioneOperations = optioneOperations
		this.optioneStructuralFeatures = optioneStructuralFeatures
		this.optioneSuperTypes = optioneSuperTypes
	}

	def void slice(){
		_root.feedOpposites
		onStart
		inputEClass?.forEach[visitToAddClasses(this)]
		inputEClass?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onEClassSliced(org.eclipse.emf.ecore.EClass theVar){
		 
	}
	def void onEReferenceSliced(org.eclipse.emf.ecore.EReference theVar){
		 
	}
	def void onEAttributeSliced(org.eclipse.emf.ecore.EAttribute theVar){
		 
	}
	def void onEOperationSliced(org.eclipse.emf.ecore.EOperation theVar){
		 
	}
	def void onEStructuralFeatureSliced(org.eclipse.emf.ecore.EStructuralFeature feat){
		 
	}
	def void oneSuperTypesSliced(org.eclipse.emf.ecore.EClass clazz, org.eclipse.emf.ecore.EClass superClass){
		 
	}
	def void onlowerTypeSliced(org.eclipse.emf.ecore.EClass clazz, org.eclipse.emf.ecore.EClass lowerClass){
		 
	}
	def void oneTypeSliced(org.eclipse.emf.ecore.ETypedElement theSrc, org.eclipse.emf.ecore.EClassifier theTgt){
		 
	}
	def void oneStructuralFeaturesSliced(org.eclipse.emf.ecore.EClass theSrc, org.eclipse.emf.ecore.EStructuralFeature theTgt){
		 
	}
	def void oneOperationsSliced(org.eclipse.emf.ecore.EClass theSrc, org.eclipse.emf.ecore.EOperation theTgt){
		 
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

}
