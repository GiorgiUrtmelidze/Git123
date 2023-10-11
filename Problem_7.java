import acm.program.GraphicsProgram;

import java.awt.Color;

import acm.graphics.*;
/*
 *  
 */
public class Problem_7 extends GraphicsProgram {
	public void run() {
		GRect rectangle = new GRect(500, 200);
		add(rectangle, 400,400);
		
		GLine line = new GLine (360,400,650,300);
		add(line);
		GLine line2 = new GLine (650,300,940,400);
		add(line2);
		GLine line3 = new GLine (360,400,940,400);
		add(line3);
		
		GRect door = new GRect (40,100);
		add(door, 630, 500);
		
		GRect window1 = new GRect (50, 90);
		add(window1, 480,445);
		GRect window2 = new GRect (50, 90);
		add(window2, 770, 445);
		
		GLine line4 = new GLine (480,480,530,480);
		add(line4);
		GLine line5 = new GLine (505,480,505,535);
		add(line5);
		GLine line6 = new GLine (770,480,820,480);
		add(line6);
		GLine line7 = new GLine (795,480,795,535);
		add(line7);
		
		rectangle.setColor(Color.orange);
		rectangle.setFilled(true);
		window1.setColor(Color.cyan);
		window1.setFilled(true);
		window2.setColor(Color.cyan);
		window2.setFilled(true);
		door.setColor(Color.red);
		door.setFilled(true);
		(line1, line2, line3).setColor(Color.gray);
		
		
		
		
		
		
	}
}
