/*
Q5. Write a java program to print this pattern.

	#
	#	*
	#	*	#
	#	*	#	*
	#	*	#	*	#
	#	*	#	*
	#	*	#	
	#	*
	#	
*/
public class Pattern24
{
	public static void main(String x[])throws Exception
	{
		for(int i=1; i<=9; i++){
			for(int j=1; j<=5; j++)
			{
				if((i>=j && i<=10-j) ){
					if(j%2!=1)
						System.out.print(" * ");
					else
						System.out.print(" # ");
				}else{
					System.out.print("   ");Thread.sleep(200);
				}
			}
			System.out.println();
		}
	}
}