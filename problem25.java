import acm.program.ConsoleProgram;

public class problem25 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter number: ");
		int numberOfDivisors = calculation(n);
		println(numberOfDivisors);
	}

	private int calculation(int n) {
		int numberOfDivisors = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				numberOfDivisors += 1;
			}
		}
		
		
		return numberOfDivisors;
	}
}
