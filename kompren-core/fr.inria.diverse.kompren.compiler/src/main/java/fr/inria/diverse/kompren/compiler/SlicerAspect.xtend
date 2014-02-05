package fr.inria.diverse.kompren.compiler

import fr.inria.triskell.k3.Aspect
import java.util.HashMap
import java.util.List
import java.util.Map
import kompren.Constraint
import kompren.SlicedClass
import kompren.SlicedProperty
import kompren.Slicer
import org.eclipse.emf.ecore.ENamedElement

import static extension fr.inria.diverse.kompren.compiler.EClassifierAspect.*
import static extension fr.inria.diverse.kompren.compiler.EStructuralFeatureAspect.*

@Aspect(className=typeof(Slicer))
class SlicerAspect {
	private var Map<ENamedElement, String> _options
	
	
	private def void initOptionsMap() {
		_self._options = new HashMap<ENamedElement, String>()
		_self.slicedElements.filter[isOption].forEach[opt | _self._options.put(opt.domain, "option"+opt.domain.name)]
	}
	
	def String getOptionName(ENamedElement elt) {
		if(_self._options==null) _self.initOptionsMap
		_self._options.get(elt)
	}
	
	def List<String> getOptionNames() {
		if(_self._options==null) _self.initOptionsMap
		_self._options.values.toList
	}
	
	def	List<SlicedClass> slicedClasses() {
		_self.slicedElements.filter(SlicedClass).toList
	}
	
	def	List<SlicedProperty> slicedProps() {
		_self.slicedElements.filter(SlicedProperty).toList
	}
	
	def boolean hasOpposite() {
		_self.slicedProps.exists[opposite!=null]
	}
}

//@Aspect(className=typeof(SlicedElement))
//abstract class SlicedElementAspect {
//	def String constraintsInXtend() {
//		_self.constraints.map[getExpression].join(" && ")
//	}
//}

@Aspect(className=typeof(SlicedClass))
class SlicedClassAspect {// extends SlicedElementAspect {
	def boolean isEcore() { _self.domain.ecore }
	
	def String constraintsInXtend(String cstPrefix) {
		_self.constraints.map[cstPrefix+expression].join(" && ")
	}
}

@Aspect(className=typeof(SlicedProperty))
class SlicedPropertyAspect {
	def String getXtendNameOrOppositeOne() {
		if(_self.opposite==null) _self.domain.xtendName else _self.opposite.name
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
