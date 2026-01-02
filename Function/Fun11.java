//Q11. Write a java program to calculate the sum of digits in a number.

import java.util.*;
public class Fun11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		int result = sum																																um(no);
		System.out.println("Sum is " + result);
		
	}
	
	public static int sumNum(int no)
	{
		int sum =0;
		while(no !=0)
		{
			int digit = no%10;
			sum = sum+digit;
			no=no/10;
		}
		return sum;
	}
}