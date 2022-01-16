package Practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String []args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc1.nextInt();
		
		
		if(num % 1 == 0) {
			System.out.println(num +" is a prime number");
		}
		else {
			System.out.println(num +" is not a prime number");
		}
	}

}
