//Q1. Write a java program to print this pattern.
	
//	*	*	*	*	*
//	*	*	*	*	*
//	*	*	*	*	*
//	*	*	*	*	*
//	*	*	*	*	*

public class Pattern1
{
	public static void main(String args [])throws Exception 

	{
			
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++){
					System.out.print(" * ");  Thread.sleep(300);
			}
			System.out.println("\n");
		}
	}
}
