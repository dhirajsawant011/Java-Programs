/*
Q1. Write a java program to print this pattern.

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1
*/
public class Pattern36
{
	public static void main(String x[])
	{
		//int k=1;
		for(int i=1; i<=5; i++)
		{
			int count =5;
			for(int j=1; j<=5; j++)
			{
					if(j>=i)
					{
						System.out.print(count+" ");
						count--;
					}else
					{
						System.out.print("  ");
						count--;
					}
			}
			System.out.println();
		}
	}
}