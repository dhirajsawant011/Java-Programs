/*
Q84. Write a java program to print this pattern.

D
D	C
D	C	B
D	C	B	A
D	C   B
D	C
D

*/

public class Pattern85
{
	public static void main(String x[])
	{	
		for(int i=1; i<=7; i++)
		{
			char ch = 'D';
			for(int j=1; j<=4; j++)
			{
				if(j>=5-i && j<=3+i && j>=i-3 && j<=11-i )
				{
					System.out.print(ch-- +" ");
				}
			}
			System.out.println();
		}
	}
}