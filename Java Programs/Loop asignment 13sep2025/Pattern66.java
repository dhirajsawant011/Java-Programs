/*
Q15. Write a java program to print this pattern.

	E	E	E	E	E
	D	D	D	D
	C	C	C
	B	B
	A

*/
public class Pattern66
{
	public static void main(String x[])
	{
		for(int i=0; i<5 ; i++)
		{		
			int ch='E';
			for(int j=0; j<5; j++)	
			{	
				if(i<=j){
					System.out.print((char)((int)ch-i) +"\t");
				}

			}
			System.out.println();
			

		}
	}
}