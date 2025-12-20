//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;
public class Fun13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		int result = revNum(no);
		System.out.println(" is " + result);
		
	}
	
	public static int revNum(int no)
	{
		int rev =0;
		while(no !=0)
		{
			int digit = no%10;
			rev = rev*10+digit;
			no=no/10;
			
		}
		return rev;
	}
}