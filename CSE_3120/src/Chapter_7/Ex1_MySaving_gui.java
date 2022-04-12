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
	private JTextField txF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1_MySaving_gui window = new Ex1_MySaving_gui();
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
	public Ex1_MySaving_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Main_panel = new JPanel();
		frame.getContentPane().add(Main_panel, BorderLayout.CENTER);
		Main_panel.setLayout(null);
		
		
		
		JLabel display = new JLabel("");
		display.setBounds(95, 261, 45, 14);
		Main_panel.add(display);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String input = txF.getText();
				
				display.setText(input);
				
				
				
			}
		});
		Submit.setBounds(369, 232, 89, 23);
		Main_panel.add(Submit);
		
		JLabel QuartersLabel = new JLabel("Choice:");
		QuartersLabel.setBounds(10, 236, 75, 14);
		Main_panel.add(QuartersLabel);
		
		txF = new JTextField();
		txF.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) 
			{
				
			}
		});
		txF.setBounds(53, 233, 86, 20);
		Main_panel.add(txF);
		txF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total in bank:");
		lblNewLabel.setBounds(10, 261, 75, 14);
		Main_panel.add(lblNewLabel);
		
		
	}
}
