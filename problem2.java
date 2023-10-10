import stanford.karel.SuperKarel;
/*
 *  pickbeeper
 */
public class problem2 extends SuperKarel {
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