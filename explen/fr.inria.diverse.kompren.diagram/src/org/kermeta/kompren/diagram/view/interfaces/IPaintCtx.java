package org.kermeta.kompren.diagram.view.interfaces;

import java.awt.Rectangle;

public interface IPaintCtx {
	Rectangle getVisibleScene();
	
	double getZoomLevel();
	
	void setVisibleScene(Rectangle visibleScene);
	
	void setZoom(double zoom);
}
