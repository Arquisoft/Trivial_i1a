package es.uniovi.asw.parser;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import es.uniovi.asw.quizStructure.Answer;
import es.uniovi.asw.quizStructure.Question;

public class ParserGIFT implements Parser{
	
	String InputFileName;
	
	//@ObjectId
	List<Question> questions = new ArrayList<Question>();
	
	public ParserGIFT(String InputFileName)
	{
		this.InputFileName = InputFileName;
	}
	
	public List<Question> parse()
	{
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(InputFileName));
			
			String title = "";
			
			List<Answer> answers = new ArrayList<Answer>();
			
			try {
				while (reader.ready())
				{
					
					String CurrentLine = reader.readLine();
					 
					// if we have an '~' this is an incorrect answer.
					if(CurrentLine.contains("~"))
					{
						answers.add(new Answer(CurrentLine.split("~")[1], false));
					}
					
					//if we have an '=' this is an incorrect answer.
					else if(CurrentLine.contains("="))
					{
						answers.add(new Answer(CurrentLine.split("=")[1], true));
					}
					
					// if it contains "::" it's the title of the questioner.
					else if(CurrentLine.contains("::"))
					{
						title = CurrentLine.split("::")[1];
					}
					
					//if it contains "{" it's the start of the question section.
					else if(CurrentLine.contains("{") && title.equals(null))
					{
						title = "";
						answers = new ArrayList<Answer>();
					}
					
					//if it contains "}" it's the end of the question section.
					else if(CurrentLine.contains("}"))
					{
						questions.add(new Question(answers, title));
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return questions;
		
			}
	
	

}