/*
	9. Convert Celsius to Fahrenheit
	Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
	Explanation: Demonstrates unit conversion logic.
*/

import java.util.*;
public class ClassQ9
{
	public static void main(String x[])
	{
		System.out.println(" Convert Celsius to Fahrenheit");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a Celsius : ");
		int cel = sc.nextInt();
		
		TemperatureConverter tp  = new TemperatureConverter();
		double result = tp.convertToFahrenheit(cel);
		System.out.println("Fahrenheit is   : " + result);
	}
} 
class TemperatureConverter
{
	int convertToFahrenheit(int c)
	{
		return (c*9/5)+32;
	}
}