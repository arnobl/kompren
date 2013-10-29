/*
 * Creation : November 22, 2010
 * Licence  : EPL
 * Copyright: INRIA Rennes, Triskell
 * Authors  : Arnaud Blouin
 */
package fr.inria.diverse.kompren.compiler

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import kompren.SlicedProperty
import kompren.Slicer
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage

import static extension fr.inria.diverse.kompren.compiler.EClassifierAspect.*
import static extension fr.inria.diverse.kompren.compiler.EPackageAspect.*
import java.util.List
import java.util.ArrayList
import kompren.SlicedClass

@Aspect(className=typeof(EClassifier)) class EClassifierAspect{
	def void feedSubClassesRelations() {}
}


@Aspect(className=typeof(EPackage)) class EPackageAspect {
	private var String _factoryName = null
	
	def void feedSubClassesRelations() {
		_self.EClassifiers.forEach[feedSubClassesRelations]
		_self.ESubpackages.forEach[feedSubClassesRelations]
	}
	
	def String factoryName() {
		if(_self._factoryName==null)
			_self._factoryName = Character.toUpperCase(_self.name.charAt(0))+_self.name.substring(1)+"FactoryImpl"
		_self._factoryName
	}
}


@Aspect(className=typeof(EClass)) class EClassAspect extends EClassifierAspect {
	val StringBuilder codeVisit = new StringBuilder
	val StringBuilder codeAction = new StringBuilder
	val StringBuilder relationCode = new StringBuilder
	val StringBuilder oppositeAttr = new StringBuilder
	val StringBuilder oppositeFeed = new StringBuilder
	var List<EClass> lowerClasses
	
	@OverrideAspectMethod
	def void feedSubClassesRelations() {
		_self.lowerClasses = new ArrayList
		_self.ESuperTypes.forEach[addLowerClass(_self)]
	}
	
	
	private def void addLowerClass(EClass cl) {
		if(_self.lowerClasses==null) _self.lowerClasses = new ArrayList
		if(!_self.lowerClasses.contains(cl)) _self.lowerClasses.add(cl)
	}
	
	
	def void generateOppositeCode(SlicedProperty sp) {
		if(sp.opposite!=null) {
			if(sp.opposite.name==null || sp.opposite.name.length==0)
				sp.opposite.name = "opposite"+sp.domain.name
			if(sp.domain.upperBound==1)
				_self.oppositeAttr.append("\tvar ").append(sp.domain.EType.name).append(' ').append(sp.opposite.name).append("\n\n")
			else
				_self.oppositeAttr.append("\tvar List<").append(sp.domain.EType.name).append("> ").append(sp.opposite.name).append(" = new ArrayList\n\n")
		}	
	}	


	def void generateFeedOppositeCodeVisitor() {
		_self.EReferences.filter[containment].forEach[ref|
			if(ref.upperBound>1 || ref.upperBound<0)
				_self.oppositeFeed.append("_self.").append(ref.name).append(".forEach[feedOpposites]\n")
			else {
				if(ref.lowerBound==0)
					_self.oppositeFeed.append("if(_self.").append(ref.name).append("!=null) ")
				_self.oppositeFeed.append("_self.").append(ref.name).append(".feedOpposites\n")
			}
		]
	}


	def void generateFeedOppositeCode(SlicedProperty sp) {
		val elt = sp.domain

		if(sp.opposite!=null){
			if(elt.upperBound==1)
				_self.oppositeFeed.append("_self.").append(elt.name).append('.').append(sp.opposite.name).append(" = ").append("_self\n")
			else
				_self.oppositeFeed.append("_self.").append(elt.name).append(".forEach[").append(sp.opposite.name).append(".add(_self)]\n")
		}
	}


	def void generateVisitToAddClassesActions(SlicedClass sc, Slicer slicer) {
		if(slicer.strict) {
			if(!_self.abstract)
				_self.codeAction.append("\t\tif(_self.clonedElt==null){\n\t\t\t_self.clonedElt = ").append(_self.EPackage.factoryName).
				append(".eINSTANCE.create").append(_self.name).append(" as ").append(_self.name).
				append("\n\t\t\ttheSlicer.objectCloned(_self.clonedElt)\n\t\t}\n")
		}
		else _self.codeAction.append("\t\ttheSlicer.on").append(_self.name).append("Sliced(_self)\n")
	}


	def void generateVisitToAddClasses(SlicedProperty sp) {
		val elt = sp.domain
		val name = if(sp.opposite==null) elt.name else sp.opposite.name

		if(elt.upperBound>1 || elt.upperBound<0)
			_self.codeVisit.append("\t\t_self.").append(name).append(".forEach[visitToAddClasses(theSlicer)]\n")
		else
			_self.codeVisit.append("\t\t_self.").append(name).append("?.visitToAddClasses(theSlicer)\n")
	}


	def void generateVisitToAddRelations(SlicedProperty sp, Slicer slicer) {
		val okSlice = slicer.strict || (sp.expression!=null && sp.expression.length>0 && sp.tgt!=null && sp.src!=null)
		val name = if(sp.opposite==null) sp.domain.name else sp.opposite.name
		
		if(sp.domain.upperBound>1 || sp.domain.upperBound<0)
			_self.generateVisitToAddRelations4MultiCard(sp, slicer, name, okSlice)
		else
			_self.generateVisitToAddRelations4OneCard(sp, slicer, name, okSlice)
	}
	
	
	private def void generateVisitToAddRelations4OneCard(SlicedProperty sp, Slicer slicer, String name, boolean okSlice) {
		if(sp.domain.lowerBound==0)
			_self.relationCode.append("\t\tif(_self.").append(name).append("!=null){\n")
		_self.relationCode.append("\t\t_self.").append(name).append(".visitToAddRelations(theSlicer)\n")
		if(okSlice) {
			_self.relationCode.append("\n\t\tif(_self.sliced && _self.").append(name).append(".sliced) ")
			if(slicer.strict)
				_self.relationCode.append("(_self.clonedElt as ").append(_self.name).append(").").append(name).
				append(" = _self.").append(name).append(".clonedElt as ").append(sp.domain.EType.name).append('\n')
			else
				_self.relationCode.append("\t\ttheSlicer.on").append(name).append("Sliced(_self").append(", _self.").append(name).append(")\n")
		}
		if(sp.domain.lowerBound==0) _self.relationCode.append("}\n")
	}
	
	
	
	private def void generateVisitToAddRelations4MultiCard(SlicedProperty sp, Slicer slicer, String name, boolean okSlice) {
		_self.relationCode.append("\t\t_self.").append(name).append(".forEach[_elt| _elt.visitToAddRelations(theSlicer)")
		if(okSlice){
			_self.relationCode.append("\n\t\t\tif(_self.sliced && _elt.sliced) ")
			if(slicer.strict)
				_self.relationCode.append("(_self.clonedElt as ").append(_self.name).append(").").append(name).
				append(".add( _elt.clonedElt as ").append(sp.domain.EType.name).append(")\n")
			else
				_self.relationCode.append("theSlicer.on").append(name).append("Sliced(_self").append(", _elt)\n")
		}
		_self.relationCode.append("\t\t]\n")
	}
}
