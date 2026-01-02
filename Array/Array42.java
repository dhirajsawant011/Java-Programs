/*
Q6. Write a java program to find the unique value from array.

	Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 

	All unique elements in the array are: 3, 20, 12, 10 
*/

import java.util.*;

public class Array42
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[size];
		
		System.out.println("Enter a array Element : ");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		
		System.out.println("Given Array : ");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
		
		System.out.println("All unique Elements  : ");
		for(int i=0; i<size; i++)
		{
			int count = 0;
			for(int j=0; j<size; j++)
			{
				if(a[i]==a[j])//1!=1  //1==1
				{
					count++;
				}
			}
			
			if(count ==1)
			{
				System.out.print(a[i] + " ");
			}
		}
	}
}