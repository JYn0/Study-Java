package bm;

import java.util.Random;

public class Game {
	public int gnd[][] = new int[8][8];
	private int dice;
	{
		Random r = new Random();
		for(int i=0; i<gnd.length;i++) {
			for(int j=0; j<gnd.length;j++)
				gnd[i][j] = r.nextInt(10)+1;
		}
		for(int i=1;i<gnd.length-1;i++) {
			for(int j=1; j<gnd.length-1;j++) {
				gnd[i][j] = 0;
			}
		}
	}
	public Game() {
	}

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}
	
	public void Action(int dice) {
		
	}
	public boolean BuyOrNot() {
		return false;
	}
	public void Pay() {
		
	}
	
}
