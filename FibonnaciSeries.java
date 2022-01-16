package Practice;

import java.util.Scanner;

public class FibonnaciSeries {
	public static void main(String args[]) {
		
		int num1 = 0;
		int num2 = 1;
		int num3;
		int i;
		int count = 10;
		
		//Scanner sc1 = new Scanner (System.in);
		System.out.println(num1+ " ");
		System.out.println(num2+ " ");
		//int num1= sc1.nextInt();
		
		for(i=0;i<count;i++)
		{
			num3 = num1+ num2;
			System.out.println(num3+ " ");
			num1 = num2;
			num2 = num3;
		}
	}

}
