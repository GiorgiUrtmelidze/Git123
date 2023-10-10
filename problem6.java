import stanford.karel.SuperKarel;
/*
 *  
 */
public class problem6 extends SuperKarel {
	public void run() {
		fillLine();
		turnAround();
		takeBeepersFromEachSideFirst();
		while (beepersPresent()) {
		takeBeepersFromEachSideSecond();
		}
		turnAround();
		move();
		putBeeper();
	}
	private void fillLine() {
		putBeeper();
		while (frontIsClear()) {
			move();
			putBeeper();
		}
	}
	private void takeBeepersFromEachSideFirst() {
		pickBeeper();
		while (frontIsClear()) {
			move();
		}
		pickBeeper();
		turnAround();
		move();
	}
		
		private void takeBeepersFromEachSideSecond() {
		while (beepersPresent()) {
			move();
		}
		turnAround();
		move();
		pickBeeper();
		move();
	}
}
	
