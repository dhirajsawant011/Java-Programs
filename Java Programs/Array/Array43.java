/*
Q7. Write a java program to merge two arrays.

	Input - First Array  :- 1 2 3 4 5
            Second Array :- 6 7 8 9 10 
	Output - 1 10 2 9 3 8 4 7 5 6
*/
import java.util.*;
public class Array43

{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size =sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter A array Element ");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter b array size : ");
		int size1 =sc.nextInt();
		int b[] = new int[size1];
		System.out.println("Enter B array Element ");
		for(int i=0; i<size; i++)
		{
			b[i] = sc.nextInt();
		}
		
		int c[] = new int[a.length+b.length];
		int ptr = 0;
		for(int i=0; i<size; i++)  //5<5 false
		{
			c[ptr] = a[i];
			ptr++;
			c[ptr] = b[size-1-i]; //5-1-0 = 4 // 5-1-1=3 //5-1-2=2 //5-1-3=1 //5-1-4 =0 //
			ptr++;
		}
		
		System.out.println("Merged two Arrays : ");
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
	}
	
}