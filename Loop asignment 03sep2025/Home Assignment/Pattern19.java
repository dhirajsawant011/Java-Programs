/*
Q1. Write a java program to print this pattern.

	*						*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*						*
*/

public class Pattern19
{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=11; j++)
			{
				if(i==j || j==8-i || j==1 || j==7)
				{
					System.out.print(" * ");
					
				}else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}