package Practice;
import java.util.Scanner;
public class Swapping {
	public static void main (String []args)
	{
	 Scanner sc1 = new Scanner (System.in);
	 System.out.println("Before Swapping: ");
	 System.out.println("Enter num1 :");
	 int num1 =sc1.nextInt();
	 System.out.println("Enter num2:");
	 int num2 =sc1.nextInt();
	 
	 num1 = num1 +num2;
	 num2 = num1 -num2;
	 num1 = num1 -num2;
	 System.out.println("After Swapping : "+ "num1 is " +num1 + " "+ "num2 is "+num2);
	 
	}

}
