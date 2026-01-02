/*
Q5. Write a java program to print this pattern.

*   *   *   *   *   *
  *   *   *   *   *
    *   *   *   *
      *   *   *
        *   *
          *
*/
public class Pattern23
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			boolean flag = true;
			for(int j=1; j<=9; j++)
			{
				if(flag && (j>=i && j<=10-i) )
				{
					System.out.print("* ");
					flag=false;
					
				}else
				{
					System.out.print("  ");
					flag=true;
					
				}
			}
			System.out.println();
		}
	}
}

