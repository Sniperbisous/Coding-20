/*
Program: Review_DiceRolls_GUI_and_Part_1.java         Last Date of this Revision: May 12, 2022   




Purpose: To create a GUI to display and determine the amount of times a number is rolled from 3 dice with 6 sides. 

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 
*/
package Chapter_9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Review_DiceRolls_GUI_and_Part_1 {

	private JFrame frame;
	private JTextField txt_NumberOfRolls;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Review_DiceRolls_GUI_and_Part_1 window = new Review_DiceRolls_GUI_and_Part_1();
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
	public Review_DiceRolls_GUI_and_Part_1() {
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
		
		//Creates a new label
		JLabel Prompt_lable = new JLabel("Would you like to roll the dice.");
		Prompt_lable.setFont(new Font("Stencil", Font.BOLD, 22));
		Prompt_lable.setBounds(10, 11, 414, 51);
		frame.getContentPane().add(Prompt_lable);
		
		//Creates a new Text Area
		JTextArea Roll_result_txt = new JTextArea();
		Roll_result_txt.setEditable(false);
		Roll_result_txt.setLineWrap(true);
		Roll_result_txt.setBounds(243, 110, 181, 140);
		frame.getContentPane().add(Roll_result_txt);
		
		//Creates a new label
		JLabel Rolls = new JLabel("");
		Rolls.setBounds(243, 85, 181, 14);
		frame.getContentPane().add(Rolls);
		
		//Creates a new Button
		JButton Roll_Dice_button = new JButton("Roll The Dice");
		//Runs the following code when the button is pressed
		Roll_Dice_button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Creates a new array called outcomes with 19 elements
				int[] outcomes = new int[19];
				
				//Sets numRolls and outcome as a int variable
				int numRolls,outcome;
				
				//Initializes the display string
				String display = "";
				
				//Takes the text from the txt_NumberOfRolls box and turns it into a int
				numRolls = Integer.parseInt(txt_NumberOfRolls.getText());
				
				//Creates a loop to roll the dice the amount of desired times 
				for (int roll = 0; roll < numRolls; roll++)
				{
					//Generates the result for each di
					outcome = (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1) + (int)(6 * Math.random() + 1);
					
					//Counts how many times each possibility occurs
					outcomes[outcome] += 1;
				}

				//Creates a loop to create a string that contains all the values of each element
				for (int i = 3; i <= 18; i++)
				{
					display += (i + ":  " + outcomes[i] + "\t");
				}
				
				//Displays the string that contains all the times that a number is rolled
				Rolls.setText("You rolled: ");
				Roll_result_txt.setText(display);
				
			}
		});
		Roll_Dice_button.setBounds(37, 148, 133, 69);
		frame.getContentPane().add(Roll_Dice_button);
		
		//Creates a new text field
		txt_NumberOfRolls = new JTextField();
		txt_NumberOfRolls.setBounds(30, 85, 133, 20);
		frame.getContentPane().add(txt_NumberOfRolls);
		txt_NumberOfRolls.setColumns(10);
		
		//Creates a new label
		JLabel How_many_times = new JLabel("How many rolls would you like?");
		How_many_times.setBounds(20, 64, 181, 14);
		frame.getContentPane().add(How_many_times);
		
	}
}
