package projects;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class scrollBar {

	JLabel jlabVert;
	JLabel jlabHoriz;
	JLabel jlabSBInfo;
	
	JScrollBar jsbVert;
	JScrollBar jsbHoriz;
	
	scrollBar() {
		JFrame jfrm = new JFrame("Demonstrate Scroll Bars");
		
		jfrm.getContentPane().setLayout(new FlowLayout());
		
		jfrm.setSize(260, 260);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlabVert = new JLabel("Value of vertical scroll bar: 0");
		jlabHoriz = new JLabel("Value of horizontal scroll bar: 0");
		
		jsbVert = new JScrollBar();
		jsbHoriz = new JScrollBar(Adjustable.HORIZONTAL);
		
		jsbVert.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent ae) {
				if(jsbVert.getValueIsAdjusting()) return;
				
				jlabVert.setText("Value of vertical scroll bar: " + ae.getValue());
			}
		});
		
		
	jsbHoriz.addAdjustmentListener(new AdjustmentListener() {
		public void adjustmentValueChanged(AdjustmentEvent ae) {
			jlabHoriz.setText("Value of horizontal scroll bar: " + ae.getValue());
		}
	});
	
	jlabSBInfo = new JLabel("<html>Scroll Bar Defaults<br>" + 
							"Minimum value: " + 
							jsbVert.getMinimum() + "<br>" + 
							"Maximum value: " + 
							jsbVert.getMaximum() + "<br>" + 
							"Visible amount (extent): " + 
							jsbVert.getVisibleAmount() + "<br> " + 
							"Block increment: " + jsbVert.getBlockIncrement() + "<br>" + 
							"Unit increment: " + 
							jsbVert.getUnitIncrement());
	
	jfrm.getContentPane().add(jsbVert);
	jfrm.getContentPane().add(jsbHoriz);
	jfrm.getContentPane().add(jlabVert);
	jfrm.getContentPane().add(jlabHoriz);
	jfrm.getContentPane().add(jlabSBInfo);
	
	jfrm.setVisible(true);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new scrollBar();
			}
		});
	}
}