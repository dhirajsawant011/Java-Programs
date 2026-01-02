/*
Q83. Write a java program to print this pattern.

1   A   2   B   3
  C   4   D   5
    6   E   7
  F   8   G   9
H   10  I   11  J

*/

public class Pattern84
{
	public static void main(String x[])
	{
		char ch = 'A';
		int n =1;
		boolean flag = true;
		boolean isNum = true;
		for(int i=1; i<=5; i++)
		{
			if(i==3){
				isNum= true;
			}
			
			for(int j=1; j<=9; j++)
			{
				if((j==i || j==6-i || i==1 || i==5 || j==10-i || j==i+4 || j==2+i) &&flag	)
				{
					if(isNum){
						System.out.print(n++ +" ");
						isNum = false;
					
					}else{
						System.out.print(ch++ +" ");
						isNum= true;
						
					}
					flag=false;
					
				}
				else
				{
					System.out.print("  ");
					flag=true;
					
				}
			}
			System.out.println();
			}
			
		}
	}

