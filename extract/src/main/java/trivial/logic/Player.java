package trivial.logic;

public class Player {
	
	boolean[] score = new boolean[6];
	int x=0;
	int y=0;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean[] getScore() {
		return score;
	}

	public void setScore(int category) {
		this.score[category] = true;
	}
	

}
