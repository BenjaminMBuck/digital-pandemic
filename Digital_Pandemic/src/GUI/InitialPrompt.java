package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class InitialPrompt
{
    private JDialog dialog;
    JPanel panel;
    
    JRadioButton twoPlayer;
    JRadioButton threePlayer;
    JRadioButton fourPlayer;
    
    JRadioButton fourEpidemic;
    JRadioButton fiveEpidemic;
    JRadioButton sixEpidemic;

    private String title;
    private int width, height;

    public InitialPrompt()
    {
        this.title="Pandemic";
        this.width=500;
        this.height=300;
        

        createDisplay();
    }

    private void createDisplay()
    {
    	JFrame f = new JFrame();
        dialog = new JDialog(f, "Pandemic", true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(width, height);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        
        panel = new JPanel();
        
        JLabel numPlayerPromptText = new JLabel("Choose the number of players.");
        panel.add(numPlayerPromptText);
        
        ButtonGroup numPlayers = new ButtonGroup();
        
        twoPlayer = new JRadioButton("Two Players");
        threePlayer = new JRadioButton("Three Players");
        fourPlayer = new JRadioButton("Four Players");
        
        numPlayers.add(twoPlayer);
        numPlayers.add(threePlayer);
        numPlayers.add(fourPlayer);
        
        twoPlayer.setSelected(true);
        
        panel.add(twoPlayer);
        panel.add(threePlayer);
        panel.add(fourPlayer);
        
        
        
        JLabel numEpidemicsPromptText = new JLabel("Choose the number of epidemics.");
        panel.add(numEpidemicsPromptText);
        
        
        ButtonGroup numEpidemic = new ButtonGroup();
        
        fourEpidemic = new JRadioButton("Four Epidemics");
        fiveEpidemic = new JRadioButton("Five Epidemics");
        sixEpidemic = new JRadioButton("Six Epidemics");
        
        numEpidemic.add(fourEpidemic);
        numEpidemic.add(fiveEpidemic);
        numEpidemic.add(sixEpidemic);
        
        fourEpidemic.setSelected(true);
        
        panel.add(fourEpidemic);
        panel.add(fiveEpidemic);
        panel.add(sixEpidemic);
        
        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.dispatchEvent(new WindowEvent(dialog, WindowEvent.WINDOW_CLOSING));
			}
        });
        
        panel.add(enterButton);
        
        
        dialog.getContentPane().add(panel);
        dialog.setVisible(true);

    }
    public int getNumPlayers() {
    	int numPlayers = 2;
    	if (twoPlayer.isSelected()){
    		numPlayers = 2;
    	}
    	if (threePlayer.isSelected()) {
    		numPlayers = 3;
    	}
    	if (fourPlayer.isSelected()) {
    		numPlayers = 4;
    	}
    	return numPlayers;
    }
    public int getNumEpidemic() {
    	int numEpidemic = 4;
    	if (fourEpidemic.isSelected()){
    		numEpidemic = 4;
    	}
    	if (fiveEpidemic.isSelected()) {
    		numEpidemic = 5;
    	}
    	if (sixEpidemic.isSelected()) {
    		numEpidemic = 6;
    	}
    	return numEpidemic;
    }
}
