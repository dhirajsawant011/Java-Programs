/*
Q1. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/

import java.util.*;
public class Array26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		System.out.println("Enter a array Elements : ");
		int a[] = new int[size];
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			if(a[i]%3==0)
			{
					a[i]= -1;
			}
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i] +" ");
		}
	}
}