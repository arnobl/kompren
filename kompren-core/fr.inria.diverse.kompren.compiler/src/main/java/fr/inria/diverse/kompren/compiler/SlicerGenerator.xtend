package fr.inria.diverse.kompren.compiler

import java.util.List
import kompren.Slicer
import org.eclipse.emf.ecore.EPackage

abstract class SlicerGenerator {
	protected val List<EPackage> metamodel
	protected val String slicerName
	protected val String pkgName
	protected val Slicer slicer
	protected val String pkgPrefix
	protected val buf = new StringBuilder

	
	new(List<EPackage> mm, String name, Slicer slicer, String pkgName, String pkgPrefix) {
		metamodel = mm
		slicerName = name
		this.pkgName = pkgName
		this.slicer = slicer
		this.pkgPrefix = pkgPrefix
	}
	
	abstract def void generate()
	
	def StringBuilder code() { buf }
	
	protected def String getMMPackagesImports() {
		metamodel.map[pkg| getMMPackageImport(pkgPrefix, pkg)].join + "import static extension " + pkgName + ".__SlicerAspect__.*\n"
	}
	
	private def StringBuilder getMMPackageImport(String qname, EPackage pkg) {
		val buf = new StringBuilder
		
		if(pkg!=null) {
			buf.append("import ").append(qname).append(pkg.name).append(".*\n")
			if(!pkg.EClassifiers.empty)
				buf.append("import ").append(qname).append(pkg.name).append(".impl.*\n")
			val name = qname+pkg.name+"."
			buf.append(pkg.ESubpackages.map[sub| getMMPackageImport(name, sub)].join)
		}
		
		return buf
	}
}