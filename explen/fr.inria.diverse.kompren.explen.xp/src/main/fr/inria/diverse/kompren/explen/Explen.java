package fr.inria.diverse.kompren.explen;

import javax.swing.ToolTipManager;
import javax.swing.UIManager;

import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicerrunner.MainRunner;

import fr.inria.diverse.kompren.explen.ui.ExplenFrame;

public class Explen {
	public static final boolean EVAL = true;
	
	public static void main(final String[] args) {
		MainRunner.init();

		if(System.getProperty("os.name").toLowerCase().contains("linux"))
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			}catch(Exception e) { e.printStackTrace(); }
		if(System.getProperty("os.name").toLowerCase().contains("win"))
			try{
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			}catch(Exception e) { e.printStackTrace(); }

		ExplenFrame frame = new ExplenFrame();
		frame.getComposer().compose(null);
		frame.setVisible(true);
		ToolTipManager.sharedInstance().setInitialDelay(10);
		ToolTipManager.sharedInstance().setDismissDelay(100000);
		frame.getCanvas().requestFocusInWindow();
//		frame.getCanvas().setOperationsVisible(false);
//		frame.getCanvas().update();
	}
}
