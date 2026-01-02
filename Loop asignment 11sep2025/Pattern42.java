/*

Q2. Write a java program to print this pattern.

	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1

	
*/

public class Pattern42
{
	public static void main(String x[])
	{
		//int n =1;
		for(int i=1; i<=9; i++)
		{	
            
			for(int j=1; j<=9; j++)
			{  
				  if(i<=5 && j<=i){
					  if(i%2==1){
					System.out.print(i);
					  }
				  }else if(i>=6 && j<=10-i){
					  if(i%2==1){
					  System.out.print(10-i);
					  }
				  }
				  
				  else
					{
						System.out.print("  ");
					}	
			}
			//n=(n<3) ? n+2:n-2;
			System.out.println();
		}
	}

}