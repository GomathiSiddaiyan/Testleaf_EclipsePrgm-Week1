package week1.day1;

public class JumpingStatement {

	public static void main(String[] args) {
		// Jumping statements- Break, Continue, Return
//BREAK Keyword
		System.out.println("Break keyword:");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break; // skip the loop for the current value
			}
		}
		System.out.println(" out of for loop");

// Continue keyword
		System.out.println("Continue keyword:");
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				continue; // skip the loop for the current value
			}
			System.out.println(i);
		}
		System.out.println(" out of the for loop");

// Return Keyword
		System.out.println("Return keyword:");
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				return; // contol out of the method
			}
			System.out.println(i);
		}
		System.out.println(" out of the for loop");
	}
}
