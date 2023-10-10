import stanford.karel.SuperKarel;
/*
 *  
 */
public class problem6 extends SuperKarel {
	public void run() {
		fillLine();
		takeBeeperFromEachSide();
		stop();
	}
	private void fillLine() {
		putBeeper();
		while (frontIsClear()) {
			move();
			putBeeper();
		}
	}
	private void takeBeeperFromEachSide() {
		turnAround();
		pickBeeper();
		while (frontIsClear()) {
			move();
		}
		pickBeeper();
		turnAround();
		move();
		
		while (beepersPresent()) {
			move();
		}
		turnAround();
		move();
		pickBeeper();
		move();
	}
}
	
