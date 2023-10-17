import acm.program.ConsoleProgram;

public class problem20 extends ConsoleProgram {

	public void run() {
	int n = readInt("Enter number: ");
	int x = readInt("Enter second number: ");
	int z = x*n;
	for (int i = 0; i < (x - 1); i++) {
		print(n);
		print("+");
			}
	print(n);
	print("=");
	print(z);
	
	}
}
