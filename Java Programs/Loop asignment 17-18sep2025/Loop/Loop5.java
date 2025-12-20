//Q5. Write a java program to print all odd numbers between 1 to 100.

public class Loop5
{
	public static void main (String x[])
	{
		System.out.println("Odd Numbers 1 to 100");
		int i = 1;
		while(i<=100)
		{
			if(i%2==1)
			{
			System.out.println(i);
			}
			i++;
		}
	}
}