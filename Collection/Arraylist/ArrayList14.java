/*
Q14. Write a java program to find the second largest number in an ArrayList.

Explanation
largest
secondLargest
 Update accordingly during traversal.
*/

import java.util.*;
public class ArrayList14
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		int Largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;

		Iterator i = list.iterator();
		while(i.hasNext())
		{
			int num = (int)i.next();
			if(num>Largest)
			{
				secLargest = Largest;          
				Largest = num;
			}
			else if(Largest!=secLargest && num >secLargest )
			{
				secLargest = num;
			}
		}
		
		System.out.println(Largest);
		System.out.println(secLargest);

	}
}