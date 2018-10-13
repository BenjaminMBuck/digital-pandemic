package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Main;

public class GameWindow extends JFrame {
	public GameWindow() {
		super("Pandemic");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(1500, 1500);
        setResizable(false);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        add(new ImagePanel("./assets/map.png",1000,1000));
        
        JFrame cardWindow = new JFrame();
        cardWindow.setSize(500,400);
        cardWindow.add(new ImagePanel(Main.infectionDrawPile.get(0).getImagePath(),500,350));
        cardWindow.setVisible(true);
        
        JButton shuffleButton = new JButton("Shuffle");
        shuffleButton.setBounds(1000, 100, 100, 20);
        add(shuffleButton);
        JButton drawButton = new JButton("Draw Card");
        drawButton.setBounds(1000, 200, 100, 20);
        add(drawButton);
        drawButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        JButton randomButton = new JButton("");
        drawButton.setBounds(1000, 200, 100, 20);
        add(randomButton);
        
        //add(panel);
        
        setVisible(true);
	}
}
