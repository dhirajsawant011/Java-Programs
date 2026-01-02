//Q6. Write a java program to find the sum of all natural numbers between 1 to n. using function

import java.util.*;
public class Fun6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = sc.nextInt();
		int result = natSum(no);
		System.out.print("Sum is " + result);
		
	}
	
	public static int natSum(int no)
	{
		int i=1;
		int sum=0;
		while(i<=no)
		{
			sum = sum+i;
			i++;
		}
		
		return sum;
	}
}

