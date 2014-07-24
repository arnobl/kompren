package explenslicer

import static extension explenslicer.__SlicerAspect__.*
import static extension explenslicer.orgeclipseemfecoreEClassAspect.*
import static extension explenslicer.orgeclipseemfecoreEReferenceAspect.*
import static extension explenslicer.orgeclipseemfecoreEAttributeAspect.*
import static extension explenslicer.orgeclipseemfecoreEOperationAspect.*
import static extension explenslicer.orgeclipseemfecoreEStructuralFeatureAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=typeof(java.lang.Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false
	protected var org.eclipse.emf.ecore.EObject clonedElt = null

	def void visitToAddClasses(ExplenSlicer theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(ExplenSlicer theSlicer){}

	def void visitToAddRelations(ExplenSlicer theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(ExplenSlicer theSlicer){}

	def void feedOpposites(){}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EAttribute), with=#[typeof(orgeclipseemfecoreEStructuralFeatureAspect)])
class orgeclipseemfecoreEAttributeAspect extends orgeclipseemfecoreEStructuralFeatureAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		if(_self.checkcard1){
		theSlicer.onEAttributeSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		if(_self.checkcard1){
		_self.super__visitToAddRelations(theSlicer)

		}
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EAnnotation), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
class orgeclipseemfecoreEAnnotationAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^details.forEach[feedOpposites]
_self.^contents.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EClass), with=#[typeof(orgeclipseemfecoreEClassifierAspect)])
class orgeclipseemfecoreEClassAspect extends orgeclipseemfecoreEClassifierAspect{
	val java.util.List<org.eclipse.emf.ecore.EClass> ^lowerType = newArrayList

	@OverrideAspectMethod
	def void feedOpposites(){
_self.^ESuperTypes.forEach[^lowerType.add(_self)]
_self.^EOperations.forEach[feedOpposites]
_self.^EStructuralFeatures.forEach[feedOpposites]
_self.^EGenericSuperTypes.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		theSlicer.onEClassSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		if(theSlicer.optioneSuperTypes){
		_self.^ESuperTypes.forEach[visitToAddClasses(theSlicer)]
		}
		if(theSlicer.optionlowerType){
		_self.^lowerType.forEach[visitToAddClasses(theSlicer)]
		}
		if(theSlicer.optioneStructuralFeatures){
		_self.^EStructuralFeatures.forEach[visitToAddClasses(theSlicer)]
		}
		if(theSlicer.optioneOperations){
		_self.^EOperations.forEach[visitToAddClasses(theSlicer)]
		}

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(theSlicer.optioneSuperTypes){
		_self.^ESuperTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oneSuperTypesSliced(_self, _elt)
		]
		}
		if(theSlicer.optionlowerType){
		_self.^lowerType.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oneSuperTypesSliced(_self, _elt)
		]
		}
		if(theSlicer.optioneStructuralFeatures){
		_self.^EStructuralFeatures.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oneStructuralFeaturesSliced(_self, _elt)
		]
		}
		if(theSlicer.optioneOperations){
		_self.^EOperations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oneOperationsSliced(_self, _elt)
		]
		}

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EClassifier), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
abstract class orgeclipseemfecoreEClassifierAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^ETypeParameters.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EDataType), with=#[typeof(orgeclipseemfecoreEClassifierAspect)])
class orgeclipseemfecoreEDataTypeAspect extends orgeclipseemfecoreEClassifierAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EEnum), with=#[typeof(orgeclipseemfecoreEDataTypeAspect)])
class orgeclipseemfecoreEEnumAspect extends orgeclipseemfecoreEDataTypeAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^ELiterals.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EEnumLiteral), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreEEnumLiteralAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EFactory), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
class orgeclipseemfecoreEFactoryAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EModelElement), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipseemfecoreEModelElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EAnnotations.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.ENamedElement), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
abstract class orgeclipseemfecoreENamedElementAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EObject), with=#[typeof(__SlicerAspect__)])
class orgeclipseemfecoreEObjectAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EOperation), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
class orgeclipseemfecoreEOperationAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^ETypeParameters.forEach[feedOpposites]
_self.^EParameters.forEach[feedOpposites]
_self.^EGenericExceptions.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		theSlicer.onEOperationSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EPackage), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreEPackageAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EClassifiers.forEach[feedOpposites]
_self.^ESubpackages.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EParameter), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
class orgeclipseemfecoreEParameterAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EReference), with=#[typeof(orgeclipseemfecoreEStructuralFeatureAspect)])
class orgeclipseemfecoreEReferenceAspect extends orgeclipseemfecoreEStructuralFeatureAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		if(_self.checkcard1){
		theSlicer.onEReferenceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		if(_self.checkcard1){
		_self.super__visitToAddRelations(theSlicer)

		}
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EStructuralFeature), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
abstract class orgeclipseemfecoreEStructuralFeatureAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		if(_self.checkcard1){
		theSlicer.onEStructuralFeatureSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		if(_self.checkcard1){
		_self.super__visitToAddRelations(theSlicer)

		}
	}
	def boolean checkcard1(){
		val feat = _self
		 feat.lowerBound>0 
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.ETypedElement), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
abstract class orgeclipseemfecoreETypedElementAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EGenericType?.feedOpposites

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^EType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EType!==null){
		_self.^EType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EType.sliced) 		theSlicer.oneTypeSliced(_self, _self.^EType)
		}

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EGenericType), with=#[typeof(__SlicerAspect__)])
class orgeclipseemfecoreEGenericTypeAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EUpperBound?.feedOpposites
_self.^ETypeArguments.forEach[feedOpposites]
_self.^ELowerBound?.feedOpposites

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.ETypeParameter), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreETypeParameterAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EBounds.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(ExplenSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ExplenSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

