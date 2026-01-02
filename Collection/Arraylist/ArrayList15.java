/*
	Q15. Write a java program to check whether elements of an ArrayList form a palindrome.
	Explanation
	Compare elements from start and end using two pointers.
	If mismatch → not palindrome.
*/

import java.util.*;
public class ArrayList15
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(20);
		list.add(10);
		

		int start =0;
		int end = list.size()-1;
		boolean flag = true;

		while(start < end)
		{
			if((int)list.get(start) != (int)list.get(end))
			{
				flag = false;
				break;
			}
			start++;
			end--;
		}

		if(flag)
		{
			System.out.println("Arraylist is Palindrome");
		}
		else
		{
			System.out.println("Arraylist is Not  Palindrome");
		}
	}
}