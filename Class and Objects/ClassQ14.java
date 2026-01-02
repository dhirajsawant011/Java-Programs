/*
	14. Check for Prime Numbers
	Create a class PrimeChecker with a method isPrime to check if a number is prime.
	Explanation: Introduces number theory logic.
	
*/

import java.util.*;
public class ClassQ14
{
	public static void main(String x[])
	{
		System.out.println("Check for Prime Numbers");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a  number : ");
		int num = sc.nextInt();
		
		PrimeChecker pc  = new PrimeChecker();
		pc.isPrime(num);
		
	}
} 


class PrimeChecker
{
	void isPrime(int n)
	{	
		boolean flag = true;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Number is prime");
		}else{
			System.out.println("not prime ");
		}
	}
}
