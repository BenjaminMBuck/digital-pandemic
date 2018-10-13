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
        shuffleButton.setBounds(1000, 100, 100, 20);
        add(shuffleButton);
        JButton drawButton = new JButton("Draw Card");
        drawButton.setBounds(1000, 200, 100, 20);
        add(drawButton);
        JButton randomButton = new JButton("");
        drawButton.setBounds(1000, 200, 100, 20);
        add(randomButton);
        
        //add(panel);
        
        setVisible(true);
	}
}
