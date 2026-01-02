//Q11. Write a java program to calculate the sum of digits in a number.

import java.util.*;

public class Loop11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int no = sc.nextInt(); //1234
		int sum = 0;
		int i =0;
		while(no!=0){
				sum = sum +(no%10); //4 extract last element
				no=no/10; 			//4 remove (4 ) last element 
		}
		System.out.println("Sum of all Digits "+sum);
	}
}

