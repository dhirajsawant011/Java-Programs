/*
Q5. Write a java program to print this pattern.
		    		1
				  2   2
				3      3
			  4 	     4
			5	5   5   5    5	

*/

public class Pattern56
{
	public static void main(String x[])
	{
		int n=1;
		for(int i=1; i<=5; i++)
		{		
			boolean flag = true;
			for(int j=1; j<=9; j++)	
			{		
				if(j>=6-i && j<=4+i && flag){
					System.out.print(i+ "  ");
					flag = false;
					
				}else{
					System.out.print("   ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}

