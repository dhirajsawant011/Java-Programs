/*
	3.Count Even and Odd Numbers in an Array
    Write a class to implement a method to count how many numbers are even and odd in an integer array.
	Explanation: Learn conditional checks and iteration in arrays.
*/

public class ClassQ23
{
	public static void main(String x[])
	{
		int a[] = {1,2,3,4,5};
		System.out.println("");
		
		evenOddClass ec = new evenOddClass();
		ec.evenOdd(a);
		//System.out.println("Avergae is : " + result);
	}
}

class evenOddClass
{
	public void evenOdd(int a[])
	{
		int Ecount =0;
		int Ocount =0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				Ecount++;
			}else{
				Ocount++;
			}
		}
		System.out.println("Even Count is : " + Ecount);
		System.out.println("Odd Count is  : " +Ocount );
		
	}
}