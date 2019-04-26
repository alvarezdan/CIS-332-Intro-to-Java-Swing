package projects;
import javax.swing.*;

public class TabbedPaneDemo {

	TabbedPaneDemo() {
		JFrame jfrm = new JFrame("Tabbed Pane Demo");
		
		jfrm.setSize(380, 150);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane jtp = new JTabbedPane();
		
		jtp.addTab("File Manager", 
					new JLabel("This is the File Manager Tab."));
		jtp.addTab("Performance", 
				new JLabel("This is the Performance Tab."));
		jtp.addTab("Reports", 
				new JLabel("This is the Reports Tab."));
		jtp.addTab("Customize", 
				new JLabel("This is the Customize Tab."));
		
		jfrm.getContentPane().add(jtp);
		
		jfrm.setVisible(true);
	}			
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TabbedPaneDemo();
			}
		});
	}
}
