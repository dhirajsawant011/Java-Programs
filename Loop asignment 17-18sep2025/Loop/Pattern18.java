/* Q3. Write a java program to print this pattern.

*   *   *   *   *   *
  *   *   *   *   *
    *   *   *   *
      *   *   *
        *   *
          *
*/

public class Pattern18
{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++)
		{
			boolean flag = true;
			for(int j=1; j<=11; j++)
			{
				if( flag && j>=i && j<=12-i)
				{
					System.out.print(" *");
					flag = false;
				}else
				{
					System.out.print("  ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}