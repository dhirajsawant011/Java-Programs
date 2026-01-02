/*
	Q13. Write a java program to Insert a number at a given index in an ArrayList.
	
	Explanation
	Use add(index, element) method.
	Shifts elements to the right.
*/

import java.util.*;
public class ArrayList13
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(97);
		list.add(93);
		list.add(3);
		list.add(90);
		
		
		//Arraylist function
		list.add(2,30);
		
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next() + " ");
		}
	}
}