/*
	9.Check if an Array is Sorted
	Write a class to implement a method to check whether an integer array is sorted in ascending order.
	Explanation: Understand conditions and comparisons in loops.
*/

public class ClassQ29
{
	public static void main(String x[])
	{
		int a[] = {99,87,1,93,78,145,259,2};
		
		SortedAsending sa = new SortedAsending();
		sa.arrAsending(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}

class SortedAsending
{
	void arrAsending(int a[])
	{
		for(int i=0; i<a.length; i++)
		{		
							1
			for(int j=0; j<a.length-1-i; j++)
			{	  //99<87
				if(a[j]<a[j+1])//
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		
		
	}
}