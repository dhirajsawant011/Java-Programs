	/*
Q2. Write a java program to print this pattern.
	1	2	3	4	5	6	7	8	9
1					*
2				*		*
3			*		*		*
4		*		*		*		*
5	*		*		*		*		*
6		*		*		*		*
7			*		*		*
8				*		*
9					*
	*/

public class Pattern29
{
	public static void main(String x[])
	{
		boolean flag = true;
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				if(j>=6-i && j<=4+i && i<=4+j &&  j<=14-i && flag){  // //j==6-i && j==4+i && i==4+j && j== 14-i
					System.out.print(" * ");
					flag = false;
				}else{
					System.out.print("   ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}
//j>=6-i && j<=4+i