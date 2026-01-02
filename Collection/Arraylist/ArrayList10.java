/*
	Q10. Write a java program to Identify and display duplicate numbers in an integer ArrayList.
	Explanation:
	This helps you understand:
	Nested loops
	Comparison logic
	Handling repeated values
*/

import java.util.*;
public class ArrayList10
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(50);
		
		//Iterator i = list.iterator();
		for(int i=0; i < list.size(); i++)
		{
			Object obj = list.get(i);  //10 
			int count =0; 
			for(int j=0; j < list.size(); j++)
			{
				if(obj.equals(list.get(j))) //10 == 10
				{
					count++;
				}
			}
			if(count > 1 && i==list.indexOf(obj))
			{
				System.out.print(obj +" ");
			}
		}
	}
}