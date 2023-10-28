import acm.program.ConsoleProgram;

public class problem29 extends ConsoleProgram {

	public void run() {
		println("This program only calculates n^m only for positive n and m integers");
		int n = readInt("Enter number: ");
		int m = readInt("Enter second number: ");
		if (n <= 0 || m <= 0) {
			println("This program only calculates n^m only for positive n and m integers");
		} else {
		int nToThePowerM = calculate(n, m);
		println(nToThePowerM);
		}
	}

	private int calculate(int n, int m) {
		int nToThePowerM = 1;
		for (int i =0; i < m; i++) {
			nToThePowerM *= n;
		}
		return nToThePowerM;
	}
}
