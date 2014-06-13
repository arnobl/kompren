package fr.inria.diverse.kompren.explen.view;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JToolTip;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.kermeta.kompren.diagram.view.impl.ModelView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

import fr.inria.diverse.kompren.explen.ui.ClickableToolTip;
import fr.inria.diverse.kompren.explen.view.RoleView.Cardinality;

public class MetamodelView extends ModelView {
	private static final long serialVersionUID = 1L;

	protected boolean operationsVisible;

	protected boolean propertiesVisible;


	public MetamodelView(final boolean withScrollPane) {
		super(withScrollPane);

		operationsVisible = false;
		propertiesVisible = true;
		FooHand foo = new FooHand(this);
		addMouseListener(foo);
		addMouseMotionListener(foo);
		
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(final KeyEvent evt) {
				if(evt.getKeyChar()=='!') {
				    DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
		    	    Document document = domImpl.createDocument("http://www.w3.org/2000/svg", "svg", null);
		    	    SVGGraphics2D svgGenerator = new SVGGraphics2D(document);
		    	    MetamodelView.this.paint(svgGenerator);
		    	    try{
			    	    FileWriter fw = new FileWriter(new File(System.getProperty("user.home")+FileSystems.getDefault().getSeparator()+"picture.svg"));
			    	    svgGenerator.stream(fw, false);
		    	    }catch(Exception ex){
		    	    	ex.printStackTrace();
		    	    }
				}
			}
			
			@Override public void keyReleased(KeyEvent arg0) { }
			@Override public void keyPressed(KeyEvent arg0) { }
		});
	}
	
	

	@Override
	public JToolTip createToolTip() {
		JToolTip tip = new ClickableToolTip(this);
		tip.setComponent(this);
		return tip;
	}

	// Set tooltip location
	@Override
	public Point getToolTipLocation(MouseEvent event) {
		if(getToolTipText()!=null && getToolTipText().length()>0)
			return new Point(event.getX(), event.getY());
		return null;
	}

	@Override
	public List<IEntityView> getRootEntities() {
		List<IEntityView> roots = new ArrayList<>();
		boolean again;
		int i;
		final int size = relations.size();
		IRelationView relation;

		for(IEntityView entityView : entities)
			if(entityView.isVisible()) {
				i = 0;
				again = true;

				while(again && i<size) {
					relation = relations.get(i);

					if(relation instanceof InheritanceView && relation.getEntitySrc()==entityView && relation.getEntityTar().isVisible())
						again = false;

					i++;
				}

				if(again && !roots.contains(entityView))
					roots.add(entityView);
			}

		return roots;
	}


	public void setPropertiesVisible(final boolean visible) {
		propertiesVisible = visible;

		for(final IEntityView entity : entities)
			if(entity instanceof ClassView)
				((ClassView)entity).setPropertiesVisible(visible);
	}


	public void setOperationsVisible(final boolean visible) {
		operationsVisible = visible;

		for(final IEntityView entity : entities)
			if(entity instanceof ClassView)
				((ClassView)entity).setOperationsVisible(visible);
	}



	public InheritanceView removeInheritanceView(final IEntityView src, final IEntityView tar) {
		InheritanceView view = null;
		boolean again	= true;
		final int size	= relations.size();
		int i			= 0;
		IRelationView link;

		while(again && i<size) {
			link = relations.get(i);

			if(link instanceof InheritanceView) {
				view = (InheritanceView) link;

				if(view.getEntitySrc()==src && view.getEntityTar()==tar) {
					relations.remove(link);
					again = false;
				}
			}

			i++;
		}

		return again ? null : view;
	}


	public InheritanceView addInheritanceView(final ClassView src, final ClassView tar) {
		final InheritanceView view = new InheritanceView(src, tar);
		addRelation(view);
		return view;
	}


	public IRelationView getOppositeRelation(final ClassView srcClass, final ClassView tarClass,
						final String srcRole, final String targetRole, final String srcCard) {
		IRelationView oppositeRel = null;
		
		if(targetRole!=null) {
			//checking if the target relation has been already added by its opposite.
			int i 			= 0;
			final int size 	= relations.size();
			IRelationView link;
			
			RoleView role;

			while(oppositeRel==null && i<size) {
				link = relations.get(i);

				if(link.getEntitySrc()==tarClass && link.getEntityTar()==srcClass && link instanceof RelationClassView) {
					role = ((RelationClassView)link).getRoleTar();

					if(role!=null && role.name.text.equals(srcRole) && role.cardText.text.equals(srcCard))
						oppositeRel = link;
				}
				i++;
			}
		}
		
		return oppositeRel;
	}


	public IRelationView addRelation(final ClassView srcClass, final ClassView tarClass, final boolean isComposition, final boolean isCompoAtSrc,
						final String srcRole, final String targetRole, final String srcCard, final String targetCard) {
		if(getOppositeRelation(srcClass, tarClass, srcRole, targetRole, srcCard)!=null)
			return null;

		final IRelationView view = new RelationClassView(srcClass, tarClass, isComposition, isCompoAtSrc, srcRole, targetRole,
														 Cardinality.getCardinality(srcCard), Cardinality.getCardinality(targetCard));
		addRelation(view);
		return view;
	}


	public boolean isOperationsVisible() {
		return operationsVisible;
	}


	public boolean isPropertiesVisible() {
		return propertiesVisible;
	}
}
