//Q18. Write a java program to find the first and last digit of a number.

import java.util.*;
public class Fun18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int no = sc.nextInt();
		fLnum(no);
	}
	
	public static void fLnum(int n)
	{
		
		int last = n%10;
		
		while(n>9)
		{
			n =n/10;
		}
		int first = n;
		System.out.println("Before Swapping : ");
		System.out.println("first digit is  : " +last);
		System.out.println("last digti is   : " + n);
		
		System.out.println("After  Swapping : ");
		System.out.println("first digit is  : " +first);
		System.out.println("last digti is   : " + last);
	}
}