/*
	2.Calculate the Average of an Array
	Write a class to create a method to calculate the average of elements in an integer array.
	Explanation: Practice basic arithmetic operations and array traversal.
*/
import java.util.*;
public class ClassQ22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number  : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		for(int i=0 ; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Given Array : ");
		for(int i=0 ; i<size; i++)
		{
			System.out.print(a[i]  + " ");
		}
		System.out.println("");
		calavgClass ca = new calavgClass();
		int result = ca.calAvg(a);
		System.out.println("Avergae is : " + result);
	}
}

class calavgClass
{
	int calAvg(int a[] )
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		int avg = sum/a.length;
		return avg;
	}
}