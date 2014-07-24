package fr.inria.diverse.kompren.explen.ui;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import org.kermeta.kompren.diagram.instrument.Hand;
import org.malai.instrument.Instrument;
import org.malai.mapping.MappingRegistry;
import org.malai.presentation.Presentation;
import org.malai.swing.instrument.library.BasicZoomer;
import org.malai.swing.instrument.library.Scroller;
import org.malai.swing.instrument.library.UndoRedoManager;
import org.malai.swing.ui.SwingUI;
import org.malai.swing.ui.UIManager;
import org.malai.swing.widget.MLayeredPane;
import org.malai.swing.widget.MToolBar;

import fr.inria.diverse.kompren.explen.instruments.Completioner;
import fr.inria.diverse.kompren.explen.instruments.UndoRedoManagerExplen;
import fr.inria.diverse.kompren.explen.instruments.ViewReiniter;
import fr.inria.diverse.kompren.explen.instruments.Visualiser;
import fr.inria.diverse.kompren.explen.instruments.VisualiserManager;
import fr.inria.diverse.kompren.explen.mapping.Selection2VisualiserMapping;
import fr.inria.diverse.kompren.explen.model.Model;
import fr.inria.diverse.kompren.explen.view.ClassModelBasicStrategy;
import fr.inria.diverse.kompren.explen.view.MetamodelView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;

public class ExplenFrame extends SwingUI{
	private static final long serialVersionUID = 1L;

	protected JFrame proxiedFrame;

	protected Scroller scroller;

	protected Hand hand;

	protected BasicZoomer zoomer;

	protected VisualiserManager visualiserManager;

	protected Visualiser visualiser;

	protected ViewReiniter reiniter;

	protected UndoRedoManagerExplen undoredoer;

	protected Completioner completioner;

	protected MToolBar toolbar;


	/** The layered panel used to display widgets upon shapes (e.g. text setters). */
	protected MLayeredPane layeredPanel;


	public ExplenFrame() {
		super();

		MetamodelView canvas = getCanvas();
		toolbar = new MToolBar(true);
		layeredPanel = new MLayeredPane(false, false);
		layeredPanel.add(canvas.getScrollpane(), JLayeredPane.DEFAULT_LAYER);
		layeredPanel.addComponentsToResize(canvas.getScrollpane());

		composer = new ExplenUIBuilder(this);
		canvas.setLayoutStrategy(new ClassModelBasicStrategy(canvas));
		ModelViewMapper.initMapper(getPresentation(Model.class, MetamodelView.class));
		undoredoer = new UndoRedoManagerExplen(composer);
		scroller = new Scroller(canvas);
		zoomer = new BasicZoomer(canvas, true);
		hand = new Hand(canvas);
		visualiserManager = new VisualiserManager(composer, layeredPanel, canvas);
		visualiser = new Visualiser(composer);
		reiniter = new ViewReiniter(canvas, composer);
		completioner = new Completioner(composer, zoomer);

		MappingRegistry.REGISTRY.addMapping(new Selection2VisualiserMapping(canvas.getSelection(), visualiser));
		UIManager.INSTANCE.registerUI(this);
	}


	public void setActivated(final boolean activated) {
		for(Instrument ins : getInstruments())
			ins.setActivated(activated);
		getCanvas().setEnabled(activated);
	}



	@Override
	public Instrument[] getInstruments() {
		return new Instrument[]{scroller, hand, zoomer, visualiserManager, visualiser, undoredoer, reiniter, completioner};
	}


	public MetamodelView getCanvas() {
		return getPresentation(Model.class, MetamodelView.class).getConcretePresentation();
	}


	public Model getModel() {
		return getPresentation(Model.class, MetamodelView.class).getAbstractPresentation();
	}


	@Override
	public void initialisePresentations() {
		Model model  = new Model();
		MetamodelView canvas = new MetamodelView(true);

		presentations.add(new Presentation<>(model, canvas));
	}


	public MLayeredPane getLayeredPanel() {
		return layeredPanel;
	}


	public BasicZoomer getZoomer() {
		return zoomer;
	}


	public Hand getHand() {
		return hand;
	}


	public Visualiser getVisualiser() {
		return visualiser;
	}


	public UndoRedoManager getUndoredoer() {
		return undoredoer;
	}


	public Completioner getCompletioner() {
		return completioner;
	}
}
