/*
Q9. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element, find sum of divisors and compare with the number, then count.

*/

import java.util.*;
public class Array34
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		int a [] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i =0; i<size; i++)
		{
			int no = a[i];
			int j=1,sum=0;
			while(j<no)
			{
				if(no%j==0)
				{
					sum = sum+j;
				}
				j++;
			}
			if(sum==no)
			{
				count++;
			}
		}
		System.out.print("Count of Perfect numbers = "+count);
	}
}