package design;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

/**
 *
 * @author ASUS
 */
public class NoticeDesign extends JFrame {

	private ImageIcon icon;
	private JLabel heading, time, dateShow;
	private Container c;
	private Font f;
	public JButton backButton;

	JTextPane textPane;
	JLabel l3;

	JButton savebutton;

	public NoticeDesign() {
		getContentPane().setBackground(new Color(0, 0, 0));
		setTitle("NOTICE PANEL");
		setBounds(500, 100, 800, 800); // setsize + set location;
		c = this.getContentPane();
		setTime();
		getContentPane().setLayout(null);
		c.add(time);
		c.add(dateShow);
		c.add(backButton);

	}

	public void userNotice() {
		iniUserComp();
		closing();
	}

	public void iniUserComp() {
		icon = new ImageIcon("download.jpg"); // icon
		this.setIconImage(icon.getImage());
		f = new Font("Times New Roma", Font.HANGING_BASELINE, 20);
		heading = new JLabel();
		heading.setText("WELCOME TO NOTICE PANEL");
		heading.setBounds(250, 60, 500, 20);
		heading.setFont(f);
		heading.setForeground(Color.cyan);

		c.add(heading);
		userShowMessage();
		c.add(textPane);
		c.setBackground(Color.BLACK);
		l3 = new JLabel(new ImageIcon("cur.gif"));
		l3.setBounds(0, 150, 800, 800);
		c.add(l3);
		c.setLayout(null);

	}

	public void userShowMessage() {
		textPane = new JTextPane();
		File file = new File("Notice.txt");
		textPane.setBounds(180, 150, 420, 300);
		textPane.setEditable(false);

		try {
			// Read the contents of the file into a string
			String content = new String(Files.readAllBytes(file.toPath()));
			// Set the text of the text pane to the contents of the file
			textPane.setText(content);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void adminNotice() {
			iniAdminComp();
			closing();
	}

	public void iniAdminComp() {

		c = this.getContentPane();
		icon = new ImageIcon("download.jpg"); // icon
		this.setIconImage(icon.getImage());

		f = new Font("Times New Roman", Font.HANGING_BASELINE, 20);

		heading = new JLabel();
		heading.setText("WELCOME TO NOTICE PANEL");
		heading.setBounds(250, 60, 500, 20);
		heading.setFont(f);
		heading.setForeground(Color.cyan);

		c.add(heading);
		adminEditMessage();
		c.add(textPane);
		c.add(savebutton);
		c.setBackground(Color.BLACK);

		l3 = new JLabel(new ImageIcon("cur.gif"));

		l3.setBounds(0, 70, 800, 800);

		c.add(l3);
		c.setLayout(null);

	}

	public void adminEditMessage() {
		try {
			textPane = new JTextPane();
			File file = new File("Notice.txt");
			textPane.setBounds(180, 150, 420, 300);
			// Read the contents of the file into a string
			String content = new String(Files.readAllBytes(file.toPath()));
			// Set the text of the text pane to the contents of the file
			textPane.setText(content);

			savebutton = new JButton("Save");
			savebutton.setBounds(650, 200, 80, 30);
			savebutton.setForeground(Color.cyan);
			savebutton.setBackground(Color.black);
			c.add(savebutton);
// Add an action listener to the button/
			savebutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Get the text from the text pane
					String text = textPane.getText();

					// Write the text to the file, appending to the end of the file
					try {
						BufferedWriter fw = new BufferedWriter(new FileWriter("Notice.txt"));
						fw.write(text);
						fw.close();
					} catch (IOException ef) {
						// handle the exception
					}

				}
			});
		} catch (Exception e) {

		}
		
		
		
		

	}

	public void setTime() {
		time = new JLabel("TIME :");
		time.setBounds(600, 40, 49, 14);
		time.setForeground(Color.white);

		dateShow = new JLabel("");
		dateShow.setBounds(600, 60, 182, 14);
		dateShow.setForeground(Color.white);

		Date dt = new Date();

		String dat = String.valueOf(dt);
		dateShow.setText(dat);
		
		
		backButton = new JButton("Back");
		backButton.setBounds(20, 30, 80, 30);
		backButton.setForeground(Color.cyan);
		backButton.setBackground(Color.black);

	}

	public void closing() {
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) throws IOException {
		NoticeDesign notice = new NoticeDesign();
		notice.adminNotice();
	}

}
