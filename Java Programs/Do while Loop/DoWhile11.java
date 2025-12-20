/*
Q11. Write a java program to calculate the sum of digits in a number.

*/
import java.util.*;
public class DoWhile11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int no=sc.nextInt();
		int sum =0;
		do{
			int digit = no%10;
			sum = sum+digit;
			no = no/10;
		}while(no>0);
		System.out.println("sum = "+sum);
		
	}
}