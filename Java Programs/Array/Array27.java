/*
Q2. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]


Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.

*/

import java.util.*;
public class Array27
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		int end = size-1;
		System.out.println("Enter a array Elements : ");
		int a[] = new int[size];
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			a[0] = 0;
			a[end] =0;
			//a[size-1] =0;
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}