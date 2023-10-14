import stanford.karel.SuperKarel;

public class problem5 extends SuperKarel {
//	If We Have 1xY Chessboard Karel Will Only Fill 1 line up
//	
//	If We Have (2,3,4,5...)xY Board Karel Will Fill The Horisontal Line 
//	Then It Will Return To The First Position
//	Then If Upper Block Is Clear It Will Move Up And Continue Filling
//	
//	This Process Continues Until Upper Block Is Blocked
	
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
		
		

	
