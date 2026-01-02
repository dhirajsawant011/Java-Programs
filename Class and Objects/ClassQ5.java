/*
5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
*/

public class ClassQ5
{
	public static void main(String x[])
	{
		System.out.println("Number Comparison");
		SimpleInterest nc = new SimpleInterest();
		int  result = nc.calculate(1000,5,2);
		System.out.print("Sipmple Interest is   :" + result);
	}
}

class SimpleInterest
{
	int calculate(int p, int r, int t)
	{
		return (p*r*t)/100;
	}
}