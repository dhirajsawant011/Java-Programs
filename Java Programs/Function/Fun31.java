/*
Q1. Write a Java program to find the second largest number in an array using a function.
 Example Input:
 arr = {12, 45, 23, 51, 19, 8}
 Output:
 Second Largest: 45
Explanation:
Sort or traverse the array to find the largest and second largest values.


Function findSecondLargest() scans the array and updates two variables — first and second.
*/

import java.util.*;
public class Fun31
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Array size : ");
		int size = sc.nextInt();
		
		System.out.println("Enter a array element : ");
		int a[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int max = a[0];
		for(int i=0; i<size; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		
		System.out.println("largest value is " + max);
		
		int smax = a[0];
		
		for(int i=0; i<size; i++)
		{
			//  51!=8
			if(max!=a[i])
			{
				if(a[i]>smax) 
				{
					smax = a[i];
				}
			}
		}
		
		System.out.println("Second largest value is " + smax);
	}
}