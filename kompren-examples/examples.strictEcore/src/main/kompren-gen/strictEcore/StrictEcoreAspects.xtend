package strictEcore
import org.eclipse.emf.ecore.*
import org.eclipse.emf.ecore.impl.*

import static extension strictEcore.__SlicerAspect__.*
import static extension strictEcore.ENamedElementAspect.*
import static extension strictEcore.EClassifierAspect.*
import static extension strictEcore.ETypeParameterAspect.*
import static extension strictEcore.ETypedElementAspect.*
import static extension strictEcore.EStructuralFeatureAspect.*
import static extension strictEcore.EClassAspect.*
import static extension strictEcore.EOperationAspect.*
import static extension strictEcore.EReferenceAspect.*
import static extension strictEcore.EAttributeAspect.*
import static extension strictEcore.EEnumLiteralAspect.*
import static extension strictEcore.EModelElementAspect.*
import static extension strictEcore.EAnnotationAspect.*
import static extension strictEcore.EFactoryAspect.*
import static extension strictEcore.EParameterAspect.*
import static extension strictEcore.EDataTypeAspect.*
import static extension strictEcore.EEnumAspect.*
import static extension strictEcore.EPackageAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.List
import java.util.ArrayList
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
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEAttribute
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EAttributeType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EAttributeType!=null){
		_self.^EAttributeType.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(EAnnotation))
class EAnnotationAspect extends EModelElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEAnnotation
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
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEClass
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^ESuperTypes.forEach[visitToAddClasses(theSlicer)]
		_self.^EStructuralFeatures.forEach[visitToAddClasses(theSlicer)]
		_self.^EOperations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ESuperTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EClass).^ESuperTypes.add( _elt.clonedElt as EClass)
		]
		_self.^EStructuralFeatures.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EClass).^EStructuralFeatures.add( _elt.clonedElt as EStructuralFeature)
		]
		_self.^EOperations.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EClass).^EOperations.add( _elt.clonedElt as EOperation)
		]

	}
}

@Aspect(className=typeof(EClassifier))
abstract class EClassifierAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EDataType))
class EDataTypeAspect extends EClassifierAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEDataType
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EEnum))
class EEnumAspect extends EDataTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEEnum
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^ELiterals.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^ELiterals.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EEnum).^ELiterals.add( _elt.clonedElt as EEnumLiteral)
		]

	}
}

@Aspect(className=typeof(EEnumLiteral))
class EEnumLiteralAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEEnumLiteral
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(EFactory))
class EFactoryAspect extends EModelElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEFactory
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EPackage?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EPackage!=null){
		_self.^EPackage.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EPackage.sliced) (_self.clonedElt as EFactory).^EPackage = _self.^EPackage.clonedElt as EPackage
		}

	}
}

@Aspect(className=typeof(EModelElement))
abstract class EModelElementAspect extends __SlicerAspect__{
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
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

		if(_self.sliced) (_self.clonedElt as ENamedElement).^name = _self.^name

	}
}

@Aspect(className=typeof(EObject))
class EObjectAspect extends __SlicerAspect__{
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
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEOperation
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EParameters.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^EParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) (_self.clonedElt as EOperation).^EParameters.add( _elt.clonedElt as EParameter)
		]

	}
}

@Aspect(className=typeof(EPackage))
class EPackageAspect extends ENamedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEPackage
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EFactoryInstance?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EFactoryInstance!=null){
		_self.^EFactoryInstance.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^EFactoryInstance.sliced) (_self.clonedElt as EPackage).^EFactoryInstance = _self.^EFactoryInstance.clonedElt as EFactory
		}

	}
}

@Aspect(className=typeof(EParameter))
class EParameterAspect extends ETypedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEParameter
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
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createEReference
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^EReferenceType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^EReferenceType!=null){
		_self.^EReferenceType.visitToAddRelations(theSlicer)
		}

	}
}

@Aspect(className=typeof(EStructuralFeature))
abstract class EStructuralFeatureAspect extends ETypedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(StrictEcore theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(ETypedElement))
abstract class ETypedElementAspect extends ENamedElementAspect{
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

	}
}

@Aspect(className=typeof(EGenericType))
class EGenericTypeAspect extends __SlicerAspect__{
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
	def void _visitToAddClasses(StrictEcore theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = EcoreFactoryImpl.eINSTANCE.createETypeParameter
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(StrictEcore theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

