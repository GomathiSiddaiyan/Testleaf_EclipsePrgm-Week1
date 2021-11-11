package week1.day2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		// Change Odd index into Upper Case

		String str = "welcome";
		int lenStr = str.length();
		System.out.println("The length of the Sctring is: " + lenStr);

		// Convert a string to a character array;
		char[] charArr = str.toCharArray();
		System.out.println("Converting odd elements to UPPERCASE");
		for (int i = 0; i < charArr.length; i++)
		{
			if (i % 2 != 0) 
			{
				char p = Character.toUpperCase(charArr[i]);
				System.out.print("" + p);
			} 
			else 
			{
				System.out.print("" + charArr[i]);
			}
		}
	}}