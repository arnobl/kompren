package fr.inria.diverse.kompren.explen.actions;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.action.ModelViewAction;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.malai.undo.Undoable;

public abstract class VisualisationAction extends ModelViewAction implements Undoable {
	protected List<IComponentView.Visibility> viewClassesStates;
	protected List<IComponentView.Visibility> viewRelationStates;


	public VisualisationAction() {
		super();
	}


	@Override
	protected void doActionBody() {
		viewClassesStates = new ArrayList<>();
		viewRelationStates = new ArrayList<>();

		for(IEntityView ent : canvas.getEntities())
			viewClassesStates.add(ent.getVisibility());
		for(IRelationView rel : canvas.getRelations())
			viewRelationStates.add(rel.getVisibility());

		doVisualisation();
		done();
	}


	protected abstract void doVisualisation();


	@Override
	public boolean isRegisterable() {
		return true;
	}


	@Override
	public void undo() {
		int i=0;
		for(IEntityView ent : canvas.getEntities()) {
			ent.setVisibility(viewClassesStates.get(i));
			i++;
		}
		i=0;
		for(IRelationView rel : canvas.getRelations()) {
			rel.setVisibility(viewRelationStates.get(i));
			i++;
		}
		canvas.updateLayout();
		canvas.update();
	}


	@Override
	public void redo() {
		doVisualisation();
	}
}
