package main

import java.util.Collections
import kompren.Slicer
import kompren.impl.KomprenPackageImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import prettyprinter.Prettyprinter
import java.util.ArrayList

class Main {
	public static def void main(String[] args) {
		val list = new ArrayList
		list.add(getSlicerModel("k3transfoFootprint.kompren"))
		val pp = new Prettyprinter(list)
		pp.slice
		println(pp.buf)
	}
	
	static def Slicer getSlicerModel(String uriSlicerModel) {
		KomprenPackageImpl.eINSTANCE.eClass
		EcoreFactoryImpl.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("kompren", new XMIResourceFactoryImpl)
		val res = new ResourceSetImpl().getResource(URI.createURI(uriSlicerModel), true)
		res.load(Collections.emptyMap)
		return res.contents.filter(Slicer).head
	}
}