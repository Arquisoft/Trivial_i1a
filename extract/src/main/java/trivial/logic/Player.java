package trivial.logic;

public class Player {
	
	boolean[] score = new boolean[6];

	public boolean[] getScore() {
		return score;
	}

	public void setScore(int category) {
		this.score[category] = true;
	}
	

}
