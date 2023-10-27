package jadenSmithTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class smithPage implements ActionListener {
	
	
	JButton jadenButton = new JButton("Get Jaden Quote");
	JButton jadenTextButton = new JButton("Jadenize");
	JTextField jadenText = new JTextField();
	JList<String> list;
	
	
	JFrame jadenFrame = new JFrame();
	
	smithPage(){
		jadenFrame.setSize(600,250);
		jadenFrame.setResizable(false);
		jadenFrame.setLayout(null);
		jadenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jadenFrame.setVisible(true);
		
		JScrollPane scroll = new JScrollPane(list);
		list = new JList<>();
		jadenFrame.add(scroll);
		
		
	}
	public void setListData(String[] data) {
		list.setListData(data);
		
	}
	
	public void jadenizeButton() {
		jadenFrame.add(jadenButton);
		jadenButton.setBounds(100,50,150,50);
		jadenButton.addActionListener(this);
		
	}

	//Button To Generate A Jaden Smith Quote
	@Override
	public void actionPerformed(ActionEvent e) {
		smithQuotes smithQuotes = new smithQuotes();
		if(e.getSource()==jadenButton) {
			System.out.println(smithQuotes.getSmithQuotes());
		}
	}

}
