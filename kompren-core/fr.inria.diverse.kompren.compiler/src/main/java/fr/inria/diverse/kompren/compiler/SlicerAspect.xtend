package fr.inria.diverse.kompren.compiler

import fr.inria.triskell.k3.Aspect
import kompren.SlicedClass
import kompren.Slicer
import java.util.List
import kompren.SlicedProperty

@Aspect(className=typeof(Slicer))
class SlicerAspect {
	private var List<SlicedClass> classes
	private var List<SlicedProperty> props
	
	def	List<SlicedClass> slicedClasses() {
		if(_self.classes==null)
			_self.classes = _self.slicedElements.filter(SlicedClass).toList
		_self.classes
	}
	
	def	List<SlicedProperty> slicedProps() {
		if(_self.props==null)
			_self.props = _self.slicedElements.filter(SlicedProperty).toList
		_self.props
	}
}