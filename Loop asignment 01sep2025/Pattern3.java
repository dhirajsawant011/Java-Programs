//Q3. Write a java program to print this pattern.

//	*	#	*	#	*
//	*	#	*	#	*
//	*	#	*	#	*
//	*	#	*	#	*
//	*	#	*	#	*

public class Pattern3
{
	public static void main(String x[])throws Exception
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j%2==0){
					System.out.print(" # ");Thread.sleep(300);
				}else{
					System.out.print(" * ");
				}
			}
			
				System.out.println("");
			
		}
	}
}
