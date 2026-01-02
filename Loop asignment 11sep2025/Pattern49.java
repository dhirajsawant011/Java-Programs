/*				1
			2	*	2
		3	*	3	*	3
	4	*	4	*	4	*	4
		3	*	3	*	3
			2	*	2
				1
*/

public class Pattern49
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=7; i++)
		{	
			//	int n = i;
			boolean flag = true;
			for(int j=1; j<=7; j++)
			{		
					if(j>=5-i && j<=3+i && j>=i-3 && j<=11-i )
					{
						if(flag)
						{
							System.out.print(" "+ (i<4 ? i : 8-i ) +" ");
							flag = false;
						}
						else
						{
							System.out.print(" * ");
							flag = true;
						}
					}
					
			}
			System.out.println();
		}
	}
}