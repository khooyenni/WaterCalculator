import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WaterCalculator {

	private JFrame frame;
	private JTextField textFieldWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterCalculator window = new WaterCalculator();
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
	public WaterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1044, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How much water should I drink?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(255, 33, 532, 56);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("My weight (kg):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_1.setBounds(111, 124, 276, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Tell Me");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 32));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int weight;
				double water;
				
				try {
					weight = Integer.parseInt(textFieldWeight.getText());
					
					water = weight * 0.033;
					
					JOptionPane.showMessageDialog(null, "Buddy, you should drink " + water + " L of water a day!");
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Please Enter A Valid Number");
				}
			}
		});
		btnNewButton.setBounds(376, 230, 197, 47);
		frame.getContentPane().add(btnNewButton);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setBounds(389, 123, 276, 45);
		frame.getContentPane().add(textFieldWeight);
		textFieldWeight.setColumns(10);
	}
}
