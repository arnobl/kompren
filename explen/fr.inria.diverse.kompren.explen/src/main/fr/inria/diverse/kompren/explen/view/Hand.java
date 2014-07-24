package fr.inria.diverse.kompren.explen.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IHandler;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.malai.picking.Pickable;

public class Hand implements MouseListener, MouseMotionListener {
	protected MetamodelView diagram;

	protected IHandler draggedHandler;

	protected FloatingText draggedRole;

	protected double startX;

	protected double startY;

	protected List<IRelationView> visibleHandlers;



	public Hand(final MetamodelView diagram) {
		super();

		visibleHandlers = new ArrayList<>();
		this.diagram 	= diagram;
		reinit();
	}


	protected void reinit() {
		draggedHandler 	= null;
		draggedRole 	= null;
		startX 			= 0.;
		startY 			= 0.;
	}




	@Override
	public void mouseClicked(final MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON2) {
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			IHandler handler = null;
			IRelationView rel = null;

			for(int i=0, nbRel = diagram.getNbRelations(); i<nbRel && handler==null; i++) {
				rel = diagram.getRelationAt(i);

				if(rel.isVisible() && rel.isHandlersVisible())
					handler = rel.getHandlersAt(px, py);
			}

			if(handler!=null && rel!=null && rel.getNbSegment()>1) {
				boolean ok = rel.removePoint(handler.getPoint());

				if(ok)
					diagram.refresh();
			}
		}
	}

	@Override
	public void mouseEntered(final MouseEvent e) {
		diagram.requestFocusInWindow();
	}

	@Override
	public void mouseExited(final MouseEvent e) {
		//
	}


	@Override
	public void mousePressed(final MouseEvent e) {
		if(diagram.getZoom()<0.5) return;
		if(e.getButton()==MouseEvent.BUTTON1) {
			final int nbRel = diagram.getNbRelations();
			int i;
			final double px = e.getX()/diagram.getZoom();
			final double py = e.getY()/diagram.getZoom();
			IRelationView rel;
			Pickable pickable;

			for(i=0; i<nbRel && draggedHandler==null; i++) {
				rel = diagram.getRelationAt(i);

				if(rel.isVisible() && !rel.isOptimHidden() && rel.isHandlersVisible())
					draggedHandler = rel.getHandlersAt(px, py);
			}

			if(diagram.getSelection().isEmpty() && draggedHandler==null) {
				for(i=0; i<nbRel && draggedHandler==null; i++) {
					rel = diagram.getRelationAt(i);

					if(rel.isVisible() && !rel.isOptimHidden() && rel.contains(px, py)) {
						pickable = rel.getPickableAt(px, py);

						if(pickable instanceof RoleView)
							draggedRole = ((RoleView)pickable).getFloatingTextAt(px, py);
						else {
							rel.addPoint(new Point2D.Double(px, py));
							rel.setHandlersVisible(true);
							draggedHandler = rel.getHandlersAt(px, py);
							diagram.refresh();
						}
					}
				}
			}

			startX = px;
			startY = py;
		}
	}


	@Override
	public void mouseReleased(final MouseEvent e) {
		reinit();
	}


	@Override
	public void mouseDragged(final MouseEvent e) {
		final double zoom = diagram.getZoom();
		if(zoom<0.5) return;
		final double gapX = e.getX()/zoom - startX;
		final double gapY = e.getY()/zoom - startY;

		if(draggedRole!=null) {
			draggedRole.translate(gapX, gapY);
			diagram.refresh();
		}else
		if(draggedHandler!=null) {
			draggedHandler.translate(gapX, gapY);

			if(draggedHandler.getPicker() instanceof IRelationView) {
				final IRelationView rel = (IRelationView) draggedHandler.getPicker();
				IEntityView entity;

				if(rel.getHandlers(-1)==draggedHandler)
					entity = rel.getEntityTar();
				else if(rel.getHandlers(0)==draggedHandler)
					entity = rel.getEntitySrc();
				else
					entity = null;

				if(entity!=null) {
					Point2D pt = entity.getClosestPoint(new Point2D.Double(e.getX()/zoom, e.getY()/zoom));

					if(pt!=null)
						draggedHandler.getPoint().setLocation(pt);
				}
			}

			diagram.updatePreferredSize();
			diagram.refresh();
		} 

		startX = e.getX()/zoom;
		startY = e.getY()/zoom;
	}


	@Override
	public void mouseMoved(final MouseEvent e) {
		diagram.setToolTipText(null);
		final double zoom = diagram.getZoom();
		if(zoom<0.5) return;
		final double x = e.getX()/zoom;
		final double y = e.getY()/zoom;
		boolean mustRefresh = !visibleHandlers.isEmpty();
		IRelationView relation=null;

		for(final IRelationView rel : visibleHandlers)
			rel.setHandlersVisible(false);

		visibleHandlers.clear();

		for(int i=0, size=diagram.getNbRelations(); i<size  && relation==null; i++) {
			relation = diagram.getRelationAt(i);

			if(!relation.isOptimHidden() && relation.isVisible() && relation.contains(x, y)) {
				relation.setHandlersVisible(true);
				visibleHandlers.add(diagram.getRelationAt(i));
				mustRefresh = true;
			}else relation = null;
		}
		
		Pickable pickable = relation==null?null:relation.getPickableAt(e.getX(), e.getY());
		if(relation!=null && !(pickable instanceof RoleView) && !(pickable instanceof IHandler)) {
			ClassView c1 = null;
			ClassView c2 = null;
			RoleView role1 = null;
			RoleView role2 = null;
			String txt = "<html>";
			
			c1 = (ClassView) relation.getEntitySrc();
			if(relation instanceof RelationClassView)
				role1 = ((RelationClassView)relation).getRoleTar();
			c2 = (ClassView) relation.getEntityTar();
			if(relation instanceof RelationClassView)
				role2 = ((RelationClassView)relation).getRoleSrc();
			
			if(relation instanceof InheritanceView) {
				txt +="<b>Inheritance</b><br>";
				txt += "<b>" + getHTMLClassName(c1) + "</b> -> ";
				txt += "<b>" + getHTMLClassName(c2) + "</b>";
			}else if(relation instanceof RelationClassView) {
				RelationClassView rcv = (RelationClassView) relation;
				txt +="<b>Reference</b><br>";
				txt += "<b>" + getHTMLClassName(c1) + "</b>";
				if(role1!=null)
					txt += ".<b>"+role1.getName()+"["+role1.getCardText()+"]</b>";
				txt +="<br>";
				if(rcv.getSourceDecoration() instanceof CompositionDecorationView)
					txt += "&diams;";
				else if(rcv.getSourceDecoration() instanceof RelationDecorationView)
					txt += "&lt;";
				txt += "-";
				if(rcv.getTargetDecoration() instanceof CompositionDecorationView)
					txt += "&diams;";
				else if(rcv.getTargetDecoration() instanceof RelationDecorationView)
					txt += "&gt;";
				txt += "<br><b>" + getHTMLClassName(c2) + "</b>";
				if(role2!=null)
					txt += ".<b>"+role2.getName()+"["+role2.getCardText()+"]</b>";
			}
			
			txt += "</html>";
			diagram.setToolTipText(txt);
		}
		
		if(mustRefresh)
			diagram.refresh();
	}
	
	
	private String getHTMLClassName(ClassView c) {
		String txt = "";
		String qn = c.getQname();
		if(c.isAbstract)
			txt +="<i>";
		txt += "<a href=\""+qn+"\">"+qn+"</a>";
		if(c.isAbstract)
			txt +="</i>";
		return txt;
	}
}
