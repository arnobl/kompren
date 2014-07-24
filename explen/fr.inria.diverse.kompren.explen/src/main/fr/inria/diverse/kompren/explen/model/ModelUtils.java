package fr.inria.diverse.kompren.explen.model;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;

public final class ModelUtils {
	public static final ModelUtils INSTANCE = new ModelUtils();

	private ModelUtils() {
		super();
	}


	public String getCardinalityString(final ETypedElement prop) {
		final int upper = prop.getUpperBound();
		final int lower = prop.getLowerBound();

		if(upper==lower)
			return upper==-1 ? "*" : String.valueOf(upper);
		return String.valueOf(lower) + ".." + (upper==-1 ? "*" : String.valueOf(upper));
	}


	public boolean isKermetaPrimitiveType(final String name) {
		return name.equals("String") || name.equals("Boolean") || name.equals("Real") || name.equals("Integer")
				|| name.equals("Float") || name.equals("Object") || name.equals("Bag");
	}


	public String getTypeName(final ETypedElement te) {
		if(te != null) return te.getName();
		return "";
	}


	public String getQualifiedName(final EClassifier cd) {
		String qname = cd.getName();

		if(cd.getEPackage()!=null)
			qname = getQualifiedName(cd.getEPackage()) + "." + qname;

		return qname;
	}


	public String getQualifiedName(final EPackage pkg) {
		String qname = pkg.getName();

		if(pkg.getESuperPackage()!=null)
			qname = getQualifiedName(pkg.getESuperPackage()) + "." + qname;

		return qname;
	}
}
