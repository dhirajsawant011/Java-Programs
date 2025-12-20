 /*
Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of
 its proper divisors. The smallest perfect number is 6,
 which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
 */
 
import java.util.*;
public class Fun22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int no = sc.nextInt();
		checkPerfect(no);
	}
	
	public static void checkPerfect(int no)
	{
		int sum =0;
		for(int i=1; i<no; i++)
		{
			if(no%i==0) //6%1==0
			{
				sum= sum+i;
			}
		}
		if(sum==no)
		{
			System.out.print("Number is Perfect");
		}else{
			System.out.print("Number is not Perfect");
		}
	}
}
