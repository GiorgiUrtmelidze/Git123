import acm.program.ConsoleProgram;

public class problem32 extends ConsoleProgram {

	public void run() {
	
		int x = 0;
		int i = 2;
		for (; i <= 1000000; i++) {
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					x += 1;
				}
				
			}
			if (x == 2) {
				println(i);
			}
		}
		
	}
}
