package week1.day2;

import java.util.Arrays;

public class ArrayProgram {

	public static void main(String[] args) {
		// Array program
		int num1[]= {1,2,3,4,5,6};
		int len1=num1.length;
		System.out.println("List of Array numbers");
		for (int i=0; i<len1; i++)
		{
			System.out.println("Number["+i+"]"+"="+ num1[i]);
		}
		System.out.println("Ascending order of an array");
		Arrays.sort(num1);
		for (int i=0; i<len1; i++)
		{
			System.out.println("Number["+i+"]"+"="+ num1[i]);
		}
		System.out.println("Decending order of an array");
		for (int i=len1-1; i>=0; i--)
		{
			System.out.println("Number["+i+"]"+"="+ num1[i]);
		}
		
		System.out.println("The Second Largest element:"+num1[len1-2]);
		System.out.println("The Second smallest element:"+num1[1]);
		System.out.println("The Largest element:"+num1[len1-1]);
		System.out.println("The First element:"+num1[0]);
	}

}
