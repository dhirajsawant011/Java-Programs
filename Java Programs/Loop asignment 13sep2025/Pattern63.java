/*
Q12. Write a java program to print this pattern.

A	B	C	D	E
A	B	C	D	E
A	B	C	D	E	
A	B	C	D	E
A	B	C	D	E

*/
public class Pattern63
{
	public static void main(String x[])
	{
		for(int i=0; i<5 ; i++)
		{		
			int ch='A';
			for(int j=0; j<5; j++)	
			{	
				System.out.print((char)ch+"\t");
				ch++;
			}
			System.out.println();
			

		}
	}
}
