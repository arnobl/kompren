package strictecore

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.List
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EGenericType
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.ETypeParameter
import org.eclipse.emf.ecore.ETypedElement
import org.eclipse.emf.ecore.EcoreFactory

import static extension strictecore.orgeclipseemfecoreEAnnotationAspect.*
import static extension strictecore.orgeclipseemfecoreEClassifierAspect.*
import static extension strictecore.orgeclipseemfecoreEEnumLiteralAspect.*
import static extension strictecore.orgeclipseemfecoreEOperationAspect.*
import static extension strictecore.orgeclipseemfecoreEParameterAspect.*
import static extension strictecore.orgeclipseemfecoreEStructuralFeatureAspect.*
import static extension strictecore.orgeclipseemfecoreETypeParameterAspect.*

@Aspect(className=typeof(Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false
	protected var EObject clonedElt = null

	def void visitToAddClasses(StrictEcore theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(StrictEcore theSlicer){}

	def void visitToAddRelations(StrictEcore theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(StrictEcore theSlicer){}

	def void feedOpposites(){}
}

@Aspect(className=typeof(EAttribute), with=#[typeof(orgeclipseemfecoreEStructuralFeatureAspect)])
class orgeclipseemfecoreEAttributeAspect extends orgeclipseemfecoreEStructuralFeatureAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.checkcard1){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEAttribute
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EAttributeType?.visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		if(_self.checkcard1){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EAttributeType!=null){
		_self.^EAttributeType.visitToAddRelations(theSlicer)
		}

		}
	}
}

@Aspect(className=typeof(EAnnotation), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
class orgeclipseemfecoreEAnnotationAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^details.forEach[feedOpposites]
_self.^contents.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEAnnotation
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EClass), with=#[typeof(orgeclipseemfecoreEClassifierAspect)])
class orgeclipseemfecoreEClassAspect extends orgeclipseemfecoreEClassifierAspect{
	val List<EClass> ^lowerTypes = newArrayList

	@OverrideAspectMethod
	def void feedOpposites(){
_self.^ESuperTypes.forEach[^lowerTypes.add(_self)]
_self.^EOperations.forEach[feedOpposites]
_self.^EStructuralFeatures.forEach[feedOpposites]
_self.^EGenericSuperTypes.forEach[feedOpposites]
 
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEClass
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^ESuperTypes.forEach[visitToAddClasses(theSlicer)]
		if(theSlicer.optionlowerTypes){
		_self.^lowerTypes.forEach[visitToAddClasses(theSlicer)]
		}
		_self.^EStructuralFeatures.forEach[visitToAddClasses(theSlicer)]
		_self.^EOperations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ESuperTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!=null) (_self.clonedElt as EClass).^ESuperTypes.add( _elt.clonedElt as EClass)
		]
		if(theSlicer.optionlowerTypes){
		_self.^lowerTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!=null) (_self.clonedElt as EClass).^lowerTypes.add( _elt.clonedElt as EClass)
		]
		}
		_self.^EStructuralFeatures.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!=null) (_self.clonedElt as EClass).^EStructuralFeatures.add( _elt.clonedElt as EStructuralFeature)
		]
		_self.^EOperations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!=null) (_self.clonedElt as EClass).^EOperations.add( _elt.clonedElt as EOperation)
		]

		if(_self.sliced) (_self.clonedElt as EClass).^abstract = _self.^abstract

		if(_self.sliced) (_self.clonedElt as EClass).^interface = _self.^interface

	}
}

@Aspect(className=typeof(EClassifier), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
abstract class orgeclipseemfecoreEClassifierAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^ETypeParameters.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^EPackage?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EPackage!=null){
		_self.^EPackage.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EPackage.sliced) (_self.EPackage.clonedElt as EPackage).^EClassifiers.add(_self.clonedElt as EClassifier)
		}

		if(_self.sliced) (_self.clonedElt as EClassifier).^instanceTypeName = _self.^instanceTypeName

		if(_self.sliced) (_self.clonedElt as EClassifier).^instanceClassName = _self.^instanceClassName

	}
}

@Aspect(className=typeof(EDataType), with=#[typeof(orgeclipseemfecoreEClassifierAspect)])
class orgeclipseemfecoreEDataTypeAspect extends orgeclipseemfecoreEClassifierAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEDataType
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EEnum), with=#[typeof(orgeclipseemfecoreEDataTypeAspect)])
class orgeclipseemfecoreEEnumAspect extends orgeclipseemfecoreEDataTypeAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^ELiterals.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEEnum
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^ELiterals.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ELiterals.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!=null) (_self.clonedElt as EEnum).^ELiterals.add( _elt.clonedElt as EEnumLiteral)
		]

	}
}

@Aspect(className=typeof(EEnumLiteral), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreEEnumLiteralAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEEnumLiteral
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EEnum?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EEnum!=null){
		_self.^EEnum.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EEnum.sliced) (_self.EEnum.clonedElt as EEnum).^ELiterals.add(_self.clonedElt as EEnumLiteral)
		}

		if(_self.sliced) (_self.clonedElt as EEnumLiteral).^value = _self.^value

	}
}

