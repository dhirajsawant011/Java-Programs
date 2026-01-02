/*
Q11. Write a java program to print this pattern.

	A	A	A	A	A
	B	B	B	B	B
	C	C	C	C	C
	D	D	D	D	D
	E	E	E	E	E
*/
public class Pattern62
{
	public static void main(String x[])
	{
		
		for(int i=0; i<5 ; i++)
		{		
			int ch='A';
			
			for(int j=0; j<5; j++)	
			{	
				System.out.print((char)((int)ch+i));
				
				
			}
			System.out.println();
			

		}
	}
}
