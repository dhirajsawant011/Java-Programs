/*
	Q1. Write a java program to count how many prime numbers are present in an ArrayList.
	Explanation
	For each number:
	Check divisibility from 2 to n-1
	If divisible → not prime
	Count primes
*/

import java.util.*;
public class ArrayList11
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(97);
		list.add(93);
		list.add(3);
		list.add(90);
		
		//Iterator i = list.iterator();
		
		for(int i=0; i<list.size(); i++)
		{
			int no = (int)list.get(i);
			boolean flag =true;
			for(int j=2; j<=no/2; j++)
			{
				if(no%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(no);
			}
		}
	}
}