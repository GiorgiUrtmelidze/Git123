import stanford.karel.SuperKarel;
/*
 *  Archs
 */
public class problem4 extends SuperKarel {
	public void run() {
	  while (frontIsClear()) {
		  fillLine();
		  goDown();
		  for (int i = 0; i < 4; i++) {
			  move();
		  }
	  }
	  fillLine();
	  goDown();
	}
	private void fillLine() {
		turnLeft();
		if (noBeepersPresent()) {
		   putBeeper();
		}
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {		                       
			 putBeeper();
			}
		}
	}
	private void goDown() {
		turnAround();
		while (frontIsClear()) {
			move();
					}
		turnLeft();
	
	}
	
}