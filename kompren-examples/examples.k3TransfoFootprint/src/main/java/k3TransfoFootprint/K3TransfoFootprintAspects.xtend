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
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XAbstractWhileExpression
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XBooleanLiteral
import org.eclipse.xtext.xbase.XCasePart
import org.eclipse.xtext.xbase.XCastedExpression
import org.eclipse.xtext.xbase.XCatchClause
import org.eclipse.xtext.xbase.XClosure
import org.eclipse.xtext.xbase.XCollectionLiteral
import org.eclipse.xtext.xbase.XConstructorCall
import org.eclipse.xtext.xbase.XDoWhileExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XForLoopExpression
import org.eclipse.xtext.xbase.XIfExpression
import org.eclipse.xtext.xbase.XInstanceOfExpression
import org.eclipse.xtext.xbase.XListLiteral
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.XNullLiteral
import org.eclipse.xtext.xbase.XNumberLiteral
import org.eclipse.xtext.xbase.XReturnExpression
import org.eclipse.xtext.xbase.XSetLiteral
import org.eclipse.xtext.xbase.XStringLiteral
import org.eclipse.xtext.xbase.XSwitchExpression
import org.eclipse.xtext.xbase.XThrowExpression
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression
import org.eclipse.xtext.xbase.XTypeLiteral
import org.eclipse.xtext.xbase.XUnaryOperation
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.XWhileExpression

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
		_self.^arrayType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^arrayType!=null){
		_self.^arrayType.visitToAddRelations(theSlicer)
}

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
		_self.^componentType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^componentType!=null){
		_self.^componentType.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(JvmDeclaredType))
abstract class JvmDeclaredTypeAspect extends JvmMemberAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^superTypes.forEach[visitToAddClasses(theSlicer)]
		_self.^members.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^superTypes.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		_self.^members.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmTypeParameter))
class JvmTypeParameterAspect extends JvmComponentTypeAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^declarator?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^declarator!=null){
		_self.^declarator.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(JvmTypeParameterDeclarator))
abstract class JvmTypeParameterDeclaratorAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^typeParameters.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^typeParameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmConstraintOwner))
abstract class JvmConstraintOwnerAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^constraints.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^constraints.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmTypeConstraint))
abstract class JvmTypeConstraintAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^typeReference?.visitToAddClasses(theSlicer)
		_self.^owner?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^typeReference!=null){
		_self.^typeReference.visitToAddRelations(theSlicer)
}
		if(_self.^owner!=null){
		_self.^owner.visitToAddRelations(theSlicer)
}

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
		_self.^literals.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^literals.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

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
		_self.^arguments.forEach[visitToAddClasses(theSlicer)]
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^arguments.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(JvmGenericArrayTypeReference))
class JvmGenericArrayTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^componentType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^componentType!=null){
		_self.^componentType.visitToAddRelations(theSlicer)
}

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
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
}

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
		_self.^declaringType?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^declaringType!=null){
		_self.^declaringType.visitToAddRelations(theSlicer)
}

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
		_self.^type?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(JvmExecutable))
abstract class JvmExecutableAspect extends JvmFeatureAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^parameters.forEach[visitToAddClasses(theSlicer)]
		_self.^exceptions.forEach[visitToAddClasses(theSlicer)]
		_self.^parameters.forEach[visitToAddClasses(theSlicer)]
		_self.^exceptions.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^parameters.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
		_self.^exceptions.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]
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
		_self.^returnType?.visitToAddClasses(theSlicer)
		_self.^defaultValue?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^returnType!=null){
		_self.^returnType.visitToAddRelations(theSlicer)
}
		if(_self.^defaultValue!=null){
		_self.^defaultValue.visitToAddRelations(theSlicer)
}

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
		_self.^annotations.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^annotations.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmAnnotationReference))
class JvmAnnotationReferenceAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^annotation?.visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^annotation!=null){
		_self.^annotation.visitToAddRelations(theSlicer)
}
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmAnnotationValue))
abstract class JvmAnnotationValueAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^operation?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^operation!=null){
		_self.^operation.visitToAddRelations(theSlicer)
}

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
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmAnnotationAnnotationValue))
class JvmAnnotationAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmEnumAnnotationValue))
class JvmEnumAnnotationValueAspect extends JvmAnnotationValueAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^values.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^values.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(JvmDelegateTypeReference))
class JvmDelegateTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^delegate?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^delegate!=null){
		_self.^delegate.visitToAddRelations(theSlicer)
}

	}
}

@Aspect(className=typeof(JvmSpecializedTypeReference))
abstract class JvmSpecializedTypeReferenceAspect extends JvmTypeReferenceAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(K3TransfoFootprint theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^equivalent?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^equivalent!=null){
		_self.^equivalent.visitToAddRelations(theSlicer)
}

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
		_self.^type?.visitToAddClasses(theSlicer)
		_self.^references.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(K3TransfoFootprint theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^type!=null){
		_self.^type.visitToAddRelations(theSlicer)
}
		_self.^references.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

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


