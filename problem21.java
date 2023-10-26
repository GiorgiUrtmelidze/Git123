import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem21 extends GraphicsProgram {
	private static final int NUM_LINES = 11;
	public void run() {
		for (int i = 0; i < NUM_LINES; i++) {
			drawHorisontalLine(i);
			drawVerticalLine(i);
		}
		
		
}
	private void drawVerticalLine(int i) {
		double x3 = i*(getWidth() / (NUM_LINES - 1));
		double y3 = 0;
		double y4 = getHeight();
		GLine vLine = new GLine (x3, y4, x3, y4);
		add(vLine);
		
	}
	private void drawHorisontalLine(int i) {
		double y1 = (getHeight()) / (NUM_LINES - 1)*i;
		double x1 = 0;
		double x2 = getWidth();
		GLine hLine = new GLine (x1, y1, x2, y1);
		add(hLine);
	}
}
	
	
	