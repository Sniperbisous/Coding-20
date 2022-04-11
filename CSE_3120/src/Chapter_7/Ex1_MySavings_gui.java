package Chapter_7;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ex1_MySavings_gui 
{
	static JFrame main_frame = new JFrame("Piggy Bank");
	static JPanel new_panel = new JPanel();
	public Ex1_MySavings_gui()
	{
		
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setSize(500, 500);
	
		
		
		
	}
	public JFrame addPannel() 
	{
		
		BorderLayout borderLayoutManager = new BorderLayout();
		new_panel.setLayout(borderLayoutManager);
		main_frame.add(new_panel);
		return main_frame;
		
	}
	public JPanel addButton() 
	{
		JButton newButton = new JButton("Submit");
		newButton.setSize(100, 100);
		new_panel.add(newButton);
		
		return new_panel;
		
	}
	
	public JPanel addLable() 
	{
		
		JLabel label = new JLabel("Coins");
		label.setSize(30, 30);
		label.setFont(new Font("Serif", Font.PLAIN, 36));
		label.setHorizontalAlignment(JLabel.RIGHT);
		new_panel.add(label);
		return new_panel;
		
	}
	
	public JPanel addTextFrame() 
	{
		JTextArea textArea = new JTextArea("hahaha");
		textArea.setSize(30, 30);
		
		new_panel.add(textArea);
		
		return new_panel;
		
	}
	
	
	public static void main(String[] args) 
	{
		Ex1_MySavings_gui main_gui = new Ex1_MySavings_gui();
		main_gui.addButton();
		main_gui.addLable();
		main_gui.addTextFrame();
		main_gui.addPannel();
		
		
		
		System.out.print(main_gui);
		main_frame.setVisible(true);
	}

}
