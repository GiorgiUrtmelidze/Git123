import stanford.karel.SuperKarel;

public class problem2 extends SuperKarel {
//Fill Line
//Go Down
//Go To The Other Arch If Exists
//Repeat If Possible
	public void run() {
	  for (int i = 0; i < 4; i++) {
		  move();		  
	  }
	  turnLeft();
	  for (int i = 0; i <6; i++) {
		  move();
		  putBeeper();
	  }
	  
	}
	
}