package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin {

	private JFrame frame;
	private JTextField txtAdminUserName;
	private JPasswordField txtAdminPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 868, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 834, 518);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setForeground(new Color(230, 230, 250));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(330, 221, 244, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Admin.class.getResource("/images/admin.png")));
		lblNewLabel_1.setBounds(219, 11, 383, 215);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setForeground(new Color(230, 230, 250));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(168, 311, 168, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(168, 350, 168, 14);
		panel.add(lblNewLabel_2_1);
		
		txtAdminUserName = new JTextField();
		txtAdminUserName.setBounds(317, 310, 228, 20);
		panel.add(txtAdminUserName);
		txtAdminUserName.setColumns(10);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setForeground(new Color(255, 99, 71));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(317, 430, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=txtAdminUserName.getText().trim().toUpperCase();
				String pwd=txtAdminPassword.getText().trim().toUpperCase();
				
				if(username.equals("ADMIN")&&pwd.equals("1234"))
				{
					frame.setVisible(false);
					new Summary();
				}
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLogin.setBounds(456, 430, 89, 23);
		panel.add(btnLogin);
		
		txtAdminPassword = new JPasswordField();
		txtAdminPassword.setBounds(317, 349, 228, 20);
		panel.add(txtAdminPassword);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Login();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 205));
		btnNewButton_1.setIcon(new ImageIcon(Admin.class.getResource("/images/back button.jpg")));
		btnNewButton_1.setBounds(21, 442, 48, 42);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Admin.class.getResource("/images/admin-login-background-images-8.jpg")));
		lblNewLabel_3.setBounds(10, -12, 834, 507);
		panel.add(lblNewLabel_3);
	}
}
