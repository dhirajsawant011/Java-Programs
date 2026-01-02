/*
	20. Calculate Sum of 1 to Nth Natural Numbers
	Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
	Explanation: Reinforces loops and arithmetic series formula.
	
*/

import java.util.*;
public class ClassQ20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number  : ");
		int n = sc.nextInt();
		
		NaturalNumberSum pc  = new NaturalNumberSum();
		int  result  = pc.calculateSum(n);
		System.out.println(result);
	}
} 


class NaturalNumberSum
{
	int calculateSum(int n)
	{		
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum = sum+i;
		}
		return sum;
	}
}