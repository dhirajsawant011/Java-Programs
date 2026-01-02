/*
Q2. Write a java program to print this pattern.
	1   2   3   4   5   6   7   8   9
1	*	*	*	*	*	*	*	*	*
2	*	*	*	*		*	*	*	*
3	*	*	*				*	*	*
4	*	*						*	*
5	*								*
6	*	*						*	*
7	*	*	*				*	*	*
8	*	*	*	*		*	*	*	*
9	*	*	*	*	*	*	*	*	*
*/

public class Pattern26
{
	public static void main(String x[])
	{
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				if(j<=6-i ||  j>=4+i || j>=14-i || i>=4+j ){
					System.out.print(" * "); //|| i-j==4 || i+j==14
				}
				else{
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
	}
}