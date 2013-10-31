package strictEcore

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EGenericType
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.ETypeParameter
import org.eclipse.emf.ecore.ETypedElement
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import org.eclipse.emf.ecore.EObject

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

@Aspect(className=typeof(EAttribute))
class EAttributeAspect extends EStructuralFeatureAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEAttribute as EAttribute
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.EAttributeType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.EAttributeType.visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EAnnotation))
class EAnnotationAspect extends EModelElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.details.forEach[feedOpposites]
_self.contents.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEAnnotation as EAnnotation
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EClass))
class EClassAspect extends EClassifierAspect{
	var List<EClass> subClasses = new ArrayList

	@OverrideAspectMethod
	def void feedOpposites(){
_self.ESuperTypes.forEach[subClasses.add(_self)]
_self.EOperations.forEach[feedOpposites]
_self.EStructuralFeatures.forEach[feedOpposites]
_self.EGenericSuperTypes.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEClass as EClass
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.ESuperTypes.forEach[visitToAddClasses(theSlicer)]
		_self.subClasses.forEach[visitToAddClasses(theSlicer)]
		_self.EStructuralFeatures.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.ESuperTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EClass).ESuperTypes.add( _elt.clonedElt as EClass)
		]
		_self.subClasses.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EClass).subClasses.add( _elt.clonedElt as EClass)
		]
		_self.EStructuralFeatures.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EClass).EStructuralFeatures.add( _elt.clonedElt as EStructuralFeature)
		]

		if(_self.sliced) (_self.clonedElt as EClass).abstract = _self.abstract

		if(_self.sliced) (_self.clonedElt as EClass).interface = _self.interface

	}
}

@Aspect(className=typeof(EClassifier))
abstract class EClassifierAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.ETypeParameters.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.EPackage?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.EPackage!=null){
		_self.EPackage.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.EPackage.sliced) (_self.EPackage.clonedElt as EPackage).EClassifiers.add(_self.clonedElt as EClassifier)
}

		if(_self.sliced) (_self.clonedElt as EClassifier).instanceTypeName = _self.instanceTypeName

		if(_self.sliced) (_self.clonedElt as EClassifier).instanceClassName = _self.instanceClassName

	}
}

@Aspect(className=typeof(EDataType))
class EDataTypeAspect extends EClassifierAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEDataType as EDataType
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as EDataType).serializable = _self.serializable

	}
}

@Aspect(className=typeof(EEnum))
class EEnumAspect extends EDataTypeAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.ELiterals.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEEnum as EEnum
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.ELiterals.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.ELiterals.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EEnum).ELiterals.add( _elt.clonedElt as EEnumLiteral)
		]

	}
}

@Aspect(className=typeof(EEnumLiteral))
class EEnumLiteralAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEEnumLiteral as EEnumLiteral
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as EEnumLiteral).literal = _self.literal

		if(_self.sliced) (_self.clonedElt as EEnumLiteral).value = _self.value

	}
}

@Aspect(className=typeof(EFactory))
class EFactoryAspect extends EModelElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEFactory as EFactory
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.EPackage?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.EPackage.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.EPackage.sliced) (_self.clonedElt as EFactory).EPackage = _self.EPackage.clonedElt as EPackage

	}
}

@Aspect(className=typeof(EModelElement))
abstract class EModelElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.EAnnotations.forEach[feedOpposites]

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

@Aspect(className=typeof(ENamedElement))
abstract class ENamedElementAspect extends EModelElementAspect{
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

		if(_self.sliced) (_self.clonedElt as ENamedElement).name = _self.name

	}
}

@Aspect(className=typeof(EObject))
class EObjectAspect extends __SlicerAspect__{
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

	}
}

@Aspect(className=typeof(EOperation))
class EOperationAspect extends ETypedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.ETypeParameters.forEach[feedOpposites]
_self.EParameters.forEach[feedOpposites]
_self.EGenericExceptions.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEOperation as EOperation
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EPackage))
class EPackageAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.EClassifiers.forEach[feedOpposites]
_self.ESubpackages.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEPackage as EPackage
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.EFactoryInstance?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as EPackage).nsPrefix = _self.nsPrefix

		if(_self.sliced) (_self.clonedElt as EPackage).nsURI = _self.nsURI
		_self.EFactoryInstance.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.EFactoryInstance.sliced) (_self.clonedElt as EPackage).EFactoryInstance = _self.EFactoryInstance.clonedElt as EFactory

	}
}

@Aspect(className=typeof(EParameter))
class EParameterAspect extends ETypedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEParameter as EParameter
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EReference))
class EReferenceAspect extends EStructuralFeatureAspect{
	@OverrideAspectMethod
	def void feedOpposites(){

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEReference as EReference
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.EReferenceType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as EReference).containment = _self.containment

		if(_self.sliced) (_self.clonedElt as EReference).resolveProxies = _self.resolveProxies
		_self.EReferenceType.visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EStructuralFeature))
abstract class EStructuralFeatureAspect extends ETypedElementAspect{
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

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).changeable = _self.changeable

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).volatile = _self.volatile

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).transient = _self.transient

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).defaultValueLiteral = _self.defaultValueLiteral

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).unsettable = _self.unsettable

		if(_self.sliced) (_self.clonedElt as EStructuralFeature).derived = _self.derived

	}
}

@Aspect(className=typeof(ETypedElement))
abstract class ETypedElementAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.EGenericType?.feedOpposites

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.EType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.EType!=null){
		_self.EType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.EType.sliced) (_self.clonedElt as ETypedElement).EType = _self.EType.clonedElt as EClassifier
}

		if(_self.sliced) (_self.clonedElt as ETypedElement).ordered = _self.ordered

		if(_self.sliced) (_self.clonedElt as ETypedElement).unique = _self.unique

		if(_self.sliced) (_self.clonedElt as ETypedElement).lowerBound = _self.lowerBound

		if(_self.sliced) (_self.clonedElt as ETypedElement).upperBound = _self.upperBound

	}
}

@Aspect(className=typeof(EGenericType))
class EGenericTypeAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.EUpperBound?.feedOpposites
_self.ETypeArguments.forEach[feedOpposites]
_self.ELowerBound?.feedOpposites

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

@Aspect(className=typeof(ETypeParameter))
class ETypeParameterAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.EBounds.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createETypeParameter as ETypeParameter
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}


