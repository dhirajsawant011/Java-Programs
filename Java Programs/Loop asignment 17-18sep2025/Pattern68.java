/*
Q66. Write a java program to print this pattern.
	1 2 3 4 5 6 7 8 9
1			A
2		  A   B
3		A	B	C
4	  A   B	  C	  D
5	A	B	C	D	E

*/
public class Pattern68
{
	public static void main(String x[])
	{
		for(int i=1; i<=5 ; i++)
		{		
			char ch = 'A';
			boolean flag = true;
			for(int j=1; j<=9; j++)	
			{	
				if(j>=6-i && j<=4+i && flag){
				System.out.print(ch++ +" ");
					flag = false;
				}else{
					System.out.print("  ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}