/*
	Q7. Write a java program to Remove all even numbers from an integer ArrayList.
	Explanation:
	This teaches:
	Removing elements using remove(index)
	Handling shifting of elements after removal
	Reverse loop concept
*/


import java.util.*;
public class  ArrayList7
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			if((int)obj%2==0)
			{
				i.remove();
			}
			
		}
		
		Iterator n = list.iterator();
		while(n.hasNext())
		{
			Object obj = n.next();
			System.out.println(obj);
		}
		
		
		for(Object obj : list)
		{
			System.out.println(obj);
		}
		
	}
}

