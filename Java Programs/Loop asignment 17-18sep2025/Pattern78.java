/*
Q77. Write a java program to print this pattern.

A 	B 	C 	D
A     		D
A			D
A	B	C	D	
*/
public class Pattern78
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=4; i++)
		{		
			char ch = 'A';
			int n =1;	
			for(int j=1; j<=4; j++)	
			{	
				if(j==1 || i==1 || j==4 || i==4){
					System.out.print(ch+" ");				
				}else{
					System.out.print("  ");
				}
			ch++;
			}
			System.out.println();
		}
	}
}