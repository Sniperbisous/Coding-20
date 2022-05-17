/*
Program: Ex1_MySaving_gui.java         Last Date of this Revision: April 22, 2022   




Purpose: To create a gui that allows the user to add coins and remove a amount from a piggy bank.

Author: Aiden Storer 
School: CHHS
Course: Computer Science 20
 
*/
package Chapter_7;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Ex1_MySaving_gui {

	private JFrame frame;
	private JTextField C_tx;
	private JTextField Remv_tx_field;

	

	MySavings_Object piggyBank = new MySavings_Object();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Ex1_MySaving_gui window = new Ex1_MySaving_gui();
					window.frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex1_MySaving_gui() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		//Creates a new frame
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates a new panel
		JPanel Main_panel = new JPanel();
		frame.getContentPane().add(Main_panel, BorderLayout.CENTER);
		
		//Creates a new label
		JLabel Dis = new JLabel("Your Choice was:  ");
		Dis.setBounds(188, 9, 206, 64);
		
		//Creates a new label
		JLabel Total_Lb = new JLabel("");
		Total_Lb.setBounds(180, 86, 261, 64);
		
		//Creates a new label
		JLabel Remv_tx = new JLabel("");
		Remv_tx.setBounds(10, 200, 206, 43);
		
		//Creates a new text field
		Remv_tx_field = new JTextField();
		Remv_tx_field.setBounds(44, 254, 86, 20);
		Remv_tx_field.setText("0.0");
		Remv_tx_field.setVisible(false);
		Remv_tx_field.setColumns(10);
		
		//Creates a new button
		JButton Submit = new JButton("Submit");
		Submit.setBounds(368, 251, 89, 23);
		Submit.addActionListener(new ActionListener() 
		{
			//Reads when the button is clicked
			public void actionPerformed(ActionEvent e) 
			{
				//Sets choice as a int variable and Remv as a double variable
				int choice;
				double Remv;
				
				//Takes the text from the C_tx box and turns it into a int
				choice = Integer.parseInt(C_tx.getText());
				
				//Changes the text in the Dis label
				Dis.setText("Your Choice was: " + choice);

				//Selects a case to run based off of the value of the choice variable
				switch(choice) 
					{
						
						case 1:
						{
							//Runs the toString function from the MySavings_Object.java class and changes the text for the Total_Lb label to the return value
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 2:
						{
							//Runs The addPenny function from the MySavings_Object.java class
							piggyBank.addPenny();
							
							//Runs the toString function from the MySavings_Object.java class and changes the text for the Total_Lb label to the return value
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 3:
						{
							//Runs The addNickel function from the MySavings_Object.java class
							piggyBank.addNickel();
							
							//Runs the toString function from the MySavings_Object.java class and changes the text for the Total_Lb label to the return value
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 4:
						{
							//Runs The addDime function from the MySavings_Object.java class
							piggyBank.addDime();
							
							//Runs the toString function from the MySavings_Object.java class and changes the text for the Total_Lb label to the return value
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 5:
						{
							//Runs The addQuarter function from the MySavings_Object.java class
							piggyBank.addQuarter();
							
							//Runs the toString function from the MySavings_Object.java class and changes the text for the Total_Lb label to the return value
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 6:
						{
							//Makes the Remv_tx_field visible 
							Remv_tx_field.setVisible(true);
							
							
							//Changes the text in the Remv_tx label
							Remv_tx.setText("How much would you like to remove.");
							
							//Takes the text from the Remv_tx_field box and turns it into a double
							Remv = Double.parseDouble(Remv_tx_field.getText());
							
							//Runs if Remv is smaller than piggyBank.total
							if(Remv < piggyBank.total)
								{
									//Runs the remove function from the MySavings_Object.java class
									piggyBank.remove(Remv);
								}
							
							else
								{
									//Changes the text in the Remv_tx label
									Remv_tx.setText("Not enough funds in your account.");
								}
							
							//Runs the toString function from the MySavings_Object.java class and changes the text for the Total_Lb label to the return value
							Total_Lb.setText(piggyBank.toString());
							break;
						}
					
					}
			}
		});
		
		//Creates a new text field
		C_tx = new JTextField();
		C_tx.setBounds(53, 169, 86, 20);
		C_tx.addInputMethodListener(new InputMethodListener() 
		{
			public void caretPositionChanged(InputMethodEvent event) 
			{
				
			}
			public void inputMethodTextChanged(InputMethodEvent event) 
			{
				
			}
		});
		C_tx.setColumns(10);
		
		//Creates a new label
		JLabel QuartersLabel = new JLabel("Choice:");
		QuartersLabel.setBounds(10, 172, 45, 14);
		
		//Creates a new label
		JLabel Option_2_label = new JLabel("1. Show total in bank.");
		Option_2_label.setBounds(10, 11, 160, 14);
		
		//Creates a new label
		JLabel Option_3_label = new JLabel("2. Add a penny.");
		Option_3_label.setBounds(10, 36, 160, 14);
		
		//Creates a new label
		JLabel Option_4_label = new JLabel("3. Add a nickel.");
		Option_4_label.setBounds(10, 61, 160, 14);
		
		//Creates a new label
		JLabel Option_5_label = new JLabel("4. Add a dime.");
		Option_5_label.setBounds(10, 86, 160, 14);
		
		//Creates a new label
		JLabel Option_6_label = new JLabel("5. Add a quarter.");
		Option_6_label.setBounds(10, 111, 160, 14);
		
		//Creates a new label
		JLabel Option_7_label = new JLabel("6. Take money out.");
		Option_7_label.setBounds(10, 136, 160, 14);
		Main_panel.setLayout(null);
		Main_panel.add(Dis);
		Main_panel.add(Total_Lb);
		Main_panel.add(Remv_tx);
		Main_panel.add(Remv_tx_field);
		Main_panel.add(Submit);
		Main_panel.add(C_tx);
		Main_panel.add(QuartersLabel);
		Main_panel.add(Option_2_label);
		Main_panel.add(Option_3_label);
		Main_panel.add(Option_4_label);
		Main_panel.add(Option_5_label);
		Main_panel.add(Option_6_label);
		Main_panel.add(Option_7_label);
		
	}
}
