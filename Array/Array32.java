/*

Q7. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value.

*/

import java.util.*;
public class Array32
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
			int fact =1;
			for(int j=1; j<=a[i]; j++)
			{
				
				fact = fact *j;
			}
				a[i] = fact;
		}		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");	
		}
	}
}