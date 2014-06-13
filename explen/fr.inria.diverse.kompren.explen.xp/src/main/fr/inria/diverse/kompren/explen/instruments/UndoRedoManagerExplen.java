package fr.inria.diverse.kompren.explen.instruments;

import javax.swing.ImageIcon;

import org.malai.swing.instrument.library.UndoRedoManager;
import org.malai.swing.ui.SwingUIComposer;

import fr.inria.diverse.kompren.explen.ui.MPieMenuButton;

public class UndoRedoManagerExplen extends UndoRedoManager {

	public UndoRedoManagerExplen(final SwingUIComposer<?> composer) {
		super(composer);
	}

	@Override
	protected void initialiseWidgets() {
		undoB = new MPieMenuButton(new ImageIcon(UndoRedoManager.class.getResource("/res/Undo.png"))); //$NON-NLS-1$
		redoB = new MPieMenuButton(new ImageIcon(UndoRedoManager.class.getResource("/res/Redo.png"))); //$NON-NLS-1$
	}
}
