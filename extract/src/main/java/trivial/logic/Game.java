package trivial.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.uniovi.asw.quizStructure.Question;


public class Game {
	//Players
	ArrayList<Player> players;
	//Every Category has its questions
	HashMap<Integer, ArrayList<Question>> questionsCategory = new HashMap<Integer, ArrayList<Question>>();
	//All the categories
	int[] categorias;
	
	public Game(ArrayList<Player> players, List<Question> questions) {
		
		this.players = players;
		for(int i = 1; i<6; i++)
		{
			ArrayList<Question> temp = new ArrayList<Question>();
			
			questionsCategory.put(i, temp);
		}
		
		for(Question each: questions)
		{
			questionsCategory.put(each.category, questionsCategory.get(each.category));
		}
	}
	
	public void addPlayerPoint(int category, Player player)
	{
		player.setScore(category);
	}
	
	
	
	
	
	
	
	
}
