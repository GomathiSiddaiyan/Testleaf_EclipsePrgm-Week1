package week1.day2;

public class StringProgram {

	public static void main(String[] args) {
		//String Program
		//Change Odd index into Upper Case
		String str="welcome";
		int lenStr=str.length();
		System.out.println("The length of the Sctring is: "+ lenStr);
		
		//To find the char
		char ch=str.charAt(2);
		System.out.println("Character of the index is :"+ch);
		
		//find position of the character
		int index= str.indexOf('a');
		System.out.println("The index of a is "+ index);
		
		//Convert a string to a character array;
		char[] charArr=str.toCharArray();
		System.out.println("Converting odd elements to UPPERCASE");
		for (int i=0; i<charArr.length;i++)
		{
			if(i%2 != 0)
				{
				char p=Character.toUpperCase(charArr[i]);
			System.out.print(""+ p);
			}
			else
			{
				System.out.print(""+charArr[i]);
			}
		}	
	}}
