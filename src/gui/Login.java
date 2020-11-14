package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 813, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 799, 497);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(10, 11, 410, 475);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coffe Shop");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/OIP.jpg")));
		lblNewLabel.setBackground(new Color(218, 165, 32));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 41));
		lblNewLabel.setForeground(new Color(184, 134, 11));
		lblNewLabel.setBounds(32, 30, 307, 48);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Feedback System");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 41));
		lblNewLabel_1.setForeground(new Color(184, 134, 11));
		lblNewLabel_1.setBounds(32, 89, 375, 56);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/images/pexels-jason-villanueva-851555 (1).jpg")));
		lblNewLabel_2.setBounds(10, 168, 376, 274);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(426, 11, 363, 475);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\"WELCOME\"");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_3.setForeground(new Color(0, 128, 128));
		lblNewLabel_3.setBounds(21, 49, 309, 40);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" \u201CFeedback is the breakfast of champions.\u201D ");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_4.setForeground(new Color(0, 0, 139));
		lblNewLabel_4.setBounds(10, 100, 338, 53);
		panel_2.add(lblNewLabel_4);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Login2();
			}
		});
		btnLogin.setForeground(new Color(0, 0, 128));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnLogin.setBackground(new Color(238, 232, 170));
		btnLogin.setBounds(10, 222, 89, 23);
		panel_2.add(btnLogin);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Signup();
			}
		});
		btnSignup.setForeground(new Color(0, 0, 128));
		btnSignup.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnSignup.setBackground(new Color(238, 232, 170));
		btnSignup.setBounds(10, 273, 89, 23);
		panel_2.add(btnSignup);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setBackground(new Color(245, 245, 220));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnExit.setBounds(259, 424, 89, 23);
		panel_2.add(btnExit);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Login.class.getResource("/images/login.jpg")));
		lblNewLabel_5.setBounds(0, 11, 353, 453);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBounds(418, 11, 10, 475);
		panel.add(panel_3);
		panel_3.setLayout(null);
	}
}
