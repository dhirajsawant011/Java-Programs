/*
Question 2:
	Given a sorted array rotated at some pivot (like [6, 7, 1, 2, 3, 4, 5]), search for a number x using binary search.
	Example:
	arr = [6, 7, 1, 2, 3, 4, 5], x = 3
	Output: Found at index 4
Explanation:
	In rotated arrays, one half (left or right) is always sorted.
	Check which half is sorted:


	If arr[left] <= arr[mid], left part is sorted.
	Else, right part is sorted.


	Decide which half to discard based on x.
*/

import java.util.*;
public class DSARRAY2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
	
		int a[] = new int[size];
	
		System.out.println("Enter a array Element : ");
		for (int i = 0; i < size; i++) 		
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter a Search Key : ");
		int skey = sc.nextInt();
		
		boolean flag = false;
		int start =0;
		int end = a.length-1;
		
		while(start <= end)
		{
			int mid = (start + end )/2;	
			
			if(a[mid]==skey)
			{
					System.out.print("Found the index : " +mid);
					flag = true;
					break;
			}
			if(a[start]<=a[mid])
			{
				if(a[start] <= skey && skey<= a[mid])
				{
					end = mid-1;
				}
				else
				{
					start = mid +1;
				}
					
			}
			else
			{
				if(a[mid]<= skey && skey <= a[end])
				{
					start = mid +1;
				}
				else
				{
					end = mid-1;
				}
			}
		}	
		 if (!flag) {
            System.out.println("Element not found!");
        }
	}
}
