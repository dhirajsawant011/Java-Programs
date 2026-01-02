/*
	Q1. Write a java program to search an element in an array , its element found or not.
	Input:
	Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".

*/

import java.util.*;

public class Array6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[];
		a = new int[5];
		
		System.out.println("Enter a array Element : ");
		for(int i=0; i<a.length; i++)
		{
			a[i]= sc.nextInt();
		}		
		System.out.print("Enter a search key : ");
		int skey = sc.nextInt();
		boolean flag = true;
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i]==skey){
				flag = true;
				break;
			}else{
				flag = false;
			}
		}
		if(flag){
			System.out.print("Found");
		}else{
			System.out.print("Not found");
		}
		
	}
}