package yexg.demo.java2D.line;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SplitLine2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitLine2D split = new SplitLine2D();
		split.runDemo();
	}
	
	public void runDemo(){
		JFrame frame = new JFrame("2D Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
		
		JPanel panel = new PaintPanel();
		frame.getContentPane().add(panel);
	}
	
	public void drawLine(){
		
	}

}
