//Q21.  Write a java program to check Number Is Prime Number or Not.

import java.util.*;
public class Fun21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int no = sc.nextInt();
		checkPrime(no);
	}
	
	public static void checkPrime(int no)
	{
		
		if(no<=1)
		{
			System.out.print("number is not prime");
			return;
			
		}
		boolean flag = false;
		for(int i=2; i<=no/2;i++)//2 //2<=2 2
		{
			if(no%i==0)
			{
				flag = true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.print("Number is prime");
		}else{
			System.out.print("Number is not  prime");
		}
	}
}