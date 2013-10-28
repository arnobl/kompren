package ex.classModel

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod

@Aspect(className=typeof(Object))
abstract class SlicerVisitor {
	var boolean visitedForRelations = false
	var boolean sliced = false

	def void visitToAddClasses(superTypesSlicer2 thesuperTypesSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(thesuperTypesSlicer)
		}
	}
	
	protected def void _visitToAddClasses(superTypesSlicer2 thesuperTypesSlicer){}

	def void visitToAddRelations(superTypesSlicer2 thesuperTypesSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(thesuperTypesSlicer)
		}
	}
	
	protected def void _visitToAddRelations(superTypesSlicer2 thesuperTypesSlicer){}
}

@Aspect(className=typeof(Clazz))
class ClazzAspect extends SlicerVisitor {
	@OverrideAspectMethod
	def void _visitToAddClasses(superTypesSlicer2 thesuperTypesSlicer) {
		thesuperTypesSlicer.addedClazzs.add(_self)
		_self.super__visitToAddClasses(thesuperTypesSlicer)
		_self.superClasses.forEach[visitToAddClasses(thesuperTypesSlicer)]
	}
	@OverrideAspectMethod
	def void _visitToAddRelations(superTypesSlicer2 thesuperTypesSlicer) {
		_self.super__visitToAddRelations(thesuperTypesSlicer)
		_self.superClasses.forEach[theClazz | 
			theClazz.visitToAddRelations(thesuperTypesSlicer)
			if(_self.visitedForRelations && theClazz.visitedForRelations)
				thesuperTypesSlicer.addedsuperClasses.add(new ClasssuperClasses(_self, theClazz))
		]
	}
}
