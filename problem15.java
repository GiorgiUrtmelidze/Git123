import acm.program.ConsoleProgram;

public class problem15 extends ConsoleProgram {

	public void run() {
		println("Hello");
		int numberOne = readInt("Enter First Number: ");
		int numberSecond = readInt("Enter Second Number: ");
		int total = ((numberOne + numberSecond)/2 );
		double y = total + 0.5;
		if (numberOne%2==0 && numberSecond%2==0) {
		println("The answer is ->" + total + "."); 
		} else {
			println("The answer is ->" + y + ".");
		}
		
	
	}

	
	
}
