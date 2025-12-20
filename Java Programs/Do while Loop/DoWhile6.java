/*
Q6. Write a java program to find the sum of all natural numbers between 1 to n.
*/
import java.util.*;
public class DoWhile6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:-  ");
		int n=sc.nextInt();
		int sum =0;
		int i=1;
		do{
			sum = sum+i;
			i++;
		}while(i<=n);
		System.out.println("sum is = "+sum);
		
	}
}
