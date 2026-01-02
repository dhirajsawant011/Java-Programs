/*
Q3. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.

*/
import java.util.*;
public class Array23
{
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter A array size : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.print("Enter B array size : ");
		int size1 = sc.nextInt();
		
		int b[] =new int[size1];
		
		int c[] = new int[a.length + b.length];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			b[i] = sc.nextInt();
		}
		
		int cnt=0 ;
		for(int i=0; i<a.length+b.length; i++)
		{
			c[cnt] = a[i];
			cnt++;
		}
		
		
	
		for(int i=a.length; i<; i++)
		{
			c[cnt] = b[i];
			cnt++;
			
		}
		
		
		for(int i=0; i<size; i++)
		{
			System.out.print(c[i] + " ");
		}

	
	}
}