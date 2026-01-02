/*
Q13. Write a java program to print this pattern.

	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I

*/
public class Pattern64
{
	public static void main(String x[])
	{
		for(int i=0; i<5 ; i++)
		{		
			int ch='A'+i;
			for(int j=0; j<5; j++)	
			{	
				System.out.print((char)ch+"\t");
				ch++;

			}
			System.out.println();
			

		}
	}
}