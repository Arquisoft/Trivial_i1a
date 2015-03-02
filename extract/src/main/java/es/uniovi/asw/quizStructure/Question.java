package es.uniovi.asw.quizStructure;

import java.util.List;

import org.mongojack.ObjectId;

public class Question {

	@ObjectId
	public List<Answer> answers;
	
	@ObjectId
	public String title;
	
	public Question(List<Answer> answers, String title) {
		this.answers = answers;
		this.title = title;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public String getTitle() {
		return title;
	}
	
	
}
