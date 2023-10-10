import stanford.karel.SuperKarel;
/*
 *  
 */
public class problem5 extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
		fillLine();
		goBack();
		if (frontIsClear()) {
		move();
		turnRight();
		move();
		fillLine();
		goBack();
		}
	}
		
		
	}
	private void fillLine() {
		while (frontIsClear()) {
			putBeeper();
			move();
			if (frontIsClear()) {
				move();
			}
		}
			if (frontIsBlocked()) {
				putBeeper();
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
		
		

	
