
/*
Q5. Write a java program to replace all negative numbers in an array with 0.	
	Input :- arr = [2, -3, 4, -1, 5]
	Output :-  [2, 0, 4, 0, 5]
Explanation:
Each negative element is replaced with 0.
Non-negative elements remain unchanged.
*/

import java.util.*;
public class Array25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		System.out.println("Enter a array Elements : ");
		int a[] = new int[size];
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			if(a[i]<0){
				a[i]=0;
			}
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i] +" ");
		}
	}
}