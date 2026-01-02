/*
Q3. Write a java program to print this pattern.
	1   2   3   4   5   6   7
1	*						*
2	*	*				*
3	*	*	*		*
4	*	*	*	*
5	*	*	*	*	*
6	*	*	*	*	*	*
7	*	*	*	*	*	*	*

*/

public class Pattern27
{
	public static void main(String x[])
	{
		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				if(i>=j || j==8-i){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
	}
}