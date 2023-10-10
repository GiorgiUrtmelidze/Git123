import stanford.karel.SuperKarel;
/*
 *  
 */
public class problem5 extends SuperKarel {
	public void run() {
		fillLine();
		
		
		
	}
	private void fillLine() {
		while (frontIsClear()) {
			putBeeper();
			move();
			if (frontIsClear()) {
				move();
			}
			if (frontIsBlocked()) {
				putBeeper();
			}
			
		}
	}
	
}
		
		

	
