//Q9. Write a java program to print a multiplication table of any number.

import java.util.*;

public class Fun9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		mulTable(no);
		
	}
	
	public static void mulTable(int n)
	{
		int i=1;
		int table =1;
		while(i<=10)
		{
			table = n*i;
			System.out.println(i +"   *   " +n  +"  =  " +table );
			i++;
		}
		
	}
}