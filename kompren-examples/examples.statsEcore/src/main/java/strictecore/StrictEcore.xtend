package strictecore

import static extension strictecore.__SlicerAspect__.*
import static extension strictecore.orgeclipseemfecoreENamedElementAspect.*
import static extension strictecore.orgeclipseemfecoreEStructuralFeatureAspect.*
import static extension strictecore.orgeclipseemfecoreEReferenceAspect.*
import org.eclipse.emf.ecore.EPackage 

class StrictEcore{
	val java.util.List<org.eclipse.emf.ecore.EModelElement> inputEModelElement
	public val boolean card1
	public val boolean compo
	public val EPackage _root
	public var int nbClasses

	new(EPackage root, java.util.List<org.eclipse.emf.ecore.EModelElement> inputEModelElement, boolean card1, boolean compo){
		this.inputEModelElement = inputEModelElement
		this.card1=card1
		this.compo=compo
		_root = root
		nbClasses = 0
	}

	def void slice(){
		onStart
		inputEModelElement?.forEach[visitToAddClasses(this)]
		inputEModelElement?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onEClassSliced(org.eclipse.emf.ecore.EClass theVar){
		 nbClasses +=1
	}
	def void onEStructuralFeatureSliced(org.eclipse.emf.ecore.EStructuralFeature feat){
		 
	}
	def void onEReferenceSliced(org.eclipse.emf.ecore.EReference ref){
		 
	}
	def void oneSuperTypesSliced(org.eclipse.emf.ecore.EClass theSrc, org.eclipse.emf.ecore.EClass theTgt){
		 
	}
	def void oneStructuralFeaturesSliced(org.eclipse.emf.ecore.EClass clazz, org.eclipse.emf.ecore.EStructuralFeature feat){
		 
	}
	def void oneOperationsSliced(org.eclipse.emf.ecore.EClass clazz, org.eclipse.emf.ecore.EOperation op){
		 
	}
	def void oneTypeSliced(org.eclipse.emf.ecore.ETypedElement theSrc, org.eclipse.emf.ecore.EClassifier theTgt){
		 
	}
	def void oneParametersSliced(org.eclipse.emf.ecore.EOperation theSrc, org.eclipse.emf.ecore.EParameter theTgt){
		 
	}
	def void oneContainingClassSliced(org.eclipse.emf.ecore.EOperation theSrc, org.eclipse.emf.ecore.EClass theTgt){
		 
	}
	def void oneLiteralsSliced(org.eclipse.emf.ecore.EEnum theSrc, org.eclipse.emf.ecore.EEnumLiteral theTgt){
		 
	}
	def void oneContainingClassSliced(org.eclipse.emf.ecore.EStructuralFeature theSrc, org.eclipse.emf.ecore.EClass theTgt){
		 
	}
	def void onePackageSliced(org.eclipse.emf.ecore.EClassifier theSrc, org.eclipse.emf.ecore.EPackage theTgt){
		 
	}
	def void oneSuperPackageSliced(org.eclipse.emf.ecore.EPackage theSrc, org.eclipse.emf.ecore.EPackage theTgt){
		 
	}
	def void oneEnumSliced(org.eclipse.emf.ecore.EEnumLiteral theSrc, org.eclipse.emf.ecore.EEnum theTgt){
		 
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
		println(nbClasses)
	}

	def void reinit() {
		_root.reinit
	}
}
