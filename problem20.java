import acm.program.ConsoleProgram;

public class problem20 extends ConsoleProgram {

	public void run() {
	int n = readInt("Enter: ");
	int y = 0;
	for (int i = 0; i < n; i++ ) {
		int x = readInt("Enter number: ");
		y = y + x;
	}
	print(y);
			}
}
