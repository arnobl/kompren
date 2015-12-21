package fullvisitorgen

import static extension fullvisitorgen.__SlicerAspect__.*
import static extension fullvisitorgen.orgeclipseemfecoreEClassAspect.*
import static extension fullvisitorgen.orgeclipseemfecoreEReferenceAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=typeof(java.lang.Object))
abstract class __SlicerAspect__ {
	protected var boolean visitedForRelations = false
	protected var boolean sliced = false
	protected var org.eclipse.emf.ecore.EObject clonedElt = null

	def void visitToAddClasses(FullVisitorGen theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(FullVisitorGen theSlicer){}

	def void visitToAddRelations(FullVisitorGen theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(FullVisitorGen theSlicer){}

	def void feedOpposites(){}

	def void reinit(){
		_self.visitedForRelations = false
		_self.sliced = false
		_self.clonedElt = null
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EAttribute), with=#[typeof(orgeclipseemfecoreEStructuralFeatureAspect)])
class orgeclipseemfecoreEAttributeAspect extends orgeclipseemfecoreEStructuralFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EAnnotation), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
class orgeclipseemfecoreEAnnotationAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^details.forEach[reinit]
_self.^contents.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EClass), with=#[typeof(orgeclipseemfecoreEClassifierAspect)])
class orgeclipseemfecoreEClassAspect extends orgeclipseemfecoreEClassifierAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EOperations.forEach[reinit]
_self.^EStructuralFeatures.forEach[reinit]
_self.^EGenericSuperTypes.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		theSlicer.onEClassSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^ESuperTypes.forEach[visitToAddClasses(theSlicer)]
		_self.^EStructuralFeatures.forEach[visitToAddClasses(theSlicer)]
		_self.^EOperations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ESuperTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oneSuperTypesSliced(_self, _elt)
		]
		_self.^EStructuralFeatures.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oneStructuralFeaturesSliced(_self, _elt)
		]
		_self.^EOperations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oneOperationsSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EClassifier), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
abstract class orgeclipseemfecoreEClassifierAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ETypeParameters.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^EPackage?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EPackage!==null){
		_self.^EPackage.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EPackage.sliced) 		theSlicer.onePackageSliced(_self, _self.^EPackage)
		}

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EDataType), with=#[typeof(orgeclipseemfecoreEClassifierAspect)])
class orgeclipseemfecoreEDataTypeAspect extends orgeclipseemfecoreEClassifierAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EEnum), with=#[typeof(orgeclipseemfecoreEDataTypeAspect)])
class orgeclipseemfecoreEEnumAspect extends orgeclipseemfecoreEDataTypeAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ELiterals.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EEnumLiteral), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreEEnumLiteralAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EFactory), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
class orgeclipseemfecoreEFactoryAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EModelElement), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipseemfecoreEModelElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EAnnotations.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.ENamedElement), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
abstract class orgeclipseemfecoreENamedElementAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EObject), with=#[typeof(__SlicerAspect__)])
class orgeclipseemfecoreEObjectAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EOperation), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
class orgeclipseemfecoreEOperationAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^ETypeParameters.forEach[reinit]
_self.^EParameters.forEach[reinit]
_self.^EGenericExceptions.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^EContainingClass?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EContainingClass!==null){
		_self.^EContainingClass.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EContainingClass.sliced) 		theSlicer.oneContainingClassSliced(_self, _self.^EContainingClass)
		}

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EPackage), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreEPackageAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EClassifiers.forEach[reinit]
_self.^ESubpackages.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^ESuperPackage?.visitToAddClasses(theSlicer)
		_self.^ESubpackages.forEach[visitToAddClasses(theSlicer)]
		_self.^EClassifiers.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^ESuperPackage!==null){
		_self.^ESuperPackage.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^ESuperPackage.sliced) 		theSlicer.oneSuperPackageSliced(_self, _self.^ESuperPackage)
		}
		_self.^ESubpackages.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oneSubpackagesSliced(_self, _elt)
		]
		_self.^EClassifiers.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.oneClassifiersSliced(_self, _elt)
		]

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EParameter), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
class orgeclipseemfecoreEParameterAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EReference), with=#[typeof(orgeclipseemfecoreEStructuralFeatureAspect)])
class orgeclipseemfecoreEReferenceAspect extends orgeclipseemfecoreEStructuralFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		if((!theSlicer.compo || _self.checkcompo)){
		theSlicer.onEReferenceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		if((!theSlicer.compo || _self.checkcompo)){
		_self.super__visitToAddRelations(theSlicer)

		}
	}
	def boolean checkcompo(){
		val ref = _self
		 ref.containment 
	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.EStructuralFeature), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
abstract class orgeclipseemfecoreEStructuralFeatureAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^EContainingClass?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EContainingClass!==null){
		_self.^EContainingClass.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EContainingClass.sliced) 		theSlicer.oneContainingClassSliced(_self, _self.^EContainingClass)
		}

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.ETypedElement), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
abstract class orgeclipseemfecoreETypedElementAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EGenericType?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^EType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
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
	def void reinit(){
		_self.super_reinit
_self.^EUpperBound?.reinit
_self.^ETypeArguments.forEach[reinit]
_self.^ELowerBound?.reinit
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(org.eclipse.emf.ecore.ETypeParameter), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreETypeParameterAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^EBounds.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(FullVisitorGen theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(FullVisitorGen theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

