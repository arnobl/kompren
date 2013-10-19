package fr.inria.triskell.kompren.oclSlicer

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.ETypedElement
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import java.util.Set
import java.util.HashSet

@Aspect(className=typeof(Object))
abstract class EcoreSlicerVisitor {
	var boolean sliced = false
	
	protected var EModelElement clonedElt = null//FIXME generics

	def void visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theEcoreSlicer)
		}
	}
	
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) { }
	
	def void initOpposites() {}
	
	def void completeSlice() {}
}

@Aspect(className=typeof(EModelElement))
abstract class EModelElementAspect extends EcoreSlicerVisitor{
	def boolean isEcoreElement() {
		return _self.eContainer instanceof EPackage && "ecore".equals((_self.eContainer as EPackage).name)
	}
}


@Aspect(className=typeof(EClassifier))
abstract class EClassifierAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		val obj = _self.clonedElt as EClassifier//FIXME
		if(_self.EPackage!=null) {
			_self.EPackage.visitToAddClasses(theEcoreSlicer)
			(_self.EPackage.clonedElt as EPackage).EClassifiers.add(obj)
		}
		_self.super__visitToAddClasses(theEcoreSlicer)
	}
}


@Aspect(className=typeof(EClass))
class EClassAspect extends EClassifierAspect {
	Set<EClass> subClasses = new HashSet
	
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		_self.clonedElt=EcoreFactoryImpl.eINSTANCE.createEClass
		val obj = _self.clonedElt as EClass//FIXME
		theEcoreSlicer.classes.add(obj)
		_self.super__visitToAddClasses(theEcoreSlicer)

		_self.EStructuralFeatures.filter[lowerBound>0].forEach[visitToAddClasses(theEcoreSlicer)]
		_self.subClasses.forEach[cl |
			cl.visitToAddClasses(theEcoreSlicer)
			val cl2 = cl.clonedElt as EClass
			if(!cl2.ESuperTypes.contains(obj))
				cl2.ESuperTypes.add(obj)					
		]
	}
	
	@OverrideAspectMethod
	def void initOpposites() {
		_self.ESuperTypes.forEach[subClasses.add(_self)]
	}
}


@Aspect(className=typeof(ENamedElement))
abstract class ENamedElementAspect extends EModelElementAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		val obj = _self.clonedElt as ENamedElement//FIXME
		obj.name = _self.name
		_self.super__visitToAddClasses(theEcoreSlicer)
	}
}



@Aspect(className=typeof(EPackage))
class EPackageAspect extends ENamedElementAspect {
	@OverrideAspectMethod
	def void initOpposites() {
		_self.EClassifiers.forEach[initOpposites]
		_self.ESubpackages.forEach[initOpposites]
	}
	
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEPackage
		val obj = _self.clonedElt as EPackage//FIXME
		obj.nsPrefix = _self.nsPrefix
		obj.nsURI = _self.nsURI
		theEcoreSlicer.pkgs.add(obj)
		_self.super__visitToAddClasses(theEcoreSlicer)
		_self.ESuperPackage?.visitToAddClasses(theEcoreSlicer)
	}
}



@Aspect(className=typeof(EDataType))
class EDataTypeAspect extends EClassifierAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		if(_self.clonedElt==null) _self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEDataType
		val obj = _self.clonedElt as EDataType//FIXME
		obj.serializable = _self.serializable
		obj.instanceTypeName = _self.instanceTypeName
		_self.super__visitToAddClasses(theEcoreSlicer)
	}
}


@Aspect(className=typeof(EEnum))
class EENumAspect extends EDataTypeAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEEnum
		_self.super__visitToAddClasses(theEcoreSlicer)
	}
}


@Aspect(className=typeof(EEnumLiteral))
class EENumLiteralAspect extends ENamedElementAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEEnumLiteral
		val obj = _self.clonedElt as EEnumLiteral //FIXME
		(_self.EEnum.clonedElt as EEnum).ELiterals.add(obj)
		_self.super__visitToAddClasses(theEcoreSlicer)
	}
}


@Aspect(className=typeof(ETypedElement))
abstract class ETypedElementAspect extends ENamedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		val obj = _self.clonedElt as ETypedElement//FIXME
		if(_self.EType!=null) {
			if(_self.EType.isEcoreElement) {
				obj.EType = _self.EType
			}else {
				_self.EType.visitToAddClasses(theEcoreSlicer)
				obj.EType = _self.EType.clonedElt as EClassifier
			}
		}
		obj.lowerBound = _self.lowerBound
		obj.upperBound = _self.upperBound
		obj.ordered = _self.ordered
		obj.unique = _self.unique
		_self.super__visitToAddClasses(theEcoreSlicer)
	}
}


@Aspect(className=typeof(EOperation))
class EOperationAspect extends ETypedElementAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEOperation
		val obj = _self.clonedElt as EOperation
		_self.super__visitToAddClasses(theEcoreSlicer)
		_self.EParameters.forEach[param |
			param.visitToAddClasses(theEcoreSlicer)
			obj.EParameters.add(param.clonedElt as EParameter)
		]
		_self.EContainingClass.visitToAddClasses(theEcoreSlicer)
		(_self.EContainingClass.clonedElt as EClass).EOperations.add(obj)
	}
}



@Aspect(className=typeof(EAttribute))
class EAttributeAspect extends EStructuralFeatureAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEAttribute
		_self.super__visitToAddClasses(theEcoreSlicer)
	}
}



@Aspect(className=typeof(EParameter))
class EParameterAspect extends ETypedElementAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEParameter
		_self.super__visitToAddClasses(theEcoreSlicer)
		_self.EOperation.visitToAddClasses(theEcoreSlicer)
	}
}


@Aspect(className=typeof(EReference))
class EReferenceAspect extends EStructuralFeatureAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEReference
		val ref = _self.clonedElt as EReference//FIXME
		ref.name=_self.name
		ref.upperBound=_self.upperBound
		ref.lowerBound=_self.lowerBound
		_self.super__visitToAddClasses(theEcoreSlicer)
		_self.EReferenceType.visitToAddClasses(theEcoreSlicer)
		theEcoreSlicer.refToComplete.add(_self)
	}
	
	@OverrideAspectMethod
	def void completeSlice() {
		if(_self.EOpposite.sliced)
			(_self.clonedElt as EReference).EOpposite = (_self.EOpposite.clonedElt as EReference)
	}
}


@Aspect(className=typeof(EStructuralFeature))
abstract class EStructuralFeatureAspect extends ETypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(EcoreSlicer theEcoreSlicer) {
		val obj = _self.clonedElt as EStructuralFeature//FIXME
		_self.super__visitToAddClasses(theEcoreSlicer)
		_self.EContainingClass.visitToAddClasses(theEcoreSlicer)
		(_self.EContainingClass.clonedElt as EClass).EStructuralFeatures.add(obj)
	}
}
