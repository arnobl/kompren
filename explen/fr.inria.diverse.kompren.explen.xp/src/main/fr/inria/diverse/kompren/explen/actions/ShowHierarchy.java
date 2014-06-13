package fr.inria.diverse.kompren.explen.actions;

import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Queue;

import javax.swing.SwingUtilities;

import org.eclipse.emf.common.util.BasicEList;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView.Visibility;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.ModelingUnit;

import fr.inria.diverse.kompren.explen.instruments.Completioner;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.InheritanceView;
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
		
		if(superTypes)
			showSuperTypes();
		else
			showLowerTypes();
		
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

	
	protected Queue<ClassView> showDirectLowerTypes(ClassView cv) {
		Queue<ClassView> q = new ArrayDeque<>();
		InheritanceView iv;
		ModelViewMapper mvm = ModelViewMapper.getMapper();
		ClassDefinition cd = mvm.getClassDefinition(cv);
		
		for(ClassView cv2 : cv.getLowerTypes()) {
			iv = mvm.getInheritanceView(mvm.getClassDefinition(cv2), cd);
			if(iv!=null && !iv.isVisible())
				iv.setVisibility(Visibility.STANDARD);
			if(!cv2.isVisible()) {
				cv2.setVisibility(Visibility.STANDARD);
				q.add(cv2);
			}
		}
		
		return q;
	}
	
	
	protected void showLowerTypes() {
		Queue<ClassView> q = new ArrayDeque<>();
		ClassView cv;
		
		for(IEntityView cl : canvas.getEntities())
			cl.setVisibility(Visibility.NONE);
		for(IRelationView rel : canvas.getRelations())
			rel.setVisibility(Visibility.NONE);
		
		for(ClassView cl : classes)
			q.add(cl);
		
		while(!q.isEmpty()) {
			cv = q.poll();
			cv.setVisibility(Visibility.STANDARD);
			q.addAll(showDirectLowerTypes(cv));
			showDirectLowerTypes(cv);
		}
		
		for(IEntityView ent : canvas.getEntities())
			if(ent.getVisibility()==IComponentView.Visibility.HIDE_START)
				ent.setVisibility(IComponentView.Visibility.NONE);
		for(IRelationView rel : canvas.getRelations())
			if(rel.getVisibility()==IComponentView.Visibility.HIDE_START)
				rel.setVisibility(IComponentView.Visibility.NONE);

		canvas.updateLayout();
		canvas.update();
	}
	
	
	protected void showSuperTypes() {
		final BasicEList<ClassDefinition> cds = new BasicEList<>();
		final ModelViewMapper mapper =  ModelViewMapper.getMapper();

		for(IEntityView cl : canvas.getEntities())
			cl.setVisibility(Visibility.STANDARD);
		
		for(ClassView cl : classes)
			cds.add(mapper.getClassDefinition(cl));

		slicer.initialise(cds, new BasicEList<ModelingUnit>(), radius, superTypes, false, false, false, false);
		slicer.launch();
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
