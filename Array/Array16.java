/*
	Q1. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.
*/

import java.util.*;
public class FOAPP
{     public static void main(String x[])
	  { 
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
	    int a[]=new int[size];
		System.out.println("Enter values in array");
		for(int i=0;i<size; i++)
		{
			    a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int count=1,i;
		for(i=1; i<size;i++)
		{
			 if(a[i]==a[i-1])
			 { 
				count++;
			 }
			 else
			 {
				 System.out.printf("%d --->%d\n",a[i-1],count);
				 count=1;
			 }
		}
		if(count>1)  
		  System.out.printf("%d --->%d\n",a[size - 1],count);
		
		  
	  }
}
