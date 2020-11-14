package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JPasswordField txt3;
	private JPasswordField txt4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void clearFields()
	{
		txt1.setText(null);
		txt2.setText(null);
		txt3.setText(null);
		txt4.setText(null);
	}
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 880, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 468, 510);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coffe Shop");
		lblNewLabel.setBounds(55, 21, 279, 67);
		lblNewLabel.setIcon(new ImageIcon(Signup.class.getResource("/images/OIP.jpg")));
		lblNewLabel.setForeground(new Color(184, 134, 11));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 41));
		lblNewLabel.setBackground(new Color(218, 165, 32));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Feedback System");
		lblNewLabel_1.setForeground(new Color(184, 134, 11));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 41));
		lblNewLabel_1.setBounds(50, 99, 375, 56);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Signup.class.getResource("/images/pexels-jason-villanueva-851555 (1).jpg")));
		lblNewLabel_2.setBounds(31, 174, 376, 274);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(488, 11, 368, 510);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Signup");
		lblNewLabel_3.setBackground(new Color(245, 245, 245));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_3.setForeground(new Color(218, 165, 32));
		lblNewLabel_3.setBounds(41, 37, 298, 46);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("User Name");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setBounds(10, 110, 194, 40);
		panel_1.add(lblNewLabel_4);
		
		txt1 = new JTextField();
		txt1.setBounds(10, 149, 277, 32);
		panel_1.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Email");
		lblNewLabel_4_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_1.setBounds(10, 170, 194, 40);
		panel_1.add(lblNewLabel_4_1);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(10, 206, 277, 32);
		panel_1.add(txt2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Password");
		lblNewLabel_4_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_1_1.setBounds(10, 237, 194, 40);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Confirm Password");
		lblNewLabel_4_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_1_1_1.setBounds(10, 307, 194, 40);
		panel_1.add(lblNewLabel_4_1_1_1);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});
		btnNewButton.setForeground(new Color(255, 20, 147));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(109, 432, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(0, 0, 128));
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnSubmit.setBounds(209, 432, 89, 23);
		panel_1.add(btnSubmit);
		
		txt3 = new JPasswordField();
		txt3.setBounds(10, 276, 277, 32);
		panel_1.add(txt3);
		
		txt4 = new JPasswordField();
		txt4.setBounds(10, 345, 277, 32);
		panel_1.add(txt4);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Login();
			}
		});
		btnBack.setForeground(new Color(0, 0, 128));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnBack.setBounds(10, 432, 89, 23);
		panel_1.add(btnBack);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Signup.class.getResource("/images/login.jpg")));
		lblNewLabel_5.setBounds(0, 0, 358, 499);
		panel_1.add(lblNewLabel_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 139, 139));
		panel_2.setBounds(478, 11, 10, 510);
		frame.getContentPane().add(panel_2);
	}

}
