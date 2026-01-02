//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop

import java.util.*;

public class Loop4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in );
		//System.out.println("Enter a number ")
		//int num = sc.nextInt();
		//int num =100;
		int i = 1;
		
		while (i<=100){
			if(i%2==0){
				System.out.println(i);
			}
			i++;	
		}
	}
}