package fr.inria.diverse.kompren.compiler

import java.util.List
import kompren.Slicer
import org.eclipse.emf.ecore.EPackage

import static extension fr.inria.diverse.kompren.compiler.SlicerAspect.*

class SlicerMainGenerator extends SlicerGenerator {
	static val extensionName = "nameExtension"
	
	new(List<EPackage> mm, String name, Slicer slicer, String pkgName, StringBuilder imports) {
		super(mm, name, slicer, pkgName, imports)
	}
	
	override generate() {
		buf.append("package ").append(pkgName).append('\n')
		buf.append(getMMPackagesImports)
		buf.append("import java.util.List\n\n")
		if(slicer.hasOpposite || slicer.strict) buf.append("import org.eclipse.emf.ecore.EObject\n")
		buf.append("class ").append(slicerName).append("{\n")
		if(!slicer.strict && slicer.helper!=null && slicer.helper.length>0) buf.append(slicer.helper).append('\n')
		buf.append(generateAttributes).append('\n')
		if(slicer.hasOpposite) buf.append("\tval EObject _root\n\n")
		buf.append(generateConstructor).append('\n')
		buf.append(generateLaunch).append('\n')
		if(slicer.strict) {
			buf.append(generateObjectAdded).append('\n')
			buf.append(generateSave).append('\n')
		}
		else {
			buf.append(generateOnAdded).append('\n')
			buf.append(generateOnStart).append('\n')
			buf.append(generateOnEnd).append('\n')
		}
		buf.append("}\n")
	}


	private def StringBuilder generateSave() {
		val content = "		val objs = this.clonedElts.filter[eContainer==null]
		val resSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put(\"*\", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl)
		val res = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(\"modelSlice.\"+this."+extensionName+"))
		res.getContents.addAll(objs)
	    res.save(java.util.Collections.emptyMap)
	    res.unload"		
		new StringBuilder("\tdef void save(){\n").append(content).append("\n\t}\n")
	}


	private def StringBuilder generateObjectAdded() {
		new StringBuilder("\tdef void objectCloned(EObject object){\n\t\tthis.clonedElts.add(object)\n\t}\n")
	}


	private def StringBuilder generateOnAdded() {
		val buf = new StringBuilder
		slicer.slicedClasses.forEach[cl |
			val exp = if(cl.expression==null) "" else cl.expression
			buf.append("\tdef void on").append(cl.domain.name).append("Sliced(").
				append(cl.ctx.type.name).append(' ').append(cl.ctx.varName).append("){\n").
				append("\t\t").append(exp).append('\n').append("\t}\n")
		]
		slicer.slicedProps.filter[expression!=null && expression.length>0 && src!=null && tgt!=null].forEach[prop|
			val name = if(prop.opposite==null) prop.domain.name else prop.opposite.name
			val exp = if(prop.expression==null) "" else prop.expression
			buf.append("\tdef void on").append(name).append("Sliced(").
				append(prop.src.type.name).append(' ').append(prop.src.varName).append(", ").
				append(prop.tgt.type.name).append(' ').append(prop.tgt.varName).append("){\n")
			buf.append("\t\t").append(exp).append('\n')
			buf.append("\t}\n")
		]
		return buf
	}


	private def StringBuilder generateOnStart() {
		val buf = new StringBuilder
		buf.append("\tprotected def void onStart(){\n")
		if(slicer.onStart!=null&& slicer.onStart.length>0)
			buf.append("\t\t").append(slicer.onStart).append('\n')
		buf.append("\t}\n")
		return buf
	}
	
	
	private def StringBuilder generateOnEnd() {
		val buf = new StringBuilder
		buf.append("\tprotected def void onEnd(){\n")
		if(slicer.onEnd!=null&& slicer.onEnd.length>0)
			buf.append("\t\t").append(slicer.onEnd).append('\n')
		buf.append("\t}\n")
		return buf
	}


	private def StringBuilder generateLaunch() {
		val buf = new StringBuilder
		buf.append("\tdef void slice(){\n")
		if(slicer.hasOpposite)
			buf.append("\t\t_root.feedOpposites\n")
		if(!slicer.strict) buf.append("\t\tonStart\n")
		slicer.inputClasses.forEach[cl | buf.append("\t\tinput").append(cl.name).append("?.forEach[visitToAddClasses(this)]\n")]
		slicer.inputClasses.forEach[cl | buf.append("\t\tinput").append(cl.name).append("?.forEach[visitToAddRelations(this)]\n")]
		if(slicer.strict) buf.append("\t\tsave\n")
		else buf.append("\t\tonEnd\n")
		buf.append("\t}\n")
		return buf
	}


	private def StringBuilder generateConstructor() {
		val buf = new StringBuilder
		buf.append("\tnew(")
		buf.append(slicer.inputClasses.map[cl | new StringBuilder("List<").append(cl.name).append("> input").append(cl.name)].join(","))
		if(slicer.hasOpposite) buf.append(", EObject metamodelRoot")
		val listOptions = slicer.optionNames
		if(!listOptions.empty)
			buf.append(", ").append(listOptions.map[name | new StringBuilder("boolean ").append(name)].join(", "))
		if(slicer.strict)
			buf.append(", String ").append(extensionName)
		buf.append("){\n")
		slicer.inputClasses.forEach[cl | buf.append("\t\tthis.input").append(cl.name).append(" = input").append(cl.name).append('\n')]
		if(slicer.hasOpposite)
			buf.append("\t\tif(metamodelRoot==null) throw new IllegalArgumentException\n\t\tthis._root = metamodelRoot\n")
		listOptions.forEach[name | buf.append("\t\tthis.").append(name).append(" = ").append(name).append('\n')]
		if(slicer.strict)
			buf.append("\t\tthis.").append(extensionName).append('=').append(extensionName).append('\n')
		buf.append("\t}\n")
		return buf
	}

	
	private def StringBuilder generateAttributes() {
		val buf = new StringBuilder
		slicer.inputClasses.forEach[cl | buf.append("\tval List<").append(cl.name).append("> input").append(cl.name).append('\n')]
		if(slicer.strict)
			buf.append("\tprivate val List<EObject> clonedElts = newArrayList\n")
		slicer.optionNames.forEach[name | buf.append("\tpublic val boolean ").append(name).append('\n')]
		if(slicer.strict)
			buf.append("\tval String ").append(extensionName).append('\n')
		return buf
	}
}