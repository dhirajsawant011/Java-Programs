/*
Q2.Write a java program count all pairs of elements in an array whose sum is equal to a given number.
	Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3

*/
import java.util.*;

public class Array22
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
		System.out.print("Enter a sum :  ");
		int sum = sc.nextInt();
		
		int count =0;
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(a[i]+a[j] == sum)
				{
					count++;
				}
			}
		}
		System.out.print("Total pairs " +count);
		
		
	}
}