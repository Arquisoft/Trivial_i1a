package es.uniovi.asw.quizStructure;

public class Answer 
{
	
	public String text;
	boolean correctAnswer;
	
	public Answer(String text, boolean correctAnswer) {
		this.text = text;
		this.correctAnswer = correctAnswer;
	}

	public String getText() {
		return text;
	}

	public boolean isCorrectAnswer() {
		return correctAnswer;
	}
	
}
