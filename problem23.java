import acm.program.ConsoleProgram;

public class problem23 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter number: ");
		int sum = calculateN(n);
		print(sum);
	}

	private int calculateN(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += i; 
		}
		return (sum);
	}
}
