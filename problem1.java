import stanford.karel.*;
/*
 * კარელი დგას 1x1 უჯრაზე. 3x1 უჯრაზე დევს ბრილიანტი, კარელმა ბრილიანტი უნდა
გადაიტანოს 4x1 უჯრაზე და დაამთავროს მუშაობა. 
 */
public class problem1 extends SuperKarel {
	public void run() {
		while (frontIsClear()) { 
		fillLine();
		turnaround();
		if (frontIsClear()) {
			moveup();
		}
		}
	}
	

	private void moveup() {
		
		move();
		turnRight();
		
		
	}


	private void turnaround() {
		turnLeft();
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnRight();
	}


	private void fillLine() {
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
			
		}
		if (noBeepersPresent()) {
			putBeeper();
		}
		}
	}
	

	
