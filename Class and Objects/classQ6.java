/*
6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.

*/

public class ClassQ6
{
	public static void main(String x[])
	{
		System.out.println("Number Comparison");
		MaxFinder nc = new MaxFinder();
		int  result = nc.findMax(5,4,9);
		System.out.print("Largest Element  :" + result);
	}
}

class MaxFinder
{
	int findMax(int a, int b , int c)
	{
		return (a>b && a>c)? a:(b>a && b>c)? b:c;
	}
}