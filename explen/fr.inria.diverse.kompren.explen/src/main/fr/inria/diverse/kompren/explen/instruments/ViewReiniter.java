package fr.inria.diverse.kompren.explen.instruments;

import org.malai.instrument.Link;
import org.malai.swing.instrument.WidgetInstrument;
import org.malai.swing.interaction.library.ButtonPressed;
import org.malai.swing.ui.SwingUIComposer;

import fr.inria.diverse.kompren.explen.actions.ReinitView;
import fr.inria.diverse.kompren.explen.ui.MPieMenuButton;
import fr.inria.diverse.kompren.explen.view.MetamodelView;

public class ViewReiniter extends WidgetInstrument {
	protected MPieMenuButton reinit;

	protected MetamodelView canvas;


	public ViewReiniter(final MetamodelView canvas, final SwingUIComposer<?> composer) {
		super(composer);
		this.canvas = canvas;
		initialiseWidgets();
	}

	@Override
	protected void initialiseWidgets() {
		reinit = new MPieMenuButton("Reinit");
		reinit.setToolTipText("Reinitialises the view.");
	}

	@Override
	protected void initialiseLinks() {
		try {
			addLink(new Button2ReinitView(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public MPieMenuButton getReinit() {
		return reinit;
	}


	private class Button2ReinitView extends Link<ReinitView, ButtonPressed, ViewReiniter> {
		public Button2ReinitView(final ViewReiniter ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, ReinitView.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.canvas);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.reinit;
		}
	}
}
