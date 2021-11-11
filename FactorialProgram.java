package week1.day1;
public class FactorialProgram {
	public static void main(String[] args) {
		/* Factorial number 
		4! = 4*3*2*1 = 24  
		5! = 5*4*3*2*1 = 120  
		*/
		 int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);   
	}}
