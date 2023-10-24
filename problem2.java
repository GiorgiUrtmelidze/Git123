import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem2 extends GraphicsProgram {
	public void run() {
		
//		FirstCircle Coordinates and position
		double r1 = 72;
		double x1 = getWidth() / 2 - r1;
		double y1 = getHeight() / 2 - r1;
		GOval firstCircle = new GOval (x1, y1, 2*r1, 2*r1);
		firstCircle.setFilled (true);
		firstCircle.setColor(Color.red);
		add(firstCircle);
		
//		Second Circle (white)
//		If 2.54cm = 72 pixel
//		Then Z cm = (72*Z)/2.54 pixel
		double r2 = (72 * 1.65) / 2.54;
		double x2 = getWidth() / 2 - r2;
		double y2 = getHeight() / 2 - r2;
		GOval secondCircle = new GOval (x2, y2, 2*r2, 2*r2);
		secondCircle.setFilled (true);
		secondCircle.setColor(Color.white);
		add(secondCircle);
		
//		Third Circle
		double r3 = (72 * 0.76) / 2.54;
		double x3 = getWidth() / 2 - r3;
		double y3 = getHeight() / 2 - r3;
		GOval thirdCircle = new GOval (x3, y3, 2*r3, 2*r3);
		thirdCircle.setFilled (true);
		thirdCircle.setColor(Color.red);
		add(thirdCircle);
			}
}