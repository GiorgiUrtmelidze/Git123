import stanford.karel.SuperKarel;
/*
 *  
 */
public class problem4 extends SuperKarel {
	public void run() {
		while (beepersPresent()) {
			pickBeeper();}
		while (frontIsClear()) {
			putBeeper();
			move();}
		}

	}	
