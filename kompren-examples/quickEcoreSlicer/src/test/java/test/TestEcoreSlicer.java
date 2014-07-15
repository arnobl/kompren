package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kompren.ecoreSlicer.EcoreSlicer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.junit.Test;

public class TestEcoreSlicer {
	@Test public void testSlicer() throws IOException {
		List<EModelElement> inputs = new  ArrayList<>();
		ResourceSet rs = new ResourceSetImpl();
		EcoreFactoryImpl.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource res = rs.getResource(URI.createURI("UML2.ecore"), true);
		res.load(Collections.emptyMap());
		EPackage pkg = (EPackage) res.getContents().get(0);
		List<EPackage> mm = new ArrayList<>();
		mm.add(pkg);
		EClass cl = null;
		for(EClassifier classif : pkg.getEClassifiers()) {
			if(classif instanceof EClass && ((EClass)classif).getName().equals("Class")) {
				inputs.add(classif);
				EClass clazz = (EClass) classif;
				for(EAttribute attr: clazz.getEAttributes()) {
					inputs.add(attr);
				}
			}
//			if(classif instanceof EClass && ((EClass)classif).getName().equals("D"))
//				inputs.add(classif);
//			else 
//				if(classif instanceof EClass && ((EClass)classif).getName().equals("B")) {
//				EClass b = (EClass) classif;
//				for(EReference ref : b.getEReferences()) {
//					if(ref.getName().equals("f"))
//						inputs.add(ref);
//				}
//			}
		}
		inputs.add(cl);
		double loop = 1;
		double sum = 0;
		for(int i=0; i<loop; i++) {
			long time = System.currentTimeMillis();
			EcoreSlicer slicer = new EcoreSlicer(inputs, mm);
			slicer.slice();
			sum += (System.currentTimeMillis()-time);
		}
		System.out.println(sum/loop);
	}
}
