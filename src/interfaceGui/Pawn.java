package interfaceGui;

import java.awt.*;

/**
 * @brief this class contain all information about a pawn
 */
public class Pawn{
	
	/*Attributes*/

	private int pawnID;		//number of the case
	private int playerID;	//the Id of the player who control it
	private int width;		//width of the pow
	private int height;		//height of the pow
	
	/*Constructors*/

	/**
	 * @brief default constructor (never use)
	 */
	public Pawn() {}

	/**
	 * @brief only constructor which we use
	 * @param newPlayerID	Id of the player who will control it
	 * @param newPawnID		Id of it
	 * @param width			width
	 * @param height		height
	 */
	public Pawn(int newPlayerID, int newPawnID, int width, int height) {
		this.setPlayerLocation(newPlayerID);
		this.setWidth(width);
		this.setHeight(height);
		this.setPawnID(newPawnID);
	}

	/* Methods */

	/**
	 * @brief give the square which the pow is going to be
	 */
	public void assignHomeSquare() {
		
	}

	/**
	 * @brief set the color and the position of the pow
	 * @param g				grafics
	 * @param x				the x position of the pow
	 * @param y				the y position of the pow
	 * @param playerID		the color of the player
	 */
	public void DrawPawn(Graphics g, int x, int y, int playerID) {
		switch(playerID) {
		case 1:
			g.setColor(Color.BLUE);
			break;
		case 2:
			g.setColor(Color.YELLOW);
			break;
		case 3:
			g.setColor(Color.RED);
			break;
		case 4:
			g.setColor(Color.GREEN);
			break;
		}
		
		g.fillOval(x, y, width-5, height-5);
		g.setColor(Color.BLACK);
		g.drawOval(x, y, width-5, height-5);
	}
	
		
	/*Getters and Setters*/
	
	public int getPlayerLocation() {
		return playerID;
	}

	public void setPlayerLocation(int playerLocation) {
		this.playerID = playerLocation;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPawnID() {
		return pawnID;
	}

	public void setPawnID(int iD) {
		this.pawnID = iD;
	}
}
