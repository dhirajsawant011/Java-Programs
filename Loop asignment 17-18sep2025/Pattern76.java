/*
Q75. Write a java program to print this pattern.

								A
						1	2	1
				A	B	C	B	A
		1	2	3	4	3	2	1
A	B	C	D	E	D	C	B	A

				A
			1	2	1
		A	B	C	B	A
	1	2	3	4	3	2	1
A	B	C	D	E	D	C	B	A


*/
public class Pattern76
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5; i++)
		{		
				int k=1;
			for(int j=1; j<=9; j++)	
			{	
			
				if(j>10-2*i){
					if(i%2==0){
						System.out.print(" "  + (j<10-i ? k++ :k-- )+" ");
					}else{
						System.out.print(" "  +(char)(64 +(j<10-i ? k++ :k-- )) +" ");
					}
					
				}else{
					System.out.print("   ");
				}					
			}
			System.out.println();
		}
	}
}