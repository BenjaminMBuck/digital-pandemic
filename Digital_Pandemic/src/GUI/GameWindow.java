package GUI;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
	public GameWindow() {
		super("Pandemic");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(1500, 1500);
        setResizable(false);
        setLocationRelativeTo(null);
        
        //JPanel panel = new JPanel();
        add(new ImagePanel());
        
        JButton shuffleButton = new JButton("Shuffle");
        add(shuffleButton);
        JButton drawButton = new JButton("Draw Card");
        add(drawButton);
        
        //add(panel);
        
        setVisible(true);
	}
}
