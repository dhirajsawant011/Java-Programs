/*
	Q2. Write a java program to remove all odd number from an arraylist.
	Explanation
	Use loop with index.
	If element is odd → remove it.
	Adjust index after removal.
*/
import java.util.*;
public class Arraylist12
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(97);
		list.add(93);
		list.add(3);
		list.add(90);
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			Object obj = i.next();
			if((int)obj %2==1)
			{
				i.remove();
			}
		}
		System.out.println(list);
	}
}