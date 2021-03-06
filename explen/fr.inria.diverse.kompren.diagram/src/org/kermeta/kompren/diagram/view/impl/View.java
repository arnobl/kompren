package org.kermeta.kompren.diagram.view.impl;

import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

import org.kermeta.kompren.diagram.view.interfaces.IView;

public abstract class View implements IView {
	/** The path of the component. */
	protected GeneralPath path;

	protected Rectangle2D bound;


	public View() {
		super();

		bound = new Rectangle2D.Double();
		path = new GeneralPath();
	}


	@Override
	public GeneralPath getPath() {
		return path;
	}


	@Override
	public GeneralPath getBoundPath() {
		return path;
	}
}
