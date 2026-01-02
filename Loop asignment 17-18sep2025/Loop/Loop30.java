// Q30.  Write a java program to display 1 to nth Perfect Number.

import java.util.*;

public class Loop30
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int range = sc.nextInt();
		
		int num =1;
		
		int count =1;
		int sum =0;
		while( count< range/2){
			
		
				if(range%count==0){
					sum = sum +count;
					System.out.println(count);
				}
				count++;
			}	
			System.out.println(sum);
				if(sum ==range){
						
					System.out.println("Perfect Number");	
				}else{
					System.out.println("Perfect not Number");
				}	
			
		
		

		
	}
}
