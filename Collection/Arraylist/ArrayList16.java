/*
Q16. Given an ArrayList of integers, find the first element that occurs only once.
Explanation
For each element, count how many times it appears.
The first element with count 1 is the answer.


Input:- [4, 5, 1, 2, 0, 4]		Output :- 5
*/

import java.util.*;
public class ArrayList16
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(0);
		list.add(4);

		
			for(int i=0; i<list.size(); i++)
			{
				int count =0;
				for(int j=0; j<list.size(); j++)
				{
					if((int)list.get(i) == (int)list.get(j))
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(list.get(i));
					break;
				}
			}
	}
}