import acm.program.ConsoleProgram;

public class problem4 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter number: ");
		for (int i = 0; i <= n - 1; i++ ) {
			println("Hello" + i + ".");
		}
	}
}

