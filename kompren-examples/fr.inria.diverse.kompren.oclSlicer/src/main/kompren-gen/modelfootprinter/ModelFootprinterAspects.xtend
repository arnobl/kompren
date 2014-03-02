package modelfootprinter

import static extension modelfootprinter.__SlicerAspect__.*
import static extension modelfootprinter.LRBACRoleAspect.*
import static extension modelfootprinter.LRBACLocationAspect.*
import static extension modelfootprinter.LRBACUserAspect.*
import static extension modelfootprinter.LRBACPermissionAspect.*
import static extension modelfootprinter.LRBACSessionAspect.*
import static extension modelfootprinter.LRBACOperationAspect.*
import static extension modelfootprinter.LRBACReadAspect.*
import static extension modelfootprinter.LRBACWriteAspect.*
import static extension modelfootprinter.LRBACExecuteAspect.*
import static extension modelfootprinter.LRBACObjectAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=typeof(java.lang.Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false
	protected var org.eclipse.emf.ecore.EObject clonedElt = null

	def void visitToAddClasses(ModelFootprinter theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(ModelFootprinter theSlicer){}

	def void visitToAddRelations(ModelFootprinter theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(ModelFootprinter theSlicer){}

	def void feedOpposites(){}
}

@Aspect(className=typeof(LRBAC.User), with=#[typeof(__SlicerAspect__)])
class LRBACUserAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createUser
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^userLoc?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^userLoc!=null){
		_self.^userLoc.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^userLoc.sliced) (_self.clonedElt as LRBAC2.User).^userLoc = _self.^userLoc.clonedElt as LRBAC2.Location
		}

	}
}

@Aspect(className=typeof(LRBAC.Session), with=#[typeof(__SlicerAspect__)])
class LRBACSessionAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createSession
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^sessUser?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^sessUser!=null){
		_self.^sessUser.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^sessUser.sliced) (_self.clonedElt as LRBAC2.Session).^sessUser = _self.^sessUser.clonedElt as LRBAC2.User
		}

	}
}

@Aspect(className=typeof(LRBAC.Role), with=#[typeof(__SlicerAspect__)])
class LRBACRoleAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createRole
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(LRBAC.Location), with=#[typeof(__SlicerAspect__)])
class LRBACLocationAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createLocation
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(LRBAC.Permission), with=#[typeof(__SlicerAspect__)])
class LRBACPermissionAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createPermission
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^permOper?.visitToAddClasses(theSlicer)
		_self.^permObj?.visitToAddClasses(theSlicer)
		_self.^permRole?.visitToAddClasses(theSlicer)
		_self.^roleLocPerm?.visitToAddClasses(theSlicer)
		_self.^objLocPerm?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^permOper!=null){
		_self.^permOper.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^permOper.sliced) (_self.clonedElt as LRBAC2.Permission).^permOper = _self.^permOper.clonedElt as LRBAC2.Operation
		}
		if(_self.^permObj!=null){
		_self.^permObj.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^permObj.sliced) (_self.clonedElt as LRBAC2.Permission).^permObj = _self.^permObj.clonedElt as LRBAC2.Object
		}
		if(_self.^permRole!=null){
		_self.^permRole.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^permRole.sliced) (_self.clonedElt as LRBAC2.Permission).^permRole = _self.^permRole.clonedElt as LRBAC2.Role
		}
		if(_self.^roleLocPerm!=null){
		_self.^roleLocPerm.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^roleLocPerm.sliced) (_self.clonedElt as LRBAC2.Permission).^roleLocPerm = _self.^roleLocPerm.clonedElt as LRBAC2.Location
		}
		if(_self.^objLocPerm!=null){
		_self.^objLocPerm.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^objLocPerm.sliced) (_self.clonedElt as LRBAC2.Permission).^objLocPerm = _self.^objLocPerm.clonedElt as LRBAC2.Location
		}

	}
}

@Aspect(className=typeof(LRBAC.Object), with=#[typeof(__SlicerAspect__)])
class LRBACObjectAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createObject
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)
		_self.^objLoc?.visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)
		if(_self.^objLoc!=null){
		_self.^objLoc.visitToAddRelations(theSlicer)

		if(_self.sliced && _self.^objLoc.sliced) (_self.clonedElt as LRBAC2.Object).^objLoc = _self.^objLoc.clonedElt as LRBAC2.Location
		}

	}
}

@Aspect(className=typeof(LRBAC.Operation), with=#[typeof(__SlicerAspect__)])
class LRBACOperationAspect extends __SlicerAspect__{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createOperation
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(LRBAC.Read), with=#[typeof(LRBACOperationAspect)])
class LRBACReadAspect extends LRBACOperationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createRead
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(LRBAC.Write), with=#[typeof(LRBACOperationAspect)])
class LRBACWriteAspect extends LRBACOperationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createWrite
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

@Aspect(className=typeof(LRBAC.Execute), with=#[typeof(LRBACOperationAspect)])
class LRBACExecuteAspect extends LRBACOperationAspect{
	@OverrideAspectMethod
	def void _visitToAddClasses(ModelFootprinter theSlicer){
		if(_self.clonedElt==null){
			_self.clonedElt = LRBAC2.LRBAC2Factory.eINSTANCE.createExecute
			theSlicer.objectCloned(_self.clonedElt)
		}
		_self.super__visitToAddClasses(theSlicer)

	}
	@OverrideAspectMethod
	def void _visitToAddRelations(ModelFootprinter theSlicer){
		_self.super__visitToAddRelations(theSlicer)

	}
}

