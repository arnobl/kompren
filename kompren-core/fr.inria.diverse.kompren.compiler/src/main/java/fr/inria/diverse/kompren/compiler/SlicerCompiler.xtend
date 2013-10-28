package fr.inria.diverse.kompren.compiler

import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
import java.util.Collections
import java.util.List
import kompren.SlicedClass
import kompren.SlicedProperty
import kompren.Slicer
import kompren.impl.KomprenPackageImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

class SlicerCompiler {
	val String slicerName
	val String pkgName
	val Slicer slicer
	val List<EPackage> metamodel
	val SlicerAspectGenerator aspectGenerator
	val SlicerMainGenerator mainGenerator
	val String targetDir
	
	
	def static void main(String[] args) {
		val slicerCompiler = new SlicerCompiler("", "/media/data/dev/kompren/kompren-examples/")
		slicerCompiler.compile
	}
	
	new(String uri, String targetDir) {
		val rs = new ResourceSetImpl
		KomprenPackageImpl.eINSTANCE.eClass
		EcoreFactoryImpl.eINSTANCE.eClass
		slicer = getSlicerModel("clazz.kompren", rs)
		metamodel = getEcoreModel(slicer)
		pkgName = slicer.name.split("\\.").last
		slicerName = Character.toUpperCase(pkgName.charAt(0)).toString+pkgName.substring(1)
		aspectGenerator = new SlicerAspectGenerator(metamodel, slicerName, slicer, pkgName)
		mainGenerator = new SlicerMainGenerator(metamodel, slicerName, slicer, pkgName)
		this.targetDir = targetDir
	}
	
	
	protected def void compile() {
		aspectGenerator.generate
		mainGenerator.generate
		println(aspectGenerator.code)
		println(mainGenerator.code)
		saveCode
	}
	
	
	protected def void saveCode() {
		val p = targetDir+slicer.name+"/src/main/xtend/"+pkgName+"/"
		val path = Paths.get(p)
		if(!Files.exists(path))
			Files.createDirectories(path)
		var out = new PrintWriter(p+slicerName+"Aspects.xtend")
		out.println(aspectGenerator.code)
		out.flush
		out.close
		out = new PrintWriter(p+slicerName+".xtend")
		out.println(mainGenerator.code)
		out.flush
		out.close
	}
	
	
	protected def List<EPackage> getEcoreModel(Slicer slicer) {
		val mm = new ArrayList<EPackage>()
		if(!slicer.slicedElements.empty) {
			val elt = slicer.slicedElements.head
			var EPackage pkg = switch(elt) {
				SlicedClass: elt.domain.EPackage
				SlicedProperty: elt.domain.EContainingClass.EPackage
				default: null
			}
			if(pkg!=null) {
				while(pkg.ESuperPackage!=null)
					pkg = pkg.ESuperPackage
				mm.add(pkg)		
			}
		}
		return mm
	}
	
	protected def Slicer getSlicerModel(String uriSlicerModel, ResourceSet rs) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("kompren", new XMIResourceFactoryImpl)
		val res = rs.getResource(URI.createURI(uriSlicerModel), true)
		res.load(Collections.emptyMap)
		return res.contents.filter(Slicer).head
	}
}
