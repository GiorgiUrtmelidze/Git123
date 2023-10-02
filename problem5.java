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
	
}