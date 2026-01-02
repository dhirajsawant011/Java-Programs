//Q21.  Write a java program to check Number Is Prime Number or Not.

import java.util.*;

public class Loop21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Numbers: ");
		int range = sc.nextInt();
		int n= 2;
		System.out.println("primenumbers are");
		while(n<=range){
			
			int i =2;
			boolean isPrime = true;
			while(i<=n/2)
			{
				if(n % i == 0){
				isPrime =false; //true/false
				break;
			}
			i++;
			}
			if(isPrime){
				System.out.println(n);
			}
			n++;
		}
		
	}
}