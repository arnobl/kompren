package fr.inria.diverse.kompren.explen.model;

import org.eclipse.emf.ecore.EPackage;
import org.malai.presentation.AbstractPresentation;

public class Model implements AbstractPresentation {
	protected EPackage model;


	public Model() {
		super();
	}


	@Override
	public void setModified(final boolean modified) {
		// Nothing to do.
	}


	@Override
	public boolean isModified() {
		return false;
	}

	@Override
	public void reinit() {
		model = null;
	}


	public EPackage getModel() {
		return model;
	}


	public void setModel(final EPackage model) {
		this.model = model;
	}
}
