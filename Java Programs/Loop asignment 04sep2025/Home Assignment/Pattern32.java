/*
Q5. Write a java program to print this pattern.
	1   2   3   4   5
1					*  1,5 =6 i<=6-i;
2				#	#  2,4 =6 
3			*	*	*  3,3 =6
4		#	#	#	#  4,2 =6
5	*	*	*	*	*  5,1 =6
*/

public class Pattern32
{
	public static void main(String x[]){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(i>=6-j &&  i%2==1){
					System.out.print(" * ");
				}else if(i>=6-j ){
					System.out.print(" # ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
			
		}
	}
}