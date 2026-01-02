/*
	13. Find Power of a Number
	Create a class PowerCalculator with a method power that calculates base raised to an exponent.
	Explanation: Demonstrates looping or recursion.
*/


import java.util.*;
public class ClassQ13
{
	public static void main(String x[])
	{
		System.out.println("Find Power of a Number");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a base number : ");
		int base = sc.nextInt();
		
		System.out.print("enter a index number : ");
		int index = sc.nextInt();
		PowerCalculator pc  = new PowerCalculator();
		int result = pc.power(base,index);
		System.out.println("Power of a number is   : " + result);
	}
} 


class PowerCalculator
{
	int power(int base, int index)
	{	
		int pow = 1; 
		for(int i=1; i<=index; i++)
		{
			pow = pow*base;
			System.out.println(pow);
		}
		return pow;
	}
}

