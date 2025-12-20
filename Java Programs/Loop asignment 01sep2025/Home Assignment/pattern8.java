//Q5. Write a java program to print this pattern.

//#
//#	*
//#	*	#
//#	*	#	*
//#	*	#	*	#


public class pattern8
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1; i<=5; i++){
			for(j=1; j<=5; j++){
				if(j%2==1&& i>=j){
					System.out.print("#  ");
				}else if(i>=j){
					System.out.print("*  ");
				}
			}
			System.out.println();
		}
	}
}
