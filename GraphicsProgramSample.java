/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.graphics.*;
import acm.program.*;

public class GraphicsProgramSample extends GraphicsProgram {
	
	public void run() {
		double x1 = 200;
		double y1 = 200;
		GRect n1 = new GRect(x1,y1,50,50);
		for (int i = 0; i < 5; i++) {
			add(n1);
			x1 = x1 + 80;
			add(n1,x1);
		}
		
		
		
	
	}

}
