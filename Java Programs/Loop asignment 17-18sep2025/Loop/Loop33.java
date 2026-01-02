//Q33. Write a java program to display 1 to nth Armstrong Number.

import java.util.*;
public class Loop33
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter a range number: - ");
		int range = sc.nextInt();
		
		for(int i=1 ; i<=range; i++)
		{	
			//value giving by n
			int n=i;
			int count =0;
			
			//decide how many digits in number to count it
			while(n>0){
				n=n/10;
				count++;
			}
			
			//value reproviding it into n
			n=i;
			//digit seperatation 
			int sum =0;
			while(n > 0){
				int digit = n % 10;
				int pow = 1
				
				//calculate power each digit;
				for(int j=1; j<=count j++;){
				pow = pow * digit;
				}
				sum = sum + pow;
				n = n / 10;
			}
			
			if(sum == i){
			System.out.println(i);
			}
		}
		
	}
}
