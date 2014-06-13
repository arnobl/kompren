package fr.inria.diverse.kompren.explen.eval;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.malai.swing.widget.MToolBar;

import fr.inria.diverse.kompren.explen.actions.ReinitView;
import fr.inria.diverse.kompren.explen.instruments.Completioner;
import fr.inria.diverse.kompren.explen.ui.ExplenFrame;
import fr.inria.diverse.kompren.explen.view.ClassView;
import fr.inria.diverse.kompren.explen.view.ModelViewMapper;

public class QuestionsPanel extends JPanel {
	public static final TypeEval TYPE_EVAL = TypeEval.WITH_VISU_TOOLS;
	public static final String END_MSG = "---END---";

	public enum TypeEval {
		WITH_VISU_TOOLS,
		WITHOUT_VISU_TOOLS
	}
	
	public enum QuestionList {
		T1A_UML{
			@Override public String getTitle() { return "<html><font size=\"6\">If you have to create an instance of the class <b>Operation</b> corresponding to the operation <b>Double add(Double value)</b>, what would be the other concrete classes of the metamodel to instantiate?</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Operation"; }
		},
		T1A_RAM{
			@Override public String getTitle() { return "<html><font size=\"6\">If you have to create an instance of the class <b>Operation</b> corresponding to the operation <b>Double add(Double value)</b>, what would be the other concrete classes of the metamodel to instantiate?</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Operation"; }
		},
		T1B_UML{
			@Override public String getTitle() { return "<html><font size=\"6\">If you have to create an instance of the class <b>ConditionalNode</b>, what would be the mandatory concrete classes in relation with <b>ConditionalNode</b> that must be also instantiated?</font></html>"; }
			@Override public String getHelper() { return "<html><font size=\"5\">The concept of mandatory classes has been explained during the tutorial and are summarised in the drawings sketched on the whiteboard.</font></html>"; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.ConditionalNode"; }
		},
		T1B_RAM{
			@Override public String getTitle() { return "<html><font size=\"6\">If you have to create an instance of the class <b>Message</b>, what would be the mandatory concrete classes in relation with <b>Message</b> that must be also instantiated?</font></html>"; }
			@Override public String getHelper() { return "<html><font size=\"5\">The concept of mandatory classes has been explained during the tutorial and are summarised in the drawings sketched on the whiteboard.</font></html>"; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Message"; }
		},
		T2A_UML{
			@Override public String getTitle() { return "<html><font size=\"6\">List the name of the abstract<br> classes in the super class hierarchy of <b>FlowFinalNode</b> that are not<br> doing much (i.e. that do not contain attributes, operations, and output references/compositions) and that can be removed</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.FlowFinalNode"; }
		},
		T2A_RAM{
			@Override public String getTitle() { return "<html><font size=\"6\">List the name of the abstract classes in the super class hierarchy of <b>Class</b> that are not doing much (i.e. that do not contain attributes, operations, and output references/compositions) and that can be removed</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Class"; }
		},
		T2B_UML{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of the redundant attribute (direct or inherited) of the class <b>Device</b> (i.e. same name and type)</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Device"; }
		},
		T2B_RAM{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of the redundant attribute (direct or inherited) of the class <b>Reference</b> (i.e. same name and type)</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Reference"; }
		},
		T3A_UML{
			@Override public String getTitle() { return "<html><font size=\"6\">The classes <b>Actor</b> and <b>Trigger</b> are coupled only by one unique reference via another class. Give the name of this reference that would make these classes independent if removed</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Actor"; }
		},
		T3A_RAM{
			@Override public String getTitle() { return "<html><font size=\"6\">The classes <b>Aspect</b> and <b>Type</b> are coupled only by one unique reference via another class. Give the name of this reference that would make these classes independent if removed</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Aspect"; }
		},
		T3B_UML{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of at least one class that has a high number of incoming and a high number of outgoing references compared to the other classes</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Class"; }
		},
		T3B_RAM{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of at least one class that has a high number of incoming and a high number of outgoing references compared to the other classes</font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Class"; }
		},
		T4A_UML{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of at least one intermediate class between the class <b>State</b> to the class <b>Transition</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.State"; }
		},
		T4A_RAM{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of at least one intermediate class between the class <b>LifeLine</b> to the class <b>FragmentContainer</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.Aspect"; }
		},
		T4B_UML{
			@Override public String getTitle() { return "<html><font size=\"6\">Enumerate the name of all the attributes (direct or inherited) of the class <b>Feature</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.UML; }
			@Override public String getInitialClassToFocusOn() { return "uml.Feature"; }
		},
		T4B_RAM{
			@Override public String getTitle() { return "<html><font size=\"6\">Enumerate the name of all the attributes (direct or inherited) of the class <b>RInt</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.RAM; }
			@Override public String getInitialClassToFocusOn() { return "ram.RInt"; }
		},
		TUTORIAL1{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of the super and lower classes of the class <b>State</b></font></html>"; }
			@Override public String getHelper() { return "Use the super/sub classes features.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.State"; }
		},
		TUTORIAL2{
			@Override public String getTitle() { return "<html><font size=\"6\">What are the classes linked, directly or undirectly, by composition to the class <b>Interaction</b></font></html>"; }
			@Override public String getHelper() { return "Use the pruning+composition feature.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.Interaction"; }
		},
		TUTORIAL3{
			@Override public String getTitle() { return "<html><font size=\"6\">What are the classes linked, directly or undirectly, to the class <b>Interaction</b> by relations which min cardinality equals 1</font></html>"; }
			@Override public String getHelper() { return "Use the pruning+card1 feature.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.Interaction"; }
		},
		TUTORIAL4{
			@Override public String getTitle() { return "<html><font size=\"6\">What are the classes <b>directly</b> linked to the class <b>State</b></font></html>"; }
			@Override public String getHelper() { return "Use the pruning+radius feature.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.State"; }
		},
		TUTORIAL5{
			@Override public String getTitle() { return "<html><font size=\"6\">What are the name of the attributes, native or inherited, of the class <b>AbortingState</b></font></html>"; }
			@Override public String getHelper() { return "Use the flattening feature.<br>Look at the tutorial document to see how to proceed."; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.AbortingState"; }
		},
		TUTORIAL6{
			@Override public String getTitle() { return "<html><font size=\"6\">Gives the name of all the classes in relation (direct or undirect) with the class <b>Transition</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.Transition"; }
		},
		TUTORIAL7{
			@Override public String getTitle() { return "<html><font size=\"6\">Give the name of the attributes (inherited or native) of the class <b<Interaction</b></font></html>"; }
			@Override public String getHelper() { return ""; }
			@Override public Metamodel getMetamodel() { return Metamodel.INTERACTION; }
			@Override public String getInitialClassToFocusOn() { return "malaiInteraction.Interaction"; }
		};
		
		public abstract String getTitle();
		public abstract Metamodel getMetamodel();
		public abstract String getHelper();
		public abstract String getInitialClassToFocusOn();
		public static QuestionList getQuestion(String q) {
			QuestionList[] val = values();
			for(int i=0; i<val.length; i++)
				if(val[i].name().equals(q))
					return val[i];
			return null;
		}
	}
	
	public enum Metamodel {
		UML,
		RAM,
		INTERACTION
	}
	
	protected boolean isTutorial = false;
	
	protected boolean questionsAreEnding;
	
	private static final long serialVersionUID = 1L;

	protected EditorPaneHTML questionArea;

	protected EditorPaneHTML answerArea;

	protected int currentNbQuestions;

	protected JLabel questionLabel;

	protected JLabel answerLabel;

	protected EditorPaneHTML helperLabel;

	protected MToolBar toolbar;

	protected JButton startButton;

	protected JButton answerButton;

	protected EditorPaneHTML resultField;

	protected EditorPaneHTML resultLabel;

	protected List<Question> questions;

	protected long currentTime;

	protected Sniffer sniffer;

	protected String userInformations;

	protected ExplenFrame frame;

	protected Formular formular;
	

	public QuestionsPanel(final ExplenFrame frame, final MToolBar toolbar) {
		super();

		this.frame 		= frame;
		this.toolbar	= toolbar;
		userInformations= "";
		sniffer 		= new Sniffer(frame);
		questions 		= new ArrayList<>();
		currentNbQuestions = -1;

		resultLabel = new EditorPaneHTML(true);
		resultLabel.setEditable(false);
		resultLabel.setAlignmentX(CENTER_ALIGNMENT);
		resultLabel.setMaximumSize(new Dimension(500, 80));

		resultField = new EditorPaneHTML(false);
		resultField.setEditable(false);
		resultField.setBackground(Color.WHITE);

		startButton = new JButton("<html><font size=\"+2\"><b>Start</b></font></html>");
		startButton.setAlignmentX(CENTER_ALIGNMENT);
		startButton.addActionListener(new ShowAnswerFieldListener());
		startButton.setMaximumSize(new Dimension(120, 50));
		startButton.setFocusable(false);

		answerButton = new JButton("<html><font size=\"+2\"><b>Validate Answer</b></font></html>");
		answerButton.setAlignmentX(CENTER_ALIGNMENT);
		answerButton.addActionListener(new ShowQuestionFieldListener());
		answerButton.setMaximumSize(new Dimension(230, 50));
		answerButton.setFocusable(false);
		questionLabel = new JLabel();
		questionLabel.setAlignmentX(CENTER_ALIGNMENT);
		questionLabel.setMaximumSize(new Dimension(280, 40));
		questionLabel.setFocusable(false);
		answerLabel = new JLabel();
		answerLabel.setText("<html><font size=\"+1\"><b>Answer</b></font></html>");
		answerLabel.setAlignmentX(CENTER_ALIGNMENT);
		answerLabel.setMaximumSize(new Dimension(120, 40));
		answerLabel.setFocusable(false);

		answerArea = new EditorPaneHTML(false);
        answerArea.setPreferredSize(new Dimension(380, 250));
		answerArea.setMaximumSize(new Dimension(380, 250));
		answerArea.setAlignmentX(CENTER_ALIGNMENT);
		answerArea.setBackground(Color.WHITE);

		helperLabel = new EditorPaneHTML(true);
		helperLabel.setPreferredSize(new Dimension(380, 130));
		helperLabel.setMaximumSize(new Dimension(380, 130));
		helperLabel.setAlignmentX(CENTER_ALIGNMENT);
		helperLabel.setBackground(Color.WHITE);
		helperLabel.setEditable(false);

		questionArea = new EditorPaneHTML(true);
		questionArea.setBackground(Color.WHITE);
		questionArea.setEditable(false);
		questionArea.setEditable(false);
		questionArea.setPreferredSize(new Dimension(380, 250));
		questionArea.setMaximumSize(new Dimension(380, 250));
		questionArea.setSize(new Dimension(380, 250));
		questionArea.setAlignmentX(CENTER_ALIGNMENT);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(questionLabel);
		add(questionArea);
		add(Box.createVerticalStrut(3));
		add(helperLabel);
		add(Box.createVerticalStrut(10));
		add(resultLabel);
		add(startButton);
		add(Box.createVerticalStrut(15));
		add(answerLabel);
		add(answerArea);
		add(Box.createVerticalStrut(10));
		add(answerButton);
		add(resultField);
		resultLabel.setVisible(false);
		resultField.setVisible(false);
		initQuestions();
		setNextQuestion(false);
	}
	
	
	public void setFormular(Formular f) {
		formular = f;
	}


	public void initQuestions() {
		Path confFile = Paths.get("target/classes/config/config.txt");
		try {
			List<String> conf = Files.readAllLines(confFile, Charset.defaultCharset());
			if(conf.size()==1) {
				String[] questionsTxt = conf.get(0).split(" ");
				QuestionList q;
				
				switch(questionsTxt[0]) {
					case "S": questionsAreEnding = false; break; // Starting the XP.
					case "E": questionsAreEnding = true; break; // Ending the XP (the questionnaire will be asked at the end of the XP).
					case "U": questionsAreEnding = true; break; // Unique
					case "T": questionsAreEnding = true; isTutorial = true; break; // Tutorial
				}
				
				String t1 = "<html><center><b>Thank you!</b>";
				String t2 = "<br>A backup of the results called \"data.txt\"<br>has been created near the jar file you launch.</center></html>";
				
				if(questionsAreEnding)
					resultLabel.setText(t1 + t2);
				else
					resultLabel.setText(t1 + "<br><b>Now, use the ecoreDiag editor (eclipse) to complete the experiment.</b>" + t2);

				for(int i=1; i<questionsTxt.length; i++) {
					q = QuestionList.getQuestion(questionsTxt[i]);
					if(q==null) throw new NullPointerException(questionsTxt[i] + " is not a question.");
					questions.add(new Question(q));
				}
				
				Path dataFile = Paths.get("./data.txt");
				StringBuilder res = new StringBuilder();

				if(Files.exists(dataFile)) {
					List<String> linesRes = Files.readAllLines(dataFile, Charset.defaultCharset());
					if(!linesRes.isEmpty() && !linesRes.get(linesRes.size()-1).equals(END_MSG)) {
						for(String line : linesRes)
							res.append(line).append('\n');
						resultField.setText(res.toString());
						
						for(Question question : questions)
							if(existsLineStartingWith(linesRes, question.question.name()))
								currentNbQuestions++;
					}
				}
			}
		}catch(IOException e) { e.printStackTrace(); }
	}
	
	
	private boolean existsLineStartingWith(List<String> linesRes, String name) {
		for(String line : linesRes)
			if(line.startsWith(name))
				return true;
		return false;
	}


	public void setNextQuestion(boolean serialise) {
		ReinitView action = new ReinitView();
		action.setModelView(frame.getCanvas());
		if(action.canDo())
			action.doIt();

		if(currentNbQuestions>=0 && serialise) {
			resultField.setText(resultField.getText() + questions.get(currentNbQuestions) + "\n");
			saveResults();
		}
		
		currentNbQuestions++;
		if(currentNbQuestions<questions.size())
			setQuestionMode(questions.get(currentNbQuestions));
	}
	

	public void setQuestionMode(final Question question) {
		if(currentNbQuestions<1 ||
			(currentNbQuestions>0 && question.question.getMetamodel()!=questions.get(currentNbQuestions-1).question.getMetamodel()))
			ModelViewMapper.getMapper().build("src/resources/examples/"+question.question.getMetamodel().name()+".km");
		
		sniffer.setQuestion(null);
		questionArea.setText(question.question.getTitle());
		if(isTutorial)
			questionLabel.setText("<html><font size=\"+1\"><b>Question " + (currentNbQuestions+1) + "/" + questions.size() + " -- Tutorial</b></font></html>");
		else
			questionLabel.setText("<html><font size=\"+1\"><b>Question " + (currentNbQuestions+1) + "/" + questions.size() + " -- " +
				questions.get(currentNbQuestions).question.getMetamodel() + " metamodel</b></font></html>");
		startButton.setVisible(true);
		answerArea.setVisible(false);
		answerLabel.setVisible(false);
		answerButton.setVisible(false);
		frame.setActivated(false);
		toolbar.setVisible(false);
		helperLabel.setText(question.question.getHelper());
		helperLabel.setVisible(question.question.getHelper()!=null && question.question.getHelper().length()>0);
	}
	

	public void setAnswerMode() {
		sniffer.setQuestion(questions.get(currentNbQuestions));
		startButton.setVisible(false);
		answerArea.setText("");
		answerArea.setVisible(true);
		answerLabel.setVisible(true);
		answerButton.setVisible(true);
		frame.setActivated(true);
		toolbar.setVisible(true);

        Runnable moveScrollbars = new Runnable() {
            @Override
			public void run() {
        		final ClassView cv = ModelViewMapper.getMapper().getClassView(questions.get(currentNbQuestions).question.getInitialClassToFocusOn());
        		if(cv==null)
        			System.err.println("CLASS NOT FOUND: " + questions.get(currentNbQuestions).question.getInitialClassToFocusOn() + " in QuestionPanel");
        		else {
	        		final Point pt = Completioner.Interaction2MoveCamera.getMoveCameraToPoint(cv, frame.getCanvas().getZoom(), frame.getCanvas().getScrollpane());
	            	frame.getCanvas().getScrollpane().getHorizontalScrollBar().setValue(pt.x);
	            	frame.getCanvas().getScrollpane().getVerticalScrollBar().setValue(pt.y);
        		}
            }
        };

        SwingUtilities.invokeLater(moveScrollbars);
	}


	public void setTerminated() {
		startButton.setVisible(false);
		answerArea.setVisible(false);
		answerLabel.setVisible(false);
		answerButton.setVisible(false);
		frame.setActivated(false);
		toolbar.setVisible(false);
		questionArea.setVisible(false);
		questionLabel.setVisible(false);
		setVisible(false);
		if(questionsAreEnding)
			formular.setVisible(true);
		else
			setTerminated2();
		frame.pack();
	}
	
	public void setTerminated2() {
		setVisible(true);
		resultField.setVisible(true);
		resultLabel.setVisible(true);
		Dimension dim = new Dimension(380, 500);
		resultField.setPreferredSize(dim);
		resultField.setMinimumSize(dim);
		
		if(isTutorial)
			resultField.setText("");
		else {
			if(!questions.isEmpty())
				resultField.setText(resultField.getText() + questions.get(questions.size()-1) + "\n");
			
			resultField.setText(resultField.getText() + "\n" + TYPE_EVAL + "\n" + userInformations + "\n" + END_MSG);
		}
		frame.pack();
		saveResults();
	}
	
	
	protected void saveResults() {
		if(!isTutorial)
			try {
				try(FileWriter fw = new FileWriter("./data.txt");
					PrintWriter out = new PrintWriter(fw)) {
					out.print(resultField.getText());
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
	}

	class ShowAnswerFieldListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			QuestionsPanel.this.currentTime = System.currentTimeMillis();
			QuestionsPanel.this.setAnswerMode();
			frame.getCanvas().requestFocusInWindow();
		}
	}


	class ShowQuestionFieldListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			final boolean hasNextQuestion = QuestionsPanel.this.currentNbQuestions+1<QuestionsPanel.this.questions.size();
			final Question question = hasNextQuestion ? QuestionsPanel.this.questions.get(QuestionsPanel.this.currentNbQuestions) :
														QuestionsPanel.this.questions.get(QuestionsPanel.this.questions.size()-1);

			question.computeTime(QuestionsPanel.this.currentTime, System.currentTimeMillis());
			question.setAnswer(QuestionsPanel.this.answerArea.getText());

			if(hasNextQuestion)
				QuestionsPanel.this.setNextQuestion(true);
			else
				QuestionsPanel.this.setTerminated();
			frame.getCanvas().requestFocusInWindow();
		}
	}


	public void setUserInformations(final String userInformations) {
		this.userInformations = userInformations;
	}
}


class EditorPaneHTML extends JEditorPane {
	private static final long serialVersionUID = 1L;

	public EditorPaneHTML(final boolean html) {
		super(html ? "text/html" : "text", "");
	}
}
