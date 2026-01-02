//Q28. Write a java program to Check Number Is Spy Number or Not.
//Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
//	Input : 1412
//	Output : Spy Number
//	Explanation :
//	sum = (1 + 4 + 1 + 2) = 8
//	product = (1 * 4 * 1 * 2) = 8
//	since, sum == product == 8

import java.util.*;
public class Loop28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int no = sc.nextInt();
		int product =1, sum =0;	
		int rem;
		while(no!=0)
		{
			rem = no%10;
			sum=sum+rem;
			product = product*rem;
			no = no/10;
		}
		String msg = sum ==product?"Number is spy":"Number is not spy";
		System.out.println(msg);
	}
}
