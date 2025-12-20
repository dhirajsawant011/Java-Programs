//Q16. Write a java program to find power of a number.

import java.util.*;

public class Loop16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
			int base,index, p=1;
			
			base = sc.nextInt();
			index= sc.nextInt();
			int i =1;
			while(i<=index)
			{
				p =p*base;
				i++;
			}
			System.out.println("Power is "+p);
	}
}