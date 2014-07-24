package fr.inria.diverse.kompren.explen.actions;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import org.kermeta.kompren.diagram.view.interfaces.Selectable;

import fr.inria.diverse.kompren.explen.instruments.Completioner;
import fr.inria.diverse.kompren.explen.view.ClassView;

public abstract class SelectionBasedVisuAction extends VisualisationAction {
	protected List<ClassView> classes;

	public SelectionBasedVisuAction() {
		super();
	}


	@Override
	protected void doVisualisation() {
		if(classes==null) {
			classes = new ArrayList<>();
			for(Selectable sel : canvas.getSelection())
				if(sel instanceof ClassView)
					classes.add((ClassView) sel);
		}
	}


	@Override
	public void undo() {
		super.undo();

        Runnable moveScrollbars = new Runnable() {
            @Override
			public void run() {
            	final Point pt = Completioner.Interaction2MoveCamera.getMoveCameraToPoint(classes.get(0), canvas.getZoom(), canvas.getScrollpane());
            	getCanvas().getScrollpane().getHorizontalScrollBar().setValue((int)pt.getX());
            	getCanvas().getScrollpane().getVerticalScrollBar().setValue((int)pt.getY());
            }
        };

        SwingUtilities.invokeLater(moveScrollbars);
	}
}
