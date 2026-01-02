/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/

import java.util.*;
public class arr
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
		System.out.println("Given Array");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]  + " ");
		}
		System.out.println("");
		System.out.print("Enter a target : ");
		int target = sc.nextInt();
		
		
		twoSumClass ts = new twoSumClass();
		 int result [] = ts.twoSum(a, target);
		 System.out.println(Arrays.toString(result));
		
		
		//System.out.print("[");
        //for(int i = 0; i < result.length; i++)
        //{
        //    System.out.print(result[i]);
        //    if(i < result.length - 1)
        //        System.out.print(",");
        //}
        //System.out.println("]");
		
	}
}

class twoSumClass
{
	public int[] twoSum(int a[], int target)
	{
		int a2[] = new int[2];
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==target)
				{
					//System.out.println("[" + i + "," + j + "]");
					a2[0]  = i;
					a2[1] = j;
				}
			}
		}
		return a2;
	}		
}

