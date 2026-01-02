/*
	15. Swap Two Numbers
	Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
	Explanation: Covers mathematical operations for swapping.
	
*/

import java.util.*;
public class ClassQ15
{
	public static void main(String x[])
	{
		System.out.println("Check for Prime Numbers");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number  : ");
		int a = sc.nextInt();
		
		System.out.print("enter second number : ");
		int b= sc.nextInt();
		Swapper pc  = new Swapper();
		pc.swap(a,b);
		
	}
} 


class Swapper
{
	void swap(int a , int b)
	{			  //5   //4	
		
		System.out.println("Before swapping :");
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		a=a+b; //5+4=a =9
		b=a-b; //9-4=b =5
		a=a-b; //9-5=a =4
		
		System.out.println("");
		System.out.println("After  swapping :");
		System.out.println("a =" +a);
		System.out.println("b =" +b);	
	}
}