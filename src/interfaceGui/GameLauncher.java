package interfaceGui;

import javax.swing.*;
import java.awt.*;

public class GameLauncher extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		jframe.setTitle("Ludo interfaceGui.Game");
		jframe.setSize(1000,700);
		jframe.setBackground(Color.WHITE);
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Game g = new Game();
		
		jframe.add(g);
		jframe.setVisible(true);
		
	}
}
