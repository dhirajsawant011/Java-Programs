//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop Using Function.

import java.util.*;
public class Fun2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int no = sc.nextInt();
		natNumRev(no);
	}
	public static void natNumRev(int n)
	{
		int i=n;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
	}
}
