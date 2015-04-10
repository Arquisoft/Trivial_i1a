package es.uniovi.asw.quizStructure;

import java.util.List;



public class Question {

	//@ObjectId
	public List<Answer> answers;
	
	public String title;
	public int category;
	
	
	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Question(List<Answer> answers, String title, int category) {
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

	public String getTrueAnswer() {
		for(Answer each: answers)
		{
			if(each.isCorrectAnswer())
				return each.getText();
			
		}
		
		return null;
	}
	
	
}
