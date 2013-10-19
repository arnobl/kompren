package fr.inria.triskell.kompren.oclSlicer

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import org.eclipse.emf.ecore.EObject
import org.eclipse.ocl.ecore.AssociationClassCallExp
import org.eclipse.ocl.ecore.CallExp
import org.eclipse.ocl.ecore.CallOperationAction
import org.eclipse.ocl.ecore.CollectionItem
import org.eclipse.ocl.ecore.CollectionLiteralExp
import org.eclipse.ocl.ecore.CollectionLiteralPart
import org.eclipse.ocl.ecore.CollectionRange
import org.eclipse.ocl.ecore.Constraint
import org.eclipse.ocl.ecore.EnumLiteralExp
import org.eclipse.ocl.ecore.ExpressionInOCL
import org.eclipse.ocl.ecore.FeatureCallExp
import org.eclipse.ocl.ecore.IfExp
import org.eclipse.ocl.ecore.IterateExp
import org.eclipse.ocl.ecore.IteratorExp
import org.eclipse.ocl.ecore.LetExp
import org.eclipse.ocl.ecore.LiteralExp
import org.eclipse.ocl.ecore.LoopExp
import org.eclipse.ocl.ecore.MessageExp
import org.eclipse.ocl.ecore.NavigationCallExp
import org.eclipse.ocl.ecore.OCLExpression
import org.eclipse.ocl.ecore.OperationCallExp
import org.eclipse.ocl.ecore.PropertyCallExp
import org.eclipse.ocl.ecore.SendSignalAction
import org.eclipse.ocl.ecore.StateExp
import org.eclipse.ocl.ecore.TupleLiteralExp
import org.eclipse.ocl.ecore.TupleLiteralPart
import org.eclipse.ocl.ecore.TypeExp
import org.eclipse.ocl.ecore.Variable
import org.eclipse.ocl.ecore.VariableExp
import org.eclipse.ocl.utilities.TypedElement
import org.eclipse.ocl.utilities.PredefinedType

@Aspect(className=typeof(Object))
abstract class OCLSlicerVisitor {
	var boolean sliced = false

	def void visitToAddClasses(OCLSlicer theOCLSlicer) {}
}

@Aspect(className=typeof(AssociationClassCallExp))
class AssociationClassCallExpAspect extends NavigationCallExpAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.referredAssociationClass?.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(ExpressionInOCL))
class ExpressionInOCLAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.bodyExpression.visitToAddClasses(theOCLSlicer)
		_self.contextVariable.visitToAddClasses(theOCLSlicer)
		_self.resultVariable?.visitToAddClasses(theOCLSlicer)
		_self.parameterVariable.forEach[visitToAddClasses(theOCLSlicer)]
//		theOCLSlicer.classifiers.addAll()
//		_self.generatedType
	}
}


@Aspect(className=typeof(OCLExpression))
abstract class OCLExpressionAspect extends TypedElementAspect {
}

@Aspect(className=typeof(TypedElement))
abstract class TypedElementAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
//		_self.super_visitToAddClasses(theOCLSlicer)
		val EObject obj = _self.type as EObject
		if(!(obj instanceof PredefinedType<?>)) theOCLSlicer.objects.add(obj)
	}
}

@Aspect(className=typeof(CallExp))
abstract class CallExpAspect extends OCLExpressionAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.source?.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(FeatureCallExp))
abstract class FeatureCallExpAspect extends CallExpAspect {
}

@Aspect(className=typeof(IfExp))
class IfExpAspect extends OCLExpressionAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.condition?.visitToAddClasses(theOCLSlicer)
		_self.thenExpression?.visitToAddClasses(theOCLSlicer)
		_self.elseExpression?.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(IterateExp))
class IterateExpAspect extends LoopExpAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.result?.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(IteratorExp))
class IteratorExpAspect extends LoopExpAspect {
}

@Aspect(className=typeof(LetExp))
class LetExpAspect extends OCLExpressionAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.in?.visitToAddClasses(theOCLSlicer)
		_self.variable?.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(LiteralExp))
