/*
	10.Merge Two Integer Arrays
	Write a class to write a method to merge two integer arrays into a single array.
	Explanation: Practice combining arrays and managing their sizes.

*/

public class ClassQ30
{
	public static void main(String x[])
	{
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		
		MergeArrayClass mc = new MergeArrayClass();
		mc.mergeArray(a,b);
	}
}

class MergeArrayClass
{
	void mergeArray(int a[], int b[])
	{
		
		int c[] = new int[a.length+b.length];
		int k=0;
		for(int i=0; i<a.length;i++)
		{
			c[k++] = a[i];
		}
		for(int i=0; i<b.length;i++)
		{
			c[k++] = b[i];
			//System.out.println(c[i] +" ");
		}
		for(int i=0; i<k; i++)
		{
			System.out.print(c[i] +" ");
		}

		
	}

}