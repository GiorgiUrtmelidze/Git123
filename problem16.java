import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram {

	public void run() {
	int first = readInt("Enter first number: ");
	int second = readInt("Enter second number: ");
	int third = readInt("Enter third number: ");
	double total = ((first)*(second) + (first)*(third) + (second)*(third))/((first)*(second)*(third));
	println("Your Number Is " + total + ".");
	}



	
	
}
