/*
Q5. Write a java program to print this pattern.
	1	2	3	4	5
	
1	5	*	5	*	5  
2	4	*	4	*	  
3	3	*	3
4	2	*
5	1
*/
public class Pattern40
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{	
			
			for(int j=1; j<=5; j++)
			{
				if(j<=6-i )
					{	
						if(j%2==1){
						System.out.print(6-i +" ");
						}else{
							System.out.print(" * ");
						}
					}
					else
					{
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}
}