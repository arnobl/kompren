package lowerTypesSlicer
import ex.*
import ex.impl.*
import ex.classModel.*
import ex.classModel.impl.*

import static extension lowerTypesSlicer.__SlicerAspect__.*
import static extension lowerTypesSlicer.ClazzAspect.*
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

	def void visitToAddClasses(LowerTypesSlicer theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(LowerTypesSlicer theSlicer){}

	def void visitToAddRelations(LowerTypesSlicer theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(LowerTypesSlicer theSlicer){}

	def void feedOpposites(){}
}

@Aspect(className=typeof(ClassModel))
class ClassModelAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void feedOpposites(){
_self.^classes.forEach[feedOpposites]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(LowerTypesSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(LowerTypesSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(Clazz))
class ClazzAspect extends __SlicerAspect__{
	val List<Clazz> ^lowerType = new ArrayList

	@OverrideAspectMethod
	def void feedOpposites(){
_self.^superClasses.forEach[^lowerType.add(_self)]

	}

	@OverrideAspectMethod
	def void _visitToAddClasses(LowerTypesSlicer theSlicer){
		theSlicer.onClazzSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^lowerType.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(LowerTypesSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^lowerType.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onlowerTypeSliced(_self, _elt)
		]

	}
}

