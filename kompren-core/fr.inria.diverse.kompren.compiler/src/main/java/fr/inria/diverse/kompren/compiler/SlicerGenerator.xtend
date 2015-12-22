/*
 * Licence  : EPL
 * Copyright: Inria Rennes, Diverse
 * Authors  : Arnaud Blouin
 */
package fr.inria.diverse.kompren.compiler

import java.util.List
import kompren.Slicer
import org.eclipse.emf.ecore.EPackage

import static extension fr.inria.diverse.kompren.compiler.SlicerAspect.*
import static extension fr.inria.diverse.kompren.compiler.ENamedEltAspect.*

abstract class SlicerGenerator {
	protected val List<EPackage> metamodel
	protected val String slicerName
	protected val String pkgName
	protected val Slicer slicer
	protected var String imports

	
	new(List<EPackage> mm, String name, Slicer slicer, String pkgName) {
		metamodel = mm
		slicerName = name
		this.pkgName = pkgName
		this.slicer = slicer
		imports = ""
	}
	
	def void flush() {
		metamodel.clear
	}
	
	abstract def void generate()
	
	protected def String getMMPackagesImports() {
		if(imports.length==0) {
			val buf = new StringBuilder
			buf.append("\nimport static extension " + pkgName + ".__SlicerAspect__.*\n")
			slicer.slicedClasses.forEach[slicedClass |
				buf.append("import static extension ").append(pkgName).append('.').append(slicedClass.domain.qName(false, false)).append("Aspect.*\n")
			]
			imports = buf.toString
		}
		imports
	}
	
	private def StringBuilder getMMPackageImport(String qname, EPackage pkg) {
		val buf = new StringBuilder
		
		if(pkg!==null) {
			buf.append("import ").append(qname).append(pkg.name).append(".*\n")
			if(!pkg.EClassifiers.empty)
				buf.append("import ").append(qname).append(pkg.name).append(".impl.*\n")
			val name = qname+pkg.name+"."
			buf.append(pkg.ESubpackages.map[sub| getMMPackageImport(name, sub)].join)
		}
		
		return buf
	}
}