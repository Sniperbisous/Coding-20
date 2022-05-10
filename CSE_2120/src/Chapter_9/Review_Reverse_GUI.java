/*
Program: Review_Reverse_GUI.java         Last Date of this Revision: May 10, 2022   




Purpose: To create a GUI to display the string returned from toString() in Review_Reverse_GUI.java. 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 
*/
package Chapter_9;

import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Review_Reverse_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Review_Reverse_GUI window = new Review_Reverse_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Review_Reverse_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		//Creates a new frame
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Creates a new panel
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//Creates a new label
		JLabel lblNewLabel = new JLabel("Count Down:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 154, 53);
		panel.add(lblNewLabel);
		
		//Creates a new label
		JLabel Dis = new JLabel("");
		Dis.setFont(new Font("Rockwell", Font.BOLD, 20));
		Dis.setBounds(20, 59, 384, 131);
		panel.add(Dis);
		
		//Creates a new button
		JButton Count_down_button = new JButton("Display Count Down");
		Count_down_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//Creates an object to pull outputs from Review_Reverse_Function.java
				Review_Reverse_Functions object = new Review_Reverse_Functions();
				
				//Displays the returned string from toString() in Review_Reverse_Function.java
				Dis.setText(object.toString());
			}
		});
		Count_down_button.setBounds(250, 205, 154, 23);
		panel.add(Count_down_button);
	}
}
