import acm.program.ConsoleProgram;

public class problem30 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter number: ");
		for (int i = 10;  ;i*=10) {
			for (int x = 0; ; x++) {
				if (x%10 == 0 && n%x < i) { 
					println(n-x);
				}
			}
			
		}
	}
}
