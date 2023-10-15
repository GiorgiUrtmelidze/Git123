import stanford.karel.SuperKarel;

public class problem2 extends SuperKarel {
//Fill Line
//Go Down
//Go To The Other Arch If Exists
//Repeat If Possible
	public void run() {
	  move();
	  turnLeft();
	  for (int i = 0; i < 7; i++) {
		  move();
	  }
	  turnRight();
	  move();
	  putBeeper();
	  move();
	  putBeeper();
	  move();
	  move();
	  putBeeper();
	  move();
	  putBeeper();
	  move();
	  turnRight();
	  move();
	  turnRight();
	  for (int i = 0; i < 3; i++) {
		  fillLine();		  
	  }
	  turnRight();
	  move();
	  
	}
	private void fillLine() {
		putBeeper();
		for (int i = 0; i < 6; i++) {
			move();
			putBeeper();
		}
	}
	
}