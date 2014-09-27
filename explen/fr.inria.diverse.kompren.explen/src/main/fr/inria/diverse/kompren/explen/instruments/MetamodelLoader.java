package fr.inria.diverse.kompren.explen.instruments;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import org.malai.instrument.Link;
import org.malai.swing.instrument.WidgetInstrument;
import org.malai.swing.interaction.library.ButtonPressed;
import org.malai.swing.ui.SwingUIComposer;
import org.malai.swing.widget.MButton;

import fr.inria.diverse.kompren.explen.actions.LoadMetamodel;
import fr.inria.diverse.kompren.explen.ui.ExplenFrame;

public class MetamodelLoader extends WidgetInstrument {
	MButton loadB;
	
	JFileChooser fileChooser;
	
	ExplenFrame ui;
	
	public MetamodelLoader(SwingUIComposer<?> composer, ExplenFrame frame) {
		super(composer);
		ui = frame;
		initialiseWidgets();
	}

	@Override
	protected void initialiseWidgets() {
		loadB = new MButton("load");
		loadB.setFocusable(false);
	}
	

	public JFileChooser getDialog() {
		if(fileChooser==null) {
			fileChooser = new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			fileChooser.setFileFilter(new FileFilter() {
				@Override public String getDescription() {return "Ecore file";}
				@Override public boolean accept(File f) {return f!=null && f.getName().endsWith(".ecore");}
			});
			fileChooser.setMultiSelectionEnabled(false);
		}

		fileChooser.setDialogTitle("Loading an Ecore metamodel");

		return fileChooser;
	}

	public MButton getLoadB() { return loadB; }
	
	@Override
	protected void initialiseLinks() {
		try {
			addLink(new Button2Load(this));
		}catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}


class Button2Load extends Link<LoadMetamodel, ButtonPressed, MetamodelLoader> {
	protected Button2Load(final MetamodelLoader ins) throws InstantiationException, IllegalAccessException {
		super(ins, false, LoadMetamodel.class, ButtonPressed.class);
	}

	@Override
	public void initAction() {
		action.setUi(instrument.ui);
		action.setFileChooser(instrument.getDialog());
		action.setOpenSaveManager(instrument.ui);
	}

	@Override
	public boolean isConditionRespected() {
		return interaction.getButton()==instrument.loadB;
	}
}
