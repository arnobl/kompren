package fr.inria.diverse.kompren.scoping

import com.google.common.base.Function
import java.util.List
import kompren.SlicedClass
import kompren.SlicedElement
import kompren.Slicer
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 */
class KomprenScopeProvider extends AbstractDeclarativeScopeProvider {
	val set = new ResourceSetImpl
	val ecoreFactory = new EcoreResourceFactoryImpl
	val map = set.getResourceFactoryRegistry.getExtensionToFactoryMap

	new() {
		super()
		map.put("ecore", ecoreFactory)
		map.put("genmodel", ecoreFactory)
		GenModelPackage.eINSTANCE.eClass
	}


	def IScope scope_Slicer_inputClasses(Slicer slicer, EReference reference) {
		if(slicer==null) return IScope.NULLSCOPE
		Scopes.scopeFor(getScopeClasses(slicer, true), new QNFunction(), IScope.NULLSCOPE)
	}


	def IScope scope_SlicedElement_domain(SlicedElement<?> sc, EReference reference) {
		if(sc==null || !(sc.eContainer instanceof Slicer)) return IScope.NULLSCOPE
		Scopes.scopeFor(getScopeClasses(sc.eContainer as Slicer, sc instanceof SlicedClass), new QNFunction(), IScope.NULLSCOPE)
	}
	
//	override def IScope getScope(EObject context, EReference reference) {
//		println(context + " " + reference)
//		super.getScope(context, reference)
//	}

	private def Iterable<ENamedElement> getScopeClasses(Slicer slicer, boolean classes) {
		val List<GenModel> genModels = newArrayList
		
		slicer.uriMetamodel.filter[endsWith(".genmodel")].forEach[uri |
			val res = set.getResource(URI.createURI(uri), true)
			res.load(null)
			genModels.addAll(res.contents.filter(GenModel))
		]
		val pkgs = genModels.map[genPackages.filter[getEcorePackage!=null].map[getEcorePackage]].flatten +
					genModels.map[usedGenPackages.filter[getEcorePackage!=null].map[getEcorePackage]].flatten
		if(classes)
			pkgs.map[pkg | EcoreUtil2.getAllContentsOfType(pkg, typeof(EClass))].flatten
		else
			pkgs.map[pkg | EcoreUtil2.getAllContentsOfType(pkg, typeof(EStructuralFeature))].flatten
	}
}

class QNFunction implements Function<ENamedElement, QualifiedName> {
	override QualifiedName apply(ENamedElement elt) {
		val List<String> list = newArrayList
		getQN(elt, list)
		QualifiedName.create(list.reverse)
	}
	
	private def void getQN(ENamedElement elt, List<String> list) {
		if(elt==null) return;
		list.add(elt.name)
		val cont = elt.eContainer
		if(cont instanceof ENamedElement)
			getQN(cont, list)
	}
	
	override equals(Object obj) {
		false
	}
}
	