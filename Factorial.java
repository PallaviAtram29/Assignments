package Practice;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter the number to print its FACTORIAL:");
		int factor = 1;
		int number =sc1.nextInt();
		
		for(int i =1; i <=number; i++ )
		{
			factor = i*factor;
			
		}
		
		System.out.println("The Factorial of " + number + " is " + factor);
		
	}

}
