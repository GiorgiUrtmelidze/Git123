import acm.program.ConsoleProgram;

public class problem23 extends ConsoleProgram {

	public void run() {
	int n = readInt("Enter n: ");
	int sum = calculateSum(n);
	println("sum of numbers 1...n is " + sum);
	int numDivisors = numberOfDivisors(n);
}
	

	private int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i; //sum = sum + i
		}
		return sum;
	}
	private in numberOfDivisors(int n) {
		int num = 0;
		for(int i = 1; i <= n; i++) {
			if ( n % i == 0 ) {
				num += 1;
			}
		}
	}
}
