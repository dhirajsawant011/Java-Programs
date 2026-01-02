/*
Q70. Write a java program to print this pattern.

	1	A	2	B	3
	C	4	D	5	E
	6	F	7	G	8
	H	9	I	10	J
	11	K	12	L	13
*/
public class Pattern72
{
	public static void main(String x[])
	{
		char ch = 'A';
			int n = 1;
		for(int i=1; i<=5; i++)
		{		
			
			for(int j=1; j<=5; j++)	
			{	
				if(i==1 || i==3 || i==5){
					if(j%2==0){
						System.out.print(ch++ +"  ");
					}else{
						System.out.print(n++ +"  ");
					}
				}else{
					if(j%2==1){
						System.out.print(ch++ +"  ");
					}else{
						System.out.print(n++ +"  ");
					}  
				}
				
			}
			System.out.println();
		}
	}
}