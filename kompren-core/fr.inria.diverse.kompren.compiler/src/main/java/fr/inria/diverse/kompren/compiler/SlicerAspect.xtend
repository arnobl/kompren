/*
 * Licence  : EPL
 * Copyright: Inria Rennes, Diverse
 * Authors  : Arnaud Blouin
 */
 
package fr.inria.diverse.kompren.compiler

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.List
import java.util.Map
import kompren.Constraint
import kompren.KomprenFactory
import kompren.SlicedClass
import kompren.SlicedProperty
import kompren.Slicer
import kompren.VarDecl
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EReference

import static extension fr.inria.diverse.kompren.compiler.EClassifierAspect.*
import static extension fr.inria.diverse.kompren.compiler.EStructuralFeatureAspect.*

class SlicerFactory {
	static def VarDecl createVarDecl(String name) {
		val varDecl = KomprenFactory.eINSTANCE.createVarDecl
		varDecl.varName = name
		varDecl
	}
}

@Aspect(className=typeof(Slicer))
class SlicerAspect {
	private var Map<ENamedElement, String> _options
	
	
	private def void initOptionsMap() {
		_self._options = newHashMap
		_self.slicedElements.filter[isOption].forEach[opt | 
			if(opt instanceof SlicedProperty && (opt.domain instanceof EReference) && (opt as SlicedProperty).opposite!==null)
				_self._options.put((opt.domain as EReference).EOpposite, "option"+(opt as SlicedProperty).opposite.name)
			else
				_self._options.put(opt.domain, "option"+opt.domain.name)
		]
	}
	
	def String getOptionNameClass(SlicedClass sc) {
		if(_self._options===null) _self.initOptionsMap
		_self._options.get(sc.domain)
	}

	def String getOptionNameProp(SlicedProperty sp) {
		if(_self._options===null) _self.initOptionsMap
		if(sp.opposite===null)
			_self._options.get(sp.domain)
		else
			_self._options.get((sp.domain as EReference).EOpposite)
	}
	
	def List<String> getOptionNames() {
		if(_self._options===null) _self.initOptionsMap
		_self._options.values.toList
	}
	
	def	List<SlicedClass> slicedClasses() {
		_self.slicedElements.filter(SlicedClass).toList
	}
	
	def	List<SlicedProperty> slicedProps() {
		_self.slicedElements.filter(SlicedProperty).toList
	}
	
	def boolean hasOpposite() {
		_self.slicedProps.exists[opposite!==null]
	}
}

//@Aspect(className=typeof(SlicedElement))
//abstract class SlicedElementAspect {
//	def String constraintsInXtend() {
//		_self.constraints.map[getExpression].join(" && ")
//	}
//}

@Aspect(className=typeof(Constraint))
class ConstraintAspect {
	var boolean cloned = false
}


@Aspect(className=typeof(SlicedClass))
class SlicedClassAspect {
	var boolean addedToBeSliced = false
	
	def boolean isEcore() { _self.domain.ecore }
	
	def String constraintsInXtend(String cstPrefix) {
		_self.constraints.map[cstPrefix+expression].join(" && ")
	}


	def StringBuilder generateConstraintCode(Constraint cst) {
		new StringBuilder().
			append("\tdef boolean check").append(cst.name).append("(){\n")
			.append("\t\tval ").append(_self.ctx.varName).append(" = _self\n")
			.append("\t\t").append(cst.expression).append('\n').append("\t}\n")
	}
	

	def String constraintsInXtend() {
		val prefix = "_self.check"
		_self.constraints.map[prefix+name].join(" && ")
	}
}


@Aspect(className=typeof(SlicedProperty))
class SlicedPropertyAspect {
	def String getXtendNameOrOppositeOne() {
		if(_self.opposite===null) _self.domain.xtendName else _self.opposite.name
	}
	
	def StringBuilder generateConstraintCode(Constraint cst) {
		new StringBuilder().
			append("\tdef boolean check").append(cst.name).append('(').append(_self.domain.EContainingClass.name).append(' ').append(_self.src.varName).append("){\n")
			.append("\t\tval ").append(_self.tgt.varName).append(" = _self\n")
			.append("\t\t").append(cst.expression).append('\n')
			.append("\t}\n")
	}
	
	
	def boolean isEcore() { _self.domain.ecore }


	def String constraintsInXtend() {
		val prefix = if(_self.domain.upperBound>1 || _self.domain.upperBound<0) "" else "_self.^"+_self.getXtendNameOrOppositeOne+"."
		_self.constraints.map[prefix+"check"+name+"(_self)"].join(" && ")
	}
}
