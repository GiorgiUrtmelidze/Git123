import acm.program.GraphicsProgram;

import java.awt.Color;

import acm.graphics.*;
/*
 *  
 */
public class Problem_7 extends GraphicsProgram {
	public void run() {
		
		GOval myOval = new GOval (100, 200);
		add(myOval, 100 ,200);
		
		GOval secondOval = new GOval (350, 350);
		add(secondOval, 200, 101);
		secondOval.setFilled(true);
		secondOval.setColor(Color.cyan);
		myOval.setColor(Color.red);
		
		
		
	}
}