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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Count Down:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 154, 53);
		panel.add(lblNewLabel);
		
		JLabel Dis = new JLabel("");
		Dis.setFont(new Font("Rockwell", Font.BOLD, 20));
		Dis.setBounds(20, 59, 384, 131);
		panel.add(Dis);
		
		JButton Count_down_button = new JButton("Display Count Down");
		Count_down_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Review_Reverse_Functions object = new Review_Reverse_Functions();
				
				Dis.setText(object.toString());
			}
		});
		Count_down_button.setBounds(250, 205, 154, 23);
		panel.add(Count_down_button);
	}
}
