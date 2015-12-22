package supertypesslicer
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import static extension supertypesslicer.__SlicerAspect__.*
import static extension supertypesslicer.exclassModelClazzAspect.*

@Aspect(className=typeof(ex.classModel.Clazz), with=#[typeof(__SlicerAspect__)])
class exclassModelClazzAspect extends __SlicerAspect__{
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

