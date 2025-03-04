package design;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveAMember extends JFrame {
	public JTable table;
	Object[] column = { "Name", "Student Id" };
	Object[] row = new Object[2];
	public DefaultTableModel model;
	JScrollPane pane;
	public JTextField idTF;
	JLabel idLBL;
	JLabel allMemberLBL;
	public JTextArea descriptionTA;
	public JLabel memberCatagoryLBL;
	public JButton removeBTN;
	public JButton backButton;
	public JLabel  backgroundLabel;

	public RemoveAMember() {
		getContentPane().setBackground(new Color(192, 192, 192));
		formatTable();
		formatLabelAndOhters();
		formatBackground();
		this.setResizable(false);
		this.setTitle("Pending Requests");
		this.setBounds(0, 0, 1099, 776);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(pane);
		this.getContentPane().add(idTF);
		this.getContentPane().add(idLBL);
		this.getContentPane().add(allMemberLBL);
		this.getContentPane().add(descriptionTA);
		this.getContentPane().add(memberCatagoryLBL);
		this.getContentPane().add(removeBTN);
		this.getContentPane().add(backButton);
		this.getContentPane().add(backgroundLabel);

	}

	public void formatTable() {
		model = new DefaultTableModel();
		model.setColumnIdentifiers(column);

		table = new JTable();
		table.setBounds(39, 27, 383, 488);
		table.setModel(model);
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		table.setSelectionBackground(Color.GREEN);
		table.setGridColor(Color.BLACK);
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);

		pane = new JScrollPane(table);
		pane.setBounds(48, 108, 499, 488);
		pane.setForeground(Color.RED);
	}

	public void formatLabelAndOhters() {
		idTF = new JTextField();
		idTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c) && c != '-') {
					e.consume();
				}
			}
		});
		idTF.setHorizontalAlignment(SwingConstants.CENTER);
		idTF.setToolTipText("");
		idTF.setBounds(181, 617, 194, 53);
		idTF.setMargin(new Insets(10, 10, 10, 10));
		idTF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		idTF.setColumns(10);

		idLBL = new JLabel("Enter Student-Id to start filtering the list");
		idLBL.setBounds(100, 681, 367, 37);
		idLBL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		idLBL.setForeground(Color.white);

		allMemberLBL = new JLabel("All Members");
		allMemberLBL.setBounds(220, 65, 147, 32);
		allMemberLBL.setFont(new Font("Tahoma", Font.PLAIN, 25));
		allMemberLBL.setForeground(Color.white);

		descriptionTA = new JTextArea();
		descriptionTA.setBounds(598, 172, 475, 424);
		descriptionTA.setMargin(new Insets(20, 20, 20, 20));
		descriptionTA.setSelectionColor(new Color(255, 255, 255));
		descriptionTA.setLineWrap(true);
		descriptionTA.setBackground(new Color(255, 255, 255));
		descriptionTA.setForeground(new Color(0, 0, 0));
		descriptionTA.setFont(new Font("Segoe UI", Font.PLAIN, 25));

		memberCatagoryLBL = new JLabel("");
		memberCatagoryLBL.setForeground(new Color(0, 0, 255));
		memberCatagoryLBL.setBounds(708, 124, 334, 37);
		memberCatagoryLBL.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		removeBTN = new JButton("Remove This Member");
		removeBTN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		removeBTN.setBackground(new Color(217, 51, 55));
		removeBTN.setForeground(new Color(0, 0, 0));
		removeBTN.setBounds(708, 611, 268, 68);
		removeBTN.setVisible(false);
		
		backButton = new JButton("Back");
		backButton.setBounds(0, 30, 80, 30);
		backButton.setBackground(Color.black);
		backButton.setForeground(Color.cyan);
		
		
	}

	public void addRecordsToTable(String name, String id) {
		row[0] = name;
		row[1] = id;
		model.addRow(row);
	}
	
	public void formatBackground() {
		backgroundLabel = new JLabel(
				new ImageIcon("2791.jpg"));
		backgroundLabel.setBounds(0, 0, 1200, 788);
		backgroundLabel.setOpaque(true);
		
	}
	

	public static void main(String[] args) {
		RemoveAMember rm = new RemoveAMember();
	}
}
