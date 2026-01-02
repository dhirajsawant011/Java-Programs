/*
	Q9.  Write a java program to remove duplicated values from arrays.
	Input : Array = {10, 20, 20, 30, 40, 40, 50}
	Output : Unique elements = {10, 20, 30, 40, 50}
	Explanation:
	Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.

*/
import java.util.*;

public class Array14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		int temp ;
		int a[] = new int[size];
		System.out.println("Enter a array element :- ");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
	//	System.out.println("Array element are :- ");
		
	//	for(int i=0; i<size; i++)
	//	{
	//		System.out.print(a[i] + " ");
	//	}
		
		int result [] = new int[a.length];
		
		int ptr = 0,i=0;
		
		for(i=0; i<size-1; i++)
		{
			if(a[i]!=a[i+1])
			{
				result[ptr]= a[i];
				ptr++;
			}
		}
		
		if(a[i] != a[i-1]){
			result[ptr]= a[i];
				ptr++;
		}
		
		System.out.println("\nRemove Duplicate New Array element are :- ");
		for(i=0 ; i<ptr; i++)
		{
			System.out.print(result[i] +" ");
		}
	}
}