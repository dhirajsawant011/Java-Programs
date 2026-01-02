//Q19. Write a java program to find the sum of the first and last digit of a number.

import java.util.*;
public class Fun19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		int result = sflNum(no);
		System.out.print("Sum of first and last Digit is " + result);
		
	}
	
	public static int sflNum(int n)
	{
		int sum = 0;
		int last = n%10;
		
		while(n>9)
		{
			n=n/10;
		}		
		int first = n;
		sum = first+last;
		return sum;
	}
}