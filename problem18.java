import acm.program.ConsoleProgram;

public class problem18 extends ConsoleProgram {

	public void run() {
	int x = readInt("Enter number: ");
	int y = readInt("Enter second number: ");
	if (x > y) {
		print(x);
	} else{
		print(y);
	}
	}
}
