package fr.inria.diverse.kompren.explen.actions;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;

import fr.inria.diverse.kompren.explen.instruments.Completioner;
import fr.inria.diverse.kompren.explen.slicing.Slicer;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;

public class Slice extends SelectionBasedVisuAction {
	protected int radius;

	protected boolean considerOnlyComposition;
	
	protected boolean considerOnlyCard1;


	public Slice() {
		super();
		radius = 0;
		considerOnlyComposition = false;
		considerOnlyCard1 = false;
	}


	@Override
	public String getUndoName() {
		return "Pruning";
	}


	@Override
	protected void doVisualisation() {
		super.doVisualisation();

		final List<EClass> cds = new ArrayList<>();
		final ModelViewMapper mapper =  ModelViewMapper.getMapper();

		for(IEntityView cl : canvas.getEntities())
			cl.setVisibility(Visibility.STANDARD);

		for(ClassView cl : classes)
			cds.add(mapper.getClassDefinition(cl));

		Slicer slicer = new Slicer(canvas, cds, EcoreUtil.getRootContainer(cds.get(0)), false, true, true, true, considerOnlyCard1, considerOnlyComposition);
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


	@Override
	public boolean canDo() {
		return super.canDo() && ModelViewMapper.getMapper()!=null;
	}


	public void setRadius(final int radius) {
		this.radius = radius;
	}


	public void setConsiderCompositionOnly(final boolean considerComposition) {
		this.considerOnlyComposition = considerComposition;
	}
	
	public void setConsiderCard1Only(final boolean considerOnlyCard1) {
		this.considerOnlyCard1 = considerOnlyCard1;
	}
}
