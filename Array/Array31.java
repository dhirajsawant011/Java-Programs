/*
Q6. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.

*/
import java.util.*;
public class Array31
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size: ");
		int size = sc.nextInt();
			
		int a[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			a[i] = a[i]*a[i];
		}
		
		for(int i=0; i<size; i++)
		{
				System.out.print(a[i]+" ");	
		}
	}
}