/*
Q3. WAP to create class name as Factorial with two functions 
   void setNum(): this function can accept number as parameter 
   void showFactorial(): this function is used for calculate factorial of number and  display it

*/

import java.util.*;
public class ClassQ34
{
	public static void main(String x[])
	{
		Factorial fc = new Factorial();
		fc.setNum();
		fc.showFactorial();
	}
}
class Factorial
{
	Scanner sc = new Scanner(System.in);
	int num;
	void setNum()
	{
		System.out.print("Enter a base value : ");
		num = sc.nextInt();
	}
	void showFactorial()
	{
		int fac=1;
		for(int i=1; i<=num; i++)
		{
			fac = fac*i;
		}
		System.out.println("Factorial is " + fac);
		
	}
}