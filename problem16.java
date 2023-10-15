import acm.program.ConsoleProgram;

public class problem16 extends ConsoleProgram {

	public void run() {
	int first = readInt("Enter first number: ");
	int second = readInt("Enter second number: ");
	int third = readInt("Enter third number: ");
	int x = (first)*(second)*(third);
	int y = (first)*(second) + (first)*(third) + (second)*(third);
	double total = x/y;
	println("Your Number Is " + total + ".");
	}	

}
