package Chapter_7;

import java.awt.Font;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Ex1_MySavings_gui 
{
	static JFrame main_frame = new JFrame("Piggy Bank");
	
	public Ex1_MySavings_gui()
	{
		
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setSize(500, 500);
	
		
		
		
	}
	
	public JFrame addButton() 
	{
		JButton newButton = new JButton("Submit");
		newButton.setSize(100, 100);
		main_frame.add(newButton);
		
		
		return main_frame;
		
	}
	
	public JFrame addlable() 
	{
		
		JLabel label = new JLabel("Coins");
		label.setSize(30, 30);
		label.setFont(new Font("Serif", Font.PLAIN, 36));
		label.setHorizontalAlignment(JLabel.CENTER);
		main_frame.add(label);
		return main_frame;
		
	}
	
	public JFrame addTextFrame() 
	{
		JTextArea textArea = new JTextArea("hahaha");
		main_frame.add(textArea);
		return main_frame;
		
	}
	
	
	public static void main(String[] args) 
	{
		Ex1_MySavings_gui main_gui = new Ex1_MySavings_gui();
		main_gui.addButton();
		main_gui.addlable();
		main_gui.addTextFrame();
		
		System.out.print(main_gui);
		main_frame.setVisible(true);
	}

}
