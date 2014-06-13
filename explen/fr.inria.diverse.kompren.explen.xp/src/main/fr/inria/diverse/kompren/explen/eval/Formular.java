package fr.inria.diverse.kompren.explen.eval;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

public class Formular extends JPanel {
	private static final long serialVersionUID = 1L;

	protected QuestionsPanel questionsPanel;

	protected JFrame frame;

	protected JComboBox<String> mouse;

	protected JSpinner ageS;

//	protected JTextField name;

	protected JSpinner screen;

//	protected JComboBox<String> sexCB;

	protected JComboBox<String> statusCB;

	protected JComboBox<String> xpMdeCB;

	protected JComboBox<String> xpUmlCB;
	protected JComboBox<String> xpRAMCB;

	protected JButton validateB;


	public Formular(final QuestionsPanel questionsPanel, final JFrame frame) {
		super();
		this.frame			= frame;
		this.questionsPanel = questionsPanel;
		createFormular();
	}



	protected void createFormular() {
  		GridBagConstraints constraint = new GridBagConstraints();
    	constraint.gridx = 0;  		constraint.gridy = 0;
     	constraint.gridwidth = 1; 	constraint.gridheight = 1;
     	constraint.weightx = 0.1; 	constraint.weighty = 0.1;
     	constraint.fill = GridBagConstraints.HORIZONTAL;
     	constraint.anchor = GridBagConstraints.WEST;

     	JPanel questionsP = new JPanel();
     	questionsP.setBorder(new TitledBorder("Required Information"));
     	questionsP.setLayout(new GridBagLayout());

		questionsP.add(new JLabel("Mouse/touchpad:"), constraint);
		constraint.gridx++;

		mouse = new JComboBox<>(new String[]{"Mouse", "Touchpad"});
		mouse.setSelectedIndex(0);
		questionsP.add(mouse, constraint);
		constraint.gridx=0;
		constraint.gridy++;

     	questionsP.add(new JLabel("Screen size (inch):"), constraint);
     	constraint.gridx++;

		screen = new JSpinner(new SpinnerNumberModel(15, 1, 50, 1));
		questionsP.add(screen, constraint);
		constraint.gridx=0;
		constraint.gridy++;

//		questionsP.add(new JLabel("Name:"), constraint);
//		constraint.gridx++;
//
//		name = new JTextField();
//		questionsP.add(name, constraint);
//		constraint.gridx=0;
//		constraint.gridy++;

     	questionsP.add(new JLabel("Age:"), constraint);
     	constraint.gridx++;

		ageS = new JSpinner(new SpinnerNumberModel(30, 1, 200, 1));
		questionsP.add(ageS, constraint);
		constraint.gridx=0;
		constraint.gridy++;

//		questionsP.add(new JLabel("Gender:"), constraint);
//		constraint.gridx++;
//
//		sexCB = new JComboBox<String>(new String[]{"Male", "Female"});
//		questionsP.add(sexCB, constraint);
//		constraint.gridx=0;
//		constraint.gridy++;

		questionsP.add(new JLabel("Status:"), constraint);
		constraint.gridx++;

		statusCB = new JComboBox<>(new String[]{"Researcher", "Industrial", "Research engineer", "Ph.D. student", "Other"});
		questionsP.add(statusCB, constraint);
		constraint.gridx=0;
		constraint.gridy++;

		questionsP.add(new JLabel("MDE background:"), constraint);
		constraint.gridx++;

		xpMdeCB = new JComboBox<>(new String[]{"Expert", "Proficient", "Competent", "Advanced beginner", "Novice"});
		questionsP.add(xpMdeCB, constraint);
		constraint.gridx=0;
		constraint.gridy++;

		questionsP.add(new JLabel("UML background:"), constraint);
		constraint.gridx++;

		xpUmlCB = new JComboBox<>(new String[]{"Expert", "Proficient", "Competent", "Advanced beginner", "Novice"});
		questionsP.add(xpUmlCB, constraint);
		constraint.gridx=0;
		constraint.gridy++;
		
		questionsP.add(new JLabel("RAM background:"), constraint);
		constraint.gridx++;
		
		xpRAMCB = new JComboBox<>(new String[]{"Expert", "Proficient", "Competent", "Advanced beginner", "Novice"});
		questionsP.add(xpRAMCB, constraint);
		constraint.gridx=0;
		constraint.gridy++;

		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		JPanel buttonP = new JPanel();
		validateB = new JButton("Validate");
		buttonP.add(validateB);
		validateB.addActionListener(new ValideListener());

		add(questionsP);
		add(buttonP);
	}


	class ValideListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			Formular.this.setVisible(false);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			Formular.this.frame.setLocation((dim.width-Formular.this.frame.getWidth())/2,
											(dim.height-Formular.this.frame.getHeight())/2);
			Formular.this.questionsPanel.setUserInformations(
											ageS.getValue().toString() + "\t" +
											statusCB.getSelectedItem().toString() +
					"\t" + xpMdeCB.getSelectedItem().toString() + "\t" + xpUmlCB.getSelectedItem().toString() +
					"\t" + xpRAMCB.getSelectedItem().toString() +
					"\t" + mouse.getSelectedItem().toString() + "\t" + screen.getValue().toString() +
					"\t" + dim.width + "\t" + dim.height);
			Formular.this.questionsPanel.setTerminated2();
			Formular.this.frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		}

	}
}
