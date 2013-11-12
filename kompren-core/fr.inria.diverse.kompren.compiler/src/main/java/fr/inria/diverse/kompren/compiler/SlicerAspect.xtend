package fr.inria.diverse.kompren.compiler

import fr.inria.triskell.k3.Aspect
import java.util.List
import kompren.SlicedClass
import kompren.SlicedProperty
import kompren.Slicer

import static extension fr.inria.diverse.kompren.compiler.EClassifierAspect.*
import static extension fr.inria.diverse.kompren.compiler.EStructuralFeatureAspect.*

@Aspect(className=typeof(Slicer))
class SlicerAspect {
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