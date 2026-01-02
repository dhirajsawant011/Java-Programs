//Q1. Write a java program to print all natural numbers from 1 to n. using while loop Using function.

import java.util.*;
public class Fun1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int no = sc.nextInt();
		natNum(no);
	}
	
	public static void natNum(int n)
	{
		int i=1;
		while(i<=n)
		{
			System.out.println(i + " ");
			i++;
		}
	}
}