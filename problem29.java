import acm.program.ConsoleProgram;

public class problem29 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter your number: ");
		int fibonacciNumber = calculate(n);
		println(fibonacciNumber);
	}

	private int calculate(int n) {
		int a = 1;
		int b = 2;
		int fibonacciNumber = 3;
		for (; n > 3; n--) {
			fibonacciNumber += b;
		}
		
		return fibonacciNumber;
	}
}
