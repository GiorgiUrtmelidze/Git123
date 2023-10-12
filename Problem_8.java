import acm.program.GraphicsProgram;

import java.awt.Color;

import acm.graphics.*;
/*
 *  
 */
public class Problem_8 extends GraphicsProgram {
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 300;
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGHT = 60;

	public void run() {
	drawHome;
		
		
	}
	private void drawHome() {
		drawWall();
		drawRoof();
		drawDoor();
		drawWindow();
	}
	private void drawWall() {
		GRect wall = new GRect ( HOUSE_WIDTH ,HOUSE_HEIGHT );
		
	}

	
	
	
	
	
	//	private void drawMidLine() {
//		double x1 = 0;
//		double y1 = getHeight() / 2;
//		double x2 = getWidth();
//		double y2 = y1;
//		GLine line = new GLine (x1,y1,x2,y2);
//		add(line);
//	}
	
}
