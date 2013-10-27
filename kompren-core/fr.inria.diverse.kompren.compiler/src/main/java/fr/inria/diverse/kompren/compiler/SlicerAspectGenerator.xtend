package fr.inria.diverse.kompren.compiler

import java.util.List
import kompren.SlicedProperty
import kompren.Slicer
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

import static extension fr.inria.diverse.kompren.compiler.EClassAspectQName.*

class SlicerAspectGenerator {
	val String aspectVisitor = "import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod

@Aspect(className=typeof(Object))
abstract class __SlicerAspect__ {
	var boolean visitedForRelations = false
	var boolean sliced = false

	def void visitToAddClasses(superTypesSlicer thesuperTypesSlicer){
		if(!_self.sliced) {
			_self.sliced = true
			_self._visitToAddClasses(thesuperTypesSlicer)
		}
	}
	
	protected def void _visitToAddClasses(superTypesSlicer thesuperTypesSlicer){}

	def void visitToAddRelations(superTypesSlicer thesuperTypesSlicer){
		if(!_self.visitedForRelations) {
			_self.visitedForRelations = true
			_self._visitToAddRelations(thesuperTypesSlicer)
		}
	}
	
	protected def void _visitToAddRelations(superTypesSlicer thesuperTypesSlicer){}
}\n"

	val List<EPackage> metamodel
	val String slicerName
	val Slicer slicer
	
	new(List<EPackage> mm, String name, Slicer slicer) {
		metamodel = mm
		slicerName = name
		this.slicer = slicer
	}
	
	val buf = new StringBuilder
	
	def generate() {
		generateClassVisitCode
		buf.append("package ").append(slicerName).append('\n')
		buf.append(getMMPackagesImports).append(aspectVisitor).append('\n')
		val mmClasses = metamodel.map[eAllContents.filter(typeof(EClass))]
		mmClasses.forEach[forEach[cl |
			println(cl)
			val superName = if(cl.ESuperTypes.empty) "__SlicerAspect__" else cl.ESuperTypes.head.name+"Aspect"
			buf.append("@Aspect(className=typeof(").append(cl.name).append("))\n")
			buf.append("class ").append(cl.name).append("Aspect extends ").append(superName).append("{\n")
			buf.append("\t@OverrideAspectMethod\n")
			buf.append("\tdef void _visitToAddClasses(").append(slicerName).append(" theSlicer){\n")
			buf.append("\t\t").append(cl.generateVisitToAddClassesBody(this)).append('\n')
			buf.append("\t\t_self.super__visitToAddClasses(theSlicer)\n")
			buf.append("\t\t").append(cl.codeVisit).append('\n')
			buf.append("\t}\n\t@OverrideAspectMethod\n")
			buf.append("\tdef void _visitToAddRelations(").append(slicerName).append(" theSlicer){\n")
			buf.append("\t\t_self.super__visitToAddRelations(theSlicer)\n")
			buf.append("\t\t").append(cl.generateVisitToAddRelations(this)).append('\n')
			buf.append("\t}\n}\n\n")
		]]
	}
	
	
	protected def void generateClassVisitCode() {
		slicer.slicedElements.filter(typeof(SlicedProperty)).forEach[sp | sp.domain.EContainingClass.generateVisitToAddClassesVisit(sp, slicerName)]
	}
	
	
	protected def String getMMPackagesImports() {
		return metamodel.map[pkg| getMMPackageImport("", pkg)].join
	}
	
	
	private def StringBuilder getMMPackageImport(String qname, EPackage pkg) {
		val buf = new StringBuilder
		
		if(pkg!=null) {
			buf.append("import ").append(qname).append(pkg.name).append(".*\n")
			val name = qname+pkg.name+"."
			buf.append(pkg.ESubpackages.map[sub| getMMPackageImport(name, sub)].join)
		}
		
		return buf
	}
	
	
	def StringBuilder code() { return buf }
}