package fr.inria.triskell.kompren.oclSlicer

import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.triskell.kompren.oclSlicer.__SlicerAspect__.*
import java.io.FileWriter
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.ENamedElement

class StrictEcore{
	val List<EModelElement> inputEModelElement
	private val List<EObject> clonedElts = newArrayList
	public val boolean optionlowerTypes
	val String nameExtension
	protected val modelSlicer = new StringBuilder
	var String nameModelFootprinter = "ModelFootprinter"

	val List<EModelElement> _root

	new(List<EModelElement> inputEModelElement, List<EModelElement> metamodelRoot, boolean optionlowerTypes, String nameExtension){
		this.inputEModelElement = inputEModelElement
		if(metamodelRoot==null) throw new IllegalArgumentException
		this._root = metamodelRoot
		this.optionlowerTypes = optionlowerTypes
		this.nameExtension=nameExtension
	}

	def void slice(){
		onStart
		_root.forEach[feedOpposites]
		inputEModelElement?.forEach[visitToAddClasses(this)]
		inputEModelElement?.forEach[visitToAddRelations(this)]
		onEnd
		save
	}
	
	def void onStart() {
		val pkg = _root.findFirst[elt | elt instanceof EPackage]
		if(pkg!=null) nameModelFootprinter = (pkg as EPackage).name+"Footprinter"
		modelSlicer.append("slicer strict ").append(nameModelFootprinter).
		append(" {\n\tdomain: \"platform:/resource/put here the path to the gen model\"\n\tinput: // Put here the qualified name(s) of the input class(es)\n")
	}

	
	def void onEnd() {
		modelSlicer.append("}\n")
	}

	def void objectCloned(EObject object){
		this.clonedElts.add(object)
	}

	def void save(){
		val objs = this.clonedElts.filter[eContainer==null]
		val resSet = new ResourceSetImpl
		resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val res = resSet.createResource(URI.createURI("modelSlice."+this.nameExtension))
		res.getContents.addAll(objs)
	    res.save(Collections.emptyMap)
	    res.unload
	    
	    val fw = new FileWriter(nameModelFootprinter+".kompren")
	    fw.write(modelSlicer.toString)
	    fw.close
	}

	static def String qualifiedName(ENamedElement elt) {
		if(elt==null) return ""
		var qn = elt.name
		if(elt.eContainer instanceof ENamedElement) 
			qn = qualifiedName(elt.eContainer as ENamedElement) + "." + qn
		qn
	}
}
