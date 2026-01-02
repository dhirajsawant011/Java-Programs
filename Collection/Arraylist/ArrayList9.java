/*
	Q9. Write a java program to Copy all elements from one integer ArrayList to another.
	Explanation:
	This practices:
	Working with multiple ArrayList objects
	Element-by-element copying
*/
import java.util.*;

public class ArrayList9
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ArrayList list2 = new ArrayList();
		
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			System.out.print(obj + " ");
			list2.add(obj);
		}
		
		System.out.println();
		
		for(Object value:list2)
		{
			System.out.print(value +" ");
		}
	}
}