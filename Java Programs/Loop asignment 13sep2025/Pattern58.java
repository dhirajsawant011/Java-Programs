/*
Q7. Write a java program to print this pattern.

        1
      1	  1
    1	2	1
  1   3   3   1
1	4	6	4	1
*/
public class Pattern58
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=5 ; i++)
		{		
			int n=1;
			boolean flag = true;
			int k=1;
			int z = 1;
			for(int j=1; j<=9; j++)	
			{		
				if(j>=6-i && j<=4+i && flag){
					System.out.print(k+"  ");
					k = k * (i-z)/z;
					flag =false;
					z++;
					
				}else{
					System.out.print("   ");
					flag = true;
					
				}
			}
			System.out.println();
		}
	}
}

 //number = number * (i - j) / (j + 1);