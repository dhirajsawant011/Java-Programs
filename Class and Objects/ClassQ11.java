/*
	11. Reverse a Number
	Create a class NumberReverser with a method reverse that reverses a given integer number.
	Explanation: Covers basic loops for number manipulation.
*/

import java.util.*;
public class ClassQ11
{
	public static void main(String x[])
	{
		System.out.println("Reverse a Number  ");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int n = sc.nextInt();
		
		NumberReverser nr  = new NumberReverser();
		int result = nr.reverse(n);
		System.out.println("reverse number is   : " + result);
	}
} 
class NumberReverser
{
	int reverse(int n)
	{	
		int rev = 0;
		while(n>0)
		{
			int rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		return rev;
	}
}
