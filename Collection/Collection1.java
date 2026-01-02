
import java.util.*;
class Collection1
{
	public static void main(String x[])
	{
		ArrayList l1 = new ArrayList(2);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		//l1.remove(1);
		l1.set(2,5);
		System.out.println(l1.get(1));	
		System.out.println(l1);
	}
}