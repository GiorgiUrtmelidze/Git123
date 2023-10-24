import acm.program.ConsoleProgram;

public class problem4 extends ConsoleProgram {

	public void run() {
		println("This program calculates the hypotenuse with Pythagorean Theorem");
		double a = readInt("Enter first number: ");
		double b = readInt("Enter second number: ");
		double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
		double c = Math.sqrt(cSquared);
		println(c);
		
	}
}

