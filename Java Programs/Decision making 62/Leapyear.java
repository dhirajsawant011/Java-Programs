//Q8. Write a Java program to check whether a year is a leap year or not.

import java.util.*;

public class Leapyear
{
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		if(year%4==0)
		{
			System.out.println(year+" is a leap year");
		}else{
			System.out.println("Its not leap year");
		}
		
	}

}