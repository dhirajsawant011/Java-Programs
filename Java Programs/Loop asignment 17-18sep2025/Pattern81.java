/*
Q80. Write a java program to print this pattern.

A      		  			       A
A	B    				  B	   A
A	B   C  		 	C	  B	   A
A   B	C	D   D	C	  B	   A
A	B	C  	  		C	  B	   A
A	B   				  B	   A
A			
	               
*/


public class Pattern81
{
	public static void main(String x[])
	{		
		for(int i=1; i<=7; i++){
				char ch='A';
			for(int j=1; j<=8; j++){
				if( (i<=4 && (j<=i || j>=9-i)) || (i>=4 &&  (j<=8-i || j>=i+1))){
						if(j<5){
							System.out.print(ch++ +" ");
							
						}else{
							System.out.print(--ch +" ");
						}
				}else{
					System.out.print("  ");
				}
				
				
				
			}
			System.out.println();
		}
	}
}


