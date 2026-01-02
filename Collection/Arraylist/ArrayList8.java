/*
	Q8. Write a java program to Reverse an integer ArrayList without using inbuilt reverse method.
	Explanation:
	This improves:
	Index manipulation
	Swapping logic
	Understanding list size
*/

import java.util.*;
public class ArrayList8
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		int start = 0;
		int end = list.size()-1;
		
		//Iterator i = list.iterator()
		while(start<end)
		{
			Object temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end ,temp);
			start++;
			end--;
		}
			System.out.print(list);
	}
}