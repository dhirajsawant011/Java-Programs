/*
3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/

public class ClassQ3
{
	public static void main(String x[])
	{
		System.out.println("Number Comparison");
		NumberComparison nc = new NumberComparison();
		String  result1 = nc.compare(2,2);
		System.out.print("Result  :" + result1);
		
	}
	
}

class NumberComparison
{
	String compare(int a ,int b)
	{
		if(a>b)
		{
			return "first num is greater";
		}else if(a==b ){
			return "A nd B both are equals ";
		}else{
			return "second num is Greater";
		}
	}		
}