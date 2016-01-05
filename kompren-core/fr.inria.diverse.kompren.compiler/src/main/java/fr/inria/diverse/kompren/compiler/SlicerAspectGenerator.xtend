/*
 * Licence  : EPL
 * Copyright: Inria Rennes, Diverse
 * Authors  : Arnaud Blouin
 */
package fr.inria.diverse.kompren.compiler

import java.util.List
import java.util.Map
import kompren.Slicer
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

import static extension fr.inria.diverse.kompren.compiler.ConstraintAspect.*
import static extension fr.inria.diverse.kompren.compiler.EClassAspect.*
import static extension fr.inria.diverse.kompren.compiler.ENamedEltAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicedClassAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicedPropertyAspect.*
import static extension fr.inria.diverse.kompren.compiler.SlicerAspect.*

class SlicerAspectGenerator extends SlicerGenerator {
	protected val Map<String, String> aspects
	
	val String imports = "import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod"
	
	val String aspectVisitor = "@Aspect(className=typeof(java.lang.Object))
abstract class __SlicerAspect__ {
	protected var boolean visitedForRelations = false
	protected var boolean sliced = false
	protected var org.eclipse.emf.ecore.EObject clonedElt = null

	def void visitToAddClasses(%s theSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(theSlicer)
		}
	}
	
	protected def void _visitToAddClasses(%s theSlicer){}

	def void visitToAddRelations(%s theSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(theSlicer)
		}
	}
	
	protected def void _visitToAddRelations(%s theSlicer){}

	def void feedOpposites(){}

	def void reinit(){
		_self.visitedForRelations = false
		_self.sliced = false
		_self.clonedElt = null
	}
}\n"
	
	val List<EClass> metamodelClasses
	
	new(List<EPackage> mm, String name, Slicer slicer, String pkgName, List<EClass> metamodelClasses) {
		super(mm, name, slicer, pkgName)
		this.metamodelClasses = metamodelClasses
		aspects = newHashMap()
	}


	override def void flush() {
		super.flush
		metamodelClasses.clear
		aspects.clear
	}

	override def generate() {
		generateClassAspectCode
		
		val mainbuf = new StringBuilder
		val pkgs = imports + getMMPackagesImports
		
		mainbuf.append("package ").append(pkgName).append('\n').
			append(pkgs).append(String.format(aspectVisitor, slicerName, slicerName, slicerName, slicerName)).append('\n')
			
		aspects.put("__SlicerAspect__.xtend", mainbuf.toString)
			
		val opposite = slicer.hasOpposite
		
		metamodelClasses.filter[instanceTypeName===null || instanceTypeName.length==0].forEach[cl |
			val buf = new StringBuilder
			
			buf.append("package ").append(pkgName).append('\n').append(pkgs).append('\n')
			
			val sts = cl.ESuperTypes.filter[st | st!==null && st.name!==null && st.name.length>0]
			val superName = if(sts.empty) "__SlicerAspect__" else sts.head.qName(false, false)+"Aspect"
			val slicedCl = slicer.slicedClasses.findFirst[domain==cl]
			val withParam = if(sts.empty) "typeof("+superName+")" 
							else sts.map[st | "typeof("+st.qName(false, false)+"Aspect)"].join(", ")
			val className = cl.qName(false, false)+"Aspect"
			if(opposite) cl.generateFeedOppositeCodeVisitor
			buf.append("@Aspect(className=typeof(").append(cl.qName(true, false)).append("), with=#[").append(withParam).append("])\n")
			if(cl.abstract) buf.append("abstract ")
			buf.append("class ").append(className).append(" extends ").append(superName).append("{\n")
			buf.append(cl.oppositeAttr)
			
			if(opposite && cl.oppositeFeed.length>0)
				buf.append("\t@OverrideAspectMethod\n\tdef void feedOpposites(){\n\t\t_self.super_feedOpposites\n").append(cl.oppositeFeed).append("\t}\n\n")
			
			val reinitCode = cl.generateReinitCode
			if(!reinitCode.empty)
				buf.append("\t@OverrideAspectMethod\n\tdef void reinit(){\n\t\t_self.super_reinit\n").append(reinitCode).append("\t}\n\n");
			
			buf.append("\t@OverrideAspectMethod\n")
			buf.append("\tdef void _visitToAddClasses(").append(slicerName).append(" theSlicer){\n")
			if(slicer.logVisitClass!==null && slicer.logVisitClass.length>0)
				buf.append(slicer.logVisitClass.replaceAll("<aspectClassName>", cl.name+"Aspect").replaceAll("<className>", cl.qName(true, false))).append('\n')
			if(slicedCl!==null && !slicedCl.constraints.empty)
				buf.append("\t\tif(").append(slicedCl.constraintsInXtend).append("){\n")
			buf.append(cl.codeAction)

			if(sts.size<2)
				buf.append("\t\t_self.super__visitToAddClasses(theSlicer)\n")
			else
				sts.forEach[st | buf.append("\t\t_self.super_").append(st.name).append("__visitToAddClasses(theSlicer)\n") ]

			buf.append(cl.codeVisit).append('\n')
			if(slicedCl!==null && !slicedCl.constraints.empty) buf.append("\t\t}\n")
			buf.append("\t}\n\t@OverrideAspectMethod\n")
			buf.append("\tdef void _visitToAddRelations(").append(slicerName).append(" theSlicer){\n")
			if(slicer.logVisitRelation!==null && slicer.logVisitRelation.length>0)
				buf.append(slicer.logVisitRelation.replaceAll("<aspectClassName>", cl.name+"Aspect").replaceAll("<className>", cl.name)).append('\n')
			if(slicedCl!==null && !slicedCl.constraints.empty)
				buf.append("\t\tif(").append(slicedCl.constraintsInXtend).append("){\n")

			if(sts.size<2)
				buf.append("\t\t_self.super__visitToAddRelations(theSlicer)\n")
			else
				sts.forEach[st | buf.append("\t\t_self.super_").append(st.name).append("__visitToAddRelations(theSlicer)\n") ]
			
			buf.append(cl.relationCode).append('\n')
			if(slicedCl!==null && !slicedCl.constraints.empty) buf.append("\t\t}\n")
			buf.append("\t}\n")
			
			slicer.slicedProps.filter[domain.EType==cl].forEach[prop |
				prop.constraints.filter[!cloned].forEach[constraint | buf.append(prop.generateConstraintCode(constraint))]
			]
			
			if(slicedCl!==null)
				slicedCl.constraints.filter[!cloned].forEach[constraint | buf.append(slicedCl.generateConstraintCode(constraint))]

			buf.append("}\n\n")
			
			aspects.put(className+".xtend", buf.toString)
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