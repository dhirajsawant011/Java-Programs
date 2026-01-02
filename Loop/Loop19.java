//Q19. Write a java program to find the sum of the first and last digit of a number.

import java.util.*;
public class Loop19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();
			
			int last = no%10;

		while(no>9){
			
			no = no/10;
		}
		int sum = last+no;
		System.out.println("sum of the first and last digit of a number is "+sum);
	}
}