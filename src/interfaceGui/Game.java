package interfaceGui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private interfaceGui.Layout layout;
	private Path path;
	private List<Player> players;
	
	public Game() {
		this.layout = new interfaceGui.Layout(30,30,100);
		this.setPath(new Path());
		
		this.players = new ArrayList<Player>(4);
		
		this.players.add(new Player(1, 30, 30));
		this.players.add(new Player(2, 30, 30));
		this.players.add(new Player(3, 30, 30));
		this.players.add(new Player(4, 30, 30));
	}

	public void paint(Graphics g) {
		this.layout.draw(g);
		for(Player player : players) {
			player.DrawPlayer(g, player);
		}
		
	}
	
	
	

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}
}
