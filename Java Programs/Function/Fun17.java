//Q17. Write a java program to find all factors of a number.

import java.util.*;
public class Fun17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		numFactors(no);
	}
	
	public static void numFactors(int n)
	{
		System.out.print("Factors are :");
		int i=1;
		while(i<=n)
		{
			if(n%i==0)
			System.out.print(" " +i );
			i++;
		}
	}
}