package fr.inria.diverse.kompren.explen.instruments;

import java.awt.Dimension;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;

import org.malai.instrument.Link;
import org.malai.swing.instrument.WidgetInstrument;
import org.malai.swing.interaction.library.ButtonPressed;
import org.malai.swing.ui.SwingUIComposer;
import org.malai.swing.widget.MCheckBox;
import org.malai.swing.widget.MSpinner;

import fr.inria.diverse.kompren.explen.actions.Flat;
import fr.inria.diverse.kompren.explen.actions.ShowHierarchy;
import fr.inria.diverse.kompren.explen.actions.Slice;
import fr.inria.diverse.kompren.explen.eval.QuestionsPanel;
import fr.inria.diverse.kompren.explen.eval.QuestionsPanel.TypeEval;
import fr.inria.diverse.kompren.explen.instruments.Completioner.Interaction2MoveCamera;
import fr.inria.diverse.kompren.explen.model.ModelUtils;
import fr.inria.diverse.kompren.explen.slicing.Slicer;
import fr.inria.diverse.kompren.explen.ui.ExplenFrame;
import fr.inria.diverse.kompren.explen.ui.MPieMenuButton;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;

public class Visualiser extends WidgetInstrument {

	protected MPieMenuButton superClasses;

	protected MPieMenuButton lowerClasses;

	protected MPieMenuButton pruning;

	protected MPieMenuButton flat;

	protected ExplenFrame frame;

	protected Slicer slicer;

	protected MSpinner radius;
	
	protected MCheckBox compo;
	
	protected MCheckBox card1;


	public Visualiser(final SwingUIComposer<?> composer) {
		super(composer);
		initialiseWidgets();
		frame 	= (ExplenFrame) composer.getWidget();
		slicer 	= new Slicer(frame.getCanvas());
	}


	@Override
	protected void initialiseWidgets() {
		superClasses 	= new MPieMenuButton(new ImageIcon(Class.class.getResource("/res/hierar.png")));
		pruning 		= new MPieMenuButton(new ImageIcon(Class.class.getResource("/res/prune.png")));
		flat 			= new MPieMenuButton(new ImageIcon(Class.class.getResource("/res/flat.png")));
		lowerClasses 	= new MPieMenuButton(new ImageIcon(Class.class.getResource("/res/subType.png")));
		radius 			= new MSpinner(new MSpinner.MSpinnerNumberModel(0, 0, 1000, 1), null);
		compo			= new MCheckBox("Composition");
		card1			= new MCheckBox("Card. 1");

		superClasses.setToolTipText("Show all its super classes.");
		lowerClasses.setToolTipText("Show all its lower classes.");
		pruning.setToolTipText("Show all the classes in relation with the selected class.");
		flat.setToolTipText("Show all its direct inherited attributes, references, inheritances, and operations (by flattening its hierarchy).");
		radius.setToolTipText("Set the radius of the hierarchy and pruning slicing: 0, there is no radius; 1, only the direct classes are kept; etc.");
		compo.setToolTipText("Define whether only the composition must be sliced (ie references will be ignored).");
		card1.setToolTipText("Define whether only relations with a min cardinality of 1 must be sliced.");
		radius.setMaximumSize(new Dimension(50, 40));
		radius.setSize(new Dimension(50, 40));
		compo.setMaximumSize(new Dimension(120, 40));
		compo.setSize(new Dimension(120, 40));
		card1.setMaximumSize(new Dimension(75, 40));
		card1.setSize(new Dimension(75, 40));

		if(QuestionsPanel.TYPE_EVAL==TypeEval.WITHOUT_VISU_TOOLS)
			radius.setVisible(false);
	}

	@Override
	protected void initialiseLinks() {
		try {
			addLink(new Button2ShowHierarchy(this));
			addLink(new Button2Slice(this));
			addLink(new Button2FocusOnClass(this));
			addLink(new Button2Flat(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void setActivated(final boolean activated) {
		super.setActivated(activated);

		superClasses.setEnabled(activated);
		lowerClasses.setEnabled(activated);
		pruning.setEnabled(activated);
		flat.setEnabled(activated);
	}


	public MPieMenuButton getSuperClasses() {
		return superClasses;
	}


	public MPieMenuButton getLowerClasses() {
		return lowerClasses;
	}


	public MPieMenuButton getPruning() {
		return pruning;
	}


	public MPieMenuButton getFlat() {
		return flat;
	}
	
	public MCheckBox getCompo() { return compo; }
	public MCheckBox getCard1() { return card1; }


	public MSpinner getRadius() {
		return radius;
	}



	private class Button2Flat extends Link<Flat, ButtonPressed, Visualiser> {
		public Button2Flat(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, Flat.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setSlicer(instrument.slicer);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.flat;
		}
	}



	private class Button2FocusOnClass extends Interaction2MoveCamera<ButtonPressed, Visualiser> {
		public Button2FocusOnClass(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, ButtonPressed.class, ins.frame.getZoomer());
		}

		@Override
		public void initAction() {
			if(!instrument.frame.getCanvas().getSelection().isEmpty() &&
				instrument.frame.getCanvas().getSelection().get(0) instanceof ClassView) {
				ClassView cv = (ClassView) instrument.frame.getCanvas().getSelection().get(0);
				String qname = ModelUtils.INSTANCE.getQualifiedName(ModelViewMapper.getMapper().getClassDefinition(cv));
				setAction(qname, instrument.frame.getCanvas(), action);
			}
		}

		@Override
		public boolean isConditionRespected() {
			final AbstractButton but = interaction.getButton();
			return but==instrument.pruning || but==instrument.superClasses || but==instrument.lowerClasses || but==instrument.flat;
		}
	}


	private class Button2Slice extends Link<Slice, ButtonPressed, Visualiser> {
		public Button2Slice(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, Slice.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setSlicer(instrument.slicer);
			action.setRadius((Integer)instrument.radius.getValue());
			action.setConsiderCompositionOnly(instrument.compo.isSelected());
			action.setConsiderCard1Only(instrument.card1.isSelected());
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.pruning;
		}
	}



	private class Button2ShowHierarchy extends Link<ShowHierarchy, ButtonPressed, Visualiser> {
		public Button2ShowHierarchy(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, ShowHierarchy.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setSlicer(instrument.slicer);
			action.setSuperTypes(interaction.getButton()==instrument.superClasses);
			action.setRadius((Integer)instrument.radius.getValue());
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.superClasses || interaction.getButton()==instrument.lowerClasses;
		}
	}
}
