/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
*/


import java.util.*;
public class Fun24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int no = sc.nextInt();
		checkStrongNum(no);
	}
	
	public static void checkStrongNum(int no)
	{
		
		int org =no;
		int count =0;
		int sum = 0;
		while(no>0)
		{
			count++;
			no = no/10;
		}
		no = org;
		while(no>0)
		{
			int digit = no%10;			
			int fact = 1;
			for(int i=1; i<=digit; i++)
			{
				fact= fact*i;//1*1 =1 //1*1 =1 //1*2 =2  //2*3 = 6 //6*4 = 24   //24*5 = 120
			}
			sum = sum+fact; //1+0 = 1// 1+24 = 25 //120+25 = 145s
			no=no/10;
		}
		

		if(sum == org)
		{
			System.out.print("Number is Strong ");
		}else
		{
			System.out.print("Number is not Strong");
		}
	}
}