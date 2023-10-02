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
	}
		public void jump() {
			accend();
			turnRight();
			move();
			decend();
		 }
		public void accend() {
			turnLeft();
			while (rightIsBlocked()) {
				move();
			}
	
		}
		public void decend() {
			turnRight();
			while (frontIsClear()) {
				move();
				
			
				
		}
		public void	
		}
			
		
		
	}
	
