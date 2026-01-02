
/*
Q39. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1

*/

public class Testnew
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			int n=5-i+1;
			for(int j=1; j<=5; j++)
			{
				if( j>=i)
				{
					if(j%2==1)
						System.out.print(" "+n +" ");
					else
						System.out.print(" * ");
					//flag = false;
					
				}
				
			}
			System.out.println();
		}
	}
}
