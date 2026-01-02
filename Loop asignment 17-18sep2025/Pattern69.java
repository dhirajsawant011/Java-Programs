/*
Q67. Write a java program to print this pattern.
	1 2 3 4 5 6 7 8 9
1	A	B	C	D	E
2	  A	  B	  C   D
3		A	B	C
4		  A	  B
5			A

*/
public class Pattern69
{
	public static void main(String x[])
	{
		for(int i=1; i<=5 ; i++)
		{		
			char ch = 'A';
			boolean flag = true;
			for(int j=1; j<=9; j++)	
			{	
				if(j>=i && j<=10-i && flag){
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