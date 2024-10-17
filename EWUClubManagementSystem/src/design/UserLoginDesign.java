package design;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserLoginDesign extends JFrame {
	public JTextField IdTextField;
	public JLabel EnterIdLabel;
	public JLabel UserLoginLabel;
	JLabel BackgroundLabel;
	public JButton userLoginButton;
	public JLabel statusLabel;
	public JButton backButton;
	JLabel l3;

	public UserLoginDesign() {
		initialize();
		this.getContentPane().setLayout(null);
		this.setBounds(100, 100, 1100, 790);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().add(statusLabel);
		this.getContentPane().add(userLoginButton);
		this.getContentPane().add(IdTextField);
		this.getContentPane().add(EnterIdLabel);
		this.getContentPane().add(UserLoginLabel);
		this.getContentPane().add(BackgroundLabel);
		this.getContentPane().add(backButton);
		this.getContentPane().add(l3);
	}

	private void initialize() {

		statusLabel = new JLabel();
		statusLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		statusLabel.setBounds(476, 469, 778, 81);

		userLoginButton = new JButton("Login");
		userLoginButton.setBounds(641, 392, 89, 23);
		userLoginButton.setBackground(Color.black);
		userLoginButton.setForeground(Color.cyan);

		IdTextField = new JTextField("2022-1-60-267");
		IdTextField.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 25));
		IdTextField.setForeground(new Color(0, 0, 0));
		IdTextField.setBackground(new Color(255, 255, 255));
		IdTextField.setBounds(601, 312, 168, 46);
		IdTextField.setColumns(10);

		EnterIdLabel = new JLabel("Enter Student ID: ");
		EnterIdLabel.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 25));
		EnterIdLabel.setForeground(Color.white);
		EnterIdLabel.setBounds(400, 301, 190, 73);

		UserLoginLabel = new JLabel("User Login");
		UserLoginLabel.setForeground(new Color(255, 255, 255));
		UserLoginLabel.setBounds(495, 47, 233, 81);
		UserLoginLabel.setFont(new Font("Times New Roman", Font.HANGING_BASELINE, 50));

		BackgroundLabel = new JLabel("");
		BackgroundLabel.setForeground(new Color(0, 0, 0));
		BackgroundLabel.setBounds(0, 0, 1254, 751);
		//BackgroundLabel.setOpaque(true);
		BackgroundLabel.setBackground(new Color(128, 128, 128));
		
		l3 = new JLabel(new ImageIcon("2791.jpg"));
		l3.setBounds(0, 0, 1200, 790);
		
		
		backButton = new JButton("Back");
		backButton.setBounds(20, 40, 80, 30);
		backButton.setBackground(Color.black);
		backButton.setForeground(Color.cyan);
	}
}
