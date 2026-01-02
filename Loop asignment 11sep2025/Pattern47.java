/*
Q7. Write a java program to print this pattern.
	1	2	3	4	5	6	7	8	9
1					1
2				2		2
3			3				3
4		4						4
5	5								5
6		4						4
7			3				3
89				2		2
					1
*/

public class Pattern47
{
	public static void main(String x[])
	{

		for(int i=1; i<=9; i++)
		{	
			
			for(int j=1; j<=9; j++)
			{		
					//i = (i <= 5) ? i : is;   // mirror values
					
					if(j==6-i || j==4+i || j==14-i || i==4+j){
						System.out.print(i>=5 ? 10-i : i + " ");
					}else{
						System.out.print("  ");
						
					}
				
			}
			System.out.println();
		}
	}
}