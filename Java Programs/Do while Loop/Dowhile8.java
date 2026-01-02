/*
Q7. Write a java program to find the sum of all odd numbers between 1 to n.
*/

import java.util.*;

public class Dowhile8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : - ");
		int n =sc.nextInt();
		int sum =0;
		int i =1;
		
		do{
			if(i%2==1){
				sum = sum+i;
			}
			i++;
		}while(i<=n);
		System.out.println("Sum of all given Numbers is = "+sum);
		
	}
}