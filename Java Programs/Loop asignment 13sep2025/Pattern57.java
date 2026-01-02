/*
Q6. Write a java program to print this pattern.
					1
				1	2	1	
             1	2	3	2	1
		1	2	3	4	3	2	1
 			1	2	3	2	1	
				1	2	1	
					1
	

*/
public class Pattern57
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=7 ; i++)
		{		
			int n=1;
			for(int j=1; j<=7; j++)	
			{		
				if(j>=5-i && j<=3+i && j>=i-3 && j<=11-i ){
					System.out.print(n+ " ");
					// if(j<4)
						// n++;
					// else
						// n--;
					n = j<4 ? ++n: --n ;
					
				}else{
					System.out.print("  ");
					
				}
			}
			System.out.println();
		}
	}
}
/*
					if(j>=6-i && j<=4+i && j>=i-4 && j<=14-i && flag){
						System.out.print(n+" ");
						n++;
						c
					}else{
						System.out.print("  ");
						flag = true;
					}
*/