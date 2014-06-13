package fr.inria.diverse.kompren.explen.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.kompren.diagram.view.impl.Line;
import org.kermeta.kompren.diagram.view.impl.Number;
import org.kermeta.kompren.diagram.view.impl.RelationView;
import org.kermeta.kompren.diagram.view.interfaces.IHandler;
import org.kermeta.kompren.diagram.view.interfaces.IPaintCtx;
import org.kermeta.kompren.diagram.view.interfaces.ISegmentView;
import org.malai.picking.Pickable;

import fr.inria.diverse.kompren.explen.view.RoleView.Cardinality;

/**
 * Defines a relation established between two classes.
 * @author Arnaud Blouin
 */
public class RelationClassView extends RelationView<ClassView, ClassView> {
	/** The role of the beginning of the relation. */
	protected RoleView roleSrc;

	/** The role of the beginning of the relation. */
	protected RoleView roleTar;

	protected boolean isComposition;
	
	protected Font font;


	/**
	 * @see RelationView
	 */
	public RelationClassView(final ClassView src, final ClassView target, final boolean isComposition, final boolean compositionAtStart,
							final String srcRole, final String targetRole, final Cardinality srcCard, final Cardinality targetCard) {
		super(src, target);
		if(src.getName().equals("Component") || target.getName().equals("Component"))
		this.isComposition = isComposition;

		if(isComposition)
			if(compositionAtStart)
				setSourceDecoration(new CompositionDecorationView(this, getFirstSegment(), true));
			else
				setTargetDecoration(new CompositionDecorationView(this, getLastSegment(), false));

		if(targetRole==null || srcRole==null || targetRole.length()==0 || srcRole.length()==0)
			setTargetDecoration(new RelationDecorationView(this, getLastSegment(), false));

		if(srcRole!=null && srcRole.length()>0 && srcCard!=null)
			roleSrc = new RoleView(srcRole, srcCard, this, false, isComposition && !compositionAtStart);

		if(targetRole!=null && targetRole.length()>0 && targetCard!=null)
			roleTar = new RoleView(targetRole, targetCard, this, true, isComposition && compositionAtStart);
		
		font = src.getFont();
	}
	
	
	
	@Override
	protected void getRecursiveRelationPoints(final Point2D pt1, final Point2D pt2) {//FIXME only works with rectangle entities. Code clean-up.
		final Rectangle2D rec  = entitySrc.getBorders();
		final double heightArrow = rec.getHeight()>20. ? 15. : rec.getHeight()/2. - 2.;
		
		final Line l1 = new Line(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()-heightArrow),
							new Point2D.Double(entitySrc.getX(), entitySrc.getY()-heightArrow));
		final Line l2 = new Line(new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()+heightArrow),
							new Point2D.Double(entitySrc.getX(), entitySrc.getY()+heightArrow));

		pt1.setLocation(l1.intersectionPoint(entitySrc.getPath(), new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()-heightArrow)));
		pt2.setLocation(l2.intersectionPoint(entitySrc.getPath(), new Point2D.Double(entitySrc.getX()-300, entitySrc.getY()+heightArrow)));
	}

	
	
	@Override
	public void update() {
		if(entitySrc==entityTar) {
			ISegmentView seg;
			Point2D centre = entitySrc.getCentre();
			Point2D newPt;
			Point2D tmp;
			
			for(int i=0, size=segments.size()-1; i<size; i++) {
				seg = segments.get(i);
				if(entitySrc.getBoundPath().contains(seg.getPointTarget())) {
					tmp = new Point2D.Double((centre.getX()+seg.getPointSource().getX())/2., (centre.getY()+seg.getPointSource().getY())/2.);
					newPt = Number.NUMBER.rotatePoint(centre, seg.getPointSource(), Math.PI);
					newPt.setLocation((newPt.getX()+tmp.getX())/2., (newPt.getY()+tmp.getY())/2.);
					seg.getPointTarget().setLocation(newPt);
				}
			}
		}
		super.update();
	}
	
	

	public boolean equalsValue(final RelationClassView rcv) {
		if(rcv==null) return false;

		boolean eq;

		if(roleSrc==null)
			eq = rcv.getRoleSrc()==null;
		else
			eq = roleSrc.equalsValue(rcv.getRoleSrc());

		if(eq)
			if(roleTar==null)
				eq = rcv.getRoleTar()==null;
			else
				eq = roleTar.equalsValue(rcv.getRoleTar());

		return eq;
	}


	@Override
	public Rectangle2D getBorders() {
		Rectangle2D rec = super.getBorders();

		rec = getBordersWithRole(rec, roleSrc);
		rec = getBordersWithRole(rec, roleTar);

		return rec;
	}


	private static Rectangle2D getBordersWithRole(final Rectangle2D sourceBorder, final RoleView role) {
		Rectangle2D rec = sourceBorder;

		if(role!=null) {
			Rectangle2D roleBorder = role.getBorders();

			if(roleBorder!=null)
				rec = rec.createUnion(roleBorder);
		}

		return rec;
	}



	@Override
	public boolean contains(final double x, final double y) {
		boolean contains = super.contains(x, y);

		if(!contains) {
			if(roleSrc!=null)
				contains = roleSrc.contains(x, y);
			if(!contains && roleTar!=null)
				contains = roleTar.contains(x, y);
			if(!contains)
				contains = isOnHandler(x, y);
		}

		return contains;
	}
	
	
	public boolean isOnHandler(final double x, final double y) {
		for(IHandler hand : handlers)
			if(hand.contains(x, y))
				return true;
		return false;
	}


	@Override
	public Pickable getPickableAt(final double x, final double y) {
		Pickable pickable = super.getPickableAt(x, y);

		if(pickable==null)
			if(roleSrc!=null && roleSrc.contains(x, y))
				pickable = roleSrc;
			else
				if(roleTar!=null && roleTar.contains(x, y))
					pickable = roleTar;

		return pickable;
	}
	
	
	@Override
	public void setHandlersVisible(final boolean visible) {
		super.setHandlersVisible(visible);
		if(visible)
			font = new Font(font.getName(), font.getStyle()+Font.BOLD, font.getSize()+5);
		else
			font = entitySrc.getFont();
	}


	@Override
	public void paint(final Graphics2D g, final IPaintCtx paintCtx) {
		super.paint(g, paintCtx);

		if(!isOptimHidden) {
			Color formerCol = g.getColor();
			Font formerFont = g.getFont();
			
			g.setColor(getLineColor());
			g.setFont(font);
	
			if(roleSrc!=null && paintCtx.getZoomLevel()>=0.55)
				roleSrc.paint(g, paintCtx);
	
			if(roleTar!=null && paintCtx.getZoomLevel()>=0.55)
				roleTar.paint(g, paintCtx);
			
			g.setColor(formerCol);
			g.setFont(formerFont);
		}
	}


	public RoleView getRoleSrc() {
		return roleSrc;
	}


	public RoleView getRoleTar() {
		return roleTar;
	}


	public void reinitRoles() {
		if(roleSrc!=null)
			roleSrc.reinitTextPositions();

		if(roleTar!=null)
			roleTar.reinitTextPositions();
	}


	public boolean isComposition() {
		return isComposition;
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
