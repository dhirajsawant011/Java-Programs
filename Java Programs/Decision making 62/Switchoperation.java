//Q1. Write a Java program that takes two numbers and an operator (+, -, *, /) as input and performs the 
//			corresponding operation using a switch-case statement.
import java.util.*;

public class Switchoperation
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a values :");
		int a =sc.nextInt();
		System.out.print("Enter a values : ");
		int b =sc.nextInt();
		System.out.print("Enter your choice operator : ");
		char choice = sc.next().charAt(0);
		
		switch(choice)
		{
			case '+':
				System.out.println("Addition is "+(a+b));
				break;
			case '-':
				System.out.println("substraction is "+(a-b));
				break;
			case '*':
				System.out.println("Multiplication is "+(a*b));
				break;
			case '/':
				System.out.println("divisor is "+(a/b));
				break;
			default:
				System.out.println("wrong choice");
				
		}
	
	}
}