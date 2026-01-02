//Q8. Write a java program to find the sum of all odd numbers between 1 to n.


import java.util.*;
 public class Loop8
 {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int sum =0;
		int i =1;
		while(i<=n){
			if(i%2==1){
			sum = sum+i;
			}
			i++;
		}
		System.out.println("sum of odd numbers is "+sum);
	
	}
 }