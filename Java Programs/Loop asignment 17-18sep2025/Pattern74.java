/*
Q73. Write a java program to print this pattern.
		
	A	B	C	D	E
		1	2	3	4
			A	B	C
				1	2
					A

*/
public class Pattern74
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5; i++)
		{		
			char ch = 'A';
			int n =1;	
			for(int j=1; j<=5; j++)	
			{	
				if(j>=i){
					if(i%2==1){
						System.out.print(ch +" ");
						ch++;
					}else{
						System.out.print(n +" ");
						n++;
					}
				}else{
					System.out.print("  ");
					
				}
			}
			System.out.println();
		}
	}
}