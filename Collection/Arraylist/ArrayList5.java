/*
	Q5. Store numbers in an ArrayList and count how many are even and how many are odd.
	Explanation:
	This helps practice:
	Modulus operator %
	Condition-based counting
	Iteration over collections
*/

import java.util.*;
public class  ArrayList5
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int Ecount = 0;
		int Ocount = 0;
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			if((int)obj%2==0)
			{
				Ecount++;
			}
			else
			{
				Ocount++;
			}
		}
		System.out.println("Even count is " +Ecount);
		System.out.println("Odd count is " +Ocount);
		
	}
}

