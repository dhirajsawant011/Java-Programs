/*
Q79. Write a java program to print this pattern.

A
B	C
C		D
D			E
E	F	G	H	I

*/

public class Pattern80
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5; i++){
			char ch =(char)('A'+i-1); 
			//char ch = (char)('A' + i - 1); //65+1-1 =65  65+2-1=66 65+3-1=67
			for(int j=1; j<=5; j++){
				if(j==1 || i==j || i==5)
				{
					System.out.print(ch +"  ");
					ch++;
				}
				else
				{
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
	}
}
