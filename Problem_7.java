import acm.program.GraphicsProgram;
import acm.graphics.*;
/*
 *  
 */
public class Problem_7 extends GraphicsProgram {
	public void run() {
		
		GOval myOval = new GOval (100, 200);
		add(myOval, 100 ,200);
		GOval secondOval = new GOval (150, 15);
		add(secondOval, 200, 300);
		
	}
}