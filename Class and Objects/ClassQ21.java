/*
	1.Find the Maximum Value in an Array
	Write a class with a method to find and return the maximum value in an integer array.
	Explanation: Learn how to traverse an array and find the largest element using methods.	
*/

import java.util.*;
public class ClassQ21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number  : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		for(int i=0 ; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		maximumValue nv  = new maximumValue();
		int result  = nv.maxvalue(a);
		System.out.println("max value is : " + result);
	}
} 


class maximumValue
{
	int maxvalue(int a[])
	{		
		int max = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	}
}