import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram {

	public void run() {
	int first = readInt("Enter first number: ");
	int second = readInt("Enter second number: ");
	int third = readInt("Enter third number: ");
	double total = (1/(1/first + 1/second + 1/third));
	println("Your Number Is " + total + ".");
	}



	
	
}
