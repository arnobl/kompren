package k3TransfoFootprint

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmAnnotationTarget
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmAnnotationValue
import org.eclipse.xtext.common.types.JvmAnyTypeReference
import org.eclipse.xtext.common.types.JvmArrayType
import org.eclipse.xtext.common.types.JvmBooleanAnnotationValue
import org.eclipse.xtext.common.types.JvmByteAnnotationValue
import org.eclipse.xtext.common.types.JvmCharAnnotationValue
import org.eclipse.xtext.common.types.JvmComponentType
import org.eclipse.xtext.common.types.JvmCompoundTypeReference
import org.eclipse.xtext.common.types.JvmConstraintOwner
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmDelegateTypeReference
import org.eclipse.xtext.common.types.JvmDoubleAnnotationValue
import org.eclipse.xtext.common.types.JvmEnumAnnotationValue
import org.eclipse.xtext.common.types.JvmEnumerationLiteral
import org.eclipse.xtext.common.types.JvmEnumerationType
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.common.types.JvmFeature
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmFloatAnnotationValue
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.common.types.JvmIntAnnotationValue
import org.eclipse.xtext.common.types.JvmLongAnnotationValue
import org.eclipse.xtext.common.types.JvmLowerBound
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmMultiTypeReference
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmPrimitiveType
import org.eclipse.xtext.common.types.JvmShortAnnotationValue
import org.eclipse.xtext.common.types.JvmSpecializedTypeReference
import org.eclipse.xtext.common.types.JvmStringAnnotationValue
import org.eclipse.xtext.common.types.JvmSynonymTypeReference
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue
import org.eclipse.xtext.common.types.JvmTypeConstraint
import org.eclipse.xtext.common.types.JvmTypeParameter
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmUnknownTypeReference
import org.eclipse.xtext.common.types.JvmUpperBound
import org.eclipse.xtext.common.types.JvmVoid
import org.eclipse.xtext.common.types.JvmWildcardTypeReference

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

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)

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
		_self.parameterType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.parameterType!=null){
		_self.parameterType.visitToAddRelations(theSlicer)
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


