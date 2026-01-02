/*
	Q4. Create an ArrayList and find the minimum element.
	Explanation:
	Similar to max logic, this improves:
	Conditional checking
	Traversal logic

*/

import java.util.*;
public class ArrayList4
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int min = Integer.MAX_VALUE;
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			if((int)obj<min)
			{
				min =(int)obj;
			}
		}
		System.out.println("max value is " +min);
		
	}
}
