package design;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLoginDesign extends WindowAdapter {
	public JFrame frame;
	JLabel firstLabel, userNameLabel, passWordLabel, l3;
	JLabel secondLabel;
	public JPasswordField passwordValue;
	public JTextField userNameText;
	public JButton loginButton,backButton;
	private Font f;
	

	public AdminLoginDesign() {
		frame = new JFrame("Login Panel");

		iniComp();
		frame.setBounds(500, 100, 800, 800);

		frame.getContentPane().setBackground(Color.white);
		frame.getContentPane().add(firstLabel);
		frame.getContentPane().add(secondLabel);
		frame.getContentPane().add(passwordValue);
		frame.getContentPane().add(passWordLabel);
		frame.getContentPane().add(userNameLabel);
		frame.getContentPane().add(userNameText);
		frame.getContentPane().add(loginButton);
		frame.getContentPane().add(l3);
		frame.getContentPane().add(backButton);
	
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void iniComp() {
		f = new Font("Times New Roman", Font.HANGING_BASELINE, 30);
		firstLabel = new JLabel("Club Management System");
		firstLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
		firstLabel.setBounds(190, 30, 400, 100);
		secondLabel = new JLabel(" Welcome to Login panel");
		secondLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
		secondLabel.setBounds(250, 100, 400, 100);
		secondLabel.setForeground(Color.BLACK);

		passwordValue = new JPasswordField("zarin123@ero");
		passwordValue.setBounds(520, 302, 184, 28);

		userNameLabel = new JLabel("UserID: ");
		userNameLabel.setBounds(450, 211, 84, 14);
		userNameLabel.setForeground(Color.black);
		// userNameLabel.setFont(f);
		passWordLabel = new JLabel("Password: ");
		passWordLabel.setBounds(450, 309, 84, 14);
		passWordLabel.setForeground(Color.black);
		// passWordLabel.setFont(f);

		loginButton = new JButton("Login");
		loginButton.setBounds(562, 400, 89, 45);
		loginButton.setBackground(Color.BLACK);
		loginButton.setForeground(Color.cyan);

		userNameText = new JTextField("2021-2-60-064");
		userNameText.setBounds(520, 202, 184, 28);

		l3 = new JLabel(new ImageIcon("ic1.jpg"));
		
		l3.setBounds(0, 0, 400, 800);
		l3.setBackground(Color.BLACK);
		
		
		backButton = new JButton("Back");
		backButton.setBounds(640, 650, 80, 30);
		backButton.setForeground(Color.cyan);
		backButton.setBackground(Color.black);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		int a = JOptionPane.showConfirmDialog(frame, "Are you sure you want to Exit?");
		if (a == JOptionPane.YES_OPTION) {
		}
	}
}