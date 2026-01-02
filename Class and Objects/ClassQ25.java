/*
	Find Duplicates in an Array
	Write a class to create a method to identify and display duplicate elements in an integer array.
	Explanation: Practice nested loops to compare elements.
*/

public class ClassQ25
{
	public static void main(String x[])
	{
		System.out.println("");
		int a[] = {1,2,3,2,3,4,5};
		
		
		System.out.println("");
		findDuplicatesClass fd = new findDuplicatesClass();
		fd.findDuplEle(a);
	}
}

class findDuplicatesClass
{
	public void findDuplEle(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			int count =0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(a[i] + " ");
			}
		}

	}
}