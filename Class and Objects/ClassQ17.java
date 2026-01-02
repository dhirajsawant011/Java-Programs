/*
	17. Calculate Sum of Digits
	Create a class DigitSumCalculator with a method DigitSumCalculator that computes the sum of digits of a number.
	Explanation: Practices loops for digit extraction.
*/

import java.util.*;
public class ClassQ17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number  : ");
		int no = sc.nextInt();
		
		DigitSumCalculator pc  = new DigitSumCalculator();
		int result  = pc.DigitSumCalculator(no);
		System.out.println("Sum is " + result);
	}
} 


class DigitSumCalculator
{
	int DigitSumCalculator(int n)
	{		
		int sum =0;
		while(n>0)
		{
			int digit=  n%10;
			sum = sum+digit;
			n=n/10;
		}
		return sum;
	}
}