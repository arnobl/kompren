package fr.inria.diverse.kompren.compiler

import fr.inria.triskell.k3.Aspect
import kompren.SlicedClass
import kompren.Slicer
import java.util.List
import kompren.SlicedProperty

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