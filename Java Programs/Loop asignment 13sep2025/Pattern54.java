/*
Q3. Write a java program to print this pattern.

	1	0	0	0	1
	0	1	0	1	0
	0	0	1	0	0
	0	1	0	1	0
	1	0	0	0	1
*/

public class Pattern54
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{		
			int n=1;
			int k=0;
			for(int j=1; j<=5; j++)	
			{		
				if(j==6-i || j==i){
						System.out.print(n+"  ");
				}else{
					System.out.print(k+"  ");
				}
					
			}
			System.out.println();
		}
	}
}