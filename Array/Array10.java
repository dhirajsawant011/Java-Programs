/*
Q5. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5


*/
import java.util.*;

public class Array10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of Array : ");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
		System.out.println("Enter a Elemetns of Array : ");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter position to Delete number : ");
		int p = sc.nextInt();
		
		for(int i=p;i<size-1;i++)
		{
			a[i]=a[i+1];
			System.out.print(a[i] + " ");
		}
		size--;
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
}