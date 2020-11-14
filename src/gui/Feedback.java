package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Feedback {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedback window = new Feedback();
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
	public Feedback() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void clearFields()
	{
		textField1.setText(null);
		textField2.setText(null);
		textField3.setText(null);
		textField4.setText(null);
		
	}
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 1002, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 968, 562);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coffe Shop");
		lblNewLabel.setIcon(new ImageIcon(Feedback.class.getResource("/images/OIP.jpg")));
		lblNewLabel.setBounds(136, 11, 288, 56);
		lblNewLabel.setForeground(new Color(184, 134, 11));
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 41));
		lblNewLabel.setBackground(new Color(218, 165, 32));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Feedback System");
		lblNewLabel_1.setForeground(new Color(184, 134, 11));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 41));
		lblNewLabel_1.setBounds(419, 11, 340, 56);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(73, 78, 761, 494);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("1).What's your name?");
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(10, 11, 185, 29);
		panel_1.add(lblNewLabel_3);
		
		textField1 = new JTextField();
		textField1.setBounds(195, 11, 235, 29);
		panel_1.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("2).How many times do you visit our coffee shop per week?");
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setBounds(10, 63, 539, 29);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("4).What's your favourite cofee type?");
		lblNewLabel_4_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_1.setBounds(10, 221, 347, 29);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("3).How satisfied were you with the quality of the coffee you were served today?");
		lblNewLabel_4_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_2.setBounds(10, 143, 605, 29);
		panel_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("5).Did you satisfy with our staff service?");
		lblNewLabel_4_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_3.setBounds(10, 304, 347, 29);
		panel_1.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("6).What are the changes do you suggest?");
		lblNewLabel_4_3_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_4_3_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4_3_1.setBounds(10, 370, 347, 29);
		panel_1.add(lblNewLabel_4_3_1);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(195, 103, 235, 29);
		panel_1.add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(195, 264, 235, 29);
		panel_1.add(textField3);
		
		JRadioButton rd1 = new JRadioButton("Good");
		rd1.setForeground(new Color(0, 0, 128));
		rd1.setFont(new Font("Tahoma", Font.BOLD, 17));
		rd1.setBounds(195, 179, 74, 23);
		panel_1.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Bad");
		rd2.setForeground(new Color(0, 0, 128));
		rd2.setFont(new Font("Tahoma", Font.BOLD, 17));
		rd2.setBounds(326, 179, 74, 23);
		panel_1.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("Good");
		rd3.setForeground(new Color(0, 0, 128));
		rd3.setFont(new Font("Tahoma", Font.BOLD, 17));
		rd3.setBounds(195, 340, 74, 23);
		panel_1.add(rd3);
		
		JRadioButton rd4 = new JRadioButton("Bad");
		rd4.setForeground(new Color(0, 0, 128));
		rd4.setFont(new Font("Tahoma", Font.BOLD, 17));
		rd4.setBounds(326, 340, 74, 23);
		panel_1.add(rd4);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(195, 410, 235, 29);
		panel_1.add(textField4);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(488, 415, 105, 23);
		panel_1.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(0, 0, 255));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSubmit.setBounds(632, 410, 114, 26);
		panel_1.add(btnSubmit);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Feedback.class.getResource("/images/Coffee-wallpaper-backgrounds-hd.jpg")));
		lblNewLabel_5.setBounds(0, 0, 757, 473);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Feedback.class.getResource("/images/OIP.jpg")));
		lblNewLabel_2.setBounds(741, 11, 80, 50);
		panel.add(lblNewLabel_2);
	}

	}
