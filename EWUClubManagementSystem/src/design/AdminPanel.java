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
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author ASUS
 */
public class AdminPanel extends JFrame {

	// variable's declearation 
	private ImageIcon icon;
	private JLabel heading;
	private Container c;
	private Font f;

	public JButton noticeButton;
	public JButton alumniButton;
	public JButton memberButton;
	public JButton backButton;
	private JButton eventButton;
	private JLabel noticeLB;
	private JLabel alumniLB;
	private JLabel eventLB;
	private JLabel memberLB;
	
	public JLabel  backgroundLabel;
	

	// Default Constructor
	public AdminPanel() {
		setTitle("ADMIN PANEL");
		setBounds(500, 100, 1000, 788); // setsize + set location;
		iniComp();
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void iniComp() {
		icon = new ImageIcon("download.jpg"); // icon
		this.setIconImage(icon.getImage());
		c = this.getContentPane();
		f = new Font("Times New Roman", Font.HANGING_BASELINE, 30);
		formatLabels();
		getContentPane().setLayout(null);
		
		c.add(heading);
		formatButton();
		//c.add(noticeLB);
		//c.add(alumniLB);
		//c.add(eventLB);
		//c.add(memberLB);
		c.add(noticeButton);
		c.add(alumniButton);
		c.add(memberButton);
		//c.add(eventButton);
		c.add(backButton);
		formatBackground();
		c.add(backgroundLabel);
	}

	public void formatLabels() {
		heading = new JLabel();
		heading.setBounds(300, 80, 500, 20);
		heading.setText("WELCOME TO ADMIN PANEL");
		heading.setForeground(Color.white);
		heading.setFont(f);

		memberLB = new JLabel(
				"MEMBER");
		memberLB.setOpaque(true);
		memberLB.setBounds(309, 653, 217, 54);

		noticeLB = new JLabel("NOTICE");
		noticeLB.setOpaque(true);
		noticeLB.setBounds(309, 348, 217, 54);

		alumniLB = new JLabel("ALUMNI");
		alumniLB.setOpaque(true);
		alumniLB.setBounds(739, 348, 217, 54);

		eventLB = new JLabel("Event");
		eventLB.setOpaque(true);
		eventLB.setBounds(751, 646, 217, 54);
	}

	public void formatButton() {
		noticeButton = new JButton("");
		noticeButton.setVerticalTextPosition(JButton.TOP);
		noticeButton.setHorizontalTextPosition(JButton.LEFT);
		noticeButton.setOpaque(true);
		noticeButton.setIcon(new ImageIcon("notice1.jpg"));
		noticeButton.setBounds(100, 265, 200, 206);
		noticeButton.setBorder(new LineBorder(Color.BLACK, 4));


		alumniButton = new JButton(new ImageIcon("alumni.jpg"));
		alumniButton.setHorizontalTextPosition(SwingConstants.CENTER);
		alumniButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		alumniButton.setOpaque(true);
		alumniButton.setBounds(400, 265, 200, 206);
		alumniButton.setBorder(new LineBorder(Color.BLACK, 4));

		memberButton = new JButton(new ImageIcon("Member.png"));
		memberButton.setBounds(700, 265, 200, 206);
		memberButton.setBorder(new LineBorder(Color.BLACK, 4));

		/*eventButton = new JButton(new ImageIcon("userIcon.jpg"));
		eventButton.setBounds(751, 450, 200, 200);
		eventButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Event");
			}
		}); */
		
		
	
	backButton = new JButton("Back");
	backButton.setBounds(20, 650, 80, 30);
	backButton.setBackground(Color.black);
	backButton.setForeground(Color.cyan);
}
	public void formatBackground() {
		backgroundLabel = new JLabel(
				new ImageIcon("2791.jpg"));
		backgroundLabel.setBounds(0, 0, 1000, 788);
		backgroundLabel.setOpaque(true);
		
	}
}