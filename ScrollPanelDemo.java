package projects;
import java.awt.*;
import javax.swing.*;

public class ScrollPanelDemo {
	ScrollPanelDemo() {
		JFrame jfrm = new JFrame("Scroll a JPanel");
		
		jfrm.setSize(300, 150);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlabOptions = new
			JLabel("Select one or more options: ");
		
		JCheckBox jcbOpt1 = new JCheckBox("Option One");
		JCheckBox jcbOpt2 = new JCheckBox("Option two");
		JCheckBox jcbOpt3 = new JCheckBox("Option Three");
		JCheckBox jcbOpt4 = new JCheckBox("Option Four");
		JCheckBox jcbOpt5 = new JCheckBox("Option Five");
		JCheckBox jcbOpt6 = new JCheckBox("Option Six");
		
		JPanel jpnl = new JPanel();
		
		jpnl.setLayout(new GridLayout(7, 1));
		jpnl.setOpaque(true);
		
		jpnl.add(jlabOptions);
		jpnl.add(jcbOpt1);
		jpnl.add(jcbOpt1);
		jpnl.add(jcbOpt2);
		jpnl.add(jcbOpt3);
		jpnl.add(jcbOpt4);
		jpnl.add(jcbOpt5);
		jpnl.add(jcbOpt6);
		
		JScrollPane jscrlp = new JScrollPane(jpnl);
		
		jfrm.getContentPane().add(jscrlp);
		
		jfrm.setVisible(true);
	}			
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ScrollPanelDemo();
			}
		});
	}
}
