import acm.program.GraphicsProgram;
import acm.graphics.*;
/*
 *  
 */
public class Problem_7 extends GraphicsProgram {
	public void run() {
		add(new GOval(100, 200), 100, 100);
		GOval myOval = new GOval (100, 200);
		add(myOval, 100 ,400);
	}
}