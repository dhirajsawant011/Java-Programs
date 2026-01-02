/*
	ArrayList :- 
	Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
	Explanation:
		This helps you understand:
	How to declare an ArrayList
	How to add elements using add()
	How to traverse an ArrayList using for loop
*/

import java.util.*;
public class ArrayList2
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int max =list[0];
		Iterator i =list.iterator();
		
		while(i.hasNext())
		{
			Object obj = i.next();
			sum = sum+(int)obj;
			
		}
		
		
		//for(Object value: list)
		//{
		//	value = sum+(int)value;
		//}
		System.out.println("max is " + max);
		
		
		
		//System.out.println(list);
	
	}
}