package ex.classModel

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod

@Aspect(className=typeof(Object))
abstract class SlicerVisitor {
	var boolean visitedPass = false
	var boolean visitedForRelations = false
	var boolean sliced = false
	var int idPass = 0

	def void initialiseAttributes(int pass) {
		_self.visitedPass = false
		_self.sliced = false
		_self.visitedForRelations = false
		_self.idPass = pass
	}

	def void visitToAddClasses(superTypesSlicer thesuperTypesSlicer){
		_self.visitedPass = true
	}

	def void visitToAddRelations(superTypesSlicer thesuperTypesSlicer){}

	def boolean checkCanReallyBeAdded() {
		_self.visitedPass = true
		return true
	}
}

@Aspect(className=typeof(Clazz))
class ClazzAspect extends SlicerVisitor {
	@OverrideAspectMethod
	def void visitToAddClasses(superTypesSlicer thesuperTypesSlicer) {
		if(!_self.visitedPass) {
			_self.super_visitToAddClasses(thesuperTypesSlicer)
			if(!_self.sliced){
				thesuperTypesSlicer.addedClazzs.add(_self)
				_self.sliced = true
			}
			_self.visitedPass = true
			_self.superClasses.forEach[visitToAddClasses(thesuperTypesSlicer)]
		}
	}
	@OverrideAspectMethod
	def void visitToAddRelations(superTypesSlicer thesuperTypesSlicer) {
		if(!_self.visitedForRelations) {
			_self.super_visitToAddRelations(thesuperTypesSlicer)
			_self.visitedForRelations = true
			_self.superClasses.forEach[theClazz | 
				theClazz.visitToAddRelations(thesuperTypesSlicer)
				if(_self.visitedForRelations && theClazz.visitedForRelations)
					thesuperTypesSlicer.addedsuperClasses.add(new ClasssuperClasses(_self, theClazz))
			]
		}
	}
}

