package fr.inria.triskell.kompren.oclSlicer;

import java.io.InputStream;
import java.net.URL;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;

import LRBAC.LRBACPackage;

public class OCLToXMI {
	public static void main(String[] args) {
		try {
		    EPackage.Registry registry = new EPackageRegistryImpl();
		    registry.put(LRBACPackage.eNS_URI, LRBACPackage.eINSTANCE);
		    EcoreEnvironmentFactory environmentFactory = new EcoreEnvironmentFactory(registry);
		    OCL ocl = OCL.newInstance(environmentFactory);
		    URL url = new URL("file:/media/data/dev/k3/k3Projects/fr.inria.triskell.kompren.oclSlicer/fr.inria.triskell.kompren.oclSlicer/src/main/resources/models/PaperCst.ocl");
		    InputStream in = url.openConnection().getInputStream();

			 try {
			     OCLInput document = new OCLInput(in);
			     ResourceSet resSet = new ResourceSetImpl();
			     resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			     Resource res = resSet.createResource(URI.createURI("out.xmi"));
			     res.getContents().addAll(ocl.parse(document));
			    res.save(Collections.emptyMap());
			    res.unload();
			 } finally {
			     in.close();
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
