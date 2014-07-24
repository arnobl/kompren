package fr.inria.diverse.kompren.explen.actions;

import javax.swing.JScrollBar;

import org.malai.swing.action.library.MoveCamera;
import org.malai.undo.Undoable;

public class MoveCameraUndoable extends MoveCamera implements Undoable {

	protected int oldPositionX;
	protected int oldPositionY;
	
	
	public MoveCameraUndoable() {
		super();
	}
	

	@Override
	protected void doActionBody() {
		oldPositionX = scrollPane.getHorizontalScrollBar().getValue();
		oldPositionY = scrollPane.getVerticalScrollBar().getValue();
		super.doActionBody();
	}



	@Override
	public void undo() {
		moveScrollBar2(scrollPane.getHorizontalScrollBar(), oldPositionX);
		moveScrollBar2(scrollPane.getVerticalScrollBar(), oldPositionY);
	}

	@Override
	public void redo() {
		final JScrollBar hor = scrollPane.getHorizontalScrollBar();
		final JScrollBar ver = scrollPane.getVerticalScrollBar();
		
		if(hor!=null)
			moveScrollBar2(hor, (int)(px-hor.getWidth()/2));
		if(ver!=null)
			moveScrollBar2(ver, (int)(py-ver.getHeight()/2));
	}
	
	
	protected void moveScrollBar2(final JScrollBar bar, final int position) {
		bar.setValue(position);
	}
	

	@Override
	public String getUndoName() {
		return "Move camera";
	}
}
