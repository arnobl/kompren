package fr.inria.diverse.kompren.explen.instruments;

import java.awt.event.MouseEvent;

import javax.swing.JLayeredPane;

import org.malai.instrument.Link;
import org.malai.interaction.library.Press;
import org.malai.swing.instrument.WidgetInstrument;
import org.malai.swing.ui.SwingUIComposer;
import org.malai.swing.widget.MLayeredPane;
import org.malai.swing.widget.MScrollPane;

import fr.inria.diverse.kompren.explen.actions.SetVisibleComponent;
import fr.inria.diverse.kompren.explen.ui.MPieMenu;
import fr.inria.diverse.kompren.explen.view.MetamodelView;

public class VisualiserManager extends WidgetInstrument {
	protected MPieMenu menu;

	/** The pane where the text field must be added. */
	protected MLayeredPane layeredPanel;

	protected MetamodelView mmView;


	public VisualiserManager(final SwingUIComposer<?> composer, final MLayeredPane overlayedPanel, final MetamodelView mmView) {
		super(composer);
		layeredPanel = overlayedPanel;
		this.mmView = mmView;
		initialiseWidgets();
	}


	@Override
	protected void initialiseWidgets() {
		menu = new MPieMenu(mmView);
		layeredPanel.add(menu, JLayeredPane.PALETTE_LAYER);
		menu.setVisible(false);
	}


	@Override
	protected void initialiseLinks() {
		try {
			addLink(new ClickToShowPieMenu(this));
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}


	private class ClickToShowPieMenu extends Link<SetVisibleComponent, Press, VisualiserManager> {
		public ClickToShowPieMenu(final VisualiserManager ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, SetVisibleComponent.class, Press.class);
		}

		@Override
		public void initAction() {
			action.setComponent(instrument.menu);

			if(interaction.getButton()==MouseEvent.BUTTON3) {
				MScrollPane pane = mmView.getScrollpane();

				action.setVisible(true);
				action.setPx(interaction.getPoint().getX()-instrument.menu.getWidth()/2.-pane.getHorizontalScrollBar().getValue());
				action.setPy(interaction.getPoint().getY()-instrument.menu.getHeight()/2.-pane.getVerticalScrollBar().getValue());
			}else
				action.setVisible(false);
		}

		@Override
		public boolean isConditionRespected() {
			return true;
		}
	}


	public MPieMenu getMenu() {
		return menu;
	}
}
