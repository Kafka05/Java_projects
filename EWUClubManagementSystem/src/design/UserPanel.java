package design;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class UserPanel extends JFrame {
	private ImageIcon icon;
	private JLabel heading;
	public Container u;
	private Font f;
	JLabel backGroundLabel;
	public JButton noticeButton;
	public JButton alumniButton;
	public JButton memberButton;
	private JButton eventButton;
	public JButton backButton;

	public UserPanel() {
		setTitle("USER PANEL");
		setBounds(100, 100, 1000, 788); // setsize + set location;
		iniComp();
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void iniComp() {
		icon = new ImageIcon("download.jpg"); // icon
		this.setIconImage(icon.getImage());
		u = this.getContentPane();
		u.setLayout(null);
		f = new Font("Times New Roman", Font.HANGING_BASELINE, 30);

		initialPanel();
		u.add(heading);
		u.add(noticeButton);
		u.add(alumniButton);
		u.add(memberButton);
		//u.add(eventButton);
		u.add(backGroundLabel);
		u.add(backButton);
	}

	public void initialPanel() {
		backGroundLabel = new JLabel(
				new ImageIcon("2791.jpg"));
	//	backGroundLabel.setForeground(new Color(0, 0, 0));
		backGroundLabel.setBounds(0, 0, 1000, 788);
		//backGroundLabel.setOpaque(true);
		//backGroundLabel.setBackground(new Color(128, 128, 128));

		heading = new JLabel();
		heading.setText("WELCOME TO USER PANEL");
		heading.setBounds(300, 80, 500, 20);
		heading.setFont(f);
		heading.setForeground(Color.white);

		noticeButton = new JButton(new ImageIcon("notice1.jpg"));
		noticeButton.setBounds(100, 265, 200, 200);


		alumniButton = new JButton(new ImageIcon("alumni.jpg"));
		alumniButton.setBounds(400, 265, 200, 200);


		memberButton = new JButton(new ImageIcon("Member.png"));
		memberButton.setBounds(700, 265, 200, 200);
		
		backButton = new JButton("Back");
		backButton.setBounds(20, 30, 80, 30);
		backButton.setBackground(Color.black);
		backButton.setForeground(Color.cyan);

	eventButton = new JButton(new ImageIcon("userIcon.jpg"));
		eventButton.setBounds(700, 500, 200, 200);
		eventButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello");
			}
		});
		
	}
	


}
