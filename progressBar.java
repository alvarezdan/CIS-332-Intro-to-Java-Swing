package projects;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class progressBar {
	
	JLabel jlabVert;
	JLabel jlabHoriz;
	
	JProgressBar jprogHoriz;
	JProgressBar jprogVert;
	
	JButton jbtn;
	
	progressBar () {
		JFrame jfrm = new JFrame("Demonstrate Progress Bars");
		
		jfrm.getContentPane().setLayout(new FlowLayout());
		
		jfrm.setSize(280, 270);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jprogVert = new JProgressBar(JProgressBar.VERTICAL);
		jprogHoriz = new JProgressBar();
		
		jprogVert.setStringPainted(true);
		jprogHoriz.setStringPainted(true);
		
		jbtn = new JButton("Push Me");
		
		jlabHoriz = new JLabel("Value of horizontal progress bar: " +
								jprogHoriz.getValue());
		jlabVert = new JLabel("Value of vertical progress bar: " +
								jprogVert.getValue());
		
		jbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) { 
				int hVal = jprogHoriz.getValue();
				int vVal = jprogVert.getValue();
				
				if(hVal >= jprogHoriz.getMaximum())
					return;
				else
					jprogHoriz.setValue(hVal + 10);
				
				if(vVal >= jprogVert.getMaximum())
					return;
				else
					jprogVert.setValue(vVal + 10);
				
				jlabHoriz.setText("Value of horizontal progress bar: " +
									jprogHoriz.getValue());
				jlabVert.setText("Value of vertical progress bar: " +
									jprogVert.getValue());
			}
		});
		jfrm.getContentPane().add(jprogHoriz);
		jfrm.getContentPane().add(jprogVert);
		jfrm.getContentPane().add(jlabHoriz);
		jfrm.getContentPane().add(jlabVert);
		jfrm.getContentPane().add(jbtn);
		
		jfrm.setVisible(true);
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new progressBar();
			}
		});
	}
}