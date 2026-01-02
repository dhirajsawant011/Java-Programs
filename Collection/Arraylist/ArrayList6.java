/*
	Q6. Write a java program to Check whether a given number exists in an ArrayList.
	Explanation:
	You learn:
	Linear search logic
	Use of flag variable
	Comparison using loop

*/

import java.util.*;
public class  ArrayList6
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int value = sc.nextInt();
		boolean flag = false;
		
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			if((int)obj==value)
			{
				flag = true;
			}
			
		}
		if(flag)
		{
			System.out.println("Element is Found");
		}
		else
		{
			System.out.println("Element is not Found");
		}
		
		
	}
}

