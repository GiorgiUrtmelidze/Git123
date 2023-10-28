import acm.program.ConsoleProgram;

public class problem26 extends ConsoleProgram {

	public void run() {
		int n1 = readInt("Enter first number: ");
		int n2 = readInt("Enter second number: ");
		int lcm = calculatelcm(n1, n2);
		println(lcm);
	}

	private int calculatelcm(int n1, int n2) {
		int lcm = 0;
		for (lcm = n1; ;lcm++) {
			if (lcm%n1 == 0 && lcm%n2 == 0) {
			return lcm;
			}
		}
		
	}
}
