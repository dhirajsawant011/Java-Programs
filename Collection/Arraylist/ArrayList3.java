/*
	Q3. Write a program to find the maximum value from an integer ArrayList.
	Explanation:
	You will learn:
	How to compare elements
	Store maximum value manually
	Logical thinking without built-in methods
*/

import java.util.*;
public class ArrayList3
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int max = Integer.MIN_VALUE;
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			if((int)obj>max)
			{
				max = (int)obj;
			}
		}
		System.out.println("max value is " +max);
		
	}
}
