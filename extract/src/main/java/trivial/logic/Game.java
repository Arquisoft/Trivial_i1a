package trivial.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.JButton;

import trivial.gui.QuestionDialog;
import es.uniovi.asw.quizStructure.Question;


public class Game {
	//Current player playing.
	Player currentPlayer;
	//Players.
	ArrayList<Player> players;
	//Every Category has its questions
	HashMap<Integer, ArrayList<Question>> questionsCategory = new HashMap<Integer, ArrayList<Question>>();
	//All the categories
	int[] categorias;
	private int currentTurn;
	private int roll;
	private JButton[][] board;
	
	public Game(ArrayList<Player> players, List<Question> questions, JButton[][] board) {
		currentTurn = 0;
		this.board = board;
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
	
	public void askQuestion(int category)
	{
		Question q = questionsCategory.get(category).get(0);
		questionsCategory.get(category).remove(0);
		questionsCategory.get(category).add(q);
		
		@SuppressWarnings("unused")
		QuestionDialog qD = new QuestionDialog(q, currentPlayer);
	}
	
	public void nextTurn()
	{
		currentPlayer = nextPlayer();
	}

	private Player nextPlayer() 
	{
		return players.get(next());
	}

	private int next()
	{
		if(currentTurn<4)
			currentTurn++;
		else
			currentTurn = 0;
		
		return currentTurn;
		
	}
	
	@SuppressWarnings("unused")
	private JButton[][] SetMovablePlayer()
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				
				board[i][j].setEnabled(false);
				
				if (i+j == roll && board[i][j]!=null)
				{
					board[i][j].setEnabled(true);
				}
				
			}
			
		}
		
		return board;
	}

	public void movePlayer(JButton destination)
	{
				String[] temp = destination.getName().split("_");
				int i = Integer.parseInt(temp[1]);
				int j = Integer.parseInt(temp[2]);
		
		currentPlayer.setX(i);
		currentPlayer.setY(j);
		
		
	}
		
	
	public void getRoll() 
	{
		Random rn = new Random();
		int maximum=6;
		int minimum=1;
		int n = maximum - minimum + 1;
		int i = rn.nextInt() % n;
		roll =  minimum + i;
	}	
	
}
