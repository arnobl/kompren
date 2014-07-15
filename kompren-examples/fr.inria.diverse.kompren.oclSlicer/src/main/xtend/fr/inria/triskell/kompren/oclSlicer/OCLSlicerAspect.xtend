package fr.inria.triskell.kompren.oclSlicer

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.ocl.ecore.AssociationClassCallExp
import org.eclipse.ocl.ecore.CallExp
import org.eclipse.ocl.ecore.CallOperationAction
import org.eclipse.ocl.ecore.CollectionItem
import org.eclipse.ocl.ecore.CollectionLiteralExp
import org.eclipse.ocl.ecore.CollectionRange
import org.eclipse.ocl.ecore.Constraint
import org.eclipse.ocl.ecore.EnumLiteralExp
import org.eclipse.ocl.ecore.ExpressionInOCL
import org.eclipse.ocl.ecore.IfExp
import org.eclipse.ocl.ecore.IterateExp
import org.eclipse.ocl.ecore.LetExp
import org.eclipse.ocl.ecore.LoopExp
import org.eclipse.ocl.ecore.MessageExp
import org.eclipse.ocl.ecore.NavigationCallExp
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

@Aspect(className=typeof(Object))
abstract class OCLSlicerVisitor {
	var boolean sliced = false

	def void visitToAddClasses(OCLSlicer slicer) {
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(slicer)
		}
	}
	
	protected def void _visitToAddClasses(OCLSlicer slicer) { }
}

@Aspect(className=typeof(AssociationClassCallExp))
class AssociationClassCallExpAspect extends NavigationCallExpAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		if(_self.referredAssociationClass!=null)
			theOCLSlicer.addToFootprint(_self.referredAssociationClass)
	}
}

@Aspect(className=typeof(ExpressionInOCL))
class ExpressionInOCLAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.bodyExpression.visitToAddClasses(theOCLSlicer)
		_self.contextVariable.visitToAddClasses(theOCLSlicer)
		_self.resultVariable?.visitToAddClasses(theOCLSlicer)
		_self.parameterVariable.forEach[visitToAddClasses(theOCLSlicer)]
	}
}


@Aspect(className=typeof(TypedElement))
abstract class TypedElementAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		if(_self.type instanceof EModelElement)
			theOCLSlicer.addToFootprint(_self.type as EModelElement)
	}
}

@Aspect(className=typeof(CallExp))
abstract class CallExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.source?.visitToAddClasses(theOCLSlicer)
	}
}


@Aspect(className=typeof(IfExp))
class IfExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.condition?.visitToAddClasses(theOCLSlicer)
		_self.thenExpression?.visitToAddClasses(theOCLSlicer)
		_self.elseExpression?.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(IterateExp))
class IterateExpAspect extends LoopExpAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.result?.visitToAddClasses(theOCLSlicer)
	}
}


@Aspect(className=typeof(LetExp))
class LetExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.in?.visitToAddClasses(theOCLSlicer)
		_self.variable?.visitToAddClasses(theOCLSlicer)
	}
}


@Aspect(className=typeof(CollectionItem))
class CollectionItemAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.item.visitToAddClasses(theOCLSlicer)
	}
}


@Aspect(className=typeof(CollectionLiteralExp))
class CollectionLiteralExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.part.forEach[visitToAddClasses(theOCLSlicer)]
	}
}

@Aspect(className=typeof(CollectionRange))
class CollectionRangeAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.first.visitToAddClasses(theOCLSlicer)
		_self.last.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(EnumLiteralExp))
class EnumLiteralExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		theOCLSlicer.addToFootprint(_self.referredEnumLiteral)
	}
}

@Aspect(className=typeof(LoopExp))
abstract class LoopExpAspect extends CallExpAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.body?.visitToAddClasses(theOCLSlicer)
		_self.iterator.forEach[visitToAddClasses(theOCLSlicer)]
	}
}

@Aspect(className=typeof(MessageExp))
class MessageExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.target?.visitToAddClasses(theOCLSlicer)
		_self.argument.forEach[visitToAddClasses(theOCLSlicer)]
		_self.calledOperation?.visitToAddClasses(theOCLSlicer)
		_self.sentSignal?.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(SendSignalAction))
class SendSignalActionAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		theOCLSlicer.addToFootprint(_self.signal)
	}
}

@Aspect(className=typeof(CallOperationAction))
class CallOperationActionAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		theOCLSlicer.addToFootprint(_self.operation)
	}
}

@Aspect(className=typeof(StateExp))
class StateExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		if(_self.referredState instanceof EModelElement)
			theOCLSlicer.addToFootprint(_self.referredState as EModelElement)
	}
}

@Aspect(className=typeof(TupleLiteralExp))
class TupleLiteralExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.part.forEach[visitToAddClasses(theOCLSlicer)]
	}
}

@Aspect(className=typeof(TypeExp))
class TypeExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		theOCLSlicer.addToFootprint(_self.referredType)
	}	
}

@Aspect(className=typeof(TupleLiteralPart))
class TupleLiteralPartAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.value?.visitToAddClasses(theOCLSlicer)
		theOCLSlicer.addToFootprint(_self.attribute)
	}
}

@Aspect(className=typeof(OperationCallExp))
class OperationCallExpAspect extends CallExpAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.argument.forEach[visitToAddClasses(theOCLSlicer)]
		theOCLSlicer.addToFootprint(_self.referredOperation)
	}
}

@Aspect(className=typeof(PropertyCallExp))
class PropertyCallExpAspect extends NavigationCallExpAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		theOCLSlicer.addToFootprint(_self.referredProperty)
	}
}

@Aspect(className=typeof(NavigationCallExp))
abstract class NavigationCallExpAspect extends CallExpAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.qualifier?.forEach[visitToAddClasses(theOCLSlicer)]
		if(_self.navigationSource!=null)
			theOCLSlicer.addToFootprint(_self.navigationSource)
	}
}

@Aspect(className=typeof(Variable))
class VariableAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.initExpression?.visitToAddClasses(theOCLSlicer)
		if(_self.representedParameter!=null)
			theOCLSlicer.addToFootprint(_self.representedParameter)
	}
}

@Aspect(className=typeof(VariableExp))
class VariableExpAspect extends TypedElementAspect {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.referredVariable?.visitToAddClasses(theOCLSlicer)
	}
}

@Aspect(className=typeof(Constraint))
class ConstraintAspect extends OCLSlicerVisitor {
	@OverrideAspectMethod
	def void _visitToAddClasses(OCLSlicer theOCLSlicer) {
		_self.super__visitToAddClasses(theOCLSlicer)
		_self.specification.visitToAddClasses(theOCLSlicer)
		_self.constrainedElements.forEach[elt | theOCLSlicer.addToFootprint(elt)]
	}
}
