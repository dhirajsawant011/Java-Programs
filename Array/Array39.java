/*	
Q4. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	Expected Output :
	The given array is : 7 9 5 6 13 2
	The elements which provide maximum difference is: 5, 13
	The Maximum difference between two elements in the array is: 8
*/
import java.util.*;
public class Array39
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] =sc.nextInt();
		}
		int first=a[0];
		int second =a[0];
		int max = 0;
		
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{	
					int diff = a[j]-a[i];
					
					if(diff > max)
					{
						max = diff;
						first = a[i];
						second = a[j];
						
					}	
			}
		}
		System.out.println("The elements which provide maximum difference is:  " +first+ " ," +second);
		System.out.println("The Maximum difference between two elements in the array is: "+max);
	}
}