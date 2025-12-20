//Q2. Write a Java program to check whether a triangle is valid or not.


import java.util.*;

public class TriangleValidation
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// Input the sides of the triangle
        System.out.print("Enter side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = sc.nextInt();		
		if(side1 + side2 > side3 && side1 + side3 > side2 &&  side2 + side3 >side1)
		{
				System.out.println("Triangle is valid");
		}else{
			System.out.println("Triangle is not valid");
		}
	}
}

