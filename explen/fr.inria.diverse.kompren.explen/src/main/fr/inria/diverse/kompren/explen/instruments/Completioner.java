package fr.inria.diverse.kompren.explen.instruments;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoundedRangeModel;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;

import org.eclipse.emf.ecore.EClass;
import org.malai.instrument.Link;
import org.malai.interaction.Interaction;
import org.malai.interaction.library.KeyPressure;
import org.malai.interaction.library.Press;
import org.malai.swing.action.library.MoveCamera;
import org.malai.swing.instrument.WidgetInstrument;
import org.malai.swing.instrument.library.BasicZoomer;
import org.malai.swing.interaction.library.MenuItemPressed;
import org.malai.swing.interaction.library.TextChanged;
import org.malai.swing.ui.SwingUIComposer;
import org.malai.swing.widget.MPopupMenu;

import fr.inria.diverse.kompren.explen.actions.SelectMenuItem;
import fr.inria.diverse.kompren.explen.actions.SetCompletionItems;
import fr.inria.diverse.kompren.explen.actions.SetVisibleComponent;
import fr.inria.diverse.kompren.explen.model.ModelUtils;
import fr.inria.diverse.kompren.explen.ui.ExplenFrame;
import fr.inria.diverse.kompren.explen.ui.TextFieldCompletion;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.MetamodelView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;

public class Completioner extends WidgetInstrument {
	protected TextFieldCompletion textField;

	protected JLabel label;

	protected BasicZoomer zoomer;


	public Completioner(final SwingUIComposer<?> composer, final BasicZoomer zoomer) {
		super(composer);

		this.zoomer = zoomer;
		initialiseWidgets();
		addEventable((MPopupMenu)textField.getComponentPopupMenu());
	}



	@Override
	protected void initialiseWidgets() {
		textField = new TextFieldCompletion();
		textField.setToolTipText("Searches a class with its name and zooms on the class corresponding to the selected sub-menu.");
		label = new JLabel("Search:");
	}



	@Override
	public void setActivated(final boolean activated) {
		super.setActivated(activated);
		textField.setVisible(activated);

		if(activated)
			textField.setText("");
	}


	@Override
	protected void initialiseLinks() {
		try {
			addLink(new ArrowPressed2MoveMenu(this));
			addLink(new EnterPressed2ZoomOn(this));
			addLink(new TextChanged2SetCompletion(this));
			addLink(new MenuItem2ZoomOn(this));
			addLink(new EnterEscape2HidePopupMenu(this));
			addLink(new ClickIn2ShowMenu(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}



	private class ArrowPressed2MoveMenu extends Link<SelectMenuItem, KeyPressure, Completioner> {
		public ArrowPressed2MoveMenu(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, SelectMenuItem.class, KeyPressure.class);
		}


		@Override
		public void initAction() {
			JPopupMenu menu = instrument.textField.getComponentPopupMenu();
			MenuElement[] elts = MenuSelectionManager.defaultManager().getSelectedPath();
			int index = elts==null || elts.length==0 || !(elts[elts.length-1] instanceof Component) ?
							-1 : menu.getComponentIndex((Component)elts[elts.length-1]);
			boolean isUp = interaction.getKey()==KeyEvent.VK_UP;

			if(isUp)
				switch(index) {
					case -1: index = 0; break;
					case 0:	index = menu.getComponentCount()-1; break;
					default: index -= 1;
				}
			else
				if(index==-1 || index==menu.getComponentCount()-1)
					index = 0;
				else
					index += 1;

			action.setMenu(menu);
			action.setIndex(index);
		}


		@Override
		public boolean isConditionRespected() {
			return (interaction.getKey()==KeyEvent.VK_UP || interaction.getKey()==KeyEvent.VK_DOWN) &&
					instrument.textField.getComponentPopupMenu().getComponentCount()>0;
		}
	}



	private class ClickIn2ShowMenu extends Link<SetVisibleComponent, Press, Completioner> {
		public ClickIn2ShowMenu(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, SetVisibleComponent.class, Press.class);
		}

		@Override
		public void initAction() {
			action.setVisible(true);
			action.setComponent(instrument.textField.getComponentPopupMenu());
			action.setPx(instrument.textField.getLocationOnScreen().getX());
			action.setPy(instrument.textField.getLocationOnScreen().getY()+instrument.textField.getHeight());
		}

		@Override
		public boolean isConditionRespected() {
			return instrument.textField.getComponentPopupMenu().getComponentCount()>0;
		}
	}



	private class EnterEscape2HidePopupMenu extends Link<SetVisibleComponent, KeyPressure, Completioner> {
		public EnterEscape2HidePopupMenu(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, SetVisibleComponent.class, KeyPressure.class);
		}

		@Override
		public void initAction() {
			action.setVisible(false);
			action.setComponent(instrument.textField.getComponentPopupMenu());
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getKey()==KeyEvent.VK_ENTER || interaction.getKey()==KeyEvent.VK_ESCAPE;
		}
	}



