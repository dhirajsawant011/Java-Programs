/*
Q7.	Find the Second Largest Element in an Array
	Write a class to write a method to find the second largest element in an integer array.
	Explanation: Practice logic building and conditional checks.
*/

public class ClassQ27
{
	public static void main(String x[])
	{
		int a[] = {200,24,19,18,17};
		
		
		sLargestClass sl = new sLargestClass();
		sl.secLargestEle(a);
	}
}

class sLargestClass
{
	void secLargestEle(int a[])
	{
		int max =a[0];
		int smax = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			else{
				if(a[i]!=max)
				{	
					if(a[i]>smax)
					{
						smax = a[i];
					}
				}
			}
			
		}
		
		
		System.out.println(max);
		System.out.println(smax);
	}
}