package org.kermeta.kompren.diagram.view.impl;

import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.kompren.diagram.view.interfaces.IAnchor;

public abstract class RectangleEntityView extends EntityView {
	/** The min gap between two side by side anchors. */
	public static final int GAP_MIN_ANCHOR = 35;
	
	
	public RectangleEntityView(final String name) {
		super(name);
	}


	@Override
	public GeneralPath getBoundPath() {
		return getPath();
	}


	@Override
	public boolean contains(final double x, final double y) {
		return isVisible() && getBorders().contains(x, y);
	}


	@Override
	protected void initAnchors() {
		final Rectangle2D rec = getBorders();

		anchors.add(new Anchor(rec.getMinX(), rec.getMinY(), this));
		anchors.add(new Anchor(rec.getCenterX(), rec.getMinY(), this));
		anchors.add(new Anchor(rec.getMaxX(), rec.getMinY(), this));
		anchors.add(new Anchor(rec.getMaxX(), rec.getCenterY(), this));
		anchors.add(new Anchor(rec.getMaxX(), rec.getMaxY(), this));
		anchors.add(new Anchor(rec.getCenterX(), rec.getMaxY(), this));
		anchors.add(new Anchor(rec.getMinX(), rec.getMaxY(), this));
		anchors.add(new Anchor(rec.getMinX(), rec.getCenterY(), this));
	}



	@Override
	protected IAnchor createMiddleAnchor(final IAnchor firstAnchor, final IAnchor secondAnchor) {
		if(firstAnchor==null || secondAnchor==null)
			return null;

		IAnchor anchor;
		final Point2D pos1 = firstAnchor.getPosition();
		final Point2D pos2 = secondAnchor.getPosition();
		double value;
		double diff;
		
		if(Number.NUMBER.equals(pos1.getY(), pos2.getY())) {
			value = (pos1.getX()+pos2.getX())/2.;
			anchor = new Anchor(value, pos1.getY(), this);
			diff = Math.abs(value-pos1.getX());
			
			if(diff<GAP_MIN_ANCHOR) {
				double dec = GAP_MIN_ANCHOR-diff;
				for(IAnchor anc : anchors)
					if(anc.getPosition().getX()<value)
						 anc.translate(-dec, 0.);
					else anc.translate(dec, 0.);
			}
		}
		else {
			value = (pos1.getY()+pos2.getY())/2.;
			anchor = new Anchor(pos1.getX(), value, this);
			diff = Math.abs(value-pos1.getY());
			
			if(diff<GAP_MIN_ANCHOR) {
				double dec = GAP_MIN_ANCHOR-diff;
				for(IAnchor anc : anchors)
					if(anc.getPosition().getY()<value)
						 anc.translate(0., -dec);
					else anc.translate(0., dec);
			}
		}

		// Inserting the new anchor.
		int index = anchors.indexOf(firstAnchor);

		if(index==anchors.size()-1)
			anchors.add(anchor);
		else
			anchors.add(index+1, anchor);

		return anchor;
	}
}
