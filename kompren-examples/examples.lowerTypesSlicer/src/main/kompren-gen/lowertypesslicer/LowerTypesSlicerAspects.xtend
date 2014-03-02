package lowertypesslicer

import ex.classModel.ClassModel
import ex.classModel.Clazz
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension lowertypesslicer.exclassModelClazzAspect.*

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

@Aspect(className=typeof(ClassModel), with=#[typeof(__SlicerAspect__)])
class exclassModelClassModelAspect extends __SlicerAspect__{
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

@Aspect(className=typeof(Clazz), with=#[typeof(__SlicerAspect__)])
class exclassModelClazzAspect extends __SlicerAspect__{
	val List<Clazz> ^lowerType = newArrayList

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

