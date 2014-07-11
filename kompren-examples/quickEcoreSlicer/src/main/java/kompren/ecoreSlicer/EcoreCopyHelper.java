package kompren.ecoreSlicer;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;

public class EcoreCopyHelper {
//	public static Set<EClass> getAllModelEClass(List<EPackage> pkgs) {
//		
//	}
	
	public static void copyEParameter(EParameter model, EParameter tgt) {
		copyETypedElement(model, tgt);
	}
	
	public static void copyEDataType(EDataType model, EDataType tgt) {
		copyEClassifier(model, tgt);
		tgt.setSerializable(model.isSerializable());
	}
	
	public static void copyEPackage(EPackage model, EPackage tgt) {
		copyENamedElement(model, tgt);
		tgt.setNsPrefix(model.getNsPrefix());
		tgt.setNsURI(model.getNsURI());
	}
	
	public static void copyEOperation(EOperation model, EOperation tgt) {
		copyETypedElement(model, tgt);
	}
	
	public static void copyEEnumLiteral(EEnumLiteral model, EEnumLiteral tgt) {
		copyENamedElement(model, tgt);
		tgt.setValue(model.getValue());
	}
	
	public static void copyEEnum(EEnum model, EEnum tgt) {
		copyEClassifier(model, tgt);
	}
	
	public static void copyEAttribute(EAttribute model, EAttribute tgt) {
		copyEStructuralFeature(model, tgt);
	}

	public static void copyEClassifier(EClassifier model, EClassifier tgt) {
		copyENamedElement(model, tgt);
		tgt.setInstanceClassName(model.getInstanceClassName());
		tgt.setInstanceTypeName(model.getInstanceTypeName());
	}
	
	public static void copyEClass(EClass model, EClass tgt) {
		copyEClassifier(model, tgt);
		tgt.setAbstract(model.isAbstract());
		tgt.setInterface(model.isInterface());
	}
	
	public static void copyENamedElement(ENamedElement model, ENamedElement tgt) {
		tgt.setName(model.getName());
	}
	
	public static void copyETypedElement(ETypedElement model, ETypedElement tgt) {
		copyENamedElement(model, tgt);
		tgt.setLowerBound(model.getLowerBound());
		tgt.setUpperBound(model.getUpperBound());
		tgt.setOrdered(model.isOrdered());
		tgt.setUnique(model.isUnique());
	}
	
	public static void copyEStructuralFeature(EStructuralFeature model, EStructuralFeature tgt) {
		copyETypedElement(model, tgt);
		tgt.setChangeable(model.isChangeable());
		tgt.setDefaultValueLiteral(model.getDefaultValueLiteral());
		tgt.setDerived(model.isDerived());
		tgt.setTransient(model.isTransient());
		tgt.setUnsettable(model.isUnsettable());
		tgt.setVolatile(model.isVolatile());
	}
	
	public static void copyEReference(EReference model, EReference tgt) {
		copyEStructuralFeature(model, tgt);
		tgt.setContainment(model.isContainment());
		tgt.setResolveProxies(model.isResolveProxies());
	}
}
