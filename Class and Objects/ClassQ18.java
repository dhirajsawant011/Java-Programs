/*
18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.

*/

import java.util.*;
public class ClassQ18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number  : ");
		int year = sc.nextInt();
		
		LeapYearChecker pc  = new LeapYearChecker();
		String  result  = pc.isLeapYear(year);
		System.out.println(result);
	}
} 


class LeapYearChecker
{
	String isLeapYear(int y)
	{		
		if(y%4==0)
		{
			return "Leap year";
		}else{
			return "Not leap year";
		}
	}
}