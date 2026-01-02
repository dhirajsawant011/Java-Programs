//Q15. Write a java program to print all ASCII characters with their values.

import java.util.*;
public class Fun15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		asciiValue(no);
		
		
	}
	
	public static void asciiValue(int no)
	{
		int i=1;
		while(i<=no)
		{
			int ascii=(char)(int)(i);
			System.out.println((char)i );
			i++;
		}
		
	}
}