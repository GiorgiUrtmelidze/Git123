import acm.program.ConsoleProgram;

public class problem26 extends ConsoleProgram {

	public void run() {
		int n1 = readInt("Enter first number: ");
		int n2 = readInt("Enter second number: ");
		int gcm = calculategcm(n1, n2);
		println(gcm);
		
	}

	private int calculategcm(int n1, int n2) {
		int gcm = 0;
		for (gcm = n1; ;gcm--) {
			if (n1%gcm == 0 && n2%gcm == 0) {
				return gcm;
			}
		}
		
	}
}
