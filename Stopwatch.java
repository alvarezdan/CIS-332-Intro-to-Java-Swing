package projects;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// this is a simple project using java swing: a stopwatch that has 2 buttons to start and stop a timer. 

public class Stopwatch implements ActionListener {

	JLabel jlab;
	long start; 
	
	Stopwatch() {
		//JFrame container
		JFrame jfrm = new JFrame("A Simple Stopwatch");
		jfrm.getContentPane().setLayout(new FlowLayout());
		jfrm.setSize(230, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//buttons
		JButton jbtnStart = new JButton("Start");
		JButton jbtnStop = new JButton("Stop");
		jbtnStart.addActionListener(this);
		jbtnStop.addActionListener(this);
		jfrm.getContentPane().add(jbtnStart);
		jfrm.getContentPane().add(jbtnStop);
		//text based label
		jlab = new JLabel("Press Start to begin timing.");
		jfrm.getContentPane().add(jlab);
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		Calendar cal = Calendar.getInstance();
			if(ae.getActionCommand().equals("Start")) 
			{	start = cal.getTimeInMillis();
				jlab.setText("Stopwatch is Running..."); }
			else
				jlab.setText("Elapsed time is " + (double) (cal.getTimeInMillis() - start)/1000); 
			}	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Stopwatch();
			}
		});
	}
}
