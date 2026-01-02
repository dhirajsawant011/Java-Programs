/*
Q78. Write a java program to print this pattern.

A	B	C	D	E	D	C	B	A	
A	B	C	D	  	D	C	B	A	
A	B	C    			C	B	A
A	B     					B	A
A       						A
A	B     					B	A
A	B	C   			C	B	A
A	B	C	D 		D	C	B	A
A	B	C	D	E	D	C	B	A    
			
			j<=6-i ||  j>=4+i || j>=14-i || i>=4+j			
*/
public class Pattern77
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=9; i++)
		{		
			char ch = 'A';
			int n =1;	
			for(int j=1; j<=9; j++)	
			{	
				if(j<=6-i ||  j>=4+i || j>=14-i || i>=4+j){
					
					System.out.print(ch +"  ");
					
					if(j<5){
						ch++;
					}else{
						ch--;
					}
				}
				else{
					System.out.print("   ");
					if(j<5){
						ch++;
					}else{
						ch--;
					}
				}	
			}
				System.out.println();				
		}
			
	}
}
