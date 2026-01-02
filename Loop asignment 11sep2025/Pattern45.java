/*
Q5. Write a java program to print this pattern.

	#	1	#	2	#
	3	#	4	#	5
	#	6	#	7	#
	8	#	9	#	10
	#	11	#	12	#

*/

public class Pattern45
{
	public static void main(String x[])
	{
		int ct = 1;
		for(int i=1; i<=5; i++)
		{	
			
			for(int j=1; j<=5; j++)
			{		
				if(i==1 || i==3 || i==5)
				{	
					if(j%2==0){
					System.out.print(ct++ +"  ");
					}else{
						System.out.print("#  	");
					}
				}else{
					if(j%2==1){
					System.out.print(ct++ +"  ");
					}else{
						System.out.print("#  ");
					}
				}
				
			}
			System.out.println();
		}
	}
}
