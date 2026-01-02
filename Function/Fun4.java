//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop Using Function

import java.util.*;
public class Fun4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int no = sc.nextInt();
		eveNum(no);
	}
	public static void eveNum(int n)
	{
		int i=1;
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
