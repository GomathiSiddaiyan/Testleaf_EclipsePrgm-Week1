package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// Sum of digits
		int q, r, sum = 0;
		int n = 123;
		System.out.println("The Sum of Digit program");
		while (n != 0) {
			q = n / 10;
			r = n % 10;
			sum = sum + r;
			n = q;
		}
		System.out.println("Sum of digit: " + sum);
	}

}
