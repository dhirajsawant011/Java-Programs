/*
Q10. Write a java program to print this pattern.
	Q1. Write a java program to print this pattern.
		1 2 3 4 5 6 7
1			  1
2			2	2
3		  3	  3	  3
4		4	4	4	4
5		  3   3	  3	
6			2	2
7			  1
(j>=i && j<=8-i && i>=j-8 && i<=4) ||(i>=5 && j>=8-i && j<=i )

					if(j>=5-i && j<=3+i && j>=i-3 && j<=11-i ){
						if(flag){
							System.out.print(" "+ (i<4 ? i : 8-i ) +" ");
							flag = false;
						}
						else{
							System.out.print(" * ");
							flag = true;
						}
					}
					
					if( i<=7 && j>=5-i &&  i>=j-3 && i<=3+j && i<=11-j){
						System.out.print(" * ");
						flag = false;
					}else{
						System.out.print("   ");
						flag = true;
					}
					if(j>=5-i && j<=3+i && j>=i-3 && j<=11-i ){
						if(flag){
							System.out.print(" "+ (i<4 ? i : 8-i ) +" ");
							flag = false;
						}
						else{
							System.out.print("   ");
							flag = true;
						}
					}else{
						System.out.print("   ");
						
					}
*/

public class Pattern52
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=7; i++)
		{	
			int n=1;
			boolean flag = true;
			for(int j=1; j<=7; j++)	
			{		
					if(j>=5-i && j<=3+i && j>=i-3 && j<=11-i ){
						if(flag){
							System.out.print(" "+ (i<4 ? i : 8-i ) +" ");
							flag = false;
						}
						else{
							System.out.print("   ");
							flag = true;
						}
					}else{
						System.out.print("   ");
						
					}
					
			}
			System.out.println();
		}
	}
}
