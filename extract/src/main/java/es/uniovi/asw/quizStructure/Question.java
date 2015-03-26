package es.uniovi.asw.quizStructure;

import java.util.List;



public class Question {

	//@ObjectId
	public List<Answer> answers;
	
	public String title;
	
	public String category;
	
	public Question(List<Answer> answers, String title, String category) {
		this.answers = answers;
		this.title = title;
		this.category = category;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public String getTitle() {
		return title;
	}
	
	
}
