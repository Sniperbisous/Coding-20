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
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel Main_panel = new JPanel();
		frame.getContentPane().add(Main_panel, BorderLayout.CENTER);
		Main_panel.setLayout(null);
		
		
		JLabel Dis = new JLabel("Your Choice was:  ");
		Dis.setBounds(188, 9, 206, 64);
		Main_panel.add(Dis);
		
		
		JLabel Total_Lb = new JLabel("");
		Total_Lb.setBounds(180, 86, 261, 64);
		Main_panel.add(Total_Lb);
		
		
		JLabel Remv_tx = new JLabel("");
		Remv_tx.setBounds(10, 200, 206, 43);
		Main_panel.add(Remv_tx);
		
		
		Remv_tx_field = new JTextField();
		Remv_tx_field.setText("0.0");
		Remv_tx_field.setVisible(false);
		Remv_tx_field.setBounds(44, 254, 86, 20);
		Main_panel.add(Remv_tx_field);
		Remv_tx_field.setColumns(10);
		
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
				int choice;
				double Remv;
				
				choice = Integer.parseInt(C_tx.getText());
				Dis.setText("Your Choice was: " + choice);

				switch(choice) 
					{
						case 1:
						{
							
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 2:
						{
							piggyBank.addPenny();
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 3:
						{
							piggyBank.addNickel();
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 4:
						{
							piggyBank.addDime();
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 5:
						{
							piggyBank.addQuarter();
							Total_Lb.setText(piggyBank.toString());
							break;
						}
						
						case 6:
						{
							
							Remv_tx_field.setVisible(true);
							
							
							
							Remv_tx.setText("How much would you like to remove.");
							Remv = Double.parseDouble(Remv_tx_field.getText());
							
							if(Remv < piggyBank.total)
								{
									piggyBank.remove(Remv);
								}
							else
								{
									Remv_tx.setText("Not enough funds in your account");
								}
							
							Total_Lb.setText(piggyBank.toString());
							break;
						}
					
					}
			}
		});
		Submit.setBounds(368, 251, 89, 23);
		Main_panel.add(Submit);
		
		JLabel QuartersLabel = new JLabel("Choice:");
		QuartersLabel.setBounds(10, 172, 45, 14);
		Main_panel.add(QuartersLabel);
		
		C_tx = new JTextField();
		C_tx.addInputMethodListener(new InputMethodListener() 
		{
			public void caretPositionChanged(InputMethodEvent event) 
			{
				
			}
			public void inputMethodTextChanged(InputMethodEvent event) 
			{
				
			}
		});
		
		C_tx.setBounds(53, 169, 86, 20);
		Main_panel.add(C_tx);
		C_tx.setColumns(10);
		
		
		
		JLabel Option_2_label = new JLabel("1. Show total in bank.");
		Option_2_label.setBounds(10, 11, 160, 14);
		Main_panel.add(Option_2_label);
		
		JLabel Option_3_label = new JLabel("2. Add a penny.");
		Option_3_label.setBounds(10, 36, 160, 14);
		Main_panel.add(Option_3_label);
		
		JLabel Option_4_label = new JLabel("3. Add a nickel.");
		Option_4_label.setBounds(10, 61, 160, 14);
		Main_panel.add(Option_4_label);
		
		JLabel Option_5_label = new JLabel("4. Add a dime.");
		Option_5_label.setBounds(10, 86, 160, 14);
		Main_panel.add(Option_5_label);
		
		JLabel Option_6_label = new JLabel("5. Add a quarter.");
		Option_6_label.setBounds(10, 111, 160, 14);
		Main_panel.add(Option_6_label);
		
		JLabel Option_7_label = new JLabel("6. Take money out.");
		Option_7_label.setBounds(10, 136, 160, 14);
		Main_panel.add(Option_7_label);
		
	}
}
