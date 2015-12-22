package supertypesslicer
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import static extension supertypesslicer.__SlicerAspect__.*
import static extension supertypesslicer.exclassModelClazzAspect.*

@Aspect(className=typeof(ex.classModel.ClassModel), with=#[typeof(__SlicerAspect__)])
class exclassModelClassModelAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void reinit(){
		_self.super_reinit
_self.^classes.forEach[reinit]
	}

	@OverrideAspectMethod
	def void _visitToAddClasses(SuperTypesSlicer theSlicer){
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(SuperTypesSlicer theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

