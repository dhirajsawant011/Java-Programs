//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;

public class Loop13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int no = sc.nextInt();
		int rev = 0;
		while( no!=0){
			rev = (no%10)+rev*10;
			no 	=no/10;
				
		}
		System.out.println("reverse number "+rev);
		
	}
}