/*
	Q3. Make a NumberCheck class with one field num, initialized by a constructor.
	Write a method checkEvenOdd() that prints whether the number is Even or Odd.
	Concepts Used:
	✔ Constructor
	✔ Logical % (modulus) operator
	Explanation:
	Use num % 2 == 0 to check even else odd.
	
*/

class NumberCheck
{
	int n;
	NumberCheck(int n)
	{
		this.n = n;
	}
	void checkEvenOdd()
	{
		if(n%2==0)
		{
				System.out.println(n+" Num is Even");
		}else{
			System.out.println(n+" Num is Odd");
		}
	}
}
public class ConstructorQ3
{
	public static void main(String x[])
	{
		NumberCheck nb = new NumberCheck(10);
		nb.checkEvenOdd();
		NumberCheck nb1 = new NumberCheck(20);
		nb1.checkEvenOdd();
		NumberCheck nb2 = new NumberCheck(3);
		nb2.checkEvenOdd();
	}
}