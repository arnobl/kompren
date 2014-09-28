package fr.inria.diverse.kompren.explen.actions;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.inria.diverse.kompren.explen.instruments.Completioner;
import fr.inria.diverse.kompren.explen.slicing.Slicer;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;

public class ShowHierarchy extends SelectionBasedVisuAction {
	protected int radius;

	protected boolean superTypes;


	public ShowHierarchy() {
		super();
		superTypes = true;
		radius = 0;
	}


	@Override
	protected void doVisualisation() {
		super.doVisualisation();
		
		final List<EClass> cds = new ArrayList<>();
		final ModelViewMapper mapper =  ModelViewMapper.getMapper();

		for(ClassView cl : classes)
			cds.add(mapper.getClassDefinition(cl));

		Slicer slicer = new Slicer(canvas, cds, EcoreUtil.getRootContainer(cds.get(0)), !superTypes, false, superTypes, false);
		slicer.slice();
		
        Runnable moveScrollbars = new Runnable() {
            @Override
			public void run() {
            	final Point pt = Completioner.Interaction2MoveCamera.getMoveCameraToPoint(classes.get(0), canvas.getZoom(), canvas.getScrollpane());
            	getCanvas().getScrollpane().getHorizontalScrollBar().setValue((int)pt.getX());
            	getCanvas().getScrollpane().getVerticalScrollBar().setValue((int)pt.getY());
            }
        };

        SwingUtilities.invokeLater(moveScrollbars);
		
		done();
	}

	public void setSuperTypes(final boolean superTypes) {
		this.superTypes = superTypes;
	}


	@Override
	public String getUndoName() {
		return superTypes ? "Show super-classes" : "Show lower-classes";
	}


	public void setRadius(final int radius) {
		this.radius = radius;
	}
}
