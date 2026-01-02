//Q20. Write a java program to swap first and last digits of a number.

import java.util.*;

public class Loop20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = sc.nextInt();
			
		int last = no%10;

		while(no>9){
			
			no = no/10;
		}
		System.out.println("Befor swapping");
		System.out.println("First Digit is " + no);
		System.out.println("Last Digit is " + last);
		
		
		int temp = last;
		no =no;
		
		System.out.println("After swapping");
		System.out.println("First Digit is " + temp);
		System.out.println("Last Digit is " + no);
		
	}
}