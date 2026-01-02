/*

Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array
	
*/
import java.util.*;
public class Array17
{     public static void main(String x[])
	  { 
		Scanner sc  =  new Scanner(System.in);
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
		int mid = size/2;	
		boolean flag = true;
		for(i=0; i<size-1; i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				if(count > mid){
					//System.out.println(a[i]);
					flag = false;
					break;
				}
				count=1;
			}
		}
		if(count > mid){
			System.out.println(a[i]  +" is a majority element ");
			flag = false;
		}
		if(flag){
			System.out.println(" no Majority Elements ");
		}
		
	  }
}
