package fr.inria.diverse.kompren.explen.eval;

import fr.inria.diverse.kompren.explen.eval.QuestionsPanel.QuestionList;

public class Question {
	protected QuestionList question;
	
	protected String answer;

	protected double time;

	protected long nbMouseDistance;

	protected long nbMousePress;

	protected long nbScrolls;

	protected long nbZooms;

	protected long nbFlat = 0;

	protected long nbUndoRedo = 0;

	protected long nbPruning = 0;

	protected long nbHierachy = 0;


	public Question(QuestionList question) {
		super();
		answer 			= "";
		time 			= -1.;
		nbMouseDistance = 0l;
		nbMousePress 	= 0l;
		nbScrolls 		= 0l;
		nbZooms 		= 0l;
		this.question 	= question;
	}


	public void computeTime(final long startTime, final long endTime) {
		time = (endTime - startTime)/1000.;
	}


	@Override
	public String toString() {
		return question.name() + "\t" + nbFlat + "\t" + nbHierachy + "\t" + nbPruning + "\t" + nbUndoRedo + "\t" +
		nbMouseDistance + "\t" + nbMousePress + "\t" + nbScrolls + "\t" + nbZooms +
		"\t" + time + "\t\"" + answer + "\"\n";
	}


	public void setAnswer(final String answer) {
		this.answer = answer;
	}
}
