package week1.day1;

public class If_ElseProgram {

	public static void main(String[] args) {
		// If-Else Program - TRIZZ-FIZZ
		System.out.println("My First Java Program");
		int num = 15;

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("TRIZZ-FIZZ");
		} else if (num % 5 == 0) {
			System.out.println("FIZZ");
		} else if (num % 3 == 0) {
			System.out.println("TRIZZ");
		} else {
			System.out.println("Neither divisible by 3 nor by 5");
		}

	}

}
