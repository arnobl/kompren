package kompren.ecoreSlicer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EcoreSlicer {
	// The slicing criteria
	List<EModelElement> inputEModelElement;
	// The input model.
	List<EPackage> model;
	// The subtypes relation opposite of EClass.eSuperTypes
	Map<EClass,Set<EClass>> subTypes;
	
	// The cloned elements resulting from the slicing.
	Map<EModelElement, EModelElement> clones = new IdentityHashMap<>();

	// An helper map
	Map<EClass, EClass> clonesClass = new IdentityHashMap<>();
	// Contains the roots of the sliced model.
	List<EPackage> sliceRoots = new ArrayList<>();


	/**
	 * @param inputEModelElement The slicing criteria.
	 */
	public EcoreSlicer(List<EModelElement> inputEModelElement, List<EPackage> model){
		this.inputEModelElement = inputEModelElement;
		this.model = model;
		subTypes = EcoreCopyHelper.feedSubTypes(model);
	}

	
	/**
	 * Executes the slicing.
	 */
	public void slice(){
		EModelElement elt;
		while(!inputEModelElement.isEmpty()) {
			elt = inputEModelElement.remove(inputEModelElement.size()-1);
			if(clones.get(elt)==null){ // If not sliced already.
				sliceEModelElement(elt);
			}
		}
		// Adding required relations when all the classes are analysed.
		completeRelations();
		// Serializing the model.
		save();
	}
	
	
	
	/**
	 * When all the classes of the model are analysed (sliced or not), 
	 * the resulting model may need to be completed with some relations between the sliced classes.
	 * For instance with ecore, the inheritance must be added between the sliced classes with respect to the source model.
	 */
	private void completeRelations() {
		Set<EClass> keys = clonesClass.keySet();
		EClass stClone;
		EClass clone;
		
		// Adding inheritance relations for each sliced class.
		for(EClass clSrc : keys) {
			clone = clonesClass.get(clSrc);
			// Getting the super classes.
			for(EClass stSrc : clSrc.getESuperTypes()) {
				// If this super class has been sliced, adding the inheritance relation to the clones.
				stClone = clonesClass.get(stSrc);
				if(stClone!=null) {
					clone.getESuperTypes().add(stClone);
				}
			}
		}
	}
	
	
	private void sliceEModelElement(EModelElement emodelelement) {
		if(emodelelement instanceof EClass) {
			sliceEClass((EClass)emodelelement);
		}else if(emodelelement instanceof EReference) {
			sliceEReference((EReference)emodelelement);
		} else if(emodelelement instanceof EAttribute) {
			sliceEAttribute((EAttribute)emodelelement);
		}else if(emodelelement instanceof EOperation) {
			sliceEOperation((EOperation)emodelelement);
		}else if(emodelelement instanceof EParameter) {
			sliceEParameter((EParameter)emodelelement);
		}else if(emodelelement instanceof EPackage) {
			sliceEPackage((EPackage)emodelelement);
		}else if(emodelelement instanceof EEnumLiteral) {
			sliceEEnumLiteral((EEnumLiteral)emodelelement);
		}else if(emodelelement instanceof EDataType){
			sliceEDataType((EDataType)emodelelement);
		}else if(emodelelement instanceof EEnum) {
			sliceEEnum((EEnum)emodelelement);
		}
	}

	
	private void sliceEClassifier(EClassifier eclassifier) {
		if(eclassifier instanceof EClass) {
			sliceEClass((EClass)eclassifier);
		}else if(eclassifier instanceof EDataType){
			sliceEDataType((EDataType)eclassifier);
		}else if(eclassifier instanceof EEnum) {
			sliceEEnum((EEnum)eclassifier);
		}
	}
	
	
	private void sliceEPackage(EPackage epackage) {
		EPackage clone = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage();
		EPackage src = epackage.getESuperPackage();
		
		if(src==null) {
			sliceRoots.add(clone);
		}else {
			EPackage srcClone = (EPackage)clones.get(src);
			if(srcClone==null) {
				sliceEPackage(src);
				srcClone = (EPackage)clones.get(src);
			}
			srcClone.getESubpackages().add(clone);
		}
		
		EcoreCopyHelper.copyEPackage(epackage, clone);
		clones.put(epackage, clone);
	}
	
	
	private void sliceEOperation(EOperation eoperation) {
		EOperation clone = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEOperation();
		EClass src = eoperation.getEContainingClass();
		EClass srcClone = clonesClass.get(src);
		
		if(srcClone==null) {
			sliceEClass(src);
			srcClone = clonesClass.get(src);
		}
		
		srcClone.getEOperations().add(clone);
		EcoreCopyHelper.copyEOperation(eoperation, clone);
		clones.put(eoperation, clone);
	}
	
	
	private void sliceEParameter(EParameter eparameter) {
		EParameter clone = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEParameter();
		EOperation src = eparameter.getEOperation();
		EOperation srcClone = (EOperation)clones.get(src);
		
		if(srcClone==null) {
			sliceEOperation(src);
			srcClone = (EOperation)clones.get(src);
		}
		
		srcClone.getEParameters().add(clone);
		EcoreCopyHelper.copyEParameter(eparameter, clone);
		clones.put(eparameter, clone);
	}
	
	
	private void sliceEDataType(EDataType edatatype) {
		EDataType clone = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEDataType();
		EPackage src = edatatype.getEPackage();
		EPackage srcClone = (EPackage)clones.get(src);
		
		if(srcClone==null) {
			sliceEPackage(src);
			srcClone = (EPackage)clones.get(src);
		}
		
		srcClone.getEClassifiers().add(clone);
		EcoreCopyHelper.copyEDataType(edatatype, clone);
		clones.put(edatatype, clone);
	}
	
	
	private void sliceEEnumLiteral(EEnumLiteral eenumliteral) {
		EEnumLiteral clone = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEEnumLiteral();
		EEnum src = eenumliteral.getEEnum();
		EEnum srcClone = (EEnum)clones.get(src);
		
		if(srcClone==null) {
			sliceEEnum(src);
			srcClone = (EEnum)clones.get(src);
		}
		
		srcClone.getELiterals().add(clone);
		EcoreCopyHelper.copyEEnumLiteral(eenumliteral, clone);
		clones.put(eenumliteral, clone);
	}
	

	private void sliceEEnum(EEnum eenum) {
		EEnum clone = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEEnum();
		EPackage src = eenum.getEPackage();
		EPackage srcClone = (EPackage)clones.get(src);
		
		if(srcClone==null) {
			sliceEPackage(src);
			srcClone = (EPackage)clones.get(src);
		}
		
		srcClone.getEClassifiers().add(clone);
		EcoreCopyHelper.copyEEnum(eenum, clone);
		clones.put(eenum, clone);
	}
	
	
	private void sliceEAttribute(EAttribute eattribute) {
		EAttribute clone = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
		EClass src = eattribute.getEContainingClass();
		EClassifier tgt = eattribute.getEType();
		EClass srcClone = clonesClass.get(src);
		EClassifier tgtClone = (EClassifier)clones.get(tgt);

		if(srcClone==null) {
			sliceEClass(src);
			srcClone = clonesClass.get(src);
		}
		
		if(tgtClone==null) {
			sliceEClassifier(tgt);
			tgtClone = (EClassifier) clones.get(tgt);
		}
		
		srcClone.getEStructuralFeatures().add(clone);
		clone.setEType(tgtClone);
		EcoreCopyHelper.copyEAttribute(eattribute, clone);
		clones.put(eattribute, clone);
	}


	private void sliceEClass(EClass eclass) {
		EClass clone = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
		EPackage src = eclass.getEPackage();
		EPackage srcClone = (EPackage)clones.get(src);
		Set<EClass> subs = subTypes.get(eclass);
		
		if(srcClone==null) {
			sliceEPackage(src);
			srcClone = (EPackage)clones.get(src);
		}
		
		srcClone.getEClassifiers().add(clone);
		EcoreCopyHelper.copyEClass(eclass, clone);
		clones.put(eclass, clone);
		clonesClass.put(eclass, clone);
		
		if(subs!=null) {
			for(EClass sub : subs) {
				sliceEClass(sub);
			}
		}
	}

	
	private void sliceEReference(EReference ereference) {
		EReference clone = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEReference();
		EClass src = ereference.getEContainingClass();
		EClass tgt = ereference.getEReferenceType();
		EClass srcClone = clonesClass.get(src);
		EClass tgtClone = clonesClass.get(tgt);

		if(srcClone==null) {
			sliceEClass(src);
			srcClone = clonesClass.get(src);
		}
		
		if(tgtClone==null) {
			sliceEClass(tgt);
			tgtClone = clonesClass.get(tgt);
		}
		
		srcClone.getEStructuralFeatures().add(clone);
		clone.setEType(tgtClone);
		EcoreCopyHelper.copyEReference(ereference, clone);
		clones.put(ereference, clone);
	}



	private void save() {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource res = resSet.createResource(URI.createURI("modelSlice.ecore"));
		res.getContents().addAll(sliceRoots);
		try{
			res.save(Collections.emptyMap());
		}catch(IOException ex) { ex.printStackTrace(); }
	    res.unload();
	}
}
