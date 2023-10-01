import stanford.karel.SuperKarel;
/*
 *  
 */
public class problem4 extends SuperKarel {
	public void run() {
		
		while (frontIsClear()) {
			if (beepersPresent()) {
				move();
			} else {
					putBeeper();
					move();
				}
			}
		}

	}	
