/*
	Q15. Intersection of two Arrays
	Given two arrays a[] and b[], the task is find intersection of the two arrays. Intersection of two arrays is
	said to be elements that are common in both arrays. The intersection should not count duplicate
	elements and the result should contain items in any order.
	
	Input: a[] = {1, 2, 1, 3, 1},  b[] = {3, 1, 3, 4, 1}
	Output: {1,  3}
	
	Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of
	common elements
	Input: a[] = {1, 1, 1},  b[] = {1, 1, 1, 1, 1}
	Output: {1}
	
	Explanation: 1 is the only common element present in both the arrays.
	Input: a[] = {1, 2, 3},  b[] = {4, 5, 6}
	Output: {}
	
	Explanation: No common element in both the arrays.
	Your Task is : Note you have to create class name as Intersection with two methods 
	void setArray(int a[],int b[]): this function is used for accept two array as parameter 
	Int [] getIntersection(): this function can find the intersection of array and return it.
	
*/

public class ClassQ46
{
	public static void main(String x[])
	{
		int a[] ={1, 1, 1};
		int b[] ={1, 1, 1, 1, 1};
		
		Intersection ic = new Intersection();
		ic.setArray(a,b);
		int n [] = ic.getIntersection();
		
		for(int i=0; i<n.length; i++)
		{
			System.out.print(n[i] +" ");
			
		}
	}
	
	
}
class Intersection
{
	int a[] ,b[];
	void setArray(int x[],int y[])
	{
		a=x;
		b=y;
	}
	
	int [] getIntersection()
	{
		int aLen = a.length;
		int bLen = b.length;
		
		int cLen = aLen > bLen ? aLen : bLen;
		int c[] = new int[cLen];
		int k=0;
		for(int i=0; i<aLen; i++)
		{
			if(isPresent(b,a[i]) && !isPresent(c, a[i]))
			{
				c[k++] = a[i];
			}
		}
		
		int res[] = new int[k];
		for(int i=0; i<k; i++)
		{
			res[i] = c[i];
		}
		
		return res;
	}
	
	
		private boolean isPresent (int a[],int n)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i] == n)
				{
					return true;
				}
			}
			return false;
		}
}












