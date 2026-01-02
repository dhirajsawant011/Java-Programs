/*
2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.

*/

public class ClassQ2
{
	public static void main(String x[])
	{
		System.out.println("Calculator");
		Calculator cl = new Calculator();
		int result1 = cl.add(2,4);
		int result2 =cl.subtract(9,5);
		int result3 =cl.multiply(4,9);
		int result4 =cl.divide(10,2);
		System.out.println("Addition is 		:" + result1);
		System.out.println("Substraction is 	:" + result2);
		System.out.println("Multplication is 	:" + result3);
		System.out.println("Dividation  is 		:" + result4);
		
	}
	
}

class Calculator
{
	int add(int a ,int b)
	{
		return a+b;
	}
	
	int subtract(int a ,int b)
	{
		return a-b;
	}
	int multiply(int a ,int b)
	{
		return a*b;
	}	
	int divide(int a ,int b)
	{
		return a/b;
	}		
}