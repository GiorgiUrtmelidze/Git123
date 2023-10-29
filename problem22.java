import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem22 extends GraphicsProgram {
	private static final int NUM_SQUARES = 50;
		public void run() {
			colorChessBoard();
		}
		private void colorChessBoard() {
			double sqSize = getHeight() / NUM_SQUARES;
			for (int i = 0; i < NUM_SQUARES; i++) {
				for (int j = 0; j < NUM_SQUARES; j++) {
					double x = j*sqSize;
					double y = i*sqSize;
					GRect square = new GRect(x, y, sqSize, sqSize);
					add(square);
					
					if (i%2 == 0 && j%2 != 0) {
					square.setFilled(true);
					}
					if (i%2 != 0 && j%2 == 0) {
					square.setFilled(true);
					}
				}
			}
			
	}
	
}

	
	
	