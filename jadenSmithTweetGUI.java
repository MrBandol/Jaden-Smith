import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class jadenSmithTweetGUI implements ActionListener {
	
	JFrame jadenFrame = new JFrame();
	JLabel jadenString = new JLabel("Jadenize Text : ");
	JLabel jadenWelcome = new JLabel("How Can Mirrors Be Real If Our Eyes Are Not Real?");
	ImageIcon jadenLogoPNG = new ImageIcon("download.jfif");
	JPanel jadenPanel = new JPanel();
	JTextField jadenTextField = new JTextField();
	JButton jadenButton = new JButton("Jadenize");
	JButton jadenResetButton = new JButton("Reset To Start Over Again");

	
	HashMap<String, String> jadenTweet = new HashMap<String, String>();

	jadenSmithTweetGUI (HashMap<String, String> jadenTweetOriginal) {
		jadenTweet = jadenTweetOriginal;
		
		jadenString.setBounds(100,150,75,100);
		jadenWelcome.setBounds(125,250,250,35);
		
		jadenFrame.add(jadenString);
		jadenFrame.add(jadenButton);
		jadenFrame.setLayout(null);
		jadenFrame.setTitle("Jaden Smith Capitalizer");
		jadenFrame.setSize(500, 500);
		jadenFrame.setVisible(true);
		jadenFrame.setResizable(false);
		jadenFrame.setDefaultCloseOperation(jadenFrame.EXIT_ON_CLOSE);
		jadenFrame.setIconImage(jadenLogoPNG.getImage());

		
			}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}