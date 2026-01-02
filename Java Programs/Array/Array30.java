/*
Q5. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5

Explanation:

Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.


Therefore, the first repeating element is 5.

*/

import java.util.*;
public class Array30
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		boolean flag = false;
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(a[i]==a[j])
				{
					System.out.print("First element repeating is " +a[i] );
					flag =true;
					break;
				}
				if(flag)
				{
					break;
				}
			}
			
		}
		if(!flag)
		{
			System.out.print("No element repeating " );
		}
		
	}
}