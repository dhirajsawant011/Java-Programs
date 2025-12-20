/*

Q1. Write a java program to print this pattern.

						A
					B	A
				C	B	A
			D	C	B	A
		E	D	C	B	A

*/
public class Pattern67
{
	public static void main(String x[])
	{
		for(int i=1; i<=5 ; i++)
		{		
			for(int j=1; j<=5; j++)	
			{	
				if(j>=6-i){
				System.out.print((char)(6-j+64) +" ");	
	
				}else{
					System.out.print("  ");
				}
			}
			//ch=(int)((char)ch)-i;
			System.out.println();
			

		}
	}
}