package es.uniovi.asw.parser;

import java.io.IOException;
import java.util.List;

import es.uniovi.asw.quizStructure.Question;

public interface Parser 
{
	public List<Question> parse() throws IOException;
}
