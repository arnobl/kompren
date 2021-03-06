package fr.inria.diverse.kompren.explen.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.impl.Number;
import org.kermeta.kompren.diagram.view.impl.RectangleEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IAnchor;
import org.kermeta.kompren.diagram.view.interfaces.IPaintCtx;
import org.malai.picking.Picker;

/**
 * Defines an entity that corresponds to a class of a class diagram.
 * @author Arnaud Blouin
 */
public class ClassView extends RectangleEntityView {
	/** The gap is used to add spaces add the left and the right of the class. */
	public static final double WIDTH_GAP = 2.;

	/** The gap is used to add spaces between the title and the top line, the last operation and the bottom line, etc. */
	public static final double HEIGHT_GAP = 4.;

	/** Used to add spaces around the name of the class. */
	public static final double HEIGHT_HEADER_GAP = 10.;

	private static final Stroke BASIC_STROKE = new BasicStroke(1f);

	/** The views of the attributes of the class. */
	protected List<AttributeView> attributes;

	/** The views of the operations of the class. */
	protected List<OperationView> operations;

//	protected List<RelationClassView> relations;
	
	private List<ClassView> subClasses;

	/** Defines if the attributes must be visible or not. */
	protected boolean propertiesVisible;

	/** Defines if the operations must be visible or not. */
	protected boolean operationsVisible;

	protected GeneralPath boundPath;

	protected boolean selected;

	protected Color textColor;
	
	protected String qname;
	
	protected MetamodelView mmView;
	
	protected boolean isAbstract;



	/**
	 * Initialises a class.
	 * @param name The name of the class.
	 * @param qname The qualified name of the class.
	 * @throws IllegalArgumentException If the given name is null.
	 */
	public ClassView(final String name, final String qname, final boolean isAbstract, final MetamodelView mmView) {
		super(name);

		this.qname			= qname;
		this.mmView			= mmView;
		boundPath			= new GeneralPath();
		operationsVisible 	= true;
		propertiesVisible	= true;
		selected			= false;
		this.isAbstract		= isAbstract;
		attributes	   		= new ArrayList<>();
		operations	   		= new ArrayList<>();
//		relations			= new ArrayList<>();
		bound				= new Rectangle();
		subClasses			= new ArrayList<>();
		setSelected(false);
		update();
		initAnchors();
	}

	
	public String getQname() {
		return qname;
	}
	

//	@Override
//	public void anchorRelation(final IRelationView relation, final IEntityView opposite, final boolean atEnd) {
//		super.anchorRelation(relation, opposite, atEnd);
//
//		if(relation instanceof RelationClassView) {
//			((RelationClassView)relation).reinitRoles();
//			if(!atEnd)
//				relations.add((RelationClassView)relation);
//		}else
//			if(relation instanceof InheritanceView && !atEnd) {
//				InheritanceView inh = (InheritanceView)relation;
//				if(!inh.getEntityTar().subClasses.contains(this))
//					inh.getEntityTar().subClasses.add(this);
//			}
//	}

	
	public List<ClassView> getLowerTypes() {
		return subClasses;
	}
	

	/**
	 * Adds an attribute to the class.
	 * @param attrName The name of the attribute.
	 * @param attrTypeName The name of the type of the attribute.
	 * @return The created view of the attribute or null if the given parameters are null or empty.
	 */
	public AttributeView addAttribute(final String attrName, final String attrTypeName) {
		final AttributeView attr;

		if(attrName==null || attrTypeName==null || attrName.length()==0 || attrTypeName.length()==0)
			attr = null;
		else {
			attr = new AttributeView(attrName, attrTypeName, this);
			attributes.add(attr);
		}

		return attr;
	}


	/**
	 * Removes an attribute from the class.
	 * @param attr The attribute to remove.
	 */
	public void removeAttribute(final AttributeView attr) {
		if(attr!=null && attributes.remove(attr))
			update();
	}


	/**
	 * Adds an operation to the class.
	 * @param opName The name of the operation.
	 * @param opTypeName The name of the type of the operation.
	 * @param isAbs True: the operation is abstract.
	 * @return The created view of the operation or null if the given name is null or empty.
	 */
	public OperationView addOperation(final String opName, final String opTypeName, final boolean isAbs) {
		final OperationView op;

		if(opName==null || opName.length()==0)
			op = null;
		else {
			op = new OperationView(opName, opTypeName, isAbs, this);
			operations.add(op);
		}

		return op;
	}



