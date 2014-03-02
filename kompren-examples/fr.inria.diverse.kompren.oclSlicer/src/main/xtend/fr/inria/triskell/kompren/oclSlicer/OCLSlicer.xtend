package fr.inria.triskell.kompren.oclSlicer

import LRBAC.LRBACPackage
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
import org.eclipse.ocl.ecore.OCL

import static extension fr.inria.triskell.kompren.oclSlicer.OCLSlicerVisitor.*

class OCLSlicer {
	def static void main(String[] args) {
		// First step: Extracts model elements from OCL constraints

	    OCL::newInstance()//EcoreEnvironmentFactory.INSTANCE)
	    LRBACPackage.eINSTANCE.eClass
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
		val slicer = new OCLSlicer
	    val resSet = new ResourceSetImpl
	    val resource = resSet.getResource(URI.createURI("src/main/resources/models/PaperCst.xmi"), true)
	    resource.getContents.filter(typeof(Constraint)).forEach[visitToAddClasses(slicer)]

		slicer.objects.filter(typeof(EModelElement)).forEach[obj | 
			if(obj instanceof EClassifier) slicer.classifiers.add(obj)
			else slicer.elts.add(obj)
		]

		//---------------//
		// Second step: Extracting the metamodel footprint (StrictEcore)
	    val Set<EModelElement> set = newHashSet
	    set.addAll(slicer.ops)
	    set.addAll(slicer.features)
	    set.addAll(slicer.enumLiterals)
	    set.addAll(slicer.params)
	    set.addAll(slicer.classifiers)
	    set.addAll(slicer.elts)
	    
//	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
//		val resource2 = resSet.getResource(URI.createURI("src/main/resources/models/Paper.ecore"), true)
	    val Set<EModelElement> metamodel = newHashSet
	    val cl = slicer.classifiers.head
	    var EModelElement root = cl
	    
	    while(root.eContainer!=null)
	    	root = root.eContainer as EModelElement

	    metamodel.add(root)
	    val ecoreSlicer = new StrictEcore(set.filter[!eIsProxy].toList, metamodel.toList, true, "ecore")
		ecoreSlicer.slice
	    resource.unload
	}
	
	public val Set<EOperation> ops = newHashSet
	public val Set<EStructuralFeature> features = newHashSet
	public val Set<EEnumLiteral> enumLiterals = newHashSet
	public val Set<EParameter> params = newHashSet
	public val Set<EObject> objects = newHashSet
	public val Set<EClassifier> classifiers = newHashSet
	public val Set<EModelElement> elts = newHashSet
	
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
