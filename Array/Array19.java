/*
Q4. Write a program in java to find the smallest missing element from a sorted array?
		
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/
import java.util.*;
public class Array19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		System.out.println("Enter a array Elements : ");
		int a[] = new int[size];
		
		int missing = 0;
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i =0;i<size;i++ )
		{
			if(a[i]==missing)
			{
				missing++;
			}
			
		}
		
		System.out.print("The missing smallest element is : "  +missing);
	}
}




