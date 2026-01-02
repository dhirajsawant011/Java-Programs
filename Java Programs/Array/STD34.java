/*

	  4. Merge Two Arrays
	  Concept: Append elements of the second array to the first or create a new array to store all.
	  Use Case: Combine product lists, user logs, etc.
	  Input Array
	  array1 = [1, 3, 5]
	  array2 = [2, 4, 6, 8]
	  Merged Array: [1, 3, 5, 2, 4, 6, 8]

*/

import java.util.*;

public class STD34
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		
		System.out.println("Enter a array Element : ");
		int a[] = new int[size];
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		
		System.out.print("Enter Array size : ");
		int size1 = sc.nextInt();
		
		int b[] = new int[size1];
		for(int i=0; i<size1; i++)
		{
			b[i] = sc.nextInt();
		}
		
		int c[] = new int[a.length+ b.length];
		for(int i=0; i<a.length; i++)
		{
			c[i] = a[i];
		}
		
			
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i] = b[i];
		}
		
		System.out.println("Merge Array  : ");
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
	}
}

