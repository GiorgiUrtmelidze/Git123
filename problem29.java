import acm.program.ConsoleProgram;

public class problem29 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter your number: ");
		int fibonacciNumber = calculate(n);
		println(fibonacciNumber);
	}

	private int calculate(int n) {
		int a = 1;
		int fibonacciNumber = 2;
		for (; n > 2; n--) {
			if( n == 3) {
				fibonacciNumber += a;
			} else {
				fibonacciNumber += fibonacciNumber;
			}
			
		}
		
		return fibonacciNumber;
	}
}
