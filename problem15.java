import acm.program.ConsoleProgram;

public class problem15 extends ConsoleProgram {

	public void run() {
		println("Hello");
		int numberOne = readInt("Enter First Number: ");
		int numberSecond = readInt("Enter Second Number: ");
		double x = 0.5;
		double total = ((numberOne + numberSecond)/2 + x);
		if (numberOne%2==0 && numberSecond%2==0) {
		x = 0;
		println("The answer is ->" + total + "."); 
		} else {
			println("The answer is ->" + total  + ".");
		}
		
	
	}

	
	
}
