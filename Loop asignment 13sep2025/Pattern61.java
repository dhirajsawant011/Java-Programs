/*
Q10. Write a java program to print this pattern.

1        							1
1	2							2	1
1	2	3					3	2	1
1	2	3	4			4	3	2	1
1	2	3	4	5	5	4	3	2	1

*/
public class Pattern61
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5 ; i++)
		{		
			for(int j=1; j<=10; j++)	
			{		
				if(i>=j || j==11-i || i>=11-j )
					System.out.print((j < 6 ? j : 11-j) + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

