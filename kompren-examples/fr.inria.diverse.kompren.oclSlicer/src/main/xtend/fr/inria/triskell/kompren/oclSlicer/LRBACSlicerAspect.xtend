package fr.inria.triskell.kompren.oclSlicer

import LRBAC.Execute
import LRBAC.Permission
import LRBAC.Read
import LRBAC.Session
import LRBAC.User
import LRBAC.Write
import LRBAC2.Location
import LRBAC2.Object
import LRBAC2.Operation
import LRBAC2.Role
import LRBAC2.impl.LRBACFactoryImpl
import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import org.eclipse.emf.ecore.EObject

@Aspect(className=typeof(java.lang.Object))
abstract class LRBASlicerVisitor {
	var boolean sliced = false
	
	protected var EObject clonedElt = null//FIXME generics

	def void visitToAddClasses(LRBACSlicer slicer) {
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(slicer)
		}
	}
	
	protected def void _visitToAddClasses(LRBACSlicer slicer) {}
}


@Aspect(className=typeof(Session))
class SessionAspect extends LRBASlicerVisitor {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createSession
		val obj = _self.clonedElt as LRBAC2.Session
		_self.super__visitToAddClasses(slicer)
		_self.sessUser.visitToAddClasses(slicer)
		obj.sessUser = _self.sessUser.clonedElt as LRBAC2.User
	}
}


@Aspect(className=typeof(LRBAC.Role))
class RoleAspect extends LRBASlicerVisitor {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createRole
		_self.super__visitToAddClasses(slicer)
	}
}



@Aspect(className=typeof(LRBAC.Object))
class ObjectAspect extends LRBASlicerVisitor {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createObject
		val Object obj = _self.clonedElt as Object
		_self.super__visitToAddClasses(slicer)
		_self.objLoc.visitToAddClasses(slicer)
		obj.objLoc = _self.objLoc.clonedElt as Location
	}
}


@Aspect(className=typeof(Read))
class ReadAspect extends OperationAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createRead
		_self.super__visitToAddClasses(slicer)
	}
}


@Aspect(className=typeof(Execute))
class ExecuteAspect extends OperationAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createExecute
		_self.super__visitToAddClasses(slicer)
	}
}


@Aspect(className=typeof(Write))
class WriteAspect extends OperationAspect {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createWrite
		_self.super__visitToAddClasses(slicer)
	}
}


@Aspect(className=typeof(LRBAC.Operation))
class OperationAspect extends LRBASlicerVisitor {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createOperation
		_self.super__visitToAddClasses(slicer)
	}
}


@Aspect(className=typeof(Permission))
class PermissionAspect extends LRBASlicerVisitor {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createPermission
		_self.super__visitToAddClasses(slicer)
		val obj = _self.clonedElt as LRBAC2.Permission
		_self.permOper.visitToAddClasses(slicer)
		obj.permOper = _self.permOper.clonedElt as Operation
		_self.permObj.visitToAddClasses(slicer)
		obj.permObj = _self.permObj.clonedElt as Object
		_self.permRole.visitToAddClasses(slicer)
		obj.permRole = _self.permRole.clonedElt as Role
		_self.roleLocPerm.visitToAddClasses(slicer)
		obj.roleLocPerm = _self.roleLocPerm.clonedElt as Location
		_self.objLocPerm.visitToAddClasses(slicer)
		obj.objLocPerm = _self.objLocPerm.clonedElt as Location
	}
}



@Aspect(className=typeof(User))
class UserAspect extends LRBASlicerVisitor {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createUser
		_self.super__visitToAddClasses(slicer)
		val obj = _self.clonedElt as LRBAC2.User
		_self.userLoc.visitToAddClasses(slicer)
		obj.userLoc = _self.userLoc.clonedElt as Location
	}
}


@Aspect(className=typeof(LRBAC.Location))
class LocationAspect extends LRBASlicerVisitor {
	@OverrideAspectMethod
	protected def void _visitToAddClasses(LRBACSlicer slicer) {
		if(_self.clonedElt==null) _self.clonedElt = LRBACFactoryImpl.eINSTANCE.createLocation
		_self.super__visitToAddClasses(slicer)
	}
}
