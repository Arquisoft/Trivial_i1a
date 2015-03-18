package es.uniovi.asw.trivial;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.uniovi.asw.parser.ParserGIFT;
import es.uniovi.asw.quizStructure.Answer;

public class ParserTest {

	@Test
	public void testParse() {
		String file="Implementation/data/question.gift";
		List<Answer> list = new ArrayList<Answer>();
		
		list.add(new Answer("Hideaki Anno",true));
		list.add(new Answer("Toriyama",false));
		
		ParserGIFT parse = new ParserGIFT(file);
		parse.parse();
		assertEquals(parse.questions.size(), 1);
		assertEquals(parse.questions.get(0).getTitle(), "Title");
		assertEquals(parse.questions.get(0).getAnswers().get(0).getText(), list.get(0).getText());
		assertEquals(parse.questions.get(0).getAnswers().get(1).getText(), list.get(1).getText());


		assertEquals(parse.questions.get(0).getAnswers().get(0).isCorrectAnswer(), list.get(0).isCorrectAnswer());
		assertEquals(parse.questions.get(0).getAnswers().get(1).isCorrectAnswer(), list.get(1).isCorrectAnswer());
		
				
		
	}

}
