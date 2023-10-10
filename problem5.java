import stanford.karel.SuperKarel;
/*
 *  Chess
 */
public class problem5 extends SuperKarel {
	public void run() {
		if (frontIsBlocked()) {
			turnLeft();
			fillLine();
		}
		while (frontIsClear()) {
		fillLine();
		goBack();
		if (frontIsClear()) {
		move();
		turnRight();
		move();
		fillLine();
		goBack();
		if (frontIsClear()) {
			move();
			turnRight();
		}
		}
	}
		
		
	}
	private void fillLine() {
		putBeeper();
		move();
		while (frontIsClear()) {
			move();
			putBeeper();
			if (frontIsClear()) {
				move();
			}
			
		}
	}
	 
		private void goBack() {
		 turnAround();
		 while (frontIsClear()) {
			 move();
		 }
		 turnRight();
	 }
	
}
		
		

	
