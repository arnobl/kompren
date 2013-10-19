package fr.inria.triskell.kompren

import fr.inria.triskell.k3.Aspect
import java.util.List
import kompren.SlicedClass
import kompren.SlicedProperty
import kompren.Slicer

@Aspect(className=typeof(Slicer)) class SlicerAspect {
	public def List<SlicedClass> slicedClasses() {
		return _self.slicedElements.filter(typeof(SlicedClass)).toList
	}
	
	
	public def List<SlicedProperty> slicedProperties() {
		return _self.slicedElements.filter(typeof(SlicedProperty)).toList
	}
}