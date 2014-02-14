package prettyprinter
import kompren.*
import kompren.impl.*
import org.eclipse.emf.ecore.*
import org.eclipse.emf.ecore.impl.*

import static extension prettyprinter.__SlicerAspect__.*
import static extension prettyprinter.SlicerAspect.*
import static extension prettyprinter.SlicedClassAspect.*
import static extension prettyprinter.SlicedPropertyAspect.*
import static extension prettyprinter.RadiusAspect.*
import static extension prettyprinter.ConstraintAspect.*
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

	def void visitToAddClasses(Prettyprinter theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(Prettyprinter theSlicer){}

	def void visitToAddRelations(Prettyprinter theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(Prettyprinter theSlicer){}

	def void feedOpposites(){}
}

@Aspect(className=typeof(Slicer))
class SlicerAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(Prettyprinter theSlicer){
		theSlicer.onSlicerSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^slicedElements.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Prettyprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^slicedElements.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(Constraint))
class ConstraintAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(Prettyprinter theSlicer){
		theSlicer.onConstraintSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Prettyprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(Radius))
class RadiusAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(Prettyprinter theSlicer){
		theSlicer.onRadiusSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Prettyprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(SlicedClass))
class SlicedClassAspect extends SlicedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Prettyprinter theSlicer){
		theSlicer.onSlicedClassSliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Prettyprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(SlicedProperty))
class SlicedPropertyAspect extends SlicedElementAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(Prettyprinter theSlicer){
		theSlicer.onSlicedPropertySliced(_self)
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Prettyprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(OppositeCreation))
class OppositeCreationAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(Prettyprinter theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Prettyprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(SlicedElement))
abstract class SlicedElementAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(Prettyprinter theSlicer){
		_self.super__visitToAddClasses(theSlicer)
		_self.^constraints.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Prettyprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^constraints.forEach[_elt| _elt.visitToAddRelations(theSlicer)		]

	}
}

@Aspect(className=typeof(VarDecl))
class VarDeclAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(Prettyprinter theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(Prettyprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

