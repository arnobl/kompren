package fr.inria.diverse.kompren.compiler

import java.util.List
import java.util.Set
import kompren.Slicer
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

import static extension fr.inria.diverse.kompren.compiler.EClassAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicerAspect.*

class SlicerAspectGenerator extends SlicerGenerator {
	val String aspectVisitor = "import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import java.util.List
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

@Aspect(className=typeof(Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false
	protected var EObject clonedElt = null

	def void visitToAddClasses(TYPE theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(TYPE theSlicer){}

	def void visitToAddRelations(TYPE theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(TYPE theSlicer){}

	def void feedOpposites(){}
}\n"
	
	val Set<EClass> metamodelClasses
	
	new(List<EPackage> mm, String name, Slicer slicer, String pkgName, Set<EClass> metamodelClasses) {
		super(mm, name, slicer, pkgName)
		this.metamodelClasses = metamodelClasses
	}


	override def generate() {
		generateClassAspectCode
		buf.append("package ").append(pkgName).append('\n')
		buf.append(getMMPackagesImports).append(aspectVisitor.replace("TYPE", slicerName)).append('\n')
		val opposite = slicer.hasOpposite

		metamodelClasses.forEach[cl |
			val superName = if(cl.ESuperTypes.empty) "__SlicerAspect__" else cl.ESuperTypes.head.name+"Aspect"
			if(opposite) cl.generateFeedOppositeCodeVisitor
			buf.append("@Aspect(className=typeof(").append(cl.name).append("))\n")
			if(cl.abstract) buf.append("abstract ")
			buf.append("class ").append(cl.name).append("Aspect extends ").append(superName).append("{\n")
			buf.append(cl.oppositeAttr)
			if(opposite)
				buf.append("\t@OverrideAspectMethod\n\tdef void feedOpposites(){\n").append(cl.oppositeFeed).append("\n\t}\n\n")
			buf.append("\t@OverrideAspectMethod\n")
			buf.append("\tdef void _visitToAddClasses(").append(slicerName).append(" theSlicer){\n")
			buf.append(cl.codeAction)
			buf.append("\t\t_self.super__visitToAddClasses(theSlicer)\n")
			buf.append(cl.codeVisit).append('\n')
			buf.append("\t}\n\t@OverrideAspectMethod\n")
			buf.append("\tdef void _visitToAddRelations(").append(slicerName).append(" theSlicer){\n")
			buf.append("\t\t_self.super__visitToAddRelations(theSlicer)\n")
			buf.append(cl.relationCode).append('\n')
			buf.append("\t}\n}\n\n")
		]
	}


	protected def void generateClassAspectCode() {
		slicer.slicedProps.forEach[sp |
			sp.domain.EContainingClass.generateOppositeCode(sp)
			sp.domain.EContainingClass.generateFeedOppositeCode(sp)
			sp.domain.EContainingClass.generateVisitToAddClasses(sp)
			sp.domain.EContainingClass.generateVisitToAddRelations(sp, slicer)
		]
		slicer.slicedClasses.forEach[sc |
			sc.domain.generateVisitToAddClassesActions(sc, slicer)
		]
	}
}