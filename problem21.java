import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem21 extends GraphicsProgram {
	private static final int NUM_LINES = 11;
	public void run() {
		for (int i = 0; i < NUM_LINES; i++) {
			drawHorisontalLine(i);
		}
		
		
}
	private void drawHorisontalLine(int i) {
		double y1 = (getHeight()) / (NUM_LINES - 1)*i;
		double x1 = 0;
		double x2 = getWidth();
		double y2 = y1;
		GLine hLine = new GLine (x1, y1, x2, y2);
		add(hLine);
	}
}
	
	
	