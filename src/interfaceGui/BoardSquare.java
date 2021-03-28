package interfaceGui;

import java.util.ArrayList;
import java.util.List;

public class BoardSquare {
	
	/* Attributes */
	private int iD;
	private int xOnBoard;
	private int yOnBoard;
	private int nbPawnOn;
	private List<interfaceGui.Pawn> listPawn;
	
	
	/* Constructor */
	public BoardSquare(int NewXOnBoard, int NewYOnBoard, int iD) {
		this.setiD(iD);
		this.setxOnBoard(NewXOnBoard);
		this.setyOnBoard(NewYOnBoard);
		this.nbPawnOn = 0;
		this.listPawn = new ArrayList<interfaceGui.Pawn>(2);
	}
	
	
	/* Methods */
	public void AddPawn(interfaceGui.Pawn pawn) {
		this.listPawn.add(pawn);
		this.nbPawnOn++;
	}
	
	public int HowManyPawn() {
		return this.nbPawnOn;
	}
	
	public boolean PossibleToAddPawn() {
		return this.nbPawnOn < 2;
	}

	public String ToString() {
		return "iD = "+this.getiD();
	}
	
	
	/*Getters and Setters*/
	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}


	public int getxOnBoard() {
		return xOnBoard;
	}


	public void setxOnBoard(int xOnBoard) {
		this.xOnBoard = xOnBoard;
	}


	public int getyOnBoard() {
		return yOnBoard;
	}


	public void setyOnBoard(int yOnBoard) {
		this.yOnBoard = yOnBoard;
	}
}
