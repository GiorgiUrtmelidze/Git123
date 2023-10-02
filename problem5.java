import stanford.karel.SuperKarel;
public class problem5 extends SuperKarel {
	public void run() {
		for (int i = 0; i < 9; i++) {
			if (frontIsClear()) {
			move();
		} else {
			jump();
			}
		}
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		}
	
		public void jump() {
			accend();
			move();
			decend();
		 }
		public void accend() {
			turnLeft();
			while (rightIsBlocked()) {
				move();
			}
			turnRight();
	
		}
		public void decend() {
			turnRight();
			while (frontIsClear()) {
				move();
			}
		turnLeft();
		}
				
			
				
		
		}
			
		
		

	
