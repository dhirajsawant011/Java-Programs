
//Q38. Write a java program to find all prime factors of a number.

import java.util.*;
public class Loop38
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print(" enter a number : - ");
		int no =sc.nextInt();
		
		System.out.print("Prime factors of " + no + " are: ");
		for(int i=1; i<=no; i++){
			
			if(no%i==0){
				int n =i;
				boolean isPrime = true;
				int j=2;
				while(j<=n/2)
				{
					if(n % j == 0){
					isPrime =false;
					break;
				}
					j++;
				}
				if(isPrime){
				System.out.println(n + " ");
				}
				}
		}
	}
}