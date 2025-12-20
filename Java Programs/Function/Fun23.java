/*
Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, 
For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.

*/

import java.util.*;
public class Fun23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int no = sc.nextInt();
		checkDuckNum(no);
	}
	
	public static void checkDuckNum(int no)
	{
		boolean flag = false;
		while(no>0)
		{
			int digit = no%10;
			if(digit==0){
				flag = true;
				break;
			}
			
			no=no/10;
		}
		if(flag)
		{
			System.out.print("Number is Duck");
		}else{
			System.out.print("Number is not Duck");
		}
	}
}

