import acm.program.ConsoleProgram;

public class problem15 extends ConsoleProgram {

	public void run() {
		println("Hello");
		int numberOne = readInt("Enter First Number: ");
		int numberSecond = readInt("Enter Second Number: ");
		int total = (numberOne + numberSecond)/2;
		println("The answer is ->" + total + "."); 
	
	}

}
