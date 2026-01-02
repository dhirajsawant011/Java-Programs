//Q3. Write a java program to print all alphabets from a to z. - using while loop Using Function

import java.util.*;

public class Fun3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Alphabate : ");
		char ch = sc.next().charAt(0);
		aToz(ch);
	}
	
	public static void aToz(char ch)
	{
		while(ch<='Z')
		{	
			System.out.println(ch);
			ch++;
		}
	
	}
}
