import acm.program.ConsoleProgram;

public class problem28 extends ConsoleProgram {

	public void run() {
		int odd = 0;
		int even = 0;
		for (; ;) {
			int n = readInt("Enter your number: ");
			if ( n%1 != 0 || n < -1) {
				println("Type only integers and then -1");
			}
			if (n%2 == 0 && n > 0) {
				even += 1;
			} 
			if (n%2 != 0 && n > 0) {
				odd += 1;
			}
			if (n == -1) {
				println("Quantity of odd numbers : " +( odd - 1 ));
				println("Quantity of even numbers : " +even);
				break;
			}
		}
		
	
	}
}
