package fr.inria.diverse.kompren.explen.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;

import org.malai.swing.ui.SwingUIComposer;
import org.malai.swing.widget.MProgressBar;

import fr.inria.diverse.kompren.explen.view.MetamodelView;

public class ExplenUIBuilder extends SwingUIComposer<ExplenFrame> {

	public ExplenUIBuilder(final ExplenFrame frame) {
		super();
		widget = frame;
	}

	@Override
	public void compose(final MProgressBar progressBar) {
		MetamodelView mmv = widget.getCanvas();
		widget.toolbar.setFloatable(false);
		MPieMenu menu = widget.visualiserManager.getMenu();
		menu.add(widget.reiniter.getReinit());
		menu.add(widget.visualiser.getLowerClasses());
		menu.add(widget.visualiser.getSuperClasses());
		menu.add(widget.visualiser.getPruning());
		menu.add(widget.visualiser.getRadius());
		menu.add(widget.visualiser.getCard1());
		menu.add(widget.visualiser.getCompo());
		menu.add(widget.visualiser.getFlat());
		menu.add(widget.undoredoer.getRedoB());
		menu.add(widget.undoredoer.getUndoB());

		widget.completioner.setActivated(true);
		widget.completioner.addEventable(widget.toolbar);
		widget.undoredoer.setActivated(true);
		widget.scroller.addEventable(mmv);
		widget.scroller.setActivated(true);
		widget.hand.addEventable(mmv);
		widget.hand.setActivated(true);
		widget.visualiserManager.addEventable(mmv);
		widget.visualiserManager.setActivated(true);
		widget.visualiser.addEventable(widget.visualiserManager.getMenu());
		widget.visualiser.setActivated(true);
		widget.reiniter.addEventable(widget.visualiserManager.getMenu());
		widget.reiniter.setActivated(true);
		widget.undoredoer.addEventable(widget.visualiserManager.getMenu());
		widget.zoomer.addEventable(mmv);
		widget.zoomer.addEventable(widget.toolbar);
		widget.zoomer.setActivated(true);

		TextFieldCompletion field = widget.completioner.getTextField();
		Dimension dim = new Dimension(250, 30);
		field.setPreferredSize(dim);
		field.setMaximumSize(dim);
		widget.toolbar.add(widget.completioner.getLabel());
		widget.toolbar.add(field);
		field.removeActionListener(widget.toolbar.getEventManager());
		widget.setMinimumSize(new Dimension(800, 600));

		Container pane = widget.getContentPane();
		pane.setLayout(new BorderLayout());
		pane.add(widget.toolbar, BorderLayout.NORTH);
		pane.add(widget.getLayeredPanel(), BorderLayout.CENTER);
		widget.pack();
		widget.setLocation(200, 200);
		widget.setExtendedState(Frame.MAXIMIZED_BOTH);
		widget.getCanvas().requestFocusInWindow();
	}
}
