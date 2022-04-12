package Chapter_7;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ex1_mySavings_gui2 
{
	static JFrame main_frame = new JFrame("Piggy Bank");
	public Ex1_mySavings_gui2()
	{
		
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setSize(500, 500);
		
		
		JPanel panel2 = new JPanel();
	
		
	}
	public JFrame addQuarters()
	{
		BorderLayout borderLayoutManager = new BorderLayout();
		JPanel panel1 = new JPanel();
		panel1.setLayout(borderLayoutManager);
		
		
		
		
		JButton newButton = new JButton("Submit");
		newButton.setSize(100, 100);
		
		JLabel textLabel = new JLabel("Quarters");
		textLabel.setSize(100, 30);
		JPanel JP1 = panel1;
		
		JP1.add(newButton, BorderLayout.EAST);
		JP1.add(textLabel, BorderLayout.WEST);
		main_frame.add(JP1, BorderLayout.NORTH);
		return (main_frame);
		
	}
	public JFrame addDimes()
	{
		BorderLayout borderLayoutManager = new BorderLayout();
		JPanel panel2 = new JPanel();
		panel2.setLayout(borderLayoutManager);
		
		//BoxLayout boxLayoutManager = new BoxLayout(panel2, BoxLayout.Y_AXIS);
		//panel2.setLayout(boxLayoutManager);
		
		JButton newButton = new JButton("Submit");
		newButton.setSize(100, 100);
		
		JLabel textLabel = new JLabel("Dimes");
		textLabel.setSize(100, 30);
		
		JPanel JP2 = panel2;
		
		JP2.add(newButton, BorderLayout.EAST);
		JP2.add(textLabel, BorderLayout.WEST);
		main_frame.add(JP2);
		return (main_frame);
		
	}
	
	public JFrame addNickels()
	{
		BorderLayout borderLayoutManager = new BorderLayout();
		JPanel panel3 = new JPanel();
		panel3.setLayout(borderLayoutManager);
		
		//BoxLayout boxLayoutManager = new BoxLayout(panel2, BoxLayout.Y_AXIS);
		//panel2.setLayout(boxLayoutManager);
		
		JButton newButton = new JButton("Submit");
		newButton.setSize(100, 100);
		
		JLabel textLabel = new JLabel("Dimes");
		textLabel.setSize(100, 30);
		
		JPanel JP3 = panel3;
		
		JP3.add(newButton, BorderLayout.EAST);
		JP3.add(textLabel, BorderLayout.WEST);
		main_frame.add(JP3);
		return (main_frame);
		
	}
	
		public static void main(String[] args) 
	{
		Ex1_mySavings_gui2 main_gui = new Ex1_mySavings_gui2();
		main_gui.addQuarters();
		main_gui.addDimes();
		main_gui.addNickels();
		
		System.out.print(main_gui);
		main_frame.setVisible(true);

	}

}
