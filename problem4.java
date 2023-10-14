import stanford.karel.SuperKarel;

public class problem4 extends SuperKarel {
	
//	Karel Will Fill First Line Totally. Then It Will Pick Up One Beeper
//	From Each Side Constantly
//	(Firstly From Left Side And Then From The Other Side).
//	
//	Karel Will Stop When It Will Stand Exactly In The Midlle
//	Or In One Of 2 Blocks Which Are In The Middle
	
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
		if (leftIsBlocked()) {
			turnAround();
		}
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
	