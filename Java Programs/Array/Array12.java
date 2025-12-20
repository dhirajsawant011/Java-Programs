/*
Q7. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :                              200

	Expected Output : The new list is : 1 2 200 3 4 5
	
*/

import java.util.*;
public class Array12
{	
	
	public static void main(String x[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of array : ");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		int b[] = new int [size];
		System.out.println("Enter  a array element : ");
		for(int i =0; i<size-1; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter a index and value : ");

		int index = sc.nextInt();
		int value = sc.nextInt();
		
		for(int i=size-2; i>=index; i--)
		{
			a[i+1] = a[i];
		}
		
		a[index] = value;
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}