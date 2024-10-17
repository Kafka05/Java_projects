package design;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class customizeMember extends JFrame {

	Container c;
	public JButton pendingRequestBTN;
	public JButton searchBTN;
	public JButton removeBTN;
	public JButton addBTN;
	JLabel taitleLBL;
	JLabel backgroundLBL;
	private JLabel addLBL;
	private JLabel removeLBL;
	private JLabel searchLBL;
	private JLabel prLBL;
	public JButton backButton;
	public JLabel  backgroundLabel;
	
	
	public customizeMember() {
		setBounds(500, 100, 1150, 788);
		initialize();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void initialize() {
		c = this.getContentPane();
		getContentPane().setLayout(null);
		formatButtons();
		formatLabels();
		c.add(addLBL);
		c.add(removeLBL);
		c.add(prLBL);
		c.add(searchLBL);
		c.add(pendingRequestBTN);
		c.add(searchBTN);
		c.add(removeBTN);
		c.add(addBTN);
		c.add(taitleLBL);
		//c.add(backgroundLBL);
		c.add(backButton);
		formatBackground();
		c.add(backgroundLabel);
		
		
	}

	public void formatButtons() {
		pendingRequestBTN = new JButton(new ImageIcon("pending.png"));
		pendingRequestBTN.setBounds(805, 477, 234, 168);
		pendingRequestBTN.setBorder(new LineBorder(Color.BLACK, 4));
		
		searchBTN = new JButton(new ImageIcon("search.jpg"));
		searchBTN.setBounds(221, 477, 234, 168);
		searchBTN.setBorder(new LineBorder(Color.BLACK, 4));

		removeBTN = new JButton(new ImageIcon("remove.png"));
		removeBTN.setBounds(805, 175, 234, 168);
		removeBTN.setBorder(new LineBorder(Color.BLACK, 4));

		addBTN = new JButton(new ImageIcon("addM.png"));
		addBTN.setBounds(221, 175, 234, 168);
		addBTN.setBorder(new LineBorder(Color.BLACK, 4));
		
		backButton = new JButton("Back");
		backButton.setBounds(20, 650, 80, 30);
		backButton.setBackground(Color.black);
		backButton.setForeground(Color.cyan);

	}

	public void formatLabels() {
		taitleLBL = new JLabel("<HTML>Add - Remove - Search for a Member Or approve a Pending Request<HTML>");
		taitleLBL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		taitleLBL.setForeground(Color.WHITE);
		taitleLBL.setBounds(331, 38, 612, 87);

		addLBL = new JLabel("ADD");
		addLBL.setBounds(323, 354, 46, 14);
		addLBL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addLBL.setForeground(Color.white);
		

		removeLBL = new JLabel("REMOVE");
		removeLBL.setBounds(900, 354, 90, 14);
		removeLBL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		removeLBL.setForeground(Color.white);

		searchLBL = new JLabel("SEARCH");
		searchLBL.setBounds(313, 656, 75, 14);
		searchLBL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		searchLBL.setForeground(Color.white);

		prLBL = new JLabel("PENDING REQUEST");
		prLBL.setBounds(877, 651, 154, 25);
		prLBL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		prLBL.setForeground(Color.white);

		backgroundLBL = new JLabel("");
		backgroundLBL.setOpaque(true);
		backgroundLBL.setBackground(new Color(192, 192, 192));
		backgroundLBL.setBounds(0, 11, 1245, 745);

	}
	
	public void formatBackground() {
		backgroundLabel = new JLabel(
				new ImageIcon("2791.jpg"));
		backgroundLabel.setBounds(0, 0, 1200, 788);
		backgroundLabel.setOpaque(true);
		
	}

	
	
}
