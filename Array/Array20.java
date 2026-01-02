/*
Q5. Write a Java program to sort a given array in ascending & descending order.

	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]

Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1.
The program should first sort the array in ascending order, then print the reverse of that order for descending.
*/

import java.util.*;
public class Array20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter a array Element :  ");
		int a[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				int temp=0 ;
				if(a[i]>a[j]) // 12> 12 false 12>5 true 
				{
					temp = a[i]; //temp = 12;
					a[i] = a[j]; //a[i]= 12
					a[j]= temp;  //a[j]= 12
				}
			
			}
		
		}
		
		System.out.print("Ascending Order:");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i] +" ");
		}
		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				int temp=0 ;
				if(a[i]<a[j]) // 12> 12 false 12>5 true 
				{
					temp = a[i]; //temp = 12;
					a[i] = a[j]; //a[i]= 12
					a[j]= temp;  //a[j]= 12
				}
			
			}
		
		}
		System.out.println();
		System.out.print("Decending  Order:");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i] +" ");
		}
	}
}