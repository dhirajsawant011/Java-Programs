/*
4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.

*/
public class ClassQ4
{
	public static void main(String x[])
	{
		System.out.println("Number Comparison");
		NumberChecker nc = new NumberChecker();
		String  result = nc.isEven(1432);
		System.out.print("Result  :" + result);
		//String result = nc.isEven(15);
	}
}

class NumberChecker
{
	String isEven(int n)
	{
		if(n%2==0)
		{
			return " number is Even ";
		}else{
			return " number is Odd  ";
		}
	}
}