package org.kermeta.kompren.diagram.view.impl;

import java.awt.Rectangle;

import org.kermeta.kompren.diagram.view.interfaces.IPaintCtx;

public class PaintCtx implements IPaintCtx {
	protected Rectangle visibleScene;

	protected double zoom;
	
	
	@Override
	public Rectangle getVisibleScene() {
		return visibleScene;
	}

	@Override
	public double getZoomLevel() {
		return zoom;
	}

	
	@Override
	public void setVisibleScene(Rectangle visibleScene) {
		this.visibleScene = visibleScene;
	}

	@Override
	public void setZoom(double zoom) {
		this.zoom = zoom;
	}
}
