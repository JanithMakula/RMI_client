package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import com.xd.interfaces.Usersint;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;

public class Login2 {

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	
	Usersint u1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 window = new Login2();
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
	public Login2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void clearFields()
	{
		txtUserName.setText(null);
		txtPassword.setText(null);
	}
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 932, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 469, 575);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coffe Shop");
		lblNewLabel.setIcon(new ImageIcon(Login2.class.getResource("/images/OIP.jpg")));
		lblNewLabel.setForeground(new Color(184, 134, 11));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 41));
		lblNewLabel.setBackground(new Color(218, 165, 32));
		lblNewLabel.setBounds(77, 47, 279, 67);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Feedback System");
		lblNewLabel_1.setForeground(new Color(184, 134, 11));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 41));
		lblNewLabel_1.setBounds(87, 128, 375, 56);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Login2.class.getResource("/images/pexels-jason-villanueva-851555 (1).jpg")));
		lblNewLabel_2.setBounds(47, 228, 376, 274);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(489, 11, 419, 575);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(23, 180, 212, 31);
		panel_1.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Login");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_4.setBounds(86, 33, 192, 69);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setForeground(new Color(0, 0, 128));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(23, 132, 154, 37);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Password");
		lblNewLabel_5_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(23, 233, 154, 37);
		panel_1.add(lblNewLabel_5_1);
		

		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});
		btnNewButton.setForeground(new Color(255, 69, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(23, 365, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Login");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=txtUserName.getText();
				String pwd=txtPassword.getText();
				
				try {
					u1 = (Usersint) Naming.lookup("rmi://localhost/UserActions");
					
					String result = u1.login(name, pwd);
					
					if(result != null && !result.trim().isEmpty()) {
						JOptionPane.showMessageDialog(frame, "Successfully logined");
						frame.setVisible(false);
						
						if(result.equals("admin"))
						{
							new Admin();
						}
						else
						{
							new Feedback();
						}
					}else{
						JOptionPane.showMessageDialog(frame, "Invalid username or password");
					}
					
				} catch (MalformedURLException | RemoteException | NotBoundException e1) {
					e1.printStackTrace();
				} catch (Exception e1) {
					e1.printStackTrace();
				}				
			}
		});
		btnSubmit.setForeground(new Color(0, 0, 128));
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSubmit.setBounds(152, 365, 111, 23);
		panel_1.add(btnSubmit);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(23, 272, 212, 31);
		panel_1.add(txtPassword);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Login2.class.getResource("/images/login.jpg")));
		lblNewLabel_3.setBounds(10, 11, 399, 553);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(479, 11, 10, 575);
		frame.getContentPane().add(panel_2);
	}
}
