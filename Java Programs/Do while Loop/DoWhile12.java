/*
Q12. Write a java program to calculate the product of digits in a number.
*/
import java.util.*;
public class DoWhile12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int no=sc.nextInt();
		int prod =1;
		do{
			int digit = no%10;
			prod = prod*digit;
			no = no/10;
		}while(no>0);
		System.out.println("prod = "+prod);
		
	}
}