package fr.inria.diverse.kompren.explen.actions;

import javax.swing.JFileChooser;

import org.malai.swing.action.library.Load;

import fr.inria.diverse.kompren.explen.ui.ExplenFrame;

public class LoadMetamodel extends Load<ExplenFrame, Object> {
	JFileChooser fileChooser;
	
	public LoadMetamodel() {
		super();
	}

	@Override
	public boolean canDo() {
		return fileChooser!=null && ui!=null;
	}

	@Override
	protected void doActionBody() {
		file = fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION ? fileChooser.getSelectedFile() : null;
		
		if(file!=null && file.canRead())
			super.doActionBody();
	}
	
	public void setFileChooser(final JFileChooser fileChooser) {
		this.fileChooser = fileChooser;
	}
}
