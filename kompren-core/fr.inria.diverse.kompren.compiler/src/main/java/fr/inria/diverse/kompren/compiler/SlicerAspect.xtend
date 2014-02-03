package fr.inria.diverse.kompren.compiler

import fr.inria.triskell.k3.Aspect
import java.util.HashMap
import java.util.List
import java.util.Map
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

@Aspect(className=typeof(SlicedClass))
class SlicedClassAspect {
	def boolean isEcore() { _self.domain.ecore }
}

@Aspect(className=typeof(SlicedProperty))
class SlicedPropertyAspect {
	def boolean isEcore() { _self.domain.ecore }
}