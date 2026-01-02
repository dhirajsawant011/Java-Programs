/*
Q3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9

*/

import java.util.*;
public class Array18
{     public static void main(String x[])
	  { 
		Scanner sc  =  new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
	    int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter values in array");
		for(int i=0;i<size; i++)
		{
			    a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		//System.out.print(a);
		System.out.print("Enter a position to rotate array : ");
		int n = sc.nextInt();
		
		System.out.println("From 4th position the values of the array are: ");
		for(int i=n; i<size;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println("Before 4th position the values of the array are: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		int ptr = 0;
		for(int i=n; i<size;i++)
		{
			b[ptr]=a[i];
			ptr++;
		}

		for(int i=0; i<n; i++)
		{
			b[ptr] =a[i];
			ptr++;
		}
		
		System.out.println("From 4th position the values of the array are: ");
		
		int i;
		for(i=0; i<size; i++)
		{
			System.out.print(b[i] +" ");
		}
		
		//System.out.println(b[0] +" ");
	  }
}
