import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem2 extends GraphicsProgram {
	public void run() {
		int x1 = getWidth() / 2 - 72;
		int y1 = getHeight() / 2 - 72;
		GOval firstCircle = new GOval (x1, y1, 144, 144);
		firstCircle.setFilled (true);
		firstCircle.setColor(Color.red);
		add(firstCircle);
	  
	}
}