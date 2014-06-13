package fr.inria.diverse.kompren.explen.actions;

import java.awt.Point;

import javax.swing.SwingUtilities;

import org.eclipse.emf.common.util.BasicEList;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;

import fr.inria.diverse.kompren.explen.instruments.Completioner;
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

		final BasicEList<ClassDefinition> cds = new BasicEList<>();
		final ModelViewMapper mapper =  ModelViewMapper.getMapper();

		for(IEntityView cl : canvas.getEntities())
			cl.setVisibility(Visibility.STANDARD);

		for(ClassView cl : classes)
			cds.add(mapper.getClassDefinition(cl));

		slicer.initialise(cds, new BasicEList<ModelingUnit>(), radius, true, true, true, considerOnlyComposition, considerOnlyCard1);
		slicer.launch();
		
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
