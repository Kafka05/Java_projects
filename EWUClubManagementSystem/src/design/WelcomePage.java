package design;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class WelcomePage extends JFrame {

	private ImageIcon icon;
	private Container c;
	public JLabel welcomeMsg, l2, backgroundLabel;
	private Font f;
	public JButton userButton;
	public JButton adminButton;

	public WelcomePage() {
		f = new Font("Times New Roman", Font.PLAIN, 20);
		icon = new ImageIcon("download.jpg");
		this.setBounds(100, 100, 1271, 733);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = this.getContentPane();
		c.setLayout(null);
		iniComp();
		this.setResizable(false);
		this.setVisible(true);
		this.setIconImage(icon.getImage());
	}

	public void iniComp() {
		c.setBackground(Color.DARK_GRAY);
		formatLabels();
		formatButton();
		formatBackground();
		c.add(welcomeMsg);
		c.add(userButton);
		c.add(adminButton);
		c.add(backgroundLabel);
		
	}

	public void formatLabels() {
		welcomeMsg = new JLabel();
		welcomeMsg.setFont(f);
		welcomeMsg.setBounds(395, 69, 477, 80);
	}

	public void formatButton() {
		userButton = new JButton("USER");
		userButton.setVerticalTextPosition(JButton.BOTTOM);
		userButton.setHorizontalTextPosition(JButton.CENTER);
		userButton.setOpaque(true);
		//userButton.setBackground(Color.green);
		//userButton.setBorderPainted(Color.black);
		userButton.setIcon(new ImageIcon("user.jpg"));
		userButton.setBounds(293, 241, 225, 250);
		userButton.setBorder(new LineBorder(Color.BLACK, 8));

		adminButton = new JButton("ADMIN");
		adminButton.setVerticalTextPosition(JButton.BOTTOM);
		adminButton.setHorizontalTextPosition(JButton.CENTER);
		adminButton.setOpaque(false);
		adminButton.setIcon(new ImageIcon("admin.png"));
		adminButton.setBounds(734, 234, 247, 247);
		adminButton.setBorder(new LineBorder(Color.BLACK, 8));
		
	}

	public void formatBackground() {
		backgroundLabel = new JLabel(
				new ImageIcon("bg2.png"));
		backgroundLabel.setBounds(0, 0, 1255, 694);
		//backgroundLabel.setOpaque(true);
		
	}
}
