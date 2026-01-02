/*
Q82. Write a java program to print this pattern.

         1    		
	  A     B   		
	2		  3  
  B			    C	 	
4	5	 6	7	  8
		
	               
*/

public class Pattern83
{
	public static void main(String x[])
	{		
			char ch = 'A';
			int n=1; 
		boolean flag = true;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=9; j++){
				if(j==6-i || j==4+i || i==5 && flag){
					if(i%2==0){
						System.out.print(ch+" ");		
					}else{
						System.out.print(n+" ");
						n++;	
					}
					flag = false;
				}else{
					System.out.print("  ");
					flag = true;
				}
				if(6-i==j && i%2==0){
					ch++;
				}
				
			}
			System.out.println();
		}
	}
}