abstract class LiteralExpAspect extends OCLExpressionAspect {
}

@Aspect(className=typeof(CollectionItem))
class CollectionItemAspect extends CollectionLiteralPartAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.item.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(CollectionLiteralPart))
abstract class CollectionLiteralPartAspect extends TypedElementAspect {
}

@Aspect(className=typeof(CollectionLiteralExp))
class CollectionLiteralExpAspect extends LiteralExpAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.part.forEach[visitToAddClasses(theOCLSlicer)]
	}
}

@Aspect(className=typeof(CollectionRange))
class CollectionRangeAspect extends CollectionLiteralPartAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.first.visitToAddClasses(theOCLSlicer)
		_self.last.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(EnumLiteralExp))
class EnumLiteralExpAspect extends LiteralExpAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		theOCLSlicer.enumLiterals.add(_self.referredEnumLiteral)
	}
}

@Aspect(className=typeof(LoopExp))
abstract class LoopExpAspect extends CallExpAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.body?.visitToAddClasses(theOCLSlicer)
		_self.iterator.forEach[visitToAddClasses(theOCLSlicer)]
	}
}

@Aspect(className=typeof(MessageExp))
class MessageExpAspect extends OCLExpressionAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.target?.visitToAddClasses(theOCLSlicer)
		_self.argument.forEach[visitToAddClasses(theOCLSlicer)]
		_self.calledOperation?.visitToAddClasses(theOCLSlicer)
		_self.sentSignal
	}
}

@Aspect(className=typeof(SendSignalAction))
class SendSignalActionAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		theOCLSlicer.classifiers.add(_self.signal)
	}
}

@Aspect(className=typeof(CallOperationAction))
class CallOperationActionAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		theOCLSlicer.ops.add(_self.operation)
	}
}

@Aspect(className=typeof(StateExp))
class StateExpAspect extends OCLExpressionAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		theOCLSlicer.objects.add(_self.referredState)
	}
}

@Aspect(className=typeof(TupleLiteralExp))
class TupleLiteralExpAspect extends LiteralExpAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.part.forEach[visitToAddClasses(theOCLSlicer)]
	}
}

@Aspect(className=typeof(TypeExp))
class TypeExpAspect extends OCLExpressionAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		theOCLSlicer.classifiers.add(_self.referredType)
	}	
}

@Aspect(className=typeof(TupleLiteralPart))
class TupleLiteralPartAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.value?.visitToAddClasses(theOCLSlicer)
		theOCLSlicer.features.add(_self.attribute)
	}
}

@Aspect(className=typeof(OperationCallExp))
class OperationCallExpAspect extends FeatureCallExpAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.argument.forEach[visitToAddClasses(theOCLSlicer)]
		theOCLSlicer.ops.add(_self.referredOperation)
	}
}

@Aspect(className=typeof(PropertyCallExp))
class PropertyCallExpAspect extends NavigationCallExpAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		theOCLSlicer.features.add(_self.referredProperty)
	}
}

@Aspect(className=typeof(NavigationCallExp))
abstract class NavigationCallExpAspect extends FeatureCallExpAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.qualifier?.forEach[visitToAddClasses(theOCLSlicer)]
		if(_self.navigationSource!=null)
			theOCLSlicer.features.add(_self.navigationSource)
	}
}

@Aspect(className=typeof(Variable))
class VariableAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.initExpression?.visitToAddClasses(theOCLSlicer)
		if(_self.representedParameter!=null)
			theOCLSlicer.params.add(_self.representedParameter)
	}
}

@Aspect(className=typeof(VariableExp))
class VariableExpAspect extends OCLExpressionAspect {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.referredVariable?.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(Constraint))
class ConstraintAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super_visitToAddClasses(theOCLSlicer)
		_self.specification.visitToAddClasses(theOCLSlicer)
		_self.constrainedElements.forEach[elt | theOCLSlicer.elts.add(elt)]
	}
}