@Aspect(className=typeof(EModelElement), with=#[typeof(__SlicerAspect__)])
abstract class orgeclipseemfecoreEModelElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EAnnotations.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(ENamedElement), with=#[typeof(orgeclipseemfecoreEModelElementAspect)])
abstract class orgeclipseemfecoreENamedElementAspect extends orgeclipseemfecoreEModelElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as ENamedElement).^name = _self.^name

	}
}

@Aspect(className=typeof(EOperation), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
class orgeclipseemfecoreEOperationAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^ETypeParameters.forEach[feedOpposites]
_self.^EParameters.forEach[feedOpposites]
_self.^EGenericExceptions.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEOperation
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EParameters.forEach[visitToAddClasses(theSlicer)]
		_self.^EContainingClass?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^EParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced && _elt.clonedElt!=null) (_self.clonedElt as EOperation).^EParameters.add( _elt.clonedElt as EParameter)
		]
		if(_self.^EContainingClass!=null){
		_self.^EContainingClass.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EContainingClass.sliced) (_self.EContainingClass.clonedElt as EClass).^EOperations.add(_self.clonedElt as EOperation)
		}

	}
}

@Aspect(className=typeof(EPackage), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreEPackageAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EClassifiers.forEach[feedOpposites]
_self.^ESubpackages.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEPackage
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^ESuperPackage?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^ESuperPackage!=null){
		_self.^ESuperPackage.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^ESuperPackage.sliced) (_self.ESuperPackage.clonedElt as EPackage).^ESubpackages.add(_self.clonedElt as EPackage)
		}

		if(_self.sliced) (_self.clonedElt as EPackage).^nsPrefix = _self.^nsPrefix

		if(_self.sliced) (_self.clonedElt as EPackage).^nsURI = _self.^nsURI

	}
}

@Aspect(className=typeof(EParameter), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
class orgeclipseemfecoreEParameterAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEParameter
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EReference), with=#[typeof(orgeclipseemfecoreEStructuralFeatureAspect)])
class orgeclipseemfecoreEReferenceAspect extends orgeclipseemfecoreEStructuralFeatureAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.checkcard1){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createEReference
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EReferenceType?.visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		if(_self.checkcard1){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as EReference).^containment = _self.^containment

		if(_self.sliced) (_self.clonedElt as EReference).^resolveProxies = _self.^resolveProxies
		if(_self.^EReferenceType!=null){
		_self.^EReferenceType.visitToAddRelations(theSlicer)
		}

		}
	}
}

@Aspect(className=typeof(EStructuralFeature), with=#[typeof(orgeclipseemfecoreETypedElementAspect)])
abstract class orgeclipseemfecoreEStructuralFeatureAspect extends orgeclipseemfecoreETypedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.checkcard1){
		_self.super__visitToAddClasses(theSlicer)
		_self.^EContainingClass?.visitToAddClasses(theSlicer)

		}
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		if(_self.checkcard1){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EContainingClass!=null){
		_self.^EContainingClass.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EContainingClass.sliced) (_self.EContainingClass.clonedElt as EClass).^EStructuralFeatures.add(_self.clonedElt as EStructuralFeature)
		}

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).^changeable = _self.^changeable

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).^defaultValueLiteral = _self.^defaultValueLiteral

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).^derived = _self.^derived

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).^transient = _self.^transient

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).^unsettable = _self.^unsettable

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).^volatile = _self.^volatile

		}
	}
	def boolean checkcard1(){
		val feat = _self
		 feat.lowerBound>0 
	}
}

@Aspect(className=typeof(ETypedElement), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
abstract class orgeclipseemfecoreETypedElementAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EGenericType?.feedOpposites

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^EType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EType!=null){
		_self.^EType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EType.sliced) (_self.clonedElt as ETypedElement).^EType = _self.^EType.clonedElt as EClassifier
		}

		if(_self.sliced) (_self.clonedElt as ETypedElement).^lowerBound = _self.^lowerBound

		if(_self.sliced) (_self.clonedElt as ETypedElement).^ordered = _self.^ordered

		if(_self.sliced) (_self.clonedElt as ETypedElement).^unique = _self.^unique

		if(_self.sliced) (_self.clonedElt as ETypedElement).^upperBound = _self.^upperBound

	}
}

@Aspect(className=typeof(EGenericType), with=#[typeof(__SlicerAspect__)])
class orgeclipseemfecoreEGenericTypeAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EUpperBound?.feedOpposites
_self.^ETypeArguments.forEach[feedOpposites]
_self.^ELowerBound?.feedOpposites

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(ETypeParameter), with=#[typeof(orgeclipseemfecoreENamedElementAspect)])
class orgeclipseemfecoreETypeParameterAspect extends orgeclipseemfecoreENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^EBounds.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactory.eINSTANCE.createETypeParameter
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

