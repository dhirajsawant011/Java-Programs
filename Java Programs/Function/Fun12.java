//Q12. Write a java program to calculate the product of digits in a number.

import java.util.*;
public class Fun12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		int result = prodNum(no);
		System.out.println(" is " + result);
		
	}
	
	public static int prodNum(int no)
	{
		int p =1;
		while(no !=0)
		{
			int digit = no%10;
			p = p*digit;
			no=no/10;
			
		}
		return p;
	}
}