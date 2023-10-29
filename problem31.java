import acm.program.ConsoleProgram;

public class problem31 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter number: ");
		int d = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				d += 1;
			}
		}
		if ( d == 2) {
			println("Your number is prime");
		}
	}
}
