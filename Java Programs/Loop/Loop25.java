//Q25. Write a java program to Check Number Is Armstrong Number or Not.


import java.util.*;
public class Loop25
{  
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int n = sc.nextInt();
		int org = n;
		
		int count = 0;
		while(n > 0){
			n = n / 10;
			count++;
		}
		
		n = org;
		
		int sum = 0;
		while(n > 0){
			int digit = n % 10;
			int pow = 1;
			int i=1;
			while(i<=count){
				pow = pow * digit;
				i++;
			}
			sum = sum + pow;
			n = n / 10;
		}
		
		System.out.println(sum == org ? "Armstrong" : "Not armstrong");
	}
}

