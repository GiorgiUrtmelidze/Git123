import stanford.karel.SuperKarel;

public class problem2 extends SuperKarel {
//	
//	1.Go Out
//	2. Pick Beeper
//	3. Get Inside
//	
	public void run() {
		goOut();
		pickBeeper();
		getInside();
		
	}
	private void goOut() {
		while (frontIsClear()) {
			move();
		}
		turnRight();
		move();
		turnLeft();
		move();
	}
	private void getInside() {
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnAround();
	}
	
}