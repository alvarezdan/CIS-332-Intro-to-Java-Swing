package projects;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jpanel {

	JLabel jlab;
	JButton jbtnUp;
	JButton jbtnDown;
	
	jpanel(){
		JFrame jfrm = new JFrame("Use Two JPanels");
		
		jfrm.getContentPane().setLayout(new FlowLayout());
		
		jfrm.setSize(210, 210);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpnl = new JPanel(); //first jpanel
		
			jpnl.setPreferredSize(new Dimension(100, 100));
			
			jpnl.setOpaque(true);
			
			jpnl. setBorder(
					BorderFactory.createLineBorder(Color.YELLOW));
		
		JPanel jpnl2 = new JPanel(); //second jpanel
				
				jpnl2.setPreferredSize(new Dimension(100, 60));
				
				jpnl2.setOpaque(true);
				
				jpnl2. setBorder(
						BorderFactory.createLineBorder(Color.BLACK));
				
		jlab = new JLabel("Press a button.");
		
		jbtnUp = new JButton("Up");
		jbtnDown = new JButton("Down");
		
		jbtnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Up pressed.");
			}
		});
		
		jbtnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Down pressed.");
			}
		});
		
		jpnl.add(jbtnUp);
		jpnl.add(jbtnDown);
		jpnl.add(jlab);
		
		jpnl2.add(new JLabel("One"));
		jpnl2.add(new JLabel("Two"));
		jpnl2.add(new JLabel("Three"));
		
		jfrm.getContentPane().add(jpnl);
		jfrm.getContentPane().add(jpnl2);
		
		jfrm.setVisible(true);
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new jpanel();
			}
		});
	}
}
