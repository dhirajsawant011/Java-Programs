/*
Q3. Write a java program to print this pattern.
	1	2	3	4	5	6	7	8	9
	
1	1	2	3	4	5	6	7	8	9	1 9=10
2		1	2	3	4	5	6	7		2 8=10
3			1	2	3	4	5			
4				1	2	3				
5					1							
*/

public class Pattern38
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5; i++)
		{
			int k=1;
			//boolean flag = true;
			for(int j=1; j<=9; j++)
			{
					if(j>=i && j<=10-i)
					{
						System.out.print("  " +k++ );
					}else
					{
						System.out.print("   ");
					}
			}
			System.out.println();
		}
	}
}