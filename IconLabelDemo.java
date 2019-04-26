package projects;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class IconLabelDemo {

	IconLabelDemo(){
	JFrame jfrm = new JFrame("Use Images in labels");
	jfrm.getContentPane().setLayout(new GridLayout(4,1));
	jfrm.setSize(300, 300);
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	ImageIcon myIcon = new ImageIcon("/Users/Danny/Documents/gear.png");

	JLabel jlabIcon = new JLabel(myIcon);
	
	JLabel jlabIconTxt = new JLabel("Default icon and text position",myIcon,SwingConstants.CENTER);
	
	JLabel jlabIconTxt2= new JLabel("Text left of icon", myIcon, SwingConstants.CENTER);
	jlabIconTxt2.setHorizontalTextPosition(SwingConstants.LEFT);
	
	JLabel jlabIconTxt3 = new JLabel("Text over icon", myIcon, SwingConstants.CENTER);
	jlabIconTxt3.setVerticalTextPosition(SwingConstants.TOP);
	jlabIconTxt3.setHorizontalTextPosition(SwingConstants.CENTER);
	
	jfrm.getContentPane().add(jlabIcon);
	jfrm.getContentPane().add(jlabIconTxt);
	jfrm.getContentPane().add(jlabIconTxt2);
	jfrm.getContentPane().add(jlabIconTxt3);
	
	jfrm.setVisible(true);
}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new IconLabelDemo();
			}
		});
	}
}
