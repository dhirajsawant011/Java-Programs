//Q1. Write a java program to print this pattern.

//	#	# 	#	#	#
//	*	*	*	*
//	#	#	#
//	*	*
//	#

public class Pattern12
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(i%2==1 && j<=6-i	){
					System.out.print(" # ");
				}else if(j<=6-i){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}					
			}
			System.out.println();
		}
	
	}
}
