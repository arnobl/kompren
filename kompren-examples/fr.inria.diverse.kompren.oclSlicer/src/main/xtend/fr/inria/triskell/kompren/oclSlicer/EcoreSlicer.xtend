package fr.inria.triskell.kompren.oclSlicer

import java.util.Collections
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

import static extension fr.inria.triskell.kompren.oclSlicer.EcoreSlicerVisitor.*
import org.eclipse.emf.ecore.EReference

class EcoreSlicer {
	public val Set<EClass> classes = new HashSet
	public val Set<EPackage> pkgs = new HashSet
	
	protected val Set<EReference> refToComplete = new HashSet
	
	
	def slice(Set<EModelElement> elts, Set<EModelElement> metamodel) {
		metamodel.forEach[initOpposites]
		
		elts?.forEach[visitToAddClasses(this)]

		refToComplete.forEach[completeSlice]
		
		classes.forEach[cl | println(cl)]
		pkgs.forEach[cl | println(cl)]
		
		val resSet = new ResourceSetImpl
	 	resSet.getResourceFactoryRegistry.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
	    val res = resSet.createResource(URI.createURI("out.ecore"))
		res.getContents.addAll(pkgs)
	    res.save(Collections.emptyMap)
	    res.unload
	}
}