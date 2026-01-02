//Q32. Write a java program to display 1 to nth Strong Number.

import java.util.*;
public class Loop32
{
	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : - ");
		int range = sc.nextInt();
		
		for(int i=1; i<=range; i++){
	
			//checking one by one number in the given range if it's strong or not
			int n = i;

			int sum = 0;
			while(n>0){
				int digit = n % 10;
				
				//calculating factorial of the digit
				int fact = 1;
				for(int j=1; j<=digit; j++){
					fact = fact * j;
					System.out.println(fact);
				}
				
				//adding factorial of the digit in the sum
				sum = sum + fact;
				n = n / 10;
			}
			if(sum == i)
				System.out.println(i);
		}
	}
}