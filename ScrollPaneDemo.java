package projects;
import javax.swing.*;

public class ScrollPaneDemo {
	
	ScrollPaneDemo(){
	
	JFrame jfrm = new JFrame("Use JScrollPane");
	
	jfrm.setSize(200, 120);
	
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JLabel jlab = 
			new JLabel("<html>JScrollPane simplifies what would<br>" + "otherwise be complicated tasks.<br>" + "It can be used to scroll any component<br>" + "or loghtweight container. It is espevcially<br>" + "usefull when scrolling tables,<br>" + "or images.");
	
	JScrollPane jscrlp = new JScrollPane(jlab);
	
	jfrm.getContentPane().add(jscrlp);
	
	jfrm.setVisible(true);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ScrollPaneDemo();
			}
		});
	}
}
