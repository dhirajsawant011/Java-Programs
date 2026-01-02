//Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.

import java.util.*;

public class TriangleEIS
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a side1 :- ");
		int side1 =sc.nextInt();
		System.out.print("Enter a side2 :- ");
		int side2 =sc.nextInt();
		System.out.print("Enter a side3 :- ");
		int side3 =sc.nextInt();
		
		if(side1 == side2 && side2 == side3 && side1 == side3){
			System.out.println("Its a equilateral ");
		}else if(side1 == side2 || side2 == side3 || side1 == side3){
			System.out.println("Its a isoscale ");
		}else{
			System.out.println("Its a scalene ");
		}
	
		
	}
}