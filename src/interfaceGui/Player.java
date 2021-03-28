
package interfaceGui;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @brief It's the class which contain all player's information
 */
public class Player {

    /*Attributes*/
    int w = 30, h = 30, offset = 100;
    private int playerID;									// color of the player
    private List<interfaceGui.Pawn> pawn;					//List of all pawn of the player
    private List<interfaceGui.BoardSquare> homeSquare;		//List of the 4 first squares of the player
    private interfaceGui.BoardSquare startSquare;			//The square where the player start
    private List<interfaceGui.BoardSquare> endSquare;		//List of all final squares



    /*Constructors*/

	/**
	 * @brief the default constructor (never use)
	 */
    public Player() {

    }

	/**
	 * @brief the only use constructor
	 * @param newPlayerID	Id of the player
	 * @param width
	 * @param height
	 */
    public Player(int newPlayerID, int width, int height) {

        this.setPlayerID(newPlayerID);
			//creation of the 4 pawns
        this.pawn = new ArrayList<interfaceGui.Pawn>(4);
        this.pawn.add(new interfaceGui.Pawn(this.getPlayerID(), 1, width, height));
        this.pawn.add(new interfaceGui.Pawn(this.getPlayerID(), 2, width, height));
        this.pawn.add(new interfaceGui.Pawn(this.getPlayerID(), 3, width, height));
        this.pawn.add(new interfaceGui.Pawn(this.getPlayerID(), 4, width, height));

        //creation of the list of start squares
        this.homeSquare = new ArrayList<interfaceGui.BoardSquare>(4);

        //creation of squares according to the player's color
        switch (this.getPlayerID()) {
            case 1:
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (3 * w) / 2, offset + (3 * h) / 2, 101));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (7 * w) / 2, offset + (3 * h) / 2, 102));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (3 * w) / 2, offset + (7 * h) / 2, 103));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (7 * h) / 2, offset + (7 * h) / 2, 104));
                break;
            case 2:
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (3 * w) / 2 + 9 * w, offset + (3 * h) / 2, 201));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (7 * w) / 2 + 9 * w, offset + (3 * h) / 2, 202));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (3 * w) / 2 + 9 * w, offset + (7 * h) / 2, 203));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (7 * w) / 2 + 9 * w, offset + (7 * h) / 2, 204));
                break;
            case 3:
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (3 * w) / 2 + 9 * w, offset + (3 * h) / 2 + 9 * h, 301));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (7 * w) / 2 + 9 * w, offset + (3 * h) / 2 + 9 * h, 302));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (3 * w) / 2 + 9 * w, offset + (7 * h) / 2 + 9 * h, 303));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (7 * w) / 2 + 9 * w, offset + (7 * h) / 2 + 9 * h, 304));
                break;
            case 4:
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (3 * w) / 2, offset + (3 * h) / 2 + 9 * h, 401));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (7 * w) / 2, offset + (3 * h) / 2 + 9 * h, 402));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (3 * w) / 2, offset + (7 * h) / 2 + 9 * h, 403));
                this.homeSquare.add(new interfaceGui.BoardSquare(offset + (7 * h) / 2, offset + (7 * h) / 2 + 9 * h, 404));
                break;
        }


    }

    public void DrawPlayer(Graphics g, Player player) {
        switch (player.playerID) {
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
        g.fillRect(player.homeSquare.get(0).getxOnBoard(), player.homeSquare.get(0).getyOnBoard(), w, h);
        g.fillRect(player.homeSquare.get(1).getxOnBoard(), player.homeSquare.get(1).getyOnBoard(), w, h);
        g.fillRect(player.homeSquare.get(2).getxOnBoard(), player.homeSquare.get(2).getyOnBoard(), w, h);
        g.fillRect(player.homeSquare.get(3).getxOnBoard(), player.homeSquare.get(3).getyOnBoard(), w, h);
    }





    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerNumber) {
        this.playerID = playerNumber;
    }
}
