package fr.inria.diverse.kompren.explen.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;

import javax.swing.AbstractButton;
import javax.swing.DefaultButtonModel;
import javax.swing.Icon;

public class MPieMenuButton extends AbstractButton {
	private static final long serialVersionUID = 1L;

	protected double buttonWidth;

	protected double angle;

	protected double positionInMenu;

	protected Arc2D path;

	protected MPieMenu pieMenu;



	public MPieMenuButton(final String text) {
		super();
		setBorderPainted(false);
//		setRolloverEnabled(true);
		path = new Arc2D.Double();
		setUI(new MPieMenuButtonUI());
		setModel(new DefaultButtonModel());
		init(text, null);
		setLayout(new PieButtonMenuLayout());
	}


	public MPieMenuButton(final Icon icon) {
		super();
		setBorderPainted(false);
		setRolloverEnabled(true);
		path = new Arc2D.Double();
		setUI(new MPieMenuButtonUI());
		setModel(new DefaultButtonModel());
		init(null, icon);
	}


	public void setButtonWidth(final double width) {
		this.buttonWidth = width;
	}


	public void setAngle(final double angle) {
		this.angle = angle;
	}


	private double computeAngle(final double x, final double y) {
		double a;

		if(Math.abs(x)<0.0001){
			if(y<0.)
				a = 3.*Math.PI/2.;
			else
				a = Math.PI/2.;
		}
		else
			a = x<0. ? Math.PI-Math.atan(-y/x) : Math.atan(y/x);

		return a;
	}



	protected void updatePath() {
		final int nbElts = pieMenu==null?0:pieMenu.getComponentCount();

		switch(nbElts) {
			case 0: return;
			case 1: return;
			default:
				double x1 = buttonWidth*Math.cos(angle*positionInMenu+Math.PI/2.);
				double y1 = buttonWidth*Math.sin(angle*positionInMenu+Math.PI/2.);
				double x2 = buttonWidth*Math.cos(angle*(positionInMenu+1.)+Math.PI/2.);
				double y2 = buttonWidth*Math.sin(angle*(positionInMenu+1.)+Math.PI/2.);
				double tlx = Math.min(0, Math.min(x1, x2));
				double tly = Math.min(0, Math.min(y1, y2));

				double startAngle = Math.toDegrees(2.*Math.PI-computeAngle(x1, y1));
				path = new Arc2D.Double(0, 0, buttonWidth*2., buttonWidth*2., startAngle+(nbElts-2.)*Math.toDegrees(angle), Math.toDegrees(angle), Arc2D.PIE);
				int width = (int)path.getWidth();
				int height = (int)path.getHeight();
				setBounds((int)(tlx+buttonWidth), (int)(tly+buttonWidth), width, height);
				setLocation((int)buttonWidth-width/2, (int)buttonWidth-height/2);
		}
	}


	@Override
	public boolean contains(final int x, final int y) {
		final int nbElts = pieMenu==null?0:pieMenu.getComponentCount();

		switch(nbElts) {
			case 0: return false;
			case 1: return true;
			default :
				double startAngle = (computeAngle(x-buttonWidth, y-buttonWidth)+3.*Math.PI/2.)%(2.*Math.PI);
				int val = (int)(startAngle/angle) - 1;
				if(val<0) val = nbElts + val;
				return val==positionInMenu;
		}
	}


	public double getButtonWidth() {
		return buttonWidth;
	}


	public double getAngle() {
		return angle;
	}


	public void setPositionInMenu(final int positionInMenu) {
		this.positionInMenu = positionInMenu;
	}


	public int getPositionInMenu() {
		return (int) positionInMenu;
	}


	public Arc2D getPath() {
		return path;
	}


	public MPieMenu getPieMenu() {
		return pieMenu;
	}


	public void setPieMenu(final MPieMenu pieMenu) {
		this.pieMenu = pieMenu;
	}
	
	
	private class PieButtonMenuLayout implements LayoutManager2 {
		public PieButtonMenuLayout() {
			super();
		}
		@Override
		public void addLayoutComponent(final String name, final Component comp) {
		}
		@Override
		public void removeLayoutComponent(final Component comp) {
		}
		@Override
		public Dimension preferredLayoutSize(final Container parent) {
			Rectangle rec = path.getBounds();
			return new Dimension((int)rec.getWidth(), (int)rec.getHeight());
		}
		@Override
		public Dimension minimumLayoutSize(final Container parent) {
			return null;
		}

		@Override
		public void layoutContainer(final Container parent) {
			synchronized(MPieMenuButton.this.getTreeLock()) {
				final int nbComp = MPieMenuButton.this.getPieMenu().getComponentCount();
				Component comp;
		        double width  = getWidth();
		        double height = getHeight();
		        
				int x = (int)(width/2.+width/3.2*Math.cos(angle*(positionInMenu+1.)+Math.PI/2.+Math.PI/nbComp));
				int y = (int)(height/2.+height/3.2*Math.sin(angle*(positionInMenu+1.)+Math.PI/2.+Math.PI/nbComp));
				
				for(int i=0; i<MPieMenuButton.this.getComponentCount(); i++) {
					comp = MPieMenuButton.this.getComponent(i);
					comp.setLocation(x-comp.getWidth()/2, y-comp.getHeight()/2);
				}
			}
		}
		@Override
		public void addLayoutComponent(Component arg0, Object arg1) {
		}
		@Override
		public float getLayoutAlignmentX(Container arg0) {
			return 0;
		}
		@Override
		public float getLayoutAlignmentY(Container arg0) {
			return 0;
		}
		@Override
		public void invalidateLayout(Container arg0) {
		}
		@Override
		public Dimension maximumLayoutSize(Container arg0) {
			return null;
		}
	}
}
