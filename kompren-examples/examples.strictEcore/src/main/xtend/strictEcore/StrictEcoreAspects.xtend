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
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.ETypeParameter
import org.eclipse.emf.ecore.ETypedElement

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
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

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
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EClass))
class EClassAspect extends EClassifierAspect{
	var List<EClass> lowTypes = new ArrayList

	@OverrideAspectMethod
	def void feedOpposites(){
_self.eSuperTypes.forEach[lowTypes.add(_self)]
_self.eOperations.forEach[feedOpposites]
_self.eStructuralFeatures.forEach[feedOpposites]
_self.eGenericSuperTypes.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.eSuperTypes.forEach[visitToAddClasses(theSlicer)]
		_self.lowTypes.forEach[visitToAddClasses(theSlicer)]
		_self.eStructuralFeatures.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.eSuperTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EClass).eSuperTypes.add( _elt.clonedElt as EClass)
		]
		_self.lowTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EClass).lowTypes.add( _elt.clonedElt as EClass)
		]
		_self.eStructuralFeatures.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EClass).eStructuralFeatures.add( _elt.clonedElt as EStructuralFeature)
		]

		if(_self.sliced) (_self.clonedElt as EClass).abstract = _self.abstract

		if(_self.sliced) (_self.clonedElt as EClass).interface = _self.interface

	}
}

@Aspect(className=typeof(EClassifier))
abstract class EClassifierAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.eTypeParameters.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.ePackage?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.ePackage!=null){
		_self.ePackage.visitToAddRelations(theSlicer)
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
_self.eLiterals.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.eLiterals.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.eLiterals.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EEnum).eLiterals.add( _elt.clonedElt as EEnumLiteral)
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
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EModelElement))
abstract class EModelElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.eAnnotations.forEach[feedOpposites]

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
_self.eTypeParameters.forEach[feedOpposites]
_self.eParameters.forEach[feedOpposites]
_self.eGenericExceptions.forEach[feedOpposites]

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

@Aspect(className=typeof(EPackage))
class EPackageAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.eClassifiers.forEach[feedOpposites]
_self.eSubpackages.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as EPackage).nsPrefix = _self.nsPrefix

		if(_self.sliced) (_self.clonedElt as EPackage).nsURI = _self.nsURI

	}
}

@Aspect(className=typeof(EParameter))
class EParameterAspect extends ETypedElementAspect{
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

@Aspect(className=typeof(EReference))
class EReferenceAspect extends EStructuralFeatureAspect{
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

		if(_self.sliced) (_self.clonedElt as EReference).containment = _self.containment

		if(_self.sliced) (_self.clonedElt as EReference).resolveProxies = _self.resolveProxies

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
if(_self.eGenericType!=null) _self.eGenericType.feedOpposites

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.eType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.eType!=null){
		_self.eType.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.eType.sliced) (_self.clonedElt as ETypedElement).eType = _self.eType.clonedElt as EClassifier
}

		if(_self.sliced) (_self.clonedElt as ETypedElement).ordered = _self.ordered

		if(_self.sliced) (_self.clonedElt as ETypedElement).unique = _self.unique

		if(_self.sliced) (_self.clonedElt as ETypedElement).lowerBound = _self.lowerBound

		if(_self.sliced) (_self.clonedElt as ETypedElement).upperBound = _self.upperBound

	}
}

@Aspect(className=typeof(EStringToStringMapEntry))
class EStringToStringMapEntryAspect extends __SlicerAspect__{
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

@Aspect(className=typeof(EGenericType))
class EGenericTypeAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
if(_self.eUpperBound!=null) _self.eUpperBound.feedOpposites
_self.eTypeArguments.forEach[feedOpposites]
if(_self.eLowerBound!=null) _self.eLowerBound.feedOpposites

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
_self.eBounds.forEach[feedOpposites]

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


