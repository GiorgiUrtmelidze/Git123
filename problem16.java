import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram {

	public void run() {
	int first = readInt("Enter first number: ");
	int second = readInt("Enter second number: ");
	int third = readInt("Enter third number: ");
	double x = (first)*(second)*(third);
	double y = (first)*(second) + (first)*(third) + (second)*(third);
	println("Your Number Is " + x/y + ".");
	
	
	}	

}
