import acm.program.GraphicsProgram;

import java.awt.Color;

import acm.graphics.*;
/*
 *  
 */
public class Problem_8 extends GraphicsProgram {
	public void run() {
	drawMidLine();
		
		
	}
	private void drawMidLine() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = y1;
		GLine line = new GLine (x1,y1,x2,y2);
	}
}