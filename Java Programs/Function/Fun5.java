//Q5. Write a java program to print all odd numbers between 1 to 100.

import java.util.*;
public class Fun5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int no= sc.nextInt();
		int result = OddNum(no);
		System.out.print(result);
	}
	
	public static int OddNum(int n)
	{
		int i=1;
		while(i<=n)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			i++;
		}
		return n;
	}
}