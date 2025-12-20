/*
	Q3. Write a java program to find missing elements in an array.
	Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
	Output : Missing elements = {3, 6}
	Explanation:
	Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.	
*/
import java.util.*;
public class Array8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size : ");
		int size = sc.nextInt();
		int a[];
		a = new int[size];
		
		System.out.println("Enter a array Element : ");
		for(int i =0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		for(int i=0; i<size; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
				System.out.println(max);
			}
		}
	//	System.out.println(max);
	    System.out.print("Missing elements = { ");
		for(int i =1; i<=max; i++)
		{
			boolean flag = false;
			
			for(int j=0; j<size; j++)
			{
				if(a[j]==i)
				{
					flag = true;
					break;
				}
			}
				if(!flag)
				{
					System.out.print(i + " ");
				}
		}
		System.out.print("}");
	}
}

