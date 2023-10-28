import acm.program.ConsoleProgram;

public class problem27 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter number: ");
		int m = readInt("Enter second number: ");
		int nToThePowerM = calculate(n, m);
		println(nToThePowerM);
	}

	private int calculate(int n, int m) {
		int nToThePowerM = n;
		for (int i =0; i < m; i++) {
			nToThePowerM *= n;
		}
		return nToThePowerM;
	}
}
