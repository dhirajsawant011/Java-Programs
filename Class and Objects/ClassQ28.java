/*
	Q8.Shift Array Elements to the Left
	Write a class to create a method to shift all elements in an array one position to the left.
	Explanation: Work with array indexes and element reassignment.
*/

public class ClassQ28
{
	public static void main(String x[])
	{
		int a[] = {5,4,3,2,1};
		shiftArray sc = new shiftArray();
		sc.Shift(a);
	}
}

class shiftArray
{
	public static void Shift(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
				a[i] = a[i+1];
		}
		a[a.length - 1] = 0; 
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]  + " ");
		}
	}
}
