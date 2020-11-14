package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.border.MatteBorder;

public class Summary {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Summary window = new Summary();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	class TableData extends AbstractTableModel{

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	/**
	 * Create the application.
	 */
	public Summary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 936, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 902, 599);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coffee Shop Feedback System - Summary");
		lblNewLabel.setIcon(new ImageIcon(Summary.class.getResource("/images/OIP.jpg")));
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 42));
		lblNewLabel.setBounds(10, 21, 883, 57);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 106, 868, 440);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Login();
			}
		});
		btnNewButton.setForeground(new Color(255, 99, 71));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(728, 406, 89, 23);
		panel_1.add(btnNewButton);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
				//{"Name", "visitsPerWeek", "FavCoffee", "Satisfaction", "StaffService", "Suggestions"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Name", "visitsPerWeek", "FavCoffee", "Satisfaction", "StaffService", "Suggestions"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Object.class, Boolean.class, Boolean.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(90, 62, 711, 149);
		panel_1.add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(104, 45, 51, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("NumOfVisit");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(223, 45, 99, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("FavCoffee");
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(354, 45, 78, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("StaffSatisfaction");
		lblNewLabel_2_1_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1_2.setBounds(574, 45, 110, 14);
		panel_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Suggestions");
		lblNewLabel_2_1_2_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2_1_2_1.setBounds(698, 46, 103, 14);
		panel_1.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Satisfaction");
		lblNewLabel_2_1_2_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1_2_2.setBounds(473, 45, 78, 14);
		panel_1.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Summary.class.getResource("/images/Coffee-wallpaper-backgrounds-hd.jpg")));
		lblNewLabel_1.setBounds(60, 11, 757, 418);
		panel_1.add(lblNewLabel_1);
	}
}
