import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram {

	public void run() {
		double x = readDouble("Enter your number: ");
		println((int) x); 
		double z = x - (int) x;
		println(z);
		
	}
}
