import stanford.karel.SuperKarel;
/*კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.
 *  
 */
public class problem2 extends SuperKarel {
	public void run() {
		move();
		move();
		turnRight();
		turnRight();
		while (beepersPresent()) {
			pickBeeper();
			move();
			pickBeeper();
			turnRight();
			turnRight();
			move();
			turnRight();
			turnRight();
			
		}
		move();
		turnRight();
		turnRight();
		while (beepersPresent()) {
	         pickBeeper();
	         move();
	         move();
	         putBeeper();
	         turnLeft();
	         turnLeft();
	         move();
	         move();
	         turnLeft();
	         turnLeft();
		}
	}
	
}
