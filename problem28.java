import acm.program.ConsoleProgram;

public class problem28 extends ConsoleProgram {

	public void run() {
		int odd = 0;
		int even = 0;
		for (; ;) {
			int n = readInt("Enter your number: ");
			if (n%2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			if (n == -1) {
				println(odd);
				println(even);
				break;
			}
		}
		
	
	}
}
