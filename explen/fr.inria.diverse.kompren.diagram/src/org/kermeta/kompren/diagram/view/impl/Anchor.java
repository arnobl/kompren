package org.kermeta.kompren.diagram.view.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.interfaces.IAnchor;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;

public class Anchor implements IAnchor {

	protected Point2D position;

	protected IEntityView entity;

	protected IRelationView relation;


	public Anchor(final double x, final double y, IEntityView entity) {
		super();

		relation = null;
		this.entity = entity;
		position = new Point2D.Double(x, y);
	}



	@Override
	public void paint(final Graphics2D g) {
		final double width = 6.;
		
		g.setColor(Color.RED);
		g.drawOval((int)(position.getX()-width/2.), (int)(position.getY()-width/2.), (int)width, (int)width);
		g.fillOval((int)(position.getX()-width/2.), (int)(position.getY()-width/2.), (int)width, (int)width);
	}


	@Override
	public boolean isFree() {
		return relation==null;
	}


	@Override
	public void setRelation(final IRelationView rel, final boolean atEnd) {
		relation = rel;
		
		// The anchor position must not be linked to a segment anymore.
		if(isFree())
			this.position = new Point2D.Double(position.getX(), position.getY());
		else {
			Point2D pt = atEnd ? relation.getLastSegment().getPointTarget() : relation.getFirstSegment().getPointSource();
			pt.setLocation(position);
			setPosition(pt);
		}
	}


	@Override
	public Point2D getPosition() {
		return position;
	}


	@Override
	public void translate(final double tx, final double ty) {
		position.setLocation(position.getX()+tx, position.getY()+ty);
	}



	@Override
	public void setPosition(final Point2D position) {
		if(position!=null)
			this.position = position;
	}


	@Override
	public String toString() {
		return getClass().getCanonicalName() + '[' + position + ",free=" + isFree() + ']';
	}



	@Override
	public IRelationView getRelation() {
		return relation;
	}
}
