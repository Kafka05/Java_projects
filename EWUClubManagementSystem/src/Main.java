import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		Animation ani = new Animation();
	}

}


class Animation{
	JFrame frame = new JFrame();
    JLabel l1;
    
    Animation() throws IOException, InterruptedException{
    	 frame.setBounds(600, 300, 500, 300);
    	  ImageIcon icon = new ImageIcon(("wel.gif"));
    	 l1 = new JLabel(icon);
         l1.setBounds(0, 0, 500, 300);
         frame.setUndecorated(true);
         frame.add(l1);
         
         
         frame.setVisible(true);
          Thread.sleep(10000);  // pause for 10 seconds
		 frame.setVisible(false);
		 ClubManagmentSystem cms = new ClubManagmentSystem();
			cms.initialize();

          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      }
    
}





