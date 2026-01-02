/*
Q1. Write a java program to print this pattern.
	1   2   3
1	*
2	*	*
3	*	*	*
4	*        
5	*	*
6	*	*	*
*/

public class Pattern28
{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++){
			for(int j=1; j<=3; j++){
				if(j==i ||  j==1 || i==6 || i==3 || i-j==3){ //j==3+i  ||
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}