/*
Q14. Write a java program to print this pattern.

	A
	B	B
	C	C	C	
	D	D	D	D
	E	E	E	E	E

*/
public class Pattern65
{
	public static void main(String x[])
	{
		for(int i=0; i<5 ; i++)
		{		
			int ch='A';
			for(int j=0; j<5; j++)	
			{	
				if(i>=j){
				System.out.print((char)((int)ch+i) +"\t");
				
				}

			}
			System.out.println();
			

		}
	}
}