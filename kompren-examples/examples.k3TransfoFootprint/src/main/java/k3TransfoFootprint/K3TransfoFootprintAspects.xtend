package k3TransfoFootprint
import org.eclipse.xtext.xbase.annotations.xAnnotations.*
import org.eclipse.xtext.xtype.*
import org.eclipse.xtext.xbase.*
import org.eclipse.xtext.common.types.*

import static extension k3TransfoFootprint.__SlicerAspect__.*
import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import java.util.List
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

@Aspect(className=typeof(Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false
	protected var EObject clonedElt = null

	def void visitToAddClasses(K3TransfoFootprint theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(K3TransfoFootprint theSlicer){}

	def void visitToAddRelations(K3TransfoFootprint theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(K3TransfoFootprint theSlicer){}

	def void feedOpposites(){}
}

@Aspect(className=typeof(JvmIdentifiableElement))
abstract class JvmIdentifiableElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		theSlicer.onJvmIdentifiableElementSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmType))
abstract class JvmTypeAspect extends JvmIdentifiableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmVoid))
class JvmVoidAspect extends JvmTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmComponentType))
abstract class JvmComponentTypeAspect extends JvmTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmPrimitiveType))
class JvmPrimitiveTypeAspect extends JvmComponentTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmArrayType))
class JvmArrayTypeAspect extends JvmComponentTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmDeclaredType))
abstract class JvmDeclaredTypeAspect extends JvmMemberAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmTypeParameter))
class JvmTypeParameterAspect extends JvmComponentTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmTypeParameterDeclarator))
abstract class JvmTypeParameterDeclaratorAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmConstraintOwner))
abstract class JvmConstraintOwnerAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmTypeConstraint))
abstract class JvmTypeConstraintAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmUpperBound))
class JvmUpperBoundAspect extends JvmTypeConstraintAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmLowerBound))
class JvmLowerBoundAspect extends JvmTypeConstraintAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmAnnotationType))
class JvmAnnotationTypeAspect extends JvmDeclaredTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmEnumerationType))
class JvmEnumerationTypeAspect extends JvmDeclaredTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmEnumerationLiteral))
class JvmEnumerationLiteralAspect extends JvmFieldAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmGenericType))
class JvmGenericTypeAspect extends JvmDeclaredTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmTypeReference))
abstract class JvmTypeReferenceAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		theSlicer.onJvmTypeReferenceSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmParameterizedTypeReference))
class JvmParameterizedTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmGenericArrayTypeReference))
class JvmGenericArrayTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmWildcardTypeReference))
class JvmWildcardTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmAnyTypeReference))
class JvmAnyTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmMultiTypeReference))
class JvmMultiTypeReferenceAspect extends JvmCompoundTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmMember))
abstract class JvmMemberAspect extends JvmAnnotationTargetAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmFeature))
abstract class JvmFeatureAspect extends JvmMemberAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmField))
class JvmFieldAspect extends JvmFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmExecutable))
abstract class JvmExecutableAspect extends JvmFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^parameters.forEach[visitToAddClasses(theSlicer)]
		_self.^exceptions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^parameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		_self.^exceptions.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmConstructor))
class JvmConstructorAspect extends JvmExecutableAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmOperation))
class JvmOperationAspect extends JvmExecutableAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmFormalParameter))
class JvmFormalParameterAspect extends JvmAnnotationTargetAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^parameterType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^parameterType!=null){
		_self.^parameterType.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(JvmAnnotationTarget))
abstract class JvmAnnotationTargetAspect extends JvmIdentifiableElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmAnnotationReference))
class JvmAnnotationReferenceAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmAnnotationValue))
abstract class JvmAnnotationValueAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmIntAnnotationValue))
class JvmIntAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmBooleanAnnotationValue))
class JvmBooleanAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmByteAnnotationValue))
class JvmByteAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmShortAnnotationValue))
class JvmShortAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmLongAnnotationValue))
class JvmLongAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmDoubleAnnotationValue))
class JvmDoubleAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmFloatAnnotationValue))
class JvmFloatAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmCharAnnotationValue))
class JvmCharAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmStringAnnotationValue))
class JvmStringAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmTypeAnnotationValue))
class JvmTypeAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmAnnotationAnnotationValue))
class JvmAnnotationAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmEnumAnnotationValue))
class JvmEnumAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmDelegateTypeReference))
class JvmDelegateTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmSpecializedTypeReference))
abstract class JvmSpecializedTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmSynonymTypeReference))
class JvmSynonymTypeReferenceAspect extends JvmCompoundTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmUnknownTypeReference))
class JvmUnknownTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmCompoundTypeReference))
abstract class JvmCompoundTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(JvmCustomAnnotationValue))
class JvmCustomAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XExpression))
abstract class XExpressionAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XIfExpression))
class XIfExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^if?.visitToAddClasses(theSlicer)
		_self.^then?.visitToAddClasses(theSlicer)
		_self.^else?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^if!=null){
		_self.^if.visitToAddRelations(theSlicer)
}
		if(_self.^then!=null){
		_self.^then.visitToAddRelations(theSlicer)
}
		if(_self.^else!=null){
		_self.^else.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XSwitchExpression))
class XSwitchExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^switch?.visitToAddClasses(theSlicer)
		_self.^cases.forEach[visitToAddClasses(theSlicer)]
		_self.^default?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^switch!=null){
		_self.^switch.visitToAddRelations(theSlicer)
}
		_self.^cases.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		if(_self.^default!=null){
		_self.^default.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XCasePart))
class XCasePartAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^case?.visitToAddClasses(theSlicer)
		_self.^then?.visitToAddClasses(theSlicer)
		_self.^typeGuard?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^case!=null){
		_self.^case.visitToAddRelations(theSlicer)
}
		if(_self.^then!=null){
		_self.^then.visitToAddRelations(theSlicer)
}
		if(_self.^typeGuard!=null){
		_self.^typeGuard.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XBlockExpression))
class XBlockExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expressions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^expressions.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XVariableDeclaration))
class XVariableDeclarationAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^right?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
}
		if(_self.^right!=null){
		_self.^right.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XAbstractFeatureCall))
abstract class XAbstractFeatureCallAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^feature?.visitToAddClasses(theSlicer)
		_self.^typeArguments.forEach[visitToAddClasses(theSlicer)]
		_self.^implicitReceiver?.visitToAddClasses(theSlicer)
		_self.^implicitFirstArgument?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^feature!=null){
		_self.^feature.visitToAddRelations(theSlicer)
}
		_self.^typeArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		if(_self.^implicitReceiver!=null){
		_self.^implicitReceiver.visitToAddRelations(theSlicer)
}
		if(_self.^implicitFirstArgument!=null){
		_self.^implicitFirstArgument.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XMemberFeatureCall))
class XMemberFeatureCallAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^memberCallTarget?.visitToAddClasses(theSlicer)
		_self.^memberCallArguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^memberCallTarget!=null){
		_self.^memberCallTarget.visitToAddRelations(theSlicer)
}
		_self.^memberCallArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XFeatureCall))
class XFeatureCallAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^featureCallArguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^featureCallArguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XConstructorCall))
class XConstructorCallAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^constructor?.visitToAddClasses(theSlicer)
		_self.^arguments.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^constructor!=null){
		_self.^constructor.visitToAddRelations(theSlicer)
}
		_self.^arguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XBooleanLiteral))
class XBooleanLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XNullLiteral))
class XNullLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XNumberLiteral))
class XNumberLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XStringLiteral))
class XStringLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XCollectionLiteral))
abstract class XCollectionLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^elements.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^elements.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XListLiteral))
class XListLiteralAspect extends XCollectionLiteralAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XSetLiteral))
class XSetLiteralAspect extends XCollectionLiteralAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XClosure))
class XClosureAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^declaredFormalParameters.forEach[visitToAddClasses(theSlicer)]
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^implicitParameter?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^declaredFormalParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
}
		if(_self.^implicitParameter!=null){
		_self.^implicitParameter.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XCastedExpression))
class XCastedExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^target?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
}
		if(_self.^target!=null){
		_self.^target.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XBinaryOperation))
class XBinaryOperationAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^leftOperand?.visitToAddClasses(theSlicer)
		_self.^rightOperand?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^leftOperand!=null){
		_self.^leftOperand.visitToAddRelations(theSlicer)
}
		if(_self.^rightOperand!=null){
		_self.^rightOperand.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XUnaryOperation))
class XUnaryOperationAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^operand?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^operand!=null){
		_self.^operand.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XForLoopExpression))
class XForLoopExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^forExpression?.visitToAddClasses(theSlicer)
		_self.^eachExpression?.visitToAddClasses(theSlicer)
		_self.^declaredParam?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^forExpression!=null){
		_self.^forExpression.visitToAddRelations(theSlicer)
}
		if(_self.^eachExpression!=null){
		_self.^eachExpression.visitToAddRelations(theSlicer)
}
		if(_self.^declaredParam!=null){
		_self.^declaredParam.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XAbstractWhileExpression))
abstract class XAbstractWhileExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^predicate?.visitToAddClasses(theSlicer)
		_self.^body?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^predicate!=null){
		_self.^predicate.visitToAddRelations(theSlicer)
}
		if(_self.^body!=null){
		_self.^body.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XDoWhileExpression))
class XDoWhileExpressionAspect extends XAbstractWhileExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XWhileExpression))
class XWhileExpressionAspect extends XAbstractWhileExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XTypeLiteral))
class XTypeLiteralAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^type.visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XInstanceOfExpression))
class XInstanceOfExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^type.visitToAddRelations(theSlicer)
		_self.^expression.visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(XThrowExpression))
class XThrowExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XTryCatchFinallyExpression))
class XTryCatchFinallyExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^finallyExpression?.visitToAddClasses(theSlicer)
		_self.^catchClauses.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
}
		if(_self.^finallyExpression!=null){
		_self.^finallyExpression.visitToAddRelations(theSlicer)
}
		_self.^catchClauses.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(XCatchClause))
class XCatchClauseAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)
		_self.^declaredParam?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
}
		if(_self.^declaredParam!=null){
		_self.^declaredParam.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XAssignment))
class XAssignmentAspect extends XAbstractFeatureCallAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^assignable?.visitToAddClasses(theSlicer)
		_self.^value?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^assignable!=null){
		_self.^assignable.visitToAddRelations(theSlicer)
}
		if(_self.^value!=null){
		_self.^value.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(XReturnExpression))
class XReturnExpressionAspect extends XExpressionAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^expression?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^expression!=null){
		_self.^expression.visitToAddRelations(theSlicer)
}

	}
}


