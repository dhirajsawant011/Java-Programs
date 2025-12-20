//Q4. Write a Java program that takes a temperature value and a choice:

//			1. for converting Celsius to Fahrenheit
			//	fah = (cel * 9 / 5) + 32;	
//			2. for converting Fahrenheit to Celsius
			//	cel = (fah - 32) * 5 / 9;
//			Perform the respective conversion using switch-case.

		
import java.util.*;

public class temperature
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		double cel,fah;
		System.out.print("Enter the Temperature in Celcius");
		cel = sc.nextDouble();
		System.out.print("Enter the Temperature in Fahrenheit");
		fah = sc.nextDouble();
		int choice = sc.nextInt();
		cel = (fah-32)*5/9;
		fah = (cel*5/9)+32;
		switch(choice)
		{
			case 1:
				System.out.print(cel+ " Temperature in Celcius");
				break;
			case 2:
				System.out.print(fah+" Temperature in Fahrenheit");
				break;
			default:
				System.out.print("wrong keyword please input right word");
				break;
			
		}
	}
}