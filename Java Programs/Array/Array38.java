/*
Q3. Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0
*/
import java.util.*;
public class Array38
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a array size: ");
		int size =sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[a.length];
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int ptr=0;
		for(int i=0; i<size; i++)
		{
			for(int j=size-1; j>=i; j--)
			{	
				
				if(a[i]==0)
				{
					if(a[j]!=0)
					{
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
				
		}
		
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}