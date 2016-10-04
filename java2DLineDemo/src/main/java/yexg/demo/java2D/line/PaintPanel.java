package yexg.demo.java2D.line;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
        LineBean bean = new LineBean();
        drawLine(g2, bean);
	}
	
	public void drawLine(Graphics2D g2d, LineBean bean){
//		Line2D line = new Line2D.Float(bean.startx, bean.starty, bean.endx, bean.endy);
//		g2d.drawRect(bean.startx, bean.starty, bean.endx-bean.startx, bean.width);
		g2d.setColor(bean.color);
		g2d.fillRect(bean.startx, bean.starty, bean.endx-bean.startx, bean.width);
//		g2d.draw(line);
		int lineLength = bean.endx -bean.startx;
		float one = lineLength/bean.split;
		int spacing = 10+bean.width;
		if(one>0.00000000000000001){
			LineBean tmpBean = new LineBean();
			tmpBean.starty = bean.starty-spacing;
			tmpBean.endy = bean.endy - spacing;
			
			for(int i=0; i<bean.split; i++){
				if((i+1)%2==0){
					continue;
				}
				tmpBean.startx = (int) (bean.startx+one*i);
				tmpBean.endx = (int) (tmpBean.startx+one);
				drawLine(g2d, tmpBean);
			}
			
		}
	}
	
}
