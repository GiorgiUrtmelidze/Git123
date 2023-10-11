import acm.program.GraphicsProgram;
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
		
		GRect window = new GRect (50, 90);
		add(window, 480,445);
		
		
	}
}
