/*
10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.
*/

import java.util.*;
public class ClassQ10
{
	public static void main(String x[])
	{
		System.out.println("  Find the Area of a Circle ");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a radius : ");
		int r = sc.nextInt();
		
		CircleArea ca  = new CircleArea();
		double result = ca.findArea(r);
		System.out.println("area  is   : " + result);
	}
} 
class CircleArea
{
	double findArea(double r)
	{
		return 3.14*(r*r);
	}
}