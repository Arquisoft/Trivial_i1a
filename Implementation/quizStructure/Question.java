package quizStructure;

import java.util.List;

public class Question {

	public List<Answer> answers;
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
