/*
Q8. Write a java program to print this pattern.

	    		1
   		     1     1
    	  1   	      1
 	   1     		     1
	1 	  2	    3	  4	   1
*/

public class Pattern59
{
	public static void main(String x[])
	{
		int n=2;
		for(int i=1; i<=5 ; i++)
		{		
			for(int j=1; j<=9; j++)	
			{		
				if(j==6-i || j==4+i)
					System.out.print("1 ");
				else if(i==5 && j%2==1)
					System.out.print(n++ + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
