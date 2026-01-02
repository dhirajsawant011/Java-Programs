//Q5. Write a Java program that takes an integer (1-12) and prints the corresponding month name using switch-case.

import java.util.*;

public class Switchmonth
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a week number ");
		int monthnum =sc.nextInt();
		
		switch(monthnum)
		{
				case 1:
				System.out.println("January");
				break;
				case 2:
				System.out.println("february");
				break;
				case 3:
				System.out.println("March");
				break;
				case 4:
				System.out.println("April");
				break;
				case 5:
				System.out.println("May");
				break;
				case 6:
				System.out.println("June");
				break;
				case 7:
				System.out.println("July");
				break;
				case 8:
				System.out.println("August");
				break;
				case 9:
				System.out.println("September");
				break;
				case 10:
				System.out.println("Octomber");
				break;
				case 11:
				System.out.println("November");
				break;
				case 12:
				System.out.println("December");
				break;
				default:
					System.out.println("Wrong number entered");
		}
	}
}