package es.uniovi.asw.quizStructure;

import org.mongojack.ObjectId;

public class Answer 
{
	
	@ObjectId
	String text;
	
	@ObjectId
	boolean correctAnswer;
	
	public Answer(String text, boolean correctAnswer) {
		this.text = text;
		this.correctAnswer = correctAnswer;
	}
	
}
