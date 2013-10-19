package fr.inria.triskell.kompren.oclSlicer

import LRBAC.LRBACPackage
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.ocl.ecore.Constraint
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory
import org.eclipse.ocl.ecore.OCL

import static extension fr.inria.triskell.kompren.oclSlicer.ConstraintAspect.*

class OCLSlicer {
	
	def static void main(String[] args) {
	    OCL.newInstance(EcoreEnvironmentFactory.INSTANCE)
	    LRBACPackage.eINSTANCE.eClass
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
		val slicer = new OCLSlicer
	    val resSet = new ResourceSetImpl
	    val resource = resSet.getResource(URI.createURI("src/main/resources/models/PaperCst.xmi"), true)
	    resource.getContents.filter(typeof(Constraint)).forEach[visitToAddClasses(slicer)]
//	    println(slicer)

		slicer.objects.filter(typeof(EModelElement)).forEach[obj | 
			if(obj instanceof EClassifier) slicer.classifiers.add(obj as EClassifier)
			else slicer.elts.add(obj)
		]
		//---------------//
		// Extracting the metamodel footprint
	    val ecoreSlicer = new EcoreSlicer
	    val set = new HashSet
	    set.addAll(slicer.ops)
	    set.addAll(slicer.features)
	    set.addAll(slicer.enumLiterals)
	    set.addAll(slicer.params)
	    set.addAll(slicer.classifiers)
	    set.addAll(slicer.elts)
	    println("--------")
	    
//	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
//		val resource2 = resSet.getResource(URI.createURI("src/main/resources/models/Paper.ecore"), true)
//	    EcoreUtil.resolveAll(resource2)
	    val metamodel = new HashSet
	    val cl = slicer.classifiers.head
	    var EModelElement root = cl
	    
	    while(root.eContainer!=null)
	    	root = root.eContainer as EModelElement
	    
	    metamodel.add(root)
//	    metamodel.addAll(resource2.getContents.filter(typeof(EModelElement)))
	    ecoreSlicer.slice(set, metamodel)
	    
	    resource.unload
//	    resource2.unload
	}
	
	public val Set<EOperation> ops = new HashSet
	public val Set<EStructuralFeature> features = new HashSet
	public val Set<EEnumLiteral> enumLiterals = new HashSet
	public val Set<EParameter> params = new HashSet
	public val Set<EObject> objects = new HashSet
	public val Set<EClassifier> classifiers = new HashSet
	public val Set<EModelElement> elts = new HashSet
	
	override String toString() {
		val buf = new StringBuilder
		buf.append("ops:\n")
		ops.forEach[obj | buf.append(obj).append('\n')]
		buf.append("\nfeatures:\n")
		features.forEach[obj | buf.append(obj).append('\n')]
		buf.append("\nenumLiterals:\n")
		enumLiterals.forEach[obj | buf.append(obj).append('\n')]
		buf.append("\nparams:\n")
		params.forEach[obj | buf.append(obj).append('\n')]
		buf.append("\nObjects:\n")
		objects.forEach[obj | buf.append(obj).append('\n')]
		buf.append("\nClassifiers:\n")
		classifiers.forEach[obj | buf.append(obj).append('\n')]
		buf.append("\nelts:\n")
		elts.forEach[obj | buf.append(obj).append('\n')]
		return buf.toString
	}
}
