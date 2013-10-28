package fr.inria.diverse.kompren.compiler

import java.util.List
import kompren.Slicer
import org.eclipse.emf.ecore.EPackage

abstract class SlicerGenerator {
	protected val List<EPackage> metamodel
	protected val String slicerName
	protected val String pkgName
	protected val Slicer slicer
	protected val buf = new StringBuilder

	
	new(List<EPackage> mm, String name, Slicer slicer, String pkgName) {
		metamodel = mm
		slicerName = name
		this.pkgName = pkgName
		this.slicer = slicer
	}
	
	abstract def void generate()
	
	def StringBuilder code() { return buf }
	
	protected def String getMMPackagesImports() {
		val imports = metamodel.map[pkg| getMMPackageImport("", pkg)].join
		return imports + "import static extension " + pkgName + ".__SlicerAspect__.*\n"
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
}