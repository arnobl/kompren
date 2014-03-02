/*
 * Licence  : EPL
 * Copyright: Inria Rennes, Diverse
 * Authors  : Arnaud Blouin
 */
package fr.inria.diverse.kompren.compiler

import java.util.List
import kompren.Slicer
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

import static extension fr.inria.diverse.kompren.compiler.ConstraintAspect.*
import static extension fr.inria.diverse.kompren.compiler.EClassAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicedClassAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicedPropertyAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicerAspect.*

class SlicerAspectGenerator extends SlicerGenerator {
	val String aspectVisitor = "import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=typeof(java.lang.Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false
	protected var org.eclipse.emf.ecore.EObject clonedElt = null

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
	
	val List<EClass> metamodelClasses
	
	new(List<EPackage> mm, String name, Slicer slicer, String pkgName, List<EClass> metamodelClasses) {
		super(mm, name, slicer, pkgName)
		this.metamodelClasses = metamodelClasses
	}


	override def generate() {
		generateClassAspectCode
		buf.append("package ").append(pkgName).append('\n')
		buf.append(getMMPackagesImports).append(aspectVisitor.replace("TYPE", slicerName)).append('\n')
		val opposite = slicer.hasOpposite
		
		metamodelClasses.forEach[cl |
			val sts = cl.ESuperTypes.filter[st | st!=null && st.name!=null && st.name.length>0]
			val superName = if(sts.empty) "__SlicerAspect__" else sts.head.qName(false, false)+"Aspect"
			val slicedCl = slicer.slicedClasses.findFirst[domain==cl]
			val withParam = if(sts.empty) "typeof("+superName+")" 
							else sts.map[st | "typeof("+st.qName(false, false)+"Aspect)"].join(", ")
			if(opposite) cl.generateFeedOppositeCodeVisitor
			buf.append("@Aspect(className=typeof(").append(cl.qName(true, false)).append("), with=#[").append(withParam).append("])\n")
			if(cl.abstract) buf.append("abstract ")
			buf.append("class ").append(cl.qName(false, false)).append("Aspect extends ").append(superName).append("{\n")
			buf.append(cl.oppositeAttr)
			if(opposite)
				buf.append("\t@OverrideAspectMethod\n\tdef void feedOpposites(){\n").append(cl.oppositeFeed).append("\n\t}\n\n")
			buf.append("\t@OverrideAspectMethod\n")
			buf.append("\tdef void _visitToAddClasses(").append(slicerName).append(" theSlicer){\n")
			if(slicer.logVisitClass!=null && slicer.logVisitClass.length>0)
				buf.append(slicer.logVisitClass.replaceAll("<aspectClassName>", cl.name+"Aspect").replaceAll("<className>", cl.qName(true, false))).append('\n')
			if(slicedCl!=null && !slicedCl.constraints.empty)
				buf.append("\t\tif(").append(slicedCl.constraintsInXtend).append("){\n")
			buf.append(cl.codeAction)

			if(sts.size<2)
				buf.append("\t\t_self.super__visitToAddClasses(theSlicer)\n")
			else
				sts.forEach[st | buf.append("\t\t_self.super_").append(st.name).append("__visitToAddClasses(theSlicer)\n") ]

			buf.append(cl.codeVisit).append('\n')
			if(slicedCl!=null && !slicedCl.constraints.empty) buf.append("\t\t}\n")
			buf.append("\t}\n\t@OverrideAspectMethod\n")
			buf.append("\tdef void _visitToAddRelations(").append(slicerName).append(" theSlicer){\n")
			if(slicer.logVisitRelation!=null && slicer.logVisitRelation.length>0)
				buf.append(slicer.logVisitRelation.replaceAll("<aspectClassName>", cl.name+"Aspect").replaceAll("<className>", cl.name)).append('\n')
			if(slicedCl!=null && !slicedCl.constraints.empty)
				buf.append("\t\tif(").append(slicedCl.constraintsInXtend).append("){\n")

			if(sts.size<2)
				buf.append("\t\t_self.super__visitToAddRelations(theSlicer)\n")
			else
				sts.forEach[st | buf.append("\t\t_self.super_").append(st.name).append("__visitToAddRelations(theSlicer)\n") ]
			
			buf.append(cl.relationCode).append('\n')
			if(slicedCl!=null && !slicedCl.constraints.empty) buf.append("\t\t}\n")
			buf.append("\t}\n")
			
			slicer.slicedProps.filter[domain.EType==cl].forEach[prop |
				prop.constraints.filter[!cloned].forEach[constraint | buf.append(prop.generateConstraintCode(constraint))]
			]
			
			if(slicedCl!=null)
				slicedCl.constraints.filter[!cloned].forEach[constraint | buf.append(slicedCl.generateConstraintCode(constraint))]

			buf.append("}\n\n")
		]
	}


	protected def void generateClassAspectCode() {
		slicer.slicedProps.forEach[sp |
			sp.domain.EContainingClass.generateOppositeCode(sp)
			sp.domain.EContainingClass.generateFeedOppositeCode(sp)
			sp.domain.EContainingClass.generateVisitToAddClasses(sp, slicer)
			sp.domain.EContainingClass.generateVisitToAddRelations(sp, slicer)
		]
		slicer.slicedClasses.forEach[sc |
			sc.domain.generateVisitToAddClassesActions(sc, slicer)
		]
	}
}