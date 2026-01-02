/*
Q72. Write a java program to print this pattern.

A			  I
  B			H
   C	  G
    D	F
      E	

*/
public class Pattern73
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5; i++)
		{		
			char ch = 'A';
			for(int j=1; j<=9; j++)	
			{	
				if(j==i || j==10-i){
					System.out.print(ch +" ");
					ch++;
				}else{
					System.out.print("  ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}