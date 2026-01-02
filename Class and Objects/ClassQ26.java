/*
	6.Sort an Array (Bubble Sort)
	Write a class to implement a method to sort an integer array using bubble sort.
	Explanation: Learn basic sorting algorithms and their implementation.
*/

public class ClassQ26
{
	public static void main(String x[])
	{
		int a[] = {5,4,3,2,8,6,9,1,7};
		
		Sort sc = new Sort();
		sc.sortBubble(a);
		
		
	}
}

class Sort
{
	public static void sortBubble(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<(a.length-1)-i; j++)
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j];//5 //4 //3//9/6//1
					a[j] = a[j+1];  //4 //3
					a[j+1] = temp; //5
				}
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
