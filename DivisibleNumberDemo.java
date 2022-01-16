package Practice;

import java.util.Scanner;

public class DivisibleNumberDemo {
	public static void main (String args[])
	{
		new DivisibleNumberDemo().divisible();
	}
	
	void divisible()
	{
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int sum = sc.nextInt();
		for(int i=0;i< num;i++)
		{
			if(i%3 == 0 && i%5 == 0)
			{
				sum = sum + i;
				System.out.println(" "+sum);
				
			}
		}
		
	
		
	}

}
