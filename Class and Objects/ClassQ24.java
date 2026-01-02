/*
	4.Reverse an Array
    Write a class to write a method to reverse the elements of an integer array.
*/

public class ClassQ24
{
	public static void main(String x[])
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("");
		System.out.print("Original Array is :");
		for(int i =0; i<a.length; i++)
		{
			
			System.out.print(a[i] + " ");
		}
		
		reverseArray ec = new reverseArray();
		ec.reverse(a);
		
		System.out.println(" ");
		
		System.out.print("Reverse Array is :");
		for(int i =0; i<a.length; i++)
		{
			
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}

class reverseArray
{
	public void reverse(int a[])
	{
		int mid =a.length/2;
		int start = 0;
		int end = a.length -1;
		for(int i=0; i<mid; i++)
		{
			int temp = a[i];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}