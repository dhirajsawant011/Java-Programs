/*
Q68. Write a java program to print this pattern.
	
	A	1	2	3	4
	A	B	1	2	3
	A	B	C	1	2
	A	B	C	D	1
	A	B	C	D	E
	
*/
public class Pattern70
{
	public static void main(String x[])
	{
		for(int i=1; i<=5 ; i++)
		{		
			char ch = 'A';
			int n = 1;
			for(int j=1; j<=5; j++)	
			{	
				if(j<=i){
				System.out.print(ch++ +"  ");
				}else{
					System.out.print(n++ +"  ");
					
				}
			}
			System.out.println();
		}
	}
}