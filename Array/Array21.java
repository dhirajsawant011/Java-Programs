/*
Q1. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.

*/
import java.util.*;
public class Array21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i] +" ");
			}
		}
		int i;
		for( i=0; i<size; i++)
		{
			if(a[i]==0){
			System.out.print(a[i]+ " ");
			}
		}
	}
}