	/**
	 * Removes an operation from the class.
	 * @param op The operation to remove.
	 */
	public void removeOperation(final OperationView op) {
		if(operations.remove(op))
			update();
	}

	
	public Double[] updateBoundingBox() {
		final Rectangle2D titleBounds = getTitleBounds(1);
		Double[] dim = new Double[2];
		double width;

		dim[1] = titleBounds.getHeight() + HEIGHT_HEADER_GAP*2.;
		dim[0]  = titleBounds.getWidth() + 2.*WIDTH_GAP;

		if(propertiesVisible)
			for(AttributeView attr : attributes) {
				width = attr.getWidth();

				if(dim[0]<width+WIDTH_GAP*2.)
					dim[0] = 2.*WIDTH_GAP+width;

				dim[1] += attr.getHeight()+HEIGHT_GAP;
			}

		if(operationsVisible)
			for(OperationView op : operations) {
				width = op.getWidth();

				if(dim[0]<width+WIDTH_GAP*2.)
					dim[0] = 2.*WIDTH_GAP+width;

				dim[1] += op.getHeight()+HEIGHT_GAP;
			}
		
		double minx = Double.MAX_VALUE;
		double maxx = Double.MIN_VALUE;
		double miny = Double.MAX_VALUE;
		double maxy = Double.MIN_VALUE;
		Point2D pt;
		
		for(IAnchor anchor : anchors) {
			pt = anchor.getPosition();
//			if(!anchor.isFree()) {
				if(pt.getX()<minx) 	minx = pt.getX();
				if(pt.getX()>maxx)	maxx = pt.getX();
				if(pt.getY()<miny) 	miny = pt.getY();
				if(pt.getY()>maxy)	maxy = pt.getY();
//			}
		}
		
		if(maxx-minx>=dim[0]*scale)
			dim[0] = (maxx-minx)/scale;
		else
			// If the bowing box of the anchors is smaller than the real boxing box of the class, 
			// the anchors must be moved to the border of the class.
			for(IAnchor anchor : anchors) {
				pt = anchor.getPosition();
				if(Number.NUMBER.equals(pt.getX(), minx))
						pt.setLocation(centre.x-dim[0]/2., pt.getY());
				else if(Number.NUMBER.equals(pt.getX(), maxx))
					pt.setLocation(centre.x+dim[0]/2., pt.getY());
			}
		if(maxy-miny>=dim[1]*scale)
			dim[1] = (maxy-miny)/scale;
		else
			for(IAnchor anchor : anchors) {
				pt = anchor.getPosition();
				if(Number.NUMBER.equals(pt.getY(), miny))
					pt.setLocation(pt.getX(), centre.y-dim[1]/2.);
				else if(Number.NUMBER.equals(pt.getY(), maxy))
					pt.setLocation(pt.getX(), centre.y+dim[1]/2.);
			}
		
		dim[0]  = Math.max(dim[0], 40.)*scale;
		dim[1] = Math.max(dim[1], 30.)*scale;
		
		return dim;
	}


	@Override
	public Dimension getPreferredSize() {
		return new Dimension((int)bound.getWidth(), (int)bound.getHeight());
	}



	@Override
	public void updateFillingColor(final int opacity) {
		fillingColor = new Color(198,218,218, opacity);
	}

	

	/**
	 * @return The font used to display the title of the class.
	 */
	public Font getTitleFont(double zoom) {
		double factor = Math.max(1., (2-zoom));
		int style = fontStyle+Font.BOLD;
		if(isAbstract) style +=Font.ITALIC;
		return new Font(getFontName(), style, (int)(factor*factor*fontSize));
	}


	/**
	 * @return The rectangle that bounds the displayed title of the class.
	 */
	protected Rectangle2D getTitleBounds(double zoom) {
		return new TextLayout(name, getTitleFont(zoom), FONT_RENDER_CONT).getBounds();
	}



	@Override
	public void paint(final Graphics2D g, final IPaintCtx paintCtx) {
		if(!isVisible()) return ;
		Rectangle visibleScene = paintCtx.getVisibleScene();

		if(visibleScene==null || visibleScene.contains(bound) || visibleScene.intersects(bound)) {
			final double zoom = paintCtx.getZoomLevel();
			final Rectangle2D titleBounds = getTitleBounds(zoom);
			final int textWidth  		= (int) titleBounds.getWidth();
			final int textHeight  		= (int) titleBounds.getHeight();
			final int textHeaderHeight 	= (int) (textHeight + HEIGHT_HEADER_GAP);
			final Font formerFont 		= g.getFont();
			
			g.setColor(fillingColor);
			g.fill(path);
			g.setColor(lineColor);
			g.setStroke(lineStroke);
			g.draw(path);
			g.setStroke(BASIC_STROKE);
			g.setColor(Color.BLACK);
			g.setFont(getTitleFont(zoom));
			g.drawString(name, (float)centre.x-textWidth/2, (float)centre.y-getPreferredSize().height/2+textHeight+(textHeaderHeight-textHeight)/2);
			g.setFont(getFont());

			if(propertiesVisible  && zoom>=0.55)
				for(AttributeView attr : attributes)
					attr.paint(g, paintCtx);

			if(operationsVisible  && zoom>=0.55)
				for(OperationView op : operations)
					op.paint(g, paintCtx);

//			for(IAnchor anchor : anchors)
//				if(!anchor.isFree())
//					anchor.paint(g);
			g.setFont(formerFont);
			isOptimHidden = false;
		} else isOptimHidden = true;
	}


