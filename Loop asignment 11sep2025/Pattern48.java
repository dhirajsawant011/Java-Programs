/*
Q8. Write a java program to print this pattern.

					1
				1		2
			1		2		3
		1		2		3		4
	1		2		3		4		5
		1		2		3		4
			1		2		3
				1		2
					1

*/

public class Pattern48
{
	public static void main(String x[])
	{
		
			boolean flag = true;
		for(int i=1; i<=9; i++)
		{	
			int n = 1;
			for(int j=1; j<=9; j++)
				
			{		
					if(j>=6-i && j<=4+i && j>=i-4 && j<=14-i && flag){
						System.out.print(n+" ");
						n++;
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