	private class EnterPressed2ZoomOn extends Interaction2MoveCamera<KeyPressure, Completioner> {
		public EnterPressed2ZoomOn(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, KeyPressure.class, ins.zoomer);
		}


		@Override
		public void initAction() {
			MenuElement[] elts = MenuSelectionManager.defaultManager().getSelectedPath();
			String name = elts==null || elts.length==0 || !(elts[elts.length-1] instanceof JMenuItem) ?
							"" : ((JMenuItem)elts[elts.length-1]).getText();
			Object o = instrument.getComposer().getWidget();
			MetamodelView canvas = ((ExplenFrame)o).getCanvas();
			setAction(name, canvas, action);
		}


		@Override
		public boolean isConditionRespected() {
			return interaction.getKey()==KeyEvent.VK_ENTER && instrument.textField.getComponentPopupMenu().getComponentCount()>0;
		}
	}




	private class MenuItem2ZoomOn extends Interaction2MoveCamera<MenuItemPressed, Completioner> {
		public MenuItem2ZoomOn(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, MenuItemPressed.class, ins.zoomer);
		}


		@Override
		public void initAction() {
			Object o = instrument.getComposer().getWidget();
			MetamodelView canvas = ((ExplenFrame)o).getCanvas();
			setAction(interaction.getMenuItem().getText(), canvas, action);
		}


		@Override
		public boolean isConditionRespected() {
			JPopupMenu menu = instrument.textField.getComponentPopupMenu();
			return menu!=null && menu.getComponentIndex(interaction.getMenuItem())!=-1;
		}
	}



	private class TextChanged2SetCompletion extends Link<SetCompletionItems, TextChanged, Completioner> {
		private List<String> database;

		public TextChanged2SetCompletion(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, SetCompletionItems.class, TextChanged.class);
		}

		@Override
		public void initAction() {
			database = new ArrayList<>();
			ModelViewMapper mapper = ModelViewMapper.getMapper();

			for(EClass clazz : mapper.getClassDefinitionAdded())
				if(mapper.getClassView(clazz).isVisible())
					database.add(ModelUtils.INSTANCE.getQualifiedName(clazz));

			action.setTextField(instrument.textField);
			action.setTextReference(instrument.textField.getText());
			action.setDatabase(database);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getTextComp()==instrument.textField;
		}
	}


	public TextFieldCompletion getTextField() {
		return textField;
	}


	public JLabel getLabel() {
		return label;
	}
	
	
	public static abstract class Interaction2MoveCamera<I extends Interaction, J extends WidgetInstrument> extends Link<MoveCamera, I, J> {
		protected BasicZoomer zoomer;

		public Interaction2MoveCamera(final J ins, final Class<I> clazzInteraction, final BasicZoomer zoomer) throws InstantiationException, IllegalAccessException {
			super(ins, false, MoveCamera.class, clazzInteraction);
			this.zoomer = zoomer;
		}

		
		public static Point getMoveCameraToPoint(final ClassView cv, final double zoom, final JScrollPane pane) {
			final Point2D centre = cv.getCentre();
			final JScrollBar vertSB  = pane.getVerticalScrollBar();
			final JScrollBar horizSB = pane.getHorizontalScrollBar();
			Point pt = new Point();
			
			BoundedRangeModel model = vertSB.getModel();
			int value	= model.getValue();
			final int cy 	= pane.getHeight()/2 + value;
			int newValue 	= value+(int)(centre.getY()*zoom)-cy;

			if(newValue>model.getMaximum())
				newValue = model.getMaximum();
			else if(newValue<model.getMinimum())
				newValue = model.getMinimum();

			pt.y = newValue;

			model = horizSB.getModel();
			value	= model.getValue();
			final int cx 	= pane.getWidth()/2 + value;
			newValue 	= value+(int)(centre.getX()*zoom)-cx;

			if(newValue>model.getMaximum())
				newValue = model.getMaximum();
			else if(newValue<model.getMinimum())
				newValue = model.getMinimum();
			
			pt.x = newValue;
			
			return pt;
		}
		

		public static void setAction(final String qualifiedPath, final MetamodelView canvas, MoveCamera action) {
			setAction(ModelViewMapper.getMapper().getClassView(qualifiedPath), canvas, action);
		}
		
		
		public static void setAction(final ClassView cv, final MetamodelView canvas, MoveCamera action) {
			final double zoom = canvas.getZoom();

			Point2D pt = cv.getCentre();
			action.setPx(pt.getX()*zoom);
			action.setPy(pt.getY()*zoom);
			action.setScrollPane(canvas.getScrollpane());
		}
	}
}
