/*
  12
	  1
	3 3 3
  5 5 5 5 5
    3 3 3
      1

*/


public class Pattern51
{
	public static void main(String x[])
	{
		int no=0;
		for(int i=1; i<=5; i++)
		{	
			if(i==1)
			{
				no = i;
			}else if(i==2){
				
				no = i+1;
			}else if(i==3){
				
				no = i+2;
			}else if(i==4){
				
				no = i-1;
			}else if(i==5){
				
				no = i-4;
			}
			for(int j=1; j<=5; j++)
			{		
				if(j>=4-i && j<=2+i && j>=i-2 && j<=8-i){
					
					System.out.print(no + " ");
				}
			}
			System.out.println();
		}
	}
}
