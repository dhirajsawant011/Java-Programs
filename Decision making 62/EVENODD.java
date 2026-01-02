//Q1. Write a Java program to check whether a number is even or odd.

import java.util.*;

public class EVENODD
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0){
			System.out.println(num+" Number is Even");
		}else{
			System.out.println(num+" Number is Odd");
		}
	}
}