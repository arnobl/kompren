package superTypesSlicer
import ex.*
import ex.impl.*
import ex.classModel.*
import ex.classModel.impl.*

import static extension superTypesSlicer.__SlicerAspect__.*
import static extension superTypesSlicer.ClazzAspect.*
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

	def void visitToAddClasses(SuperTypesSlicer theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(SuperTypesSlicer theSlicer){}

	def void visitToAddRelations(SuperTypesSlicer theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(SuperTypesSlicer theSlicer){}

	def void feedOpposites(){}
}

@Aspect(className=typeof(ClassModel))
class ClassModelAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(SuperTypesSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(SuperTypesSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(Clazz))
class ClazzAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(SuperTypesSlicer theSlicer){
		theSlicer.onClazzSliced(_self)
		_self.super__visitToAddClasses(theSlicer)
		_self.^superClasses.forEach[visitToAddClasses(theSlicer)]

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(SuperTypesSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		_self.^superClasses.forEach[_elt| _elt.visitToAddRelations(theSlicer)
			if(_self.sliced && _elt.sliced) theSlicer.onsuperClassesSliced(_self, _elt)
		]

	}
}

