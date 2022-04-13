package Class_Example_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

	private JFrame frmGrades;
	private JTextField Fn;
	private JTextField Ln;
	private JTextField Mark_1;
	private JTextField Mark_2;

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
					Gui window = new Gui();
					window.frmGrades.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmGrades = new JFrame();
		frmGrades.setTitle("Grades");
		frmGrades.setBounds(100, 100, 650, 394);
		frmGrades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGrades.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 448, 333);
		frmGrades.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Ln_label = new JLabel("Last Name");
		Ln_label.setBounds(27, 55, 74, 33);
		panel.add(Ln_label);
		
		JLabel Fn_Label = new JLabel("First Name");
		Fn_Label.setBounds(27, 11, 64, 33);
		panel.add(Fn_Label);
		
		Fn = new JTextField();
		Fn.setBounds(98, 17, 291, 20);
		panel.add(Fn);
		Fn.setColumns(10);
		
		Ln = new JTextField();
		Ln.setBounds(98, 61, 291, 20);
		panel.add(Ln);
		Ln.setColumns(10);
		
		JLabel dis = new JLabel("");
		dis.setBounds(54, 196, 291, 48);
		panel.add(dis);
		
		JLabel dis_2 = new JLabel("");
		dis_2.setBounds(54, 255, 291, 48);
		panel.add(dis_2);
		
		JButton Bt_Submit = new JButton("Submit");
		Bt_Submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String firstName, lastName; 
				double Mark_1_var, Mark_2_var, avg;
				
				firstName = Fn.getText();
				lastName = Ln.getText();
				
				Mark_1_var = Double.parseDouble(Mark_1.getText());
				Mark_2_var = Double.parseDouble(Mark_2.getText());
				avg = (Mark_1_var + Mark_2_var)/2;
				
			dis.setText("Your name is: " + firstName + " " + lastName);
			dis_2.setText("Your average is: " + avg);
			}
		});
		
		Bt_Submit.setBounds(285, 118, 102, 33);
		panel.add(Bt_Submit);
		
		JLabel Mark1_label = new JLabel("Mark 1:");
		Mark1_label.setBounds(47, 99, 46, 14);
		panel.add(Mark1_label);
		
		Mark_1 = new JTextField();
		Mark_1.setBounds(37, 124, 86, 20);
		panel.add(Mark_1);
		Mark_1.setColumns(10);
		
		JLabel Mark2_lLabel = new JLabel("Mark 2:");
		Mark2_lLabel.setBounds(165, 99, 46, 14);
		panel.add(Mark2_lLabel);
		
		Mark_2 = new JTextField();
		Mark_2.setColumns(10);
		Mark_2.setBounds(155, 124, 86, 20);
		panel.add(Mark_2);
		
		
		
		
	}
}
