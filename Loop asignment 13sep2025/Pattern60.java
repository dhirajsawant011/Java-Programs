/*

Q9. Write a java program to print this pattern.

	1       				  9
	  2     			   8
  		3				7
   			4		6
				5
   			4 		6
  		3   			7
     2     				   8
   1       					   9

(j>=i && j<=8-i && i>=j-8 && i<=4) ||(i>=5 && j>=8-i && j<=i )
*/

public class Pattern60
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=9	 ; i++)
		{		
			int n=1;
			boolean flag = true;
			for(int j=1; j<=9; j++)	
			{		
				if((i<=5 && (i==j || j==10-i) )|| (i<=9  && (j==10-i || j==i)) ){
					System.out.print(n+"   ");
					n++;
				}else{
					System.out.print("   ");
					n++;
					
				}
			}
			System.out.println();
		}
	}
}
