import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram {

	public void run() {
		double x = readInt("Enter your number: ");
		if (x < 1) {
			println("0 and x");
		}
		if (x > 1) {
			for ( x > 1; x-- );
			print(x);
		}
		}	
}
