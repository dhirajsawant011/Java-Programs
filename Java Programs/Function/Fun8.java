//Q8. Write a java program to find the sum of all odd numbers between 1 to n.

import java.util.*;

public class Fun8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		int result = natOddSum(no);
		System.out.print("Odd numbers is "+result);
	}
	
	public static int natOddSum(int n)
	{
		int i=1;
		int sum =0;
		while(i<=n)
		{
			if(i%2==1)
			{
				sum = sum+i;
			}
			i++;
		}
		return sum;
	}
}