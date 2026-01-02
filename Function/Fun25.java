/*
Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives 
the number itself.
For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit 
Armstrong numbers and there are many more.
*/

import java.util.*;
public class Fun25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int no = sc.nextInt();
		checkArmNum(no);
		
	}
	
	public static void checkArmNum(int no)
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
			int pow = 1;
			for(int i=1; i<=count; i++)
			{
				pow= pow*digit;//1*1 =1 //1*5 =5 //5*5 =25  //25*5 = 125  //3*1 = 3 // 3*2 = 6  //6*3 = 18
			}
			sum = sum+pow; //1+0 = 1// 1+125 = 126 //126+18 = 144
			no=no/10;
		}
		
		if(sum == org)
		{
			System.out.print("Number is Armstrong  ");
		}else
		{
			System.out.print("Number is not Armstrong");
		}
	}
}