	@Override
	public void translate(final double tx, final double ty) {
		super.translate(tx, ty);

		for(final OperationView op : operations)
			op.position.setLocation(op.position.getX()+tx, op.position.getY()+ty);

		for(final AttributeView attr : attributes)
			attr.position.setLocation(attr.position.getX()+tx, attr.position.getY()+ty);

		boundPath.transform(AffineTransform.getTranslateInstance(tx, ty));
		bound = path.getBounds();
	}



	@Override
	public void update() {
		final Double[] dim				= updateBoundingBox();
		final Rectangle2D titleBounds 	= getTitleBounds(1.);//FIXME
		int textHeight  				= (int) titleBounds.getHeight();
		final int textHeaderHeight   	= (int) (textHeight + HEIGHT_HEADER_GAP);
		final float halfWidth  = (float) (dim[0]/2f);
		final float halfHeight = (float) (dim[1]/2f);
		final float cx 		   = (float) centre.x;
		final float cy 		   = (float) centre.y;
		final float xAttr 	   = (float) (cx-halfWidth + WIDTH_GAP);
		float yAttr 		   = (float) (cy-halfHeight + textHeaderHeight + HEIGHT_GAP);

		updateBoundPath(path, dim[0], dim[1], cx, cy);
		updateBoundPath(boundPath, dim[0], dim[1], cx, cy);
		path.moveTo(cx-halfWidth, cy-halfHeight+textHeaderHeight);
		path.lineTo(cx+halfWidth, cy-halfHeight+textHeaderHeight);

		if(propertiesVisible)
			for(AttributeView attr : attributes) {
				textHeight 	= (int) attr.getHeight();
				yAttr 		+= textHeight;
				attr.setPosition(xAttr, yAttr);
				yAttr += HEIGHT_GAP;
			}

		if(operationsVisible) {
			if(!operations.isEmpty() && visibility==Visibility.STANDARD) {
				path.moveTo(cx-halfWidth, yAttr);
				path.lineTo(cx+halfWidth, yAttr);
			}

			for(OperationView op : operations) {
				textHeight 	= (int) op.getHeight();
				yAttr 		+= textHeight;
				op.setPosition(xAttr, yAttr);
				yAttr += HEIGHT_GAP;
			}
		}

		bound = path.getBounds();
	}


	private static void updateBoundPath(final GeneralPath path, final double width, final double height, final double cx, final double cy) {
		final float halfWidth  = (float) (width/2f);
		final float halfHeight = (float) (height/2f);

		path.reset();
		path.moveTo(cx-halfWidth, cy-halfHeight);
		path.lineTo(cx+halfWidth, cy-halfHeight);
		path.lineTo(cx+halfWidth, cy+halfHeight);
		path.lineTo(cx-halfWidth, cy+halfHeight);
		path.closePath();
	}



	@Override
	public void updateLineColor(final int opacity) {
		if(selected)
			lineColor = new Color(100, 100, 100, 75);
		else
			lineColor = new Color(0, 0, 0, opacity);

		textColor = new Color(0, 0, 0, opacity);
	}



	@Override
	public void onUnpruning() {
		for(final AttributeView attr : attributes)
			attr.setVisibility(Visibility.STANDARD);

		for(final OperationView op : operations)
			op.setVisibility(Visibility.STANDARD);

		super.onUnpruning();
	}


	/**
	 * @return True: the attributes are displayed.
	 */
	public boolean isPropertiesVisible() {
		return propertiesVisible;
	}


	/**
	 * Sets if the attributes must be displayed.
	 * @param propertiesVisible True: the attributes are displayed.
	 */
	public void setPropertiesVisible(final boolean propertiesVisible) {
		this.propertiesVisible = propertiesVisible;
	}



	/**
	 * @return True: the operations are displayed.
	 */
	public boolean isOperationsVisible() {
		return operationsVisible;
	}


	/**
	 * Sets if the operations must be displayed.
	 * @param operationsVisible True: the operations are displayed.
	 */
	public void setOperationsVisible(final boolean operationsVisible) {
		this.operationsVisible = operationsVisible;
	}


	@Override
	public GeneralPath getBoundPath() {
		return boundPath;
	}


	@Override
	public Picker getPicker() {
		return null;
	}


	@Override
	public void setSelected(final boolean selected) {
		this.selected = selected;
		updateLineColor(DEFAUT_OPACITY);
		if(selected)
			lineStroke = new BasicStroke(5f);
		else
			lineStroke = new BasicStroke(1f);
	}


	public Color getTextColor() {
		return textColor;
	}


	@Override
	public boolean isSelected() {
		return selected;
	}


	@Override
	public boolean isSelectable() {
		return !isPruned();
	}


	public List<AttributeView> getAttributes() {
		return attributes;
	}


	public List<OperationView> getOperations() {
		return operations;
	}


//	public List<RelationClassView> getRelations() {
//		return relations;
//	}
}
