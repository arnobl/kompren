package fullvisitorgen

import static extension fullvisitorgen.__SlicerAspect__.*
import static extension fullvisitorgen.orgeclipseemfecoreEClassAspect.*
import static extension fullvisitorgen.orgeclipseemfecoreEReferenceAspect.*
class FullVisitorGen{

	public var String startQN = null
	private val code = new java.util.ArrayList<String>()
	private def String getQN(org.eclipse.emf.ecore.ENamedElement elt) {
		if(elt.eContainer instanceof org.eclipse.emf.ecore.ENamedElement)
			return getQN(elt.eContainer as org.eclipse.emf.ecore.ENamedElement) + "." + elt.name
		return elt.name;
	}
	
	def String getCode() {
		java.util.Collections.sort(code)
		return code.join("\n")
	}
	
	val java.util.List<org.eclipse.emf.ecore.EPackage> inputEPackage
	public val boolean compo

	val org.eclipse.emf.ecore.EObject _root

	new(java.util.List<org.eclipse.emf.ecore.EPackage> inputEPackage, boolean compo){
		this.inputEPackage = inputEPackage
		if(metamodelRoot===null) throw new IllegalArgumentException
		this._root = metamodelRoot
		this.compo=compo
	}

	def void slice(){
		_root.feedOpposites
		onStart
		inputEPackage?.forEach[visitToAddClasses(this)]
		inputEPackage?.forEach[visitToAddRelations(this)]
		onEnd
	}

	def void onEClassSliced(org.eclipse.emf.ecore.EClass cl){
		
		val qn = getQN(cl)
		if(qn!=null && (startQN==null || qn.startsWith(startQN))) {
			code.add("\tslicedClass: " + qn)
		}
	
	}
	def void onEReferenceSliced(org.eclipse.emf.ecore.EReference ref){
		
		val qn = getQN(ref)
		if(qn!=null && (startQN==null || qn.startsWith(startQN))) {
			code.add("\tslicedProperty: " + qn)
		}
	
	}
	def void oneSuperTypesSliced(org.eclipse.emf.ecore.EClass theSrc, org.eclipse.emf.ecore.EClass theTgt){
		 
	}
	def void oneStructuralFeaturesSliced(org.eclipse.emf.ecore.EClass clazz, org.eclipse.emf.ecore.EStructuralFeature feat){
		 
	}
	def void oneOperationsSliced(org.eclipse.emf.ecore.EClass clazz, org.eclipse.emf.ecore.EOperation op){
		 
	}
	def void oneTypeSliced(org.eclipse.emf.ecore.ETypedElement theSrc, org.eclipse.emf.ecore.EClassifier theTgt){
		 
	}
	def void oneContainingClassSliced(org.eclipse.emf.ecore.EOperation theSrc, org.eclipse.emf.ecore.EClass theTgt){
		 
	}
	def void oneContainingClassSliced(org.eclipse.emf.ecore.EStructuralFeature theSrc, org.eclipse.emf.ecore.EClass theTgt){
		 
	}
	def void onePackageSliced(org.eclipse.emf.ecore.EClassifier theSrc, org.eclipse.emf.ecore.EPackage theTgt){
		 
	}
	def void oneSuperPackageSliced(org.eclipse.emf.ecore.EPackage theSrc, org.eclipse.emf.ecore.EPackage theTgt){
		 
	}
	def void oneSubpackagesSliced(org.eclipse.emf.ecore.EPackage theSrc, org.eclipse.emf.ecore.EPackage theTgt){
		 
	}
	def void oneClassifiersSliced(org.eclipse.emf.ecore.EPackage theSrc, org.eclipse.emf.ecore.EClassifier theTgt){
		 
	}

	protected def void onStart(){
	}

	protected def void onEnd(){
	}

	def void reinit() {
		_root.reinit
	}
}
