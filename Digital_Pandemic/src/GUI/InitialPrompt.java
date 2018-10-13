package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InitialPrompt
{
    private JFrame frame;
    JPanel panel;

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
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        panel = new JPanel();
        
        JLabel numPlayerPromptText = new JLabel("Choose the number of players.");
        panel.add(numPlayerPromptText);
        
        JLabel numEpidemicsPromptText = new JLabel("Choose the number of epidemics.");
        panel.add(numEpidemicsPromptText);
        
        
        frame.getContentPane().add(panel);
        frame.setVisible(true);

    }
}
