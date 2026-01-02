/*
	12. Find Factorial of a Number
	Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
	Explanation: Focuses on iterative or recursive logic.
*/

import java.util.*;
public class ClassQ12
{
	public static void main(String x[])
	{
		System.out.println("Factorial of a Number");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int n = sc.nextInt();
		
		FactorialCalculator fc  = new FactorialCalculator();
		int result = fc.findFactorial(n);
		System.out.println("Factorial of a number is   : " + result);
	}
} 
class FactorialCalculator
{
	int findFactorial(int n)
	{	
		//int fac = 1;
		//for(int i=1; i<=n; i++)
		//{
		//	fac = fac*i;
		//}
		//return fac;
		
		if(n==0 || n==1)
		{
			return 1;
		}
		
		return n* findFactorial(n-1);
	}
}