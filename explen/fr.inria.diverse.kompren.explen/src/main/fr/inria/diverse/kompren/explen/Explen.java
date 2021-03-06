package fr.inria.diverse.kompren.explen;

import javax.swing.ToolTipManager;
import javax.swing.UIManager;

import fr.inria.diverse.kompren.explen.ui.ExplenFrame;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;

public class Explen {
	public static void main(final String[] args) {
		if(System.getProperty("os.name").toLowerCase().contains("linux"))
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			}catch(Exception e) { e.printStackTrace(); }

		ExplenFrame frame = new ExplenFrame();
		frame.getComposer().compose(null);
		frame.setVisible(true);
		ToolTipManager.sharedInstance().setInitialDelay(10);
		ToolTipManager.sharedInstance().setDismissDelay(100000);
//		ModelViewMapper.getMapper().build("kdm-1.0.ecore");
		frame.getCanvas().requestFocusInWindow();
//		frame.getCanvas().setOperationsVisible(false);
//		frame.getCanvas().update();
	}
}
